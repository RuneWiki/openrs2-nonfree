import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static int anInt459;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_8;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_24;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_25;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_233 = Static75.method1216("Remove");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_234 = aClass4_233;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Z")
	public static boolean method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(22) Class3_Sub1_Sub5 local22 = Static38.method1911(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local22.method1039(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method281() {
		aClass25_25 = null;
		aClass25_24 = null;
		aClass4_234 = null;
		aClass3_Sub1_Sub4_Sub3_8 = null;
		aByteArrayArrayArray7 = null;
		aClass4_233 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III[Lclient!jd;[BII)V")
	public static void method282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg0 + local11 > 0 && local11 + arg0 < 103 && local15 + arg4 > 0 && arg4 + local15 < 103) {
						arg2[local7].anIntArrayArray16[arg0 + local11][local15 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(91) Class3_Sub4 local91 = new Class3_Sub4(arg3);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					Static28.method589(arg1, local15, 0, local91, arg4 + local101, local97 - -arg0, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ad;Lclient!ad;Lclient!rd;)Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 method284(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class64 arg2) {
		@Pc(12) int local12 = arg2.method1638(arg1);
		@Pc(18) int local18 = arg2.method1626(local12, arg0);
		return Static86.method1372(arg2, local18, local12);
	}
}
