import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class2_Sub1_Sub4_Sub3 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "[I")
	private int[] anIntArray422;

	@OriginalMember(owner = "client!ka", name = "ib", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
	public int anInt2975 = 0;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "[[B")
	private byte[][] aByteArrayArray10 = new byte[256][];

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!ka", name = "xb", descriptor = "[I")
	private int[] anIntArray424;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "[I")
	private int[] anIntArray421;

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "I")
	private int anInt2976;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
	private int anInt2974;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub1_Sub4_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray423 = arg1;
		this.anIntArray424 = arg2;
		this.anIntArray420 = arg3;
		this.anIntArray421 = arg4;
		this.method2097(arg0);
		this.aByteArrayArray10 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray424[local32] < local28 && this.anIntArray421[local32] != 0) {
				local28 = this.anIntArray424[local32];
			}
			if (this.anIntArray424[local32] + this.anIntArray421[local32] > local30) {
				local30 = this.anIntArray424[local32] + this.anIntArray421[local32];
			}
		}
		this.anInt2976 = this.anInt2975 - local28;
		this.anInt2974 = local30 - this.anInt2975;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub4_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method2097(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;I)I")
	public final int method2082(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2100(arg0, new int[] { arg1 }, Static55.aClass65Array86);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2087(Static55.aClass65Array86[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;IIIIII)V")
	public final void method2083(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2107(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2005];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2005; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2101(arg0, arg1 - this.method2087(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!pe;I)V")
	private void method2084(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1502(); local5++) {
			@Pc(11) int local11 = arg0.method1510(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static55.anInt2980 = (arg1 - this.method2087(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;IIIII)V")
	public final void method2085(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2107(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2005];
		@Pc(14) int[] local14 = new int[arg0.anInt2005];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2005; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2101(arg0, arg1 - this.method2087(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;IIII)V")
	public final void method2086(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2107(arg3, arg4);
			this.method2094(arg0, arg1 - this.method2087(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;)I")
	public final int method2087(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2005; local11++) {
			@Pc(19) int local19 = arg0.aByteArray27[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class65 local39 = arg0.method1476(local11, local5 + 1);
					local5 = -1;
					if (local39.method1512(Static55.aClass65_1296)) {
						local19 = 60;
					} else {
						if (!local39.method1512(Static55.aClass65_1293)) {
							if (local39.method1490(Static55.aClass65_1290)) {
								try {
									@Pc(69) int local69 = local39.method1501(4).method1497();
									local9 += Static55.aClass2_Sub1_Sub4_Sub2Array11[local69].anInt1369;
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
					local9 += this.anIntArray422[local19];
					if (this.aByteArray44 != null && local7 != -1) {
						local9 += this.aByteArray44[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
	private int method2089(@OriginalArg(0) int arg0) {
		return this.anIntArray422[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([BIIIII)V")
	protected abstract void method2093(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;II)V")
	private void method2094(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2975;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2005; local10++) {
			@Pc(18) int local18 = arg0.aByteArray27[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class65 local38 = arg0.method1476(local10, local6 + 1);
					local6 = -1;
					if (local38.method1512(Static55.aClass65_1296)) {
						local18 = 60;
					} else {
						if (!local38.method1512(Static55.aClass65_1293)) {
							if (local38.method1490(Static55.aClass65_1290)) {
								try {
									local68 = local38.method1501(4).method1497();
									@Pc(72) Class2_Sub1_Sub4_Sub2 local72 = Static55.aClass2_Sub1_Sub4_Sub2Array11[local68];
									local72.method996(arg1, local4 + this.anInt2975 - local72.anInt1368);
									arg1 += local72.anInt1369;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method2109(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray44 != null && local8 != -1) {
						arg1 += this.aByteArray44[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray420[local18];
					local68 = this.anIntArray421[local18];
					if (local18 == 32) {
						if (Static55.anInt2980 > 0) {
							Static55.anInt2981 += Static55.anInt2980;
							arg1 += Static55.anInt2981 >> 8;
							Static55.anInt2981 &= 0xFF;
						}
					} else if (Static55.anInt2973 == 256) {
						if (Static55.anInt2970 != -1) {
							Static55.method2092(this.aByteArrayArray10[local18], arg1 + this.anIntArray423[local18] + 1, local4 + this.anIntArray424[local18] + 1, local121, local68, Static55.anInt2970);
						}
						this.method2093(this.aByteArrayArray10[local18], arg1 + this.anIntArray423[local18], local4 + this.anIntArray424[local18], local121, local68, Static55.anInt2971);
					} else {
						if (Static55.anInt2970 != -1) {
							Static55.method2102(this.aByteArrayArray10[local18], arg1 + this.anIntArray423[local18] + 1, local4 + this.anIntArray424[local18] + 1, local121, local68, Static55.anInt2970, Static55.anInt2973);
						}
						this.method2106(this.aByteArrayArray10[local18], arg1 + this.anIntArray423[local18], local4 + this.anIntArray424[local18], local121, local68, Static55.anInt2971, Static55.anInt2973);
					}
					@Pc(253) int local253 = this.anIntArray422[local18];
					if (Static55.anInt2977 != -1) {
						Static118.method2067(arg1, local4 + (int) ((double) this.anInt2975 * 0.7D), local253, Static55.anInt2977);
					}
					if (Static55.anInt2978 != -1) {
						Static118.method2067(arg1, local4 + this.anInt2975 + 1, local253, Static55.anInt2978);
					}
					arg1 += local253;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!pe;IIII)V")
	public final void method2095(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2107(arg3, arg4);
			this.method2094(arg0, arg1 - this.method2087(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lclient!pe;I)I")
	public final int method2096(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		return this.method2100(arg0, new int[] { arg1 }, Static55.aClass65Array86);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
	private void method2097(@OriginalArg(0) byte[] arg0) {
		this.anIntArray422 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray422.length; local9++) {
				this.anIntArray422[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2975 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray422[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray44 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray44[(local182 << 8) + local150] = (byte) Static55.method2108(local93, local136, local58, this.anIntArray422, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2975 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!pe;IIIII)V")
	public final void method2098(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method2107(16777215, 0);
		Static55.aRandom2.setSeed((long) arg3);
		Static55.anInt2973 = (Static55.aRandom2.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt2005];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2005; local25++) {
			local21[local25] = local23;
			if ((Static55.aRandom2.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2101(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lclient!pe;IIII)V")
	public final void method2099(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2107(arg3, arg4);
			this.method2094(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;[I[Lclient!pe;)I")
	private int method2100(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class65[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class65 local11 = Static133.method2042(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1502();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1510(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class65 local55 = arg0.method1476(local29, local19 + 1);
					local19 = -1;
					local11.method1492(60);
					local11.method1504(local55);
					local11.method1492(62);
					if (local55.method1512(Static55.aClass65_1294)) {
						arg2[local23++] = local11.method1476(local11.method1502(), local7);
						local7 = local11.method1502();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1512(Static55.aClass65_1296)) {
						local5 += this.method2089(60);
						if (this.aByteArray44 != null && local21 != -1) {
							local5 += this.aByteArray44[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1512(Static55.aClass65_1293)) {
						local5 += this.method2089(62);
						if (this.aByteArray44 != null && local21 != -1) {
							local5 += this.aByteArray44[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1490(Static55.aClass65_1290)) {
						try {
							@Pc(173) int local173 = local55.method1501(4).method1497();
							local5 += Static55.aClass2_Sub1_Sub4_Sub2Array11[local173].anInt1369;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1492(local35);
						local5 += this.method2089(local35);
						if (this.aByteArray44 != null && local21 != -1) {
							local5 += this.aByteArray44[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1502();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1476(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1502();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1502() > local7) {
			arg2[local23++] = local11.method1476(local11.method1502(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;II[I[I)V")
	private void method2101(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2975;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2005; local12++) {
			@Pc(20) int local20 = arg0.aByteArray27[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class65 local40 = arg0.method1476(local12, local6 + 1);
					local6 = -1;
					if (local40.method1512(Static55.aClass65_1296)) {
						local20 = 60;
					} else {
						if (!local40.method1512(Static55.aClass65_1293)) {
							if (local40.method1490(Static55.aClass65_1290)) {
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
									local89 = local40.method1501(4).method1497();
									@Pc(93) Class2_Sub1_Sub4_Sub2 local93 = Static55.aClass2_Sub1_Sub4_Sub2Array11[local89];
									local93.method996(arg1 + local69, local4 + this.anInt2975 - local93.anInt1368 + local78);
									arg1 += local93.anInt1369;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method2109(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray44 != null && local8 != -1) {
						arg1 += this.aByteArray44[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray420[local20];
					local69 = this.anIntArray421[local20];
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
						if (Static55.anInt2980 > 0) {
							Static55.anInt2981 += Static55.anInt2980;
							arg1 += Static55.anInt2981 >> 8;
							Static55.anInt2981 &= 0xFF;
						}
					} else if (Static55.anInt2973 == 256) {
						if (Static55.anInt2970 != -1) {
							Static55.method2092(this.aByteArrayArray10[local20], arg1 + this.anIntArray423[local20] + local78 + 1, local4 + this.anIntArray424[local20] + 1 + local89, local146, local69, Static55.anInt2970);
						}
						this.method2093(this.aByteArrayArray10[local20], arg1 + this.anIntArray423[local20] + local78, local4 + this.anIntArray424[local20] + local89, local146, local69, Static55.anInt2971);
					} else {
						if (Static55.anInt2970 != -1) {
							Static55.method2102(this.aByteArrayArray10[local20], arg1 + this.anIntArray423[local20] + local78 + 1, local4 + this.anIntArray424[local20] + 1 + local89, local146, local69, Static55.anInt2970, Static55.anInt2973);
						}
						this.method2106(this.aByteArrayArray10[local20], arg1 + this.anIntArray423[local20] + local78, local4 + this.anIntArray424[local20] + local89, local146, local69, Static55.anInt2971, Static55.anInt2973);
					}
					@Pc(313) int local313 = this.anIntArray422[local20];
					if (Static55.anInt2977 != -1) {
						Static118.method2067(arg1, local4 + (int) ((double) this.anInt2975 * 0.7D), local313, Static55.anInt2977);
					}
					if (Static55.anInt2978 != -1) {
						Static118.method2067(arg1, local4 + this.anInt2975, local313, Static55.anInt2978);
					}
					arg1 += local313;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lclient!pe;IIIII)V")
	public final void method2103(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2107(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2005];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2005; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2101(arg0, arg1 - this.method2087(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pe;IIIIIIIII)I")
	public final int method2105(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2107(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt2975;
		}
		@Pc(19) int[] local19 = new int[] { arg3 };
		if (arg4 < this.anInt2976 + this.anInt2974 + arg9 && arg4 < arg9 + arg9) {
			local19 = null;
		}
		@Pc(41) int local41 = this.method2100(arg0, local19, Static55.aClass65Array86);
		if (arg8 == 3 && local41 == 1) {
			arg8 = 1;
		}
		@Pc(56) int local56;
		@Pc(117) int local117;
		if (arg8 == 0) {
			local56 = arg2 + this.anInt2976;
		} else if (arg8 == 1) {
			local56 = arg2 + this.anInt2976 + (arg4 - this.anInt2976 - this.anInt2974 - (local41 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local56 = arg2 + arg4 - this.anInt2974 - (local41 - 1) * arg9;
		} else {
			local117 = (arg4 - this.anInt2976 - this.anInt2974 - (local41 - 1) * arg9) / (local41 + 1);
			if (local117 < 0) {
				local117 = 0;
			}
			local56 = arg2 + this.anInt2976 + local117;
			arg9 += local117;
		}
		for (local117 = 0; local117 < local41; local117++) {
			if (arg7 == 0) {
				this.method2094(Static55.aClass65Array86[local117], arg1, local56);
			} else if (arg7 == 1) {
				this.method2094(Static55.aClass65Array86[local117], arg1 + (arg3 - this.method2087(Static55.aClass65Array86[local117])) / 2, local56);
			} else if (arg7 == 2) {
				this.method2094(Static55.aClass65Array86[local117], arg1 + arg3 - this.method2087(Static55.aClass65Array86[local117]), local56);
			} else if (local117 == local41 - 1) {
				this.method2094(Static55.aClass65Array86[local117], arg1, local56);
			} else {
				this.method2084(Static55.aClass65Array86[local117], arg3);
				this.method2094(Static55.aClass65Array86[local117], arg1, local56);
				Static55.anInt2980 = 0;
			}
			local56 += arg9;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([BIIIIII)V")
	protected abstract void method2106(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	private void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static55.anInt2977 = -1;
		Static55.anInt2978 = -1;
		Static55.anInt2979 = arg1;
		Static55.anInt2970 = arg1;
		Static55.anInt2972 = arg0;
		Static55.anInt2971 = arg0;
		Static55.anInt2973 = 256;
		Static55.anInt2980 = 0;
		Static55.anInt2981 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lclient!pe;)V")
	private void method2109(@OriginalArg(0) Class65 arg0) {
		try {
			if (arg0.method1490(Static55.aClass65_1300)) {
				Static55.anInt2971 = arg0.method1501(4).method1482(16);
				return;
			}
			if (arg0.method1512(Static55.aClass65_1286)) {
				Static55.anInt2971 = Static55.anInt2972;
				return;
			}
			if (arg0.method1490(Static55.aClass65_1289)) {
				Static55.anInt2977 = arg0.method1501(4).method1482(16);
				return;
			}
			if (arg0.method1512(Static55.aClass65_1299)) {
				Static55.anInt2977 = 8388608;
				return;
			}
			if (arg0.method1512(Static55.aClass65_1295)) {
				Static55.anInt2977 = -1;
				return;
			}
			if (arg0.method1490(Static55.aClass65_1292)) {
				Static55.anInt2978 = arg0.method1501(2).method1482(16);
				return;
			}
			if (arg0.method1512(Static55.aClass65_1297)) {
				Static55.anInt2978 = 0;
				return;
			}
			if (arg0.method1512(Static55.aClass65_1287)) {
				Static55.anInt2978 = -1;
				return;
			}
			if (arg0.method1490(Static55.aClass65_1288)) {
				Static55.anInt2970 = arg0.method1501(5).method1482(16);
				return;
			}
			if (arg0.method1512(Static55.aClass65_1291)) {
				Static55.anInt2970 = 0;
				return;
			}
			if (arg0.method1512(Static55.aClass65_1298)) {
				Static55.anInt2970 = Static55.anInt2979;
				return;
			}
			if (arg0.method1512(Static55.aClass65_1294)) {
				this.method2107(Static55.anInt2972, Static55.anInt2979);
				return;
			}
		} catch (@Pc(122) Exception local122) {
		}
	}
}
