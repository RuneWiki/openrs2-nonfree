import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class41_Sub2_Sub1_Sub1 extends Class41_Sub2_Sub1 {

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
	private int anInt6316;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "Lclient!wg;")
	private Class41_Sub7 aClass41_Sub7_1;

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
	private int anInt6315;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!wg;IIIIIIIIIIIZ)V")
	public Class41_Sub2_Sub1_Sub1(@OriginalArg(0) Class41_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass41_Sub7_1 = arg0;
		super.anInt6311 = arg1 << Static307.anInt5745;
		super.anInt6307 = arg2 << Static307.anInt5745;
		super.anInt6308 = arg3 << Static307.anInt5745;
		super.anInt6314 = arg9;
		this.aShort93 = this.aShort92 = (short) arg8;
		super.anInt6312 = arg10;
		super.anInt6309 = arg11;
		this.aShort96 = (short) arg4;
		this.aShort95 = (short) arg5;
		this.aShort94 = (short) arg6;
		this.anInt6315 = arg7;
		super.aByte78 = this.aClass41_Sub7_1.aClass197_2.aByte63;
		this.method5484();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
	private void method5484() {
		@Pc(4) int local4 = this.aClass41_Sub7_1.aClass41_Sub3_7.anInt2640;
		if (this.aClass41_Sub7_1.aClass41_Sub3_7.aClass41_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass41_Sub7_1.aClass41_Sub3_7.aClass41_Sub2_Sub1_Sub1Array1[local4].method5488();
		}
		this.aClass41_Sub7_1.aClass41_Sub3_7.aClass41_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort97 = (short) this.aClass41_Sub7_1.aClass41_Sub3_7.anInt2640;
		this.aClass41_Sub7_1.aClass41_Sub3_7.anInt2640 = local4 + 1 & 0x1FFF;
		this.aClass41_Sub7_1.aClass208_10.method4664(this);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(J)V")
	public void method5485(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt6311 >> 19;
		@Pc(9) int local9 = super.anInt6308 >> 19;
		@Pc(14) int local14 = super.anInt6307 >> Static307.anInt5745;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static19.anInt329 || local9 < 0 || local9 >= Static230.anInt6113) {
			this.method5488();
			return;
		}
		@Pc(36) Class41_Sub3 local36 = this.aClass41_Sub7_1.aClass41_Sub3_7;
		@Pc(40) Class204 local40 = this.aClass41_Sub7_1.aClass204_1;
		@Pc(42) Class42[] local42 = Static229.aClass42Array3;
		@Pc(50) int local50 = local42[local36.anInt2643].method3060(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt2643 < Static337.anInt5599 - 1) {
			local66 = local42[local36.anInt2643 + 1].method3060(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean502) {
			if (local40.anInt5296 == -1 && local14 > local50) {
				this.method5488();
				return;
			}
			if (local40.anInt5296 >= 0 && local14 > local42[local40.anInt5296].method3060(local4, local9)) {
				this.method5488();
				return;
			}
			if (local40.anInt5288 == -1 && local14 < local66) {
				this.method5488();
				return;
			}
			if (local40.anInt5288 >= 0 && local14 < local42[local40.anInt5288 + 1].method3060(local4, local9)) {
				this.method5488();
				return;
			}
		}
		if (local4 >= local36.anInt2647 && local4 <= local36.anInt2642 && local9 >= local36.anInt2645 && local9 <= local36.anInt2644 && local14 <= local50 && local14 >= local66) {
			local36.aClass108_1.aClass95_1.method1838(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static337.anInt5599 - 1; local152 > 0 && local14 > local42[local152].method3060(local4, local9); local152--) {
		}
		if (local152 == Static337.anInt5599 - 1 && local42[local152].method3060(local4, local9) - local14 > 1024) {
			this.method5488();
			return;
		}
		@Pc(190) Class132 local190 = Static25.aClass132ArrayArrayArray1[local152][local4][local9];
		if (local190 == null) {
			if (local152 == 0) {
				local190 = Static25.aClass132ArrayArrayArray1[0][local4][local9] = new Class132(0, local4, local9);
			}
			@Pc(222) boolean local222 = Static25.aClass132ArrayArrayArray1[0][local4][local9].aClass132_1 != null;
			if (local152 == 3 && local222) {
				this.method5488();
				return;
			}
			for (@Pc(232) int local232 = 1; local232 <= local152; local232++) {
				if (Static25.aClass132ArrayArrayArray1[local232][local4][local9] == null) {
					local190 = Static25.aClass132ArrayArrayArray1[local232][local4][local9] = new Class132(local232, local4, local9);
					if (local222) {
						local190.aByte47++;
					}
				}
			}
		}
		if (local190.aClass108_2 == null) {
			local190.aClass108_2 = new Class108();
			local190.aByte49 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte49 != (byte) (arg0 & 0xFFL)) {
			local190.aClass108_2 = new Class108();
			local190.aByte49 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass108_2.aClass95_1.method1838(this);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)V")
	public void method5486(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort92 = (short) (this.aShort92 - arg1);
		if (this.aShort92 <= 0) {
			this.method5488();
			return;
		}
		@Pc(17) int local17 = super.anInt6311 >> Static307.anInt5745;
		@Pc(22) int local22 = super.anInt6307 >> Static307.anInt5745;
		@Pc(27) int local27 = super.anInt6308 >> Static307.anInt5745;
		@Pc(31) Class41_Sub3 local31 = this.aClass41_Sub7_1.aClass41_Sub3_7;
		@Pc(35) Class204 local35 = this.aClass41_Sub7_1.aClass204_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5329 != 0) {
			if (this.aShort93 - this.aShort92 <= local35.anInt5336) {
				local65 = (super.anInt6314 >> 8 & 0xFF00) + (this.anInt6316 >> 16 & 0xFF) + local35.anInt5328 * arg1;
				local82 = (super.anInt6314 & 0xFF00) + (this.anInt6316 >> 8 & 0xFF) + local35.anInt5314 * arg1;
				local99 = ((super.anInt6314 & 0xFF) << 8) + (this.anInt6316 & 0xFF) + local35.anInt5290 * arg1;
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
				super.anInt6314 &= 0xFF000000;
				super.anInt6314 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6316 &= 0xFF000000;
				this.anInt6316 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort93 - this.aShort92 <= local35.anInt5292) {
				local65 = (super.anInt6314 >> 16 & 0xFF00) + (this.anInt6316 >> 24 & 0xFF) + local35.anInt5310 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6314 &= 0xFFFFFF;
				super.anInt6314 |= (local65 & 0xFF00) << 16;
				this.anInt6316 &= 0xFFFFFF;
				this.anInt6316 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5319 != -1 && this.aShort93 - this.aShort92 <= local35.anInt5283) {
			this.anInt6315 += local35.anInt5291 * arg1;
		}
		if (local35.anInt5333 != -1 && this.aShort93 - this.aShort92 <= local35.anInt5298) {
			super.anInt6312 += local35.anInt5307 * arg1;
		}
		local65 = this.aShort96;
		local82 = this.aShort95;
		local99 = this.aShort94;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5334 == 1) {
			local313 = local17 - this.aClass41_Sub7_1.anInt6256;
			local319 = local22 - this.aClass41_Sub7_1.anInt6231;
			local325 = local27 - this.aClass41_Sub7_1.anInt6230;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5306 * local340 * arg1;
			this.anInt6315 = (int) ((long) this.anInt6315 - ((long) this.anInt6315 * local348 >> 18));
		} else if (local35.anInt5334 == 2) {
			local313 = local17 - this.aClass41_Sub7_1.anInt6256;
			local319 = local22 - this.aClass41_Sub7_1.anInt6231;
			local325 = local27 - this.aClass41_Sub7_1.anInt6230;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5306 * local340 * arg1;
			this.anInt6315 = (int) ((long) this.anInt6315 - ((long) this.anInt6315 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray625 != null) {
			@Pc(426) Class1 local426 = local31.aClass17_26.aClass1_15;
			for (@Pc(429) Class1 local429 = local426.aClass1_243; local429 != local426; local429 = local429.aClass1_243) {
				@Pc(433) Class1_Sub6_Sub12 local433 = (Class1_Sub6_Sub12) local429;
				@Pc(436) Class91 local436 = local433.aClass91_1;
				if (local436.anInt2091 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray625.length; local444++) {
						if (local35.anIntArray625[local444] == local436.anInt2093) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4691;
						@Pc(473) int local473 = local22 - local433.anInt4698;
						local478 = local27 - local433.anInt4692;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong64) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4696 + local473 * local436.anInt2094 + local478 * local433.anInt4697) * 65535L / (long) (local436.anInt2090 * local501);
							if (local529 >= (long) local436.anInt2105) {
								local537 = 0;
								if (local436.anInt2099 == 1) {
									local537 = (local501 >> 4) * local436.anInt2101;
								} else if (local436.anInt2099 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt2101;
								}
								if (local436.anInt2097 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt2090;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt2090;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt2090;
									if (local436.anInt2088 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6311 += local643 * arg1 >> 15;
										super.anInt6307 += local652 * arg1 >> 15;
										super.anInt6308 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt2088 == 0) {
									local65 += (local433.anInt4696 - local537) * arg1;
									local82 += (local436.anInt2094 - local537) * arg1;
									local99 += (local433.anInt4697 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6311 += (local433.anInt4696 - local537) * arg1;
									super.anInt6307 += (local436.anInt2094 - local537) * arg1;
									super.anInt6308 += (local433.anInt4697 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray624 != null) {
			for (local313 = 0; local313 < local35.anIntArray624.length; local313++) {
				@Pc(743) Class1_Sub6_Sub12 local743 = (Class1_Sub6_Sub12) Static68.aClass89_1.method1696((long) local35.anIntArray624[local313]);
				while (local743 != null) {
					@Pc(747) Class91 local747 = local743.aClass91_1;
					local340 = local17 - local743.anInt4691;
					@Pc(757) int local757 = local22 - local743.anInt4698;
					local444 = local27 - local743.anInt4692;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong64) {
						local743 = (Class1_Sub6_Sub12) Static68.aClass89_1.method1694();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4696 + local757 * local747.anInt2094 + local444 * local743.anInt4697) * 65535L / (long) (local747.anInt2090 * local478);
						if (local491 < (long) local747.anInt2105) {
							local743 = (Class1_Sub6_Sub12) Static68.aClass89_1.method1694();
						} else {
							local501 = 0;
							if (local747.anInt2099 == 1) {
								local501 = (local478 >> 4) * local747.anInt2101;
							} else if (local747.anInt2099 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt2101;
							}
							if (local747.anInt2097 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt2090;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt2090;
								local537 = (local444 << 15) / local478 * local747.anInt2090;
								if (local747.anInt2088 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6311 += local939 * arg1 >> 15;
									super.anInt6307 += local948 * arg1 >> 15;
									super.anInt6308 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt2088 == 0) {
								local65 += (local743.anInt4696 - local501) * arg1;
								local82 += (local747.anInt2094 - local501) * arg1;
								local99 += (local743.anInt4697 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6311 += (local743.anInt4696 - local501) * arg1;
								super.anInt6307 += (local747.anInt2094 - local501) * arg1;
								super.anInt6308 += (local743.anInt4697 - local501) * arg1;
							}
							local743 = (Class1_Sub6_Sub12) Static68.aClass89_1.method1694();
						}
					}
				}
			}
		}
		if (local35.anIntArray622 != null) {
			if (local35.anIntArray623 == null) {
				local35.anIntArray623 = new int[local35.anIntArray622.length];
				for (local313 = 0; local313 < local35.anIntArray622.length; local313++) {
					Static236.method3258(local35.anIntArray622[local313]);
					local35.anIntArray623[local313] = ((Class1_Sub30) Static218.aClass77_28.method1368((long) local35.anIntArray622[local313])).anInt3799;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray623.length; local313++) {
				@Pc(1082) Class91 local1082 = Static239.aClass91Array1[local35.anIntArray623[local313]];
				if (local1082.anInt2088 == 0) {
					local65 += local1082.anInt2095 * arg1;
					local82 += local1082.anInt2094 * arg1;
					local99 += local1082.anInt2102 * arg1;
					local303 = true;
				} else {
					super.anInt6311 += local1082.anInt2095 * arg1;
					super.anInt6307 += local1082.anInt2094 * arg1;
					super.anInt6308 += local1082.anInt2102 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort96 = (short) local65;
					this.aShort95 = (short) local82;
					this.aShort94 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6315 <<= 0x1;
			}
		}
		super.anInt6311 = (int) ((long) super.anInt6311 + ((long) this.aShort96 * (long) this.anInt6315 >> 23) * (long) arg1);
		super.anInt6307 = (int) ((long) super.anInt6307 + ((long) this.aShort95 * (long) this.anInt6315 >> 23) * (long) arg1);
		super.anInt6308 = (int) ((long) super.anInt6308 + ((long) this.aShort94 * (long) this.anInt6315 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!wg;IIIIIIIIIIIZ)V")
	public void method5487(@OriginalArg(0) Class41_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass41_Sub7_1 = arg0;
		super.anInt6311 = arg1 << Static307.anInt5745;
		super.anInt6307 = arg2 << Static307.anInt5745;
		super.anInt6308 = arg3 << Static307.anInt5745;
		super.anInt6314 = arg9;
		this.aShort93 = this.aShort92 = (short) arg8;
		super.anInt6312 = arg10;
		super.anInt6309 = arg11;
		this.aShort96 = (short) arg4;
		this.aShort95 = (short) arg5;
		this.aShort94 = (short) arg6;
		this.anInt6315 = arg7;
		super.aByte78 = this.aClass41_Sub7_1.aClass197_2.aByte63;
		this.method5484();
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
	private void method5488() {
		this.aClass41_Sub7_1.aClass41_Sub3_7.aClass41_Sub2_Sub1_Sub1Array1[this.aShort97] = null;
		Static305.aClass41_Sub2_Sub1_Sub1Array2[Static222.anInt4504] = this;
		Static222.anInt4504 = Static222.anInt4504 + 1 & 0x3FF;
		this.method5475();
		this.method5480();
	}
}
