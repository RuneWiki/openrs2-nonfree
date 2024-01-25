import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class20_Sub1_Sub1_Sub1 extends Class20_Sub1_Sub1 {

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!bs", name = "H", descriptor = "Lclient!os;")
	private Class20_Sub6 aClass20_Sub6_1;

	@OriginalMember(owner = "client!bs", name = "M", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!bs", name = "G", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!os;IIIIIIIIIIIZZ)V")
	public Class20_Sub1_Sub1_Sub1(@OriginalArg(0) Class20_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass20_Sub6_1 = arg0;
		super.anInt633 = arg1 << Static453.anInt7580;
		super.anInt632 = arg2 << Static453.anInt7580;
		super.anInt629 = arg3 << Static453.anInt7580;
		super.anInt628 = arg9;
		this.aShort12 = this.aShort15 = (short) arg8;
		super.anInt631 = arg10;
		super.anInt630 = arg11;
		super.aBoolean36 = arg13;
		this.aShort13 = (short) arg4;
		this.aShort16 = (short) arg5;
		this.aShort11 = (short) arg6;
		this.anInt636 = arg7;
		super.aByte13 = this.aClass20_Sub6_1.aClass76_2.aByte33;
		this.method521();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(J)V")
	public void method518(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt633 >> Static145.anInt2581 + 12;
		@Pc(13) int local13 = super.anInt629 >> Static145.anInt2581 + 12;
		@Pc(18) int local18 = super.anInt632 >> Static453.anInt7580;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static81.anInt1606 || local13 < 0 || local13 >= Static18.anInt297) {
			this.method522();
			return;
		}
		@Pc(40) Class20_Sub3 local40 = this.aClass20_Sub6_1.aClass20_Sub3_2;
		@Pc(44) Class132 local44 = this.aClass20_Sub6_1.aClass132_1;
		@Pc(46) Class41[] local46 = Static278.aClass41Array3;
		@Pc(54) int local54 = local46[local40.anInt2753].l(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt2753 < Static320.anInt5205 - 1) {
			local70 = local46[local40.anInt2753 + 1].l(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static145.anInt2581);
		}
		if (local44.aBoolean253) {
			if (local44.anInt3288 == -1 && local18 > local54) {
				this.method522();
				return;
			}
			if (local44.anInt3288 >= 0 && local18 > local46[local44.anInt3288].l(local6, local13)) {
				this.method522();
				return;
			}
			if (local44.lb == -1 && local18 < local70) {
				this.method522();
				return;
			}
			if (local44.lb >= 0 && local18 < local46[local44.lb + 1].l(local6, local13)) {
				this.method522();
				return;
			}
		}
		if (local6 >= local40.anInt2749 && local6 <= local40.anInt2751 && local13 >= local40.anInt2752 && local13 <= local40.anInt2754 && local18 <= local54 && local18 >= local70) {
			local40.aClass83_2.aClass203_1.method4071(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static320.anInt5205 - 1; local158 > 0 && local18 > local46[local158].l(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].l(local6, local13)) {
			this.method522();
		} else if (local158 == Static320.anInt5205 - 1 && local46[local158].l(local6, local13) - local18 > 0x8 << Static145.anInt2581) {
			this.method522();
		} else {
			@Pc(211) Class75 local211 = Static432.aClass75ArrayArrayArray6[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static432.aClass75ArrayArrayArray6[0][local6][local13] = new Class75(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static432.aClass75ArrayArrayArray6[0][local6][local13].aClass75_1 != null;
				if (local158 == 3 && local243) {
					this.method522();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static432.aClass75ArrayArrayArray6[local253][local6][local13] == null) {
						local211 = Static432.aClass75ArrayArrayArray6[local253][local6][local13] = new Class75(local253, local6, local13);
						if (local243) {
							local211.aByte29++;
						}
					}
				}
			}
			if (local211.aClass83_1 == null) {
				local211.aClass83_1 = new Class83();
				local211.aByte27 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte27 != (byte) (arg0 & 0xFFL)) {
				local211.aClass83_1.aClass203_1.method4066();
				local211.aClass83_1.aBoolean146 = false;
				local211.aByte27 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass83_1.aClass203_1.method4071(this);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(JI)V")
	public void method519(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort15 = (short) (this.aShort15 - arg1);
		if (this.aShort15 <= 0) {
			this.method522();
			return;
		}
		@Pc(17) int local17 = super.anInt633 >> Static453.anInt7580;
		@Pc(22) int local22 = super.anInt632 >> Static453.anInt7580;
		@Pc(27) int local27 = super.anInt629 >> Static453.anInt7580;
		@Pc(31) Class20_Sub3 local31 = this.aClass20_Sub6_1.aClass20_Sub3_2;
		@Pc(35) Class132 local35 = this.aClass20_Sub6_1.aClass132_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3266 != 0) {
			if (this.aShort12 - this.aShort15 <= local35.anInt3249) {
				local65 = (super.anInt628 >> 8 & 0xFF00) + (this.anInt635 >> 16 & 0xFF) + local35.anInt3285 * arg1;
				local82 = (super.anInt628 & 0xFF00) + (this.anInt635 >> 8 & 0xFF) + local35.anInt3278 * arg1;
				local99 = ((super.anInt628 & 0xFF) << 8) + (this.anInt635 & 0xFF) + local35.anInt3270 * arg1;
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
				super.anInt628 &= 0xFF000000;
				super.anInt628 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt635 &= 0xFF000000;
				this.anInt635 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort12 - this.aShort15 <= local35.anInt3254) {
				local65 = (super.anInt628 >> 16 & 0xFF00) + (this.anInt635 >> 24 & 0xFF) + local35.anInt3250 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt628 &= 0xFFFFFF;
				super.anInt628 |= (local65 & 0xFF00) << 16;
				this.anInt635 &= 0xFFFFFF;
				this.anInt635 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3273 != -1 && this.aShort12 - this.aShort15 <= local35.anInt3284) {
			this.anInt636 += local35.anInt3283 * arg1;
		}
		if (local35.anInt3241 != -1 && this.aShort12 - this.aShort15 <= local35.anInt3259) {
			super.anInt631 += local35.anInt3253 * arg1;
		}
		local65 = this.aShort13;
		local82 = this.aShort16;
		local99 = this.aShort11;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3255 == 1) {
			local313 = local17 - this.aClass20_Sub6_1.anInt4819;
			local319 = local22 - this.aClass20_Sub6_1.anInt4820;
			local325 = local27 - this.aClass20_Sub6_1.anInt4837;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3272 * local340 * arg1;
			this.anInt636 = (int) ((long) this.anInt636 - ((long) this.anInt636 * local348 >> 18));
		} else if (local35.anInt3255 == 2) {
			local313 = local17 - this.aClass20_Sub6_1.anInt4819;
			local319 = local22 - this.aClass20_Sub6_1.anInt4820;
			local325 = local27 - this.aClass20_Sub6_1.anInt4837;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3272 * local340 * arg1;
			this.anInt636 = (int) ((long) this.anInt636 - ((long) this.anInt636 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray254 != null) {
			@Pc(426) Class4 local426 = local31.aClass244_13.aClass4_227;
			for (@Pc(429) Class4 local429 = local426.aClass4_261; local429 != local426; local429 = local429.aClass4_261) {
				@Pc(433) Class4_Sub2_Sub12 local433 = (Class4_Sub2_Sub12) local429;
				@Pc(436) Class218 local436 = local433.aClass218_1;
				if (local436.anInt5714 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray254.length; local444++) {
						if (local35.anIntArray254[local444] == local436.anInt5721) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3974;
						@Pc(473) int local473 = local22 - local433.anInt3977;
						local478 = local27 - local433.anInt3973;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong172) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3971 + local473 * local436.anInt5724 + local478 * local433.anInt3978) * 65535L / (long) (local436.anInt5727 * local501);
							if (local529 >= (long) local436.anInt5717) {
								local537 = 0;
								if (local436.anInt5725 == 1) {
									local537 = (local501 >> 4) * local436.anInt5719;
								} else if (local436.anInt5725 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt5719;
								}
								if (local436.anInt5726 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt5727;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt5727;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt5727;
									if (local436.anInt5730 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt633 += local643 * arg1 >> 15;
										super.anInt632 += local652 * arg1 >> 15;
										super.anInt629 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt5730 == 0) {
									local65 += (local433.anInt3971 - local537) * arg1;
									local82 += (local436.anInt5724 - local537) * arg1;
									local99 += (local433.anInt3978 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt633 += (local433.anInt3971 - local537) * arg1;
									super.anInt632 += (local436.anInt5724 - local537) * arg1;
									super.anInt629 += (local433.anInt3978 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray255 != null) {
			for (local313 = 0; local313 < local35.anIntArray255.length; local313++) {
				@Pc(743) Class4_Sub2_Sub12 local743 = (Class4_Sub2_Sub12) Static52.aClass225_1.method4683((long) local35.anIntArray255[local313]);
				while (local743 != null) {
					@Pc(747) Class218 local747 = local743.aClass218_1;
					local340 = local17 - local743.anInt3974;
					@Pc(757) int local757 = local22 - local743.anInt3977;
					local444 = local27 - local743.anInt3973;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong172) {
						local743 = (Class4_Sub2_Sub12) Static52.aClass225_1.method4681();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3971 + local757 * local747.anInt5724 + local444 * local743.anInt3978) * 65535L / (long) (local747.anInt5727 * local478);
						if (local491 < (long) local747.anInt5717) {
							local743 = (Class4_Sub2_Sub12) Static52.aClass225_1.method4681();
						} else {
							local501 = 0;
							if (local747.anInt5725 == 1) {
								local501 = (local478 >> 4) * local747.anInt5719;
							} else if (local747.anInt5725 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt5719;
							}
							if (local747.anInt5726 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt5727;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt5727;
								local537 = (local444 << 15) / local478 * local747.anInt5727;
								if (local747.anInt5730 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt633 += local939 * arg1 >> 15;
									super.anInt632 += local948 * arg1 >> 15;
									super.anInt629 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt5730 == 0) {
								local65 += (local743.anInt3971 - local501) * arg1;
								local82 += (local747.anInt5724 - local501) * arg1;
								local99 += (local743.anInt3978 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt633 += (local743.anInt3971 - local501) * arg1;
								super.anInt632 += (local747.anInt5724 - local501) * arg1;
								super.anInt629 += (local743.anInt3978 - local501) * arg1;
							}
							local743 = (Class4_Sub2_Sub12) Static52.aClass225_1.method4681();
						}
					}
				}
			}
		}
		if (local35.anIntArray252 != null) {
			if (local35.anIntArray253 == null) {
				local35.anIntArray253 = new int[local35.anIntArray252.length];
				for (local313 = 0; local313 < local35.anIntArray252.length; local313++) {
					Static326.method4300(local35.anIntArray252[local313]);
					local35.anIntArray253[local313] = ((Class4_Sub24) Static247.aClass67_24.method1429((long) local35.anIntArray252[local313])).anInt4057;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray253.length; local313++) {
				@Pc(1082) Class218 local1082 = Static346.aClass218Array1[local35.anIntArray253[local313]];
				if (local1082.anInt5730 == 0) {
					local65 += local1082.anInt5715 * arg1;
					local82 += local1082.anInt5724 * arg1;
					local99 += local1082.anInt5716 * arg1;
					local303 = true;
				} else {
					super.anInt633 += local1082.anInt5715 * arg1;
					super.anInt632 += local1082.anInt5724 * arg1;
					super.anInt629 += local1082.anInt5716 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort13 = (short) local65;
					this.aShort16 = (short) local82;
					this.aShort11 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt636 <<= 0x1;
			}
		}
		super.anInt633 = (int) ((long) super.anInt633 + ((long) this.aShort13 * (long) this.anInt636 >> 23) * (long) arg1);
		super.anInt632 = (int) ((long) super.anInt632 + ((long) this.aShort16 * (long) this.anInt636 >> 23) * (long) arg1);
		super.anInt629 = (int) ((long) super.anInt629 + ((long) this.aShort11 * (long) this.anInt636 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!os;IIIIIIIIIIIZZ)V")
	public void method520(@OriginalArg(0) Class20_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass20_Sub6_1 = arg0;
		super.anInt633 = arg1 << Static453.anInt7580;
		super.anInt632 = arg2 << Static453.anInt7580;
		super.anInt629 = arg3 << Static453.anInt7580;
		super.anInt628 = arg9;
		this.aShort12 = this.aShort15 = (short) arg8;
		super.anInt631 = arg10;
		super.anInt630 = arg11;
		super.aBoolean36 = arg13;
		this.aShort13 = (short) arg4;
		this.aShort16 = (short) arg5;
		this.aShort11 = (short) arg6;
		this.anInt636 = arg7;
		super.aByte13 = this.aClass20_Sub6_1.aClass76_2.aByte33;
		this.method521();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
	private void method521() {
		@Pc(4) int local4 = this.aClass20_Sub6_1.aClass20_Sub3_2.anInt2747;
		if (this.aClass20_Sub6_1.aClass20_Sub3_2.aClass20_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass20_Sub6_1.aClass20_Sub3_2.aClass20_Sub1_Sub1_Sub1Array1[local4].method522();
		}
		this.aClass20_Sub6_1.aClass20_Sub3_2.aClass20_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort14 = (short) this.aClass20_Sub6_1.aClass20_Sub3_2.anInt2747;
		this.aClass20_Sub6_1.aClass20_Sub3_2.anInt2747 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub6_1.aClass248_5.method5585(this);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "()V")
	private void method522() {
		this.aClass20_Sub6_1.aClass20_Sub3_2.aClass20_Sub1_Sub1_Sub1Array1[this.aShort14] = null;
		Static331.aClass20_Sub1_Sub1_Sub1Array2[Static94.anInt5461] = this;
		Static94.anInt5461 = Static94.anInt5461 + 1 & 0x3FF;
		this.method5771();
		this.method514();
	}
}
