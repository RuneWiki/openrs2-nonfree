import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class84 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	public final int anInt2631;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	public final int anInt2628;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([B)V")
	public Class84(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub20 local8 = new Class4_Sub20(arg0);
		@Pc(12) int local12 = local8.method4614();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method4614() == 1;
		this.aByteArray29 = new byte[256];
		local8.method4566(256, this.aByteArray29);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local8.method4614();
			}
			@Pc(66) int[] local66 = new int[256];
			for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
				local66[local68] = local8.method4614();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local47[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method4576();
					local85[local87][local100] = local98;
				}
			}
			@Pc(129) byte[][] local129 = new byte[256][];
			@Pc(144) int local144;
			for (local100 = 0; local100 < 256; local100++) {
				local129[local100] = new byte[local47[local100]];
				@Pc(142) byte local142 = 0;
				for (local144 = 0; local144 < local129[local100].length; local144++) {
					local142 += local8.method4576();
					local129[local100][local144] = local142;
				}
			}
			this.aByteArrayArray11 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local144 = 0; local144 < 256; local144++) {
						if (local144 != 32 && local144 != 160) {
							this.aByteArrayArray11[local183][local144] = (byte) Static424.method5882(this.aByteArray29, local144, local183, local47, local66, local129, local85);
						}
					}
				}
			}
			this.anInt2631 = local47[32] + local66[32];
		} else {
			this.anInt2631 = local8.method4614();
		}
		local8.method4614();
		local8.method4614();
		this.anInt2628 = local8.method4614();
		this.anInt2634 = local8.method4614();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;B[Lclient!aa;)Ljava/lang/String;")
	public String method2374(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class2[] arg2) {
		if (this.method2383(arg2, arg1) <= arg0) {
			return arg1;
		}
		@Pc(26) int local26 = arg0 - this.method2383(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg1.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg1.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(67) String local67 = arg1.substring(local28 + 1, local39);
					local28 = -1;
					if (local67.equals("lt")) {
						local45 = '<';
					} else if (local67.equals("gt")) {
						local45 = '>';
					} else if (local67.equals("nbsp")) {
						local45 = ' ';
					} else if (local67.equals("shy")) {
						local45 = '\u00ad';
					} else if (local67.equals("times")) {
						local45 = '×';
					} else if (local67.equals("euro")) {
						local45 = '€';
					} else if (local67.equals("copy")) {
						local45 = '©';
					} else {
						if (!local67.equals("reg")) {
							if (local67.startsWith("img=") && arg2 != null) {
								try {
									@Pc(129) int local129 = Static269.method4335(local67.substring(4));
									local30 = -1;
									local32 += arg2[local129].d();
									if (local26 < local32) {
										return local37 + "...";
									}
									local37 = arg1.substring(0, local39 + 1);
								} catch (@Pc(163) Exception local163) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray29[Static170.method2991(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local30 != -1) {
						local32 += this.aByteArrayArray11[local30][local45];
					}
					local30 = local45;
					@Pc(218) int local218 = local32;
					if (this.aByteArrayArray11 != null) {
						local218 = local32 + this.aByteArrayArray11[local45][46];
					}
					if (local218 > local26) {
						return local37 + "...";
					}
					local37 = arg1.substring(0, local39 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([Lclient!aa;IILjava/lang/String;)I")
	public int method2375(@OriginalArg(0) Class2[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(26) int local26 = this.method2376(new int[] { arg1 }, arg2, Static282.aStringArray27, arg0);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method2383(arg0, Static282.aStringArray27[local30]);
			if (local40 > local28) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([IILjava/lang/String;[Ljava/lang/String;[Lclient!aa;)I")
	public int method2376(@OriginalArg(0) int[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class2[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static170.method2991(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(59) int local59;
				if (local26 == -1) {
					local59 = local35;
					local47 = this.method2382(local45);
					if (this.aByteArrayArray11 != null && local28 != -1) {
						local47 += this.aByteArrayArray11[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local59 = local26;
					@Pc(100) String local100 = arg1.substring(local26 + 1, local35);
					local26 = -1;
					if (local100.equals("br")) {
						arg2[local30] = arg1.substring(local13, local35 + 1);
						local30++;
						if (local30 >= arg2.length) {
							return 0;
						}
						local20 = -1;
						local13 = local35 + 1;
						local28 = -1;
						local11 = 0;
						continue;
					}
					if (local100.equals("lt")) {
						local47 = this.method2382(60);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][60];
						}
						local28 = 60;
					} else if (local100.equals("gt")) {
						local47 = this.method2382(62);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][62];
						}
						local28 = 62;
					} else if (local100.equals("nbsp")) {
						local47 = this.method2382(160);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][160];
						}
						local28 = 160;
					} else if (local100.equals("shy")) {
						local47 = this.method2382(173);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][173];
						}
						local28 = 173;
					} else if (local100.equals("times")) {
						local47 = this.method2382(215);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][215];
						}
						local28 = 215;
					} else if (local100.equals("euro")) {
						local47 = this.method2382(8364);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][8364];
						}
						local28 = 8364;
					} else if (local100.equals("copy")) {
						local47 = this.method2382(169);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][169];
						}
						local28 = 169;
					} else if (local100.equals("reg")) {
						local47 = this.method2382(174);
						if (this.aByteArrayArray11 != null && local28 != -1) {
							local47 += this.aByteArrayArray11[local28][174];
						}
						local28 = 174;
					} else if (local100.startsWith("img=") && arg3 != null) {
						try {
							@Pc(339) int local339 = Static269.method4335(local100.substring(4));
							local28 = -1;
							local47 = arg3[local339].d();
						} catch (@Pc(350) Exception local350) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local22 = local11;
							local20 = local35;
							local24 = 1;
						}
						if (arg0[local30 >= arg0.length ? arg0.length - 1 : local30] < local11) {
							if (local20 >= 0) {
								arg2[local30] = arg1.substring(local13, local20 + 1 - local24);
								local30++;
								if (arg2.length <= local30) {
									return 0;
								}
								local13 = local20 + 1;
								local28 = -1;
								local11 -= local22;
								local20 = -1;
							} else {
								arg2[local30] = arg1.substring(local13, local59);
								local30++;
								if (local30 >= arg2.length) {
									return 0;
								}
								local28 = -1;
								local13 = local59;
								local11 = local47;
								local20 = -1;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local20 = local35;
							local22 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg2[local30] = arg1.substring(local13, arg1.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(CII)I")
	public int method2379(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray11 == null ? 0 : this.aByteArrayArray11[arg1][arg0];
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Lclient!aa;ILjava/lang/String;)I")
	public int method2380(@OriginalArg(1) Class2[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method2376(new int[] { arg1 }, arg2, Static282.aStringArray27, arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2381(@OriginalArg(0) String arg0) {
		return this.method2383(null, arg0);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
	public int method2382(@OriginalArg(0) int arg0) {
		return this.aByteArray29[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([Lclient!aa;BLjava/lang/String;)I")
	public int method2383(@OriginalArg(0) Class2[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(29) char local29 = arg1.charAt(local20);
			if (local29 == '<') {
				local11 = local20;
			} else {
				if (local29 == '>' && local11 != -1) {
					@Pc(51) String local51 = arg1.substring(local11 + 1, local20);
					local11 = -1;
					if (local51.equals("lt")) {
						local29 = '<';
					} else if (local51.equals("gt")) {
						local29 = '>';
					} else if (local51.equals("nbsp")) {
						local29 = ' ';
					} else if (local51.equals("shy")) {
						local29 = '\u00ad';
					} else if (local51.equals("times")) {
						local29 = '×';
					} else if (local51.equals("euro")) {
						local29 = '€';
					} else if (local51.equals("copy")) {
						local29 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=") && arg0 != null) {
								try {
									@Pc(109) int local109 = Static269.method4335(local51.substring(4));
									local15 += arg0[local109].d();
									local13 = -1;
								} catch (@Pc(120) Exception local120) {
								}
							}
							continue;
						}
						local29 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray29[Static170.method2991(local29) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local13 != -1) {
						local15 += this.aByteArrayArray11[local13][local29];
					}
					local13 = local29;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Lclient!aa;Ljava/lang/String;ZI)I")
	public int method2384(@OriginalArg(1) Class2[] arg0, @OriginalArg(2) String arg1) {
		@Pc(4) int local4 = this.anInt2631;
		@Pc(21) int local21 = this.method2376(new int[] { 100 }, arg1, Static282.aStringArray27, arg0);
		@Pc(27) int local27 = local4 * (local21 - 1);
		return this.anInt2628 + local27 + this.anInt2634;
	}
}
