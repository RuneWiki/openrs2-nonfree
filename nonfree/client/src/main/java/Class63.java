import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class63 {

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public final int anInt2003;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public final int anInt1998;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public final int anInt1997;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
	public Class63(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(12) int local12 = local8.method4532();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method4532() == 1;
		this.aByteArray30 = new byte[256];
		local8.method4519(256, this.aByteArray30);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local8.method4532();
			}
			@Pc(66) int[] local66 = new int[256];
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local66[local68] = local8.method4532();
			}
			@Pc(83) byte[][] local83 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				local83[local85] = new byte[local47[local85]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local83[local85].length; local98++) {
					local96 += local8.method4558();
					local83[local85][local98] = local96;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local98 = 0; local98 < 256; local98++) {
				local133[local98] = new byte[local47[local98]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local98].length; local148++) {
					local146 += local8.method4558();
					local133[local98][local148] = local146;
				}
			}
			this.aByteArrayArray5 = new byte[256][256];
			for (@Pc(181) int local181 = 0; local181 < 256; local181++) {
				if (local181 != 32 && local181 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray5[local181][local148] = (byte) Static318.method5217(this.aByteArray30, local133, local83, local66, local181, local47, local148);
						}
					}
				}
			}
			this.anInt2003 = local66[32] + local47[32];
		} else {
			this.anInt2003 = local8.method4532();
		}
		local8.method4532();
		local8.method4532();
		this.anInt1998 = local8.method4532();
		this.anInt1997 = local8.method4532();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([Ljava/lang/String;[Lclient!c;[ILjava/lang/String;B)I")
	public int method1745(@OriginalArg(0) String[] arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(27) byte local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg3.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static104.method2136(arg3.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local29 = local38;
			} else {
				@Pc(69) int local69;
				if (local29 == -1) {
					local50 = this.method1756(local48);
					local69 = local38;
					if (this.aByteArrayArray5 != null && local31 != -1) {
						local50 += this.aByteArrayArray5[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local69 = local29;
					@Pc(103) String local103 = arg3.substring(local29 + 1, local38);
					local29 = -1;
					if (local103.equals("br")) {
						arg0[local33] = arg3.substring(local21, local38 + 1);
						local33++;
						if (arg0.length <= local33) {
							return 0;
						}
						local23 = -1;
						local31 = -1;
						local21 = local38 + 1;
						local19 = 0;
						continue;
					}
					if (local103.equals("lt")) {
						local50 = this.method1756(60);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][60];
						}
						local31 = 60;
					} else if (local103.equals("gt")) {
						local50 = this.method1756(62);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][62];
						}
						local31 = 62;
					} else if (local103.equals("nbsp")) {
						local50 = this.method1756(160);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][160];
						}
						local31 = 160;
					} else if (local103.equals("shy")) {
						local50 = this.method1756(173);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][173];
						}
						local31 = 173;
					} else if (local103.equals("times")) {
						local50 = this.method1756(215);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][215];
						}
						local31 = 215;
					} else if (local103.equals("euro")) {
						local50 = this.method1756(8364);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][8364];
						}
						local31 = 8364;
					} else if (local103.equals("copy")) {
						local50 = this.method1756(169);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][169];
						}
						local31 = 169;
					} else if (local103.equals("reg")) {
						local50 = this.method1756(174);
						if (this.aByteArrayArray5 != null && local31 != -1) {
							local50 += this.aByteArrayArray5[local31][174];
						}
						local31 = 174;
					} else if (local103.startsWith("img=") && arg1 != null) {
						try {
							@Pc(233) int local233 = Static89.method1943(local103.substring(4));
							local31 = -1;
							local50 = arg1[local233].method3632();
						} catch (@Pc(244) Exception local244) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local19 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local23 = local38;
							local27 = 1;
							local25 = local19;
						}
						if (local19 > arg2[local33 >= arg2.length ? arg2.length - 1 : local33]) {
							if (local23 >= 0) {
								arg0[local33] = arg3.substring(local21, local23 + 1 - local27);
								local33++;
								if (arg0.length <= local33) {
									return 0;
								}
								local21 = local23 + 1;
								local23 = -1;
								local31 = -1;
								local19 -= local25;
							} else {
								arg0[local33] = arg3.substring(local21, local69);
								local33++;
								if (local33 >= arg0.length) {
									return 0;
								}
								local21 = local69;
								local19 = local50;
								local31 = -1;
								local23 = -1;
							}
						}
						if (local48 == 45) {
							local23 = local38;
							local27 = 0;
							local25 = local19;
						}
					}
				}
			}
		}
		if (local21 < arg3.length()) {
			arg0[local33] = arg3.substring(local21, arg3.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method1746(@OriginalArg(1) String arg0) {
		return this.method1755(null, arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;[Lclient!c;IZ)I")
	public int method1750(@OriginalArg(0) String arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) int arg2) {
		return this.method1745(Static154.aStringArray32, arg1, new int[] { arg2 }, arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI[Lclient!c;Ljava/lang/String;)I")
	public int method1751(@OriginalArg(3) Class5[] arg0, @OriginalArg(4) String arg1) {
		@Pc(16) int local16 = this.anInt2003;
		@Pc(29) int local29 = this.method1745(Static154.aStringArray32, arg0, new int[] { 100 }, arg1);
		@Pc(35) int local35 = (local29 - 1) * local16;
		return this.anInt1997 + local35 + this.anInt1998;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!c;)I")
	public int method1752(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5[] arg2) {
		@Pc(18) int local18 = this.method1745(Static154.aStringArray32, arg2, new int[] { arg1 }, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method1755(arg2, Static154.aStringArray32[local22]);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lclient!c;Ljava/lang/String;)I")
	public int method1755(@OriginalArg(1) Class5[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
			if (local31 == '<') {
				local16 = local25;
			} else {
				if (local31 == '>' && local16 != -1) {
					@Pc(53) String local53 = arg1.substring(local16 + 1, local25);
					local16 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg0 != null) {
								try {
									@Pc(123) int local123 = Static89.method1943(local53.substring(4));
									local20 += arg0[local123].method3632();
									local18 = -1;
								} catch (@Pc(134) Exception local134) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local16 == -1) {
					local20 += this.aByteArray30[Static104.method2136(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local18 != -1) {
						local20 += this.aByteArrayArray5[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
	public int method1756(@OriginalArg(1) int arg0) {
		return this.aByteArray30[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(CII)I")
	public int method1757(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray5 == null ? 0 : this.aByteArrayArray5[arg1][arg0];
	}
}
