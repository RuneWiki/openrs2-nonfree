import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public static int anInt2489;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!bb;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1189 = Static193.method3027("::autoshadow off");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public static final int anInt2493 = 3353893;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_26 = new Class85(64);

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1190 = Static193.method3027("");

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public static int anInt2494 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	public static void method1759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class10 local12 = Static29.aClass10ArrayArrayArray1[Static137.anInt2795][arg0][arg1];
		if (local12 == null) {
			Static180.method2797(Static137.anInt2795, arg0, arg1);
			return;
		}
		@Pc(25) int local25 = -99999999;
		@Pc(27) Class3_Sub3_Sub10 local27 = null;
		@Pc(32) Class3_Sub3_Sub10 local32;
		for (local32 = (Class3_Sub3_Sub10) local12.method267(); local32 != null; local32 = (Class3_Sub3_Sub10) local12.method268()) {
			@Pc(39) Class3_Sub3_Sub11 local39 = Static14.method275(local32.aClass26_Sub7_1.anInt3887);
			@Pc(42) int local42 = local39.anInt1260;
			if (local39.anInt1232 == 1) {
				local42 *= local32.aClass26_Sub7_1.anInt3879 + 1;
			}
			if (local25 < local42) {
				local27 = local32;
				local25 = local42;
			}
		}
		if (local27 == null) {
			Static180.method2797(Static137.anInt2795, arg0, arg1);
			return;
		}
		local12.method265(local27);
		local32 = (Class3_Sub3_Sub10) local12.method267();
		@Pc(92) Class26_Sub7 local92 = null;
		@Pc(94) Class26_Sub7 local94 = null;
		while (local32 != null) {
			@Pc(98) Class26_Sub7 local98 = local32.aClass26_Sub7_1;
			if (local27.aClass26_Sub7_1.anInt3887 != local98.anInt3887) {
				if (local92 == null) {
					local92 = local98;
				}
				if (local92.anInt3887 != local98.anInt3887 && local94 == null) {
					local94 = local98;
				}
			}
			local32 = (Class3_Sub3_Sub10) local12.method268();
		}
		@Pc(133) long local133 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static74.method1055(Static137.anInt2795, arg0, arg1, Static107.method2399(arg1 * 128 + 64, arg0 * 128 + 64, Static137.anInt2795), local27.aClass26_Sub7_1, local133, local92, local94);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!nd;ZBII)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub17 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static45.anInt953 >= 50 || (arg1.anIntArray192 == null || arg0 >= arg1.anIntArray192.length)) {
			return;
		}
		@Pc(30) int local30 = arg1.anIntArray192[arg0];
		if (local30 == 0) {
			return;
		}
		@Pc(42) int local42 = local30 >> 4 & 0x7;
		@Pc(46) int local46 = local30 >> 8;
		@Pc(50) int local50 = local30 & 0xF;
		if (local50 == 0) {
			if (arg2) {
				Static117.method1694(local46, local42, 0);
			}
		} else if (Static42.anInt879 != 0) {
			Static89.anIntArray35[Static45.anInt953] = local46;
			Static62.anIntArray72[Static45.anInt953] = local42;
			@Pc(82) int local82 = (arg4 - 64) / 128;
			Static53.anIntArray63[Static45.anInt953] = 0;
			Static182.aClass7Array1[Static45.anInt953] = null;
			@Pc(96) int local96 = (arg3 - 64) / 128;
			Static207.anIntArray373[Static45.anInt953] = local50 + (local96 << 8) + (local82 << 16);
			Static45.anInt953++;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z")
	public static boolean method1762(@OriginalArg(0) int arg0) {
		if (Static101.aBooleanArray9[arg0]) {
			return true;
		} else if (Static97.aClass52_21.method1559(arg0)) {
			@Pc(21) int local21 = Static97.aClass52_21.method1575(arg0);
			if (local21 == 0) {
				Static101.aBooleanArray9[arg0] = true;
				return true;
			}
			if (Static49.aClass6ArrayArray1[arg0] == null) {
				Static49.aClass6ArrayArray1[arg0] = new Class6[local21];
			}
			for (@Pc(43) int local43 = 0; local43 < local21; local43++) {
				if (Static49.aClass6ArrayArray1[arg0][local43] == null) {
					@Pc(56) byte[] local56 = Static97.aClass52_21.method1581(arg0, local43);
					if (local56 != null) {
						Static49.aClass6ArrayArray1[arg0][local43] = new Class6();
						Static49.aClass6ArrayArray1[arg0][local43].anInt229 = (arg0 << 16) + local43;
						if (local56[0] == -1) {
							Static49.aClass6ArrayArray1[arg0][local43].method224(new Class3_Sub4(local56));
						} else {
							Static49.aClass6ArrayArray1[arg0][local43].method227(new Class3_Sub4(local56));
						}
					}
				}
			}
			Static101.aBooleanArray9[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	public static void method1766() {
		@Pc(5) Object local5 = Static80.anObject3;
		synchronized (Static80.anObject3) {
			if (Static111.anInt2254 != 0) {
				Static111.anInt2254 = 1;
				try {
					Static80.anObject3.wait();
				} catch (@Pc(20) InterruptedException local20) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method1768() {
		Static91.aBoolean97 = true;
		Static50.aBoolean66 = true;
	}
}
