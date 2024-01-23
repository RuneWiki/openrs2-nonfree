import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public abstract class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Z")
	public boolean aBoolean247 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!gk;I)V")
	public final void method3598(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.method3600()) {
			return;
		}
		@Pc(12) Class61 local12 = arg0.aClass61Array1[arg1];
		@Pc(15) Class1_Sub6 local15 = local12.aClass1_Sub6_1;
		for (@Pc(17) int local17 = 0; local17 < local12.anInt2775; local17++) {
			@Pc(23) short local23 = local12.aShortArray34[local17];
			if (local15.aBooleanArray3[local23]) {
				if (local12.aShortArray41[local17] != -1) {
					this.method3609(0, 0, 0, 0);
				}
				this.method3609(local15.anIntArray103[local23], local12.aShortArray35[local17], local12.aShortArray37[local17], local12.aShortArray39[local17]);
			}
		}
		this.method3615();
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()I")
	public abstract int method3599();

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "()Z")
	protected abstract boolean method3600();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!gk;ILclient!gk;IIIZ)V")
	public final void method3601(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg1 == -1 || !this.method3600()) {
			return;
		}
		@Pc(12) Class61 local12 = arg0.aClass61Array1[arg1];
		@Pc(15) Class1_Sub6 local15 = local12.aClass1_Sub6_1;
		@Pc(17) Class61 local17 = null;
		if (arg2 != null) {
			local17 = arg2.aClass61Array1[arg3];
			if (local17.aClass1_Sub6_1 != local15) {
				local17 = null;
			}
		}
		this.method3624(local15, local12, local17, arg4, arg5, null, false, arg6, 65535, null);
		this.method3615();
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "()I")
	public abstract int method3602();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZZ)Lclient!gh;")
	public abstract Class9_Sub5 method3603(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIJ)V")
	public abstract void method3604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6);

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "()I")
	public abstract int method3605();

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)V")
	public abstract void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!gk;ILclient!gk;IIILclient!gk;ILclient!gk;III[ZZ)V")
	public final void method3607(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub2_Sub8 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method3601(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
		} else if (this.method3600()) {
			@Pc(27) Class61 local27 = arg0.aClass61Array1[arg1];
			@Pc(30) Class1_Sub6 local30 = local27.aClass1_Sub6_1;
			@Pc(32) Class61 local32 = null;
			if (arg2 != null) {
				local32 = arg2.aClass61Array1[arg3];
				if (local32.aClass1_Sub6_1 != local30) {
					local32 = null;
				}
			}
			@Pc(50) Class61 local50 = arg6.aClass61Array1[arg7];
			@Pc(52) Class61 local52 = null;
			if (arg8 != null) {
				local52 = arg8.aClass61Array1[arg9];
				if (local52.aClass1_Sub6_1 != local30) {
					local52 = null;
				}
			}
			this.method3624(local30, local27, local32, arg4, arg5, arg12, false, arg13, 65535, null);
			this.method3611(0, new int[0], 0, 0, 0, arg13);
			this.method3624(local30, local50, local52, arg10, arg11, arg12, true, arg13, 65535, null);
			this.method3615();
		}
	}

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "()I")
	public abstract int method3608();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
	protected abstract void method3609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(ZZZ)Lclient!gh;")
	public abstract Class9_Sub5 method3610(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[IIIIZ)V")
	protected abstract void method3611(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "()V")
	public abstract void method3612();

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(III)V")
	public abstract void method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public abstract void method3614(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "()V")
	protected abstract void method3615();

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "()I")
	public abstract int method3616();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!gk;ILclient!gk;IIIIZ[I)V")
	public final void method3617(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int[] arg8) {
		if (arg1 == -1 || !this.method3600()) {
			return;
		}
		@Pc(12) Class61 local12 = arg0.aClass61Array1[arg1];
		@Pc(15) Class1_Sub6 local15 = local12.aClass1_Sub6_1;
		@Pc(17) Class61 local17 = null;
		if (arg2 != null) {
			local17 = arg2.aClass61Array1[arg3];
			if (local17.aClass1_Sub6_1 != local15) {
				local17 = null;
			}
		}
		this.method3624(local15, local12, local17, arg4, arg5, null, false, arg7, arg6, arg8);
		this.method3615();
	}

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "()V")
	public abstract void method3618();

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public abstract void method3619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	public abstract void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()I")
	public abstract int method3587();

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	public abstract void method3622(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([[IIIIII)V")
	protected final void method3623(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static271.method3620(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static271.method3620(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static271.method3620(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static271.method3620(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method3619(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method3614(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method3613(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!dg;Lclient!ih;Lclient!ih;II[ZZZI[I)V")
	private void method3624(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt2775; local5++) {
				@Pc(11) short local11 = arg1.aShortArray34[local5];
				if (arg5 == null || arg5[local11] == arg6 || arg0.anIntArray103[local11] == 0) {
					@Pc(28) short local28 = arg1.aShortArray41[local5];
					@Pc(38) int local38;
					if (local28 != -1) {
						local38 = arg8 & arg0.anIntArray102[local28];
						if (local38 == 65535) {
							this.method3611(0, arg0.anIntArrayArray12[local28], 0, 0, 0, arg7);
						} else {
							this.method3621(0, arg0.anIntArrayArray12[local28], 0, 0, 0, arg7, local38, arg9);
						}
					}
					local38 = arg8 & arg0.anIntArray102[local11];
					if (local38 == 65535) {
						this.method3611(arg0.anIntArray103[local11], arg0.anIntArrayArray12[local11], arg1.aShortArray35[local5], arg1.aShortArray37[local5], arg1.aShortArray39[local5], arg7);
					} else {
						this.method3621(arg0.anIntArray103[local11], arg0.anIntArrayArray12[local11], arg1.aShortArray35[local5], arg1.aShortArray37[local5], arg1.aShortArray39[local5], arg7, local38, arg9);
					}
				}
			}
			return;
		}
		local5 = 0;
		@Pc(135) int local135 = 0;
		for (@Pc(137) int local137 = 0; local137 < arg0.anInt1379; local137++) {
			@Pc(140) boolean local140 = false;
			if (local5 < arg1.anInt2775 && arg1.aShortArray34[local5] == local137) {
				local140 = true;
			}
			@Pc(154) boolean local154 = false;
			if (local135 < arg2.anInt2775 && arg2.aShortArray34[local135] == local137) {
				local154 = true;
			}
			if (local140 || local154) {
				if (arg5 == null || arg5[local137] == arg6 || arg0.anIntArray103[local137] == 0) {
					@Pc(191) short local191 = 0;
					@Pc(196) int local196 = arg0.anIntArray103[local137];
					if (local196 == 3) {
						local191 = 128;
					}
					@Pc(208) short local208;
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) byte local228;
					if (local140) {
						local208 = arg1.aShortArray35[local5];
						local213 = arg1.aShortArray37[local5];
						local218 = arg1.aShortArray39[local5];
						local223 = arg1.aShortArray41[local5];
						local228 = arg1.aByteArray33[local5];
						local5++;
					} else {
						local208 = local191;
						local213 = local191;
						local218 = local191;
						local223 = -1;
						local228 = 0;
					}
					@Pc(247) short local247;
					@Pc(252) short local252;
					@Pc(257) short local257;
					@Pc(262) short local262;
					@Pc(267) byte local267;
					if (local154) {
						local247 = arg2.aShortArray35[local135];
						local252 = arg2.aShortArray37[local135];
						local257 = arg2.aShortArray39[local135];
						local262 = arg2.aShortArray41[local135];
						local267 = arg2.aByteArray33[local135];
						local135++;
					} else {
						local247 = local191;
						local252 = local191;
						local257 = local191;
						local262 = -1;
						local267 = 0;
					}
					@Pc(289) int local289;
					@Pc(291) int local291;
					@Pc(293) int local293;
					@Pc(303) int local303;
					if ((local228 & 0x2) != 0 || (local267 & 0x1) != 0) {
						local289 = local208;
						local291 = local213;
						local293 = local218;
					} else if (local196 == 2) {
						local303 = local247 - local208 & 0x7FF;
						@Pc(309) int local309 = local252 - local213 & 0x7FF;
						@Pc(315) int local315 = local257 - local218 & 0x7FF;
						if (local303 >= 1024) {
							local303 -= 2048;
						}
						if (local309 >= 1024) {
							local309 -= 2048;
						}
						if (local315 >= 1024) {
							local315 -= 2048;
						}
						local289 = local208 + local303 * arg3 / arg4 & 0x7FF;
						local291 = local213 + local309 * arg3 / arg4 & 0x7FF;
						local293 = local218 + local315 * arg3 / arg4 & 0x7FF;
					} else if (local196 == 7) {
						local303 = local247 - local208 & 0x3F;
						if (local303 >= 32) {
							local303 -= 64;
						}
						local289 = local208 + local303 * arg3 / arg4 & 0x3F;
						local291 = local213 + (local252 - local213) * arg3 / arg4;
						local293 = local218 + (local257 - local218) * arg3 / arg4;
					} else {
						local289 = local208 + (local247 - local208) * arg3 / arg4;
						local291 = local213 + (local252 - local213) * arg3 / arg4;
						local293 = local218 + (local257 - local218) * arg3 / arg4;
					}
					if (local223 != -1) {
						local303 = arg8 & arg0.anIntArray102[local223];
						if (local303 == 65535) {
							this.method3611(0, arg0.anIntArrayArray12[local223], 0, 0, 0, arg7);
						} else {
							this.method3621(0, arg0.anIntArrayArray12[local223], 0, 0, 0, arg7, local303, arg9);
						}
					} else if (local262 != -1) {
						local303 = arg8 & arg0.anIntArray102[local262];
						if (local303 == 65535) {
							this.method3611(0, arg0.anIntArrayArray12[local262], 0, 0, 0, arg7);
						} else {
							this.method3621(0, arg0.anIntArrayArray12[local262], 0, 0, 0, arg7, local303, arg9);
						}
					}
					local303 = arg8 & arg0.anIntArray102[local137];
					if (local303 == 65535) {
						this.method3611(local196, arg0.anIntArrayArray12[local137], local289, local291, local293, arg7);
					} else {
						this.method3621(local196, arg0.anIntArrayArray12[local137], local289, local291, local293, arg7, local303, arg9);
					}
				} else {
					if (local140) {
						local5++;
					}
					if (local154) {
						local135++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(ZZZ)Lclient!gh;")
	public abstract Class9_Sub5 method3625(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "()V")
	public abstract void method3626();
}
