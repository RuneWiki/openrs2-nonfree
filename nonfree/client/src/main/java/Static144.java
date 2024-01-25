import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
	public static int anInt2845;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt2848 = 0;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([FII)[F")
	public static float[] method2623(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static693.method8319(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BIBII)Z")
	public static boolean method2624(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class5_Sub36 local20 = new Class5_Sub36(arg1);
		@Pc(22) int local22 = -1;
		label70: while (true) {
			@Pc(26) int local26 = local20.method7295((byte) 82);
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(38) boolean local38 = false;
			while (true) {
				@Pc(73) int local73;
				@Pc(101) Class354 local101;
				do {
					@Pc(77) int local77;
					@Pc(82) int local82;
					do {
						do {
							do {
								do {
									@Pc(44) int local44;
									while (local38) {
										local44 = local20.method7306();
										if (local44 == 0) {
											continue label70;
										}
										local20.method7291();
									}
									local44 = local20.method7306();
									if (local44 == 0) {
										continue label70;
									}
									local34 += local44 - 1;
									@Pc(61) int local61 = local34 & 0x3F;
									@Pc(67) int local67 = local34 >> 6 & 0x3F;
									local73 = local20.method7291() >> 2;
									local77 = local67 + arg0;
									local82 = local61 + arg3;
								} while (local77 <= 0);
							} while (local82 <= 0);
						} while (arg4 - 1 <= local77);
					} while (local82 >= arg2 - 1);
					local101 = Static528.aClass243_3.method5556(local22);
				} while (local73 == 22 && Static577.aClass5_Sub19_25.aClass17_Sub16_1.method5290() == 0 && local101.anInt9386 == 0 && local101.anInt9424 != 1 && !local101.aBoolean650);
				if (!local101.method8027()) {
					Static119.anInt1944++;
					local15 = false;
				}
				local38 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!pea;II)V")
	public static void method2625(@OriginalArg(1) Class283 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static611.aClass283ArrayArray1[arg2][arg1] = arg0;
	}
}
