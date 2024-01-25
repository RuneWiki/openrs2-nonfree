import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class59_Sub1_Sub2 extends Class59_Sub1 {

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!lea;IIII[[I[[II)V")
	public Class59_Sub1_Sub2(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "([III[ILclient!kc;[IZ)V")
	private void method7560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class170 arg4, @OriginalArg(5) int[] arg5) {
		@Pc(16) Class150 local16 = super.aClass150ArrayArray3[arg2][arg1];
		@Pc(38) int local38;
		@Pc(48) int local48;
		@Pc(275) int local275;
		@Pc(318) int local318;
		@Pc(402) int local402;
		@Pc(465) int local465;
		@Pc(306) int local306;
		@Pc(370) int local370;
		@Pc(434) int local434;
		@Pc(476) int local476;
		@Pc(243) int local243;
		@Pc(295) int local295;
		@Pc(359) int local359;
		@Pc(422) int local422;
		@Pc(264) int local264;
		@Pc(338) int local338;
		@Pc(391) int local391;
		@Pc(454) int local454;
		@Pc(114) int local114;
		@Pc(145) int local145;
		@Pc(175) int local175;
		@Pc(207) int local207;
		@Pc(89) int local89;
		if (local16 == null) {
			@Pc(1111) Class82 local1111 = super.aClass82ArrayArray3[arg2][arg1];
			if (local1111 != null) {
				@Pc(1136) short local1136;
				if (super.anInt9237 == -1) {
					for (local465 = 0; local465 < local1111.aShort28; local465++) {
						local38 = local1111.aShortArray20[local465] + (arg2 << super.anInt9638);
						local1136 = local1111.aShortArray23[local465];
						local48 = local1111.aShortArray19[local465] + (arg1 << super.anInt9638);
						local402 = (local48 * super.anInt9235 + local1136 * super.anInt9232 + super.anInt9234 * local38 >> 14) + super.anInt9236;
						if (super.aClass14_Sub1_16.anInt5826 >= local402) {
							return;
						}
						local318 = (local38 * super.anInt9239 + super.anInt9230 * local1136 + super.anInt9238 * local48 >> 14) + super.anInt9233;
						local275 = (local48 * super.anInt9229 + super.anInt9227 * local38 + super.anInt9228 * local1136 >> 14) + super.anInt9231;
						arg5[local465] = super.aClass14_Sub1_16.anInt5818 * local275 / local402 + arg4.anInt4930;
						arg0[local465] = arg4.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local318 / local402;
					}
				} else {
					for (local465 = 0; local465 < local1111.aShort28; local465++) {
						local38 = local1111.aShortArray20[local465] + (arg2 << super.anInt9638);
						local1136 = local1111.aShortArray23[local465];
						local48 = local1111.aShortArray19[local465] + (arg1 << super.anInt9638);
						local318 = super.anInt9233 + (local48 * super.anInt9238 + super.anInt9230 * local1136 + super.anInt9239 * local38 >> 14);
						local275 = super.anInt9231 + (local1136 * super.anInt9228 + local38 * super.anInt9227 + super.anInt9229 * local48 >> 14);
						arg5[local465] = arg4.anInt4930 + local275 * super.aClass14_Sub1_16.anInt5818 / super.anInt9237;
						arg0[local465] = arg4.anInt4927 + local318 * super.aClass14_Sub1_16.anInt5835 / super.anInt9237;
					}
				}
				if (local1111.aShortArray17 == null) {
					for (local465 = 0; local465 < local1111.aShort27; local465++) {
						@Pc(1375) short local1375 = local1111.aShortArray21[local465];
						@Pc(1380) short local1380 = local1111.aShortArray18[local465];
						@Pc(1385) short local1385 = local1111.aShortArray15[local465];
						local476 = arg5[local1375];
						local243 = arg5[local1380];
						local295 = arg5[local1385];
						local359 = arg0[local1375];
						local422 = arg0[local1380];
						local264 = arg0[local1385];
						if ((local264 - local422) * (-local243 + local476) - (local359 - local422) * (local295 + -local243) > 0) {
							local338 = local1111.anIntArray165[local465];
							if (local338 != -1) {
								arg4.aBoolean344 = local476 < 0 || local243 < 0 || local295 < 0 || arg4.anInt4928 < local476 || arg4.anInt4928 < local243 || arg4.anInt4928 < local295;
								arg4.method4265(local359, local422, local264, local476, local243, local295, Static85.method1643(local338, local1111.aShortArray22[local1375]), Static85.method1643(local338, local1111.aShortArray22[local1380]), Static85.method1643(local338, local1111.aShortArray22[local1385]));
							}
						}
					}
				} else {
					local465 = super.anIntArrayArray86[arg2][arg1];
					local306 = super.anIntArrayArray86[arg2 + 1][arg1];
					local370 = super.anIntArrayArray86[arg2][arg1 + 1];
					local434 = arg2 * super.anInt9641;
					local476 = local434 + super.anInt9641;
					local243 = super.anInt9641 * arg1;
					local295 = super.anInt9641 + local243;
					local359 = (local243 * super.anInt9229 + local465 * super.anInt9228 + local434 * super.anInt9227 >> 14) + super.anInt9231;
					local422 = (super.anInt9238 * local243 + super.anInt9239 * local434 + super.anInt9230 * local465 >> 14) + super.anInt9233;
					local264 = (local434 * super.anInt9234 + local465 * super.anInt9232 + local243 * super.anInt9235 >> 14) + super.anInt9236;
					local338 = super.anInt9231 + (super.anInt9227 * local476 + local306 * super.anInt9228 + super.anInt9229 * local243 >> 14);
					local391 = (super.anInt9239 * local476 + local306 * super.anInt9230 + super.anInt9238 * local243 >> 14) + super.anInt9233;
					local454 = (local476 * super.anInt9234 + local306 * super.anInt9232 + super.anInt9235 * local243 >> 14) + super.anInt9236;
					local114 = super.anInt9231 + (super.anInt9229 * local295 + local434 * super.anInt9227 + local370 * super.anInt9228 >> 14);
					local145 = super.anInt9233 + (super.anInt9239 * local434 + super.anInt9230 * local370 + super.anInt9238 * local295 >> 14);
					local175 = (super.anInt9235 * local295 + local370 * super.anInt9232 + local434 * super.anInt9234 >> 14) + super.anInt9236;
					for (local207 = 0; local207 < local1111.aShort27; local207++) {
						@Pc(1757) short local1757 = local1111.aShortArray21[local207];
						@Pc(1762) short local1762 = local1111.aShortArray18[local207];
						@Pc(1767) short local1767 = local1111.aShortArray15[local207];
						local89 = arg5[local1757];
						@Pc(1775) int local1775 = arg5[local1762];
						@Pc(1779) int local1779 = arg5[local1767];
						@Pc(1783) int local1783 = arg0[local1757];
						@Pc(1787) int local1787 = arg0[local1762];
						@Pc(1791) int local1791 = arg0[local1767];
						if ((local89 - local1775) * (local1791 - local1787) - (local1779 - local1775) * (-local1787 + local1783) > 0) {
							arg4.aBoolean344 = local89 < 0 || local1775 < 0 || local1779 < 0 || local89 > arg4.anInt4928 || arg4.anInt4928 < local1775 || arg4.anInt4928 < local1779;
							@Pc(1856) short local1856 = local1111.aShortArray17[local207];
							if (local1856 == -1) {
								@Pc(1912) int local1912 = local1111.anIntArray165[local207];
								if (local1912 != -1) {
									arg4.method4265(local1783, local1787, local1791, local89, local1775, local1779, Static85.method1643(local1912, local1111.aShortArray22[local1757]), Static85.method1643(local1912, local1111.aShortArray22[local1762]), Static85.method1643(local1912, local1111.aShortArray22[local1767]));
								}
							} else {
								if (this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local1856).aByte98)) {
									arg4.anInt4929 = 100;
								}
								arg4.method4276(local1783, local1787, local1791, local89, local1775, local1779, local1111.aShortArray22[local1757], local1111.aShortArray22[local1762], local1111.aShortArray22[local1767], local359, local338, local114, local422, local391, local145, local264, local454, local175, local1856);
								arg4.anInt4929 = 0;
							}
						}
					}
				}
			}
		} else if ((local16.aByte37 & 0x2) == 0) {
			@Pc(32) int local32 = arg2 * super.anInt9641;
			local38 = local32 + super.anInt9641;
			@Pc(43) int local43 = arg1 * super.anInt9641;
			local48 = super.anInt9641 + local43;
			@Pc(60) int local60;
			@Pc(69) int local69;
			@Pc(80) int local80;
			if ((local16.aByte37 & 0x1) == 0) {
				local60 = super.anIntArrayArray86[arg2][arg1];
				local69 = super.anIntArrayArray86[arg2 + 1][arg1];
				local80 = super.anIntArrayArray86[arg2 + 1][arg1 + 1];
				local89 = super.anIntArrayArray86[arg2][arg1 + 1];
				if (super.anInt9237 == -1) {
					local114 = (super.anInt9235 * local43 + local32 * super.anInt9234 + super.anInt9232 * local60 >> 14) + super.anInt9236;
					if (local114 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local145 = super.anInt9236 + (local69 * super.anInt9232 + super.anInt9234 * local38 + super.anInt9235 * local43 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local145) {
						return;
					}
					local175 = (local80 * super.anInt9232 + local38 * super.anInt9234 + local48 * super.anInt9235 >> 14) + super.anInt9236;
					if (super.aClass14_Sub1_16.anInt5826 >= local175) {
						return;
					}
					local207 = (super.anInt9234 * local32 + local89 * super.anInt9232 + local48 * super.anInt9235 >> 14) + super.anInt9236;
					if (local207 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
				} else {
					local207 = super.anInt9237;
					local175 = super.anInt9237;
					local145 = super.anInt9237;
					local114 = super.anInt9237;
				}
				local243 = super.anInt9231 + (super.anInt9229 * local43 + local32 * super.anInt9227 + local60 * super.anInt9228 >> 14);
				local264 = super.anInt9233 + (super.anInt9230 * local60 + local32 * super.anInt9239 + super.anInt9238 * local43 >> 14);
				local275 = local243 * super.aClass14_Sub1_16.anInt5818 / local114 + arg4.anInt4930;
				local295 = super.anInt9231 + (super.anInt9229 * local43 + super.anInt9227 * local38 + super.anInt9228 * local69 >> 14);
				local306 = super.aClass14_Sub1_16.anInt5835 * local264 / local114 + arg4.anInt4927;
				local318 = arg4.anInt4930 + super.aClass14_Sub1_16.anInt5818 * local295 / local145;
				local338 = (super.anInt9238 * local43 + super.anInt9239 * local38 + super.anInt9230 * local69 >> 14) + super.anInt9233;
				local359 = super.anInt9231 + (local48 * super.anInt9229 + super.anInt9228 * local80 + local38 * super.anInt9227 >> 14);
				local370 = local338 * super.aClass14_Sub1_16.anInt5835 / local145 + arg4.anInt4927;
				local391 = (local48 * super.anInt9238 + local38 * super.anInt9239 + local80 * super.anInt9230 >> 14) + super.anInt9233;
				local402 = super.aClass14_Sub1_16.anInt5818 * local359 / local175 + arg4.anInt4930;
				local422 = super.anInt9231 + (super.anInt9228 * local89 + super.anInt9227 * local32 + local48 * super.anInt9229 >> 14);
				local434 = arg4.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local391 / local175;
				local454 = (super.anInt9238 * local48 + super.anInt9230 * local89 + super.anInt9239 * local32 >> 14) + super.anInt9233;
				local465 = arg4.anInt4930 + super.aClass14_Sub1_16.anInt5818 * local422 / local207;
				local476 = arg4.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local454 / local207;
			} else {
				local60 = super.anIntArrayArray86[arg2][arg1];
				if (super.anInt9237 == -1) {
					local69 = super.anInt9232 * local60;
					local114 = (super.anInt9235 * local43 + local32 * super.anInt9234 + local69 >> 14) + super.anInt9236;
					if (local114 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local145 = super.anInt9236 + (local69 + local38 * super.anInt9234 + local43 * super.anInt9235 >> 14);
					if (local145 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local175 = super.anInt9236 + (local38 * super.anInt9234 + local69 + local48 * super.anInt9235 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local175) {
						return;
					}
					local207 = (local48 * super.anInt9235 + local32 * super.anInt9234 + local69 >> 14) + super.anInt9236;
					if (super.aClass14_Sub1_16.anInt5826 >= local207) {
						return;
					}
				} else {
					local207 = super.anInt9237;
					local175 = super.anInt9237;
					local145 = super.anInt9237;
					local114 = super.anInt9237;
				}
				local69 = super.anInt9228 * local60;
				local80 = local60 * super.anInt9230;
				local243 = super.anInt9231 + (local69 + super.anInt9227 * local32 + local43 * super.anInt9229 >> 14);
				local264 = (local80 + local32 * super.anInt9239 + local43 * super.anInt9238 >> 14) + super.anInt9233;
				local275 = local243 * super.aClass14_Sub1_16.anInt5818 / local114 + arg4.anInt4930;
				local306 = arg4.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local264 / local114;
				local295 = (local69 + super.anInt9227 * local38 + local43 * super.anInt9229 >> 14) + super.anInt9231;
				local338 = (super.anInt9238 * local43 + super.anInt9239 * local38 + local80 >> 14) + super.anInt9233;
				local318 = arg4.anInt4930 + local295 * super.aClass14_Sub1_16.anInt5818 / local145;
				local370 = super.aClass14_Sub1_16.anInt5835 * local338 / local145 + arg4.anInt4927;
				local359 = super.anInt9231 + (local48 * super.anInt9229 + local38 * super.anInt9227 + local69 >> 14);
				local402 = arg4.anInt4930 + local359 * super.aClass14_Sub1_16.anInt5818 / local175;
				local391 = super.anInt9233 + (super.anInt9238 * local48 + local80 + super.anInt9239 * local38 >> 14);
				local434 = arg4.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local391 / local175;
				local422 = (local48 * super.anInt9229 + super.anInt9227 * local32 + local69 >> 14) + super.anInt9231;
				local454 = super.anInt9233 + (local48 * super.anInt9238 + local80 + super.anInt9239 * local32 >> 14);
				local465 = arg4.anInt4930 + local422 * super.aClass14_Sub1_16.anInt5818 / local207;
				local476 = arg4.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local454 / local207;
			}
			if ((local370 - local476) * (-local465 + local402) - (local318 - local465) * (-local476 + local434) > 0) {
				arg4.aBoolean344 = local402 < 0 || local465 < 0 || local318 < 0 || local402 > arg4.anInt4928 || arg4.anInt4928 < local465 || arg4.anInt4928 < local318;
				if (local16.aShort39 < 0) {
					arg4.method4265(local434, local476, local370, local402, local465, local318, local16.aShort42 & 0xFFFF, local16.aShort38 & 0xFFFF, local16.aShort41 & 0xFFFF);
				} else {
					if (this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local16.aShort39).aByte98)) {
						arg4.anInt4929 = 100;
					}
					arg4.method4276(local434, local476, local370, local402, local465, local318, local16.aShort42 & 0xFFFF, local16.aShort38 & 0xFFFF, local16.aShort41 & 0xFFFF, local243, local295, local422, local264, local338, local454, local114, local145, local207, local16.aShort39);
					arg4.anInt4929 = 0;
				}
			}
			if (-((local465 - local318) * (-local370 + local306)) + (local275 - local318) * (-local370 + local476) > 0) {
				arg4.aBoolean344 = local275 < 0 || local318 < 0 || local465 < 0 || local275 > arg4.anInt4928 || local318 > arg4.anInt4928 || arg4.anInt4928 < local465;
				if (local16.aShort39 >= 0) {
					if (this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local16.aShort39).aByte98)) {
						arg4.anInt4929 = 100;
					}
					arg4.method4276(local306, local370, local476, local275, local318, local465, local16.aShort40 & 0xFFFF, local16.aShort41 & 0xFFFF, local16.aShort38 & 0xFFFF, local243, local295, local422, local264, local338, local454, local114, local145, local207, local16.aShort39);
					arg4.anInt4929 = 0;
					return;
				}
				arg4.method4265(local306, local370, local476, local275, local318, local465, local16.aShort40 & 0xFFFF, local16.aShort41 & 0xFFFF, local16.aShort38 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7864(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class44_Sub2 local9 = (Class44_Sub2) super.aClass14_Sub1_16.method5048(Thread.currentThread());
		@Pc(12) Class170 local12 = local9.aClass170_1;
		local12.aBoolean344 = false;
		local12.anInt4929 = 0;
		if (super.aClass52ArrayArray3 != null) {
			this.method7562(arg0, arg4, arg1, arg2, local12, local9.anIntArray623, arg3, local9.anIntArray610);
		} else if (super.aClass150ArrayArray3 != null) {
			this.method7564(arg1, arg0, arg4, arg3, local9.anIntArray610, local12, local9.anIntArray623, arg2);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[[ZIILclient!kc;II[III[I)V")
	private void method7562(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class170 arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) int arg6, @OriginalArg(11) int[] arg7) {
		@Pc(14) int local14 = (arg6 - arg2) * 1024 / 256;
		arg4.aBoolean347 = false;
		arg4.aBoolean345 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg0; local32 < arg3; local32++) {
			for (@Pc(36) int local36 = arg2; local36 < arg6; local36++) {
				if (arg1[local32 - arg0][local36 - arg2]) {
					@Pc(89) int local89;
					if (super.aClass52ArrayArray3[local32][local36] != null) {
						@Pc(64) Class52 local64 = super.aClass52ArrayArray3[local32][local36];
						if (local64.aShort20 != -1 && (local64.aByte24 & 0x2) == 0 && local64.anInt1485 == 0) {
							local89 = super.aClass14_Sub1_16.method5050(local64.aShort20);
							arg4.method4265(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static85.method1643(local89, local64.anInt1482), Static85.method1643(local89, local64.anInt1483), Static85.method1643(local89, local64.anInt1486));
							arg4.method4265(local30, local30, local30 - 4, local26, local26 + 4, local26, Static85.method1643(local89, local64.anInt1484), Static85.method1643(local89, local64.anInt1486), Static85.method1643(local89, local64.anInt1483));
						} else if (local64.anInt1485 == 0) {
							arg4.method4270(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, local64.anInt1482, local64.anInt1483, local64.anInt1486);
							arg4.method4270(local30, local30, local30 - 4, local26, local26 + 4, local26, local64.anInt1484, local64.anInt1486, local64.anInt1483);
						} else {
							local89 = local64.anInt1485;
							arg4.method4270(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, Static412.method5964(local64.anInt1482 & 0xFF000000, local89), Static412.method5964(local64.anInt1483 & 0xFF000000, local89), Static412.method5964(local64.anInt1486 & 0xFF000000, local89));
							arg4.method4270(local30, local30, local30 - 4, local26, local26 + 4, local26, Static412.method5964(local64.anInt1484 & 0xFF000000, local89), Static412.method5964(local64.anInt1486 & 0xFF000000, local89), Static412.method5964(local64.anInt1483 & 0xFF000000, local89));
						}
					} else if (super.aClass347ArrayArray3[local32][local36] != null) {
						@Pc(298) Class347 local298 = super.aClass347ArrayArray3[local32][local36];
						for (local89 = 0; local89 < local298.aShort116; local89++) {
							arg7[local89] = local26 + local298.aShortArray148[local89] * 4 / super.anInt9641;
							arg5[local89] = local30 - local298.aShortArray149[local89] * 4 / super.anInt9641;
						}
						for (@Pc(341) int local341 = 0; local341 < local298.aShort115; local341++) {
							@Pc(347) int local347 = local341 * 3;
							@Pc(351) int local351 = local347 + 1;
							@Pc(355) int local355 = local351 + 1;
							@Pc(359) int local359 = arg7[local347];
							@Pc(363) int local363 = arg7[local351];
							@Pc(367) int local367 = arg7[local355];
							@Pc(371) int local371 = arg5[local347];
							@Pc(375) int local375 = arg5[local351];
							@Pc(379) int local379 = arg5[local355];
							@Pc(407) int local407;
							if (local298.anIntArray701 != null && local298.anIntArray701[local341] != 0 && (local298.aShortArray147 == null || local298.aShortArray147 != null && local298.aShortArray147[local341] == -1)) {
								local407 = local298.anIntArray701[local341];
								arg4.method4270(local371, local375, local379, local359, local363, local367, Static412.method5964(-(local298.anIntArray702[local347] & 0xFF000000) - 16777216, local407), Static412.method5964(-(local298.anIntArray702[local351] & 0xFF000000) - 16777216, local407), Static412.method5964(-(local298.anIntArray702[local355] & 0xFF000000) - 16777216, local407));
							} else if (local298.aShortArray147 == null || local298.aShortArray147[local341] == -1) {
								arg4.method4270(local371, local375, local379, local359, local363, local367, local298.anIntArray702[local347], local298.anIntArray702[local351], local298.anIntArray702[local355]);
							} else {
								local407 = super.aClass14_Sub1_16.method5050(local298.aShortArray147[local341]);
								arg4.method4265(local371, local375, local379, local359, local363, local367, local407, local407, local407);
							}
						}
					}
				}
				local30 -= 4;
			}
			local26 += 4;
			local30 = local14;
		}
		arg4.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[[ZII[IIIILclient!kc;[II)V")
	private void method7564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(9) Class170 arg5, @OriginalArg(10) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(30) int local30 = (arg3 - arg0) * 1024 / 256;
		arg5.aBoolean345 = false;
		arg5.aBoolean347 = false;
		@Pc(42) int local42 = 0;
		@Pc(46) int local46 = local30;
		for (@Pc(48) int local48 = arg1; local48 < arg7; local48++) {
			for (@Pc(52) int local52 = arg0; local52 < arg3; local52++) {
				if (arg2[local48 - arg1][local52 - arg0]) {
					@Pc(88) int local88;
					if (super.aClass150ArrayArray3[local48][local52] != null) {
						@Pc(318) Class150 local318 = super.aClass150ArrayArray3[local48][local52];
						if (local318.aShort39 != -1 && (local318.aByte37 & 0x2) == 0 && local318.anInt4322 == -1) {
							local88 = super.aClass14_Sub1_16.method5050(local318.aShort39);
							arg5.method4265(local46 - 4, local46 + -4, local46, local42 + 4, local42, local42 + 4, Static85.method1643(local88, local318.aShort42 & 0xFFFF), Static85.method1643(local88, local318.aShort38 & 0xFFFF), Static85.method1643(local88, local318.aShort41 & 0xFFFF));
							arg5.method4265(local46, local46, local46 - 4, local42, local42 + 4, local42, Static85.method1643(local88, local318.aShort40 & 0xFFFF), Static85.method1643(local88, local318.aShort41 & 0xFFFF), Static85.method1643(local88, local318.aShort38 & 0xFFFF));
						} else if (local318.anInt4322 == -1) {
							arg5.method4265(local46 - 4, local46 - 4, local46, local42 + 4, local42, local42 + 4, local318.aShort42 & 0xFFFF, local318.aShort38 & 0xFFFF, local318.aShort41 & 0xFFFF);
							arg5.method4265(local46, local46, local46 - 4, local42, local42 + 4, local42, local318.aShort40 & 0xFFFF, local318.aShort41 & 0xFFFF, local318.aShort38 & 0xFFFF);
						} else {
							local88 = local318.anInt4322;
							arg5.method4265(local46 - 4, local46 - 4, local46, local42 + 4, local42, local42 + 4, local88, local88, local88);
							arg5.method4265(local46, local46, local46 - 4, local42, local42 + 4, local42, local88, local88, local88);
						}
					} else if (super.aClass82ArrayArray3[local48][local52] != null) {
						@Pc(86) Class82 local86 = super.aClass82ArrayArray3[local48][local52];
						for (local88 = 0; local88 < local86.aShort28; local88++) {
							arg4[local88] = local42 + local86.aShortArray20[local88] * 4 / super.anInt9641;
							arg6[local88] = local46 - local86.aShortArray19[local88] * 4 / super.anInt9641;
						}
						for (@Pc(127) int local127 = 0; local127 < local86.aShort27; local127++) {
							@Pc(134) short local134 = local86.aShortArray21[local127];
							@Pc(139) short local139 = local86.aShortArray18[local127];
							@Pc(144) short local144 = local86.aShortArray15[local127];
							@Pc(148) int local148 = arg4[local134];
							@Pc(152) int local152 = arg4[local139];
							@Pc(156) int local156 = arg4[local144];
							@Pc(160) int local160 = arg6[local134];
							@Pc(164) int local164 = arg6[local139];
							@Pc(168) int local168 = arg6[local144];
							@Pc(183) int local183;
							if (local86.anIntArray166 != null && local86.anIntArray166[local127] != -1) {
								local183 = local86.anIntArray166[local127];
								arg5.method4265(local160, local164, local168, local148, local152, local156, Static85.method1643(local183, local86.aShortArray22[local134]), Static85.method1643(local183, local86.aShortArray22[local139]), Static85.method1643(local183, local86.aShortArray22[local144]));
							} else if (local86.aShortArray17 == null || local86.aShortArray17[local127] == -1) {
								local183 = local86.anIntArray165[local127];
								arg5.method4265(local160, local164, local168, local148, local152, local156, Static85.method1643(local183, local86.aShortArray22[local134]), Static85.method1643(local183, local86.aShortArray22[local139]), Static85.method1643(local183, local86.aShortArray22[local144]));
							} else {
								local183 = super.aClass14_Sub1_16.method5050(local86.aShortArray17[local127]);
								arg5.method4265(local160, local164, local168, local148, local152, local156, Static85.method1643(local183, local86.aShortArray22[local134]), Static85.method1643(local183, local86.aShortArray22[local139]), Static85.method1643(local183, local86.aShortArray22[local144]));
							}
						}
					}
				}
				local46 -= 4;
			}
			local42 += 4;
			local46 = local30;
		}
		arg5.aBoolean345 = true;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class44_Sub2 local9 = (Class44_Sub2) super.aClass14_Sub1_16.method5048(Thread.currentThread());
		local9.aClass170_1.anInt4929 = 0;
		if (super.aClass52ArrayArray3 != null) {
			this.method7566(local9.aClass170_1, super.aClass14_Sub1_16.aBoolean409, arg1, local9.anIntArray612, local9.anIntArray610, local9.anIntArray623, arg0);
		} else if (super.aClass150ArrayArray3 != null) {
			this.method7560(local9.anIntArray623, arg1, arg0, local9.anIntArray612, local9.aClass170_1, local9.anIntArray610);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!kc;ZI[I[IB[II)V")
	private void method7566(@OriginalArg(0) Class170 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class52 local12 = super.aClass52ArrayArray3[arg6][arg2];
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(315) int local315;
		@Pc(354) int local354;
		@Pc(428) int local428;
		@Pc(468) int local468;
		@Pc(326) int local326;
		@Pc(383) int local383;
		@Pc(439) int local439;
		@Pc(496) int local496;
		@Pc(287) int local287;
		@Pc(343) int local343;
		@Pc(400) int local400;
		@Pc(457) int local457;
		@Pc(304) int local304;
		@Pc(371) int local371;
		@Pc(417) int local417;
		@Pc(485) int local485;
		@Pc(77) int local77;
		@Pc(76) int local76;
		@Pc(74) int local74;
		@Pc(72) int local72;
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(198) int local198;
		@Pc(63) int local63;
		@Pc(84) int local84;
		@Pc(270) int local270;
		@Pc(534) int local534;
		@Pc(690) int local690;
		if (local12 == null) {
			@Pc(1598) Class347 local1598 = super.aClass347ArrayArray3[arg6][arg2];
			if (local1598 != null) {
				if (super.anInt9237 == -1) {
					for (local468 = 0; local468 < local1598.aShort116; local468++) {
						local31 = local1598.aShortArray148[local468] + (arg6 << super.anInt9638);
						local36 = local1598.aShortArray144[local468];
						local41 = local1598.aShortArray149[local468] + (arg2 << super.anInt9638);
						local428 = super.anInt9236 + (super.anInt9232 * local36 + local31 * super.anInt9234 + super.anInt9235 * local41 >> 14);
						if (local428 <= super.aClass14_Sub1_16.anInt5826) {
							return;
						}
						arg3[local468] = 0;
						if (arg1) {
							local326 = local428 - super.aClass14_Sub1_16.anInt5845;
							if (local326 > 255) {
								local326 = 255;
							}
							if (local326 > 0) {
								arg3[local468] = local326;
								local383 = local326 * local1598.aShortArray146[local468] / 255;
								if (local383 > 0) {
									local36 -= local383;
								}
							}
						} else if (super.aClass14_Sub1_16.aBoolean411) {
							local326 = local428 - super.aClass14_Sub1_16.anInt5845;
							if (local326 > 0) {
								arg3[local468] = local326;
								if (arg3[local468] > 255) {
									arg3[local468] = 255;
								}
							}
						}
						local354 = (super.anInt9238 * local41 + local31 * super.anInt9239 + super.anInt9230 * local36 >> 14) + super.anInt9233;
						local315 = super.anInt9231 + (local41 * super.anInt9229 + super.anInt9227 * local31 + super.anInt9228 * local36 >> 14);
						arg4[local468] = arg0.anInt4930 + super.aClass14_Sub1_16.anInt5818 * local315 / local428;
						arg5[local468] = arg0.anInt4927 + super.aClass14_Sub1_16.anInt5835 * local354 / local428;
					}
				} else {
					for (local468 = 0; local468 < local1598.aShort116; local468++) {
						local31 = local1598.aShortArray148[local468] + (arg6 << super.anInt9638);
						local36 = local1598.aShortArray144[local468];
						local41 = local1598.aShortArray149[local468] + (arg2 << super.anInt9638);
						arg3[local468] = 0;
						if (arg1) {
							local326 = -super.aClass14_Sub1_16.anInt5845 + super.anInt9237;
							if (local326 > 255) {
								local326 = 255;
							}
							if (local326 > 0) {
								arg3[local468] = local326;
								local383 = local326 * local1598.aShortArray146[local468] / 255;
								if (local383 > 0) {
									local36 -= local383;
								}
							}
						} else if (super.aClass14_Sub1_16.aBoolean411) {
							local326 = -super.aClass14_Sub1_16.anInt5845 + super.anInt9237;
							if (local326 > 0) {
								arg3[local468] = local326;
								if (arg3[local468] > 255) {
									arg3[local468] = 255;
								}
							}
						}
						local354 = super.anInt9233 + (super.anInt9230 * local36 + super.anInt9239 * local31 + super.anInt9238 * local41 >> 14);
						local315 = (super.anInt9229 * local41 + super.anInt9227 * local31 + super.anInt9228 * local36 >> 14) + super.anInt9231;
						arg4[local468] = arg0.anInt4930 + local315 * super.aClass14_Sub1_16.anInt5818 / super.anInt9237;
						arg5[local468] = local354 * super.aClass14_Sub1_16.anInt5835 / super.anInt9237 + arg0.anInt4927;
					}
				}
				if (local1598.aShortArray147 == null) {
					for (local468 = 0; local468 < local1598.aShort115; local468++) {
						local326 = local468 * 3;
						local383 = local326 + 1;
						local439 = local383 + 1;
						local496 = arg4[local326];
						local287 = arg4[local383];
						local343 = arg4[local439];
						local400 = arg5[local326];
						local457 = arg5[local383];
						local304 = arg5[local439];
						local371 = arg3[local439] + arg3[local326] + arg3[local383];
						if (-((local343 - local287) * (-local457 + local400)) + (local304 - local457) * (local496 - local287) > 0) {
							arg0.aBoolean344 = local496 < 0 || local287 < 0 || local343 < 0 || arg0.anInt4928 < local496 || local287 > arg0.anInt4928 || local343 > arg0.anInt4928;
							if (local371 >= 765) {
								arg0.method4274(local400, local457, local304, local496, local287, local343, super.aClass14_Sub1_16.anInt5842);
							} else if (local371 > 0) {
								if ((local1598.anIntArray702[local326] & 0xFFFFFF) != 0) {
									arg0.method4270(local400, local457, local304, local496, local287, local343, Static305.method1156(local1598.anIntArray702[local326], arg3[local326], super.aClass14_Sub1_16.anInt5842), Static305.method1156(local1598.anIntArray702[local383], arg3[local383], super.aClass14_Sub1_16.anInt5842), Static305.method1156(local1598.anIntArray702[local439], arg3[local439], super.aClass14_Sub1_16.anInt5842));
								}
							} else if ((local1598.anIntArray702[local326] & 0xFFFFFF) != 0) {
								arg0.method4270(local400, local457, local304, local496, local287, local343, local1598.anIntArray702[local326], local1598.anIntArray702[local383], local1598.anIntArray702[local439]);
							}
						}
					}
				} else {
					local468 = super.anIntArrayArray86[arg6][arg2];
					local326 = super.anIntArrayArray86[arg6 + 1][arg2];
					local383 = super.anIntArrayArray86[arg6][arg2 + 1];
					local439 = super.anInt9641 * arg6;
					local496 = super.anInt9641 + local439;
					local287 = super.anInt9641 * arg2;
					local343 = local287 + super.anInt9641;
					local400 = (super.anInt9229 * local287 + super.anInt9227 * local439 + local468 * super.anInt9228 >> 14) + super.anInt9231;
					local457 = (super.anInt9230 * local468 + local439 * super.anInt9239 + super.anInt9238 * local287 >> 14) + super.anInt9233;
					local304 = (local287 * super.anInt9235 + super.anInt9234 * local439 + super.anInt9232 * local468 >> 14) + super.anInt9236;
					local371 = (local326 * super.anInt9228 + super.anInt9227 * local496 + super.anInt9229 * local287 >> 14) + super.anInt9231;
					local417 = super.anInt9233 + (super.anInt9238 * local287 + super.anInt9239 * local496 + super.anInt9230 * local326 >> 14);
					local485 = (local287 * super.anInt9235 + local496 * super.anInt9234 + super.anInt9232 * local326 >> 14) + super.anInt9236;
					local77 = super.anInt9231 + (super.anInt9229 * local343 + local439 * super.anInt9227 + local383 * super.anInt9228 >> 14);
					local76 = super.anInt9233 + (super.anInt9230 * local383 + super.anInt9239 * local439 + super.anInt9238 * local343 >> 14);
					local74 = super.anInt9236 + (super.anInt9235 * local343 + local439 * super.anInt9234 + super.anInt9232 * local383 >> 14);
					for (local72 = 0; local72 < local1598.aShort115; local72++) {
						local43 = local72 * 3;
						local45 = local43 + 1;
						local47 = local45 + 1;
						local49 = arg4[local43];
						local198 = arg4[local45];
						local63 = arg4[local47];
						local84 = arg5[local43];
						local270 = arg5[local45];
						local534 = arg5[local47];
						local690 = arg3[local43] + arg3[local45] + arg3[local47];
						if (-((local84 - local270) * (-local198 + local63)) + (local49 - local198) * (-local270 + local534) > 0) {
							arg0.aBoolean344 = local49 < 0 || local198 < 0 || local63 < 0 || local49 > arg0.anInt4928 || arg0.anInt4928 < local198 || local63 > arg0.anInt4928;
							@Pc(2541) short local2541 = local1598.aShortArray147[local72];
							if (local690 >= 765) {
								arg0.method4274(local84, local270, local534, local49, local198, local63, super.aClass14_Sub1_16.anInt5842);
							} else {
								if (local2541 != -1 && this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local2541).aByte98)) {
									arg0.anInt4929 = 100;
								}
								if (local690 > 0) {
									if (local2541 != -1) {
										arg0.method4268(local84, local270, local534, local49, local198, local63, super.aClass14_Sub1_16.anInt5842, arg3[local43], arg3[local45], arg3[local47], local1598.anIntArray702[local43], local1598.anIntArray702[local45], local1598.anIntArray702[local47], local400, local371, local77, local457, local417, local76, local304, local485, local74, local2541);
									} else if ((local1598.anIntArray702[local43] & 0xFFFFFF) != 0) {
										arg0.method4270(local84, local270, local534, local49, local198, local63, Static412.method5964(super.aClass14_Sub1_16.anInt5842 | arg3[local43] << 24, local1598.anIntArray702[local43]), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | arg3[local45] << 24, local1598.anIntArray702[local45]), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | arg3[local47] << 24, local1598.anIntArray702[local47]));
									}
								} else if (local2541 != -1) {
									arg0.method4276(local84, local270, local534, local49, local198, local63, local1598.anIntArray702[local43], local1598.anIntArray702[local45], local1598.anIntArray702[local47], local400, local371, local77, local457, local417, local76, local304, local485, local74, local2541);
								} else if ((local1598.anIntArray702[local43] & 0xFFFFFF) != 0) {
									arg0.method4270(local84, local270, local534, local49, local198, local63, local1598.anIntArray702[local43], local1598.anIntArray702[local45], local1598.anIntArray702[local47]);
								}
								arg0.anInt4929 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte24 & 0x2) == 0) {
			@Pc(25) int local25 = arg6 * super.anInt9641;
			local31 = local25 + super.anInt9641;
			local36 = super.anInt9641 * arg2;
			local41 = local36 + super.anInt9641;
			local43 = 0;
			local45 = 0;
			local47 = 0;
			local49 = 0;
			if ((local12.aByte24 & 0x1) == 0 || arg1) {
				local63 = super.anIntArrayArray86[arg6][arg2];
				local84 = super.anIntArrayArray86[arg6 + 1][arg2];
				local270 = super.anIntArrayArray86[arg6 + 1][arg2 + 1];
				local534 = super.anIntArrayArray86[arg6][arg2 + 1];
				if (super.anInt9237 == -1) {
					local77 = super.anInt9236 + (local36 * super.anInt9235 + super.anInt9232 * local63 + super.anInt9234 * local25 >> 14);
					if (local77 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local76 = super.anInt9236 + (super.anInt9232 * local84 + super.anInt9234 * local31 + super.anInt9235 * local36 >> 14);
					if (local76 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local74 = super.anInt9236 + (super.anInt9235 * local41 + local31 * super.anInt9234 + super.anInt9232 * local270 >> 14);
					if (super.aClass14_Sub1_16.anInt5826 >= local74) {
						return;
					}
					local72 = super.anInt9236 + (local41 * super.anInt9235 + local534 * super.anInt9232 + local25 * super.anInt9234 >> 14);
					if (local72 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
				} else {
					local72 = super.anInt9237;
					local74 = super.anInt9237;
					local76 = super.anInt9237;
					local77 = super.anInt9237;
				}
				if (arg1) {
					local198 = local77 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 > 0) {
						local43 = local198;
						local690 = local198 * local12.aShort23 / 255;
						if (local690 > 0) {
							local63 -= local690;
						}
					}
					local198 = local76 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 > 0) {
						local45 = local198;
						local690 = local198 * local12.aShort19 / 255;
						if (local690 > 0) {
							local84 -= local690;
						}
					}
					local198 = local74 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 > 0) {
						local47 = local198;
						local690 = local198 * local12.aShort21 / 255;
						if (local690 > 0) {
							local270 -= local690;
						}
					}
					local198 = local72 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 > 0) {
						local49 = local198;
						local690 = local12.aShort22 * local198 / 255;
						if (local690 > 0) {
							local534 -= local690;
						}
					}
				} else if (super.aClass14_Sub1_16.aBoolean411) {
					local198 = local77 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local43 = local198;
						if (local198 > 255) {
							local43 = 255;
						}
					}
					local198 = local76 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local45 = local198;
						if (local198 > 255) {
							local45 = 255;
						}
					}
					local198 = local74 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local47 = local198;
						if (local198 > 255) {
							local47 = 255;
						}
					}
					local198 = local72 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local49 = local198;
						if (local198 > 255) {
							local49 = 255;
						}
					}
				}
				local287 = super.anInt9231 + (super.anInt9227 * local25 + super.anInt9228 * local63 + local36 * super.anInt9229 >> 14);
				local304 = (super.anInt9239 * local25 + super.anInt9230 * local63 + super.anInt9238 * local36 >> 14) + super.anInt9233;
				local315 = arg0.anInt4930 + local287 * super.aClass14_Sub1_16.anInt5818 / local77;
				local343 = (local36 * super.anInt9229 + local84 * super.anInt9228 + super.anInt9227 * local31 >> 14) + super.anInt9231;
				local326 = local304 * super.aClass14_Sub1_16.anInt5835 / local77 + arg0.anInt4927;
				local354 = super.aClass14_Sub1_16.anInt5818 * local343 / local76 + arg0.anInt4930;
				local371 = super.anInt9233 + (super.anInt9239 * local31 + local84 * super.anInt9230 + super.anInt9238 * local36 >> 14);
				local383 = local371 * super.aClass14_Sub1_16.anInt5835 / local76 + arg0.anInt4927;
				local400 = super.anInt9231 + (super.anInt9228 * local270 + super.anInt9227 * local31 + super.anInt9229 * local41 >> 14);
				local417 = super.anInt9233 + (local31 * super.anInt9239 + super.anInt9230 * local270 + local41 * super.anInt9238 >> 14);
				local428 = local400 * super.aClass14_Sub1_16.anInt5818 / local74 + arg0.anInt4930;
				local439 = arg0.anInt4927 + local417 * super.aClass14_Sub1_16.anInt5835 / local74;
				local457 = (local25 * super.anInt9227 + super.anInt9228 * local534 + super.anInt9229 * local41 >> 14) + super.anInt9231;
				local468 = arg0.anInt4930 + super.aClass14_Sub1_16.anInt5818 * local457 / local72;
				local485 = super.anInt9233 + (local25 * super.anInt9239 + local534 * super.anInt9230 + super.anInt9238 * local41 >> 14);
				local496 = super.aClass14_Sub1_16.anInt5835 * local485 / local72 + arg0.anInt4927;
			} else {
				local63 = super.anIntArrayArray86[arg6][arg2];
				if (super.anInt9237 == -1) {
					local84 = super.anInt9232 * local63;
					local77 = super.anInt9236 + (super.anInt9235 * local36 + local84 + local25 * super.anInt9234 >> 14);
					if (local77 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local76 = super.anInt9236 + (local84 + local31 * super.anInt9234 + local36 * super.anInt9235 >> 14);
					if (local76 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local74 = super.anInt9236 + (super.anInt9235 * local41 + local84 + local31 * super.anInt9234 >> 14);
					if (local74 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
					local72 = super.anInt9236 + (super.anInt9235 * local41 + local84 + local25 * super.anInt9234 >> 14);
					if (local72 <= super.aClass14_Sub1_16.anInt5826) {
						return;
					}
				} else {
					local72 = super.anInt9237;
					local74 = super.anInt9237;
					local76 = super.anInt9237;
					local77 = super.anInt9237;
				}
				if (super.aClass14_Sub1_16.aBoolean411) {
					local198 = local77 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local43 = local198;
						if (local198 > 255) {
							local43 = 255;
						}
					}
					local198 = local76 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local45 = local198;
						if (local198 > 255) {
							local45 = 255;
						}
					}
					local198 = local74 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local47 = local198;
						if (local198 > 255) {
							local47 = 255;
						}
					}
					local198 = local72 - super.aClass14_Sub1_16.anInt5845;
					if (local198 > 0) {
						local49 = local198;
						if (local198 > 255) {
							local49 = 255;
						}
					}
				}
				local84 = local63 * super.anInt9228;
				local270 = super.anInt9230 * local63;
				local287 = super.anInt9231 + (local36 * super.anInt9229 + local84 + super.anInt9227 * local25 >> 14);
				local304 = (super.anInt9238 * local36 + local270 + local25 * super.anInt9239 >> 14) + super.anInt9233;
				local315 = super.aClass14_Sub1_16.anInt5818 * local287 / local77 + arg0.anInt4930;
				local326 = super.aClass14_Sub1_16.anInt5835 * local304 / local77 + arg0.anInt4927;
				local343 = (super.anInt9229 * local36 + local84 + super.anInt9227 * local31 >> 14) + super.anInt9231;
				local354 = super.aClass14_Sub1_16.anInt5818 * local343 / local76 + arg0.anInt4930;
				local371 = (local36 * super.anInt9238 + local270 + local31 * super.anInt9239 >> 14) + super.anInt9233;
				local383 = arg0.anInt4927 + local371 * super.aClass14_Sub1_16.anInt5835 / local76;
				local400 = (local31 * super.anInt9227 + local84 + local41 * super.anInt9229 >> 14) + super.anInt9231;
				local417 = super.anInt9233 + (super.anInt9238 * local41 + local270 + super.anInt9239 * local31 >> 14);
				local428 = super.aClass14_Sub1_16.anInt5818 * local400 / local74 + arg0.anInt4930;
				local439 = local417 * super.aClass14_Sub1_16.anInt5835 / local74 + arg0.anInt4927;
				local457 = super.anInt9231 + (local25 * super.anInt9227 + local84 + super.anInt9229 * local41 >> 14);
				local468 = local457 * super.aClass14_Sub1_16.anInt5818 / local72 + arg0.anInt4930;
				local485 = (super.anInt9238 * local41 + local270 + super.anInt9239 * local25 >> 14) + super.anInt9233;
				local496 = super.aClass14_Sub1_16.anInt5835 * local485 / local72 + arg0.anInt4927;
			}
			@Pc(1151) boolean local1151 = local12.aShort20 != -1 && this.method7559(super.aClass14_Sub1_16.anInterface4_15.method4234(local12.aShort20).aByte98);
			local84 = local49 + local45 + local47;
			if ((local428 - local468) * (-local496 + local383) - (local439 - local496) * (local354 - local468) > 0) {
				arg0.aBoolean344 = local428 < 0 || local468 < 0 || local354 < 0 || local428 > arg0.anInt4928 || arg0.anInt4928 < local468 || arg0.anInt4928 < local354;
				if (local84 >= 765) {
					arg0.method4274(local439, local496, local383, local428, local468, local354, super.aClass14_Sub1_16.anInt5842);
				} else {
					if (local1151) {
						arg0.anInt4929 = 100;
					}
					if (local84 > 0) {
						if (local12.aShort20 < 0) {
							arg0.method4270(local439, local496, local383, local428, local468, local354, Static412.method5964(local47 << 24 | super.aClass14_Sub1_16.anInt5842, local12.anInt1482), Static412.method5964(local49 << 24 | super.aClass14_Sub1_16.anInt5842, local12.anInt1483), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local45 << 24, local12.anInt1486));
						} else {
							arg0.method4268(local439, local496, local383, local428, local468, local354, super.aClass14_Sub1_16.anInt5842, local47, local49, local45, local12.anInt1482, local12.anInt1483, local12.anInt1486, local400, local457, local343, local417, local485, local371, local74, local72, local76, local12.aShort20);
						}
					} else if (local12.aShort20 < 0) {
						arg0.method4270(local439, local496, local383, local428, local468, local354, local12.anInt1482, local12.anInt1483, local12.anInt1486);
					} else {
						arg0.method4276(local439, local496, local383, local428, local468, local354, local12.anInt1482, local12.anInt1483, local12.anInt1486, local400, local457, local343, local417, local485, local371, local74, local72, local76, local12.aShort20);
					}
					arg0.anInt4929 = 0;
				}
			}
			local84 = local49 + local45 + local43;
			if (-((local326 - local383) * (-local354 + local468)) + (local315 - local354) * (-local383 + local496) > 0) {
				arg0.aBoolean344 = local315 < 0 || local354 < 0 || local468 < 0 || local315 > arg0.anInt4928 || arg0.anInt4928 < local354 || local468 > arg0.anInt4928;
				if (local84 >= 765) {
					arg0.method4274(local326, local383, local496, local315, local354, local468, super.aClass14_Sub1_16.anInt5842);
					return;
				}
				if (local1151) {
					arg0.anInt4929 = 100;
				}
				if (local84 > 0) {
					if (local12.aShort20 >= 0) {
						arg0.method4268(local326, local383, local496, local315, local354, local468, super.aClass14_Sub1_16.anInt5842, local43, local45, local49, local12.anInt1484, local12.anInt1486, local12.anInt1483, local287, local343, local457, local304, local371, local485, local77, local76, local72, local12.aShort20);
					} else {
						arg0.method4270(local326, local383, local496, local315, local354, local468, Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local43 << 24, local12.anInt1484), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local45 << 24, local12.anInt1486), Static412.method5964(super.aClass14_Sub1_16.anInt5842 | local49 << 24, local12.anInt1483));
					}
				} else if (local12.aShort20 >= 0) {
					arg0.method4276(local326, local383, local496, local315, local354, local468, local12.anInt1484, local12.anInt1486, local12.anInt1483, local287, local343, local457, local304, local371, local485, local77, local76, local72, local12.aShort20);
				} else {
					arg0.method4270(local326, local383, local496, local315, local354, local468, local12.anInt1484, local12.anInt1486, local12.anInt1483);
				}
				arg0.anInt4929 = 0;
			}
		}
	}
}
