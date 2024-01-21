import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public abstract class Class4_Sub1_Sub2_Sub4 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!ob", name = "sb", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
	public int anInt2120 = 0;

	@OriginalMember(owner = "client!ob", name = "xb", descriptor = "[[B")
	private byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	private int anInt2116;

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
	private int anInt2121;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class4_Sub1_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray215 = arg1;
		this.anIntArray216 = arg2;
		this.anIntArray214 = arg3;
		this.anIntArray218 = arg4;
		this.method1397(arg0);
		this.aByteArrayArray7 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray216[local32] < local28 && this.anIntArray218[local32] != 0) {
				local28 = this.anIntArray216[local32];
			}
			if (this.anIntArray216[local32] + this.anIntArray218[local32] > local30) {
				local30 = this.anIntArray216[local32] + this.anIntArray218[local32];
			}
		}
		this.anInt2116 = this.anInt2120 - local28;
		this.anInt2121 = local30 - this.anInt2120;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.method1397(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;IIIIIIIII)I")
	public final int method1391(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1404(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt2120;
		}
		@Pc(19) int[] local19 = new int[] { arg3 };
		if (arg4 < this.anInt2116 + this.anInt2121 + arg9 && arg4 < arg9 + arg9) {
			local19 = null;
		}
		@Pc(41) int local41 = this.method1405(arg0, local19, Static81.aClass22Array16);
		if (arg8 == 3 && local41 == 1) {
			arg8 = 1;
		}
		@Pc(56) int local56;
		@Pc(117) int local117;
		if (arg8 == 0) {
			local56 = arg2 + this.anInt2116;
		} else if (arg8 == 1) {
			local56 = arg2 + this.anInt2116 + (arg4 - this.anInt2116 - this.anInt2121 - (local41 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local56 = arg2 + arg4 - this.anInt2121 - (local41 - 1) * arg9;
		} else {
			local117 = (arg4 - this.anInt2116 - this.anInt2121 - (local41 - 1) * arg9) / (local41 + 1);
			if (local117 < 0) {
				local117 = 0;
			}
			local56 = arg2 + this.anInt2116 + local117;
			arg9 += local117;
		}
		for (local117 = 0; local117 < local41; local117++) {
			if (arg7 == 0) {
				this.method1409(Static81.aClass22Array16[local117], arg1, local56);
			} else if (arg7 == 1) {
				this.method1409(Static81.aClass22Array16[local117], arg1 + (arg3 - this.method1392(Static81.aClass22Array16[local117])) / 2, local56);
			} else if (arg7 == 2) {
				this.method1409(Static81.aClass22Array16[local117], arg1 + arg3 - this.method1392(Static81.aClass22Array16[local117]), local56);
			} else if (local117 == local41 - 1) {
				this.method1409(Static81.aClass22Array16[local117], arg1, local56);
			} else {
				this.method1395(Static81.aClass22Array16[local117], arg3);
				this.method1409(Static81.aClass22Array16[local117], arg1, local56);
				Static81.anInt2117 = 0;
			}
			local56 += arg9;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;)I")
	public final int method1392(@OriginalArg(0) Class22 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt668; local11++) {
			@Pc(19) int local19 = arg0.aByteArray7[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class22 local39 = arg0.method450(local5 + 1, local11);
					local5 = -1;
					if (local39.method481(Static81.aClass22_601)) {
						local19 = 60;
					} else {
						if (!local39.method481(Static81.aClass22_605)) {
							if (local39.method471(Static81.aClass22_598)) {
								try {
									@Pc(69) int local69 = local39.method477(4).method470();
									local9 += Static81.aClass4_Sub1_Sub2_Sub3Array7[local69].anInt1208;
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
					local9 += this.anIntArray217[local19];
					if (this.aByteArray29 != null && local7 != -1) {
						local9 += this.aByteArray29[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;I)V")
	private void method1395(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method449(); local5++) {
			@Pc(11) int local11 = arg0.method469(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static81.anInt2117 = (arg1 - this.method1392(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIIII)V")
	protected abstract void method1396(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([B)V")
	private void method1397(@OriginalArg(0) byte[] arg0) {
		this.anIntArray217 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray217.length; local9++) {
				this.anIntArray217[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2120 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray217[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray29 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray29[(local182 << 8) + local150] = (byte) Static81.method1418(local93, local136, local58, this.anIntArray217, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2120 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!ec;I)I")
	public final int method1398(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		return this.method1405(arg0, new int[] { arg1 }, Static81.aClass22Array16);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
	private int method1399(@OriginalArg(0) int arg0) {
		return this.anIntArray217[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;IIII)V")
	public final void method1400(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1404(arg3, arg4);
			this.method1409(arg0, arg1 - this.method1392(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;IIIII)V")
	public final void method1402(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method1404(16777215, 0);
		Static81.aRandom2.setSeed((long) arg3);
		Static81.anInt2124 = (Static81.aRandom2.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt668];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt668; local25++) {
			local21[local25] = local23;
			if ((Static81.aRandom2.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1403(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;II[I[I)V")
	private void method1403(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2120;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt668; local12++) {
			@Pc(20) int local20 = arg0.aByteArray7[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class22 local40 = arg0.method450(local6 + 1, local12);
					local6 = -1;
					if (local40.method481(Static81.aClass22_601)) {
						local20 = 60;
					} else {
						if (!local40.method481(Static81.aClass22_605)) {
							if (local40.method471(Static81.aClass22_598)) {
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
									local89 = local40.method477(4).method470();
									@Pc(93) Class4_Sub1_Sub2_Sub3 local93 = Static81.aClass4_Sub1_Sub2_Sub3Array7[local89];
									local93.method853(arg1 + local69, local4 + this.anInt2120 - local93.anInt1207 + local78);
									arg1 += local93.anInt1208;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method1407(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray29 != null && local8 != -1) {
						arg1 += this.aByteArray29[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray214[local20];
					local69 = this.anIntArray218[local20];
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
						if (Static81.anInt2117 > 0) {
							Static81.anInt2125 += Static81.anInt2117;
							arg1 += Static81.anInt2125 >> 8;
							Static81.anInt2125 &= 0xFF;
						}
					} else if (Static81.anInt2124 == 256) {
						if (Static81.anInt2118 != -1) {
							Static81.method1394(this.aByteArrayArray7[local20], arg1 + this.anIntArray215[local20] + local78 + 1, local4 + this.anIntArray216[local20] + 1 + local89, local146, local69, Static81.anInt2118);
						}
						this.method1410(this.aByteArrayArray7[local20], arg1 + this.anIntArray215[local20] + local78, local4 + this.anIntArray216[local20] + local89, local146, local69, Static81.anInt2127);
					} else {
						if (Static81.anInt2118 != -1) {
							Static81.method1408(this.aByteArrayArray7[local20], arg1 + this.anIntArray215[local20] + local78 + 1, local4 + this.anIntArray216[local20] + 1 + local89, local146, local69, Static81.anInt2118, Static81.anInt2124);
						}
						this.method1396(this.aByteArrayArray7[local20], arg1 + this.anIntArray215[local20] + local78, local4 + this.anIntArray216[local20] + local89, local146, local69, Static81.anInt2127, Static81.anInt2124);
					}
					@Pc(313) int local313 = this.anIntArray217[local20];
					if (Static81.anInt2123 != -1) {
						Static118.method1383(arg1, local4 + (int) ((double) this.anInt2120 * 0.7D), local313, Static81.anInt2123);
					}
					if (Static81.anInt2122 != -1) {
						Static118.method1383(arg1, local4 + this.anInt2120, local313, Static81.anInt2122);
					}
					arg1 += local313;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
	private void method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static81.anInt2123 = -1;
		Static81.anInt2122 = -1;
		Static81.anInt2126 = arg1;
		Static81.anInt2118 = arg1;
		Static81.anInt2119 = arg0;
		Static81.anInt2127 = arg0;
		Static81.anInt2124 = 256;
		Static81.anInt2117 = 0;
		Static81.anInt2125 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;[I[Lclient!ec;)I")
	private int method1405(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class22[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class22 local11 = Static53.method1004(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method449();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method469(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class22 local55 = arg0.method450(local19 + 1, local29);
					local19 = -1;
					local11.method482(60);
					local11.method452(local55);
					local11.method482(62);
					if (local55.method481(Static81.aClass22_611)) {
						arg2[local23++] = local11.method450(local7, local11.method449());
						local7 = local11.method449();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method481(Static81.aClass22_601)) {
						local5 += this.method1399(60);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method481(Static81.aClass22_605)) {
						local5 += this.method1399(62);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method471(Static81.aClass22_598)) {
						try {
							@Pc(173) int local173 = local55.method477(4).method470();
							local5 += Static81.aClass4_Sub1_Sub2_Sub3Array7[local173].anInt1208;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method482(local35);
						local5 += this.method1399(local35);
						if (this.aByteArray29 != null && local21 != -1) {
							local5 += this.aByteArray29[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method449();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method450(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method449();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method449() > local7) {
			arg2[local23++] = local11.method450(local7, local11.method449());
		}
		return local23;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!ec;IIIII)V")
	public final void method1406(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1404(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt668];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt668; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1403(arg0, arg1 - this.method1392(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!ec;)V")
	private void method1407(@OriginalArg(0) Class22 arg0) {
		try {
			if (arg0.method471(Static81.aClass22_599)) {
				Static81.anInt2127 = arg0.method477(4).method465(16);
				return;
			}
			if (arg0.method481(Static81.aClass22_604)) {
				Static81.anInt2127 = Static81.anInt2119;
				return;
			}
			if (arg0.method471(Static81.aClass22_607)) {
				Static81.anInt2123 = arg0.method477(4).method465(16);
				return;
			}
			if (arg0.method481(Static81.aClass22_608)) {
				Static81.anInt2123 = 8388608;
				return;
			}
			if (arg0.method481(Static81.aClass22_602)) {
				Static81.anInt2123 = -1;
				return;
			}
			if (arg0.method471(Static81.aClass22_603)) {
				Static81.anInt2122 = arg0.method477(2).method465(16);
				return;
			}
			if (arg0.method481(Static81.aClass22_609)) {
				Static81.anInt2122 = 0;
				return;
			}
			if (arg0.method481(Static81.aClass22_597)) {
				Static81.anInt2122 = -1;
				return;
			}
			if (arg0.method471(Static81.aClass22_600)) {
				Static81.anInt2118 = arg0.method477(5).method465(16);
				return;
			}
			if (arg0.method481(Static81.aClass22_610)) {
				Static81.anInt2118 = 0;
				return;
			}
			if (arg0.method481(Static81.aClass22_606)) {
				Static81.anInt2118 = Static81.anInt2126;
				return;
			}
			if (arg0.method481(Static81.aClass22_611)) {
				this.method1404(Static81.anInt2119, Static81.anInt2126);
				return;
			}
		} catch (@Pc(122) Exception local122) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method1409(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2120;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt668; local10++) {
			@Pc(18) int local18 = arg0.aByteArray7[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class22 local38 = arg0.method450(local6 + 1, local10);
					local6 = -1;
					if (local38.method481(Static81.aClass22_601)) {
						local18 = 60;
					} else {
						if (!local38.method481(Static81.aClass22_605)) {
							if (local38.method471(Static81.aClass22_598)) {
								try {
									local68 = local38.method477(4).method470();
									@Pc(72) Class4_Sub1_Sub2_Sub3 local72 = Static81.aClass4_Sub1_Sub2_Sub3Array7[local68];
									local72.method853(arg1, local4 + this.anInt2120 - local72.anInt1207);
									arg1 += local72.anInt1208;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method1407(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray29 != null && local8 != -1) {
						arg1 += this.aByteArray29[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray214[local18];
					local68 = this.anIntArray218[local18];
					if (local18 == 32) {
						if (Static81.anInt2117 > 0) {
							Static81.anInt2125 += Static81.anInt2117;
							arg1 += Static81.anInt2125 >> 8;
							Static81.anInt2125 &= 0xFF;
						}
					} else if (Static81.anInt2124 == 256) {
						if (Static81.anInt2118 != -1) {
							Static81.method1394(this.aByteArrayArray7[local18], arg1 + this.anIntArray215[local18] + 1, local4 + this.anIntArray216[local18] + 1, local121, local68, Static81.anInt2118);
						}
						this.method1410(this.aByteArrayArray7[local18], arg1 + this.anIntArray215[local18], local4 + this.anIntArray216[local18], local121, local68, Static81.anInt2127);
					} else {
						if (Static81.anInt2118 != -1) {
							Static81.method1408(this.aByteArrayArray7[local18], arg1 + this.anIntArray215[local18] + 1, local4 + this.anIntArray216[local18] + 1, local121, local68, Static81.anInt2118, Static81.anInt2124);
						}
						this.method1396(this.aByteArrayArray7[local18], arg1 + this.anIntArray215[local18], local4 + this.anIntArray216[local18], local121, local68, Static81.anInt2127, Static81.anInt2124);
					}
					@Pc(253) int local253 = this.anIntArray217[local18];
					if (Static81.anInt2123 != -1) {
						Static118.method1383(arg1, local4 + (int) ((double) this.anInt2120 * 0.7D), local253, Static81.anInt2123);
					}
					if (Static81.anInt2122 != -1) {
						Static118.method1383(arg1, local4 + this.anInt2120 + 1, local253, Static81.anInt2122);
					}
					arg1 += local253;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIII)V")
	protected abstract void method1410(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!ec;IIIII)V")
	public final void method1411(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1404(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt668];
		@Pc(14) int[] local14 = new int[arg0.anInt668];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt668; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1403(arg0, arg1 - this.method1392(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!ec;I)I")
	public final int method1413(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1405(arg0, new int[] { arg1 }, Static81.aClass22Array16);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1392(Static81.aClass22Array16[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ec;IIIIII)V")
	public final void method1414(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1404(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt668];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt668; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1403(arg0, arg1 - this.method1392(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!ec;IIII)V")
	public final void method1415(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1404(arg3, arg4);
			this.method1409(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Lclient!ec;IIII)V")
	public final void method1417(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1404(arg3, arg4);
			this.method1409(arg0, arg1 - this.method1392(arg0) / 2, arg2);
		}
	}
}
