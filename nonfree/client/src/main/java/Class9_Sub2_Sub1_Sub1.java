import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class9_Sub2_Sub1_Sub1 extends Class9_Sub2_Sub1 {

	@OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
	private int anInt1781;

	@OriginalMember(owner = "client!cga", name = "J", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!cga", name = "L", descriptor = "Lclient!ji;")
	public Class9_Sub3 aClass9_Sub3_1;

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!cga", name = "H", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!cga", name = "I", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!cga", name = "G", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!cga", name = "K", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
	private int anInt1782;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!ji;IIIIIIIIIIIZZ)V")
	public Class9_Sub2_Sub1_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub3_1 = arg0;
		super.anInt1777 = arg1 << 12;
		super.anInt1772 = arg2 << 12;
		super.anInt1776 = arg3 << 12;
		super.anInt1780 = arg9;
		this.aShort31 = this.aShort32 = (short) arg8;
		super.anInt1775 = arg10;
		super.anInt1774 = arg11;
		super.aBoolean129 = arg13;
		this.aShort34 = (short) arg4;
		this.aShort33 = (short) arg5;
		this.aShort30 = (short) arg6;
		this.anInt1782 = arg7;
		super.aByte47 = this.aClass9_Sub3_1.aClass184_2.aByte65;
		this.method1662();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!ji;IIIIIIIIIIIZZ)V")
	public void method1661(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub3_1 = arg0;
		super.anInt1777 = arg1 << 12;
		super.anInt1772 = arg2 << 12;
		super.anInt1776 = arg3 << 12;
		super.anInt1780 = arg9;
		this.aShort31 = this.aShort32 = (short) arg8;
		super.anInt1775 = arg10;
		super.anInt1774 = arg11;
		super.aBoolean129 = arg13;
		this.aShort34 = (short) arg4;
		this.aShort33 = (short) arg5;
		this.aShort30 = (short) arg6;
		this.anInt1782 = arg7;
		super.aByte47 = this.aClass9_Sub3_1.aClass184_2.aByte65;
		this.method1662();
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "()V")
	private void method1662() {
		@Pc(4) int local4 = this.aClass9_Sub3_1.aClass9_Sub5_5.anInt6431;
		if (this.aClass9_Sub3_1.aClass9_Sub5_5.aClass9_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass9_Sub3_1.aClass9_Sub5_5.aClass9_Sub2_Sub1_Sub1Array1[local4].method1664();
		}
		this.aClass9_Sub3_1.aClass9_Sub5_5.aClass9_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort35 = (short) this.aClass9_Sub3_1.aClass9_Sub5_5.anInt6431;
		this.aClass9_Sub3_1.aClass9_Sub5_5.anInt6431 = local4 + 1 & 0x1FFF;
		this.aClass9_Sub3_1.aClass319_7.method7196(this);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method1663(@OriginalArg(0) Class22 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt1777 >> Static626.anInt9669 + 12;
		@Pc(13) int local13 = super.anInt1776 >> Static626.anInt9669 + 12;
		@Pc(18) int local18 = super.anInt1772 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static128.anInt2531 || local13 < 0 || local13 >= Static448.anInt6835) {
			this.method1664();
			return;
		}
		@Pc(40) Class9_Sub5 local40 = this.aClass9_Sub3_1.aClass9_Sub5_5;
		@Pc(44) Class201 local44 = this.aClass9_Sub3_1.aClass201_1;
		@Pc(46) Class259[] local46 = Static477.aClass259Array3;
		@Pc(49) int local49 = local40.anInt6434;
		@Pc(58) Class364 local58 = Static448.aClass364ArrayArrayArray2[local40.anInt6434][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte135;
		}
		@Pc(71) int local71 = local46[local49].method9295(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static169.anInt2992 - 1) {
			local86 = local46[local49 + 1].method9295(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static626.anInt9669);
		}
		if (local44.aBoolean344) {
			if (local44.anInt5205 == -1 && local18 > local71) {
				this.method1664();
				return;
			}
			if (local44.anInt5205 >= 0 && local18 > local46[local44.anInt5205].method9295(local13, local6)) {
				this.method1664();
				return;
			}
			if (local44.anInt5222 == -1 && local18 < local86) {
				this.method1664();
				return;
			}
			if (local44.anInt5222 >= 0 && local18 < local46[local44.anInt5222 + 1].method9295(local13, local6)) {
				this.method1664();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static169.anInt2992 - 1; local154 > 0 && local18 > local46[local154].method9295(local13, local6); local154--) {
		}
		if (local44.aBoolean348 && local154 == 0 && local18 > local46[0].method9295(local13, local6)) {
			this.method1664();
		} else if (local154 == Static169.anInt2992 - 1 && local46[local154].method9295(local13, local6) - local18 > 0x8 << Static626.anInt9669) {
			this.method1664();
		} else {
			local58 = Static448.aClass364ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static448.aClass364ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static448.aClass364ArrayArrayArray2[0][local6][local13] = new Class364(0);
				}
				@Pc(251) boolean local251 = Static448.aClass364ArrayArrayArray2[0][local6][local13].aClass364_1 != null;
				if (local154 == 3 && local251) {
					this.method1664();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static448.aClass364ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static448.aClass364ArrayArrayArray2[local261][local6][local13] = new Class364(local261);
						if (local251) {
							local58.aByte135++;
						}
					}
				}
			}
			if (local44.aBoolean346) {
				@Pc(304) int local304 = super.anInt1777 >> 12;
				local261 = super.anInt1776 >> 12;
				@Pc(318) Class354 local318;
				if (local58.aClass9_Sub1_Sub2_2 != null) {
					local318 = local58.aClass9_Sub1_Sub2_2.method9080(arg0);
					if (local318 != null && local318.method7818(local18, local304, local261)) {
						this.method1664();
						return;
					}
				}
				if (local58.aClass9_Sub1_Sub2_1 != null) {
					local318 = local58.aClass9_Sub1_Sub2_1.method9080(arg0);
					if (local318 != null && local318.method7818(local18, local304, local261)) {
						this.method1664();
						return;
					}
				}
				if (local58.aClass9_Sub1_Sub4_1 != null) {
					local318 = local58.aClass9_Sub1_Sub4_1.method9080(arg0);
					if (local318 != null && local318.method7818(local18, local304, local261)) {
						this.method1664();
						return;
					}
				}
				for (@Pc(375) Class181 local375 = local58.aClass181_3; local375 != null; local375 = local375.aClass181_2) {
					@Pc(382) Class354 local382 = local375.aClass9_Sub1_Sub1_1.method9080(arg0);
					if (local382 != null && local382.method7818(local18, local304, local261)) {
						this.method1664();
						return;
					}
				}
			}
			local40.aClass346_1.aClass357_1.method8203(this);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "()V")
	public void method1664() {
		this.aClass9_Sub3_1.aClass9_Sub5_5.aClass9_Sub2_Sub1_Sub1Array1[this.aShort35] = null;
		Static452.aClass9_Sub2_Sub1_Sub1Array2[Static22.anInt715] = this;
		Static22.anInt715 = Static22.anInt715 + 1 & 0x3FF;
		this.method9182();
		this.method2168();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(JI)V")
	public void method1665(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort32 = (short) (this.aShort32 - arg1);
		if (this.aShort32 <= 0) {
			this.method1664();
			return;
		}
		@Pc(17) int local17 = super.anInt1777 >> 12;
		@Pc(22) int local22 = super.anInt1772 >> 12;
		@Pc(27) int local27 = super.anInt1776 >> 12;
		@Pc(31) Class9_Sub5 local31 = this.aClass9_Sub3_1.aClass9_Sub5_5;
		@Pc(35) Class201 local35 = this.aClass9_Sub3_1.aClass201_1;
		if (local35.anInt5237 != 0) {
			@Pc(65) int local65;
			if (this.aShort31 - this.aShort32 <= local35.anInt5246) {
				local65 = (super.anInt1780 >> 8 & 0xFF00) + (this.anInt1781 >> 16 & 0xFF) + local35.anInt5243 * arg1;
				@Pc(82) int local82 = (super.anInt1780 & 0xFF00) + (this.anInt1781 >> 8 & 0xFF) + local35.anInt5209 * arg1;
				@Pc(99) int local99 = ((super.anInt1780 & 0xFF) << 8) + (this.anInt1781 & 0xFF) + local35.anInt5241 * arg1;
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
				super.anInt1780 &= 0xFF000000;
				super.anInt1780 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt1781 &= 0xFF000000;
				this.anInt1781 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort31 - this.aShort32 <= local35.anInt5228) {
				local65 = (super.anInt1780 >> 16 & 0xFF00) + (this.anInt1781 >> 24 & 0xFF) + local35.anInt5230 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt1780 &= 0xFFFFFF;
				super.anInt1780 |= (local65 & 0xFF00) << 16;
				this.anInt1781 &= 0xFFFFFF;
				this.anInt1781 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5251 != -1 && this.aShort31 - this.aShort32 <= local35.anInt5255) {
			this.anInt1782 += local35.anInt5206 * arg1;
		}
		if (local35.anInt5238 != -1 && this.aShort31 - this.aShort32 <= local35.anInt5220) {
			super.anInt1775 += local35.lb * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort34;
		@Pc(300) double local300 = (double) this.aShort33;
		@Pc(304) double local304 = (double) this.aShort30;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt5250 == 1) {
			local317 = local17 - this.aClass9_Sub3_1.aClass211_1.anInt5541;
			local324 = local22 - this.aClass9_Sub3_1.aClass211_1.anInt5534;
			local331 = local27 - this.aClass9_Sub3_1.aClass211_1.anInt5538;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt5235 * local348 * arg1);
			this.anInt1782 = (int) ((long) this.anInt1782 - ((long) this.anInt1782 * local356 >> 18));
		} else if (local35.anInt5250 == 2) {
			local317 = local17 - this.aClass9_Sub3_1.aClass211_1.anInt5541;
			local324 = local22 - this.aClass9_Sub3_1.aClass211_1.anInt5534;
			local331 = local27 - this.aClass9_Sub3_1.aClass211_1.anInt5538;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt5235 * local348 * arg1);
			this.anInt1782 = (int) ((long) this.anInt1782 - ((long) this.anInt1782 * local356 >> 28));
		}
		if (local35.anIntArray380 != null) {
			@Pc(437) Class3 local437 = local31.aClass342_50.aClass3_291;
			for (@Pc(440) Class3 local440 = local437.aClass3_346; local440 != local437; local440 = local440.aClass3_346) {
				@Pc(444) Class3_Sub7_Sub15 local444 = (Class3_Sub7_Sub15) local440;
				@Pc(447) Class100 local447 = local444.aClass100_1;
				if (local447.anInt2719 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray380.length; local455++) {
						if (local35.anIntArray380[local455] == local447.anInt2716) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt6093);
						@Pc(486) double local486 = (double) (local22 - local444.anInt6089);
						@Pc(492) double local492 = (double) (local27 - local444.anInt6088);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong102)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt6090 + local486 * (double) local447.anInt2722 + local492 * (double) local444.anInt6091) * 65535.0D / ((double) local447.anInt2714 * local513);
							if (!(local545 < (double) local447.anInt2710)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt2712 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt2711;
								} else if (local447.anInt2712 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt2711;
								}
								if (local447.anInt2717 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt2714;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt2714;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt2714;
									if (local447.anInt2713 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt1777 = (int) ((double) super.anInt1777 + local678 * (double) arg1);
										super.anInt1772 = (int) ((double) super.anInt1772 + local686 * (double) arg1);
										super.anInt1776 = (int) ((double) super.anInt1776 + local694 * (double) arg1);
									}
								} else if (local447.anInt2713 == 0) {
									local296 += ((double) local444.anInt6090 - local553) * (double) arg1;
									local300 += ((double) local447.anInt2722 - local553) * (double) arg1;
									local304 += ((double) local444.anInt6091 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt1777 = (int) ((double) super.anInt1777 + ((double) local444.anInt6090 - local553) * (double) arg1);
									super.anInt1772 = (int) ((double) super.anInt1772 + ((double) local447.anInt2722 - local553) * (double) arg1);
									super.anInt1776 = (int) ((double) super.anInt1776 + ((double) local444.anInt6091 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray378 != null) {
			for (local317 = 0; local317 < local35.anIntArray378.length; local317++) {
				@Pc(776) Class3_Sub7_Sub15 local776 = (Class3_Sub7_Sub15) Static215.aClass48_1.method1409((long) local35.anIntArray378[local317]);
				while (local776 != null) {
					@Pc(780) Class100 local780 = local776.aClass100_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt6093);
					@Pc(792) double local792 = (double) (local22 - local776.anInt6089);
					@Pc(798) double local798 = (double) (local27 - local776.anInt6088);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong102) {
						local776 = (Class3_Sub7_Sub15) Static215.aClass48_1.method1410();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt6090 + local792 * (double) local780.anInt2722 + local798 * (double) local776.anInt6091) * 65535.0D / ((double) local780.anInt2714 * local825);
						if (local857 < (double) local780.anInt2710) {
							local776 = (Class3_Sub7_Sub15) Static215.aClass48_1.method1410();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt2712 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt2711;
							} else if (local780.anInt2712 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt2711;
							}
							if (local780.anInt2717 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt2714;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt2714;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt2714;
								if (local780.anInt2713 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt1777 = (int) ((double) super.anInt1777 + local996 * (double) arg1);
									super.anInt1772 = (int) ((double) super.anInt1772 + local1004 * (double) arg1);
									super.anInt1776 = (int) ((double) super.anInt1776 + local1012 * (double) arg1);
								}
							} else if (local780.anInt2713 == 0) {
								local296 += ((double) local776.anInt6090 - local871) * (double) arg1;
								local300 += ((double) local780.anInt2722 - local871) * (double) arg1;
								local304 += ((double) local776.anInt6091 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt1777 = (int) ((double) super.anInt1777 + ((double) local776.anInt6090 - local871) * (double) arg1);
								super.anInt1772 = (int) ((double) super.anInt1772 + ((double) local780.anInt2722 - local871) * (double) arg1);
								super.anInt1776 = (int) ((double) super.anInt1776 + ((double) local776.anInt6091 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub7_Sub15) Static215.aClass48_1.method1410();
						}
					}
				}
			}
		}
		if (local35.anIntArray381 != null) {
			if (local35.anIntArray379 == null) {
				local35.anIntArray379 = new int[local35.anIntArray381.length];
				for (local317 = 0; local317 < local35.anIntArray381.length; local317++) {
					Static500.method6841(local35.anIntArray381[local317]);
					local35.anIntArray379[local317] = ((Class3_Sub44) Static235.aClass313_19.method7104((long) local35.anIntArray381[local317])).anInt7298;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray379.length; local317++) {
				@Pc(1137) Class100 local1137 = Static205.aClass100Array1[local35.anIntArray379[local317]];
				if (local1137.anInt2713 == 0) {
					local296 += (double) (local1137.anInt2708 * arg1);
					local300 += (double) (local1137.anInt2722 * arg1);
					local304 += (double) (local1137.anInt2715 * arg1);
					local306 = true;
				} else {
					super.anInt1777 += local1137.anInt2708 * arg1;
					super.anInt1772 += local1137.anInt2722 * arg1;
					super.anInt1776 += local1137.anInt2715 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort34 = (short) (int) local296;
					this.aShort33 = (short) (int) local300;
					this.aShort30 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt1782 <<= 0x1;
			}
		}
		super.anInt1777 = (int) ((long) super.anInt1777 + ((long) this.aShort34 * (long) (this.anInt1782 << 2) >> 23) * (long) arg1);
		super.anInt1772 = (int) ((long) super.anInt1772 + ((long) this.aShort33 * (long) (this.anInt1782 << 2) >> 23) * (long) arg1);
		super.anInt1776 = (int) ((long) super.anInt1776 + ((long) this.aShort30 * (long) (this.anInt1782 << 2) >> 23) * (long) arg1);
	}
}
