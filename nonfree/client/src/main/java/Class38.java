import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public abstract class Class38 {

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	protected Class38() {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	public abstract void method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
	protected abstract void method1884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(SS)V")
	public abstract void method1886(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!rg;Lclient!rg;BIIZI)V")
	public final void method1887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub15 arg2, @OriginalArg(3) Class4_Sub4_Sub15 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.method1916()) {
			return;
		}
		@Pc(20) Class200 local20 = arg2.aClass200Array1[arg7];
		@Pc(23) Class4_Sub41 local23 = local20.aClass4_Sub41_1;
		@Pc(25) Class200 local25 = null;
		if (arg3 != null) {
			local25 = arg3.aClass200Array1[arg1];
			if (local25.aClass4_Sub41_1 != local23) {
				local25 = null;
			}
		}
		this.method1911(arg0, 65535, local20, local23, local25, null, arg6, arg4, false, arg5, null);
		this.method1902();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "()I")
	public abstract int method1888();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILclient!rg;Lclient!rg;[ZLclient!rg;IILclient!rg;IIIIZ)V")
	public final void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub4_Sub15 arg3, @OriginalArg(4) Class4_Sub4_Sub15 arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) Class4_Sub4_Sub15 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4_Sub4_Sub15 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg5 == null || arg0 == -1) {
			this.method1887(0, arg9, arg3, arg4, arg10, arg12, arg13, arg2);
		} else if (this.method1916()) {
			@Pc(35) Class200 local35 = arg3.aClass200Array1[arg2];
			@Pc(38) Class4_Sub41 local38 = local35.aClass4_Sub41_1;
			@Pc(40) Class200 local40 = null;
			if (arg4 != null) {
				local40 = arg4.aClass200Array1[arg9];
				if (local40.aClass4_Sub41_1 != local38) {
					local40 = null;
				}
			}
			@Pc(63) Class200 local63 = arg8.aClass200Array1[arg0];
			@Pc(65) Class200 local65 = null;
			if (arg6 != null) {
				local65 = arg6.aClass200Array1[arg7];
				if (local38 != local65.aClass4_Sub41_1) {
					local65 = null;
				}
			}
			this.method1911(0, 65535, local35, local38, local40, null, arg13, arg10, false, arg12, arg5);
			this.method1895(0, new int[0], 0, 0, 0, 0, arg13);
			this.method1911(0, 65535, local63, local38, local65, null, arg13, arg1, true, arg11, arg5);
			this.method1902();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public abstract void method1890(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIZI[II[IZI)V")
	private void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(19) int local19;
		if (arg8 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local19 = -arg6;
				arg6 = arg1;
				arg1 = local19;
			} else if (arg4 == 3) {
				local19 = arg6;
				arg6 = arg1;
				arg1 = local19;
			} else if (arg4 == 2) {
				local19 = arg6;
				arg6 = -arg1 & 0x3FFF;
				arg1 = local19 & 0x3FFF;
			}
		} else if (arg8 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg1 = -arg1;
				arg6 = -arg6;
			} else if (arg4 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg8 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local19 = arg6;
				arg6 = -arg1;
				arg1 = local19;
			} else if (arg4 == 3) {
				local19 = arg6;
				arg6 = arg1;
				arg1 = local19;
			} else if (arg4 == 2) {
				local19 = arg6;
				arg6 = arg1 & 0x3FFF;
				arg1 = -local19 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method1895(arg4, arg5, arg6, arg2, arg1, arg8, arg3);
		} else {
			this.method1885(arg4, arg5, arg6, arg2, arg1, arg3, arg0, arg7);
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
	public abstract int method1892();

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	public abstract void method1893(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "()I")
	public abstract int method1894();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
	public abstract void method1896();

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	public abstract void method1897(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "()I")
	public abstract int method1898();

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
	public abstract void method1899(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ni;IIIZ)V")
	public abstract void method1900(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "()[Lclient!rl;")
	public abstract Class175[] method1901();

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "()V")
	protected abstract void method1902();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLclient!rg;ILclient!rg;II[IIII)V")
	public final void method1903(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub4_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub4_Sub15 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg2 == -1 || !this.method1916()) {
			return;
		}
		@Pc(16) Class200 local16 = arg3.aClass200Array1[arg2];
		@Pc(19) Class4_Sub41 local19 = local16.aClass4_Sub41_1;
		@Pc(21) Class200 local21 = null;
		if (arg1 != null) {
			local21 = arg1.aClass200Array1[arg4];
			if (local21.aClass4_Sub41_1 != local19) {
				local21 = null;
			}
		}
		this.method1911(0, arg7, local16, local19, local21, arg6, arg0, arg8, false, arg5, null);
		this.method1902();
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(SS)V")
	public abstract void method1904(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!s;Z)Z")
	public abstract boolean method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "()I")
	public abstract int method1906();

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "()I")
	public abstract int method1907();

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "()I")
	public abstract int method1908();

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "()I")
	public abstract int method1909();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!uh;Lclient!uh;III)V")
	public abstract void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class60 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILclient!ui;Lclient!ud;Lclient!ui;[IZIZI[Z)V")
	private void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) Class4_Sub41 arg3, @OriginalArg(5) Class200 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(11) int local11;
		if (arg4 == null || arg9 == 0) {
			for (local11 = 0; local11 < arg2.anInt6206; local11++) {
				@Pc(18) short local18 = arg2.aShortArray100[local11];
				if (arg10 == null || arg8 == arg10[local18] || arg3.anIntArray481[local18] == 0) {
					@Pc(42) short local42 = arg2.aShortArray98[local11];
					if (local42 != -1) {
						this.method1891(arg3.anIntArray480[local42] & arg1, 0, 0, arg6, 0, arg3.anIntArrayArray172[local42], 0, arg5, arg0);
					}
					this.method1891(arg1 & arg3.anIntArray480[local18], arg2.aShortArray101[local11], arg2.aShortArray99[local11], arg6, arg3.anIntArray481[local18], arg3.anIntArrayArray172[local18], arg2.aShortArray97[local11], arg5, arg0);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < arg3.anInt6171; local110++) {
			@Pc(128) boolean local128 = false;
			if (arg2.anInt6206 > local11 && local110 == arg2.aShortArray100[local11]) {
				local128 = true;
			}
			@Pc(146) boolean local146 = false;
			if (arg4.anInt6206 > local108 && local110 == arg4.aShortArray100[local108]) {
				local146 = true;
			}
			if (local128 || local146) {
				if (arg10 == null || arg8 == arg10[local110] || arg3.anIntArray481[local110] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg3.anIntArray481[local110];
					if (local192 == 3) {
						local187 = 128;
					}
					@Pc(209) short local209;
					@Pc(219) short local219;
					@Pc(204) short local204;
					@Pc(214) short local214;
					@Pc(224) byte local224;
					if (local128) {
						local204 = arg2.aShortArray101[local11];
						local209 = arg2.aShortArray97[local11];
						local214 = arg2.aShortArray98[local11];
						local219 = arg2.aShortArray99[local11];
						local224 = arg2.aByteArray83[local11];
						local11++;
					} else {
						local204 = local187;
						local214 = -1;
						local224 = 0;
						local219 = local187;
						local209 = local187;
					}
					@Pc(249) short local249;
					@Pc(244) short local244;
					@Pc(254) short local254;
					@Pc(259) short local259;
					@Pc(264) byte local264;
					if (local146) {
						local244 = arg4.aShortArray99[local108];
						local249 = arg4.aShortArray97[local108];
						local254 = arg4.aShortArray101[local108];
						local259 = arg4.aShortArray98[local108];
						local264 = arg4.aByteArray83[local108];
						local108++;
					} else {
						local249 = local187;
						local264 = 0;
						local244 = local187;
						local254 = local187;
						local259 = -1;
					}
					@Pc(297) int local297;
					@Pc(295) int local295;
					@Pc(293) int local293;
					if ((local224 & 0x2) == 0 && (local264 & 0x1) == 0) {
						@Pc(311) int local311;
						if (local192 == 2) {
							local311 = local249 - local209 & 0x3FFF;
							@Pc(317) int local317 = local244 - local219 & 0x3FFF;
							if (local311 >= 8192) {
								local311 -= 16384;
							}
							@Pc(330) int local330 = local254 - local204 & 0x3FFF;
							if (local317 >= 8192) {
								local317 -= 16384;
							}
							local295 = local219 + arg9 * local317 / arg7 & 0x3FFF;
							local297 = local209 + arg9 * local311 / arg7 & 0x3FFF;
							if (local330 >= 8192) {
								local330 -= 16384;
							}
							local293 = arg9 * local330 / arg7 + local204 & 0x3FFF;
						} else if (local192 == 7) {
							local311 = local249 - local209 & 0x3F;
							if (local311 >= 32) {
								local311 -= 64;
							}
							local297 = local209 + local311 * arg9 / arg7 & 0x3F;
							local295 = local219 + arg9 * (local244 - local219) / arg7;
							local293 = local204 + (local254 - local204) * arg9 / arg7;
						} else {
							local295 = local219 + (local244 - local219) * arg9 / arg7;
							local293 = local204 + arg9 * (local254 - local204) / arg7;
							local297 = local209 + (local249 - local209) * arg9 / arg7;
						}
					} else {
						local293 = local204;
						local295 = local219;
						local297 = local209;
					}
					if (local214 != -1) {
						this.method1891(arg1 & arg3.anIntArray480[local214], 0, 0, arg6, 0, arg3.anIntArrayArray172[local214], 0, arg5, arg0);
					} else if (local259 != -1) {
						this.method1891(arg3.anIntArray480[local259] & arg1, 0, 0, arg6, 0, arg3.anIntArrayArray172[local259], 0, arg5, arg0);
					}
					this.method1891(arg3.anIntArray480[local110] & arg1, local293, local295, arg6, local192, arg3.anIntArrayArray172[local110], local297, arg5, arg0);
				} else {
					if (local146) {
						local108++;
					}
					if (local128) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "()Z")
	public abstract boolean method1912();

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
	public abstract void method1913(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!o;)Lclient!o;")
	public abstract Class4_Sub4_Sub4 method1914(@OriginalArg(0) Class4_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIZ)Lclient!ni;")
	public abstract Class38 method1915(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "()Z")
	protected abstract boolean method1916();

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "()[Lclient!hq;")
	public abstract Class89[] method1917();

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "()I")
	public abstract int method1918();

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)V")
	public abstract void method1919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!s;Lclient!rh;II)V")
	public abstract void method1920(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "()I")
	public abstract int method1921();

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
	public abstract void method1922(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!rg;II)V")
	public final void method1923(@OriginalArg(0) Class4_Sub4_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method1916()) {
			return;
		}
		@Pc(25) Class200 local25 = arg0.aClass200Array1[arg1];
		@Pc(28) Class4_Sub41 local28 = local25.aClass4_Sub41_1;
		for (@Pc(30) int local30 = 0; local30 < local25.anInt6206; local30++) {
			@Pc(37) short local37 = local25.aShortArray100[local30];
			if (local28.aBooleanArray28[local37]) {
				if (local25.aShortArray98[local30] != -1) {
					this.method1884(0, 0, 0, 0);
				}
				this.method1884(local28.anIntArray481[local37], local25.aShortArray97[local30], local25.aShortArray99[local30], local25.aShortArray101[local30]);
			}
		}
		this.method1902();
	}

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "()V")
	public abstract void method1924();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!s;Lclient!rh;I)V")
	public abstract void method1925(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!uh;IIIII)V")
	protected final void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg5 / 2;
		@Pc(19) int local19 = -arg4 / 2;
		@Pc(28) int local28 = arg1.method2270(local14 + arg3, arg2 + local19);
		@Pc(32) int local32 = arg5 / 2;
		@Pc(37) int local37 = -arg4 / 2;
		@Pc(46) int local46 = arg1.method2270(local32 + arg3, local37 + arg2);
		@Pc(57) int local57 = -arg5 / 2;
		@Pc(61) int local61 = arg4 / 2;
		@Pc(71) int local71 = arg1.method2270(local57 + arg3, arg2 - -local61);
		@Pc(75) int local75 = arg5 / 2;
		@Pc(79) int local79 = arg4 / 2;
		@Pc(88) int local88 = arg1.method2270(arg3 + local75, arg2 + local79);
		@Pc(99) int local99 = local28 < local46 ? local28 : local46;
		@Pc(110) int local110 = local71 >= local88 ? local88 : local71;
		@Pc(121) int local121 = local46 >= local88 ? local88 : local46;
		@Pc(132) int local132 = local28 < local71 ? local28 : local71;
		if (arg4 != 0) {
			@Pc(151) int local151 = (int) (Math.atan2((double) (local99 - local110), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local151 != 0) {
				this.method1913(local151);
			}
		}
		@Pc(160) int local160 = local28 + local88;
		if (arg5 != 0) {
			@Pc(178) int local178 = (int) (Math.atan2((double) (local132 - local121), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local178 != 0) {
				this.method1897(local178);
			}
		}
		if (local71 + local46 < local160) {
			local160 = local71 + local46;
		}
		local160 = (local160 >> 1) - arg0;
		if (local160 != 0) {
			this.method1883(0, local160, 0);
		}
	}

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V")
	public abstract void method1928(@OriginalArg(0) int arg0);
}
