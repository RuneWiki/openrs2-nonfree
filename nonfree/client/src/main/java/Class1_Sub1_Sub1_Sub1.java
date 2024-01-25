import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
	private int anInt6425;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "Lclient!bq;")
	private Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
	private int anInt6424;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!bq;IIIIIIIIIIIZ)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass1_Sub2_1 = arg0;
		super.anInt6421 = arg1 << Static190.anInt3903;
		super.anInt6418 = arg2 << Static190.anInt3903;
		super.anInt6410 = arg3 << Static190.anInt3903;
		super.anInt6412 = arg9;
		this.aShort88 = this.aShort85 = (short) arg8;
		super.anInt6420 = arg10;
		super.anInt6411 = arg11;
		this.aShort84 = (short) arg4;
		this.aShort89 = (short) arg5;
		this.aShort87 = (short) arg6;
		this.anInt6424 = arg7;
		super.aByte68 = this.aClass1_Sub2_1.aClass115_1.aByte28;
		this.method5716();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(JI)V")
	public void method5712(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort85 = (short) (this.aShort85 - arg1);
		if (this.aShort85 <= 0) {
			this.method5713();
			return;
		}
		@Pc(17) int local17 = super.anInt6421 >> Static190.anInt3903;
		@Pc(22) int local22 = super.anInt6418 >> Static190.anInt3903;
		@Pc(27) int local27 = super.anInt6410 >> Static190.anInt3903;
		@Pc(31) Class1_Sub7 local31 = this.aClass1_Sub2_1.aClass1_Sub7_1;
		@Pc(35) Class167 local35 = this.aClass1_Sub2_1.aClass167_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt4969 != 0) {
			if (this.aShort88 - this.aShort85 <= local35.anInt4944) {
				local65 = (super.anInt6412 >> 8 & 0xFF00) + (this.anInt6425 >> 16 & 0xFF) + local35.anInt4948 * arg1;
				local82 = (super.anInt6412 & 0xFF00) + (this.anInt6425 >> 8 & 0xFF) + local35.anInt4970 * arg1;
				local99 = ((super.anInt6412 & 0xFF) << 8) + (this.anInt6425 & 0xFF) + local35.anInt4921 * arg1;
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
				super.anInt6412 &= 0xFF000000;
				super.anInt6412 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6425 &= 0xFF000000;
				this.anInt6425 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort88 - this.aShort85 <= local35.anInt4971) {
				local65 = (super.anInt6412 >> 16 & 0xFF00) + (this.anInt6425 >> 24 & 0xFF) + local35.anInt4957 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6412 &= 0xFFFFFF;
				super.anInt6412 |= (local65 & 0xFF00) << 16;
				this.anInt6425 &= 0xFFFFFF;
				this.anInt6425 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4953 != -1 && this.aShort88 - this.aShort85 <= local35.anInt4935) {
			this.anInt6424 += local35.anInt4922 * arg1;
		}
		if (local35.anInt4936 != -1 && this.aShort88 - this.aShort85 <= local35.anInt4962) {
			super.anInt6420 += local35.anInt4967 * arg1;
		}
		local65 = this.aShort84;
		local82 = this.aShort89;
		local99 = this.aShort87;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt4972 == 1) {
			local313 = local17 - this.aClass1_Sub2_1.anInt711;
			local319 = local22 - this.aClass1_Sub2_1.anInt702;
			local325 = local27 - this.aClass1_Sub2_1.anInt714;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt4961 * local340 * arg1;
			this.anInt6424 = (int) ((long) this.anInt6424 - ((long) this.anInt6424 * local348 >> 18));
		} else if (local35.anInt4972 == 2) {
			local313 = local17 - this.aClass1_Sub2_1.anInt711;
			local319 = local22 - this.aClass1_Sub2_1.anInt702;
			local325 = local27 - this.aClass1_Sub2_1.anInt714;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt4961 * local340 * arg1;
			this.anInt6424 = (int) ((long) this.anInt6424 - ((long) this.anInt6424 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray450 != null) {
			@Pc(426) Class14 local426 = local31.aClass18_30.aClass14_17;
			for (@Pc(429) Class14 local429 = local426.aClass14_248; local429 != local426; local429 = local429.aClass14_248) {
				@Pc(433) Class14_Sub2_Sub5 local433 = (Class14_Sub2_Sub5) local429;
				@Pc(436) Class129 local436 = local433.aClass129_1;
				if (local436.anInt3771 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray450.length; local444++) {
						if (local35.anIntArray450[local444] == local436.anInt3779) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1402;
						@Pc(473) int local473 = local22 - local433.anInt1397;
						local478 = local27 - local433.anInt1403;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong117) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1400 + local473 * local436.anInt3772 + local478 * local433.anInt1404) * 65535L / (long) (local436.anInt3764 * local501);
							if (local529 >= (long) local436.anInt3777) {
								local537 = 0;
								if (local436.anInt3782 == 1) {
									local537 = (local501 >> 4) * local436.anInt3767;
								} else if (local436.anInt3782 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3767;
								}
								if (local436.anInt3781 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3764;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3764;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3764;
									if (local436.anInt3783 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6421 += local643 * arg1 >> 15;
										super.anInt6418 += local652 * arg1 >> 15;
										super.anInt6410 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3783 == 0) {
									local65 += (local433.anInt1400 - local537) * arg1;
									local82 += (local436.anInt3772 - local537) * arg1;
									local99 += (local433.anInt1404 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6421 += (local433.anInt1400 - local537) * arg1;
									super.anInt6418 += (local436.anInt3772 - local537) * arg1;
									super.anInt6410 += (local433.anInt1404 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray451 != null) {
			for (local313 = 0; local313 < local35.anIntArray451.length; local313++) {
				@Pc(743) Class14_Sub2_Sub5 local743 = (Class14_Sub2_Sub5) Static253.aClass77_2.method2262((long) local35.anIntArray451[local313]);
				while (local743 != null) {
					@Pc(747) Class129 local747 = local743.aClass129_1;
					local340 = local17 - local743.anInt1402;
					@Pc(757) int local757 = local22 - local743.anInt1397;
					local444 = local27 - local743.anInt1403;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong117) {
						local743 = (Class14_Sub2_Sub5) Static253.aClass77_2.method2263();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1400 + local757 * local747.anInt3772 + local444 * local743.anInt1404) * 65535L / (long) (local747.anInt3764 * local478);
						if (local491 < (long) local747.anInt3777) {
							local743 = (Class14_Sub2_Sub5) Static253.aClass77_2.method2263();
						} else {
							local501 = 0;
							if (local747.anInt3782 == 1) {
								local501 = (local478 >> 4) * local747.anInt3767;
							} else if (local747.anInt3782 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3767;
							}
							if (local747.anInt3781 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3764;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3764;
								local537 = (local444 << 15) / local478 * local747.anInt3764;
								if (local747.anInt3783 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6421 += local939 * arg1 >> 15;
									super.anInt6418 += local948 * arg1 >> 15;
									super.anInt6410 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3783 == 0) {
								local65 += (local743.anInt1400 - local501) * arg1;
								local82 += (local747.anInt3772 - local501) * arg1;
								local99 += (local743.anInt1404 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6421 += (local743.anInt1400 - local501) * arg1;
								super.anInt6418 += (local747.anInt3772 - local501) * arg1;
								super.anInt6410 += (local743.anInt1404 - local501) * arg1;
							}
							local743 = (Class14_Sub2_Sub5) Static253.aClass77_2.method2263();
						}
					}
				}
			}
		}
		if (local35.anIntArray449 != null) {
			if (local35.anIntArray448 == null) {
				local35.anIntArray448 = new int[local35.anIntArray449.length];
				for (local313 = 0; local313 < local35.anIntArray449.length; local313++) {
					Static157.method3071(local35.anIntArray449[local313]);
					local35.anIntArray448[local313] = ((Class14_Sub34) Static182.aClass25_19.method691((long) local35.anIntArray449[local313])).anInt6039;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray448.length; local313++) {
				@Pc(1082) Class129 local1082 = Static39.aClass129Array1[local35.anIntArray448[local313]];
				if (local1082.anInt3783 == 0) {
					local65 += local1082.anInt3770 * arg1;
					local82 += local1082.anInt3772 * arg1;
					local99 += local1082.anInt3762 * arg1;
					local303 = true;
				} else {
					super.anInt6421 += local1082.anInt3770 * arg1;
					super.anInt6418 += local1082.anInt3772 * arg1;
					super.anInt6410 += local1082.anInt3762 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort84 = (short) local65;
					this.aShort89 = (short) local82;
					this.aShort87 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6424 <<= 0x1;
			}
		}
		super.anInt6421 = (int) ((long) super.anInt6421 + ((long) this.aShort84 * (long) this.anInt6424 >> 23) * (long) arg1);
		super.anInt6418 = (int) ((long) super.anInt6418 + ((long) this.aShort89 * (long) this.anInt6424 >> 23) * (long) arg1);
		super.anInt6410 = (int) ((long) super.anInt6410 + ((long) this.aShort87 * (long) this.anInt6424 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	private void method5713() {
		this.aClass1_Sub2_1.aClass1_Sub7_1.aClass1_Sub1_Sub1_Sub1Array2[this.aShort86] = null;
		Static138.aClass1_Sub1_Sub1_Sub1Array1[Static22.anInt450] = this;
		Static22.anInt450 = Static22.anInt450 + 1 & 0x3FF;
		this.method5701();
		this.method5703();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!bq;IIIIIIIIIIIZ)V")
	public void method5714(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass1_Sub2_1 = arg0;
		super.anInt6421 = arg1 << Static190.anInt3903;
		super.anInt6418 = arg2 << Static190.anInt3903;
		super.anInt6410 = arg3 << Static190.anInt3903;
		super.anInt6412 = arg9;
		this.aShort88 = this.aShort85 = (short) arg8;
		super.anInt6420 = arg10;
		super.anInt6411 = arg11;
		this.aShort84 = (short) arg4;
		this.aShort89 = (short) arg5;
		this.aShort87 = (short) arg6;
		this.anInt6424 = arg7;
		super.aByte68 = this.aClass1_Sub2_1.aClass115_1.aByte28;
		this.method5716();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(J)V")
	public void method5715(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt6421 >> 19;
		@Pc(9) int local9 = super.anInt6410 >> 19;
		@Pc(14) int local14 = super.anInt6418 >> Static190.anInt3903;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static233.anInt4556 || local9 < 0 || local9 >= Static180.anInt3712) {
			this.method5713();
			return;
		}
		@Pc(36) Class1_Sub7 local36 = this.aClass1_Sub2_1.aClass1_Sub7_1;
		@Pc(40) Class167 local40 = this.aClass1_Sub2_1.aClass167_1;
		@Pc(42) Class114[] local42 = Static158.aClass114Array2;
		@Pc(50) int local50 = local42[local36.anInt4798].method3610(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt4798 < 3) {
			local64 = local42[local36.anInt4798 + 1].method3610(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean330) {
			if (local40.anInt4920 == -1 && local14 > local50) {
				this.method5713();
				return;
			}
			if (local40.anInt4920 >= 0 && local14 > local42[local40.anInt4920].method3610(local4, local9)) {
				this.method5713();
				return;
			}
			if (local40.anInt4939 == -1 && local14 < local64) {
				this.method5713();
				return;
			}
			if (local40.anInt4939 >= 0 && local14 < local42[local40.anInt4939 + 1].method3610(local4, local9)) {
				this.method5713();
				return;
			}
		}
		if (local4 >= local36.anInt4800 && local4 <= local36.anInt4797 && local9 >= local36.anInt4801 && local9 <= local36.anInt4797 && local14 <= local50 && local14 >= local64) {
			local36.aClass109_1.aClass70_1.method2172(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method3610(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method3610(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method3610(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method3610(local4, local9) - 1024) {
			this.method5713();
			return;
		}
		@Pc(202) Class213 local202 = Static98.aClass213ArrayArrayArray2[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static98.aClass213ArrayArrayArray2[0][local4][local9].aClass213_1 != null;
			if (local148 == 3 && local217) {
				this.method5713();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static98.aClass213ArrayArrayArray2[local227][local4][local9] == null) {
					local202 = Static98.aClass213ArrayArrayArray2[local227][local4][local9] = new Class213(local227, local4, local9);
					if (local217) {
						local202.aByte73++;
					}
				}
			}
		}
		if (local202.aClass109_2 == null) {
			local202.aClass109_2 = new Class109();
			local202.aByte71 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte71 != (byte) (arg0 & 0xFFL)) {
			local202.aClass109_2 = new Class109();
			local202.aByte71 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass109_2.aClass70_1.method2172(this);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
	private void method5716() {
		@Pc(4) int local4 = this.aClass1_Sub2_1.aClass1_Sub7_1.anInt4795;
		if (this.aClass1_Sub2_1.aClass1_Sub7_1.aClass1_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass1_Sub2_1.aClass1_Sub7_1.aClass1_Sub1_Sub1_Sub1Array2[local4].method5713();
		}
		this.aClass1_Sub2_1.aClass1_Sub7_1.aClass1_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort86 = (short) this.aClass1_Sub2_1.aClass1_Sub7_1.anInt4795;
		this.aClass1_Sub2_1.aClass1_Sub7_1.anInt4795 = local4 + 1 & 0x1FFF;
		this.aClass1_Sub2_1.aClass126_1.method3401(this);
	}
}
