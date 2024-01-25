import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public abstract class Class3 {

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	protected Class3() {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()I")
	public abstract int method1236();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(SS)V")
	public abstract void method1237(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method1238(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public abstract void method1239(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()[Lclient!ai;")
	public abstract Class6[] method1240();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public abstract void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!m;Lclient!oo;I)V")
	public abstract void method1242(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class32_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "()V")
	public abstract void method1243();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!m;Lclient!oo;II)V")
	public abstract void method1244(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class32_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "()I")
	public abstract int method1245();

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "()[Lclient!jo;")
	public abstract Class107[] method1246();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIILclient!np;ZILclient!np;B[I)V")
	public final void method1247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub4_Sub20 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) Class1_Sub4_Sub20 arg7, @OriginalArg(10) int[] arg8) {
		if (arg3 == -1 || !this.method1251()) {
			return;
		}
		@Pc(17) Class211 local17 = arg5.aClass211Array1[arg3];
		@Pc(20) Class1_Sub16 local20 = local17.aClass1_Sub16_1;
		@Pc(26) Class211 local26 = null;
		if (arg7 != null) {
			local26 = arg7.aClass211Array1[arg2];
			if (local26.aClass1_Sub16_1 != local20) {
				local26 = null;
			}
		}
		this.method1271(arg4, false, arg6, null, arg8, local20, arg1, 0, local26, local17, arg0);
		this.method1259();
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "()I")
	public abstract int method1248();

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public abstract void method1249(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "()I")
	public abstract int method1250();

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "()Z")
	protected abstract boolean method1251();

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	public abstract void method1252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	public abstract void method1253(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZLclient!np;)V")
	public final void method1254(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub4_Sub20 arg1) {
		if (arg0 == -1 || !this.method1251()) {
			return;
		}
		@Pc(18) Class211 local18 = arg1.aClass211Array1[arg0];
		@Pc(21) Class1_Sub16 local21 = local18.aClass1_Sub16_1;
		for (@Pc(27) int local27 = 0; local27 < local18.anInt6359; local27++) {
			@Pc(34) short local34 = local18.aShortArray108[local27];
			if (local21.aBooleanArray7[local34]) {
				if (local18.aShortArray107[local27] != -1) {
					this.method1257(0, 0, 0, 0);
				}
				this.method1257(local21.anIntArray134[local34], local18.aShortArray113[local27], local18.aShortArray112[local27], local18.aShortArray110[local27]);
			}
		}
		this.method1259();
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "()I")
	public abstract int method1255();

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "()I")
	public abstract int method1256();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
	protected abstract void method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!bi;IIIZ)V")
	public abstract void method1258(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "()V")
	protected abstract void method1259();

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(SS)V")
	public abstract void method1260(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIZ)Lclient!bi;")
	public abstract Class3 method1261(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "()Z")
	public abstract boolean method1262();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "()I")
	public abstract int method1264();

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "()V")
	public abstract void method1265();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ui;IIIBII)V")
	protected final void method1266(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg4 / 2;
		@Pc(27) int local27 = -arg5 / 2;
		@Pc(36) int local36 = arg0.method4433(local14 + arg2, local27 + arg3);
		@Pc(40) int local40 = arg4 / 2;
		@Pc(45) int local45 = -arg5 / 2;
		@Pc(54) int local54 = arg0.method4433(local40 + arg2, local45 + arg3);
		@Pc(59) int local59 = -arg4 / 2;
		@Pc(63) int local63 = arg5 / 2;
		@Pc(73) int local73 = arg0.method4433(arg2 + local59, arg3 + local63);
		@Pc(77) int local77 = arg4 / 2;
		@Pc(81) int local81 = arg5 / 2;
		@Pc(90) int local90 = arg0.method4433(local77 + arg2, local81 + arg3);
		@Pc(101) int local101 = local36 < local54 ? local36 : local54;
		@Pc(112) int local112 = local90 <= local73 ? local90 : local73;
		@Pc(123) int local123 = local90 <= local54 ? local90 : local54;
		if (arg5 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local101 - local112), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				this.method1239(local139);
			}
		}
		@Pc(155) int local155 = local73 <= local36 ? local73 : local36;
		@Pc(159) int local159 = local36 + local90;
		if (arg4 != 0) {
			@Pc(177) int local177 = (int) (Math.atan2((double) (local155 - local123), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local177 != 0) {
				this.method1253(local177);
			}
		}
		if (local54 + local73 < local159) {
			local159 = local54 + local73;
		}
		local159 = (local159 >> 1) - arg1;
		if (local159 != 0) {
			this.method1241(0, local159, 0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!ui;Lclient!ui;III)V")
	public abstract void method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	public abstract void method1268(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "()I")
	public abstract int method1269();

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	public abstract void method1270(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZZ[Z[ILclient!ed;IILclient!vb;Lclient!vb;I)V")
	private void method1271(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class1_Sub16 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class211 arg8, @OriginalArg(10) Class211 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg8 == null || arg6 == 0) {
			for (local11 = 0; local11 < arg9.anInt6359; local11++) {
				@Pc(18) short local18 = arg9.aShortArray108[local11];
				if (arg3 == null || arg3[local18] == arg1 || arg5.anIntArray134[local18] == 0) {
					@Pc(42) short local42 = arg9.aShortArray107[local11];
					if (local42 != -1) {
						this.method1280(arg2, 0, 0, arg5.anIntArrayArray17[local42], arg4, 0, 0, arg10 & arg5.anIntArray135[local42], arg7);
					}
					this.method1280(arg2, arg9.aShortArray112[local11], arg9.aShortArray110[local11], arg5.anIntArrayArray17[local18], arg4, arg9.aShortArray113[local11], arg5.anIntArray134[local18], arg5.anIntArray135[local18] & arg10, arg7);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(117) int local117 = 0;
		for (@Pc(119) int local119 = 0; local119 < arg5.anInt1604; local119++) {
			@Pc(123) boolean local123 = false;
			if (arg9.anInt6359 > local11 && local119 == arg9.aShortArray108[local11]) {
				local123 = true;
			}
			@Pc(141) boolean local141 = false;
			if (arg8.anInt6359 > local117 && arg8.aShortArray108[local117] == local119) {
				local141 = true;
			}
			if (local123 || local141) {
				if (arg3 == null || arg1 == arg3[local119] || arg5.anIntArray134[local119] == 0) {
					@Pc(194) short local194 = 0;
					@Pc(199) int local199 = arg5.anIntArray134[local119];
					if (local199 == 3) {
						local194 = 128;
					}
					@Pc(214) short local214;
					@Pc(212) short local212;
					@Pc(208) short local208;
					@Pc(216) short local216;
					@Pc(210) byte local210;
					if (local123) {
						local210 = arg9.aByteArray92[local11];
						local208 = arg9.aShortArray110[local11];
						local214 = arg9.aShortArray113[local11];
						local212 = arg9.aShortArray112[local11];
						local216 = arg9.aShortArray107[local11];
						local11++;
					} else {
						local208 = local194;
						local210 = 0;
						local212 = local194;
						local214 = local194;
						local216 = -1;
					}
					@Pc(271) short local271;
					@Pc(251) short local251;
					@Pc(256) short local256;
					@Pc(266) short local266;
					@Pc(261) byte local261;
					if (local141) {
						local251 = arg8.aShortArray112[local117];
						local256 = arg8.aShortArray110[local117];
						local261 = arg8.aByteArray92[local117];
						local266 = arg8.aShortArray107[local117];
						local271 = arg8.aShortArray113[local117];
						local117++;
					} else {
						local271 = local194;
						local256 = local194;
						local261 = 0;
						local266 = -1;
						local251 = local194;
					}
					@Pc(304) int local304;
					@Pc(302) int local302;
					@Pc(300) int local300;
					if ((local210 & 0x2) == 0 && (local261 & 0x1) == 0) {
						@Pc(316) int local316;
						if (local199 == 2) {
							local316 = local271 - local214 & 0x3FFF;
							@Pc(323) int local323 = local251 - local212 & 0x3FFF;
							@Pc(329) int local329 = local256 - local208 & 0x3FFF;
							if (local323 >= 8192) {
								local323 -= 16384;
							}
							if (local316 >= 8192) {
								local316 -= 16384;
							}
							local302 = arg6 * local323 / arg0 + local212 & 0x3FFF;
							if (local329 >= 8192) {
								local329 -= 16384;
							}
							local304 = local316 * arg6 / arg0 + local214 & 0x3FFF;
							local300 = arg6 * local329 / arg0 + local208 & 0x3FFF;
						} else if (local199 == 7) {
							local316 = local271 - local214 & 0x3F;
							if (local316 >= 32) {
								local316 -= 64;
							}
							local300 = local208 + (local256 - local208) * arg6 / arg0;
							local302 = (local251 - local212) * arg6 / arg0 + local212;
							local304 = local214 + arg6 * local316 / arg0 & 0x3F;
						} else {
							local302 = arg6 * (local251 - local212) / arg0 + local212;
							local304 = arg6 * (local271 - local214) / arg0 + local214;
							local300 = arg6 * (local256 - local208) / arg0 + local208;
						}
					} else {
						local300 = local208;
						local302 = local212;
						local304 = local214;
					}
					if (local216 != -1) {
						this.method1280(arg2, 0, 0, arg5.anIntArrayArray17[local216], arg4, 0, 0, arg10 & arg5.anIntArray135[local216], arg7);
					} else if (local266 != -1) {
						this.method1280(arg2, 0, 0, arg5.anIntArrayArray17[local266], arg4, 0, 0, arg5.anIntArray135[local266] & arg10, arg7);
					}
					this.method1280(arg2, local302, local300, arg5.anIntArrayArray17[local119], arg4, local304, local199, arg10 & arg5.anIntArray135[local119], arg7);
				} else {
					if (local141) {
						local117++;
					}
					if (local123) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
	public abstract void method1272(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
	public abstract void method1273(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "()I")
	public abstract int method1275();

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "()I")
	public abstract int method1276();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qh;)Lclient!qh;")
	public abstract Class1_Sub4_Sub4 method1277(@OriginalArg(0) Class1_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIIILclient!np;[ZILclient!np;Lclient!np;Lclient!np;IIIII)V")
	public final void method1278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub4_Sub20 arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(7) Class1_Sub4_Sub20 arg6, @OriginalArg(8) Class1_Sub4_Sub20 arg7, @OriginalArg(9) Class1_Sub4_Sub20 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg5 == null || arg10 == -1) {
			this.method1279(arg12, arg8, arg2, arg11, arg0, 0, arg13, arg4);
		} else if (this.method1251()) {
			@Pc(35) Class211 local35 = arg8.aClass211Array1[arg12];
			@Pc(38) Class1_Sub16 local38 = local35.aClass1_Sub16_1;
			@Pc(40) Class211 local40 = null;
			if (arg4 != null) {
				local40 = arg4.aClass211Array1[arg2];
				if (local38 != local40.aClass1_Sub16_1) {
					local40 = null;
				}
			}
			@Pc(58) Class211 local58 = arg7.aClass211Array1[arg10];
			@Pc(68) Class211 local68 = null;
			if (arg6 != null) {
				local68 = arg6.aClass211Array1[arg1];
				if (local38 != local68.aClass1_Sub16_1) {
					local68 = null;
				}
			}
			this.method1271(arg13, false, arg0, arg5, null, local38, arg11, 0, local40, local35, 65535);
			this.method1263(0, new int[0], 0, 0, 0, 0, arg0);
			this.method1271(arg9, true, arg0, arg5, null, local38, arg3, 0, local68, local58, 65535);
			this.method1259();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!np;IIIZIILclient!np;)V")
	public final void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub4_Sub20 arg7) {
		if (arg0 == -1 || !this.method1251()) {
			return;
		}
		@Pc(17) Class211 local17 = arg1.aClass211Array1[arg0];
		@Pc(20) Class1_Sub16 local20 = local17.aClass1_Sub16_1;
		@Pc(28) Class211 local28 = null;
		if (arg7 != null) {
			local28 = arg7.aClass211Array1[arg2];
			if (local20 != local28.aClass1_Sub16_1) {
				local28 = null;
			}
		}
		this.method1271(arg6, false, arg4, null, null, local20, arg3, arg5, local28, local17, 65535);
		this.method1259();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIBI[I[IIIII)V")
	private void method1280(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(57) int local57;
		if (arg8 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local57 = -arg5;
				arg5 = arg2;
				arg2 = local57;
			} else if (arg6 == 3) {
				local57 = arg5;
				arg5 = arg2;
				arg2 = local57;
			} else if (arg6 == 2) {
				local57 = arg5;
				arg5 = -arg2 & 0x3FFF;
				arg2 = local57 & 0x3FFF;
			}
		} else if (arg8 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg2 = -arg2;
				arg5 = -arg5;
			} else if (arg6 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg8 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local57 = arg5;
				arg5 = -arg2;
				arg2 = local57;
			} else if (arg6 == 3) {
				local57 = arg5;
				arg5 = arg2;
				arg2 = local57;
			} else if (arg6 == 2) {
				local57 = arg5;
				arg5 = arg2 & 0x3FFF;
				arg2 = -local57 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method1263(arg6, arg3, arg5, arg1, arg2, arg8, arg0);
		} else {
			this.method1238(arg6, arg3, arg5, arg1, arg2, arg0, arg7, arg4);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) boolean arg3);
}
