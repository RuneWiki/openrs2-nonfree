import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kh", name = "sb", descriptor = "[Lclient!dm;")
	public static Class77[] aClass77Array1;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_42 = new Class344(69, -1);

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "Lclient!eda;")
	public static Class90 aClass90_82 = new Class90(11, 6);

	@OriginalMember(owner = "client!kh", name = "pb", descriptor = "[B")
	public static final byte[] aByteArray46 = new byte[2048];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII[BZ)V")
	public static void method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		if (arg2 > 0 && !Static32.method1002(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static32.method1002(arg4)) {
			@Pc(38) int local38 = Static305.method4825(arg3);
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg2 < arg4 ? arg2 : arg4;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg4 >> 1;
			@Pc(57) byte[] local57 = arg5;
			@Pc(64) byte[] local64 = new byte[local51 * local55 * local38];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local40, arg0, arg2, arg4, 0, arg3, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg2 * local38;
				for (@Pc(86) int local86 = 0; local86 < local38; local86++) {
					@Pc(90) int local90 = local86;
					@Pc(92) int local92 = local86;
					@Pc(96) int local96 = local84 + local86;
					for (@Pc(98) int local98 = 0; local98 < local55; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local51; local102++) {
							@Pc(108) byte local108 = local57[local92];
							local92 += local38;
							@Pc(118) int local118 = local108 + local57[local92];
							@Pc(124) int local124 = local118 + local57[local96];
							local92 += local38;
							local96 += local38;
							@Pc(138) int local138 = local124 + local57[local96];
							local96 += local38;
							local64[local90] = (byte) (local138 >> 2);
							local90 += local38;
						}
						local92 += local84;
						local96 += local84;
					}
				}
				@Pc(175) byte[] local175 = local64;
				local64 = local57;
				arg4 = local55;
				arg2 = local51;
				local57 = local175;
				local40++;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method4404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg3 < 0L) {
			local25 = true;
			arg3 = -arg3;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		if (arg0 > 0) {
			for (local46 = 0; local46 < arg0; local46++) {
				@Pc(51) int local51 = (int) arg3;
				arg3 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg3 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			@Pc(93) int local93 = (int) arg3;
			arg3 /= 10L;
			local39.append((char) (local93 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg2) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(Z)V")
	public static void method4405() {
		Static75.method1599();
		Static487.method7088();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIIZ)V")
	public static void method4406(@OriginalArg(3) boolean arg0) {
		Static455.aBoolean611 = arg0;
		Static544.anInt9957 = 22050;
		Static534.anInt9774 = 2;
	}
}
