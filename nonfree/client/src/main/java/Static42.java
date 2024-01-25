import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	public static int anInt934;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_11 = new Class46(7, 11);

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_17 = new Class337(25, 2);

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!la;BLclient!d;)V")
	public static void method750(@OriginalArg(0) Class207 arg0, @OriginalArg(2) Interface3 arg1) {
		Static116.anInterface3_7 = arg1;
		Static406.aClass207_82 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZ)Z")
	public static boolean method751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!bfa;B)V")
	public static void method752(@OriginalArg(0) Class4_Sub2_Sub1_Sub1_Sub1 arg0) {
		@Pc(15) Class5_Sub20 local15 = (Class5_Sub20) Static311.aClass273_13.method6581((long) arg0.anInt1225);
		if (local15 == null) {
			Static475.method7020(arg0, arg0.aByte132, arg0.anIntArray94[0], null, 0, null, arg0.anIntArray95[0]);
		} else {
			local15.method2018();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public static void method753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class5_Sub48 local18 = Static16.method232(Static298.aClass46_62, Static276.aClass251_2);
		local18.aClass5_Sub22_Sub1_2.method5949(arg1);
		local18.aClass5_Sub22_Sub1_2.method5961(arg0);
		Static277.method4436(local18);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method754(@OriginalArg(1) String arg0) {
		if (!Static193.aClass100_13.aBoolean194) {
			return -1;
		} else if (Static460.aHashtable5.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static373.method5487(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static378.aString68 + local20;
			if (!Static493.aClass207_105.method4692(local33, "")) {
				return -1;
			} else if (Static493.aClass207_105.method4699(local33)) {
				@Pc(62) byte[] local62 = Static493.aClass207_105.method4695("", local33);
				@Pc(68) File local68;
				try {
					local68 = Static175.method2693(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static547.method7981(local68);
				if (local82 != null && local62.length == local82.length) {
					for (@Pc(99) int local99 = 0; local99 < local82.length; local99++) {
						if (local82[local99] != local62[local99]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static193.aClass100_13.method2092(local62, local68);
					}
				} catch (@Pc(135) Throwable local135) {
					return -1;
				}
				Static48.method827(local68, arg0);
				return 100;
			} else {
				return Static493.aClass207_105.method4688(local33);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!raa;)Lclient!raa;")
	public static Class295 method756(@OriginalArg(1) Class295 arg0) {
		@Pc(6) Class295 local6 = Static75.method1300(arg0);
		if (local6 == null) {
			local6 = arg0.aClass295_15;
		}
		return local6;
	}
}
