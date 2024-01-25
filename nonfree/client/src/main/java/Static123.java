import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!mo;")
	public static Class143 aClass143_107;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray69 = new String[100];

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	public static int anInt5900 = 0;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Ljava/lang/String;")
	public static final String aString222 = "scroll:";

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)I")
	public static int method5334(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
	public static void method5338() {
		Static166.method3295(Static94.aClass146_21);
		Static130.anInt2810++;
		if (Static61.aBoolean93 && Static111.aBoolean173) {
			@Pc(24) int local24 = Static63.anInt1529;
			@Pc(26) int local26 = Static328.anInt6333;
			local24 -= Static282.anInt5380;
			local26 -= Static200.anInt4041;
			if (local24 < Static105.anInt2334) {
				local24 = Static105.anInt2334;
			}
			if (local26 < Static164.anInt3457) {
				local26 = Static164.anInt3457;
			}
			if (local24 + Static94.aClass146_21.anInt4133 > Static105.anInt2334 - -Static30.aClass146_8.anInt4133) {
				local24 = Static30.aClass146_8.anInt4133 + Static105.anInt2334 - Static94.aClass146_21.anInt4133;
			}
			if (Static94.aClass146_21.anInt4199 + local26 > Static30.aClass146_8.anInt4199 + Static164.anInt3457) {
				local26 = Static30.aClass146_8.anInt4199 + Static164.anInt3457 - Static94.aClass146_21.anInt4199;
			}
			@Pc(98) int local98 = local24 - Static49.anInt1234;
			@Pc(103) int local103 = local26 - Static120.anInt2681;
			@Pc(106) int local106 = Static94.aClass146_21.anInt4157;
			if (Static94.aClass146_21.anInt4187 < Static130.anInt2810 && (local106 < local98 || local98 < -local106 || local106 < local103 || local103 < -local106)) {
				Static293.aBoolean371 = true;
			}
			@Pc(142) int local142 = Static30.aClass146_8.anInt4176 + local24 - Static105.anInt2334;
			@Pc(150) int local150 = local26 + Static30.aClass146_8.anInt4128 - Static164.anInt3457;
			@Pc(159) Class14_Sub15 local159;
			if (Static94.aClass146_21.anObjectArray33 != null && Static293.aBoolean371) {
				local159 = new Class14_Sub15();
				local159.anInt2252 = local150;
				local159.anInt2254 = local142;
				local159.aClass146_22 = Static94.aClass146_21;
				local159.anObjectArray3 = Static94.aClass146_21.anObjectArray33;
				Static10.method223(local159);
			}
			if (Static199.anInt4021 == 0) {
				if (Static293.aBoolean371) {
					if (Static94.aClass146_21.anObjectArray18 != null) {
						local159 = new Class14_Sub15();
						local159.anObjectArray3 = Static94.aClass146_21.anObjectArray18;
						local159.aClass146_23 = Static281.aClass146_52;
						local159.anInt2254 = local142;
						local159.anInt2252 = local150;
						local159.aClass146_22 = Static94.aClass146_21;
						Static10.method223(local159);
					}
					if (Static281.aClass146_52 != null && Static42.method1045(Static94.aClass146_21) != null) {
						Static329.method5662(Static281.aClass146_52.anInt4126, Static281.aClass146_52.anInt4214, Static94.aClass146_21.anInt4126, Static94.aClass146_21.anInt4214);
					}
				} else if ((Static327.anInt6303 == 1 || Static66.method1649()) && Static41.anInt980 > 2) {
					Static240.method5763(2);
				} else if (Static291.method4988()) {
					Static240.method5763(1);
				}
				Static94.aClass146_21 = null;
			}
		} else if (Static130.anInt2810 > 1) {
			Static94.aClass146_21 = null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!as;III[Z)V")
	public static void method5341(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static158.aClass114Array2 == Static341.aClass114Array3) {
			return;
		}
		@Pc(9) int local9 = Static18.aClass114Array1[arg1].method3607(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class114 local22 = Static18.aClass114Array1[local11];
				if (local22 != null) {
					local22.method3611(arg0, arg2, local9 - local22.method3607(arg2, arg3), arg3);
				}
			}
		}
	}
}
