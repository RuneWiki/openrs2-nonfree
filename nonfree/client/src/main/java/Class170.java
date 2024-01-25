import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class170 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	protected boolean aBoolean660 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class170() {
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIBLclient!s;II)V")
	protected final void method8346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class259 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(24) int local24 = -arg3 / 2;
		@Pc(29) int local29 = -arg6 / 2;
		@Pc(40) int local40 = arg5.method9294(arg7 + local29, local24 + arg2);
		@Pc(44) int local44 = arg3 / 2;
		@Pc(49) int local49 = -arg6 / 2;
		@Pc(59) int local59 = arg5.method9294(arg7 + local49, local44 + arg2);
		@Pc(64) int local64 = -arg3 / 2;
		@Pc(68) int local68 = arg6 / 2;
		@Pc(78) int local78 = arg5.method9294(local68 + arg7, local64 + arg2);
		@Pc(82) int local82 = arg3 / 2;
		@Pc(86) int local86 = arg6 / 2;
		@Pc(97) int local97 = arg5.method9294(arg7 + local86, local82 + arg2);
		@Pc(109) int local109 = local59 > local40 ? local40 : local59;
		@Pc(117) int local117 = local78 >= local97 ? local97 : local78;
		@Pc(125) int local125 = local97 <= local59 ? local97 : local59;
		@Pc(175) int local175;
		if (arg6 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local109 - local117), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				if (arg1 != 0) {
					if (local141 > 8192) {
						local175 = 16384 - arg1;
						if (local175 > local141) {
							local141 = local175;
						}
					} else if (arg1 < local141) {
						local141 = arg1;
					}
				}
				this.FA(local141);
			}
		}
		@Pc(199) int local199 = local78 > local40 ? local40 : local78;
		if (arg3 != 0) {
			@Pc(218) int local218 = (int) (Math.atan2((double) (local199 - local125), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local218 != 0) {
				if (arg4 != 0) {
					if (local218 > 8192) {
						local175 = 16384 - arg4;
						if (local175 > local218) {
							local218 = local175;
						}
					} else if (arg4 < local218) {
						local218 = arg4;
					}
				}
				this.VA(local218);
			}
		}
		@Pc(262) int local262 = local40 + local97;
		if (local262 > local59 + local78) {
			local262 = local59 + local78;
		}
		local262 = (local262 >> 1) - arg0;
		if (local262 != 0) {
			this.H(0, local262, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dp;IB)V")
	public final void method8348(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method8370();
		if (!this.NA()) {
			this.method8365();
			return;
		}
		@Pc(33) Class268 local33 = arg0.aClass268Array1[arg1];
		@Pc(36) Class3_Sub53 local36 = local33.aClass3_Sub53_1;
		for (@Pc(38) int local38 = 0; local38 < local33.anInt6890; local38++) {
			@Pc(45) short local45 = local33.aShortArray87[local38];
			if (local36.aBooleanArray24[local45]) {
				if (local33.aShortArray89[local38] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local36.anIntArray653[local45], local33.aShortArray84[local38], local33.aShortArray93[local38], local33.aShortArray85[local38]);
			}
		}
		this.wa();
		this.method8365();
	}

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!cl;ZI)Z")
	public abstract boolean method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!cl;Lclient!ve;II)V")
	public abstract void method8350(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!cl;ZII)Z")
	public abstract boolean method8351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!lk;")
	public abstract Class232[] method8352();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([ZLclient!dp;IIILclient!dp;IILclient!dp;IILclient!dp;IZI)V")
	public final void method8353(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) Class3_Sub7_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub7_Sub6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub7_Sub6 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3_Sub7_Sub6 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg0 == null || arg9 == -1) {
			this.method8367(arg4, arg12, arg8, arg6, arg7, 0, arg5, arg2);
			return;
		}
		this.method8370();
		if (!this.NA()) {
			this.method8365();
			return;
		}
		@Pc(42) Class268 local42 = arg7.aClass268Array1[arg5];
		@Pc(45) Class3_Sub53 local45 = local42.aClass3_Sub53_1;
		@Pc(47) Class268 local47 = null;
		if (arg4 != null) {
			local47 = arg4.aClass268Array1[arg8];
			if (local47.aClass3_Sub53_1 != local45) {
				local47 = null;
			}
		}
		this.method8364(arg2, (int[]) null, local42, 0, arg0, 65535, local45, false, arg12, arg6, local47);
		@Pc(81) Class268 local81 = arg10.aClass268Array1[arg9];
		@Pc(83) Class268 local83 = null;
		if (arg1 != null) {
			local83 = arg1.aClass268Array1[arg13];
			if (local45 != local83.aClass3_Sub53_1) {
				local83 = null;
			}
		}
		this.method8347(0, new int[0], 0, 0, 0, 0, arg12);
		this.method8364(arg3, (int[]) null, local81, 0, arg0, 65535, local81.aClass3_Sub53_1, true, arg12, arg11, local83);
		this.wa();
		this.method8365();
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!ip;")
	public abstract Class184[] method8354();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8355(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!cl;)V")
	public abstract void method8357(@OriginalArg(0) Class58 arg0);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB[I[IIZIII)V")
	private void method8359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(23) int local23;
		if (arg1 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local23 = -arg7;
				arg7 = arg6;
				arg6 = local23;
			} else if (arg4 == 3) {
				local23 = arg7;
				arg7 = arg6;
				arg6 = local23;
			} else if (arg4 == 2) {
				local23 = arg7;
				arg7 = -arg6 & 0x3FFF;
				arg6 = local23 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg6 = -arg6;
				arg7 = -arg7;
			} else if (arg4 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local23 = arg7;
				arg7 = -arg6;
				arg6 = local23;
			} else if (arg4 == 3) {
				local23 = arg7;
				arg7 = arg6;
				arg6 = local23;
			} else if (arg4 == 2) {
				local23 = arg7;
				arg7 = arg6 & 0x3FFF;
				arg6 = -local23 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method8347(arg4, arg2, arg7, arg0, arg6, arg1, arg5);
		} else {
			this.I(arg4, arg2, arg7, arg0, arg6, arg5, arg8, arg3);
		}
	}

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!cl;Lclient!ve;I)V")
	public abstract void method8360(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!cl;IZ)V")
	public abstract void method8361(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public abstract void method8362();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void method8363(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ILclient!np;I[ZILclient!sga;ZZIILclient!np;)V")
	private void method8364(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class268 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub53 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class268 arg10) {
		@Pc(16) int local16;
		if (arg10 == null || arg0 == 0) {
			for (local16 = 0; local16 < arg2.anInt6890; local16++) {
				@Pc(23) short local23 = arg2.aShortArray87[local16];
				if (arg4 == null || arg7 == arg4[local23] || arg6.anIntArray653[local23] == 0) {
					@Pc(49) short local49 = arg2.aShortArray89[local16];
					if (local49 != -1) {
						this.method8359(0, arg3, arg6.anIntArrayArray47[local49], arg1, 0, arg8, 0, 0, arg6.anIntArray654[local49] & arg5);
					}
					this.method8359(arg2.aShortArray93[local16], arg3, arg6.anIntArrayArray47[local23], arg1, arg6.anIntArray653[local23], arg8, arg2.aShortArray85[local16], arg2.aShortArray84[local16], arg6.anIntArray654[local23] & arg5);
				}
			}
			return;
		}
		local16 = 0;
		@Pc(121) int local121 = 0;
		for (@Pc(123) int local123 = 0; local123 < arg6.anInt8952; local123++) {
			@Pc(129) boolean local129 = false;
			if (local16 < arg2.anInt6890 && arg2.aShortArray87[local16] == local123) {
				local129 = true;
			}
			@Pc(145) boolean local145 = false;
			if (local121 < arg10.anInt6890 && local123 == arg10.aShortArray87[local121]) {
				local145 = true;
			}
			if (local129 || local145) {
				if (arg4 == null || arg4[local123] == arg7 || arg6.anIntArray653[local123] == 0) {
					@Pc(220) short local220 = 0;
					@Pc(225) int local225 = arg6.anIntArray653[local123];
					if (local225 == 3 || local225 == 10) {
						local220 = 128;
					}
					@Pc(247) short local247;
					@Pc(243) short local243;
					@Pc(241) short local241;
					@Pc(245) short local245;
					@Pc(249) byte local249;
					if (local129) {
						local245 = arg2.aShortArray89[local16];
						local249 = arg2.aByteArray64[local16];
						local247 = arg2.aShortArray84[local16];
						local241 = arg2.aShortArray85[local16];
						local243 = arg2.aShortArray93[local16];
						local16++;
					} else {
						local241 = local220;
						local243 = local220;
						local245 = -1;
						local247 = local220;
						local249 = 0;
					}
					@Pc(289) short local289;
					@Pc(283) short local283;
					@Pc(287) short local287;
					@Pc(285) short local285;
					@Pc(281) byte local281;
					if (local145) {
						local283 = arg10.aShortArray93[local121];
						local287 = arg10.aShortArray85[local121];
						local285 = arg10.aShortArray89[local121];
						local289 = arg10.aShortArray84[local121];
						local281 = arg10.aByteArray64[local121];
						local121++;
					} else {
						local281 = 0;
						local283 = local220;
						local285 = -1;
						local287 = local220;
						local289 = local220;
					}
					@Pc(366) int local366;
					@Pc(370) int local370;
					@Pc(369) int local369;
					if ((local249 & 0x2) == 0 && (local281 & 0x1) == 0) {
						@Pc(347) int local347;
						if (local225 == 2) {
							local347 = local289 - local247 & 0x3FFF;
							@Pc(474) int local474 = local283 - local243 & 0x3FFF;
							@Pc(481) int local481 = local287 - local241 & 0x3FFF;
							if (local347 >= 8192) {
								local347 -= 16384;
							}
							if (local474 >= 8192) {
								local474 -= 16384;
							}
							local366 = local247 + local347 * arg0 / arg9 & 0x3FFF;
							local370 = local243 + local474 * arg0 / arg9 & 0x3FFF;
							if (local481 >= 8192) {
								local481 -= 16384;
							}
							local369 = arg0 * local481 / arg9 + local241 & 0x3FFF;
						} else if (local225 == 9) {
							local347 = local289 - local247 & 0x3FFF;
							if (local347 >= 8192) {
								local347 -= 16384;
							}
							local366 = local247 + arg0 * local347 / arg9 & 0x3FFF;
							local369 = 0;
							local370 = 0;
						} else if (local225 == 7) {
							local347 = local289 - local247 & 0x3F;
							if (local347 >= 32) {
								local347 -= 64;
							}
							local370 = local243 + (local283 - local243) * arg0 / arg9;
							local366 = local347 * arg0 / arg9 + local247 & 0x3F;
							local369 = (local287 - local241) * arg0 / arg9 + local241;
						} else {
							local366 = (local289 - local247) * arg0 / arg9 + local247;
							local369 = arg0 * (local287 - local241) / arg9 + local241;
							local370 = local243 + (local283 - local243) * arg0 / arg9;
						}
					} else {
						local370 = local243;
						local369 = local241;
						local366 = local247;
					}
					if (local245 != -1) {
						this.method8359(0, arg3, arg6.anIntArrayArray47[local245], arg1, 0, arg8, 0, 0, arg6.anIntArray654[local245] & arg5);
					} else if (local285 != -1) {
						this.method8359(0, arg3, arg6.anIntArrayArray47[local285], arg1, 0, arg8, 0, 0, arg6.anIntArray654[local285] & arg5);
					}
					this.method8359(local370, arg3, arg6.anIntArrayArray47[local123], arg1, local225, arg8, local369, local366, arg5 & arg6.anIntArray654[local123]);
				} else {
					if (local145) {
						local121++;
					}
					if (local129) {
						local16++;
					}
				}
			}
		}
		if (12570 != 12570) {
			this.method8362();
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method8365();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[B")
	public abstract byte[] method8366();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dp;ZIILclient!dp;BIII)V")
	public final void method8367(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub7_Sub6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1) {
			return;
		}
		this.method8370();
		if (!this.NA()) {
			this.method8365();
			return;
		}
		@Pc(22) Class268 local22 = arg4.aClass268Array1[arg6];
		@Pc(25) Class3_Sub53 local25 = local22.aClass3_Sub53_1;
		@Pc(27) Class268 local27 = null;
		if (arg0 != null) {
			local27 = arg0.aClass268Array1[arg2];
			if (local25 != local27.aClass3_Sub53_1) {
				local27 = null;
			}
		}
		this.method8364(arg7, (int[]) null, local22, arg5, (boolean[]) null, 65535, local25, false, arg1, arg3, local27);
		this.wa();
		this.method8365();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method8368();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class170 method8369(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	protected abstract void method8370();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!dp;I[IILclient!dp;IIZII)V")
	public final void method8371(@OriginalArg(1) Class3_Sub7_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub7_Sub6 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1) {
			return;
		}
		this.method8370();
		if (!this.NA()) {
			this.method8365();
			return;
		}
		@Pc(24) Class268 local24 = arg4.aClass268Array1[arg1];
		@Pc(27) Class3_Sub53 local27 = local24.aClass3_Sub53_1;
		@Pc(29) Class268 local29 = null;
		if (arg0 != null) {
			local29 = arg0.aClass268Array1[arg8];
			if (local27 != local29.aClass3_Sub53_1) {
				local29 = null;
			}
		}
		this.method8364(arg3, arg2, local24, 0, (boolean[]) null, arg7, local27, false, arg6, arg5, local29);
		this.wa();
		this.method8365();
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);
}
