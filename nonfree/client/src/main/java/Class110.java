import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class110 {

	@OriginalMember(owner = "client!is", name = "l", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	public final int anInt2954;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "I")
	public final int anInt2963;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public final int anInt2957;

	static {
		new Class169("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "([B)V")
	public Class110(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		@Pc(12) int local12 = local8.method5174();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method5174() == 1;
		this.aByteArray57 = new byte[256];
		local8.method5135(256, this.aByteArray57);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method5174();
			}
			@Pc(73) int[] local73 = new int[256];
			for (@Pc(75) int local75 = 0; local75 < 256; local75++) {
				local73[local75] = local8.method5174();
			}
			@Pc(92) byte[][] local92 = new byte[256][];
			@Pc(107) int local107;
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				local92[local94] = new byte[local54[local94]];
				@Pc(105) byte local105 = 0;
				for (local107 = 0; local107 < local92[local94].length; local107++) {
					local105 += local8.method5188();
					local92[local94][local107] = local105;
				}
			}
			@Pc(136) byte[][] local136 = new byte[256][];
			@Pc(151) int local151;
			for (local107 = 0; local107 < 256; local107++) {
				local136[local107] = new byte[local54[local107]];
				@Pc(149) byte local149 = 0;
				for (local151 = 0; local151 < local136[local107].length; local151++) {
					local149 += local8.method5188();
					local136[local107][local151] = local149;
				}
			}
			this.aByteArrayArray7 = new byte[256][256];
			for (@Pc(186) int local186 = 0; local186 < 256; local186++) {
				if (local186 != 32 && local186 != 160) {
					for (local151 = 0; local151 < 256; local151++) {
						if (local151 != 32 && local151 != 160) {
							this.aByteArrayArray7[local186][local151] = (byte) Static30.method5578(local136, local73, local54, local92, this.aByteArray57, local151, local186);
						}
					}
				}
			}
			this.anInt2954 = local73[32] + local54[32];
		} else {
			this.anInt2954 = local8.method5174();
		}
		local8.method5174();
		local8.method5174();
		this.anInt2963 = local8.method5174();
		this.anInt2957 = local8.method5174();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!dp;I)I")
	public int method2411(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51[] arg2) {
		@Pc(18) int local18 = this.method2414(arg0, arg2, Static218.aStringArray53, new int[] { arg1 });
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(32) int local32 = this.method2412(Static218.aStringArray53[local22], arg2);
			if (local32 > local20) {
				local20 = local32;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;[Lclient!dp;I)I")
	public int method2412(@OriginalArg(0) String arg0, @OriginalArg(1) Class51[] arg1) {
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
									@Pc(120) int local120 = Static147.method2202(local52.substring(4));
									local18 = -1;
									local20 += arg1[local120].method4682();
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local16 == -1) {
					local20 += this.aByteArray57[Static158.method2162(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray7 != null && local18 != -1) {
						local20 += this.aByteArrayArray7[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2413(@OriginalArg(0) String arg0) {
		return this.method2412(arg0, null);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!dp;[Ljava/lang/String;[I)I")
	public int method2414(@OriginalArg(0) String arg0, @OriginalArg(2) Class51[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static158.method2162(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(60) int local60;
				if (local26 == -1) {
					local60 = local35;
					local47 = this.method2419(local45);
					if (this.aByteArrayArray7 != null && local28 != -1) {
						local47 += this.aByteArrayArray7[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local60 = local26;
					@Pc(101) String local101 = arg0.substring(local26 + 1, local35);
					local26 = -1;
					if (local101.equals("br")) {
						arg2[local30] = arg0.substring(local18, local35 + 1);
						local30++;
						if (local30 >= arg2.length) {
							return 0;
						}
						local20 = -1;
						local16 = 0;
						local28 = -1;
						local18 = local35 + 1;
						continue;
					}
					if (local101.equals("lt")) {
						local47 = this.method2419(60);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][60];
						}
						local28 = 60;
					} else if (local101.equals("gt")) {
						local47 = this.method2419(62);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][62];
						}
						local28 = 62;
					} else if (local101.equals("nbsp")) {
						local47 = this.method2419(160);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][160];
						}
						local28 = 160;
					} else if (local101.equals("shy")) {
						local47 = this.method2419(173);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][173];
						}
						local28 = 173;
					} else if (local101.equals("times")) {
						local47 = this.method2419(215);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][215];
						}
						local28 = 215;
					} else if (local101.equals("euro")) {
						local47 = this.method2419(8364);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][8364];
						}
						local28 = 8364;
					} else if (local101.equals("copy")) {
						local47 = this.method2419(169);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][169];
						}
						local28 = 169;
					} else if (local101.equals("reg")) {
						local47 = this.method2419(174);
						if (this.aByteArrayArray7 != null && local28 != -1) {
							local47 += this.aByteArrayArray7[local28][174];
						}
						local28 = 174;
					} else if (local101.startsWith("img=") && arg1 != null) {
						try {
							@Pc(316) int local316 = Static147.method2202(local101.substring(4));
							local47 = arg1[local316].method4682();
							local28 = -1;
						} catch (@Pc(327) Exception local327) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local22 = local16;
							local24 = 1;
							local20 = local35;
						}
						if (local16 > arg3[arg3.length <= local30 ? arg3.length - 1 : local30]) {
							if (local20 < 0) {
								arg2[local30] = arg0.substring(local18, local60);
								local30++;
								if (local30 >= arg2.length) {
									return 0;
								}
								local20 = -1;
								local16 = local47;
								local28 = -1;
								local18 = local60;
							} else {
								arg2[local30] = arg0.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg2.length) {
									return 0;
								}
								local18 = local20 + 1;
								local28 = -1;
								local16 -= local22;
								local20 = -1;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local20 = local35;
							local22 = local16;
						}
					}
				}
			}
		}
		if (arg0.length() > local18) {
			arg2[local30] = arg0.substring(local18, arg0.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I[Lclient!dp;ILjava/lang/String;)I")
	public int method2415(@OriginalArg(1) Class51[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return this.method2414(arg2, arg0, Static218.aStringArray53, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!dp;II)I")
	public int method2417(@OriginalArg(0) String arg0, @OriginalArg(2) Class51[] arg1) {
		@Pc(11) int local11 = this.anInt2954;
		@Pc(24) int local24 = this.method2414(arg0, arg1, Static218.aStringArray53, new int[] { 100 });
		@Pc(30) int local30 = (local24 - 1) * local11;
		return this.anInt2963 + local30 + this.anInt2957;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public int method2419(@OriginalArg(0) int arg0) {
		return this.aByteArray57[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(CII)I")
	public int method2420(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray7 == null ? 0 : this.aByteArrayArray7[arg1][arg0];
	}
}
