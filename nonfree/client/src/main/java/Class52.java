import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class52 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "[B")
	private final byte[] aByteArray42;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public final int anInt1670;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	public final int anInt1675;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	public final int anInt1673;

	static {
		new Class202("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V")
	public Class52(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub29 local8 = new Class2_Sub29(arg0);
		@Pc(12) int local12 = local8.method5170();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5170() == 1;
		this.aByteArray42 = new byte[256];
		local8.method5184(256, this.aByteArray42);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local53[local58] = local8.method5170();
			}
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local56[local72] = local8.method5170();
			}
			@Pc(87) byte[][] local87 = new byte[256][];
			@Pc(102) int local102;
			for (@Pc(89) int local89 = 0; local89 < 256; local89++) {
				local87[local89] = new byte[local53[local89]];
				@Pc(100) byte local100 = 0;
				for (local102 = 0; local102 < local87[local89].length; local102++) {
					local100 += local8.method5179();
					local87[local89][local102] = local100;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local102 = 0; local102 < 256; local102++) {
				local133[local102] = new byte[local53[local102]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local102].length; local148++) {
					local146 += local8.method5179();
					local133[local102][local148] = local146;
				}
			}
			this.aByteArrayArray4 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray4[local181][local148] = (byte) Static257.method4027(local133, this.aByteArray42, local181, local148, local87, local53, local56);
						}
					}
				}
			}
			this.anInt1670 = local56[32] + local53[32];
		} else {
			this.anInt1670 = local8.method5170();
		}
		local8.method5170();
		local8.method5170();
		this.anInt1675 = local8.method5170();
		this.anInt1673 = local8.method5170();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI[Lclient!ha;Ljava/lang/String;)Ljava/lang/String;")
	public String method1579(@OriginalArg(1) int arg0, @OriginalArg(2) Class35[] arg1, @OriginalArg(3) String arg2) {
		if (this.method1580(arg2, arg1) <= arg0) {
			return arg2;
		}
		@Pc(26) int local26 = arg0 - this.method1580("...", null);
		@Pc(28) int local28 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg2.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg2.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(72) String local72 = arg2.substring(local28 + 1, local44);
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
							if (local72.startsWith("img=") && arg1 != null) {
								try {
									@Pc(146) int local146 = Static359.method5799(local72.substring(4));
									local35 = -1;
									local37 += arg1[local146].EA();
									if (local37 > local26) {
										return local42 + "...";
									}
									local42 = arg2.substring(0, local44 + 1);
								} catch (@Pc(176) Exception local176) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local37 += this.aByteArray42[Static36.method706(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray4 != null && local35 != -1) {
						local37 += this.aByteArrayArray4[local35][local50];
					}
					local35 = local50;
					@Pc(216) int local216 = local37;
					if (this.aByteArrayArray4 != null) {
						local216 = local37 + this.aByteArrayArray4[local50][46];
					}
					if (local216 > local26) {
						return local42 + "...";
					}
					local42 = arg2.substring(0, local44 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;B)I")
	public int method1580(@OriginalArg(0) String arg0, @OriginalArg(1) Class35[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int local27 = arg0.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) char local35 = arg0.charAt(local29);
			if (local35 == '<') {
				local11 = local29;
			} else {
				if (local35 == '>' && local11 != -1) {
					@Pc(57) String local57 = arg0.substring(local11 + 1, local29);
					local11 = -1;
					if (local57.equals("lt")) {
						local35 = '<';
					} else if (local57.equals("gt")) {
						local35 = '>';
					} else if (local57.equals("nbsp")) {
						local35 = ' ';
					} else if (local57.equals("shy")) {
						local35 = '\u00ad';
					} else if (local57.equals("times")) {
						local35 = '×';
					} else if (local57.equals("euro")) {
						local35 = '€';
					} else if (local57.equals("copy")) {
						local35 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=") && arg1 != null) {
								try {
									@Pc(121) int local121 = Static359.method5799(local57.substring(4));
									local24 += arg1[local121].EA();
									local13 = -1;
								} catch (@Pc(132) Exception local132) {
								}
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local11 == -1) {
					local24 += this.aByteArray42[Static36.method706(local35) & 0xFF] & 0xFF;
					if (this.aByteArrayArray4 != null && local13 != -1) {
						local24 += this.aByteArrayArray4[local13][local35];
					}
					local13 = local35;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/String;B[Lclient!ha;[ILjava/lang/String;)I")
	public int method1581(@OriginalArg(0) String[] arg0, @OriginalArg(2) Class35[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
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
		@Pc(36) int local36 = arg3.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static36.method706(arg3.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local21 = local38;
			} else {
				@Pc(63) int local63;
				if (local21 == -1) {
					local63 = local38;
					local50 = this.method1586(local48);
					if (this.aByteArrayArray4 != null && local23 != -1) {
						local50 += this.aByteArrayArray4[local23][local48];
					}
					local23 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local63 = local21;
					@Pc(101) String local101 = arg3.substring(local21 + 1, local38);
					local21 = -1;
					if (local101.equals("br")) {
						arg0[local25] = arg3.substring(local13, local38 + 1);
						local25++;
						if (arg0.length <= local25) {
							return 0;
						}
						local11 = 0;
						local15 = -1;
						local13 = local38 + 1;
						local23 = -1;
						continue;
					}
					if (local101.equals("lt")) {
						local50 = this.method1586(60);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][60];
						}
						local23 = 60;
					} else if (local101.equals("gt")) {
						local50 = this.method1586(62);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][62];
						}
						local23 = 62;
					} else if (local101.equals("nbsp")) {
						local50 = this.method1586(160);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][160];
						}
						local23 = 160;
					} else if (local101.equals("shy")) {
						local50 = this.method1586(173);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][173];
						}
						local23 = 173;
					} else if (local101.equals("times")) {
						local50 = this.method1586(215);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][215];
						}
						local23 = 215;
					} else if (local101.equals("euro")) {
						local50 = this.method1586(8364);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][8364];
						}
						local23 = 8364;
					} else if (local101.equals("copy")) {
						local50 = this.method1586(169);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][169];
						}
						local23 = 169;
					} else if (local101.equals("reg")) {
						local50 = this.method1586(174);
						if (this.aByteArrayArray4 != null && local23 != -1) {
							local50 += this.aByteArrayArray4[local23][174];
						}
						local23 = 174;
					} else if (local101.startsWith("img=") && arg1 != null) {
						try {
							@Pc(285) int local285 = Static359.method5799(local101.substring(4));
							local23 = -1;
							local50 = arg1[local285].EA();
						} catch (@Pc(296) Exception local296) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local17 = local11;
							local15 = local38;
							local19 = 1;
						}
						if (local11 > arg2[local25 < arg2.length ? local25 : arg2.length - 1]) {
							if (local15 >= 0) {
								arg0[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local11 -= local17;
								local15 = -1;
							} else {
								arg0[local25] = arg3.substring(local13, local63);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local11 = local50;
								local13 = local63;
								local23 = -1;
								local15 = -1;
							}
						}
						if (local48 == 45) {
							local19 = 0;
							local15 = local38;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg3.length()) {
			arg0[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method1582(@OriginalArg(1) String arg0) {
		return this.method1580(arg0, null);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(CII)I")
	public int method1583(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray4 == null ? 0 : this.aByteArrayArray4[arg1][arg0];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lclient!ha;BLjava/lang/String;I)I")
	public int method1584(@OriginalArg(0) Class35[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method1581(Static206.aStringArray22, arg0, new int[] { arg2 }, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method1580(Static206.aStringArray22[local27], arg0);
			if (local20 < local37) {
				local20 = local37;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
	public int method1586(@OriginalArg(0) int arg0) {
		return this.aByteArray42[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ha;I)I")
	public int method1587(@OriginalArg(1) String arg0, @OriginalArg(2) Class35[] arg1, @OriginalArg(3) int arg2) {
		return this.method1581(Static206.aStringArray22, arg1, new int[] { arg2 }, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[Lclient!ha;Ljava/lang/String;I)I")
	public int method1589(@OriginalArg(2) Class35[] arg0, @OriginalArg(3) String arg1) {
		@Pc(7) int local7 = this.anInt1670;
		@Pc(32) int local32 = this.method1581(Static206.aStringArray22, arg0, new int[] { 100 }, arg1);
		@Pc(38) int local38 = local7 * (local32 - 1);
		return local38 + this.anInt1675 + this.anInt1673;
	}
}
