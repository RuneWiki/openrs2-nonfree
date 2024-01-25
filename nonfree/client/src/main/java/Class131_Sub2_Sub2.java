import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class131_Sub2_Sub2 extends Class131_Sub2 {

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!vda;IIII[[I[[II)V")
	public Class131_Sub2_Sub2(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7182(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class178_Sub2 local9 = (Class178_Sub2) super.aClass62_Sub2_16.method7071(Thread.currentThread());
		@Pc(12) Class90 local12 = local9.aClass90_1;
		local12.anInt2573 = 0;
		local12.aBoolean169 = false;
		if (super.aClass198ArrayArray3 != null) {
			this.method7195(local12, arg2, arg3, arg1, arg4, local9.anIntArray520, arg0, local9.anIntArray545);
		} else if (super.aClass286ArrayArray3 != null) {
			this.method7196(arg3, arg4, local9.anIntArray520, arg0, arg2, local12, arg1, local9.anIntArray545);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!eq;IIIIIII[[Z[II[I)V")
	private void method7195(@OriginalArg(0) Class90 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) boolean[][] arg4, @OriginalArg(9) int[] arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int[] arg7) {
		@Pc(13) int local13 = (arg2 - arg3) * 1024 / 256;
		arg0.aBoolean168 = false;
		arg0.aBoolean165 = false;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local13;
		for (@Pc(36) int local36 = arg6; local36 < arg1; local36++) {
			for (@Pc(40) int local40 = arg3; local40 < arg2; local40++) {
				if (arg4[local36 - arg6][local40 - arg3]) {
					@Pc(76) int local76;
					if (super.aClass198ArrayArray3[local36][local40] != null) {
						@Pc(291) Class198 local291 = super.aClass198ArrayArray3[local36][local40];
						if (local291.aShort79 != -1 && (local291.aByte57 & 0x2) == 0 && local291.anInt6071 == 0) {
							local76 = super.aClass62_Sub2_16.method7076(local291.aShort79);
							arg0.method2313(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static413.method7354(local76, local291.anInt6072), Static413.method7354(local76, local291.anInt6068), Static413.method7354(local76, local291.anInt6070));
							arg0.method2313(local34, local34, local34 - 4, local30, local30 + 4, local30, Static413.method7354(local76, local291.anInt6069), Static413.method7354(local76, local291.anInt6070), Static413.method7354(local76, local291.anInt6068));
						} else if (local291.anInt6071 == 0) {
							arg0.method2306(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, local291.anInt6072, local291.anInt6068, local291.anInt6070);
							arg0.method2306(local34, local34, local34 - 4, local30, local30 + 4, local30, local291.anInt6069, local291.anInt6070, local291.anInt6068);
						} else {
							local76 = local291.anInt6071;
							arg0.method2306(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static75.method1354(local291.anInt6072 & 0xFF000000, local76), Static75.method1354(local291.anInt6068 & 0xFF000000, local76), Static75.method1354(local291.anInt6070 & 0xFF000000, local76));
							arg0.method2306(local34, local34, local34 - 4, local30, local30 + 4, local30, Static75.method1354(local291.anInt6069 & 0xFF000000, local76), Static75.method1354(local291.anInt6070 & 0xFF000000, local76), Static75.method1354(local291.anInt6068 & 0xFF000000, local76));
						}
					} else if (super.aClass297ArrayArray3[local36][local40] != null) {
						@Pc(74) Class297 local74 = super.aClass297ArrayArray3[local36][local40];
						for (local76 = 0; local76 < local74.aShort114; local76++) {
							arg5[local76] = local74.aShortArray133[local76] * 4 / super.anInt8874 + local30;
							arg7[local76] = local34 - local74.aShortArray131[local76] * 4 / super.anInt8874;
						}
						for (@Pc(114) int local114 = 0; local114 < local74.aShort113; local114++) {
							@Pc(120) int local120 = local114 * 3;
							@Pc(124) int local124 = local120 + 1;
							@Pc(128) int local128 = local124 + 1;
							@Pc(132) int local132 = arg5[local120];
							@Pc(136) int local136 = arg5[local124];
							@Pc(140) int local140 = arg5[local128];
							@Pc(144) int local144 = arg7[local120];
							@Pc(148) int local148 = arg7[local124];
							@Pc(152) int local152 = arg7[local128];
							@Pc(211) int local211;
							if (local74.anIntArray666 != null && local74.anIntArray666[local114] != 0 && (local74.aShortArray134 == null || local74.aShortArray134 != null && local74.aShortArray134[local114] == -1)) {
								local211 = local74.anIntArray666[local114];
								arg0.method2306(local144, local148, local152, local132, local136, local140, Static75.method1354(-(local74.anIntArray667[local120] & -16777216) - 16777216, local211), Static75.method1354(-(local74.anIntArray667[local124] & 0xFF000000) - 16777216, local211), Static75.method1354(-(-16777216 & local74.anIntArray667[local128]) - 16777216, local211));
							} else if (local74.aShortArray134 == null || local74.aShortArray134[local114] == -1) {
								arg0.method2306(local144, local148, local152, local132, local136, local140, local74.anIntArray667[local120], local74.anIntArray667[local124], local74.anIntArray667[local128]);
							} else {
								local211 = super.aClass62_Sub2_16.method7076(local74.aShortArray134[local114]);
								arg0.method2313(local144, local148, local152, local132, local136, local140, local211, local211, local211);
							}
						}
					}
				}
				local34 -= 4;
			}
			local34 = local13;
			local30 += 4;
		}
		arg0.aBoolean165 = true;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(III[[Z[IIIILclient!eq;II[I)V")
	private void method7196(@OriginalArg(1) int arg0, @OriginalArg(3) boolean[][] arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) Class90 arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int[] arg7) {
		@Pc(14) int local14 = (arg0 - arg6) * 1024 / 256;
		arg5.aBoolean165 = false;
		arg5.aBoolean168 = false;
		@Pc(26) int local26 = 0;
		@Pc(34) int local34 = local14;
		for (@Pc(36) int local36 = arg3; local36 < arg4; local36++) {
			for (@Pc(40) int local40 = arg6; local40 < arg0; local40++) {
				if (arg1[local36 - arg3][local40 - arg6]) {
					@Pc(76) int local76;
					if (super.aClass286ArrayArray3[local36][local40] != null) {
						@Pc(300) Class286 local300 = super.aClass286ArrayArray3[local36][local40];
						if (local300.aShort103 != -1 && (local300.aByte89 & 0x2) == 0 && local300.anInt8345 == -1) {
							local76 = super.aClass62_Sub2_16.method7076(local300.aShort103);
							arg5.method2313(local34 - 4, local34 - 4, local34, local26 + 4, local26, local26 + 4, Static413.method7354(local76, local300.aShort102 & 0xFFFF), Static413.method7354(local76, local300.aShort104 & 0xFFFF), Static413.method7354(local76, local300.aShort106 & 0xFFFF));
							arg5.method2313(local34, local34, local34 - 4, local26, local26 + 4, local26, Static413.method7354(local76, local300.aShort105 & 0xFFFF), Static413.method7354(local76, local300.aShort106 & 0xFFFF), Static413.method7354(local76, local300.aShort104 & 0xFFFF));
						} else if (local300.anInt8345 == -1) {
							arg5.method2313(local34 - 4, local34 + -4, local34, local26 + 4, local26, local26 + 4, local300.aShort102 & 0xFFFF, local300.aShort104 & 0xFFFF, local300.aShort106 & 0xFFFF);
							arg5.method2313(local34, local34, local34 - 4, local26, local26 + 4, local26, local300.aShort105 & 0xFFFF, local300.aShort106 & 0xFFFF, local300.aShort104 & 0xFFFF);
						} else {
							local76 = local300.anInt8345;
							arg5.method2313(local34 - 4, local34 - 4, local34, local26 + 4, local26, local26 + 4, local76, local76, local76);
							arg5.method2313(local34, local34, local34 - 4, local26, local26 + 4, local26, local76, local76, local76);
						}
					} else if (super.aClass169ArrayArray3[local36][local40] != null) {
						@Pc(74) Class169 local74 = super.aClass169ArrayArray3[local36][local40];
						for (local76 = 0; local76 < local74.aShort61; local76++) {
							arg2[local76] = local74.aShortArray54[local76] * 4 / super.anInt8874 + local26;
							arg7[local76] = local34 - local74.aShortArray59[local76] * 4 / super.anInt8874;
						}
						for (@Pc(117) int local117 = 0; local117 < local74.aShort62; local117++) {
							@Pc(124) short local124 = local74.aShortArray56[local117];
							@Pc(129) short local129 = local74.aShortArray53[local117];
							@Pc(134) short local134 = local74.aShortArray57[local117];
							@Pc(138) int local138 = arg2[local124];
							@Pc(142) int local142 = arg2[local129];
							@Pc(146) int local146 = arg2[local134];
							@Pc(150) int local150 = arg7[local124];
							@Pc(154) int local154 = arg7[local129];
							@Pc(158) int local158 = arg7[local134];
							@Pc(173) int local173;
							if (local74.anIntArray314 != null && local74.anIntArray314[local117] != -1) {
								local173 = local74.anIntArray314[local117];
								arg5.method2313(local150, local154, local158, local138, local142, local146, Static413.method7354(local173, local74.aShortArray58[local124]), Static413.method7354(local173, local74.aShortArray58[local129]), Static413.method7354(local173, local74.aShortArray58[local134]));
							} else if (local74.aShortArray52 == null || local74.aShortArray52[local117] == -1) {
								local173 = local74.anIntArray313[local117];
								arg5.method2313(local150, local154, local158, local138, local142, local146, Static413.method7354(local173, local74.aShortArray58[local124]), Static413.method7354(local173, local74.aShortArray58[local129]), Static413.method7354(local173, local74.aShortArray58[local134]));
							} else {
								local173 = super.aClass62_Sub2_16.method7076(local74.aShortArray52[local117]);
								arg5.method2313(local150, local154, local158, local138, local142, local146, Static413.method7354(local173, local74.aShortArray58[local124]), Static413.method7354(local173, local74.aShortArray58[local129]), Static413.method7354(local173, local74.aShortArray58[local134]));
							}
						}
					}
				}
				local34 -= 4;
			}
			local34 = local14;
			local26 += 4;
		}
		arg5.aBoolean165 = true;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
	@Override
	public void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class178_Sub2 local9 = (Class178_Sub2) super.aClass62_Sub2_16.method7071(Thread.currentThread());
		local9.aClass90_1.anInt2573 = 0;
		if (super.aClass198ArrayArray3 != null) {
			this.method7200(arg1, arg0, local9.anIntArray528, local9.anIntArray545, super.aClass62_Sub2_16.aBoolean631, local9.aClass90_1, local9.anIntArray520);
		} else if (super.aClass286ArrayArray3 != null) {
			this.method7198(arg0, local9.anIntArray520, local9.anIntArray545, arg1, local9.anIntArray528, local9.aClass90_1);
			return;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II[I[II[ILclient!eq;)V")
	private void method7198(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class90 arg5) {
		@Pc(12) Class286 local12 = super.aClass286ArrayArray3[arg0][arg3];
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(238) int local238;
		@Pc(278) int local278;
		@Pc(334) int local334;
		@Pc(410) int local410;
		@Pc(267) int local267;
		@Pc(323) int local323;
		@Pc(381) int local381;
		@Pc(422) int local422;
		@Pc(203) int local203;
		@Pc(256) int local256;
		@Pc(312) int local312;
		@Pc(370) int local370;
		@Pc(226) int local226;
		@Pc(295) int local295;
		@Pc(353) int local353;
		@Pc(399) int local399;
		@Pc(72) int local72;
		@Pc(71) int local71;
		@Pc(69) int local69;
		@Pc(67) int local67;
		@Pc(460) int local460;
		if (local12 == null) {
			@Pc(1117) Class169 local1117 = super.aClass169ArrayArray3[arg0][arg3];
			if (local1117 != null) {
				@Pc(1148) short local1148;
				if (super.anInt8881 == -1) {
					for (local410 = 0; local410 < local1117.aShort61; local410++) {
						local33 = local1117.aShortArray54[local410] + (arg0 << super.anInt8869);
						local1148 = local1117.aShortArray55[local410];
						local43 = local1117.aShortArray59[local410] + (arg3 << super.anInt8869);
						local334 = (super.anInt8887 * local1148 + local33 * super.anInt8877 + local43 * super.anInt8882 >> 15) + super.anInt8879;
						if (super.aClass62_Sub2_16.anInt8677 >= local334) {
							return;
						}
						local278 = (local43 * super.anInt8876 + local33 * super.anInt8888 + super.anInt8884 * local1148 >> 15) + super.anInt8886;
						local238 = super.anInt8883 + (local43 * super.anInt8885 + local33 * super.anInt8875 + super.anInt8878 * local1148 >> 15);
						arg1[local410] = arg5.anInt2569 + super.aClass62_Sub2_16.anInt8674 * local238 / local334;
						arg2[local410] = local278 * super.aClass62_Sub2_16.anInt8689 / local334 + arg5.anInt2574;
					}
				} else {
					for (local410 = 0; local410 < local1117.aShort61; local410++) {
						local33 = local1117.aShortArray54[local410] + (arg0 << super.anInt8869);
						local1148 = local1117.aShortArray55[local410];
						local43 = local1117.aShortArray59[local410] + (arg3 << super.anInt8869);
						local238 = super.anInt8883 + (local43 * super.anInt8885 + super.anInt8875 * local33 + super.anInt8878 * local1148 >> 15);
						local278 = (local33 * super.anInt8888 + local1148 * super.anInt8884 + super.anInt8876 * local43 >> 15) + super.anInt8886;
						arg1[local410] = arg5.anInt2569 + local238 * super.aClass62_Sub2_16.anInt8674 / super.anInt8881;
						arg2[local410] = arg5.anInt2574 + local278 * super.aClass62_Sub2_16.anInt8689 / super.anInt8881;
					}
				}
				if (local1117.aShortArray52 == null) {
					for (local410 = 0; local410 < local1117.aShort62; local410++) {
						@Pc(1388) short local1388 = local1117.aShortArray56[local410];
						@Pc(1393) short local1393 = local1117.aShortArray53[local410];
						@Pc(1398) short local1398 = local1117.aShortArray57[local410];
						local422 = arg1[local1388];
						local203 = arg1[local1393];
						local256 = arg1[local1398];
						local312 = arg2[local1388];
						local370 = arg2[local1393];
						local226 = arg2[local1398];
						if ((local226 - local370) * (local422 - local203) - (local256 - local203) * (local312 + -local370) > 0) {
							local295 = local1117.anIntArray313[local410];
							if (local295 != -1) {
								arg5.aBoolean169 = local422 < 0 || local203 < 0 || local256 < 0 || local422 > arg5.anInt2571 || local203 > arg5.anInt2571 || local256 > arg5.anInt2571;
								arg5.method2313(local312, local370, local226, local422, local203, local256, Static413.method7354(local295, local1117.aShortArray58[local1388]), Static413.method7354(local295, local1117.aShortArray58[local1393]), Static413.method7354(local295, local1117.aShortArray58[local1398]));
							}
						}
					}
				} else {
					local410 = super.anIntArrayArray78[arg0][arg3];
					local267 = super.anIntArrayArray78[arg0 + 1][arg3];
					local323 = super.anIntArrayArray78[arg0][arg3 + 1];
					local381 = arg0 * super.anInt8874;
					local422 = super.anInt8874 + local381;
					local203 = super.anInt8874 * arg3;
					local256 = local203 + super.anInt8874;
					local312 = super.anInt8883 + (local410 * super.anInt8878 + local381 * super.anInt8875 + super.anInt8885 * local203 >> 15);
					local370 = (local203 * super.anInt8876 + local410 * super.anInt8884 + local381 * super.anInt8888 >> 15) + super.anInt8886;
					local226 = super.anInt8879 + (super.anInt8887 * local410 + super.anInt8877 * local381 + super.anInt8882 * local203 >> 15);
					local295 = (super.anInt8885 * local203 + local422 * super.anInt8875 + local267 * super.anInt8878 >> 15) + super.anInt8883;
					local353 = super.anInt8886 + (super.anInt8876 * local203 + local422 * super.anInt8888 + super.anInt8884 * local267 >> 15);
					local399 = (super.anInt8882 * local203 + super.anInt8887 * local267 + local422 * super.anInt8877 >> 15) + super.anInt8879;
					local72 = super.anInt8883 + (local323 * super.anInt8878 + super.anInt8875 * local381 + super.anInt8885 * local256 >> 15);
					local71 = super.anInt8886 + (local256 * super.anInt8876 + local323 * super.anInt8884 + super.anInt8888 * local381 >> 15);
					local69 = (super.anInt8882 * local256 + local381 * super.anInt8877 + super.anInt8887 * local323 >> 15) + super.anInt8879;
					for (local67 = 0; local67 < local1117.aShort62; local67++) {
						@Pc(1761) short local1761 = local1117.aShortArray56[local67];
						@Pc(1766) short local1766 = local1117.aShortArray53[local67];
						@Pc(1771) short local1771 = local1117.aShortArray57[local67];
						local460 = arg1[local1761];
						@Pc(1779) int local1779 = arg1[local1766];
						@Pc(1783) int local1783 = arg1[local1771];
						@Pc(1787) int local1787 = arg2[local1761];
						@Pc(1791) int local1791 = arg2[local1766];
						@Pc(1795) int local1795 = arg2[local1771];
						if (-((local1783 - local1779) * (-local1791 + local1787)) + (local460 - local1779) * (local1795 + -local1791) > 0) {
							arg5.aBoolean169 = local460 < 0 || local1779 < 0 || local1783 < 0 || arg5.anInt2571 < local460 || arg5.anInt2571 < local1779 || local1783 > arg5.anInt2571;
							@Pc(1851) short local1851 = local1117.aShortArray52[local67];
							if (local1851 == -1) {
								@Pc(1860) int local1860 = local1117.anIntArray313[local67];
								if (local1860 != -1) {
									arg5.method2313(local1787, local1791, local1795, local460, local1779, local1783, Static413.method7354(local1860, local1117.aShortArray58[local1761]), Static413.method7354(local1860, local1117.aShortArray58[local1766]), Static413.method7354(local1860, local1117.aShortArray58[local1771]));
								}
							} else {
								if (this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local1851).aByte78)) {
									arg5.anInt2573 = 100;
								}
								arg5.method2302(local1787, local1791, local1795, local460, local1779, local1783, local1117.aShortArray58[local1761], local1117.aShortArray58[local1766], local1117.aShortArray58[local1771], local312, local295, local72, local370, local353, local71, local226, local399, local69, local1851);
								arg5.anInt2573 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte89 & 0x2) == 0) {
			@Pc(28) int local28 = arg0 * super.anInt8874;
			local33 = super.anInt8874 + local28;
			@Pc(38) int local38 = arg3 * super.anInt8874;
			local43 = super.anInt8874 + local38;
			@Pc(58) int local58;
			@Pc(79) int local79;
			@Pc(208) int local208;
			if ((local12.aByte89 & 0x1) == 0) {
				local58 = super.anIntArrayArray78[arg0][arg3];
				local79 = super.anIntArrayArray78[arg0 + 1][arg3];
				local208 = super.anIntArrayArray78[arg0 + 1][arg3 + 1];
				local460 = super.anIntArrayArray78[arg0][arg3 + 1];
				if (super.anInt8881 == -1) {
					local72 = super.anInt8879 + (local38 * super.anInt8882 + super.anInt8887 * local58 + local28 * super.anInt8877 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local72) {
						return;
					}
					local71 = (super.anInt8882 * local38 + super.anInt8877 * local33 + super.anInt8887 * local79 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local71) {
						return;
					}
					local69 = (local33 * super.anInt8877 + local208 * super.anInt8887 + super.anInt8882 * local43 >> 15) + super.anInt8879;
					if (local69 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local67 = super.anInt8879 + (super.anInt8877 * local28 + super.anInt8887 * local460 + local43 * super.anInt8882 >> 15);
					if (local67 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
				} else {
					local67 = super.anInt8881;
					local69 = super.anInt8881;
					local71 = super.anInt8881;
					local72 = super.anInt8881;
				}
				local203 = super.anInt8883 + (super.anInt8878 * local58 + local28 * super.anInt8875 + local38 * super.anInt8885 >> 15);
				local226 = (super.anInt8876 * local38 + super.anInt8884 * local58 + local28 * super.anInt8888 >> 15) + super.anInt8886;
				local238 = arg5.anInt2569 + super.aClass62_Sub2_16.anInt8674 * local203 / local72;
				local267 = arg5.anInt2574 + local226 * super.aClass62_Sub2_16.anInt8689 / local72;
				local256 = super.anInt8883 + (super.anInt8875 * local33 + super.anInt8878 * local79 + super.anInt8885 * local38 >> 15);
				local295 = super.anInt8886 + (local33 * super.anInt8888 + super.anInt8884 * local79 + local38 * super.anInt8876 >> 15);
				local278 = super.aClass62_Sub2_16.anInt8674 * local256 / local71 + arg5.anInt2569;
				local323 = arg5.anInt2574 + super.aClass62_Sub2_16.anInt8689 * local295 / local71;
				local312 = (local33 * super.anInt8875 + super.anInt8878 * local208 + super.anInt8885 * local43 >> 15) + super.anInt8883;
				local334 = arg5.anInt2569 + local312 * super.aClass62_Sub2_16.anInt8674 / local69;
				local353 = super.anInt8886 + (local43 * super.anInt8876 + local208 * super.anInt8884 + super.anInt8888 * local33 >> 15);
				local370 = super.anInt8883 + (local43 * super.anInt8885 + super.anInt8878 * local460 + local28 * super.anInt8875 >> 15);
				local381 = arg5.anInt2574 + super.aClass62_Sub2_16.anInt8689 * local353 / local69;
				local399 = super.anInt8886 + (local43 * super.anInt8876 + local28 * super.anInt8888 + local460 * super.anInt8884 >> 15);
				local410 = local370 * super.aClass62_Sub2_16.anInt8674 / local67 + arg5.anInt2569;
				local422 = arg5.anInt2574 + local399 * super.aClass62_Sub2_16.anInt8689 / local67;
			} else {
				local58 = super.anIntArrayArray78[arg0][arg3];
				if (super.anInt8881 == -1) {
					local79 = local58 * super.anInt8887;
					local72 = (local79 + super.anInt8877 * local28 + local38 * super.anInt8882 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local72) {
						return;
					}
					local71 = (local79 + local33 * super.anInt8877 + local38 * super.anInt8882 >> 15) + super.anInt8879;
					if (local71 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local69 = (super.anInt8882 * local43 + local79 + super.anInt8877 * local33 >> 15) + super.anInt8879;
					if (local69 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local67 = (super.anInt8882 * local43 + local79 + super.anInt8877 * local28 >> 15) + super.anInt8879;
					if (local67 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
				} else {
					local67 = super.anInt8881;
					local69 = super.anInt8881;
					local71 = super.anInt8881;
					local72 = super.anInt8881;
				}
				local79 = local58 * super.anInt8878;
				local203 = (local79 + super.anInt8875 * local28 + super.anInt8885 * local38 >> 15) + super.anInt8883;
				local208 = local58 * super.anInt8884;
				local226 = (local28 * super.anInt8888 + local208 + local38 * super.anInt8876 >> 15) + super.anInt8886;
				local238 = arg5.anInt2569 + local203 * super.aClass62_Sub2_16.anInt8674 / local72;
				local256 = (local33 * super.anInt8875 + local79 + local38 * super.anInt8885 >> 15) + super.anInt8883;
				local267 = arg5.anInt2574 + local226 * super.aClass62_Sub2_16.anInt8689 / local72;
				local278 = super.aClass62_Sub2_16.anInt8674 * local256 / local71 + arg5.anInt2569;
				local295 = super.anInt8886 + (local208 + super.anInt8888 * local33 + super.anInt8876 * local38 >> 15);
				local312 = (local79 + super.anInt8875 * local33 + super.anInt8885 * local43 >> 15) + super.anInt8883;
				local323 = arg5.anInt2574 + super.aClass62_Sub2_16.anInt8689 * local295 / local71;
				local334 = super.aClass62_Sub2_16.anInt8674 * local312 / local69 + arg5.anInt2569;
				local353 = super.anInt8886 + (local208 + local33 * super.anInt8888 + local43 * super.anInt8876 >> 15);
				local370 = (super.anInt8885 * local43 + local79 + local28 * super.anInt8875 >> 15) + super.anInt8883;
				local381 = super.aClass62_Sub2_16.anInt8689 * local353 / local69 + arg5.anInt2574;
				local399 = super.anInt8886 + (super.anInt8876 * local43 + super.anInt8888 * local28 + local208 >> 15);
				local410 = super.aClass62_Sub2_16.anInt8674 * local370 / local67 + arg5.anInt2569;
				local422 = arg5.anInt2574 + local399 * super.aClass62_Sub2_16.anInt8689 / local67;
			}
			if (-((local381 - local422) * (local278 + -local410)) + (local323 - local422) * (-local410 + local334) > 0) {
				arg5.aBoolean169 = local334 < 0 || local410 < 0 || local278 < 0 || arg5.anInt2571 < local334 || local410 > arg5.anInt2571 || arg5.anInt2571 < local278;
				if (local12.aShort103 >= 0) {
					if (this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local12.aShort103).aByte78)) {
						arg5.anInt2573 = 100;
					}
					arg5.method2302(local381, local422, local323, local334, local410, local278, local12.aShort102 & 0xFFFF, local12.aShort104 & 0xFFFF, local12.aShort106 & 0xFFFF, local203, local256, local370, local226, local295, local399, local72, local71, local67, local12.aShort103);
					arg5.anInt2573 = 0;
				} else {
					arg5.method2313(local381, local422, local323, local334, local410, local278, local12.aShort102 & 0xFFFF, local12.aShort104 & 0xFFFF, local12.aShort106 & 0xFFFF);
				}
			}
			if (-((local410 - local278) * (local267 + -local323)) + (local422 - local323) * (-local278 + local238) > 0) {
				arg5.aBoolean169 = local238 < 0 || local278 < 0 || local410 < 0 || arg5.anInt2571 < local238 || local278 > arg5.anInt2571 || arg5.anInt2571 < local410;
				if (local12.aShort103 >= 0) {
					if (this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local12.aShort103).aByte78)) {
						arg5.anInt2573 = 100;
					}
					arg5.method2302(local267, local323, local422, local238, local278, local410, local12.aShort105 & 0xFFFF, local12.aShort106 & 0xFFFF, local12.aShort104 & 0xFFFF, local203, local256, local370, local226, local295, local399, local72, local71, local67, local12.aShort103);
					arg5.anInt2573 = 0;
					return;
				}
				arg5.method2313(local267, local323, local422, local238, local278, local410, local12.aShort105 & 0xFFFF, local12.aShort106 & 0xFFFF, local12.aShort104 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II[I[IIZLclient!eq;[I)V")
	private void method7200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class198 local12 = super.aClass198ArrayArray3[arg1][arg0];
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(45) int local45;
		@Pc(472) int local472;
		@Pc(556) int local556;
		@Pc(599) int local599;
		@Pc(683) int local683;
		@Pc(524) int local524;
		@Pc(587) int local587;
		@Pc(630) int local630;
		@Pc(694) int local694;
		@Pc(460) int local460;
		@Pc(513) int local513;
		@Pc(576) int local576;
		@Pc(651) int local651;
		@Pc(493) int local493;
		@Pc(545) int local545;
		@Pc(619) int local619;
		@Pc(672) int local672;
		@Pc(124) int local124;
		@Pc(156) int local156;
		@Pc(184) int local184;
		@Pc(210) int local210;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(234) int local234;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(90) int local90;
		@Pc(99) int local99;
		@Pc(253) int local253;
		if (local12 == null) {
			@Pc(1592) Class297 local1592 = super.aClass297ArrayArray3[arg1][arg0];
			if (local1592 != null) {
				if (super.anInt8881 == -1) {
					for (local683 = 0; local683 < local1592.aShort114; local683++) {
						local34 = local1592.aShortArray133[local683] + (arg1 << super.anInt8869);
						local39 = local1592.aShortArray130[local683];
						local45 = local1592.aShortArray131[local683] + (arg0 << super.anInt8869);
						local599 = (super.anInt8887 * local39 + super.anInt8877 * local34 + local45 * super.anInt8882 >> 15) + super.anInt8879;
						if (super.aClass62_Sub2_16.anInt8677 >= local599) {
							return;
						}
						arg2[local683] = 0;
						if (arg4) {
							local524 = local599 - super.aClass62_Sub2_16.anInt8682;
							if (local524 > 255) {
								local524 = 255;
							}
							if (local524 > 0) {
								arg2[local683] = local524;
								local587 = local524 * local1592.aShortArray135[local683] / 255;
								if (local587 > 0) {
									local39 -= local587;
								}
							}
						} else if (super.aClass62_Sub2_16.aBoolean632) {
							local524 = local599 - super.aClass62_Sub2_16.anInt8682;
							if (local524 > 0) {
								arg2[local683] = local524;
								if (arg2[local683] > 255) {
									arg2[local683] = 255;
								}
							}
						}
						local472 = (local34 * super.anInt8875 + super.anInt8878 * local39 + local45 * super.anInt8885 >> 15) + super.anInt8883;
						local556 = (super.anInt8884 * local39 + local34 * super.anInt8888 + super.anInt8876 * local45 >> 15) + super.anInt8886;
						arg6[local683] = arg5.anInt2569 + local472 * super.aClass62_Sub2_16.anInt8674 / local599;
						arg3[local683] = super.aClass62_Sub2_16.anInt8689 * local556 / local599 + arg5.anInt2574;
					}
				} else {
					for (local683 = 0; local683 < local1592.aShort114; local683++) {
						local34 = local1592.aShortArray133[local683] + (arg1 << super.anInt8869);
						local39 = local1592.aShortArray130[local683];
						local45 = local1592.aShortArray131[local683] + (arg0 << super.anInt8869);
						arg2[local683] = 0;
						if (arg4) {
							local524 = -super.aClass62_Sub2_16.anInt8682 + super.anInt8881;
							if (local524 > 255) {
								local524 = 255;
							}
							if (local524 > 0) {
								arg2[local683] = local524;
								local587 = local1592.aShortArray135[local683] * local524 / 255;
								if (local587 > 0) {
									local39 -= local587;
								}
							}
						} else if (super.aClass62_Sub2_16.aBoolean632) {
							local524 = -super.aClass62_Sub2_16.anInt8682 + super.anInt8881;
							if (local524 > 0) {
								arg2[local683] = local524;
								if (arg2[local683] > 255) {
									arg2[local683] = 255;
								}
							}
						}
						local556 = (local39 * super.anInt8884 + super.anInt8888 * local34 + local45 * super.anInt8876 >> 15) + super.anInt8886;
						local472 = (super.anInt8885 * local45 + local39 * super.anInt8878 + super.anInt8875 * local34 >> 15) + super.anInt8883;
						arg6[local683] = arg5.anInt2569 + super.aClass62_Sub2_16.anInt8674 * local472 / super.anInt8881;
						arg3[local683] = super.aClass62_Sub2_16.anInt8689 * local556 / super.anInt8881 + arg5.anInt2574;
					}
				}
				if (local1592.aShortArray134 == null) {
					for (local683 = 0; local683 < local1592.aShort113; local683++) {
						local524 = local683 * 3;
						local587 = local524 + 1;
						local630 = local587 + 1;
						local694 = arg6[local524];
						local460 = arg6[local587];
						local513 = arg6[local630];
						local576 = arg3[local524];
						local651 = arg3[local587];
						local493 = arg3[local630];
						local545 = arg2[local630] + arg2[local587] + arg2[local524];
						if (-((local576 - local651) * (-local460 + local513)) + (local694 - local460) * (-local651 + local493) > 0) {
							arg5.aBoolean169 = local694 < 0 || local460 < 0 || local513 < 0 || arg5.anInt2571 < local694 || arg5.anInt2571 < local460 || arg5.anInt2571 < local513;
							if (local545 >= 765) {
								arg5.method2310(local576, local651, local493, local694, local460, local513, super.aClass62_Sub2_16.anInt8684);
							} else if (local545 > 0) {
								if ((local1592.anIntArray667[local524] & 0xFFFFFF) != 0) {
									arg5.method2306(local576, local651, local493, local694, local460, local513, Static158.method2887(local1592.anIntArray667[local524], arg2[local524], super.aClass62_Sub2_16.anInt8684), Static158.method2887(local1592.anIntArray667[local587], arg2[local587], super.aClass62_Sub2_16.anInt8684), Static158.method2887(local1592.anIntArray667[local630], arg2[local630], super.aClass62_Sub2_16.anInt8684));
								}
							} else if ((local1592.anIntArray667[local524] & 0xFFFFFF) != 0) {
								arg5.method2306(local576, local651, local493, local694, local460, local513, local1592.anIntArray667[local524], local1592.anIntArray667[local587], local1592.anIntArray667[local630]);
							}
						}
					}
				} else {
					local683 = super.anIntArrayArray78[arg1][arg0];
					local524 = super.anIntArrayArray78[arg1 + 1][arg0];
					local587 = super.anIntArrayArray78[arg1][arg0 + 1];
					local630 = arg1 * super.anInt8874;
					local694 = local630 + super.anInt8874;
					local460 = arg0 * super.anInt8874;
					local513 = super.anInt8874 + local460;
					local576 = super.anInt8883 + (super.anInt8878 * local683 + super.anInt8875 * local630 + local460 * super.anInt8885 >> 15);
					local651 = super.anInt8886 + (local630 * super.anInt8888 + super.anInt8884 * local683 + super.anInt8876 * local460 >> 15);
					local493 = super.anInt8879 + (local460 * super.anInt8882 + local630 * super.anInt8877 + super.anInt8887 * local683 >> 15);
					local545 = (super.anInt8878 * local524 + local694 * super.anInt8875 + local460 * super.anInt8885 >> 15) + super.anInt8883;
					local619 = (local460 * super.anInt8876 + local524 * super.anInt8884 + super.anInt8888 * local694 >> 15) + super.anInt8886;
					local672 = (super.anInt8882 * local460 + super.anInt8877 * local694 + super.anInt8887 * local524 >> 15) + super.anInt8879;
					local124 = (local513 * super.anInt8885 + local630 * super.anInt8875 + local587 * super.anInt8878 >> 15) + super.anInt8883;
					local156 = (local513 * super.anInt8876 + super.anInt8884 * local587 + local630 * super.anInt8888 >> 15) + super.anInt8886;
					local184 = (local630 * super.anInt8877 + local587 * super.anInt8887 + local513 * super.anInt8882 >> 15) + super.anInt8879;
					for (local210 = 0; local210 < local1592.aShort113; local210++) {
						local47 = local210 * 3;
						local49 = local47 + 1;
						local51 = local49 + 1;
						local53 = arg6[local47];
						local234 = arg6[local49];
						local70 = arg6[local51];
						local79 = arg3[local47];
						local90 = arg3[local49];
						local99 = arg3[local51];
						local253 = arg2[local51] + arg2[local49] + arg2[local47];
						if ((local99 - local90) * (-local234 + local53) - (local79 - local90) * (local70 + -local234) > 0) {
							arg5.aBoolean169 = local53 < 0 || local234 < 0 || local70 < 0 || local53 > arg5.anInt2571 || arg5.anInt2571 < local234 || local70 > arg5.anInt2571;
							@Pc(2556) short local2556 = local1592.aShortArray134[local210];
							if (local253 >= 765) {
								arg5.method2310(local79, local90, local99, local53, local234, local70, super.aClass62_Sub2_16.anInt8684);
							} else {
								if (local2556 != -1 && this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local2556).aByte78)) {
									arg5.anInt2573 = 100;
								}
								if (local253 > 0) {
									if (local2556 != -1) {
										arg5.method2309(local79, local90, local99, local53, local234, local70, super.aClass62_Sub2_16.anInt8684, arg2[local47], arg2[local49], arg2[local51], local1592.anIntArray667[local47], local1592.anIntArray667[local49], local1592.anIntArray667[local51], local576, local545, local124, local651, local619, local156, local493, local672, local184, local2556);
									} else if ((local1592.anIntArray667[local47] & 0xFFFFFF) != 0) {
										arg5.method2306(local79, local90, local99, local53, local234, local70, Static75.method1354(arg2[local47] << 24 | super.aClass62_Sub2_16.anInt8684, local1592.anIntArray667[local47]), Static75.method1354(arg2[local49] << 24 | super.aClass62_Sub2_16.anInt8684, local1592.anIntArray667[local49]), Static75.method1354(arg2[local51] << 24 | super.aClass62_Sub2_16.anInt8684, local1592.anIntArray667[local51]));
									}
								} else if (local2556 != -1) {
									arg5.method2302(local79, local90, local99, local53, local234, local70, local1592.anIntArray667[local47], local1592.anIntArray667[local49], local1592.anIntArray667[local51], local576, local545, local124, local651, local619, local156, local493, local672, local184, local2556);
								} else if ((local1592.anIntArray667[local47] & 0xFFFFFF) != 0) {
									arg5.method2306(local79, local90, local99, local53, local234, local70, local1592.anIntArray667[local47], local1592.anIntArray667[local49], local1592.anIntArray667[local51]);
								}
								arg5.anInt2573 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte57 & 0x2) == 0) {
			@Pc(28) int local28 = super.anInt8874 * arg1;
			local34 = local28 + super.anInt8874;
			local39 = super.anInt8874 * arg0;
			local45 = local39 + super.anInt8874;
			local47 = 0;
			local49 = 0;
			local51 = 0;
			local53 = 0;
			if ((local12.aByte57 & 0x1) == 0 || arg4) {
				local70 = super.anIntArrayArray78[arg1][arg0];
				local79 = super.anIntArrayArray78[arg1 + 1][arg0];
				local90 = super.anIntArrayArray78[arg1 + 1][arg0 + 1];
				local99 = super.anIntArrayArray78[arg1][arg0 + 1];
				if (super.anInt8881 == -1) {
					local124 = super.anInt8879 + (local39 * super.anInt8882 + local70 * super.anInt8887 + local28 * super.anInt8877 >> 15);
					if (local124 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local156 = super.anInt8879 + (local34 * super.anInt8877 + super.anInt8887 * local79 + super.anInt8882 * local39 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local156) {
						return;
					}
					local184 = super.anInt8879 + (local34 * super.anInt8877 + super.anInt8887 * local90 + local45 * super.anInt8882 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local184) {
						return;
					}
					local210 = super.anInt8879 + (super.anInt8887 * local99 + local28 * super.anInt8877 + super.anInt8882 * local45 >> 15);
					if (local210 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
				} else {
					local210 = super.anInt8881;
					local184 = super.anInt8881;
					local156 = super.anInt8881;
					local124 = super.anInt8881;
				}
				if (arg4) {
					local234 = local124 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local47 = local234;
						local253 = local12.aShort82 * local234 / 255;
						if (local253 > 0) {
							local70 -= local253;
						}
					}
					local234 = local156 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local49 = local234;
						local253 = local234 * local12.aShort81 / 255;
						if (local253 > 0) {
							local79 -= local253;
						}
					}
					local234 = local184 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local51 = local234;
						local253 = local12.aShort83 * local234 / 255;
						if (local253 > 0) {
							local90 -= local253;
						}
					}
					local234 = local210 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local53 = local234;
						local253 = local12.aShort80 * local234 / 255;
						if (local253 > 0) {
							local99 -= local253;
						}
					}
				} else if (super.aClass62_Sub2_16.aBoolean632) {
					local234 = local124 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local47 = local234;
						if (local234 > 255) {
							local47 = 255;
						}
					}
					local234 = local156 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local49 = local234;
						if (local234 > 255) {
							local49 = 255;
						}
					}
					local234 = local184 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local51 = local234;
						if (local234 > 255) {
							local51 = 255;
						}
					}
					local234 = local210 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local53 = local234;
						if (local234 > 255) {
							local53 = 255;
						}
					}
				}
				local460 = super.anInt8883 + (super.anInt8878 * local70 + local28 * super.anInt8875 + local39 * super.anInt8885 >> 15);
				local472 = arg5.anInt2569 + local460 * super.aClass62_Sub2_16.anInt8674 / local124;
				local493 = (local28 * super.anInt8888 + local70 * super.anInt8884 + local39 * super.anInt8876 >> 15) + super.anInt8886;
				local513 = (local39 * super.anInt8885 + local79 * super.anInt8878 + super.anInt8875 * local34 >> 15) + super.anInt8883;
				local524 = local493 * super.aClass62_Sub2_16.anInt8689 / local124 + arg5.anInt2574;
				local545 = super.anInt8886 + (super.anInt8876 * local39 + super.anInt8884 * local79 + local34 * super.anInt8888 >> 15);
				local556 = arg5.anInt2569 + super.aClass62_Sub2_16.anInt8674 * local513 / local156;
				local576 = (local90 * super.anInt8878 + local34 * super.anInt8875 + local45 * super.anInt8885 >> 15) + super.anInt8883;
				local587 = local545 * super.aClass62_Sub2_16.anInt8689 / local156 + arg5.anInt2574;
				local599 = arg5.anInt2569 + super.aClass62_Sub2_16.anInt8674 * local576 / local184;
				local619 = (super.anInt8876 * local45 + local90 * super.anInt8884 + local34 * super.anInt8888 >> 15) + super.anInt8886;
				local630 = arg5.anInt2574 + local619 * super.aClass62_Sub2_16.anInt8689 / local184;
				local651 = (super.anInt8885 * local45 + super.anInt8875 * local28 + local99 * super.anInt8878 >> 15) + super.anInt8883;
				local672 = super.anInt8886 + (local28 * super.anInt8888 + super.anInt8884 * local99 + super.anInt8876 * local45 >> 15);
				local683 = local651 * super.aClass62_Sub2_16.anInt8674 / local210 + arg5.anInt2569;
				local694 = local672 * super.aClass62_Sub2_16.anInt8689 / local210 + arg5.anInt2574;
			} else {
				local70 = super.anIntArrayArray78[arg1][arg0];
				if (super.anInt8881 == -1) {
					local79 = super.anInt8887 * local70;
					local124 = (local79 + local28 * super.anInt8877 + super.anInt8882 * local39 >> 15) + super.anInt8879;
					if (local124 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local156 = (local79 + super.anInt8877 * local34 + local39 * super.anInt8882 >> 15) + super.anInt8879;
					if (local156 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local184 = super.anInt8879 + (super.anInt8882 * local45 + local34 * super.anInt8877 + local79 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local184) {
						return;
					}
					local210 = super.anInt8879 + (super.anInt8882 * local45 + super.anInt8877 * local28 + local79 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local210) {
						return;
					}
				} else {
					local210 = super.anInt8881;
					local184 = super.anInt8881;
					local156 = super.anInt8881;
					local124 = super.anInt8881;
				}
				if (super.aClass62_Sub2_16.aBoolean632) {
					local234 = local124 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local47 = local234;
						if (local234 > 255) {
							local47 = 255;
						}
					}
					local234 = local156 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local49 = local234;
						if (local234 > 255) {
							local49 = 255;
						}
					}
					local234 = local184 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local51 = local234;
						if (local234 > 255) {
							local51 = 255;
						}
					}
					local234 = local210 - super.aClass62_Sub2_16.anInt8682;
					if (local234 > 0) {
						local53 = local234;
						if (local234 > 255) {
							local53 = 255;
						}
					}
				}
				local79 = super.anInt8878 * local70;
				local90 = local70 * super.anInt8884;
				local460 = super.anInt8883 + (super.anInt8885 * local39 + super.anInt8875 * local28 + local79 >> 15);
				local472 = arg5.anInt2569 + local460 * super.aClass62_Sub2_16.anInt8674 / local124;
				local493 = super.anInt8886 + (local39 * super.anInt8876 + local90 + super.anInt8888 * local28 >> 15);
				local524 = local493 * super.aClass62_Sub2_16.anInt8689 / local124 + arg5.anInt2574;
				local513 = super.anInt8883 + (local34 * super.anInt8875 + local79 + super.anInt8885 * local39 >> 15);
				local545 = (local39 * super.anInt8876 + local90 + super.anInt8888 * local34 >> 15) + super.anInt8886;
				local556 = local513 * super.aClass62_Sub2_16.anInt8674 / local156 + arg5.anInt2569;
				local576 = super.anInt8883 + (super.anInt8885 * local45 + super.anInt8875 * local34 + local79 >> 15);
				local587 = super.aClass62_Sub2_16.anInt8689 * local545 / local156 + arg5.anInt2574;
				local599 = arg5.anInt2569 + local576 * super.aClass62_Sub2_16.anInt8674 / local184;
				local619 = (super.anInt8888 * local34 + local90 + local45 * super.anInt8876 >> 15) + super.anInt8886;
				local630 = super.aClass62_Sub2_16.anInt8689 * local619 / local184 + arg5.anInt2574;
				local651 = (local79 + local28 * super.anInt8875 + local45 * super.anInt8885 >> 15) + super.anInt8883;
				local672 = super.anInt8886 + (local45 * super.anInt8876 + super.anInt8888 * local28 + local90 >> 15);
				local683 = arg5.anInt2569 + super.aClass62_Sub2_16.anInt8674 * local651 / local210;
				local694 = arg5.anInt2574 + super.aClass62_Sub2_16.anInt8689 * local672 / local210;
			}
			@Pc(1166) boolean local1166 = local12.aShort79 != -1 && this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local12.aShort79).aByte78);
			local79 = local51 + local49 + local53;
			if ((local599 - local683) * (local587 - local694) - (local556 - local683) * (local630 + -local694) > 0) {
				arg5.aBoolean169 = local599 < 0 || local683 < 0 || local556 < 0 || arg5.anInt2571 < local599 || local683 > arg5.anInt2571 || arg5.anInt2571 < local556;
				if (local79 >= 765) {
					arg5.method2310(local630, local694, local587, local599, local683, local556, super.aClass62_Sub2_16.anInt8684);
				} else {
					if (local1166) {
						arg5.anInt2573 = 100;
					}
					if (local79 > 0) {
						if (local12.aShort79 < 0) {
							arg5.method2306(local630, local694, local587, local599, local683, local556, Static75.method1354(local51 << 24 | super.aClass62_Sub2_16.anInt8684, local12.anInt6072), Static75.method1354(super.aClass62_Sub2_16.anInt8684 | local53 << 24, local12.anInt6068), Static75.method1354(super.aClass62_Sub2_16.anInt8684 | local49 << 24, local12.anInt6070));
						} else {
							arg5.method2309(local630, local694, local587, local599, local683, local556, super.aClass62_Sub2_16.anInt8684, local51, local53, local49, local12.anInt6072, local12.anInt6068, local12.anInt6070, local576, local651, local513, local619, local672, local545, local184, local210, local156, local12.aShort79);
						}
					} else if (local12.aShort79 >= 0) {
						arg5.method2302(local630, local694, local587, local599, local683, local556, local12.anInt6072, local12.anInt6068, local12.anInt6070, local576, local651, local513, local619, local672, local545, local184, local210, local156, local12.aShort79);
					} else {
						arg5.method2306(local630, local694, local587, local599, local683, local556, local12.anInt6072, local12.anInt6068, local12.anInt6070);
					}
					arg5.anInt2573 = 0;
				}
			}
			local79 = local53 + local47 + local49;
			if ((local472 - local556) * (local694 - local587) - (local683 - local556) * (-local587 + local524) > 0) {
				arg5.aBoolean169 = local472 < 0 || local556 < 0 || local683 < 0 || arg5.anInt2571 < local472 || arg5.anInt2571 < local556 || local683 > arg5.anInt2571;
				if (local79 >= 765) {
					arg5.method2310(local524, local587, local694, local472, local556, local683, super.aClass62_Sub2_16.anInt8684);
					return;
				}
				if (local1166) {
					arg5.anInt2573 = 100;
				}
				if (local79 <= 0) {
					if (local12.aShort79 >= 0) {
						arg5.method2302(local524, local587, local694, local472, local556, local683, local12.anInt6069, local12.anInt6070, local12.anInt6068, local460, local513, local651, local493, local545, local672, local124, local156, local210, local12.aShort79);
					} else {
						arg5.method2306(local524, local587, local694, local472, local556, local683, local12.anInt6069, local12.anInt6070, local12.anInt6068);
					}
				} else if (local12.aShort79 < 0) {
					arg5.method2306(local524, local587, local694, local472, local556, local683, Static75.method1354(local47 << 24 | super.aClass62_Sub2_16.anInt8684, local12.anInt6069), Static75.method1354(local49 << 24 | super.aClass62_Sub2_16.anInt8684, local12.anInt6070), Static75.method1354(local53 << 24 | super.aClass62_Sub2_16.anInt8684, local12.anInt6068));
				} else {
					arg5.method2309(local524, local587, local694, local472, local556, local683, super.aClass62_Sub2_16.anInt8684, local47, local49, local53, local12.anInt6069, local12.anInt6070, local12.anInt6068, local460, local513, local651, local493, local545, local672, local124, local156, local210, local12.aShort79);
				}
				arg5.anInt2573 = 0;
			}
		}
	}
}
