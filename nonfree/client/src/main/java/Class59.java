import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class59 {

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!oa;")
	private final Class5 aClass5_13;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!cq;")
	private final Class53 aClass53_17;

	static {
		new Class67("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!oa;Lclient!cq;)V")
	protected Class59(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass5_13 = arg0;
		this.aClass53_17 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	private void method7262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static67.anInt1507 = -1;
		Static377.anInt7064 = -1;
		Static183.anInt5940 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static477.anInt8635 = 0;
		Static208.anInt4579 = arg1;
		Static534.anInt9266 = arg1;
		Static474.anInt8509 = arg0;
		Static363.anInt6817 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILclient!fa;IIILjava/lang/String;[Lclient!xa;[IIII)I")
	public final int method7263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(9) int arg6, @OriginalArg(10) String arg7, @OriginalArg(11) Class119[] arg8, @OriginalArg(12) int[] arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method7280(arg9, arg4, arg3, 1, 0, arg11, 0, arg2, arg0, arg5, arg6, arg8, arg12, arg7, arg1, arg10);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V")
	public final void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7262(-16777216, arg4);
		@Pc(23) int local23 = arg1.length();
		@Pc(26) int[] local26 = new int[local23];
		@Pc(29) int[] local29 = new int[local23];
		for (@Pc(31) int local31 = 0; local31 < local23; local31++) {
			local26[local31] = (int) (Math.sin((double) local31 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local29[local31] = (int) (Math.sin((double) arg0 / 5.0D + (double) local31 / 3.0D) * 5.0D);
		}
		this.method7276(local29, arg1, null, arg3, local26, arg2 - this.aClass53_17.method1378(arg1) / 2, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7262(arg3, arg0);
			this.method7278(null, arg2, arg4 - this.aClass53_17.method1378(arg2) / 2, 0, null, null, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lclient!xa;IILjava/util/Random;I[II[IIIIIBLjava/lang/String;)I")
	public final int method7267(@OriginalArg(0) int arg0, @OriginalArg(1) Class119[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg4.setSeed((long) arg11);
		@Pc(21) int local21 = (arg4.nextInt() & 0x1F) + 192;
		this.method7262(arg10 & 0xFFFFFF | local21 << 24, arg3 & 0xFFFFFF | local21 << 24);
		@Pc(49) int local49 = arg13.length();
		@Pc(52) int[] local52 = new int[local49];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local52[local56] = local54;
			if ((arg4.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		@Pc(77) int local77 = arg12;
		@Pc(83) int local83 = arg0 + this.aClass53_17.anInt1511;
		@Pc(85) int local85 = -1;
		if (arg9 == 1) {
			local83 += (arg2 - this.aClass53_17.anInt1511 - this.aClass53_17.anInt1514) / 2;
		} else if (arg9 == 2) {
			local83 = arg0 + arg2 - this.aClass53_17.anInt1514;
		}
		if (arg7 == 1) {
			local85 = local54 + this.aClass53_17.method1378(arg13);
			local77 = arg12 + (arg5 - local85) / 2;
		} else if (arg7 == 2) {
			local85 = local54 + this.aClass53_17.method1378(arg13);
			local77 = arg12 + arg5 - local85;
		}
		this.method7276(null, arg13, arg6, local83, local52, local77, arg1);
		if (arg8 != null) {
			if (local85 == -1) {
				local85 = this.aClass53_17.method1378(arg13) + local54;
			}
			arg8[0] = local77;
			arg8[2] = local85;
			arg8[1] = local83 - this.aClass53_17.anInt1511;
			arg8[3] = this.aClass53_17.anInt1511 + this.aClass53_17.anInt1514;
		}
		return local54;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method7268(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7262(-16777216, arg2);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method7276(local19, arg1, null, arg4, null, arg3 - this.aClass53_17.method1378(arg1) / 2, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lclient!xa;Ljava/lang/String;[IIIIII)V")
	public final void method7269(@OriginalArg(0) Class119[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method7262(0, arg4);
			this.method7278(arg2, arg1, arg5, 0, arg0, null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public final void method7270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) int arg5) {
		if (arg4 == null) {
			return;
		}
		this.method7262(-16777216, arg5);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg4.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < local30; local35++) {
			local33[local35] = (int) (local21 * Math.sin((double) arg0 + (double) local35 / 1.5D));
		}
		this.method7276(local33, arg4, null, arg3, null, arg1 - this.aClass53_17.method1378(arg4) / 2, null);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method7271(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(17) int local17 = 0; arg1.length() > local17; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 == '<') {
				local9 = true;
			} else if (local23 == '>') {
				local9 = false;
			} else if (!local9 && local23 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static183.anInt5940 = (arg0 - this.aClass53_17.method1378(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	protected abstract void method7273(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7274(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static534.anInt9266 = Static534.anInt9266 & 0xFF000000 | Static362.method5699(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static534.anInt9266 = Static534.anInt9266 & 0xFF000000 | Static208.anInt4579 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static534.anInt9266 = Static362.method5699(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static534.anInt9266 = Static208.anInt4579;
			} else if (arg0.startsWith("str=")) {
				Static377.anInt7064 = Static534.anInt9266 & 0xFF000000 | Static362.method5699(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static377.anInt7064 = Static534.anInt9266 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static377.anInt7064 = -1;
			} else if (arg0.startsWith("u=")) {
				Static67.anInt1507 = Static534.anInt9266 & 0xFF000000 | Static362.method5699(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static67.anInt1507 = Static534.anInt9266 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static67.anInt1507 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static363.anInt6817 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static363.anInt6817 = Static534.anInt9266 & 0xFF000000 | Static362.method5699(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static363.anInt6817 = Static534.anInt9266 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static363.anInt6817 = Static474.anInt8509;
			} else if (arg0.equals("br")) {
				this.method7262(Static474.anInt8509, Static208.anInt4579);
			}
		} catch (@Pc(179) Exception local179) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
	protected abstract void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([ILjava/lang/String;[III[II[Lclient!xa;)V")
	private void method7276(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class119[] arg6) {
		@Pc(16) int local16 = arg3 - this.aClass53_17.anInt1516;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = 0;
		@Pc(25) int local25 = arg1.length();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) char local38 = (char) (Static331.method5274(arg1.charAt(local27)) & 0xFF);
			if (local38 == '<') {
				local18 = local27;
			} else {
				@Pc(131) int local131;
				@Pc(139) int local139;
				if (local38 == '>' && local18 != -1) {
					@Pc(61) String local61 = arg1.substring(local18 + 1, local27);
					local18 = -1;
					if (local61.equals("lt")) {
						local38 = '<';
					} else if (local61.equals("gt")) {
						local38 = '>';
					} else if (local61.equals("nbsp")) {
						local38 = ' ';
					} else if (local61.equals("shy")) {
						local38 = '\u00ad';
					} else if (local61.equals("times")) {
						local38 = '×';
					} else if (local61.equals("euro")) {
						local38 = '€';
					} else if (local61.equals("copy")) {
						local38 = '©';
					} else {
						if (!local61.equals("reg")) {
							if (local61.startsWith("img=")) {
								try {
									if (arg4 == null) {
										local131 = 0;
									} else {
										local131 = arg4[local22];
									}
									if (arg0 == null) {
										local139 = 0;
									} else {
										local139 = arg0[local22];
									}
									local22++;
									@Pc(152) int local152 = Static454.method6837(local61.substring(4));
									@Pc(156) Class119 local156 = arg6[local152];
									@Pc(165) int local165 = arg2 == null ? local156.a() : arg2[local152];
									local156.I(local131 + arg5, local139 + -local165 + local16 - -this.aClass53_17.anInt1516, 1, 0, 1);
									arg5 += arg6[local152].AA();
									local20 = -1;
								} catch (@Pc(195) Exception local195) {
								}
							} else {
								this.method7274(local61);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg5 += this.aClass53_17.method1377(local38, local20);
					}
					@Pc(229) int local229;
					if (arg4 == null) {
						local229 = 0;
					} else {
						local229 = arg4[local22];
					}
					if (arg0 == null) {
						local131 = 0;
					} else {
						local131 = arg0[local22];
					}
					if (local38 != ' ') {
						if ((Static363.anInt6817 & 0xFF000000) != 0) {
							this.q(local38, local229 + arg5 + 1, local16 - -1 + local131, Static363.anInt6817, true);
						}
						this.q(local38, local229 + arg5, local131 + local16, Static534.anInt9266, false);
					} else if (Static183.anInt5940 > 0) {
						Static477.anInt8635 += Static183.anInt5940;
						arg5 += Static477.anInt8635 >> 8;
						Static477.anInt8635 &= 0xFF;
					}
					local22++;
					local139 = this.aClass53_17.method1379(local38);
					if (Static377.anInt7064 != -1) {
						this.aClass5_13.method7434(arg5, local139, Static377.anInt7064, local16 + (int) ((double) this.aClass53_17.anInt1516 * 0.7D));
					}
					if (Static67.anInt1507 != -1) {
						this.aClass5_13.method7434(arg5, local139, Static67.anInt1507, this.aClass53_17.anInt1516 + local16);
					}
					local20 = local38;
					arg5 += local139;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		if (arg2 != null) {
			this.method7262(-1, arg0);
			this.method7278(null, arg2, arg1 - this.aClass53_17.method1378(arg2), 0, null, null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([ILjava/lang/String;III[Lclient!xa;Lclient!fa;II)V")
	private void method7278(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class119[] arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg6 - this.aClass53_17.anInt1516;
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg1.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static331.method5274(arg1.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local13 = local24;
			} else {
				if (local35 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg1.substring(local13 + 1, local24);
					local13 = -1;
					if (local60.equals("lt")) {
						local35 = '<';
					} else if (local60.equals("gt")) {
						local35 = '>';
					} else if (local60.equals("nbsp")) {
						local35 = ' ';
					} else if (local60.equals("shy")) {
						local35 = '\u00ad';
					} else if (local60.equals("times")) {
						local35 = '×';
					} else if (local60.equals("euro")) {
						local35 = '€';
					} else if (local60.equals("copy")) {
						local35 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									@Pc(114) int local114 = Static454.method6837(local60.substring(4));
									@Pc(118) Class119 local118 = arg4[local114];
									@Pc(127) int local127 = arg0 == null ? local118.a() : arg0[local114];
									if ((Static534.anInt9266 & 0xFF000000) == -16777216) {
										local118.I(arg2, this.aClass53_17.anInt1516 + local7 - local127, 1, 0, 1);
									} else {
										local118.I(arg2, this.aClass53_17.anInt1516 + local7 - local127, 0, Static534.anInt9266 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local19 = -1;
									arg2 += arg4[local114].AA();
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method7274(local60);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local13 == -1) {
					if (local19 != -1) {
						arg2 += this.aClass53_17.method1377(local35, local19);
					}
					if (local35 == ' ') {
						if (Static183.anInt5940 > 0) {
							Static477.anInt8635 += Static183.anInt5940;
							arg2 += Static477.anInt8635 >> 8;
							Static477.anInt8635 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static363.anInt6817 & 0xFF000000) != 0) {
							this.q(local35, arg2 + 1, local7 + 1, Static363.anInt6817, true);
						}
						this.q(local35, arg2, local7, Static534.anInt9266, false);
					} else {
						if ((Static363.anInt6817 & 0xFF000000) != 0) {
							this.method7273(local35, arg2 + 1, local7 + 1, Static363.anInt6817, true, arg5, arg3, arg7);
						}
						this.method7273(local35, arg2, local7, Static534.anInt9266, false, arg5, arg3, arg7);
					}
					@Pc(308) int local308 = this.aClass53_17.method1379(local35);
					if (Static377.anInt7064 != -1) {
						this.aClass5_13.method7434(arg2, local308, Static377.anInt7064, (int) ((double) this.aClass53_17.anInt1516 * 0.7D) + local7);
					}
					if (Static67.anInt1507 != -1) {
						this.aClass5_13.method7434(arg2, local308, Static67.anInt1507, this.aClass53_17.anInt1516 + local7 + 1);
					}
					arg2 += local308;
					local19 = local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;ILjava/util/Random;BI[Lclient!xa;I[I)I")
	public final int method7279(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class119[] arg5, @OriginalArg(9) int[] arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg3.setSeed((long) arg2);
		@Pc(21) int local21 = (arg3.nextInt() & 0x1F) + 192;
		this.method7262((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg1.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg3.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method7276(null, arg1, arg6, arg0, local44, arg4, arg5);
		return local46;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIIIIIIILclient!fa;I[Lclient!xa;ILjava/lang/String;III)I")
	public final int method7280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class10 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class119[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) String arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg13 == null) {
			return 0;
		}
		this.method7262(arg5, arg1);
		if (arg4 == 0) {
			arg4 = this.aClass53_17.anInt1516;
		}
		@Pc(53) int[] local53;
		if (arg7 < arg4 + this.aClass53_17.anInt1511 + this.aClass53_17.anInt1514 && arg4 + arg4 > arg7) {
			local53 = null;
		} else {
			local53 = new int[] { arg12 };
		}
		@Pc(66) int local66 = this.aClass53_17.method1385(arg13, local53, arg11, Static287.aStringArray33);
		if (arg6 == -1) {
			arg6 = arg7 / arg4;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		if (arg6 > 0 && arg6 <= local66) {
			local66 = arg6;
			Static287.aStringArray33[arg6 - 1] = this.aClass53_17.method1380(arg12, arg11, Static287.aStringArray33[arg6 - 1]);
		}
		if (arg8 == 3 && local66 == 1) {
			arg8 = 1;
		}
		@Pc(169) int local169;
		@Pc(150) int local150;
		if (arg8 == 0) {
			local169 = this.aClass53_17.anInt1511 + arg14;
		} else if (arg8 == 1) {
			local169 = (arg7 - this.aClass53_17.anInt1514 - this.aClass53_17.anInt1511 - (local66 + -1) * arg4) / 2 + this.aClass53_17.anInt1511 + arg14;
		} else if (arg8 == 2) {
			local169 = arg7 + arg14 - (local66 - 1) * arg4 - this.aClass53_17.anInt1514;
		} else {
			local150 = (arg7 - this.aClass53_17.anInt1514 - this.aClass53_17.anInt1511 - arg4 * (local66 + -1)) / (local66 - -1);
			if (local150 < 0) {
				local150 = 0;
			}
			arg4 += local150;
			local169 = this.aClass53_17.anInt1511 + arg14 + local150;
		}
		for (local150 = 0; local150 < local66; local150++) {
			if (arg3 == 0) {
				this.method7278(arg0, Static287.aStringArray33[local150], arg10, arg2, arg11, arg9, local169, arg15);
			} else if (arg3 == 1) {
				this.method7278(arg0, Static287.aStringArray33[local150], arg10 + (arg12 - this.aClass53_17.method1378(Static287.aStringArray33[local150])) / 2, arg2, arg11, arg9, local169, arg15);
			} else if (arg3 == 2) {
				this.method7278(arg0, Static287.aStringArray33[local150], arg12 + arg10 - this.aClass53_17.method1378(Static287.aStringArray33[local150]), arg2, arg11, arg9, local169, arg15);
			} else if (local150 == local66 - 1) {
				this.method7278(arg0, Static287.aStringArray33[local150], arg10, arg2, arg11, arg9, local169, arg15);
			} else {
				this.method7271(arg12, Static287.aStringArray33[local150]);
				this.method7278(arg0, Static287.aStringArray33[local150], arg10, arg2, arg11, arg9, local169, arg15);
				Static183.anInt5940 = 0;
			}
			local169 += arg4;
		}
		return local66;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IILjava/lang/String;III)V")
	public final void method7281(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7262(arg3, arg2);
			this.method7278(null, arg1, arg4, 0, null, null, arg0, 0);
		}
	}
}
