import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class141 {

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "[B")
	private final byte[] aByteArray45;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "[[B")
	private byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	public final int anInt3615;

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	public final int anInt3623;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	public final int anInt3614;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([B)V")
	public Class141(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(12) int local12 = local8.method3580();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method3580() == 1;
		this.aByteArray45 = new byte[256];
		local8.method3598(this.aByteArray45, 256);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local49[local51] = local8.method3580();
			}
			@Pc(68) int[] local68 = new int[256];
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local68[local70] = local8.method3580();
			}
			@Pc(87) byte[][] local87 = new byte[256][];
			@Pc(102) int local102;
			for (@Pc(89) int local89 = 0; local89 < 256; local89++) {
				local87[local89] = new byte[local49[local89]];
				@Pc(100) byte local100 = 0;
				for (local102 = 0; local102 < local87[local89].length; local102++) {
					local100 += local8.method3605();
					local87[local89][local102] = local100;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local102 = 0; local102 < 256; local102++) {
				local131[local102] = new byte[local49[local102]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local102].length; local146++) {
					local144 += local8.method3605();
					local131[local102][local146] = local144;
				}
			}
			this.aByteArrayArray30 = new byte[256][256];
			for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
				if (local185 != 32 && local185 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray30[local185][local146] = (byte) Static162.method2263(local131, local49, local146, this.aByteArray45, local185, local87, local68);
						}
					}
				}
			}
			this.anInt3615 = local68[32] + local49[32];
		} else {
			this.anInt3615 = local8.method3580();
		}
		local8.method3580();
		local8.method3580();
		this.anInt3623 = local8.method3580();
		this.anInt3614 = local8.method3580();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([Lclient!o;IBLjava/lang/String;)I")
	public int method2905(@OriginalArg(0) Class13[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return this.method2910(arg0, new int[] { arg1 }, arg2, Static19.aStringArray2);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[Lclient!o;ILjava/lang/String;)I")
	public int method2906(@OriginalArg(1) Class13[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method2910(arg0, new int[] { arg1 }, arg2, Static19.aStringArray2);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method2909(Static19.aStringArray2[local22], arg0);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BCI)I")
	public int method2907(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray30 == null ? 0 : this.aByteArrayArray30[arg1][arg0];
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!o;I)I")
	public int method2908(@OriginalArg(1) String arg0, @OriginalArg(3) Class13[] arg1) {
		@Pc(8) int local8 = this.anInt3615;
		@Pc(21) int local21 = this.method2910(arg1, new int[] { 100 }, arg0, Static19.aStringArray2);
		@Pc(27) int local27 = local8 * (local21 - 1);
		return local27 + this.anInt3623 + this.anInt3614;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;[Lclient!o;I)I")
	public int method2909(@OriginalArg(0) String arg0, @OriginalArg(1) Class13[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 == '<') {
				local11 = local20;
			} else {
				if (local26 == '>' && local11 != -1) {
					@Pc(46) String local46 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local46.equals("lt")) {
						local26 = '<';
					} else if (local46.equals("gt")) {
						local26 = '>';
					} else if (local46.equals("nbsp")) {
						local26 = ' ';
					} else if (local46.equals("shy")) {
						local26 = '\u00ad';
					} else if (local46.equals("times")) {
						local26 = '×';
					} else if (local46.equals("euro")) {
						local26 = '€';
					} else if (local46.equals("copy")) {
						local26 = '©';
					} else {
						if (!local46.equals("reg")) {
							if (local46.startsWith("img=") && arg1 != null) {
								try {
									@Pc(122) int local122 = Static205.method2736(local46.substring(4));
									local13 = -1;
									local15 += arg1[local122].RA();
								} catch (@Pc(133) Exception local133) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray45[Static409.method5179(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray30 != null && local13 != -1) {
						local15 += this.aByteArrayArray30[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([Lclient!o;B[ILjava/lang/String;[Ljava/lang/String;)I")
	public int method2910(@OriginalArg(0) Class13[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(47) int local47 = Static409.method5179(arg2.charAt(local35)) & 0xFF;
			@Pc(49) int local49 = 0;
			if (local47 == 60) {
				local21 = local35;
			} else {
				@Pc(62) int local62;
				if (local21 == -1) {
					local62 = local35;
					local49 = this.method2913(local47);
					if (this.aByteArrayArray30 != null && local23 != -1) {
						local49 += this.aByteArrayArray30[local23][local47];
					}
					local23 = local47;
				} else {
					if (local47 != 62) {
						continue;
					}
					local62 = local21;
					@Pc(102) String local102 = arg2.substring(local21 + 1, local35);
					local21 = -1;
					if (local102.equals("br")) {
						arg3[local25] = arg2.substring(local13, local35 + 1);
						local25++;
						if (local25 >= arg3.length) {
							return 0;
						}
						local23 = -1;
						local15 = -1;
						local13 = local35 + 1;
						local11 = 0;
						continue;
					}
					if (local102.equals("lt")) {
						local49 = this.method2913(60);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][60];
						}
						local23 = 60;
					} else if (local102.equals("gt")) {
						local49 = this.method2913(62);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][62];
						}
						local23 = 62;
					} else if (local102.equals("nbsp")) {
						local49 = this.method2913(160);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][160];
						}
						local23 = 160;
					} else if (local102.equals("shy")) {
						local49 = this.method2913(173);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][173];
						}
						local23 = 173;
					} else if (local102.equals("times")) {
						local49 = this.method2913(215);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][215];
						}
						local23 = 215;
					} else if (local102.equals("euro")) {
						local49 = this.method2913(8364);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][8364];
						}
						local23 = 8364;
					} else if (local102.equals("copy")) {
						local49 = this.method2913(169);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][169];
						}
						local23 = 169;
					} else if (local102.equals("reg")) {
						local49 = this.method2913(174);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local49 += this.aByteArrayArray30[local23][174];
						}
						local23 = 174;
					} else if (local102.startsWith("img=") && arg0 != null) {
						try {
							@Pc(262) int local262 = Static205.method2736(local102.substring(4));
							local49 = arg0[local262].RA();
							local23 = -1;
						} catch (@Pc(273) Exception local273) {
						}
					}
					local47 = -1;
				}
				if (local49 > 0) {
					local11 += local49;
					if (arg1 != null) {
						if (local47 == 32) {
							local15 = local35;
							local17 = local11;
							local19 = 1;
						}
						if (local11 > arg1[arg1.length > local25 ? local25 : arg1.length - 1]) {
							if (local15 >= 0) {
								arg3[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg3.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local23 = -1;
								local11 -= local17;
							} else {
								arg3[local25] = arg2.substring(local13, local62);
								local25++;
								if (local25 >= arg3.length) {
									return 0;
								}
								local13 = local62;
								local11 = local49;
								local15 = -1;
								local23 = -1;
							}
						}
						if (local47 == 45) {
							local15 = local35;
							local17 = local11;
							local19 = 0;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg3[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BILjava/lang/String;[Lclient!o;)Ljava/lang/String;")
	public String method2911(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class13[] arg2) {
		if (this.method2909(arg1, arg2) <= arg0) {
			return arg1;
		}
		@Pc(33) int local33 = arg0 - this.method2909("...", null);
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg1.length();
		@Pc(44) String local44 = "";
		for (@Pc(46) int local46 = 0; local46 < local42; local46++) {
			@Pc(52) char local52 = arg1.charAt(local46);
			if (local52 == '<') {
				local35 = local46;
			} else {
				if (local52 == '>' && local35 != -1) {
					@Pc(77) String local77 = arg1.substring(local35 + 1, local46);
					local35 = -1;
					if (local77.equals("lt")) {
						local52 = '<';
					} else if (local77.equals("gt")) {
						local52 = '>';
					} else if (local77.equals("nbsp")) {
						local52 = ' ';
					} else if (local77.equals("shy")) {
						local52 = '\u00ad';
					} else if (local77.equals("times")) {
						local52 = '×';
					} else if (local77.equals("euro")) {
						local52 = '€';
					} else if (local77.equals("copy")) {
						local52 = '©';
					} else {
						if (!local77.equals("reg")) {
							if (local77.startsWith("img=") && arg2 != null) {
								try {
									@Pc(131) int local131 = Static205.method2736(local77.substring(4));
									local37 = -1;
									local39 += arg2[local131].RA();
									if (local33 < local39) {
										return local44 + "...";
									}
									local44 = arg1.substring(0, local46 + 1);
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local52 = '®';
					}
				}
				if (local35 == -1) {
					local39 += this.aByteArray45[Static409.method5179(local52) & 0xFF] & 0xFF;
					if (this.aByteArrayArray30 != null && local37 != -1) {
						local39 += this.aByteArrayArray30[local37][local52];
					}
					local37 = local52;
					@Pc(226) int local226 = local39;
					if (this.aByteArrayArray30 != null) {
						local226 = local39 + this.aByteArrayArray30[local52][46];
					}
					if (local226 > local33) {
						return local44 + "...";
					}
					local44 = arg1.substring(0, local46 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB)I")
	public int method2913(@OriginalArg(0) int arg0) {
		return this.aByteArray45[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2914(@OriginalArg(1) String arg0) {
		return this.method2909(arg0, null);
	}
}
