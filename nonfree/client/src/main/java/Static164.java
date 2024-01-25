import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_47 = new Class186(28, 5);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[II[I)V")
	public static void method2685(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) int local34 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg2; local55++) {
			if (arg1[local55] < local20 + (local55 & local53)) {
				@Pc(75) int local75 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16] = local75;
				@Pc(89) int local89 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16++] = local89;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg3[arg2] = arg3[local16];
		arg3[local16] = local34;
		method2685(arg0, arg1, local16 - 1, arg3);
		method2685(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ia;II)V")
	public static void method2687(@OriginalArg(0) Class6_Sub15_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method2604(1) == 1;
		if (local15) {
			Static56.anIntArray98[Static7.anInt156++] = arg1;
		}
		@Pc(30) int local30 = arg0.method2604(2);
		@Pc(34) Class3_Sub3_Sub6_Sub1 local34 = Static355.aClass3_Sub3_Sub6_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(143) int local143;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if (local30 == 1) {
				local143 = arg0.method2604(3);
				local148 = local34.anIntArray582[0];
				local153 = local34.anIntArray583[0];
				if (local143 == 0) {
					local148--;
					local153--;
				} else if (local143 == 1) {
					local153--;
				} else if (local143 == 2) {
					local153--;
					local148++;
				} else if (local143 == 3) {
					local148--;
				} else if (local143 == 4) {
					local148++;
				} else if (local143 == 5) {
					local148--;
					local153++;
				} else if (local143 == 6) {
					local153++;
				} else if (local143 == 7) {
					local148++;
					local153++;
				}
				if (local15) {
					local34.anInt5521 = local148;
					local34.aBoolean378 = true;
					local34.anInt5531 = local153;
				} else {
					local34.method4686(local153, local148, Static49.aByteArray15[arg1]);
				}
			} else if (local30 == 2) {
				local143 = arg0.method2604(4);
				local148 = local34.anIntArray582[0];
				local153 = local34.anIntArray583[0];
				if (local143 == 0) {
					local148 -= 2;
					local153 -= 2;
				} else if (local143 == 1) {
					local153 -= 2;
					local148--;
				} else if (local143 == 2) {
					local153 -= 2;
				} else if (local143 == 3) {
					local153 -= 2;
					local148++;
				} else if (local143 == 4) {
					local153 -= 2;
					local148 += 2;
				} else if (local143 == 5) {
					local148 -= 2;
					local153--;
				} else if (local143 == 6) {
					local148 += 2;
					local153--;
				} else if (local143 == 7) {
					local148 -= 2;
				} else if (local143 == 8) {
					local148 += 2;
				} else if (local143 == 9) {
					local148 -= 2;
					local153++;
				} else if (local143 == 10) {
					local148 += 2;
					local153++;
				} else if (local143 == 11) {
					local148 -= 2;
					local153 += 2;
				} else if (local143 == 12) {
					local148--;
					local153 += 2;
				} else if (local143 == 13) {
					local153 += 2;
				} else if (local143 == 14) {
					local153 += 2;
					local148++;
				} else if (local143 == 15) {
					local153 += 2;
					local148 += 2;
				}
				if (local15) {
					local34.anInt5521 = local148;
					local34.anInt5531 = local153;
					local34.aBoolean378 = true;
				} else {
					local34.method4686(local153, local148, Static49.aByteArray15[arg1]);
				}
			} else {
				local143 = arg0.method2604(1);
				@Pc(419) int local419;
				@Pc(429) int local429;
				@Pc(440) int local440;
				@Pc(447) int local447;
				if (local143 == 0) {
					local148 = arg0.method2604(12);
					local153 = local148 >> 10;
					local419 = local148 >> 5 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local429 = local148 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local440 = local419 + local34.anIntArray582[0];
					local447 = local429 + local34.anIntArray583[0];
					if (local15) {
						local34.aBoolean378 = true;
						local34.anInt5531 = local447;
						local34.anInt5521 = local440;
					} else {
						local34.method4686(local447, local440, Static49.aByteArray15[arg1]);
					}
					local34.aByte93 = (byte) (local153 + local34.aByte93 & 0x3);
					if (Static251.anInt4268 == arg1) {
						Static4.anInt30 = local34.aByte93;
					}
				} else {
					local148 = arg0.method2604(30);
					local153 = local148 >> 28;
					local419 = local148 >> 14 & 0x3FFF;
					local429 = local148 & 0x3FFF;
					local440 = (local34.anIntArray582[0] + Static206.anInt3592 + local419 & 0x3FFF) - Static206.anInt3592;
					local447 = (local429 + local34.anIntArray583[0] + Static99.anInt1814 & 0x3FFF) - Static99.anInt1814;
					if (local15) {
						local34.aBoolean378 = true;
						local34.anInt5531 = local447;
						local34.anInt5521 = local440;
					} else {
						local34.method4686(local447, local440, Static49.aByteArray15[arg1]);
					}
					local34.aByte93 = (byte) (local34.aByte93 + local153 & 0x3);
					if (arg1 == Static251.anInt4268) {
						Static4.anInt30 = local34.aByte93;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean378 = false;
		} else if (arg1 == Static251.anInt4268) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(58) Class2 local58 = Static337.aClass2Array1[arg1] = new Class2();
			local58.anInt5 = (local34.aByte93 << 28) - (-(local34.anIntArray582[0] + Static206.anInt3592 >> 6 << 14) - (Static99.anInt1814 + local34.anIntArray583[0] >> 6));
			if (local34.anInt5530 == -1) {
				local58.anInt7 = local34.aClass191_7.method4332();
			} else {
				local58.anInt7 = local34.anInt5530;
			}
			local58.anInt6 = local34.anInt6690;
			local58.aBoolean1 = local34.aBoolean377;
			if (local34.anInt5528 > 0) {
				Static248.method3823(local34);
			}
			Static355.aClass3_Sub3_Sub6_Sub1Array1[arg1] = null;
			if (arg0.method2604(1) != 0) {
				Static265.method4064(arg0, arg1);
			}
		}
	}
}
