import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class182 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
	protected boolean aBoolean547 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class182() {
	}

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub2_Sub19 ba(@OriginalArg(0) Class2_Sub2_Sub19 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uha;Lclient!au;II)V")
	public abstract void method6194(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6195(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!oo;")
	public abstract Class255[] method6196();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uha;)V")
	public abstract void method6197(@OriginalArg(0) Class177 arg0);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!nea;I)V")
	public final void method6198(@OriginalArg(1) Class2_Sub2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6210();
		if (!this.NA()) {
			this.method6209();
			return;
		}
		@Pc(22) Class301 local22 = arg0.aClass301Array1[arg1];
		@Pc(25) Class2_Sub25 local25 = local22.aClass2_Sub25_1;
		for (@Pc(27) int local27 = 0; local27 < local22.anInt8080; local27++) {
			@Pc(34) short local34 = local22.aShortArray129[local27];
			if (local25.aBooleanArray79[local34]) {
				if (local22.aShortArray124[local27] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local25.anIntArray327[local34], local22.aShortArray126[local27], local22.aShortArray128[local27], local22.aShortArray125[local27]);
			}
		}
		this.wa();
		this.method6209();
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII[IZILclient!nea;Lclient!nea;II)V")
	public final void method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) Class2_Sub2_Sub15 arg5, @OriginalArg(8) Class2_Sub2_Sub15 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1) {
			return;
		}
		this.method6210();
		if (!this.NA()) {
			this.method6209();
			return;
		}
		@Pc(26) Class301 local26 = arg6.aClass301Array1[arg8];
		@Pc(29) Class2_Sub25 local29 = local26.aClass2_Sub25_1;
		@Pc(31) Class301 local31 = null;
		if (arg5 != null) {
			local31 = arg5.aClass301Array1[arg2];
			if (local29 != local31.aClass2_Sub25_1) {
				local31 = null;
			}
		}
		this.method6216(local29, arg7, arg0, arg1, arg3, false, arg4, local31, null, local26, 0);
		this.wa();
		this.method6209();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nea;IIIILclient!nea;IZI)V")
	public final void method6200(@OriginalArg(0) Class2_Sub2_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub15 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1) {
			return;
		}
		this.method6210();
		if (!this.NA()) {
			this.method6209();
			return;
		}
		@Pc(20) Class301 local20 = arg0.aClass301Array1[arg2];
		@Pc(23) Class2_Sub25 local23 = local20.aClass2_Sub25_1;
		@Pc(25) Class301 local25 = null;
		if (arg5 != null) {
			local25 = arg5.aClass301Array1[arg4];
			if (local23 != local25.aClass2_Sub25_1) {
				local25 = null;
			}
		}
		this.method6216(local23, arg1, arg7, 65535, null, false, arg6, local25, null, local20, arg3);
		this.wa();
		this.method6209();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIIIIIZI[I)V")
	private void method6201(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(21) int local21;
		if (arg3 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = -arg4;
				arg4 = arg1;
				arg1 = local21;
			} else if (arg7 == 3) {
				local21 = arg4;
				arg4 = arg1;
				arg1 = local21;
			} else if (arg7 == 2) {
				local21 = arg4;
				arg4 = -arg1 & 0x3FFF;
				arg1 = local21 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg4 = -arg4;
				arg1 = -arg1;
			} else if (arg7 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = arg4;
				arg4 = -arg1;
				arg1 = local21;
			} else if (arg7 == 3) {
				local21 = arg4;
				arg4 = arg1;
				arg1 = local21;
			} else if (arg7 == 2) {
				local21 = arg4;
				arg4 = arg1 & 0x3FFF;
				arg1 = -local21 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method6214(arg7, arg0, arg4, arg5, arg1, arg3, arg6);
		} else {
			this.I(arg7, arg0, arg4, arg5, arg1, arg6, arg2, arg8);
		}
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!nea;IBILclient!nea;Lclient!nea;IZII[ZLclient!nea;)V")
	public final void method6202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2_Sub15 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub2_Sub15 arg6, @OriginalArg(8) Class2_Sub2_Sub15 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12, @OriginalArg(14) Class2_Sub2_Sub15 arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg12 == null || arg5 == -1) {
			this.method6200(arg6, arg1, arg8, 0, arg0, arg3, arg9, arg4);
			return;
		}
		this.method6210();
		if (!this.NA()) {
			this.method6209();
			return;
		}
		@Pc(47) Class301 local47 = arg6.aClass301Array1[arg8];
		@Pc(50) Class2_Sub25 local50 = local47.aClass2_Sub25_1;
		@Pc(52) Class301 local52 = null;
		if (arg3 != null) {
			local52 = arg3.aClass301Array1[arg0];
			if (local52.aClass2_Sub25_1 != local50) {
				local52 = null;
			}
		}
		this.method6216(local50, arg1, arg4, 65535, null, false, arg9, local52, arg12, local47, 0);
		@Pc(84) Class301 local84 = arg13.aClass301Array1[arg5];
		@Pc(86) Class301 local86 = null;
		if (arg7 != null) {
			local86 = arg7.aClass301Array1[arg10];
			if (local50 != local86.aClass2_Sub25_1) {
				local86 = null;
			}
		}
		this.method6214(0, new int[0], 0, 0, 0, 0, arg9);
		this.method6216(local84.aClass2_Sub25_1, arg2, arg11, 65535, null, true, arg9, local86, arg12, local84, 0);
		this.wa();
		this.method6209();
	}

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!uha;ZII)Z")
	public abstract boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uha;IZ)V")
	public abstract void method6204(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!uha;ZI)Z")
	public abstract boolean method6205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uha;Lclient!au;I)V")
	public abstract void method6206(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method6207();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class182 method6208(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	protected abstract void method6209();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method6210();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBILclient!s;IIII)V")
	protected final void method6211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class76 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(31) int local31 = arg3.method7398(local16 + arg6, local21 + arg0);
		@Pc(35) int local35 = arg7 / 2;
		@Pc(40) int local40 = -arg5 / 2;
		@Pc(52) int local52 = arg3.method7398(arg6 + local35, arg0 - -local40);
		@Pc(57) int local57 = -arg7 / 2;
		@Pc(61) int local61 = arg5 / 2;
		@Pc(84) int local84 = arg3.method7398(arg6 + local57, arg0 + local61);
		@Pc(88) int local88 = arg7 / 2;
		@Pc(92) int local92 = arg5 / 2;
		@Pc(105) int local105 = arg3.method7398(local88 + arg6, arg0 - -local92);
		@Pc(112) int local112 = local52 > local31 ? local31 : local52;
		@Pc(123) int local123 = local105 > local84 ? local84 : local105;
		@Pc(134) int local134 = local52 >= local105 ? local105 : local52;
		@Pc(141) int local141 = local84 > local31 ? local31 : local84;
		@Pc(170) int local170;
		if (arg5 != 0) {
			@Pc(156) int local156 = (int) (Math.atan2((double) (local112 - local123), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local156 != 0) {
				if (arg2 != 0) {
					if (local156 > 8192) {
						local170 = 16384 - arg2;
						if (local156 < local170) {
							local156 = local170;
						}
					} else if (arg2 < local156) {
						local156 = arg2;
					}
				}
				this.FA(local156);
			}
		}
		if (arg7 != 0) {
			@Pc(207) int local207 = (int) (Math.atan2((double) (local141 - local134), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local207 != 0) {
				if (arg1 != 0) {
					if (local207 > 8192) {
						local170 = 16384 - arg1;
						if (local207 < local170) {
							local207 = local170;
						}
					} else if (local207 > arg1) {
						local207 = arg1;
					}
				}
				this.VA(local207);
			}
		}
		@Pc(242) int local242 = local31 + local105;
		if (local242 > local52 + local84) {
			local242 = local84 + local52;
		}
		local242 = (local242 >> 1) - arg4;
		if (local242 != 0) {
			this.H(0, local242, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public abstract void method6212();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kk;IIII[IZZLclient!ri;[ZLclient!ri;I)V")
	private void method6216(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class301 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class301 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (arg7 == null || arg1 == 0) {
			for (local14 = 0; local14 < arg9.anInt8080; local14++) {
				@Pc(21) short local21 = arg9.aShortArray129[local14];
				if (arg8 == null || arg5 == arg8[local21] || arg0.anIntArray327[local21] == 0) {
					@Pc(41) short local41 = arg9.aShortArray124[local14];
					if (local41 != -1) {
						this.method6201(arg0.anIntArrayArray24[local41], 0, arg0.anIntArray328[local41] & arg3, arg10, 0, 0, arg6, 0, arg4);
					}
					this.method6201(arg0.anIntArrayArray24[local21], arg9.aShortArray125[local14], arg0.anIntArray328[local21] & arg3, arg10, arg9.aShortArray126[local14], arg9.aShortArray128[local14], arg6, arg0.anIntArray327[local21], arg4);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(109) int local109 = 0; local109 < arg0.anInt4863; local109++) {
			@Pc(113) boolean local113 = false;
			if (arg9.anInt8080 > local14 && local109 == arg9.aShortArray129[local14]) {
				local113 = true;
			}
			@Pc(127) boolean local127 = false;
			if (arg7.anInt8080 > local107 && arg7.aShortArray129[local107] == local109) {
				local127 = true;
			}
			if (local113 || local127) {
				if (arg8 == null || arg8[local109] == arg5 || arg0.anIntArray327[local109] == 0) {
					@Pc(176) short local176 = 0;
					@Pc(181) int local181 = arg0.anIntArray327[local109];
					if (local181 == 3 || local181 == 10) {
						local176 = 128;
					}
					@Pc(199) short local199;
					@Pc(197) short local197;
					@Pc(201) short local201;
					@Pc(205) short local205;
					@Pc(203) byte local203;
					if (local113) {
						local205 = arg9.aShortArray124[local14];
						local201 = arg9.aShortArray125[local14];
						local199 = arg9.aShortArray126[local14];
						local203 = arg9.aByteArray96[local14];
						local197 = arg9.aShortArray128[local14];
						local14++;
					} else {
						local197 = local176;
						local199 = local176;
						local201 = local176;
						local203 = 0;
						local205 = -1;
					}
					@Pc(260) short local260;
					@Pc(240) short local240;
					@Pc(250) short local250;
					@Pc(255) short local255;
					@Pc(245) byte local245;
					if (local127) {
						local240 = arg7.aShortArray128[local107];
						local245 = arg7.aByteArray96[local107];
						local250 = arg7.aShortArray125[local107];
						local255 = arg7.aShortArray124[local107];
						local260 = arg7.aShortArray126[local107];
						local107++;
					} else {
						local240 = local176;
						local260 = local176;
						local255 = -1;
						local250 = local176;
						local245 = 0;
					}
					if (local205 != -1) {
						this.method6201(arg0.anIntArrayArray24[local205], 0, arg0.anIntArray328[local205] & arg3, arg10, 0, 0, arg6, 0, arg4);
					} else if (local255 != -1) {
						this.method6201(arg0.anIntArrayArray24[local255], 0, arg0.anIntArray328[local255] & arg3, arg10, 0, 0, arg6, 0, arg4);
					}
					@Pc(342) int local342;
					@Pc(338) int local338;
					@Pc(340) int local340;
					if ((local203 & 0x2) == 0 && (local245 & 0x1) == 0) {
						@Pc(397) int local397;
						if (local181 == 2) {
							local397 = local260 - local199 & 0x3FFF;
							@Pc(477) int local477 = local240 - local197 & 0x3FFF;
							if (local477 >= 8192) {
								local477 -= 16384;
							}
							@Pc(490) int local490 = local250 - local201 & 0x3FFF;
							if (local397 >= 8192) {
								local397 -= 16384;
							}
							local338 = arg1 * local477 / arg2 + local197 & 0x3FFF;
							if (local490 >= 8192) {
								local490 -= 16384;
							}
							local342 = local199 + local397 * arg1 / arg2 & 0x3FFF;
							local340 = arg1 * local490 / arg2 + local201 & 0x3FFF;
						} else if (local181 == 9) {
							local397 = local260 - local199 & 0x3FFF;
							if (local397 >= 8192) {
								local397 -= 16384;
							}
							local340 = 0;
							local338 = 0;
							local342 = arg1 * local397 / arg2 + local199 & 0x3FFF;
						} else if (local181 == 7) {
							local397 = local260 - local199 & 0x3F;
							if (local397 >= 32) {
								local397 -= 64;
							}
							local340 = (local250 - local201) * arg1 / arg2 + local201;
							local338 = arg1 * (local240 - local197) / arg2 + local197;
							local342 = local199 + local397 * arg1 / arg2 & 0x3F;
						} else {
							local338 = local197 + (local240 - local197) * arg1 / arg2;
							local340 = local201 + (local250 - local201) * arg1 / arg2;
							local342 = arg1 * (local260 - local199) / arg2 + local199;
						}
					} else {
						local338 = local197;
						local340 = local201;
						local342 = local199;
					}
					this.method6201(arg0.anIntArrayArray24[local109], local340, arg0.anIntArray328[local109] & arg3, arg10, local342, local338, arg6, local181, arg4);
				} else {
					if (local127) {
						local107++;
					}
					if (local113) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!hr;")
	public abstract Class143[] method6217();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();
}
