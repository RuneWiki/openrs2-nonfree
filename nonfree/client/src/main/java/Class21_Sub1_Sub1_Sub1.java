import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class21_Sub1_Sub1_Sub1 extends Class21_Sub1_Sub1 {

	@OriginalMember(owner = "client!be", name = "H", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "Lclient!h;")
	private Class21_Sub3 aClass21_Sub3_1;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "I")
	private int anInt551;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!h;IIIIIIIIIIIZZ)V")
	public Class21_Sub1_Sub1_Sub1(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass21_Sub3_1 = arg0;
		super.anInt543 = arg1 << 12;
		super.anInt544 = arg2 << 12;
		super.anInt547 = arg3 << 12;
		super.anInt545 = arg9;
		this.aShort5 = this.aShort3 = (short) arg8;
		super.anInt542 = arg10;
		super.anInt548 = arg11;
		super.aBoolean53 = arg13;
		this.aShort4 = (short) arg4;
		this.aShort6 = (short) arg5;
		this.aShort1 = (short) arg6;
		this.anInt551 = arg7;
		super.aByte6 = this.aClass21_Sub3_1.aClass155_1.aByte41;
		this.method443();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(J)V")
	public void method441(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt543 >> Static460.anInt7074 + 12;
		@Pc(13) int local13 = super.anInt547 >> Static460.anInt7074 + 12;
		@Pc(18) int local18 = super.anInt544 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static169.anInt2876 || local13 < 0 || local13 >= Static316.anInt5459) {
			this.method445();
			return;
		}
		@Pc(40) Class21_Sub2 local40 = this.aClass21_Sub3_1.aClass21_Sub2_3;
		@Pc(44) Class152 local44 = this.aClass21_Sub3_1.aClass152_1;
		@Pc(46) Class162[] local46 = Static345.aClass162Array3;
		@Pc(54) int local54 = local46[local40.anInt786].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt786 < Static289.anInt4757 - 1) {
			local70 = local46[local40.anInt786 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static460.anInt7074);
		}
		if (local44.aBoolean268) {
			if (local44.anInt3878 == -1 && local18 > local54) {
				this.method445();
				return;
			}
			if (local44.anInt3878 >= 0 && local18 > local46[local44.anInt3878].ua(local6, local13)) {
				this.method445();
				return;
			}
			if (local44.anInt3879 == -1 && local18 < local70) {
				this.method445();
				return;
			}
			if (local44.anInt3879 >= 0 && local18 < local46[local44.anInt3879 + 1].ua(local6, local13)) {
				this.method445();
				return;
			}
		}
		if (local6 >= local40.anInt789 && local6 <= local40.anInt788 && local13 >= local40.anInt787 && local13 <= local40.anInt791 && local18 <= local54 && local18 >= local70) {
			local40.aClass256_1.aClass187_1.method3978(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static289.anInt4757 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method445();
		} else if (local158 == Static289.anInt4757 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static460.anInt7074) {
			this.method445();
		} else {
			@Pc(211) Class270 local211 = Static309.aClass270ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static309.aClass270ArrayArrayArray3[0][local6][local13] = new Class270(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static309.aClass270ArrayArrayArray3[0][local6][local13].aClass270_1 != null;
				if (local158 == 3 && local243) {
					this.method445();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static309.aClass270ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static309.aClass270ArrayArrayArray3[local253][local6][local13] = new Class270(local253, local6, local13);
						if (local243) {
							local211.aByte105++;
						}
					}
				}
			}
			if (local211.aClass256_2 == null) {
				local211.aClass256_2 = new Class256();
				local211.aByte104 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte104 != (byte) (arg0 & 0xFFL)) {
				local211.aClass256_2.aClass187_1.method3975();
				local211.aClass256_2.aBoolean502 = false;
				local211.aByte104 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass256_2.aClass187_1.method3978(this);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JI)V")
	public void method442(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort3 = (short) (this.aShort3 - arg1);
		if (this.aShort3 <= 0) {
			this.method445();
			return;
		}
		@Pc(17) int local17 = super.anInt543 >> 12;
		@Pc(22) int local22 = super.anInt544 >> 12;
		@Pc(27) int local27 = super.anInt547 >> 12;
		@Pc(31) Class21_Sub2 local31 = this.aClass21_Sub3_1.aClass21_Sub2_3;
		@Pc(35) Class152 local35 = this.aClass21_Sub3_1.aClass152_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3847 != 0) {
			if (this.aShort5 - this.aShort3 <= local35.anInt3859) {
				local65 = (super.anInt545 >> 8 & 0xFF00) + (this.anInt550 >> 16 & 0xFF) + local35.anInt3873 * arg1;
				local82 = (super.anInt545 & 0xFF00) + (this.anInt550 >> 8 & 0xFF) + local35.anInt3863 * arg1;
				local99 = ((super.anInt545 & 0xFF) << 8) + (this.anInt550 & 0xFF) + local35.anInt3881 * arg1;
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
				super.anInt545 &= 0xFF000000;
				super.anInt545 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt550 &= 0xFF000000;
				this.anInt550 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort5 - this.aShort3 <= local35.anInt3885) {
				local65 = (super.anInt545 >> 16 & 0xFF00) + (this.anInt550 >> 24 & 0xFF) + local35.anInt3880 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt545 &= 0xFFFFFF;
				super.anInt545 |= (local65 & 0xFF00) << 16;
				this.anInt550 &= 0xFFFFFF;
				this.anInt550 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3884 != -1 && this.aShort5 - this.aShort3 <= local35.anInt3864) {
			this.anInt551 += local35.anInt3872 * arg1;
		}
		if (local35.anInt3867 != -1 && this.aShort5 - this.aShort3 <= local35.anInt3839) {
			super.anInt542 += local35.anInt3836 * arg1;
		}
		local65 = this.aShort4;
		local82 = this.aShort6;
		local99 = this.aShort1;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3869 == 1) {
			local313 = local17 - this.aClass21_Sub3_1.anInt2562;
			local319 = local22 - this.aClass21_Sub3_1.anInt2565;
			local325 = local27 - this.aClass21_Sub3_1.anInt2561;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3838 * local340 * arg1;
			this.anInt551 = (int) ((long) this.anInt551 - ((long) this.anInt551 * local348 >> 18));
		} else if (local35.anInt3869 == 2) {
			local313 = local17 - this.aClass21_Sub3_1.anInt2562;
			local319 = local22 - this.aClass21_Sub3_1.anInt2565;
			local325 = local27 - this.aClass21_Sub3_1.anInt2561;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3838 * local340 * arg1;
			this.anInt551 = (int) ((long) this.anInt551 - ((long) this.anInt551 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray331 != null) {
			@Pc(426) Class2 local426 = local31.aClass156_6.aClass2_159;
			for (@Pc(429) Class2 local429 = local426.aClass2_264; local429 != local426; local429 = local429.aClass2_264) {
				@Pc(433) Class2_Sub5_Sub1 local433 = (Class2_Sub5_Sub1) local429;
				@Pc(436) Class228 local436 = local433.aClass228_1;
				if (local436.anInt6215 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray331.length; local444++) {
						if (local35.anIntArray331[local444] == local436.anInt6222) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt636;
						@Pc(473) int local473 = local22 - local433.anInt638;
						local478 = local27 - local433.anInt634;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong192) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt635 + local473 * local436.anInt6217 + local478 * local433.anInt633) * 65535L / (long) (local436.anInt6212 * local501);
							if (local529 >= (long) local436.anInt6210) {
								local537 = 0;
								if (local436.anInt6228 == 1) {
									local537 = (local501 >> 4) * local436.anInt6213;
								} else if (local436.anInt6228 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6213;
								}
								if (local436.anInt6223 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6212;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6212;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6212;
									if (local436.anInt6219 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt543 += local643 * arg1 >> 15;
										super.anInt544 += local652 * arg1 >> 15;
										super.anInt547 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6219 == 0) {
									local65 += (local433.anInt635 - local537) * arg1;
									local82 += (local436.anInt6217 - local537) * arg1;
									local99 += (local433.anInt633 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt543 += (local433.anInt635 - local537) * arg1;
									super.anInt544 += (local436.anInt6217 - local537) * arg1;
									super.anInt547 += (local433.anInt633 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray333 != null) {
			for (local313 = 0; local313 < local35.anIntArray333.length; local313++) {
				@Pc(743) Class2_Sub5_Sub1 local743 = (Class2_Sub5_Sub1) Static54.aClass235_1.method4969((long) local35.anIntArray333[local313]);
				while (local743 != null) {
					@Pc(747) Class228 local747 = local743.aClass228_1;
					local340 = local17 - local743.anInt636;
					@Pc(757) int local757 = local22 - local743.anInt638;
					local444 = local27 - local743.anInt634;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong192) {
						local743 = (Class2_Sub5_Sub1) Static54.aClass235_1.method4970();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt635 + local757 * local747.anInt6217 + local444 * local743.anInt633) * 65535L / (long) (local747.anInt6212 * local478);
						if (local491 < (long) local747.anInt6210) {
							local743 = (Class2_Sub5_Sub1) Static54.aClass235_1.method4970();
						} else {
							local501 = 0;
							if (local747.anInt6228 == 1) {
								local501 = (local478 >> 4) * local747.anInt6213;
							} else if (local747.anInt6228 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6213;
							}
							if (local747.anInt6223 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6212;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6212;
								local537 = (local444 << 15) / local478 * local747.anInt6212;
								if (local747.anInt6219 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt543 += local939 * arg1 >> 15;
									super.anInt544 += local948 * arg1 >> 15;
									super.anInt547 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6219 == 0) {
								local65 += (local743.anInt635 - local501) * arg1;
								local82 += (local747.anInt6217 - local501) * arg1;
								local99 += (local743.anInt633 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt543 += (local743.anInt635 - local501) * arg1;
								super.anInt544 += (local747.anInt6217 - local501) * arg1;
								super.anInt547 += (local743.anInt633 - local501) * arg1;
							}
							local743 = (Class2_Sub5_Sub1) Static54.aClass235_1.method4970();
						}
					}
				}
			}
		}
		if (local35.anIntArray332 != null) {
			if (local35.anIntArray334 == null) {
				local35.anIntArray334 = new int[local35.anIntArray332.length];
				for (local313 = 0; local313 < local35.anIntArray332.length; local313++) {
					Static103.method1478(local35.anIntArray332[local313]);
					local35.anIntArray334[local313] = ((Class2_Sub20) Static43.aClass72_10.method1659((long) local35.anIntArray332[local313])).anInt2212;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray334.length; local313++) {
				@Pc(1082) Class228 local1082 = Static241.aClass228Array1[local35.anIntArray334[local313]];
				if (local1082.anInt6219 == 0) {
					local65 += local1082.anInt6214 * arg1;
					local82 += local1082.anInt6217 * arg1;
					local99 += local1082.anInt6216 * arg1;
					local303 = true;
				} else {
					super.anInt543 += local1082.anInt6214 * arg1;
					super.anInt544 += local1082.anInt6217 * arg1;
					super.anInt547 += local1082.anInt6216 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort4 = (short) local65;
					this.aShort6 = (short) local82;
					this.aShort1 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt551 <<= 0x1;
			}
		}
		super.anInt543 = (int) ((long) super.anInt543 + ((long) this.aShort4 * (long) this.anInt551 >> 23) * (long) arg1);
		super.anInt544 = (int) ((long) super.anInt544 + ((long) this.aShort6 * (long) this.anInt551 >> 23) * (long) arg1);
		super.anInt547 = (int) ((long) super.anInt547 + ((long) this.aShort1 * (long) this.anInt551 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
	private void method443() {
		@Pc(4) int local4 = this.aClass21_Sub3_1.aClass21_Sub2_3.anInt784;
		if (this.aClass21_Sub3_1.aClass21_Sub2_3.aClass21_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass21_Sub3_1.aClass21_Sub2_3.aClass21_Sub1_Sub1_Sub1Array1[local4].method445();
		}
		this.aClass21_Sub3_1.aClass21_Sub2_3.aClass21_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort2 = (short) this.aClass21_Sub3_1.aClass21_Sub2_3.anInt784;
		this.aClass21_Sub3_1.aClass21_Sub2_3.anInt784 = local4 + 1 & 0x1FFF;
		this.aClass21_Sub3_1.aClass93_2.method2079(this);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!h;IIIIIIIIIIIZZ)V")
	public void method444(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass21_Sub3_1 = arg0;
		super.anInt543 = arg1 << 12;
		super.anInt544 = arg2 << 12;
		super.anInt547 = arg3 << 12;
		super.anInt545 = arg9;
		this.aShort5 = this.aShort3 = (short) arg8;
		super.anInt542 = arg10;
		super.anInt548 = arg11;
		super.aBoolean53 = arg13;
		this.aShort4 = (short) arg4;
		this.aShort6 = (short) arg5;
		this.aShort1 = (short) arg6;
		this.anInt551 = arg7;
		super.aByte6 = this.aClass21_Sub3_1.aClass155_1.aByte41;
		this.method443();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
	private void method445() {
		this.aClass21_Sub3_1.aClass21_Sub2_3.aClass21_Sub1_Sub1_Sub1Array1[this.aShort2] = null;
		Static300.aClass21_Sub1_Sub1_Sub1Array2[Static364.anInt6131] = this;
		Static364.anInt6131 = Static364.anInt6131 + 1 & 0x3FF;
		this.method5593();
		this.method2008();
	}
}
