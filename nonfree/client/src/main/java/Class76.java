import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class76 {

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public final int anInt2280;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
	public final int anInt2285;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	public final int anInt2286;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([B)V")
	public Class76(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class14_Sub4 local8 = new Class14_Sub4(arg0);
		@Pc(12) int local12 = local8.method2548();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method2548() == 1;
		this.aByteArray62 = new byte[256];
		local8.method2518(this.aByteArray62, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method2548();
			}
			@Pc(72) int[] local72 = new int[256];
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local72[local74] = local8.method2548();
			}
			@Pc(91) byte[][] local91 = new byte[256][];
			@Pc(106) int local106;
			for (@Pc(93) int local93 = 0; local93 < 256; local93++) {
				local91[local93] = new byte[local53[local93]];
				@Pc(104) byte local104 = 0;
				for (local106 = 0; local106 < local91[local93].length; local106++) {
					local104 += local8.method2553();
					local91[local93][local106] = local104;
				}
			}
			@Pc(137) byte[][] local137 = new byte[256][];
			@Pc(152) int local152;
			for (local106 = 0; local106 < 256; local106++) {
				local137[local106] = new byte[local53[local106]];
				@Pc(150) byte local150 = 0;
				for (local152 = 0; local152 < local137[local106].length; local152++) {
					local150 += local8.method2553();
					local137[local106][local152] = local150;
				}
			}
			this.aByteArrayArray5 = new byte[256][256];
			for (@Pc(187) int local187 = 0; local187 < 256; local187++) {
				if (local187 != 32 && local187 != 160) {
					for (local152 = 0; local152 < 256; local152++) {
						if (local152 != 32 && local152 != 160) {
							this.aByteArrayArray5[local187][local152] = (byte) Static13.method2367(this.aByteArray62, local187, local152, local91, local72, local53, local137);
						}
					}
				}
			}
			this.anInt2280 = local53[32] + local72[32];
		} else {
			this.anInt2280 = local8.method2548();
		}
		local8.method2548();
		local8.method2548();
		this.anInt2285 = local8.method2548();
		this.anInt2286 = local8.method2548();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Lclient!gl;Ljava/lang/String;BI)I")
	public int method2247(@OriginalArg(1) Class2[] arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = this.anInt2280;
		@Pc(33) int local33 = this.method2254(new int[] { 100 }, Static123.aStringArray69, arg1, arg0);
		@Pc(39) int local39 = local7 * (local33 - 1);
		return this.anInt2286 + this.anInt2285 + local39;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
	public int method2248(@OriginalArg(0) int arg0) {
		return this.aByteArray62[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B[Lclient!gl;ILjava/lang/String;)I")
	public int method2249(@OriginalArg(1) Class2[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method2254(new int[] { arg1 }, Static123.aStringArray69, arg2, arg0);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method2250(arg0, Static123.aStringArray69[local30]);
			if (local40 > local28) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([Lclient!gl;ILjava/lang/String;)I")
	public int method2250(@OriginalArg(0) Class2[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg1.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg1.substring(local11 + 1, local26);
					local11 = -1;
					if (local55.equals("lt")) {
						local32 = '<';
					} else if (local55.equals("gt")) {
						local32 = '>';
					} else if (local55.equals("nbsp")) {
						local32 = ' ';
					} else if (local55.equals("shy")) {
						local32 = '\u00ad';
					} else if (local55.equals("times")) {
						local32 = '×';
					} else if (local55.equals("euro")) {
						local32 = '€';
					} else if (local55.equals("copy")) {
						local32 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg0 != null) {
								try {
									@Pc(111) int local111 = Static75.method1895(local55.substring(4));
									local13 = -1;
									local21 += arg0[local111].method2630();
								} catch (@Pc(122) Exception local122) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local21 += this.aByteArray62[Static185.method3545(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local13 != -1) {
						local21 += this.aByteArrayArray5[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Lclient!gl;ILjava/lang/String;)I")
	public int method2253(@OriginalArg(0) int arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(3) String arg2) {
		return this.method2254(new int[] { arg0 }, Static123.aStringArray69, arg2, arg1);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([I[Ljava/lang/String;Ljava/lang/String;B[Lclient!gl;)I")
	public int method2254(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class2[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static185.method3545(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(69) int local69;
				if (local26 == -1) {
					local47 = this.method2248(local45);
					local69 = local35;
					if (this.aByteArrayArray5 != null && local28 != -1) {
						local47 += this.aByteArrayArray5[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local69 = local26;
					@Pc(100) String local100 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local100.equals("br")) {
						arg1[local30] = arg2.substring(local18, local35 + 1);
						local30++;
						if (local30 >= arg1.length) {
							return 0;
						}
						local20 = -1;
						local18 = local35 + 1;
						local16 = 0;
						local28 = -1;
						continue;
					}
					if (local100.equals("lt")) {
						local47 = this.method2248(60);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][60];
						}
						local28 = 60;
					} else if (local100.equals("gt")) {
						local47 = this.method2248(62);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][62];
						}
						local28 = 62;
					} else if (local100.equals("nbsp")) {
						local47 = this.method2248(160);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][160];
						}
						local28 = 160;
					} else if (local100.equals("shy")) {
						local47 = this.method2248(173);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][173];
						}
						local28 = 173;
					} else if (local100.equals("times")) {
						local47 = this.method2248(215);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][215];
						}
						local28 = 215;
					} else if (local100.equals("euro")) {
						local47 = this.method2248(8364);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][8364];
						}
						local28 = 8364;
					} else if (local100.equals("copy")) {
						local47 = this.method2248(169);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][169];
						}
						local28 = 169;
					} else if (local100.equals("reg")) {
						local47 = this.method2248(174);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][174];
						}
						local28 = 174;
					} else if (local100.startsWith("img=") && arg3 != null) {
						try {
							@Pc(178) int local178 = Static75.method1895(local100.substring(4));
							local47 = arg3[local178].method2630();
							local28 = -1;
						} catch (@Pc(189) Exception local189) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local22 = local16;
							local24 = 1;
							local20 = local35;
						}
						if (arg0[arg0.length > local30 ? local30 : arg0.length - 1] < local16) {
							if (local20 >= 0) {
								arg1[local30] = arg2.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local18 = local20 + 1;
								local16 -= local22;
								local28 = -1;
								local20 = -1;
							} else {
								arg1[local30] = arg2.substring(local18, local69);
								local30++;
								if (arg1.length <= local30) {
									return 0;
								}
								local16 = local47;
								local18 = local69;
								local20 = -1;
								local28 = -1;
							}
						}
						if (local45 == 45) {
							local22 = local16;
							local20 = local35;
							local24 = 0;
						}
					}
				}
			}
		}
		if (arg2.length() > local18) {
			arg1[local30] = arg2.substring(local18, arg2.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ICI)I")
	public int method2255(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray5 == null ? 0 : this.aByteArrayArray5[arg0][arg1];
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method2256(@OriginalArg(0) String arg0) {
		return this.method2250(null, arg0);
	}
}
