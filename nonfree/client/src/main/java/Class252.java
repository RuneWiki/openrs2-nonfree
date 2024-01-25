import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class252 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[[B")
	private byte[][] aByteArrayArray131;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public final int anInt6659;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public final int anInt6656;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	public final int anInt6663;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V")
	public Class252(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub19 local8 = new Class1_Sub19(arg0);
		@Pc(12) int local12 = local8.method2915();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method2915() == 1;
		this.aByteArray89 = new byte[256];
		local8.method2937(256, this.aByteArray89);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			@Pc(52) int[] local52 = new int[256];
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				local49[local54] = local8.method2915();
			}
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local52[local68] = local8.method2915();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local49[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method2917();
					local85[local87][local100] = local98;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local100 = 0; local100 < 256; local100++) {
				local131[local100] = new byte[local49[local100]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local100].length; local146++) {
					local144 += local8.method2917();
					local131[local100][local146] = local144;
				}
			}
			this.aByteArrayArray131 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray131[local181][local146] = (byte) Static145.method1821(local52, this.aByteArray89, local131, local146, local49, local181, local85);
						}
					}
				}
			}
			this.anInt6659 = local49[32] + local52[32];
		} else {
			this.anInt6659 = local8.method2915();
		}
		local8.method2915();
		local8.method2915();
		this.anInt6656 = local8.method2915();
		this.anInt6663 = local8.method2915();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ICI)I")
	public int method5290(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray131 == null ? 0 : this.aByteArrayArray131[arg0][arg1];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5291(@OriginalArg(0) String arg0) {
		return this.method5295(arg0, null);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;B[Lclient!o;)I")
	public int method5292(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class85[] arg2) {
		return this.method5297(arg1, Static229.aStringArray31, arg2, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!o;)Ljava/lang/String;")
	public String method5294(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class85[] arg2) {
		if (this.method5295(arg0, arg2) <= arg1) {
			return arg0;
		}
		@Pc(31) int local31 = arg1 - this.method5295("...", null);
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local33 = local44;
			} else {
				if (local50 == '>' && local33 != -1) {
					@Pc(75) String local75 = arg0.substring(local33 + 1, local44);
					local33 = -1;
					if (local75.equals("lt")) {
						local50 = '<';
					} else if (local75.equals("gt")) {
						local50 = '>';
					} else if (local75.equals("nbsp")) {
						local50 = ' ';
					} else if (local75.equals("shy")) {
						local50 = '\u00ad';
					} else if (local75.equals("times")) {
						local50 = '×';
					} else if (local75.equals("euro")) {
						local50 = '€';
					} else if (local75.equals("copy")) {
						local50 = '©';
					} else {
						if (!local75.equals("reg")) {
							if (local75.startsWith("img=") && arg2 != null) {
								try {
									@Pc(125) int local125 = Static252.method3564(local75.substring(4));
									local35 = -1;
									local37 += arg2[local125].RA();
									if (local31 < local37) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(159) Exception local159) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local33 == -1) {
					local37 += this.aByteArray89[Static200.method2869(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray131 != null && local35 != -1) {
						local37 += this.aByteArrayArray131[local35][local50];
					}
					local35 = local50;
					@Pc(223) int local223 = local37;
					if (this.aByteArrayArray131 != null) {
						local223 = local37 + this.aByteArrayArray131[local50][46];
					}
					if (local31 < local223) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/lang/String;[Lclient!o;)I")
	public int method5295(@OriginalArg(1) String arg0, @OriginalArg(2) Class85[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg0.charAt(local28);
			if (local34 == '<') {
				local19 = local28;
			} else {
				if (local34 == '>' && local19 != -1) {
					@Pc(56) String local56 = arg0.substring(local19 + 1, local28);
					local19 = -1;
					if (local56.equals("lt")) {
						local34 = '<';
					} else if (local56.equals("gt")) {
						local34 = '>';
					} else if (local56.equals("nbsp")) {
						local34 = ' ';
					} else if (local56.equals("shy")) {
						local34 = '\u00ad';
					} else if (local56.equals("times")) {
						local34 = '×';
					} else if (local56.equals("euro")) {
						local34 = '€';
					} else if (local56.equals("copy")) {
						local34 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(116) int local116 = Static252.method3564(local56.substring(4));
									local21 = -1;
									local23 += arg1[local116].RA();
								} catch (@Pc(127) Exception local127) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local19 == -1) {
					local23 += this.aByteArray89[Static200.method2869(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray131 != null && local21 != -1) {
						local23 += this.aByteArrayArray131[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BILjava/lang/String;[Lclient!o;)I")
	public int method5296(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class85[] arg2) {
		@Pc(18) int local18 = this.method5297(arg1, Static229.aStringArray31, arg2, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method5295(Static229.aStringArray31[local22], arg2);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Z[Ljava/lang/String;[Lclient!o;[I)I")
	public int method5297(@OriginalArg(0) String arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) Class85[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
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
		@Pc(28) int local28 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local28; local35++) {
			@Pc(45) int local45 = Static200.method2869(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(64) int local64;
				if (local21 == -1) {
					local64 = local35;
					local47 = this.method5299(local45);
					if (this.aByteArrayArray131 != null && local23 != -1) {
						local47 += this.aByteArrayArray131[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local21;
					@Pc(71) String local71 = arg0.substring(local21 + 1, local35);
					local21 = -1;
					if (local71.equals("br")) {
						arg1[local25] = arg0.substring(local13, local35 + 1);
						local25++;
						if (local25 >= arg1.length) {
							return 0;
						}
						local15 = -1;
						local23 = -1;
						local13 = local35 + 1;
						local11 = 0;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method5299(60);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][60];
						}
						local23 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method5299(62);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][62];
						}
						local23 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method5299(160);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][160];
						}
						local23 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method5299(173);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][173];
						}
						local23 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method5299(215);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][215];
						}
						local23 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method5299(8364);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][8364];
						}
						local23 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method5299(169);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][169];
						}
						local23 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method5299(174);
						if (this.aByteArrayArray131 != null && local23 != -1) {
							local47 += this.aByteArrayArray131[local23][174];
						}
						local23 = 174;
					} else if (local71.startsWith("img=") && arg2 != null) {
						try {
							@Pc(252) int local252 = Static252.method3564(local71.substring(4));
							local47 = arg2[local252].RA();
							local23 = -1;
						} catch (@Pc(263) Exception local263) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local19 = 1;
							local15 = local35;
							local17 = local11;
						}
						if (local11 > arg3[arg3.length > local25 ? local25 : arg3.length - 1]) {
							if (local15 >= 0) {
								arg1[local25] = arg0.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local23 = -1;
								local15 = -1;
							} else {
								arg1[local25] = arg0.substring(local13, local64);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local11 = local47;
								local13 = local64;
								local23 = -1;
								local15 = -1;
							}
						}
						if (local45 == 45) {
							local17 = local11;
							local19 = 0;
							local15 = local35;
						}
					}
				}
			}
		}
		if (local13 < arg0.length()) {
			arg1[local25] = arg0.substring(local13, arg0.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!o;II)I")
	public int method5298(@OriginalArg(0) String arg0, @OriginalArg(2) Class85[] arg1) {
		@Pc(19) int local19 = this.anInt6659;
		@Pc(32) int local32 = this.method5297(arg0, Static229.aStringArray31, arg1, new int[] { 100 });
		@Pc(38) int local38 = (local32 - 1) * local19;
		return local38 + this.anInt6656 + this.anInt6663;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
	public int method5299(@OriginalArg(1) int arg0) {
		return this.aByteArray89[arg0] & 0xFF;
	}
}
