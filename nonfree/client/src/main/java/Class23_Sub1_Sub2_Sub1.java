import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class23_Sub1_Sub2_Sub1 extends Class23_Sub1_Sub2 {

	@OriginalMember(owner = "client!mr", name = "F", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
	private int anInt4422;

	@OriginalMember(owner = "client!mr", name = "J", descriptor = "Lclient!vd;")
	private Class23_Sub8 aClass23_Sub8_1;

	@OriginalMember(owner = "client!mr", name = "L", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!mr", name = "M", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!mr", name = "N", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
	private int anInt4423;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!vd;IIIIIIIIIIIZZ)V")
	public Class23_Sub1_Sub2_Sub1(@OriginalArg(0) Class23_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass23_Sub8_1 = arg0;
		super.anInt4414 = arg1 << 12;
		super.anInt4417 = arg2 << 12;
		super.anInt4421 = arg3 << 12;
		super.anInt4420 = arg9;
		this.aShort54 = this.aShort55 = (short) arg8;
		super.anInt4413 = arg10;
		super.anInt4416 = arg11;
		super.aBoolean321 = arg13;
		this.aShort56 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort53 = (short) arg6;
		this.anInt4423 = arg7;
		super.aByte50 = this.aClass23_Sub8_1.aClass141_2.aByte46;
		this.method3693();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!vd;IIIIIIIIIIIZZ)V")
	public void method3689(@OriginalArg(0) Class23_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass23_Sub8_1 = arg0;
		super.anInt4414 = arg1 << 12;
		super.anInt4417 = arg2 << 12;
		super.anInt4421 = arg3 << 12;
		super.anInt4420 = arg9;
		this.aShort54 = this.aShort55 = (short) arg8;
		super.anInt4413 = arg10;
		super.anInt4416 = arg11;
		super.aBoolean321 = arg13;
		this.aShort56 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort53 = (short) arg6;
		this.anInt4423 = arg7;
		super.aByte50 = this.aClass23_Sub8_1.aClass141_2.aByte46;
		this.method3693();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(J)V")
	public void method3690(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt4414 >> Static437.anInt7308 + 12;
		@Pc(13) int local13 = super.anInt4421 >> Static437.anInt7308 + 12;
		@Pc(18) int local18 = super.anInt4417 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static459.anInt5916 || local13 < 0 || local13 >= Static342.anInt5746) {
			this.method3691();
			return;
		}
		@Pc(40) Class23_Sub3 local40 = this.aClass23_Sub8_1.aClass23_Sub3_6;
		@Pc(44) Class248 local44 = this.aClass23_Sub8_1.aClass248_1;
		@Pc(46) Class55[] local46 = Static178.aClass55Array1;
		@Pc(54) int local54 = local46[local40.anInt3462].oa(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt3462 < Static174.anInt3263 - 1) {
			local70 = local46[local40.anInt3462 + 1].oa(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static437.anInt7308);
		}
		if (local44.lb) {
			if (local44.anInt7061 == -1 && local18 > local54) {
				this.method3691();
				return;
			}
			if (local44.anInt7061 >= 0 && local18 > local46[local44.anInt7061].oa(local6, local13)) {
				this.method3691();
				return;
			}
			if (local44.anInt7054 == -1 && local18 < local70) {
				this.method3691();
				return;
			}
			if (local44.anInt7054 >= 0 && local18 < local46[local44.anInt7054 + 1].oa(local6, local13)) {
				this.method3691();
				return;
			}
		}
		if (local6 >= local40.anInt3465 && local6 <= local40.anInt3461 && local13 >= local40.anInt3464 && local13 <= local40.anInt3463 && local18 <= local54 && local18 >= local70) {
			local40.aClass77_1.aClass222_1.method5211(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static174.anInt3263 - 1; local158 > 0 && local18 > local46[local158].oa(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].oa(local6, local13)) {
			this.method3691();
		} else if (local158 == Static174.anInt3263 - 1 && local46[local158].oa(local6, local13) - local18 > 0x8 << Static437.anInt7308) {
			this.method3691();
		} else {
			@Pc(211) Class227 local211 = Static389.aClass227ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static389.aClass227ArrayArrayArray3[0][local6][local13] = new Class227(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static389.aClass227ArrayArrayArray3[0][local6][local13].aClass227_1 != null;
				if (local158 == 3 && local243) {
					this.method3691();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static389.aClass227ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static389.aClass227ArrayArrayArray3[local253][local6][local13] = new Class227(local253, local6, local13);
						if (local243) {
							local211.aByte81++;
						}
					}
				}
			}
			if (local211.aClass77_2 == null) {
				local211.aClass77_2 = new Class77();
				local211.aByte80 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte80 != (byte) (arg0 & 0xFFL)) {
				local211.aClass77_2.aClass222_1.method5213();
				local211.aClass77_2.aBoolean124 = false;
				local211.aByte80 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass77_2.aClass222_1.method5211(this);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "()V")
	private void method3691() {
		this.aClass23_Sub8_1.aClass23_Sub3_6.aClass23_Sub1_Sub2_Sub1Array1[this.aShort52] = null;
		Static380.aClass23_Sub1_Sub2_Sub1Array2[Static298.anInt5158] = this;
		Static298.anInt5158 = Static298.anInt5158 + 1 & 0x3FF;
		this.method5853();
		this.method3683();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(JI)V")
	public void method3692(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort55 = (short) (this.aShort55 - arg1);
		if (this.aShort55 <= 0) {
			this.method3691();
			return;
		}
		@Pc(17) int local17 = super.anInt4414 >> 12;
		@Pc(22) int local22 = super.anInt4417 >> 12;
		@Pc(27) int local27 = super.anInt4421 >> 12;
		@Pc(31) Class23_Sub3 local31 = this.aClass23_Sub8_1.aClass23_Sub3_6;
		@Pc(35) Class248 local35 = this.aClass23_Sub8_1.aClass248_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt7037 != 0) {
			if (this.aShort54 - this.aShort55 <= local35.anInt7081) {
				local65 = (super.anInt4420 >> 8 & 0xFF00) + (this.anInt4422 >> 16 & 0xFF) + local35.anInt7043 * arg1;
				local82 = (super.anInt4420 & 0xFF00) + (this.anInt4422 >> 8 & 0xFF) + local35.anInt7052 * arg1;
				local99 = ((super.anInt4420 & 0xFF) << 8) + (this.anInt4422 & 0xFF) + local35.anInt7041 * arg1;
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
				super.anInt4420 &= 0xFF000000;
				super.anInt4420 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4422 &= 0xFF000000;
				this.anInt4422 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort54 - this.aShort55 <= local35.anInt7071) {
				local65 = (super.anInt4420 >> 16 & 0xFF00) + (this.anInt4422 >> 24 & 0xFF) + local35.anInt7075 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4420 &= 0xFFFFFF;
				super.anInt4420 |= (local65 & 0xFF00) << 16;
				this.anInt4422 &= 0xFFFFFF;
				this.anInt4422 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt7036 != -1 && this.aShort54 - this.aShort55 <= local35.anInt7045) {
			this.anInt4423 += local35.anInt7064 * arg1;
		}
		if (local35.anInt7087 != -1 && this.aShort54 - this.aShort55 <= local35.anInt7084) {
			super.anInt4413 += local35.anInt7062 * arg1;
		}
		local65 = this.aShort56;
		local82 = this.aShort57;
		local99 = this.aShort53;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt7047 == 1) {
			local313 = local17 - this.aClass23_Sub8_1.anInt7216;
			local319 = local22 - this.aClass23_Sub8_1.anInt7224;
			local325 = local27 - this.aClass23_Sub8_1.anInt7230;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt7089 * local340 * arg1;
			this.anInt4423 = (int) ((long) this.anInt4423 - ((long) this.anInt4423 * local348 >> 18));
		} else if (local35.anInt7047 == 2) {
			local313 = local17 - this.aClass23_Sub8_1.anInt7216;
			local319 = local22 - this.aClass23_Sub8_1.anInt7224;
			local325 = local27 - this.aClass23_Sub8_1.anInt7230;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt7089 * local340 * arg1;
			this.anInt4423 = (int) ((long) this.anInt4423 - ((long) this.anInt4423 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray452 != null) {
			@Pc(426) Class3 local426 = local31.aClass193_28.aClass3_198;
			for (@Pc(429) Class3 local429 = local426.aClass3_268; local429 != local426; local429 = local429.aClass3_268) {
				@Pc(433) Class3_Sub3_Sub7 local433 = (Class3_Sub3_Sub7) local429;
				@Pc(436) Class69 local436 = local433.aClass69_1;
				if (local436.anInt1949 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray452.length; local444++) {
						if (local35.anIntArray452[local444] == local436.anInt1946) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1835;
						@Pc(473) int local473 = local22 - local433.anInt1831;
						local478 = local27 - local433.anInt1832;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong75) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1829 + local473 * local436.anInt1936 + local478 * local433.anInt1827) * 65535L / (long) (local436.anInt1944 * local501);
							if (local529 >= (long) local436.anInt1941) {
								local537 = 0;
								if (local436.anInt1942 == 1) {
									local537 = (local501 >> 4) * local436.anInt1943;
								} else if (local436.anInt1942 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt1943;
								}
								if (local436.anInt1938 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt1944;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt1944;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt1944;
									if (local436.anInt1947 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4414 += local643 * arg1 >> 15;
										super.anInt4417 += local652 * arg1 >> 15;
										super.anInt4421 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt1947 == 0) {
									local65 += (local433.anInt1829 - local537) * arg1;
									local82 += (local436.anInt1936 - local537) * arg1;
									local99 += (local433.anInt1827 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4414 += (local433.anInt1829 - local537) * arg1;
									super.anInt4417 += (local436.anInt1936 - local537) * arg1;
									super.anInt4421 += (local433.anInt1827 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray451 != null) {
			for (local313 = 0; local313 < local35.anIntArray451.length; local313++) {
				@Pc(743) Class3_Sub3_Sub7 local743 = (Class3_Sub3_Sub7) Static358.aClass243_1.method5559((long) local35.anIntArray451[local313]);
				while (local743 != null) {
					@Pc(747) Class69 local747 = local743.aClass69_1;
					local340 = local17 - local743.anInt1835;
					@Pc(757) int local757 = local22 - local743.anInt1831;
					local444 = local27 - local743.anInt1832;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong75) {
						local743 = (Class3_Sub3_Sub7) Static358.aClass243_1.method5563();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1829 + local757 * local747.anInt1936 + local444 * local743.anInt1827) * 65535L / (long) (local747.anInt1944 * local478);
						if (local491 < (long) local747.anInt1941) {
							local743 = (Class3_Sub3_Sub7) Static358.aClass243_1.method5563();
						} else {
							local501 = 0;
							if (local747.anInt1942 == 1) {
								local501 = (local478 >> 4) * local747.anInt1943;
							} else if (local747.anInt1942 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt1943;
							}
							if (local747.anInt1938 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt1944;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt1944;
								local537 = (local444 << 15) / local478 * local747.anInt1944;
								if (local747.anInt1947 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4414 += local939 * arg1 >> 15;
									super.anInt4417 += local948 * arg1 >> 15;
									super.anInt4421 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt1947 == 0) {
								local65 += (local743.anInt1829 - local501) * arg1;
								local82 += (local747.anInt1936 - local501) * arg1;
								local99 += (local743.anInt1827 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4414 += (local743.anInt1829 - local501) * arg1;
								super.anInt4417 += (local747.anInt1936 - local501) * arg1;
								super.anInt4421 += (local743.anInt1827 - local501) * arg1;
							}
							local743 = (Class3_Sub3_Sub7) Static358.aClass243_1.method5563();
						}
					}
				}
			}
		}
		if (local35.anIntArray450 != null) {
			if (local35.anIntArray449 == null) {
				local35.anIntArray449 = new int[local35.anIntArray450.length];
				for (local313 = 0; local313 < local35.anIntArray450.length; local313++) {
					Static57.method1105(local35.anIntArray450[local313]);
					local35.anIntArray449[local313] = ((Class3_Sub30) Static292.aClass140_29.method3490((long) local35.anIntArray450[local313])).anInt3957;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray449.length; local313++) {
				@Pc(1082) Class69 local1082 = Static195.aClass69Array1[local35.anIntArray449[local313]];
				if (local1082.anInt1947 == 0) {
					local65 += local1082.anInt1940 * arg1;
					local82 += local1082.anInt1936 * arg1;
					local99 += local1082.anInt1945 * arg1;
					local303 = true;
				} else {
					super.anInt4414 += local1082.anInt1940 * arg1;
					super.anInt4417 += local1082.anInt1936 * arg1;
					super.anInt4421 += local1082.anInt1945 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort56 = (short) local65;
					this.aShort57 = (short) local82;
					this.aShort53 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4423 <<= 0x1;
			}
		}
		super.anInt4414 = (int) ((long) super.anInt4414 + ((long) this.aShort56 * (long) this.anInt4423 >> 23) * (long) arg1);
		super.anInt4417 = (int) ((long) super.anInt4417 + ((long) this.aShort57 * (long) this.anInt4423 >> 23) * (long) arg1);
		super.anInt4421 = (int) ((long) super.anInt4421 + ((long) this.aShort53 * (long) this.anInt4423 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "()V")
	private void method3693() {
		@Pc(4) int local4 = this.aClass23_Sub8_1.aClass23_Sub3_6.anInt3459;
		if (this.aClass23_Sub8_1.aClass23_Sub3_6.aClass23_Sub1_Sub2_Sub1Array1[local4] != null) {
			this.aClass23_Sub8_1.aClass23_Sub3_6.aClass23_Sub1_Sub2_Sub1Array1[local4].method3691();
		}
		this.aClass23_Sub8_1.aClass23_Sub3_6.aClass23_Sub1_Sub2_Sub1Array1[local4] = this;
		this.aShort52 = (short) this.aClass23_Sub8_1.aClass23_Sub3_6.anInt3459;
		this.aClass23_Sub8_1.aClass23_Sub3_6.anInt3459 = local4 + 1 & 0x1FFF;
		this.aClass23_Sub8_1.aClass194_9.method4582(this);
	}
}
