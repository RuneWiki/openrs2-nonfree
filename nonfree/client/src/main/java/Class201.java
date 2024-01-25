import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class201 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "[B")
	private final byte[] aByteArray65;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public final int anInt5069;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
	public final int anInt5071;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public final int anInt5070;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "([B)V")
	public Class201(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(arg0);
		@Pc(12) int local12 = local8.method3111();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method3111() == 1;
		this.aByteArray65 = new byte[256];
		local8.method3127(this.aByteArray65, 256);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local56[local58] = local8.method3111();
			}
			@Pc(75) int[] local75 = new int[256];
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local75[local77] = local8.method3111();
			}
			@Pc(94) byte[][] local94 = new byte[256][];
			@Pc(109) int local109;
			for (@Pc(96) int local96 = 0; local96 < 256; local96++) {
				local94[local96] = new byte[local56[local96]];
				@Pc(107) byte local107 = 0;
				for (local109 = 0; local109 < local94[local96].length; local109++) {
					local107 += local8.method3116();
					local94[local96][local109] = local107;
				}
			}
			@Pc(144) byte[][] local144 = new byte[256][];
			@Pc(159) int local159;
			for (local109 = 0; local109 < 256; local109++) {
				local144[local109] = new byte[local56[local109]];
				@Pc(157) byte local157 = 0;
				for (local159 = 0; local159 < local144[local109].length; local159++) {
					local157 += local8.method3116();
					local144[local109][local159] = local157;
				}
			}
			this.aByteArrayArray28 = new byte[256][256];
			for (@Pc(198) int local198 = 0; local198 < 256; local198++) {
				if (local198 != 32 && local198 != 160) {
					for (local159 = 0; local159 < 256; local159++) {
						if (local159 != 32 && local159 != 160) {
							this.aByteArrayArray28[local198][local159] = (byte) Static294.method4339(local75, this.aByteArray65, local159, local56, local198, local94, local144);
						}
					}
				}
			}
			this.anInt5069 = local56[32] + local75[32];
		} else {
			this.anInt5069 = local8.method3111();
		}
		local8.method3111();
		local8.method3111();
		this.anInt5071 = local8.method3111();
		this.anInt5070 = local8.method3111();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[Lclient!ig;Ljava/lang/String;I)I")
	public int method4449(@OriginalArg(1) Class12[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method4458(Static63.aStringArray7, new int[] { arg2 }, arg1, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(38) int local38 = this.method4460(arg0, Static63.aStringArray7[local28]);
			if (local38 > local20) {
				local20 = local38;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lclient!ig;ILjava/lang/String;I)Ljava/lang/String;")
	public String method4451(@OriginalArg(0) Class12[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.method4460(arg0, arg1) <= arg2) {
			return arg1;
		}
		@Pc(26) int local26 = arg2 - this.method4460(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg1.length();
		@Pc(37) String local37 = "";
		for (@Pc(44) int local44 = 0; local44 < local35; local44++) {
			@Pc(50) char local50 = arg1.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(72) String local72 = arg1.substring(local28 + 1, local44);
					local28 = -1;
					if (local72.equals("lt")) {
						local50 = '<';
					} else if (local72.equals("gt")) {
						local50 = '>';
					} else if (local72.equals("nbsp")) {
						local50 = ' ';
					} else if (local72.equals("shy")) {
						local50 = '\u00ad';
					} else if (local72.equals("times")) {
						local50 = '×';
					} else if (local72.equals("euro")) {
						local50 = '€';
					} else if (local72.equals("copy")) {
						local50 = '©';
					} else {
						if (!local72.equals("reg")) {
							if (local72.startsWith("img=") && arg0 != null) {
								try {
									@Pc(136) int local136 = Static265.method4063(local72.substring(4));
									local32 += arg0[local136].method5654();
									local30 = -1;
									if (local32 > local26) {
										return local37 + "...";
									}
									local37 = arg1.substring(0, local44 + 1);
								} catch (@Pc(166) Exception local166) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray65[Static198.method3145(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray28 != null && local30 != -1) {
						local32 += this.aByteArrayArray28[local30][local50];
					}
					local30 = local50;
					@Pc(218) int local218 = local32;
					if (this.aByteArrayArray28 != null) {
						local218 = local32 + this.aByteArrayArray28[local50][46];
					}
					if (local218 > local26) {
						return local37 + "...";
					}
					local37 = arg1.substring(0, local44 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4452(@OriginalArg(0) String arg0) {
		return this.method4460(null, arg0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Lclient!ig;IBLjava/lang/String;)I")
	public int method4454(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return this.method4458(Static63.aStringArray7, new int[] { arg1 }, arg2, arg0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIC)I")
	public int method4455(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray28 == null ? 0 : this.aByteArrayArray28[arg0][arg1];
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)I")
	public int method4456(@OriginalArg(1) int arg0) {
		return this.aByteArray65[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lclient!ig;IILjava/lang/String;)I")
	public int method4457(@OriginalArg(1) Class12[] arg0, @OriginalArg(4) String arg1) {
		@Pc(7) int local7 = this.anInt5069;
		@Pc(24) int local24 = this.method4458(Static63.aStringArray7, new int[] { 100 }, arg1, arg0);
		@Pc(30) int local30 = (local24 - 1) * local7;
		return this.anInt5070 + this.anInt5071 + local30;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Ljava/lang/String;B[ILjava/lang/String;[Lclient!ig;)I")
	public int method4458(@OriginalArg(0) String[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class12[] arg3) {
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
		@Pc(28) int local28 = arg2.length();
		for (@Pc(36) int local36 = 0; local36 < local28; local36++) {
			@Pc(46) int local46 = Static198.method3145(arg2.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local21 = local36;
			} else {
				@Pc(67) int local67;
				if (local21 == -1) {
					local48 = this.method4456(local46);
					local67 = local36;
					if (this.aByteArrayArray28 != null && local23 != -1) {
						local48 += this.aByteArrayArray28[local23][local46];
					}
					local23 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local67 = local21;
					@Pc(99) String local99 = arg2.substring(local21 + 1, local36);
					local21 = -1;
					if (local99.equals("br")) {
						arg0[local25] = arg2.substring(local13, local36 + 1);
						local25++;
						if (local25 >= arg0.length) {
							return 0;
						}
						local23 = -1;
						local15 = -1;
						local13 = local36 + 1;
						local11 = 0;
						continue;
					}
					if (local99.equals("lt")) {
						local48 = this.method4456(60);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][60];
						}
						local23 = 60;
					} else if (local99.equals("gt")) {
						local48 = this.method4456(62);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][62];
						}
						local23 = 62;
					} else if (local99.equals("nbsp")) {
						local48 = this.method4456(160);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][160];
						}
						local23 = 160;
					} else if (local99.equals("shy")) {
						local48 = this.method4456(173);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][173];
						}
						local23 = 173;
					} else if (local99.equals("times")) {
						local48 = this.method4456(215);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][215];
						}
						local23 = 215;
					} else if (local99.equals("euro")) {
						local48 = this.method4456(8364);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][8364];
						}
						local23 = 8364;
					} else if (local99.equals("copy")) {
						local48 = this.method4456(169);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][169];
						}
						local23 = 169;
					} else if (local99.equals("reg")) {
						local48 = this.method4456(174);
						if (this.aByteArrayArray28 != null && local23 != -1) {
							local48 += this.aByteArrayArray28[local23][174];
						}
						local23 = 174;
					} else if (local99.startsWith("img=") && arg3 != null) {
						try {
							@Pc(283) int local283 = Static265.method4063(local99.substring(4));
							local48 = arg3[local283].method5654();
							local23 = -1;
						} catch (@Pc(294) Exception local294) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg1 != null) {
						if (local46 == 32) {
							local15 = local36;
							local17 = local11;
							local19 = 1;
						}
						if (arg1[local25 >= arg1.length ? arg1.length - 1 : local25] < local11) {
							if (local15 >= 0) {
								arg0[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local23 = -1;
								local11 -= local17;
							} else {
								arg0[local25] = arg2.substring(local13, local67);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local23 = -1;
								local11 = local48;
								local15 = -1;
								local13 = local67;
							}
						}
						if (local46 == 45) {
							local15 = local36;
							local17 = local11;
							local19 = 0;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg0[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lclient!ig;Ljava/lang/String;)I")
	public int method4460(@OriginalArg(1) Class12[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local19 = local28;
			} else {
				if (local34 == '>' && local19 != -1) {
					@Pc(57) String local57 = arg1.substring(local19 + 1, local28);
					local19 = -1;
					if (local57.equals("lt")) {
						local34 = '<';
					} else if (local57.equals("gt")) {
						local34 = '>';
					} else if (local57.equals("nbsp")) {
						local34 = ' ';
					} else if (local57.equals("shy")) {
						local34 = '\u00ad';
					} else if (local57.equals("times")) {
						local34 = '×';
					} else if (local57.equals("euro")) {
						local34 = '€';
					} else if (local57.equals("copy")) {
						local34 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=") && arg0 != null) {
								try {
									@Pc(119) int local119 = Static265.method4063(local57.substring(4));
									local21 = -1;
									local23 += arg0[local119].method5654();
								} catch (@Pc(130) Exception local130) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local19 == -1) {
					local23 += this.aByteArray65[Static198.method3145(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray28 != null && local21 != -1) {
						local23 += this.aByteArrayArray28[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}
}
