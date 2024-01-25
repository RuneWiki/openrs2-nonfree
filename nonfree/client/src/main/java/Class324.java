import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class324 {

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public final int anInt9270;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	public final int anInt9272;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	public final int anInt9271;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([B)V")
	public Class324(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub8 local8 = new Class2_Sub8(arg0);
		@Pc(12) int local12 = local8.method5203();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5203() == 1;
		this.aByteArray82 = new byte[256];
		local8.method5176(this.aByteArray82, 0, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method5203();
			}
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local49[local67] = local8.method5203();
			}
			@Pc(84) byte[][] local84 = new byte[256][];
			@Pc(99) int local99;
			for (@Pc(86) int local86 = 0; local86 < 256; local86++) {
				local84[local86] = new byte[local46[local86]];
				@Pc(97) byte local97 = 0;
				for (local99 = 0; local99 < local84[local86].length; local99++) {
					local97 += local8.method5175();
					local84[local86][local99] = local97;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(143) int local143;
			for (local99 = 0; local99 < 256; local99++) {
				local128[local99] = new byte[local46[local99]];
				@Pc(141) byte local141 = 0;
				for (local143 = 0; local143 < local128[local99].length; local143++) {
					local141 += local8.method5175();
					local128[local99][local143] = local141;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
				if (local182 != 32 && local182 != 160) {
					for (local143 = 0; local143 < 256; local143++) {
						if (local143 != 32 && local143 != 160) {
							this.aByteArrayArray19[local182][local143] = (byte) Static235.method4258(this.aByteArray82, local84, local46, local143, local49, local182, local128);
						}
					}
				}
			}
			this.anInt9270 = local46[32] + local49[32];
		} else {
			this.anInt9270 = local8.method5203();
		}
		local8.method5203();
		local8.method5203();
		this.anInt9272 = local8.method5203();
		this.anInt9271 = local8.method5203();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)I")
	public int method8176(@OriginalArg(0) int arg0) {
		return this.aByteArray82[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;[Lclient!mq;I)I")
	public int method8177(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class71[] arg2) {
		@Pc(18) int local18 = this.method8186(Static150.aStringArray13, arg2, arg1, new int[] { arg0 });
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method8179(Static150.aStringArray13[local30], arg2);
			if (local20 < local40) {
				local20 = local40;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!mq;I)I")
	public int method8178(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class71[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt9270;
		}
		@Pc(24) int local24 = this.method8186(Static150.aStringArray13, arg2, arg1, new int[] { arg0 });
		@Pc(30) int local30 = (local24 - 1) * arg3;
		return this.anInt9271 + this.anInt9272 + local30;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;[Lclient!mq;Z)I")
	public int method8179(@OriginalArg(0) String arg0, @OriginalArg(1) Class71[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg0.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(32) char local32 = arg0.charAt(local27);
			if (local32 == '<') {
				local18 = local27;
			} else {
				if (local32 == '>' && local18 != -1) {
					@Pc(51) String local51 = arg0.substring(local18 + 1, local27);
					local18 = -1;
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
									@Pc(110) int local110 = Static77.method1385(local51.substring(4));
									local20 = -1;
									local22 += arg1[local110].method7709();
								} catch (@Pc(121) Exception local121) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local18 == -1) {
					local22 += this.aByteArray82[Static131.method2331(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local20 != -1) {
						local22 += this.aByteArrayArray19[local20][local32];
					}
					local20 = local32;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method8181(@OriginalArg(0) String arg0) {
		return this.method8179(arg0, (Class71[]) null);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ICI)I")
	public int method8182(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg0][arg1];
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(ILjava/lang/String;[Lclient!mq;I)I")
	public int method8183(@OriginalArg(1) String arg0, @OriginalArg(2) Class71[] arg1, @OriginalArg(3) int arg2) {
		return this.method8186(Static150.aStringArray13, arg1, arg0, new int[] { arg2 });
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;[Lclient!mq;BI)Ljava/lang/String;")
	public String method8184(@OriginalArg(0) String arg0, @OriginalArg(1) Class71[] arg1, @OriginalArg(3) int arg2) {
		if (this.method8179(arg0, arg1) <= arg2) {
			return arg0;
		}
		@Pc(31) int local31 = arg2 - this.method8179("...", (Class71[]) null);
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local33 = local44;
			} else {
				if (local50 == '>' && local33 != -1) {
					@Pc(70) String local70 = arg0.substring(local33 + 1, local44);
					local33 = -1;
					if (local70.equals("lt")) {
						local50 = '<';
					} else if (local70.equals("gt")) {
						local50 = '>';
					} else if (local70.equals("nbsp")) {
						local50 = ' ';
					} else if (local70.equals("shy")) {
						local50 = '\u00ad';
					} else if (local70.equals("times")) {
						local50 = '×';
					} else if (local70.equals("euro")) {
						local50 = '€';
					} else if (local70.equals("copy")) {
						local50 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg1 != null) {
								try {
									@Pc(132) int local132 = Static77.method1385(local70.substring(4));
									local35 = -1;
									local37 += arg1[local132].method7709();
									if (local31 < local37) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(162) Exception local162) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local33 == -1) {
					local37 += this.aByteArray82[Static131.method2331(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local35 != -1) {
						local37 += this.aByteArrayArray19[local35][local50];
					}
					local35 = local50;
					@Pc(214) int local214 = local37;
					if (this.aByteArrayArray19 != null) {
						local214 = local37 + this.aByteArrayArray19[local50][46];
					}
					if (local214 > local31) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "([Ljava/lang/String;[Lclient!mq;Ljava/lang/String;[IB)I")
	public int method8186(@OriginalArg(0) String[] arg0, @OriginalArg(1) Class71[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 == null) {
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
		@Pc(33) int local33 = arg2.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static131.method2331(arg2.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(69) int local69;
				if (local26 == -1) {
					local47 = this.method8176(local45);
					local69 = local35;
					if (this.aByteArrayArray19 != null && local28 != -1) {
						local47 += this.aByteArrayArray19[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local69 = local26;
					@Pc(102) String local102 = arg2.substring(local26 + 1, local35);
					local26 = -1;
					if (local102.equals("br")) {
						arg0[local30] = arg2.substring(local18, local35 + 1);
						local30++;
						if (local30 >= arg0.length) {
							return 0;
						}
						local20 = -1;
						local16 = 0;
						local28 = -1;
						local18 = local35 + 1;
						continue;
					}
					if (local102.equals("lt")) {
						local47 = this.method8176(60);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][60];
						}
						local28 = 60;
					} else if (local102.equals("gt")) {
						local47 = this.method8176(62);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][62];
						}
						local28 = 62;
					} else if (local102.equals("nbsp")) {
						local47 = this.method8176(160);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][160];
						}
						local28 = 160;
					} else if (local102.equals("shy")) {
						local47 = this.method8176(173);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][173];
						}
						local28 = 173;
					} else if (local102.equals("times")) {
						local47 = this.method8176(215);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][215];
						}
						local28 = 215;
					} else if (local102.equals("euro")) {
						local47 = this.method8176(8364);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][8364];
						}
						local28 = 8364;
					} else if (local102.equals("copy")) {
						local47 = this.method8176(169);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][169];
						}
						local28 = 169;
					} else if (local102.equals("reg")) {
						local47 = this.method8176(174);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][174];
						}
						local28 = 174;
					} else if (local102.startsWith("img=") && arg1 != null) {
						try {
							@Pc(259) int local259 = Static77.method1385(local102.substring(4));
							local28 = -1;
							local47 = arg1[local259].method7709();
						} catch (@Pc(270) Exception local270) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg3 != null) {
						if (local45 == 32) {
							local24 = 1;
							local20 = local35;
							local22 = local16;
						}
						if (arg3[local30 < arg3.length ? local30 : arg3.length - 1] < local16) {
							if (local20 >= 0) {
								arg0[local30] = arg2.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg0.length) {
									return 0;
								}
								local18 = local20 + 1;
								local16 -= local22;
								local20 = -1;
								local28 = -1;
							} else {
								arg0[local30] = arg2.substring(local18, local69);
								local30++;
								if (arg0.length <= local30) {
									return 0;
								}
								local20 = -1;
								local28 = -1;
								local18 = local69;
								local16 = local47;
							}
						}
						if (local45 == 45) {
							local20 = local35;
							local24 = 0;
							local22 = local16;
						}
					}
				}
			}
		}
		if (arg2.length() > local18) {
			arg0[local30] = arg2.substring(local18, arg2.length());
			local30++;
		}
		return local30;
	}
}
