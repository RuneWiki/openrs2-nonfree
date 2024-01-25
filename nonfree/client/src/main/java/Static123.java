import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public static int anInt2768;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "[S")
	public static final short[] aShortArray52 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_4 = new Class15(64);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!tq;I)Lclient!ri;")
	public static Class179 method2464(@OriginalArg(0) Class4_Sub7 arg0) {
		@Pc(12) Class179 local12 = new Class179();
		local12.anInt5624 = arg0.method2404();
		local12.aClass4_Sub1_Sub10_1 = Static210.method4725(local12.anInt5624);
		return local12;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static266.method4641(arg1)) {
			Static269.method4690(arg5, Static158.aClass72ArrayArray1[arg1], arg0, arg3, arg4, arg2, arg7, -1, arg6);
		} else if (arg0 == -1) {
			for (@Pc(32) int local32 = 0; local32 < 100; local32++) {
				Static60.aBooleanArray8[local32] = true;
			}
		} else {
			Static60.aBooleanArray8[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIBI)Lclient!lo;")
	public static Class2_Sub2_Sub1 method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = Static18.aClass57ArrayArrayArray1[arg2][arg1][arg0];
		if (local16 == null) {
			return null;
		}
		@Pc(22) Class2_Sub2_Sub1 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class95 local27 = local16.aClass95_2; local27 != null; local27 = local27.aClass95_3) {
			@Pc(31) Class2_Sub2 local31 = local27.aClass2_Sub2_1;
			if (local31 instanceof Class2_Sub2_Sub1) {
				@Pc(37) Class2_Sub2_Sub1 local37 = (Class2_Sub2_Sub1) local31;
				@Pc(47) int local47 = (local37.method5425() - 1) * 64 + 60;
				@Pc(54) int local54 = local37.anInt6465 - local47 >> 7;
				@Pc(61) int local61 = local37.anInt6466 - local47 >> 7;
				@Pc(68) int local68 = local37.anInt6465 + local47 >> 7;
				@Pc(76) int local76 = local37.anInt6466 + local47 >> 7;
				if (arg1 >= local54 && local61 <= arg0 && local68 >= arg1 && local76 >= arg0) {
					@Pc(110) int local110 = (local68 + 1 - arg1) * (local76 + 1 + -arg0);
					if (local24 < local110) {
						local22 = local37;
						local24 = local110;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;Lclient!tq;I)I")
	public static int method2467(@OriginalArg(0) String arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		@Pc(6) int local6 = arg1.anInt2667;
		@Pc(10) byte[] local10 = Static217.method3757(arg0);
		arg1.method2407(local10.length);
		arg1.anInt2667 += Static298.aClass126_1.method3432(local10.length, 0, arg1.aByteArray42, local10, arg1.anInt2667);
		return arg1.anInt2667 - local6;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;Lclient!am;IZ)Lclient!pm;")
	public static Class158 method2468(@OriginalArg(0) String arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method301(arg0);
		if (local10 == -1) {
			return new Class158(0);
		}
		@Pc(32) int[] local32 = arg1.method286(local10);
		@Pc(38) Class158 local38 = new Class158(local32.length);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local38.anInt5149 > local40) {
				@Pc(56) Class4_Sub7 local56 = new Class4_Sub7(arg1.method288(local32[local42++], local10));
				@Pc(60) int local60 = local56.method2389();
				@Pc(64) int local64 = local56.method2404();
				@Pc(68) int local68 = local56.method2380();
				if (!arg2 && local68 == 1) {
					local38.anInt5149--;
				} else {
					local38.anIntArray422[local40] = local60;
					local38.anIntArray423[local40] = local64;
					local40++;
				}
			}
			return local38;
		}
	}
}
