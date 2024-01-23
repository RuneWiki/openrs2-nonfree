import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public abstract class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
	protected abstract void method3139();

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
	public abstract void method3140();

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
	public abstract void method3141();

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "()I")
	public abstract int method3142();

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "()Z")
	protected abstract boolean method3143();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public abstract void method3144(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ai;Lclient!kd;Lclient!kd;II[ZZZI[I)V")
	private void method3145(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt2800; local5++) {
				@Pc(14) short local14 = arg1.aShortArray29[local5];
				if (arg5 == null || arg5[local14] == arg6 || arg0.anIntArray13[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray32[local5];
					@Pc(42) int local42;
					if (local32 != -1) {
						local42 = arg8 & arg0.anIntArray12[local32];
						if (local42 == 65535) {
							this.method3161(0, arg0.anIntArrayArray3[local32], 0, 0, 0, arg7);
						} else {
							this.method3159(0, arg0.anIntArrayArray3[local32], 0, 0, 0, arg7, local42, arg9);
						}
					}
					local42 = arg8 & arg0.anIntArray12[local14];
					if (local42 == 65535) {
						this.method3161(arg0.anIntArray13[local14], arg0.anIntArrayArray3[local14], arg1.aShortArray28[local5], arg1.aShortArray27[local5], arg1.aShortArray24[local5], arg7);
					} else {
						this.method3159(arg0.anIntArray13[local14], arg0.anIntArrayArray3[local14], arg1.aShortArray28[local5], arg1.aShortArray27[local5], arg1.aShortArray24[local5], arg7, local42, arg9);
					}
				}
			}
			return;
		}
		local5 = 0;
		@Pc(136) int local136 = 0;
		for (@Pc(138) int local138 = 0; local138 < arg0.anInt160; local138++) {
			@Pc(144) boolean local144 = false;
			if (local5 < arg1.anInt2800 && arg1.aShortArray29[local5] == local138) {
				local144 = true;
			}
			@Pc(158) boolean local158 = false;
			if (local136 < arg2.anInt2800 && arg2.aShortArray29[local136] == local138) {
				local158 = true;
			}
			if (local144 || local158) {
				if (arg5 == null || arg5[local138] == arg6 || arg0.anIntArray13[local138] == 0) {
					@Pc(196) short local196 = 0;
					@Pc(201) int local201 = arg0.anIntArray13[local138];
					if (local201 == 3) {
						local196 = 128;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local144) {
						local213 = arg1.aShortArray28[local5];
						local218 = arg1.aShortArray27[local5];
						local223 = arg1.aShortArray24[local5];
						local228 = arg1.aShortArray32[local5];
						local233 = arg1.aByteArray35[local5];
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
						local252 = arg2.aShortArray28[local136];
						local257 = arg2.aShortArray27[local136];
						local262 = arg2.aShortArray24[local136];
						local267 = arg2.aShortArray32[local136];
						local272 = arg2.aByteArray35[local136];
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
						local308 = arg8 & arg0.anIntArray12[local228];
						if (local308 == 65535) {
							this.method3161(0, arg0.anIntArrayArray3[local228], 0, 0, 0, arg7);
						} else {
							this.method3159(0, arg0.anIntArrayArray3[local228], 0, 0, 0, arg7, local308, arg9);
						}
					} else if (local267 != -1) {
						local308 = arg8 & arg0.anIntArray12[local267];
						if (local308 == 65535) {
							this.method3161(0, arg0.anIntArrayArray3[local267], 0, 0, 0, arg7);
						} else {
							this.method3159(0, arg0.anIntArrayArray3[local267], 0, 0, 0, arg7, local308, arg9);
						}
					}
					local308 = arg8 & arg0.anIntArray12[local138];
					if (local308 == 65535) {
						this.method3161(local201, arg0.anIntArrayArray3[local138], local294, local296, local298, arg7);
					} else {
						this.method3159(local201, arg0.anIntArrayArray3[local138], local294, local296, local298, arg7, local308, arg9);
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

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
	public abstract int method3355();

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "()I")
	public abstract int method3146();

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "()I")
	public abstract int method3147();

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "()I")
	public abstract int method3148();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!sf;ILclient!sf;IIIIZ[I)V")
	public final void method3150(@OriginalArg(0) Class4_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub2_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int[] arg8) {
		if (arg1 == -1 || !this.method3143()) {
			return;
		}
		@Pc(12) Class88 local12 = arg0.aClass88Array1[arg1];
		@Pc(15) Class4_Sub3 local15 = local12.aClass4_Sub3_1;
		@Pc(17) Class88 local17 = null;
		if (arg2 != null) {
			local17 = arg2.aClass88Array1[arg3];
			if (local17.aClass4_Sub3_1 != local15) {
				local17 = null;
			}
		}
		this.method3145(local15, local12, local17, arg4, arg5, null, false, arg7, arg6, arg8);
		this.method3139();
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V")
	public abstract void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!sf;ILclient!sf;IIILclient!sf;ILclient!sf;III[ZZ)V")
	public final void method3152(@OriginalArg(0) Class4_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub2_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub2_Sub19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub2_Sub19 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method3166(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
		} else if (this.method3143()) {
			@Pc(27) Class88 local27 = arg0.aClass88Array1[arg1];
			@Pc(30) Class4_Sub3 local30 = local27.aClass4_Sub3_1;
			@Pc(32) Class88 local32 = null;
			if (arg2 != null) {
				local32 = arg2.aClass88Array1[arg3];
				if (local32.aClass4_Sub3_1 != local30) {
					local32 = null;
				}
			}
			@Pc(50) Class88 local50 = arg6.aClass88Array1[arg7];
			@Pc(52) Class88 local52 = null;
			if (arg8 != null) {
				local52 = arg8.aClass88Array1[arg9];
				if (local52.aClass4_Sub3_1 != local30) {
					local52 = null;
				}
			}
			this.method3145(local30, local27, local32, arg4, arg5, arg12, false, arg13, 65535, null);
			this.method3161(0, new int[0], 0, 0, 0, arg13);
			this.method3145(local30, local50, local52, arg10, arg11, arg12, true, arg13, 65535, null);
			this.method3139();
		}
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "()I")
	public abstract int method3153();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZZ)Lclient!uc;")
	public abstract Class12_Sub2 method3154(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(III)V")
	public abstract void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(ZZZ)Lclient!uc;")
	public abstract Class12_Sub2 method3156(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	protected abstract void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public abstract void method3158(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "()I")
	public abstract int method3160();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIZ)V")
	protected abstract void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	public abstract void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10);

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public abstract void method3162(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIJ)V")
	public abstract void method3163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6);

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "()V")
	public abstract void method3164();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!sf;I)V")
	public final void method3165(@OriginalArg(0) Class4_Sub2_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.method3143()) {
			return;
		}
		@Pc(12) Class88 local12 = arg0.aClass88Array1[arg1];
		@Pc(15) Class4_Sub3 local15 = local12.aClass4_Sub3_1;
		for (@Pc(17) int local17 = 0; local17 < local12.anInt2800; local17++) {
			@Pc(26) short local26 = local12.aShortArray29[local17];
			if (local15.aBooleanArray1[local26]) {
				if (local12.aShortArray32[local17] != -1) {
					this.method3157(0, 0, 0, 0);
				}
				this.method3157(local15.anIntArray13[local26], local12.aShortArray28[local17], local12.aShortArray27[local17], local12.aShortArray24[local17]);
			}
		}
		this.method3139();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!sf;ILclient!sf;IIIZ)V")
	public final void method3166(@OriginalArg(0) Class4_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub2_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg1 == -1 || !this.method3143()) {
			return;
		}
		@Pc(12) Class88 local12 = arg0.aClass88Array1[arg1];
		@Pc(15) Class4_Sub3 local15 = local12.aClass4_Sub3_1;
		@Pc(17) Class88 local17 = null;
		if (arg2 != null) {
			local17 = arg2.aClass88Array1[arg3];
			if (local17.aClass4_Sub3_1 != local15) {
				local17 = null;
			}
		}
		this.method3145(local15, local12, local17, arg4, arg5, null, false, arg6, 65535, null);
		this.method3139();
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(ZZZ)Lclient!uc;")
	public abstract Class12_Sub2 method3167(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([[IIIIII)V")
	protected final void method3168(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static310.method3149(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static310.method3149(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static310.method3149(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static310.method3149(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method3158(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method3162(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method3155(0, local149, 0);
		}
	}
}
