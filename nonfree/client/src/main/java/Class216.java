import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class216 {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "[B")
	private final byte[] aByteArray91;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	public final int anInt5795;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
	public final int anInt5799;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public final int anInt5794;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "([B)V")
	public Class216(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(12) int local12 = local8.method4240();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method4240() == 1;
		this.aByteArray91 = new byte[256];
		local8.method4244(this.aByteArray91, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
				local46[local48] = local8.method4240();
			}
			@Pc(65) int[] local65 = new int[256];
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local65[local67] = local8.method4240();
			}
			@Pc(82) byte[][] local82 = new byte[256][];
			@Pc(97) int local97;
			for (@Pc(84) int local84 = 0; local84 < 256; local84++) {
				local82[local84] = new byte[local46[local84]];
				@Pc(95) byte local95 = 0;
				for (local97 = 0; local97 < local82[local84].length; local97++) {
					local95 += local8.method4217();
					local82[local84][local97] = local95;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local97 = 0; local97 < 256; local97++) {
				local130[local97] = new byte[local46[local97]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local97].length; local145++) {
					local143 += local8.method4217();
					local130[local97][local145] = local143;
				}
			}
			this.aByteArrayArray19 = new byte[256][256];
			for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
				if (local182 != 32 && local182 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray19[local182][local145] = (byte) Static52.method3359(local130, this.aByteArray91, local65, local46, local145, local182, local82);
						}
					}
				}
			}
			this.anInt5795 = local46[32] + local65[32];
		} else {
			this.anInt5795 = local8.method4240();
		}
		local8.method4240();
		local8.method4240();
		this.anInt5799 = local8.method4240();
		this.anInt5794 = local8.method4240();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!aq;I)I")
	public int method5070(@OriginalArg(0) String arg0, @OriginalArg(3) Class5[] arg1) {
		@Pc(4) int local4 = this.anInt5795;
		@Pc(21) int local21 = this.method5072(arg1, arg0, new int[] { 100 }, Static21.aStringArray4);
		@Pc(27) int local27 = (local21 - 1) * local4;
		return this.anInt5794 + local27 + this.anInt5799;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	public int method5071(@OriginalArg(1) int arg0) {
		return this.aByteArray91[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([Lclient!aq;Ljava/lang/String;[I[Ljava/lang/String;B)I")
	public int method5072(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String[] arg3) {
		if (arg1 == null) {
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
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(45) int local45 = Static379.method1121(arg1.charAt(local35)) & 0xFF;
			@Pc(47) int local47 = 0;
			if (local45 == 60) {
				local26 = local35;
			} else {
				@Pc(61) int local61;
				if (local26 == -1) {
					local61 = local35;
					local47 = this.method5071(local45);
					if (this.aByteArrayArray19 != null && local28 != -1) {
						local47 += this.aByteArrayArray19[local28][local45];
					}
					local28 = local45;
				} else {
					if (local45 != 62) {
						continue;
					}
					local61 = local26;
					@Pc(101) String local101 = arg1.substring(local26 + 1, local35);
					local26 = -1;
					if (local101.equals("br")) {
						arg3[local30] = arg1.substring(local18, local35 + 1);
						local30++;
						if (arg3.length <= local30) {
							return 0;
						}
						local16 = 0;
						local20 = -1;
						local28 = -1;
						local18 = local35 + 1;
						continue;
					}
					if (local101.equals("lt")) {
						local47 = this.method5071(60);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][60];
						}
						local28 = 60;
					} else if (local101.equals("gt")) {
						local47 = this.method5071(62);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][62];
						}
						local28 = 62;
					} else if (local101.equals("nbsp")) {
						local47 = this.method5071(160);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][160];
						}
						local28 = 160;
					} else if (local101.equals("shy")) {
						local47 = this.method5071(173);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][173];
						}
						local28 = 173;
					} else if (local101.equals("times")) {
						local47 = this.method5071(215);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][215];
						}
						local28 = 215;
					} else if (local101.equals("euro")) {
						local47 = this.method5071(8364);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][8364];
						}
						local28 = 8364;
					} else if (local101.equals("copy")) {
						local47 = this.method5071(169);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][169];
						}
						local28 = 169;
					} else if (local101.equals("reg")) {
						local47 = this.method5071(174);
						if (this.aByteArrayArray19 != null && local28 != -1) {
							local47 += this.aByteArrayArray19[local28][174];
						}
						local28 = 174;
					} else if (local101.startsWith("img=") && arg0 != null) {
						try {
							@Pc(316) int local316 = Static319.method4935(local101.substring(4));
							local28 = -1;
							local47 = arg0[local316].method4990();
						} catch (@Pc(327) Exception local327) {
						}
					}
					local45 = -1;
				}
				if (local47 > 0) {
					local16 += local47;
					if (arg2 != null) {
						if (local45 == 32) {
							local20 = local35;
							local22 = local16;
							local24 = 1;
						}
						if (arg2[arg2.length <= local30 ? arg2.length - 1 : local30] < local16) {
							if (local20 >= 0) {
								arg3[local30] = arg1.substring(local18, local20 + 1 - local24);
								local30++;
								if (local30 >= arg3.length) {
									return 0;
								}
								local18 = local20 + 1;
								local20 = -1;
								local28 = -1;
								local16 -= local22;
							} else {
								arg3[local30] = arg1.substring(local18, local61);
								local30++;
								if (local30 >= arg3.length) {
									return 0;
								}
								local16 = local47;
								local18 = local61;
								local20 = -1;
								local28 = -1;
							}
						}
						if (local45 == 45) {
							local24 = 0;
							local22 = local16;
							local20 = local35;
						}
					}
				}
			}
		}
		if (arg1.length() > local18) {
			arg3[local30] = arg1.substring(local18, arg1.length());
			local30++;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5073(@OriginalArg(1) String arg0) {
		return this.method5075(null, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([Lclient!aq;Ljava/lang/String;I)I")
	public int method5075(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = 0;
		@Pc(23) int local23 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg1.substring(local11 + 1, local25);
					local11 = -1;
					if (local54.equals("lt")) {
						local31 = '<';
					} else if (local54.equals("gt")) {
						local31 = '>';
					} else if (local54.equals("nbsp")) {
						local31 = ' ';
					} else if (local54.equals("shy")) {
						local31 = '\u00ad';
					} else if (local54.equals("times")) {
						local31 = '×';
					} else if (local54.equals("euro")) {
						local31 = '€';
					} else if (local54.equals("copy")) {
						local31 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=") && arg0 != null) {
								try {
									@Pc(118) int local118 = Static319.method4935(local54.substring(4));
									local18 = -1;
									local20 += arg0[local118].method4990();
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local20 += this.aByteArray91[Static379.method1121(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray19 != null && local18 != -1) {
						local20 += this.aByteArrayArray19[local18][local31];
					}
					local18 = local31;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;IB[Lclient!aq;)I")
	public int method5076(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5[] arg2) {
		return this.method5072(arg2, arg0, new int[] { arg1 }, Static21.aStringArray4);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ICB)I")
	public int method5077(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		return this.aByteArrayArray19 == null ? 0 : this.aByteArrayArray19[arg0][arg1];
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!aq;)I")
	public int method5078(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5[] arg2) {
		@Pc(18) int local18 = this.method5072(arg2, arg0, new int[] { arg1 }, Static21.aStringArray4);
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(37) int local37 = this.method5075(arg2, Static21.aStringArray4[local27]);
			if (local25 < local37) {
				local25 = local37;
			}
		}
		return local25;
	}
}
