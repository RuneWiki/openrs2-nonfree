import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method937() {
		Static263.anImage12 = null;
		Static295.aFont2 = null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIII)V")
	public static void method939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(22) Class217 local22 = Static440.aClass217ArrayArrayArray3[arg2][arg3][arg1];
			if (local22 != null) {
				if (arg0 == 1) {
					local22.aShort87 = 0;
				} else if (arg0 == 2) {
					local22.aShort88 = 0;
				}
			}
			Static196.method3475();
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < Static156.anInt3553; local44++) {
			@Pc(49) Class10 local49 = Static448.aClass10Array2[local44];
			if (local49.aByte1 == arg0 && local49.aShort1 == arg3 && arg1 == local49.aShort3 || arg3 == local49.aShort2 && arg1 == local49.aShort3) {
				if (local44 != Static156.anInt3553) {
					Static649.method4860(Static448.aClass10Array2, local44 + 1, Static448.aClass10Array2, local44, Static448.aClass10Array2.length - local44 - 1);
				}
				Static156.anInt3553--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIII[B)V")
	public static void method940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg3 > 0 && !Static504.method7825(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static504.method7825(arg2)) {
			@Pc(35) int local35 = Static131.method2560(arg0);
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg3 < arg2 ? arg3 : arg2;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) byte[] local59 = arg5;
			@Pc(66) byte[] local66 = new byte[local35 * local53 * local57];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local42, arg1, arg3, arg2, 0, arg0, 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(84) int local84 = local35 * arg3;
				for (@Pc(86) int local86 = 0; local86 < local35; local86++) {
					@Pc(89) int local89 = local86;
					@Pc(91) int local91 = local86;
					@Pc(95) int local95 = local86 + local84;
					for (@Pc(97) int local97 = 0; local97 < local57; local97++) {
						for (@Pc(100) int local100 = 0; local100 < local53; local100++) {
							@Pc(105) byte local105 = local59[local91];
							local91 += local35;
							@Pc(115) int local115 = local105 + local59[local91];
							local91 += local35;
							@Pc(125) int local125 = local115 + local59[local95];
							local95 += local35;
							@Pc(135) int local135 = local125 + local59[local95];
							local66[local89] = (byte) (local135 >> 2);
							local95 += local35;
							local89 += local35;
						}
						local95 += local84;
						local91 += local84;
					}
				}
				@Pc(180) byte[] local180 = local66;
				local66 = local59;
				arg3 = local53;
				arg2 = local57;
				local59 = local180;
				local53 >>= 0x1;
				local42++;
				local57 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
