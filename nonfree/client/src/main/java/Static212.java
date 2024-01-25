import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!cba;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Lclient!gp;")
	public static Class117 aClass117_110;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!im", name = "o", descriptor = "Lclient!sq;")
	public static final Class273 aClass273_3 = new Class273();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII[IIII)V")
	public static void method3445(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static281.method4574(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static281.method4574(arg4)) {
			@Pc(48) int local48 = 0;
			@Pc(59) int local59 = arg4 <= arg3 ? arg4 : arg3;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(67) int local67 = arg4 >> 1;
			@Pc(69) int[] local69 = arg2;
			@Pc(74) int[] local74 = new int[local63 * local67];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local48, arg1, arg3, arg4, 0, 32993, arg5, local69, 0);
				if (local59 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(96) int local96 = arg3;
				@Pc(98) int[] local98 = local74;
				for (@Pc(100) int local100 = 0; local100 < local67; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local63; local104++) {
						@Pc(111) int local111 = local69[local92++];
						@Pc(116) int local116 = local69[local96++];
						@Pc(121) int local121 = local69[local92++];
						@Pc(127) int local127 = local111 >> 24 & 0xFF;
						@Pc(133) int local133 = local111 >> 16 & 0xFF;
						@Pc(139) int local139 = local111 >> 8 & 0xFF;
						@Pc(143) int local143 = local111 & 0xFF;
						@Pc(148) int local148 = local69[local96++];
						@Pc(156) int local156 = local127 + (local121 >> 24 & 0xFF);
						@Pc(164) int local164 = local133 + (local121 >> 16 & 0xFF);
						@Pc(170) int local170 = local143 + (local121 & 0xFF);
						@Pc(178) int local178 = local139 + (local121 >> 8 & 0xFF);
						@Pc(186) int local186 = local178 + (local116 >> 8 & 0xFF);
						@Pc(194) int local194 = local156 + (local116 >> 24 & 0xFF);
						@Pc(202) int local202 = local164 + (local116 >> 16 & 0xFF);
						@Pc(208) int local208 = local170 + (local116 & 0xFF);
						@Pc(216) int local216 = local202 + (local148 >> 16 & 0xFF);
						@Pc(222) int local222 = local208 + (local148 & 0xFF);
						@Pc(230) int local230 = local194 + (local148 >> 24 & 0xFF);
						@Pc(238) int local238 = local186 + (local148 >> 8 & 0xFF);
						local74[local90++] = local222 >> 2 & 0xFF | (local238 & 0x3FC) << 6 | (local230 & 0x3FC) << 22 | (local216 & 0x3FC) << 14;
					}
					local96 += arg3;
					local92 += arg3;
				}
				local74 = local69;
				arg4 = local67;
				local69 = local98;
				arg3 = local63;
				local67 >>= 0x1;
				local59 >>= 0x1;
				local48++;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IFIIZIII)[I")
	public static int[] method3448(@OriginalArg(1) float arg0) {
		@Pc(18) int[] local18 = new int[2048];
		@Pc(22) Class5_Sub1_Sub31 local22 = new Class5_Sub1_Sub31();
		local22.anInt7441 = (int) (arg0 * 4096.0F);
		local22.anInt7449 = 8;
		local22.aBoolean530 = true;
		local22.anInt7439 = 4;
		local22.anInt7448 = 35;
		local22.anInt7443 = 8;
		local22.method7157();
		Static107.method2150(2048, 1);
		local22.method6049(0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method3450(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(74) int local74 = local34 - 1; local74 > 0; local74--) {
			@Pc(78) int local78 = arg0;
			arg0 /= 10;
			@Pc(89) int local89 = local78 - arg0 * 10;
			if (local89 >= 10) {
				local53[local74] = (char) (local89 + 87);
			} else {
				local53[local74] = (char) (local89 + 48);
			}
		}
		return new String(local53);
	}
}
