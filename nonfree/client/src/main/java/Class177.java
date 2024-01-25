import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class177 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "[B")
	private final byte[] aByteArray70;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
	public final int anInt5367;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public final int anInt5365;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
	public final int anInt5368;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([B)V")
	public Class177(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class1_Sub13 local6 = new Class1_Sub13(arg0);
		@Pc(10) int local10 = local6.method3043();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local6.method3043() == 1;
		this.aByteArray70 = new byte[256];
		local6.method3071(this.aByteArray70, 256);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local6.method3043();
			}
			for (@Pc(64) int local64 = 0; local64 < 256; local64++) {
				local47[local64] = local6.method3043();
			}
			@Pc(78) byte[][] local78 = new byte[256][];
			@Pc(92) int local92;
			for (@Pc(80) int local80 = 0; local80 < 256; local80++) {
				local78[local80] = new byte[local44[local80]];
				@Pc(90) byte local90 = 0;
				for (local92 = 0; local92 < local78[local80].length; local92++) {
					local90 += local6.method3073();
					local78[local80][local92] = local90;
				}
			}
			@Pc(124) byte[][] local124 = new byte[256][];
			@Pc(138) int local138;
			for (local92 = 0; local92 < 256; local92++) {
				local124[local92] = new byte[local44[local92]];
				@Pc(136) byte local136 = 0;
				for (local138 = 0; local138 < local124[local92].length; local138++) {
					local136 += local6.method3073();
					local124[local92][local138] = local136;
				}
			}
			this.aByteArrayArray23 = new byte[256][256];
			for (@Pc(172) int local172 = 0; local172 < 256; local172++) {
				if (local172 != 32 && local172 != 160) {
					for (local138 = 0; local138 < 256; local138++) {
						if (local138 != 32 && local138 != 160) {
							this.aByteArrayArray23[local172][local138] = (byte) Static540.method7894(local124, local138, this.aByteArray70, local78, local47, local172, local44);
						}
					}
				}
			}
			this.anInt5367 = local44[32] + local47[32];
		} else {
			this.anInt5367 = local6.method3043();
		}
		local6.method3043();
		local6.method3043();
		this.anInt5365 = local6.method3043();
		this.anInt5368 = local6.method3043();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!ha;)I")
	public int method4662(@OriginalArg(0) String arg0, @OriginalArg(2) Class12[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(14) int local14 = -1;
		@Pc(16) int local16 = -1;
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(28) char local28 = arg0.charAt(local23);
			if (local28 == '<') {
				local14 = local23;
			} else {
				if (local28 == '>' && local14 != -1) {
					@Pc(49) String local49 = arg0.substring(local14 + 1, local23);
					local14 = -1;
					if (local49.equals("lt")) {
						local28 = '<';
					} else if (local49.equals("gt")) {
						local28 = '>';
					} else if (local49.equals("nbsp")) {
						local28 = ' ';
					} else if (local49.equals("shy")) {
						local28 = '\u00ad';
					} else if (local49.equals("times")) {
						local28 = '×';
					} else if (local49.equals("euro")) {
						local28 = '€';
					} else if (local49.equals("copy")) {
						local28 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=") && arg1 != null) {
								try {
									@Pc(101) int local101 = Static485.method7022(local49.substring(4));
									local18 += arg1[local101].EA();
									local16 = -1;
								} catch (@Pc(112) Exception local112) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local14 == -1) {
					local18 += this.aByteArray70[Static356.method5624(local28) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local16 != -1) {
						local18 += this.aByteArrayArray23[local16][local28];
					}
					local16 = local28;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;IZ)I")
	public int method4663(@OriginalArg(0) String arg0, @OriginalArg(1) Class12[] arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = this.method4667(arg1, Static263.aStringArray20, new int[] { arg2 }, arg0);
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(29) int local29 = this.method4662(Static263.aStringArray20[local20], arg1);
			if (local29 > local18) {
				local18 = local29;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4664(@OriginalArg(1) String arg0) {
		return this.method4662(arg0, null);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;ZI)Ljava/lang/String;")
	public String method4665(@OriginalArg(0) String arg0, @OriginalArg(1) Class12[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method4662(arg0, arg1)) {
			return arg0;
		}
		@Pc(25) int local25 = arg2 - this.method4662("...", null);
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		@Pc(36) String local36 = "";
		for (@Pc(38) int local38 = 0; local38 < local34; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local43 == '<') {
				local27 = local38;
			} else {
				if (local43 == '>' && local27 != -1) {
					@Pc(65) String local65 = arg0.substring(local27 + 1, local38);
					local27 = -1;
					if (local65.equals("lt")) {
						local43 = '<';
					} else if (local65.equals("gt")) {
						local43 = '>';
					} else if (local65.equals("nbsp")) {
						local43 = ' ';
					} else if (local65.equals("shy")) {
						local43 = '\u00ad';
					} else if (local65.equals("times")) {
						local43 = '×';
					} else if (local65.equals("euro")) {
						local43 = '€';
					} else if (local65.equals("copy")) {
						local43 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=") && arg1 != null) {
								try {
									@Pc(111) int local111 = Static485.method7022(local65.substring(4));
									local31 += arg1[local111].EA();
									local29 = -1;
									if (local31 > local25) {
										return local36 + "...";
									}
									local36 = arg0.substring(0, local38 + 1);
								} catch (@Pc(145) Exception local145) {
								}
							}
							continue;
						}
						local43 = '®';
					}
				}
				if (local27 == -1) {
					local31 += this.aByteArray70[Static356.method5624(local43) & 0xFF] & 0xFF;
					if (this.aByteArrayArray23 != null && local29 != -1) {
						local31 += this.aByteArrayArray23[local29][local43];
					}
					local29 = local43;
					@Pc(205) int local205 = local31;
					if (this.aByteArrayArray23 != null) {
						local205 = local31 + this.aByteArrayArray23[local43][46];
					}
					if (local25 < local205) {
						return local36 + "...";
					}
					local36 = arg0.substring(0, local38 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!ha;IILjava/lang/String;)I")
	public int method4666(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return this.method4667(arg0, Static263.aStringArray20, new int[] { arg1 }, arg2);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[Lclient!ha;[Ljava/lang/String;[ILjava/lang/String;)I")
	public int method4667(@OriginalArg(1) Class12[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(25) int local25 = -1;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = arg3.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(43) int local43 = Static356.method5624(arg3.charAt(local34)) & 0xFF;
			@Pc(45) int local45 = 0;
			if (local43 == 60) {
				local25 = local34;
			} else {
				@Pc(58) int local58;
				if (local25 == -1) {
					local58 = local34;
					local45 = this.method4672(local43);
					if (this.aByteArrayArray23 != null && local27 != -1) {
						local45 += this.aByteArrayArray23[local27][local43];
					}
					local27 = local43;
				} else {
					if (local43 != 62) {
						continue;
					}
					local58 = local25;
					@Pc(97) String local97 = arg3.substring(local25 + 1, local34);
					local25 = -1;
					if (local97.equals("br")) {
						arg1[local29] = arg3.substring(local11, local34 + 1);
						local29++;
						if (arg1.length <= local29) {
							return 0;
						}
						local9 = 0;
						local27 = -1;
						local11 = local34 + 1;
						local13 = -1;
						continue;
					}
					if (local97.equals("lt")) {
						local45 = this.method4672(60);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][60];
						}
						local27 = 60;
					} else if (local97.equals("gt")) {
						local45 = this.method4672(62);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][62];
						}
						local27 = 62;
					} else if (local97.equals("nbsp")) {
						local45 = this.method4672(160);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][160];
						}
						local27 = 160;
					} else if (local97.equals("shy")) {
						local45 = this.method4672(173);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][173];
						}
						local27 = 173;
					} else if (local97.equals("times")) {
						local45 = this.method4672(215);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][215];
						}
						local27 = 215;
					} else if (local97.equals("euro")) {
						local45 = this.method4672(8364);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][8364];
						}
						local27 = 8364;
					} else if (local97.equals("copy")) {
						local45 = this.method4672(169);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][169];
						}
						local27 = 169;
					} else if (local97.equals("reg")) {
						local45 = this.method4672(174);
						if (this.aByteArrayArray23 != null && local27 != -1) {
							local45 += this.aByteArrayArray23[local27][174];
						}
						local27 = 174;
					} else if (local97.startsWith("img=") && arg0 != null) {
						try {
							@Pc(303) int local303 = Static485.method7022(local97.substring(4));
							local45 = arg0[local303].EA();
							local27 = -1;
						} catch (@Pc(314) Exception local314) {
						}
					}
					local43 = -1;
				}
				if (local45 > 0) {
					local9 += local45;
					if (arg2 != null) {
						if (local43 == 32) {
							local13 = local34;
							local17 = 1;
							local15 = local9;
						}
						if (local9 > arg2[local29 < arg2.length ? local29 : arg2.length - 1]) {
							if (local13 >= 0) {
								arg1[local29] = arg3.substring(local11, local13 + 1 - local17);
								local29++;
								if (arg1.length <= local29) {
									return 0;
								}
								local11 = local13 + 1;
								local13 = -1;
								local27 = -1;
								local9 -= local15;
							} else {
								arg1[local29] = arg3.substring(local11, local58);
								local29++;
								if (arg1.length <= local29) {
									return 0;
								}
								local13 = -1;
								local9 = local45;
								local11 = local58;
								local27 = -1;
							}
						}
						if (local43 == 45) {
							local15 = local9;
							local13 = local34;
							local17 = 0;
						}
					}
				}
			}
		}
		if (local11 < arg3.length()) {
			arg1[local29] = arg3.substring(local11, arg3.length());
			local29++;
		}
		return local29;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;[Lclient!ha;III)I")
	public int method4668(@OriginalArg(0) String arg0, @OriginalArg(1) Class12[] arg1) {
		@Pc(8) int local8 = this.anInt5367;
		@Pc(21) int local21 = this.method4667(arg1, Static263.aStringArray20, new int[] { 100 }, arg0);
		@Pc(27) int local27 = local8 * (local21 - 1);
		return this.anInt5365 + local27 + this.anInt5368;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(CBI)I")
	public int method4670(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray23 == null ? 0 : this.aByteArrayArray23[arg1][arg0];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
	public int method4672(@OriginalArg(0) int arg0) {
		return this.aByteArray70[arg0] & 0xFF;
	}
}
