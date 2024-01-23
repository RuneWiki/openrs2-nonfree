import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public abstract class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "[Lclient!ag;")
	private Class7[] aClass7Array3;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
	public int anInt2509 = 0;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub2_Sub7(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray183 = arg1;
		this.anIntArray186 = arg2;
		this.anIntArray188 = arg3;
		this.anIntArray187 = arg4;
		this.method1936(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray186[local25] < local21 && this.anIntArray187[local25] != 0) {
				local21 = this.anIntArray186[local25];
			}
			if (this.anIntArray186[local25] + this.anIntArray187[local25] > local23) {
				local23 = this.anIntArray186[local25] + this.anIntArray187[local25];
			}
		}
		this.anInt2519 = this.anInt2509 - local21;
		this.anInt2510 = local23 - this.anInt2509;
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) byte[] arg0) {
		this.method1936(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public final int method1918(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1926(arg0, new int[] { arg1 }, Static78.aStringArray16);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1922(Static78.aStringArray16[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	private void method1919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static78.anInt2520 = -1;
		Static78.anInt2515 = -1;
		Static78.anInt2511 = arg1;
		Static78.anInt2521 = arg1;
		Static78.anInt2513 = arg0;
		Static78.anInt2516 = arg0;
		Static78.anInt2514 = arg2;
		Static78.anInt2518 = arg2;
		Static78.anInt2517 = 0;
		Static78.anInt2512 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method1920(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt2509;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(18) char local18 = arg0.charAt(local13);
			if (local18 == '<') {
				local6 = local13;
			} else {
				@Pc(105) int local105;
				if (local18 == '>' && local6 != -1) {
					@Pc(37) String local37 = arg0.substring(local6 + 1, local13);
					local6 = -1;
					if (local37.equals("lt")) {
						local18 = '<';
					} else if (local37.equals("gt")) {
						local18 = '>';
					} else if (local37.equals("nbsp")) {
						local18 = ' ';
					} else if (local37.equals("shy")) {
						local18 = '\u00ad';
					} else if (local37.equals("times")) {
						local18 = '×';
					} else if (local37.equals("euro")) {
						local18 = '€';
					} else if (local37.equals("copy")) {
						local18 = '©';
					} else {
						if (!local37.equals("reg")) {
							if (local37.startsWith("img=")) {
								try {
									local105 = Static195.method3280(local37.substring(4));
									@Pc(110) Class7 local110 = this.aClass7Array3[local105];
									@Pc(121) int local121 = this.anIntArray185 == null ? local110.anInt2105 : this.anIntArray185[local105];
									if (Static78.anInt2518 == 256) {
										local110.method1521(arg1, local4 + this.anInt2509 - local121);
									} else {
										local110.method1520(arg1, local4 + this.anInt2509 - local121, Static78.anInt2518);
									}
									arg1 += local110.anInt2102;
									local8 = '\u0000';
								} catch (@Pc(153) Exception local153) {
								}
							} else {
								this.method1938(local37);
							}
							continue;
						}
						local18 = '®';
					}
				}
				if (local6 == -1) {
					local18 = (char) (Static158.method2804(local18) & 0xFF);
					if (this.aByteArray31 != null && local8 != '\u0000') {
						arg1 += this.aByteArray31[(local8 << 8) + local18];
					}
					@Pc(189) int local189 = this.anIntArray188[local18];
					local105 = this.anIntArray187[local18];
					if (local18 == ' ') {
						if (Static78.anInt2517 > 0) {
							Static78.anInt2512 += Static78.anInt2517;
							arg1 += Static78.anInt2512 >> 8;
							Static78.anInt2512 &= 0xFF;
						}
					} else if (Static78.anInt2518 == 256) {
						if (Static78.anInt2521 != -1) {
							this.method1921(local18, arg1 + this.anIntArray183[local18] + 1, local4 + this.anIntArray186[local18] + 1, local189, local105, Static78.anInt2521);
						}
						this.method1921(local18, arg1 + this.anIntArray183[local18], local4 + this.anIntArray186[local18], local189, local105, Static78.anInt2516);
					} else {
						if (Static78.anInt2521 != -1) {
							this.method1924(local18, arg1 + this.anIntArray183[local18] + 1, local4 + this.anIntArray186[local18] + 1, local189, local105, Static78.anInt2521, Static78.anInt2518);
						}
						this.method1924(local18, arg1 + this.anIntArray183[local18], local4 + this.anIntArray186[local18], local189, local105, Static78.anInt2516, Static78.anInt2518);
					}
					@Pc(315) int local315 = this.anIntArray184[local18];
					if (Static78.anInt2520 != -1) {
						Static189.method3188(arg1, local4 + (int) ((double) this.anInt2509 * 0.7D), local315, Static78.anInt2520);
					}
					if (Static78.anInt2515 != -1) {
						Static189.method3188(arg1, local4 + this.anInt2509 + 1, local315, Static78.anInt2515);
					}
					arg1 += local315;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method1921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;)I")
	public final int method1922(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) char local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(19) char local19 = arg0.charAt(local14);
			if (local19 == '<') {
				local5 = local14;
			} else {
				if (local19 == '>' && local5 != -1) {
					@Pc(38) String local38 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local38.equals("lt")) {
						local19 = '<';
					} else if (local38.equals("gt")) {
						local19 = '>';
					} else if (local38.equals("nbsp")) {
						local19 = ' ';
					} else if (local38.equals("shy")) {
						local19 = '\u00ad';
					} else if (local38.equals("times")) {
						local19 = '×';
					} else if (local38.equals("euro")) {
						local19 = '€';
					} else if (local38.equals("copy")) {
						local19 = '©';
					} else {
						if (!local38.equals("reg")) {
							if (local38.startsWith("img=")) {
								try {
									@Pc(106) int local106 = Static195.method3280(local38.substring(4));
									local9 += this.aClass7Array3[local106].anInt2102;
									local7 = '\u0000';
								} catch (@Pc(118) Exception local118) {
								}
							}
							continue;
						}
						local19 = '®';
					}
				}
				if (local5 == -1) {
					local19 = (char) (Static158.method2804(local19) & 0xFF);
					local9 += this.anIntArray184[local19];
					if (this.aByteArray31 != null && local7 != '\u0000') {
						local9 += this.aByteArray31[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method1923(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1943(arg3, arg4);
			this.method1920(arg0, arg1 - this.method1922(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method1925(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method1919(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg9.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		@Pc(44) int local44 = arg1;
		@Pc(49) int local49 = arg2 + this.anInt2519;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt2519 - this.anInt2510) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt2510;
		}
		if (arg7 == 1) {
			local51 = this.method1922(arg0) + local25;
			local44 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method1922(arg0) + local25;
			local44 = arg1 + arg3 - local51;
		}
		this.method1945(arg0, local44, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method1922(arg0) + local25;
			}
			arg11[0] = local44;
			arg11[1] = local49 - this.anInt2519;
			arg11[2] = local51;
			arg11[3] = this.anInt2519 + this.anInt2510;
		}
		return local25;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method1926(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static28.method577(Static78.aStringBuffer2);
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
			@Pc(35) char local35 = arg0.charAt(local30);
			if (local35 == '<') {
				local21 = local30;
			} else {
				if (local35 == '>' && local21 != -1) {
					@Pc(54) String local54 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					Static78.aStringBuffer2.append('<');
					Static78.aStringBuffer2.append(local54);
					Static78.aStringBuffer2.append('>');
					if (local54.equals("br")) {
						arg2[local25] = Static78.aStringBuffer2.toString().substring(local13, Static78.aStringBuffer2.length());
						local25++;
						local13 = Static78.aStringBuffer2.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local54.equals("lt")) {
						local11 += this.method1941('<');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local54.equals("gt")) {
						local11 += this.method1941('>');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local54.equals("nbsp")) {
						local11 += this.method1941(' ');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local54.equals("shy")) {
						local11 += this.method1941('\u00ad');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local54.equals("times")) {
						local11 += this.method1941('×');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local54.equals("euro")) {
						local11 += this.method1941('€');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local54.equals("copy")) {
						local11 += this.method1941('©');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local54.equals("reg")) {
						local11 += this.method1941('®');
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local54.startsWith("img=")) {
						try {
							@Pc(334) int local334 = Static195.method3280(local54.substring(4));
							local11 += this.aClass7Array3[local334].anInt2102;
							local23 = '\u0000';
						} catch (@Pc(346) Exception local346) {
						}
					}
					local35 = '\u0000';
				}
				if (local21 == -1) {
					if (local35 != '\u0000') {
						Static78.aStringBuffer2.append(local35);
						local35 = (char) (Static158.method2804(local35) & 0xFF);
						local11 += this.anIntArray184[local35];
						if (this.aByteArray31 != null && local23 != '\u0000') {
							local11 += this.aByteArray31[(local23 << 8) + local35];
						}
						local23 = local35;
					}
					if (local35 == ' ') {
						local15 = Static78.aStringBuffer2.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static78.aStringBuffer2.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local35 == '-') {
						local15 = Static78.aStringBuffer2.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static78.aStringBuffer2.length() > local13) {
			arg2[local25] = Static78.aStringBuffer2.toString().substring(local13, Static78.aStringBuffer2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method1927(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1943(arg3, arg4);
			this.method1920(arg0, arg1 - this.method1922(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int method1928(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method1926(arg0, new int[] { arg1 }, Static78.aStringArray16);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method1929(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1919(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt2509;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt2519 + this.anInt2510 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1926(arg0, local20, Static78.aStringArray16);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt2519;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt2519 + (arg4 - this.anInt2519 - this.anInt2510 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt2510 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt2519 - this.anInt2510 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt2519 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1920(Static78.aStringArray16[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1920(Static78.aStringArray16[local118], arg1 + (arg3 - this.method1922(Static78.aStringArray16[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1920(Static78.aStringArray16[local118], arg1 + arg3 - this.method1922(Static78.aStringArray16[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1920(Static78.aStringArray16[local118], arg1, local57);
			} else {
				this.method1942(Static78.aStringArray16[local118], arg3);
				this.method1920(Static78.aStringArray16[local118], arg1, local57);
				Static78.anInt2517 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method1930(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1929(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method1931(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1943(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1945(arg0, arg1 - this.method1922(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method1932(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1943(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1945(arg0, arg1 - this.method1922(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method1934(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1943(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4) * local13);
		}
		this.method1945(arg0, arg1 - this.method1922(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method1935(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1919(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method1945(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([B)V")
	private void method1936(@OriginalArg(0) byte[] arg0) {
		this.anIntArray184 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray184.length; local9++) {
				this.anIntArray184[local9] = arg0[local9] & 0xFF;
			}
			this.anInt2509 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray184[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray31 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray31[(local182 << 8) + local150] = (byte) Static78.method1933(local93, local136, local58, this.anIntArray184, local55, local182, local150);
					}
				}
			}
		}
		this.anInt2509 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([Lclient!ag;[I)V")
	public final void method1937(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass7Array3 = arg0;
		this.anIntArray185 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method1938(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static78.anInt2516 = Static148.method218(arg0.substring(4));
				return;
			}
			if (arg0.equals("/col")) {
				Static78.anInt2516 = Static78.anInt2513;
				return;
			}
			if (arg0.startsWith("trans=")) {
				Static78.anInt2518 = Static195.method3280(arg0.substring(6));
				return;
			}
			if (arg0.equals("/trans")) {
				Static78.anInt2518 = Static78.anInt2514;
				return;
			}
			if (arg0.startsWith("str=")) {
				Static78.anInt2520 = Static148.method218(arg0.substring(4));
				return;
			}
			if (arg0.equals("str")) {
				Static78.anInt2520 = 8388608;
				return;
			}
			if (arg0.equals("/str")) {
				Static78.anInt2520 = -1;
				return;
			}
			if (arg0.startsWith("u=")) {
				Static78.anInt2515 = Static148.method218(arg0.substring(2));
				return;
			}
			if (arg0.equals("u")) {
				Static78.anInt2515 = 0;
				return;
			}
			if (arg0.equals("/u")) {
				Static78.anInt2515 = -1;
				return;
			}
			if (arg0.startsWith("shad=")) {
				Static78.anInt2521 = Static148.method218(arg0.substring(5));
				return;
			}
			if (arg0.equals("shad")) {
				Static78.anInt2521 = 0;
				return;
			}
			if (arg0.equals("/shad")) {
				Static78.anInt2521 = Static78.anInt2511;
				return;
			}
			if (arg0.equals("br")) {
				this.method1919(Static78.anInt2513, Static78.anInt2511, Static78.anInt2514);
				return;
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method1940(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1943(arg3, arg4);
			this.method1920(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(C)I")
	private int method1941(@OriginalArg(0) char arg0) {
		return this.anIntArray184[Static158.method2804(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Ljava/lang/String;I)V")
	private void method1942(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(13) char local13 = arg0.charAt(local8);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			Static78.anInt2517 = (arg1 - this.method1922(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	private void method1943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static78.anInt2520 = -1;
		Static78.anInt2515 = -1;
		Static78.anInt2511 = arg1;
		Static78.anInt2521 = arg1;
		Static78.anInt2513 = arg0;
		Static78.anInt2516 = arg0;
		Static78.anInt2514 = 256;
		Static78.anInt2518 = 256;
		Static78.anInt2517 = 0;
		Static78.anInt2512 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method1945(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2509;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 == '<') {
				local6 = local15;
			} else {
				@Pc(107) int local107;
				@Pc(116) int local116;
				@Pc(126) int local126;
				if (local20 == '>' && local6 != -1) {
					@Pc(39) String local39 = arg0.substring(local6 + 1, local15);
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
									if (arg3 == null) {
										local107 = 0;
									} else {
										local107 = arg3[local10];
									}
									if (arg4 == null) {
										local116 = 0;
									} else {
										local116 = arg4[local10];
									}
									local10++;
									local126 = Static195.method3280(local39.substring(4));
									@Pc(131) Class7 local131 = this.aClass7Array3[local126];
									@Pc(142) int local142 = this.anIntArray185 == null ? local131.anInt2105 : this.anIntArray185[local126];
									if (Static78.anInt2518 == 256) {
										local131.method1521(arg1 + local107, local4 + this.anInt2509 - local142 + local116);
									} else {
										local131.method1520(arg1 + local107, local4 + this.anInt2509 - local142 + local116, Static78.anInt2518);
									}
									arg1 += local131.anInt2102;
									local8 = '\u0000';
								} catch (@Pc(182) Exception local182) {
								}
							} else {
								this.method1938(local39);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					local20 = (char) (Static158.method2804(local20) & 0xFF);
					if (this.aByteArray31 != null && local8 != '\u0000') {
						arg1 += this.aByteArray31[(local8 << 8) + local20];
					}
					@Pc(218) int local218 = this.anIntArray188[local20];
					local107 = this.anIntArray187[local20];
					if (arg3 == null) {
						local116 = 0;
					} else {
						local116 = arg3[local10];
					}
					if (arg4 == null) {
						local126 = 0;
					} else {
						local126 = arg4[local10];
					}
					local10++;
					if (local20 == ' ') {
						if (Static78.anInt2517 > 0) {
							Static78.anInt2512 += Static78.anInt2517;
							arg1 += Static78.anInt2512 >> 8;
							Static78.anInt2512 &= 0xFF;
						}
					} else if (Static78.anInt2518 == 256) {
						if (Static78.anInt2521 != -1) {
							this.method1921(local20, arg1 + this.anIntArray183[local20] + local116 + 1, local4 + this.anIntArray186[local20] + 1 + local126, local218, local107, Static78.anInt2521);
						}
						this.method1921(local20, arg1 + this.anIntArray183[local20] + local116, local4 + this.anIntArray186[local20] + local126, local218, local107, Static78.anInt2516);
					} else {
						if (Static78.anInt2521 != -1) {
							this.method1924(local20, arg1 + this.anIntArray183[local20] + local116 + 1, local4 + this.anIntArray186[local20] + 1 + local126, local218, local107, Static78.anInt2521, Static78.anInt2518);
						}
						this.method1924(local20, arg1 + this.anIntArray183[local20] + local116, local4 + this.anIntArray186[local20] + local126, local218, local107, Static78.anInt2516, Static78.anInt2518);
					}
					@Pc(379) int local379 = this.anIntArray184[local20];
					if (Static78.anInt2520 != -1) {
						Static189.method3188(arg1, local4 + (int) ((double) this.anInt2509 * 0.7D), local379, Static78.anInt2520);
					}
					if (Static78.anInt2515 != -1) {
						Static189.method3188(arg1, local4 + this.anInt2509, local379, Static78.anInt2515);
					}
					arg1 += local379;
					local8 = local20;
				}
			}
		}
	}
}
