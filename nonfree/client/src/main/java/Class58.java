import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class58 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	public final int anInt1585;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	public final int anInt1595;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
	public final int anInt1587;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "([B)V")
	public Class58(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub23 local8 = new Class2_Sub23(arg0);
		@Pc(12) int local12 = local8.method5495();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5495() == 1;
		this.aByteArray32 = new byte[256];
		local8.method5509(256, this.aByteArray32);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			@Pc(57) int[] local57 = new int[256];
			for (@Pc(59) int local59 = 0; local59 < 256; local59++) {
				local54[local59] = local8.method5495();
			}
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local57[local75] = local8.method5495();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method5484();
					local90[local92][local105] = local103;
				}
			}
			@Pc(140) byte[][] local140 = new byte[256][];
			@Pc(155) int local155;
			for (local105 = 0; local105 < 256; local105++) {
				local140[local105] = new byte[local54[local105]];
				@Pc(153) byte local153 = 0;
				for (local155 = 0; local155 < local140[local105].length; local155++) {
					local153 += local8.method5484();
					local140[local105][local155] = local153;
				}
			}
			this.aByteArrayArray11 = new byte[256][256];
			for (@Pc(192) int local192 = 0; local192 < 256; local192++) {
				if (local192 != 32 && local192 != 160) {
					for (local155 = 0; local155 < 256; local155++) {
						if (local155 != 32 && local155 != 160) {
							this.aByteArrayArray11[local192][local155] = (byte) Static142.method2403(local57, local90, local54, local155, local192, local140, this.aByteArray32);
						}
					}
				}
			}
			this.anInt1585 = local54[32] + local57[32];
		} else {
			this.anInt1585 = local8.method5495();
		}
		local8.method5495();
		local8.method5495();
		this.anInt1595 = local8.method5495();
		this.anInt1587 = local8.method5495();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[Lclient!l;Ljava/lang/String;)I")
	public int method1338(@OriginalArg(1) int arg0, @OriginalArg(2) Class17[] arg1, @OriginalArg(3) String arg2) {
		@Pc(23) int local23 = this.method1348(Static411.aStringArray47, arg1, arg2, new int[] { arg0 });
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local23; local27++) {
			@Pc(37) int local37 = this.method1349(Static411.aStringArray47[local27], arg1);
			if (local25 < local37) {
				local25 = local37;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[Lclient!l;BILjava/lang/String;)I")
	public int method1339(@OriginalArg(1) Class17[] arg0, @OriginalArg(4) String arg1) {
		@Pc(11) int local11 = this.anInt1585;
		@Pc(24) int local24 = this.method1348(Static411.aStringArray47, arg0, arg1, new int[] { 100 });
		@Pc(30) int local30 = (local24 - 1) * local11;
		return local30 + this.anInt1595 + this.anInt1587;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1340(@OriginalArg(0) String arg0) {
		return this.method1349(arg0, null);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)I")
	public int method1341(@OriginalArg(1) int arg0) {
		return this.aByteArray32[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II[Lclient!l;Ljava/lang/String;)I")
	public int method1343(@OriginalArg(0) int arg0, @OriginalArg(2) Class17[] arg1, @OriginalArg(3) String arg2) {
		return this.method1348(Static411.aStringArray47, arg1, arg2, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(II[Lclient!l;Ljava/lang/String;)Ljava/lang/String;")
	public String method1345(@OriginalArg(0) int arg0, @OriginalArg(2) Class17[] arg1, @OriginalArg(3) String arg2) {
		if (this.method1349(arg2, arg1) <= arg0) {
			return arg2;
		}
		@Pc(30) int local30 = arg0 - this.method1349("...", null);
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg2.length();
		@Pc(41) String local41 = "";
		for (@Pc(43) int local43 = 0; local43 < local39; local43++) {
			@Pc(49) char local49 = arg2.charAt(local43);
			if (local49 == '<') {
				local32 = local43;
			} else {
				if (local49 == '>' && local32 != -1) {
					@Pc(73) String local73 = arg2.substring(local32 + 1, local43);
					local32 = -1;
					if (local73.equals("lt")) {
						local49 = '<';
					} else if (local73.equals("gt")) {
						local49 = '>';
					} else if (local73.equals("nbsp")) {
						local49 = ' ';
					} else if (local73.equals("shy")) {
						local49 = '\u00ad';
					} else if (local73.equals("times")) {
						local49 = '×';
					} else if (local73.equals("euro")) {
						local49 = '€';
					} else if (local73.equals("copy")) {
						local49 = '©';
					} else {
						if (!local73.equals("reg")) {
							if (local73.startsWith("img=") && arg1 != null) {
								try {
									@Pc(131) int local131 = Static418.method5543(local73.substring(4));
									local36 += arg1[local131].j();
									local34 = -1;
									if (local30 < local36) {
										return local41 + "...";
									}
									local41 = arg2.substring(0, local43 + 1);
								} catch (@Pc(165) Exception local165) {
								}
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local32 == -1) {
					local36 += this.aByteArray32[Static129.method2210(local49) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local34 != -1) {
						local36 += this.aByteArrayArray11[local34][local49];
					}
					local34 = local49;
					@Pc(222) int local222 = local36;
					if (this.aByteArrayArray11 != null) {
						local222 = local36 + this.aByteArrayArray11[local49][46];
					}
					if (local30 < local222) {
						return local41 + "...";
					}
					local41 = arg2.substring(0, local43 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(CZI)I")
	public int method1347(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray11 == null ? 0 : this.aByteArrayArray11[arg1][arg0];
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/lang/String;I[Lclient!l;Ljava/lang/String;[I)I")
	public int method1348(@OriginalArg(0) String[] arg0, @OriginalArg(2) Class17[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 == null) {
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
		@Pc(28) int local28 = arg2.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(42) int local42 = Static129.method2210(arg2.charAt(local30)) & 0xFF;
			@Pc(44) int local44 = 0;
			if (local42 == 60) {
				local21 = local30;
			} else {
				@Pc(62) int local62;
				if (local21 == -1) {
					local44 = this.method1341(local42);
					local62 = local30;
					if (this.aByteArrayArray11 != null && local23 != -1) {
						local44 += this.aByteArrayArray11[local23][local42];
					}
					local23 = local42;
				} else {
					if (local42 != 62) {
						continue;
					}
					local62 = local21;
					@Pc(69) String local69 = arg2.substring(local21 + 1, local30);
					local21 = -1;
					if (local69.equals("br")) {
						arg0[local25] = arg2.substring(local13, local30 + 1);
						local25++;
						if (local25 >= arg0.length) {
							return 0;
						}
						local13 = local30 + 1;
						local11 = 0;
						local15 = -1;
						local23 = -1;
						continue;
					}
					if (local69.equals("lt")) {
						local44 = this.method1341(60);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][60];
						}
						local23 = 60;
					} else if (local69.equals("gt")) {
						local44 = this.method1341(62);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][62];
						}
						local23 = 62;
					} else if (local69.equals("nbsp")) {
						local44 = this.method1341(160);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][160];
						}
						local23 = 160;
					} else if (local69.equals("shy")) {
						local44 = this.method1341(173);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][173];
						}
						local23 = 173;
					} else if (local69.equals("times")) {
						local44 = this.method1341(215);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][215];
						}
						local23 = 215;
					} else if (local69.equals("euro")) {
						local44 = this.method1341(8364);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][8364];
						}
						local23 = 8364;
					} else if (local69.equals("copy")) {
						local44 = this.method1341(169);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][169];
						}
						local23 = 169;
					} else if (local69.equals("reg")) {
						local44 = this.method1341(174);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local44 += this.aByteArrayArray11[local23][174];
						}
						local23 = 174;
					} else if (local69.startsWith("img=") && arg1 != null) {
						try {
							@Pc(253) int local253 = Static418.method5543(local69.substring(4));
							local44 = arg1[local253].j();
							local23 = -1;
						} catch (@Pc(264) Exception local264) {
						}
					}
					local42 = -1;
				}
				if (local44 > 0) {
					local11 += local44;
					if (arg3 != null) {
						if (local42 == 32) {
							local17 = local11;
							local19 = 1;
							local15 = local30;
						}
						if (arg3[arg3.length <= local25 ? arg3.length - 1 : local25] < local11) {
							if (local15 >= 0) {
								arg0[local25] = arg2.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local23 = -1;
								local11 -= local17;
							} else {
								arg0[local25] = arg2.substring(local13, local62);
								local25++;
								if (local25 >= arg0.length) {
									return 0;
								}
								local11 = local44;
								local13 = local62;
								local15 = -1;
								local23 = -1;
							}
						}
						if (local42 == 45) {
							local15 = local30;
							local19 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg2.length() > local13) {
			arg0[local25] = arg2.substring(local13, arg2.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!l;)I")
	public int method1349(@OriginalArg(0) String arg0, @OriginalArg(2) Class17[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 == '<') {
				local11 = local20;
			} else {
				if (local26 == '>' && local11 != -1) {
					@Pc(50) String local50 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local50.equals("lt")) {
						local26 = '<';
					} else if (local50.equals("gt")) {
						local26 = '>';
					} else if (local50.equals("nbsp")) {
						local26 = ' ';
					} else if (local50.equals("shy")) {
						local26 = '\u00ad';
					} else if (local50.equals("times")) {
						local26 = '×';
					} else if (local50.equals("euro")) {
						local26 = '€';
					} else if (local50.equals("copy")) {
						local26 = '©';
					} else {
						if (!local50.equals("reg")) {
							if (local50.startsWith("img=") && arg1 != null) {
								try {
									@Pc(112) int local112 = Static418.method5543(local50.substring(4));
									local15 += arg1[local112].j();
									local13 = -1;
								} catch (@Pc(123) Exception local123) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray32[Static129.method2210(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local13 != -1) {
						local15 += this.aByteArrayArray11[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}
}
