import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public abstract class Class124 {

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	protected Class124() {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()[Lclient!jq;")
	public abstract Class112[] method4074();

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	public abstract void method4075();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public abstract void method4076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	public abstract void method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!da;Lclient!da;III)V")
	public abstract void method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ug;Lclient!aj;I)V")
	public abstract void method4079(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class8_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public abstract void method4080(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!c;)Lclient!c;")
	public abstract Class3_Sub7_Sub3 method4081(@OriginalArg(0) Class3_Sub7_Sub3 arg0);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public abstract void method4082(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(SS)V")
	public abstract void method4083(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZII[I[IIII)V")
	private void method4085(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(36) int local36;
		if (arg2 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local36 = -arg8;
				arg8 = arg7;
				arg7 = local36;
			} else if (arg0 == 3) {
				local36 = arg8;
				arg8 = arg7;
				arg7 = local36;
			} else if (arg0 == 2) {
				local36 = arg8;
				arg8 = -arg7 & 0x3FFF;
				arg7 = local36 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg8 = -arg8;
				arg7 = -arg7;
			} else if (arg0 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local36 = arg8;
				arg8 = -arg7;
				arg7 = local36;
			} else if (arg0 == 3) {
				local36 = arg8;
				arg8 = arg7;
				arg7 = local36;
			} else if (arg0 == 2) {
				local36 = arg8;
				arg8 = arg7 & 0x3FFF;
				arg7 = -local36 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method4084(arg0, arg4, arg8, arg6, arg7, arg2, arg1);
		} else {
			this.method4109(arg0, arg4, arg8, arg6, arg7, arg1, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qb;IIIZ)V")
	public abstract void method4086(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public abstract int method4087();

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()Z")
	protected abstract boolean method4088();

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()I")
	public abstract int method4089();

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()I")
	public abstract int method4090();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public abstract void method4091(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[II[ZZLclient!ci;IIILclient!ci;ZLclient!sn;)V")
	private void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class33 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class3_Sub39 arg10) {
		@Pc(22) int local22;
		if (arg5 == null || arg0 == 0) {
			for (local22 = 0; local22 < arg8.anInt899; local22++) {
				@Pc(29) short local29 = arg8.aShortArray21[local22];
				if (arg3 == null || arg3[local29] == arg9 || arg10.anIntArray473[local29] == 0) {
					@Pc(57) short local57 = arg8.aShortArray18[local22];
					if (local57 != -1) {
						this.method4085(0, arg4, arg7, arg2 & arg10.anIntArray472[local57], arg10.anIntArrayArray55[local57], arg1, 0, 0, 0);
					}
					this.method4085(arg10.anIntArray473[local29], arg4, arg7, arg2 & arg10.anIntArray472[local29], arg10.anIntArrayArray55[local29], arg1, arg8.aShortArray22[local22], arg8.aShortArray23[local22], arg8.aShortArray25[local22]);
				}
			}
			return;
		}
		local22 = 0;
		@Pc(127) int local127 = 0;
		for (@Pc(129) int local129 = 0; local129 < arg10.anInt5801; local129++) {
			@Pc(133) boolean local133 = false;
			if (local22 < arg8.anInt899 && local129 == arg8.aShortArray21[local22]) {
				local133 = true;
			}
			@Pc(155) boolean local155 = false;
			if (local127 < arg5.anInt899 && local129 == arg5.aShortArray21[local127]) {
				local155 = true;
			}
			if (local133 || local155) {
				if (arg3 == null || arg9 == arg3[local129] || arg10.anIntArray473[local129] == 0) {
					@Pc(208) short local208 = 0;
					@Pc(213) int local213 = arg10.anIntArray473[local129];
					if (local213 == 3) {
						local208 = 128;
					}
					@Pc(245) short local245;
					@Pc(240) short local240;
					@Pc(225) short local225;
					@Pc(230) short local230;
					@Pc(235) byte local235;
					if (local133) {
						local225 = arg8.aShortArray23[local22];
						local230 = arg8.aShortArray18[local22];
						local235 = arg8.aByteArray11[local22];
						local240 = arg8.aShortArray22[local22];
						local245 = arg8.aShortArray25[local22];
						local22++;
					} else {
						local225 = local208;
						local230 = -1;
						local235 = 0;
						local240 = local208;
						local245 = local208;
					}
					@Pc(265) short local265;
					@Pc(285) short local285;
					@Pc(280) short local280;
					@Pc(275) short local275;
					@Pc(270) byte local270;
					if (local155) {
						local265 = arg5.aShortArray25[local127];
						local270 = arg5.aByteArray11[local127];
						local275 = arg5.aShortArray18[local127];
						local280 = arg5.aShortArray23[local127];
						local285 = arg5.aShortArray22[local127];
						local127++;
					} else {
						local265 = local208;
						local285 = local208;
						local280 = local208;
						local275 = -1;
						local270 = 0;
					}
					@Pc(311) int local311;
					@Pc(315) int local315;
					@Pc(313) int local313;
					if ((local235 & 0x2) == 0 && (local270 & 0x1) == 0) {
						@Pc(327) int local327;
						if (local213 == 2) {
							local327 = local265 - local245 & 0x3FFF;
							@Pc(334) int local334 = local285 - local240 & 0x3FFF;
							@Pc(340) int local340 = local280 - local225 & 0x3FFF;
							if (local327 >= 8192) {
								local327 -= 16384;
							}
							if (local334 >= 8192) {
								local334 -= 16384;
							}
							if (local340 >= 8192) {
								local340 -= 16384;
							}
							local315 = local240 + arg0 * local334 / arg6 & 0x3FFF;
							local311 = arg0 * local327 / arg6 + local245 & 0x3FFF;
							local313 = arg0 * local340 / arg6 + local225 & 0x3FFF;
						} else if (local213 == 7) {
							local327 = local265 - local245 & 0x3F;
							if (local327 >= 32) {
								local327 -= 64;
							}
							local311 = local245 + arg0 * local327 / arg6 & 0x3F;
							local313 = local225 + (local280 - local225) * arg0 / arg6;
							local315 = local240 + (local285 - local240) * arg0 / arg6;
						} else {
							local311 = local245 + arg0 * (local265 - local245) / arg6;
							local313 = arg0 * (local280 - local225) / arg6 + local225;
							local315 = local240 + (local285 - local240) * arg0 / arg6;
						}
					} else {
						local311 = local245;
						local313 = local225;
						local315 = local240;
					}
					if (local230 != -1) {
						this.method4085(0, arg4, arg7, arg2 & arg10.anIntArray472[local230], arg10.anIntArrayArray55[local230], arg1, 0, 0, 0);
					} else if (local275 != -1) {
						this.method4085(0, arg4, arg7, arg10.anIntArray472[local275] & arg2, arg10.anIntArrayArray55[local275], arg1, 0, 0, 0);
					}
					this.method4085(local213, arg4, arg7, arg2 & arg10.anIntArray472[local129], arg10.anIntArrayArray55[local129], arg1, local315, local313, local311);
				} else {
					if (local155) {
						local127++;
					}
					if (local133) {
						local22++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "()I")
	public abstract int method4093();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIZ)Lclient!qb;")
	public abstract Class124 method4094(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public abstract void method4095(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!ul;ZILclient!ul;I)V")
	public final void method4096(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub7_Sub21 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub7_Sub21 arg6, @OriginalArg(8) int arg7) {
		if (arg0 == -1 || !this.method4088()) {
			return;
		}
		@Pc(16) Class33 local16 = arg6.aClass33Array1[arg0];
		@Pc(19) Class3_Sub39 local19 = local16.aClass3_Sub39_1;
		@Pc(21) Class33 local21 = null;
		if (arg3 != null) {
			local21 = arg3.aClass33Array1[arg5];
			if (local19 != local21.aClass3_Sub39_1) {
				local21 = null;
			}
		}
		this.method4092(arg1, null, 65535, null, arg4, local21, arg7, arg2, local16, false, local19);
		this.method4099();
	}

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "()I")
	public abstract int method4097();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ug;Lclient!aj;II)V")
	public abstract void method4098(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class8_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "()V")
	protected abstract void method4099();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!da;IIIII)V")
	protected final void method4100(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) int local14 = -arg0 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(29) int local29 = arg1.method4678(arg5 + local14, local19 + arg3);
		@Pc(33) int local33 = arg0 / 2;
		@Pc(38) int local38 = -arg2 / 2;
		@Pc(48) int local48 = arg1.method4678(arg5 + local33, arg3 - -local38);
		@Pc(53) int local53 = -arg0 / 2;
		@Pc(57) int local57 = arg2 / 2;
		@Pc(67) int local67 = arg1.method4678(arg5 + local53, arg3 + local57);
		@Pc(71) int local71 = arg0 / 2;
		@Pc(75) int local75 = arg2 / 2;
		@Pc(85) int local85 = arg1.method4678(arg5 + local71, local75 + arg3);
		@Pc(96) int local96 = local29 >= local48 ? local48 : local29;
		@Pc(107) int local107 = local67 >= local85 ? local85 : local67;
		@Pc(114) int local114 = local85 <= local48 ? local85 : local48;
		if (arg2 != 0) {
			@Pc(133) int local133 = (int) (Math.atan2((double) (local96 - local107), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local133 != 0) {
				this.method4105(local133);
			}
		}
		@Pc(148) int local148 = local29 < local67 ? local29 : local67;
		if (arg0 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local148 - local114), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				this.method4111(local164);
			}
		}
		@Pc(173) int local173 = local29 + local85;
		if (local173 > local67 + local48) {
			local173 = local67 + local48;
		}
		local173 = (local173 >> 1) - arg4;
		if (local173 != 0) {
			this.method4077(0, local173, 0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
	protected abstract void method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "()I")
	public abstract int method4103();

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "()V")
	public abstract void method4104();

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	public abstract void method4105(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "()I")
	public abstract int method4106();

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(SS)V")
	public abstract void method4107(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "()I")
	public abstract int method4108();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4109(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public abstract void method4110(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	public abstract void method4111(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "()[Lclient!ti;")
	public abstract Class191[] method4112();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!ul;)V")
	public final void method4113(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7_Sub21 arg1) {
		if (arg0 == -1 || !this.method4088()) {
			return;
		}
		@Pc(18) Class33 local18 = arg1.aClass33Array1[arg0];
		@Pc(21) Class3_Sub39 local21 = local18.aClass3_Sub39_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt899; local23++) {
			@Pc(30) short local30 = local18.aShortArray21[local23];
			if (local21.aBooleanArray28[local30]) {
				if (local18.aShortArray18[local23] != -1) {
					this.method4101(0, 0, 0, 0);
				}
				this.method4101(local21.anIntArray473[local30], local18.aShortArray25[local23], local18.aShortArray22[local23], local18.aShortArray23[local23]);
			}
		}
		this.method4099();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZIIZLclient!ul;[IIILclient!ul;)V")
	public final void method4114(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class3_Sub7_Sub21 arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class3_Sub7_Sub21 arg8) {
		if (arg3 == -1 || !this.method4088()) {
			return;
		}
		@Pc(22) Class33 local22 = arg4.aClass33Array1[arg3];
		@Pc(25) Class3_Sub39 local25 = local22.aClass3_Sub39_1;
		@Pc(27) Class33 local27 = null;
		if (arg8 != null) {
			local27 = arg8.aClass33Array1[arg2];
			if (local25 != local27.aClass3_Sub39_1) {
				local27 = null;
			}
		}
		this.method4092(arg7, arg5, arg0, null, arg1, local27, arg6, 0, local22, false, local25);
		this.method4099();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[ZLclient!ul;BILclient!ul;IILclient!ul;IIIZLclient!ul;I)V")
	public final void method4115(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) Class3_Sub7_Sub21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub7_Sub21 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub7_Sub21 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class3_Sub7_Sub21 arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg1 == null || arg8 == -1) {
			this.method4096(arg5, arg6, 0, arg7, arg11, arg13, arg2, arg9);
		} else if (this.method4088()) {
			@Pc(35) Class33 local35 = arg2.aClass33Array1[arg5];
			@Pc(38) Class3_Sub39 local38 = local35.aClass3_Sub39_1;
			@Pc(40) Class33 local40 = null;
			if (arg7 != null) {
				local40 = arg7.aClass33Array1[arg13];
				if (local40.aClass3_Sub39_1 != local38) {
					local40 = null;
				}
			}
			@Pc(62) Class33 local62 = arg12.aClass33Array1[arg8];
			@Pc(64) Class33 local64 = null;
			if (arg4 != null) {
				local64 = arg4.aClass33Array1[arg10];
				if (local38 != local64.aClass3_Sub39_1) {
					local64 = null;
				}
			}
			this.method4092(arg6, null, 65535, arg1, arg11, local40, arg9, 0, local35, false, local38);
			this.method4084(0, new int[0], 0, 0, 0, 0, arg11);
			this.method4092(arg3, null, 65535, arg1, arg11, local64, arg0, 0, local62, true, local38);
			this.method4099();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!ug;Z)Z")
	public abstract boolean method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "()Z")
	public abstract boolean method4117();

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "()I")
	public abstract int method4118();

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "()I")
	public abstract int method4119();
}
