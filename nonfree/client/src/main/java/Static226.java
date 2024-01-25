import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt3936;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static int anInt3950;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	public static int anInt3951;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_64 = new Class2(71, -1);

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[[B")
	public static final byte[][] aByteArrayArray15 = new byte[250][];

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_26 = new Class126(200);

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([FIIIIII)V")
	public static void method3126(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static217.method3066(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static217.method3066(arg2)) {
			@Pc(37) int local37 = Static31.method416(6408);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg2 > arg4 ? arg4 : arg2;
			@Pc(50) int local50 = arg4 >> 1;
			@Pc(54) int local54 = arg2 >> 1;
			@Pc(56) float[] local56 = arg0;
			@Pc(63) float[] local63 = new float[local54 * local50 * local37];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg4, arg2, 0, 6408, 5126, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(84) int local84 = local37 * arg4;
				@Pc(86) float[] local86 = local63;
				for (@Pc(88) int local88 = 0; local88 < local37; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local84 + local88;
					for (@Pc(100) int local100 = 0; local100 < local54; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
							@Pc(110) float local110 = local56[local94];
							local94 += local37;
							@Pc(120) float local120 = local110 + local56[local94];
							local94 += local37;
							@Pc(130) float local130 = local120 + local56[local98];
							local98 += local37;
							@Pc(140) float local140 = local130 + local56[local98];
							local63[local92] = local140 * 0.25F;
							local98 += local37;
							local92 += local37;
						}
						local98 += local84;
						local94 += local84;
					}
				}
				local63 = local56;
				arg4 = local50;
				local56 = local86;
				arg2 = local54;
				local54 >>= 0x1;
				local46 >>= 0x1;
				local50 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)Z")
	public static boolean method3130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZI)V")
	public static void method3131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static316.anInt5188 <= arg1 && arg1 <= Static82.anInt1667) {
			@Pc(15) int local15 = Static278.method3708(arg3, Static137.anInt2576, Static293.anInt4886);
			@Pc(21) int local21 = Static278.method3708(arg2, Static137.anInt2576, Static293.anInt4886);
			Static262.method5692(arg1, local15, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method3135() {
		Static36.anInt647 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static102.aClass7_Sub14Array1[local14] = null;
			Static373.aByteArray86[local14] = 1;
			Static136.aClass89Array1[local14] = null;
		}
	}
}
