import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class124 {

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "[B")
	private final byte[] aByteArray71;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
	public final int anInt3601;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public final int anInt3604;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public final int anInt3597;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "([B)V")
	public Class124(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(arg0);
		@Pc(12) int local12 = local8.method4096();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method4096() == 1;
		this.aByteArray71 = new byte[256];
		local8.method4118(this.aByteArray71, 256);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method4096();
			}
			@Pc(71) int[] local71 = new int[256];
			for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
				local71[local73] = local8.method4096();
			}
			@Pc(88) byte[][] local88 = new byte[256][];
			@Pc(103) int local103;
			for (@Pc(90) int local90 = 0; local90 < 256; local90++) {
				local88[local90] = new byte[local54[local90]];
				@Pc(101) byte local101 = 0;
				for (local103 = 0; local103 < local88[local90].length; local103++) {
					local101 += local8.method4097();
					local88[local90][local103] = local101;
				}
			}
			@Pc(138) byte[][] local138 = new byte[256][];
			@Pc(153) int local153;
			for (local103 = 0; local103 < 256; local103++) {
				local138[local103] = new byte[local54[local103]];
				@Pc(151) byte local151 = 0;
				for (local153 = 0; local153 < local138[local103].length; local153++) {
					local151 += local8.method4097();
					local138[local103][local153] = local151;
				}
			}
			this.aByteArrayArray16 = new byte[256][256];
			for (@Pc(190) int local190 = 0; local190 < 256; local190++) {
				if (local190 != 32 && local190 != 160) {
					for (local153 = 0; local153 < 256; local153++) {
						if (local153 != 32 && local153 != 160) {
							this.aByteArrayArray16[local190][local153] = (byte) Static328.method4556(local88, local138, local153, local54, this.aByteArray71, local190, local71);
						}
					}
				}
			}
			this.anInt3601 = local71[32] + local54[32];
		} else {
			this.anInt3601 = local8.method4096();
		}
		local8.method4096();
		local8.method4096();
		this.anInt3604 = local8.method4096();
		this.anInt3597 = local8.method4096();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)I")
	public int method3089(@OriginalArg(1) int arg0) {
		return this.aByteArray71[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBLjava/lang/String;I[Lclient!aa;)I")
	public int method3091(@OriginalArg(2) String arg0, @OriginalArg(4) Class2[] arg1) {
		@Pc(8) int local8 = this.anInt3601;
		@Pc(26) int local26 = this.method3100(arg1, Static255.aStringArray27, arg0, new int[] { 100 });
		@Pc(32) int local32 = (local26 - 1) * local8;
		return this.anInt3597 + local32 + this.anInt3604;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIC)I")
	public int method3092(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray16 == null ? 0 : this.aByteArrayArray16[arg0][arg1];
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILjava/lang/String;[Lclient!aa;I)Ljava/lang/String;")
	public String method3094(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class2[] arg2) {
		if (arg0 >= this.method3095(arg2, arg1)) {
			return arg1;
		}
		@Pc(22) int local22 = arg0 - this.method3095(null, "...");
		@Pc(24) int local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg1.length();
		@Pc(33) String local33 = "";
		for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
			@Pc(47) char local47 = arg1.charAt(local41);
			if (local47 == '<') {
				local24 = local41;
			} else {
				if (local47 == '>' && local24 != -1) {
					@Pc(69) String local69 = arg1.substring(local24 + 1, local41);
					local24 = -1;
					if (local69.equals("lt")) {
						local47 = '<';
					} else if (local69.equals("gt")) {
						local47 = '>';
					} else if (local69.equals("nbsp")) {
						local47 = ' ';
					} else if (local69.equals("shy")) {
						local47 = '\u00ad';
					} else if (local69.equals("times")) {
						local47 = '×';
					} else if (local69.equals("euro")) {
						local47 = '€';
					} else if (local69.equals("copy")) {
						local47 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=") && arg2 != null) {
								try {
									@Pc(123) int local123 = Static160.method2518(local69.substring(4));
									local28 += arg2[local123].d();
									local26 = -1;
									if (local22 < local28) {
										return local33 + "...";
									}
									local33 = arg1.substring(0, local41 + 1);
								} catch (@Pc(153) Exception local153) {
								}
							}
							continue;
						}
						local47 = '®';
					}
				}
				if (local24 == -1) {
					local28 += this.aByteArray71[Static456.method6227(local47) & 0xFF] & 0xFF;
					if (this.aByteArrayArray16 != null && local26 != -1) {
						local28 += this.aByteArrayArray16[local26][local47];
					}
					local26 = local47;
					@Pc(213) int local213 = local28;
					if (this.aByteArrayArray16 != null) {
						local213 = local28 + this.aByteArrayArray16[local47][46];
					}
					if (local22 < local213) {
						return local33 + "...";
					}
					local33 = arg1.substring(0, local41 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([Lclient!aa;Ljava/lang/String;I)I")
	public int method3095(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) char local26 = arg1.charAt(local20);
			if (local26 == '<') {
				local11 = local20;
			} else {
				if (local26 == '>' && local11 != -1) {
					@Pc(50) String local50 = arg1.substring(local11 + 1, local20);
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
							if (local50.startsWith("img=") && arg0 != null) {
								try {
									@Pc(122) int local122 = Static160.method2518(local50.substring(4));
									local15 += arg0[local122].d();
									local13 = -1;
								} catch (@Pc(133) Exception local133) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray71[Static456.method6227(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray16 != null && local13 != -1) {
						local15 += this.aByteArrayArray16[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([Lclient!aa;ILjava/lang/String;I)I")
	public int method3097(@OriginalArg(0) Class2[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method3100(arg0, Static255.aStringArray27, arg1, new int[] { arg2 });
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method3095(arg0, Static255.aStringArray27[local30]);
			if (local28 < local40) {
				local28 = local40;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[Lclient!aa;Ljava/lang/String;Z)I")
	public int method3098(@OriginalArg(0) int arg0, @OriginalArg(1) Class2[] arg1, @OriginalArg(2) String arg2) {
		return this.method3100(arg1, Static255.aStringArray27, arg2, new int[] { arg0 });
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3099(@OriginalArg(1) String arg0) {
		return this.method3095(null, arg0);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([Lclient!aa;[Ljava/lang/String;Ljava/lang/String;[IB)I")
	public int method3100(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 == null) {
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
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static456.method6227(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(62) int local62;
				if (local26 == -1) {
					local62 = local35;
					local47 = this.method3089(local45);
					if (this.aByteArrayArray16 != null && local28 != -1) {
						local47 += this.aByteArrayArray16[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local62 = local26;
					@Pc(102) String local102 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local102.equals("br")) {
						arg1[local30] = arg2.substring(local13, local35 + 1);
						local30++;
						if (arg1.length <= local30) {
							return 0;
						}
						local28 = -1;
						local20 = -1;
						local13 = local35 + 1;
						local11 = 0;
						continue;
					}
					if (local102.equals("lt")) {
						local47 = this.method3089(60);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][60];
						}
						local28 = 60;
					} else if (local102.equals("gt")) {
						local47 = this.method3089(62);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][62];
						}
						local28 = 62;
					} else if (local102.equals("nbsp")) {
						local47 = this.method3089(160);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][160];
						}
						local28 = 160;
					} else if (local102.equals("shy")) {
						local47 = this.method3089(173);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][173];
						}
						local28 = 173;
					} else if (local102.equals("times")) {
						local47 = this.method3089(215);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][215];
						}
						local28 = 215;
					} else if (local102.equals("euro")) {
						local47 = this.method3089(8364);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][8364];
						}
						local28 = 8364;
					} else if (local102.equals("copy")) {
						local47 = this.method3089(169);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][169];
						}
						local28 = 169;
					} else if (local102.equals("reg")) {
						local47 = this.method3089(174);
						if (this.aByteArrayArray16 != null && local28 != -1) {
							local47 += this.aByteArrayArray16[local28][174];
						}
						local28 = 174;
					} else if (local102.startsWith("img=") && arg0 != null) {
						try {
							@Pc(260) int local260 = Static160.method2518(local102.substring(4));
							local47 = arg0[local260].d();
							local28 = -1;
						} catch (@Pc(271) Exception local271) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local22 = local11;
							local20 = local35;
							local24 = 1;
						}
						if (arg3[local30 >= arg3.length ? arg3.length - 1 : local30] < local11) {
							if (local20 >= 0) {
								arg1[local30] = arg2.substring(local13, local20 + 1 - local24);
								local30++;
								if (arg1.length <= local30) {
									return 0;
								}
								local13 = local20 + 1;
								local11 -= local22;
								local28 = -1;
								local20 = -1;
							} else {
								arg1[local30] = arg2.substring(local13, local62);
								local30++;
								if (arg1.length <= local30) {
									return 0;
								}
								local28 = -1;
								local13 = local62;
								local11 = local47;
								local20 = -1;
							}
						}
						if (local45 == 45) {
							local22 = local11;
							local24 = 0;
							local20 = local35;
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
}
