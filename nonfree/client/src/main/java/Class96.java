import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class96 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public final int anInt2544;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public final int anInt2545;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public final int anInt2538;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V")
	public Class96(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg0);
		@Pc(12) int local12 = local8.method4487();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method4487() == 1;
		this.aByteArray33 = new byte[256];
		local8.method4505(this.aByteArray33, 256);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method4487();
			}
			@Pc(70) int[] local70 = new int[256];
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local70[local72] = local8.method4487();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method4482();
					local89[local91][local104] = local102;
				}
			}
			@Pc(133) byte[][] local133 = new byte[256][];
			@Pc(148) int local148;
			for (local104 = 0; local104 < 256; local104++) {
				local133[local104] = new byte[local53[local104]];
				@Pc(146) byte local146 = 0;
				for (local148 = 0; local148 < local133[local104].length; local148++) {
					local146 += local8.method4482();
					local133[local104][local148] = local146;
				}
			}
			this.aByteArrayArray11 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local148 = 0; local148 < 256; local148++) {
						if (local148 != 32 && local148 != 160) {
							this.aByteArrayArray11[local183][local148] = (byte) Static98.method2023(local70, local133, local89, local183, this.aByteArray33, local53, local148);
						}
					}
				}
			}
			this.anInt2544 = local70[32] + local53[32];
		} else {
			this.anInt2544 = local8.method4487();
		}
		local8.method4487();
		local8.method4487();
		this.anInt2545 = local8.method4487();
		this.anInt2538 = local8.method4487();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(CBI)I")
	public int method2365(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray11 == null ? 0 : this.aByteArrayArray11[arg1][arg0];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lclient!ha;ILjava/lang/String;)I")
	public int method2367(@OriginalArg(0) int arg0, @OriginalArg(1) Class104[] arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = this.method2371(arg2, Static113.aStringArray12, arg1, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(32) int local32 = 0; local32 < local18; local32++) {
			@Pc(42) int local42 = this.method2373(Static113.aStringArray12[local32], arg1);
			if (local42 > local20) {
				local20 = local42;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lclient!ha;IBLjava/lang/String;I)I")
	public int method2368(@OriginalArg(0) Class104[] arg0, @OriginalArg(3) String arg1) {
		@Pc(11) int local11 = this.anInt2544;
		@Pc(24) int local24 = this.method2371(arg1, Static113.aStringArray12, arg0, new int[] { 100 });
		@Pc(30) int local30 = local11 * (local24 - 1);
		return this.anInt2538 + this.anInt2545 + local30;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public int method2369(@OriginalArg(1) int arg0) {
		return this.aByteArray33[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2370(@OriginalArg(0) String arg0) {
		return this.method2373(arg0, null);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[Lclient!ha;B[I)I")
	public int method2371(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) Class104[] arg2, @OriginalArg(4) int[] arg3) {
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
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(46) int local46 = Static310.method5796(arg0.charAt(local30)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local21 = local30;
			} else {
				@Pc(67) int local67;
				if (local21 == -1) {
					local48 = this.method2369(local46);
					local67 = local30;
					if (this.aByteArrayArray11 != null && local23 != -1) {
						local48 += this.aByteArrayArray11[local23][local46];
					}
					local23 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local67 = local21;
					@Pc(74) String local74 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					if (local74.equals("br")) {
						arg1[local25] = arg0.substring(local13, local30 + 1);
						local25++;
						if (arg1.length <= local25) {
							return 0;
						}
						local13 = local30 + 1;
						local23 = -1;
						local11 = 0;
						local15 = -1;
						continue;
					}
					if (local74.equals("lt")) {
						local48 = this.method2369(60);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][60];
						}
						local23 = 60;
					} else if (local74.equals("gt")) {
						local48 = this.method2369(62);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][62];
						}
						local23 = 62;
					} else if (local74.equals("nbsp")) {
						local48 = this.method2369(160);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][160];
						}
						local23 = 160;
					} else if (local74.equals("shy")) {
						local48 = this.method2369(173);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][173];
						}
						local23 = 173;
					} else if (local74.equals("times")) {
						local48 = this.method2369(215);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][215];
						}
						local23 = 215;
					} else if (local74.equals("euro")) {
						local48 = this.method2369(8364);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][8364];
						}
						local23 = 8364;
					} else if (local74.equals("copy")) {
						local48 = this.method2369(169);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][169];
						}
						local23 = 169;
					} else if (local74.equals("reg")) {
						local48 = this.method2369(174);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local48 += this.aByteArrayArray11[local23][174];
						}
						local23 = 174;
					} else if (local74.startsWith("img=") && arg2 != null) {
						try {
							@Pc(206) int local206 = Static302.method8211(local74.substring(4));
							local23 = -1;
							local48 = arg2[local206].EA();
						} catch (@Pc(217) Exception local217) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg3 != null) {
						if (local46 == 32) {
							local17 = local11;
							local19 = 1;
							local15 = local30;
						}
						if (arg3[arg3.length > local25 ? local25 : arg3.length - 1] < local11) {
							if (local15 >= 0) {
								arg1[local25] = arg0.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local23 = -1;
								local11 -= local17;
							} else {
								arg1[local25] = arg0.substring(local13, local67);
								local25++;
								if (arg1.length <= local25) {
									return 0;
								}
								local23 = -1;
								local11 = local48;
								local15 = -1;
								local13 = local67;
							}
						}
						if (local46 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local30;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg1[local25] = arg0.substring(local13, arg0.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;[Lclient!ha;I)Ljava/lang/String;")
	public String method2372(@OriginalArg(1) String arg0, @OriginalArg(2) Class104[] arg1, @OriginalArg(3) int arg2) {
		if (this.method2373(arg0, arg1) <= arg2) {
			return arg0;
		}
		@Pc(22) int local22 = arg2 - this.method2373("...", null);
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		@Pc(33) String local33 = "";
		for (@Pc(44) int local44 = 0; local44 < local31; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local24 = local44;
			} else {
				if (local50 == '>' && local24 != -1) {
					@Pc(73) String local73 = arg0.substring(local24 + 1, local44);
					local24 = -1;
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
									@Pc(135) int local135 = Static302.method8211(local73.substring(4));
									local26 = -1;
									local28 += arg1[local135].EA();
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg0.substring(0, local44 + 1);
								} catch (@Pc(169) Exception local169) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray33[Static310.method5796(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local26 != -1) {
						local28 += this.aByteArrayArray11[local26][local50];
					}
					local26 = local50;
					@Pc(221) int local221 = local28;
					if (this.aByteArrayArray11 != null) {
						local221 = local28 + this.aByteArrayArray11[local50][46];
					}
					if (local22 < local221) {
						return local33 + "...";
					}
					local33 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;Z)I")
	public int method2373(@OriginalArg(0) String arg0, @OriginalArg(1) Class104[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local16 = local25;
			} else {
				if (local31 == '>' && local16 != -1) {
					@Pc(52) String local52 = arg0.substring(local16 + 1, local25);
					local16 = -1;
					if (local52.equals("lt")) {
						local31 = '<';
					} else if (local52.equals("gt")) {
						local31 = '>';
					} else if (local52.equals("nbsp")) {
						local31 = ' ';
					} else if (local52.equals("shy")) {
						local31 = '\u00ad';
					} else if (local52.equals("times")) {
						local31 = '×';
					} else if (local52.equals("euro")) {
						local31 = '€';
					} else if (local52.equals("copy")) {
						local31 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=") && arg1 != null) {
								try {
									@Pc(118) int local118 = Static302.method8211(local52.substring(4));
									local18 = -1;
									local20 += arg1[local118].EA();
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local16 == -1) {
					local20 += this.aByteArray33[Static310.method5796(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local18 != -1) {
						local20 += this.aByteArrayArray11[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Z[Lclient!ha;I)I")
	public int method2374(@OriginalArg(0) String arg0, @OriginalArg(2) Class104[] arg1, @OriginalArg(3) int arg2) {
		return this.method2371(arg0, Static113.aStringArray12, arg1, new int[] { arg2 });
	}
}
