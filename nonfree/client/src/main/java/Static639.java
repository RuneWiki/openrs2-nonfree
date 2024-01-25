import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_12 = new Class78("", 20);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public static int anInt9892 = 0;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static final int anInt9893 = 328;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)I")
	public static int method8418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static void method8419(@OriginalArg(0) int arg0) {
		@Pc(22) Class3_Sub7_Sub21 local22 = Static136.method2378((long) arg0, 7);
		local22.method9260();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIBIII)V")
	public static void method8420(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static88.method1890(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static88.method1890(arg3)) {
			@Pc(40) int local40 = Static717.method9503(arg0);
			@Pc(42) int local42 = 0;
			@Pc(50) int local50 = arg5 >= arg3 ? arg3 : arg5;
			@Pc(59) int local59 = arg5 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) byte[] local65 = arg1;
			@Pc(72) byte[] local72 = new byte[local40 * local59 * local63];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local42, arg2, arg5, arg3, 0, arg0, 5121, local65, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg5 * local40;
				@Pc(94) byte[] local94 = local72;
				for (@Pc(96) int local96 = 0; local96 < local40; local96++) {
					@Pc(102) int local102 = local96;
					@Pc(104) int local104 = local96;
					@Pc(108) int local108 = local92 + local96;
					for (@Pc(110) int local110 = 0; local110 < local63; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local59; local114++) {
							@Pc(122) byte local122 = local65[local104];
							local104 += local40;
							@Pc(132) int local132 = local122 + local65[local104];
							@Pc(138) int local138 = local132 + local65[local108];
							local104 += local40;
							local108 += local40;
							@Pc(152) int local152 = local138 + local65[local108];
							local72[local102] = (byte) (local152 >> 2);
							local108 += local40;
							local102 += local40;
						}
						local108 += local92;
						local104 += local92;
					}
				}
				local72 = local65;
				local65 = local94;
				arg5 = local59;
				arg3 = local63;
				local63 >>= 0x1;
				local42++;
				local50 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
