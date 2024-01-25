import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
	public static int[] anIntArray383 = null;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_125 = new Class337(5, 4);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!bfa;I[I)V")
	public static void method6374(@OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray85 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray85.length; local8++) {
				if (arg0.anIntArray85[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt1277 != -1) {
				@Pc(41) Class362 local41 = Static435.aClass298_1.method7034(arg0.anInt1277);
				@Pc(44) int local44 = local41.anInt10002;
				if (local44 == 1) {
					arg0.anInt1211 = 1;
					arg0.anInt1201 = 0;
					arg0.anInt1271 = arg1;
					arg0.anInt1221 = 0;
					arg0.anInt1223 = 0;
					if (!arg0.aBoolean71) {
						Static67.method1108(arg0, arg0.anInt1223, local41);
					}
				}
				if (local44 == 2) {
					arg0.anInt1221 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray85 == null || arg0.anIntArray85[local8] == -1 || Static435.aClass298_1.method7034(arg2[local8]).anInt10005 >= Static435.aClass298_1.method7034(arg0.anIntArray85[local8]).anInt10005) {
				arg0.anInt1271 = arg1;
				arg0.anIntArray85 = arg2;
				break;
			}
		}
		if (local6) {
			arg0.anInt1271 = arg1;
			arg0.anIntArray85 = arg2;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method6375(@OriginalArg(1) int arg0) {
		Static374.anInt6199 = 100;
		Static165.anInt10647 = arg0;
		Static248.anInt4508 = 3;
		Static555.anInt9372 = -1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ov;III)V")
	public static void method6376(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class217 local12;
		if (arg2 < Static357.anInt5961) {
			local12 = Static421.aClass217ArrayArrayArray5[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8722()) {
				arg0.method8715(Static302.anInt5267, Static517.aClass133_13, local12.aClass4_Sub2_Sub2_1, 0, 0, true);
			}
		}
		if (arg3 < Static357.anInt5961) {
			local12 = Static421.aClass217ArrayArrayArray5[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8722()) {
				arg0.method8715(0, Static517.aClass133_13, local12.aClass4_Sub2_Sub2_1, 0, Static302.anInt5267, true);
			}
		}
		if (arg2 < Static357.anInt5961 && arg3 < Static429.anInt7422) {
			local12 = Static421.aClass217ArrayArrayArray5[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8722()) {
				arg0.method8715(Static302.anInt5267, Static517.aClass133_13, local12.aClass4_Sub2_Sub2_1, 0, Static302.anInt5267, true);
			}
		}
		if (arg2 < Static357.anInt5961 && arg3 > 0) {
			local12 = Static421.aClass217ArrayArrayArray5[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass4_Sub2_Sub2_1 != null && local12.aClass4_Sub2_Sub2_1.method8722()) {
				arg0.method8715(Static302.anInt5267, Static517.aClass133_13, local12.aClass4_Sub2_Sub2_1, 0, -Static302.anInt5267, true);
			}
		}
	}
}
