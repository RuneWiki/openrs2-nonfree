import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class20_Sub1_Sub1_Sub1 extends Class20_Sub1_Sub1 {

	@OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!bj", name = "S", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!bj", name = "T", descriptor = "Lclient!lm;")
	private Class20_Sub7 aClass20_Sub7_1;

	@OriginalMember(owner = "client!bj", name = "U", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!bj", name = "O", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!lm;IIIIIIIIIIIZ)V")
	public Class20_Sub1_Sub1_Sub1(@OriginalArg(0) Class20_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass20_Sub7_1 = arg0;
		super.anInt487 = arg1 << Static172.anInt3231;
		super.anInt485 = arg2 << Static172.anInt3231;
		super.anInt494 = arg3 << Static172.anInt3231;
		super.anInt492 = arg9;
		this.aShort6 = this.aShort9 = (short) arg8;
		super.anInt489 = arg10;
		super.anInt488 = arg11;
		this.aShort5 = (short) arg4;
		this.aShort4 = (short) arg5;
		this.aShort7 = (short) arg6;
		this.anInt497 = arg7;
		super.aByte6 = this.aClass20_Sub7_1.aClass157_1.aByte58;
		this.method428();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(JI)V")
	public void method425(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort9 = (short) (this.aShort9 - arg1);
		if (this.aShort9 <= 0) {
			this.method426();
			return;
		}
		@Pc(17) int local17 = super.anInt487 >> Static172.anInt3231;
		@Pc(22) int local22 = super.anInt485 >> Static172.anInt3231;
		@Pc(27) int local27 = super.anInt494 >> Static172.anInt3231;
		@Pc(31) Class20_Sub2 local31 = this.aClass20_Sub7_1.aClass20_Sub2_3;
		@Pc(35) Class162 local35 = this.aClass20_Sub7_1.aClass162_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt4625 != 0) {
			if (this.aShort6 - this.aShort9 <= local35.anInt4640) {
				local65 = (super.anInt492 >> 8 & 0xFF00) + (this.anInt496 >> 16 & 0xFF) + local35.anInt4605 * arg1;
				local82 = (super.anInt492 & 0xFF00) + (this.anInt496 >> 8 & 0xFF) + local35.anInt4639 * arg1;
				local99 = ((super.anInt492 & 0xFF) << 8) + (this.anInt496 & 0xFF) + local35.anInt4615 * arg1;
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
				super.anInt492 &= 0xFF000000;
				super.anInt492 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt496 &= 0xFF000000;
				this.anInt496 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort6 - this.aShort9 <= local35.anInt4653) {
				local65 = (super.anInt492 >> 16 & 0xFF00) + (this.anInt496 >> 24 & 0xFF) + local35.anInt4604 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt492 &= 0xFFFFFF;
				super.anInt492 |= (local65 & 0xFF00) << 16;
				this.anInt496 &= 0xFFFFFF;
				this.anInt496 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4599 != -1 && this.aShort6 - this.aShort9 <= local35.anInt4637) {
			this.anInt497 += local35.anInt4643 * arg1;
		}
		if (local35.anInt4626 != -1 && this.aShort6 - this.aShort9 <= local35.anInt4620) {
			super.anInt489 += local35.anInt4652 * arg1;
		}
		local65 = this.aShort5;
		local82 = this.aShort4;
		local99 = this.aShort7;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt4609 == 1) {
			local313 = local17 - this.aClass20_Sub7_1.anInt3351;
			local319 = local22 - this.aClass20_Sub7_1.anInt3367;
			local325 = local27 - this.aClass20_Sub7_1.anInt3343;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt4649 * local340 * arg1;
			this.anInt497 = (int) ((long) this.anInt497 - ((long) this.anInt497 * local348 >> 18));
		} else if (local35.anInt4609 == 2) {
			local313 = local17 - this.aClass20_Sub7_1.anInt3351;
			local319 = local22 - this.aClass20_Sub7_1.anInt3367;
			local325 = local27 - this.aClass20_Sub7_1.anInt3343;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt4649 * local340 * arg1;
			this.anInt497 = (int) ((long) this.anInt497 - ((long) this.anInt497 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray504 != null) {
			@Pc(426) Class6 local426 = local31.aClass211_3.aClass6_237;
			for (@Pc(429) Class6 local429 = local426.aClass6_248; local429 != local426; local429 = local429.aClass6_248) {
				@Pc(433) Class6_Sub2_Sub16 local433 = (Class6_Sub2_Sub16) local429;
				@Pc(436) Class179 local436 = local433.aClass179_1;
				if (local436.anInt5333 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray504.length; local444++) {
						if (local35.anIntArray504[local444] == local436.anInt5332) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt5030;
						@Pc(473) int local473 = local22 - local433.anInt5037;
						local478 = local27 - local433.anInt5033;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong175) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt5034 + local473 * local436.anInt5335 + local478 * local433.anInt5035) * 65535L / (long) (local436.anInt5329 * local501);
							if (local529 >= (long) local436.anInt5326) {
								local537 = 0;
								if (local436.anInt5339 == 1) {
									local537 = (local501 >> 4) * local436.anInt5328;
								} else if (local436.anInt5339 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt5328;
								}
								if (local436.anInt5334 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt5329;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt5329;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt5329;
									if (local436.anInt5330 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt487 += local643 * arg1 >> 15;
										super.anInt485 += local652 * arg1 >> 15;
										super.anInt494 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt5330 == 0) {
									local65 += (local433.anInt5034 - local537) * arg1;
									local82 += (local436.anInt5335 - local537) * arg1;
									local99 += (local433.anInt5035 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt487 += (local433.anInt5034 - local537) * arg1;
									super.anInt485 += (local436.anInt5335 - local537) * arg1;
									super.anInt494 += (local433.anInt5035 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray506 != null) {
			for (local313 = 0; local313 < local35.anIntArray506.length; local313++) {
				@Pc(743) Class6_Sub2_Sub16 local743 = (Class6_Sub2_Sub16) Static52.aClass182_1.method4907((long) local35.anIntArray506[local313]);
				while (local743 != null) {
					@Pc(747) Class179 local747 = local743.aClass179_1;
					local340 = local17 - local743.anInt5030;
					@Pc(757) int local757 = local22 - local743.anInt5037;
					local444 = local27 - local743.anInt5033;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong175) {
						local743 = (Class6_Sub2_Sub16) Static52.aClass182_1.method4912();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt5034 + local757 * local747.anInt5335 + local444 * local743.anInt5035) * 65535L / (long) (local747.anInt5329 * local478);
						if (local491 < (long) local747.anInt5326) {
							local743 = (Class6_Sub2_Sub16) Static52.aClass182_1.method4912();
						} else {
							local501 = 0;
							if (local747.anInt5339 == 1) {
								local501 = (local478 >> 4) * local747.anInt5328;
							} else if (local747.anInt5339 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt5328;
							}
							if (local747.anInt5334 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt5329;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt5329;
								local537 = (local444 << 15) / local478 * local747.anInt5329;
								if (local747.anInt5330 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt487 += local939 * arg1 >> 15;
									super.anInt485 += local948 * arg1 >> 15;
									super.anInt494 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt5330 == 0) {
								local65 += (local743.anInt5034 - local501) * arg1;
								local82 += (local747.anInt5335 - local501) * arg1;
								local99 += (local743.anInt5035 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt487 += (local743.anInt5034 - local501) * arg1;
								super.anInt485 += (local747.anInt5335 - local501) * arg1;
								super.anInt494 += (local743.anInt5035 - local501) * arg1;
							}
							local743 = (Class6_Sub2_Sub16) Static52.aClass182_1.method4912();
						}
					}
				}
			}
		}
		if (local35.anIntArray507 != null) {
			if (local35.anIntArray503 == null) {
				local35.anIntArray503 = new int[local35.anIntArray507.length];
				for (local313 = 0; local313 < local35.anIntArray507.length; local313++) {
					Static152.method3080(local35.anIntArray507[local313]);
					local35.anIntArray503[local313] = ((Class6_Sub43) Static203.aClass108_24.method2900((long) local35.anIntArray507[local313])).anInt6289;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray503.length; local313++) {
				@Pc(1082) Class179 local1082 = Static151.aClass179Array1[local35.anIntArray503[local313]];
				if (local1082.anInt5330 == 0) {
					local65 += local1082.anInt5342 * arg1;
					local82 += local1082.anInt5335 * arg1;
					local99 += local1082.anInt5336 * arg1;
					local303 = true;
				} else {
					super.anInt487 += local1082.anInt5342 * arg1;
					super.anInt485 += local1082.anInt5335 * arg1;
					super.anInt494 += local1082.anInt5336 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort5 = (short) local65;
					this.aShort4 = (short) local82;
					this.aShort7 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt497 <<= 0x1;
			}
		}
		super.anInt487 = (int) ((long) super.anInt487 + ((long) this.aShort5 * (long) this.anInt497 >> 23) * (long) arg1);
		super.anInt485 = (int) ((long) super.anInt485 + ((long) this.aShort4 * (long) this.anInt497 >> 23) * (long) arg1);
		super.anInt494 = (int) ((long) super.anInt494 + ((long) this.aShort7 * (long) this.anInt497 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	private void method426() {
		this.aClass20_Sub7_1.aClass20_Sub2_3.aClass20_Sub1_Sub1_Sub1Array1[this.aShort8] = null;
		Static263.aClass20_Sub1_Sub1_Sub1Array2[Static311.anInt5835] = this;
		Static311.anInt5835 = Static311.anInt5835 + 1 & 0x3FF;
		this.method5103();
		this.method418();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!lm;IIIIIIIIIIIZ)V")
	public void method427(@OriginalArg(0) Class20_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass20_Sub7_1 = arg0;
		super.anInt487 = arg1 << Static172.anInt3231;
		super.anInt485 = arg2 << Static172.anInt3231;
		super.anInt494 = arg3 << Static172.anInt3231;
		super.anInt492 = arg9;
		this.aShort6 = this.aShort9 = (short) arg8;
		super.anInt489 = arg10;
		super.anInt488 = arg11;
		this.aShort5 = (short) arg4;
		this.aShort4 = (short) arg5;
		this.aShort7 = (short) arg6;
		this.anInt497 = arg7;
		super.aByte6 = this.aClass20_Sub7_1.aClass157_1.aByte58;
		this.method428();
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
	private void method428() {
		@Pc(4) int local4 = this.aClass20_Sub7_1.aClass20_Sub2_3.anInt524;
		if (this.aClass20_Sub7_1.aClass20_Sub2_3.aClass20_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass20_Sub7_1.aClass20_Sub2_3.aClass20_Sub1_Sub1_Sub1Array1[local4].method426();
		}
		this.aClass20_Sub7_1.aClass20_Sub2_3.aClass20_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort8 = (short) this.aClass20_Sub7_1.aClass20_Sub2_3.anInt524;
		this.aClass20_Sub7_1.aClass20_Sub2_3.anInt524 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub7_1.aClass109_4.method2935(this);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(J)V")
	public void method429(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt487 >> 19;
		@Pc(9) int local9 = super.anInt494 >> 19;
		@Pc(14) int local14 = super.anInt485 >> Static172.anInt3231;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static310.anInt5828 || local9 < 0 || local9 >= Static163.anInt3084) {
			this.method426();
			return;
		}
		@Pc(36) Class20_Sub2 local36 = this.aClass20_Sub7_1.aClass20_Sub2_3;
		@Pc(40) Class162 local40 = this.aClass20_Sub7_1.aClass162_1;
		@Pc(42) Class106[] local42 = Static203.aClass106Array3;
		@Pc(50) int local50 = local42[local36.anInt530].method5720(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt530 < 3) {
			local64 = local42[local36.anInt530 + 1].method5720(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.lb) {
			if (local40.anInt4623 == -1 && local14 > local50) {
				this.method426();
				return;
			}
			if (local40.anInt4623 >= 0 && local14 > local42[local40.anInt4623].method5720(local4, local9)) {
				this.method426();
				return;
			}
			if (local40.anInt4617 == -1 && local14 < local64) {
				this.method426();
				return;
			}
			if (local40.anInt4617 >= 0 && local14 < local42[local40.anInt4617 + 1].method5720(local4, local9)) {
				this.method426();
				return;
			}
		}
		if (local4 >= local36.anInt526 && local4 <= local36.anInt529 && local9 >= local36.anInt528 && local9 <= local36.anInt529 && local14 <= local50 && local14 >= local64) {
			local36.aClass90_1.aClass59_1.method1268(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method5720(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method5720(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method5720(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method5720(local4, local9) - 1024) {
			this.method426();
			return;
		}
		@Pc(202) Class187 local202 = Static39.aClass187ArrayArrayArray1[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static39.aClass187ArrayArrayArray1[0][local4][local9].aClass187_1 != null;
			if (local148 == 3 && local217) {
				this.method426();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static39.aClass187ArrayArrayArray1[local227][local4][local9] == null) {
					local202 = Static39.aClass187ArrayArrayArray1[local227][local4][local9] = new Class187(local227, local4, local9);
					if (local217) {
						local202.aByte83++;
					}
				}
			}
		}
		if (local202.aClass90_2 == null) {
			local202.aClass90_2 = new Class90();
			local202.aByte79 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte79 != (byte) (arg0 & 0xFFL)) {
			local202.aClass90_2 = new Class90();
			local202.aByte79 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass90_2.aClass59_1.method1268(this);
	}
}
