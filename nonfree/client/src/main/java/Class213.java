import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class213 {

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "[B")
	private final byte[] aByteArray60;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
	public final int anInt6975;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
	public final int anInt6973;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public final int anInt6972;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "([B)V")
	public Class213(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub8 local8 = new Class6_Sub8(arg0);
		@Pc(12) int local12 = local8.method8246();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method8246() == 1;
		this.aByteArray60 = new byte[256];
		local8.method8207(this.aByteArray60, 256, 0);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			@Pc(50) int[] local50 = new int[256];
			for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
				local47[local52] = local8.method8246();
			}
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local50[local68] = local8.method8246();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local47[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method8208();
					local85[local87][local100] = local98;
				}
			}
			@Pc(129) byte[][] local129 = new byte[256][];
			@Pc(144) int local144;
			for (local100 = 0; local100 < 256; local100++) {
				local129[local100] = new byte[local47[local100]];
				@Pc(142) byte local142 = 0;
				for (local144 = 0; local144 < local129[local100].length; local144++) {
					local142 += local8.method8208();
					local129[local100][local144] = local142;
				}
			}
			this.aByteArrayArray21 = new byte[256][256];
			for (@Pc(179) int local179 = 0; local179 < 256; local179++) {
				if (local179 != 32 && local179 != 160) {
					for (local144 = 0; local144 < 256; local144++) {
						if (local144 != 32 && local144 != 160) {
							this.aByteArrayArray21[local179][local144] = (byte) Static644.method8778(local144, local179, local85, local47, local129, local50, this.aByteArray60);
						}
					}
				}
			}
			this.anInt6975 = local47[32] + local50[32];
		} else {
			this.anInt6975 = local8.method8246();
		}
		local8.method8246();
		local8.method8246();
		this.anInt6973 = local8.method8246();
		this.anInt6972 = local8.method8246();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILjava/lang/String;[Lclient!ufa;)I")
	public int method5826(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class4[] arg2) {
		return this.method5832(arg1, Static107.aStringArray9, new int[] { arg0 }, arg2);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ufa;B)I")
	public int method5827(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class4[] arg2) {
		@Pc(26) int local26 = this.method5832(arg1, Static107.aStringArray9, new int[] { arg0 }, arg2);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method5833(arg2, Static107.aStringArray9[local30]);
			if (local28 < local40) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BCI)I")
	public int method5828(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray21 == null ? 0 : this.aByteArrayArray21[arg1][arg0];
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "([Lclient!ufa;IILjava/lang/String;Z)I")
	public int method5829(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt6975;
		}
		@Pc(26) int local26 = this.method5832(arg3, Static107.aStringArray9, new int[] { arg1 }, arg0);
		@Pc(32) int local32 = (local26 - 1) * arg2;
		return this.anInt6972 + this.anInt6973 + local32;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)I")
	public int method5830(@OriginalArg(1) int arg0) {
		return this.aByteArray60[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5831(@OriginalArg(0) String arg0) {
		return this.method5833((Class4[]) null, arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[I[Lclient!ufa;I)I")
	public int method5832(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class4[] arg3) {
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
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static598.method8291(arg0.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(54) int local54;
				if (local21 == -1) {
					local54 = local30;
					local42 = this.method5830(local40);
					if (this.aByteArrayArray21 != null && local23 != -1) {
						local42 += this.aByteArrayArray21[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local54 = local21;
					@Pc(95) String local95 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					if (local95.equals("br")) {
						arg1[local25] = arg0.substring(local13, local30 + 1);
						local25++;
						if (local25 >= arg1.length) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local23 = -1;
						local13 = local30 + 1;
						continue;
					}
					if (local95.equals("lt")) {
						local42 = this.method5830(60);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][60];
						}
						local23 = 60;
					} else if (local95.equals("gt")) {
						local42 = this.method5830(62);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][62];
						}
						local23 = 62;
					} else if (local95.equals("nbsp")) {
						local42 = this.method5830(160);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][160];
						}
						local23 = 160;
					} else if (local95.equals("shy")) {
						local42 = this.method5830(173);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][173];
						}
						local23 = 173;
					} else if (local95.equals("times")) {
						local42 = this.method5830(215);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][215];
						}
						local23 = 215;
					} else if (local95.equals("euro")) {
						local42 = this.method5830(8364);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][8364];
						}
						local23 = 8364;
					} else if (local95.equals("copy")) {
						local42 = this.method5830(169);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][169];
						}
						local23 = 169;
					} else if (local95.equals("reg")) {
						local42 = this.method5830(174);
						if (this.aByteArrayArray21 != null && local23 != -1) {
							local42 += this.aByteArrayArray21[local23][174];
						}
						local23 = 174;
					} else if (local95.startsWith("img=") && arg3 != null) {
						try {
							@Pc(226) int local226 = Static533.method7565(local95.substring(4));
							local42 = arg3[local226].method7700();
							local23 = -1;
						} catch (@Pc(237) Exception local237) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg2 != null) {
						if (local40 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local30;
						}
						if (arg2[local25 < arg2.length ? local25 : arg2.length - 1] < local11) {
							if (local15 < 0) {
								arg1[local25] = arg0.substring(local13, local54);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local15 = -1;
								local13 = local54;
								local23 = -1;
								local11 = local42;
							} else {
								arg1[local25] = arg0.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local15 = -1;
								local23 = -1;
							}
						}
						if (local40 == 45) {
							local17 = local11;
							local19 = 0;
							local15 = local30;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg1[local25] = arg0.substring(local13, arg0.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B[Lclient!ufa;Ljava/lang/String;)I")
	public int method5833(@OriginalArg(1) Class4[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(34) char local34 = arg1.charAt(local20);
			if (local34 == '<') {
				local11 = local20;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local55.equals("lt")) {
						local34 = '<';
					} else if (local55.equals("gt")) {
						local34 = '>';
					} else if (local55.equals("nbsp")) {
						local34 = ' ';
					} else if (local55.equals("shy")) {
						local34 = '\u00ad';
					} else if (local55.equals("times")) {
						local34 = '×';
					} else if (local55.equals("euro")) {
						local34 = '€';
					} else if (local55.equals("copy")) {
						local34 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg0 != null) {
								try {
									@Pc(119) int local119 = Static533.method7565(local55.substring(4));
									local13 = -1;
									local15 += arg0[local119].method7700();
								} catch (@Pc(130) Exception local130) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray60[Static598.method8291(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray21 != null && local13 != -1) {
						local15 += this.aByteArrayArray21[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;Z[Lclient!ufa;I)Ljava/lang/String;")
	public String method5834(@OriginalArg(0) String arg0, @OriginalArg(2) Class4[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method5833(arg1, arg0)) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method5833((Class4[]) null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(41) int local41 = arg0.length();
		@Pc(43) String local43 = "";
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local28 = local45;
			} else {
				if (local51 == '>' && local28 != -1) {
					@Pc(73) String local73 = arg0.substring(local28 + 1, local45);
					local28 = -1;
					if (local73.equals("lt")) {
						local51 = '<';
					} else if (local73.equals("gt")) {
						local51 = '>';
					} else if (local73.equals("nbsp")) {
						local51 = ' ';
					} else if (local73.equals("shy")) {
						local51 = '\u00ad';
					} else if (local73.equals("times")) {
						local51 = '×';
					} else if (local73.equals("euro")) {
						local51 = '€';
					} else if (local73.equals("copy")) {
						local51 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg1 != null) {
								try {
									@Pc(137) int local137 = Static533.method7565(local73.substring(4));
									local30 = -1;
									local32 += arg1[local137].method7700();
									if (local26 < local32) {
										return local43 + "...";
									}
									local43 = arg0.substring(0, local45 + 1);
								} catch (@Pc(171) Exception local171) {
								}
							}
							continue;
						}
						local51 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray60[Static598.method8291(local51) & 0xFF] & 0xFF;
					if (this.aByteArrayArray21 != null && local30 != -1) {
						local32 += this.aByteArrayArray21[local30][local51];
					}
					local30 = local51;
					@Pc(222) int local222 = local32;
					if (this.aByteArrayArray21 != null) {
						local222 = local32 + this.aByteArrayArray21[local51][46];
					}
					if (local222 > local26) {
						return local43 + "...";
					}
					local43 = arg0.substring(0, local45 + 1);
				}
			}
		}
		return arg0;
	}
}
