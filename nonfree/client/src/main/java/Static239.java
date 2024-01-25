import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString304;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "Lclient!dp;")
	public static Class53 aClass53_160;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_109 = new Class70(64);

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[Lclient!ri;")
	public static final Class44_Sub4_Sub4_Sub2[] aClass44_Sub4_Sub4_Sub2Array8 = new Class44_Sub4_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString305 = "Close";

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString306 = "skill: ";

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!vg;")
	public static Interface9 anInterface9_8 = null;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	public static int anInt6343 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static6.method125(arg1, Static230.anInt4308, Static327.anInt3039);
		@Pc(17) int local17 = Static6.method125(arg0, Static230.anInt4308, Static327.anInt3039);
		@Pc(23) int local23 = Static6.method125(arg6, Static265.anInt4933, Static311.anInt5837);
		@Pc(29) int local29 = Static6.method125(arg2, Static265.anInt4933, Static311.anInt5837);
		@Pc(37) int local37 = Static6.method125(arg3 + arg1, Static230.anInt4308, Static327.anInt3039);
		@Pc(46) int local46 = Static6.method125(arg0 - arg3, Static230.anInt4308, Static327.anInt3039);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static14.method247(local29, arg5, Static11.anIntArrayArray11[local48], local23);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static14.method247(local29, arg5, Static11.anIntArrayArray11[local64], local23);
		}
		@Pc(86) int local86 = Static6.method125(arg6 + arg3, Static265.anInt4933, Static311.anInt5837);
		@Pc(95) int local95 = Static6.method125(arg2 - arg3, Static265.anInt4933, Static311.anInt5837);
		for (@Pc(97) int local97 = local37; local97 <= local46; local97++) {
			@Pc(103) int[] local103 = Static11.anIntArrayArray11[local97];
			Static14.method247(local86, arg5, local103, local23);
			Static14.method247(local95, arg4, local103, local86);
			Static14.method247(local29, arg5, local103, local95);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)Lclient!iq;")
	public static Class6_Sub2_Sub8 method5786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub2_Sub8 local15 = (Class6_Sub2_Sub8) Static83.aClass108_14.method2900((long) arg0 << 32 | (long) arg1);
		if (local15 == null) {
			local15 = new Class6_Sub2_Sub8(arg0, arg1);
			Static83.aClass108_14.method2898(local15.aLong218, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
	public static void method5787(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static6.anInt117 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)I")
	public static int method5790(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)V")
	public static void method5791() {
		for (@Pc(10) Class6_Sub5 local10 = (Class6_Sub5) Static261.aClass211_30.method5594(); local10 != null; local10 = (Class6_Sub5) Static261.aClass211_30.method5582()) {
			if (local10.anInt509 > 0) {
				local10.anInt509--;
			}
			if (local10.anInt509 != 0) {
				if (local10.anInt506 > 0) {
					local10.anInt506--;
				}
				if (local10.anInt506 == 0 && local10.anInt514 >= 1 && local10.anInt517 >= 1 && Static153.anInt2883 - 2 >= local10.anInt514 && local10.anInt517 <= Static246.anInt4606 - 2 && (local10.anInt501 < 0 || Static298.method5105(local10.anInt501, local10.anInt505))) {
					Static144.method2694(local10.anInt517, local10.anInt513, local10.anInt514, local10.anInt503, local10.anInt515, -1, local10.anInt505, local10.anInt501);
					local10.anInt506 = -1;
					if (local10.anInt501 == local10.anInt511 && local10.anInt511 == -1) {
						local10.method5756();
					} else if (local10.anInt511 == local10.anInt501 && local10.anInt516 == local10.anInt503 && local10.anInt510 == local10.anInt505) {
						local10.method5756();
					}
				}
			} else if (local10.anInt511 < 0 || Static298.method5105(local10.anInt511, local10.anInt510)) {
				Static144.method2694(local10.anInt517, local10.anInt513, local10.anInt514, local10.anInt516, local10.anInt515, -1, local10.anInt510, local10.anInt511);
				local10.method5756();
			}
		}
	}
}
