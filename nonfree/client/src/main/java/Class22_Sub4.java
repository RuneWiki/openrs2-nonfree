import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public abstract class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([[IIIIII)V")
	protected final void method3551(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static320.method3580(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static320.method3580(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static320.method3580(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static320.method3580(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method3565(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method3576(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method3577(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!vk;ILclient!vk;IIIZ)V")
	public final void method3552(@OriginalArg(0) Class1_Sub1_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg1 == -1 || !this.method3567()) {
			return;
		}
		@Pc(12) Class35 local12 = arg0.aClass35Array1[arg1];
		@Pc(15) Class1_Sub12 local15 = local12.aClass1_Sub12_1;
		@Pc(17) Class35 local17 = null;
		if (arg2 != null) {
			local17 = arg2.aClass35Array1[arg3];
			if (local17.aClass1_Sub12_1 != local15) {
				local17 = null;
			}
		}
		this.method3579(local15, local12, local17, arg4, arg5, null, false, arg6, 65535, null);
		this.method3557();
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()I")
	public abstract int method3553();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public abstract void method3554(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "()V")
	public abstract void method3555();

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "()V")
	public abstract void method3556();

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "()V")
	protected abstract void method3557();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
	protected abstract void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "()I")
	public abstract int method3560();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!vk;ILclient!vk;IIILclient!vk;ILclient!vk;III[ZZ)V")
	public final void method3561(@OriginalArg(0) Class1_Sub1_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub24 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method3552(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
		} else if (this.method3567()) {
			@Pc(27) Class35 local27 = arg0.aClass35Array1[arg1];
			@Pc(30) Class1_Sub12 local30 = local27.aClass1_Sub12_1;
			@Pc(32) Class35 local32 = null;
			if (arg2 != null) {
				local32 = arg2.aClass35Array1[arg3];
				if (local32.aClass1_Sub12_1 != local30) {
					local32 = null;
				}
			}
			@Pc(50) Class35 local50 = arg6.aClass35Array1[arg7];
			@Pc(52) Class35 local52 = null;
			if (arg8 != null) {
				local52 = arg8.aClass35Array1[arg9];
				if (local52.aClass1_Sub12_1 != local30) {
					local52 = null;
				}
			}
			this.method3579(local30, local27, local32, arg4, arg5, arg12, false, arg13, 65535, null);
			this.method3570(0, new int[0], 0, 0, 0, arg13);
			this.method3579(local30, local50, local52, arg10, arg11, arg12, true, arg13, 65535, null);
			this.method3557();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!vk;ILclient!vk;IIIIZ[I)V")
	public final void method3562(@OriginalArg(0) Class1_Sub1_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int[] arg8) {
		if (arg1 == -1 || !this.method3567()) {
			return;
		}
		@Pc(12) Class35 local12 = arg0.aClass35Array1[arg1];
		@Pc(15) Class1_Sub12 local15 = local12.aClass1_Sub12_1;
		@Pc(17) Class35 local17 = null;
		if (arg2 != null) {
			local17 = arg2.aClass35Array1[arg3];
			if (local17.aClass1_Sub12_1 != local15) {
				local17 = null;
			}
		}
		this.method3579(local15, local12, local17, arg4, arg5, null, false, arg7, arg6, arg8);
		this.method3557();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZZ)Lclient!hc;")
	public abstract Class22_Sub4 method3563(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "()I")
	public abstract int method3564();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public abstract void method3565(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "()I")
	public abstract int method3566();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "()Z")
	protected abstract boolean method3567();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ZZZ)Lclient!hc;")
	public abstract Class22_Sub4 method3568(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(ZZZ)Lclient!hc;")
	public abstract Class22_Sub4 method3569(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	public abstract void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIIIZ)V")
	protected abstract void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIJ)V")
	public abstract void method3571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6);

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "()I")
	public abstract int method3572();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!vk;I)V")
	public final void method3573(@OriginalArg(0) Class1_Sub1_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.method3567()) {
			return;
		}
		@Pc(12) Class35 local12 = arg0.aClass35Array1[arg1];
		@Pc(15) Class1_Sub12 local15 = local12.aClass1_Sub12_1;
		for (@Pc(17) int local17 = 0; local17 < local12.anInt834; local17++) {
			@Pc(26) short local26 = local12.aShortArray2[local17];
			if (local15.aBooleanArray29[local26]) {
				if (local12.aShortArray8[local17] != -1) {
					this.method3559(0, 0, 0, 0);
				}
				this.method3559(local15.anIntArray236[local26], local12.aShortArray10[local17], local12.aShortArray4[local17], local12.aShortArray1[local17]);
			}
		}
		this.method3557();
	}

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "()I")
	public abstract int method3574();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public abstract void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public abstract void method3576(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V")
	public abstract void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "()V")
	public abstract void method3578();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()I")
	public abstract int method4071();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ki;Lclient!dd;Lclient!dd;II[ZZZI[I)V")
	private void method3579(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt834; local5++) {
				@Pc(14) short local14 = arg1.aShortArray2[local5];
				if (arg5 == null || arg5[local14] == arg6 || arg0.anIntArray236[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray8[local5];
					@Pc(42) int local42;
					if (local32 != -1) {
						local42 = arg8 & arg0.anIntArray234[local32];
						if (local42 == 65535) {
							this.method3570(0, arg0.anIntArrayArray15[local32], 0, 0, 0, arg7);
						} else {
							this.method3558(0, arg0.anIntArrayArray15[local32], 0, 0, 0, arg7, local42, arg9);
						}
					}
					local42 = arg8 & arg0.anIntArray234[local14];
					if (local42 == 65535) {
						this.method3570(arg0.anIntArray236[local14], arg0.anIntArrayArray15[local14], arg1.aShortArray10[local5], arg1.aShortArray4[local5], arg1.aShortArray1[local5], arg7);
					} else {
						this.method3558(arg0.anIntArray236[local14], arg0.anIntArrayArray15[local14], arg1.aShortArray10[local5], arg1.aShortArray4[local5], arg1.aShortArray1[local5], arg7, local42, arg9);
					}
				}
			}
			return;
		}
		local5 = 0;
		@Pc(136) int local136 = 0;
		for (@Pc(138) int local138 = 0; local138 < arg0.anInt2841; local138++) {
			@Pc(144) boolean local144 = false;
			if (local5 < arg1.anInt834 && arg1.aShortArray2[local5] == local138) {
				local144 = true;
			}
			@Pc(158) boolean local158 = false;
			if (local136 < arg2.anInt834 && arg2.aShortArray2[local136] == local138) {
				local158 = true;
			}
			if (local144 || local158) {
				if (arg5 == null || arg5[local138] == arg6 || arg0.anIntArray236[local138] == 0) {
					@Pc(196) short local196 = 0;
					@Pc(201) int local201 = arg0.anIntArray236[local138];
					if (local201 == 3) {
						local196 = 128;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local144) {
						local213 = arg1.aShortArray10[local5];
						local218 = arg1.aShortArray4[local5];
						local223 = arg1.aShortArray1[local5];
						local228 = arg1.aShortArray8[local5];
						local233 = arg1.aByteArray7[local5];
						local5++;
					} else {
						local213 = local196;
						local218 = local196;
						local223 = local196;
						local228 = -1;
						local233 = 0;
					}
					@Pc(252) short local252;
					@Pc(257) short local257;
					@Pc(262) short local262;
					@Pc(267) short local267;
					@Pc(272) byte local272;
					if (local158) {
						local252 = arg2.aShortArray10[local136];
						local257 = arg2.aShortArray4[local136];
						local262 = arg2.aShortArray1[local136];
						local267 = arg2.aShortArray8[local136];
						local272 = arg2.aByteArray7[local136];
						local136++;
					} else {
						local252 = local196;
						local257 = local196;
						local262 = local196;
						local267 = -1;
						local272 = 0;
					}
					@Pc(294) int local294;
					@Pc(296) int local296;
					@Pc(298) int local298;
					@Pc(308) int local308;
					if ((local233 & 0x2) != 0 || (local272 & 0x1) != 0) {
						local294 = local213;
						local296 = local218;
						local298 = local223;
					} else if (local201 == 2) {
						local308 = local252 - local213 & 0x7FF;
						@Pc(314) int local314 = local257 - local218 & 0x7FF;
						@Pc(320) int local320 = local262 - local223 & 0x7FF;
						if (local308 >= 1024) {
							local308 -= 2048;
						}
						if (local314 >= 1024) {
							local314 -= 2048;
						}
						if (local320 >= 1024) {
							local320 -= 2048;
						}
						local294 = local213 + local308 * arg3 / arg4 & 0x7FF;
						local296 = local218 + local314 * arg3 / arg4 & 0x7FF;
						local298 = local223 + local320 * arg3 / arg4 & 0x7FF;
					} else if (local201 == 7) {
						local308 = local252 - local213 & 0x3F;
						if (local308 >= 32) {
							local308 -= 64;
						}
						local294 = local213 + local308 * arg3 / arg4 & 0x3F;
						local296 = local218 + (local257 - local218) * arg3 / arg4;
						local298 = local223 + (local262 - local223) * arg3 / arg4;
					} else {
						local294 = local213 + (local252 - local213) * arg3 / arg4;
						local296 = local218 + (local257 - local218) * arg3 / arg4;
						local298 = local223 + (local262 - local223) * arg3 / arg4;
					}
					if (local228 != -1) {
						local308 = arg8 & arg0.anIntArray234[local228];
						if (local308 == 65535) {
							this.method3570(0, arg0.anIntArrayArray15[local228], 0, 0, 0, arg7);
						} else {
							this.method3558(0, arg0.anIntArrayArray15[local228], 0, 0, 0, arg7, local308, arg9);
						}
					} else if (local267 != -1) {
						local308 = arg8 & arg0.anIntArray234[local267];
						if (local308 == 65535) {
							this.method3570(0, arg0.anIntArrayArray15[local267], 0, 0, 0, arg7);
						} else {
							this.method3558(0, arg0.anIntArrayArray15[local267], 0, 0, 0, arg7, local308, arg9);
						}
					}
					local308 = arg8 & arg0.anIntArray234[local138];
					if (local308 == 65535) {
						this.method3570(local201, arg0.anIntArrayArray15[local138], local294, local296, local298, arg7);
					} else {
						this.method3558(local201, arg0.anIntArrayArray15[local138], local294, local296, local298, arg7, local308, arg9);
					}
				} else {
					if (local144) {
						local5++;
					}
					if (local158) {
						local136++;
					}
				}
			}
		}
	}
}
