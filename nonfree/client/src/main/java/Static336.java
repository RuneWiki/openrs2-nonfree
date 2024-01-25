import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public static final int anInt4177 = -14475237;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
	public static final int[] anIntArray571 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public static int anInt4180 = 2;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method3726() {
		if (Static189.aBoolean293) {
			Static326.aClass52_29 = null;
			Static189.aBoolean293 = false;
			Static149.aClass52_17 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B[BZII[Lclient!oa;Lclient!pe;)V")
	public static void method3727(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class149[] arg4, @OriginalArg(6) Class89 arg5) {
		@Pc(15) Class7_Sub3 local15 = new Class7_Sub3(arg0);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method2792();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method2732();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method2772();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(75) int local75 = local54 + arg2;
				@Pc(80) int local80 = local48 + arg3;
				if (local75 > 0 && local80 > 0 && local75 < Static15.anInt287 - 1 && local80 < Static325.anInt6173 - 1) {
					@Pc(103) Class149 local103 = null;
					if (!arg1) {
						@Pc(107) int local107 = local58;
						if ((Static92.aByteArrayArrayArray3[1][local75][local80] & 0x2) == 2) {
							local107 = local58 - 1;
						}
						if (local107 >= 0) {
							local103 = arg4[local107];
						}
					}
					Static345.method5563(local58, local103, local58, arg1, arg5, local70, local80, local66, local17, -1, true, local75);
				}
			}
		}
	}
}
