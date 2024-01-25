import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class12_Sub1_Sub1_Sub1 extends Class12_Sub1_Sub1 {

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
	private int anInt4854;

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "Lclient!ss;")
	public Class12_Sub9 aClass12_Sub9_1;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
	private int anInt4853;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!ss;IIIIIIIIIIIZZ)V")
	public Class12_Sub1_Sub1_Sub1(@OriginalArg(0) Class12_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub9_1 = arg0;
		super.anInt4849 = arg1 << 12;
		super.anInt4843 = arg2 << 12;
		super.anInt4848 = arg3 << 12;
		super.anInt4841 = arg9;
		this.aShort59 = this.aShort56 = (short) arg8;
		super.anInt4846 = arg10;
		super.anInt4847 = arg11;
		super.aBoolean370 = arg13;
		this.aShort58 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort55 = (short) arg6;
		this.anInt4853 = arg7;
		super.aByte46 = this.aClass12_Sub9_1.aClass293_2.aByte102;
		this.method4068();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!r;J)V")
	public void method4064(@OriginalArg(0) Class162 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt4849 >> Static562.anInt9207 + 12;
		@Pc(13) int local13 = super.anInt4848 >> Static562.anInt9207 + 12;
		@Pc(18) int local18 = super.anInt4843 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static83.anInt1434 || local13 < 0 || local13 >= Static405.anInt6657) {
			this.method4065();
			return;
		}
		@Pc(40) Class12_Sub4 local40 = this.aClass12_Sub9_1.aClass12_Sub4_6;
		@Pc(44) Class326 local44 = this.aClass12_Sub9_1.aClass326_1;
		@Pc(46) Class151[] local46 = Static114.aClass151Array1;
		@Pc(49) int local49 = local40.anInt4921;
		@Pc(58) Class228 local58 = Static469.aClass228ArrayArrayArray6[local40.anInt4921][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte80;
		}
		@Pc(71) int local71 = local46[local49].method7676(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static450.anInt7223 - 1) {
			local86 = local46[local49 + 1].method7676(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static562.anInt9207);
		}
		if (local44.aBoolean691) {
			if (local44.anInt8182 == -1 && local18 > local71) {
				this.method4065();
				return;
			}
			if (local44.anInt8182 >= 0 && local18 > local46[local44.anInt8182].method7676(local13, local6)) {
				this.method4065();
				return;
			}
			if (local44.anInt8168 == -1 && local18 < local86) {
				this.method4065();
				return;
			}
			if (local44.anInt8168 >= 0 && local18 < local46[local44.anInt8168 + 1].method7676(local13, local6)) {
				this.method4065();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static450.anInt7223 - 1; local154 > 0 && local18 > local46[local154].method7676(local13, local6); local154--) {
		}
		if (local44.aBoolean688 && local154 == 0 && local18 > local46[0].method7676(local13, local6)) {
			this.method4065();
		} else if (local154 == Static450.anInt7223 - 1 && local46[local154].method7676(local13, local6) - local18 > 0x8 << Static562.anInt9207) {
			this.method4065();
		} else {
			local58 = Static469.aClass228ArrayArrayArray6[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static469.aClass228ArrayArrayArray6[0][local6][local13] == null) {
					local58 = Static469.aClass228ArrayArrayArray6[0][local6][local13] = new Class228(0);
				}
				@Pc(251) boolean local251 = Static469.aClass228ArrayArrayArray6[0][local6][local13].aClass228_1 != null;
				if (local154 == 3 && local251) {
					this.method4065();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static469.aClass228ArrayArrayArray6[local261][local6][local13] == null) {
						local58 = Static469.aClass228ArrayArrayArray6[local261][local6][local13] = new Class228(local261);
						if (local251) {
							local58.aByte80++;
						}
					}
				}
			}
			if (local44.aBoolean689) {
				@Pc(304) int local304 = super.anInt4849 >> 12;
				local261 = super.anInt4848 >> 12;
				@Pc(318) Class157 local318;
				if (local58.aClass12_Sub2_Sub5_1 != null) {
					local318 = local58.aClass12_Sub2_Sub5_1.method7502(arg0);
					if (local318 != null && local318.method2753(local18, local261, local304)) {
						this.method4065();
						return;
					}
				}
				if (local58.aClass12_Sub2_Sub5_2 != null) {
					local318 = local58.aClass12_Sub2_Sub5_2.method7502(arg0);
					if (local318 != null && local318.method2753(local18, local261, local304)) {
						this.method4065();
						return;
					}
				}
				if (local58.aClass12_Sub2_Sub2_1 != null) {
					local318 = local58.aClass12_Sub2_Sub2_1.method7502(arg0);
					if (local318 != null && local318.method2753(local18, local261, local304)) {
						this.method4065();
						return;
					}
				}
				for (@Pc(375) Class180 local375 = local58.aClass180_3; local375 != null; local375 = local375.aClass180_2) {
					@Pc(382) Class157 local382 = local375.aClass12_Sub2_Sub1_1.method7502(arg0);
					if (local382 != null && local382.method2753(local18, local261, local304)) {
						this.method4065();
						return;
					}
				}
			}
			local40.aClass339_1.aClass77_1.method1510(this);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()V")
	public void method4065() {
		this.aClass12_Sub9_1.aClass12_Sub4_6.aClass12_Sub1_Sub1_Sub1Array2[this.aShort54] = null;
		Static83.aClass12_Sub1_Sub1_Sub1Array1[Static217.anInt3142] = this;
		Static217.anInt3142 = Static217.anInt3142 + 1 & 0x3FF;
		this.method7630();
		this.method5462();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(JI)V")
	public void method4066(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort56 = (short) (this.aShort56 - arg1);
		if (this.aShort56 <= 0) {
			this.method4065();
			return;
		}
		@Pc(17) int local17 = super.anInt4849 >> 12;
		@Pc(22) int local22 = super.anInt4843 >> 12;
		@Pc(27) int local27 = super.anInt4848 >> 12;
		@Pc(31) Class12_Sub4 local31 = this.aClass12_Sub9_1.aClass12_Sub4_6;
		@Pc(35) Class326 local35 = this.aClass12_Sub9_1.aClass326_1;
		if (local35.anInt8193 != 0) {
			@Pc(65) int local65;
			if (this.aShort59 - this.aShort56 <= local35.anInt8147) {
				local65 = (super.anInt4841 >> 8 & 0xFF00) + (this.anInt4854 >> 16 & 0xFF) + local35.anInt8164 * arg1;
				@Pc(82) int local82 = (super.anInt4841 & 0xFF00) + (this.anInt4854 >> 8 & 0xFF) + local35.anInt8149 * arg1;
				@Pc(99) int local99 = ((super.anInt4841 & 0xFF) << 8) + (this.anInt4854 & 0xFF) + local35.anInt8145 * arg1;
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
				super.anInt4841 &= 0xFF000000;
				super.anInt4841 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4854 &= 0xFF000000;
				this.anInt4854 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort59 - this.aShort56 <= local35.anInt8156) {
				local65 = (super.anInt4841 >> 16 & 0xFF00) + (this.anInt4854 >> 24 & 0xFF) + local35.anInt8178 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4841 &= 0xFFFFFF;
				super.anInt4841 |= (local65 & 0xFF00) << 16;
				this.anInt4854 &= 0xFFFFFF;
				this.anInt4854 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8154 != -1 && this.aShort59 - this.aShort56 <= local35.anInt8142) {
			this.anInt4853 += local35.anInt8171 * arg1;
		}
		if (local35.anInt8161 != -1 && this.aShort59 - this.aShort56 <= local35.anInt8160) {
			super.anInt4846 += local35.anInt8183 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort58;
		@Pc(300) double local300 = (double) this.aShort57;
		@Pc(304) double local304 = (double) this.aShort55;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt8188 == 1) {
			local317 = local17 - this.aClass12_Sub9_1.aClass342_1.anInt8929;
			local324 = local22 - this.aClass12_Sub9_1.aClass342_1.anInt8935;
			local331 = local27 - this.aClass12_Sub9_1.aClass342_1.anInt8934;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt8163 * local348 * arg1;
			this.anInt4853 = (int) ((long) this.anInt4853 - ((long) this.anInt4853 * local356 >> 18));
		} else if (local35.anInt8188 == 2) {
			local317 = local17 - this.aClass12_Sub9_1.aClass342_1.anInt8929;
			local324 = local22 - this.aClass12_Sub9_1.aClass342_1.anInt8935;
			local331 = local27 - this.aClass12_Sub9_1.aClass342_1.anInt8934;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt8163 * local348 * arg1;
			this.anInt4853 = (int) ((long) this.anInt4853 - ((long) this.anInt4853 * local356 >> 28));
		}
		if (local35.anIntArray549 != null) {
			@Pc(437) Class2 local437 = local31.aClass70_35.aClass2_39;
			for (@Pc(440) Class2 local440 = local437.aClass2_286; local440 != local437; local440 = local440.aClass2_286) {
				@Pc(444) Class2_Sub2_Sub12 local444 = (Class2_Sub2_Sub12) local440;
				@Pc(447) Class198 local447 = local444.aClass198_1;
				if (local447.anInt4877 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray549.length; local455++) {
						if (local35.anIntArray549[local455] == local447.anInt4875) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt5541);
						@Pc(486) double local486 = (double) (local22 - local444.anInt5546);
						@Pc(492) double local492 = (double) (local27 - local444.anInt5547);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong120)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt5542 + local486 * (double) local447.anInt4879 + local492 * (double) local444.anInt5545) * 65535.0D / ((double) local447.anInt4873 * local513);
							if (!(local545 < (double) local447.anInt4878)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt4864 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt4871;
								} else if (local447.anInt4864 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt4871;
								}
								if (local447.anInt4870 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt4873;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt4873;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt4873;
									if (local447.anInt4874 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt4849 = (int) ((double) super.anInt4849 + local678 * (double) arg1);
										super.anInt4843 = (int) ((double) super.anInt4843 + local686 * (double) arg1);
										super.anInt4848 = (int) ((double) super.anInt4848 + local694 * (double) arg1);
									}
								} else if (local447.anInt4874 == 0) {
									local296 += ((double) local444.anInt5542 - local553) * (double) arg1;
									local300 += ((double) local447.anInt4879 - local553) * (double) arg1;
									local304 += ((double) local444.anInt5545 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt4849 = (int) ((double) super.anInt4849 + ((double) local444.anInt5542 - local553) * (double) arg1);
									super.anInt4843 = (int) ((double) super.anInt4843 + ((double) local447.anInt4879 - local553) * (double) arg1);
									super.anInt4848 = (int) ((double) super.anInt4848 + ((double) local444.anInt5545 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray551 != null) {
			for (local317 = 0; local317 < local35.anIntArray551.length; local317++) {
				@Pc(776) Class2_Sub2_Sub12 local776 = (Class2_Sub2_Sub12) Static227.aClass259_1.method5448((long) local35.anIntArray551[local317]);
				while (local776 != null) {
					@Pc(780) Class198 local780 = local776.aClass198_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt5541);
					@Pc(792) double local792 = (double) (local22 - local776.anInt5546);
					@Pc(798) double local798 = (double) (local27 - local776.anInt5547);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong120) {
						local776 = (Class2_Sub2_Sub12) Static227.aClass259_1.method5450();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt5542 + local792 * (double) local780.anInt4879 + local798 * (double) local776.anInt5545) * 65535.0D / ((double) local780.anInt4873 * local825);
						if (local857 < (double) local780.anInt4878) {
							local776 = (Class2_Sub2_Sub12) Static227.aClass259_1.method5450();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt4864 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt4871;
							} else if (local780.anInt4864 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt4871;
							}
							if (local780.anInt4870 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt4873;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt4873;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt4873;
								if (local780.anInt4874 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt4849 = (int) ((double) super.anInt4849 + local996 * (double) arg1);
									super.anInt4843 = (int) ((double) super.anInt4843 + local1004 * (double) arg1);
									super.anInt4848 = (int) ((double) super.anInt4848 + local1012 * (double) arg1);
								}
							} else if (local780.anInt4874 == 0) {
								local296 += ((double) local776.anInt5542 - local871) * (double) arg1;
								local300 += ((double) local780.anInt4879 - local871) * (double) arg1;
								local304 += ((double) local776.anInt5545 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt4849 = (int) ((double) super.anInt4849 + ((double) local776.anInt5542 - local871) * (double) arg1);
								super.anInt4843 = (int) ((double) super.anInt4843 + ((double) local780.anInt4879 - local871) * (double) arg1);
								super.anInt4848 = (int) ((double) super.anInt4848 + ((double) local776.anInt5545 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub2_Sub12) Static227.aClass259_1.method5450();
						}
					}
				}
			}
		}
		if (local35.lb != null) {
			if (local35.anIntArray548 == null) {
				local35.anIntArray548 = new int[local35.lb.length];
				for (local317 = 0; local317 < local35.lb.length; local317++) {
					Static26.method359(local35.lb[local317]);
					local35.anIntArray548[local317] = ((Class2_Sub44) Static514.aClass90_37.method1685((long) local35.lb[local317])).anInt7748;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray548.length; local317++) {
				@Pc(1137) Class198 local1137 = Static55.aClass198Array1[local35.anIntArray548[local317]];
				if (local1137.anInt4874 == 0) {
					local296 += local1137.anInt4876 * arg1;
					local300 += local1137.anInt4879 * arg1;
					local304 += local1137.anInt4868 * arg1;
					local306 = true;
				} else {
					super.anInt4849 += local1137.anInt4876 * arg1;
					super.anInt4843 += local1137.anInt4879 * arg1;
					super.anInt4848 += local1137.anInt4868 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort58 = (short) local296;
					this.aShort57 = (short) local300;
					this.aShort55 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt4853 <<= 0x1;
			}
		}
		super.anInt4849 = (int) ((long) super.anInt4849 + ((long) this.aShort58 * (long) (this.anInt4853 << 2) >> 23) * (long) arg1);
		super.anInt4843 = (int) ((long) super.anInt4843 + ((long) this.aShort57 * (long) (this.anInt4853 << 2) >> 23) * (long) arg1);
		super.anInt4848 = (int) ((long) super.anInt4848 + ((long) this.aShort55 * (long) (this.anInt4853 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ss;IIIIIIIIIIIZZ)V")
	public void method4067(@OriginalArg(0) Class12_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub9_1 = arg0;
		super.anInt4849 = arg1 << 12;
		super.anInt4843 = arg2 << 12;
		super.anInt4848 = arg3 << 12;
		super.anInt4841 = arg9;
		this.aShort59 = this.aShort56 = (short) arg8;
		super.anInt4846 = arg10;
		super.anInt4847 = arg11;
		super.aBoolean370 = arg13;
		this.aShort58 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort55 = (short) arg6;
		this.anInt4853 = arg7;
		super.aByte46 = this.aClass12_Sub9_1.aClass293_2.aByte102;
		this.method4068();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()V")
	private void method4068() {
		@Pc(4) int local4 = this.aClass12_Sub9_1.aClass12_Sub4_6.anInt4919;
		if (this.aClass12_Sub9_1.aClass12_Sub4_6.aClass12_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass12_Sub9_1.aClass12_Sub4_6.aClass12_Sub1_Sub1_Sub1Array2[local4].method4065();
		}
		this.aClass12_Sub9_1.aClass12_Sub4_6.aClass12_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort54 = (short) this.aClass12_Sub9_1.aClass12_Sub4_6.anInt4919;
		this.aClass12_Sub9_1.aClass12_Sub4_6.anInt4919 = local4 + 1 & 0x1FFF;
		this.aClass12_Sub9_1.aClass220_10.method4659(this);
	}
}
