import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class22_Sub4_Sub1_Sub1 extends Class22_Sub4_Sub1 {

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
	private int anInt4016;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!me;")
	private Class22_Sub7 aClass22_Sub7_1;

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!mh", name = "W", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
	private int anInt4017;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!me;IIIIIIIIIIIZ)V")
	public Class22_Sub4_Sub1_Sub1(@OriginalArg(0) Class22_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass22_Sub7_1 = arg0;
		super.anInt4005 = arg1 << Static311.anInt5504;
		super.anInt4014 = arg2 << Static311.anInt5504;
		super.anInt4015 = arg3 << Static311.anInt5504;
		super.anInt4010 = arg9;
		this.aShort63 = this.aShort58 = (short) arg8;
		super.anInt4006 = arg10;
		super.anInt4008 = arg11;
		this.aShort62 = (short) arg4;
		this.aShort61 = (short) arg5;
		this.aShort59 = (short) arg6;
		this.anInt4017 = arg7;
		super.aByte39 = this.aClass22_Sub7_1.aClass191_1.aByte54;
		this.method3664();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	private void method3662() {
		this.aClass22_Sub7_1.aClass22_Sub6_5.aClass22_Sub4_Sub1_Sub1Array2[this.aShort60] = null;
		Static48.aClass22_Sub4_Sub1_Sub1Array1[Static55.anInt1143] = this;
		Static55.anInt1143 = Static55.anInt1143 + 1 & 0x3FF;
		this.method5237();
		this.method3658();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!me;IIIIIIIIIIIZ)V")
	public void method3663(@OriginalArg(0) Class22_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass22_Sub7_1 = arg0;
		super.anInt4005 = arg1 << Static311.anInt5504;
		super.anInt4014 = arg2 << Static311.anInt5504;
		super.anInt4015 = arg3 << Static311.anInt5504;
		super.anInt4010 = arg9;
		this.aShort63 = this.aShort58 = (short) arg8;
		super.anInt4006 = arg10;
		super.anInt4008 = arg11;
		this.aShort62 = (short) arg4;
		this.aShort61 = (short) arg5;
		this.aShort59 = (short) arg6;
		this.anInt4017 = arg7;
		super.aByte39 = this.aClass22_Sub7_1.aClass191_1.aByte54;
		this.method3664();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()V")
	private void method3664() {
		@Pc(4) int local4 = this.aClass22_Sub7_1.aClass22_Sub6_5.anInt3869;
		if (this.aClass22_Sub7_1.aClass22_Sub6_5.aClass22_Sub4_Sub1_Sub1Array2[local4] != null) {
			this.aClass22_Sub7_1.aClass22_Sub6_5.aClass22_Sub4_Sub1_Sub1Array2[local4].method3662();
		}
		this.aClass22_Sub7_1.aClass22_Sub6_5.aClass22_Sub4_Sub1_Sub1Array2[local4] = this;
		this.aShort60 = (short) this.aClass22_Sub7_1.aClass22_Sub6_5.anInt3869;
		this.aClass22_Sub7_1.aClass22_Sub6_5.anInt3869 = local4 + 1 & 0x1FFF;
		this.aClass22_Sub7_1.aClass56_6.method1253(this);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
	public void method3665(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort58 = (short) (this.aShort58 - arg1);
		if (this.aShort58 <= 0) {
			this.method3662();
			return;
		}
		@Pc(17) int local17 = super.anInt4005 >> Static311.anInt5504;
		@Pc(22) int local22 = super.anInt4014 >> Static311.anInt5504;
		@Pc(27) int local27 = super.anInt4015 >> Static311.anInt5504;
		@Pc(31) Class22_Sub6 local31 = this.aClass22_Sub7_1.aClass22_Sub6_5;
		@Pc(35) Class183 local35 = this.aClass22_Sub7_1.aClass183_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5064 != 0) {
			if (this.aShort63 - this.aShort58 <= local35.anInt5055) {
				local65 = (super.anInt4010 >> 8 & 0xFF00) + (this.anInt4016 >> 16 & 0xFF) + local35.anInt5078 * arg1;
				local82 = (super.anInt4010 & 0xFF00) + (this.anInt4016 >> 8 & 0xFF) + local35.anInt5079 * arg1;
				local99 = ((super.anInt4010 & 0xFF) << 8) + (this.anInt4016 & 0xFF) + local35.anInt5065 * arg1;
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
				super.anInt4010 &= 0xFF000000;
				super.anInt4010 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4016 &= 0xFF000000;
				this.anInt4016 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort63 - this.aShort58 <= local35.anInt5043) {
				local65 = (super.anInt4010 >> 16 & 0xFF00) + (this.anInt4016 >> 24 & 0xFF) + local35.anInt5073 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4010 &= 0xFFFFFF;
				super.anInt4010 |= (local65 & 0xFF00) << 16;
				this.anInt4016 &= 0xFFFFFF;
				this.anInt4016 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5042 != -1 && this.aShort63 - this.aShort58 <= local35.anInt5054) {
			this.anInt4017 += local35.anInt5084 * arg1;
		}
		if (local35.anInt5048 != -1 && this.aShort63 - this.aShort58 <= local35.anInt5044) {
			super.anInt4006 += local35.anInt5090 * arg1;
		}
		local65 = this.aShort62;
		local82 = this.aShort61;
		local99 = this.aShort59;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5089 == 1) {
			local313 = local17 - this.aClass22_Sub7_1.anInt3986;
			local319 = local22 - this.aClass22_Sub7_1.anInt3961;
			local325 = local27 - this.aClass22_Sub7_1.anInt3960;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5059 * local340 * arg1;
			this.anInt4017 = (int) ((long) this.anInt4017 - ((long) this.anInt4017 * local348 >> 18));
		} else if (local35.anInt5089 == 2) {
			local313 = local17 - this.aClass22_Sub7_1.anInt3986;
			local319 = local22 - this.aClass22_Sub7_1.anInt3961;
			local325 = local27 - this.aClass22_Sub7_1.anInt3960;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5059 * local340 * arg1;
			this.anInt4017 = (int) ((long) this.anInt4017 - ((long) this.anInt4017 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray629 != null) {
			@Pc(426) Class2 local426 = local31.aClass210_28.aClass2_199;
			for (@Pc(429) Class2 local429 = local426.aClass2_244; local429 != local426; local429 = local429.aClass2_244) {
				@Pc(433) Class2_Sub1_Sub13 local433 = (Class2_Sub1_Sub13) local429;
				@Pc(436) Class24 local436 = local433.aClass24_1;
				if (local436.anInt575 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray629.length; local444++) {
						if (local35.anIntArray629[local444] == local436.anInt584) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4933;
						@Pc(473) int local473 = local22 - local433.anInt4932;
						local478 = local27 - local433.anInt4934;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong24) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4931 + local473 * local436.anInt571 + local478 * local433.anInt4935) * 65535L / (long) (local436.anInt572 * local501);
							if (local529 >= (long) local436.anInt573) {
								local537 = 0;
								if (local436.anInt576 == 1) {
									local537 = (local501 >> 4) * local436.anInt570;
								} else if (local436.anInt576 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt570;
								}
								if (local436.anInt585 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt572;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt572;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt572;
									if (local436.anInt574 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4005 += local643 * arg1 >> 15;
										super.anInt4014 += local652 * arg1 >> 15;
										super.anInt4015 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt574 == 0) {
									local65 += (local433.anInt4931 - local537) * arg1;
									local82 += (local436.anInt571 - local537) * arg1;
									local99 += (local433.anInt4935 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4005 += (local433.anInt4931 - local537) * arg1;
									super.anInt4014 += (local436.anInt571 - local537) * arg1;
									super.anInt4015 += (local433.anInt4935 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray627 != null) {
			for (local313 = 0; local313 < local35.anIntArray627.length; local313++) {
				@Pc(743) Class2_Sub1_Sub13 local743 = (Class2_Sub1_Sub13) Static307.aClass100_1.method2334((long) local35.anIntArray627[local313]);
				while (local743 != null) {
					@Pc(747) Class24 local747 = local743.aClass24_1;
					local340 = local17 - local743.anInt4933;
					@Pc(757) int local757 = local22 - local743.anInt4932;
					local444 = local27 - local743.anInt4934;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong24) {
						local743 = (Class2_Sub1_Sub13) Static307.aClass100_1.method2335();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4931 + local757 * local747.anInt571 + local444 * local743.anInt4935) * 65535L / (long) (local747.anInt572 * local478);
						if (local491 < (long) local747.anInt573) {
							local743 = (Class2_Sub1_Sub13) Static307.aClass100_1.method2335();
						} else {
							local501 = 0;
							if (local747.anInt576 == 1) {
								local501 = (local478 >> 4) * local747.anInt570;
							} else if (local747.anInt576 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt570;
							}
							if (local747.anInt585 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt572;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt572;
								local537 = (local444 << 15) / local478 * local747.anInt572;
								if (local747.anInt574 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4005 += local939 * arg1 >> 15;
									super.anInt4014 += local948 * arg1 >> 15;
									super.anInt4015 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt574 == 0) {
								local65 += (local743.anInt4931 - local501) * arg1;
								local82 += (local747.anInt571 - local501) * arg1;
								local99 += (local743.anInt4935 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4005 += (local743.anInt4931 - local501) * arg1;
								super.anInt4014 += (local747.anInt571 - local501) * arg1;
								super.anInt4015 += (local743.anInt4935 - local501) * arg1;
							}
							local743 = (Class2_Sub1_Sub13) Static307.aClass100_1.method2335();
						}
					}
				}
			}
		}
		if (local35.anIntArray628 != null) {
			if (local35.anIntArray626 == null) {
				local35.anIntArray626 = new int[local35.anIntArray628.length];
				for (local313 = 0; local313 < local35.anIntArray628.length; local313++) {
					Static165.method2707(local35.anIntArray628[local313]);
					local35.anIntArray626[local313] = ((Class2_Sub44) Static17.aClass214_5.method5059((long) local35.anIntArray628[local313])).anInt6631;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray626.length; local313++) {
				@Pc(1082) Class24 local1082 = Static231.aClass24Array1[local35.anIntArray626[local313]];
				if (local1082.anInt574 == 0) {
					local65 += local1082.anInt578 * arg1;
					local82 += local1082.anInt571 * arg1;
					local99 += local1082.anInt579 * arg1;
					local303 = true;
				} else {
					super.anInt4005 += local1082.anInt578 * arg1;
					super.anInt4014 += local1082.anInt571 * arg1;
					super.anInt4015 += local1082.anInt579 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort62 = (short) local65;
					this.aShort61 = (short) local82;
					this.aShort59 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4017 <<= 0x1;
			}
		}
		super.anInt4005 = (int) ((long) super.anInt4005 + ((long) this.aShort62 * (long) this.anInt4017 >> 23) * (long) arg1);
		super.anInt4014 = (int) ((long) super.anInt4014 + ((long) this.aShort61 * (long) this.anInt4017 >> 23) * (long) arg1);
		super.anInt4015 = (int) ((long) super.anInt4015 + ((long) this.aShort59 * (long) this.anInt4017 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(J)V")
	public void method3666(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt4005 >> 19;
		@Pc(9) int local9 = super.anInt4015 >> 19;
		@Pc(14) int local14 = super.anInt4014 >> Static311.anInt5504;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static166.anInt2967 || local9 < 0 || local9 >= Static244.anInt1024) {
			this.method3662();
			return;
		}
		@Pc(36) Class22_Sub6 local36 = this.aClass22_Sub7_1.aClass22_Sub6_5;
		@Pc(40) Class183 local40 = this.aClass22_Sub7_1.aClass183_1;
		@Pc(42) Class33[] local42 = Static17.aClass33Array1;
		@Pc(50) int local50 = local42[local36.anInt3871].method4057(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt3871 < Static32.anInt6037 - 1) {
			local66 = local42[local36.anInt3871 + 1].method4057(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean371) {
			if (local40.anInt5091 == -1 && local14 > local50) {
				this.method3662();
				return;
			}
			if (local40.anInt5091 >= 0 && local14 > local42[local40.anInt5091].method4057(local4, local9)) {
				this.method3662();
				return;
			}
			if (local40.anInt5058 == -1 && local14 < local66) {
				this.method3662();
				return;
			}
			if (local40.anInt5058 >= 0 && local14 < local42[local40.anInt5058 + 1].method4057(local4, local9)) {
				this.method3662();
				return;
			}
		}
		if (local4 >= local36.anInt3876 && local4 <= local36.anInt3875 && local9 >= local36.anInt3873 && local9 <= local36.anInt3874 && local14 <= local50 && local14 >= local66) {
			local36.aClass157_1.aClass228_1.method5364(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static32.anInt6037 - 1; local152 > 0 && local14 > local42[local152].method4057(local4, local9); local152--) {
		}
		if (local152 == Static32.anInt6037 - 1 && local42[local152].method4057(local4, local9) - local14 > 1024) {
			this.method3662();
			return;
		}
		@Pc(190) Class227 local190 = Static297.aClass227ArrayArrayArray7[local152][local4][local9];
		if (local190 == null) {
			@Pc(205) boolean local205 = Static297.aClass227ArrayArrayArray7[0][local4][local9].aClass227_1 != null;
			if (local152 == 3 && local205) {
				this.method3662();
				return;
			}
			for (@Pc(215) int local215 = 1; local215 <= local152; local215++) {
				if (Static297.aClass227ArrayArrayArray7[local215][local4][local9] == null) {
					local190 = Static297.aClass227ArrayArrayArray7[local215][local4][local9] = new Class227(local215, local4, local9);
					if (local205) {
						local190.aByte68++;
					}
				}
			}
		}
		if (local190.aClass157_2 == null) {
			local190.aClass157_2 = new Class157();
			local190.aByte70 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte70 != (byte) (arg0 & 0xFFL)) {
			local190.aClass157_2 = new Class157();
			local190.aByte70 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass157_2.aClass228_1.method5364(this);
	}
}
