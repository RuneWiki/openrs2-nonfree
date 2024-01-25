import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class36_Sub2_Sub1_Sub1 extends Class36_Sub2_Sub1 {

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	private int anInt6319;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "Lclient!rc;")
	private Class36_Sub7 aClass36_Sub7_1;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!vi", name = "R", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
	private int anInt6320;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!rc;IIIIIIIIIIIZ)V")
	public Class36_Sub2_Sub1_Sub1(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass36_Sub7_1 = arg0;
		super.anInt6315 = arg1 << Static182.anInt3705;
		super.anInt6312 = arg2 << Static182.anInt3705;
		super.anInt6310 = arg3 << Static182.anInt3705;
		super.anInt6318 = arg9;
		this.aShort91 = this.aShort89 = (short) arg8;
		super.anInt6316 = arg10;
		super.anInt6313 = arg11;
		this.aShort88 = (short) arg4;
		this.aShort86 = (short) arg5;
		this.aShort87 = (short) arg6;
		this.anInt6320 = arg7;
		super.aByte74 = this.aClass36_Sub7_1.aClass57_2.aByte31;
		this.method5328();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V")
	public void method5327(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort89 = (short) (this.aShort89 - arg1);
		if (this.aShort89 <= 0) {
			this.method5331();
			return;
		}
		@Pc(17) int local17 = super.anInt6315 >> Static182.anInt3705;
		@Pc(22) int local22 = super.anInt6312 >> Static182.anInt3705;
		@Pc(27) int local27 = super.anInt6310 >> Static182.anInt3705;
		@Pc(31) Class36_Sub3 local31 = this.aClass36_Sub7_1.aClass36_Sub3_6;
		@Pc(35) Class12 local35 = this.aClass36_Sub7_1.aClass12_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt218 != 0) {
			if (this.aShort91 - this.aShort89 <= local35.lb) {
				local65 = (super.anInt6318 >> 8 & 0xFF00) + (this.anInt6319 >> 16 & 0xFF) + local35.anInt242 * arg1;
				local82 = (super.anInt6318 & 0xFF00) + (this.anInt6319 >> 8 & 0xFF) + local35.anInt205 * arg1;
				local99 = ((super.anInt6318 & 0xFF) << 8) + (this.anInt6319 & 0xFF) + local35.anInt239 * arg1;
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
				super.anInt6318 &= 0xFF000000;
				super.anInt6318 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6319 &= 0xFF000000;
				this.anInt6319 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort91 - this.aShort89 <= local35.anInt235) {
				local65 = (super.anInt6318 >> 16 & 0xFF00) + (this.anInt6319 >> 24 & 0xFF) + local35.anInt229 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6318 &= 0xFFFFFF;
				super.anInt6318 |= (local65 & 0xFF00) << 16;
				this.anInt6319 &= 0xFFFFFF;
				this.anInt6319 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt241 != -1 && this.aShort91 - this.aShort89 <= local35.anInt212) {
			this.anInt6320 += local35.anInt200 * arg1;
		}
		if (local35.anInt247 != -1 && this.aShort91 - this.aShort89 <= local35.anInt228) {
			super.anInt6316 += local35.anInt204 * arg1;
		}
		local65 = this.aShort88;
		local82 = this.aShort86;
		local99 = this.aShort87;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt216 == 1) {
			local313 = local17 - this.aClass36_Sub7_1.anInt5282;
			local319 = local22 - this.aClass36_Sub7_1.anInt5285;
			local325 = local27 - this.aClass36_Sub7_1.anInt5283;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt237 * local340 * arg1;
			this.anInt6320 = (int) ((long) this.anInt6320 - ((long) this.anInt6320 * local348 >> 18));
		} else if (local35.anInt216 == 2) {
			local313 = local17 - this.aClass36_Sub7_1.anInt5282;
			local319 = local22 - this.aClass36_Sub7_1.anInt5285;
			local325 = local27 - this.aClass36_Sub7_1.anInt5283;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt237 * local340 * arg1;
			this.anInt6320 = (int) ((long) this.anInt6320 - ((long) this.anInt6320 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray28 != null) {
			@Pc(426) Class7 local426 = local31.aClass74_11.aClass7_72;
			for (@Pc(429) Class7 local429 = local426.aClass7_247; local429 != local426; local429 = local429.aClass7_247) {
				@Pc(433) Class7_Sub1_Sub11 local433 = (Class7_Sub1_Sub11) local429;
				@Pc(436) Class2 local436 = local433.aClass2_1;
				if (local436.anInt14 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray28.length; local444++) {
						if (local35.anIntArray28[local444] == local436.anInt4) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2820;
						@Pc(473) int local473 = local22 - local433.anInt2824;
						local478 = local27 - local433.anInt2822;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong1) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2817 + local473 * local436.anInt19 + local478 * local433.anInt2818) * 65535L / (long) (local436.anInt20 * local501);
							if (local529 >= (long) local436.anInt5) {
								local537 = 0;
								if (local436.anInt3 == 1) {
									local537 = (local501 >> 4) * local436.anInt6;
								} else if (local436.anInt3 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6;
								}
								if (local436.anInt10 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt20;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt20;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt20;
									if (local436.anInt11 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6315 += local643 * arg1 >> 15;
										super.anInt6312 += local652 * arg1 >> 15;
										super.anInt6310 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt11 == 0) {
									local65 += (local433.anInt2817 - local537) * arg1;
									local82 += (local436.anInt19 - local537) * arg1;
									local99 += (local433.anInt2818 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6315 += (local433.anInt2817 - local537) * arg1;
									super.anInt6312 += (local436.anInt19 - local537) * arg1;
									super.anInt6310 += (local433.anInt2818 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray25 != null) {
			for (local313 = 0; local313 < local35.anIntArray25.length; local313++) {
				@Pc(743) Class7_Sub1_Sub11 local743 = (Class7_Sub1_Sub11) Static319.aClass146_1.method3908((long) local35.anIntArray25[local313]);
				while (local743 != null) {
					@Pc(747) Class2 local747 = local743.aClass2_1;
					local340 = local17 - local743.anInt2820;
					@Pc(757) int local757 = local22 - local743.anInt2824;
					local444 = local27 - local743.anInt2822;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong1) {
						local743 = (Class7_Sub1_Sub11) Static319.aClass146_1.method3902();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2817 + local757 * local747.anInt19 + local444 * local743.anInt2818) * 65535L / (long) (local747.anInt20 * local478);
						if (local491 < (long) local747.anInt5) {
							local743 = (Class7_Sub1_Sub11) Static319.aClass146_1.method3902();
						} else {
							local501 = 0;
							if (local747.anInt3 == 1) {
								local501 = (local478 >> 4) * local747.anInt6;
							} else if (local747.anInt3 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6;
							}
							if (local747.anInt10 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt20;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt20;
								local537 = (local444 << 15) / local478 * local747.anInt20;
								if (local747.anInt11 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6315 += local939 * arg1 >> 15;
									super.anInt6312 += local948 * arg1 >> 15;
									super.anInt6310 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt11 == 0) {
								local65 += (local743.anInt2817 - local501) * arg1;
								local82 += (local747.anInt19 - local501) * arg1;
								local99 += (local743.anInt2818 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6315 += (local743.anInt2817 - local501) * arg1;
								super.anInt6312 += (local747.anInt19 - local501) * arg1;
								super.anInt6310 += (local743.anInt2818 - local501) * arg1;
							}
							local743 = (Class7_Sub1_Sub11) Static319.aClass146_1.method3902();
						}
					}
				}
			}
		}
		if (local35.anIntArray29 != null) {
			if (local35.anIntArray26 == null) {
				local35.anIntArray26 = new int[local35.anIntArray29.length];
				for (local313 = 0; local313 < local35.anIntArray29.length; local313++) {
					Static87.method4767(local35.anIntArray29[local313]);
					local35.anIntArray26[local313] = ((Class7_Sub10) Static122.aClass10_19.method163((long) local35.anIntArray29[local313])).anInt2111;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray26.length; local313++) {
				@Pc(1082) Class2 local1082 = Static331.aClass2Array1[local35.anIntArray26[local313]];
				if (local1082.anInt11 == 0) {
					local65 += local1082.anInt1 * arg1;
					local82 += local1082.anInt19 * arg1;
					local99 += local1082.anInt8 * arg1;
					local303 = true;
				} else {
					super.anInt6315 += local1082.anInt1 * arg1;
					super.anInt6312 += local1082.anInt19 * arg1;
					super.anInt6310 += local1082.anInt8 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort88 = (short) local65;
					this.aShort86 = (short) local82;
					this.aShort87 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6320 <<= 0x1;
			}
		}
		super.anInt6315 = (int) ((long) super.anInt6315 + ((long) this.aShort88 * (long) this.anInt6320 >> 23) * (long) arg1);
		super.anInt6312 = (int) ((long) super.anInt6312 + ((long) this.aShort86 * (long) this.anInt6320 >> 23) * (long) arg1);
		super.anInt6310 = (int) ((long) super.anInt6310 + ((long) this.aShort87 * (long) this.anInt6320 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	private void method5328() {
		@Pc(4) int local4 = this.aClass36_Sub7_1.aClass36_Sub3_6.anInt2563;
		if (this.aClass36_Sub7_1.aClass36_Sub3_6.aClass36_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass36_Sub7_1.aClass36_Sub3_6.aClass36_Sub2_Sub1_Sub1Array1[local4].method5331();
		}
		this.aClass36_Sub7_1.aClass36_Sub3_6.aClass36_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort90 = (short) this.aClass36_Sub7_1.aClass36_Sub3_6.anInt2563;
		this.aClass36_Sub7_1.aClass36_Sub3_6.anInt2563 = local4 + 1 & 0x1FFF;
		this.aClass36_Sub7_1.aClass191_6.method4872(this);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!rc;IIIIIIIIIIIZ)V")
	public void method5329(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass36_Sub7_1 = arg0;
		super.anInt6315 = arg1 << Static182.anInt3705;
		super.anInt6312 = arg2 << Static182.anInt3705;
		super.anInt6310 = arg3 << Static182.anInt3705;
		super.anInt6318 = arg9;
		this.aShort91 = this.aShort89 = (short) arg8;
		super.anInt6316 = arg10;
		super.anInt6313 = arg11;
		this.aShort88 = (short) arg4;
		this.aShort86 = (short) arg5;
		this.aShort87 = (short) arg6;
		this.anInt6320 = arg7;
		super.aByte74 = this.aClass36_Sub7_1.aClass57_2.aByte31;
		this.method5328();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(J)V")
	public void method5330(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt6315 >> 19;
		@Pc(9) int local9 = super.anInt6310 >> 19;
		@Pc(14) int local14 = super.anInt6312 >> Static182.anInt3705;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static346.anInt6536 || local9 < 0 || local9 >= Static174.anInt3604) {
			this.method5331();
			return;
		}
		@Pc(36) Class36_Sub3 local36 = this.aClass36_Sub7_1.aClass36_Sub3_6;
		@Pc(40) Class12 local40 = this.aClass36_Sub7_1.aClass12_1;
		@Pc(42) Class8[] local42 = Static331.aClass8Array5;
		@Pc(50) int local50 = local42[local36.anInt2568].method4173(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt2568 < 3) {
			local64 = local42[local36.anInt2568 + 1].method4173(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean5) {
			if (local40.anInt201 == -1 && local14 > local50) {
				this.method5331();
				return;
			}
			if (local40.anInt201 >= 0 && local14 > local42[local40.anInt201].method4173(local4, local9)) {
				this.method5331();
				return;
			}
			if (local40.anInt232 == -1 && local14 < local64) {
				this.method5331();
				return;
			}
			if (local40.anInt232 >= 0 && local14 < local42[local40.anInt232 + 1].method4173(local4, local9)) {
				this.method5331();
				return;
			}
		}
		if (local4 >= local36.anInt2567 && local4 <= local36.anInt2565 && local9 >= local36.anInt2566 && local9 <= local36.anInt2565 && local14 <= local50 && local14 >= local64) {
			local36.aClass24_2.aClass127_1.method3307(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method4173(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method4173(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method4173(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method4173(local4, local9) - 1024) {
			this.method5331();
			return;
		}
		@Pc(202) Class49 local202 = Static229.aClass49ArrayArrayArray6[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static229.aClass49ArrayArrayArray6[0][local4][local9].aClass49_1 != null;
			if (local148 == 3 && local217) {
				this.method5331();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static229.aClass49ArrayArrayArray6[local227][local4][local9] == null) {
					local202 = Static229.aClass49ArrayArrayArray6[local227][local4][local9] = new Class49(local227, local4, local9);
					if (local217) {
						local202.aByte24++;
					}
				}
			}
		}
		if (local202.aClass24_1 == null) {
			local202.aClass24_1 = new Class24();
			local202.aByte29 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte29 != (byte) (arg0 & 0xFFL)) {
			local202.aClass24_1 = new Class24();
			local202.aByte29 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass24_1.aClass127_1.method3307(this);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	private void method5331() {
		this.aClass36_Sub7_1.aClass36_Sub3_6.aClass36_Sub2_Sub1_Sub1Array1[this.aShort90] = null;
		Static203.aClass36_Sub2_Sub1_Sub1Array2[Static120.anInt2720] = this;
		Static120.anInt2720 = Static120.anInt2720 + 1 & 0x3FF;
		this.method5317();
		this.method5323();
	}
}
