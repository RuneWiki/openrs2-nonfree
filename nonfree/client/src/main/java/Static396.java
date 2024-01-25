import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Z")
	public static boolean aBoolean555 = false;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_242 = new Class67(50, 12);

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[Lclient!ki;")
	public static final Class140[] aClass140Array1 = new Class140[16];

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!vo;")
	public static final Class265 aClass265_8 = new Class265("", 17);

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public static int anInt6368 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIII[B)V")
	public static void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg2 > 0 && !Static375.method4864(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static375.method4864(arg1)) {
			@Pc(34) int local34 = Static14.method271(arg0);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg1 > arg2 ? arg2 : arg1;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(61) byte[] local61 = arg5;
			@Pc(68) byte[] local68 = new byte[local34 * local51 * local47];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg3, arg2, arg1, 0, arg0, 5121, local61, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(89) int local89 = local34 * arg2;
				for (@Pc(91) int local91 = 0; local91 < local34; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local51; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local47; local107++) {
							@Pc(113) byte local113 = local61[local97];
							local97 += local34;
							@Pc(123) int local123 = local113 + local61[local97];
							@Pc(129) int local129 = local123 + local61[local101];
							local97 += local34;
							local101 += local34;
							@Pc(143) int local143 = local129 + local61[local101];
							local101 += local34;
							local68[local95] = (byte) (local143 >> 2);
							local95 += local34;
						}
						local101 += local89;
						local97 += local89;
					}
				}
				@Pc(188) byte[] local188 = local68;
				local68 = local61;
				arg2 = local47;
				local61 = local188;
				arg1 = local51;
				local47 >>= 0x1;
				local36++;
				local51 >>= 0x1;
				local43 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5137(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(33) long local33 = arg0;
			while (local33 != 0L) {
				local33 /= 37L;
				local31++;
			}
			@Pc(51) StringBuffer local51 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				local51.append(Static299.aCharArray4[(int) (local63 - arg0 * 37L)]);
			}
			return local51.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	public static void method5138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg1, 14);
		local8.method384();
		local8.anInt381 = arg0;
	}
}
