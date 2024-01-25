import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!ev;")
	public static final Class1_Sub16 aClass1_Sub16_1 = new Class1_Sub16(0, 0);

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "S")
	public static short aShort50 = 320;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_67 = new Class263(105, -2);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II[BIIII)V")
	public static void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static25.method518(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static25.method518(arg0)) {
			@Pc(30) int local30 = Static172.method2853(arg1);
			@Pc(32) int local32 = 0;
			@Pc(39) int local39 = arg0 <= arg4 ? arg0 : arg4;
			@Pc(43) int local43 = arg4 >> 1;
			@Pc(47) int local47 = arg0 >> 1;
			@Pc(49) byte[] local49 = arg2;
			@Pc(56) byte[] local56 = new byte[local43 * local47 * local30];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local32, arg3, arg4, arg0, 0, arg1, 5121, local49, 0);
				if (local39 <= 1) {
					return;
				}
				@Pc(76) int local76 = local30 * arg4;
				@Pc(78) byte[] local78 = local56;
				for (@Pc(80) int local80 = 0; local80 < local30; local80++) {
					@Pc(83) int local83 = local80;
					@Pc(85) int local85 = local80;
					@Pc(89) int local89 = local76 + local80;
					for (@Pc(91) int local91 = 0; local91 < local47; local91++) {
						for (@Pc(94) int local94 = 0; local94 < local43; local94++) {
							@Pc(99) byte local99 = local49[local85];
							local85 += local30;
							@Pc(109) int local109 = local99 + local49[local85];
							local85 += local30;
							@Pc(119) int local119 = local109 + local49[local89];
							local89 += local30;
							@Pc(129) int local129 = local119 + local49[local89];
							local89 += local30;
							local56[local83] = (byte) (local129 >> 2);
							local83 += local30;
						}
						local85 += local76;
						local89 += local76;
					}
				}
				local56 = local49;
				arg4 = local43;
				arg0 = local47;
				local49 = local78;
				local32++;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local39 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
