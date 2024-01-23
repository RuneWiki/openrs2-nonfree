import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Class1_Sub5_Sub9 extends Class1_Sub5 {

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "[Lclient!oh;")
	private Class57[] aClass57Array3;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	public int anInt3302 = 0;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "[I")
	protected int[] anIntArray306;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "[I")
	protected int[] anIntArray303;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	private int anInt3304;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub5_Sub9(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray307 = arg1;
		this.anIntArray304 = arg2;
		this.anIntArray306 = arg3;
		this.anIntArray303 = arg4;
		this.method2870(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray304[local25] < local21 && this.anIntArray303[local25] != 0) {
				local21 = this.anIntArray304[local25];
			}
			if (this.anIntArray304[local25] + this.anIntArray303[local25] > local23) {
				local23 = this.anIntArray304[local25] + this.anIntArray303[local25];
			}
		}
		this.anInt3304 = this.anInt3302 - local21;
		this.anInt3303 = local23 - this.anInt3302;
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5_Sub9(@OriginalArg(0) byte[] arg0) {
		this.method2870(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public final int method2851(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method2856(arg0, new int[] { arg1 }, Static285.aStringArray21);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method2852(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2854(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method2853(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2868(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method2859(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method2854(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2868(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt3302;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt3304 + this.anInt3303 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2856(arg0, local20, Static285.aStringArray21);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt3304;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt3304 + (arg4 - this.anInt3304 - this.anInt3303 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt3303 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt3304 - this.anInt3303 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt3304 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2862(Static285.aStringArray21[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2862(Static285.aStringArray21[local118], arg1 + (arg3 - this.method2860(Static285.aStringArray21[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2862(Static285.aStringArray21[local118], arg1 + arg3 - this.method2860(Static285.aStringArray21[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2862(Static285.aStringArray21[local118], arg1, local57);
			} else {
				this.method2864(Static285.aStringArray21[local118], arg3);
				this.method2862(Static285.aStringArray21[local118], arg1, local57);
				Static285.anInt3305 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method2855(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2858(arg3, arg4);
			this.method2862(arg0, arg1 - this.method2860(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method2856(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static39.method673(Static285.aStringBuffer3);
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
					Static285.aStringBuffer3.append('<');
					Static285.aStringBuffer3.append(local56);
					Static285.aStringBuffer3.append('>');
					if (local56.equals("br")) {
						arg2[local25] = Static285.aStringBuffer3.toString().substring(local13, Static285.aStringBuffer3.length());
						local25++;
						local13 = Static285.aStringBuffer3.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local56.equals("lt")) {
						local11 += this.method2857('<');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local56.equals("gt")) {
						local11 += this.method2857('>');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local56.equals("nbsp")) {
						local11 += this.method2857(' ');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local56.equals("shy")) {
						local11 += this.method2857('\u00ad');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local56.equals("times")) {
						local11 += this.method2857('×');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local56.equals("euro")) {
						local11 += this.method2857('€');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local56.equals("copy")) {
						local11 += this.method2857('©');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local56.equals("reg")) {
						local11 += this.method2857('®');
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local56.startsWith("img=")) {
						try {
							@Pc(336) int local336 = Static194.method3363(local56.substring(4));
							local11 += this.aClass57Array3[local336].anInt3770;
							local23 = '\u0000';
						} catch (@Pc(348) Exception local348) {
						}
					}
					local37 = '\u0000';
				}
				if (local21 == -1) {
					if (local37 != '\u0000') {
						Static285.aStringBuffer3.append(local37);
						local37 = (char) (Static56.method1018(local37) & 0xFF);
						local11 += this.anIntArray308[local37];
						if (this.aByteArray101 != null && local23 != '\u0000') {
							local11 += this.aByteArray101[(local23 << 8) + local37];
						}
						local23 = local37;
					}
					if (local37 == ' ') {
						local15 = Static285.aStringBuffer3.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static285.aStringBuffer3.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local37 == '-') {
						local15 = Static285.aStringBuffer3.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static285.aStringBuffer3.length() > local13) {
			arg2[local25] = Static285.aStringBuffer3.toString().substring(local13, Static285.aStringBuffer3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(C)I")
	private int method2857(@OriginalArg(0) char arg0) {
		return this.anIntArray308[Static56.method1018(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	private void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static285.anInt3313 = -1;
		Static285.anInt3314 = -1;
		Static285.anInt3308 = arg1;
		Static285.anInt3312 = arg1;
		Static285.anInt3310 = arg0;
		Static285.anInt3306 = arg0;
		Static285.anInt3309 = 256;
		Static285.anInt3311 = 256;
		Static285.anInt3305 = 0;
		Static285.anInt3307 = 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method2859(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3302;
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
									local128 = Static194.method3363(local41.substring(4));
									@Pc(133) Class57 local133 = this.aClass57Array3[local128];
									@Pc(144) int local144 = this.anIntArray305 == null ? local133.anInt3763 : this.anIntArray305[local128];
									if (Static285.anInt3311 == 256) {
										local133.method3330(arg1 + local109, local4 + this.anInt3302 - local144 + local118);
									} else {
										local133.method3328(arg1 + local109, local4 + this.anInt3302 - local144 + local118, Static285.anInt3311);
									}
									arg1 += local133.anInt3770;
									local8 = '\u0000';
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method2861(local41);
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local22 = (char) (Static56.method1018(local22) & 0xFF);
					if (this.aByteArray101 != null && local8 != '\u0000') {
						arg1 += this.aByteArray101[(local8 << 8) + local22];
					}
					@Pc(220) int local220 = this.anIntArray306[local22];
					local109 = this.anIntArray303[local22];
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
						if (Static285.anInt3305 > 0) {
							Static285.anInt3307 += Static285.anInt3305;
							arg1 += Static285.anInt3307 >> 8;
							Static285.anInt3307 &= 0xFF;
						}
					} else if (Static285.anInt3311 == 256) {
						if (Static285.anInt3312 != -1) {
							this.method2869(local22, arg1 + this.anIntArray307[local22] + local118 + 1, local4 + this.anIntArray304[local22] + 1 + local128, local220, local109, Static285.anInt3312);
						}
						this.method2869(local22, arg1 + this.anIntArray307[local22] + local118, local4 + this.anIntArray304[local22] + local128, local220, local109, Static285.anInt3306);
					} else {
						if (Static285.anInt3312 != -1) {
							this.method2876(local22, arg1 + this.anIntArray307[local22] + local118 + 1, local4 + this.anIntArray304[local22] + 1 + local128, local220, local109, Static285.anInt3312, Static285.anInt3311);
						}
						this.method2876(local22, arg1 + this.anIntArray307[local22] + local118, local4 + this.anIntArray304[local22] + local128, local220, local109, Static285.anInt3306, Static285.anInt3311);
					}
					@Pc(381) int local381 = this.anIntArray308[local22];
					if (Static285.anInt3313 != -1) {
						if (Static71.aBoolean165) {
							Static93.method1760(arg1, local4 + (int) ((double) this.anInt3302 * 0.7D), local381, Static285.anInt3313);
						} else {
							Static77.method1606(arg1, local4 + (int) ((double) this.anInt3302 * 0.7D), local381, Static285.anInt3313);
						}
					}
					if (Static285.anInt3314 != -1) {
						if (Static71.aBoolean165) {
							Static93.method1760(arg1, local4 + this.anInt3302, local381, Static285.anInt3314);
						} else {
							Static77.method1606(arg1, local4 + this.anInt3302, local381, Static285.anInt3314);
						}
					}
					arg1 += local381;
					local8 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;)I")
	public final int method2860(@OriginalArg(0) String arg0) {
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
									@Pc(108) int local108 = Static194.method3363(local40.substring(4));
									local9 += this.aClass57Array3[local108].anInt3770;
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
					local21 = (char) (Static56.method1018(local21) & 0xFF);
					local9 += this.anIntArray308[local21];
					if (this.aByteArray101 != null && local7 != '\u0000') {
						local9 += this.aByteArray101[(local7 << 8) + local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method2861(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static285.anInt3306 = Static165.method4615(arg0.substring(4));
			} else if (arg0.equals("/col")) {
				Static285.anInt3306 = Static285.anInt3310;
			} else if (arg0.startsWith("trans=")) {
				Static285.anInt3311 = Static194.method3363(arg0.substring(6));
			} else if (arg0.equals("/trans")) {
				Static285.anInt3311 = Static285.anInt3309;
			} else if (arg0.startsWith("str=")) {
				Static285.anInt3313 = Static165.method4615(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static285.anInt3313 = 8388608;
			} else if (arg0.equals("/str")) {
				Static285.anInt3313 = -1;
			} else if (arg0.startsWith("u=")) {
				Static285.anInt3314 = Static165.method4615(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static285.anInt3314 = 0;
			} else if (arg0.equals("/u")) {
				Static285.anInt3314 = -1;
			} else if (arg0.startsWith("shad=")) {
				Static285.anInt3312 = Static165.method4615(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static285.anInt3312 = 0;
			} else if (arg0.equals("/shad")) {
				Static285.anInt3312 = Static285.anInt3308;
			} else if (arg0.equals("br")) {
				this.method2868(Static285.anInt3310, Static285.anInt3308, Static285.anInt3309);
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method2862(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt3302;
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
									local107 = Static194.method3363(local39.substring(4));
									@Pc(112) Class57 local112 = this.aClass57Array3[local107];
									@Pc(123) int local123 = this.anIntArray305 == null ? local112.anInt3763 : this.anIntArray305[local107];
									if (Static285.anInt3311 == 256) {
										local112.method3330(arg1, local4 + this.anInt3302 - local123);
									} else {
										local112.method3328(arg1, local4 + this.anInt3302 - local123, Static285.anInt3311);
									}
									arg1 += local112.anInt3770;
									local8 = '\u0000';
								} catch (@Pc(155) Exception local155) {
								}
							} else {
								this.method2861(local39);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					local20 = (char) (Static56.method1018(local20) & 0xFF);
					if (this.aByteArray101 != null && local8 != '\u0000') {
						arg1 += this.aByteArray101[(local8 << 8) + local20];
					}
					@Pc(191) int local191 = this.anIntArray306[local20];
					local107 = this.anIntArray303[local20];
					if (local20 == ' ') {
						if (Static285.anInt3305 > 0) {
							Static285.anInt3307 += Static285.anInt3305;
							arg1 += Static285.anInt3307 >> 8;
							Static285.anInt3307 &= 0xFF;
						}
					} else if (Static285.anInt3311 == 256) {
						if (Static285.anInt3312 != -1) {
							this.method2869(local20, arg1 + this.anIntArray307[local20] + 1, local4 + this.anIntArray304[local20] + 1, local191, local107, Static285.anInt3312);
						}
						this.method2869(local20, arg1 + this.anIntArray307[local20], local4 + this.anIntArray304[local20], local191, local107, Static285.anInt3306);
					} else {
						if (Static285.anInt3312 != -1) {
							this.method2876(local20, arg1 + this.anIntArray307[local20] + 1, local4 + this.anIntArray304[local20] + 1, local191, local107, Static285.anInt3312, Static285.anInt3311);
						}
						this.method2876(local20, arg1 + this.anIntArray307[local20], local4 + this.anIntArray304[local20], local191, local107, Static285.anInt3306, Static285.anInt3311);
					}
					@Pc(317) int local317 = this.anIntArray308[local20];
					if (Static285.anInt3313 != -1) {
						if (Static71.aBoolean165) {
							Static93.method1760(arg1, local4 + (int) ((double) this.anInt3302 * 0.7D), local317, Static285.anInt3313);
						} else {
							Static77.method1606(arg1, local4 + (int) ((double) this.anInt3302 * 0.7D), local317, Static285.anInt3313);
						}
					}
					if (Static285.anInt3314 != -1) {
						if (Static71.aBoolean165) {
							Static93.method1760(arg1, local4 + this.anInt3302 + 1, local317, Static285.anInt3314);
						} else {
							Static77.method1606(arg1, local4 + this.anInt3302 + 1, local317, Static285.anInt3314);
						}
					}
					arg1 += local317;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([Lclient!oh;[I)V")
	public final void method2863(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass57Array3 = arg0;
		this.anIntArray305 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void method2864(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			Static285.anInt3305 = (arg1 - this.method2860(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method2865(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method2868(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
		@Pc(49) int local49 = arg2 + this.anInt3304;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt3304 - this.anInt3303) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt3303;
		}
		if (arg7 == 1) {
			local51 = this.method2860(arg0) + local25;
			local27 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method2860(arg0) + local25;
			local27 = arg1 + arg3 - local51;
		}
		this.method2859(arg0, local27, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method2860(arg0) + local25;
			}
			arg11[0] = local27;
			arg11[1] = local49 - this.anInt3304;
			arg11[2] = local51;
			arg11[3] = this.anInt3304 + this.anInt3303;
		}
		return local25;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method2866(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2858(arg3, arg4);
			this.method2862(arg0, arg1 - this.method2860(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public final int method2867(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2856(arg0, new int[] { arg1 }, Static285.aStringArray21);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.method2860(Static285.aStringArray21[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(III)V")
	private void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static285.anInt3313 = -1;
		Static285.anInt3314 = -1;
		Static285.anInt3308 = arg1;
		Static285.anInt3312 = arg1;
		Static285.anInt3310 = arg0;
		Static285.anInt3306 = arg0;
		Static285.anInt3309 = arg2;
		Static285.anInt3311 = arg2;
		Static285.anInt3305 = 0;
		Static285.anInt3307 = 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([B)V")
	private void method2870(@OriginalArg(0) byte[] arg0) {
		this.anIntArray308 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray308.length; local9++) {
				this.anIntArray308[local9] = arg0[local9] & 0xFF;
			}
			this.anInt3302 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray308[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray101 = new byte[65536];
		for (local138 = 0; local138 < 256; local138++) {
			if (local138 != 32 && local138 != 160) {
				for (local109 = 0; local109 < 256; local109++) {
					if (local109 != 32 && local109 != 160) {
						this.aByteArray101[(local138 << 8) + local109] = (byte) Static285.method2850(local93, local136, local58, this.anIntArray308, local55, local138, local109);
					}
				}
			}
		}
		this.anInt3302 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method2871(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2858(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2859(arg0, arg1 - this.method2860(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/lang/String;II)I")
	public final int method2873(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.anInt3302;
		@Pc(15) int local15 = this.method2856(arg0, new int[] { 100 }, Static285.aStringArray21);
		@Pc(21) int local21 = (local15 - 1) * local4;
		return this.anInt3304 + local21 + this.anInt3303;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method2874(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2858(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2859(arg0, arg1 - this.method2860(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method2875(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2858(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.method2859(arg0, arg1 - this.method2860(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method2878(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2858(arg3, arg4);
			this.method2862(arg0, arg1, arg2);
		}
	}
}
