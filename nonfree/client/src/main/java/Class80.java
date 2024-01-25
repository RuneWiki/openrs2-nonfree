import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class80 {

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!pu;")
	private final Class244 aClass244_11;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!qa;")
	private final Class42 aClass42_12;

	static {
		new Class88("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!pu;)V")
	protected Class80(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class244 arg1) {
		this.aClass244_11 = arg1;
		this.aClass42_12 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([II[III[Lclient!ha;ILjava/util/Random;IIIIIILjava/lang/String;)I")
	public final int method7763(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class84[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) String arg13) {
		if (arg13 == null) {
			return 0;
		}
		arg6.setSeed((long) arg9);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method7781(arg12 & 0xFFFFFF | local20 << 24, arg11 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg13.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg6.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(78) int local78 = arg5;
		@Pc(84) int local84 = arg2 + this.aClass244_11.anInt7376;
		@Pc(86) int local86 = -1;
		if (arg10 == 1) {
			local84 += (arg3 - this.aClass244_11.anInt7376 - this.aClass244_11.anInt7388) / 2;
		} else if (arg10 == 2) {
			local84 = arg3 + arg2 - this.aClass244_11.anInt7388;
		}
		if (arg8 == 1) {
			local86 = local45 + this.aClass244_11.method6147(arg13);
			local78 = arg5 + (arg7 - local86) / 2;
		} else if (arg8 == 2) {
			local86 = this.aClass244_11.method6147(arg13) + local45;
			local78 = arg5 + arg7 - local86;
		}
		this.method7765(arg4, local84, local78, null, arg13, local43, arg1);
		if (arg0 != null) {
			if (local86 == -1) {
				local86 = local45 + this.aClass244_11.method6147(arg13);
			}
			arg0[2] = local86;
			arg0[1] = local84 - this.aClass244_11.anInt7376;
			arg0[0] = local78;
			arg0[3] = this.aClass244_11.anInt7388 + this.aClass244_11.anInt7376;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;I[ILjava/lang/String;IILclient!pa;II)V")
	private void method7764(@OriginalArg(0) Class84[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg6 - this.aClass244_11.anInt7380;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(29) int local29 = arg3.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(42) char local42 = (char) (Static253.method4366(arg3.charAt(local31)) & 0xFF);
			if (local42 == '<') {
				local13 = local31;
			} else {
				if (local42 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg3.substring(local13 + 1, local31);
					local13 = -1;
					if (local64.equals("lt")) {
						local42 = '<';
					} else if (local64.equals("gt")) {
						local42 = '>';
					} else if (local64.equals("nbsp")) {
						local42 = ' ';
					} else if (local64.equals("shy")) {
						local42 = '\u00ad';
					} else if (local64.equals("times")) {
						local42 = '×';
					} else if (local64.equals("euro")) {
						local42 = '€';
					} else if (local64.equals("copy")) {
						local42 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									@Pc(126) int local126 = Static467.method7015(local64.substring(4));
									@Pc(130) Class84 local130 = arg0[local126];
									@Pc(139) int local139 = arg2 == null ? local130.ma() : arg2[local126];
									if ((-16777216 & Static390.anInt7421) == -16777216) {
										local130.DA(arg1, this.aClass244_11.anInt7380 + local7 - local139, 1, 0, 1);
									} else {
										local130.DA(arg1, local7 + this.aClass244_11.anInt7380 - local139, 0, Static390.anInt7421 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg1 += arg0[local126].EA();
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method7780(local64);
							}
							continue;
						}
						local42 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass244_11.method6154(local15, local42);
					}
					if (local42 == ' ') {
						if (Static447.anInt8149 > 0) {
							Static398.anInt7493 += Static447.anInt8149;
							arg1 += Static398.anInt7493 >> 8;
							Static398.anInt7493 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static360.anInt6728 & 0xFF000000) != 0) {
							this.HA(local42, arg1 + 1, local7 + 1, Static360.anInt6728, true);
						}
						this.HA(local42, arg1, local7, Static390.anInt7421, false);
					} else {
						if ((Static360.anInt6728 & 0xFF000000) != 0) {
							this.method7777(local42, arg1 + 1, local7 + 1, Static360.anInt6728, true, arg5, arg7, arg4);
						}
						this.method7777(local42, arg1, local7, Static390.anInt7421, false, arg5, arg7, arg4);
					}
					@Pc(315) int local315 = this.aClass244_11.method6155(local42);
					if (Static30.anInt9645 != -1) {
						this.aClass42_12.method5827(Static30.anInt9645, local315, (int) ((double) this.aClass244_11.anInt7380 * 0.7D) + local7, arg1);
					}
					if (Static426.anInt6105 != -1) {
						this.aClass42_12.method5827(Static426.anInt6105, local315, local7 + this.aClass244_11.anInt7380 + 1, arg1);
					}
					local15 = local42;
					arg1 += local315;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;II[ILjava/lang/String;[I[II)V")
	private void method7765(@OriginalArg(0) Class84[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg1 - this.aClass244_11.anInt7380;
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg4.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(37) char local37 = (char) (Static253.method4366(arg4.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				@Pc(119) int local119;
				@Pc(127) int local127;
				if (local37 == '>' && local13 != -1) {
					@Pc(59) String local59 = arg4.substring(local13 + 1, local26);
					local13 = -1;
					if (local59.equals("lt")) {
						local37 = '<';
					} else if (local59.equals("gt")) {
						local37 = '>';
					} else if (local59.equals("nbsp")) {
						local37 = ' ';
					} else if (local59.equals("shy")) {
						local37 = '\u00ad';
					} else if (local59.equals("times")) {
						local37 = '×';
					} else if (local59.equals("euro")) {
						local37 = '€';
					} else if (local59.equals("copy")) {
						local37 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local119 = 0;
									} else {
										local119 = arg5[local21];
									}
									if (arg3 == null) {
										local127 = 0;
									} else {
										local127 = arg3[local21];
									}
									local21++;
									@Pc(142) int local142 = Static467.method7015(local59.substring(4));
									@Pc(146) Class84 local146 = arg0[local142];
									@Pc(155) int local155 = arg6 == null ? local146.ma() : arg6[local142];
									local146.DA(local119 + arg2, -local155 + local7 - (-this.aClass244_11.anInt7380 + -local127), 1, 0, 1);
									arg2 += arg0[local142].EA();
									local19 = -1;
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method7780(local59);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local19 != -1) {
						arg2 += this.aClass244_11.method6154(local19, local37);
					}
					@Pc(229) int local229;
					if (arg5 == null) {
						local229 = 0;
					} else {
						local229 = arg5[local21];
					}
					if (arg3 == null) {
						local119 = 0;
					} else {
						local119 = arg3[local21];
					}
					if (local37 != ' ') {
						if ((Static360.anInt6728 & 0xFF000000) != 0) {
							this.HA(local37, arg2 + local229 + 1, local7 - (-local119 + -1), Static360.anInt6728, true);
						}
						this.HA(local37, local229 + arg2, local119 + local7, Static390.anInt7421, false);
					} else if (Static447.anInt8149 > 0) {
						Static398.anInt7493 += Static447.anInt8149;
						arg2 += Static398.anInt7493 >> 8;
						Static398.anInt7493 &= 0xFF;
					}
					local21++;
					local127 = this.aClass244_11.method6155(local37);
					if (Static30.anInt9645 != -1) {
						this.aClass42_12.method5827(Static30.anInt9645, local127, (int) ((double) this.aClass244_11.anInt7380 * 0.7D) + local7, arg2);
					}
					if (Static426.anInt6105 != -1) {
						this.aClass42_12.method5827(Static426.anInt6105, local127, this.aClass244_11.anInt7380 + local7, arg2);
					}
					arg2 += local127;
					local19 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method7766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7781(arg2, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(35) int local35 = 0; local35 < local16; local35++) {
			local19[local35] = (int) (Math.sin((double) local35 / 5.0D + (double) arg1 / 5.0D) * 5.0D);
			local22[local35] = (int) (Math.sin((double) local35 / 3.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method7765(null, arg0, arg4 - this.aClass244_11.method6147(arg3) / 2, local22, arg3, local19, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method7767(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; arg0.length() > local11; local11++) {
			@Pc(17) char local17 = arg0.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static447.anInt8149 = (arg1 - this.aClass244_11.method6147(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method7768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7781(arg1, -16777216);
		@Pc(16) int local16 = arg3.length();
		@Pc(24) int[] local24 = new int[local16];
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			local24[local26] = (int) (Math.sin((double) local26 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method7765(null, arg0, arg4 - this.aClass244_11.method6147(arg3) / 2, local24, arg3, null, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7781(arg4, arg0);
			this.method7764(null, arg1, null, arg2, 0, null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method7772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7781(arg1, arg4);
			this.method7764(null, arg2 - this.aClass244_11.method6147(arg3) / 2, null, arg3, 0, null, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZLjava/lang/String;[III[Lclient!ha;I)V")
	public final void method7773(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class84[] arg4, @OriginalArg(7) int arg5) {
		if (arg1 != null) {
			this.method7781(arg0, 0);
			this.method7764(arg4, arg5, arg2, arg1, 0, null, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;IBIII)V")
	public final void method7774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method7781(arg0, -16777216);
		@Pc(29) double local29 = 7.0D - (double) arg4 / 8.0D;
		if (local29 < 0.0D) {
			local29 = 0.0D;
		}
		@Pc(38) int local38 = arg2.length();
		@Pc(41) int[] local41 = new int[local38];
		for (@Pc(43) int local43 = 0; local43 < local38; local43++) {
			local41[local43] = (int) (Math.sin((double) local43 / 1.5D + (double) arg1) * local29);
		}
		this.method7765(null, arg5, arg3 - this.aClass244_11.method6147(arg2) / 2, local41, arg2, null, null);
	}

	@OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
	protected abstract void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;I[IIIIILclient!pa;IIIILjava/lang/String;IIII)I")
	public final int method7775(@OriginalArg(0) Class84[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class145 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method7781(arg4, arg1);
		if (arg12 == 0) {
			arg12 = this.aClass244_11.anInt7380;
		}
		@Pc(53) int[] local53;
		if (arg5 < this.aClass244_11.anInt7376 + this.aClass244_11.anInt7388 + arg12 && arg12 + arg12 > arg5) {
			local53 = null;
		} else {
			local53 = new int[] { arg7 };
		}
		@Pc(66) int local66 = this.aClass244_11.method6158(Static292.aStringArray31, arg0, arg11, local53);
		if (arg10 == -1) {
			arg10 = arg5 / arg12;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local66 >= arg10) {
			Static292.aStringArray31[arg10 - 1] = this.aClass244_11.method6152(Static292.aStringArray31[arg10 - 1], arg7, arg0);
			local66 = arg10;
		}
		if (arg15 == 3 && local66 == 1) {
			arg15 = 1;
		}
		@Pc(132) int local132;
		@Pc(213) int local213;
		if (arg15 == 0) {
			local132 = arg13 + this.aClass244_11.anInt7376;
		} else if (arg15 == 1) {
			local132 = (arg5 - (local66 - 1) * arg12 - this.aClass244_11.anInt7376 - this.aClass244_11.anInt7388) / 2 + arg13 + this.aClass244_11.anInt7376;
		} else if (arg15 == 2) {
			local132 = arg13 + arg5 - arg12 * (local66 - 1) - this.aClass244_11.anInt7388;
		} else {
			local213 = (arg5 - (local66 - 1) * arg12 - this.aClass244_11.anInt7388 - this.aClass244_11.anInt7376) / (local66 + 1);
			if (local213 < 0) {
				local213 = 0;
			}
			arg12 += local213;
			local132 = local213 + arg13 + this.aClass244_11.anInt7376;
		}
		for (local213 = 0; local213 < local66; local213++) {
			if (arg9 == 0) {
				this.method7764(arg0, arg3, arg2, Static292.aStringArray31[local213], arg8, arg6, local132, arg14);
			} else if (arg9 == 1) {
				this.method7764(arg0, arg3 + (arg7 - this.aClass244_11.method6147(Static292.aStringArray31[local213])) / 2, arg2, Static292.aStringArray31[local213], arg8, arg6, local132, arg14);
			} else if (arg9 == 2) {
				this.method7764(arg0, arg3 + arg7 - this.aClass244_11.method6147(Static292.aStringArray31[local213]), arg2, Static292.aStringArray31[local213], arg8, arg6, local132, arg14);
			} else if (local66 - 1 == local213) {
				this.method7764(arg0, arg3, arg2, Static292.aStringArray31[local213], arg8, arg6, local132, arg14);
			} else {
				this.method7767(Static292.aStringArray31[local213], arg7);
				this.method7764(arg0, arg3, arg2, Static292.aStringArray31[local213], arg8, arg6, local132, arg14);
				Static447.anInt8149 = 0;
			}
			local132 += arg12;
		}
		return local66;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIILjava/lang/String;ILjava/util/Random;[Lclient!ha;III)I")
	public final int method7776(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) Class84[] arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg4.setSeed((long) arg1);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method7781(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg4.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method7765(arg5, arg6, arg2, null, arg3, local43, arg0);
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	protected abstract void method7777(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILjava/lang/String;ILclient!pa;[Lclient!ha;IIIII[I)I")
	public final int method7778(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) String arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class145 arg5, @OriginalArg(9) Class84[] arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int[] arg12) {
		return this.method7775(arg6, arg11, arg12, arg8, arg0, arg9, arg5, arg10, arg2, 1, 0, arg3, 0, arg1, arg4, arg7);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public final void method7779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method7781(arg1, -1);
			this.method7764(null, arg0 - this.aClass244_11.method6147(arg3), null, arg3, 0, null, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method7780(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static390.anInt7421 = Static390.anInt7421 & 0xFF000000 | Static119.method2466(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static390.anInt7421 = Static539.anInt9578 & 0xFFFFFF | Static390.anInt7421 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static390.anInt7421 = Static119.method2466(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static390.anInt7421 = Static539.anInt9578;
			} else if (arg0.startsWith("str=")) {
				Static30.anInt9645 = Static390.anInt7421 & 0xFF000000 | Static119.method2466(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static30.anInt9645 = Static390.anInt7421 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static30.anInt9645 = -1;
			} else if (arg0.startsWith("u=")) {
				Static426.anInt6105 = Static390.anInt7421 & 0xFF000000 | Static119.method2466(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static426.anInt6105 = Static390.anInt7421 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static426.anInt6105 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static360.anInt6728 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static360.anInt6728 = Static390.anInt7421 & 0xFF000000 | Static119.method2466(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static360.anInt6728 = Static390.anInt7421 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static360.anInt6728 = Static40.anInt811;
			} else if (arg0.equals("br")) {
				this.method7781(Static539.anInt9578, Static40.anInt811);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)V")
	private void method7781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static30.anInt9645 = -1;
		Static426.anInt6105 = -1;
		Static539.anInt9578 = arg0;
		Static390.anInt7421 = arg0;
		Static447.anInt8149 = 0;
		Static398.anInt7493 = 0;
		Static40.anInt811 = arg1;
		Static360.anInt6728 = arg1;
	}
}
