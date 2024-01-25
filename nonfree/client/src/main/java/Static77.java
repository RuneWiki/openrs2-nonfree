import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method9183(@OriginalArg(0) Class8_Sub1_Sub3_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static44.anInt740 == arg0.anInt7037 || arg0.anInt7023 == -1 || arg0.anInt7045 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class165 local29 = Static158.aClass317_1.method7882(arg0.anInt7023, 100);
			if (local29.aBoolean303 || local29.anIntArray225[arg0.anInt7028] < arg0.anInt7006 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(64) int local64 = arg0.anInt7037 - arg0.anInt7032;
			@Pc(70) int local70 = Static44.anInt740 - arg0.anInt7032;
			@Pc(81) int local81 = arg0.anInt7025 * 512 + arg0.method5993() * 256;
			@Pc(92) int local92 = arg0.anInt6982 * 512 + arg0.method5993() * 256;
			@Pc(103) int local103 = arg0.anInt7003 * 512 + arg0.method5993() * 256;
			@Pc(115) int local115 = arg0.anInt7001 * 512 + arg0.method5993() * 256;
			arg0.anInt10363 = (local70 * local115 + (local64 - local70) * local92) / local64;
			arg0.anInt10355 = (local70 * local103 + local81 * (local64 - local70)) / local64;
		}
		arg0.anInt7052 = 0;
		if (arg0.anInt7036 == 0) {
			arg0.method5995(8192, false);
		}
		if (arg0.anInt7036 == 1) {
			arg0.method5995(12288, false);
		}
		if (arg0.anInt7036 == 2) {
			arg0.method5995(0, false);
		}
		if (arg0.anInt7036 == 3) {
			arg0.method5995(4096, false);
		}
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V")
	public static void method9184() {
		Static384.anInt6569 = Static88.anInt7739;
		Static526.aBoolean668 = false;
		Static394.aClass337Array5 = new Class337[500];
		Static372.anInt8186 = 0;
		Static422.anIntArrayArrayArray17 = new int[Static490.anInt9715][Static328.anInt5870 + 1][Static526.anInt8863 + 1];
		Static57.anInt865 = 0;
		Static265.aClass337Array3 = new Class337[1000];
		Static603.anInt10076 = 0;
		Static443.anInt7616 = 0;
		Static424.anInt7319 = Static88.anInt7739;
		Static292.aClass337Array4 = new Class337[2000];
		Static128.aClass337Array6 = new Class337[500];
		if (Static205.aClass57_5 instanceof oa) {
			Static570.aBoolean734 = false;
		} else {
			Static570.aBoolean734 = true;
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I[III[I)V")
	public static void method9185(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) int local39 = arg0[local19];
		arg0[local19] = arg0[arg2];
		arg0[arg2] = local39;
		@Pc(57) int local57 = local25 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg1; local59 < arg2; local59++) {
			if (arg3[local59] < (local59 & local57) + local25) {
				@Pc(80) int local80 = arg3[local59];
				arg3[local59] = arg3[local21];
				arg3[local21] = local80;
				@Pc(94) int local94 = arg0[local59];
				arg0[local59] = arg0[local21];
				arg0[local21++] = local94;
			}
		}
		arg3[arg2] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg2] = arg0[local21];
		arg0[local21] = local39;
		method9185(arg0, arg1, local21 - 1, arg3);
		method9185(arg0, local21 + 1, arg2, arg3);
	}
}
