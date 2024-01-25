import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class88_Sub1_Sub1_Sub1 extends Class88_Sub1_Sub1 {

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
	private int anInt2375;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "Lclient!pj;")
	private Class88_Sub3 aClass88_Sub3_1;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!gg", name = "H", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
	private int anInt2374;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!pj;IIIIIIIIIIIZZ)V")
	public Class88_Sub1_Sub1_Sub1(@OriginalArg(0) Class88_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass88_Sub3_1 = arg0;
		super.anInt2368 = arg1 << 12;
		super.anInt2372 = arg2 << 12;
		super.anInt2373 = arg3 << 12;
		super.anInt2366 = arg9;
		this.aShort20 = this.aShort22 = (short) arg8;
		super.anInt2367 = arg10;
		super.anInt2371 = arg11;
		super.aBoolean163 = arg13;
		this.aShort24 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort19 = (short) arg6;
		this.anInt2374 = arg7;
		super.aByte23 = this.aClass88_Sub3_1.aClass179_2.aByte57;
		this.method1918();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
	private void method1917() {
		this.aClass88_Sub3_1.aClass88_Sub6_4.aClass88_Sub1_Sub1_Sub1Array3[this.aShort21] = null;
		Static459.aClass88_Sub1_Sub1_Sub1Array2[Static81.anInt1470] = this;
		Static81.anInt1470 = Static81.anInt1470 + 1 & 0x3FF;
		this.method5917();
		this.method3065();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
	private void method1918() {
		@Pc(4) int local4 = this.aClass88_Sub3_1.aClass88_Sub6_4.anInt6356;
		if (this.aClass88_Sub3_1.aClass88_Sub6_4.aClass88_Sub1_Sub1_Sub1Array3[local4] != null) {
			this.aClass88_Sub3_1.aClass88_Sub6_4.aClass88_Sub1_Sub1_Sub1Array3[local4].method1917();
		}
		this.aClass88_Sub3_1.aClass88_Sub6_4.aClass88_Sub1_Sub1_Sub1Array3[local4] = this;
		this.aShort21 = (short) this.aClass88_Sub3_1.aClass88_Sub6_4.anInt6356;
		this.aClass88_Sub3_1.aClass88_Sub6_4.anInt6356 = local4 + 1 & 0x1FFF;
		this.aClass88_Sub3_1.aClass107_9.method2332(this);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(J)V")
	public void method1919(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt2368 >> Static419.anInt6980 + 12;
		@Pc(13) int local13 = super.anInt2373 >> Static419.anInt6980 + 12;
		@Pc(18) int local18 = super.anInt2372 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static439.anInt7318 || local13 < 0 || local13 >= Static459.anInt4775) {
			this.method1917();
			return;
		}
		@Pc(40) Class88_Sub6 local40 = this.aClass88_Sub3_1.aClass88_Sub6_4;
		@Pc(44) Class156 local44 = this.aClass88_Sub3_1.aClass156_1;
		@Pc(46) Class125[] local46 = Static410.aClass125Array3;
		@Pc(54) int local54 = local46[local40.anInt6359].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt6359 < Static96.anInt1667 - 1) {
			local70 = local46[local40.anInt6359 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static419.anInt6980);
		}
		if (local44.aBoolean259) {
			if (local44.anInt4006 == -1 && local18 > local54) {
				this.method1917();
				return;
			}
			if (local44.anInt4006 >= 0 && local18 > local46[local44.anInt4006].ua(local6, local13)) {
				this.method1917();
				return;
			}
			if (local44.anInt4043 == -1 && local18 < local70) {
				this.method1917();
				return;
			}
			if (local44.anInt4043 >= 0 && local18 < local46[local44.anInt4043 + 1].ua(local6, local13)) {
				this.method1917();
				return;
			}
		}
		if (local6 >= local40.anInt6361 && local6 <= local40.anInt6363 && local13 >= local40.anInt6358 && local13 <= local40.anInt6362 && local18 <= local54 && local18 >= local70) {
			local40.aClass255_1.aClass225_1.method4945(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static96.anInt1667 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method1917();
		} else if (local158 == Static96.anInt1667 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static419.anInt6980) {
			this.method1917();
		} else {
			@Pc(211) Class258 local211 = Static319.aClass258ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static319.aClass258ArrayArrayArray3[0][local6][local13] = new Class258(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static319.aClass258ArrayArrayArray3[0][local6][local13].aClass258_1 != null;
				if (local158 == 3 && local243) {
					this.method1917();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static319.aClass258ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static319.aClass258ArrayArrayArray3[local253][local6][local13] = new Class258(local253, local6, local13);
						if (local243) {
							local211.aByte98++;
						}
					}
				}
			}
			if (local211.aClass255_2 == null) {
				local211.aClass255_2 = new Class255();
				local211.aByte100 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte100 != (byte) (arg0 & 0xFFL)) {
				local211.aClass255_2.aClass225_1.method4944();
				local211.aClass255_2.aBoolean484 = false;
				local211.aByte100 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass255_2.aClass225_1.method4945(this);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)V")
	public void method1920(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort22 = (short) (this.aShort22 - arg1);
		if (this.aShort22 <= 0) {
			this.method1917();
			return;
		}
		@Pc(17) int local17 = super.anInt2368 >> 12;
		@Pc(22) int local22 = super.anInt2372 >> 12;
		@Pc(27) int local27 = super.anInt2373 >> 12;
		@Pc(31) Class88_Sub6 local31 = this.aClass88_Sub3_1.aClass88_Sub6_4;
		@Pc(35) Class156 local35 = this.aClass88_Sub3_1.aClass156_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.lb != 0) {
			if (this.aShort20 - this.aShort22 <= local35.anInt4030) {
				local65 = (super.anInt2366 >> 8 & 0xFF00) + (this.anInt2375 >> 16 & 0xFF) + local35.anInt4046 * arg1;
				local82 = (super.anInt2366 & 0xFF00) + (this.anInt2375 >> 8 & 0xFF) + local35.anInt4033 * arg1;
				local99 = ((super.anInt2366 & 0xFF) << 8) + (this.anInt2375 & 0xFF) + local35.anInt4052 * arg1;
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
				super.anInt2366 &= 0xFF000000;
				super.anInt2366 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2375 &= 0xFF000000;
				this.anInt2375 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort20 - this.aShort22 <= local35.anInt4028) {
				local65 = (super.anInt2366 >> 16 & 0xFF00) + (this.anInt2375 >> 24 & 0xFF) + local35.anInt4049 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2366 &= 0xFFFFFF;
				super.anInt2366 |= (local65 & 0xFF00) << 16;
				this.anInt2375 &= 0xFFFFFF;
				this.anInt2375 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4027 != -1 && this.aShort20 - this.aShort22 <= local35.anInt4041) {
			this.anInt2374 += local35.anInt4003 * arg1;
		}
		if (local35.anInt4035 != -1 && this.aShort20 - this.aShort22 <= local35.anInt4007) {
			super.anInt2367 += local35.anInt4020 * arg1;
		}
		local65 = this.aShort24;
		local82 = this.aShort23;
		local99 = this.aShort19;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt4032 == 1) {
			local313 = local17 - this.aClass88_Sub3_1.anInt4980;
			local319 = local22 - this.aClass88_Sub3_1.anInt4987;
			local325 = local27 - this.aClass88_Sub3_1.anInt4988;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt4023 * local340 * arg1;
			this.anInt2374 = (int) ((long) this.anInt2374 - ((long) this.anInt2374 * local348 >> 18));
		} else if (local35.anInt4032 == 2) {
			local313 = local17 - this.aClass88_Sub3_1.anInt4980;
			local319 = local22 - this.aClass88_Sub3_1.anInt4987;
			local325 = local27 - this.aClass88_Sub3_1.anInt4988;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt4023 * local340 * arg1;
			this.anInt2374 = (int) ((long) this.anInt2374 - ((long) this.anInt2374 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray255 != null) {
			@Pc(426) Class5 local426 = local31.aClass177_36.aClass5_167;
			for (@Pc(429) Class5 local429 = local426.aClass5_267; local429 != local426; local429 = local429.aClass5_267) {
				@Pc(433) Class5_Sub2_Sub16 local433 = (Class5_Sub2_Sub16) local429;
				@Pc(436) Class55 local436 = local433.aClass55_1;
				if (local436.anInt1558 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray255.length; local444++) {
						if (local35.anIntArray255[local444] == local436.anInt1561) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt6380;
						@Pc(473) int local473 = local22 - local433.anInt6379;
						local478 = local27 - local433.anInt6377;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong57) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt6383 + local473 * local436.anInt1562 + local478 * local433.anInt6376) * 65535L / (long) (local436.anInt1547 * local501);
							if (local529 >= (long) local436.anInt1554) {
								local537 = 0;
								if (local436.anInt1559 == 1) {
									local537 = (local501 >> 4) * local436.anInt1556;
								} else if (local436.anInt1559 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt1556;
								}
								if (local436.anInt1552 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt1547;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt1547;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt1547;
									if (local436.anInt1553 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2368 += local643 * arg1 >> 15;
										super.anInt2372 += local652 * arg1 >> 15;
										super.anInt2373 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt1553 == 0) {
									local65 += (local433.anInt6383 - local537) * arg1;
									local82 += (local436.anInt1562 - local537) * arg1;
									local99 += (local433.anInt6376 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2368 += (local433.anInt6383 - local537) * arg1;
									super.anInt2372 += (local436.anInt1562 - local537) * arg1;
									super.anInt2373 += (local433.anInt6376 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray258 != null) {
			for (local313 = 0; local313 < local35.anIntArray258.length; local313++) {
				@Pc(743) Class5_Sub2_Sub16 local743 = (Class5_Sub2_Sub16) Static136.aClass237_27.method5364((long) local35.anIntArray258[local313]);
				while (local743 != null) {
					@Pc(747) Class55 local747 = local743.aClass55_1;
					local340 = local17 - local743.anInt6380;
					@Pc(757) int local757 = local22 - local743.anInt6379;
					local444 = local27 - local743.anInt6377;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong57) {
						local743 = (Class5_Sub2_Sub16) Static136.aClass237_27.method5366();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt6383 + local757 * local747.anInt1562 + local444 * local743.anInt6376) * 65535L / (long) (local747.anInt1547 * local478);
						if (local491 < (long) local747.anInt1554) {
							local743 = (Class5_Sub2_Sub16) Static136.aClass237_27.method5366();
						} else {
							local501 = 0;
							if (local747.anInt1559 == 1) {
								local501 = (local478 >> 4) * local747.anInt1556;
							} else if (local747.anInt1559 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt1556;
							}
							if (local747.anInt1552 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt1547;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt1547;
								local537 = (local444 << 15) / local478 * local747.anInt1547;
								if (local747.anInt1553 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2368 += local939 * arg1 >> 15;
									super.anInt2372 += local948 * arg1 >> 15;
									super.anInt2373 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt1553 == 0) {
								local65 += (local743.anInt6383 - local501) * arg1;
								local82 += (local747.anInt1562 - local501) * arg1;
								local99 += (local743.anInt6376 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2368 += (local743.anInt6383 - local501) * arg1;
								super.anInt2372 += (local747.anInt1562 - local501) * arg1;
								super.anInt2373 += (local743.anInt6376 - local501) * arg1;
							}
							local743 = (Class5_Sub2_Sub16) Static136.aClass237_27.method5366();
						}
					}
				}
			}
		}
		if (local35.anIntArray256 != null) {
			if (local35.anIntArray257 == null) {
				local35.anIntArray257 = new int[local35.anIntArray256.length];
				for (local313 = 0; local313 < local35.anIntArray256.length; local313++) {
					Static33.method564(local35.anIntArray256[local313]);
					local35.anIntArray257[local313] = ((Class5_Sub34) Static335.aClass252_32.method5659((long) local35.anIntArray256[local313])).anInt5642;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray257.length; local313++) {
				@Pc(1082) Class55 local1082 = Static184.aClass55Array1[local35.anIntArray257[local313]];
				if (local1082.anInt1553 == 0) {
					local65 += local1082.anInt1551 * arg1;
					local82 += local1082.anInt1562 * arg1;
					local99 += local1082.anInt1549 * arg1;
					local303 = true;
				} else {
					super.anInt2368 += local1082.anInt1551 * arg1;
					super.anInt2372 += local1082.anInt1562 * arg1;
					super.anInt2373 += local1082.anInt1549 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort24 = (short) local65;
					this.aShort23 = (short) local82;
					this.aShort19 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2374 <<= 0x1;
			}
		}
		super.anInt2368 = (int) ((long) super.anInt2368 + ((long) this.aShort24 * (long) this.anInt2374 >> 23) * (long) arg1);
		super.anInt2372 = (int) ((long) super.anInt2372 + ((long) this.aShort23 * (long) this.anInt2374 >> 23) * (long) arg1);
		super.anInt2373 = (int) ((long) super.anInt2373 + ((long) this.aShort19 * (long) this.anInt2374 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!pj;IIIIIIIIIIIZZ)V")
	public void method1921(@OriginalArg(0) Class88_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass88_Sub3_1 = arg0;
		super.anInt2368 = arg1 << 12;
		super.anInt2372 = arg2 << 12;
		super.anInt2373 = arg3 << 12;
		super.anInt2366 = arg9;
		this.aShort20 = this.aShort22 = (short) arg8;
		super.anInt2367 = arg10;
		super.anInt2371 = arg11;
		super.aBoolean163 = arg13;
		this.aShort24 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort19 = (short) arg6;
		this.anInt2374 = arg7;
		super.aByte23 = this.aClass88_Sub3_1.aClass179_2.aByte57;
		this.method1918();
	}
}
