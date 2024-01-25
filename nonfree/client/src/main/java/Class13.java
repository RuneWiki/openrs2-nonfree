import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class13 {

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
	public final int anInt522;

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
	public final int anInt517;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
	public final int anInt510;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "([B)V")
	public Class13(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub20 local8 = new Class1_Sub20(arg0);
		@Pc(12) int local12 = local8.method4393();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method4393() == 1;
		this.aByteArray3 = new byte[256];
		local8.method4425(this.aByteArray3, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
				local46[local48] = local8.method4393();
			}
			@Pc(63) int[] local63 = new int[256];
			for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
				local63[local65] = local8.method4393();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method4432();
					local82[local84][local97] = local95;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(141) int local141;
			for (local97 = 0; local97 < 256; local97++) {
				local126[local97] = new byte[local46[local97]];
				@Pc(139) byte local139 = 0;
				for (local141 = 0; local141 < local126[local97].length; local141++) {
					local139 += local8.method4432();
					local126[local97][local141] = local139;
				}
			}
			this.aByteArrayArray1 = new byte[256][256];
			for (@Pc(174) int local174 = 0; local174 < 256; local174++) {
				if (local174 != 32 && local174 != 160) {
					for (local141 = 0; local141 < 256; local141++) {
						if (local141 != 32 && local141 != 160) {
							this.aByteArrayArray1[local174][local141] = (byte) Static357.method5213(local174, local126, local141, local63, local82, local46, this.aByteArray3);
						}
					}
				}
			}
			this.anInt522 = local63[32] + local46[32];
		} else {
			this.anInt522 = local8.method4393();
		}
		local8.method4393();
		local8.method4393();
		this.anInt517 = local8.method4393();
		this.anInt510 = local8.method4393();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBC)I")
	public int method455(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray1 == null ? 0 : this.aByteArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;I)I")
	public int method456(@OriginalArg(1) Class10[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method458(new int[] { arg2 }, Static504.aStringArray36, arg1, arg0);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!f;)I")
	public int method457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class10[] arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt522;
		}
		@Pc(24) int local24 = this.method458(new int[] { arg1 }, Static504.aStringArray36, arg2, arg3);
		@Pc(30) int local30 = (local24 - 1) * arg0;
		return this.anInt510 + this.anInt517 + local30;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([II[Ljava/lang/String;Ljava/lang/String;[Lclient!f;)I")
	public int method458(@OriginalArg(0) int[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class10[] arg3) {
		if (arg2 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static366.method5367(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(62) int local62;
				if (local26 == -1) {
					local62 = local35;
					local47 = this.method460(local45);
					if (this.aByteArrayArray1 != null && local28 != -1) {
						local47 += this.aByteArrayArray1[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local62 = local26;
					@Pc(100) String local100 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local100.equals("br")) {
						arg1[local30] = arg2.substring(local13, local35 + 1);
						local30++;
						if (arg1.length <= local30) {
							return 0;
						}
						local13 = local35 + 1;
						local11 = 0;
						local28 = -1;
						local15 = -1;
						continue;
					}
					if (local100.equals("lt")) {
						local47 = this.method460(60);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][60];
						}
						local28 = 60;
					} else if (local100.equals("gt")) {
						local47 = this.method460(62);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][62];
						}
						local28 = 62;
					} else if (local100.equals("nbsp")) {
						local47 = this.method460(160);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][160];
						}
						local28 = 160;
					} else if (local100.equals("shy")) {
						local47 = this.method460(173);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][173];
						}
						local28 = 173;
					} else if (local100.equals("times")) {
						local47 = this.method460(215);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][215];
						}
						local28 = 215;
					} else if (local100.equals("euro")) {
						local47 = this.method460(8364);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][8364];
						}
						local28 = 8364;
					} else if (local100.equals("copy")) {
						local47 = this.method460(169);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][169];
						}
						local28 = 169;
					} else if (local100.equals("reg")) {
						local47 = this.method460(174);
						if (this.aByteArrayArray1 != null && local28 != -1) {
							local47 += this.aByteArrayArray1[local28][174];
						}
						local28 = 174;
					} else if (local100.startsWith("img=") && arg3 != null) {
						try {
							@Pc(283) int local283 = Static480.method6741(local100.substring(4));
							local47 = arg3[local283].A();
							local28 = -1;
						} catch (@Pc(294) Exception local294) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local22 = local11;
							local15 = local35;
							local24 = 1;
						}
						if (local11 > arg0[arg0.length <= local30 ? arg0.length - 1 : local30]) {
							if (local15 < 0) {
								arg1[local30] = arg2.substring(local13, local62);
								local30++;
								if (arg1.length <= local30) {
									return 0;
								}
								local28 = -1;
								local15 = -1;
								local11 = local47;
								local13 = local62;
							} else {
								arg1[local30] = arg2.substring(local13, local15 + 1 - local24);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local22;
								local28 = -1;
							}
						}
						if (local45 == 45) {
							local15 = local35;
							local22 = local11;
							local24 = 0;
						}
					}
				}
			}
		}
		if (local13 < arg2.length()) {
			arg1[local30] = arg2.substring(local13, arg2.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IB)I")
	public int method460(@OriginalArg(0) int arg0) {
		return this.aByteArray3[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILjava/lang/String;[Lclient!f;)Ljava/lang/String;")
	public String method462(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class10[] arg2) {
		if (arg0 >= this.method465(arg2, arg1)) {
			return arg1;
		}
		@Pc(24) int local24 = arg0 - this.method465(null, "...");
		@Pc(26) int local26 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg1.length();
		@Pc(41) String local41 = "";
		for (@Pc(43) int local43 = 0; local43 < local39; local43++) {
			@Pc(49) char local49 = arg1.charAt(local43);
			if (local49 == '<') {
				local26 = local43;
			} else {
				if (local49 == '>' && local26 != -1) {
					@Pc(74) String local74 = arg1.substring(local26 + 1, local43);
					local26 = -1;
					if (local74.equals("lt")) {
						local49 = '<';
					} else if (local74.equals("gt")) {
						local49 = '>';
					} else if (local74.equals("nbsp")) {
						local49 = ' ';
					} else if (local74.equals("shy")) {
						local49 = '\u00ad';
					} else if (local74.equals("times")) {
						local49 = '×';
					} else if (local74.equals("euro")) {
						local49 = '€';
					} else if (local74.equals("copy")) {
						local49 = '©';
					} else {
						if (!local74.equals("reg")) {
							if (local74.startsWith("img=") && arg2 != null) {
								try {
									@Pc(144) int local144 = Static480.method6741(local74.substring(4));
									local36 += arg2[local144].A();
									local34 = -1;
									if (local36 > local24) {
										return local41 + "...";
									}
									local41 = arg1.substring(0, local43 + 1);
								} catch (@Pc(178) Exception local178) {
								}
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local26 == -1) {
					local36 += this.aByteArray3[Static366.method5367(local49) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local34 != -1) {
						local36 += this.aByteArrayArray1[local34][local49];
					}
					local34 = local49;
					@Pc(225) int local225 = local36;
					if (this.aByteArrayArray1 != null) {
						local225 = local36 + this.aByteArrayArray1[local49][46];
					}
					if (local225 > local24) {
						return local41 + "...";
					}
					local41 = arg1.substring(0, local43 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method463(@OriginalArg(0) String arg0) {
		return this.method465(null, arg0);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;I)I")
	public int method465(@OriginalArg(0) Class10[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(56) String local56 = arg1.substring(local11 + 1, local28);
					local11 = -1;
					if (local56.equals("lt")) {
						local34 = '<';
					} else if (local56.equals("gt")) {
						local34 = '>';
					} else if (local56.equals("nbsp")) {
						local34 = ' ';
					} else if (local56.equals("shy")) {
						local34 = '\u00ad';
					} else if (local56.equals("times")) {
						local34 = '×';
					} else if (local56.equals("euro")) {
						local34 = '€';
					} else if (local56.equals("copy")) {
						local34 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg0 != null) {
								try {
									@Pc(114) int local114 = Static480.method6741(local56.substring(4));
									local23 += arg0[local114].A();
									local21 = -1;
								} catch (@Pc(125) Exception local125) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local23 += this.aByteArray3[Static366.method5367(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray1 != null && local21 != -1) {
						local23 += this.aByteArrayArray1[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I[Lclient!f;ILjava/lang/String;)I")
	public int method466(@OriginalArg(1) Class10[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(27) int local27 = this.method458(new int[] { arg1 }, Static504.aStringArray36, arg2, arg0);
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			@Pc(41) int local41 = this.method465(arg0, Static504.aStringArray36[local31]);
			if (local41 > local29) {
				local29 = local41;
			}
		}
		return local29;
	}
}
