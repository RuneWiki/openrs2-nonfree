import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_113 = new Class180(3, 1);

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "[Lclient!hr;")
	public static final Class142[] aClass142Array1 = new Class142[8];

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "[I")
	public static final int[] anIntArray444 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_114 = new Class180(9, 0);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IILclient!ka;ILclient!vq;IILclient!ha;IIZIII)Lclient!ka;")
	public static Class95 method4565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class372 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class13 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg2 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg4 != null) {
			local11 = arg4.method8975(false, -1, arg6) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg5 << 48) + (long) (arg12 + (arg8 << 16) + (arg11 << 24)) + ((long) arg10 << 32);
		@Pc(51) Class165 local51 = Static312.aClass165_36;
		@Pc(68) Class95 local68;
		synchronized (Static312.aClass165_36) {
			local68 = (Class95) Static312.aClass165_36.method4389(local49);
		}
		if (local68 == null || arg7.method8495(local68.ua(), local11) != 0) {
			if (local68 != null) {
				local11 = arg7.method8478(local11, local68.ua());
			}
			@Pc(98) byte local98;
			if (arg12 == 1) {
				local98 = 9;
			} else if (arg12 == 2) {
				local98 = 12;
			} else if (arg12 == 3) {
				local98 = 15;
			} else if (arg12 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(144) int[] local144 = new int[] { 64, 96, 128 };
			@Pc(161) Class117 local161 = new Class117(local98 * 3 + 1, local98 * 3 * 2 - local98, 0);
			@Pc(168) int local168 = local161.method3495(0, 0, 0);
			@Pc(172) int[][] local172 = new int[3][local98];
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(186) int local186;
			@Pc(210) int local210;
			for (@Pc(174) int local174 = 0; local174 < 3; local174++) {
				local180 = local144[local174];
				local184 = local144[local174];
				for (local186 = 0; local186 < local98; local186++) {
					@Pc(194) int local194 = (local186 << 14) / local98;
					@Pc(202) int local202 = local180 * Class3_Sub20.anIntArray206[local194] >> 14;
					local210 = local184 * Class3_Sub20.anIntArray204[local194] >> 14;
					local172[local174][local186] = local161.method3495(0, local202, local210);
				}
			}
			for (local180 = 0; local180 < 3; local180++) {
				local184 = (local180 * 256 + 128) / 3;
				local186 = 256 - local184;
				@Pc(260) byte local260 = (byte) (local186 * arg8 + local184 * arg11 >> 8);
				@Pc(305) short local305 = (short) ((local184 * (arg5 & 0x7F) + (arg10 & 0x7F) * local186 & 0x7F00) + ((arg10 & 0xFC00) * local186 + local184 * (arg5 & 0xFC00) & 0xFC0000) + (local184 * (arg5 & 0x380) + local186 * (arg10 & 0x380) & 0x38000) >> 8);
				for (local210 = 0; local210 < local98; local210++) {
					if (local180 == 0) {
						local161.method3490((byte) -1, local172[0][(local210 + 1) % local98], local305, local172[0][local210], local260, (short) -1, local168, (byte) 1);
					} else {
						local161.method3490((byte) -1, local172[local180 - 1][(local210 + 1) % local98], local305, local172[local180][(local210 + 1) % local98], local260, (short) -1, local172[local180 - 1][local210], (byte) 1);
						local161.method3490((byte) -1, local172[local180][(local210 + 1) % local98], local305, local172[local180][local210], local260, (short) -1, local172[local180 - 1][local210], (byte) 1);
					}
				}
			}
			local68 = arg7.method8489(local161, local11, Static316.anInt5278, 64, 768);
			@Pc(421) Class165 local421 = Static312.aClass165_36;
			synchronized (Static312.aClass165_36) {
				Static312.aClass165_36.method4392(local68, local49);
			}
		}
		@Pc(437) int local437 = arg2.V();
		@Pc(440) int local440 = arg2.RA();
		@Pc(443) int local443 = arg2.HA();
		@Pc(446) int local446 = arg2.G();
		@Pc(448) Class3_Sub11_Sub1 local448 = null;
		if (arg4 != null) {
			@Pc(455) int local455 = arg4.anIntArray901[arg6];
			local448 = Static243.aClass343_3.method8352(local455 >> 16);
			arg6 = local455 & 0xFFFF;
		}
		if (local448 == null) {
			local68 = local68.method5664((byte) 3, local11, true);
			local68.O(local440 - local437 >> 1, 128, local446 - local443 >> 1);
			local68.H(local440 + local437 >> 1, 0, local446 + local443 >> 1);
		} else {
			local68 = local68.method5664((byte) 3, local11, true);
			local68.O(local440 - local437 >> 1, 128, local446 - local443 >> 1);
			local68.H(local437 + local440 >> 1, 0, local446 + local443 >> 1);
			local68.method5651(arg6, local448);
		}
		if (arg1 != 0) {
			local68.FA(arg1);
		}
		if (arg9 != 0) {
			local68.VA(arg9);
		}
		if (arg3 != 0) {
			local68.H(0, arg3, 0);
		}
		return local68;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)I")
	public static int method4567() {
		if (Static678.aClass260_21 == null) {
			if (!Static43.aBoolean74 && Static150.aClass3_Sub11_Sub14_2 != null) {
				return Static150.aClass3_Sub11_Sub14_2.anInt6739;
			}
			@Pc(15) int local15 = Static22.aClass16_2.method5885();
			@Pc(19) int local19 = Static22.aClass16_2.method5887();
			@Pc(35) int local35;
			@Pc(37) int local37;
			@Pc(49) int local49;
			@Pc(244) Class3_Sub11_Sub14 local244;
			if (Static439.aBoolean510) {
				@Pc(110) Class31 local110;
				if (Static600.anInt9624 < local15 && local15 < Static368.anInt5940 + Static600.anInt9624) {
					local35 = -1;
					for (local37 = 0; local37 < Static71.anInt1334; local37++) {
						if (Static609.aBoolean752) {
							local49 = local37 * 16 + Static436.anInt6913 + 33;
							if (local19 > local49 - 13 && local49 + 3 >= local19) {
								local35 = local37;
							}
						} else {
							local49 = local37 * 16 + Static436.anInt6913 + 31;
							if (local19 > local49 - 13 && local19 <= local49 + 3) {
								local35 = local37;
							}
						}
					}
					if (local35 != -1) {
						local49 = 0;
						local110 = new Class31(Static111.aClass74_3);
						for (@Pc(115) Class3_Sub11_Sub8 local115 = (Class3_Sub11_Sub8) local110.method936(); local115 != null; local115 = (Class3_Sub11_Sub8) local110.method938()) {
							if (local35 == local49++) {
								return ((Class3_Sub11_Sub14) local115.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67).anInt6739;
							}
						}
					}
				} else if (Static142.aClass3_Sub11_Sub8_1 != null && Static451.anInt7467 < local15 && Static451.anInt7467 + Static159.anInt3122 > local15) {
					local35 = -1;
					for (local37 = 0; local37 < Static142.aClass3_Sub11_Sub8_1.anInt3796; local37++) {
						if (Static609.aBoolean752) {
							local49 = Static544.anInt8963 + local37 * 16 + 33;
							if (local19 > local49 - 13 && local19 <= local49 + 3) {
								local35 = local37;
							}
						} else {
							local49 = local37 * 16 + Static544.anInt8963 + 31;
							if (local49 - 13 < local19 && local49 + 3 >= local19) {
								local35 = local37;
							}
						}
					}
					if (local35 != -1) {
						local49 = 0;
						local110 = new Class31(Static142.aClass3_Sub11_Sub8_1.aClass74_4);
						for (local244 = (Class3_Sub11_Sub14) local110.method936(); local244 != null; local244 = (Class3_Sub11_Sub14) local110.method938()) {
							if (local35 == local49++) {
								return local244.anInt6739;
							}
						}
					}
				}
			} else if (local15 > Static600.anInt9624 && Static600.anInt9624 + Static368.anInt5940 > local15) {
				local35 = -1;
				for (local37 = 0; local37 < Static450.anInt7444; local37++) {
					if (Static609.aBoolean752) {
						local49 = Static436.anInt6913 + (-local37 + -1 + Static450.anInt7444) * 16 + 33;
						if (local49 - 13 < local19 && local49 + 3 >= local19) {
							local35 = local37;
						}
					} else {
						local49 = Static436.anInt6913 + (-local37 + -1 + Static450.anInt7444) * 16 + 31;
						if (local49 - 13 < local19 && local49 + 3 >= local19) {
							local35 = local37;
						}
					}
				}
				if (local35 != -1) {
					local49 = 0;
					@Pc(361) Class167 local361 = new Class167(Static78.aClass338_99);
					for (local244 = (Class3_Sub11_Sub14) local361.method4435(); local244 != null; local244 = (Class3_Sub11_Sub14) local361.method4437()) {
						if (local35 == local49++) {
							return local244.anInt6739;
						}
					}
				}
			}
		}
		return -1;
	}
}
