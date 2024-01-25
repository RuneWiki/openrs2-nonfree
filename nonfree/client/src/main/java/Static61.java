import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!nk;")
	public static final Class174 aClass174_1 = new Class174("WTQA", 2);

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_2 = new Class179("", 15);

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIII[F)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg0 > 0 && !Static362.method5163(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static362.method5163(arg1)) {
			@Pc(40) int local40 = Static415.method5634(6408);
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 < arg1 ? arg0 : arg1;
			@Pc(53) int local53 = arg0 >> 1;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(59) float[] local59 = arg5;
			@Pc(66) float[] local66 = new float[local40 * local57 * local53];
			while (true) {
				OpenGL.glTexImage2Df(3553, local42, 34842, arg0, arg1, 0, 6408, 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(84) int local84 = local40 * arg0;
				for (@Pc(86) int local86 = 0; local86 < local40; local86++) {
					@Pc(90) int local90 = local86;
					@Pc(92) int local92 = local86;
					@Pc(96) int local96 = local86 + local84;
					for (@Pc(98) int local98 = 0; local98 < local57; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local53; local102++) {
							@Pc(108) float local108 = local59[local92];
							local92 += local40;
							@Pc(118) float local118 = local108 + local59[local92];
							local92 += local40;
							@Pc(128) float local128 = local118 + local59[local96];
							local96 += local40;
							@Pc(138) float local138 = local128 + local59[local96];
							local96 += local40;
							local66[local90] = local138 * 0.25F;
							local90 += local40;
						}
						local96 += local84;
						local92 += local84;
					}
				}
				@Pc(186) float[] local186 = local66;
				local66 = local59;
				local59 = local186;
				arg0 = local53;
				arg1 = local57;
				local53 >>= 0x1;
				local49 >>= 0x1;
				local42++;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
	public static void method922() {
		Static298.aClass51_16.method921();
		Static375.aClass247_11.method5586();
		Static439.aClass247_12.method5586();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)Z")
	public static boolean method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
