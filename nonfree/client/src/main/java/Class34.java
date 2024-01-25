import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class34 {

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public final int anInt1008;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public final int anInt1003;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	public final int anInt1017;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "([B)V")
	public Class34(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub21 local8 = new Class1_Sub21(arg0);
		@Pc(12) int local12 = local8.method5720();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method5720() == 1;
		this.aByteArray7 = new byte[256];
		local8.method5730(this.aByteArray7, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local46[local51] = local8.method5720();
			}
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local49[local67] = local8.method5720();
			}
			@Pc(84) byte[][] local84 = new byte[256][];
			@Pc(99) int local99;
			for (@Pc(86) int local86 = 0; local86 < 256; local86++) {
				local84[local86] = new byte[local46[local86]];
				@Pc(97) byte local97 = 0;
				for (local99 = 0; local99 < local84[local86].length; local99++) {
					local97 += local8.method5721();
					local84[local86][local99] = local97;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local99 = 0; local99 < 256; local99++) {
				local130[local99] = new byte[local46[local99]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local99].length; local145++) {
					local143 += local8.method5721();
					local130[local99][local145] = local143;
				}
			}
			this.aByteArrayArray3 = new byte[256][256];
			for (@Pc(178) int local178 = 0; local178 < 256; local178++) {
				if (local178 != 32 && local178 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray3[local178][local145] = (byte) Static169.method2994(this.aByteArray7, local145, local178, local46, local84, local49, local130);
						}
					}
				}
			}
			this.anInt1008 = local46[32] + local49[32];
		} else {
			this.anInt1008 = local8.method5720();
		}
		local8.method5720();
		local8.method5720();
		this.anInt1003 = local8.method5720();
		this.anInt1017 = local8.method5720();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;[Lclient!cq;I)I")
	public int method786(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class8[] arg2) {
		@Pc(23) int local23 = this.method797(Static352.aStringArray42, arg1, new int[] { arg0 }, arg2);
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local23; local27++) {
			@Pc(37) int local37 = this.method792(arg2, Static352.aStringArray42[local27]);
			if (local37 > local25) {
				local25 = local37;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)I")
	public int method787(@OriginalArg(0) int arg0) {
		return this.aByteArray7[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ICI)I")
	public int method788(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray3 == null ? 0 : this.aByteArrayArray3[arg1][arg0];
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[Lclient!cq;Ljava/lang/String;B)I")
	public int method791(@OriginalArg(0) int arg0, @OriginalArg(1) Class8[] arg1, @OriginalArg(2) String arg2) {
		return this.method797(Static352.aStringArray42, arg2, new int[] { arg0 }, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([Lclient!cq;Ljava/lang/String;B)I")
	public int method792(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg1.substring(local11 + 1, local25);
					local11 = -1;
					if (local55.equals("lt")) {
						local31 = '<';
					} else if (local55.equals("gt")) {
						local31 = '>';
					} else if (local55.equals("nbsp")) {
						local31 = ' ';
					} else if (local55.equals("shy")) {
						local31 = '\u00ad';
					} else if (local55.equals("times")) {
						local31 = '×';
					} else if (local55.equals("euro")) {
						local31 = '€';
					} else if (local55.equals("copy")) {
						local31 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg0 != null) {
								try {
									@Pc(129) int local129 = Static38.method2707(local55.substring(4));
									local13 = -1;
									local15 += arg0[local129].method4381();
								} catch (@Pc(140) Exception local140) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray7[Static331.method3176(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray3 != null && local13 != -1) {
						local15 += this.aByteArrayArray3[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;III[Lclient!cq;)I")
	public int method795(@OriginalArg(0) String arg0, @OriginalArg(4) Class8[] arg1) {
		@Pc(9) int local9 = this.anInt1008;
		@Pc(22) int local22 = this.method797(Static352.aStringArray42, arg0, new int[] { 100 }, arg1);
		@Pc(28) int local28 = local9 * (local22 - 1);
		return local28 + this.anInt1003 + this.anInt1017;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method796(@OriginalArg(1) String arg0) {
		return this.method792(null, arg0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[I[Lclient!cq;B)I")
	public int method797(@OriginalArg(0) String[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class8[] arg3) {
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
			@Pc(45) int local45 = Static331.method3176(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local21 = local35;
			} else {
				@Pc(65) int local65;
				if (local21 == -1) {
					local65 = local35;
					local47 = this.method787(local45);
					if (this.aByteArrayArray3 != null && local28 != -1) {
						local47 += this.aByteArrayArray3[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local65 = local21;
					@Pc(72) String local72 = arg1.substring(local21 + 1, local35);
					local21 = -1;
					if (local72.equals("br")) {
						arg0[local30] = arg1.substring(local13, local35 + 1);
						local30++;
						if (local30 >= arg0.length) {
							return 0;
						}
						local13 = local35 + 1;
						local11 = 0;
						local28 = -1;
						local15 = -1;
						continue;
					}
					if (local72.equals("lt")) {
						local47 = this.method787(60);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][60];
						}
						local28 = 60;
					} else if (local72.equals("gt")) {
						local47 = this.method787(62);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][62];
						}
						local28 = 62;
					} else if (local72.equals("nbsp")) {
						local47 = this.method787(160);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][160];
						}
						local28 = 160;
					} else if (local72.equals("shy")) {
						local47 = this.method787(173);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][173];
						}
						local28 = 173;
					} else if (local72.equals("times")) {
						local47 = this.method787(215);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][215];
						}
						local28 = 215;
					} else if (local72.equals("euro")) {
						local47 = this.method787(8364);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][8364];
						}
						local28 = 8364;
					} else if (local72.equals("copy")) {
						local47 = this.method787(169);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][169];
						}
						local28 = 169;
					} else if (local72.equals("reg")) {
						local47 = this.method787(174);
						if (this.aByteArrayArray3 != null && local28 != -1) {
							local47 += this.aByteArrayArray3[local28][174];
						}
						local28 = 174;
					} else if (local72.startsWith("img=") && arg3 != null) {
						try {
							@Pc(236) int local236 = Static38.method2707(local72.substring(4));
							local28 = -1;
							local47 = arg3[local236].method4381();
						} catch (@Pc(247) Exception local247) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local11 += local47;
					if (arg2 != null) {
						if (local45 == 32) {
							local17 = local11;
							local15 = local35;
							local19 = 1;
						}
						if (local11 > arg2[local30 >= arg2.length ? arg2.length - 1 : local30]) {
							if (local15 < 0) {
								arg0[local30] = arg1.substring(local13, local65);
								local30++;
								if (arg0.length <= local30) {
									return 0;
								}
								local15 = -1;
								local13 = local65;
								local28 = -1;
								local11 = local47;
							} else {
								arg0[local30] = arg1.substring(local13, local15 + 1 - local19);
								local30++;
								if (local30 >= arg0.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local28 = -1;
								local15 = -1;
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
		if (local13 < arg1.length()) {
			arg0[local30] = arg1.substring(local13, arg1.length());
			local30++;
		}
		return local30;
	}
}
