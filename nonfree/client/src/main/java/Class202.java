import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class202 {

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "[Lclient!pq;")
	private static final Class252[] aClass252Array1 = new Class252[32];

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[B")
	private final byte[] aByteArray79;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public final int anInt6130;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	public final int anInt6135;

	static {
		@Pc(101) Class252[] local101 = Static85.method1187();
		for (@Pc(103) int local103 = 0; local103 < local101.length; local103++) {
			aClass252Array1[local101[local103].anInt7316] = local101[local103];
		}
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
	public Class202(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub12 local8 = new Class6_Sub12(arg0);
		@Pc(12) int local12 = local8.method6019();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method6019() == 1;
		this.aByteArray79 = new byte[256];
		local8.method6020(this.aByteArray79, 256);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			@Pc(52) int[] local52 = new int[256];
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				local49[local54] = local8.method6019();
			}
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local52[local70] = local8.method6019();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local49[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method6049();
					local85[local87][local100] = local98;
				}
			}
			@Pc(129) byte[][] local129 = new byte[256][];
			@Pc(144) int local144;
			for (local100 = 0; local100 < 256; local100++) {
				local129[local100] = new byte[local49[local100]];
				@Pc(142) byte local142 = 0;
				for (local144 = 0; local144 < local129[local100].length; local144++) {
					local142 += local8.method6049();
					local129[local100][local144] = local142;
				}
			}
			this.aByteArrayArray15 = new byte[256][256];
			for (@Pc(177) int local177 = 0; local177 < 256; local177++) {
				if (local177 != 32 && local177 != 160) {
					for (local144 = 0; local144 < 256; local144++) {
						if (local144 != 32 && local144 != 160) {
							this.aByteArrayArray15[local177][local144] = (byte) Static27.method362(this.aByteArray79, local129, local177, local52, local85, local144, local49);
						}
					}
				}
			}
			this.anInt6130 = local49[32] + local52[32];
		} else {
			this.anInt6130 = local8.method6019();
		}
		local8.method6019();
		local8.method6019();
		this.anInt6139 = local8.method6019();
		this.anInt6135 = local8.method6019();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4970(@OriginalArg(0) String arg0) {
		return this.method4977(arg0, null);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;[Lclient!xa;ZI)I")
	public int method4971(@OriginalArg(1) String arg0, @OriginalArg(2) Class71[] arg1) {
		@Pc(8) int local8 = this.anInt6130;
		@Pc(21) int local21 = this.method4975(Static228.aStringArray22, arg0, arg1, new int[] { 100 });
		@Pc(32) int local32 = (local21 - 1) * local8;
		return this.anInt6139 + local32 + this.anInt6135;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I")
	public int method4972(@OriginalArg(0) int arg0) {
		return this.aByteArray79[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!xa;I)Ljava/lang/String;")
	public String method4973(@OriginalArg(0) String arg0, @OriginalArg(2) Class71[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method4977(arg0, arg1)) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method4977("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(73) String local73 = arg0.substring(local28 + 1, local44);
					local28 = -1;
					if (local73.equals("lt")) {
						local50 = '<';
					} else if (local73.equals("gt")) {
						local50 = '>';
					} else if (local73.equals("nbsp")) {
						local50 = ' ';
					} else if (local73.equals("shy")) {
						local50 = '\u00ad';
					} else if (local73.equals("times")) {
						local50 = '×';
					} else if (local73.equals("euro")) {
						local50 = '€';
					} else if (local73.equals("copy")) {
						local50 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg1 != null) {
								try {
									@Pc(143) int local143 = Static443.method6265(local73.substring(4));
									local30 = -1;
									local32 += arg1[local143].AA();
									if (local32 > local26) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(173) Exception local173) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray79[Static492.method6861(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local30 != -1) {
						local32 += this.aByteArrayArray15[local30][local50];
					}
					local30 = local50;
					@Pc(221) int local221 = local32;
					if (this.aByteArrayArray15 != null) {
						local221 = local32 + this.aByteArrayArray15[local50][46];
					}
					if (local26 < local221) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!xa;)I")
	public int method4974(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71[] arg2) {
		@Pc(18) int local18 = this.method4975(Static228.aStringArray22, arg0, arg2, new int[] { arg1 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method4977(Static228.aStringArray22[local22], arg2);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[Lclient!xa;[II)I")
	public int method4975(@OriginalArg(0) String[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class71[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static492.method6861(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(66) int local66;
				if (local26 == -1) {
					local47 = this.method4972(local45);
					local66 = local35;
					if (this.aByteArrayArray15 != null && local28 != -1) {
						local47 += this.aByteArrayArray15[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local66 = local26;
					@Pc(73) String local73 = arg1.substring(local26 + 1, local35);
					local26 = -1;
					if (local73.equals("br")) {
						arg0[local30] = arg1.substring(local18, local35 + 1);
						local30++;
						if (arg0.length <= local30) {
							return 0;
						}
						local20 = -1;
						local28 = -1;
						local18 = local35 + 1;
						local11 = 0;
						continue;
					}
					if (local73.equals("lt")) {
						local47 = this.method4972(60);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][60];
						}
						local28 = 60;
					} else if (local73.equals("gt")) {
						local47 = this.method4972(62);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][62];
						}
						local28 = 62;
					} else if (local73.equals("nbsp")) {
						local47 = this.method4972(160);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][160];
						}
						local28 = 160;
					} else if (local73.equals("shy")) {
						local47 = this.method4972(173);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][173];
						}
						local28 = 173;
					} else if (local73.equals("times")) {
						local47 = this.method4972(215);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][215];
						}
						local28 = 215;
					} else if (local73.equals("euro")) {
						local47 = this.method4972(8364);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][8364];
						}
						local28 = 8364;
					} else if (local73.equals("copy")) {
						local47 = this.method4972(169);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][169];
						}
						local28 = 169;
					} else if (local73.equals("reg")) {
						local47 = this.method4972(174);
						if (this.aByteArrayArray15 != null && local28 != -1) {
							local47 += this.aByteArrayArray15[local28][174];
						}
						local28 = 174;
					} else if (local73.startsWith("img=") && arg2 != null) {
						try {
							@Pc(260) int local260 = Static443.method6265(local73.substring(4));
							local28 = -1;
							local47 = arg2[local260].AA();
						} catch (@Pc(271) Exception local271) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local22 = local11;
							local20 = local35;
							local24 = 1;
						}
						if (local11 > arg3[arg3.length > local30 ? local30 : arg3.length - 1]) {
							if (local20 < 0) {
								arg0[local30] = arg1.substring(local18, local66);
								local30++;
								if (local30 >= arg0.length) {
									return 0;
								}
								local20 = -1;
								local11 = local47;
								local28 = -1;
								local18 = local66;
							} else {
								arg0[local30] = arg1.substring(local18, local20 + 1 - local24);
								local30++;
								if (arg0.length <= local30) {
									return 0;
								}
								local18 = local20 + 1;
								local28 = -1;
								local20 = -1;
								local11 -= local22;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local22 = local11;
							local20 = local35;
						}
					}
				}
			}
		}
		if (local18 < arg1.length()) {
			arg0[local30] = arg1.substring(local18, arg1.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/lang/String;I[Lclient!xa;I)I")
	public int method4976(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71[] arg2) {
		return this.method4975(Static228.aStringArray22, arg0, arg2, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;[Lclient!xa;)I")
	public int method4977(@OriginalArg(1) String arg0, @OriginalArg(2) Class71[] arg1) {
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
					@Pc(54) String local54 = arg0.substring(local17 + 1, local26);
					local17 = -1;
					if (local54.equals("lt")) {
						local32 = '<';
					} else if (local54.equals("gt")) {
						local32 = '>';
					} else if (local54.equals("nbsp")) {
						local32 = ' ';
					} else if (local54.equals("shy")) {
						local32 = '\u00ad';
					} else if (local54.equals("times")) {
						local32 = '×';
					} else if (local54.equals("euro")) {
						local32 = '€';
					} else if (local54.equals("copy")) {
						local32 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg1 != null) {
								try {
									@Pc(116) int local116 = Static443.method6265(local54.substring(4));
									local21 += arg1[local116].AA();
									local19 = -1;
								} catch (@Pc(127) Exception local127) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local17 == -1) {
					local21 += this.aByteArray79[Static492.method6861(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray15 != null && local19 != -1) {
						local21 += this.aByteArrayArray15[local19][local32];
					}
					local19 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ICI)I")
	public int method4979(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray15 == null ? 0 : this.aByteArrayArray15[arg0][arg1];
	}
}
