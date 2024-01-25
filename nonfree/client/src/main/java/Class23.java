import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class23 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class23() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ro;Lclient!ro;ZIIIIIB)V")
	public final void method7065(@OriginalArg(0) Class6_Sub4_Sub15 arg0, @OriginalArg(1) Class6_Sub4_Sub15 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 == -1 || !this.Q()) {
			return;
		}
		@Pc(16) Class247 local16 = arg0.aClass247Array1[arg6];
		@Pc(25) Class6_Sub32 local25 = local16.aClass6_Sub32_1;
		@Pc(27) Class247 local27 = null;
		if (arg1 != null) {
			local27 = arg1.aClass247Array1[arg5];
			if (local27.aClass6_Sub32_1 != local25) {
				local27 = null;
			}
		}
		this.method7081(arg7, arg3, null, arg2, null, local27, local25, arg4, 65535, local16, false);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()Z")
	public abstract boolean method7066();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIIILclient!ro;Lclient!ro;IIIZ)V")
	public final void method7067(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class6_Sub4_Sub15 arg4, @OriginalArg(6) Class6_Sub4_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) boolean arg8) {
		if (arg2 == -1 || !this.Q()) {
			return;
		}
		@Pc(16) Class247 local16 = arg4.aClass247Array1[arg2];
		@Pc(19) Class6_Sub32 local19 = local16.aClass6_Sub32_1;
		@Pc(26) Class247 local26 = null;
		if (arg5 != null) {
			local26 = arg5.aClass247Array1[arg6];
			if (local19 != local26.aClass6_Sub32_1) {
				local26 = null;
			}
		}
		this.method7081(0, arg7, arg0, arg8, null, local26, local19, arg1, arg3, local16, false);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class23 method7068(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
	public abstract void method7069();

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method7070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Lclient!haa;")
	public abstract Class128[] method7071();

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method7072(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([III[IIIBIZI)V")
	private void method7074(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(16) int local16;
		if (arg6 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local16 = -arg4;
				arg4 = arg1;
				arg1 = local16;
			} else if (arg8 == 3) {
				local16 = arg4;
				arg4 = arg1;
				arg1 = local16;
			} else if (arg8 == 2) {
				local16 = arg4;
				arg4 = -arg1 & 0x3FFF;
				arg1 = local16 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg4 = -arg4;
				arg1 = -arg1;
			} else if (arg8 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local16 = arg4;
				arg4 = -arg1;
				arg1 = local16;
			} else if (arg8 == 3) {
				local16 = arg4;
				arg4 = arg1;
				arg1 = local16;
			} else if (arg8 == 2) {
				local16 = arg4;
				arg4 = arg1 & 0x3FFF;
				arg1 = -local16 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.E(arg8, arg3, arg4, arg2, arg1, arg6, arg7);
		} else {
			this.da(arg8, arg3, arg4, arg2, arg1, arg7, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!mr;II)V")
	public abstract void method7075(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class5_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII[ZLclient!ro;Lclient!ro;Lclient!ro;ILclient!ro;IZII)V")
	public final void method7076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) Class6_Sub4_Sub15 arg5, @OriginalArg(7) Class6_Sub4_Sub15 arg6, @OriginalArg(8) Class6_Sub4_Sub15 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6_Sub4_Sub15 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg8 == -1) {
			this.method7065(arg5, arg7, arg11, arg2, arg3, arg13, arg1, 0);
		} else if (this.Q()) {
			@Pc(34) Class247 local34 = arg5.aClass247Array1[arg1];
			@Pc(37) Class6_Sub32 local37 = local34.aClass6_Sub32_1;
			@Pc(39) Class247 local39 = null;
			if (arg7 != null) {
				local39 = arg7.aClass247Array1[arg13];
				if (local39.aClass6_Sub32_1 != local37) {
					local39 = null;
				}
			}
			this.method7081(0, arg2, null, arg11, arg4, local39, local37, arg3, 65535, local34, false);
			@Pc(71) Class247 local71 = arg6.aClass247Array1[arg8];
			@Pc(73) Class247 local73 = null;
			if (arg9 != null) {
				local73 = arg9.aClass247Array1[arg12];
				if (local73.aClass6_Sub32_1 != local37) {
					local73 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg11);
			this.method7081(0, arg10, null, arg11, arg4, local73, local71.aClass6_Sub32_1, arg0, 65535, local71, true);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!mr;I)V")
	public abstract void method7077(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class5_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7078(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class6_Sub4_Sub2 Z(@OriginalArg(0) Class6_Sub4_Sub2 arg0);

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ro;II)V")
	public final void method7079(@OriginalArg(0) Class6_Sub4_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.Q()) {
			return;
		}
		@Pc(19) Class247 local19 = arg0.aClass247Array1[arg1];
		@Pc(27) Class6_Sub32 local27 = local19.aClass6_Sub32_1;
		for (@Pc(29) int local29 = 0; local29 < local19.anInt7322; local29++) {
			@Pc(36) short local36 = local19.aShortArray85[local29];
			if (local27.aBooleanArray16[local36]) {
				if (local19.aShortArray88[local29] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local27.anIntArray331[local36], local19.aShortArray86[local29], local19.aShortArray87[local29], local19.aShortArray84[local29]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Lclient!dg;")
	public abstract Class69[] method7080();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[IZ[ZLclient!pf;Lclient!ju;IILclient!pf;IZ)V")
	private void method7081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) Class247 arg5, @OriginalArg(6) Class6_Sub32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class247 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		if (arg5 == null || arg7 == 0) {
			for (local11 = 0; local11 < arg9.anInt7322; local11++) {
				@Pc(18) short local18 = arg9.aShortArray85[local11];
				if (arg4 == null || arg4[local18] == arg10 || arg6.anIntArray331[local18] == 0) {
					@Pc(38) short local38 = arg9.aShortArray88[local11];
					if (local38 != -1) {
						this.method7074(arg2, 0, 0, arg6.anIntArrayArray36[local38], 0, arg8 & arg6.anIntArray332[local38], arg0, arg3, 0);
					}
					this.method7074(arg2, arg9.aShortArray84[local11], arg9.aShortArray87[local11], arg6.anIntArrayArray36[local18], arg9.aShortArray86[local11], arg6.anIntArray332[local18] & arg8, arg0, arg3, arg6.anIntArray331[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < arg6.anInt5218; local110++) {
			@Pc(114) boolean local114 = false;
			if (arg9.anInt7322 > local11 && local110 == arg9.aShortArray85[local11]) {
				local114 = true;
			}
			@Pc(132) boolean local132 = false;
			if (arg5.anInt7322 > local108 && arg5.aShortArray85[local108] == local110) {
				local132 = true;
			}
			if (local114 || local132) {
				if (arg4 == null || arg10 == arg4[local110] || arg6.anIntArray331[local110] == 0) {
					@Pc(181) short local181 = 0;
					@Pc(186) int local186 = arg6.anIntArray331[local110];
					if (local186 == 3 || local186 == 10) {
						local181 = 128;
					}
					@Pc(225) short local225;
					@Pc(210) short local210;
					@Pc(215) short local215;
					@Pc(220) short local220;
					@Pc(205) byte local205;
					if (local114) {
						local205 = arg9.aByteArray82[local11];
						local210 = arg9.aShortArray87[local11];
						local215 = arg9.aShortArray84[local11];
						local220 = arg9.aShortArray88[local11];
						local225 = arg9.aShortArray86[local11];
						local11++;
					} else {
						local220 = -1;
						local205 = 0;
						local210 = local181;
						local225 = local181;
						local215 = local181;
					}
					@Pc(265) short local265;
					@Pc(250) short local250;
					@Pc(255) short local255;
					@Pc(245) short local245;
					@Pc(260) byte local260;
					if (local132) {
						local245 = arg5.aShortArray88[local108];
						local250 = arg5.aShortArray87[local108];
						local255 = arg5.aShortArray84[local108];
						local260 = arg5.aByteArray82[local108];
						local265 = arg5.aShortArray86[local108];
						local108++;
					} else {
						local245 = -1;
						local255 = local181;
						local250 = local181;
						local265 = local181;
						local260 = 0;
					}
					@Pc(292) int local292;
					@Pc(290) int local290;
					@Pc(288) int local288;
					if ((local205 & 0x2) == 0 && (local260 & 0x1) == 0) {
						@Pc(307) int local307;
						if (local186 == 2) {
							local307 = local265 - local225 & 0x3FFF;
							@Pc(425) int local425 = local250 - local210 & 0x3FFF;
							if (local307 >= 8192) {
								local307 -= 16384;
							}
							@Pc(438) int local438 = local255 - local215 & 0x3FFF;
							if (local425 >= 8192) {
								local425 -= 16384;
							}
							local292 = local225 + local307 * arg7 / arg1 & 0x3FFF;
							local290 = local210 + arg7 * local425 / arg1 & 0x3FFF;
							if (local438 >= 8192) {
								local438 -= 16384;
							}
							local288 = local215 + local438 * arg7 / arg1 & 0x3FFF;
						} else if (local186 == 9) {
							local307 = local265 - local225 & 0x3FFF;
							if (local307 >= 8192) {
								local307 -= 16384;
							}
							local292 = local225 + local307 * arg7 / arg1 & 0x3FFF;
							local288 = 0;
							local290 = 0;
						} else if (local186 == 7) {
							local307 = local265 - local225 & 0x3F;
							if (local307 >= 32) {
								local307 -= 64;
							}
							local288 = arg7 * (local255 - local215) / arg1 + local215;
							local290 = local210 + (local250 - local210) * arg7 / arg1;
							local292 = local225 + arg7 * local307 / arg1 & 0x3F;
						} else {
							local288 = local215 + arg7 * (local255 - local215) / arg1;
							local292 = arg7 * (local265 - local225) / arg1 + local225;
							local290 = (local250 - local210) * arg7 / arg1 + local210;
						}
					} else {
						local288 = local215;
						local290 = local210;
						local292 = local225;
					}
					if (local220 != -1) {
						this.method7074(arg2, 0, 0, arg6.anIntArrayArray36[local220], 0, arg8 & arg6.anIntArray332[local220], arg0, arg3, 0);
					} else if (local245 != -1) {
						this.method7074(arg2, 0, 0, arg6.anIntArrayArray36[local245], 0, arg6.anIntArray332[local245] & arg8, arg0, arg3, 0);
					}
					this.method7074(arg2, local288, local290, arg6.anIntArrayArray36[local110], local292, arg6.anIntArray332[local110] & arg8, arg0, arg3, local186);
				} else {
					if (local114) {
						local11++;
					}
					if (local132) {
						local108++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!d;BIIIII)V")
	protected final void method7082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(30) int local30 = arg2.sa(local16 + arg4, arg1 + local21);
		@Pc(34) int local34 = arg5 / 2;
		@Pc(39) int local39 = -arg7 / 2;
		@Pc(48) int local48 = arg2.sa(arg4 + local34, arg1 + local39);
		@Pc(53) int local53 = -arg5 / 2;
		@Pc(57) int local57 = arg7 / 2;
		@Pc(67) int local67 = arg2.sa(local53 + arg4, arg1 - -local57);
		@Pc(71) int local71 = arg5 / 2;
		@Pc(75) int local75 = arg7 / 2;
		@Pc(85) int local85 = arg2.sa(arg4 + local71, local75 + arg1);
		@Pc(100) int local100 = local30 < local48 ? local30 : local48;
		@Pc(107) int local107 = local85 > local67 ? local67 : local85;
		@Pc(114) int local114 = local48 < local85 ? local48 : local85;
		@Pc(125) int local125 = local30 >= local67 ? local67 : local30;
		@Pc(172) int local172;
		if (arg7 != 0) {
			@Pc(144) int local144 = (int) (Math.atan2((double) (local100 - local107), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local144 != 0) {
				if (arg3 != 0) {
					if (local144 > 8192) {
						local172 = 16384 - arg3;
						if (local144 < local172) {
							local144 = local172;
						}
					} else if (arg3 < local144) {
						local144 = arg3;
					}
				}
				this.AA(local144);
			}
		}
		if (arg5 != 0) {
			@Pc(200) int local200 = (int) (Math.atan2((double) (local125 - local114), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local200 != 0) {
				if (arg6 != 0) {
					if (local200 > 8192) {
						local172 = 16384 - arg6;
						if (local172 > local200) {
							local200 = local172;
						}
					} else if (arg6 < local200) {
						local200 = arg6;
					}
				}
				this.v(local200);
			}
		}
		@Pc(239) int local239 = local30 + local85;
		if (local48 + local67 < local239) {
			local239 = local48 + local67;
		}
		local239 = (local239 >> 1) - arg0;
		if (local239 != 0) {
			this.m(0, local239, 0);
		}
	}
}
