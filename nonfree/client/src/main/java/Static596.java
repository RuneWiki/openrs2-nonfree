import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
	public static int anInt9772;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_181 = new Class56(96, 7);

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "[C")
	public static final char[] aCharArray19 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
	public static int anInt9773 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIILclient!lb;IBIIILclient!da;ILclient!r;)Lclient!da;")
	public static Class60 method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class185 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class60 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class45 arg12) {
		if (arg10 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg5 != null) {
			local11 = arg5.method4379(arg7, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg9 << 32) + ((long) ((arg11 << 24) + (arg6 + (arg1 << 16))) + ((long) arg0 << 48));
		@Pc(51) Class6 local51 = Static475.aClass6_58;
		@Pc(59) Class60 local59;
		synchronized (Static475.aClass6_58) {
			local59 = (Class60) Static475.aClass6_58.method92(local49);
		}
		if (local59 == null || arg12.method7393(local59.PA(), local11) != 0) {
			if (local59 != null) {
				local11 = arg12.method7392(local11, local59.PA());
			}
			@Pc(102) byte local102;
			if (arg6 == 1) {
				local102 = 9;
			} else if (arg6 == 2) {
				local102 = 12;
			} else if (arg6 == 3) {
				local102 = 15;
			} else if (arg6 == 4) {
				local102 = 18;
			} else {
				local102 = 21;
			}
			@Pc(131) int[] local131 = new int[] { 64, 96, 128 };
			@Pc(150) Class84 local150 = new Class84(local102 * 3 + 1, -local102 + local102 * 6, 0);
			@Pc(157) int local157 = local150.method2436(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local102];
			@Pc(169) int local169;
			@Pc(173) int local173;
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (@Pc(163) int local163 = 0; local163 < 3; local163++) {
				local169 = local131[local163];
				local173 = local131[local163];
				for (local175 = 0; local175 < local102; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local102;
					@Pc(191) int local191 = Class356.anIntArray597[local183] * local169 >> 14;
					local199 = Class356.anIntArray598[local183] * local173 >> 14;
					local161[local163][local175] = local150.method2436(local199, local191, 0);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(250) byte local250 = (byte) (local175 * arg1 + local173 * arg11 >> 8);
				@Pc(295) short local295 = (short) (((arg0 & 0x380) * local173 + (arg9 & 0x380) * local175 & 0x38000) + (local173 * (arg0 & 0xFC00) + (arg9 & 0xFC00) * local175 & 0xFC0000) + (local173 * (arg0 & 0x7F) + local175 * (arg9 & 0x7F) & 0x7F00) >> 8);
				for (local199 = 0; local199 < local102; local199++) {
					if (local169 == 0) {
						local150.method2430(local161[0][local199], local295, local250, (short) -1, (byte) -1, (byte) 1, local157, local161[0][(local199 + 1) % local102]);
					} else {
						local150.method2430(local161[local169][(local199 + 1) % local102], local295, local250, (short) -1, (byte) -1, (byte) 1, local161[local169 - 1][local199], local161[local169 - 1][(local199 + 1) % local102]);
						local150.method2430(local161[local169][local199], local295, local250, (short) -1, (byte) -1, (byte) 1, local161[local169 - 1][local199], local161[local169][(local199 + 1) % local102]);
					}
				}
			}
			local59 = arg12.method7419(local150, local11, Static282.anInt4861, 64, 768);
			@Pc(411) Class6 local411 = Static475.aClass6_58;
			synchronized (Static475.aClass6_58) {
				Static475.aClass6_58.method106(local49, local59);
			}
		}
		@Pc(427) int local427 = arg10.KA();
		@Pc(430) int local430 = arg10.l();
		@Pc(433) int local433 = arg10.OA();
		@Pc(436) int local436 = arg10.za();
		@Pc(438) Class3_Sub7_Sub6 local438 = null;
		if (arg5 != null) {
			@Pc(453) int local453 = arg5.anIntArray280[arg7];
			local438 = Static545.aClass240_2.method5679(local453 >> 16);
			arg7 = local453 & 0xFFFF;
		}
		if (local438 == null) {
			local59 = local59.method7229((byte) 3, local11, true);
			local59.R(local430 - local427 >> 1, 128, local436 - local433 >> 1);
			local59.oa(local427 + local430 >> 1, 0, local433 + local436 >> 1);
		} else {
			local59 = local59.method7229((byte) 3, local11, true);
			local59.R(local430 - local427 >> 1, 128, local436 - local433 >> 1);
			local59.oa(local430 + local427 >> 1, 0, local436 + local433 >> 1);
			local59.method7235(arg7, local438);
		}
		if (arg8 != 0) {
			local59.MA(arg8);
		}
		if (arg4 != 0) {
			local59.W(arg4);
		}
		if (arg3 != 0) {
			local59.oa(0, arg3, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!r;JZ)V")
	public static void method7951(@OriginalArg(0) Class45 arg0, @OriginalArg(1) long arg1) {
		Static519.anInt8370 = 0;
		Static218.anInt3901 = Static440.anInt7351;
		Static262.anInt4615 = 0;
		Static440.anInt7351 = 0;
		@Pc(21) long local21 = Static158.method2936();
		for (@Pc(26) Class41_Sub9 local26 = (Class41_Sub9) Static361.aClass178_20.method4168(); local26 != null; local26 = (Class41_Sub9) Static361.aClass178_20.method4165()) {
			if (local26.method7727(arg0, arg1)) {
				Static519.anInt8370++;
			}
		}
		if (Static445.aBoolean563 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static361.aClass178_20.method4169() + ", running: " + Static519.anInt8370);
			System.out.println("Emitters: " + Static262.anInt4615 + " Particles: " + Static440.anInt7351 + ". Time taken: " + (Static158.method2936() - local21) + "ms");
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7952(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(aCharArray19[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)Lclient!we;")
	public static Class359 method7954(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static413.aClass359Array1[arg0] : null;
	}
}
