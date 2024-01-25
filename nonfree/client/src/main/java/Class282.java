import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class282 {

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "[B")
	private final byte[] aByteArray94;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
	public final int anInt8309;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
	public final int anInt8303;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	public final int anInt8306;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "([B)V")
	public Class282(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub3 local8 = new Class3_Sub3(arg0);
		@Pc(12) int local12 = local8.method4225();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method4225() == 1;
		this.aByteArray94 = new byte[256];
		local8.method4206(this.aByteArray94, 256, 0);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			@Pc(59) int[] local59 = new int[256];
			for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
				local56[local61] = local8.method4225();
			}
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local59[local77] = local8.method4225();
			}
			@Pc(94) byte[][] local94 = new byte[256][];
			@Pc(109) int local109;
			for (@Pc(96) int local96 = 0; local96 < 256; local96++) {
				local94[local96] = new byte[local56[local96]];
				@Pc(107) byte local107 = 0;
				for (local109 = 0; local109 < local94[local96].length; local109++) {
					local107 += local8.method4254();
					local94[local96][local109] = local107;
				}
			}
			@Pc(138) byte[][] local138 = new byte[256][];
			@Pc(153) int local153;
			for (local109 = 0; local109 < 256; local109++) {
				local138[local109] = new byte[local56[local109]];
				@Pc(151) byte local151 = 0;
				for (local153 = 0; local153 < local138[local109].length; local153++) {
					local151 += local8.method4254();
					local138[local109][local153] = local151;
				}
			}
			this.aByteArrayArray30 = new byte[256][256];
			for (@Pc(188) int local188 = 0; local188 < 256; local188++) {
				if (local188 != 32 && local188 != 160) {
					for (local153 = 0; local153 < 256; local153++) {
						if (local153 != 32 && local153 != 160) {
							this.aByteArrayArray30[local188][local153] = (byte) Static213.method3605(local94, this.aByteArray94, local56, local59, local153, local138, local188);
						}
					}
				}
			}
			this.anInt8309 = local56[32] + local59[32];
		} else {
			this.anInt8309 = local8.method4225();
		}
		local8.method4225();
		local8.method4225();
		this.anInt8303 = local8.method4225();
		this.anInt8306 = local8.method4225();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;[Lclient!td;I)I")
	public int method7131(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class24[] arg2) {
		return this.method7136(new int[] { arg0 }, arg1, Static314.aStringArray23, arg2);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ICB)I")
	public int method7134(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray30 == null ? 0 : this.aByteArrayArray30[arg0][arg1];
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7135(@OriginalArg(1) String arg0) {
		return this.method7138(null, arg0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([ILjava/lang/String;[Ljava/lang/String;I[Lclient!td;)I")
	public int method7136(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) Class24[] arg3) {
		if (arg1 == null) {
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
		@Pc(28) int local28 = arg1.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static270.method4452(arg1.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(57) int local57;
				if (local21 == -1) {
					local57 = local30;
					local42 = this.method7140(local40);
					if (this.aByteArrayArray30 != null && local23 != -1) {
						local42 += this.aByteArrayArray30[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local57 = local21;
					@Pc(95) String local95 = arg1.substring(local21 + 1, local30);
					local21 = -1;
					if (local95.equals("br")) {
						arg2[local25] = arg1.substring(local13, local30 + 1);
						local25++;
						if (arg2.length <= local25) {
							return 0;
						}
						local13 = local30 + 1;
						local11 = 0;
						local15 = -1;
						local23 = -1;
						continue;
					}
					if (local95.equals("lt")) {
						local42 = this.method7140(60);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][60];
						}
						local23 = 60;
					} else if (local95.equals("gt")) {
						local42 = this.method7140(62);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][62];
						}
						local23 = 62;
					} else if (local95.equals("nbsp")) {
						local42 = this.method7140(160);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][160];
						}
						local23 = 160;
					} else if (local95.equals("shy")) {
						local42 = this.method7140(173);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][173];
						}
						local23 = 173;
					} else if (local95.equals("times")) {
						local42 = this.method7140(215);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][215];
						}
						local23 = 215;
					} else if (local95.equals("euro")) {
						local42 = this.method7140(8364);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][8364];
						}
						local23 = 8364;
					} else if (local95.equals("copy")) {
						local42 = this.method7140(169);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][169];
						}
						local23 = 169;
					} else if (local95.equals("reg")) {
						local42 = this.method7140(174);
						if (this.aByteArrayArray30 != null && local23 != -1) {
							local42 += this.aByteArrayArray30[local23][174];
						}
						local23 = 174;
					} else if (local95.startsWith("img=") && arg3 != null) {
						try {
							@Pc(280) int local280 = Static134.method2553(local95.substring(4));
							local42 = arg3[local280].method8576();
							local23 = -1;
						} catch (@Pc(291) Exception local291) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg0 != null) {
						if (local40 == 32) {
							local15 = local30;
							local19 = 1;
							local17 = local11;
						}
						if (local11 > arg0[local25 < arg0.length ? local25 : arg0.length - 1]) {
							if (local15 < 0) {
								arg2[local25] = arg1.substring(local13, local57);
								local25++;
								if (local25 >= arg2.length) {
									return 0;
								}
								local11 = local42;
								local15 = -1;
								local13 = local57;
								local23 = -1;
							} else {
								arg2[local25] = arg1.substring(local13, local15 + 1 - local19);
								local25++;
								if (arg2.length <= local25) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local15 = -1;
								local23 = -1;
							}
						}
						if (local40 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local30;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg2[local25] = arg1.substring(local13, arg1.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[Lclient!td;Ljava/lang/String;II)I")
	public int method7137(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt8309;
		}
		@Pc(22) int local22 = this.method7136(new int[] { arg0 }, arg2, Static314.aStringArray23, arg1);
		@Pc(28) int local28 = arg3 * (local22 - 1);
		return this.anInt8306 + this.anInt8303 + local28;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([Lclient!td;Ljava/lang/String;B)I")
	public int method7138(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
			@Pc(37) char local37 = arg1.charAt(local31);
			if (local37 == '<') {
				local11 = local31;
			} else {
				if (local37 == '>' && local11 != -1) {
					@Pc(58) String local58 = arg1.substring(local11 + 1, local31);
					local11 = -1;
					if (local58.equals("lt")) {
						local37 = '<';
					} else if (local58.equals("gt")) {
						local37 = '>';
					} else if (local58.equals("nbsp")) {
						local37 = ' ';
					} else if (local58.equals("shy")) {
						local37 = '\u00ad';
					} else if (local58.equals("times")) {
						local37 = '×';
					} else if (local58.equals("euro")) {
						local37 = '€';
					} else if (local58.equals("copy")) {
						local37 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=") && arg0 != null) {
								try {
									@Pc(126) int local126 = Static134.method2553(local58.substring(4));
									local13 = -1;
									local15 += arg0[local126].method8576();
								} catch (@Pc(137) Exception local137) {
								}
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray94[Static270.method4452(local37) & 0xFF] & 0xFF;
					if (this.aByteArrayArray30 != null && local13 != -1) {
						local15 += this.aByteArrayArray30[local13][local37];
					}
					local13 = local37;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!td;)I")
	public int method7139(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class24[] arg2) {
		@Pc(26) int local26 = this.method7136(new int[] { arg0 }, arg1, Static314.aStringArray23, arg2);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(40) int local40 = this.method7138(arg2, Static314.aStringArray23[local30]);
			if (local40 > local28) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
	public int method7140(@OriginalArg(1) int arg0) {
		return this.aByteArray94[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[Lclient!td;Ljava/lang/String;I)Ljava/lang/String;")
	public String method7142(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1, @OriginalArg(2) String arg2) {
		if (arg0 >= this.method7138(arg1, arg2)) {
			return arg2;
		}
		@Pc(26) int local26 = arg0 - this.method7138(null, "...");
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg2.length();
		@Pc(43) String local43 = "";
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(51) char local51 = arg2.charAt(local45);
			if (local51 == '<') {
				local28 = local45;
			} else {
				if (local51 == '>' && local28 != -1) {
					@Pc(76) String local76 = arg2.substring(local28 + 1, local45);
					local28 = -1;
					if (local76.equals("lt")) {
						local51 = '<';
					} else if (local76.equals("gt")) {
						local51 = '>';
					} else if (local76.equals("nbsp")) {
						local51 = ' ';
					} else if (local76.equals("shy")) {
						local51 = '\u00ad';
					} else if (local76.equals("times")) {
						local51 = '×';
					} else if (local76.equals("euro")) {
						local51 = '€';
					} else if (local76.equals("copy")) {
						local51 = '©';
					} else {
						if (!local76.equals("reg")) {
							if (local76.startsWith("img=") && arg1 != null) {
								try {
									@Pc(144) int local144 = Static134.method2553(local76.substring(4));
									local30 = -1;
									local38 += arg1[local144].method8576();
									if (local26 < local38) {
										return local43 + "...";
									}
									local43 = arg2.substring(0, local45 + 1);
								} catch (@Pc(178) Exception local178) {
								}
							}
							continue;
						}
						local51 = '®';
					}
				}
				if (local28 == -1) {
					local38 += this.aByteArray94[Static270.method4452(local51) & 0xFF] & 0xFF;
					if (this.aByteArrayArray30 != null && local30 != -1) {
						local38 += this.aByteArrayArray30[local30][local51];
					}
					local30 = local51;
					@Pc(226) int local226 = local38;
					if (this.aByteArrayArray30 != null) {
						local226 = local38 + this.aByteArrayArray30[local51][46];
					}
					if (local26 < local226) {
						return local43 + "...";
					}
					local43 = arg2.substring(0, local45 + 1);
				}
			}
		}
		return arg2;
	}
}
