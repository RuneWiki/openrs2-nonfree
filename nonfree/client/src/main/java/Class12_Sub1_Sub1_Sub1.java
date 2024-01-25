import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class12_Sub1_Sub1_Sub1 extends Class12_Sub1_Sub1 {

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
	private int anInt5227;

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!rl", name = "K", descriptor = "Lclient!og;")
	private Class12_Sub6 aClass12_Sub6_1;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
	private int anInt5226;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!og;IIIIIIIIIIIZ)V")
	public Class12_Sub1_Sub1_Sub1(@OriginalArg(0) Class12_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass12_Sub6_1 = arg0;
		super.anInt5223 = arg1 << Static350.anInt5899;
		super.anInt5218 = arg2 << Static350.anInt5899;
		super.anInt5221 = arg3 << Static350.anInt5899;
		super.anInt5220 = arg9;
		this.aShort71 = this.aShort73 = (short) arg8;
		super.anInt5222 = arg10;
		super.anInt5225 = arg11;
		this.aShort74 = (short) arg4;
		this.aShort70 = (short) arg5;
		this.aShort72 = (short) arg6;
		this.anInt5226 = arg7;
		super.aByte67 = this.aClass12_Sub6_1.aClass241_1.aByte78;
		this.method4671();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(J)V")
	public void method4668(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt5223 >> 19;
		@Pc(9) int local9 = super.anInt5221 >> 19;
		@Pc(14) int local14 = super.anInt5218 >> Static350.anInt5899;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static44.anInt791 || local9 < 0 || local9 >= Static103.anInt2050) {
			this.method4670();
			return;
		}
		@Pc(36) Class12_Sub4 local36 = this.aClass12_Sub6_1.aClass12_Sub4_5;
		@Pc(40) Class242 local40 = this.aClass12_Sub6_1.aClass242_1;
		@Pc(42) Class7[] local42 = Static337.aClass7Array3;
		@Pc(50) int local50 = local42[local36.anInt2170].method5648(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt2170 < Static164.anInt2901 - 1) {
			local66 = local42[local36.anInt2170 + 1].method5648(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean493) {
			if (local40.anInt6318 == -1 && local14 > local50) {
				this.method4670();
				return;
			}
			if (local40.anInt6318 >= 0 && local14 > local42[local40.anInt6318].method5648(local4, local9)) {
				this.method4670();
				return;
			}
			if (local40.anInt6308 == -1 && local14 < local66) {
				this.method4670();
				return;
			}
			if (local40.anInt6308 >= 0 && local14 < local42[local40.anInt6308 + 1].method5648(local4, local9)) {
				this.method4670();
				return;
			}
		}
		if (local4 >= local36.anInt2171 && local4 <= local36.anInt2169 && local9 >= local36.anInt2167 && local9 <= local36.anInt2168 && local14 <= local50 && local14 >= local66) {
			local36.aClass47_2.aClass32_1.method528(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static164.anInt2901 - 1; local152 > 0 && local14 > local42[local152].method5648(local4, local9); local152--) {
		}
		if (local152 == Static164.anInt2901 - 1 && local42[local152].method5648(local4, local9) - local14 > 1024) {
			this.method4670();
			return;
		}
		@Pc(190) Class48 local190 = Static69.aClass48ArrayArrayArray1[local152][local4][local9];
		if (local190 == null) {
			if (local152 == 0) {
				local190 = Static69.aClass48ArrayArrayArray1[0][local4][local9] = new Class48(0, local4, local9);
			}
			@Pc(222) boolean local222 = Static69.aClass48ArrayArrayArray1[0][local4][local9].aClass48_1 != null;
			if (local152 == 3 && local222) {
				this.method4670();
				return;
			}
			for (@Pc(232) int local232 = 1; local232 <= local152; local232++) {
				if (Static69.aClass48ArrayArrayArray1[local232][local4][local9] == null) {
					local190 = Static69.aClass48ArrayArrayArray1[local232][local4][local9] = new Class48(local232, local4, local9);
					if (local222) {
						local190.aByte14++;
					}
				}
			}
		}
		if (local190.aClass47_1 == null) {
			local190.aClass47_1 = new Class47();
			local190.aByte11 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte11 != (byte) (arg0 & 0xFFL)) {
			local190.aClass47_1 = new Class47();
			local190.aByte11 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass47_1.aClass32_1.method528(this);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!og;IIIIIIIIIIIZ)V")
	public void method4669(@OriginalArg(0) Class12_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass12_Sub6_1 = arg0;
		super.anInt5223 = arg1 << Static350.anInt5899;
		super.anInt5218 = arg2 << Static350.anInt5899;
		super.anInt5221 = arg3 << Static350.anInt5899;
		super.anInt5220 = arg9;
		this.aShort71 = this.aShort73 = (short) arg8;
		super.anInt5222 = arg10;
		super.anInt5225 = arg11;
		this.aShort74 = (short) arg4;
		this.aShort70 = (short) arg5;
		this.aShort72 = (short) arg6;
		this.anInt5226 = arg7;
		super.aByte67 = this.aClass12_Sub6_1.aClass241_1.aByte78;
		this.method4671();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	private void method4670() {
		this.aClass12_Sub6_1.aClass12_Sub4_5.aClass12_Sub1_Sub1_Sub1Array1[this.aShort75] = null;
		Static381.aClass12_Sub1_Sub1_Sub1Array2[Static163.anInt2727] = this;
		Static163.anInt2727 = Static163.anInt2727 + 1 & 0x3FF;
		this.method5277();
		this.method4661();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "()V")
	private void method4671() {
		@Pc(4) int local4 = this.aClass12_Sub6_1.aClass12_Sub4_5.anInt2164;
		if (this.aClass12_Sub6_1.aClass12_Sub4_5.aClass12_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass12_Sub6_1.aClass12_Sub4_5.aClass12_Sub1_Sub1_Sub1Array1[local4].method4670();
		}
		this.aClass12_Sub6_1.aClass12_Sub4_5.aClass12_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort75 = (short) this.aClass12_Sub6_1.aClass12_Sub4_5.anInt2164;
		this.aClass12_Sub6_1.aClass12_Sub4_5.anInt2164 = local4 + 1 & 0x1FFF;
		this.aClass12_Sub6_1.aClass22_6.method286(this);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI)V")
	public void method4672(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort73 = (short) (this.aShort73 - arg1);
		if (this.aShort73 <= 0) {
			this.method4670();
			return;
		}
		@Pc(17) int local17 = super.anInt5223 >> Static350.anInt5899;
		@Pc(22) int local22 = super.anInt5218 >> Static350.anInt5899;
		@Pc(27) int local27 = super.anInt5221 >> Static350.anInt5899;
		@Pc(31) Class12_Sub4 local31 = this.aClass12_Sub6_1.aClass12_Sub4_5;
		@Pc(35) Class242 local35 = this.aClass12_Sub6_1.aClass242_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6329 != 0) {
			if (this.aShort71 - this.aShort73 <= local35.anInt6299) {
				local65 = (super.anInt5220 >> 8 & 0xFF00) + (this.anInt5227 >> 16 & 0xFF) + local35.anInt6328 * arg1;
				local82 = (super.anInt5220 & 0xFF00) + (this.anInt5227 >> 8 & 0xFF) + local35.anInt6312 * arg1;
				local99 = ((super.anInt5220 & 0xFF) << 8) + (this.anInt5227 & 0xFF) + local35.anInt6348 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt5220 &= 0xFF000000;
				super.anInt5220 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5227 &= 0xFF000000;
				this.anInt5227 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort71 - this.aShort73 <= local35.anInt6341) {
				local65 = (super.anInt5220 >> 16 & 0xFF00) + (this.anInt5227 >> 24 & 0xFF) + local35.anInt6347 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5220 &= 0xFFFFFF;
				super.anInt5220 |= (local65 & 0xFF00) << 16;
				this.anInt5227 &= 0xFFFFFF;
				this.anInt5227 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6310 != -1 && this.aShort71 - this.aShort73 <= local35.anInt6306) {
			this.anInt5226 += local35.anInt6343 * arg1;
		}
		if (local35.anInt6345 != -1 && this.aShort71 - this.aShort73 <= local35.anInt6314) {
			super.anInt5222 += local35.anInt6316 * arg1;
		}
		local65 = this.aShort74;
		local82 = this.aShort70;
		local99 = this.aShort72;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6322 == 1) {
			local313 = local17 - this.aClass12_Sub6_1.anInt4472;
			local319 = local22 - this.aClass12_Sub6_1.anInt4455;
			local325 = local27 - this.aClass12_Sub6_1.anInt4461;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6321 * local340 * arg1;
			this.anInt5226 = (int) ((long) this.anInt5226 - ((long) this.anInt5226 * local348 >> 18));
		} else if (local35.anInt6322 == 2) {
			local313 = local17 - this.aClass12_Sub6_1.anInt4472;
			local319 = local22 - this.aClass12_Sub6_1.anInt4455;
			local325 = local27 - this.aClass12_Sub6_1.anInt4461;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6321 * local340 * arg1;
			this.anInt5226 = (int) ((long) this.anInt5226 - ((long) this.anInt5226 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray688 != null) {
			@Pc(426) Class3 local426 = local31.aClass138_13.aClass3_137;
			for (@Pc(429) Class3 local429 = local426.aClass3_243; local429 != local426; local429 = local429.aClass3_243) {
				@Pc(433) Class3_Sub7_Sub11 local433 = (Class3_Sub7_Sub11) local429;
				@Pc(436) Class250 local436 = local433.aClass250_1;
				if (local436.anInt6442 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray688.length; local444++) {
						if (local35.anIntArray688[local444] == local436.anInt6451) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4669;
						@Pc(473) int local473 = local22 - local433.anInt4662;
						local478 = local27 - local433.anInt4665;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong239) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4668 + local473 * local436.anInt6458 + local478 * local433.anInt4666) * 65535L / (long) (local436.anInt6445 * local501);
							if (local529 >= (long) local436.anInt6453) {
								local537 = 0;
								if (local436.anInt6444 == 1) {
									local537 = (local501 >> 4) * local436.anInt6443;
								} else if (local436.anInt6444 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6443;
								}
								if (local436.anInt6450 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6445;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6445;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6445;
									if (local436.anInt6448 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5223 += local643 * arg1 >> 15;
										super.anInt5218 += local652 * arg1 >> 15;
										super.anInt5221 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6448 == 0) {
									local65 += (local433.anInt4668 - local537) * arg1;
									local82 += (local436.anInt6458 - local537) * arg1;
									local99 += (local433.anInt4666 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5223 += (local433.anInt4668 - local537) * arg1;
									super.anInt5218 += (local436.anInt6458 - local537) * arg1;
									super.anInt5221 += (local433.anInt4666 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray687 != null) {
			for (local313 = 0; local313 < local35.anIntArray687.length; local313++) {
				@Pc(743) Class3_Sub7_Sub11 local743 = (Class3_Sub7_Sub11) Static247.aClass58_1.method1158((long) local35.anIntArray687[local313]);
				while (local743 != null) {
					@Pc(747) Class250 local747 = local743.aClass250_1;
					local340 = local17 - local743.anInt4669;
					@Pc(757) int local757 = local22 - local743.anInt4662;
					local444 = local27 - local743.anInt4665;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong239) {
						local743 = (Class3_Sub7_Sub11) Static247.aClass58_1.method1159();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4668 + local757 * local747.anInt6458 + local444 * local743.anInt4666) * 65535L / (long) (local747.anInt6445 * local478);
						if (local491 < (long) local747.anInt6453) {
							local743 = (Class3_Sub7_Sub11) Static247.aClass58_1.method1159();
						} else {
							local501 = 0;
							if (local747.anInt6444 == 1) {
								local501 = (local478 >> 4) * local747.anInt6443;
							} else if (local747.anInt6444 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6443;
							}
							if (local747.anInt6450 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6445;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6445;
								local537 = (local444 << 15) / local478 * local747.anInt6445;
								if (local747.anInt6448 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5223 += local939 * arg1 >> 15;
									super.anInt5218 += local948 * arg1 >> 15;
									super.anInt5221 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6448 == 0) {
								local65 += (local743.anInt4668 - local501) * arg1;
								local82 += (local747.anInt6458 - local501) * arg1;
								local99 += (local743.anInt4666 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5223 += (local743.anInt4668 - local501) * arg1;
								super.anInt5218 += (local747.anInt6458 - local501) * arg1;
								super.anInt5221 += (local743.anInt4666 - local501) * arg1;
							}
							local743 = (Class3_Sub7_Sub11) Static247.aClass58_1.method1159();
						}
					}
				}
			}
		}
		if (local35.anIntArray689 != null) {
			if (local35.anIntArray690 == null) {
				local35.anIntArray690 = new int[local35.anIntArray689.length];
				for (local313 = 0; local313 < local35.anIntArray689.length; local313++) {
					Static245.method4024(local35.anIntArray689[local313]);
					local35.anIntArray690[local313] = ((Class3_Sub28) Static80.aClass44_14.method942((long) local35.anIntArray689[local313])).anInt3982;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray690.length; local313++) {
				@Pc(1082) Class250 local1082 = Static366.aClass250Array2[local35.anIntArray690[local313]];
				if (local1082.anInt6448 == 0) {
					local65 += local1082.anInt6447 * arg1;
					local82 += local1082.anInt6458 * arg1;
					local99 += local1082.anInt6449 * arg1;
					local303 = true;
				} else {
					super.anInt5223 += local1082.anInt6447 * arg1;
					super.anInt5218 += local1082.anInt6458 * arg1;
					super.anInt5221 += local1082.anInt6449 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort74 = (short) local65;
					this.aShort70 = (short) local82;
					this.aShort72 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5226 <<= 0x1;
			}
		}
		super.anInt5223 = (int) ((long) super.anInt5223 + ((long) this.aShort74 * (long) this.anInt5226 >> 23) * (long) arg1);
		super.anInt5218 = (int) ((long) super.anInt5218 + ((long) this.aShort70 * (long) this.anInt5226 >> 23) * (long) arg1);
		super.anInt5221 = (int) ((long) super.anInt5221 + ((long) this.aShort72 * (long) this.anInt5226 >> 23) * (long) arg1);
	}
}
