import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public abstract class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "[Lclient!cf;")
	private Class23[] aClass23Array5;

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "[I")
	private int[] anIntArray406;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	public int anInt4589 = 0;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "[I")
	protected int[] anIntArray407;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "[I")
	protected int[] anIntArray410;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
	private int anInt4587;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub2_Sub6(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray405 = arg1;
		this.anIntArray408 = arg2;
		this.anIntArray407 = arg3;
		this.anIntArray410 = arg4;
		this.method4006(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray408[local25] < local21 && this.anIntArray410[local25] != 0) {
				local21 = this.anIntArray408[local25];
			}
			if (this.anIntArray408[local25] + this.anIntArray410[local25] > local23) {
				local23 = this.anIntArray408[local25] + this.anIntArray410[local25];
			}
		}
		this.anInt4588 = this.anInt4589 - local21;
		this.anInt4587 = local23 - this.anInt4589;
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) byte[] arg0) {
		this.method4006(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method4003(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method4005(arg3, arg4);
			this.method4011(arg0, arg1 - this.method4023(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method4004(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method4015(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)V")
	private void method4005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static78.anInt4595 = -1;
		Static78.anInt4597 = -1;
		Static78.anInt4599 = arg1;
		Static78.anInt4590 = arg1;
		Static78.anInt4598 = arg0;
		Static78.anInt4593 = arg0;
		Static78.anInt4594 = 256;
		Static78.anInt4591 = 256;
		Static78.anInt4592 = 0;
		Static78.anInt4596 = 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([B)V")
	private void method4006(@OriginalArg(0) byte[] arg0) {
		this.anIntArray406 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray406.length; local9++) {
				this.anIntArray406[local9] = arg0[local9] & 0xFF;
			}
			this.anInt4589 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray406[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		@Pc(60) int local60;
		for (local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (local60 = 0; local60 < 256; local60++) {
			local58[local60] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(109) int local109;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(107) byte local107 = 0;
			for (local109 = 0; local109 < local93[local95].length; local109++) {
				local107 += arg0[local9++];
				local93[local95][local109] = local107;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(138) int local138;
		for (local138 = 0; local138 < 256; local138++) {
			local136[local138] = new byte[local55[local138]];
			@Pc(150) byte local150 = 0;
			for (@Pc(152) int local152 = 0; local152 < local136[local138].length; local152++) {
				local150 += arg0[local9++];
				local136[local138][local152] = local150;
			}
		}
		this.aByteArray66 = new byte[65536];
		for (local138 = 0; local138 < 256; local138++) {
			if (local138 != 32 && local138 != 160) {
				for (local109 = 0; local109 < 256; local109++) {
					if (local109 != 32 && local109 != 160) {
						this.aByteArray66[(local138 << 8) + local109] = (byte) Static78.method4030(local93, local136, local58, this.anIntArray406, local55, local138, local109);
					}
				}
			}
		}
		this.anInt4589 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method4008(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method4005(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.method4024(arg0, arg1 - this.method4023(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public final int method4009(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.anInt4589;
		@Pc(15) int local15 = this.method4012(arg0, new int[] { 100 }, Static78.aStringArray36);
		@Pc(21) int local21 = (local15 - 1) * local4;
		return this.anInt4588 + local21 + this.anInt4587;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(C)I")
	private int method4010(@OriginalArg(0) char arg0) {
		return this.anIntArray406[Static174.method2942(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Ljava/lang/String;II)V")
	private void method4011(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt4589;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(20) char local20 = arg0.charAt(local13);
			if (local20 == '<') {
				local6 = local13;
			} else {
				@Pc(107) int local107;
				if (local20 == '>' && local6 != -1) {
					@Pc(39) String local39 = arg0.substring(local6 + 1, local13);
					local6 = -1;
					if (local39.equals("lt")) {
						local20 = '<';
					} else if (local39.equals("gt")) {
						local20 = '>';
					} else if (local39.equals("nbsp")) {
						local20 = ' ';
					} else if (local39.equals("shy")) {
						local20 = '\u00ad';
					} else if (local39.equals("times")) {
						local20 = '×';
					} else if (local39.equals("euro")) {
						local20 = '€';
					} else if (local39.equals("copy")) {
						local20 = '©';
					} else {
						if (!local39.equals("reg")) {
							if (local39.startsWith("img=")) {
								try {
									local107 = Static110.method1981(local39.substring(4));
									@Pc(112) Class23 local112 = this.aClass23Array5[local107];
									@Pc(123) int local123 = this.anIntArray409 == null ? local112.anInt4468 : this.anIntArray409[local107];
									if (Static78.anInt4591 == 256) {
										local112.method3909(arg1, local4 + this.anInt4589 - local123);
									} else {
										local112.method3907(arg1, local4 + this.anInt4589 - local123, Static78.anInt4591);
									}
									arg1 += local112.anInt4476;
									local8 = '\u0000';
								} catch (@Pc(155) Exception local155) {
								}
							} else {
								this.method4014(local39);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					local20 = (char) (Static174.method2942(local20) & 0xFF);
					if (this.aByteArray66 != null && local8 != '\u0000') {
						arg1 += this.aByteArray66[(local8 << 8) + local20];
					}
					@Pc(191) int local191 = this.anIntArray407[local20];
					local107 = this.anIntArray410[local20];
					if (local20 == ' ') {
						if (Static78.anInt4592 > 0) {
							Static78.anInt4596 += Static78.anInt4592;
							arg1 += Static78.anInt4596 >> 8;
							Static78.anInt4596 &= 0xFF;
						}
					} else if (Static78.anInt4591 == 256) {
						if (Static78.anInt4590 != -1) {
							this.method4017(local20, arg1 + this.anIntArray405[local20] + 1, local4 + this.anIntArray408[local20] + 1, local191, local107, Static78.anInt4590);
						}
						this.method4017(local20, arg1 + this.anIntArray405[local20], local4 + this.anIntArray408[local20], local191, local107, Static78.anInt4593);
					} else {
						if (Static78.anInt4590 != -1) {
							this.method4021(local20, arg1 + this.anIntArray405[local20] + 1, local4 + this.anIntArray408[local20] + 1, local191, local107, Static78.anInt4590, Static78.anInt4591);
						}
						this.method4021(local20, arg1 + this.anIntArray405[local20], local4 + this.anIntArray408[local20], local191, local107, Static78.anInt4593, Static78.anInt4591);
					}
					@Pc(317) int local317 = this.anIntArray406[local20];
					if (Static78.anInt4595 != -1) {
						if (Static156.aBoolean211) {
							Static119.method2127(arg1, local4 + (int) ((double) this.anInt4589 * 0.7D), local317, Static78.anInt4595);
						} else {
							Static25.method398(arg1, local4 + (int) ((double) this.anInt4589 * 0.7D), local317, Static78.anInt4595);
						}
					}
					if (Static78.anInt4597 != -1) {
						if (Static156.aBoolean211) {
							Static119.method2127(arg1, local4 + this.anInt4589 + 1, local317, Static78.anInt4597);
						} else {
							Static25.method398(arg1, local4 + this.anInt4589 + 1, local317, Static78.anInt4597);
						}
					}
					arg1 += local317;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method4012(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static142.method2459(Static78.aStringBuffer3);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) char local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(37) char local37 = arg0.charAt(local30);
			if (local37 == '<') {
				local21 = local30;
			} else {
				if (local37 == '>' && local21 != -1) {
					@Pc(56) String local56 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					Static78.aStringBuffer3.append('<');
					Static78.aStringBuffer3.append(local56);
					Static78.aStringBuffer3.append('>');
					if (local56.equals("br")) {
						arg2[local25] = Static78.aStringBuffer3.toString().substring(local13, Static78.aStringBuffer3.length());
						local25++;
						local13 = Static78.aStringBuffer3.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local56.equals("lt")) {
						local11 += this.method4010('<');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local56.equals("gt")) {
						local11 += this.method4010('>');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local56.equals("nbsp")) {
						local11 += this.method4010(' ');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local56.equals("shy")) {
						local11 += this.method4010('\u00ad');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local56.equals("times")) {
						local11 += this.method4010('×');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local56.equals("euro")) {
						local11 += this.method4010('€');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local56.equals("copy")) {
						local11 += this.method4010('©');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local56.equals("reg")) {
						local11 += this.method4010('®');
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local56.startsWith("img=")) {
						try {
							@Pc(336) int local336 = Static110.method1981(local56.substring(4));
							local11 += this.aClass23Array5[local336].anInt4476;
							local23 = '\u0000';
						} catch (@Pc(348) Exception local348) {
						}
					}
					local37 = '\u0000';
				}
				if (local21 == -1) {
					if (local37 != '\u0000') {
						Static78.aStringBuffer3.append(local37);
						local37 = (char) (Static174.method2942(local37) & 0xFF);
						local11 += this.anIntArray406[local37];
						if (this.aByteArray66 != null && local23 != '\u0000') {
							local11 += this.aByteArray66[(local23 << 8) + local37];
						}
						local23 = local37;
					}
					if (local37 == ' ') {
						local15 = Static78.aStringBuffer3.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static78.aStringBuffer3.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local37 == '-') {
						local15 = Static78.aStringBuffer3.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static78.aStringBuffer3.length() > local13) {
			arg2[local25] = Static78.aStringBuffer3.toString().substring(local13, Static78.aStringBuffer3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	private void method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static78.anInt4595 = -1;
		Static78.anInt4597 = -1;
		Static78.anInt4599 = arg1;
		Static78.anInt4590 = arg1;
		Static78.anInt4598 = arg0;
		Static78.anInt4593 = arg0;
		Static78.anInt4594 = arg2;
		Static78.anInt4591 = arg2;
		Static78.anInt4592 = 0;
		Static78.anInt4596 = 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method4014(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static78.anInt4593 = Static263.method4150(arg0.substring(4));
			} else if (arg0.equals("/col")) {
				Static78.anInt4593 = Static78.anInt4598;
			} else if (arg0.startsWith("trans=")) {
				Static78.anInt4591 = Static110.method1981(arg0.substring(6));
			} else if (arg0.equals("/trans")) {
				Static78.anInt4591 = Static78.anInt4594;
			} else if (arg0.startsWith("str=")) {
				Static78.anInt4595 = Static263.method4150(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static78.anInt4595 = 8388608;
			} else if (arg0.equals("/str")) {
				Static78.anInt4595 = -1;
			} else if (arg0.startsWith("u=")) {
				Static78.anInt4597 = Static263.method4150(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static78.anInt4597 = 0;
			} else if (arg0.equals("/u")) {
				Static78.anInt4597 = -1;
			} else if (arg0.startsWith("shad=")) {
				Static78.anInt4590 = Static263.method4150(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static78.anInt4590 = 0;
			} else if (arg0.equals("/shad")) {
				Static78.anInt4590 = Static78.anInt4599;
			} else if (arg0.equals("br")) {
				this.method4013(Static78.anInt4598, Static78.anInt4599, Static78.anInt4594);
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method4015(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method4013(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt4589;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt4588 + this.anInt4587 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method4012(arg0, local20, Static78.aStringArray36);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt4588;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt4588 + (arg4 - this.anInt4588 - this.anInt4587 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt4587 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt4588 - this.anInt4587 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt4588 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method4011(Static78.aStringArray36[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method4011(Static78.aStringArray36[local118], arg1 + (arg3 - this.method4023(Static78.aStringArray36[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method4011(Static78.aStringArray36[local118], arg1 + arg3 - this.method4023(Static78.aStringArray36[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method4011(Static78.aStringArray36[local118], arg1, local57);
			} else {
				this.method4029(Static78.aStringArray36[local118], arg3);
				this.method4011(Static78.aStringArray36[local118], arg1, local57);
				Static78.anInt4592 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method4016(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method4005(arg3, arg4);
			this.method4011(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method4017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method4018(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method4013(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27;
		for (local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg9.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		local27 = arg1;
		@Pc(49) int local49 = arg2 + this.anInt4588;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt4588 - this.anInt4587) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt4587;
		}
		if (arg7 == 1) {
			local51 = this.method4023(arg0) + local25;
			local27 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method4023(arg0) + local25;
			local27 = arg1 + arg3 - local51;
		}
		this.method4024(arg0, local27, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method4023(arg0) + local25;
			}
			arg11[0] = local27;
			arg11[1] = local49 - this.anInt4588;
			arg11[2] = local51;
			arg11[3] = this.anInt4588 + this.anInt4587;
		}
		return local25;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public final int method4020(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method4012(arg0, new int[] { arg1 }, Static78.aStringArray36);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.method4023(Static78.aStringArray36[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method4022(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method4005(arg3, arg4);
			this.method4011(arg0, arg1 - this.method4023(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Ljava/lang/String;)I")
	public final int method4023(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) char local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = ' ';
					} else if (local40.equals("shy")) {
						local21 = '\u00ad';
					} else if (local40.equals("times")) {
						local21 = '×';
					} else if (local40.equals("euro")) {
						local21 = '€';
					} else if (local40.equals("copy")) {
						local21 = '©';
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=")) {
								try {
									@Pc(108) int local108 = Static110.method1981(local40.substring(4));
									local9 += this.aClass23Array5[local108].anInt4476;
									local7 = '\u0000';
								} catch (@Pc(120) Exception local120) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local21 = (char) (Static174.method2942(local21) & 0xFF);
					local9 += this.anIntArray406[local21];
					if (this.aByteArray66 != null && local7 != '\u0000') {
						local9 += this.aByteArray66[(local7 << 8) + local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method4024(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt4589;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				@Pc(109) int local109;
				@Pc(118) int local118;
				@Pc(128) int local128;
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '€';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							if (local41.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local109 = 0;
									} else {
										local109 = arg3[local10];
									}
									if (arg4 == null) {
										local118 = 0;
									} else {
										local118 = arg4[local10];
									}
									local10++;
									local128 = Static110.method1981(local41.substring(4));
									@Pc(133) Class23 local133 = this.aClass23Array5[local128];
									@Pc(144) int local144 = this.anIntArray409 == null ? local133.anInt4468 : this.anIntArray409[local128];
									if (Static78.anInt4591 == 256) {
										local133.method3909(arg1 + local109, local4 + this.anInt4589 - local144 + local118);
									} else {
										local133.method3907(arg1 + local109, local4 + this.anInt4589 - local144 + local118, Static78.anInt4591);
									}
									arg1 += local133.anInt4476;
									local8 = '\u0000';
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method4014(local41);
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local22 = (char) (Static174.method2942(local22) & 0xFF);
					if (this.aByteArray66 != null && local8 != '\u0000') {
						arg1 += this.aByteArray66[(local8 << 8) + local22];
					}
					@Pc(220) int local220 = this.anIntArray407[local22];
					local109 = this.anIntArray410[local22];
					if (arg3 == null) {
						local118 = 0;
					} else {
						local118 = arg3[local10];
					}
					if (arg4 == null) {
						local128 = 0;
					} else {
						local128 = arg4[local10];
					}
					local10++;
					if (local22 == ' ') {
						if (Static78.anInt4592 > 0) {
							Static78.anInt4596 += Static78.anInt4592;
							arg1 += Static78.anInt4596 >> 8;
							Static78.anInt4596 &= 0xFF;
						}
					} else if (Static78.anInt4591 == 256) {
						if (Static78.anInt4590 != -1) {
							this.method4017(local22, arg1 + this.anIntArray405[local22] + local118 + 1, local4 + this.anIntArray408[local22] + 1 + local128, local220, local109, Static78.anInt4590);
						}
						this.method4017(local22, arg1 + this.anIntArray405[local22] + local118, local4 + this.anIntArray408[local22] + local128, local220, local109, Static78.anInt4593);
					} else {
						if (Static78.anInt4590 != -1) {
							this.method4021(local22, arg1 + this.anIntArray405[local22] + local118 + 1, local4 + this.anIntArray408[local22] + 1 + local128, local220, local109, Static78.anInt4590, Static78.anInt4591);
						}
						this.method4021(local22, arg1 + this.anIntArray405[local22] + local118, local4 + this.anIntArray408[local22] + local128, local220, local109, Static78.anInt4593, Static78.anInt4591);
					}
					@Pc(381) int local381 = this.anIntArray406[local22];
					if (Static78.anInt4595 != -1) {
						if (Static156.aBoolean211) {
							Static119.method2127(arg1, local4 + (int) ((double) this.anInt4589 * 0.7D), local381, Static78.anInt4595);
						} else {
							Static25.method398(arg1, local4 + (int) ((double) this.anInt4589 * 0.7D), local381, Static78.anInt4595);
						}
					}
					if (Static78.anInt4597 != -1) {
						if (Static156.aBoolean211) {
							Static119.method2127(arg1, local4 + this.anInt4589, local381, Static78.anInt4597);
						} else {
							Static25.method398(arg1, local4 + this.anInt4589, local381, Static78.anInt4597);
						}
					}
					arg1 += local381;
					local8 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int method4025(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method4012(arg0, new int[] { arg1 }, Static78.aStringArray36);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method4026(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4005(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4024(arg0, arg1 - this.method4023(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method4027(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4005(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4024(arg0, arg1 - this.method4023(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method4028(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method4013(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method4024(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Ljava/lang/String;I)V")
	private void method4029(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(15) char local15 = arg0.charAt(local8);
			if (local15 == '<') {
				local3 = true;
			} else if (local15 == '>') {
				local3 = false;
			} else if (!local3 && local15 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			Static78.anInt4592 = (arg1 - this.method4023(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!cf;[I)V")
	public final void method4031(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass23Array5 = arg0;
		this.anIntArray409 = arg1;
	}
}
