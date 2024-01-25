import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Ljava/lang/Class;")
	private static Class aClass20;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_98 = new Class286(53, 2);

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_15 = new Class206(7, 3);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!ha;ILclient!ka;ILclient!js;IIIIIII)Lclient!ka;")
	public static Class157 method7836(@OriginalArg(1) Class67 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class157 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg2 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg4 != null) {
			local12 = arg4.method8967() | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(46) long local46 = (long) ((arg7 << 24) + (arg10 << 16) + arg8) + ((long) arg6 << 32) + ((long) arg9 << 48);
		@Pc(48) Class338 local48 = Static595.aClass338_57;
		@Pc(56) Class157 local56;
		synchronized (Static595.aClass338_57) {
			local56 = (Class157) Static595.aClass338_57.method8049(local46);
		}
		if (local56 == null || arg0.method7660(local56.ua(), local12) != 0) {
			if (local56 != null) {
				local12 = arg0.method7671(local12, local56.ua());
			}
			@Pc(111) byte local111;
			if (arg8 == 1) {
				local111 = 9;
			} else if (arg8 == 2) {
				local111 = 12;
			} else if (arg8 == 3) {
				local111 = 15;
			} else if (arg8 == 4) {
				local111 = 18;
			} else {
				local111 = 21;
			}
			@Pc(140) int[] local140 = new int[] { 64, 96, 128 };
			@Pc(158) Class178 local158 = new Class178(local111 * 3 + 1, -local111 + local111 * 3 * 2, 0);
			@Pc(165) int local165 = local158.method4282(0, 0, (byte) 108, 0);
			@Pc(169) int[][] local169 = new int[3][local111];
			@Pc(177) int local177;
			@Pc(181) int local181;
			@Pc(183) int local183;
			@Pc(207) int local207;
			for (@Pc(171) int local171 = 0; local171 < 3; local171++) {
				local177 = local140[local171];
				local181 = local140[local171];
				for (local183 = 0; local183 < local111; local183++) {
					@Pc(191) int local191 = (local183 << 14) / local111;
					@Pc(199) int local199 = local177 * Class3_Sub2_Sub21.anIntArray358[local191] >> 14;
					local207 = Class3_Sub2_Sub21.anIntArray356[local191] * local181 >> 14;
					local169[local171][local183] = local158.method4282(local207, 0, (byte) 107, local199);
				}
			}
			for (local177 = 0; local177 < 3; local177++) {
				local181 = (local177 * 256 + 128) / 3;
				local183 = 256 - local181;
				@Pc(262) byte local262 = (byte) (arg7 * local181 + local183 * arg10 >> 8);
				@Pc(307) short local307 = (short) (((arg6 & 0x380) * local183 + local181 * (arg9 & 0x380) & 0x38000) + (local183 * (arg6 & 0xFC00) + (arg9 & 0xFC00) * local181 & 0xFC0000) + (local181 * (arg9 & 0x7F) + (arg6 & 0x7F) * local183 & 0x7F00) >> 8);
				for (local207 = 0; local207 < local111; local207++) {
					if (local177 == 0) {
						local158.method4274((short) -1, (byte) 1, local165, (byte) -1, local169[0][local207], local169[0][(local207 + 1) % local111], local262, local307);
					} else {
						local158.method4274((short) -1, (byte) 1, local169[local177 - 1][local207], (byte) -1, local169[local177][(local207 + 1) % local111], local169[local177 - 1][(local207 + 1) % local111], local262, local307);
						local158.method4274((short) -1, (byte) 1, local169[local177 - 1][local207], (byte) -1, local169[local177][local207], local169[local177][(local207 + 1) % local111], local262, local307);
					}
				}
			}
			local56 = arg0.method7653(local158, local12, Static545.anInt7064, 64, 768);
			@Pc(434) Class338 local434 = Static595.aClass338_57;
			synchronized (Static595.aClass338_57) {
				Static595.aClass338_57.method8044(local46, local56);
			}
		}
		@Pc(450) int local450 = arg2.V();
		@Pc(453) int local453 = arg2.RA();
		@Pc(456) int local456 = arg2.HA();
		@Pc(459) int local459 = arg2.G();
		if (arg4 == null) {
			local56 = local56.method5211((byte) 3, local12, true);
			local56.O(local453 - local450 >> 1, 128, local459 - local456 >> 1);
			local56.H(local453 + local450 >> 1, 0, local456 + local459 >> 1);
		} else {
			local56 = local56.method5211((byte) 3, local12, true);
			local56.O(local453 - local450 >> 1, 128, local459 - local456 >> 1);
			local56.H(local450 + local453 >> 1, 0, local456 + local459 >> 1);
			arg4.method8954(local56);
		}
		if (arg11 != 0) {
			local56.FA(arg11);
		}
		if (arg1 != 0) {
			local56.VA(arg1);
		}
		if (arg5 != 0) {
			local56.H(0, arg5, 0);
		}
		return local56;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()V")
	public static void method7837() {
		for (@Pc(1) int local1 = 0; local1 < Static254.anInt4739; local1++) {
			if (!Static432.aBooleanArray18[local1]) {
				@Pc(10) Class246 local10 = Static458.aClass246Array1[local1];
				@Pc(13) Class3_Sub16 local13 = local10.aClass3_Sub16_3;
				@Pc(16) int local16 = local10.anInt7230;
				@Pc(22) int local22 = local13.method6324() - Static198.anInt3490;
				@Pc(30) int local30 = (local22 * 2 >> Static394.anInt7067) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6323() - local22 >> Static394.anInt7067;
				@Pc(53) int local53 = local13.method6320() - local22 >> Static394.anInt7067;
				@Pc(61) int local61 = local13.method6320() + local22 >> Static394.anInt7067;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static164.anInt3059) {
					local61 = Static164.anInt3059 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray123[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static509.anInt8656) {
						local108 = Static509.anInt8656 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class19_Sub1_Sub3 local144 = Static89.method1199(local16, local125, local78, aClass20 == null ? (aClass20 = Class328.a("qfa")) : aClass20);
						if (local144 != null && local144.aByte140 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte140 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray123[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray123[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray123[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray123[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static432.aBooleanArray18[local1] = true;
				Static639.aClass313Array2[local16].method9097(local13, local37);
			}
		}
	}
}
