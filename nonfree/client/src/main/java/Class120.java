import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public abstract class Class120 {

	@OriginalMember(owner = "client!os", name = "i", descriptor = "Lclient!tj;")
	private final Class122 aClass122_10;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!vn;")
	private final Class209 aClass209_10;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!tj;Lclient!vn;)V")
	protected Class120(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class209 arg1) {
		this.aClass122_10 = arg0;
		this.aClass209_10 = arg1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[IIII[Lclient!l;ILjava/lang/String;)V")
	public final void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class57[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		if (arg6 != null) {
			this.method5531(arg2, arg3);
			this.method5540(arg1, 0, arg4, 0, arg5, null, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5525(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
	public final void method5528(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5531(arg1, arg3);
			this.method5540(null, 0, null, 0, arg2, null, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[III[Lclient!l;IBILjava/lang/String;Ljava/util/Random;)I")
	public final int method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class57[] arg3, @OriginalArg(5) int arg4, @OriginalArg(8) String arg5, @OriginalArg(9) Random arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg6.setSeed((long) arg2);
		@Pc(21) int local21 = (arg6.nextInt() & 0x1F) + 192;
		this.method5531((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg5.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local44[local53] = local46;
			if ((arg6.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method5546(arg0, arg3, null, local44, arg5, arg1, arg4);
		return local46;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public final void method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5531(-16777216, arg3);
		@Pc(43) double local43 = 7.0D - (double) arg1 / 8.0D;
		if (local43 < 0.0D) {
			local43 = 0.0D;
		}
		@Pc(52) int local52 = arg5.length();
		@Pc(55) int[] local55 = new int[local52];
		for (@Pc(57) int local57 = 0; local57 < local52; local57++) {
			local55[local57] = (int) (Math.sin((double) arg0 + (double) local57 / 1.5D) * local43);
		}
		this.method5546(arg4, null, local55, null, arg5, null, arg2 - this.aClass209_10.method5510(arg5) / 2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	private void method5531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static235.anInt4718 = -1;
		Static58.anInt1265 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static14.anInt496 = arg1;
		Static72.anInt1416 = arg1;
		Static54.anInt1162 = 0;
		Static292.anInt5832 = 0;
		Static307.anInt6098 = arg0;
		Static246.anInt4860 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BIIILjava/util/Random;II[II[Lclient!l;IILjava/lang/String;[II)I")
	public final int method5532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class57[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg11 == null) {
			return 0;
		}
		arg3.setSeed((long) arg10);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method5531(arg13 & 0xFFFFFF | local20 << 24, local20 << 24 | arg5 & 0xFFFFFF);
		@Pc(40) int local40 = arg11.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(68) int local68 = arg4;
		@Pc(80) int local80 = arg0 + this.aClass209_10.anInt6517;
		if (arg1 == 1) {
			local80 += (arg9 - this.aClass209_10.anInt6521 - this.aClass209_10.anInt6517) / 2;
		} else if (arg1 == 2) {
			local80 = arg0 + arg9 - this.aClass209_10.anInt6521;
		}
		@Pc(117) int local117 = -1;
		if (arg2 == 1) {
			local117 = local45 + this.aClass209_10.method5510(arg11);
			local68 = arg4 + (arg7 - local117) / 2;
		} else if (arg2 == 2) {
			local117 = local45 + this.aClass209_10.method5510(arg11);
			local68 = arg4 + arg7 - local117;
		}
		this.method5546(local80, arg8, null, local43, arg11, arg12, local68);
		if (arg6 != null) {
			if (local117 == -1) {
				local117 = this.aClass209_10.method5510(arg11) + local45;
			}
			arg6[2] = local117;
			arg6[1] = local80 - this.aClass209_10.anInt6517;
			arg6[0] = local68;
			arg6[3] = this.aClass209_10.anInt6517 + this.aClass209_10.anInt6521;
		}
		return local45;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(CIIIZLclient!sf;II)V")
	protected abstract void method5533(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
	public final void method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5531(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			local19[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method5546(arg4, null, local19, null, arg2, null, arg3 - this.aClass209_10.method5510(arg2) / 2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(15) int local15 = 0; local15 < arg1.length(); local15++) {
			@Pc(21) char local21 = arg1.charAt(local15);
			if (local21 == '<') {
				local9 = true;
			} else if (local21 == '>') {
				local9 = false;
			} else if (!local9 && local21 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static292.anInt5832 = (arg0 - this.aClass209_10.method5510(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIILjava/lang/String;Lclient!sf;III[II[Lclient!l;III)I")
	public final int method5538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class57[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg4 == null) {
			return 0;
		}
		this.method5531(arg12, arg3);
		if (arg14 == 0) {
			arg14 = this.aClass209_10.anInt6519;
		}
		@Pc(49) int[] local49;
		if (arg1 < arg14 + this.aClass209_10.anInt6521 + this.aClass209_10.anInt6517 && arg14 + arg14 > arg1) {
			local49 = null;
		} else {
			local49 = new int[] { arg13 };
		}
		@Pc(67) int local67 = this.aClass209_10.method5505(local49, arg4, Static227.aStringArray26, arg11);
		if (arg10 == 3 && local67 == 1) {
			arg10 = 1;
		}
		@Pc(124) int local124;
		@Pc(108) int local108;
		if (arg10 == 0) {
			local124 = this.aClass209_10.anInt6517 + arg6;
		} else if (arg10 == 1) {
			local124 = (arg1 - this.aClass209_10.anInt6521 - this.aClass209_10.anInt6517 - (local67 + -1) * arg14) / 2 + this.aClass209_10.anInt6517 + arg6;
		} else if (arg10 == 2) {
			local124 = arg6 + arg1 - (local67 - 1) * arg14 - this.aClass209_10.anInt6521;
		} else {
			local108 = (arg1 - this.aClass209_10.anInt6521 - this.aClass209_10.anInt6517 - (local67 + -1) * arg14) / (local67 + 1);
			if (local108 < 0) {
				local108 = 0;
			}
			arg14 += local108;
			local124 = this.aClass209_10.anInt6517 + arg6 + local108;
		}
		for (local108 = 0; local108 < local67; local108++) {
			if (arg8 == 0) {
				this.method5540(arg9, arg7, arg11, arg2, local124, arg5, arg0, Static227.aStringArray26[local108]);
			} else if (arg8 == 1) {
				this.method5540(arg9, arg7, arg11, arg2, local124, arg5, arg0 + (arg13 - this.aClass209_10.method5510(Static227.aStringArray26[local108])) / 2, Static227.aStringArray26[local108]);
			} else if (arg8 == 2) {
				this.method5540(arg9, arg7, arg11, arg2, local124, arg5, arg13 + arg0 - this.aClass209_10.method5510(Static227.aStringArray26[local108]), Static227.aStringArray26[local108]);
			} else if (local67 - 1 == local108) {
				this.method5540(arg9, arg7, arg11, arg2, local124, arg5, arg0, Static227.aStringArray26[local108]);
			} else {
				this.method5535(arg13, Static227.aStringArray26[local108]);
				this.method5540(arg9, arg7, arg11, arg2, local124, arg5, arg0, Static227.aStringArray26[local108]);
				Static292.anInt5832 = 0;
			}
			local124 += arg14;
		}
		return local67;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!l;I[IBI)V")
	public final void method5539(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class57[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6) {
		if (arg0 != null) {
			this.method5531(arg6, arg2);
			this.method5540(arg5, 0, arg3, 0, arg1, null, arg4 - this.aClass209_10.method5510(arg0), arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([II[Lclient!l;IILclient!sf;IZLjava/lang/String;)V")
	private void method5540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) String arg7) {
		@Pc(7) int local7 = arg4 - this.aClass209_10.anInt6519;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(23) int local23 = arg7.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static255.method5155(arg7.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local13 = local25;
			} else {
				if (local36 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg7.substring(local13 + 1, local25);
					local13 = -1;
					if (local59.equals("lt")) {
						local36 = '<';
					} else if (local59.equals("gt")) {
						local36 = '>';
					} else if (local59.equals("nbsp")) {
						local36 = ' ';
					} else if (local59.equals("shy")) {
						local36 = '\u00ad';
					} else if (local59.equals("times")) {
						local36 = '×';
					} else if (local59.equals("euro")) {
						local36 = '€';
					} else if (local59.equals("copy")) {
						local36 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									@Pc(123) int local123 = Static261.method4403(local59.substring(4));
									@Pc(127) Class57 local127 = arg2[local123];
									@Pc(136) int local136 = arg0 == null ? local127.method5441() : arg0[local123];
									if ((-16777216 & Static72.anInt1416) == -16777216) {
										local127.method5446(arg6, local7 + this.aClass209_10.anInt6519 - local136, 0, 0);
									} else {
										local127.method5446(arg6, this.aClass209_10.anInt6519 + local7 - local136, 1, Static72.anInt1416 & 0xFF000000 | 0xFFFFFF);
									}
									arg6 += arg2[local123].method5433();
									local15 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method5543(local59);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass209_10.method5507(local15, local36);
					}
					if (local36 == ' ') {
						if (Static292.anInt5832 > 0) {
							Static54.anInt1162 += Static292.anInt5832;
							arg6 += Static54.anInt1162 >> 8;
							Static54.anInt1162 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static246.anInt4860 & 0xFF000000) != 0) {
							this.method5525(local36, arg6 + 1, local7 + 1, Static246.anInt4860, true);
						}
						this.method5525(local36, arg6, local7, Static72.anInt1416, false);
					} else {
						if ((Static246.anInt4860 & 0xFF000000) != 0) {
							this.method5533(local36, arg6 + 1, local7 + 1, Static246.anInt4860, true, arg5, arg3, arg1);
						}
						this.method5533(local36, arg6, local7, Static72.anInt1416, false, arg5, arg3, arg1);
					}
					@Pc(307) int local307 = this.aClass209_10.method5508(local36);
					if (Static235.anInt4718 != -1) {
						this.aClass122_10.method4736(Static235.anInt4718, arg6, local307, (int) ((double) this.aClass209_10.anInt6519 * 0.7D) + local7);
					}
					if (Static58.anInt1265 != -1) {
						this.aClass122_10.method4736(Static58.anInt1265, arg6, local307, this.aClass209_10.anInt6519 + local7 + 1);
					}
					arg6 += local307;
					local15 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5531(-16777216, arg4);
		@Pc(18) int local18 = arg1.length();
		@Pc(21) int[] local21 = new int[local18];
		@Pc(24) int[] local24 = new int[local18];
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			local21[local26] = (int) (Math.sin((double) arg0 / 5.0D + (double) local26 / 5.0D) * 5.0D);
			local24[local26] = (int) (Math.sin((double) local26 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method5546(arg2, null, local24, local21, arg1, null, arg3 - this.aClass209_10.method5510(arg1) / 2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5543(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static72.anInt1416 = Static72.anInt1416 & 0xFF000000 | Static335.method5500(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static72.anInt1416 = Static14.anInt496 & 0xFFFFFF | Static72.anInt1416 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static72.anInt1416 = Static335.method5500(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static72.anInt1416 = Static14.anInt496;
			} else if (arg0.startsWith("str=")) {
				Static235.anInt4718 = Static335.method5500(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static235.anInt4718 = -8388608;
			} else if (arg0.equals("/str")) {
				Static235.anInt4718 = -1;
			} else if (arg0.startsWith("u=")) {
				Static58.anInt1265 = Static335.method5500(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static58.anInt1265 = -16777216;
			} else if (arg0.equals("/u")) {
				Static58.anInt1265 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static246.anInt4860 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static246.anInt4860 = Static335.method5500(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static246.anInt4860 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static246.anInt4860 = Static307.anInt6098;
			} else if (arg0.equals("br")) {
				this.method5531(Static307.anInt6098, Static14.anInt496);
			}
		} catch (@Pc(169) Exception local169) {
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5544(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != null) {
			this.method5531(-1, arg0);
			this.method5540(null, 0, null, 0, arg3, null, arg2 - this.aClass209_10.method5510(arg1), arg1);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([I[Lclient!l;IIBIILjava/lang/String;)V")
	public final void method5545(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		if (arg6 != null) {
			this.method5531(arg2, arg4);
			this.method5540(arg0, 0, arg1, 0, arg5, null, arg3 - this.aClass209_10.method5510(arg6) / 2, arg6);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Lclient!l;I[I[ILjava/lang/String;[II)V")
	private void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - this.aClass209_10.anInt6519;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static255.method5155(arg4.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(132) int local132;
				@Pc(140) int local140;
				if (local33 == '>' && local13 != -1) {
					@Pc(58) String local58 = arg4.substring(local13 + 1, local22);
					local13 = -1;
					if (local58.equals("lt")) {
						local33 = '<';
					} else if (local58.equals("gt")) {
						local33 = '>';
					} else if (local58.equals("nbsp")) {
						local33 = ' ';
					} else if (local58.equals("shy")) {
						local33 = '\u00ad';
					} else if (local58.equals("times")) {
						local33 = '×';
					} else if (local58.equals("euro")) {
						local33 = '€';
					} else if (local58.equals("copy")) {
						local33 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local132 = 0;
									} else {
										local132 = arg3[local17];
									}
									if (arg2 == null) {
										local140 = 0;
									} else {
										local140 = arg2[local17];
									}
									local17++;
									@Pc(153) int local153 = Static261.method4403(local58.substring(4));
									@Pc(157) Class57 local157 = arg1[local153];
									@Pc(166) int local166 = arg5 == null ? local157.method5441() : arg5[local153];
									local157.method5446(local132 + arg6, -local166 + this.aClass209_10.anInt6519 + local7 + local140, 0, 0);
									arg6 += arg1[local153].method5433();
									local15 = -1;
								} catch (@Pc(195) Exception local195) {
								}
							} else {
								this.method5543(local58);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg6 += this.aClass209_10.method5507(local15, local33);
					}
					@Pc(222) int local222;
					if (arg3 == null) {
						local222 = 0;
					} else {
						local222 = arg3[local17];
					}
					if (arg2 == null) {
						local132 = 0;
					} else {
						local132 = arg2[local17];
					}
					if (local33 != ' ') {
						if ((Static246.anInt4860 & 0xFF000000) != 0) {
							this.method5525(local33, local222 + arg6 + 1, local7 + 1 - -local132, Static246.anInt4860, true);
						}
						this.method5525(local33, arg6 + local222, local132 + local7, Static72.anInt1416, false);
					} else if (Static292.anInt5832 > 0) {
						Static54.anInt1162 += Static292.anInt5832;
						arg6 += Static54.anInt1162 >> 8;
						Static54.anInt1162 &= 0xFF;
					}
					local17++;
					local140 = this.aClass209_10.method5508(local33);
					if (Static235.anInt4718 != -1) {
						this.aClass122_10.method4736(Static235.anInt4718, arg6, local140, (int) ((double) this.aClass209_10.anInt6519 * 0.7D) + local7);
					}
					if (Static58.anInt1265 != -1) {
						this.aClass122_10.method4736(Static58.anInt1265, arg6, local140, local7 + this.aClass209_10.anInt6519);
					}
					local15 = local33;
					arg6 += local140;
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5547(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method5531(arg0, arg3);
			this.method5540(null, 0, null, 0, arg4, null, arg2 - this.aClass209_10.method5510(arg1) / 2, arg1);
		}
	}
}
