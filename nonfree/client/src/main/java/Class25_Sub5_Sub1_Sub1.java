import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class25_Sub5_Sub1_Sub1 extends Class25_Sub5_Sub1 {

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
	private int anInt8916;

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "S")
	private short aShort113;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "Lclient!ik;")
	public Class25_Sub6 aClass25_Sub6_1;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "S")
	private short aShort115;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "S")
	private short aShort110;

	@OriginalMember(owner = "client!tn", name = "G", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "S")
	private short aShort114;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	private int anInt8917;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ik;IIIIIIIIIIIZZ)V")
	public Class25_Sub5_Sub1_Sub1(@OriginalArg(0) Class25_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass25_Sub6_1 = arg0;
		super.anInt8915 = arg1 << 12;
		super.anInt8911 = arg2 << 12;
		super.anInt8914 = arg3 << 12;
		super.anInt8912 = arg9;
		this.aShort110 = this.aShort115 = (short) arg8;
		super.anInt8913 = arg10;
		super.anInt8908 = arg11;
		super.aBoolean593 = arg13;
		this.aShort112 = (short) arg4;
		this.aShort111 = (short) arg5;
		this.aShort114 = (short) arg6;
		this.anInt8917 = arg7;
		super.aByte125 = this.aClass25_Sub6_1.aClass317_1.aByte124;
		this.method6968();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
	public void method6967() {
		this.aClass25_Sub6_1.aClass25_Sub7_3.aClass25_Sub5_Sub1_Sub1Array1[this.aShort113] = null;
		Static520.aClass25_Sub5_Sub1_Sub1Array2[Static345.anInt6222] = this;
		Static345.anInt6222 = Static345.anInt6222 + 1 & 0x3FF;
		this.method6959();
		this.method6962();
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
	private void method6968() {
		@Pc(4) int local4 = this.aClass25_Sub6_1.aClass25_Sub7_3.anInt4724;
		if (this.aClass25_Sub6_1.aClass25_Sub7_3.aClass25_Sub5_Sub1_Sub1Array1[local4] != null) {
			this.aClass25_Sub6_1.aClass25_Sub7_3.aClass25_Sub5_Sub1_Sub1Array1[local4].method6967();
		}
		this.aClass25_Sub6_1.aClass25_Sub7_3.aClass25_Sub5_Sub1_Sub1Array1[local4] = this;
		this.aShort113 = (short) this.aClass25_Sub6_1.aClass25_Sub7_3.anInt4724;
		this.aClass25_Sub6_1.aClass25_Sub7_3.anInt4724 = local4 + 1 & 0x1FFF;
		this.aClass25_Sub6_1.aClass269_3.method5977(this);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(JI)V")
	public void method6969(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort115 = (short) (this.aShort115 - arg1);
		if (this.aShort115 <= 0) {
			this.method6967();
			return;
		}
		@Pc(17) int local17 = super.anInt8915 >> 12;
		@Pc(22) int local22 = super.anInt8911 >> 12;
		@Pc(27) int local27 = super.anInt8914 >> 12;
		@Pc(31) Class25_Sub7 local31 = this.aClass25_Sub6_1.aClass25_Sub7_3;
		@Pc(35) Class358 local35 = this.aClass25_Sub6_1.aClass358_1;
		if (local35.anInt10166 != 0) {
			@Pc(65) int local65;
			if (this.aShort110 - this.aShort115 <= local35.anInt10153) {
				local65 = (super.anInt8912 >> 8 & 0xFF00) + (this.anInt8916 >> 16 & 0xFF) + local35.anInt10175 * arg1;
				@Pc(82) int local82 = (super.anInt8912 & 0xFF00) + (this.anInt8916 >> 8 & 0xFF) + local35.anInt10144 * arg1;
				@Pc(99) int local99 = ((super.anInt8912 & 0xFF) << 8) + (this.anInt8916 & 0xFF) + local35.anInt10131 * arg1;
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
				super.anInt8912 &= 0xFF000000;
				super.anInt8912 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt8916 &= 0xFF000000;
				this.anInt8916 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort110 - this.aShort115 <= local35.anInt10132) {
				local65 = (super.anInt8912 >> 16 & 0xFF00) + (this.anInt8916 >> 24 & 0xFF) + local35.anInt10146 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt8912 &= 0xFFFFFF;
				super.anInt8912 |= (local65 & 0xFF00) << 16;
				this.anInt8916 &= 0xFFFFFF;
				this.anInt8916 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt10171 != -1 && this.aShort110 - this.aShort115 <= local35.anInt10149) {
			this.anInt8917 += local35.anInt10147 * arg1;
		}
		if (local35.anInt10140 != -1 && this.aShort110 - this.aShort115 <= local35.anInt10150) {
			super.anInt8913 += local35.anInt10139 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort112;
		@Pc(300) double local300 = (double) this.aShort111;
		@Pc(304) double local304 = (double) this.aShort114;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt10163 == 1) {
			local317 = local17 - this.aClass25_Sub6_1.aClass312_1.anInt8757;
			local324 = local22 - this.aClass25_Sub6_1.aClass312_1.anInt8769;
			local331 = local27 - this.aClass25_Sub6_1.aClass312_1.anInt8764;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt10174 * local348 * arg1;
			this.anInt8917 = (int) ((long) this.anInt8917 - ((long) this.anInt8917 * local356 >> 18));
		} else if (local35.anInt10163 == 2) {
			local317 = local17 - this.aClass25_Sub6_1.aClass312_1.anInt8757;
			local324 = local22 - this.aClass25_Sub6_1.aClass312_1.anInt8769;
			local331 = local27 - this.aClass25_Sub6_1.aClass312_1.anInt8764;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt10174 * local348 * arg1;
			this.anInt8917 = (int) ((long) this.anInt8917 - ((long) this.anInt8917 * local356 >> 28));
		}
		if (local35.anIntArray590 != null) {
			@Pc(437) Class3 local437 = local31.aClass244_39.aClass3_189;
			for (@Pc(440) Class3 local440 = local437.aClass3_285; local440 != local437; local440 = local440.aClass3_285) {
				@Pc(444) Class3_Sub7_Sub16 local444 = (Class3_Sub7_Sub16) local440;
				@Pc(447) Class205 local447 = local444.aClass205_1;
				if (local447.anInt6012 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray590.length; local455++) {
						if (local35.anIntArray590[local455] == local447.anInt6029) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt7409);
						@Pc(486) double local486 = (double) (local22 - local444.anInt7412);
						@Pc(492) double local492 = (double) (local27 - local444.anInt7410);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong166)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt7408 + local486 * (double) local447.anInt6031 + local492 * (double) local444.anInt7413) * 65535.0D / ((double) local447.anInt6014 * local513);
							if (!(local545 < (double) local447.anInt6027)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt6026 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt6018;
								} else if (local447.anInt6026 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt6018;
								}
								if (local447.anInt6028 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt6014;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt6014;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt6014;
									if (local447.anInt6013 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt8915 = (int) ((double) super.anInt8915 + local678 * (double) arg1);
										super.anInt8911 = (int) ((double) super.anInt8911 + local686 * (double) arg1);
										super.anInt8914 = (int) ((double) super.anInt8914 + local694 * (double) arg1);
									}
								} else if (local447.anInt6013 == 0) {
									local296 += ((double) local444.anInt7408 - local553) * (double) arg1;
									local300 += ((double) local447.anInt6031 - local553) * (double) arg1;
									local304 += ((double) local444.anInt7413 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt8915 = (int) ((double) super.anInt8915 + ((double) local444.anInt7408 - local553) * (double) arg1);
									super.anInt8911 = (int) ((double) super.anInt8911 + ((double) local447.anInt6031 - local553) * (double) arg1);
									super.anInt8914 = (int) ((double) super.anInt8914 + ((double) local444.anInt7413 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray589 != null) {
			for (local317 = 0; local317 < local35.anIntArray589.length; local317++) {
				@Pc(776) Class3_Sub7_Sub16 local776 = (Class3_Sub7_Sub16) Static410.aClass139_1.method3678((long) local35.anIntArray589[local317]);
				while (local776 != null) {
					@Pc(780) Class205 local780 = local776.aClass205_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt7409);
					@Pc(792) double local792 = (double) (local22 - local776.anInt7412);
					@Pc(798) double local798 = (double) (local27 - local776.anInt7410);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong166) {
						local776 = (Class3_Sub7_Sub16) Static410.aClass139_1.method3679();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt7408 + local792 * (double) local780.anInt6031 + local798 * (double) local776.anInt7413) * 65535.0D / ((double) local780.anInt6014 * local825);
						if (local857 < (double) local780.anInt6027) {
							local776 = (Class3_Sub7_Sub16) Static410.aClass139_1.method3679();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt6026 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt6018;
							} else if (local780.anInt6026 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt6018;
							}
							if (local780.anInt6028 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt6014;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt6014;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt6014;
								if (local780.anInt6013 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt8915 = (int) ((double) super.anInt8915 + local996 * (double) arg1);
									super.anInt8911 = (int) ((double) super.anInt8911 + local1004 * (double) arg1);
									super.anInt8914 = (int) ((double) super.anInt8914 + local1012 * (double) arg1);
								}
							} else if (local780.anInt6013 == 0) {
								local296 += ((double) local776.anInt7408 - local871) * (double) arg1;
								local300 += ((double) local780.anInt6031 - local871) * (double) arg1;
								local304 += ((double) local776.anInt7413 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt8915 = (int) ((double) super.anInt8915 + ((double) local776.anInt7408 - local871) * (double) arg1);
								super.anInt8911 = (int) ((double) super.anInt8911 + ((double) local780.anInt6031 - local871) * (double) arg1);
								super.anInt8914 = (int) ((double) super.anInt8914 + ((double) local776.anInt7413 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub7_Sub16) Static410.aClass139_1.method3679();
						}
					}
				}
			}
		}
		if (local35.anIntArray587 != null) {
			if (local35.anIntArray588 == null) {
				local35.anIntArray588 = new int[local35.anIntArray587.length];
				for (local317 = 0; local317 < local35.anIntArray587.length; local317++) {
					Static384.method5345(local35.anIntArray587[local317]);
					local35.anIntArray588[local317] = ((Class3_Sub2) Static136.aClass297_11.method6531((long) local35.anIntArray587[local317])).anInt39;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray588.length; local317++) {
				@Pc(1137) Class205 local1137 = Static309.aClass205Array1[local35.anIntArray588[local317]];
				if (local1137.anInt6013 == 0) {
					local296 += local1137.anInt6025 * arg1;
					local300 += local1137.anInt6031 * arg1;
					local304 += local1137.anInt6019 * arg1;
					local306 = true;
				} else {
					super.anInt8915 += local1137.anInt6025 * arg1;
					super.anInt8911 += local1137.anInt6031 * arg1;
					super.anInt8914 += local1137.anInt6019 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort112 = (short) local296;
					this.aShort111 = (short) local300;
					this.aShort114 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt8917 <<= 0x1;
			}
		}
		super.anInt8915 = (int) ((long) super.anInt8915 + ((long) this.aShort112 * (long) (this.anInt8917 << 2) >> 23) * (long) arg1);
		super.anInt8911 = (int) ((long) super.anInt8911 + ((long) this.aShort111 * (long) (this.anInt8917 << 2) >> 23) * (long) arg1);
		super.anInt8914 = (int) ((long) super.anInt8914 + ((long) this.aShort114 * (long) (this.anInt8917 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!r;J)V")
	public void method6970(@OriginalArg(0) Class31 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt8915 >> Static385.anInt6657 + 12;
		@Pc(13) int local13 = super.anInt8914 >> Static385.anInt6657 + 12;
		@Pc(18) int local18 = super.anInt8911 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static349.anInt6237 || local13 < 0 || local13 >= Static414.anInt7451) {
			this.method6967();
			return;
		}
		@Pc(40) Class25_Sub7 local40 = this.aClass25_Sub6_1.aClass25_Sub7_3;
		@Pc(44) Class358 local44 = this.aClass25_Sub6_1.aClass358_1;
		@Pc(46) Class127[] local46 = Static256.aClass127Array3;
		@Pc(49) int local49 = local40.anInt4727;
		@Pc(58) Class333 local58 = Static189.aClass333ArrayArrayArray1[local40.anInt4727][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte127;
		}
		@Pc(71) int local71 = local46[local49].method7862(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static590.anInt10277 - 1) {
			local86 = local46[local49 + 1].method7862(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static385.anInt6657);
		}
		if (local44.aBoolean708) {
			if (local44.anInt10159 == -1 && local18 > local71) {
				this.method6967();
				return;
			}
			if (local44.anInt10159 >= 0 && local18 > local46[local44.anInt10159].method7862(local13, local6)) {
				this.method6967();
				return;
			}
			if (local44.anInt10180 == -1 && local18 < local86) {
				this.method6967();
				return;
			}
			if (local44.anInt10180 >= 0 && local18 < local46[local44.anInt10180 + 1].method7862(local13, local6)) {
				this.method6967();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static590.anInt10277 - 1; local154 > 0 && local18 > local46[local154].method7862(local13, local6); local154--) {
		}
		if (local44.aBoolean707 && local154 == 0 && local18 > local46[0].method7862(local13, local6)) {
			this.method6967();
		} else if (local154 == Static590.anInt10277 - 1 && local46[local154].method7862(local13, local6) - local18 > 0x8 << Static385.anInt6657) {
			this.method6967();
		} else {
			local58 = Static189.aClass333ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static189.aClass333ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static189.aClass333ArrayArrayArray1[0][local6][local13] = new Class333(0);
				}
				@Pc(251) boolean local251 = Static189.aClass333ArrayArrayArray1[0][local6][local13].aClass333_1 != null;
				if (local154 == 3 && local251) {
					this.method6967();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static189.aClass333ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static189.aClass333ArrayArrayArray1[local261][local6][local13] = new Class333(local261);
						if (local251) {
							local58.aByte127++;
						}
					}
				}
			}
			if (local44.aBoolean704) {
				@Pc(304) int local304 = super.anInt8915 >> 12;
				local261 = super.anInt8914 >> 12;
				@Pc(318) Class190 local318;
				if (local58.aClass25_Sub2_Sub3_2 != null) {
					local318 = local58.aClass25_Sub2_Sub3_2.method6648(arg0);
					if (local318 != null && local318.method4650(local18, local304, local261)) {
						this.method6967();
						return;
					}
				}
				if (local58.aClass25_Sub2_Sub3_1 != null) {
					local318 = local58.aClass25_Sub2_Sub3_1.method6648(arg0);
					if (local318 != null && local318.method4650(local18, local304, local261)) {
						this.method6967();
						return;
					}
				}
				if (local58.aClass25_Sub2_Sub5_1 != null) {
					local318 = local58.aClass25_Sub2_Sub5_1.method6648(arg0);
					if (local318 != null && local318.method4650(local18, local304, local261)) {
						this.method6967();
						return;
					}
				}
				for (@Pc(375) Class147 local375 = local58.aClass147_3; local375 != null; local375 = local375.aClass147_2) {
					@Pc(382) Class190 local382 = local375.aClass25_Sub2_Sub2_1.method6648(arg0);
					if (local382 != null && local382.method4650(local18, local304, local261)) {
						this.method6967();
						return;
					}
				}
			}
			local40.aClass323_1.aClass114_1.method3064(this);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ik;IIIIIIIIIIIZZ)V")
	public void method6971(@OriginalArg(0) Class25_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass25_Sub6_1 = arg0;
		super.anInt8915 = arg1 << 12;
		super.anInt8911 = arg2 << 12;
		super.anInt8914 = arg3 << 12;
		super.anInt8912 = arg9;
		this.aShort110 = this.aShort115 = (short) arg8;
		super.anInt8913 = arg10;
		super.anInt8908 = arg11;
		super.aBoolean593 = arg13;
		this.aShort112 = (short) arg4;
		this.aShort111 = (short) arg5;
		this.aShort114 = (short) arg6;
		this.anInt8917 = arg7;
		super.aByte125 = this.aClass25_Sub6_1.aClass317_1.aByte124;
		this.method6968();
	}
}
