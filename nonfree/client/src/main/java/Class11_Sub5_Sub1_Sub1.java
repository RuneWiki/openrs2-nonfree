import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class11_Sub5_Sub1_Sub1 extends Class11_Sub5_Sub1 {

	@OriginalMember(owner = "client!iga", name = "L", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!iga", name = "N", descriptor = "I")
	private int anInt4085;

	@OriginalMember(owner = "client!iga", name = "O", descriptor = "Lclient!dq;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!iga", name = "M", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!iga", name = "I", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!iga", name = "J", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!iga", name = "K", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!iga", name = "G", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!iga", name = "H", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!dq;IIIIIIIIIIIZZ)V")
	public Class11_Sub5_Sub1_Sub1(@OriginalArg(0) Class11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass11_Sub3_1 = arg0;
		super.anInt4083 = arg1 << 12;
		super.anInt4081 = arg2 << 12;
		super.anInt4077 = arg3 << 12;
		super.anInt4079 = arg9;
		this.aShort43 = this.aShort47 = (short) arg8;
		super.anInt4075 = arg10;
		super.anInt4078 = arg11;
		super.aBoolean287 = arg13;
		this.aShort44 = (short) arg4;
		this.aShort45 = (short) arg5;
		this.aShort42 = (short) arg6;
		this.anInt4084 = arg7;
		super.aByte54 = this.aClass11_Sub3_1.aClass244_1.aByte88;
		this.method3313();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "()V")
	private void method3313() {
		@Pc(4) int local4 = this.aClass11_Sub3_1.aClass11_Sub9_2.anInt6589;
		if (this.aClass11_Sub3_1.aClass11_Sub9_2.aClass11_Sub5_Sub1_Sub1Array1[local4] != null) {
			this.aClass11_Sub3_1.aClass11_Sub9_2.aClass11_Sub5_Sub1_Sub1Array1[local4].method3314();
		}
		this.aClass11_Sub3_1.aClass11_Sub9_2.aClass11_Sub5_Sub1_Sub1Array1[local4] = this;
		this.aShort46 = (short) this.aClass11_Sub3_1.aClass11_Sub9_2.anInt6589;
		this.aClass11_Sub3_1.aClass11_Sub9_2.anInt6589 = local4 + 1 & 0x1FFF;
		this.aClass11_Sub3_1.aClass196_1.method4032(this);
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "()V")
	public void method3314() {
		this.aClass11_Sub3_1.aClass11_Sub9_2.aClass11_Sub5_Sub1_Sub1Array1[this.aShort46] = null;
		Static561.aClass11_Sub5_Sub1_Sub1Array2[Static331.anInt6049] = this;
		Static331.anInt6049 = Static331.anInt6049 + 1 & 0x3FF;
		this.method7200();
		this.method3920();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!dq;IIIIIIIIIIIZZ)V")
	public void method3315(@OriginalArg(0) Class11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass11_Sub3_1 = arg0;
		super.anInt4083 = arg1 << 12;
		super.anInt4081 = arg2 << 12;
		super.anInt4077 = arg3 << 12;
		super.anInt4079 = arg9;
		this.aShort43 = this.aShort47 = (short) arg8;
		super.anInt4075 = arg10;
		super.anInt4078 = arg11;
		super.aBoolean287 = arg13;
		this.aShort44 = (short) arg4;
		this.aShort45 = (short) arg5;
		this.aShort42 = (short) arg6;
		this.anInt4084 = arg7;
		super.aByte54 = this.aClass11_Sub3_1.aClass244_1.aByte88;
		this.method3313();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!r;J)V")
	public void method3316(@OriginalArg(0) Class78 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt4083 >> Static166.anInt7796 + 12;
		@Pc(13) int local13 = super.anInt4077 >> Static166.anInt7796 + 12;
		@Pc(18) int local18 = super.anInt4081 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static327.anInt5993 || local13 < 0 || local13 >= Static191.anInt3757) {
			this.method3314();
			return;
		}
		@Pc(40) Class11_Sub9 local40 = this.aClass11_Sub3_1.aClass11_Sub9_2;
		@Pc(44) Class59 local44 = this.aClass11_Sub3_1.aClass59_1;
		@Pc(46) Class129[] local46 = Static310.aClass129Array5;
		@Pc(49) int local49 = local40.anInt6592;
		@Pc(58) Class360 local58 = Static568.aClass360ArrayArrayArray22[local40.anInt6592][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte129;
		}
		@Pc(71) int local71 = local46[local49].method6481(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static119.anInt2474 - 1) {
			local86 = local46[local49 + 1].method6481(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static166.anInt7796);
		}
		if (local44.aBoolean110) {
			if (local44.anInt1596 == -1 && local18 > local71) {
				this.method3314();
				return;
			}
			if (local44.anInt1596 >= 0 && local18 > local46[local44.anInt1596].method6481(local13, local6)) {
				this.method3314();
				return;
			}
			if (local44.anInt1616 == -1 && local18 < local86) {
				this.method3314();
				return;
			}
			if (local44.anInt1616 >= 0 && local18 < local46[local44.anInt1616 + 1].method6481(local13, local6)) {
				this.method3314();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static119.anInt2474 - 1; local154 > 0 && local18 > local46[local154].method6481(local13, local6); local154--) {
		}
		if (local44.aBoolean106 && local154 == 0 && local18 > local46[0].method6481(local13, local6)) {
			this.method3314();
		} else if (local154 == Static119.anInt2474 - 1 && local46[local154].method6481(local13, local6) - local18 > 0x8 << Static166.anInt7796) {
			this.method3314();
		} else {
			local58 = Static568.aClass360ArrayArrayArray22[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static568.aClass360ArrayArrayArray22[0][local6][local13] == null) {
					local58 = Static568.aClass360ArrayArrayArray22[0][local6][local13] = new Class360(0);
				}
				@Pc(251) boolean local251 = Static568.aClass360ArrayArrayArray22[0][local6][local13].aClass360_1 != null;
				if (local154 == 3 && local251) {
					this.method3314();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static568.aClass360ArrayArrayArray22[local261][local6][local13] == null) {
						local58 = Static568.aClass360ArrayArrayArray22[local261][local6][local13] = new Class360(local261);
						if (local251) {
							local58.aByte129++;
						}
					}
				}
			}
			if (local44.aBoolean102) {
				@Pc(304) int local304 = super.anInt4083 >> 12;
				local261 = super.anInt4077 >> 12;
				@Pc(318) Class48 local318;
				if (local58.aClass11_Sub1_Sub3_1 != null) {
					local318 = local58.aClass11_Sub1_Sub3_1.method7205(arg0);
					if (local318 != null && local318.method1172(local304, local261, local18)) {
						this.method3314();
						return;
					}
				}
				if (local58.aClass11_Sub1_Sub3_2 != null) {
					local318 = local58.aClass11_Sub1_Sub3_2.method7205(arg0);
					if (local318 != null && local318.method1172(local304, local261, local18)) {
						this.method3314();
						return;
					}
				}
				if (local58.aClass11_Sub1_Sub4_1 != null) {
					local318 = local58.aClass11_Sub1_Sub4_1.method7205(arg0);
					if (local318 != null && local318.method1172(local304, local261, local18)) {
						this.method3314();
						return;
					}
				}
				for (@Pc(375) Class21 local375 = local58.aClass21_4; local375 != null; local375 = local375.aClass21_1) {
					@Pc(382) Class48 local382 = local375.aClass11_Sub1_Sub1_1.method7205(arg0);
					if (local382 != null && local382.method1172(local304, local261, local18)) {
						this.method3314();
						return;
					}
				}
			}
			local40.aClass64_1.aClass102_1.method2417(this);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(JI)V")
	public void method3317(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort47 = (short) (this.aShort47 - arg1);
		if (this.aShort47 <= 0) {
			this.method3314();
			return;
		}
		@Pc(17) int local17 = super.anInt4083 >> 12;
		@Pc(22) int local22 = super.anInt4081 >> 12;
		@Pc(27) int local27 = super.anInt4077 >> 12;
		@Pc(31) Class11_Sub9 local31 = this.aClass11_Sub3_1.aClass11_Sub9_2;
		@Pc(35) Class59 local35 = this.aClass11_Sub3_1.aClass59_1;
		if (local35.anInt1632 != 0) {
			@Pc(65) int local65;
			if (this.aShort43 - this.aShort47 <= local35.anInt1625) {
				local65 = (super.anInt4079 >> 8 & 0xFF00) + (this.anInt4085 >> 16 & 0xFF) + local35.anInt1592 * arg1;
				@Pc(82) int local82 = (super.anInt4079 & 0xFF00) + (this.anInt4085 >> 8 & 0xFF) + local35.anInt1623 * arg1;
				@Pc(99) int local99 = ((super.anInt4079 & 0xFF) << 8) + (this.anInt4085 & 0xFF) + local35.anInt1634 * arg1;
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
				super.anInt4079 &= 0xFF000000;
				super.anInt4079 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4085 &= 0xFF000000;
				this.anInt4085 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort43 - this.aShort47 <= local35.anInt1610) {
				local65 = (super.anInt4079 >> 16 & 0xFF00) + (this.anInt4085 >> 24 & 0xFF) + local35.anInt1621 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4079 &= 0xFFFFFF;
				super.anInt4079 |= (local65 & 0xFF00) << 16;
				this.anInt4085 &= 0xFFFFFF;
				this.anInt4085 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1620 != -1 && this.aShort43 - this.aShort47 <= local35.anInt1615) {
			this.anInt4084 += local35.anInt1595 * arg1;
		}
		if (local35.anInt1626 != -1 && this.aShort43 - this.aShort47 <= local35.anInt1606) {
			super.anInt4075 += local35.anInt1630 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort44;
		@Pc(300) double local300 = (double) this.aShort45;
		@Pc(304) double local304 = (double) this.aShort42;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt1588 == 1) {
			local317 = local17 - this.aClass11_Sub3_1.aClass199_1.anInt5227;
			local324 = local22 - this.aClass11_Sub3_1.aClass199_1.anInt5226;
			local331 = local27 - this.aClass11_Sub3_1.aClass199_1.anInt5228;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt1624 * local348 * arg1;
			this.anInt4084 = (int) ((long) this.anInt4084 - ((long) this.anInt4084 * local356 >> 18));
		} else if (local35.anInt1588 == 2) {
			local317 = local17 - this.aClass11_Sub3_1.aClass199_1.anInt5227;
			local324 = local22 - this.aClass11_Sub3_1.aClass199_1.anInt5226;
			local331 = local27 - this.aClass11_Sub3_1.aClass199_1.anInt5228;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt1624 * local348 * arg1;
			this.anInt4084 = (int) ((long) this.anInt4084 - ((long) this.anInt4084 * local356 >> 28));
		}
		if (local35.anIntArray69 != null) {
			@Pc(437) Class1 local437 = local31.aClass111_41.aClass1_94;
			for (@Pc(440) Class1 local440 = local437.aClass1_286; local440 != local437; local440 = local440.aClass1_286) {
				@Pc(444) Class1_Sub8_Sub15 local444 = (Class1_Sub8_Sub15) local440;
				@Pc(447) Class183 local447 = local444.aClass183_1;
				if (local447.anInt4758 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray69.length; local455++) {
						if (local35.anIntArray69[local455] == local447.anInt4769) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt8355);
						@Pc(486) double local486 = (double) (local22 - local444.anInt8357);
						@Pc(492) double local492 = (double) (local27 - local444.anInt8359);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong121)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt8356 + local486 * (double) local447.anInt4763 + local492 * (double) local444.anInt8354) * 65535.0D / ((double) local447.anInt4764 * local513);
							if (!(local545 < (double) local447.anInt4768)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt4765 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt4767;
								} else if (local447.anInt4765 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt4767;
								}
								if (local447.anInt4772 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt4764;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt4764;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt4764;
									if (local447.anInt4760 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt4083 = (int) ((double) super.anInt4083 + local678 * (double) arg1);
										super.anInt4081 = (int) ((double) super.anInt4081 + local686 * (double) arg1);
										super.anInt4077 = (int) ((double) super.anInt4077 + local694 * (double) arg1);
									}
								} else if (local447.anInt4760 == 0) {
									local296 += ((double) local444.anInt8356 - local553) * (double) arg1;
									local300 += ((double) local447.anInt4763 - local553) * (double) arg1;
									local304 += ((double) local444.anInt8354 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt4083 = (int) ((double) super.anInt4083 + ((double) local444.anInt8356 - local553) * (double) arg1);
									super.anInt4081 = (int) ((double) super.anInt4081 + ((double) local447.anInt4763 - local553) * (double) arg1);
									super.anInt4077 = (int) ((double) super.anInt4077 + ((double) local444.anInt8354 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray70 != null) {
			for (local317 = 0; local317 < local35.anIntArray70.length; local317++) {
				@Pc(776) Class1_Sub8_Sub15 local776 = (Class1_Sub8_Sub15) Static133.aClass306_1.method6497((long) local35.anIntArray70[local317]);
				while (local776 != null) {
					@Pc(780) Class183 local780 = local776.aClass183_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt8355);
					@Pc(792) double local792 = (double) (local22 - local776.anInt8357);
					@Pc(798) double local798 = (double) (local27 - local776.anInt8359);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong121) {
						local776 = (Class1_Sub8_Sub15) Static133.aClass306_1.method6495();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt8356 + local792 * (double) local780.anInt4763 + local798 * (double) local776.anInt8354) * 65535.0D / ((double) local780.anInt4764 * local825);
						if (local857 < (double) local780.anInt4768) {
							local776 = (Class1_Sub8_Sub15) Static133.aClass306_1.method6495();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt4765 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt4767;
							} else if (local780.anInt4765 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt4767;
							}
							if (local780.anInt4772 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt4764;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt4764;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt4764;
								if (local780.anInt4760 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt4083 = (int) ((double) super.anInt4083 + local996 * (double) arg1);
									super.anInt4081 = (int) ((double) super.anInt4081 + local1004 * (double) arg1);
									super.anInt4077 = (int) ((double) super.anInt4077 + local1012 * (double) arg1);
								}
							} else if (local780.anInt4760 == 0) {
								local296 += ((double) local776.anInt8356 - local871) * (double) arg1;
								local300 += ((double) local780.anInt4763 - local871) * (double) arg1;
								local304 += ((double) local776.anInt8354 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt4083 = (int) ((double) super.anInt4083 + ((double) local776.anInt8356 - local871) * (double) arg1);
								super.anInt4081 = (int) ((double) super.anInt4081 + ((double) local780.anInt4763 - local871) * (double) arg1);
								super.anInt4077 = (int) ((double) super.anInt4077 + ((double) local776.anInt8354 - local871) * (double) arg1);
							}
							local776 = (Class1_Sub8_Sub15) Static133.aClass306_1.method6495();
						}
					}
				}
			}
		}
		if (local35.anIntArray71 != null) {
			if (local35.anIntArray72 == null) {
				local35.anIntArray72 = new int[local35.anIntArray71.length];
				for (local317 = 0; local317 < local35.anIntArray71.length; local317++) {
					Static227.method3386(local35.anIntArray71[local317]);
					local35.anIntArray72[local317] = ((Class1_Sub27) Static163.aClass91_7.method2271((long) local35.anIntArray71[local317])).anInt3348;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray72.length; local317++) {
				@Pc(1137) Class183 local1137 = Static63.aClass183Array1[local35.anIntArray72[local317]];
				if (local1137.anInt4760 == 0) {
					local296 += local1137.anInt4755 * arg1;
					local300 += local1137.anInt4763 * arg1;
					local304 += local1137.anInt4759 * arg1;
					local306 = true;
				} else {
					super.anInt4083 += local1137.anInt4755 * arg1;
					super.anInt4081 += local1137.anInt4763 * arg1;
					super.anInt4077 += local1137.anInt4759 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort44 = (short) local296;
					this.aShort45 = (short) local300;
					this.aShort42 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt4084 <<= 0x1;
			}
		}
		super.anInt4083 = (int) ((long) super.anInt4083 + ((long) this.aShort44 * (long) (this.anInt4084 << 2) >> 23) * (long) arg1);
		super.anInt4081 = (int) ((long) super.anInt4081 + ((long) this.aShort45 * (long) (this.anInt4084 << 2) >> 23) * (long) arg1);
		super.anInt4077 = (int) ((long) super.anInt4077 + ((long) this.aShort42 * (long) (this.anInt4084 << 2) >> 23) * (long) arg1);
	}
}
