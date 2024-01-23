import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public abstract class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "[Lclient!qi;")
	private Class81[] aClass81Array4;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!bi", name = "W", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	public int anInt4400 = 0;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "[I")
	private int[] anIntArray486;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "[I")
	protected int[] anIntArray485;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "[I")
	protected int[] anIntArray489;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	public int anInt4399;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	private int anInt4406;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class3_Sub4_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray488 = arg1;
		this.anIntArray486 = arg2;
		this.anIntArray485 = arg3;
		this.anIntArray489 = arg4;
		this.method3709(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray486[local25] < local21 && this.anIntArray489[local25] != 0) {
				local21 = this.anIntArray486[local25];
			}
			if (this.anIntArray486[local25] + this.anIntArray489[local25] > local23) {
				local23 = this.anIntArray486[local25] + this.anIntArray489[local25];
			}
		}
		this.anInt4399 = this.anInt4400 - local21;
		this.anInt4406 = local23 - this.anInt4400;
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) byte[] arg0) {
		this.method3709(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method3684(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3704(arg3, arg4);
			this.method3701(arg0, arg1 - this.method3690(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method3685(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3704(arg3, arg4);
			this.method3701(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([Lclient!qi;[I)V")
	public final void method3686(@OriginalArg(0) Class81[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass81Array4 = arg0;
		this.anIntArray487 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method3687(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static278.method4204(Static24.aStringBuffer3);
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
					@Pc(57) String local57 = arg0.substring(local21 + 1, local30).toLowerCase();
					local21 = -1;
					Static24.aStringBuffer3.append('<');
					Static24.aStringBuffer3.append(local57);
					Static24.aStringBuffer3.append('>');
					if (local57.equals("br")) {
						arg2[local25] = Static24.aStringBuffer3.toString().substring(local13, Static24.aStringBuffer3.length());
						local25++;
						local13 = Static24.aStringBuffer3.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local57.equals("lt")) {
						local11 += this.method3706('<');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local57.equals("gt")) {
						local11 += this.method3706('>');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local57.equals("nbsp")) {
						local11 += this.method3706(' ');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local57.equals("shy")) {
						local11 += this.method3706('\u00ad');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local57.equals("times")) {
						local11 += this.method3706('×');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local57.equals("euro")) {
						local11 += this.method3706('€');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local57.equals("copy")) {
						local11 += this.method3706('©');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local57.equals("reg")) {
						local11 += this.method3706('®');
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local57.startsWith("img=")) {
						try {
							@Pc(337) int local337 = Static218.method3603(local57.substring(4));
							local11 += this.aClass81Array4[local337].anInt2802;
							local23 = '\u0000';
						} catch (@Pc(349) Exception local349) {
						}
					}
					local37 = '\u0000';
				}
				if (local21 == -1) {
					if (local37 != '\u0000') {
						Static24.aStringBuffer3.append(local37);
						local37 = (char) (Static120.method2007(local37) & 0xFF);
						local11 += this.anIntArray490[local37];
						if (this.aByteArray60 != null && local23 != '\u0000') {
							local11 += this.aByteArray60[(local23 << 8) + local37];
						}
						local23 = local37;
					}
					if (local37 == ' ') {
						local15 = Static24.aStringBuffer3.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static24.aStringBuffer3.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local37 == '-') {
						local15 = Static24.aStringBuffer3.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static24.aStringBuffer3.length() > local13) {
			arg2[local25] = Static24.aStringBuffer3.toString().substring(local13, Static24.aStringBuffer3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public final int method3688(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method3687(arg0, new int[] { arg1 }, Static24.aStringArray30);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.method3690(Static24.aStringArray30[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;)I")
	public final int method3690(@OriginalArg(0) String arg0) {
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
					@Pc(41) String local41 = arg0.substring(local5 + 1, local14).toLowerCase();
					local5 = -1;
					if (local41.equals("lt")) {
						local21 = '<';
					} else if (local41.equals("gt")) {
						local21 = '>';
					} else if (local41.equals("nbsp")) {
						local21 = ' ';
					} else if (local41.equals("shy")) {
						local21 = '\u00ad';
					} else if (local41.equals("times")) {
						local21 = '×';
					} else if (local41.equals("euro")) {
						local21 = '€';
					} else if (local41.equals("copy")) {
						local21 = '©';
					} else {
						if (!local41.equals("reg")) {
							if (local41.startsWith("img=")) {
								try {
									@Pc(109) int local109 = Static218.method3603(local41.substring(4));
									local9 += this.aClass81Array4[local109].anInt2802;
									local7 = '\u0000';
								} catch (@Pc(121) Exception local121) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local21 = (char) (Static120.method2007(local21) & 0xFF);
					local9 += this.anIntArray490[local21];
					if (this.aByteArray60 != null && local7 != '\u0000') {
						local9 += this.aByteArray60[(local7 << 8) + local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method3691(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static24.anInt4408 = Static99.method1587(arg0.substring(4));
			} else if (arg0.equals("/col")) {
				Static24.anInt4408 = Static24.anInt4410;
			} else if (arg0.startsWith("trans=")) {
				Static24.anInt4405 = Static218.method3603(arg0.substring(6));
			} else if (arg0.equals("/trans")) {
				Static24.anInt4405 = Static24.anInt4402;
			} else if (arg0.startsWith("str=")) {
				Static24.anInt4404 = Static99.method1587(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static24.anInt4404 = 8388608;
			} else if (arg0.equals("/str")) {
				Static24.anInt4404 = -1;
			} else if (arg0.startsWith("u=")) {
				Static24.anInt4409 = Static99.method1587(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static24.anInt4409 = 0;
			} else if (arg0.equals("/u")) {
				Static24.anInt4409 = -1;
			} else if (arg0.startsWith("shad=")) {
				Static24.anInt4407 = Static99.method1587(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static24.anInt4407 = 0;
			} else if (arg0.equals("/shad")) {
				Static24.anInt4407 = Static24.anInt4401;
			} else if (arg0.equals("br")) {
				this.method3702(Static24.anInt4410, Static24.anInt4401, Static24.anInt4402);
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public final int method3693(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.anInt4400;
		@Pc(15) int local15 = this.method3687(arg0, new int[] { 100 }, Static24.aStringArray30);
		@Pc(21) int local21 = (local15 - 1) * local4;
		return this.anInt4399 + local21 + this.anInt4406;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method3694(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method3711(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method3695(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3704(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3700(arg0, arg1 - this.method3690(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int method3696(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method3687(arg0, new int[] { arg1 }, Static24.aStringArray30);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Ljava/lang/String;I)V")
	private void method3697(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			Static24.anInt4403 = (arg1 - this.method3690(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method3698(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3704(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.method3700(arg0, arg1 - this.method3690(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method3699(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3704(arg3, arg4);
			this.method3701(arg0, arg1 - this.method3690(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method3700(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt4400;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				@Pc(110) int local110;
				@Pc(119) int local119;
				@Pc(129) int local129;
				if (local22 == '>' && local6 != -1) {
					@Pc(42) String local42 = arg0.substring(local6 + 1, local15).toLowerCase();
					local6 = -1;
					if (local42.equals("lt")) {
						local22 = '<';
					} else if (local42.equals("gt")) {
						local22 = '>';
					} else if (local42.equals("nbsp")) {
						local22 = ' ';
					} else if (local42.equals("shy")) {
						local22 = '\u00ad';
					} else if (local42.equals("times")) {
						local22 = '×';
					} else if (local42.equals("euro")) {
						local22 = '€';
					} else if (local42.equals("copy")) {
						local22 = '©';
					} else {
						if (!local42.equals("reg")) {
							if (local42.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local110 = 0;
									} else {
										local110 = arg3[local10];
									}
									if (arg4 == null) {
										local119 = 0;
									} else {
										local119 = arg4[local10];
									}
									local10++;
									local129 = Static218.method3603(local42.substring(4));
									@Pc(134) Class81 local134 = this.aClass81Array4[local129];
									@Pc(145) int local145 = this.anIntArray487 == null ? local134.anInt2795 : this.anIntArray487[local129];
									if (Static24.anInt4405 == 256) {
										local134.method2501(arg1 + local110, local4 + this.anInt4400 - local145 + local119);
									} else {
										local134.method2499(arg1 + local110, local4 + this.anInt4400 - local145 + local119, Static24.anInt4405);
									}
									arg1 += local134.anInt2802;
									local8 = '\u0000';
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method3691(local42);
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local22 = (char) (Static120.method2007(local22) & 0xFF);
					if (this.aByteArray60 != null && local8 != '\u0000') {
						arg1 += this.aByteArray60[(local8 << 8) + local22];
					}
					@Pc(221) int local221 = this.anIntArray485[local22];
					local110 = this.anIntArray489[local22];
					if (arg3 == null) {
						local119 = 0;
					} else {
						local119 = arg3[local10];
					}
					if (arg4 == null) {
						local129 = 0;
					} else {
						local129 = arg4[local10];
					}
					local10++;
					if (local22 == ' ') {
						if (Static24.anInt4403 > 0) {
							Static24.anInt4411 += Static24.anInt4403;
							arg1 += Static24.anInt4411 >> 8;
							Static24.anInt4411 &= 0xFF;
						}
					} else if (Static24.anInt4405 == 256) {
						if (Static24.anInt4407 != -1) {
							this.method3683(local22, arg1 + this.anIntArray488[local22] + local119 + 1, local4 + this.anIntArray486[local22] + 1 + local129, local221, local110, Static24.anInt4407);
						}
						this.method3683(local22, arg1 + this.anIntArray488[local22] + local119, local4 + this.anIntArray486[local22] + local129, local221, local110, Static24.anInt4408);
					} else {
						if (Static24.anInt4407 != -1) {
							this.method3689(local22, arg1 + this.anIntArray488[local22] + local119 + 1, local4 + this.anIntArray486[local22] + 1 + local129, local221, local110, Static24.anInt4407, Static24.anInt4405);
						}
						this.method3689(local22, arg1 + this.anIntArray488[local22] + local119, local4 + this.anIntArray486[local22] + local129, local221, local110, Static24.anInt4408, Static24.anInt4405);
					}
					@Pc(382) int local382 = this.anIntArray490[local22];
					if (Static24.anInt4404 != -1) {
						if (Static283.aBoolean393) {
							Static234.method3981(arg1, local4 + (int) ((double) this.anInt4400 * 0.7D), local382, Static24.anInt4404);
						} else {
							Static143.method2460(arg1, local4 + (int) ((double) this.anInt4400 * 0.7D), local382, Static24.anInt4404);
						}
					}
					if (Static24.anInt4409 != -1) {
						if (Static283.aBoolean393) {
							Static234.method3981(arg1, local4 + this.anInt4400, local382, Static24.anInt4409);
						} else {
							Static143.method2460(arg1, local4 + this.anInt4400, local382, Static24.anInt4409);
						}
					}
					arg1 += local382;
					local8 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;II)V")
	private void method3701(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt4400;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(20) char local20 = arg0.charAt(local13);
			if (local20 == '<') {
				local6 = local13;
			} else {
				@Pc(108) int local108;
				if (local20 == '>' && local6 != -1) {
					@Pc(40) String local40 = arg0.substring(local6 + 1, local13).toLowerCase();
					local6 = -1;
					if (local40.equals("lt")) {
						local20 = '<';
					} else if (local40.equals("gt")) {
						local20 = '>';
					} else if (local40.equals("nbsp")) {
						local20 = ' ';
					} else if (local40.equals("shy")) {
						local20 = '\u00ad';
					} else if (local40.equals("times")) {
						local20 = '×';
					} else if (local40.equals("euro")) {
						local20 = '€';
					} else if (local40.equals("copy")) {
						local20 = '©';
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=")) {
								try {
									local108 = Static218.method3603(local40.substring(4));
									@Pc(113) Class81 local113 = this.aClass81Array4[local108];
									@Pc(124) int local124 = this.anIntArray487 == null ? local113.anInt2795 : this.anIntArray487[local108];
									if (Static24.anInt4405 == 256) {
										local113.method2501(arg1, local4 + this.anInt4400 - local124);
									} else {
										local113.method2499(arg1, local4 + this.anInt4400 - local124, Static24.anInt4405);
									}
									arg1 += local113.anInt2802;
									local8 = '\u0000';
								} catch (@Pc(156) Exception local156) {
								}
							} else {
								this.method3691(local40);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					local20 = (char) (Static120.method2007(local20) & 0xFF);
					if (this.aByteArray60 != null && local8 != '\u0000') {
						arg1 += this.aByteArray60[(local8 << 8) + local20];
					}
					@Pc(192) int local192 = this.anIntArray485[local20];
					local108 = this.anIntArray489[local20];
					if (local20 == ' ') {
						if (Static24.anInt4403 > 0) {
							Static24.anInt4411 += Static24.anInt4403;
							arg1 += Static24.anInt4411 >> 8;
							Static24.anInt4411 &= 0xFF;
						}
					} else if (Static24.anInt4405 == 256) {
						if (Static24.anInt4407 != -1) {
							this.method3683(local20, arg1 + this.anIntArray488[local20] + 1, local4 + this.anIntArray486[local20] + 1, local192, local108, Static24.anInt4407);
						}
						this.method3683(local20, arg1 + this.anIntArray488[local20], local4 + this.anIntArray486[local20], local192, local108, Static24.anInt4408);
					} else {
						if (Static24.anInt4407 != -1) {
							this.method3689(local20, arg1 + this.anIntArray488[local20] + 1, local4 + this.anIntArray486[local20] + 1, local192, local108, Static24.anInt4407, Static24.anInt4405);
						}
						this.method3689(local20, arg1 + this.anIntArray488[local20], local4 + this.anIntArray486[local20], local192, local108, Static24.anInt4408, Static24.anInt4405);
					}
					@Pc(318) int local318 = this.anIntArray490[local20];
					if (Static24.anInt4404 != -1) {
						if (Static283.aBoolean393) {
							Static234.method3981(arg1, local4 + (int) ((double) this.anInt4400 * 0.7D), local318, Static24.anInt4404);
						} else {
							Static143.method2460(arg1, local4 + (int) ((double) this.anInt4400 * 0.7D), local318, Static24.anInt4404);
						}
					}
					if (Static24.anInt4409 != -1) {
						if (Static283.aBoolean393) {
							Static234.method3981(arg1, local4 + this.anInt4400 + 1, local318, Static24.anInt4409);
						} else {
							Static143.method2460(arg1, local4 + this.anInt4400 + 1, local318, Static24.anInt4409);
						}
					}
					arg1 += local318;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V")
	private void method3702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static24.anInt4404 = -1;
		Static24.anInt4409 = -1;
		Static24.anInt4401 = arg1;
		Static24.anInt4407 = arg1;
		Static24.anInt4410 = arg0;
		Static24.anInt4408 = arg0;
		Static24.anInt4402 = arg2;
		Static24.anInt4405 = arg2;
		Static24.anInt4403 = 0;
		Static24.anInt4411 = 0;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
	private void method3704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static24.anInt4404 = -1;
		Static24.anInt4409 = -1;
		Static24.anInt4401 = arg1;
		Static24.anInt4407 = arg1;
		Static24.anInt4410 = arg0;
		Static24.anInt4408 = arg0;
		Static24.anInt4402 = 256;
		Static24.anInt4405 = 256;
		Static24.anInt4403 = 0;
		Static24.anInt4411 = 0;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method3705(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3704(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3700(arg0, arg1 - this.method3690(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(C)I")
	private int method3706(@OriginalArg(0) char arg0) {
		return this.anIntArray490[Static120.method2007(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method3708(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method3702(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
		@Pc(49) int local49 = arg2 + this.anInt4399;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt4399 - this.anInt4406) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt4406;
		}
		if (arg7 == 1) {
			local51 = this.method3690(arg0) + local25;
			local27 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method3690(arg0) + local25;
			local27 = arg1 + arg3 - local51;
		}
		this.method3700(arg0, local27, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method3690(arg0) + local25;
			}
			arg11[0] = local27;
			arg11[1] = local49 - this.anInt4399;
			arg11[2] = local51;
			arg11[3] = this.anInt4399 + this.anInt4406;
		}
		return local25;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([B)V")
	private void method3709(@OriginalArg(0) byte[] arg0) {
		this.anIntArray490 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray490.length; local9++) {
				this.anIntArray490[local9] = arg0[local9] & 0xFF;
			}
			this.anInt4400 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray490[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray60 = new byte[65536];
		for (local138 = 0; local138 < 256; local138++) {
			if (local138 != 32 && local138 != 160) {
				for (local109 = 0; local109 < 256; local109++) {
					if (local109 != 32 && local109 != 160) {
						this.aByteArray60[(local138 << 8) + local109] = (byte) Static24.method3707(local93, local136, local58, this.anIntArray490, local55, local138, local109);
					}
				}
			}
		}
		this.anInt4400 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method3710(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method3702(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method3700(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method3711(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method3702(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt4400;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt4399 + this.anInt4406 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method3687(arg0, local20, Static24.aStringArray30);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt4399;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt4399 + (arg4 - this.anInt4399 - this.anInt4406 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt4406 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt4399 - this.anInt4406 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt4399 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method3701(Static24.aStringArray30[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method3701(Static24.aStringArray30[local118], arg1 + (arg3 - this.method3690(Static24.aStringArray30[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method3701(Static24.aStringArray30[local118], arg1 + arg3 - this.method3690(Static24.aStringArray30[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method3701(Static24.aStringArray30[local118], arg1, local57);
			} else {
				this.method3697(Static24.aStringArray30[local118], arg3);
				this.method3701(Static24.aStringArray30[local118], arg1, local57);
				Static24.anInt4403 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}
}
