import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "k", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "[I")
	public static final int[] anIntArray9 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBIIII[B)V")
	public static void method212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg4 > 0 && !Static298.method3895(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static298.method3895(arg0)) {
			@Pc(31) int local31 = Static165.method4637(arg1);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg0 <= arg4 ? arg0 : arg4;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) byte[] local59 = arg5;
			@Pc(66) byte[] local66 = new byte[local57 * local53 * local31];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local33, arg3, arg4, arg0, 0, arg1, 5121, local59, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(84) int local84 = local31 * arg4;
				@Pc(86) byte[] local86 = local66;
				for (@Pc(88) int local88 = 0; local88 < local31; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(99) int local99 = local88 + local84;
					for (@Pc(101) int local101 = 0; local101 < local57; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local53; local105++) {
							@Pc(111) byte local111 = local59[local94];
							local94 += local31;
							@Pc(121) int local121 = local111 + local59[local94];
							@Pc(127) int local127 = local121 + local59[local99];
							local94 += local31;
							local99 += local31;
							@Pc(141) int local141 = local127 + local59[local99];
							local99 += local31;
							local66[local92] = (byte) (local141 >> 2);
							local92 += local31;
						}
						local99 += local84;
						local94 += local84;
					}
				}
				local66 = local59;
				local59 = local86;
				arg4 = local53;
				arg0 = local57;
				local44 >>= 0x1;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local33++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)I")
	public static int method213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	public static void method214(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub3_Sub13 local13 = Static397.method4998(11, arg0);
		local13.method3458();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method215(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local12));
		}
		return local10;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)V")
	public static void method217(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static114.aFloat94 = 3.0F;
		} else if (arg0 == 50) {
			Static114.aFloat94 = 4.0F;
		} else if (arg0 == 75) {
			Static114.aFloat94 = 6.0F;
		} else if (arg0 == 100) {
			Static114.aFloat94 = 8.0F;
		} else if (arg0 == 200) {
			Static114.aFloat94 = 16.0F;
		}
		Static113.anInt2002 = -1;
		Static113.anInt2002 = -1;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public static void method218() {
		if (Static191.aString30.toLowerCase().indexOf("microsoft") != -1) {
			Static230.anIntArray392[190] = 72;
			Static230.anIntArray392[219] = 42;
			Static230.anIntArray392[220] = 74;
			Static230.anIntArray392[187] = 27;
			Static230.anIntArray392[191] = 73;
			Static230.anIntArray392[223] = 28;
			Static230.anIntArray392[186] = 57;
			Static230.anIntArray392[188] = 71;
			Static230.anIntArray392[222] = 59;
			Static230.anIntArray392[221] = 43;
			Static230.anIntArray392[189] = 26;
			Static230.anIntArray392[192] = 58;
			return;
		}
		Static230.anIntArray392[59] = 57;
		Static230.anIntArray392[44] = 71;
		Static230.anIntArray392[45] = 26;
		if (Static191.aMethod1 == null) {
			Static230.anIntArray392[192] = 58;
			Static230.anIntArray392[222] = 59;
		} else {
			Static230.anIntArray392[192] = 28;
			Static230.anIntArray392[222] = 58;
			Static230.anIntArray392[520] = 59;
		}
		Static230.anIntArray392[46] = 72;
		Static230.anIntArray392[47] = 73;
		Static230.anIntArray392[91] = 42;
		Static230.anIntArray392[93] = 43;
		Static230.anIntArray392[92] = 74;
		Static230.anIntArray392[61] = 27;
	}
}
