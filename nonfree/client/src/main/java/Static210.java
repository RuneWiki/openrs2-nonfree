import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "Lclient!in;")
	public static final Class169 aClass169_114 = new Class169(39, 3);

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
	public static void method3978() {
		Static465.anIntArray421 = null;
		Static398.anIntArray352 = null;
		Static165.anIntArray169 = null;
		Static197.anIntArray192 = null;
		Static283.anIntArray266 = null;
		Static326.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII[BII)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static100.method1457(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static100.method1457(arg4)) {
			@Pc(37) int local37 = Static36.method624(arg1);
			@Pc(50) int local50 = 0;
			@Pc(61) int local61 = arg0 >= arg4 ? arg4 : arg0;
			@Pc(65) int local65 = arg0 >> 1;
			@Pc(69) int local69 = arg4 >> 1;
			@Pc(71) byte[] local71 = arg3;
			@Pc(78) byte[] local78 = new byte[local69 * local65 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local50, arg2, arg0, arg4, 0, arg1, 5121, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(99) int local99 = arg0 * local37;
				@Pc(101) byte[] local101 = local78;
				for (@Pc(103) int local103 = 0; local103 < local37; local103++) {
					@Pc(107) int local107 = local103;
					@Pc(109) int local109 = local103;
					@Pc(113) int local113 = local99 + local103;
					for (@Pc(115) int local115 = 0; local115 < local69; local115++) {
						for (@Pc(119) int local119 = 0; local119 < local65; local119++) {
							@Pc(125) byte local125 = local71[local109];
							local109 += local37;
							@Pc(135) int local135 = local125 + local71[local109];
							@Pc(141) int local141 = local135 + local71[local113];
							local109 += local37;
							local113 += local37;
							@Pc(155) int local155 = local141 + local71[local113];
							local78[local107] = (byte) (local155 >> 2);
							local113 += local37;
							local107 += local37;
						}
						local109 += local99;
						local113 += local99;
					}
				}
				local78 = local71;
				arg4 = local69;
				arg0 = local65;
				local71 = local101;
				local61 >>= 0x1;
				local69 >>= 0x1;
				local50++;
				local65 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
