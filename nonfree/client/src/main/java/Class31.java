import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public abstract class Class31 {

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	protected Class31() {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public abstract void method1908(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "()Z")
	public abstract boolean method1909();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ok;I)V")
	public final void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1_Sub14 arg1) {
		if (arg0 == -1 || !this.method1925()) {
			return;
		}
		@Pc(17) Class157 local17 = arg1.aClass157Array1[arg0];
		@Pc(20) Class7_Sub42 local20 = local17.aClass7_Sub42_1;
		for (@Pc(27) int local27 = 0; local27 < local17.anInt4695; local27++) {
			@Pc(33) short local33 = local17.aShortArray100[local27];
			if (local20.aBooleanArray32[local33]) {
				if (local17.aShortArray95[local27] != -1) {
					this.method1936(0, 0, 0, 0);
				}
				this.method1936(local20.anIntArray845[local33], local17.aShortArray96[local27], local17.aShortArray97[local27], local17.aShortArray102[local27]);
			}
		}
		this.method1944();
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public abstract void method1911(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "()I")
	public abstract int method1912();

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
	public abstract void method1913(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!sj;IIIZ)V")
	public abstract void method1914(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
	public abstract void method1915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIZ)Lclient!sj;")
	public abstract Class31 method1917(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIILclient!sa;)V")
	protected final void method1918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class8 arg5) {
		@Pc(19) int local19 = -arg4 / 2;
		@Pc(24) int local24 = -arg3 / 2;
		@Pc(35) int local35 = arg5.method4169(arg0 + local19, arg1 - -local24);
		@Pc(39) int local39 = arg4 / 2;
		@Pc(44) int local44 = -arg3 / 2;
		@Pc(53) int local53 = arg5.method4169(arg0 + local39, local44 + arg1);
		@Pc(58) int local58 = -arg4 / 2;
		@Pc(62) int local62 = arg3 / 2;
		@Pc(71) int local71 = arg5.method4169(local58 + arg0, local62 + arg1);
		@Pc(75) int local75 = arg4 / 2;
		@Pc(79) int local79 = arg3 / 2;
		@Pc(89) int local89 = arg5.method4169(arg0 + local75, arg1 + local79);
		@Pc(100) int local100 = local35 < local53 ? local35 : local53;
		@Pc(107) int local107 = local71 < local89 ? local71 : local89;
		@Pc(118) int local118 = local53 < local89 ? local53 : local89;
		@Pc(125) int local125 = local71 <= local35 ? local71 : local35;
		if (arg3 != 0) {
			@Pc(144) int local144 = (int) (Math.atan2((double) (local100 - local107), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local144 != 0) {
				this.method1913(local144);
			}
		}
		if (arg4 != 0) {
			@Pc(168) int local168 = (int) (Math.atan2((double) (local125 - local118), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local168 != 0) {
				this.method1924(local168);
			}
		}
		@Pc(177) int local177 = local89 + local35;
		if (local71 + local53 < local177) {
			local177 = local71 + local53;
		}
		local177 = (local177 >> 1) - arg2;
		if (local177 != 0) {
			this.method1915(0, local177, 0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "()I")
	public abstract int method1919();

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "()I")
	public abstract int method1920();

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "()V")
	public abstract void method1921();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	public abstract void method1924(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "()Z")
	protected abstract boolean method1925();

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
	public abstract void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "()I")
	public abstract int method1927();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!mk;Lclient!mo;I)V")
	public abstract void method1928(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class36_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(SS)V")
	public abstract void method1929(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ug;)Lclient!ug;")
	public abstract Class7_Sub1_Sub4 method1930(@OriginalArg(0) Class7_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ok;IBLclient!ok;IIZI)V")
	public final void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class7_Sub1_Sub14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.method1925()) {
			return;
		}
		@Pc(16) Class157 local16 = arg1.aClass157Array1[arg5];
		@Pc(23) Class7_Sub42 local23 = local16.aClass7_Sub42_1;
		@Pc(25) Class157 local25 = null;
		if (arg3 != null) {
			local25 = arg3.aClass157Array1[arg4];
			if (local23 != local25.aClass7_Sub42_1) {
				local25 = null;
			}
		}
		this.method1951(null, null, false, arg0, local16, 65535, arg7, local23, arg6, local25, arg2);
		this.method1944();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!mk;Z)Z")
	public abstract boolean method1932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "()I")
	public abstract int method1933();

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
	public abstract void method1934(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "()I")
	public abstract int method1935();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V")
	protected abstract void method1936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "()I")
	public abstract int method1937();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!mk;Lclient!mo;II)V")
	public abstract void method1939(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class36_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(SS)V")
	public abstract void method1941(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "()[Lclient!ds;")
	public abstract Class57[] method1942();

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "()V")
	protected abstract void method1944();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ok;IILclient!ok;ZIII[II)V")
	public final void method1945(@OriginalArg(1) Class7_Sub1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7_Sub1_Sub14 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int arg8) {
		if (arg2 == -1 || !this.method1925()) {
			return;
		}
		@Pc(23) Class157 local23 = arg0.aClass157Array1[arg2];
		@Pc(26) Class7_Sub42 local26 = local23.aClass7_Sub42_1;
		@Pc(28) Class157 local28 = null;
		if (arg3 != null) {
			local28 = arg3.aClass157Array1[arg5];
			if (local28.aClass7_Sub42_1 != local26) {
				local28 = null;
			}
		}
		this.method1951(null, arg7, false, arg8, local23, arg6, 0, local26, arg4, local28, arg1);
		this.method1944();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZILclient!ok;ILclient!ok;[ZIIIIILclient!ok;ILclient!ok;)V")
	public final void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub1_Sub14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7_Sub1_Sub14 arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class7_Sub1_Sub14 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class7_Sub1_Sub14 arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg6 == null || arg0 == -1) {
			this.method1931(arg4, arg3, arg8, arg11, arg7, arg12, arg1, 0);
		} else if (this.method1925()) {
			@Pc(35) Class157 local35 = arg3.aClass157Array1[arg12];
			@Pc(38) Class7_Sub42 local38 = local35.aClass7_Sub42_1;
			@Pc(40) Class157 local40 = null;
			if (arg11 != null) {
				local40 = arg11.aClass157Array1[arg7];
				if (local40.aClass7_Sub42_1 != local38) {
					local40 = null;
				}
			}
			@Pc(66) Class157 local66 = arg13.aClass157Array1[arg0];
			@Pc(68) Class157 local68 = null;
			if (arg5 != null) {
				local68 = arg5.aClass157Array1[arg9];
				if (local38 != local68.aClass7_Sub42_1) {
					local68 = null;
				}
			}
			this.method1951(arg6, null, false, arg4, local35, 65535, 0, local38, arg1, local40, arg8);
			this.method1938(0, new int[0], 0, 0, 0, 0, arg1);
			this.method1951(arg6, null, true, arg2, local66, 65535, 0, local38, arg1, local68, arg10);
			this.method1944();
		}
	}

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "()I")
	public abstract int method1947();

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "()I")
	public abstract int method1948();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIII[IIIZBI)V")
	private void method1949(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(52) int local52;
		if (arg3 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local52 = -arg5;
				arg5 = arg1;
				arg1 = local52;
			} else if (arg8 == 3) {
				local52 = arg5;
				arg5 = arg1;
				arg1 = local52;
			} else if (arg8 == 2) {
				local52 = arg5;
				arg5 = -arg1 & 0x3FFF;
				arg1 = local52 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg1 = -arg1;
				arg5 = -arg5;
			} else if (arg8 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local52 = arg5;
				arg5 = -arg1;
				arg1 = local52;
			} else if (arg8 == 3) {
				local52 = arg5;
				arg5 = arg1;
				arg1 = local52;
			} else if (arg8 == 2) {
				local52 = arg5;
				arg5 = arg1 & 0x3FFF;
				arg1 = -local52 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method1938(arg8, arg0, arg5, arg6, arg1, arg3, arg7);
		} else {
			this.method1916(arg8, arg0, arg5, arg6, arg1, arg7, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([Z[IZILclient!oq;BIILclient!wi;ZLclient!oq;I)V")
	private void method1951(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class7_Sub42 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class157 arg9, @OriginalArg(11) int arg10) {
		if (arg9 == null || arg3 == 0) {
			for (@Pc(9) int local9 = 0; local9 < arg4.anInt4695; local9++) {
				@Pc(15) short local15 = arg4.aShortArray100[local9];
				if (arg0 == null || arg0[local15] == arg2 || arg7.anIntArray845[local15] == 0) {
					@Pc(40) short local40 = arg4.aShortArray95[local9];
					if (local40 != -1) {
						this.method1949(arg7.anIntArrayArray58[local40], 0, arg5 & arg7.anIntArray846[local40], arg6, arg1, 0, 0, arg8, 0);
					}
					this.method1949(arg7.anIntArrayArray58[local15], arg4.aShortArray102[local9], arg5 & arg7.anIntArray846[local15], arg6, arg1, arg4.aShortArray96[local9], arg4.aShortArray97[local9], arg8, arg7.anIntArray845[local15]);
				}
			}
			return;
		}
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		for (@Pc(120) int local120 = 0; local120 < arg7.anInt6643; local120++) {
			@Pc(123) boolean local123 = false;
			if (local116 < arg4.anInt4695 && local120 == arg4.aShortArray100[local116]) {
				local123 = true;
			}
			@Pc(141) boolean local141 = false;
			if (arg9.anInt4695 > local118 && local120 == arg9.aShortArray100[local118]) {
				local141 = true;
			}
			if (local123 || local141) {
				if (arg0 == null || arg2 == arg0[local120] || arg7.anIntArray845[local120] == 0) {
					@Pc(190) short local190 = 0;
					@Pc(195) int local195 = arg7.anIntArray845[local120];
					if (local195 == 3) {
						local190 = 128;
					}
					@Pc(212) short local212;
					@Pc(210) short local210;
					@Pc(208) short local208;
					@Pc(206) short local206;
					@Pc(204) byte local204;
					if (local123) {
						local208 = arg4.aShortArray102[local116];
						local204 = arg4.aByteArray70[local116];
						local210 = arg4.aShortArray97[local116];
						local212 = arg4.aShortArray96[local116];
						local206 = arg4.aShortArray95[local116];
						local116++;
					} else {
						local204 = 0;
						local206 = -1;
						local208 = local190;
						local210 = local190;
						local212 = local190;
					}
					@Pc(266) short local266;
					@Pc(246) short local246;
					@Pc(261) short local261;
					@Pc(256) short local256;
					@Pc(251) byte local251;
					if (local141) {
						local246 = arg9.aShortArray97[local118];
						local251 = arg9.aByteArray70[local118];
						local256 = arg9.aShortArray95[local118];
						local261 = arg9.aShortArray102[local118];
						local266 = arg9.aShortArray96[local118];
						local118++;
					} else {
						local261 = local190;
						local266 = local190;
						local256 = -1;
						local251 = 0;
						local246 = local190;
					}
					@Pc(291) int local291;
					@Pc(295) int local295;
					@Pc(293) int local293;
					if ((local204 & 0x2) == 0 && (local251 & 0x1) == 0) {
						@Pc(307) int local307;
						if (local195 == 2) {
							local307 = local266 - local212 & 0x3FFF;
							@Pc(314) int local314 = local246 - local210 & 0x3FFF;
							if (local314 >= 8192) {
								local314 -= 16384;
							}
							@Pc(327) int local327 = local261 - local208 & 0x3FFF;
							if (local307 >= 8192) {
								local307 -= 16384;
							}
							if (local327 >= 8192) {
								local327 -= 16384;
							}
							local291 = local212 + arg3 * local307 / arg10 & 0x3FFF;
							local295 = local314 * arg3 / arg10 + local210 & 0x3FFF;
							local293 = local208 + local327 * arg3 / arg10 & 0x3FFF;
						} else if (local195 == 7) {
							local307 = local266 - local212 & 0x3F;
							if (local307 >= 32) {
								local307 -= 64;
							}
							local293 = arg3 * (local261 - local208) / arg10 + local208;
							local291 = local212 + arg3 * local307 / arg10 & 0x3F;
							local295 = arg3 * (local246 - local210) / arg10 + local210;
						} else {
							local291 = local212 + arg3 * (local266 - local212) / arg10;
							local293 = (local261 - local208) * arg3 / arg10 + local208;
							local295 = arg3 * (local246 - local210) / arg10 + local210;
						}
					} else {
						local291 = local212;
						local293 = local208;
						local295 = local210;
					}
					if (local206 != -1) {
						this.method1949(arg7.anIntArrayArray58[local206], 0, arg7.anIntArray846[local206] & arg5, arg6, arg1, 0, 0, arg8, 0);
					} else if (local256 != -1) {
						this.method1949(arg7.anIntArrayArray58[local256], 0, arg7.anIntArray846[local256] & arg5, arg6, arg1, 0, 0, arg8, 0);
					}
					this.method1949(arg7.anIntArrayArray58[local120], local293, arg7.anIntArray846[local120] & arg5, arg6, arg1, local291, local295, arg8, local195);
				} else {
					if (local123) {
						local116++;
					}
					if (local141) {
						local118++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "()[Lclient!ae;")
	public abstract Class6[] method1952();

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
	public abstract void method1953(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "()V")
	public abstract void method1955();

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V")
	public abstract void method1956(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "()I")
	public abstract int method1957();
}
