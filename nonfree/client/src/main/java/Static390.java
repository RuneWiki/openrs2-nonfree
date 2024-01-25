import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_17 = new Class37(4, 1, 1, 1);

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Lclient!of;")
	public static final Class188 aClass188_54 = new Class188(8);

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "[I")
	public static final int[] anIntArray545 = new int[14];

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
	public static final int[] anIntArray546 = new int[2048];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
	public static void method5419(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub1_Sub6 local19 = Static267.method3705(arg0, 1);
		local19.method2578();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBII[B)Z")
	public static boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub17 local17 = new Class2_Sub17(arg4);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method6116();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(102) Class192 local102;
				do {
					@Pc(70) int local70;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method6174();
										if (local42 == 0) {
											continue label70;
										}
										local17.method6138();
									}
									local42 = local17.method6174();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local17.method6138() >> 2;
									local70 = arg1 + local60;
									local75 = local54 + arg3;
								} while (local70 <= 0);
							} while (local75 <= 0);
						} while (local70 >= arg0 - 1);
					} while (arg2 - 1 <= local75);
					local102 = Static249.aClass39_2.method748(local19);
				} while (local66 == 22 && !Static434.aClass165_Sub1_1.aBoolean303 && local102.anInt5419 == 0 && local102.anInt5447 != 1 && !local102.aBoolean388);
				if (!local102.method4317()) {
					local7 = false;
					Static191.anInt3353++;
				}
				local36 = true;
			}
		}
	}
}
