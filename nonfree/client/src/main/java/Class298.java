import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class298 {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public final int anInt8038;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public final int anInt8042;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public final int anInt8040;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([B)V")
	public Class298(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(arg0);
		@Pc(12) int local12 = local8.method8645();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method8645() == 1;
		this.aByteArray74 = new byte[256];
		local8.method8625(this.aByteArray74, 0, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
				local46[local48] = local8.method8645();
			}
			@Pc(65) int[] local65 = new int[256];
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local65[local67] = local8.method8645();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method8635();
					local82[local84][local97] = local95;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local97 = 0; local97 < 256; local97++) {
				local130[local97] = new byte[local46[local97]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local97].length; local145++) {
					local143 += local8.method8635();
					local130[local97][local145] = local143;
				}
			}
			this.aByteArrayArray21 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray21[local184][local145] = (byte) Static29.method575(local145, this.aByteArray74, local65, local184, local82, local130, local46);
						}
					}
				}
			}
			this.anInt8038 = local65[32] + local46[32];
		} else {
			this.anInt8038 = local8.method8645();
		}
		local8.method8645();
		local8.method8645();
		this.anInt8042 = local8.method8645();
		this.anInt8040 = local8.method8645();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!hu;I)I")
	public int method6962(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			arg3 = this.anInt8038;
		}
		@Pc(24) int local24 = this.method6970(arg0, new int[] { arg1 }, Static100.aStringArray8, arg2);
		@Pc(30) int local30 = arg3 * (local24 - 1);
		return this.anInt8040 + this.anInt8042 + local30;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!hu;I)I")
	public int method6963(@OriginalArg(0) String arg0, @OriginalArg(2) Class44[] arg1, @OriginalArg(3) int arg2) {
		return this.method6970(arg0, new int[] { arg2 }, Static100.aStringArray8, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIC)I")
	public int method6964(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray21 == null ? 0 : this.aByteArrayArray21[arg0][arg1];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method6965(@OriginalArg(1) String arg0) {
		return this.method6968(arg0, (Class44[]) null);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!hu;I)I")
	public int method6967(@OriginalArg(0) String arg0, @OriginalArg(2) Class44[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method6970(arg0, new int[] { arg2 }, Static100.aStringArray8, arg1);
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method6968(Static100.aStringArray8[local27], arg1);
			if (local25 < local37) {
				local25 = local37;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;[Lclient!hu;)I")
	public int method6968(@OriginalArg(1) String arg0, @OriginalArg(2) Class44[] arg1) {
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
									@Pc(110) int local110 = Static443.method6588(local48.substring(4));
									local13 = -1;
									local15 += arg1[local110].method5313();
								} catch (@Pc(121) Exception local121) {
								}
							}
							continue;
						}
						local26 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray74[Static181.method2917(local26) & 0xFF] & 0xFF;
					if (this.aByteArrayArray21 != null && local13 != -1) {
						local15 += this.aByteArrayArray21[local13][local26];
					}
					local13 = local26;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lclient!hu;Ljava/lang/String;II)Ljava/lang/String;")
	public String method6969(@OriginalArg(0) Class44[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (this.method6968(arg1, arg0) <= arg2) {
			return arg1;
		}
		@Pc(26) int local26 = arg2 - this.method6968("...", (Class44[]) null);
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
									@Pc(130) int local130 = Static443.method6588(local68.substring(4));
									local32 += arg0[local130].method5313();
									local30 = -1;
									if (local26 < local32) {
										return local37 + "...";
									}
									local37 = arg1.substring(0, local39 + 1);
								} catch (@Pc(164) Exception local164) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local28 == -1) {
					local32 += this.aByteArray74[Static181.method2917(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray21 != null && local30 != -1) {
						local32 += this.aByteArrayArray21[local30][local45];
					}
					local30 = local45;
					@Pc(216) int local216 = local32;
					if (this.aByteArrayArray21 != null) {
						local216 = local32 + this.aByteArrayArray21[local45][46];
					}
					if (local216 > local26) {
						return local37 + "...";
					}
					local37 = arg1.substring(0, local39 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I[I[Ljava/lang/String;[Lclient!hu;)I")
	public int method6970(@OriginalArg(0) String arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class44[] arg3) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static181.method2917(arg0.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(63) int local63;
				if (local21 == -1) {
					local47 = this.method6972(local45);
					local63 = local35;
					if (this.aByteArrayArray21 != null && local28 != -1) {
						local47 += this.aByteArrayArray21[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local63 = local21;
					@Pc(70) String local70 = arg0.substring(local21 + 1, local35);
					local21 = -1;
					if (local70.equals("br")) {
						arg2[local30] = arg0.substring(local13, local35 + 1);
						local30++;
						if (arg2.length <= local30) {
							return 0;
						}
						local28 = -1;
						local13 = local35 + 1;
						local15 = -1;
						local11 = 0;
						continue;
					}
					if (local70.equals("lt")) {
						local47 = this.method6972(60);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][60];
						}
						local28 = 60;
					} else if (local70.equals("gt")) {
						local47 = this.method6972(62);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][62];
						}
						local28 = 62;
					} else if (local70.equals("nbsp")) {
						local47 = this.method6972(160);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][160];
						}
						local28 = 160;
					} else if (local70.equals("shy")) {
						local47 = this.method6972(173);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][173];
						}
						local28 = 173;
					} else if (local70.equals("times")) {
						local47 = this.method6972(215);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][215];
						}
						local28 = 215;
					} else if (local70.equals("euro")) {
						local47 = this.method6972(8364);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][8364];
						}
						local28 = 8364;
					} else if (local70.equals("copy")) {
						local47 = this.method6972(169);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][169];
						}
						local28 = 169;
					} else if (local70.equals("reg")) {
						local47 = this.method6972(174);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][174];
						}
						local28 = 174;
					} else if (local70.startsWith("img=") && arg3 != null) {
						try {
							@Pc(228) int local228 = Static443.method6588(local70.substring(4));
							local28 = -1;
							local47 = arg3[local228].method5313();
						} catch (@Pc(239) Exception local239) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg1 != null) {
						if (local45 == 32) {
							local15 = local35;
							local17 = local11;
							local19 = 1;
						}
						if (local11 > arg1[arg1.length <= local30 ? arg1.length - 1 : local30]) {
							if (local15 >= 0) {
								arg2[local30] = arg0.substring(local13, local15 + 1 - local19);
								local30++;
								if (arg2.length <= local30) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local28 = -1;
								local11 -= local17;
							} else {
								arg2[local30] = arg0.substring(local13, local63);
								local30++;
								if (arg2.length <= local30) {
									return 0;
								}
								local28 = -1;
								local15 = -1;
								local11 = local47;
								local13 = local63;
							}
						}
						if (local45 == 45) {
							local19 = 0;
							local15 = local35;
							local17 = local11;
						}
					}
				}
			}
		}
		if (arg0.length() > local13) {
			arg2[local30] = arg0.substring(local13, arg0.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public int method6972(@OriginalArg(1) int arg0) {
		return this.aByteArray74[arg0] & 0xFF;
	}
}
