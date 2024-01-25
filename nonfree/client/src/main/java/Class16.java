import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class16 {

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public final int anInt376;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public final int anInt382;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public final int anInt383;

	static {
		new Class159("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
	public Class16(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = local8.method3440();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method3440() == 1;
		this.aByteArray4 = new byte[256];
		local8.method3456(256, this.aByteArray4);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method3440();
			}
			@Pc(73) int[] local73 = new int[256];
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local73[local75] = local8.method3440();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local54[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method3426();
					local92[local94][local107] = local105;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local107 = 0; local107 < 256; local107++) {
				local136[local107] = new byte[local54[local107]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local107].length; local151++) {
					local149 += local8.method3426();
					local136[local107][local151] = local149;
				}
			}
			this.aByteArrayArray1 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray1[local190][local151] = (byte) Static99.method2241(local92, local151, local136, local190, this.aByteArray4, local73, local54);
						}
					}
				}
			}
			this.anInt376 = local54[32] + local73[32];
		} else {
			this.anInt376 = local8.method3440();
		}
		local8.method3440();
		local8.method3440();
		this.anInt382 = local8.method3440();
		this.anInt383 = local8.method3440();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI[Lclient!vj;Ljava/lang/String;)I")
	public int method317(@OriginalArg(1) int arg0, @OriginalArg(2) Class58[] arg1, @OriginalArg(3) String arg2) {
		return this.method328(new int[] { arg0 }, Static230.aStringArray75, arg1, arg2);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZCI)I")
	public int method319(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg1][arg0];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)I")
	public int method322(@OriginalArg(1) int arg0) {
		return this.aByteArray4[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;[Lclient!vj;B)I")
	public int method324(@OriginalArg(0) String arg0, @OriginalArg(1) Class58[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg0.charAt(local26);
			if (local32 == '<') {
				local17 = local26;
			} else {
				if (local32 == '>' && local17 != -1) {
					@Pc(52) String local52 = arg0.substring(local17 + 1, local26);
					local17 = -1;
					if (local52.equals("lt")) {
						local32 = '<';
					} else if (local52.equals("gt")) {
						local32 = '>';
					} else if (local52.equals("nbsp")) {
						local32 = ' ';
					} else if (local52.equals("shy")) {
						local32 = '\u00ad';
					} else if (local52.equals("times")) {
						local32 = '×';
					} else if (local52.equals("euro")) {
						local32 = '€';
					} else if (local52.equals("copy")) {
						local32 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=") && arg1 != null) {
								try {
									@Pc(108) int local108 = Static246.method4383(local52.substring(4));
									local19 = -1;
									local21 += arg1[local108].method4282();
								} catch (@Pc(119) Exception local119) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local17 == -1) {
					local21 += this.aByteArray4[Static93.method2208(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local19 != -1) {
						local21 += this.aByteArrayArray1[local19][local32];
					}
					local19 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!vj;)I")
	public int method325(@OriginalArg(3) String arg0, @OriginalArg(4) Class58[] arg1) {
		@Pc(11) int local11 = this.anInt376;
		@Pc(24) int local24 = this.method328(new int[] { 100 }, Static230.aStringArray75, arg1, arg0);
		@Pc(38) int local38 = (local24 - 1) * local11;
		return this.anInt382 + local38 + this.anInt383;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;[Lclient!vj;I)I")
	public int method326(@OriginalArg(1) String arg0, @OriginalArg(2) Class58[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method328(new int[] { arg2 }, Static230.aStringArray75, arg1, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method324(Static230.aStringArray75[local22], arg1);
			if (local20 < local32) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method327(@OriginalArg(1) String arg0) {
		return this.method324(arg0, null);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([I[Ljava/lang/String;[Lclient!vj;Ljava/lang/String;Z)I")
	public int method328(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) Class58[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
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
		@Pc(33) int local33 = arg3.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static93.method2208(arg3.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(62) int local62;
				if (local26 == -1) {
					local62 = local35;
					local47 = this.method322(local45);
					if (this.aByteArrayArray1 != null && local28 != -1) {
						local47 += this.aByteArrayArray1[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local62 = local26;
					@Pc(69) String local69 = arg3.substring(local26 + 1, local35);
					local26 = -1;
					if (local69.equals("br")) {
						arg1[local30] = arg3.substring(local18, local35 + 1);
						local30++;
						if (arg1.length <= local30) {
							return 0;
						}
						local16 = 0;
						local18 = local35 + 1;
						local20 = -1;
						local28 = -1;
						continue;
					}
					if (local69.equals("lt")) {
						local47 = this.method322(60);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][60];
						}
						local28 = 60;
					} else if (local69.equals("gt")) {
						local47 = this.method322(62);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][62];
						}
						local28 = 62;
					} else if (local69.equals("nbsp")) {
						local47 = this.method322(160);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][160];
						}
						local28 = 160;
					} else if (local69.equals("shy")) {
						local47 = this.method322(173);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][173];
						}
						local28 = 173;
					} else if (local69.equals("times")) {
						local47 = this.method322(215);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][215];
						}
						local28 = 215;
					} else if (local69.equals("euro")) {
						local47 = this.method322(8364);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][8364];
						}
						local28 = 8364;
					} else if (local69.equals("copy")) {
						local47 = this.method322(169);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][169];
						}
						local28 = 169;
					} else if (local69.equals("reg")) {
						local47 = this.method322(174);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][174];
						}
						local28 = 174;
					} else if (local69.startsWith("img=") && arg2 != null) {
						try {
							@Pc(258) int local258 = Static246.method4383(local69.substring(4));
							local28 = -1;
							local47 = arg2[local258].method4282();
						} catch (@Pc(269) Exception local269) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local20 = local35;
							local22 = local16;
							local24 = 1;
						}
						if (arg0[local30 < arg0.length ? local30 : arg0.length - 1] < local16) {
							if (local20 >= 0) {
								arg1[local30] = arg3.substring(local18, local20 + 1 - local24);
								local30++;
								if (arg1.length <= local30) {
									return 0;
								}
								local18 = local20 + 1;
								local20 = -1;
								local28 = -1;
								local16 -= local22;
							} else {
								arg1[local30] = arg3.substring(local18, local62);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local18 = local62;
								local20 = -1;
								local28 = -1;
								local16 = local47;
							}
						}
						if (local45 == 45) {
							local22 = local16;
							local24 = 0;
							local20 = local35;
						}
					}
				}
			}
		}
		if (arg3.length() > local18) {
			arg1[local30] = arg3.substring(local18, arg3.length());
			local30++;
		}
		return local30;
	}
}
