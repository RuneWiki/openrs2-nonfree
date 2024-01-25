import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "J")
	public static long aLong242;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!pl;")
	public static Class259 aClass259_162;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III[BZII)V")
	public static void method7309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static19.method380(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static19.method380(arg4)) {
			@Pc(34) int local34 = Static288.method4279(arg2);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg1 < arg4 ? arg1 : arg4;
			@Pc(47) int local47 = arg1 >> 1;
			@Pc(51) int local51 = arg4 >> 1;
			@Pc(53) byte[] local53 = arg3;
			@Pc(71) byte[] local71 = new byte[local34 * local51 * local47];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local36, arg5, arg1, arg4, 0, arg2, 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(90) int local90 = local34 * arg1;
				for (@Pc(92) int local92 = 0; local92 < local34; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(103) int local103 = local92 + local90;
					for (@Pc(105) int local105 = 0; local105 < local51; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local47; local109++) {
							@Pc(115) byte local115 = local53[local98];
							local98 += local34;
							@Pc(125) int local125 = local115 + local53[local98];
							@Pc(131) int local131 = local125 + local53[local103];
							local98 += local34;
							local103 += local34;
							@Pc(145) int local145 = local131 + local53[local103];
							local103 += local34;
							local71[local96] = (byte) (local145 >> 2);
							local96 += local34;
						}
						local103 += local90;
						local98 += local90;
					}
				}
				@Pc(194) byte[] local194 = local71;
				local71 = local53;
				local53 = local194;
				arg1 = local47;
				arg4 = local51;
				local36++;
				local43 >>= 0x1;
				local47 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)I")
	public static int method7311(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
