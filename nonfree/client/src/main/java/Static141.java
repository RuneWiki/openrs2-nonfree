import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static int anInt7998;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray158;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_153 = new Class266(4, 1, 1, 1);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "[I")
	public static final int[] anIntArray629 = new int[14];

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)I")
	public static int method6324() {
		if ((double) Static425.aFloat65 == 3.0D) {
			return 37;
		} else if ((double) Static425.aFloat65 == 4.0D) {
			return 50;
		} else if ((double) Static425.aFloat65 == 6.0D) {
			return 75;
		} else if ((double) Static425.aFloat65 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIBLclient!ci;II)V")
	public static void method6326(@OriginalArg(4) Class38 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static410.anInt7145 = arg2;
		Static263.anInt5010 = arg1;
		Static445.anInt7575 = 1;
		Static236.aClass38_50 = arg0;
		Static335.anInt5946 = 2;
		Static242.aBoolean314 = false;
		Static395.anInt6972 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method6328(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static292.method4485(local13) : local13;
		} else if (arg1 instanceof Class174) {
			@Pc(27) Class174 local27 = (Class174) arg1;
			return local27.method4353();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB[BI)V")
	public static void method6329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static39.method809(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static39.method809(arg2)) {
			@Pc(37) int local37 = Static302.method4667(arg1);
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(63) int local63 = arg2 >> 1;
			@Pc(65) byte[] local65 = arg4;
			@Pc(72) byte[] local72 = new byte[local37 * local63 * local59];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local44, arg0, arg3, arg2, 0, arg1, 5121, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(93) int local93 = local37 * arg3;
				for (@Pc(95) int local95 = 0; local95 < local37; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local95 + local93;
					for (@Pc(107) int local107 = 0; local107 < local63; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local59; local111++) {
							@Pc(117) byte local117 = local65[local101];
							local101 += local37;
							@Pc(127) int local127 = local117 + local65[local101];
							@Pc(133) int local133 = local127 + local65[local105];
							local101 += local37;
							local105 += local37;
							@Pc(147) int local147 = local133 + local65[local105];
							local72[local99] = (byte) (local147 >> 2);
							local105 += local37;
							local99 += local37;
						}
						local101 += local93;
						local105 += local93;
					}
				}
				@Pc(192) byte[] local192 = local72;
				local72 = local65;
				local65 = local192;
				arg2 = local63;
				arg3 = local59;
				local55 >>= 0x1;
				local63 >>= 0x1;
				local44++;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
