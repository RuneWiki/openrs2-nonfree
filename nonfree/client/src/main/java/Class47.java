import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class47 {

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!dd;")
	private final Class52 aClass52_12;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!qa;")
	private final Class39 aClass39_11;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!dd;)V")
	protected Class47(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class52 arg1) {
		this.aClass52_12 = arg1;
		this.aClass39_11 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
	public final void method7598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7605(arg3, arg0);
			this.method7616(0, null, 0, null, arg1 - this.aClass52_12.method1582(arg2) / 2, null, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;IIBLclient!pa;IIIIIIILjava/lang/String;I[III)I")
	public final int method7599(@OriginalArg(0) Class35[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class209 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method7605(arg1, arg5);
		if (arg7 == 0) {
			arg7 = this.aClass52_12.anInt1670;
		}
		@Pc(38) int[] local38;
		if (arg6 < arg7 + this.aClass52_12.anInt1675 + this.aClass52_12.anInt1673 && arg7 + arg7 > arg6) {
			local38 = null;
		} else {
			local38 = new int[] { arg4 };
		}
		@Pc(56) int local56 = this.aClass52_12.method1581(Static429.aStringArray37, arg0, local38, arg11);
		if (arg15 == -1) {
			arg15 = arg6 / arg7;
			if (arg15 <= 0) {
				arg15 = 1;
			}
		}
		if (arg15 > 0 && local56 >= arg15) {
			local56 = arg15;
			Static429.aStringArray37[arg15 - 1] = this.aClass52_12.method1579(arg4, arg0, Static429.aStringArray37[arg15 - 1]);
		}
		if (arg10 == 3 && local56 == 1) {
			arg10 = 1;
		}
		@Pc(117) int local117;
		@Pc(198) int local198;
		if (arg10 == 0) {
			local117 = this.aClass52_12.anInt1675 + arg12;
		} else if (arg10 == 1) {
			local117 = (arg6 - this.aClass52_12.anInt1675 - this.aClass52_12.anInt1673 - arg7 * (local56 + -1)) / 2 + arg12 + this.aClass52_12.anInt1675;
		} else if (arg10 == 2) {
			local117 = arg12 + arg6 - this.aClass52_12.anInt1673 - arg7 * (local56 - 1);
		} else {
			local198 = (arg6 - this.aClass52_12.anInt1675 - this.aClass52_12.anInt1673 - arg7 * (local56 - 1)) / (local56 + 1);
			if (local198 < 0) {
				local198 = 0;
			}
			local117 = local198 + this.aClass52_12.anInt1675 + arg12;
			arg7 += local198;
		}
		for (local198 = 0; local198 < local56; local198++) {
			if (arg9 == 0) {
				this.method7616(arg8, arg3, arg2, arg0, arg14, arg13, local117, Static429.aStringArray37[local198]);
			} else if (arg9 == 1) {
				this.method7616(arg8, arg3, arg2, arg0, arg14 + (arg4 - this.aClass52_12.method1582(Static429.aStringArray37[local198])) / 2, arg13, local117, Static429.aStringArray37[local198]);
			} else if (arg9 == 2) {
				this.method7616(arg8, arg3, arg2, arg0, arg14 + arg4 - this.aClass52_12.method1582(Static429.aStringArray37[local198]), arg13, local117, Static429.aStringArray37[local198]);
			} else if (local56 - 1 == local198) {
				this.method7616(arg8, arg3, arg2, arg0, arg14, arg13, local117, Static429.aStringArray37[local198]);
			} else {
				this.method7608(Static429.aStringArray37[local198], arg4);
				this.method7616(arg8, arg3, arg2, arg0, arg14, arg13, local117, Static429.aStringArray37[local198]);
				Static296.anInt5459 = 0;
			}
			local117 += arg7;
		}
		return local56;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([ILjava/lang/String;[I[Lclient!ha;II[II)V")
	private void method7600(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class35[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		@Pc(11) int local11 = arg4 - this.aClass52_12.anInt1670;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static36.method706(arg1.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(116) int local116;
				@Pc(126) int local126;
				if (local33 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg1.substring(local13 + 1, local22);
					local13 = -1;
					if (local56.equals("lt")) {
						local33 = '<';
					} else if (local56.equals("gt")) {
						local33 = '>';
					} else if (local56.equals("nbsp")) {
						local33 = ' ';
					} else if (local56.equals("shy")) {
						local33 = '\u00ad';
					} else if (local56.equals("times")) {
						local33 = '×';
					} else if (local56.equals("euro")) {
						local33 = '€';
					} else if (local56.equals("copy")) {
						local33 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									if (arg2 == null) {
										local116 = 0;
									} else {
										local116 = arg2[local17];
									}
									if (arg0 == null) {
										local126 = 0;
									} else {
										local126 = arg0[local17];
									}
									local17++;
									@Pc(137) int local137 = Static359.method5799(local56.substring(4));
									@Pc(141) Class35 local141 = arg3[local137];
									@Pc(150) int local150 = arg6 == null ? local141.ma() : arg6[local137];
									local141.DA(local116 + arg5, -local150 + local11 + this.aClass52_12.anInt1670 + local126, 1, 0, 1);
									local15 = -1;
									arg5 += arg3[local137].EA();
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method7607(local56);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass52_12.method1583(local33, local15);
					}
					@Pc(223) int local223;
					if (arg2 == null) {
						local223 = 0;
					} else {
						local223 = arg2[local17];
					}
					if (arg0 == null) {
						local116 = 0;
					} else {
						local116 = arg0[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static270.anInt8540 & 0xFF000000) != 0) {
							this.HA(local33, arg5 + local223 + 1, local116 + 1 + local11, Static270.anInt8540, true);
						}
						this.HA(local33, arg5 + local223, local11 + local116, Static246.anInt4485, false);
					} else if (Static296.anInt5459 > 0) {
						Static368.anInt6903 += Static296.anInt5459;
						arg5 += Static368.anInt6903 >> 8;
						Static368.anInt6903 &= 0xFF;
					}
					local126 = this.aClass52_12.method1586(local33);
					if (Static310.anInt5643 != -1) {
						this.aClass39_11.method6067(Static310.anInt5643, local11 + (int) ((double) this.aClass52_12.anInt1670 * 0.7D), arg5, local126);
					}
					if (Static72.anInt1479 != -1) {
						this.aClass39_11.method6067(Static72.anInt1479, local11 + this.aClass52_12.anInt1670, arg5, local126);
					}
					arg5 += local126;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
	protected abstract void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILjava/lang/String;B)V")
	public final void method7601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method7605(-16777216, arg0);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local19[local25] = (int) (Math.sin((double) arg2 / 5.0D + (double) local25 / 2.0D) * 5.0D);
		}
		this.method7600(local19, arg4, null, null, arg3, arg1 - this.aClass52_12.method1582(arg4) / 2, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ha;I[IIILjava/util/Random;II)I")
	public final int method7602(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(7) Random arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(21) int local21 = (arg4.nextInt() & 0x1F) + 192;
		this.method7605((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg0.length();
		@Pc(49) int[] local49 = new int[local41];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local49[local53] = local51;
			if ((arg4.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		this.method7600(null, arg0, local49, arg2, arg5, arg1, arg3);
		return local51;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7603(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method7605(-1, arg2);
			this.method7616(0, null, 0, null, arg3 - this.aClass52_12.method1582(arg0), null, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7604(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7605(-16777216, arg1);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method7600(local22, arg0, local19, null, arg3, arg2 - this.aClass52_12.method1582(arg0) / 2, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V")
	private void method7605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static72.anInt1479 = -1;
		Static310.anInt5643 = -1;
		Static368.anInt6903 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static296.anInt5459 = 0;
		Static493.anInt8671 = arg1;
		Static246.anInt4485 = arg1;
		Static397.anInt7577 = arg0;
		Static270.anInt8540 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7607(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static246.anInt4485 = Static246.anInt4485 & 0xFF000000 | Static330.method3992(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static246.anInt4485 = Static246.anInt4485 & 0xFF000000 | Static493.anInt8671 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static246.anInt4485 = Static330.method3992(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static246.anInt4485 = Static493.anInt8671;
			} else if (arg0.startsWith("str=")) {
				Static310.anInt5643 = Static246.anInt4485 & 0xFF000000 | Static330.method3992(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static310.anInt5643 = Static246.anInt4485 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static310.anInt5643 = -1;
			} else if (arg0.startsWith("u=")) {
				Static72.anInt1479 = Static246.anInt4485 & 0xFF000000 | Static330.method3992(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static72.anInt1479 = Static246.anInt4485 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static72.anInt1479 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static270.anInt8540 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static270.anInt8540 = Static246.anInt4485 & 0xFF000000 | Static330.method3992(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static270.anInt8540 = Static246.anInt4485 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static270.anInt8540 = Static397.anInt7577;
			} else if (arg0.equals("br")) {
				this.method7605(Static397.anInt7577, Static493.anInt8671);
			}
		} catch (@Pc(179) Exception local179) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	private void method7608(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(22) char local22 = arg0.charAt(local11);
			if (local22 == '<') {
				local9 = true;
			} else if (local22 == '>') {
				local9 = false;
			} else if (!local9 && local22 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static296.anInt5459 = (arg1 - this.aClass52_12.method1582(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IBIIII)V")
	public final void method7609(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == null) {
			return;
		}
		this.method7605(-16777216, arg3);
		@Pc(21) double local21 = 7.0D - (double) arg4 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg1.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (Math.sin((double) local35 / 1.5D + (double) arg5) * local21);
		}
		this.method7600(local33, arg1, null, null, arg0, arg2 - this.aClass52_12.method1582(arg1) / 2, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;BIIIILjava/lang/String;[I)V")
	public final void method7611(@OriginalArg(0) Class35[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int[] arg5) {
		if (arg4 != null) {
			this.method7605(0, arg1);
			this.method7616(0, null, 0, arg0, arg2, arg5, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[IIIILjava/lang/String;IIILclient!pa;I[Lclient!ha;III)I")
	public final int method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(10) Class209 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class35[] arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method7599(arg9, arg8, arg3, arg7, arg4, arg10, arg0, 0, arg12, 1, arg11, arg5, arg1, arg2, arg6, 0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IZIILjava/util/Random;IIIIIIILjava/lang/String;[I[Lclient!ha;)I")
	public final int method7613(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) Class35[] arg13) {
		if (arg11 == null) {
			return 0;
		}
		arg3.setSeed((long) arg8);
		@Pc(31) int local31 = (arg3.nextInt() & 0x1F) + 192;
		this.method7605(arg5 & 0xFFFFFF | local31 << 24, arg4 & 0xFFFFFF | local31 << 24);
		@Pc(51) int local51 = arg11.length();
		@Pc(54) int[] local54 = new int[local51];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local51; local58++) {
			local54[local58] = local56;
			if ((arg3.nextInt() & 0x3) == 0) {
				local56++;
			}
		}
		@Pc(80) int local80 = arg10;
		@Pc(86) int local86 = arg1 + this.aClass52_12.anInt1675;
		@Pc(88) int local88 = -1;
		if (arg2 == 1) {
			local86 += (arg9 - this.aClass52_12.anInt1673 - this.aClass52_12.anInt1675) / 2;
		} else if (arg2 == 2) {
			local86 = arg9 + arg1 - this.aClass52_12.anInt1673;
		}
		if (arg7 == 1) {
			local88 = this.aClass52_12.method1582(arg11) + local56;
			local80 = arg10 + (arg6 - local88) / 2;
		} else if (arg7 == 2) {
			local88 = local56 + this.aClass52_12.method1582(arg11);
			local80 = arg10 + arg6 - local88;
		}
		this.method7600(null, arg11, local54, arg13, local86, local80, arg12);
		if (arg0 != null) {
			if (local88 == -1) {
				local88 = local56 + this.aClass52_12.method1582(arg11);
			}
			arg0[0] = local80;
			arg0[3] = this.aClass52_12.anInt1675 + this.aClass52_12.anInt1673;
			arg0[1] = local86 - this.aClass52_12.anInt1675;
			arg0[2] = local88;
		}
		return local56;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	protected abstract void method7615(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class209 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!pa;IZ[Lclient!ha;I[IILjava/lang/String;)V")
	private void method7616(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class35[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(11) int local11 = arg6 - this.aClass52_12.anInt1670;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(22) int local22 = arg7.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static36.method706(arg7.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(58) String local58 = arg7.substring(local13 + 1, local24);
					local13 = -1;
					if (local58.equals("lt")) {
						local35 = '<';
					} else if (local58.equals("gt")) {
						local35 = '>';
					} else if (local58.equals("nbsp")) {
						local35 = ' ';
					} else if (local58.equals("shy")) {
						local35 = '\u00ad';
					} else if (local58.equals("times")) {
						local35 = '×';
					} else if (local58.equals("euro")) {
						local35 = '€';
					} else if (local58.equals("copy")) {
						local35 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									@Pc(116) int local116 = Static359.method5799(local58.substring(4));
									@Pc(120) Class35 local120 = arg3[local116];
									@Pc(129) int local129 = arg5 == null ? local120.ma() : arg5[local116];
									if ((Static246.anInt4485 & 0xFF000000) == -16777216) {
										local120.DA(arg4, local11 + this.aClass52_12.anInt1670 - local129, 1, 0, 1);
									} else {
										local120.DA(arg4, this.aClass52_12.anInt1670 + local11 - local129, 0, Static246.anInt4485 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg4 += arg3[local116].EA();
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method7607(local58);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass52_12.method1583(local35, local15);
					}
					if (local35 == ' ') {
						if (Static296.anInt5459 > 0) {
							Static368.anInt6903 += Static296.anInt5459;
							arg4 += Static368.anInt6903 >> 8;
							Static368.anInt6903 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static270.anInt8540 & 0xFF000000) != 0) {
							this.HA(local35, arg4 + 1, local11 + 1, Static270.anInt8540, true);
						}
						this.HA(local35, arg4, local11, Static246.anInt4485, false);
					} else {
						if ((Static270.anInt8540 & 0xFF000000) != 0) {
							this.method7615(local35, arg4 + 1, local11 + 1, Static270.anInt8540, true, arg1, arg0, arg2);
						}
						this.method7615(local35, arg4, local11, Static246.anInt4485, false, arg1, arg0, arg2);
					}
					@Pc(306) int local306 = this.aClass52_12.method1586(local35);
					if (Static310.anInt5643 != -1) {
						this.aClass39_11.method6067(Static310.anInt5643, (int) ((double) this.aClass52_12.anInt1670 * 0.7D) + local11, arg4, local306);
					}
					if (Static72.anInt1479 != -1) {
						this.aClass39_11.method6067(Static72.anInt1479, local11 + this.aClass52_12.anInt1670 + 1, arg4, local306);
					}
					local15 = local35;
					arg4 += local306;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method7605(arg1, arg0);
			this.method7616(0, null, 0, null, arg3, null, arg4, arg2);
		}
	}
}
