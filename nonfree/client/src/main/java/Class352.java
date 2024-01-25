import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class352 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "[B")
	private final byte[] aByteArray96;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	public final int anInt9293;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	public final int anInt9290;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	public final int anInt9302;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
	public Class352(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(arg0);
		@Pc(12) int local12 = local8.method7974();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method7974() == 1;
		this.aByteArray96 = new byte[256];
		local8.method7957(this.aByteArray96, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
				local46[local48] = local8.method7974();
			}
			@Pc(65) int[] local65 = new int[256];
			for (@Pc(67) int local67 = 0; local67 < 256; local67++) {
				local65[local67] = local8.method7974();
			}
			@Pc(84) byte[][] local84 = new byte[256][];
			@Pc(99) int local99;
			for (@Pc(86) int local86 = 0; local86 < 256; local86++) {
				local84[local86] = new byte[local46[local86]];
				@Pc(97) byte local97 = 0;
				for (local99 = 0; local99 < local84[local86].length; local99++) {
					local97 += local8.method7963();
					local84[local86][local99] = local97;
				}
			}
			@Pc(130) byte[][] local130 = new byte[256][];
			@Pc(145) int local145;
			for (local99 = 0; local99 < 256; local99++) {
				local130[local99] = new byte[local46[local99]];
				@Pc(143) byte local143 = 0;
				for (local145 = 0; local145 < local130[local99].length; local145++) {
					local143 += local8.method7963();
					local130[local99][local145] = local143;
				}
			}
			this.aByteArrayArray25 = new byte[256][256];
			for (@Pc(184) int local184 = 0; local184 < 256; local184++) {
				if (local184 != 32 && local184 != 160) {
					for (local145 = 0; local145 < 256; local145++) {
						if (local145 != 32 && local145 != 160) {
							this.aByteArrayArray25[local184][local145] = (byte) Static14.method346(this.aByteArray96, local84, local46, local65, local184, local130, local145);
						}
					}
				}
			}
			this.anInt9293 = local46[32] + local65[32];
		} else {
			this.anInt9293 = local8.method7974();
		}
		local8.method7974();
		local8.method7974();
		this.anInt9290 = local8.method7974();
		this.anInt9302 = local8.method7974();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B[Lclient!f;ILjava/lang/String;I)I")
	public int method7570(@OriginalArg(1) Class5[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt9293;
		}
		@Pc(24) int local24 = this.method7575(new int[] { arg3 }, arg0, Static537.aStringArray37, arg2);
		@Pc(35) int local35 = arg1 * (local24 - 1);
		return this.anInt9302 + local35 + this.anInt9290;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method7572(@OriginalArg(1) String arg0) {
		return this.method7577(arg0, null);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lclient!f;ILjava/lang/String;I)Ljava/lang/String;")
	public String method7573(@OriginalArg(0) Class5[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= this.method7577(arg1, arg0)) {
			return arg1;
		}
		@Pc(24) int local24 = arg2 - this.method7577("...", null);
		@Pc(26) int local26 = -1;
		@Pc(28) int local28 = -1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		@Pc(35) String local35 = "";
		for (@Pc(37) int local37 = 0; local37 < local33; local37++) {
			@Pc(43) char local43 = arg1.charAt(local37);
			if (local43 == '<') {
				local26 = local37;
			} else {
				if (local43 == '>' && local26 != -1) {
					@Pc(63) String local63 = arg1.substring(local26 + 1, local37);
					local26 = -1;
					if (local63.equals("lt")) {
						local43 = '<';
					} else if (local63.equals("gt")) {
						local43 = '>';
					} else if (local63.equals("nbsp")) {
						local43 = ' ';
					} else if (local63.equals("shy")) {
						local43 = '\u00ad';
					} else if (local63.equals("times")) {
						local43 = '×';
					} else if (local63.equals("euro")) {
						local43 = '€';
					} else if (local63.equals("copy")) {
						local43 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=") && arg0 != null) {
								try {
									@Pc(135) int local135 = Static216.method3234(local63.substring(4));
									local30 += arg0[local135].A();
									local28 = -1;
									if (local24 < local30) {
										return local35 + "...";
									}
									local35 = arg1.substring(0, local37 + 1);
								} catch (@Pc(169) Exception local169) {
								}
							}
							continue;
						}
						local43 = '®';
					}
				}
				if (local26 == -1) {
					local30 += this.aByteArray96[Static165.method2703(local43) & 0xFF] & 0xFF;
					if (this.aByteArrayArray25 != null && local28 != -1) {
						local30 += this.aByteArrayArray25[local28][local43];
					}
					local28 = local43;
					@Pc(213) int local213 = local30;
					if (this.aByteArrayArray25 != null) {
						local213 = local30 + this.aByteArrayArray25[local43][46];
					}
					if (local24 < local213) {
						return local35 + "...";
					}
					local35 = arg1.substring(0, local37 + 1);
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BILjava/lang/String;[Lclient!f;)I")
	public int method7574(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class5[] arg2) {
		@Pc(23) int local23 = this.method7575(new int[] { arg0 }, arg2, Static537.aStringArray37, arg1);
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local23; local27++) {
			@Pc(37) int local37 = this.method7577(Static537.aStringArray37[local27], arg2);
			if (local25 < local37) {
				local25 = local37;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[Lclient!f;[Ljava/lang/String;Ljava/lang/String;Z)I")
	public int method7575(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg3.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(46) int local46 = Static165.method2703(arg3.charAt(local36)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local21 = local36;
			} else {
				@Pc(70) int local70;
				if (local21 == -1) {
					local48 = this.method7579(local46);
					local70 = local36;
					if (this.aByteArrayArray25 != null && local29 != -1) {
						local48 += this.aByteArrayArray25[local29][local46];
					}
					local29 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local70 = local21;
					@Pc(102) String local102 = arg3.substring(local21 + 1, local36);
					local21 = -1;
					if (local102.equals("br")) {
						arg2[local31] = arg3.substring(local13, local36 + 1);
						local31++;
						if (local31 >= arg2.length) {
							return 0;
						}
						local11 = 0;
						local29 = -1;
						local13 = local36 + 1;
						local15 = -1;
						continue;
					}
					if (local102.equals("lt")) {
						local48 = this.method7579(60);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][60];
						}
						local29 = 60;
					} else if (local102.equals("gt")) {
						local48 = this.method7579(62);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][62];
						}
						local29 = 62;
					} else if (local102.equals("nbsp")) {
						local48 = this.method7579(160);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][160];
						}
						local29 = 160;
					} else if (local102.equals("shy")) {
						local48 = this.method7579(173);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][173];
						}
						local29 = 173;
					} else if (local102.equals("times")) {
						local48 = this.method7579(215);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][215];
						}
						local29 = 215;
					} else if (local102.equals("euro")) {
						local48 = this.method7579(8364);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][8364];
						}
						local29 = 8364;
					} else if (local102.equals("copy")) {
						local48 = this.method7579(169);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][169];
						}
						local29 = 169;
					} else if (local102.equals("reg")) {
						local48 = this.method7579(174);
						if (this.aByteArrayArray25 != null && local29 != -1) {
							local48 += this.aByteArrayArray25[local29][174];
						}
						local29 = 174;
					} else if (local102.startsWith("img=") && arg1 != null) {
						try {
							@Pc(288) int local288 = Static216.method3234(local102.substring(4));
							local29 = -1;
							local48 = arg1[local288].A();
						} catch (@Pc(299) Exception local299) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local11 += local48;
					if (arg0 != null) {
						if (local46 == 32) {
							local15 = local36;
							local17 = local11;
							local19 = 1;
						}
						if (local11 > arg0[local31 < arg0.length ? local31 : arg0.length - 1]) {
							if (local15 >= 0) {
								arg2[local31] = arg3.substring(local13, local15 + 1 - local19);
								local31++;
								if (local31 >= arg2.length) {
									return 0;
								}
								local13 = local15 + 1;
								local15 = -1;
								local29 = -1;
								local11 -= local17;
							} else {
								arg2[local31] = arg3.substring(local13, local70);
								local31++;
								if (local31 >= arg2.length) {
									return 0;
								}
								local11 = local48;
								local29 = -1;
								local15 = -1;
								local13 = local70;
							}
						}
						if (local46 == 45) {
							local19 = 0;
							local15 = local36;
							local17 = local11;
						}
					}
				}
			}
		}
		if (local13 < arg3.length()) {
			arg2[local31] = arg3.substring(local13, arg3.length());
			local31++;
		}
		return local31;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(CBI)I")
	public int method7576(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray25 == null ? 0 : this.aByteArrayArray25[arg1][arg0];
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;[Lclient!f;I)I")
	public int method7577(@OriginalArg(0) String arg0, @OriginalArg(1) Class5[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) char local31 = arg0.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(53) String local53 = arg0.substring(local11 + 1, local25);
					local11 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg1 != null) {
								try {
									@Pc(125) int local125 = Static216.method3234(local53.substring(4));
									local13 = -1;
									local15 += arg1[local125].A();
								} catch (@Pc(136) Exception local136) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray96[Static165.method2703(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray25 != null && local13 != -1) {
						local15 += this.aByteArrayArray25[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public int method7579(@OriginalArg(0) int arg0) {
		return this.aByteArray96[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lclient!f;Ljava/lang/String;II)I")
	public int method7581(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return this.method7575(new int[] { arg2 }, arg0, Static537.aStringArray37, arg1);
	}
}
