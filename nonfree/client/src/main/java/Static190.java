import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
	public static int anInt3597;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "Lclient!uia;")
	public static final Class340 aClass340_2 = new Class340();

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
	public static int anInt3599 = 0;

	@OriginalMember(owner = "client!gp", name = "N", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!gp", name = "cb", descriptor = "I")
	public static int anInt3603 = 0;

	@OriginalMember(owner = "client!gp", name = "db", descriptor = "J")
	public static long aLong102 = -1L;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III[BIII)V")
	public static void method3239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static323.method5278(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static323.method5278(arg1)) {
			@Pc(34) int local34 = Static445.method6913(arg4);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg1 > arg5 ? arg5 : arg1;
			@Pc(51) int local51 = arg5 >> 1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(57) byte[] local57 = arg2;
			@Pc(64) byte[] local64 = new byte[local34 * local55 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local36, arg3, arg5, arg1, 0, arg4, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(90) int local90 = arg5 * local34;
				@Pc(92) byte[] local92 = local64;
				for (@Pc(94) int local94 = 0; local94 < local34; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(105) int local105 = local94 + local90;
					for (@Pc(107) int local107 = 0; local107 < local55; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local51; local111++) {
							@Pc(117) byte local117 = local57[local100];
							local100 += local34;
							@Pc(127) int local127 = local117 + local57[local100];
							local100 += local34;
							@Pc(137) int local137 = local127 + local57[local105];
							local105 += local34;
							@Pc(147) int local147 = local137 + local57[local105];
							local105 += local34;
							local64[local98] = (byte) (local147 >> 2);
							local98 += local34;
						}
						local105 += local90;
						local100 += local90;
					}
				}
				local64 = local57;
				local57 = local92;
				arg5 = local51;
				arg1 = local55;
				local55 >>= 0x1;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
