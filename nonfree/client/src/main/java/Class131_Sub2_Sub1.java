import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class131_Sub2_Sub1 extends Class131_Sub2 {

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!vda;IIII[[I[[II)V")
	public Class131_Sub2_Sub1(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7182(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class178_Sub1 local9 = (Class178_Sub1) super.aClass62_Sub2_16.method7071(Thread.currentThread());
		@Pc(12) Class317 local12 = local9.aClass317_2;
		local12.anInt9123 = 0;
		local12.aBoolean669 = false;
		if (super.aClass198ArrayArray3 != null) {
			this.method3269(arg2, arg1, local9.anIntArray545, local12, arg0, arg3, local9.anIntArray520, arg4);
		} else if (super.aClass286ArrayArray3 != null) {
			this.method3270(arg2, arg3, arg4, local9.anIntArray520, arg0, local12, local9.anIntArray545, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
	@Override
	public void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class178_Sub1 local9 = (Class178_Sub1) super.aClass62_Sub2_16.method7071(Thread.currentThread());
		local9.aClass317_2.anInt9123 = 0;
		if (super.aClass198ArrayArray3 != null) {
			this.method3271(local9.aClass317_2, arg1, local9.anIntArray520, local9.anIntArray545, local9.anIntArray528, arg0, super.aClass62_Sub2_16.aBoolean631, local9.anIntArray527);
		} else if (super.aClass286ArrayArray3 != null) {
			this.method3267(local9.aClass317_2, local9.anIntArray528, local9.anIntArray520, arg1, local9.anIntArray545, local9.anIntArray527, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!wq;[I[II[I[IIB)V")
	private void method3267(@OriginalArg(0) Class317 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(12) Class286 local12 = super.aClass286ArrayArray3[arg6][arg3];
		@Pc(38) int local38;
		@Pc(48) int local48;
		@Pc(276) int local276;
		@Pc(340) int local340;
		@Pc(383) int local383;
		@Pc(468) int local468;
		@Pc(479) int local479;
		@Pc(244) int local244;
		@Pc(297) int local297;
		@Pc(361) int local361;
		@Pc(437) int local437;
		@Pc(265) int local265;
		@Pc(329) int local329;
		@Pc(404) int local404;
		@Pc(457) int local457;
		@Pc(118) int local118;
		@Pc(145) int local145;
		@Pc(176) int local176;
		@Pc(207) int local207;
		@Pc(92) int local92;
		@Pc(308) int local308;
		@Pc(372) int local372;
		@Pc(416) int local416;
		if (local12 == null) {
			@Pc(1128) Class169 local1128 = super.aClass169ArrayArray3[arg6][arg3];
			if (local1128 != null) {
				@Pc(1154) short local1154;
				if (super.anInt8881 == -1) {
					for (local468 = 0; local468 < local1128.aShort61; local468++) {
						local38 = local1128.aShortArray54[local468] + (arg6 << super.anInt8869);
						local1154 = local1128.aShortArray55[local468];
						local48 = local1128.aShortArray59[local468] + (arg3 << super.anInt8869);
						local383 = (super.anInt8882 * local48 + local1154 * super.anInt8887 + local38 * super.anInt8877 >> 15) + super.anInt8879;
						if (super.aClass62_Sub2_16.anInt8677 >= local383) {
							return;
						}
						local276 = (super.anInt8885 * local48 + super.anInt8875 * local38 + super.anInt8878 * local1154 >> 15) + super.anInt8883;
						local340 = super.anInt8886 + (super.anInt8876 * local48 + super.anInt8884 * local1154 + super.anInt8888 * local38 >> 15);
						arg2[local468] = arg0.anInt9121 + super.aClass62_Sub2_16.anInt8674 * local276 / local383;
						arg4[local468] = local340 * super.aClass62_Sub2_16.anInt8689 / local383 + arg0.anInt9124;
						arg5[local468] = local383;
					}
				} else {
					for (local468 = 0; local468 < local1128.aShort61; local468++) {
						local38 = local1128.aShortArray54[local468] + (arg6 << super.anInt8869);
						local1154 = local1128.aShortArray55[local468];
						local48 = local1128.aShortArray59[local468] + (arg3 << super.anInt8869);
						local340 = super.anInt8886 + (super.anInt8876 * local48 + super.anInt8884 * local1154 + local38 * super.anInt8888 >> 15);
						local276 = (super.anInt8875 * local38 + local1154 * super.anInt8878 + super.anInt8885 * local48 >> 15) + super.anInt8883;
						arg2[local468] = local276 * super.aClass62_Sub2_16.anInt8674 / super.anInt8881 + arg0.anInt9121;
						arg4[local468] = local340 * super.aClass62_Sub2_16.anInt8689 / super.anInt8881 + arg0.anInt9124;
						arg5[local468] = super.anInt8881;
					}
				}
				if (local1128.aShortArray52 == null) {
					for (local468 = 0; local468 < local1128.aShort62; local468++) {
						@Pc(1845) short local1845 = local1128.aShortArray56[local468];
						@Pc(1850) short local1850 = local1128.aShortArray53[local468];
						@Pc(1855) short local1855 = local1128.aShortArray57[local468];
						local479 = arg2[local1845];
						local244 = arg2[local1850];
						local297 = arg2[local1855];
						local361 = arg4[local1845];
						local437 = arg4[local1850];
						local265 = arg4[local1855];
						if (-((local361 - local437) * (local297 + -local244)) + (local265 - local437) * (-local244 + local479) > 0) {
							local329 = local1128.anIntArray313[local468];
							if (local329 != -1) {
								arg0.aBoolean669 = local479 < 0 || local244 < 0 || local297 < 0 || local479 > arg0.anInt9122 || local244 > arg0.anInt9122 || arg0.anInt9122 < local297;
								arg0.method7413(local361, local437, local265, local479, local244, local297, arg5[1], arg5[2], arg5[3], Static413.method7354(local329, local1128.aShortArray58[local1845]), Static413.method7354(local329, local1128.aShortArray58[local1850]), Static413.method7354(local329, local1128.aShortArray58[local1855]));
							}
						}
					}
				} else {
					local468 = super.anIntArrayArray78[arg6][arg3];
					local308 = super.anIntArrayArray78[arg6 + 1][arg3];
					local372 = super.anIntArrayArray78[arg6][arg3 + 1];
					local416 = super.anInt8874 * arg6;
					local479 = super.anInt8874 + local416;
					local244 = super.anInt8874 * arg3;
					local297 = super.anInt8874 + local244;
					local361 = (local244 * super.anInt8885 + local416 * super.anInt8875 + local468 * super.anInt8878 >> 15) + super.anInt8883;
					local437 = super.anInt8886 + (super.anInt8876 * local244 + super.anInt8888 * local416 + super.anInt8884 * local468 >> 15);
					local265 = (super.anInt8882 * local244 + local468 * super.anInt8887 + super.anInt8877 * local416 >> 15) + super.anInt8879;
					local329 = (local308 * super.anInt8878 + local479 * super.anInt8875 + super.anInt8885 * local244 >> 15) + super.anInt8883;
					local404 = super.anInt8886 + (super.anInt8888 * local479 + local308 * super.anInt8884 + local244 * super.anInt8876 >> 15);
					local457 = (super.anInt8887 * local308 + local479 * super.anInt8877 + local244 * super.anInt8882 >> 15) + super.anInt8879;
					local118 = (super.anInt8875 * local416 + local372 * super.anInt8878 + super.anInt8885 * local297 >> 15) + super.anInt8883;
					local145 = (local297 * super.anInt8876 + super.anInt8888 * local416 + super.anInt8884 * local372 >> 15) + super.anInt8886;
					local176 = super.anInt8879 + (local297 * super.anInt8882 + local416 * super.anInt8877 + super.anInt8887 * local372 >> 15);
					for (local207 = 0; local207 < local1128.aShort62; local207++) {
						@Pc(1636) short local1636 = local1128.aShortArray56[local207];
						@Pc(1641) short local1641 = local1128.aShortArray53[local207];
						@Pc(1646) short local1646 = local1128.aShortArray57[local207];
						local92 = arg2[local1636];
						@Pc(1654) int local1654 = arg2[local1641];
						@Pc(1658) int local1658 = arg2[local1646];
						@Pc(1662) int local1662 = arg4[local1636];
						@Pc(1666) int local1666 = arg4[local1641];
						@Pc(1670) int local1670 = arg4[local1646];
						if ((local1670 - local1666) * (-local1654 + local92) - (local1658 - local1654) * (local1662 + -local1666) > 0) {
							arg0.aBoolean669 = local92 < 0 || local1654 < 0 || local1658 < 0 || arg0.anInt9122 < local92 || local1654 > arg0.anInt9122 || arg0.anInt9122 < local1658;
							@Pc(1728) short local1728 = local1128.aShortArray52[local207];
							if (local1728 == -1) {
								@Pc(1737) int local1737 = local1128.anIntArray313[local207];
								if (local1737 != -1) {
									arg0.method7413(local1662, local1666, local1670, local92, local1654, local1658, arg5[1], arg5[2], arg5[3], Static413.method7354(local1737, local1128.aShortArray58[local1636]), Static413.method7354(local1737, local1128.aShortArray58[local1641]), Static413.method7354(local1737, local1128.aShortArray58[local1646]));
								}
							} else {
								if (this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local1728).aByte78)) {
									arg0.anInt9123 = 100;
								}
								arg0.method7404(local1662, local1666, local1670, local92, local1654, local1658, local1128.aShortArray58[local1636], local1128.aShortArray58[local1641], local1128.aShortArray58[local1646], local361, local329, local118, local437, local404, local145, local265, local457, local176, local1728);
								arg0.anInt9123 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte89 & 0x2) == 0) {
			@Pc(33) int local33 = arg6 * super.anInt8874;
			local38 = local33 + super.anInt8874;
			@Pc(43) int local43 = arg3 * super.anInt8874;
			local48 = super.anInt8874 + local43;
			@Pc(63) int local63;
			@Pc(72) int local72;
			@Pc(83) int local83;
			if ((local12.aByte89 & 0x1) == 0) {
				local63 = super.anIntArrayArray78[arg6][arg3];
				local72 = super.anIntArrayArray78[arg6 + 1][arg3];
				local83 = super.anIntArrayArray78[arg6 + 1][arg3 + 1];
				local92 = super.anIntArrayArray78[arg6][arg3 + 1];
				if (super.anInt8881 == -1) {
					local118 = (local63 * super.anInt8887 + super.anInt8877 * local33 + super.anInt8882 * local43 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local118) {
						return;
					}
					local145 = (super.anInt8882 * local43 + local38 * super.anInt8877 + super.anInt8887 * local72 >> 15) + super.anInt8879;
					if (local145 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local176 = (super.anInt8887 * local83 + local38 * super.anInt8877 + super.anInt8882 * local48 >> 15) + super.anInt8879;
					if (local176 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local207 = super.anInt8879 + (local48 * super.anInt8882 + super.anInt8887 * local92 + local33 * super.anInt8877 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local207) {
						return;
					}
				} else {
					local207 = super.anInt8881;
					local176 = super.anInt8881;
					local145 = super.anInt8881;
					local118 = super.anInt8881;
				}
				local244 = super.anInt8883 + (super.anInt8875 * local33 + super.anInt8878 * local63 + local43 * super.anInt8885 >> 15);
				local265 = (local63 * super.anInt8884 + local33 * super.anInt8888 + super.anInt8876 * local43 >> 15) + super.anInt8886;
				local276 = super.aClass62_Sub2_16.anInt8674 * local244 / local118 + arg0.anInt9121;
				local297 = (local72 * super.anInt8878 + local38 * super.anInt8875 + super.anInt8885 * local43 >> 15) + super.anInt8883;
				local308 = arg0.anInt9124 + local265 * super.aClass62_Sub2_16.anInt8689 / local118;
				local329 = (local38 * super.anInt8888 + super.anInt8884 * local72 + local43 * super.anInt8876 >> 15) + super.anInt8886;
				local340 = arg0.anInt9121 + super.aClass62_Sub2_16.anInt8674 * local297 / local145;
				local361 = (local48 * super.anInt8885 + local38 * super.anInt8875 + local83 * super.anInt8878 >> 15) + super.anInt8883;
				local372 = local329 * super.aClass62_Sub2_16.anInt8689 / local145 + arg0.anInt9124;
				local383 = arg0.anInt9121 + super.aClass62_Sub2_16.anInt8674 * local361 / local176;
				local404 = super.anInt8886 + (local38 * super.anInt8888 + local83 * super.anInt8884 + super.anInt8876 * local48 >> 15);
				local416 = arg0.anInt9124 + super.aClass62_Sub2_16.anInt8689 * local404 / local176;
				local437 = super.anInt8883 + (local92 * super.anInt8878 + super.anInt8875 * local33 + super.anInt8885 * local48 >> 15);
				local457 = (super.anInt8876 * local48 + super.anInt8884 * local92 + local33 * super.anInt8888 >> 15) + super.anInt8886;
				local468 = arg0.anInt9121 + local437 * super.aClass62_Sub2_16.anInt8674 / local207;
				local479 = arg0.anInt9124 + super.aClass62_Sub2_16.anInt8689 * local457 / local207;
			} else {
				local63 = super.anIntArrayArray78[arg6][arg3];
				if (super.anInt8881 == -1) {
					local72 = local63 * super.anInt8887;
					local118 = super.anInt8879 + (local33 * super.anInt8877 + local72 + super.anInt8882 * local43 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local118) {
						return;
					}
					local145 = super.anInt8879 + (local72 + local38 * super.anInt8877 + super.anInt8882 * local43 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local145) {
						return;
					}
					local176 = (local48 * super.anInt8882 + local38 * super.anInt8877 + local72 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local176) {
						return;
					}
					local207 = (local48 * super.anInt8882 + super.anInt8877 * local33 + local72 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local207) {
						return;
					}
				} else {
					local207 = super.anInt8881;
					local176 = super.anInt8881;
					local145 = super.anInt8881;
					local118 = super.anInt8881;
				}
				local72 = super.anInt8878 * local63;
				local244 = (local33 * super.anInt8875 + local72 + local43 * super.anInt8885 >> 15) + super.anInt8883;
				local83 = local63 * super.anInt8884;
				local265 = super.anInt8886 + (local83 + local33 * super.anInt8888 + super.anInt8876 * local43 >> 15);
				local276 = arg0.anInt9121 + local244 * super.aClass62_Sub2_16.anInt8674 / local118;
				local308 = local265 * super.aClass62_Sub2_16.anInt8689 / local118 + arg0.anInt9124;
				local297 = super.anInt8883 + (local43 * super.anInt8885 + super.anInt8875 * local38 + local72 >> 15);
				local329 = super.anInt8886 + (super.anInt8876 * local43 + super.anInt8888 * local38 + local83 >> 15);
				local340 = arg0.anInt9121 + super.aClass62_Sub2_16.anInt8674 * local297 / local145;
				local372 = super.aClass62_Sub2_16.anInt8689 * local329 / local145 + arg0.anInt9124;
				local361 = (super.anInt8875 * local38 + local72 + local48 * super.anInt8885 >> 15) + super.anInt8883;
				local383 = arg0.anInt9121 + local361 * super.aClass62_Sub2_16.anInt8674 / local176;
				local404 = (local48 * super.anInt8876 + local38 * super.anInt8888 + local83 >> 15) + super.anInt8886;
				local437 = super.anInt8883 + (local48 * super.anInt8885 + super.anInt8875 * local33 + local72 >> 15);
				local416 = arg0.anInt9124 + super.aClass62_Sub2_16.anInt8689 * local404 / local176;
				local457 = super.anInt8886 + (super.anInt8876 * local48 + local33 * super.anInt8888 + local83 >> 15);
				local468 = arg0.anInt9121 + local437 * super.aClass62_Sub2_16.anInt8674 / local207;
				local479 = local457 * super.aClass62_Sub2_16.anInt8689 / local207 + arg0.anInt9124;
			}
			if (-((local416 - local479) * (local340 - local468)) + (local383 - local468) * (local372 - local479) > 0) {
				arg0.aBoolean669 = local383 < 0 || local468 < 0 || local340 < 0 || local383 > arg0.anInt9122 || local468 > arg0.anInt9122 || arg0.anInt9122 < local340;
				if (local12.aShort103 >= 0) {
					if (this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local12.aShort103).aByte78)) {
						arg0.anInt9123 = 100;
					}
					arg0.method7404(local416, local479, local372, local383, local468, local340, local12.aShort102 & 0xFFFF, local12.aShort104 & 0xFFFF, local12.aShort106 & 0xFFFF, local244, local297, local437, local265, local329, local457, local118, local145, local207, local12.aShort103);
					arg0.anInt9123 = 0;
				} else {
					arg0.method7413(local416, local479, local372, local383, local468, local340, local176, local207, local145, local12.aShort102 & 0xFFFF, local12.aShort104 & 0xFFFF, local12.aShort106 & 0xFFFF);
				}
			}
			if ((local276 - local340) * (local479 + -local372) - (local468 - local340) * (local308 - local372) > 0) {
				arg0.aBoolean669 = local276 < 0 || local340 < 0 || local468 < 0 || local276 > arg0.anInt9122 || arg0.anInt9122 < local340 || arg0.anInt9122 < local468;
				if (local12.aShort103 < 0) {
					arg0.method7413(local308, local372, local479, local276, local340, local468, local118, local145, local207, local12.aShort105 & 0xFFFF, local12.aShort106 & 0xFFFF, local12.aShort104 & 0xFFFF);
					return;
				}
				if (this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local12.aShort103).aByte78)) {
					arg0.anInt9123 = 100;
				}
				arg0.method7404(local308, local372, local479, local276, local340, local468, local12.aShort105 & 0xFFFF, local12.aShort106 & 0xFFFF, local12.aShort104 & 0xFFFF, local244, local297, local437, local265, local329, local457, local118, local145, local207, local12.aShort103);
				arg0.anInt9123 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III[ILclient!wq;IIIII[I[[Z)V")
	private void method3269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class317 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(10) int[] arg6, @OriginalArg(11) boolean[][] arg7) {
		@Pc(13) int local13 = (arg5 - arg1) * 1024 / 256;
		arg3.aBoolean666 = false;
		arg3.aBoolean667 = false;
		@Pc(33) int local33 = 0;
		@Pc(38) int local38 = local13;
		for (@Pc(40) int local40 = arg4; local40 < arg0; local40++) {
			for (@Pc(44) int local44 = arg1; local44 < arg5; local44++) {
				if (arg7[local40 - arg4][local44 - arg1]) {
					@Pc(92) int local92;
					if (super.aClass198ArrayArray3[local40][local44] != null) {
						@Pc(70) Class198 local70 = super.aClass198ArrayArray3[local40][local44];
						if (local70.aShort79 != -1 && (local70.aByte57 & 0x2) == 0 && local70.anInt6071 == 0) {
							local92 = super.aClass62_Sub2_16.method7076(local70.aShort79);
							arg3.method7413(local38 - 4, local38 + -4, local38, local33 + 4, local33, local33 + 4, 0, 0, 0, Static413.method7354(local92, local70.anInt6072), Static413.method7354(local92, local70.anInt6068), Static413.method7354(local92, local70.anInt6070));
							arg3.method7413(local38, local38, local38 - 4, local33, local33 + 4, local33, 0, 0, 0, Static413.method7354(local92, local70.anInt6069), Static413.method7354(local92, local70.anInt6070), Static413.method7354(local92, local70.anInt6068));
						} else if (local70.anInt6071 == 0) {
							arg3.method7405(local38 - 4, local38 + -4, local38, local33 + 4, local33, local33 + 4, 0, 0, 0, local70.anInt6072, local70.anInt6068, local70.anInt6070);
							arg3.method7405(local38, local38, local38 - 4, local33, local33 + 4, local33, 0, 0, 0, local70.anInt6069, local70.anInt6070, local70.anInt6068);
						} else {
							local92 = local70.anInt6071;
							arg3.method7405(local38 - 4, local38 + -4, local38, local33 + 4, local33, local33 + 4, 0, 0, 0, Static75.method1354(local70.anInt6072 & 0xFF000000, local92), Static75.method1354(local70.anInt6068 & 0xFF000000, local92), Static75.method1354(local70.anInt6070 & 0xFF000000, local92));
							arg3.method7405(local38, local38, local38 - 4, local33, local33 + 4, local33, 0, 0, 0, Static75.method1354(local70.anInt6069 & 0xFF000000, local92), Static75.method1354(local70.anInt6070 & 0xFF000000, local92), Static75.method1354(local70.anInt6068 & 0xFF000000, local92));
						}
					} else if (super.aClass297ArrayArray3[local40][local44] != null) {
						@Pc(314) Class297 local314 = super.aClass297ArrayArray3[local40][local44];
						for (local92 = 0; local92 < local314.aShort114; local92++) {
							arg6[local92] = local314.aShortArray133[local92] * 4 / super.anInt8874 + local33;
							arg2[local92] = local38 - local314.aShortArray131[local92] * 4 / super.anInt8874;
						}
						for (@Pc(358) int local358 = 0; local358 < local314.aShort113; local358++) {
							@Pc(364) int local364 = local358 * 3;
							@Pc(368) int local368 = local364 + 1;
							@Pc(372) int local372 = local368 + 1;
							@Pc(376) int local376 = arg6[local364];
							@Pc(380) int local380 = arg6[local368];
							@Pc(384) int local384 = arg6[local372];
							@Pc(388) int local388 = arg2[local364];
							@Pc(392) int local392 = arg2[local368];
							@Pc(396) int local396 = arg2[local372];
							@Pc(437) int local437;
							if (local314.anIntArray666 != null && local314.anIntArray666[local358] != 0 && (local314.aShortArray134 == null || local314.aShortArray134 != null && local314.aShortArray134[local358] == -1)) {
								local437 = local314.anIntArray666[local358];
								arg3.method7405(local388, local392, local396, local376, local380, local384, 0, 0, 0, Static75.method1354(-(local314.anIntArray667[local364] & 0xFF000000) - 16777216, local437), Static75.method1354(-(-16777216 & local314.anIntArray667[local368]) - 16777216, local437), Static75.method1354(-(local314.anIntArray667[local372] & 0xFF000000) - 16777216, local437));
							} else if (local314.aShortArray134 == null || local314.aShortArray134[local358] == -1) {
								arg3.method7405(local388, local392, local396, local376, local380, local384, 0, 0, 0, local314.anIntArray667[local364], local314.anIntArray667[local368], local314.anIntArray667[local372]);
							} else {
								local437 = super.aClass62_Sub2_16.method7076(local314.aShortArray134[local358]);
								arg3.method7413(local388, local392, local396, local376, local380, local384, 0, 0, 0, local437, local437, local437);
							}
						}
					}
				}
				local38 -= 4;
			}
			local38 = local13;
			local33 += 4;
		}
		arg3.aBoolean667 = true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[[Z[IILclient!wq;III[III)V")
	private void method3270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class317 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(19) int local19 = (arg1 - arg7) * 1024 / 256;
		arg5.aBoolean666 = false;
		arg5.aBoolean667 = false;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local19;
		for (@Pc(37) int local37 = arg4; local37 < arg0; local37++) {
			for (@Pc(41) int local41 = arg7; local41 < arg1; local41++) {
				if (arg2[local37 - arg4][local41 - arg7]) {
					@Pc(156) int local156;
					if (super.aClass286ArrayArray3[local37][local41] != null) {
						@Pc(69) Class286 local69 = super.aClass286ArrayArray3[local37][local41];
						if (local69.aShort103 != -1 && (local69.aByte89 & 0x2) == 0 && local69.anInt8345 == -1) {
							local156 = super.aClass62_Sub2_16.method7076(local69.aShort103);
							arg5.method7413(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, Static413.method7354(local156, local69.aShort102 & 0xFFFF), Static413.method7354(local156, local69.aShort104 & 0xFFFF), Static413.method7354(local156, local69.aShort106 & 0xFFFF));
							arg5.method7413(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, Static413.method7354(local156, local69.aShort105 & 0xFFFF), Static413.method7354(local156, local69.aShort106 & 0xFFFF), Static413.method7354(local156, local69.aShort104 & 0xFFFF));
						} else if (local69.anInt8345 == -1) {
							arg5.method7413(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, local69.aShort102 & 0xFFFF, local69.aShort104 & 0xFFFF, local69.aShort106 & 0xFFFF);
							arg5.method7413(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, local69.aShort105 & 0xFFFF, local69.aShort106 & 0xFFFF, local69.aShort104 & 0xFFFF);
						} else {
							local156 = local69.anInt8345;
							arg5.method7413(local35 - 4, local35 - 4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, local156, local156, local156);
							arg5.method7413(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, local156, local156, local156);
						}
					} else if (super.aClass169ArrayArray3[local37][local41] != null) {
						@Pc(301) Class169 local301 = super.aClass169ArrayArray3[local37][local41];
						for (local156 = 0; local156 < local301.aShort61; local156++) {
							arg3[local156] = local31 + local301.aShortArray54[local156] * 4 / super.anInt8874;
							arg6[local156] = local35 - local301.aShortArray59[local156] * 4 / super.anInt8874;
						}
						for (@Pc(341) int local341 = 0; local341 < local301.aShort62; local341++) {
							@Pc(348) short local348 = local301.aShortArray56[local341];
							@Pc(353) short local353 = local301.aShortArray53[local341];
							@Pc(358) short local358 = local301.aShortArray57[local341];
							@Pc(362) int local362 = arg3[local348];
							@Pc(366) int local366 = arg3[local353];
							@Pc(370) int local370 = arg3[local358];
							@Pc(374) int local374 = arg6[local348];
							@Pc(378) int local378 = arg6[local353];
							@Pc(382) int local382 = arg6[local358];
							@Pc(405) int local405;
							if (local301.anIntArray314 != null && local301.anIntArray314[local341] != -1) {
								local405 = local301.anIntArray314[local341];
								arg5.method7413(local374, local378, local382, local362, local366, local370, 0, 0, 0, Static413.method7354(local405, local301.aShortArray58[local348]), Static413.method7354(local405, local301.aShortArray58[local353]), Static413.method7354(local405, local301.aShortArray58[local358]));
							} else if (local301.aShortArray52 == null || local301.aShortArray52[local341] == -1) {
								local405 = local301.anIntArray313[local341];
								arg5.method7413(local374, local378, local382, local362, local366, local370, 0, 0, 0, Static413.method7354(local405, local301.aShortArray58[local348]), Static413.method7354(local405, local301.aShortArray58[local353]), Static413.method7354(local405, local301.aShortArray58[local358]));
							} else {
								local405 = super.aClass62_Sub2_16.method7076(local301.aShortArray52[local341]);
								arg5.method7413(local374, local378, local382, local362, local366, local370, 0, 0, 0, Static413.method7354(local405, local301.aShortArray58[local348]), Static413.method7354(local405, local301.aShortArray58[local353]), Static413.method7354(local405, local301.aShortArray58[local358]));
							}
						}
					}
				}
				local35 -= 4;
			}
			local35 = local19;
			local31 += 4;
		}
		arg5.aBoolean667 = true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!wq;I[I[I[IIZ[I)V")
	private void method3271(@OriginalArg(1) Class317 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int[] arg7) {
		@Pc(16) Class198 local16 = super.aClass198ArrayArray3[arg5][arg1];
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(482) int local482;
		@Pc(525) int local525;
		@Pc(590) int local590;
		@Pc(654) int local654;
		@Pc(493) int local493;
		@Pc(578) int local578;
		@Pc(642) int local642;
		@Pc(688) int local688;
		@Pc(450) int local450;
		@Pc(514) int local514;
		@Pc(566) int local566;
		@Pc(630) int local630;
		@Pc(471) int local471;
		@Pc(545) int local545;
		@Pc(610) int local610;
		@Pc(676) int local676;
		@Pc(122) int local122;
		@Pc(152) int local152;
		@Pc(178) int local178;
		@Pc(204) int local204;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(227) int local227;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(89) int local89;
		@Pc(98) int local98;
		@Pc(248) int local248;
		if (local16 == null) {
			@Pc(1626) Class297 local1626 = super.aClass297ArrayArray3[arg5][arg1];
			if (local1626 != null) {
				if (super.anInt8881 == -1) {
					for (local654 = 0; local654 < local1626.aShort114; local654++) {
						local34 = local1626.aShortArray133[local654] + (arg5 << super.anInt8869);
						local39 = local1626.aShortArray130[local654];
						local44 = local1626.aShortArray131[local654] + (arg1 << super.anInt8869);
						local590 = (local34 * super.anInt8877 + super.anInt8887 * local39 + local44 * super.anInt8882 >> 15) + super.anInt8879;
						if (super.aClass62_Sub2_16.anInt8677 >= local590) {
							return;
						}
						arg4[local654] = 0;
						if (arg6) {
							local493 = local590 - super.aClass62_Sub2_16.anInt8682;
							if (local493 > 255) {
								local493 = 255;
							}
							if (local493 > 0) {
								arg4[local654] = local493;
								local578 = local493 * local1626.aShortArray135[local654] / 255;
								if (local578 > 0) {
									local39 -= local578;
								}
							}
						} else if (super.aClass62_Sub2_16.aBoolean632) {
							local493 = local590 - super.aClass62_Sub2_16.anInt8682;
							if (local493 > 0) {
								arg4[local654] = local493;
								if (arg4[local654] > 255) {
									arg4[local654] = 255;
								}
							}
						}
						local482 = (super.anInt8875 * local34 + super.anInt8878 * local39 + local44 * super.anInt8885 >> 15) + super.anInt8883;
						local525 = super.anInt8886 + (local44 * super.anInt8876 + super.anInt8888 * local34 + super.anInt8884 * local39 >> 15);
						arg2[local654] = arg0.anInt9121 + local482 * super.aClass62_Sub2_16.anInt8674 / local590;
						arg3[local654] = local525 * super.aClass62_Sub2_16.anInt8689 / local590 + arg0.anInt9124;
						arg7[local654] = local590;
					}
				} else {
					for (local654 = 0; local654 < local1626.aShort114; local654++) {
						local34 = local1626.aShortArray133[local654] + (arg5 << super.anInt8869);
						local39 = local1626.aShortArray130[local654];
						local44 = local1626.aShortArray131[local654] + (arg1 << super.anInt8869);
						arg4[local654] = 0;
						if (arg6) {
							local493 = super.anInt8881 - super.aClass62_Sub2_16.anInt8682;
							if (local493 > 255) {
								local493 = 255;
							}
							if (local493 > 0) {
								arg4[local654] = local493;
								local578 = local493 * local1626.aShortArray135[local654] / 255;
								if (local578 > 0) {
									local39 -= local578;
								}
							}
						} else if (super.aClass62_Sub2_16.aBoolean632) {
							local493 = -super.aClass62_Sub2_16.anInt8682 + super.anInt8881;
							if (local493 > 0) {
								arg4[local654] = local493;
								if (arg4[local654] > 255) {
									arg4[local654] = 255;
								}
							}
						}
						local482 = (local34 * super.anInt8875 + super.anInt8878 * local39 + super.anInt8885 * local44 >> 15) + super.anInt8883;
						local525 = super.anInt8886 + (super.anInt8888 * local34 + local39 * super.anInt8884 + local44 * super.anInt8876 >> 15);
						arg2[local654] = super.aClass62_Sub2_16.anInt8674 * local482 / super.anInt8881 + arg0.anInt9121;
						arg3[local654] = super.aClass62_Sub2_16.anInt8689 * local525 / super.anInt8881 + arg0.anInt9124;
						arg7[local654] = super.anInt8881;
					}
				}
				if (local1626.aShortArray134 == null) {
					for (local654 = 0; local654 < local1626.aShort113; local654++) {
						local493 = local654 * 3;
						local578 = local493 + 1;
						local642 = local578 + 1;
						local688 = arg2[local493];
						local450 = arg2[local578];
						local514 = arg2[local642];
						local566 = arg3[local493];
						local630 = arg3[local578];
						local471 = arg3[local642];
						local545 = arg4[local642] + arg4[local493] + arg4[local578];
						if (-((local514 - local450) * (local566 + -local630)) + (local471 - local630) * (local688 + -local450) > 0) {
							arg0.aBoolean669 = local688 < 0 || local450 < 0 || local514 < 0 || local688 > arg0.anInt9122 || arg0.anInt9122 < local450 || arg0.anInt9122 < local514;
							if (local545 >= 765) {
								arg0.method7412(local566, local630, local471, local688, local450, local514, arg7[local493], arg7[local578], arg7[local642], super.aClass62_Sub2_16.anInt8684);
							} else if (local545 <= 0) {
								if ((local1626.anIntArray667[local493] & 0xFFFFFF) != 0) {
									arg0.method7405(local566, local630, local471, local688, local450, local514, arg7[local493], arg7[local578], arg7[local642], local1626.anIntArray667[local493], local1626.anIntArray667[local578], local1626.anIntArray667[local642]);
								}
							} else if ((local1626.anIntArray667[local493] & 0xFFFFFF) != 0) {
								arg0.method7405(local566, local630, local471, local688, local450, local514, arg7[local493], arg7[local578], arg7[local642], Static158.method2887(local1626.anIntArray667[local493], arg4[local493], super.aClass62_Sub2_16.anInt8684), Static158.method2887(local1626.anIntArray667[local578], arg4[local578], super.aClass62_Sub2_16.anInt8684), Static158.method2887(local1626.anIntArray667[local642], arg4[local642], super.aClass62_Sub2_16.anInt8684));
							}
						}
					}
				} else {
					local654 = super.anIntArrayArray78[arg5][arg1];
					local493 = super.anIntArrayArray78[arg5 + 1][arg1];
					local578 = super.anIntArrayArray78[arg5][arg1 + 1];
					local642 = arg5 * super.anInt8874;
					local688 = super.anInt8874 + local642;
					local450 = arg1 * super.anInt8874;
					local514 = local450 + super.anInt8874;
					local566 = (local450 * super.anInt8885 + local654 * super.anInt8878 + local642 * super.anInt8875 >> 15) + super.anInt8883;
					local630 = (super.anInt8876 * local450 + local654 * super.anInt8884 + super.anInt8888 * local642 >> 15) + super.anInt8886;
					local471 = super.anInt8879 + (local450 * super.anInt8882 + local654 * super.anInt8887 + super.anInt8877 * local642 >> 15);
					local545 = super.anInt8883 + (super.anInt8878 * local493 + local688 * super.anInt8875 + local450 * super.anInt8885 >> 15);
					local610 = super.anInt8886 + (local450 * super.anInt8876 + super.anInt8884 * local493 + local688 * super.anInt8888 >> 15);
					local676 = (local688 * super.anInt8877 + super.anInt8887 * local493 + super.anInt8882 * local450 >> 15) + super.anInt8879;
					local122 = (super.anInt8885 * local514 + local642 * super.anInt8875 + super.anInt8878 * local578 >> 15) + super.anInt8883;
					local152 = (super.anInt8876 * local514 + super.anInt8884 * local578 + super.anInt8888 * local642 >> 15) + super.anInt8886;
					local178 = super.anInt8879 + (super.anInt8882 * local514 + local578 * super.anInt8887 + super.anInt8877 * local642 >> 15);
					for (local204 = 0; local204 < local1626.aShort113; local204++) {
						local46 = local204 * 3;
						local48 = local46 + 1;
						local50 = local48 + 1;
						local52 = arg2[local46];
						local227 = arg2[local48];
						local69 = arg2[local50];
						local78 = arg3[local46];
						local89 = arg3[local48];
						local98 = arg3[local50];
						local248 = arg4[local48] + arg4[local46] + arg4[local50];
						if (-((local78 - local89) * (-local227 + local69)) + (local98 - local89) * (local52 - local227) > 0) {
							arg0.aBoolean669 = local52 < 0 || local227 < 0 || local69 < 0 || local52 > arg0.anInt9122 || local227 > arg0.anInt9122 || arg0.anInt9122 < local69;
							@Pc(2380) short local2380 = local1626.aShortArray134[local204];
							if (local248 < 765) {
								if (local2380 != -1 && this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local2380).aByte78)) {
									arg0.anInt9123 = 100;
								}
								if (local248 <= 0) {
									if (local2380 != -1) {
										arg0.method7404(local78, local89, local98, local52, local227, local69, local1626.anIntArray667[local46], local1626.anIntArray667[local48], local1626.anIntArray667[local50], local566, local545, local122, local630, local610, local152, local471, local676, local178, local2380);
									} else if ((local1626.anIntArray667[local46] & 0xFFFFFF) != 0) {
										arg0.method7405(local78, local89, local98, local52, local227, local69, arg7[local46], arg7[local48], arg7[local50], local1626.anIntArray667[local46], local1626.anIntArray667[local48], local1626.anIntArray667[local50]);
									}
								} else if (local2380 != -1) {
									arg0.method7408(local78, local89, local98, local52, local227, local69, arg7[local46], arg7[local48], arg7[local50], super.aClass62_Sub2_16.anInt8684, arg4[local46], arg4[local48], arg4[local50], local1626.anIntArray667[local46], local1626.anIntArray667[local48], local1626.anIntArray667[local50], local566, local545, local122, local630, local610, local152, local471, local676, local178, local2380);
								} else if ((local1626.anIntArray667[local46] & 0xFFFFFF) != 0) {
									arg0.method7405(local78, local89, local98, local52, local227, local69, arg7[local46], arg7[local48], arg7[local50], Static75.method1354(arg4[local46] << 24 | super.aClass62_Sub2_16.anInt8684, local1626.anIntArray667[local46]), Static75.method1354(arg4[local48] << 24 | super.aClass62_Sub2_16.anInt8684, local1626.anIntArray667[local48]), Static75.method1354(arg4[local50] << 24 | super.aClass62_Sub2_16.anInt8684, local1626.anIntArray667[local50]));
								}
								arg0.anInt9123 = 0;
							} else {
								arg0.method7412(local78, local89, local98, local52, local227, local69, arg7[local46], arg7[local48], arg7[local50], super.aClass62_Sub2_16.anInt8684);
							}
						}
					}
				}
			}
		} else if ((local16.aByte57 & 0x2) == 0) {
			@Pc(29) int local29 = super.anInt8874 * arg5;
			local34 = super.anInt8874 + local29;
			local39 = super.anInt8874 * arg1;
			local44 = local39 + super.anInt8874;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			local52 = 0;
			if ((local16.aByte57 & 0x1) == 0 || arg6) {
				local69 = super.anIntArrayArray78[arg5][arg1];
				local78 = super.anIntArrayArray78[arg5 + 1][arg1];
				local89 = super.anIntArrayArray78[arg5 + 1][arg1 + 1];
				local98 = super.anIntArrayArray78[arg5][arg1 + 1];
				if (super.anInt8881 == -1) {
					local122 = (super.anInt8882 * local39 + local29 * super.anInt8877 + local69 * super.anInt8887 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local122) {
						return;
					}
					local152 = (local78 * super.anInt8887 + super.anInt8877 * local34 + super.anInt8882 * local39 >> 15) + super.anInt8879;
					if (local152 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local178 = (local34 * super.anInt8877 + local89 * super.anInt8887 + super.anInt8882 * local44 >> 15) + super.anInt8879;
					if (local178 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
					local204 = (super.anInt8882 * local44 + local98 * super.anInt8887 + local29 * super.anInt8877 >> 15) + super.anInt8879;
					if (local204 <= super.aClass62_Sub2_16.anInt8677) {
						return;
					}
				} else {
					local204 = super.anInt8881;
					local178 = super.anInt8881;
					local152 = super.anInt8881;
					local122 = super.anInt8881;
				}
				if (arg6) {
					local227 = local122 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 255) {
						local227 = 255;
					}
					if (local227 > 0) {
						local46 = local227;
						local248 = local227 * local16.aShort82 / 255;
						if (local248 > 0) {
							local69 -= local248;
						}
					}
					local227 = local152 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 255) {
						local227 = 255;
					}
					if (local227 > 0) {
						local48 = local227;
						local248 = local16.aShort81 * local227 / 255;
						if (local248 > 0) {
							local78 -= local248;
						}
					}
					local227 = local178 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 255) {
						local227 = 255;
					}
					if (local227 > 0) {
						local50 = local227;
						local248 = local227 * local16.aShort83 / 255;
						if (local248 > 0) {
							local89 -= local248;
						}
					}
					local227 = local204 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 255) {
						local227 = 255;
					}
					if (local227 > 0) {
						local52 = local227;
						local248 = local227 * local16.aShort80 / 255;
						if (local248 > 0) {
							local98 -= local248;
						}
					}
				} else if (super.aClass62_Sub2_16.aBoolean632) {
					local227 = local122 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local46 = local227;
						if (local227 > 255) {
							local46 = 255;
						}
					}
					local227 = local152 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local48 = local227;
						if (local227 > 255) {
							local48 = 255;
						}
					}
					local227 = local178 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local50 = local227;
						if (local227 > 255) {
							local50 = 255;
						}
					}
					local227 = local204 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local52 = local227;
						if (local227 > 255) {
							local52 = 255;
						}
					}
				}
				local450 = (local69 * super.anInt8878 + super.anInt8875 * local29 + super.anInt8885 * local39 >> 15) + super.anInt8883;
				local471 = (local29 * super.anInt8888 + local69 * super.anInt8884 + local39 * super.anInt8876 >> 15) + super.anInt8886;
				local482 = super.aClass62_Sub2_16.anInt8674 * local450 / local122 + arg0.anInt9121;
				local493 = arg0.anInt9124 + local471 * super.aClass62_Sub2_16.anInt8689 / local122;
				local514 = super.anInt8883 + (super.anInt8875 * local34 + local78 * super.anInt8878 + super.anInt8885 * local39 >> 15);
				local525 = local514 * super.aClass62_Sub2_16.anInt8674 / local152 + arg0.anInt9121;
				local545 = (local39 * super.anInt8876 + local34 * super.anInt8888 + super.anInt8884 * local78 >> 15) + super.anInt8886;
				local566 = (super.anInt8885 * local44 + local34 * super.anInt8875 + local89 * super.anInt8878 >> 15) + super.anInt8883;
				local578 = arg0.anInt9124 + super.aClass62_Sub2_16.anInt8689 * local545 / local152;
				local590 = arg0.anInt9121 + super.aClass62_Sub2_16.anInt8674 * local566 / local178;
				local610 = (super.anInt8884 * local89 + super.anInt8888 * local34 + super.anInt8876 * local44 >> 15) + super.anInt8886;
				local630 = (super.anInt8885 * local44 + local98 * super.anInt8878 + super.anInt8875 * local29 >> 15) + super.anInt8883;
				local642 = arg0.anInt9124 + local610 * super.aClass62_Sub2_16.anInt8689 / local178;
				local654 = arg0.anInt9121 + local630 * super.aClass62_Sub2_16.anInt8674 / local204;
				local676 = (local29 * super.anInt8888 + local98 * super.anInt8884 + local44 * super.anInt8876 >> 15) + super.anInt8886;
				local688 = arg0.anInt9124 + super.aClass62_Sub2_16.anInt8689 * local676 / local204;
			} else {
				local69 = super.anIntArrayArray78[arg5][arg1];
				if (super.anInt8881 == -1) {
					local78 = local69 * super.anInt8887;
					local122 = super.anInt8879 + (local39 * super.anInt8882 + local78 + local29 * super.anInt8877 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local122) {
						return;
					}
					local152 = super.anInt8879 + (local78 + local34 * super.anInt8877 + super.anInt8882 * local39 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local152) {
						return;
					}
					local178 = super.anInt8879 + (super.anInt8877 * local34 + local78 + local44 * super.anInt8882 >> 15);
					if (super.aClass62_Sub2_16.anInt8677 >= local178) {
						return;
					}
					local204 = (local44 * super.anInt8882 + local29 * super.anInt8877 + local78 >> 15) + super.anInt8879;
					if (super.aClass62_Sub2_16.anInt8677 >= local204) {
						return;
					}
				} else {
					local204 = super.anInt8881;
					local178 = super.anInt8881;
					local152 = super.anInt8881;
					local122 = super.anInt8881;
				}
				if (super.aClass62_Sub2_16.aBoolean632) {
					local227 = local122 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local46 = local227;
						if (local227 > 255) {
							local46 = 255;
						}
					}
					local227 = local152 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local48 = local227;
						if (local227 > 255) {
							local48 = 255;
						}
					}
					local227 = local178 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local50 = local227;
						if (local227 > 255) {
							local50 = 255;
						}
					}
					local227 = local204 - super.aClass62_Sub2_16.anInt8682;
					if (local227 > 0) {
						local52 = local227;
						if (local227 > 255) {
							local52 = 255;
						}
					}
				}
				local78 = local69 * super.anInt8878;
				local89 = local69 * super.anInt8884;
				local450 = (local78 + super.anInt8875 * local29 + super.anInt8885 * local39 >> 15) + super.anInt8883;
				local471 = super.anInt8886 + (super.anInt8876 * local39 + local29 * super.anInt8888 + local89 >> 15);
				local482 = local450 * super.aClass62_Sub2_16.anInt8674 / local122 + arg0.anInt9121;
				local514 = (local78 + local34 * super.anInt8875 + super.anInt8885 * local39 >> 15) + super.anInt8883;
				local493 = super.aClass62_Sub2_16.anInt8689 * local471 / local122 + arg0.anInt9124;
				local545 = super.anInt8886 + (local39 * super.anInt8876 + super.anInt8888 * local34 + local89 >> 15);
				local525 = local514 * super.aClass62_Sub2_16.anInt8674 / local152 + arg0.anInt9121;
				local578 = super.aClass62_Sub2_16.anInt8689 * local545 / local152 + arg0.anInt9124;
				local566 = (local44 * super.anInt8885 + local78 + local34 * super.anInt8875 >> 15) + super.anInt8883;
				local610 = super.anInt8886 + (local34 * super.anInt8888 + local89 + super.anInt8876 * local44 >> 15);
				local590 = super.aClass62_Sub2_16.anInt8674 * local566 / local178 + arg0.anInt9121;
				local630 = super.anInt8883 + (super.anInt8875 * local29 + local78 + local44 * super.anInt8885 >> 15);
				local642 = arg0.anInt9124 + super.aClass62_Sub2_16.anInt8689 * local610 / local178;
				local654 = local630 * super.aClass62_Sub2_16.anInt8674 / local204 + arg0.anInt9121;
				local676 = super.anInt8886 + (super.anInt8876 * local44 + super.anInt8888 * local29 + local89 >> 15);
				local688 = super.aClass62_Sub2_16.anInt8689 * local676 / local204 + arg0.anInt9124;
			}
			@Pc(1167) boolean local1167 = local16.aShort79 != -1 && this.method7192(super.aClass62_Sub2_16.anInterface8_145.method7237(local16.aShort79).aByte78);
			local78 = local52 + local50 + local48;
			if (-((local642 - local688) * (local525 + -local654)) + (local578 - local688) * (-local654 + local590) > 0) {
				arg0.aBoolean669 = local590 < 0 || local654 < 0 || local525 < 0 || local590 > arg0.anInt9122 || local654 > arg0.anInt9122 || arg0.anInt9122 < local525;
				if (local78 < 765) {
					if (local1167) {
						arg0.anInt9123 = 100;
					}
					if (local78 > 0) {
						if (local16.aShort79 < 0) {
							arg0.method7405(local642, local688, local578, local590, local654, local525, local178, local204, local152, Static75.method1354(local50 << 24 | super.aClass62_Sub2_16.anInt8684, local16.anInt6072), Static75.method1354(super.aClass62_Sub2_16.anInt8684 | local52 << 24, local16.anInt6068), Static75.method1354(local48 << 24 | super.aClass62_Sub2_16.anInt8684, local16.anInt6070));
						} else {
							arg0.method7408(local642, local688, local578, local590, local654, local525, local178, local204, local152, super.aClass62_Sub2_16.anInt8684, local50, local52, local48, local16.anInt6072, local16.anInt6068, local16.anInt6070, local566, local630, local514, local610, local676, local545, local178, local204, local152, local16.aShort79);
						}
					} else if (local16.aShort79 >= 0) {
						arg0.method7404(local642, local688, local578, local590, local654, local525, local16.anInt6072, local16.anInt6068, local16.anInt6070, local566, local630, local514, local610, local676, local545, local178, local204, local152, local16.aShort79);
					} else {
						arg0.method7405(local642, local688, local578, local590, local654, local525, local178, local204, local152, local16.anInt6072, local16.anInt6068, local16.anInt6070);
					}
					arg0.anInt9123 = 0;
				} else {
					arg0.method7412(local642, local688, local578, local590, local654, local525, local178, local204, local152, super.aClass62_Sub2_16.anInt8684);
				}
			}
			local78 = local52 + local46 + local48;
			if (-((local654 - local525) * (-local578 + local493)) + (local482 - local525) * (local688 + -local578) > 0) {
				arg0.aBoolean669 = local482 < 0 || local525 < 0 || local654 < 0 || arg0.anInt9122 < local482 || local525 > arg0.anInt9122 || local654 > arg0.anInt9122;
				if (local78 >= 765) {
					arg0.method7412(local493, local578, local688, local482, local525, local654, local122, local152, local204, super.aClass62_Sub2_16.anInt8684);
					return;
				}
				if (local1167) {
					arg0.anInt9123 = 100;
				}
				if (local78 > 0) {
					if (local16.aShort79 >= 0) {
						arg0.method7408(local493, local578, local688, local482, local525, local654, local122, local152, local204, super.aClass62_Sub2_16.anInt8684, local46, local48, local52, local16.anInt6069, local16.anInt6070, local16.anInt6068, local450, local514, local630, local471, local545, local676, local122, local152, local204, local16.aShort79);
					} else {
						arg0.method7405(local493, local578, local688, local482, local525, local654, local122, local152, local204, Static75.method1354(local46 << 24 | super.aClass62_Sub2_16.anInt8684, local16.anInt6069), Static75.method1354(super.aClass62_Sub2_16.anInt8684 | local48 << 24, local16.anInt6070), Static75.method1354(super.aClass62_Sub2_16.anInt8684 | local52 << 24, local16.anInt6068));
					}
				} else if (local16.aShort79 < 0) {
					arg0.method7405(local493, local578, local688, local482, local525, local654, local122, local152, local204, local16.anInt6069, local16.anInt6070, local16.anInt6068);
				} else {
					arg0.method7404(local493, local578, local688, local482, local525, local654, local16.anInt6069, local16.anInt6070, local16.anInt6068, local450, local514, local630, local471, local545, local676, local122, local152, local204, local16.aShort79);
				}
				arg0.anInt9123 = 0;
			}
		}
	}
}
