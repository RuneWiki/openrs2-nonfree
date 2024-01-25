import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class239 {

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "[B")
	private final byte[] aByteArray100;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
	public final int anInt7563;

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
	public final int anInt7559;

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
	public final int anInt7564;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "([B)V")
	public Class239(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub11 local8 = new Class2_Sub11(arg0);
		@Pc(12) int local12 = local8.method8383();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method8383() == 1;
		this.aByteArray100 = new byte[256];
		local8.method8385(0, 256, this.aByteArray100);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			@Pc(50) int[] local50 = new int[256];
			for (@Pc(52) int local52 = 0; local52 < 256; local52++) {
				local47[local52] = local8.method8383();
			}
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local50[local66] = local8.method8383();
			}
			@Pc(83) byte[][] local83 = new byte[256][];
			@Pc(98) int local98;
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				local83[local85] = new byte[local47[local85]];
				@Pc(96) byte local96 = 0;
				for (local98 = 0; local98 < local83[local85].length; local98++) {
					local96 += local8.method8384();
					local83[local85][local98] = local96;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local98 = 0; local98 < 256; local98++) {
				local131[local98] = new byte[local47[local98]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local98].length; local146++) {
					local144 += local8.method8384();
					local131[local98][local146] = local144;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray19[local183][local146] = (byte) Static345.method5924(this.aByteArray100, local146, local183, local83, local131, local50, local47);
						}
					}
				}
			}
			this.anInt7563 = local50[32] + local47[32];
		} else {
			this.anInt7563 = local8.method8383();
		}
		local8.method8383();
		local8.method8383();
		this.anInt7559 = local8.method8383();
		this.anInt7564 = local8.method8383();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([Lclient!mi;ILjava/lang/String;B)Ljava/lang/String;")
	public String method6480(@OriginalArg(0) Class46[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.method6485(arg2, arg0) <= arg1) {
			return arg2;
		}
		@Pc(26) int local26 = arg1 - this.method6485("...", null);
		@Pc(28) int local28 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg2.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg2.charAt(local44);
			if (local50 == '<') {
				local28 = local44;
			} else {
				if (local50 == '>' && local28 != -1) {
					@Pc(73) String local73 = arg2.substring(local28 + 1, local44);
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
							if (local73.startsWith("img=") && arg0 != null) {
								try {
									@Pc(129) int local129 = Static562.method8436(local73.substring(4));
									local35 = -1;
									local37 += arg0[local129].method6205();
									if (local37 > local26) {
										return local42 + "...";
									}
									local42 = arg2.substring(0, local44 + 1);
								} catch (@Pc(159) Exception local159) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local28 == -1) {
					local37 += this.aByteArray100[Static132.method3029(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local35 != -1) {
						local37 += this.aByteArrayArray19[local35][local50];
					}
					local35 = local50;
					@Pc(220) int local220 = local37;
					if (this.aByteArrayArray19 != null) {
						local220 = local37 + this.aByteArrayArray19[local50][46];
					}
					if (local220 > local26) {
						return local42 + "...";
					}
					local42 = arg2.substring(0, local44 + 1);
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IBC)I")
	public int method6481(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg0][arg1];
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method6482(@OriginalArg(1) String arg0) {
		return this.method6485(arg0, null);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)I")
	public int method6483(@OriginalArg(1) int arg0) {
		return this.aByteArray100[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([Lclient!mi;IIILjava/lang/String;)I")
	public int method6484(@OriginalArg(0) Class46[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt7563;
		}
		@Pc(22) int local22 = this.method6487(arg3, new int[] { arg2 }, Static456.aStringArray28, arg0);
		@Pc(28) int local28 = (local22 - 1) * arg1;
		return this.anInt7559 + local28 + this.anInt7564;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;[Lclient!mi;Z)I")
	public int method6485(@OriginalArg(0) String arg0, @OriginalArg(1) Class46[] arg1) {
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
					@Pc(57) String local57 = arg0.substring(local17 + 1, local26);
					local17 = -1;
					if (local57.equals("lt")) {
						local32 = '<';
					} else if (local57.equals("gt")) {
						local32 = '>';
					} else if (local57.equals("nbsp")) {
						local32 = ' ';
					} else if (local57.equals("shy")) {
						local32 = '\u00ad';
					} else if (local57.equals("times")) {
						local32 = '×';
					} else if (local57.equals("euro")) {
						local32 = '€';
					} else if (local57.equals("copy")) {
						local32 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=") && arg1 != null) {
								try {
									@Pc(115) int local115 = Static562.method8436(local57.substring(4));
									local19 = -1;
									local21 += arg1[local115].method6205();
								} catch (@Pc(126) Exception local126) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local17 == -1) {
					local21 += this.aByteArray100[Static132.method3029(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local19 != -1) {
						local21 += this.aByteArrayArray19[local19][local32];
					}
					local19 = local32;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;ZI[Lclient!mi;)I")
	public int method6486(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46[] arg2) {
		@Pc(18) int local18 = this.method6487(arg0, new int[] { arg1 }, Static456.aStringArray28, arg2);
		@Pc(20) int local20 = 0;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(38) int local38 = this.method6485(Static456.aStringArray28[local28], arg2);
			if (local38 > local20) {
				local20 = local38;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;B[Lclient!mi;)I")
	public int method6487(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) Class46[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = 0;
		@Pc(29) byte local29 = 0;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(50) int local50 = Static132.method3029(arg0.charAt(local40)) & 0xFF;
			@Pc(52) int local52 = 0;
			if (local50 == 60) {
				local31 = local40;
			} else {
				@Pc(69) int local69;
				if (local31 == -1) {
					local52 = this.method6483(local50);
					local69 = local40;
					if (this.aByteArrayArray19 != null && local33 != -1) {
						local52 += this.aByteArrayArray19[local33][local50];
					}
					local33 = local50;
				} else {
					if (local50 != 62) {
						continue;
					}
					local69 = local31;
					@Pc(76) String local76 = arg0.substring(local31 + 1, local40);
					local31 = -1;
					if (local76.equals("br")) {
						arg2[local35] = arg0.substring(local23, local40 + 1);
						local35++;
						if (arg2.length <= local35) {
							return 0;
						}
						local23 = local40 + 1;
						local33 = -1;
						local21 = 0;
						local25 = -1;
						continue;
					}
					if (local76.equals("lt")) {
						local52 = this.method6483(60);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][60];
						}
						local33 = 60;
					} else if (local76.equals("gt")) {
						local52 = this.method6483(62);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][62];
						}
						local33 = 62;
					} else if (local76.equals("nbsp")) {
						local52 = this.method6483(160);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][160];
						}
						local33 = 160;
					} else if (local76.equals("shy")) {
						local52 = this.method6483(173);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][173];
						}
						local33 = 173;
					} else if (local76.equals("times")) {
						local52 = this.method6483(215);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][215];
						}
						local33 = 215;
					} else if (local76.equals("euro")) {
						local52 = this.method6483(8364);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][8364];
						}
						local33 = 8364;
					} else if (local76.equals("copy")) {
						local52 = this.method6483(169);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][169];
						}
						local33 = 169;
					} else if (local76.equals("reg")) {
						local52 = this.method6483(174);
						if (this.aByteArrayArray19 != null && local33 != -1) {
							local52 += this.aByteArrayArray19[local33][174];
						}
						local33 = 174;
					} else if (local76.startsWith("img=") && arg3 != null) {
						try {
							@Pc(232) int local232 = Static562.method8436(local76.substring(4));
							local33 = -1;
							local52 = arg3[local232].method6205();
						} catch (@Pc(243) Exception local243) {
						}
					}
					local50 = -1;
				}
				if (local52 > 0) {
					local21 += local52;
					if (arg1 != null) {
						if (local50 == 32) {
							local29 = 1;
							local27 = local21;
							local25 = local40;
						}
						if (arg1[arg1.length > local35 ? local35 : arg1.length - 1] < local21) {
							if (local25 >= 0) {
								arg2[local35] = arg0.substring(local23, local25 + 1 - local29);
								local35++;
								if (local35 >= arg2.length) {
									return 0;
								}
								local23 = local25 + 1;
								local33 = -1;
								local25 = -1;
								local21 -= local27;
							} else {
								arg2[local35] = arg0.substring(local23, local69);
								local35++;
								if (arg2.length <= local35) {
									return 0;
								}
								local23 = local69;
								local33 = -1;
								local25 = -1;
								local21 = local52;
							}
						}
						if (local50 == 45) {
							local27 = local21;
							local25 = local40;
							local29 = 0;
						}
					}
				}
			}
		}
		if (local23 < arg0.length()) {
			arg2[local35] = arg0.substring(local23, arg0.length());
			local35++;
		}
		return local35;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([Lclient!mi;ILjava/lang/String;I)I")
	public int method6489(@OriginalArg(0) Class46[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return this.method6487(arg1, new int[] { arg2 }, Static456.aStringArray28, arg0);
	}
}
