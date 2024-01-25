import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class15 {

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	public final int anInt324;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public final int anInt326;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	public final int anInt318;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "([B)V")
	public Class15(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		@Pc(12) int local12 = local8.method6138();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method6138() == 1;
		this.aByteArray8 = new byte[256];
		local8.method6164(256, this.aByteArray8);
		if (local33) {
			@Pc(56) int[] local56 = new int[256];
			for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
				local56[local58] = local8.method6138();
			}
			@Pc(75) int[] local75 = new int[256];
			for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
				local75[local77] = local8.method6138();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local56[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method6120();
					local92[local94][local107] = local105;
				}
			}
			@Pc(138) byte[][] local138 = new byte[256][];
			@Pc(153) int local153;
			for (local107 = 0; local107 < 256; local107++) {
				local138[local107] = new byte[local56[local107]];
				@Pc(151) byte local151 = 0;
				for (local153 = 0; local153 < local138[local107].length; local153++) {
					local151 += local8.method6120();
					local138[local107][local153] = local151;
				}
			}
			this.aByteArrayArray2 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local153 = 0; local153 < 256; local153++) {
						if (local153 != 32 && local153 != 160) {
							this.aByteArrayArray2[local190][local153] = (byte) Static206.method2908(local56, local92, local190, local153, local75, this.aByteArray8, local138);
						}
					}
				}
			}
			this.anInt324 = local56[32] + local75[32];
		} else {
			this.anInt324 = local8.method6138();
		}
		local8.method6138();
		local8.method6138();
		this.anInt326 = local8.method6138();
		this.anInt318 = local8.method6138();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lclient!o;Ljava/lang/String;II)Ljava/lang/String;")
	public String method319(@OriginalArg(0) Class41[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= this.method323(arg1, arg0)) {
			return arg1;
		}
		@Pc(22) int local22 = arg2 - this.method323("...", null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		@Pc(33) String local33 = "";
		for (@Pc(35) int local35 = 0; local35 < local31; local35++) {
			@Pc(41) char local41 = arg1.charAt(local35);
			if (local41 == '<') {
				local24 = local35;
			} else {
				if (local41 == '>' && local24 != -1) {
					@Pc(64) String local64 = arg1.substring(local24 + 1, local35);
					local24 = -1;
					if (local64.equals("lt")) {
						local41 = '<';
					} else if (local64.equals("gt")) {
						local41 = '>';
					} else if (local64.equals("nbsp")) {
						local41 = ' ';
					} else if (local64.equals("shy")) {
						local41 = '\u00ad';
					} else if (local64.equals("times")) {
						local41 = '×';
					} else if (local64.equals("euro")) {
						local41 = '€';
					} else if (local64.equals("copy")) {
						local41 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=") && arg0 != null) {
								try {
									@Pc(128) int local128 = Static389.method5412(local64.substring(4));
									local28 += arg0[local128].RA();
									local26 = -1;
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg1.substring(0, local35 + 1);
								} catch (@Pc(158) Exception local158) {
								}
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray8[Static13.method316(local41) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local26 != -1) {
						local28 += this.aByteArrayArray2[local26][local41];
					}
					local26 = local41;
					@Pc(211) int local211 = local28;
					if (this.aByteArrayArray2 != null) {
						local211 = local28 + this.aByteArrayArray2[local41][46];
					}
					if (local211 > local22) {
						return local33 + "...";
					}
					local33 = arg1.substring(0, local35 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method320(@OriginalArg(0) String arg0) {
		return this.method323(arg0, null);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;[Lclient!o;IIZ)I")
	public int method321(@OriginalArg(0) String arg0, @OriginalArg(1) Class41[] arg1) {
		@Pc(18) int local18 = this.anInt324;
		@Pc(31) int local31 = this.method328(arg0, arg1, Static145.aStringArray31, new int[] { 100 });
		@Pc(37) int local37 = (local31 - 1) * local18;
		return this.anInt318 + local37 + this.anInt326;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lclient!o;ILjava/lang/String;I)I")
	public int method322(@OriginalArg(0) Class41[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(18) int local18 = this.method328(arg2, arg0, Static145.aStringArray31, new int[] { arg1 });
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method323(Static145.aStringArray31[local30], arg0);
			if (local28 < local40) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;[Lclient!o;I)I")
	public int method323(@OriginalArg(0) String arg0, @OriginalArg(1) Class41[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(25) int local25 = arg0.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(32) char local32 = arg0.charAt(local27);
			if (local32 == '<') {
				local9 = local27;
			} else {
				if (local32 == '>' && local9 != -1) {
					@Pc(51) String local51 = arg0.substring(local9 + 1, local27);
					local9 = -1;
					if (local51.equals("lt")) {
						local32 = '<';
					} else if (local51.equals("gt")) {
						local32 = '>';
					} else if (local51.equals("nbsp")) {
						local32 = ' ';
					} else if (local51.equals("shy")) {
						local32 = '\u00ad';
					} else if (local51.equals("times")) {
						local32 = '×';
					} else if (local51.equals("euro")) {
						local32 = '€';
					} else if (local51.equals("copy")) {
						local32 = '©';
					} else {
						if (!local51.equals("reg")) {
							if (local51.startsWith("img=") && arg1 != null) {
								try {
									@Pc(110) int local110 = Static389.method5412(local51.substring(4));
									local11 = -1;
									local13 += arg1[local110].RA();
								} catch (@Pc(121) Exception local121) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray8[Static13.method316(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local11 != -1) {
						local13 += this.aByteArrayArray2[local11][local32];
					}
					local11 = local32;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)I")
	public int method324(@OriginalArg(0) int arg0) {
		return this.aByteArray8[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(CII)I")
	public int method325(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg1][arg0];
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[Lclient!o;ILjava/lang/String;)I")
	public int method327(@OriginalArg(1) Class41[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method328(arg2, arg0, Static145.aStringArray31, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!o;[Ljava/lang/String;[I)I")
	public int method328(@OriginalArg(0) String arg0, @OriginalArg(2) Class41[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int[] arg3) {
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
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(49) int local49 = Static13.method316(arg0.charAt(local39)) & 0xFF;
			@Pc(51) int local51 = 0;
			if (local49 == 60) {
				local21 = local39;
			} else {
				@Pc(70) int local70;
				if (local21 == -1) {
					local70 = local39;
					local51 = this.method324(local49);
					if (this.aByteArrayArray2 != null && local23 != -1) {
						local51 += this.aByteArrayArray2[local23][local49];
					}
					local23 = local49;
				} else {
					if (local49 != 62) {
						continue;
					}
					local70 = local21;
					@Pc(77) String local77 = arg0.substring(local21 + 1, local39);
					local21 = -1;
					if (local77.equals("br")) {
						arg2[local34] = arg0.substring(local13, local39 + 1);
						local34++;
						if (local34 >= arg2.length) {
							return 0;
						}
						local15 = -1;
						local11 = 0;
						local13 = local39 + 1;
						local23 = -1;
						continue;
					}
					if (local77.equals("lt")) {
						local51 = this.method324(60);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][60];
						}
						local23 = 60;
					} else if (local77.equals("gt")) {
						local51 = this.method324(62);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][62];
						}
						local23 = 62;
					} else if (local77.equals("nbsp")) {
						local51 = this.method324(160);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][160];
						}
						local23 = 160;
					} else if (local77.equals("shy")) {
						local51 = this.method324(173);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][173];
						}
						local23 = 173;
					} else if (local77.equals("times")) {
						local51 = this.method324(215);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][215];
						}
						local23 = 215;
					} else if (local77.equals("euro")) {
						local51 = this.method324(8364);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][8364];
						}
						local23 = 8364;
					} else if (local77.equals("copy")) {
						local51 = this.method324(169);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][169];
						}
						local23 = 169;
					} else if (local77.equals("reg")) {
						local51 = this.method324(174);
						if (this.aByteArrayArray2 != null && local23 != -1) {
							local51 += this.aByteArrayArray2[local23][174];
						}
						local23 = 174;
					} else if (local77.startsWith("img=") && arg1 != null) {
						try {
							@Pc(318) int local318 = Static389.method5412(local77.substring(4));
							local51 = arg1[local318].RA();
							local23 = -1;
						} catch (@Pc(329) Exception local329) {
						}
					}
					local49 = -1;
				}
				if (local51 > 0) {
					local11 += local51;
					if (arg3 != null) {
						if (local49 == 32) {
							local15 = local39;
							local19 = 1;
							local17 = local11;
						}
						if (arg3[local34 < arg3.length ? local34 : arg3.length - 1] < local11) {
							if (local15 < 0) {
								arg2[local34] = arg0.substring(local13, local70);
								local34++;
								if (arg2.length <= local34) {
									return 0;
								}
								local11 = local51;
								local23 = -1;
								local15 = -1;
								local13 = local70;
							} else {
								arg2[local34] = arg0.substring(local13, local15 + 1 - local19);
								local34++;
								if (arg2.length <= local34) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local11 -= local17;
								local15 = -1;
							}
						}
						if (local49 == 45) {
							local15 = local39;
							local19 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg0.length()) {
			arg2[local34] = arg0.substring(local13, arg0.length());
			local34++;
		}
		return local34;
	}
}
