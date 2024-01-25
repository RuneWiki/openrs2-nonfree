import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public abstract class Class45 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
	public static final int[] anIntArray129 = new int[32];

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray129[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	protected Class45() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()[Lclient!jc;")
	public abstract Class101[] method1776();

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()I")
	public abstract int method1777();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!dr;IILclient!hi;[ZB[IIZIZLclient!hi;)V")
	private void method1779(@OriginalArg(0) Class14_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class84 arg10) {
		@Pc(11) int local11;
		if (arg10 == null || arg8 == 0) {
			for (local11 = 0; local11 < arg3.anInt2600; local11++) {
				@Pc(18) short local18 = arg3.aShortArray68[local11];
				if (arg4 == null || arg7 == arg4[local18] || arg0.anIntArray113[local18] == 0) {
					@Pc(43) short local43 = arg3.aShortArray71[local11];
					if (local43 != -1) {
						this.method1796(0, arg5, arg0.anIntArrayArray20[local43], 0, arg6 & arg0.anIntArray112[local43], arg1, 0, 0, arg9);
					}
					this.method1796(arg0.anIntArray113[local18], arg5, arg0.anIntArrayArray20[local18], arg3.aShortArray72[local11], arg0.anIntArray112[local18] & arg6, arg1, arg3.aShortArray70[local11], arg3.aShortArray65[local11], arg9);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(113) int local113 = 0;
		for (@Pc(115) int local115 = 0; local115 < arg0.anInt1540; local115++) {
			@Pc(119) boolean local119 = false;
			if (arg3.anInt2600 > local11 && arg3.aShortArray68[local11] == local115) {
				local119 = true;
			}
			@Pc(141) boolean local141 = false;
			if (local113 < arg10.anInt2600 && local115 == arg10.aShortArray68[local113]) {
				local141 = true;
			}
			if (local119 || local141) {
				if (arg4 == null || arg4[local115] == arg7 || arg0.anIntArray113[local115] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg0.anIntArray113[local115];
					if (local192 == 3) {
						local187 = 128;
					}
					@Pc(203) short local203;
					@Pc(205) short local205;
					@Pc(209) short local209;
					@Pc(207) short local207;
					@Pc(211) byte local211;
					if (local119) {
						local205 = arg3.aShortArray72[local11];
						local207 = arg3.aShortArray71[local11];
						local203 = arg3.aShortArray65[local11];
						local209 = arg3.aShortArray70[local11];
						local211 = arg3.aByteArray70[local11];
						local11++;
					} else {
						local203 = local187;
						local205 = local187;
						local207 = -1;
						local209 = local187;
						local211 = 0;
					}
					@Pc(247) short local247;
					@Pc(243) short local243;
					@Pc(251) short local251;
					@Pc(245) short local245;
					@Pc(249) byte local249;
					if (local141) {
						local243 = arg10.aShortArray72[local113];
						local251 = arg10.aShortArray70[local113];
						local245 = arg10.aShortArray71[local113];
						local247 = arg10.aShortArray65[local113];
						local249 = arg10.aByteArray70[local113];
						local113++;
					} else {
						local243 = local187;
						local245 = -1;
						local247 = local187;
						local249 = 0;
						local251 = local187;
					}
					if (local207 != -1) {
						this.method1796(0, arg5, arg0.anIntArrayArray20[local207], 0, arg0.anIntArray112[local207] & arg6, arg1, 0, 0, arg9);
					} else if (local245 != -1) {
						this.method1796(0, arg5, arg0.anIntArrayArray20[local245], 0, arg0.anIntArray112[local245] & arg6, arg1, 0, 0, arg9);
					}
					@Pc(347) int local347;
					@Pc(343) int local343;
					@Pc(345) int local345;
					if ((local211 & 0x2) == 0 && (local249 & 0x1) == 0) {
						@Pc(361) int local361;
						if (local192 == 2) {
							local361 = local247 - local203 & 0x3FFF;
							@Pc(368) int local368 = local243 - local205 & 0x3FFF;
							if (local361 >= 8192) {
								local361 -= 16384;
							}
							if (local368 >= 8192) {
								local368 -= 16384;
							}
							@Pc(385) int local385 = local251 - local209 & 0x3FFF;
							if (local385 >= 8192) {
								local385 -= 16384;
							}
							local343 = local368 * arg8 / arg2 + local205 & 0x3FFF;
							local347 = local361 * arg8 / arg2 + local203 & 0x3FFF;
							local345 = local209 + arg8 * local385 / arg2 & 0x3FFF;
						} else if (local192 == 7) {
							local361 = local247 - local203 & 0x3F;
							if (local361 >= 32) {
								local361 -= 64;
							}
							local343 = arg8 * (local243 - local205) / arg2 + local205;
							local345 = (local251 - local209) * arg8 / arg2 + local209;
							local347 = arg8 * local361 / arg2 + local203 & 0x3F;
						} else {
							local347 = (local247 - local203) * arg8 / arg2 + local203;
							local343 = local205 + (local243 - local205) * arg8 / arg2;
							local345 = arg8 * (local251 - local209) / arg2 + local209;
						}
					} else {
						local343 = local205;
						local345 = local209;
						local347 = local203;
					}
					this.method1796(local192, arg5, arg0.anIntArrayArray20[local115], local343, arg6 & arg0.anIntArray112[local115], arg1, local345, local347, arg9);
				} else {
					if (local141) {
						local113++;
					}
					if (local119) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public abstract void method1780(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
	public abstract int method1781();

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public abstract void method1782(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public abstract void method1784(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!om;I)V")
	public final void method1785(@OriginalArg(1) Class14_Sub2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method1786()) {
			return;
		}
		@Pc(23) Class84 local23 = arg0.aClass84Array1[arg1];
		@Pc(26) Class14_Sub9 local26 = local23.aClass14_Sub9_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt2600; local28++) {
			@Pc(35) short local35 = local23.aShortArray68[local28];
			if (local26.aBooleanArray3[local35]) {
				if (local23.aShortArray71[local28] != -1) {
					this.method1805(0, 0, 0, 0);
				}
				this.method1805(local26.anIntArray113[local35], local23.aShortArray65[local28], local23.aShortArray72[local28], local23.aShortArray70[local28]);
			}
		}
		this.method1814();
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()Z")
	protected abstract boolean method1786();

	@OriginalMember(owner = "client!id", name = "e", descriptor = "()[Lclient!kh;")
	public abstract Class115[] method1787();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public abstract void method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public abstract void method1789(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "f", descriptor = "()I")
	public abstract int method1791();

	@OriginalMember(owner = "client!id", name = "g", descriptor = "()I")
	public abstract int method1792();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BIZ)Lclient!id;")
	public abstract Class45 method1793(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!pg;Lclient!cd;I)V")
	public abstract void method1794(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!id", name = "h", descriptor = "()I")
	public abstract int method1795();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[I[IIIIIIIZ)V")
	private void method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(56) int local56;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local56 = -arg7;
				arg7 = arg6;
				arg6 = local56;
			} else if (arg0 == 3) {
				local56 = arg7;
				arg7 = arg6;
				arg6 = local56;
			} else if (arg0 == 2) {
				local56 = arg7;
				arg7 = -arg6 & 0x3FFF;
				arg6 = local56 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg6 = -arg6;
				arg7 = -arg7;
			} else if (arg0 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local56 = arg7;
				arg7 = -arg6;
				arg6 = local56;
			} else if (arg0 == 3) {
				local56 = arg7;
				arg7 = arg6;
				arg6 = local56;
			} else if (arg0 == 2) {
				local56 = arg7;
				arg7 = arg6 & 0x3FFF;
				arg6 = -local56 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method1811(arg0, arg2, arg7, arg3, arg6, arg5, arg8);
		} else {
			this.method1801(arg0, arg2, arg7, arg3, arg6, arg8, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	public abstract void method1797(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "i", descriptor = "()I")
	public abstract int method1798();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!pg;Lclient!cd;II)V")
	public abstract void method1799(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
	public abstract void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!as;)Lclient!as;")
	public abstract Class14_Sub2_Sub2 method1803(@OriginalArg(0) Class14_Sub2_Sub2 arg0);

	@OriginalMember(owner = "client!id", name = "j", descriptor = "()V")
	public abstract void method1804();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	protected abstract void method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!id", name = "k", descriptor = "()I")
	public abstract int method1806();

	@OriginalMember(owner = "client!id", name = "l", descriptor = "()V")
	public abstract void method1807();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III[IIILclient!om;ZLclient!om;II)V")
	public final void method1808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class14_Sub2_Sub15 arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class14_Sub2_Sub15 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1 || !this.method1786()) {
			return;
		}
		@Pc(18) Class84 local18 = arg6.aClass84Array1[arg1];
		@Pc(21) Class14_Sub9 local21 = local18.aClass14_Sub9_1;
		@Pc(23) Class84 local23 = null;
		if (arg4 != null) {
			local23 = arg4.aClass84Array1[arg7];
			if (local21 != local23.aClass14_Sub9_1) {
				local23 = null;
			}
		}
		this.method1779(local21, 0, arg0, local18, null, arg2, arg3, false, arg8, arg5, local23);
		this.method1814();
	}

	@OriginalMember(owner = "client!id", name = "m", descriptor = "()I")
	public abstract int method1809();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!lf;IIIIII)V")
	protected final void method1812(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = -arg5 / 2;
		@Pc(23) int local23 = -arg4 / 2;
		@Pc(32) int local32 = arg0.method3607(arg2 + local18, local23 + arg3);
		@Pc(36) int local36 = arg5 / 2;
		@Pc(41) int local41 = -arg4 / 2;
		@Pc(51) int local51 = arg0.method3607(local36 + arg2, arg3 - -local41);
		@Pc(56) int local56 = -arg5 / 2;
		@Pc(60) int local60 = arg4 / 2;
		@Pc(70) int local70 = arg0.method3607(arg2 + local56, local60 + arg3);
		@Pc(74) int local74 = arg5 / 2;
		@Pc(78) int local78 = arg4 / 2;
		@Pc(88) int local88 = arg0.method3607(arg2 + local74, local78 + arg3);
		@Pc(99) int local99 = local51 <= local32 ? local51 : local32;
		@Pc(106) int local106 = local88 > local70 ? local70 : local88;
		@Pc(117) int local117 = local51 < local88 ? local51 : local88;
		@Pc(124) int local124 = local70 <= local32 ? local70 : local32;
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local99 - local106), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local140 != 0) {
				this.method1818(local140);
			}
		}
		@Pc(153) int local153 = local32 + local88;
		if (arg5 != 0) {
			@Pc(172) int local172 = (int) (Math.atan2((double) (local124 - local117), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local172 != 0) {
				this.method1784(local172);
			}
		}
		if (local153 > local51 + local70) {
			local153 = local51 + local70;
		}
		local153 = (local153 >> 1) - arg1;
		if (local153 != 0) {
			this.method1788(0, local153, 0);
		}
	}

	@OriginalMember(owner = "client!id", name = "n", descriptor = "()I")
	public abstract int method1813();

	@OriginalMember(owner = "client!id", name = "o", descriptor = "()V")
	protected abstract void method1814();

	@OriginalMember(owner = "client!id", name = "p", descriptor = "()I")
	public abstract int method1815();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!id;IIIZ)V")
	public abstract void method1816(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!om;IZLclient!om;BIII)V")
	public final void method1817(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub2_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class14_Sub2_Sub15 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.method1786()) {
			return;
		}
		@Pc(17) Class84 local17 = arg1.aClass84Array1[arg5];
		@Pc(20) Class14_Sub9 local20 = local17.aClass14_Sub9_1;
		@Pc(22) Class84 local22 = null;
		if (arg4 != null) {
			local22 = arg4.aClass84Array1[arg6];
			if (local20 != local22.aClass14_Sub9_1) {
				local22 = null;
			}
		}
		this.method1779(local20, arg0, arg2, local17, null, null, 65535, false, arg7, arg3, local22);
		this.method1814();
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
	public abstract void method1818(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "q", descriptor = "()Z")
	public abstract boolean method1819();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIILclient!om;Lclient!om;Lclient!om;Lclient!om;[ZIIIII)V")
	public final void method1820(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class14_Sub2_Sub15 arg4, @OriginalArg(6) Class14_Sub2_Sub15 arg5, @OriginalArg(7) Class14_Sub2_Sub15 arg6, @OriginalArg(8) Class14_Sub2_Sub15 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg8 == null || arg2 == -1) {
			this.method1817(0, arg6, arg11, arg0, arg4, arg9, arg1, arg10);
		} else if (this.method1786()) {
			@Pc(35) Class84 local35 = arg6.aClass84Array1[arg9];
			@Pc(38) Class14_Sub9 local38 = local35.aClass14_Sub9_1;
			@Pc(40) Class84 local40 = null;
			if (arg4 != null) {
				local40 = arg4.aClass84Array1[arg1];
				if (local40.aClass14_Sub9_1 != local38) {
					local40 = null;
				}
			}
			@Pc(66) Class84 local66 = arg5.aClass84Array1[arg2];
			@Pc(68) Class84 local68 = null;
			if (arg7 != null) {
				local68 = arg7.aClass84Array1[arg3];
				if (local38 != local68.aClass14_Sub9_1) {
					local68 = null;
				}
			}
			this.method1779(local38, 0, arg11, local35, arg8, null, 65535, false, arg10, arg0, local40);
			this.method1811(0, new int[0], 0, 0, 0, 0, arg0);
			this.method1779(local38, 0, arg12, local66, arg8, null, 65535, true, arg13, arg0, local68);
			this.method1814();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(SS)V")
	public abstract void method1821(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
	public abstract void method1822(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!pg;Z)Z")
	public abstract boolean method1823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(SS)V")
	public abstract void method1824(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!lf;Lclient!lf;III)V")
	public abstract void method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) Class114 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
