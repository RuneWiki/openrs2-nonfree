import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	public static int anInt883 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method836() {
		Static184.anInt3532 = 0;
		Static60.anInt1094 = -1;
		Static343.anInt771 = -1;
		Static386.anInt3967 = -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
	public static boolean method839(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(93) int local93;
			if (local46 >= '0' && local46 <= '9') {
				local93 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local93 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local93 = local46 - 'W';
			} else {
				return false;
			}
			if (local93 >= 10) {
				return false;
			}
			if (local26) {
				local93 = -local93;
			}
			@Pc(120) int local120 = local35 * 10 + local93;
			if (local120 / 10 != local35) {
				return false;
			}
			local35 = local120;
			local33 = true;
		}
		return local33;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIII[BII)V")
	public static void method840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static424.method5413(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static424.method5413(arg2)) {
			@Pc(38) int local38 = Static9.method92(arg4);
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(57) byte[] local57 = arg3;
			@Pc(64) byte[] local64 = new byte[local38 * local51 * local55];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local40, arg1, arg0, arg2, 0, arg4, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(83) int local83 = local38 * arg0;
				@Pc(85) byte[] local85 = local64;
				for (@Pc(87) int local87 = 0; local87 < local38; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local83 + local87;
					for (@Pc(99) int local99 = 0; local99 < local55; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local51; local103++) {
							@Pc(109) byte local109 = local57[local93];
							local93 += local38;
							@Pc(119) int local119 = local109 + local57[local93];
							local93 += local38;
							@Pc(129) int local129 = local119 + local57[local97];
							local97 += local38;
							@Pc(139) int local139 = local129 + local57[local97];
							local64[local91] = (byte) (local139 >> 2);
							local97 += local38;
							local91 += local38;
						}
						local93 += local83;
						local97 += local83;
					}
				}
				local64 = local57;
				local57 = local85;
				arg0 = local51;
				arg2 = local55;
				local51 >>= 0x1;
				local40++;
				local47 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
