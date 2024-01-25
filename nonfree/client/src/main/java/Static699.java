import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static699 {

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Z")
	public static boolean aBoolean791;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_50 = new Class136(4);

	@OriginalMember(owner = "client!w", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!w", name = "m", descriptor = "J")
	public static long aLong373 = 0L;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII[B)V")
	public static void method9148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg4 > 0 && !Static28.method398(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static28.method398(arg1)) {
			@Pc(40) int local40 = Static291.method4409(arg2);
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = arg1 > arg4 ? arg4 : arg1;
			@Pc(58) int local58 = arg4 >> 1;
			@Pc(72) int local72 = arg1 >> 1;
			@Pc(74) byte[] local74 = arg5;
			@Pc(81) byte[] local81 = new byte[local40 * local72 * local58];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local42, arg0, arg4, arg1, 0, arg2, 5121, local74, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(99) int local99 = local40 * arg4;
				for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
					@Pc(107) int local107 = local101;
					@Pc(109) int local109 = local101;
					@Pc(114) int local114 = local101 + local99;
					for (@Pc(116) int local116 = 0; local116 < local72; local116++) {
						for (@Pc(120) int local120 = 0; local120 < local58; local120++) {
							@Pc(128) byte local128 = local74[local109];
							local109 += local40;
							@Pc(138) int local138 = local128 + local74[local109];
							local109 += local40;
							@Pc(148) int local148 = local138 + local74[local114];
							local114 += local40;
							@Pc(158) int local158 = local148 + local74[local114];
							local81[local107] = (byte) (local158 >> 2);
							local114 += local40;
							local107 += local40;
						}
						local109 += local99;
						local114 += local99;
					}
				}
				@Pc(203) byte[] local203 = local81;
				local81 = local74;
				arg1 = local72;
				local74 = local203;
				arg4 = local58;
				local58 >>= 0x1;
				local72 >>= 0x1;
				local54 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method9149(@OriginalArg(1) Class67 arg0) {
		if (Static555.aBoolean678) {
			Static316.method5357(arg0);
		} else {
			Static587.method8072(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!uj;I)Z")
	public static boolean method9150(@OriginalArg(0) Class371 arg0) {
		return arg0 == Static552.aClass371_10 || arg0 == Static541.aClass371_5 || arg0 == Static547.aClass371_9 || arg0 == Static110.aClass371_1 || arg0 == Static479.aClass371_6;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZ)I")
	public static int method9151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(24) double local24 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(33) double local33 = Math.random() * (local17 - local24) + local24;
		return (int) (Math.pow(2.0D, local33) + 0.5D);
	}
}
