import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public abstract class Class159 {

	static {
		new Class62("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	protected Class159() {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIZ)Lclient!qh;")
	public abstract Class159 method4927(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public abstract void method4928();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!jj;IIIIII[ILclient!jj;Z)V")
	public final void method4930(@OriginalArg(1) Class2_Sub7_Sub10 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) Class2_Sub7_Sub10 arg7, @OriginalArg(10) boolean arg8) {
		if (arg2 == -1 || !this.method4965()) {
			return;
		}
		@Pc(17) Class176 local17 = arg7.aClass176Array1[arg2];
		@Pc(20) Class2_Sub42 local20 = local17.aClass2_Sub42_1;
		@Pc(38) Class176 local38 = null;
		if (arg0 != null) {
			local38 = arg0.aClass176Array1[arg4];
			if (local38.aClass2_Sub42_1 != local20) {
				local38 = null;
			}
		}
		this.method4936(arg8, arg3, arg6, local17, false, arg1, local20, arg5, 0, local38, null);
		this.method4961();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!bd;Z)Z")
	public abstract boolean method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()I")
	public abstract int method4932();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!bd;Lclient!qt;II)V")
	public abstract void method4933(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class7_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()I")
	public abstract int method4934();

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "()I")
	public abstract int method4935();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI[ILclient!os;IZILclient!wm;IILclient!os;[Z)V")
	private void method4936(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub42 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class176 arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(11) int local11;
		if (arg9 == null || arg7 == 0) {
			for (local11 = 0; local11 < arg3.anInt4868; local11++) {
				@Pc(18) short local18 = arg3.aShortArray87[local11];
				if (arg10 == null || arg4 == arg10[local18] || arg6.anIntArray587[local18] == 0) {
					@Pc(46) short local46 = arg3.aShortArray88[local11];
					if (local46 != -1) {
						this.method4967(arg2, arg8, arg1 & arg6.anIntArray586[local46], 0, 0, arg6.anIntArrayArray64[local46], 0, arg0, 0);
					}
					this.method4967(arg2, arg8, arg1 & arg6.anIntArray586[local18], arg6.anIntArray587[local18], arg3.aShortArray86[local11], arg6.anIntArrayArray64[local18], arg3.aShortArray81[local11], arg0, arg3.aShortArray82[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg6.anInt7022; local118++) {
			@Pc(122) boolean local122 = false;
			if (arg3.anInt4868 > local11 && local118 == arg3.aShortArray87[local11]) {
				local122 = true;
			}
			@Pc(136) boolean local136 = false;
			if (local116 < arg9.anInt4868 && arg9.aShortArray87[local116] == local118) {
				local136 = true;
			}
			if (local122 || local136) {
				if (arg10 == null || arg10[local118] == arg4 || arg6.anIntArray587[local118] == 0) {
					@Pc(178) short local178 = 0;
					@Pc(183) int local183 = arg6.anIntArray587[local118];
					if (local183 == 3) {
						local178 = 128;
					}
					@Pc(194) short local194;
					@Pc(192) short local192;
					@Pc(196) short local196;
					@Pc(200) short local200;
					@Pc(198) byte local198;
					if (local122) {
						local196 = arg3.aShortArray82[local11];
						local194 = arg3.aShortArray81[local11];
						local200 = arg3.aShortArray88[local11];
						local192 = arg3.aShortArray86[local11];
						local198 = arg3.aByteArray72[local11];
						local11++;
					} else {
						local192 = local178;
						local194 = local178;
						local196 = local178;
						local198 = 0;
						local200 = -1;
					}
					@Pc(240) short local240;
					@Pc(245) short local245;
					@Pc(250) short local250;
					@Pc(255) short local255;
					@Pc(235) byte local235;
					if (local136) {
						local235 = arg9.aByteArray72[local116];
						local240 = arg9.aShortArray81[local116];
						local245 = arg9.aShortArray86[local116];
						local250 = arg9.aShortArray82[local116];
						local255 = arg9.aShortArray88[local116];
						local116++;
					} else {
						local250 = local178;
						local255 = -1;
						local240 = local178;
						local235 = 0;
						local245 = local178;
					}
					@Pc(281) int local281;
					@Pc(285) int local285;
					@Pc(283) int local283;
					if ((local198 & 0x2) == 0 && (local235 & 0x1) == 0) {
						@Pc(298) int local298;
						if (local183 == 2) {
							local298 = local240 - local194 & 0x3FFF;
							@Pc(305) int local305 = local245 - local192 & 0x3FFF;
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							@Pc(315) int local315 = local250 - local196 & 0x3FFF;
							if (local298 >= 8192) {
								local298 -= 16384;
							}
							if (local315 >= 8192) {
								local315 -= 16384;
							}
							local285 = local305 * arg7 / arg5 + local192 & 0x3FFF;
							local281 = local298 * arg7 / arg5 + local194 & 0x3FFF;
							local283 = local196 + arg7 * local315 / arg5 & 0x3FFF;
						} else if (local183 == 7) {
							local298 = local240 - local194 & 0x3F;
							if (local298 >= 32) {
								local298 -= 64;
							}
							local285 = local192 + (local245 - local192) * arg7 / arg5;
							local281 = local298 * arg7 / arg5 + local194 & 0x3F;
							local283 = local196 + arg7 * (local250 - local196) / arg5;
						} else {
							local285 = arg7 * (local245 - local192) / arg5 + local192;
							local283 = local196 + (local250 - local196) * arg7 / arg5;
							local281 = local194 + (local240 - local194) * arg7 / arg5;
						}
					} else {
						local281 = local194;
						local283 = local196;
						local285 = local192;
					}
					if (local200 != -1) {
						this.method4967(arg2, arg8, arg1 & arg6.anIntArray586[local200], 0, 0, arg6.anIntArrayArray64[local200], 0, arg0, 0);
					} else if (local255 != -1) {
						this.method4967(arg2, arg8, arg6.anIntArray586[local255] & arg1, 0, 0, arg6.anIntArrayArray64[local255], 0, arg0, 0);
					}
					this.method4967(arg2, arg8, arg1 & arg6.anIntArray586[local118], local183, local285, arg6.anIntArrayArray64[local118], local281, arg0, local283);
				} else {
					if (local136) {
						local116++;
					}
					if (local122) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ph;)Lclient!ph;")
	public abstract Class2_Sub7_Sub11 method4937(@OriginalArg(0) Class2_Sub7_Sub11 arg0);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(SS)V")
	public abstract void method4939(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "()V")
	public abstract void method4940();

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "()I")
	public abstract int method4941();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!mi;IIIII)V")
	protected final void method4942(@OriginalArg(1) Class149 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg2 / 2;
		@Pc(19) int local19 = -arg4 / 2;
		@Pc(28) int local28 = arg0.method5839(arg5 + local14, arg1 + local19);
		@Pc(32) int local32 = arg2 / 2;
		@Pc(37) int local37 = -arg4 / 2;
		@Pc(46) int local46 = arg0.method5839(local32 + arg5, arg1 + local37);
		@Pc(51) int local51 = -arg2 / 2;
		@Pc(55) int local55 = arg4 / 2;
		@Pc(64) int local64 = arg0.method5839(local51 + arg5, arg1 + local55);
		@Pc(68) int local68 = arg2 / 2;
		@Pc(72) int local72 = arg4 / 2;
		@Pc(81) int local81 = arg0.method5839(local68 + arg5, local72 + arg1);
		@Pc(88) int local88 = local46 <= local28 ? local46 : local28;
		@Pc(99) int local99 = local64 < local81 ? local64 : local81;
		@Pc(106) int local106 = local46 < local81 ? local46 : local81;
		if (arg4 != 0) {
			@Pc(122) int local122 = (int) (Math.atan2((double) (local88 - local99), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local122 != 0) {
				this.method4954(local122);
			}
		}
		@Pc(137) int local137 = local64 > local28 ? local28 : local64;
		@Pc(141) int local141 = local28 + local81;
		if (arg2 != 0) {
			@Pc(160) int local160 = (int) (Math.atan2((double) (local137 - local106), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local160 != 0) {
				this.method4968(local160);
			}
		}
		if (local64 + local46 < local141) {
			local141 = local64 + local46;
		}
		local141 = (local141 >> 1) - arg3;
		if (local141 != 0) {
			this.method4945(0, local141, 0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public abstract void method4943(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public abstract void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4946(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
	public abstract void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "()I")
	public abstract int method4949();

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public abstract void method4950(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "()I")
	public abstract int method4951();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!bd;Lclient!qt;I)V")
	public abstract void method4952(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class7_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	protected abstract void method4953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	public abstract void method4954(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBIZILclient!jj;IILclient!jj;)V")
	public final void method4955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub7_Sub10 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub7_Sub10 arg7) {
		if (arg6 == -1 || !this.method4965()) {
			return;
		}
		@Pc(16) Class176 local16 = arg7.aClass176Array1[arg6];
		@Pc(19) Class2_Sub42 local19 = local16.aClass2_Sub42_1;
		@Pc(21) Class176 local21 = null;
		if (arg4 != null) {
			local21 = arg4.aClass176Array1[arg1];
			if (local19 != local21.aClass2_Sub42_1) {
				local21 = null;
			}
		}
		this.method4936(arg2, 65535, null, local16, false, arg3, local19, arg5, arg0, local21, null);
		this.method4961();
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "()Z")
	public abstract boolean method4956();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!mi;Lclient!mi;III)V")
	public abstract void method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
	public abstract void method4958(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "()I")
	public abstract int method4959();

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "()[Lclient!gp;")
	public abstract Class88[] method4960();

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "()V")
	protected abstract void method4961();

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "()[Lclient!tn;")
	public abstract Class218[] method4962();

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "()I")
	public abstract int method4963();

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(SS)V")
	public abstract void method4964(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "()Z")
	protected abstract boolean method4965();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([IIIII[IIZIB)V")
	private void method4967(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		@Pc(23) int local23;
		if (arg1 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local23 = -arg6;
				arg6 = arg8;
				arg8 = local23;
			} else if (arg3 == 3) {
				local23 = arg6;
				arg6 = arg8;
				arg8 = local23;
			} else if (arg3 == 2) {
				local23 = arg6;
				arg6 = -arg8 & 0x3FFF;
				arg8 = local23 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg6 = -arg6;
				arg8 = -arg8;
			} else if (arg3 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local23 = arg6;
				arg6 = -arg8;
				arg8 = local23;
			} else if (arg3 == 3) {
				local23 = arg6;
				arg6 = arg8;
				arg8 = local23;
			} else if (arg3 == 2) {
				local23 = arg6;
				arg6 = arg8 & 0x3FFF;
				arg8 = -local23 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method4929(arg3, arg5, arg6, arg4, arg8, arg1, arg7);
		} else {
			this.method4946(arg3, arg5, arg6, arg4, arg8, arg7, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	public abstract void method4968(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
	public abstract void method4969(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "()I")
	public abstract int method4970();

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
	public abstract void method4971(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!jj;I)V")
	public final void method4972(@OriginalArg(1) Class2_Sub7_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method4965()) {
			return;
		}
		@Pc(18) Class176 local18 = arg0.aClass176Array1[arg1];
		@Pc(25) Class2_Sub42 local25 = local18.aClass2_Sub42_1;
		for (@Pc(27) int local27 = 0; local27 < local18.anInt4868; local27++) {
			@Pc(34) short local34 = local18.aShortArray87[local27];
			if (local25.aBooleanArray29[local34]) {
				if (local18.aShortArray88[local27] != -1) {
					this.method4953(0, 0, 0, 0);
				}
				this.method4953(local25.anIntArray587[local34], local18.aShortArray81[local27], local18.aShortArray86[local27], local18.aShortArray82[local27]);
			}
		}
		this.method4961();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qh;IIIZ)V")
	public abstract void method4973(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!jj;B[ZIILclient!jj;Lclient!jj;IIIZILclient!jj;II)V")
	public final void method4974(@OriginalArg(0) Class2_Sub7_Sub10 arg0, @OriginalArg(2) boolean[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub7_Sub10 arg4, @OriginalArg(6) Class2_Sub7_Sub10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class2_Sub7_Sub10 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg1 == null || arg10 == -1) {
			this.method4955(0, arg6, arg9, arg13, arg5, arg3, arg12, arg4);
		} else if (this.method4965()) {
			@Pc(34) Class176 local34 = arg4.aClass176Array1[arg12];
			@Pc(37) Class2_Sub42 local37 = local34.aClass2_Sub42_1;
			@Pc(39) Class176 local39 = null;
			if (arg5 != null) {
				local39 = arg5.aClass176Array1[arg6];
				if (local37 != local39.aClass2_Sub42_1) {
					local39 = null;
				}
			}
			@Pc(57) Class176 local57 = arg11.aClass176Array1[arg10];
			@Pc(59) Class176 local59 = null;
			if (arg0 != null) {
				local59 = arg0.aClass176Array1[arg8];
				if (local59.aClass2_Sub42_1 != local37) {
					local59 = null;
				}
			}
			this.method4936(arg9, 65535, null, local34, false, arg13, local37, arg3, 0, local39, arg1);
			this.method4929(0, new int[0], 0, 0, 0, 0, arg9);
			this.method4936(arg9, 65535, null, local57, true, arg7, local37, arg2, 0, local59, arg1);
			this.method4961();
		}
	}

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "()I")
	public abstract int method4976();
}
