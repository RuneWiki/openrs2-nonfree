import java.awt.Rectangle;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "Lclient!f;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	public static int anInt1391;

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "Lclient!f;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "[I")
	public static final int[] anIntArray62 = new int[13];

	@OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
	public static int anInt1396 = 999999;

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
	public static int anInt1399 = 0;

	@OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
	public static final int anInt1400 = 4;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IB)V")
	public static void method1204(@OriginalArg(0) int arg0) {
		Static30.aLong22 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBIII)V")
	public static void method1208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static231.anInt4302; local7++) {
			@Pc(21) Rectangle local21 = Class295.aRectangleArray2[local7];
			if (local21.x + local21.width > arg3 && local21.x < arg3 + arg0 && local21.y + local21.height > arg2 && arg2 + arg1 > local21.y) {
				Static102.aBooleanArray7[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1210(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (local17 << 5) + (Static165.method2703(arg0.charAt(local19)) - local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!in;)Lclient!in;")
	public static Class160 method1213(@OriginalArg(1) Class160 arg0) {
		if (arg0.anInt4224 != -1) {
			return Static512.method7155(arg0.anInt4224);
		}
		@Pc(19) int local19 = arg0.anInt4199 >>> 16;
		@Pc(29) Class69 local29 = new Class69(Static148.aClass91_6);
		for (@Pc(34) Class1_Sub38 local34 = (Class1_Sub38) local29.method1483(); local34 != null; local34 = (Class1_Sub38) local29.method1480()) {
			if (local19 == local34.anInt7676) {
				return Static512.method7155((int) local34.aLong268);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILclient!ks;IIIIILclient!da;Lclient!r;III)Lclient!da;")
	public static Class52 method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class197 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class52 arg8, @OriginalArg(10) Class78 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method4037(arg7, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = (long) ((arg5 << 24) + arg2 + (arg10 << 16)) + ((long) arg4 << 32) + ((long) arg6 << 48);
		@Pc(51) Class207 local51 = Static580.aClass207_60;
		@Pc(59) Class52 local59;
		synchronized (Static580.aClass207_60) {
			local59 = (Class52) Static580.aClass207_60.method4390(local49);
		}
		if (local59 == null || arg9.method6819(local59.PA(), local11) != 0) {
			if (local59 != null) {
				local11 = arg9.method6782(local11, local59.PA());
			}
			@Pc(91) byte local91;
			if (arg2 == 1) {
				local91 = 9;
			} else if (arg2 == 2) {
				local91 = 12;
			} else if (arg2 == 3) {
				local91 = 15;
			} else if (arg2 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class231 local148 = new Class231(local91 * 3 + 1, -local91 + local91 * 6, 0);
			@Pc(155) int local155 = local148.method5068(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local91];
			@Pc(167) int local167;
			@Pc(171) int local171;
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (@Pc(161) int local161 = 0; local161 < 3; local161++) {
				local167 = local130[local161];
				local171 = local130[local161];
				for (local173 = 0; local173 < local91; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local91;
					@Pc(189) int local189 = local167 * Class85_Sub8.anIntArray426[local181] >> 14;
					local197 = local171 * Class85_Sub8.anIntArray427[local181] >> 14;
					local159[local161][local173] = local148.method5068(local197, 0, local189);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(250) byte local250 = (byte) (arg5 * local171 + arg10 * local173 >> 8);
				@Pc(295) short local295 = (short) (((arg4 & 0x7F) * local173 + local171 * (arg6 & 0x7F) & 0x7F00) + (local173 * (arg4 & 0xFC00) + local171 * (arg6 & 0xFC00) & 0xFC0000) + ((arg6 & 0x380) * local171 + local173 * (arg4 & 0x380) & 0x38000) >> 8);
				for (local197 = 0; local197 < local91; local197++) {
					if (local167 == 0) {
						local148.method5071(local155, local159[0][(local197 + 1) % local91], (byte) 1, local295, (byte) -1, local159[0][local197], (short) -1, local250);
					} else {
						local148.method5071(local159[local167 - 1][local197], local159[local167 - 1][(local197 + 1) % local91], (byte) 1, local295, (byte) -1, local159[local167][(local197 + 1) % local91], (short) -1, local250);
						local148.method5071(local159[local167 - 1][local197], local159[local167][(local197 + 1) % local91], (byte) 1, local295, (byte) -1, local159[local167][local197], (short) -1, local250);
					}
				}
			}
			local59 = arg9.method6817(local148, local11, Static552.anInt6352, 64, 768);
			@Pc(419) Class207 local419 = Static580.aClass207_60;
			synchronized (Static580.aClass207_60) {
				Static580.aClass207_60.method4391(local49, local59);
			}
		}
		@Pc(435) int local435 = arg8.KA();
		@Pc(438) int local438 = arg8.l();
		@Pc(441) int local441 = arg8.OA();
		@Pc(444) int local444 = arg8.za();
		@Pc(446) Class1_Sub8_Sub18 local446 = null;
		if (arg3 != null) {
			@Pc(453) int local453 = arg3.anIntArray284[arg7];
			local446 = Static223.aClass245_1.method5307(local453 >> 16);
			arg7 = local453 & 0xFFFF;
		}
		if (local446 == null) {
			local59 = local59.method7412((byte) 3, local11, true);
			local59.R(local438 - local435 >> 1, 128, local444 - local441 >> 1);
			local59.oa(local438 + local435 >> 1, 0, local444 + local441 >> 1);
		} else {
			local59 = local59.method7412((byte) 3, local11, true);
			local59.R(local438 - local435 >> 1, 128, local444 - local441 >> 1);
			local59.oa(local435 + local438 >> 1, 0, local441 + local444 >> 1);
			local59.method7411(local446, arg7);
		}
		if (arg0 != 0) {
			local59.MA(arg0);
		}
		if (arg12 != 0) {
			local59.W(arg12);
		}
		if (arg1 != 0) {
			local59.oa(0, arg1, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)V")
	public static void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 != null) {
			Static328.method4862(local7.aClass11_Sub1_Sub4_1);
			if (local7.aClass11_Sub1_Sub4_1 != null) {
				local7.aClass11_Sub1_Sub4_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBLjava/io/File;[B)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local19.readFully(arg2, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}
}
