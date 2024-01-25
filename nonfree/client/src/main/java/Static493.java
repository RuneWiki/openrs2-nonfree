import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
	public static int anInt8640;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_138 = new Class98(96, 12);

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "Lclient!of;")
	public static final Class230 aClass230_52 = new Class230(14, 4);

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
	public static int anInt8639 = 0;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_139 = new Class98(84, 16);

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "Lclient!kf;")
	public static final Class171 aClass171_15 = new Class171(4);

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
	public static final int anInt8641 = 0;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(III[BIII)V")
	public static void method6863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 > 0 && !Static331.method5078(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static331.method5078(arg1)) {
			@Pc(38) int local38 = Static440.method6243(arg0);
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 > arg2 ? arg2 : arg1;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(57) byte[] local57 = arg3;
			@Pc(64) byte[] local64 = new byte[local51 * local55 * local38];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local40, arg5, arg2, arg1, 0, arg0, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(83) int local83 = arg2 * local38;
				@Pc(85) byte[] local85 = local64;
				for (@Pc(87) int local87 = 0; local87 < local38; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(98) int local98 = local87 + local83;
					for (@Pc(100) int local100 = 0; local100 < local55; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local51; local104++) {
							@Pc(110) byte local110 = local57[local93];
							local93 += local38;
							@Pc(120) int local120 = local110 + local57[local93];
							local93 += local38;
							@Pc(130) int local130 = local120 + local57[local98];
							local98 += local38;
							@Pc(140) int local140 = local130 + local57[local98];
							local64[local91] = (byte) (local140 >> 2);
							local98 += local38;
							local91 += local38;
						}
						local93 += local83;
						local98 += local83;
					}
				}
				local64 = local57;
				arg1 = local55;
				local57 = local85;
				arg2 = local51;
				local55 >>= 0x1;
				local40++;
				local51 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
