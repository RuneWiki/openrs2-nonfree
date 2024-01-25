import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class26 {

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	public final int anInt609;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public final int anInt604;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
	public final int anInt608;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([B)V")
	public Class26(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub10 local8 = new Class6_Sub10(arg0);
		@Pc(12) int local12 = local8.method3972();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method3972() == 1;
		this.aByteArray5 = new byte[256];
		local8.method3986(256, this.aByteArray5);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local49[local51] = local8.method3972();
			}
			@Pc(68) int[] local68 = new int[256];
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local68[local70] = local8.method3972();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local49[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method3992();
					local85[local87][local100] = local98;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local100 = 0; local100 < 256; local100++) {
				local131[local100] = new byte[local49[local100]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local100].length; local146++) {
					local144 += local8.method3992();
					local131[local100][local146] = local144;
				}
			}
			this.aByteArrayArray2 = new byte[256][256];
			for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
				if (local185 != 32 && local185 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray2[local185][local146] = (byte) Static327.method3199(local146, local49, local185, local68, this.aByteArray5, local85, local131);
						}
					}
				}
			}
			this.anInt609 = local49[32] + local68[32];
		} else {
			this.anInt609 = local8.method3972();
		}
		local8.method3972();
		local8.method3972();
		this.anInt604 = local8.method3972();
		this.anInt608 = local8.method3972();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([Lclient!of;ILjava/lang/String;Z)I")
	public int method499(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return this.method500(Static53.aStringArray5, new int[] { arg1 }, arg0, arg2);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([Ljava/lang/String;[I[Lclient!of;ILjava/lang/String;)I")
	public int method500(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class40[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(24) byte local24 = 0;
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg3.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static124.method2462(arg3.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(68) int local68;
				if (local26 == -1) {
					local47 = this.method501(local45);
					local68 = local35;
					if (this.aByteArrayArray2 != null && local28 != -1) {
						local47 += this.aByteArrayArray2[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local68 = local26;
					@Pc(102) String local102 = arg3.substring(local26 + 1, local35);
					local26 = -1;
					if (local102.equals("br")) {
						arg0[local30] = arg3.substring(local18, local35 + 1);
						local30++;
						local11 = 0;
						local18 = local35 + 1;
						local20 = -1;
						local28 = -1;
						continue;
					}
					if (local102.equals("lt")) {
						local47 = this.method501(60);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][60];
						}
						local28 = 60;
					} else if (local102.equals("gt")) {
						local47 = this.method501(62);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][62];
						}
						local28 = 62;
					} else if (local102.equals("nbsp")) {
						local47 = this.method501(160);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][160];
						}
						local28 = 160;
					} else if (local102.equals("shy")) {
						local47 = this.method501(173);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][173];
						}
						local28 = 173;
					} else if (local102.equals("times")) {
						local47 = this.method501(215);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][215];
						}
						local28 = 215;
					} else if (local102.equals("euro")) {
						local47 = this.method501(8364);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][8364];
						}
						local28 = 8364;
					} else if (local102.equals("copy")) {
						local47 = this.method501(169);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][169];
						}
						local28 = 169;
					} else if (local102.equals("reg")) {
						local47 = this.method501(174);
						if (this.aByteArrayArray2 != null && local28 != -1) {
							local47 += this.aByteArrayArray2[local28][174];
						}
						local28 = 174;
					} else if (local102.startsWith("img=") && arg2 != null) {
						try {
							@Pc(306) int local306 = Static344.method5646(local102.substring(4));
							local28 = -1;
							local47 = arg2[local306].method5083();
						} catch (@Pc(317) Exception local317) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local24 = 1;
							local20 = local35;
							local22 = local11;
						}
						if (local11 > arg1[arg1.length <= local30 ? arg1.length - 1 : local30]) {
							if (local20 >= 0) {
								arg0[local30] = arg3.substring(local18, local20 + 1 - local24);
								local18 = local20 + 1;
								local30++;
								local28 = -1;
								local11 -= local22;
								local20 = -1;
							} else {
								arg0[local30] = arg3.substring(local18, local68);
								local18 = local68;
								local20 = -1;
								local28 = -1;
								local11 = local47;
								local30++;
							}
						}
						if (local45 == 45) {
							local20 = local35;
							local24 = 0;
							local22 = local11;
						}
					}
				}
			}
		}
		if (local18 < arg3.length()) {
			arg0[local30] = arg3.substring(local18, arg3.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)I")
	public int method501(@OriginalArg(0) int arg0) {
		return this.aByteArray5[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;[Lclient!of;BI)I")
	public int method503(@OriginalArg(0) String arg0, @OriginalArg(1) Class40[] arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = this.method500(Static53.aStringArray5, new int[] { arg2 }, arg1, arg0);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < local26; local30++) {
			@Pc(39) int local39 = this.method508(Static53.aStringArray5[local30]);
			if (local39 > local28) {
				local28 = local39;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ICI)I")
	public int method504(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray2 == null ? 0 : this.aByteArrayArray2[arg1][arg0];
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;[Lclient!of;I)I")
	public int method505(@OriginalArg(0) String arg0, @OriginalArg(1) Class40[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(56) String local56 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local56.equals("lt")) {
						local31 = '<';
					} else if (local56.equals("gt")) {
						local31 = '>';
					} else if (local56.equals("nbsp")) {
						local31 = ' ';
					} else if (local56.equals("shy")) {
						local31 = '\u00ad';
					} else if (local56.equals("times")) {
						local31 = '×';
					} else if (local56.equals("euro")) {
						local31 = '€';
					} else if (local56.equals("copy")) {
						local31 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=") && arg1 != null) {
								try {
									@Pc(122) int local122 = Static344.method5646(local56.substring(4));
									local18 = -1;
									local20 += arg1[local122].method5083();
								} catch (@Pc(133) Exception local133) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray5[Static124.method2462(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray2 != null && local18 != -1) {
						local20 += this.aByteArrayArray2[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;[Lclient!of;II)I")
	public int method506(@OriginalArg(1) String arg0, @OriginalArg(2) Class40[] arg1) {
		@Pc(4) int local4 = this.anInt609;
		@Pc(23) int local23 = this.method500(Static53.aStringArray5, new int[] { 100 }, arg1, arg0);
		@Pc(29) int local29 = local4 * (local23 - 1);
		return this.anInt608 + this.anInt604 + local29;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method508(@OriginalArg(0) String arg0) {
		return this.method505(arg0, null);
	}
}
