import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class136 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public final int anInt3409;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public final int anInt3408;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public final int anInt3405;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B)V")
	public Class136(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		@Pc(12) int local12 = local8.method5350();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5350() == 1;
		this.aByteArray62 = new byte[256];
		local8.method5357(256, this.aByteArray62);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			@Pc(50) int[] local50 = new int[256];
			for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
				local47[local52] = local8.method5350();
			}
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local50[local66] = local8.method5350();
			}
			@Pc(83) byte[][] local83 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				local83[local85] = new byte[local47[local85]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local83[local85].length; local98++) {
					local96 += local8.method5330();
					local83[local85][local98] = local96;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local98 = 0; local98 < 256; local98++) {
				local131[local98] = new byte[local47[local98]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local98].length; local146++) {
					local144 += local8.method5330();
					local131[local98][local146] = local144;
				}
			}
			this.aByteArrayArray9 = new byte[256][256];
			for (@Pc(179) int local179 = 0; local179 < 256; local179++) {
				if (local179 != 32 && local179 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray9[local179][local146] = (byte) Static265.method4086(local83, local179, local131, this.aByteArray62, local47, local146, local50);
						}
					}
				}
			}
			this.anInt3409 = local47[32] + local50[32];
		} else {
			this.anInt3409 = local8.method5350();
		}
		local8.method5350();
		local8.method5350();
		this.anInt3408 = local8.method5350();
		this.anInt3405 = local8.method5350();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lclient!rn;Ljava/lang/String;ZI)I")
	public int method3121(@OriginalArg(0) Class18[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method3124(new int[] { arg2 }, Static45.aStringArray29, arg0, arg1);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method3123(Static45.aStringArray29[local22], arg0);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;B[Lclient!rn;I)I")
	public int method3122(@OriginalArg(1) String arg0, @OriginalArg(3) Class18[] arg1) {
		@Pc(16) int local16 = this.anInt3409;
		@Pc(33) int local33 = this.method3124(new int[] { 100 }, Static45.aStringArray29, arg1, arg0);
		@Pc(39) int local39 = local16 * (local33 - 1);
		return local39 + this.anInt3408 + this.anInt3405;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;[Lclient!rn;B)I")
	public int method3123(@OriginalArg(0) String arg0, @OriginalArg(1) Class18[] arg1) {
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
					@Pc(56) String local56 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local56.equals("lt")) {
						local31 = '<';
					} else if (local56.equals("gt")) {
						local31 = '>';
					} else if (local56.equals("nbsp")) {
						local31 = ' ';
					} else if (local56.equals("shy")) {
						local31 = '\u00ad';
					} else if (local56.equals("times")) {
						local31 = '×';
					} else if (local56.equals("euro")) {
						local31 = '€';
					} else if (local56.equals("copy")) {
						local31 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(116) int local116 = Static189.method5666(local56.substring(4));
									local18 = -1;
									local20 += arg1[local116].method4564();
								} catch (@Pc(127) Exception local127) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray62[Static222.method3652(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray9 != null && local18 != -1) {
						local20 += this.aByteArrayArray9[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([I[Ljava/lang/String;[Lclient!rn;BLjava/lang/String;)I")
	public int method3124(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(25) byte local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg3.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static222.method3652(arg3.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local27 = local36;
			} else {
				@Pc(66) int local66;
				if (local27 == -1) {
					local66 = local36;
					local48 = this.method3127(local46);
					if (this.aByteArrayArray9 != null && local29 != -1) {
						local48 += this.aByteArrayArray9[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local66 = local27;
					@Pc(73) String local73 = arg3.substring(local27 + 1, local36);
					local27 = -1;
					if (local73.equals("br")) {
						arg1[local31] = arg3.substring(local19, local36 + 1);
						local31++;
						if (arg1.length <= local31) {
							return 0;
						}
						local17 = 0;
						local21 = -1;
						local29 = -1;
						local19 = local36 + 1;
						continue;
					}
					if (local73.equals("lt")) {
						local48 = this.method3127(60);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][60];
						}
						local29 = 60;
					} else if (local73.equals("gt")) {
						local48 = this.method3127(62);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][62];
						}
						local29 = 62;
					} else if (local73.equals("nbsp")) {
						local48 = this.method3127(160);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][160];
						}
						local29 = 160;
					} else if (local73.equals("shy")) {
						local48 = this.method3127(173);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][173];
						}
						local29 = 173;
					} else if (local73.equals("times")) {
						local48 = this.method3127(215);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][215];
						}
						local29 = 215;
					} else if (local73.equals("euro")) {
						local48 = this.method3127(8364);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][8364];
						}
						local29 = 8364;
					} else if (local73.equals("copy")) {
						local48 = this.method3127(169);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][169];
						}
						local29 = 169;
					} else if (local73.equals("reg")) {
						local48 = this.method3127(174);
						if (this.aByteArrayArray9 != null && local29 != -1) {
							local48 += this.aByteArrayArray9[local29][174];
						}
						local29 = 174;
					} else if (local73.startsWith("img=") && arg2 != null) {
						try {
							@Pc(261) int local261 = Static189.method5666(local73.substring(4));
							local48 = arg2[local261].method4564();
							local29 = -1;
						} catch (@Pc(272) Exception local272) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local17 += local48;
					if (arg0 != null) {
						if (local46 == 32) {
							local21 = local36;
							local25 = 1;
							local23 = local17;
						}
						if (local17 > arg0[local31 >= arg0.length ? arg0.length - 1 : local31]) {
							if (local21 >= 0) {
								arg1[local31] = arg3.substring(local19, local21 + 1 - local25);
								local31++;
								if (arg1.length <= local31) {
									return 0;
								}
								local19 = local21 + 1;
								local29 = -1;
								local21 = -1;
								local17 -= local23;
							} else {
								arg1[local31] = arg3.substring(local19, local66);
								local31++;
								if (arg1.length <= local31) {
									return 0;
								}
								local17 = local48;
								local19 = local66;
								local21 = -1;
								local29 = -1;
							}
						}
						if (local46 == 45) {
							local23 = local17;
							local21 = local36;
							local25 = 0;
						}
					}
				}
			}
		}
		if (arg3.length() > local19) {
			arg1[local31] = arg3.substring(local19, arg3.length());
			local31++;
		}
		return local31;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method3125(@OriginalArg(1) String arg0) {
		return this.method3123(arg0, null);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(CIB)I")
	public int method3126(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray9 == null ? 0 : this.aByteArrayArray9[arg1][arg0];
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
	public int method3127(@OriginalArg(0) int arg0) {
		return this.aByteArray62[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lclient!rn;BLjava/lang/String;I)I")
	public int method3128(@OriginalArg(0) Class18[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method3124(new int[] { arg2 }, Static45.aStringArray29, arg0, arg1);
	}
}
