import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class36 {

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public final int anInt729;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public final int anInt728;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
	public final int anInt737;

	static {
		new Class85("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
	public Class36(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class5_Sub12 local6 = new Class5_Sub12(arg0);
		@Pc(10) int local10 = local6.method5115();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(26) boolean local26 = local6.method5115() == 1;
		this.aByteArray6 = new byte[256];
		local6.method5058(256, this.aByteArray6);
		if (local26) {
			@Pc(48) int[] local48 = new int[256];
			@Pc(51) int[] local51 = new int[256];
			for (@Pc(53) int local53 = 0; local53 < 256; local53++) {
				local48[local53] = local6.method5115();
			}
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local51[local68] = local6.method5115();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(96) int local96;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local48[local84]];
				@Pc(94) byte local94 = 0;
				for (local96 = 0; local96 < local82[local84].length; local96++) {
					local94 += local6.method5098();
					local82[local84][local96] = local94;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(140) int local140;
			for (local96 = 0; local96 < 256; local96++) {
				local126[local96] = new byte[local48[local96]];
				@Pc(138) byte local138 = 0;
				for (local140 = 0; local140 < local126[local96].length; local140++) {
					local138 += local6.method5098();
					local126[local96][local140] = local138;
				}
			}
			this.aByteArrayArray2 = new byte[256][256];
			for (@Pc(172) int local172 = 0; local172 < 256; local172++) {
				if (local172 != 32 && local172 != 160) {
					for (local140 = 0; local140 < 256; local140++) {
						if (local140 != 32 && local140 != 160) {
							this.aByteArrayArray2[local172][local140] = (byte) Static85.method1514(local82, local172, this.aByteArray6, local140, local51, local126, local48);
						}
					}
				}
			}
			this.anInt729 = local51[32] + local48[32];
		} else {
			this.anInt729 = local6.method5115();
		}
		local6.method5115();
		local6.method5115();
		this.anInt728 = local6.method5115();
		this.anInt737 = local6.method5115();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method640(@OriginalArg(0) String arg0) {
		return this.method641(null, arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([Lclient!wn;ILjava/lang/String;)I")
	public int method641(@OriginalArg(0) Class95[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(23) char local23 = arg1.charAt(local18);
			if (local23 == '<') {
				local9 = local18;
			} else {
				if (local23 == '>' && local9 != -1) {
					@Pc(44) String local44 = arg1.substring(local9 + 1, local18);
					local9 = -1;
					if (local44.equals("lt")) {
						local23 = '<';
					} else if (local44.equals("gt")) {
						local23 = '>';
					} else if (local44.equals("nbsp")) {
						local23 = ' ';
					} else if (local44.equals("shy")) {
						local23 = '\u00ad';
					} else if (local44.equals("times")) {
						local23 = '×';
					} else if (local44.equals("euro")) {
						local23 = '€';
					} else if (local44.equals("copy")) {
						local23 = '©';
					} else {
						if (!local44.equals("reg")) {
							if (local44.startsWith("img=") && arg0 != null) {
								try {
									@Pc(105) int local105 = Static36.method580(local44.substring(4));
									local11 = -1;
									local13 += arg0[local105].method5507();
								} catch (@Pc(116) Exception local116) {
								}
							}
							continue;
						}
						local23 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray6[Static338.method6009(local23) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local11 != -1) {
						local13 += this.aByteArrayArray2[local11][local23];
					}
					local11 = local23;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;[Lclient!wn;BI)I")
	public int method642(@OriginalArg(0) String arg0, @OriginalArg(1) Class95[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.method644(arg1, Static288.aStringArray56, arg0, new int[] { arg2 });
		@Pc(18) int local18 = 0;
		for (@Pc(28) int local28 = 0; local28 < local16; local28++) {
			@Pc(37) int local37 = this.method641(arg1, Static288.aStringArray56[local28]);
			if (local37 > local18) {
				local18 = local37;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[Lclient!wn;Ljava/lang/String;I)I")
	public int method643(@OriginalArg(0) int arg0, @OriginalArg(1) Class95[] arg1, @OriginalArg(2) String arg2) {
		return this.method644(arg1, Static288.aStringArray56, arg2, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([Lclient!wn;[Ljava/lang/String;BLjava/lang/String;[I)I")
	public int method644(@OriginalArg(0) Class95[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(20) int local20 = 0;
		@Pc(22) byte local22 = 0;
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg2.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(42) int local42 = Static338.method6009(arg2.charAt(local33)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local24 = local33;
			} else {
				@Pc(56) int local56;
				if (local24 == -1) {
					local56 = local33;
					local44 = this.method649(local42);
					if (this.aByteArrayArray2 != null && local26 != -1) {
						local44 += this.aByteArrayArray2[local26][local42];
					}
					local26 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local56 = local24;
					@Pc(93) String local93 = arg2.substring(local24 + 1, local33);
					local24 = -1;
					if (local93.equals("br")) {
						arg1[local28] = arg2.substring(local11, local33 + 1);
						local28++;
						if (arg1.length <= local28) {
							return 0;
						}
						local26 = -1;
						local13 = -1;
						local9 = 0;
						local11 = local33 + 1;
						continue;
					}
					if (local93.equals("lt")) {
						local44 = this.method649(60);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][60];
						}
						local26 = 60;
					} else if (local93.equals("gt")) {
						local44 = this.method649(62);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][62];
						}
						local26 = 62;
					} else if (local93.equals("nbsp")) {
						local44 = this.method649(160);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][160];
						}
						local26 = 160;
					} else if (local93.equals("shy")) {
						local44 = this.method649(173);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][173];
						}
						local26 = 173;
					} else if (local93.equals("times")) {
						local44 = this.method649(215);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][215];
						}
						local26 = 215;
					} else if (local93.equals("euro")) {
						local44 = this.method649(8364);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][8364];
						}
						local26 = 8364;
					} else if (local93.equals("copy")) {
						local44 = this.method649(169);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][169];
						}
						local26 = 169;
					} else if (local93.equals("reg")) {
						local44 = this.method649(174);
						if (this.aByteArrayArray2 != null && local26 != -1) {
							local44 += this.aByteArrayArray2[local26][174];
						}
						local26 = 174;
					} else if (local93.startsWith("img=") && arg0 != null) {
						try {
							@Pc(218) int local218 = Static36.method580(local93.substring(4));
							local26 = -1;
							local44 = arg0[local218].method5507();
						} catch (@Pc(229) Exception local229) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local9 += local44;
					if (arg3 != null) {
						if (local42 == 32) {
							local13 = local33;
							local20 = local9;
							local22 = 1;
						}
						if (arg3[arg3.length > local28 ? local28 : arg3.length - 1] < local9) {
							if (local13 < 0) {
								arg1[local28] = arg2.substring(local11, local56);
								local28++;
								if (arg1.length <= local28) {
									return 0;
								}
								local9 = local44;
								local26 = -1;
								local11 = local56;
								local13 = -1;
							} else {
								arg1[local28] = arg2.substring(local11, local13 + 1 - local22);
								local28++;
								if (arg1.length <= local28) {
									return 0;
								}
								local11 = local13 + 1;
								local9 -= local20;
								local26 = -1;
								local13 = -1;
							}
						}
						if (local42 == 45) {
							local20 = local9;
							local13 = local33;
							local22 = 0;
						}
					}
				}
			}
		}
		if (local11 < arg2.length()) {
			arg1[local28] = arg2.substring(local11, arg2.length());
			local28++;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[Lclient!wn;Ljava/lang/String;IB)I")
	public int method645(@OriginalArg(1) Class95[] arg0, @OriginalArg(2) String arg1) {
		@Pc(13) int local13 = this.anInt729;
		@Pc(26) int local26 = this.method644(arg0, Static288.aStringArray56, arg1, new int[] { 100 });
		@Pc(32) int local32 = local13 * (local26 - 1);
		return local32 + this.anInt728 + this.anInt737;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ICI)I")
	public int method648(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg1][arg0];
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)I")
	public int method649(@OriginalArg(0) int arg0) {
		return this.aByteArray6[arg0] & 0xFF;
	}
}
