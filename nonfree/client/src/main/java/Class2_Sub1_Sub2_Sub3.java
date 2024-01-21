import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Class2_Sub1_Sub2_Sub3 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!oc", name = "vb", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!oc", name = "yb", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
	public int anInt2187 = 0;

	@OriginalMember(owner = "client!oc", name = "tb", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!oc", name = "nb", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!oc", name = "Gb", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!oc", name = "wb", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!oc", name = "qb", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
	private int anInt2185;

	@OriginalMember(owner = "client!oc", name = "Db", descriptor = "I")
	private int anInt2196;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub1_Sub2_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray239 = arg1;
		this.anIntArray243 = arg2;
		this.anIntArray241 = arg3;
		this.anIntArray240 = arg4;
		this.method1535(arg0);
		this.aByteArrayArray5 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray243[local32] < local28 && this.anIntArray240[local32] != 0) {
				local28 = this.anIntArray243[local32];
			}
			if (this.anIntArray243[local32] + this.anIntArray240[local32] > local30) {
				local30 = this.anIntArray243[local32] + this.anIntArray240[local32];
			}
		}
		this.anInt2185 = this.anInt2187 - local28;
		this.anInt2196 = local30 - this.anInt2187;
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method1535(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;II)V")
	private void method1527(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2187;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1425; local10++) {
			@Pc(18) int local18 = arg0.aByteArray18[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class40 local38 = arg0.method953(local6 + 1, local10);
					local6 = -1;
					if (local38.method960(Static82.aClass40_1130)) {
						local18 = 60;
					} else {
						if (!local38.method960(Static82.aClass40_1134)) {
							if (local38.method959(Static82.aClass40_1139)) {
								try {
									local68 = local38.method968(4).method974();
									@Pc(72) Class2_Sub1_Sub2_Sub1 local72 = Static82.aClass2_Sub1_Sub2_Sub1Array70[local68];
									local72.method1084(arg1, local4 + this.anInt2187 - local72.anInt1633);
									arg1 += local72.anInt1634;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method1544(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray30 != null && local8 != -1) {
						arg1 += this.aByteArray30[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray241[local18];
					local68 = this.anIntArray240[local18];
					if (local18 == 32) {
						if (Static82.anInt2195 > 0) {
							Static82.anInt2194 += Static82.anInt2195;
							arg1 += Static82.anInt2194 >> 8;
							Static82.anInt2194 &= 0xFF;
						}
					} else if (Static82.anInt2188 == 256) {
						if (Static82.anInt2193 != -1) {
							Static82.method1539(this.aByteArrayArray5[local18], arg1 + this.anIntArray239[local18] + 1, local4 + this.anIntArray243[local18] + 1, local121, local68, Static82.anInt2193);
						}
						this.method1532(this.aByteArrayArray5[local18], arg1 + this.anIntArray239[local18], local4 + this.anIntArray243[local18], local121, local68, Static82.anInt2190);
					} else {
						if (Static82.anInt2193 != -1) {
							Static82.method1533(this.aByteArrayArray5[local18], arg1 + this.anIntArray239[local18] + 1, local4 + this.anIntArray243[local18] + 1, local121, local68, Static82.anInt2193, Static82.anInt2188);
						}
						this.method1536(this.aByteArrayArray5[local18], arg1 + this.anIntArray239[local18], local4 + this.anIntArray243[local18], local121, local68, Static82.anInt2190, Static82.anInt2188);
					}
					@Pc(253) int local253 = this.anIntArray242[local18];
					if (Static82.anInt2189 != -1) {
						Static6.method1702(arg1, local4 + (int) ((double) this.anInt2187 * 0.7D), local253, Static82.anInt2189);
					}
					if (Static82.anInt2192 != -1) {
						Static6.method1702(arg1, local4 + this.anInt2187 + 1, local253, Static82.anInt2192);
					}
					arg1 += local253;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;[I[Lclient!je;)I")
	private int method1528(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class40[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class40 local11 = Static115.method1906(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method950();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method982(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class40 local55 = arg0.method953(local19 + 1, local29);
					local19 = -1;
					local11.method988(60);
					local11.method951(local55);
					local11.method988(62);
					if (local55.method960(Static82.aClass40_1142)) {
						arg2[local23++] = local11.method953(local7, local11.method950());
						local7 = local11.method950();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method960(Static82.aClass40_1130)) {
						local5 += this.method1548(60);
						if (this.aByteArray30 != null && local21 != -1) {
							local5 += this.aByteArray30[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method960(Static82.aClass40_1134)) {
						local5 += this.method1548(62);
						if (this.aByteArray30 != null && local21 != -1) {
							local5 += this.aByteArray30[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method959(Static82.aClass40_1139)) {
						try {
							@Pc(173) int local173 = local55.method968(4).method974();
							local5 += Static82.aClass2_Sub1_Sub2_Sub1Array70[local173].anInt1634;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method988(local35);
						local5 += this.method1548(local35);
						if (this.aByteArray30 != null && local21 != -1) {
							local5 += this.aByteArray30[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method950();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method953(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method950();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method950() > local7) {
			arg2[local23++] = local11.method953(local7, local11.method950());
		}
		return local23;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;IIII)V")
	public final void method1531(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1543(arg3, arg4);
			this.method1527(arg0, arg1 - this.method1553(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIIII)V")
	protected abstract void method1532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;II[I[I)V")
	private void method1534(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2187;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1425; local12++) {
			@Pc(20) int local20 = arg0.aByteArray18[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class40 local40 = arg0.method953(local6 + 1, local12);
					local6 = -1;
					if (local40.method960(Static82.aClass40_1130)) {
						local20 = 60;
					} else {
						if (!local40.method960(Static82.aClass40_1134)) {
							if (local40.method959(Static82.aClass40_1139)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method968(4).method974();
									@Pc(93) Class2_Sub1_Sub2_Sub1 local93 = Static82.aClass2_Sub1_Sub2_Sub1Array70[local89];
									local93.method1084(arg1 + local69, local4 + this.anInt2187 - local93.anInt1633 + local78);
									arg1 += local93.anInt1634;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method1544(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray30 != null && local8 != -1) {
						arg1 += this.aByteArray30[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray241[local20];
					local69 = this.anIntArray240[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static82.anInt2195 > 0) {
							Static82.anInt2194 += Static82.anInt2195;
							arg1 += Static82.anInt2194 >> 8;
							Static82.anInt2194 &= 0xFF;
						}
					} else if (Static82.anInt2188 == 256) {
						if (Static82.anInt2193 != -1) {
							Static82.method1539(this.aByteArrayArray5[local20], arg1 + this.anIntArray239[local20] + local78 + 1, local4 + this.anIntArray243[local20] + 1 + local89, local146, local69, Static82.anInt2193);
						}
						this.method1532(this.aByteArrayArray5[local20], arg1 + this.anIntArray239[local20] + local78, local4 + this.anIntArray243[local20] + local89, local146, local69, Static82.anInt2190);
					} else {
						if (Static82.anInt2193 != -1) {
							Static82.method1533(this.aByteArrayArray5[local20], arg1 + this.anIntArray239[local20] + local78 + 1, local4 + this.anIntArray243[local20] + 1 + local89, local146, local69, Static82.anInt2193, Static82.anInt2188);
						}
						this.method1536(this.aByteArrayArray5[local20], arg1 + this.anIntArray239[local20] + local78, local4 + this.anIntArray243[local20] + local89, local146, local69, Static82.anInt2190, Static82.anInt2188);
					}
					@Pc(313) int local313 = this.anIntArray242[local20];
					if (Static82.anInt2189 != -1) {
						Static6.method1702(arg1, local4 + (int) ((double) this.anInt2187 * 0.7D), local313, Static82.anInt2189);
					}
					if (Static82.anInt2192 != -1) {
						Static6.method1702(arg1, local4 + this.anInt2187, local313, Static82.anInt2192);
					}
					arg1 += local313;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([B)V")
	private void method1535(@OriginalArg(0) byte[] arg0) {
		this.anIntArray242 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray242.length; local9++) {
				this.anIntArray242[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2187 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray242[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray30 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray30[(local182 << 8) + local150] = (byte) Static82.method1530(local93, local136, local58, this.anIntArray242, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2187 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "([BIIIIII)V")
	protected abstract void method1536(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;IIIIII)V")
	public final void method1537(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1543(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1425];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1425; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1534(arg0, arg1 - this.method1553(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;IIIII)V")
	public final void method1540(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method1543(16777215, 0);
		Static82.aRandom2.setSeed((long) arg3);
		Static82.anInt2188 = (Static82.aRandom2.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt1425];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1425; local25++) {
			local21[local25] = local23;
			if ((Static82.aRandom2.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1534(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;IIIIIIIII)I")
	public final int method1542(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1543(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt2187;
		}
		@Pc(19) int[] local19 = new int[] { arg3 };
		if (arg4 < this.anInt2185 + this.anInt2196 + arg9 && arg4 < arg9 + arg9) {
			local19 = null;
		}
		@Pc(41) int local41 = this.method1528(arg0, local19, Static82.aClass40Array13);
		if (arg8 == 3 && local41 == 1) {
			arg8 = 1;
		}
		@Pc(56) int local56;
		@Pc(117) int local117;
		if (arg8 == 0) {
			local56 = arg2 + this.anInt2185;
		} else if (arg8 == 1) {
			local56 = arg2 + this.anInt2185 + (arg4 - this.anInt2185 - this.anInt2196 - (local41 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local56 = arg2 + arg4 - this.anInt2196 - (local41 - 1) * arg9;
		} else {
			local117 = (arg4 - this.anInt2185 - this.anInt2196 - (local41 - 1) * arg9) / (local41 + 1);
			if (local117 < 0) {
				local117 = 0;
			}
			local56 = arg2 + this.anInt2185 + local117;
			arg9 += local117;
		}
		for (local117 = 0; local117 < local41; local117++) {
			if (arg7 == 0) {
				this.method1527(Static82.aClass40Array13[local117], arg1, local56);
			} else if (arg7 == 1) {
				this.method1527(Static82.aClass40Array13[local117], arg1 + (arg3 - this.method1553(Static82.aClass40Array13[local117])) / 2, local56);
			} else if (arg7 == 2) {
				this.method1527(Static82.aClass40Array13[local117], arg1 + arg3 - this.method1553(Static82.aClass40Array13[local117]), local56);
			} else if (local117 == local41 - 1) {
				this.method1527(Static82.aClass40Array13[local117], arg1, local56);
			} else {
				this.method1551(Static82.aClass40Array13[local117], arg3);
				this.method1527(Static82.aClass40Array13[local117], arg1, local56);
				Static82.anInt2195 = 0;
			}
			local56 += arg9;
		}
		return local41;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	private void method1543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static82.anInt2189 = -1;
		Static82.anInt2192 = -1;
		Static82.anInt2186 = arg1;
		Static82.anInt2193 = arg1;
		Static82.anInt2191 = arg0;
		Static82.anInt2190 = arg0;
		Static82.anInt2188 = 256;
		Static82.anInt2195 = 0;
		Static82.anInt2194 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!je;)V")
	private void method1544(@OriginalArg(0) Class40 arg0) {
		try {
			if (arg0.method959(Static82.aClass40_1141)) {
				Static82.anInt2190 = arg0.method968(4).method975(16);
				return;
			}
			if (arg0.method960(Static82.aClass40_1135)) {
				Static82.anInt2190 = Static82.anInt2191;
				return;
			}
			if (arg0.method959(Static82.aClass40_1138)) {
				Static82.anInt2189 = arg0.method968(4).method975(16);
				return;
			}
			if (arg0.method960(Static82.aClass40_1136)) {
				Static82.anInt2189 = 8388608;
				return;
			}
			if (arg0.method960(Static82.aClass40_1132)) {
				Static82.anInt2189 = -1;
				return;
			}
			if (arg0.method959(Static82.aClass40_1140)) {
				Static82.anInt2192 = arg0.method968(2).method975(16);
				return;
			}
			if (arg0.method960(Static82.aClass40_1143)) {
				Static82.anInt2192 = 0;
				return;
			}
			if (arg0.method960(Static82.aClass40_1131)) {
				Static82.anInt2192 = -1;
				return;
			}
			if (arg0.method959(Static82.aClass40_1133)) {
				Static82.anInt2193 = arg0.method968(5).method975(16);
				return;
			}
			if (arg0.method960(Static82.aClass40_1144)) {
				Static82.anInt2193 = 0;
				return;
			}
			if (arg0.method960(Static82.aClass40_1137)) {
				Static82.anInt2193 = Static82.anInt2186;
				return;
			}
			if (arg0.method960(Static82.aClass40_1142)) {
				this.method1543(Static82.anInt2191, Static82.anInt2186);
				return;
			}
		} catch (@Pc(122) Exception local122) {
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;I)I")
	public final int method1545(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		return this.method1528(arg0, new int[] { arg1 }, Static82.aClass40Array13);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!je;IIIII)V")
	public final void method1546(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1543(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1425];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1425; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1534(arg0, arg1 - this.method1553(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!je;IIII)V")
	public final void method1547(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1543(arg3, arg4);
			this.method1527(arg0, arg1 - this.method1553(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	private int method1548(@OriginalArg(0) int arg0) {
		return this.anIntArray242[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!je;IIII)V")
	public final void method1549(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1543(arg3, arg4);
			this.method1527(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!je;IIIII)V")
	public final void method1550(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1543(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1425];
		@Pc(14) int[] local14 = new int[arg0.anInt1425];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1425; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1534(arg0, arg1 - this.method1553(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!je;I)V")
	private void method1551(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method950(); local5++) {
			@Pc(11) int local11 = arg0.method982(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static82.anInt2195 = (arg1 - this.method1553(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!je;I)I")
	public final int method1552(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1528(arg0, new int[] { arg1 }, Static82.aClass40Array13);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1553(Static82.aClass40Array13[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!je;)I")
	public final int method1553(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1425; local11++) {
			@Pc(19) int local19 = arg0.aByteArray18[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class40 local39 = arg0.method953(local5 + 1, local11);
					local5 = -1;
					if (local39.method960(Static82.aClass40_1130)) {
						local19 = 60;
					} else {
						if (!local39.method960(Static82.aClass40_1134)) {
							if (local39.method959(Static82.aClass40_1139)) {
								try {
									@Pc(69) int local69 = local39.method968(4).method974();
									local9 += Static82.aClass2_Sub1_Sub2_Sub1Array70[local69].anInt1634;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray242[local19];
					if (this.aByteArray30 != null && local7 != -1) {
						local9 += this.aByteArray30[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}
}
