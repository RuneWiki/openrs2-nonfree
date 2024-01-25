import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class114 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
	public final int anInt3290;

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
	public final int anInt3289;

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
	public final int anInt3291;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "([B)V")
	public Class114(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = local8.method4905();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method4905() == 1;
		this.aByteArray32 = new byte[256];
		local8.method4926(256, this.aByteArray32);
		if (local28) {
			@Pc(51) int[] local51 = new int[256];
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local51[local56] = local8.method4905();
			}
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local54[local70] = local8.method4905();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local51[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method4925();
					local85[local87][local100] = local98;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local100 = 0; local100 < 256; local100++) {
				local131[local100] = new byte[local51[local100]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local100].length; local146++) {
					local144 += local8.method4925();
					local131[local100][local146] = local144;
				}
			}
			this.aByteArrayArray11 = new byte[256][256];
			for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
				if (local185 != 32 && local185 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray11[local185][local146] = (byte) Static364.method5860(local54, local85, local146, local185, local131, local51, this.aByteArray32);
						}
					}
				}
			}
			this.anInt3290 = local54[32] + local51[32];
		} else {
			this.anInt3290 = local8.method4905();
		}
		local8.method4905();
		local8.method4905();
		this.anInt3289 = local8.method4905();
		this.anInt3291 = local8.method4905();
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)I")
	public int method2944(@OriginalArg(0) int arg0) {
		return this.aByteArray32[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BCI)I")
	public int method2946(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray11 == null ? 0 : this.aByteArrayArray11[arg1][arg0];
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[Lclient!f;[IB)I")
	public int method2947(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) Class78[] arg2, @OriginalArg(3) int[] arg3) {
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
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static558.method8030(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(66) int local66;
				if (local21 == -1) {
					local47 = this.method2944(local45);
					local66 = local35;
					if (this.aByteArrayArray11 != null && local23 != -1) {
						local47 += this.aByteArrayArray11[local23][local45];
					}
					local23 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local66 = local21;
					@Pc(97) String local97 = arg0.substring(local21 + 1, local35);
					local21 = -1;
					if (local97.equals("br")) {
						arg1[local30] = arg0.substring(local13, local35 + 1);
						local30++;
						if (arg1.length <= local30) {
							return 0;
						}
						local23 = -1;
						local11 = 0;
						local15 = -1;
						local13 = local35 + 1;
						continue;
					}
					if (local97.equals("lt")) {
						local47 = this.method2944(60);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][60];
						}
						local23 = 60;
					} else if (local97.equals("gt")) {
						local47 = this.method2944(62);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][62];
						}
						local23 = 62;
					} else if (local97.equals("nbsp")) {
						local47 = this.method2944(160);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][160];
						}
						local23 = 160;
					} else if (local97.equals("shy")) {
						local47 = this.method2944(173);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][173];
						}
						local23 = 173;
					} else if (local97.equals("times")) {
						local47 = this.method2944(215);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][215];
						}
						local23 = 215;
					} else if (local97.equals("euro")) {
						local47 = this.method2944(8364);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][8364];
						}
						local23 = 8364;
					} else if (local97.equals("copy")) {
						local47 = this.method2944(169);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][169];
						}
						local23 = 169;
					} else if (local97.equals("reg")) {
						local47 = this.method2944(174);
						if (this.aByteArrayArray11 != null && local23 != -1) {
							local47 += this.aByteArrayArray11[local23][174];
						}
						local23 = 174;
					} else if (local97.startsWith("img=") && arg2 != null) {
						try {
							@Pc(308) int local308 = Static82.method1379(local97.substring(4));
							local23 = -1;
							local47 = arg2[local308].A();
						} catch (@Pc(319) Exception local319) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local19 = 1;
							local15 = local35;
							local17 = local11;
						}
						if (arg3[arg3.length <= local30 ? arg3.length - 1 : local30] < local11) {
							if (local15 >= 0) {
								arg1[local30] = arg0.substring(local13, local15 + 1 - local19);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local23 = -1;
								local11 -= local17;
							} else {
								arg1[local30] = arg0.substring(local13, local66);
								local30++;
								if (local30 >= arg1.length) {
									return 0;
								}
								local13 = local66;
								local15 = -1;
								local11 = local47;
								local23 = -1;
							}
						}
						if (local45 == 45) {
							local15 = local35;
							local19 = 0;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg0.length()) {
			arg1[local30] = arg0.substring(local13, arg0.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I[Lclient!f;Ljava/lang/String;Z)I")
	public int method2948(@OriginalArg(0) int arg0, @OriginalArg(1) Class78[] arg1, @OriginalArg(2) String arg2) {
		@Pc(23) int local23 = this.method2947(arg2, Static428.aStringArray57, arg1, new int[] { arg0 });
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local23; local27++) {
			@Pc(37) int local37 = this.method2949(Static428.aStringArray57[local27], arg1);
			if (local25 < local37) {
				local25 = local37;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!f;)I")
	public int method2949(@OriginalArg(0) String arg0, @OriginalArg(2) Class78[] arg1) {
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
					@Pc(48) String local48 = arg0.substring(local11 + 1, local20);
					local11 = -1;
					if (local48.equals("lt")) {
						local26 = '<';
					} else if (local48.equals("gt")) {
						local26 = '>';
					} else if (local48.equals("nbsp")) {
						local26 = ' ';
					} else if (local48.equals("shy")) {
						local26 = '\u00ad';
					} else if (local48.equals("times")) {
						local26 = '×';
					} else if (local48.equals("euro")) {
						local26 = '€';
					} else if (local48.equals("copy")) {
						local26 = '©';
					} else {
						if (!local48.equals("reg")) {
							if (local48.startsWith("img=") && arg1 != null) {
								try {
									@Pc(120) int local120 = Static82.method1379(local48.substring(4));
									local15 += arg1[local120].A();
									local13 = -1;
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray32[Static558.method8030(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local13 != -1) {
						local15 += this.aByteArrayArray11[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method2950(@OriginalArg(0) String arg0) {
		return this.method2949(arg0, null);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!f;)I")
	public int method2951(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78[] arg2) {
		return this.method2947(arg0, Static428.aStringArray57, arg2, new int[] { arg1 });
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILjava/lang/String;[Lclient!f;I)I")
	public int method2952(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class78[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt3290;
		}
		@Pc(21) int local21 = this.method2947(arg1, Static428.aStringArray57, arg2, new int[] { arg0 });
		@Pc(27) int local27 = arg3 * (local21 - 1);
		return this.anInt3291 + local27 + this.anInt3289;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;II)Ljava/lang/String;")
	public String method2953(@OriginalArg(0) String arg0, @OriginalArg(1) Class78[] arg1, @OriginalArg(3) int arg2) {
		if (this.method2949(arg0, arg1) <= arg2) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method2949("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(69) String local69 = arg0.substring(local28 + 1, local39);
					local28 = -1;
					if (local69.equals("lt")) {
						local45 = '<';
					} else if (local69.equals("gt")) {
						local45 = '>';
					} else if (local69.equals("nbsp")) {
						local45 = ' ';
					} else if (local69.equals("shy")) {
						local45 = '\u00ad';
					} else if (local69.equals("times")) {
						local45 = '×';
					} else if (local69.equals("euro")) {
						local45 = '€';
					} else if (local69.equals("copy")) {
						local45 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=") && arg1 != null) {
								try {
									@Pc(135) int local135 = Static82.method1379(local69.substring(4));
									local30 = -1;
									local32 += arg1[local135].A();
									if (local32 > local26) {
										return local37 + "...";
									}
									local37 = arg0.substring(0, local39 + 1);
								} catch (@Pc(169) Exception local169) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray32[Static558.method8030(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray11 != null && local30 != -1) {
						local32 += this.aByteArrayArray11[local30][local45];
					}
					local30 = local45;
					@Pc(217) int local217 = local32;
					if (this.aByteArrayArray11 != null) {
						local217 = local32 + this.aByteArrayArray11[local45][46];
					}
					if (local217 > local26) {
						return local37 + "...";
					}
					local37 = arg0.substring(0, local39 + 1);
				}
			}
		}
		return arg0;
	}
}
