import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
	public static int anInt7389;

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V")
	public static void method6143() {
		Static522.aClass3_Sub7_Sub5_4.method6023();
		Static110.aClass181_22 = null;
		Static218.aClass3_Sub7_Sub5_1 = null;
		Static565.anInt9608 = 1;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII[BBI)V")
	public static void method6144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static474.method7016(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static474.method7016(arg0)) {
			@Pc(37) int local37 = Static393.method2874(arg5);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg2 < arg0 ? arg2 : arg0;
			@Pc(50) int local50 = arg2 >> 1;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(56) byte[] local56 = arg4;
			@Pc(63) byte[] local63 = new byte[local37 * local54 * local50];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local39, arg3, arg2, arg0, 0, arg5, 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(83) int local83 = local37 * arg2;
				@Pc(85) byte[] local85 = local63;
				for (@Pc(87) int local87 = 0; local87 < local37; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local83 + local87;
					for (@Pc(99) int local99 = 0; local99 < local54; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local50; local103++) {
							@Pc(109) byte local109 = local56[local93];
							local93 += local37;
							@Pc(119) int local119 = local109 + local56[local93];
							@Pc(125) int local125 = local119 + local56[local97];
							local93 += local37;
							local97 += local37;
							@Pc(139) int local139 = local125 + local56[local97];
							local97 += local37;
							local63[local91] = (byte) (local139 >> 2);
							local91 += local37;
						}
						local97 += local83;
						local93 += local83;
					}
				}
				local63 = local56;
				arg2 = local50;
				local56 = local85;
				arg0 = local54;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local46 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "(B)V")
	public static void method6145() {
		if (Static379.aClass228_6.aBoolean614 && Static390.aClass278_4.anInt8394 != -1) {
			Static553.method7813(Static390.aClass278_4.anInt8394, Static390.aClass278_4.aString94);
		}
	}
}
