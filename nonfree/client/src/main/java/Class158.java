import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class158 {

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[B")
	private final byte[] aByteArray42;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public final int anInt3832;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	public final int anInt3838;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	public final int anInt3839;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
	public Class158(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(12) int local12 = local8.method5007();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method5007() == 1;
		this.aByteArray42 = new byte[256];
		local8.method5005(this.aByteArray42, 256);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			@Pc(59) int[] local59 = new int[256];
			for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
				local56[local61] = local8.method5007();
			}
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local59[local77] = local8.method5007();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method5063();
					local92[local94][local107] = local105;
				}
			}
			@Pc(138) byte[][] local138 = new byte[256][];
			@Pc(153) int local153;
			for (local107 = 0; local107 < 256; local107++) {
				local138[local107] = new byte[local56[local107]];
				@Pc(151) byte local151 = 0;
				for (local153 = 0; local153 < local138[local107].length; local153++) {
					local151 += local8.method5063();
					local138[local107][local153] = local151;
				}
			}
			this.aByteArrayArray9 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local153 = 0; local153 < 256; local153++) {
						if (local153 != 32 && local153 != 160) {
							this.aByteArrayArray9[local190][local153] = (byte) Static66.method1088(local138, local153, this.aByteArray42, local56, local59, local190, local92);
						}
					}
				}
			}
			this.anInt3832 = local59[32] + local56[32];
		} else {
			this.anInt3832 = local8.method5007();
		}
		local8.method5007();
		local8.method5007();
		this.anInt3838 = local8.method5007();
		this.anInt3839 = local8.method5007();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Lclient!l;Ljava/lang/String;II)I")
	public int method3025(@OriginalArg(1) Class95[] arg0, @OriginalArg(2) String arg1) {
		@Pc(21) int local21 = this.anInt3832;
		@Pc(34) int local34 = this.method3029(arg1, arg0, new int[] { 100 }, Static185.aStringArray29);
		@Pc(40) int local40 = (local34 - 1) * local21;
		return local40 + this.anInt3838 + this.anInt3839;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;I[Lclient!l;)Ljava/lang/String;")
	public String method3026(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95[] arg2) {
		if (arg1 >= this.method3032(arg0, arg2)) {
			return arg0;
		}
		@Pc(26) int local26 = arg1 - this.method3032("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(69) String local69 = arg0.substring(local28 + 1, local39);
					local28 = -1;
					if (local69.equals("lt")) {
						local45 = '<';
					} else if (local69.equals("gt")) {
						local45 = '>';
					} else if (local69.equals("nbsp")) {
						local45 = ' ';
					} else if (local69.equals("shy")) {
						local45 = '\u00ad';
					} else if (local69.equals("times")) {
						local45 = '×';
					} else if (local69.equals("euro")) {
						local45 = '€';
					} else if (local69.equals("copy")) {
						local45 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=") && arg2 != null) {
								try {
									@Pc(123) int local123 = Static113.method1676(local69.substring(4));
									local30 = -1;
									local32 += arg2[local123].j();
									if (local26 < local32) {
										return local37 + "...";
									}
									local37 = arg0.substring(0, local39 + 1);
								} catch (@Pc(157) Exception local157) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray42[Static339.method4488(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local30 != -1) {
						local32 += this.aByteArrayArray9[local30][local45];
					}
					local30 = local45;
					@Pc(217) int local217 = local32;
					if (this.aByteArrayArray9 != null) {
						local217 = local32 + this.aByteArrayArray9[local45][46];
					}
					if (local26 < local217) {
						return local37 + "...";
					}
					local37 = arg0.substring(0, local39 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;BI[Lclient!l;)I")
	public int method3027(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95[] arg2) {
		return this.method3029(arg0, arg2, new int[] { arg1 }, Static185.aStringArray29);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;[Lclient!l;I[I[Ljava/lang/String;)I")
	public int method3029(@OriginalArg(0) String arg0, @OriginalArg(1) Class95[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static339.method4488(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(64) int local64;
				if (local21 == -1) {
					local64 = local35;
					local47 = this.method3030(local45);
					if (this.aByteArrayArray9 != null && local28 != -1) {
						local47 += this.aByteArrayArray9[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local21;
					@Pc(71) String local71 = arg0.substring(local21 + 1, local35);
					local21 = -1;
					if (local71.equals("br")) {
						arg3[local30] = arg0.substring(local13, local35 + 1);
						local30++;
						if (local30 >= arg3.length) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local13 = local35 + 1;
						local28 = -1;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method3030(60);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][60];
						}
						local28 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method3030(62);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][62];
						}
						local28 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method3030(160);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][160];
						}
						local28 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method3030(173);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][173];
						}
						local28 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method3030(215);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][215];
						}
						local28 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method3030(8364);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][8364];
						}
						local28 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method3030(169);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][169];
						}
						local28 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method3030(174);
						if (this.aByteArrayArray9 != null && local28 != -1) {
							local47 += this.aByteArrayArray9[local28][174];
						}
						local28 = 174;
					} else if (local71.startsWith("img=") && arg1 != null) {
						try {
							@Pc(255) int local255 = Static113.method1676(local71.substring(4));
							local47 = arg1[local255].j();
							local28 = -1;
						} catch (@Pc(266) Exception local266) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg2 != null) {
						if (local45 == 32) {
							local15 = local35;
							local19 = 1;
							local17 = local11;
						}
						if (local11 > arg2[arg2.length > local30 ? local30 : arg2.length - 1]) {
							if (local15 >= 0) {
								arg3[local30] = arg0.substring(local13, local15 + 1 - local19);
								local30++;
								if (arg3.length <= local30) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local28 = -1;
								local11 -= local17;
							} else {
								arg3[local30] = arg0.substring(local13, local64);
								local30++;
								if (arg3.length <= local30) {
									return 0;
								}
								local13 = local64;
								local11 = local47;
								local15 = -1;
								local28 = -1;
							}
						}
						if (local45 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local35;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg3[local30] = arg0.substring(local13, arg0.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	public int method3030(@OriginalArg(0) int arg0) {
		return this.aByteArray42[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ICI)I")
	public int method3031(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray9 == null ? 0 : this.aByteArrayArray9[arg0][arg1];
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/lang/String;[Lclient!l;)I")
	public int method3032(@OriginalArg(1) String arg0, @OriginalArg(2) Class95[] arg1) {
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
					@Pc(49) String local49 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local49.equals("lt")) {
						local26 = '<';
					} else if (local49.equals("gt")) {
						local26 = '>';
					} else if (local49.equals("nbsp")) {
						local26 = ' ';
					} else if (local49.equals("shy")) {
						local26 = '\u00ad';
					} else if (local49.equals("times")) {
						local26 = '×';
					} else if (local49.equals("euro")) {
						local26 = '€';
					} else if (local49.equals("copy")) {
						local26 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=") && arg1 != null) {
								try {
									@Pc(117) int local117 = Static113.method1676(local49.substring(4));
									local15 += arg1[local117].j();
									local13 = -1;
								} catch (@Pc(128) Exception local128) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray42[Static339.method4488(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local13 != -1) {
						local15 += this.aByteArrayArray9[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/String;[Lclient!l;)I")
	public int method3036(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class95[] arg2) {
		@Pc(18) int local18 = this.method3029(arg1, arg2, new int[] { arg0 }, Static185.aStringArray29);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method3032(Static185.aStringArray29[local22], arg2);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method3038(@OriginalArg(1) String arg0) {
		return this.method3032(arg0, null);
	}
}
