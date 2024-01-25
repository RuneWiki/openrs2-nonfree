import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class26 {

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class26() {
	}

	@OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
	public abstract int ga();

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
	protected abstract void MA();

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lclient!r;")
	public abstract Class26 method7992(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int e();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!sa;IIIIIII)V")
	protected final void method7993(@OriginalArg(0) int arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg4 / 2;
		@Pc(30) int local30 = arg1.aa(arg3 + local16, local21 + arg5);
		@Pc(34) int local34 = arg7 / 2;
		@Pc(39) int local39 = -arg4 / 2;
		@Pc(50) int local50 = arg1.aa(arg3 + local34, arg5 - -local39);
		@Pc(55) int local55 = -arg7 / 2;
		@Pc(59) int local59 = arg4 / 2;
		@Pc(69) int local69 = arg1.aa(local55 + arg3, arg5 - -local59);
		@Pc(73) int local73 = arg7 / 2;
		@Pc(77) int local77 = arg4 / 2;
		@Pc(86) int local86 = arg1.aa(local73 + arg3, arg5 + local77);
		@Pc(93) int local93 = local30 < local50 ? local30 : local50;
		@Pc(104) int local104 = local86 <= local69 ? local86 : local69;
		@Pc(111) int local111 = local86 <= local50 ? local86 : local50;
		@Pc(160) int local160;
		if (arg4 != 0) {
			@Pc(129) int local129 = (int) (Math.atan2((double) (local93 - local104), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local129 != 0) {
				if (arg2 != 0) {
					if (local129 > 8192) {
						local160 = 16384 - arg2;
						if (local160 > local129) {
							local129 = local160;
						}
					} else if (local129 > arg2) {
						local129 = arg2;
					}
				}
				this.D(local129);
			}
		}
		@Pc(179) int local179 = local69 <= local30 ? local69 : local30;
		if (arg7 != 0) {
			@Pc(195) int local195 = (int) (Math.atan2((double) (local179 - local111), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local195 != 0) {
				if (arg6 != 0) {
					if (local195 > 8192) {
						local160 = 16384 - arg6;
						if (local160 > local195) {
							local195 = local160;
						}
					} else if (arg6 < local195) {
						local195 = arg6;
					}
				}
				this.b(local195);
			}
		}
		@Pc(236) int local236 = local86 + local30;
		if (local236 > local69 + local50) {
			local236 = local69 + local50;
		}
		local236 = (local236 >> 1) - arg0;
		if (local236 != 0) {
			this.ca(0, local236, 0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!kn;II)V")
	public abstract void method7994(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(3) Class215 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
	public abstract void X();

	@OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method7997();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	public abstract void method7998(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
	public abstract void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
	public abstract int va();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()[Lclient!rn;")
	public abstract Class265[] method7999();

	@OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public abstract Class12_Sub4_Sub10 EA(@OriginalArg(0) Class12_Sub4_Sub10 arg0);

	@OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!nv;ZI[IIIILclient!nv;BI)V")
	public final void method8000(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub4_Sub13 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class12_Sub4_Sub13 arg7, @OriginalArg(10) int arg8) {
		if (arg3 == -1 || !this.sa()) {
			return;
		}
		@Pc(16) Class295 local16 = arg1.aClass295Array1[arg3];
		@Pc(19) Class12_Sub11 local19 = local16.aClass12_Sub11_1;
		@Pc(27) Class295 local27 = null;
		if (arg7 != null) {
			local27 = arg7.aClass295Array1[arg0];
			if (local27.aClass12_Sub11_1 != local19) {
				local27 = null;
			}
		}
		this.method8010(false, arg8, local19, local16, arg6, arg5, 0, null, arg2, arg4, local27);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!nv;ZILclient!nv;IIII)V")
	public final void method8001(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub4_Sub13 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class12_Sub4_Sub13 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1 || !this.sa()) {
			return;
		}
		@Pc(17) Class295 local17 = arg3.aClass295Array1[arg4];
		@Pc(20) Class12_Sub11 local20 = local17.aClass12_Sub11_1;
		@Pc(22) Class295 local22 = null;
		if (arg1 != null) {
			local22 = arg1.aClass295Array1[arg6];
			if (local22.aClass12_Sub11_1 != local20) {
				local22 = null;
			}
		}
		this.method8010(false, arg7, local20, local17, 65535, arg5, arg0, null, arg2, null, local22);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
	protected abstract boolean sa();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!kn;I)V")
	public abstract void method8003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class7_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
	public abstract void method8004();

	@OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
	public abstract void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method8005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lclient!ig;")
	public abstract Class142[] method8006();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nv;IBILclient!nv;IZII[ZILclient!nv;IILclient!nv;)V")
	public final void method8007(@OriginalArg(0) Class12_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12_Sub4_Sub13 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class12_Sub4_Sub13 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class12_Sub4_Sub13 arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == -1) {
			this.method8001(0, arg0, arg5, arg10, arg1, arg11, arg4, arg2);
		} else if (this.sa()) {
			@Pc(34) Class295 local34 = arg10.aClass295Array1[arg1];
			@Pc(37) Class12_Sub11 local37 = local34.aClass12_Sub11_1;
			@Pc(39) Class295 local39 = null;
			if (arg0 != null) {
				local39 = arg0.aClass295Array1[arg4];
				if (local39.aClass12_Sub11_1 != local37) {
					local39 = null;
				}
			}
			this.method8010(false, arg2, local37, local34, 65535, arg11, 0, arg8, arg5, null, local39);
			@Pc(76) Class295 local76 = arg3.aClass295Array1[arg6];
			@Pc(78) Class295 local78 = null;
			if (arg13 != null) {
				local78 = arg13.aClass295Array1[arg12];
				if (local78.aClass12_Sub11_1 != local37) {
					local78 = null;
				}
			}
			this.ea(0, new int[0], 0, 0, 0, 0, arg5);
			this.method8010(true, arg7, local76.aClass12_Sub11_1, local76, 65535, arg9, 0, arg8, arg5, null, local78);
			this.MA();
		}
	}

	@OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII[IIIIZ)V")
	private void method8008(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(24) int local24;
		if (arg5 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local24 = -arg2;
				arg2 = arg3;
				arg3 = local24;
			} else if (arg7 == 3) {
				local24 = arg2;
				arg2 = arg3;
				arg3 = local24;
			} else if (arg7 == 2) {
				local24 = arg2;
				arg2 = -arg3 & 0x3FFF;
				arg3 = local24 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg3 = -arg3;
				arg2 = -arg2;
			} else if (arg7 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local24 = arg2;
				arg2 = -arg3;
				arg3 = local24;
			} else if (arg7 == 3) {
				local24 = arg2;
				arg2 = arg3;
				arg3 = local24;
			} else if (arg7 == 2) {
				local24 = arg2;
				arg2 = arg3 & 0x3FFF;
				arg3 = -local24 & 0x3FFF;
			}
		}
		if (arg6 == 65535) {
			this.ea(arg7, arg4, arg2, arg1, arg3, arg5, arg8);
		} else {
			this.BA(arg7, arg4, arg2, arg1, arg3, arg8, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
	public abstract void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
	public abstract void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!nv;)V")
	public final void method8009(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub4_Sub13 arg1) {
		if (arg0 == -1 || !this.sa()) {
			return;
		}
		@Pc(19) Class295 local19 = arg1.aClass295Array1[arg0];
		@Pc(22) Class12_Sub11 local22 = local19.aClass12_Sub11_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt8869; local24++) {
			@Pc(31) short local31 = local19.aShortArray130[local24];
			if (local22.aBooleanArray20[local31]) {
				if (local19.aShortArray132[local24] != -1) {
					this.l(0, 0, 0, 0);
				}
				this.l(local22.anIntArray200[local31], local19.aShortArray129[local24], local19.aShortArray128[local24], local19.aShortArray135[local24]);
			}
		}
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZILclient!dp;Lclient!ue;IIII[ZZ[ILclient!ue;)V")
	private void method8010(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub11 arg2, @OriginalArg(3) Class295 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) Class295 arg10) {
		@Pc(19) int local19;
		if (arg10 == null || arg1 == 0) {
			for (local19 = 0; local19 < arg3.anInt8869; local19++) {
				@Pc(26) short local26 = arg3.aShortArray130[local19];
				if (arg7 == null || arg7[local26] == arg0 || arg2.anIntArray200[local26] == 0) {
					@Pc(50) short local50 = arg3.aShortArray132[local19];
					if (local50 != -1) {
						this.method8008(arg9, 0, 0, 0, arg2.anIntArrayArray22[local50], arg6, arg2.anIntArray198[local50] & arg4, 0, arg8);
					}
					this.method8008(arg9, arg3.aShortArray128[local19], arg3.aShortArray129[local19], arg3.aShortArray135[local19], arg2.anIntArrayArray22[local26], arg6, arg2.anIntArray198[local26] & arg4, arg2.anIntArray200[local26], arg8);
				}
			}
			return;
		}
		local19 = 0;
		@Pc(118) int local118 = 0;
		for (@Pc(120) int local120 = 0; local120 < arg2.anInt2271; local120++) {
			@Pc(124) boolean local124 = false;
			if (arg3.anInt8869 > local19 && arg3.aShortArray130[local19] == local120) {
				local124 = true;
			}
			@Pc(146) boolean local146 = false;
			if (local118 < arg10.anInt8869 && local120 == arg10.aShortArray130[local118]) {
				local146 = true;
			}
			if (local124 || local146) {
				if (arg7 == null || arg7[local120] == arg0 || arg2.anIntArray200[local120] == 0) {
					@Pc(195) short local195 = 0;
					@Pc(200) int local200 = arg2.anIntArray200[local120];
					if (local200 == 3 || local200 == 10) {
						local195 = 128;
					}
					@Pc(230) short local230;
					@Pc(215) short local215;
					@Pc(235) short local235;
					@Pc(220) short local220;
					@Pc(225) byte local225;
					if (local124) {
						local215 = arg3.aShortArray128[local19];
						local220 = arg3.aShortArray132[local19];
						local225 = arg3.aByteArray111[local19];
						local230 = arg3.aShortArray129[local19];
						local235 = arg3.aShortArray135[local19];
						local19++;
					} else {
						local230 = local195;
						local235 = local195;
						local220 = -1;
						local225 = 0;
						local215 = local195;
					}
					@Pc(260) short local260;
					@Pc(256) short local256;
					@Pc(258) short local258;
					@Pc(252) short local252;
					@Pc(254) byte local254;
					if (local146) {
						local258 = arg10.aShortArray135[local118];
						local252 = arg10.aShortArray132[local118];
						local254 = arg10.aByteArray111[local118];
						local256 = arg10.aShortArray128[local118];
						local260 = arg10.aShortArray129[local118];
						local118++;
					} else {
						local252 = -1;
						local254 = 0;
						local256 = local195;
						local258 = local195;
						local260 = local195;
					}
					if (local220 != -1) {
						this.method8008(arg9, 0, 0, 0, arg2.anIntArrayArray22[local220], arg6, arg4 & arg2.anIntArray198[local220], 0, arg8);
					} else if (local252 != -1) {
						this.method8008(arg9, 0, 0, 0, arg2.anIntArrayArray22[local252], arg6, arg4 & arg2.anIntArray198[local252], 0, arg8);
					}
					@Pc(353) int local353;
					@Pc(355) int local355;
					@Pc(357) int local357;
					if ((local225 & 0x2) == 0 && (local254 & 0x1) == 0) {
						@Pc(372) int local372;
						if (local200 == 2) {
							local372 = local260 - local230 & 0x3FFF;
							@Pc(491) int local491 = local256 - local215 & 0x3FFF;
							@Pc(498) int local498 = local258 - local235 & 0x3FFF;
							if (local372 >= 8192) {
								local372 -= 16384;
							}
							if (local491 >= 8192) {
								local491 -= 16384;
							}
							if (local498 >= 8192) {
								local498 -= 16384;
							}
							local355 = arg1 * local491 / arg5 + local215 & 0x3FFF;
							local353 = local230 + arg1 * local372 / arg5 & 0x3FFF;
							local357 = local498 * arg1 / arg5 + local235 & 0x3FFF;
						} else if (local200 == 9) {
							local372 = local260 - local230 & 0x3FFF;
							if (local372 >= 8192) {
								local372 -= 16384;
							}
							local353 = local230 + local372 * arg1 / arg5 & 0x3FFF;
							local357 = 0;
							local355 = 0;
						} else if (local200 == 7) {
							local372 = local260 - local230 & 0x3F;
							if (local372 >= 32) {
								local372 -= 64;
							}
							local353 = local372 * arg1 / arg5 + local230 & 0x3F;
							local355 = (local256 - local215) * arg1 / arg5 + local215;
							local357 = local235 + arg1 * (local258 - local235) / arg5;
						} else {
							local355 = (local256 - local215) * arg1 / arg5 + local215;
							local353 = local230 + (local260 - local230) * arg1 / arg5;
							local357 = arg1 * (local258 - local235) / arg5 + local235;
						}
					} else {
						local353 = local230;
						local355 = local215;
						local357 = local235;
					}
					this.method8008(arg9, local355, local353, local357, arg2.anIntArrayArray22[local120], arg6, arg4 & arg2.anIntArray198[local120], local200, arg8);
				} else {
					if (local146) {
						local118++;
					}
					if (local124) {
						local19++;
					}
				}
			}
		}
	}
}
