import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 aClass2_Sub1_Sub4_Sub3_Sub1_4;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public static int anInt2721 = 0;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1185 = Static119.method1462("Loaded interfaces");

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1186 = aClass65_1185;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1187 = Static119.method1462("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1188 = aClass65_1187;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1189 = Static119.method1462(" is already on your ignore list");

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1190 = Static119.method1462(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1191 = Static119.method1462(")4lang)4de");

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1192 = Static119.method1462("null");

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
	public static int anInt2728 = 0;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1193 = aClass65_1189;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method1939() {
		Static104.aClass8_66.method171();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method1940() {
		aClass65_1192 = null;
		aClass65_1191 = null;
		aClass65_1189 = null;
		aClass65_1193 = null;
		aClass2_Sub1_Sub4_Sub3_Sub1_4 = null;
		aClass65_1186 = null;
		aClass65_1187 = null;
		aClass65_1188 = null;
		aClass65_1185 = null;
		aClass65_1190 = null;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
	public static int method1941() {
		return Static37.anInt814++;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1 method1942() {
		@Pc(9) Class2_Sub1_Sub4_Sub1 local9 = new Class2_Sub1_Sub4_Sub1();
		local9.anInt602 = Static45.anIntArray130[0];
		local9.anInt603 = Static100.anIntArray294[0];
		@Pc(25) int local25 = local9.anInt602 * local9.anInt603;
		local9.anIntArray54 = new int[local25];
		local9.anInt604 = Static47.anInt1144;
		@Pc(36) byte[] local36 = Static76.aByteArrayArray6[0];
		local9.anInt600 = Static88.anIntArray256[0];
		local9.anInt599 = Static128.anIntArray359[0];
		local9.anInt601 = Static19.anInt471;
		for (@Pc(56) int local56 = 0; local56 < local25; local56++) {
			local9.anIntArray54[local56] = Static110.anIntArray328[local36[local56] & 0xFF];
		}
		Static37.method655();
		return local9;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!re;Lclient!fb;IB)V")
	public static void method1943(@OriginalArg(0) Class56_Sub1 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte[] local13 = null;
		@Pc(15) Class13 local15 = Static9.aClass13_4;
		synchronized (Static9.aClass13_4) {
			for (@Pc(22) Class2_Sub19 local22 = (Class2_Sub19) Static9.aClass13_4.method270(); local22 != null; local22 = (Class2_Sub19) Static9.aClass13_4.method273()) {
				if ((long) arg2 == local22.aLong100 && local22.aClass24_3 == arg1 && local22.anInt2511 == 0) {
					local13 = local22.aByteArray36;
					break;
				}
			}
		}
		if (local13 == null) {
			@Pc(72) byte[] local72 = arg1.method609(arg2);
			arg0.method1698(arg2, local72, true, arg1);
		} else {
			arg0.method1698(arg2, local13, true, arg1);
		}
	}
}
