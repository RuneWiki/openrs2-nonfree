import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class196 {

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "[B")
	private final byte[] aByteArray48;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
	public final int anInt5057;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
	public final int anInt5054;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
	public final int anInt5056;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "([B)V")
	public Class196(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub36 local8 = new Class5_Sub36(arg0);
		@Pc(12) int local12 = local8.method7291();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method7291() == 1;
		this.aByteArray48 = new byte[256];
		local8.method7297(this.aByteArray48, 0, 256);
		if (local30) {
			@Pc(55) int[] local55 = new int[256];
			@Pc(58) int[] local58 = new int[256];
			for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
				local55[local60] = local8.method7291();
			}
			for (@Pc(78) int local78 = 0; local78 < 256; local78++) {
				local58[local78] = local8.method7291();
			}
			@Pc(99) byte[][] local99 = new byte[256][];
			@Pc(118) int local118;
			for (@Pc(101) int local101 = 0; local101 < 256; local101++) {
				local99[local101] = new byte[local55[local101]];
				@Pc(116) byte local116 = 0;
				for (local118 = 0; local118 < local99[local101].length; local118++) {
					local116 += local8.method7318();
					local99[local101][local118] = local116;
				}
			}
			@Pc(157) byte[][] local157 = new byte[256][];
			@Pc(174) int local174;
			for (local118 = 0; local118 < 256; local118++) {
				local157[local118] = new byte[local55[local118]];
				@Pc(172) byte local172 = 0;
				for (local174 = 0; local174 < local157[local118].length; local174++) {
					local172 += local8.method7318();
					local157[local118][local174] = local172;
				}
			}
			this.aByteArrayArray12 = new byte[256][256];
			for (@Pc(213) int local213 = 0; local213 < 256; local213++) {
				if (local213 != 32 && local213 != 160) {
					for (local174 = 0; local174 < 256; local174++) {
						if (local174 != 32 && local174 != 160) {
							this.aByteArrayArray12[local213][local174] = (byte) Static314.method4823(local55, local99, this.aByteArray48, local174, local58, local213, local157);
						}
					}
				}
			}
			this.anInt5057 = local58[32] + local55[32];
		} else {
			this.anInt5057 = local8.method7291();
		}
		local8.method7291();
		local8.method7291();
		this.anInt5054 = local8.method7291();
		this.anInt5056 = local8.method7291();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4556(@OriginalArg(0) String arg0) {
		return this.method4558((Class155[]) null, arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ[Lclient!hk;Ljava/lang/String;)Ljava/lang/String;")
	public String method4557(@OriginalArg(0) int arg0, @OriginalArg(2) Class155[] arg1, @OriginalArg(3) String arg2) {
		if (arg0 >= this.method4558(arg1, arg2)) {
			return arg2;
		}
		@Pc(29) int local29 = arg0 - this.method4558((Class155[]) null, "...");
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(45) int local45 = arg2.length();
		@Pc(47) String local47 = "";
		for (@Pc(49) int local49 = 0; local49 < local45; local49++) {
			@Pc(57) char local57 = arg2.charAt(local49);
			if (local57 == '<') {
				local31 = local49;
			} else {
				if (local57 == '>' && local31 != -1) {
					@Pc(82) String local82 = arg2.substring(local31 + 1, local49);
					local31 = -1;
					if (local82.equals("lt")) {
						local57 = '<';
					} else if (local82.equals("gt")) {
						local57 = '>';
					} else if (local82.equals("nbsp")) {
						local57 = ' ';
					} else if (local82.equals("shy")) {
						local57 = '\u00ad';
					} else if (local82.equals("times")) {
						local57 = '×';
					} else if (local82.equals("euro")) {
						local57 = '€';
					} else if (local82.equals("copy")) {
						local57 = '©';
					} else {
						if (!local82.equals("reg")) {
							if (local82.startsWith("img=") && arg1 != null) {
								try {
									@Pc(192) int local192 = Static407.method5956(local82.substring(4));
									local33 = -1;
									local35 += arg1[local192].method7206();
									if (local35 > local29) {
										return local47 + "...";
									}
									local47 = arg2.substring(0, local49 + 1);
								} catch (@Pc(229) Exception local229) {
								}
							}
							continue;
						}
						local57 = '®';
					}
				}
				if (local31 == -1) {
					local35 += this.aByteArray48[Static571.method7687(local57) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local33 != -1) {
						local35 += this.aByteArrayArray12[local33][local57];
					}
					local33 = local57;
					@Pc(275) int local275 = local35;
					if (this.aByteArrayArray12 != null) {
						local275 = local35 + this.aByteArrayArray12[local57][46];
					}
					if (local275 > local29) {
						return local47 + "...";
					}
					local47 = arg2.substring(0, local49 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[Lclient!hk;Ljava/lang/String;)I")
	public int method4558(@OriginalArg(1) Class155[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = -1;
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg1.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(29) char local29 = arg1.charAt(local21);
			if (local29 == '<') {
				local12 = local21;
			} else {
				if (local29 == '>' && local12 != -1) {
					@Pc(56) String local56 = arg1.substring(local12 + 1, local21);
					local12 = -1;
					if (local56.equals("lt")) {
						local29 = '<';
					} else if (local56.equals("gt")) {
						local29 = '>';
					} else if (local56.equals("nbsp")) {
						local29 = ' ';
					} else if (local56.equals("shy")) {
						local29 = '\u00ad';
					} else if (local56.equals("times")) {
						local29 = '×';
					} else if (local56.equals("euro")) {
						local29 = '€';
					} else if (local56.equals("copy")) {
						local29 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg0 != null) {
								try {
									@Pc(158) int local158 = Static407.method5956(local56.substring(4));
									local14 = -1;
									local16 += arg0[local158].method7206();
								} catch (@Pc(169) Exception local169) {
								}
							}
							continue;
						}
						local29 = '®';
					}
				}
				if (local12 == -1) {
					local16 += this.aByteArray48[Static571.method7687(local29) & 0xFF] & 0xFF;
					if (this.aByteArrayArray12 != null && local14 != -1) {
						local16 += this.aByteArrayArray12[local14][local29];
					}
					local14 = local29;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)I")
	public int method4559(@OriginalArg(0) int arg0) {
		return this.aByteArray48[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(CII)I")
	public int method4561(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray12 == null ? 0 : this.aByteArrayArray12[arg1][arg0];
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!hk;)I")
	public int method4562(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155[] arg2) {
		@Pc(20) int local20 = this.method4565(Static532.aStringArray35, arg0, arg2, new int[] { arg1 });
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local20; local24++) {
			@Pc(36) int local36 = this.method4558(arg2, Static532.aStringArray35[local24]);
			if (local36 > local22) {
				local22 = local36;
			}
		}
		if (-8055 != -8055) {
			Static287.anInt5049 = 95;
		}
		return local22;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!hk;II)I")
	public int method4563(@OriginalArg(0) String arg0, @OriginalArg(2) Class155[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt5057;
		}
		@Pc(26) int local26 = this.method4565(Static532.aStringArray35, arg0, arg1, new int[] { arg2 });
		@Pc(32) int local32 = (local26 - 1) * arg3;
		return this.anInt5056 + local32 + this.anInt5054;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[Lclient!hk;I[I)I")
	public int method4565(@OriginalArg(0) String[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class155[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(31) byte local31 = 0;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg1.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(54) int local54 = Static571.method7687(arg1.charAt(local42)) & 0xFF;
			@Pc(56) int local56 = 0;
			if (local54 == 60) {
				local33 = local42;
			} else {
				@Pc(77) int local77;
				if (local33 == -1) {
					local56 = this.method4559(local54);
					local77 = local42;
					if (this.aByteArrayArray12 != null && local35 != -1) {
						local56 += this.aByteArrayArray12[local35][local54];
					}
					local35 = local54;
				} else {
					if (local54 != 62) {
						continue;
					}
					local77 = local33;
					@Pc(84) String local84 = arg1.substring(local33 + 1, local42);
					local33 = -1;
					if (local84.equals("br")) {
						arg0[local37] = arg1.substring(local14, local42 + 1);
						local37++;
						if (arg0.length <= local37) {
							return 0;
						}
						local12 = 0;
						local27 = -1;
						local14 = local42 + 1;
						local35 = -1;
						continue;
					}
					if (local84.equals("lt")) {
						local56 = this.method4559(60);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][60];
						}
						local35 = 60;
					} else if (local84.equals("gt")) {
						local56 = this.method4559(62);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][62];
						}
						local35 = 62;
					} else if (local84.equals("nbsp")) {
						local56 = this.method4559(160);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][160];
						}
						local35 = 160;
					} else if (local84.equals("shy")) {
						local56 = this.method4559(173);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][173];
						}
						local35 = 173;
					} else if (local84.equals("times")) {
						local56 = this.method4559(215);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][215];
						}
						local35 = 215;
					} else if (local84.equals("euro")) {
						local56 = this.method4559(8364);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][8364];
						}
						local35 = 8364;
					} else if (local84.equals("copy")) {
						local56 = this.method4559(169);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][169];
						}
						local35 = 169;
					} else if (local84.equals("reg")) {
						local56 = this.method4559(174);
						if (this.aByteArrayArray12 != null && local35 != -1) {
							local56 += this.aByteArrayArray12[local35][174];
						}
						local35 = 174;
					} else if (local84.startsWith("img=") && arg2 != null) {
						try {
							@Pc(322) int local322 = Static407.method5956(local84.substring(4));
							local56 = arg2[local322].method7206();
							local35 = -1;
						} catch (@Pc(333) Exception local333) {
						}
					}
					local54 = -1;
				}
				if (local56 > 0) {
					local12 += local56;
					if (arg3 != null) {
						if (local54 == 32) {
							local31 = 1;
							local29 = local12;
							local27 = local42;
						}
						if (local12 > arg3[local37 < arg3.length ? local37 : arg3.length - 1]) {
							if (local27 < 0) {
								arg0[local37] = arg1.substring(local14, local77);
								local37++;
								if (arg0.length <= local37) {
									return 0;
								}
								local14 = local77;
								local27 = -1;
								local35 = -1;
								local12 = local56;
							} else {
								arg0[local37] = arg1.substring(local14, local27 + 1 - local31);
								local37++;
								if (arg0.length <= local37) {
									return 0;
								}
								local14 = local27 + 1;
								local12 -= local29;
								local27 = -1;
								local35 = -1;
							}
						}
						if (local54 == 45) {
							local31 = 0;
							local29 = local12;
							local27 = local42;
						}
					}
				}
			}
		}
		if (local14 < arg1.length()) {
			arg0[local37] = arg1.substring(local14, arg1.length());
			local37++;
		}
		return local37;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[Lclient!hk;ILjava/lang/String;)I")
	public int method4566(@OriginalArg(0) int arg0, @OriginalArg(1) Class155[] arg1, @OriginalArg(3) String arg2) {
		return this.method4565(Static532.aStringArray35, arg2, arg1, new int[] { arg0 });
	}
}
