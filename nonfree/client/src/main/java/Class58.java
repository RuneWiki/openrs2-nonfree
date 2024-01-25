import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class58 {

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
	public final int anInt2033;

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
	public final int anInt2039;

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
	public final int anInt2031;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "([B)V")
	public Class58(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		@Pc(12) int local12 = local8.method3118();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method3118() == 1;
		this.aByteArray19 = new byte[256];
		local8.method3090(256, this.aByteArray19);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method3118();
			}
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local49[local67] = local8.method3118();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method3096();
					local82[local84][local97] = local95;
				}
			}
			@Pc(126) byte[][] local126 = new byte[256][];
			@Pc(141) int local141;
			for (local97 = 0; local97 < 256; local97++) {
				local126[local97] = new byte[local46[local97]];
				@Pc(139) byte local139 = 0;
				for (local141 = 0; local141 < local126[local97].length; local141++) {
					local139 += local8.method3096();
					local126[local97][local141] = local139;
				}
			}
			this.aByteArrayArray5 = new byte[256][256];
			for (@Pc(180) int local180 = 0; local180 < 256; local180++) {
				if (local180 != 32 && local180 != 160) {
					for (local141 = 0; local141 < 256; local141++) {
						if (local141 != 32 && local141 != 160) {
							this.aByteArrayArray5[local180][local141] = (byte) Static226.method3889(local180, local82, this.aByteArray19, local46, local49, local141, local126);
						}
					}
				}
			}
			this.anInt2033 = local46[32] + local49[32];
		} else {
			this.anInt2033 = local8.method3118();
		}
		local8.method3118();
		local8.method3118();
		this.anInt2039 = local8.method3118();
		this.anInt2031 = local8.method3118();
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;II)I")
	public int method1766(@OriginalArg(0) String arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(3) int arg2) {
		@Pc(24) int local24 = this.method1778(Static65.aStringArray8, new int[] { arg2 }, arg1, arg0);
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(38) int local38 = this.method1776(Static65.aStringArray8[local28], arg1);
			if (local38 > local26) {
				local26 = local38;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1767(@OriginalArg(0) String arg0) {
		return this.method1776(arg0, null);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([Lclient!f;ILjava/lang/String;I)Ljava/lang/String;")
	public String method1768(@OriginalArg(0) Class46[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.method1776(arg1, arg0) <= arg2) {
			return arg1;
		}
		@Pc(26) int local26 = arg2 - this.method1776("...", null);
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg1.length();
		@Pc(37) String local37 = "";
		for (@Pc(39) int local39 = 0; local39 < local35; local39++) {
			@Pc(45) char local45 = arg1.charAt(local39);
			if (local45 == '<') {
				local28 = local39;
			} else {
				if (local45 == '>' && local28 != -1) {
					@Pc(68) String local68 = arg1.substring(local28 + 1, local39);
					local28 = -1;
					if (local68.equals("lt")) {
						local45 = '<';
					} else if (local68.equals("gt")) {
						local45 = '>';
					} else if (local68.equals("nbsp")) {
						local45 = ' ';
					} else if (local68.equals("shy")) {
						local45 = '\u00ad';
					} else if (local68.equals("times")) {
						local45 = '×';
					} else if (local68.equals("euro")) {
						local45 = '€';
					} else if (local68.equals("copy")) {
						local45 = '©';
					} else {
						if (!local68.equals("reg")) {
							if (local68.startsWith("img=") && arg0 != null) {
								try {
									@Pc(132) int local132 = Static118.method2472(local68.substring(4));
									local32 += arg0[local132].A();
									local30 = -1;
									if (local32 > local26) {
										return local37 + "...";
									}
									local37 = arg1.substring(0, local39 + 1);
								} catch (@Pc(166) Exception local166) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray19[Static579.method7686(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local30 != -1) {
						local32 += this.aByteArrayArray5[local30][local45];
					}
					local30 = local45;
					@Pc(217) int local217 = local32;
					if (this.aByteArrayArray5 != null) {
						local217 = local32 + this.aByteArrayArray5[local45][46];
					}
					if (local26 < local217) {
						return local37 + "...";
					}
					local37 = arg1.substring(0, local39 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(IZ)I")
	public int method1769(@OriginalArg(0) int arg0) {
		return this.aByteArray19[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;IIB[Lclient!f;)I")
	public int method1771(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class46[] arg3) {
		if (arg2 == 0) {
			arg2 = this.anInt2033;
		}
		@Pc(21) int local21 = this.method1778(Static65.aStringArray8, new int[] { arg1 }, arg3, arg0);
		@Pc(32) int local32 = (local21 - 1) * arg2;
		return this.anInt2039 + local32 + this.anInt2031;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ICI)I")
	public int method1772(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray5 == null ? 0 : this.aByteArrayArray5[arg1][arg0];
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILjava/lang/String;[Lclient!f;I)I")
	public int method1775(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class46[] arg2) {
		return this.method1778(Static65.aStringArray8, new int[] { arg0 }, arg2, arg1);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!f;)I")
	public int method1776(@OriginalArg(0) String arg0, @OriginalArg(2) Class46[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(36) char local36 = arg0.charAt(local30);
			if (local36 == '<') {
				local11 = local30;
			} else {
				if (local36 == '>' && local11 != -1) {
					@Pc(60) String local60 = arg0.substring(local11 + 1, local30);
					local11 = -1;
					if (local60.equals("lt")) {
						local36 = '<';
					} else if (local60.equals("gt")) {
						local36 = '>';
					} else if (local60.equals("nbsp")) {
						local36 = ' ';
					} else if (local60.equals("shy")) {
						local36 = '\u00ad';
					} else if (local60.equals("times")) {
						local36 = '×';
					} else if (local60.equals("euro")) {
						local36 = '€';
					} else if (local60.equals("copy")) {
						local36 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=") && arg1 != null) {
								try {
									@Pc(120) int local120 = Static118.method2472(local60.substring(4));
									local13 = -1;
									local15 += arg1[local120].A();
								} catch (@Pc(131) Exception local131) {
								}
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray19[Static579.method7686(local36) & 0xFF] & 0xFF;
					if (this.aByteArrayArray5 != null && local13 != -1) {
						local15 += this.aByteArrayArray5[local13][local36];
					}
					local13 = local36;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([Ljava/lang/String;B[I[Lclient!f;Ljava/lang/String;)I")
	public int method1778(@OriginalArg(0) String[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class46[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg3.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static579.method7686(arg3.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(63) int local63;
				if (local26 == -1) {
					local47 = this.method1769(local45);
					local63 = local35;
					if (this.aByteArrayArray5 != null && local28 != -1) {
						local47 += this.aByteArrayArray5[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local63 = local26;
					@Pc(70) String local70 = arg3.substring(local26 + 1, local35);
					local26 = -1;
					if (local70.equals("br")) {
						arg0[local30] = arg3.substring(local13, local35 + 1);
						local30++;
						if (local30 >= arg0.length) {
							return 0;
						}
						local13 = local35 + 1;
						local15 = -1;
						local11 = 0;
						local28 = -1;
						continue;
					}
					if (local70.equals("lt")) {
						local47 = this.method1769(60);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][60];
						}
						local28 = 60;
					} else if (local70.equals("gt")) {
						local47 = this.method1769(62);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][62];
						}
						local28 = 62;
					} else if (local70.equals("nbsp")) {
						local47 = this.method1769(160);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][160];
						}
						local28 = 160;
					} else if (local70.equals("shy")) {
						local47 = this.method1769(173);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][173];
						}
						local28 = 173;
					} else if (local70.equals("times")) {
						local47 = this.method1769(215);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][215];
						}
						local28 = 215;
					} else if (local70.equals("euro")) {
						local47 = this.method1769(8364);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][8364];
						}
						local28 = 8364;
					} else if (local70.equals("copy")) {
						local47 = this.method1769(169);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][169];
						}
						local28 = 169;
					} else if (local70.equals("reg")) {
						local47 = this.method1769(174);
						if (this.aByteArrayArray5 != null && local28 != -1) {
							local47 += this.aByteArrayArray5[local28][174];
						}
						local28 = 174;
					} else if (local70.startsWith("img=") && arg2 != null) {
						try {
							@Pc(279) int local279 = Static118.method2472(local70.substring(4));
							local47 = arg2[local279].A();
							local28 = -1;
						} catch (@Pc(290) Exception local290) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local22 = local11;
							local24 = 1;
							local15 = local35;
						}
						if (local11 > arg1[local30 >= arg1.length ? arg1.length - 1 : local30]) {
							if (local15 >= 0) {
								arg0[local30] = arg3.substring(local13, local15 + 1 - local24);
								local30++;
								if (local30 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local22;
								local15 = -1;
								local28 = -1;
							} else {
								arg0[local30] = arg3.substring(local13, local63);
								local30++;
								if (local30 >= arg0.length) {
									return 0;
								}
								local13 = local63;
								local28 = -1;
								local15 = -1;
								local11 = local47;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local15 = local35;
							local22 = local11;
						}
					}
				}
			}
		}
		if (arg3.length() > local13) {
			arg0[local30] = arg3.substring(local13, arg3.length());
			local30++;
		}
		return local30;
	}
}
