import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class209 {

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public final int anInt6519;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	public final int anInt6517;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	public final int anInt6521;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
	public Class209(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(12) int local12 = local8.method3643();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.method3643() == 1;
		this.aByteArray92 = new byte[256];
		local8.method3620(256, this.aByteArray92);
		if (local31) {
			@Pc(54) int[] local54 = new int[256];
			for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
				local54[local56] = local8.method3643();
			}
			@Pc(71) int[] local71 = new int[256];
			for (@Pc(73) int local73 = 0; local73 < 256; local73++) {
				local71[local73] = local8.method3643();
			}
			@Pc(90) byte[][] local90 = new byte[256][];
			@Pc(105) int local105;
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				local90[local92] = new byte[local54[local92]];
				@Pc(103) byte local103 = 0;
				for (local105 = 0; local105 < local90[local92].length; local105++) {
					local103 += local8.method3621();
					local90[local92][local105] = local103;
				}
			}
			@Pc(134) byte[][] local134 = new byte[256][];
			@Pc(149) int local149;
			for (local105 = 0; local105 < 256; local105++) {
				local134[local105] = new byte[local54[local105]];
				@Pc(147) byte local147 = 0;
				for (local149 = 0; local149 < local134[local105].length; local149++) {
					local147 += local8.method3621();
					local134[local105][local149] = local147;
				}
			}
			this.aByteArrayArray21 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local149 = 0; local149 < 256; local149++) {
						if (local149 != 32 && local149 != 160) {
							this.aByteArrayArray21[local184][local149] = (byte) Static71.method4520(local90, local184, local54, local149, this.aByteArray92, local134, local71);
						}
					}
				}
			}
			this.anInt6519 = local71[32] + local54[32];
		} else {
			this.anInt6519 = local8.method3643();
		}
		local8.method3643();
		local8.method3643();
		this.anInt6517 = local8.method3643();
		this.anInt6521 = local8.method3643();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B[ILjava/lang/String;[Ljava/lang/String;[Lclient!l;)I")
	public int method5505(@OriginalArg(1) int[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class57[] arg3) {
		if (arg1 == null) {
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
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static255.method5155(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(60) int local60;
				if (local21 == -1) {
					local60 = local35;
					local47 = this.method5508(local45);
					if (this.aByteArrayArray21 != null && local28 != -1) {
						local47 += this.aByteArrayArray21[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local60 = local21;
					@Pc(101) String local101 = arg1.substring(local21 + 1, local35);
					local21 = -1;
					if (local101.equals("br")) {
						arg2[local30] = arg1.substring(local13, local35 + 1);
						local28 = -1;
						local13 = local35 + 1;
						local30++;
						local11 = 0;
						local15 = -1;
						continue;
					}
					if (local101.equals("lt")) {
						local47 = this.method5508(60);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][60];
						}
						local28 = 60;
					} else if (local101.equals("gt")) {
						local47 = this.method5508(62);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][62];
						}
						local28 = 62;
					} else if (local101.equals("nbsp")) {
						local47 = this.method5508(160);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][160];
						}
						local28 = 160;
					} else if (local101.equals("shy")) {
						local47 = this.method5508(173);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][173];
						}
						local28 = 173;
					} else if (local101.equals("times")) {
						local47 = this.method5508(215);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][215];
						}
						local28 = 215;
					} else if (local101.equals("euro")) {
						local47 = this.method5508(8364);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][8364];
						}
						local28 = 8364;
					} else if (local101.equals("copy")) {
						local47 = this.method5508(169);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][169];
						}
						local28 = 169;
					} else if (local101.equals("reg")) {
						local47 = this.method5508(174);
						if (this.aByteArrayArray21 != null && local28 != -1) {
							local47 += this.aByteArrayArray21[local28][174];
						}
						local28 = 174;
					} else if (local101.startsWith("img=") && arg3 != null) {
						try {
							@Pc(284) int local284 = Static261.method4403(local101.substring(4));
							local28 = -1;
							local47 = arg3[local284].method5433();
						} catch (@Pc(295) Exception local295) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg0 != null) {
						if (local45 == 32) {
							local17 = local11;
							local19 = 1;
							local15 = local35;
						}
						if (arg0[arg0.length <= local30 ? arg0.length - 1 : local30] < local11) {
							if (local15 < 0) {
								arg2[local30] = arg1.substring(local13, local60);
								local11 = local47;
								local13 = local60;
								local28 = -1;
								local30++;
								local15 = -1;
							} else {
								arg2[local30] = arg1.substring(local13, local15 + 1 - local19);
								local13 = local15 + 1;
								local30++;
								local15 = -1;
								local28 = -1;
								local11 -= local17;
							}
						}
						if (local45 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local35;
						}
					}
				}
			}
		}
		if (local13 < arg1.length()) {
			arg2[local30] = arg1.substring(local13, arg1.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIC)I")
	public int method5507(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray21 == null ? 0 : this.aByteArrayArray21[arg0][arg1];
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)I")
	public int method5508(@OriginalArg(1) int arg0) {
		return this.aByteArray92[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;[Lclient!l;I)I")
	public int method5509(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class57[] arg2) {
		return this.method5505(new int[] { arg0 }, arg1, Static20.aStringArray4, arg2);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5510(@OriginalArg(1) String arg0) {
		return this.method5511(arg0, null);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;[Lclient!l;)I")
	public int method5511(@OriginalArg(1) String arg0, @OriginalArg(2) Class57[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(24) int local24 = arg0.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) char local32 = arg0.charAt(local26);
			if (local32 == '<') {
				local11 = local26;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(52) String local52 = arg0.substring(local11 + 1, local26);
					local11 = -1;
					if (local52.equals("lt")) {
						local32 = '<';
					} else if (local52.equals("gt")) {
						local32 = '>';
					} else if (local52.equals("nbsp")) {
						local32 = ' ';
					} else if (local52.equals("shy")) {
						local32 = '\u00ad';
					} else if (local52.equals("times")) {
						local32 = '×';
					} else if (local52.equals("euro")) {
						local32 = '€';
					} else if (local52.equals("copy")) {
						local32 = '©';
					} else {
						if (!local52.equals("reg")) {
							if (local52.startsWith("img=") && arg1 != null) {
								try {
									@Pc(122) int local122 = Static261.method4403(local52.substring(4));
									local13 = -1;
									local15 += arg1[local122].method5433();
								} catch (@Pc(133) Exception local133) {
								}
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray92[Static255.method5155(local32) & 0xFF] & 0xFF;
					if (this.aByteArrayArray21 != null && local13 != -1) {
						local15 += this.aByteArrayArray21[local13][local32];
					}
					local13 = local32;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;IB[Lclient!l;)I")
	public int method5514(@OriginalArg(1) String arg0, @OriginalArg(4) Class57[] arg1) {
		@Pc(11) int local11 = this.anInt6519;
		@Pc(24) int local24 = this.method5505(new int[] { 100 }, arg0, Static20.aStringArray4, arg1);
		@Pc(30) int local30 = local11 * (local24 - 1);
		return local30 + this.anInt6517 + this.anInt6521;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lclient!l;BLjava/lang/String;I)I")
	public int method5515(@OriginalArg(0) Class57[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method5505(new int[] { arg2 }, arg1, Static20.aStringArray4, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(36) int local36 = this.method5510(Static20.aStringArray4[local27]);
			if (local20 < local36) {
				local20 = local36;
			}
		}
		return local20;
	}
}
