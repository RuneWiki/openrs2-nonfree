import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class198 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	public final int anInt6044;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public final int anInt6043;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public final int anInt6045;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "([B)V")
	public Class198(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub13 local8 = new Class4_Sub13(arg0);
		@Pc(12) int local12 = local8.method7004();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method7004() == 1;
		this.aByteArray49 = new byte[256];
		local8.method7049(this.aByteArray49, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method7004();
			}
			@Pc(72) int[] local72 = new int[256];
			for (@Pc(74) int local74 = 0; local74 < 256; local74++) {
				local72[local74] = local8.method7004();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method7011();
					local89[local91][local104] = local102;
				}
			}
			@Pc(137) byte[][] local137 = new byte[256][];
			@Pc(152) int local152;
			for (local104 = 0; local104 < 256; local104++) {
				local137[local104] = new byte[local53[local104]];
				@Pc(150) byte local150 = 0;
				for (local152 = 0; local152 < local137[local104].length; local152++) {
					local150 += local8.method7011();
					local137[local104][local152] = local150;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(189) int local189 = 0; local189 < 256; local189++) {
				if (local189 != 32 && local189 != 160) {
					for (local152 = 0; local152 < 256; local152++) {
						if (local152 != 32 && local152 != 160) {
							this.aByteArrayArray19[local189][local152] = (byte) Static553.method7776(local137, this.aByteArray49, local152, local72, local189, local89, local53);
						}
					}
				}
			}
			this.anInt6044 = local53[32] + local72[32];
		} else {
			this.anInt6044 = local8.method7004();
		}
		local8.method7004();
		local8.method7004();
		this.anInt6043 = local8.method7004();
		this.anInt6045 = local8.method7004();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[Lclient!f;ILjava/lang/String;)I")
	public int method4761(@OriginalArg(0) int arg0, @OriginalArg(1) Class88[] arg1, @OriginalArg(3) String arg2) {
		@Pc(26) int local26 = this.method4763(arg1, Static155.aStringArray14, new int[] { arg0 }, arg2);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method4772(Static155.aStringArray14[local30], arg1);
			if (local28 < local40) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([Lclient!f;[Ljava/lang/String;[ILjava/lang/String;I)I")
	public int method4763(@OriginalArg(0) Class88[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
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
		@Pc(28) int local28 = arg3.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static220.method7179(arg3.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(62) int local62;
				if (local21 == -1) {
					local42 = this.method4765(local40);
					local62 = local30;
					if (this.aByteArrayArray19 != null && local23 != -1) {
						local42 += this.aByteArrayArray19[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local62 = local21;
					@Pc(69) String local69 = arg3.substring(local21 + 1, local30);
					local21 = -1;
					if (local69.equals("br")) {
						arg1[local25] = arg3.substring(local13, local30 + 1);
						local25++;
						if (local25 >= arg1.length) {
							return 0;
						}
						local23 = -1;
						local15 = -1;
						local13 = local30 + 1;
						local11 = 0;
						continue;
					}
					if (local69.equals("lt")) {
						local42 = this.method4765(60);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][60];
						}
						local23 = 60;
					} else if (local69.equals("gt")) {
						local42 = this.method4765(62);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][62];
						}
						local23 = 62;
					} else if (local69.equals("nbsp")) {
						local42 = this.method4765(160);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][160];
						}
						local23 = 160;
					} else if (local69.equals("shy")) {
						local42 = this.method4765(173);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][173];
						}
						local23 = 173;
					} else if (local69.equals("times")) {
						local42 = this.method4765(215);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][215];
						}
						local23 = 215;
					} else if (local69.equals("euro")) {
						local42 = this.method4765(8364);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][8364];
						}
						local23 = 8364;
					} else if (local69.equals("copy")) {
						local42 = this.method4765(169);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][169];
						}
						local23 = 169;
					} else if (local69.equals("reg")) {
						local42 = this.method4765(174);
						if (this.aByteArrayArray19 != null && local23 != -1) {
							local42 += this.aByteArrayArray19[local23][174];
						}
						local23 = 174;
					} else if (local69.startsWith("img=") && arg0 != null) {
						try {
							@Pc(281) int local281 = Static393.method6016(local69.substring(4));
							local23 = -1;
							local42 = arg0[local281].A();
						} catch (@Pc(292) Exception local292) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg2 != null) {
						if (local40 == 32) {
							local15 = local30;
							local19 = 1;
							local17 = local11;
						}
						if (local11 > arg2[arg2.length <= local25 ? arg2.length - 1 : local25]) {
							if (local15 >= 0) {
								arg1[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local11 -= local17;
								local23 = -1;
							} else {
								arg1[local25] = arg3.substring(local13, local62);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local23 = -1;
								local13 = local62;
								local15 = -1;
								local11 = local42;
							}
						}
						if (local40 == 45) {
							local19 = 0;
							local15 = local30;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg3.length() > local13) {
			arg1[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIC)I")
	public int method4764(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg0][arg1];
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)I")
	public int method4765(@OriginalArg(1) int arg0) {
		return this.aByteArray49[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!f;)I")
	public int method4766(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class88[] arg2) {
		return this.method4763(arg2, Static155.aStringArray14, new int[] { arg1 }, arg0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!f;)Ljava/lang/String;")
	public String method4768(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class88[] arg2) {
		if (this.method4772(arg1, arg2) <= arg0) {
			return arg1;
		}
		@Pc(22) int local22 = arg0 - this.method4772("...", null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		@Pc(33) String local33 = "";
		for (@Pc(40) int local40 = 0; local40 < local31; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local46 == '<') {
				local24 = local40;
			} else {
				if (local46 == '>' && local24 != -1) {
					@Pc(66) String local66 = arg1.substring(local24 + 1, local40);
					local24 = -1;
					if (local66.equals("lt")) {
						local46 = '<';
					} else if (local66.equals("gt")) {
						local46 = '>';
					} else if (local66.equals("nbsp")) {
						local46 = ' ';
					} else if (local66.equals("shy")) {
						local46 = '\u00ad';
					} else if (local66.equals("times")) {
						local46 = '×';
					} else if (local66.equals("euro")) {
						local46 = '€';
					} else if (local66.equals("copy")) {
						local46 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=") && arg2 != null) {
								try {
									@Pc(126) int local126 = Static393.method6016(local66.substring(4));
									local26 = -1;
									local28 += arg2[local126].A();
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg1.substring(0, local40 + 1);
								} catch (@Pc(160) Exception local160) {
								}
							}
							continue;
						}
						local46 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray49[Static220.method7179(local46) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local26 != -1) {
						local28 += this.aByteArrayArray19[local26][local46];
					}
					local26 = local46;
					@Pc(215) int local215 = local28;
					if (this.aByteArrayArray19 != null) {
						local215 = local28 + this.aByteArrayArray19[local46][46];
					}
					if (local22 < local215) {
						return local33 + "...";
					}
					local33 = arg1.substring(0, local40 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method4769(@OriginalArg(1) String arg0) {
		return this.method4772(arg0, null);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILjava/lang/String;[Lclient!f;)I")
	public int method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class88[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt6044;
		}
		@Pc(29) int local29 = this.method4763(arg3, Static155.aStringArray14, new int[] { arg0 }, arg2);
		@Pc(35) int local35 = (local29 - 1) * arg1;
		return this.anInt6043 + local35 + this.anInt6045;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;[Lclient!f;)I")
	public int method4772(@OriginalArg(1) String arg0, @OriginalArg(2) Class88[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) char local34 = arg0.charAt(local28);
			if (local34 == '<') {
				local11 = local28;
			} else {
				if (local34 == '>' && local11 != -1) {
					@Pc(56) String local56 = arg0.substring(local11 + 1, local28);
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
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(120) int local120 = Static393.method6016(local56.substring(4));
									local13 = -1;
									local15 += arg1[local120].A();
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray49[Static220.method7179(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local13 != -1) {
						local15 += this.aByteArrayArray19[local13][local34];
					}
					local13 = local34;
				}
			}
		}
		return local15;
	}
}
