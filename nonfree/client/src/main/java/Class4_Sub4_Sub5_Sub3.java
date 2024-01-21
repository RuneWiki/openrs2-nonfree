import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public abstract class Class4_Sub4_Sub5_Sub3 extends Class4_Sub4_Sub5 {

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
	public int anInt1871 = 0;

	@OriginalMember(owner = "client!ob", name = "vb", descriptor = "[[B")
	private byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!ob", name = "wb", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ob", name = "tb", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
	private int anInt1862;

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
	private int anInt1864;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class4_Sub4_Sub5_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray251 = arg1;
		this.anIntArray254 = arg2;
		this.anIntArray253 = arg3;
		this.anIntArray250 = arg4;
		this.method1320(arg0);
		this.aByteArrayArray6 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray254[local32] < local28 && this.anIntArray250[local32] != 0) {
				local28 = this.anIntArray254[local32];
			}
			if (this.anIntArray254[local32] + this.anIntArray250[local32] > local30) {
				local30 = this.anIntArray254[local32] + this.anIntArray250[local32];
			}
		}
		this.anInt1862 = this.anInt1871 - local28;
		this.anInt1864 = local30 - this.anInt1871;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class4_Sub4_Sub5_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method1320(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;II[I[I)V")
	private void method1308(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1871;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2668; local12++) {
			@Pc(20) int local20 = arg0.aByteArray71[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class76 local40 = arg0.method1876(local12, local6 + 1);
					local6 = -1;
					if (local40.method1878(Static83.aClass76_806)) {
						local20 = 60;
					} else {
						if (!local40.method1878(Static83.aClass76_795)) {
							if (local40.method1869(Static83.aClass76_803)) {
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
									local89 = local40.method1874(4).method1884();
									@Pc(93) Class4_Sub4_Sub5_Sub4 local93 = Static83.aClass4_Sub4_Sub5_Sub4Array8[local89];
									local93.method1836(arg1 + local69, local4 + this.anInt1871 - local93.anInt2611 + local78);
									arg1 += local93.anInt2608;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method1314(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray34 != null && local8 != -1) {
						arg1 += this.aByteArray34[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray253[local20];
					local69 = this.anIntArray250[local20];
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
						if (Static83.anInt1865 > 0) {
							Static83.anInt1863 += Static83.anInt1865;
							arg1 += Static83.anInt1863 >> 8;
							Static83.anInt1863 &= 0xFF;
						}
					} else if (Static83.anInt1861 == 256) {
						if (Static83.anInt1867 != -1) {
							Static83.method1325(this.aByteArrayArray6[local20], arg1 + this.anIntArray251[local20] + local78 + 1, local4 + this.anIntArray254[local20] + 1 + local89, local146, local69, Static83.anInt1867);
						}
						this.method1324(this.aByteArrayArray6[local20], arg1 + this.anIntArray251[local20] + local78, local4 + this.anIntArray254[local20] + local89, local146, local69, Static83.anInt1869);
					} else {
						if (Static83.anInt1867 != -1) {
							Static83.method1335(this.aByteArrayArray6[local20], arg1 + this.anIntArray251[local20] + local78 + 1, local4 + this.anIntArray254[local20] + 1 + local89, local146, local69, Static83.anInt1867, Static83.anInt1861);
						}
						this.method1313(this.aByteArrayArray6[local20], arg1 + this.anIntArray251[local20] + local78, local4 + this.anIntArray254[local20] + local89, local146, local69, Static83.anInt1869, Static83.anInt1861);
					}
					@Pc(313) int local313 = this.anIntArray252[local20];
					if (Static83.anInt1872 != -1) {
						Static46.method1833(arg1, local4 + (int) ((double) this.anInt1871 * 0.7D), local313, Static83.anInt1872);
					}
					if (Static83.anInt1866 != -1) {
						Static46.method1833(arg1, local4 + this.anInt1871, local313, Static83.anInt1866);
					}
					arg1 += local313;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;II)V")
	private void method1310(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1871;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2668; local10++) {
			@Pc(18) int local18 = arg0.aByteArray71[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class76 local38 = arg0.method1876(local10, local6 + 1);
					local6 = -1;
					if (local38.method1878(Static83.aClass76_806)) {
						local18 = 60;
					} else {
						if (!local38.method1878(Static83.aClass76_795)) {
							if (local38.method1869(Static83.aClass76_803)) {
								try {
									local68 = local38.method1874(4).method1884();
									@Pc(72) Class4_Sub4_Sub5_Sub4 local72 = Static83.aClass4_Sub4_Sub5_Sub4Array8[local68];
									local72.method1836(arg1, local4 + this.anInt1871 - local72.anInt2611);
									arg1 += local72.anInt2608;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method1314(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray34 != null && local8 != -1) {
						arg1 += this.aByteArray34[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray253[local18];
					local68 = this.anIntArray250[local18];
					if (local18 == 32) {
						if (Static83.anInt1865 > 0) {
							Static83.anInt1863 += Static83.anInt1865;
							arg1 += Static83.anInt1863 >> 8;
							Static83.anInt1863 &= 0xFF;
						}
					} else if (Static83.anInt1861 == 256) {
						if (Static83.anInt1867 != -1) {
							Static83.method1325(this.aByteArrayArray6[local18], arg1 + this.anIntArray251[local18] + 1, local4 + this.anIntArray254[local18] + 1, local121, local68, Static83.anInt1867);
						}
						this.method1324(this.aByteArrayArray6[local18], arg1 + this.anIntArray251[local18], local4 + this.anIntArray254[local18], local121, local68, Static83.anInt1869);
					} else {
						if (Static83.anInt1867 != -1) {
							Static83.method1335(this.aByteArrayArray6[local18], arg1 + this.anIntArray251[local18] + 1, local4 + this.anIntArray254[local18] + 1, local121, local68, Static83.anInt1867, Static83.anInt1861);
						}
						this.method1313(this.aByteArrayArray6[local18], arg1 + this.anIntArray251[local18], local4 + this.anIntArray254[local18], local121, local68, Static83.anInt1869, Static83.anInt1861);
					}
					@Pc(253) int local253 = this.anIntArray252[local18];
					if (Static83.anInt1872 != -1) {
						Static46.method1833(arg1, local4 + (int) ((double) this.anInt1871 * 0.7D), local253, Static83.anInt1872);
					}
					if (Static83.anInt1866 != -1) {
						Static46.method1833(arg1, local4 + this.anInt1871 + 1, local253, Static83.anInt1866);
					}
					arg1 += local253;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;IIII)V")
	public final void method1311(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1322(arg3, arg4);
			this.method1310(arg0, arg1 - this.method1317(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIIII)V")
	protected abstract void method1313(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;)V")
	private void method1314(@OriginalArg(0) Class76 arg0) {
		try {
			if (arg0.method1869(Static83.aClass76_797)) {
				Static83.anInt1869 = arg0.method1874(4).method1850(16);
				return;
			}
			if (arg0.method1878(Static83.aClass76_804)) {
				Static83.anInt1869 = Static83.anInt1870;
				return;
			}
			if (arg0.method1869(Static83.aClass76_805)) {
				Static83.anInt1872 = arg0.method1874(4).method1850(16);
				return;
			}
			if (arg0.method1878(Static83.aClass76_807)) {
				Static83.anInt1872 = 8388608;
				return;
			}
			if (arg0.method1878(Static83.aClass76_802)) {
				Static83.anInt1872 = -1;
				return;
			}
			if (arg0.method1869(Static83.aClass76_799)) {
				Static83.anInt1866 = arg0.method1874(2).method1850(16);
				return;
			}
			if (arg0.method1878(Static83.aClass76_794)) {
				Static83.anInt1866 = 0;
				return;
			}
			if (arg0.method1878(Static83.aClass76_793)) {
				Static83.anInt1866 = -1;
				return;
			}
			if (arg0.method1869(Static83.aClass76_798)) {
				Static83.anInt1867 = arg0.method1874(5).method1850(16);
				return;
			}
			if (arg0.method1878(Static83.aClass76_801)) {
				Static83.anInt1867 = 0;
				return;
			}
			if (arg0.method1878(Static83.aClass76_796)) {
				Static83.anInt1867 = Static83.anInt1868;
				return;
			}
			if (arg0.method1878(Static83.aClass76_800)) {
				this.method1322(Static83.anInt1870, Static83.anInt1868);
				return;
			}
		} catch (@Pc(122) Exception local122) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;IIIII)V")
	public final void method1315(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1322(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2668];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2668; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1308(arg0, arg1 - this.method1317(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!v;IIIII)V")
	public final void method1316(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method1322(16777215, 0);
		Static83.aRandom2.setSeed((long) arg3);
		Static83.anInt1861 = (Static83.aRandom2.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt2668];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2668; local25++) {
			local21[local25] = local23;
			if ((Static83.aRandom2.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1308(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!v;)I")
	public final int method1317(@OriginalArg(0) Class76 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2668; local11++) {
			@Pc(19) int local19 = arg0.aByteArray71[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class76 local39 = arg0.method1876(local11, local5 + 1);
					local5 = -1;
					if (local39.method1878(Static83.aClass76_806)) {
						local19 = 60;
					} else {
						if (!local39.method1878(Static83.aClass76_795)) {
							if (local39.method1869(Static83.aClass76_803)) {
								try {
									@Pc(69) int local69 = local39.method1874(4).method1884();
									local9 += Static83.aClass4_Sub4_Sub5_Sub4Array8[local69].anInt2608;
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
					local9 += this.anIntArray252[local19];
					if (this.aByteArray34 != null && local7 != -1) {
						local9 += this.aByteArray34[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;I)I")
	public final int method1318(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		return this.method1326(arg0, new int[] { arg1 }, Static83.aClass76Array19);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
	private void method1320(@OriginalArg(0) byte[] arg0) {
		this.anIntArray252 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray252.length; local9++) {
				this.anIntArray252[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1871 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray252[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray34 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray34[(local182 << 8) + local150] = (byte) Static83.method1312(local93, local136, local58, this.anIntArray252, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1871 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;IIIIII)V")
	public final void method1321(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1322(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2668];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2668; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1308(arg0, arg1 - this.method1317(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	private void method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static83.anInt1872 = -1;
		Static83.anInt1866 = -1;
		Static83.anInt1868 = arg1;
		Static83.anInt1867 = arg1;
		Static83.anInt1870 = arg0;
		Static83.anInt1869 = arg0;
		Static83.anInt1861 = 256;
		Static83.anInt1865 = 0;
		Static83.anInt1863 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!v;I)V")
	private void method1323(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1851(); local5++) {
			@Pc(11) int local11 = arg0.method1860(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static83.anInt1865 = (arg1 - this.method1317(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIII)V")
	protected abstract void method1324(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;[I[Lclient!v;)I")
	private int method1326(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class76[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class76 local11 = Static52.method942(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1851();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1860(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class76 local55 = arg0.method1876(local29, local19 + 1);
					local19 = -1;
					local11.method1888(60);
					local11.method1856(local55);
					local11.method1888(62);
					if (local55.method1878(Static83.aClass76_800)) {
						arg2[local23++] = local11.method1876(local11.method1851(), local7);
						local7 = local11.method1851();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1878(Static83.aClass76_806)) {
						local5 += this.method1332(60);
						if (this.aByteArray34 != null && local21 != -1) {
							local5 += this.aByteArray34[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1878(Static83.aClass76_795)) {
						local5 += this.method1332(62);
						if (this.aByteArray34 != null && local21 != -1) {
							local5 += this.aByteArray34[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1869(Static83.aClass76_803)) {
						try {
							@Pc(173) int local173 = local55.method1874(4).method1884();
							local5 += Static83.aClass4_Sub4_Sub5_Sub4Array8[local173].anInt2608;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1888(local35);
						local5 += this.method1332(local35);
						if (this.aByteArray34 != null && local21 != -1) {
							local5 += this.aByteArray34[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1851();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1876(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1851();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1851() > local7) {
			arg2[local23++] = local11.method1876(local11.method1851(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!v;IIIIIIIII)I")
	public final int method1327(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1322(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt1871;
		}
		@Pc(19) int[] local19 = new int[] { arg3 };
		if (arg4 < this.anInt1862 + this.anInt1864 + arg9 && arg4 < arg9 + arg9) {
			local19 = null;
		}
		@Pc(41) int local41 = this.method1326(arg0, local19, Static83.aClass76Array19);
		if (arg8 == 3 && local41 == 1) {
			arg8 = 1;
		}
		@Pc(56) int local56;
		@Pc(117) int local117;
		if (arg8 == 0) {
			local56 = arg2 + this.anInt1862;
		} else if (arg8 == 1) {
			local56 = arg2 + this.anInt1862 + (arg4 - this.anInt1862 - this.anInt1864 - (local41 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local56 = arg2 + arg4 - this.anInt1864 - (local41 - 1) * arg9;
		} else {
			local117 = (arg4 - this.anInt1862 - this.anInt1864 - (local41 - 1) * arg9) / (local41 + 1);
			if (local117 < 0) {
				local117 = 0;
			}
			local56 = arg2 + this.anInt1862 + local117;
			arg9 += local117;
		}
		for (local117 = 0; local117 < local41; local117++) {
			if (arg7 == 0) {
				this.method1310(Static83.aClass76Array19[local117], arg1, local56);
			} else if (arg7 == 1) {
				this.method1310(Static83.aClass76Array19[local117], arg1 + (arg3 - this.method1317(Static83.aClass76Array19[local117])) / 2, local56);
			} else if (arg7 == 2) {
				this.method1310(Static83.aClass76Array19[local117], arg1 + arg3 - this.method1317(Static83.aClass76Array19[local117]), local56);
			} else if (local117 == local41 - 1) {
				this.method1310(Static83.aClass76Array19[local117], arg1, local56);
			} else {
				this.method1323(Static83.aClass76Array19[local117], arg3);
				this.method1310(Static83.aClass76Array19[local117], arg1, local56);
				Static83.anInt1865 = 0;
			}
			local56 += arg9;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!v;I)I")
	public final int method1329(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1326(arg0, new int[] { arg1 }, Static83.aClass76Array19);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1317(Static83.aClass76Array19[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!v;IIII)V")
	public final void method1331(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1322(arg3, arg4);
			this.method1310(arg0, arg1 - this.method1317(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
	private int method1332(@OriginalArg(0) int arg0) {
		return this.anIntArray252[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!v;IIIII)V")
	public final void method1333(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1322(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2668];
		@Pc(14) int[] local14 = new int[arg0.anInt2668];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2668; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1308(arg0, arg1 - this.method1317(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!v;IIII)V")
	public final void method1334(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1322(arg3, arg4);
			this.method1310(arg0, arg1, arg2);
		}
	}
}
