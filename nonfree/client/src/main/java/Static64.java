import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Ljava/lang/Class;")
	private static Class aClass5;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!mj;")
	public static Class238 aClass238_1 = null;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIILclient!oe;IILclient!ha;IILclient!ka;II)Lclient!ka;")
	public static Class43 method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class264 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class100 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class43 arg11, @OriginalArg(13) int arg12) {
		if (arg11 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg5 != null) {
			local12 = arg5.method6131(false, -1, arg0) | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(50) long local50 = ((long) arg12 << 32) + (long) ((arg10 << 24) + arg9 + (arg1 << 16)) + ((long) arg3 << 48);
		@Pc(52) Class168 local52 = Static630.aClass168_93;
		@Pc(60) Class43 local60;
		synchronized (Static630.aClass168_93) {
			local60 = (Class43) Static630.aClass168_93.method3860(local50);
		}
		if (local60 == null || arg8.method8628(local60.ua(), local12) != 0) {
			if (local60 != null) {
				local12 = arg8.method8665(local12, local60.ua());
			}
			@Pc(93) byte local93;
			if (arg9 == 1) {
				local93 = 9;
			} else if (arg9 == 2) {
				local93 = 12;
			} else if (arg9 == 3) {
				local93 = 15;
			} else if (arg9 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(137) int[] local137 = new int[] { 64, 96, 128 };
			@Pc(156) Class197 local156 = new Class197(local93 * 3 + 1, local93 * 2 * 3 + -local93, 0);
			@Pc(163) int local163 = local156.method4599(0, 0, 0);
			@Pc(167) int[][] local167 = new int[3][local93];
			@Pc(175) int local175;
			@Pc(179) int local179;
			@Pc(181) int local181;
			@Pc(205) int local205;
			for (@Pc(169) int local169 = 0; local169 < 3; local169++) {
				local175 = local137[local169];
				local179 = local137[local169];
				for (local181 = 0; local181 < local93; local181++) {
					@Pc(189) int local189 = (local181 << 14) / local93;
					@Pc(197) int local197 = Class42.anIntArray51[local189] * local175 >> 14;
					local205 = Class42.anIntArray52[local189] * local179 >> 14;
					local167[local169][local181] = local156.method4599(0, local205, local197);
				}
			}
			for (local175 = 0; local175 < 3; local175++) {
				local179 = (local175 * 256 + 128) / 3;
				local181 = 256 - local179;
				@Pc(256) byte local256 = (byte) (local181 * arg1 + arg10 * local179 >> 8);
				@Pc(301) short local301 = (short) ((local179 * (arg3 & 0x7F) + local181 * (arg12 & 0x7F) & 0x7F00) + (local179 * (arg3 & 0xFC00) + local181 * (arg12 & 0xFC00) & 0xFC0000) + ((arg12 & 0x380) * local181 + local179 * (arg3 & 0x380) & 0x38000) >> 8);
				for (local205 = 0; local205 < local93; local205++) {
					if (local175 == 0) {
						local156.method4608((byte) -1, local163, local256, (byte) 1, (short) -1, local167[0][(local205 + 1) % local93], local301, local167[0][local205]);
					} else {
						local156.method4608((byte) -1, local167[local175 - 1][local205], local256, (byte) 1, (short) -1, local167[local175 - 1][(local205 + 1) % local93], local301, local167[local175][(local205 + 1) % local93]);
						local156.method4608((byte) -1, local167[local175 - 1][local205], local256, (byte) 1, (short) -1, local167[local175][(local205 + 1) % local93], local301, local167[local175][local205]);
					}
				}
			}
			local60 = arg8.method8588(local156, local12, Static579.anInt9037, 64, 768);
			@Pc(432) Class168 local432 = Static630.aClass168_93;
			synchronized (Static630.aClass168_93) {
				Static630.aClass168_93.method3853(local50, local60);
			}
		}
		@Pc(448) int local448 = arg11.V();
		@Pc(451) int local451 = arg11.RA();
		@Pc(454) int local454 = arg11.HA();
		@Pc(464) int local464 = arg11.G();
		@Pc(466) Class5_Sub1_Sub21 local466 = null;
		if (arg5 != null) {
			@Pc(473) int local473 = arg5.anIntArray423[arg0];
			local466 = Static315.aClass14_1.method221(local473 >> 16);
			arg0 = local473 & 0xFFFF;
		}
		if (local466 == null) {
			local60 = local60.method8840((byte) 3, local12, true);
			local60.O(local451 - local448 >> 1, 128, local464 - local454 >> 1);
			local60.H(local448 + local451 >> 1, 0, local464 + local454 >> 1);
		} else {
			local60 = local60.method8840((byte) 3, local12, true);
			local60.O(local451 - local448 >> 1, 128, local464 - local454 >> 1);
			local60.H(local448 + local451 >> 1, 0, local464 + local454 >> 1);
			local60.method8851(arg0, local466);
		}
		if (arg7 != 0) {
			local60.FA(arg7);
		}
		if (arg6 != 0) {
			local60.VA(arg6);
		}
		if (arg4 != 0) {
			local60.H(0, arg4, 0);
		}
		return local60;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method1080() {
		if (Static681.aClass349_6.aBoolean602) {
			Static21.anInt299 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = (aClass5 == null ? (aClass5 = Class56.a("java.lang.Runtime")) : aClass5).getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Static21.anInt299 = (int) (local39 / 1048576L) + 1;
					return;
				} catch (@Pc(49) Throwable local49) {
					return;
				}
			}
		} catch (@Pc(51) Exception local51) {
			return;
		}
	}
}
