import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class38_Sub2_Sub1_Sub1 extends Class38_Sub2_Sub1 {

	@OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
	private int anInt1742;

	@OriginalMember(owner = "client!cv", name = "J", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!cv", name = "I", descriptor = "Lclient!iv;")
	private Class38_Sub5 aClass38_Sub5_1;

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!cv", name = "E", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!cv", name = "G", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
	private int anInt1743;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!iv;IIIIIIIIIIIZZ)V")
	public Class38_Sub2_Sub1_Sub1(@OriginalArg(0) Class38_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass38_Sub5_1 = arg0;
		super.anInt1739 = arg1 << Static330.anInt5888;
		super.anInt1737 = arg2 << Static330.anInt5888;
		super.anInt1734 = arg3 << Static330.anInt5888;
		super.anInt1735 = arg9;
		this.aShort13 = this.aShort15 = (short) arg8;
		super.anInt1738 = arg10;
		super.anInt1736 = arg11;
		super.aBoolean147 = arg13;
		this.aShort11 = (short) arg4;
		this.aShort14 = (short) arg5;
		this.aShort12 = (short) arg6;
		this.anInt1743 = arg7;
		super.aByte14 = this.aClass38_Sub5_1.aClass202_1.aByte75;
		this.method1240();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()V")
	private void method1240() {
		@Pc(4) int local4 = this.aClass38_Sub5_1.aClass38_Sub6_3.anInt4405;
		if (this.aClass38_Sub5_1.aClass38_Sub6_3.aClass38_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass38_Sub5_1.aClass38_Sub6_3.aClass38_Sub2_Sub1_Sub1Array1[local4].method1242();
		}
		this.aClass38_Sub5_1.aClass38_Sub6_3.aClass38_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort16 = (short) this.aClass38_Sub5_1.aClass38_Sub6_3.anInt4405;
		this.aClass38_Sub5_1.aClass38_Sub6_3.anInt4405 = local4 + 1 & 0x1FFF;
		this.aClass38_Sub5_1.aClass184_2.method4207(this);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(J)V")
	public void method1241(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt1739 >> Static250.anInt4056 + 12;
		@Pc(13) int local13 = super.anInt1734 >> Static250.anInt4056 + 12;
		@Pc(18) int local18 = super.anInt1737 >> Static330.anInt5888;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static86.anInt2009 || local13 < 0 || local13 >= Static360.anInt6340) {
			this.method1242();
			return;
		}
		@Pc(40) Class38_Sub6 local40 = this.aClass38_Sub5_1.aClass38_Sub6_3;
		@Pc(44) Class6 local44 = this.aClass38_Sub5_1.aClass6_1;
		@Pc(46) Class106[] local46 = Static372.aClass106Array11;
		@Pc(54) int local54 = local46[local40.anInt4412].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt4412 < Static58.anInt1578 - 1) {
			local70 = local46[local40.anInt4412 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static250.anInt4056);
		}
		if (local44.aBoolean19) {
			if (local44.anInt224 == -1 && local18 > local54) {
				this.method1242();
				return;
			}
			if (local44.anInt224 >= 0 && local18 > local46[local44.anInt224].I(local6, local13)) {
				this.method1242();
				return;
			}
			if (local44.anInt185 == -1 && local18 < local70) {
				this.method1242();
				return;
			}
			if (local44.anInt185 >= 0 && local18 < local46[local44.anInt185 + 1].I(local6, local13)) {
				this.method1242();
				return;
			}
		}
		if (local6 >= local40.anInt4409 && local6 <= local40.anInt4407 && local13 >= local40.anInt4411 && local13 <= local40.anInt4408 && local18 <= local54 && local18 >= local70) {
			local40.aClass192_2.aClass114_1.method2571(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static58.anInt1578 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method1242();
		} else if (local158 == Static58.anInt1578 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static250.anInt4056) {
			this.method1242();
		} else {
			@Pc(211) Class113 local211 = Static176.aClass113ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static176.aClass113ArrayArrayArray3[0][local6][local13] = new Class113(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static176.aClass113ArrayArrayArray3[0][local6][local13].aClass113_1 != null;
				if (local158 == 3 && local243) {
					this.method1242();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static176.aClass113ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static176.aClass113ArrayArrayArray3[local253][local6][local13] = new Class113(local253, local6, local13);
						if (local243) {
							local211.aByte33++;
						}
					}
				}
			}
			if (local211.aClass192_1 == null) {
				local211.aClass192_1 = new Class192();
				local211.aByte31 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte31 != (byte) (arg0 & 0xFFL)) {
				local211.aClass192_1.aClass114_1.method2573();
				local211.aClass192_1.aBoolean468 = false;
				local211.aByte31 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass192_1.aClass114_1.method2571(this);
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "()V")
	private void method1242() {
		this.aClass38_Sub5_1.aClass38_Sub6_3.aClass38_Sub2_Sub1_Sub1Array1[this.aShort16] = null;
		Static347.aClass38_Sub2_Sub1_Sub1Array2[Static352.anInt7236] = this;
		Static352.anInt7236 = Static352.anInt7236 + 1 & 0x3FF;
		this.method5069();
		this.method1237();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!iv;IIIIIIIIIIIZZ)V")
	public void method1243(@OriginalArg(0) Class38_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass38_Sub5_1 = arg0;
		super.anInt1739 = arg1 << Static330.anInt5888;
		super.anInt1737 = arg2 << Static330.anInt5888;
		super.anInt1734 = arg3 << Static330.anInt5888;
		super.anInt1735 = arg9;
		this.aShort13 = this.aShort15 = (short) arg8;
		super.anInt1738 = arg10;
		super.anInt1736 = arg11;
		super.aBoolean147 = arg13;
		this.aShort11 = (short) arg4;
		this.aShort14 = (short) arg5;
		this.aShort12 = (short) arg6;
		this.anInt1743 = arg7;
		super.aByte14 = this.aClass38_Sub5_1.aClass202_1.aByte75;
		this.method1240();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(JI)V")
	public void method1244(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort15 = (short) (this.aShort15 - arg1);
		if (this.aShort15 <= 0) {
			this.method1242();
			return;
		}
		@Pc(17) int local17 = super.anInt1739 >> Static330.anInt5888;
		@Pc(22) int local22 = super.anInt1737 >> Static330.anInt5888;
		@Pc(27) int local27 = super.anInt1734 >> Static330.anInt5888;
		@Pc(31) Class38_Sub6 local31 = this.aClass38_Sub5_1.aClass38_Sub6_3;
		@Pc(35) Class6 local35 = this.aClass38_Sub5_1.aClass6_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt196 != 0) {
			if (this.aShort13 - this.aShort15 <= local35.anInt216) {
				local65 = (super.anInt1735 >> 8 & 0xFF00) + (this.anInt1742 >> 16 & 0xFF) + local35.anInt218 * arg1;
				local82 = (super.anInt1735 & 0xFF00) + (this.anInt1742 >> 8 & 0xFF) + local35.anInt204 * arg1;
				local99 = ((super.anInt1735 & 0xFF) << 8) + (this.anInt1742 & 0xFF) + local35.anInt186 * arg1;
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
				super.anInt1735 &= 0xFF000000;
				super.anInt1735 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt1742 &= 0xFF000000;
				this.anInt1742 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort13 - this.aShort15 <= local35.anInt195) {
				local65 = (super.anInt1735 >> 16 & 0xFF00) + (this.anInt1742 >> 24 & 0xFF) + local35.anInt211 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt1735 &= 0xFFFFFF;
				super.anInt1735 |= (local65 & 0xFF00) << 16;
				this.anInt1742 &= 0xFFFFFF;
				this.anInt1742 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt181 != -1 && this.aShort13 - this.aShort15 <= local35.anInt223) {
			this.anInt1743 += local35.anInt225 * arg1;
		}
		if (local35.anInt215 != -1 && this.aShort13 - this.aShort15 <= local35.anInt202) {
			super.anInt1738 += local35.anInt222 * arg1;
		}
		local65 = this.aShort11;
		local82 = this.aShort14;
		local99 = this.aShort12;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt206 == 1) {
			local313 = local17 - this.aClass38_Sub5_1.anInt3554;
			local319 = local22 - this.aClass38_Sub5_1.anInt3537;
			local325 = local27 - this.aClass38_Sub5_1.anInt3539;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt171 * local340 * arg1;
			this.anInt1743 = (int) ((long) this.anInt1743 - ((long) this.anInt1743 * local348 >> 18));
		} else if (local35.anInt206 == 2) {
			local313 = local17 - this.aClass38_Sub5_1.anInt3554;
			local319 = local22 - this.aClass38_Sub5_1.anInt3537;
			local325 = local27 - this.aClass38_Sub5_1.anInt3539;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt171 * local340 * arg1;
			this.anInt1743 = (int) ((long) this.anInt1743 - ((long) this.anInt1743 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray5 != null) {
			@Pc(426) Class2 local426 = local31.aClass265_33.aClass2_257;
			for (@Pc(429) Class2 local429 = local426.aClass2_261; local429 != local426; local429 = local429.aClass2_261) {
				@Pc(433) Class2_Sub2_Sub8 local433 = (Class2_Sub2_Sub8) local429;
				@Pc(436) Class27 local436 = local433.aClass27_1;
				if (local436.anInt980 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray5.length; local444++) {
						if (local35.anIntArray5[local444] == local436.anInt978) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2784;
						@Pc(473) int local473 = local22 - local433.anInt2782;
						local478 = local27 - local433.anInt2785;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong28) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2787 + local473 * local436.anInt985 + local478 * local433.anInt2786) * 65535L / (long) (local436.anInt976 * local501);
							if (local529 >= (long) local436.anInt988) {
								local537 = 0;
								if (local436.anInt971 == 1) {
									local537 = (local501 >> 4) * local436.anInt973;
								} else if (local436.anInt971 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt973;
								}
								if (local436.anInt983 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt976;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt976;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt976;
									if (local436.anInt972 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt1739 += local643 * arg1 >> 15;
										super.anInt1737 += local652 * arg1 >> 15;
										super.anInt1734 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt972 == 0) {
									local65 += (local433.anInt2787 - local537) * arg1;
									local82 += (local436.anInt985 - local537) * arg1;
									local99 += (local433.anInt2786 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt1739 += (local433.anInt2787 - local537) * arg1;
									super.anInt1737 += (local436.anInt985 - local537) * arg1;
									super.anInt1734 += (local433.anInt2786 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray6 != null) {
			for (local313 = 0; local313 < local35.anIntArray6.length; local313++) {
				@Pc(743) Class2_Sub2_Sub8 local743 = (Class2_Sub2_Sub8) Static143.aClass98_4.method1995((long) local35.anIntArray6[local313]);
				while (local743 != null) {
					@Pc(747) Class27 local747 = local743.aClass27_1;
					local340 = local17 - local743.anInt2784;
					@Pc(757) int local757 = local22 - local743.anInt2782;
					local444 = local27 - local743.anInt2785;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong28) {
						local743 = (Class2_Sub2_Sub8) Static143.aClass98_4.method1997();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2787 + local757 * local747.anInt985 + local444 * local743.anInt2786) * 65535L / (long) (local747.anInt976 * local478);
						if (local491 < (long) local747.anInt988) {
							local743 = (Class2_Sub2_Sub8) Static143.aClass98_4.method1997();
						} else {
							local501 = 0;
							if (local747.anInt971 == 1) {
								local501 = (local478 >> 4) * local747.anInt973;
							} else if (local747.anInt971 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt973;
							}
							if (local747.anInt983 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt976;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt976;
								local537 = (local444 << 15) / local478 * local747.anInt976;
								if (local747.anInt972 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt1739 += local939 * arg1 >> 15;
									super.anInt1737 += local948 * arg1 >> 15;
									super.anInt1734 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt972 == 0) {
								local65 += (local743.anInt2787 - local501) * arg1;
								local82 += (local747.anInt985 - local501) * arg1;
								local99 += (local743.anInt2786 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt1739 += (local743.anInt2787 - local501) * arg1;
								super.anInt1737 += (local747.anInt985 - local501) * arg1;
								super.anInt1734 += (local743.anInt2786 - local501) * arg1;
							}
							local743 = (Class2_Sub2_Sub8) Static143.aClass98_4.method1997();
						}
					}
				}
			}
		}
		if (local35.anIntArray7 != null) {
			if (local35.anIntArray8 == null) {
				local35.anIntArray8 = new int[local35.anIntArray7.length];
				for (local313 = 0; local313 < local35.anIntArray7.length; local313++) {
					Static9.method188(local35.anIntArray7[local313]);
					local35.anIntArray8[local313] = ((Class2_Sub16) Static367.aClass240_30.method5439((long) local35.anIntArray7[local313])).anInt2428;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray8.length; local313++) {
				@Pc(1082) Class27 local1082 = Static171.aClass27Array1[local35.anIntArray8[local313]];
				if (local1082.anInt972 == 0) {
					local65 += local1082.anInt987 * arg1;
					local82 += local1082.anInt985 * arg1;
					local99 += local1082.anInt982 * arg1;
					local303 = true;
				} else {
					super.anInt1739 += local1082.anInt987 * arg1;
					super.anInt1737 += local1082.anInt985 * arg1;
					super.anInt1734 += local1082.anInt982 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort11 = (short) local65;
					this.aShort14 = (short) local82;
					this.aShort12 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt1743 <<= 0x1;
			}
		}
		super.anInt1739 = (int) ((long) super.anInt1739 + ((long) this.aShort11 * (long) this.anInt1743 >> 23) * (long) arg1);
		super.anInt1737 = (int) ((long) super.anInt1737 + ((long) this.aShort14 * (long) this.anInt1743 >> 23) * (long) arg1);
		super.anInt1734 = (int) ((long) super.anInt1734 + ((long) this.aShort12 * (long) this.anInt1743 >> 23) * (long) arg1);
	}
}
