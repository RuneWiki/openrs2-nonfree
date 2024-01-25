import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class232 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "[B")
	private final byte[] aByteArray99;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	public final int anInt6468;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public final int anInt6455;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public final int anInt6464;

	static {
		new Class306("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
		new Class306("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
	public Class232(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub6 local8 = new Class1_Sub6(arg0);
		@Pc(12) int local12 = local8.method3922();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method3922() == 1;
		this.aByteArray99 = new byte[256];
		local8.method3963(this.aByteArray99, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method3922();
			}
			@Pc(72) int[] local72 = new int[256];
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local72[local74] = local8.method3922();
			}
			@Pc(91) byte[][] local91 = new byte[256][];
			@Pc(106) int local106;
			for (@Pc(93) int local93 = 0; local93 < 256; local93++) {
				local91[local93] = new byte[local53[local93]];
				@Pc(104) byte local104 = 0;
				for (local106 = 0; local106 < local91[local93].length; local106++) {
					local104 += local8.method3928();
					local91[local93][local106] = local104;
				}
			}
			@Pc(141) byte[][] local141 = new byte[256][];
			@Pc(156) int local156;
			for (local106 = 0; local106 < 256; local106++) {
				local141[local106] = new byte[local53[local106]];
				@Pc(154) byte local154 = 0;
				for (local156 = 0; local156 < local141[local106].length; local156++) {
					local154 += local8.method3928();
					local141[local106][local156] = local154;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(189) int local189 = 0; local189 < 256; local189++) {
				if (local189 != 32 && local189 != 160) {
					for (local156 = 0; local156 < 256; local156++) {
						if (local156 != 32 && local156 != 160) {
							this.aByteArrayArray19[local189][local156] = (byte) Static235.method4065(this.aByteArray99, local156, local53, local189, local91, local141, local72);
						}
					}
				}
			}
			this.anInt6468 = local53[32] + local72[32];
		} else {
			this.anInt6468 = local8.method3922();
		}
		local8.method3922();
		local8.method3922();
		this.anInt6455 = local8.method3922();
		this.anInt6464 = local8.method3922();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!ha;ILjava/lang/String;I)Ljava/lang/String;")
	public String method5427(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 >= this.method5429(arg2, arg0)) {
			return arg2;
		}
		@Pc(24) int local24 = arg1 - this.method5429("...", null);
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg2.length();
		@Pc(35) String local35 = "";
		for (@Pc(37) int local37 = 0; local37 < local33; local37++) {
			@Pc(43) char local43 = arg2.charAt(local37);
			if (local43 == '<') {
				local26 = local37;
			} else {
				if (local43 == '>' && local26 != -1) {
					@Pc(65) String local65 = arg2.substring(local26 + 1, local37);
					local26 = -1;
					if (local65.equals("lt")) {
						local43 = '<';
					} else if (local65.equals("gt")) {
						local43 = '>';
					} else if (local65.equals("nbsp")) {
						local43 = ' ';
					} else if (local65.equals("shy")) {
						local43 = '\u00ad';
					} else if (local65.equals("times")) {
						local43 = '×';
					} else if (local65.equals("euro")) {
						local43 = '€';
					} else if (local65.equals("copy")) {
						local43 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=") && arg0 != null) {
								try {
									@Pc(133) int local133 = Static197.method7005(local65.substring(4));
									local30 += arg0[local133].EA();
									local28 = -1;
									if (local30 > local24) {
										return local35 + "...";
									}
									local35 = arg2.substring(0, local37 + 1);
								} catch (@Pc(163) Exception local163) {
								}
							}
							continue;
						}
						local43 = '®';
					}
				}
				if (local26 == -1) {
					local30 += this.aByteArray99[Static424.method6215(local43) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local28 != -1) {
						local30 += this.aByteArrayArray19[local28][local43];
					}
					local28 = local43;
					@Pc(211) int local211 = local30;
					if (this.aByteArrayArray19 != null) {
						local211 = local30 + this.aByteArrayArray19[local43][46];
					}
					if (local211 > local24) {
						return local35 + "...";
					}
					local35 = arg2.substring(0, local37 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIC)I")
	public int method5428(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg0][arg1];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;I)I")
	public int method5429(@OriginalArg(0) String arg0, @OriginalArg(1) Class2[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(52) String local52 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local52.equals("lt")) {
						local31 = '<';
					} else if (local52.equals("gt")) {
						local31 = '>';
					} else if (local52.equals("nbsp")) {
						local31 = ' ';
					} else if (local52.equals("shy")) {
						local31 = '\u00ad';
					} else if (local52.equals("times")) {
						local31 = '×';
					} else if (local52.equals("euro")) {
						local31 = '€';
					} else if (local52.equals("copy")) {
						local31 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=") && arg1 != null) {
								try {
									@Pc(120) int local120 = Static197.method7005(local52.substring(4));
									local18 = -1;
									local20 += arg1[local120].EA();
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray99[Static424.method6215(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local18 != -1) {
						local20 += this.aByteArrayArray19[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5432(@OriginalArg(1) String arg0) {
		return this.method5429(arg0, null);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lclient!ha;Ljava/lang/String;I)I")
	public int method5434(@OriginalArg(1) Class2[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method5435(arg1, arg0, new int[] { arg2 }, Static39.aStringArray2);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;[II[Ljava/lang/String;)I")
	public int method5435(@OriginalArg(0) String arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg0 == null) {
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
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static424.method6215(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(64) int local64;
				if (local26 == -1) {
					local64 = local35;
					local47 = this.method5436(local45);
					if (this.aByteArrayArray19 != null && local28 != -1) {
						local47 += this.aByteArrayArray19[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local64 = local26;
					@Pc(71) String local71 = arg0.substring(local26 + 1, local35);
					local26 = -1;
					if (local71.equals("br")) {
						arg3[local30] = arg0.substring(local18, local35 + 1);
						local30++;
						if (arg3.length <= local30) {
							return 0;
						}
						local28 = -1;
						local16 = 0;
						local18 = local35 + 1;
						local20 = -1;
						continue;
					}
					if (local71.equals("lt")) {
						local47 = this.method5436(60);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][60];
						}
						local28 = 60;
					} else if (local71.equals("gt")) {
						local47 = this.method5436(62);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][62];
						}
						local28 = 62;
					} else if (local71.equals("nbsp")) {
						local47 = this.method5436(160);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][160];
						}
						local28 = 160;
					} else if (local71.equals("shy")) {
						local47 = this.method5436(173);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][173];
						}
						local28 = 173;
					} else if (local71.equals("times")) {
						local47 = this.method5436(215);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][215];
						}
						local28 = 215;
					} else if (local71.equals("euro")) {
						local47 = this.method5436(8364);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][8364];
						}
						local28 = 8364;
					} else if (local71.equals("copy")) {
						local47 = this.method5436(169);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][169];
						}
						local28 = 169;
					} else if (local71.equals("reg")) {
						local47 = this.method5436(174);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][174];
						}
						local28 = 174;
					} else if (local71.startsWith("img=") && arg1 != null) {
						try {
							@Pc(279) int local279 = Static197.method7005(local71.substring(4));
							local47 = arg1[local279].EA();
							local28 = -1;
						} catch (@Pc(290) Exception local290) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg2 != null) {
						if (local45 == 32) {
							local24 = 1;
							local22 = local16;
							local20 = local35;
						}
						if (arg2[local30 < arg2.length ? local30 : arg2.length - 1] < local16) {
							if (local20 < 0) {
								arg3[local30] = arg0.substring(local18, local64);
								local30++;
								if (arg3.length <= local30) {
									return 0;
								}
								local20 = -1;
								local16 = local47;
								local18 = local64;
								local28 = -1;
							} else {
								arg3[local30] = arg0.substring(local18, local20 + 1 - local24);
								local30++;
								if (arg3.length <= local30) {
									return 0;
								}
								local18 = local20 + 1;
								local20 = -1;
								local28 = -1;
								local16 -= local22;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local20 = local35;
							local22 = local16;
						}
					}
				}
			}
		}
		if (arg0.length() > local18) {
			arg3[local30] = arg0.substring(local18, arg0.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	public int method5436(@OriginalArg(0) int arg0) {
		return this.aByteArray99[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILjava/lang/String;I[Lclient!ha;)I")
	public int method5437(@OriginalArg(2) String arg0, @OriginalArg(4) Class2[] arg1) {
		@Pc(8) int local8 = this.anInt6468;
		@Pc(21) int local21 = this.method5435(arg0, arg1, new int[] { 100 }, Static39.aStringArray2);
		@Pc(27) int local27 = local8 * (local21 - 1);
		return this.anInt6455 + local27 + this.anInt6464;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!ha;IILjava/lang/String;)I")
	public int method5438(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method5435(arg2, arg0, new int[] { arg1 }, Static39.aStringArray2);
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(39) int local39 = this.method5429(Static39.aStringArray2[local27], arg0);
			if (local39 > local25) {
				local25 = local39;
			}
		}
		return local25;
	}
}
