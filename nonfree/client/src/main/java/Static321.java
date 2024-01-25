import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "[I")
	public static final int[] anIntArray369 = new int[4];

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method4665(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class2_Sub7 local12 = new Class2_Sub7(arg0);
		@Pc(25) int local25 = -1;
		label56: while (true) {
			@Pc(29) int local29 = local12.method4523();
			if (local29 == 0) {
				return local7;
			}
			local25 += local29;
			@Pc(40) int local40 = 0;
			@Pc(42) boolean local42 = false;
			while (true) {
				@Pc(50) int local50;
				while (!local42) {
					local50 = local12.method4458();
					if (local50 == 0) {
						continue label56;
					}
					local40 += local50 - 1;
					@Pc(79) int local79 = local40 & 0x3F;
					@Pc(85) int local85 = local40 >> 6 & 0x3F;
					@Pc(91) int local91 = local12.method4464() >> 2;
					@Pc(95) int local95 = local85 + arg4;
					@Pc(99) int local99 = arg3 + local79;
					if (local95 > 0 && local99 > 0 && local95 < arg1 - 1 && local99 < arg2 - 1) {
						@Pc(125) Class216 local125 = Static362.aClass290_2.method5799(local25);
						if (local91 != 22 || Static257.aClass2_Sub35_Sub1_1.aBoolean630 || local125.anInt5275 != 0 || local125.anInt5290 == 1 || local125.aBoolean403) {
							if (!local125.method4552()) {
								Static449.anInt7191++;
								local7 = false;
							}
							local42 = true;
						}
					}
				}
				local50 = local12.method4458();
				if (local50 == 0) {
					break;
				}
				local12.method4464();
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!mk;BLclient!mk;)V")
	public static void method4669(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0.aClass2_Sub2_61 != null) {
			arg0.method7659();
		}
		arg0.aClass2_Sub2_62 = arg1.aClass2_Sub2_62;
		arg0.aClass2_Sub2_61 = arg1;
		arg0.aClass2_Sub2_61.aClass2_Sub2_62 = arg0;
		arg0.aClass2_Sub2_62.aClass2_Sub2_61 = arg0;
	}
}
