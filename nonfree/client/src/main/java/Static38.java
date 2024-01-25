import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "Lclient!wca;")
	public static Class310 aClass310_1 = null;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method753(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub29 local17 = new Class2_Sub29(arg0);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local17.method5211();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(97) Class129 local97;
				do {
					@Pc(70) int local70;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method5182();
										if (local42 == 0) {
											continue label68;
										}
										local17.method5170();
									}
									local42 = local17.method5182();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local17.method5170() >> 2;
									local70 = local60 + arg3;
									local75 = local54 + arg4;
								} while (local70 <= 0);
							} while (local75 <= 0);
						} while (local70 >= arg1 - 1);
					} while (local75 >= arg2 - 1);
					local97 = Static505.aClass206_4.method5326(local19);
				} while (local66 == 22 && !Static281.aClass2_Sub19_Sub1_1.aBoolean183 && local97.anInt3660 == 0 && local97.anInt3678 != 1 && !local97.aBoolean284);
				local36 = true;
				if (!local97.method3267()) {
					local7 = false;
					Static181.anInt3350++;
				}
			}
		}
	}
}
