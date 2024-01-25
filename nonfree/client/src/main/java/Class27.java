import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class27 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Lclient!qa;")
	private final Class9 aClass9_13;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!lg;")
	private final Class177 aClass177_11;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!lg;)V")
	protected Class27(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class177 arg1) {
		this.aClass9_13 = arg0;
		this.aClass177_11 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ha;IIIII[IILclient!pa;IIBIIILjava/lang/String;)I")
	public final int method7806(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class23 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) String arg12) {
		return this.method7820(arg12, 1, arg7, arg9, arg2, arg8, arg4, 0, arg5, arg1, 0, arg3, arg11, arg6, arg10, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/util/Random;[Lclient!ha;II[ILjava/lang/String;III)I")
	public final int method7807(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) Class12[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) String arg5, @OriginalArg(9) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg1.setSeed((long) arg6);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method7817(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(55) int local55 = 0; local55 < local40; local55++) {
			local43[local55] = local45;
			if ((arg1.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method7809(local43, arg0, arg2, arg5, null, arg3, arg4);
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
	protected abstract void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([II[Lclient!ha;Ljava/lang/String;[III[I)V")
	private void method7809(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(5) int local5 = arg1 - this.aClass177_11.anInt5367;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg3.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static356.method5624(arg3.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local11 = local24;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				if (local34 == '>' && local11 != -1) {
					@Pc(58) String local58 = arg3.substring(local11 + 1, local24);
					local11 = -1;
					if (local58.equals("lt")) {
						local34 = '<';
					} else if (local58.equals("gt")) {
						local34 = '>';
					} else if (local58.equals("nbsp")) {
						local34 = ' ';
					} else if (local58.equals("shy")) {
						local34 = '\u00ad';
					} else if (local58.equals("times")) {
						local34 = '×';
					} else if (local58.equals("euro")) {
						local34 = '€';
					} else if (local58.equals("copy")) {
						local34 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local117 = 0;
									} else {
										local117 = arg0[local15];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local15];
									}
									local15++;
									@Pc(138) int local138 = Static485.method7022(local58.substring(4));
									@Pc(142) Class12 local142 = arg2[local138];
									@Pc(151) int local151 = arg6 == null ? local142.ma() : arg6[local138];
									local142.DA(arg5 + local117, this.aClass177_11.anInt5367 + local5 + -local151 + local126, 1, 0, 1);
									local13 = -1;
									arg5 += arg2[local138].EA();
								} catch (@Pc(181) Exception local181) {
								}
							} else {
								this.method7810(local58);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg5 += this.aClass177_11.method4670(local34, local13);
					}
					@Pc(216) int local216;
					if (arg0 == null) {
						local216 = 0;
					} else {
						local216 = arg0[local15];
					}
					if (arg4 == null) {
						local117 = 0;
					} else {
						local117 = arg4[local15];
					}
					if (local34 != ' ') {
						if ((Static230.anInt4568 & 0xFF000000) != 0) {
							this.HA(local34, local216 + arg5 + 1, local117 + local5 - -1, Static230.anInt4568, true);
						}
						this.HA(local34, local216 + arg5, local5 + local117, Static82.anInt2166, false);
					} else if (Static20.anInt870 > 0) {
						Static500.anInt8479 += Static20.anInt870;
						arg5 += Static500.anInt8479 >> 8;
						Static500.anInt8479 &= 0xFF;
					}
					local15++;
					local126 = this.aClass177_11.method4672(local34);
					if (Static452.anInt7572 != -1) {
						this.aClass9_13.method7581(arg5, local126, Static452.anInt7572, (int) ((double) this.aClass177_11.anInt5367 * 0.7D) + local5);
					}
					if (Static256.anInt4973 != -1) {
						this.aClass9_13.method7581(arg5, local126, Static256.anInt4973, local5 + this.aClass177_11.anInt5367);
					}
					arg5 += local126;
					local13 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method7810(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static82.anInt2166 = Static82.anInt2166 & 0xFF000000 | Static360.method7848(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static82.anInt2166 = Static188.anInt3983 & 0xFFFFFF | Static82.anInt2166 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static82.anInt2166 = Static360.method7848(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static82.anInt2166 = Static188.anInt3983;
			} else if (arg0.startsWith("str=")) {
				Static452.anInt7572 = Static82.anInt2166 & 0xFF000000 | Static360.method7848(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static452.anInt7572 = Static82.anInt2166 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static452.anInt7572 = -1;
			} else if (arg0.startsWith("u=")) {
				Static256.anInt4973 = Static82.anInt2166 & 0xFF000000 | Static360.method7848(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static256.anInt4973 = Static82.anInt2166 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static256.anInt4973 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static230.anInt4568 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static230.anInt4568 = Static82.anInt2166 & 0xFF000000 | Static360.method7848(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static230.anInt4568 = Static82.anInt2166 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static230.anInt4568 = Static352.anInt3841;
			} else if (arg0.equals("br")) {
				this.method7817(Static188.anInt3983, Static352.anInt3841);
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method7811(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7817(arg3, -16777216);
		@Pc(18) double local18 = 7.0D - (double) arg4 / 8.0D;
		if (local18 < 0.0D) {
			local18 = 0.0D;
		}
		@Pc(27) int local27 = arg0.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(32) int local32 = 0; local32 < local27; local32++) {
			local30[local32] = (int) (local18 * Math.sin((double) arg2 + (double) local32 / 1.5D));
		}
		this.method7809(null, arg1, null, arg0, local30, arg5 - this.aClass177_11.method4664(arg0) / 2, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	protected abstract void method7812(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class23 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!pa;Ljava/lang/String;I[III[Lclient!ha;ZI)V")
	private void method7813(@OriginalArg(0) Class23 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class12[] arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg7 - this.aClass177_11.anInt5367;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(31) char local31 = (char) (Static356.method5624(arg1.charAt(local18)) & 0xFF);
			if (local31 == '<') {
				local11 = local18;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(53) String local53 = arg1.substring(local11 + 1, local18);
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
							if (local53.startsWith("img=")) {
								try {
									@Pc(103) int local103 = Static485.method7022(local53.substring(4));
									@Pc(107) Class12 local107 = arg6[local103];
									@Pc(116) int local116 = arg3 == null ? local107.ma() : arg3[local103];
									if ((Static82.anInt2166 & 0xFF000000) == -16777216) {
										local107.DA(arg5, local9 + this.aClass177_11.anInt5367 - local116, 1, 0, 1);
									} else {
										local107.DA(arg5, local9 + this.aClass177_11.anInt5367 - local116, 0, Static82.anInt2166 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local13 = -1;
									arg5 += arg6[local103].EA();
								} catch (@Pc(168) Exception local168) {
								}
							} else {
								this.method7810(local53);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg5 += this.aClass177_11.method4670(local31, local13);
					}
					if (local31 == ' ') {
						if (Static20.anInt870 > 0) {
							Static500.anInt8479 += Static20.anInt870;
							arg5 += Static500.anInt8479 >> 8;
							Static500.anInt8479 &= 0xFF;
						}
					} else if (arg0 == null) {
						if ((Static230.anInt4568 & 0xFF000000) != 0) {
							this.HA(local31, arg5 + 1, local9 + 1, Static230.anInt4568, true);
						}
						this.HA(local31, arg5, local9, Static82.anInt2166, false);
					} else {
						if ((Static230.anInt4568 & 0xFF000000) != 0) {
							this.method7812(local31, arg5 + 1, local9 + 1, Static230.anInt4568, true, arg0, arg2, arg4);
						}
						this.method7812(local31, arg5, local9, Static82.anInt2166, false, arg0, arg2, arg4);
					}
					@Pc(291) int local291 = this.aClass177_11.method4672(local31);
					if (Static452.anInt7572 != -1) {
						this.aClass9_13.method7581(arg5, local291, Static452.anInt7572, local9 + (int) ((double) this.aClass177_11.anInt5367 * 0.7D));
					}
					if (Static256.anInt4973 != -1) {
						this.aClass9_13.method7581(arg5, local291, Static256.anInt4973, this.aClass177_11.anInt5367 + local9 + 1);
					}
					arg5 += local291;
					local13 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; arg1.length() > local9; local9++) {
			@Pc(21) char local21 = arg1.charAt(local9);
			if (local21 == '<') {
				local7 = true;
			} else if (local21 == '>') {
				local7 = false;
			} else if (!local7 && local21 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static20.anInt870 = (arg0 - this.aClass177_11.method4664(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7815(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7817(arg1, -16777216);
		@Pc(14) int local14 = arg0.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local17[local22] = (int) (Math.sin((double) local22 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local20[local22] = (int) (Math.sin((double) local22 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method7809(local17, arg4, null, arg0, local20, arg2 - this.aClass177_11.method4664(arg0) / 2, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
	public final void method7816(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7817(arg3, arg2);
			this.method7813(null, arg1, 0, null, 0, arg0, null, arg4);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	private void method7817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static188.anInt3983 = arg0;
		Static82.anInt2166 = arg0;
		Static20.anInt870 = 0;
		Static256.anInt4973 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static500.anInt8479 = 0;
		Static452.anInt7572 = -1;
		Static352.anInt3841 = arg1;
		Static230.anInt4568 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public final void method7818(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 != null) {
			this.method7817(arg2, -1);
			this.method7813(null, arg0, 0, null, 0, arg3 - this.aClass177_11.method4664(arg0), null, arg1);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[IILjava/lang/String;II[II[Lclient!ha;IIIIILjava/util/Random;)I")
	public final int method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class12[] arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Random arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg13.setSeed((long) arg10);
		@Pc(20) int local20 = (arg13.nextInt() & 0x1F) + 192;
		this.method7817(local20 << 24 | arg9 & 0xFFFFFF, arg4 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg13.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(68) int local68 = arg12;
		@Pc(74) int local74 = this.aClass177_11.anInt5365 + arg5;
		if (arg2 == 1) {
			local74 += (arg11 - this.aClass177_11.anInt5365 - this.aClass177_11.anInt5368) / 2;
		} else if (arg2 == 2) {
			local74 = arg11 + arg5 - this.aClass177_11.anInt5368;
		}
		@Pc(115) int local115 = -1;
		if (arg0 == 1) {
			local115 = local45 + this.aClass177_11.method4664(arg3);
			local68 = arg12 + (arg7 - local115) / 2;
		} else if (arg0 == 2) {
			local115 = local45 + this.aClass177_11.method4664(arg3);
			local68 = arg12 + arg7 - local115;
		}
		this.method7809(local43, local74, arg8, arg3, null, local68, arg1);
		if (arg6 != null) {
			if (local115 == -1) {
				local115 = local45 + this.aClass177_11.method4664(arg3);
			}
			arg6[1] = local74 - this.aClass177_11.anInt5365;
			arg6[2] = local115;
			arg6[0] = local68;
			arg6[3] = this.aClass177_11.anInt5365 + this.aClass177_11.anInt5368;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ILclient!pa;IIIII[IIIIIII[Lclient!ha;I)I")
	public final int method7820(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) Class12[] arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7817(arg5, arg6);
		if (arg7 == 0) {
			arg7 = this.aClass177_11.anInt5367;
		}
		@Pc(49) int[] local49;
		if (arg4 < arg7 + this.aClass177_11.anInt5365 + this.aClass177_11.anInt5368 && arg7 + arg7 > arg4) {
			local49 = null;
		} else {
			local49 = new int[] { arg9 };
		}
		if (arg10 == -1) {
			arg10 = arg4 / arg7;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		@Pc(75) int local75 = this.aClass177_11.method4667(arg15, Static405.aStringArray39, local49, arg0);
		if (arg10 > 0 && arg10 <= local75) {
			Static405.aStringArray39[arg10 - 1] = this.aClass177_11.method4665(Static405.aStringArray39[arg10 - 1], arg15, arg9);
			local75 = arg10;
		}
		if (arg3 == 3 && local75 == 1) {
			arg3 = 1;
		}
		@Pc(155) int local155;
		@Pc(142) int local142;
		if (arg3 == 0) {
			local155 = arg12 + this.aClass177_11.anInt5365;
		} else if (arg3 == 1) {
			local155 = arg12 + this.aClass177_11.anInt5365 + (arg4 - this.aClass177_11.anInt5365 - this.aClass177_11.anInt5368 - arg7 * (local75 - 1)) / 2;
		} else if (arg3 == 2) {
			local155 = arg4 + arg12 - arg7 * (local75 - 1) - this.aClass177_11.anInt5368;
		} else {
			local142 = (arg4 - this.aClass177_11.anInt5365 - this.aClass177_11.anInt5368 - (local75 - 1) * arg7) / (local75 + 1);
			if (local142 < 0) {
				local142 = 0;
			}
			local155 = this.aClass177_11.anInt5365 + arg12 + local142;
			arg7 += local142;
		}
		for (local142 = 0; local142 < local75; local142++) {
			if (arg1 == 0) {
				this.method7813(arg2, Static405.aStringArray39[local142], arg14, arg8, arg11, arg13, arg15, local155);
			} else if (arg1 == 1) {
				this.method7813(arg2, Static405.aStringArray39[local142], arg14, arg8, arg11, arg13 + (arg9 - this.aClass177_11.method4664(Static405.aStringArray39[local142])) / 2, arg15, local155);
			} else if (arg1 == 2) {
				this.method7813(arg2, Static405.aStringArray39[local142], arg14, arg8, arg11, arg13 + arg9 - this.aClass177_11.method4664(Static405.aStringArray39[local142]), arg15, local155);
			} else if (local75 - 1 == local142) {
				this.method7813(arg2, Static405.aStringArray39[local142], arg14, arg8, arg11, arg13, arg15, local155);
			} else {
				this.method7814(arg9, Static405.aStringArray39[local142]);
				this.method7813(arg2, Static405.aStringArray39[local142], arg14, arg8, arg11, arg13, arg15, local155);
				Static20.anInt870 = 0;
			}
			local155 += arg7;
		}
		return local75;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7817(arg4, -16777216);
		@Pc(14) int local14 = arg3.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(24) int local24 = 0; local24 < local14; local24++) {
			local17[local24] = (int) (Math.sin((double) local24 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method7809(null, arg1, null, arg3, local17, arg0 - this.aClass177_11.method4664(arg3) / 2, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[Lclient!ha;BLjava/lang/String;[III)V")
	public final void method7822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12[] arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method7817(arg1, 0);
			this.method7813(null, arg3, 0, arg4, 0, arg5, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7817(arg2, arg4);
			this.method7813(null, arg1, 0, null, 0, arg3 - this.aClass177_11.method4664(arg1) / 2, null, arg0);
		}
	}
}
