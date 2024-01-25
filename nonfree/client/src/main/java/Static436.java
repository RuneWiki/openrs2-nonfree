import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public static int anInt7296 = 0;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_158 = new Class253(111, -1);

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	public static int anInt7298 = 0;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
	public static int anInt7299 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method5607(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(67) int local67;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local8 <= local20 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local67 = arg0[local20] & 0xFF;
					if (local67 < 128 || local67 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(87) int local87 = arg0[local20] & 0xFF;
					if (local87 < 128 || local87 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local28 & 0xFFF1F) << 12 | local67 << 6 & 0xFFFFDFC0 | local87 & 0xFFFFFF7F);
				} else if (local8 > local20 + 1) {
					local20++;
					local67 = arg0[local20] & 0xFF;
					if (local67 < 128 || local67 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local67 & 0xFFFFFF7F | (local28 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local11[local13++] = (char) local28;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIZ)Lclient!vj;")
	public static Class7_Sub44 method5609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class7_Sub44 local7 = new Class7_Sub44();
		local7.anInt7164 = arg0;
		local7.anInt7165 = arg2;
		Static23.aClass164_3.method3508((long) arg1, local7);
		Static92.method1632(arg2);
		@Pc(28) Class95 local28 = Static313.method4088(arg1);
		if (local28 != null) {
			Static413.method5189(local28);
		}
		if (Static63.aClass95_2 != null) {
			Static413.method5189(Static63.aClass95_2);
			Static63.aClass95_2 = null;
		}
		Static186.method2721();
		if (local28 != null) {
			Static118.method1991(local28, !arg3);
		}
		if (!arg3) {
			Static159.method2348(arg2);
		}
		if (!arg3 && Static183.anInt3293 != -1) {
			Static379.method4657(1, Static183.anInt3293);
		}
		return local7;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BIIIIIB)V")
	public static void method5610(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 > 0 && !Static217.method3066(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static217.method3066(arg5)) {
			@Pc(42) int local42 = Static31.method416(arg1);
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg5 > arg4 ? arg4 : arg5;
			@Pc(55) int local55 = arg4 >> 1;
			@Pc(59) int local59 = arg5 >> 1;
			@Pc(61) byte[] local61 = arg0;
			@Pc(68) byte[] local68 = new byte[local55 * local59 * local42];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local44, arg2, arg4, arg5, 0, arg1, 5121, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(87) int local87 = local42 * arg4;
				for (@Pc(89) int local89 = 0; local89 < local42; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(100) int local100 = local89 + local87;
					for (@Pc(102) int local102 = 0; local102 < local59; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local55; local106++) {
							@Pc(112) byte local112 = local61[local95];
							local95 += local42;
							@Pc(122) int local122 = local112 + local61[local95];
							@Pc(128) int local128 = local122 + local61[local100];
							local95 += local42;
							local100 += local42;
							@Pc(142) int local142 = local128 + local61[local100];
							local100 += local42;
							local68[local93] = (byte) (local142 >> 2);
							local93 += local42;
						}
						local95 += local87;
						local100 += local87;
					}
				}
				@Pc(183) byte[] local183 = local68;
				local68 = local61;
				arg4 = local55;
				arg5 = local59;
				local61 = local183;
				local51 >>= 0x1;
				local44++;
				local55 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
