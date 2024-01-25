import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class62 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Lclient!ha;")
	private final Class5 aClass5_16;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!qt;")
	private final Class282 aClass282_14;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!qt;)V")
	protected Class62(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class282 arg1) {
		this.aClass5_16 = arg0;
		this.aClass282_14 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method8358(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method8372(-16777216, arg1);
		@Pc(22) int local22 = arg4.length();
		@Pc(25) int[] local25 = new int[local22];
		@Pc(28) int[] local28 = new int[local22];
		for (@Pc(30) int local30 = 0; local30 < local22; local30++) {
			local25[local30] = (int) (Math.sin((double) local30 / 5.0D + (double) arg2 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method8365(arg4, local25, null, arg3, local28, null, arg0 - this.aClass282_14.method7135(arg4) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method8359(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static383.anInt7182 = Static383.anInt7182 & 0xFF000000 | Static213.method3613(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static383.anInt7182 = Static141.anInt2837 & 0xFFFFFF | Static383.anInt7182 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static383.anInt7182 = Static213.method3613(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static383.anInt7182 = Static141.anInt2837;
			} else if (arg0.startsWith("str=")) {
				Static293.anInt5183 = Static383.anInt7182 & 0xFF000000 | Static213.method3613(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static293.anInt5183 = Static383.anInt7182 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static293.anInt5183 = -1;
			} else if (arg0.startsWith("u=")) {
				Static97.anInt2233 = Static383.anInt7182 & 0xFF000000 | Static213.method3613(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static97.anInt2233 = Static383.anInt7182 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static97.anInt2233 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static640.anInt10180 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static640.anInt10180 = Static383.anInt7182 & 0xFF000000 | Static213.method3613(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static640.anInt10180 = Static383.anInt7182 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static640.anInt10180 = Static513.anInt8880;
			} else if (arg0.equals("br")) {
				this.method8372(Static513.anInt8880, Static141.anInt2837);
			}
		} catch (@Pc(185) Exception local185) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!td;I[IILjava/lang/String;III)V")
	public final void method8360(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		if (arg4 != null) {
			this.method8372(0, arg1);
			this.method8368(arg0, 0, arg4, null, arg5, arg3, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!td;BIILjava/lang/String;I[IILjava/util/Random;I)I")
	public final int method8361(@OriginalArg(0) Class24[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(6) int[] arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) int arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg5.setSeed((long) arg1);
		@Pc(29) int local29 = (arg5.nextInt() & 0x1F) + 192;
		this.method8372((local29 | 0x0) << 24, local29 << 24 | 0xFFFFFF);
		@Pc(49) int local49 = arg2.length();
		@Pc(52) int[] local52 = new int[local49];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local52[local56] = local54;
			if ((arg5.nextInt() & 0x3) == 0) {
				local54++;
			}
		}
		this.method8365(arg2, local52, arg0, arg6, null, arg3, arg4);
		return local54;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;IIII[Lclient!td;I[I[IIII)I")
	public final int method8362(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Random arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class24[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg3.setSeed((long) arg5);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method8372(local20 << 24 | arg12 & 0xFFFFFF, local20 << 24 | arg6 & 0xFFFFFF);
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(73) int local73 = arg8;
		@Pc(79) int local79 = this.aClass282_14.anInt8303 + arg13;
		if (arg11 == 1) {
			local79 += (arg0 - this.aClass282_14.anInt8306 - this.aClass282_14.anInt8303) / 2;
		} else if (arg11 == 2) {
			local79 = arg13 + arg0 - this.aClass282_14.anInt8306;
		}
		@Pc(116) int local116 = -1;
		if (arg4 == 1) {
			local116 = this.aClass282_14.method7135(arg1) + local45;
			local73 = arg8 + (arg2 - local116) / 2;
		} else if (arg4 == 2) {
			local116 = this.aClass282_14.method7135(arg1) + local45;
			local73 = arg8 + arg2 - local116;
		}
		this.method8365(arg1, local43, arg7, local79, null, arg10, local73);
		if (arg9 != null) {
			if (local116 == -1) {
				local116 = this.aClass282_14.method7135(arg1) + local45;
			}
			arg9[0] = local73;
			arg9[3] = this.aClass282_14.anInt8303 + this.aClass282_14.anInt8306;
			arg9[2] = local116;
			arg9[1] = local79 - this.aClass282_14.anInt8303;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
	public final void method8363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method8372(arg0, arg4);
			this.method8368(null, 0, arg3, null, arg2 - this.aClass282_14.method7135(arg3) / 2, arg1, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;[I[Lclient!td;I[I[II)V")
	private void method8365(@OriginalArg(1) String arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class24[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg3 - this.aClass282_14.anInt8309;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = arg0.length();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			@Pc(54) char local54 = (char) (Static270.method4452(arg0.charAt(local43)) & 0xFF);
			if (local54 == '<') {
				local34 = local43;
			} else {
				@Pc(136) int local136;
				@Pc(146) int local146;
				if (local54 == '>' && local34 != -1) {
					@Pc(74) String local74 = arg0.substring(local34 + 1, local43);
					local34 = -1;
					if (local74.equals("lt")) {
						local54 = '<';
					} else if (local74.equals("gt")) {
						local54 = '>';
					} else if (local74.equals("nbsp")) {
						local54 = ' ';
					} else if (local74.equals("shy")) {
						local54 = '\u00ad';
					} else if (local74.equals("times")) {
						local54 = '×';
					} else if (local74.equals("euro")) {
						local54 = '€';
					} else if (local74.equals("copy")) {
						local54 = '©';
					} else {
						if (!local74.equals("reg")) {
							if (local74.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local136 = 0;
									} else {
										local136 = arg1[local38];
									}
									if (arg4 == null) {
										local146 = 0;
									} else {
										local146 = arg4[local38];
									}
									local38++;
									@Pc(159) int local159 = Static134.method2553(local74.substring(4));
									@Pc(163) Class24 local163 = arg2[local159];
									@Pc(172) int local172 = arg5 == null ? local163.method8573() : arg5[local159];
									local163.method8570(arg6 + local136, -local172 + local11 + this.aClass282_14.anInt8309 + local146, 1, 0, 1);
									local36 = -1;
									arg6 += arg2[local159].method8576();
								} catch (@Pc(202) Exception local202) {
								}
							} else {
								this.method8359(local74);
							}
							continue;
						}
						local54 = '®';
					}
				}
				if (local34 == -1) {
					if (local36 != -1) {
						arg6 += this.aClass282_14.method7134(local36, local54);
					}
					@Pc(241) int local241;
					if (arg1 == null) {
						local241 = 0;
					} else {
						local241 = arg1[local38];
					}
					if (arg4 == null) {
						local136 = 0;
					} else {
						local136 = arg4[local38];
					}
					local38++;
					if (local54 != ' ') {
						if ((Static640.anInt10180 & 0xFF000000) != 0) {
							this.fa(local54, arg6 + local241 + 1, local11 + (1 - -local136), Static640.anInt10180, true);
						}
						this.fa(local54, local241 + arg6, local11 - -local136, Static383.anInt7182, false);
					} else if (Static60.anInt1599 > 0) {
						Static594.anInt9735 += Static60.anInt1599;
						arg6 += Static594.anInt9735 >> 8;
						Static594.anInt9735 &= 0xFF;
					}
					local146 = this.aClass282_14.method7140(local54);
					if (Static293.anInt5183 != -1) {
						this.aClass5_16.method7508((int) ((double) this.aClass282_14.anInt8309 * 0.7D) + local11, local146, arg6, Static293.anInt5183);
					}
					if (Static97.anInt2233 != -1) {
						this.aClass5_16.method7508(this.aClass282_14.anInt8309 + local11, local146, arg6, Static97.anInt2233);
					}
					local36 = local54;
					arg6 += local146;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
	public final void method8366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method8372(arg0, arg4);
			this.method8368(null, 0, arg2, null, arg1 - this.aClass282_14.method7135(arg2), arg3, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	private void method8367(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local15++;
			}
		}
		if (local15 > 0) {
			Static60.anInt1599 = (arg1 - this.aClass282_14.method7135(arg0) << 8) / local15;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!td;IILjava/lang/String;Lclient!aa;III[I)V")
	private void method8368(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(16) int local16 = arg5 - this.aClass282_14.anInt8309;
		@Pc(18) int local18 = -1;
		@Pc(20) int local20 = -1;
		@Pc(23) int local23 = arg2.length();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(36) char local36 = (char) (Static270.method4452(arg2.charAt(local25)) & 0xFF);
			if (local36 == '<') {
				local18 = local25;
			} else {
				if (local36 == '>' && local18 != -1) {
					@Pc(59) String local59 = arg2.substring(local18 + 1, local25);
					local18 = -1;
					if (local59.equals("lt")) {
						local36 = '<';
					} else if (local59.equals("gt")) {
						local36 = '>';
					} else if (local59.equals("nbsp")) {
						local36 = ' ';
					} else if (local59.equals("shy")) {
						local36 = '\u00ad';
					} else if (local59.equals("times")) {
						local36 = '×';
					} else if (local59.equals("euro")) {
						local36 = '€';
					} else if (local59.equals("copy")) {
						local36 = '©';
					} else {
						if (!local59.equals("reg")) {
							if (local59.startsWith("img=")) {
								try {
									@Pc(129) int local129 = Static134.method2553(local59.substring(4));
									@Pc(133) Class24 local133 = arg0[local129];
									@Pc(142) int local142 = arg7 == null ? local133.method8573() : arg7[local129];
									if ((Static383.anInt7182 & 0xFF000000) == -16777216) {
										local133.method8570(arg4, this.aClass282_14.anInt8309 + local16 - local142, 1, 0, 1);
									} else {
										local133.method8570(arg4, local16 + this.aClass282_14.anInt8309 - local142, 0, Static383.anInt7182 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg4 += arg0[local129].method8576();
									local20 = -1;
								} catch (@Pc(194) Exception local194) {
								}
							} else {
								this.method8359(local59);
							}
							continue;
						}
						local36 = '®';
					}
				}
				if (local18 == -1) {
					if (local20 != -1) {
						arg4 += this.aClass282_14.method7134(local20, local36);
					}
					if (local36 == ' ') {
						if (Static60.anInt1599 > 0) {
							Static594.anInt9735 += Static60.anInt1599;
							arg4 += Static594.anInt9735 >> 8;
							Static594.anInt9735 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static640.anInt10180 & 0xFF000000) != 0) {
							this.fa(local36, arg4 + 1, local16 - -1, Static640.anInt10180, true);
						}
						this.fa(local36, arg4, local16, Static383.anInt7182, false);
					} else {
						if ((Static640.anInt10180 & 0xFF000000) != 0) {
							this.method8371(local36, arg4 + 1, local16 + 1, Static640.anInt10180, true, arg3, arg6, arg1);
						}
						this.method8371(local36, arg4, local16, Static383.anInt7182, false, arg3, arg6, arg1);
					}
					@Pc(311) int local311 = this.aClass282_14.method7140(local36);
					if (Static293.anInt5183 != -1) {
						this.aClass5_16.method7508(local16 + (int) ((double) this.aClass282_14.anInt8309 * 0.7D), local311, arg4, Static293.anInt5183);
					}
					if (Static97.anInt2233 != -1) {
						this.aClass5_16.method7508(this.aClass282_14.anInt8309 + local16 + 1, local311, arg4, Static97.anInt2233);
					}
					local20 = local36;
					arg4 += local311;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;IZI[ILclient!aa;IIII[Lclient!td;II)I")
	public final int method8369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class1 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class24[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg4 == null) {
			return 0;
		}
		this.method8372(arg2, arg10);
		if (arg12 == 0) {
			arg12 = this.aClass282_14.anInt8309;
		}
		@Pc(47) int[] local47;
		if (arg12 + this.aClass282_14.anInt8306 + this.aClass282_14.anInt8303 > arg5 && arg12 + arg12 > arg5) {
			local47 = null;
		} else {
			local47 = new int[] { arg14 };
		}
		@Pc(60) int local60 = this.aClass282_14.method7136(local47, arg4, Static512.aStringArray33, arg13);
		if (arg6 == -1) {
			arg6 = arg5 / arg12;
			if (arg6 <= 0) {
				arg6 = 1;
			}
		}
		if (arg6 > 0 && local60 >= arg6) {
			Static512.aStringArray33[arg6 - 1] = this.aClass282_14.method7142(arg14, arg13, Static512.aStringArray33[arg6 - 1]);
			local60 = arg6;
		}
		if (arg15 == 3 && local60 == 1) {
			arg15 = 1;
		}
		@Pc(162) int local162;
		@Pc(146) int local146;
		if (arg15 == 0) {
			local162 = arg9 + this.aClass282_14.anInt8303;
		} else if (arg15 == 1) {
			local162 = this.aClass282_14.anInt8303 + arg9 + (arg5 + (-this.aClass282_14.anInt8303 - this.aClass282_14.anInt8306) + -(arg12 * (local60 + -1))) / 2;
		} else if (arg15 == 2) {
			local162 = arg5 + arg9 - this.aClass282_14.anInt8306 - (local60 + -1) * arg12;
		} else {
			local146 = (arg5 - this.aClass282_14.anInt8303 - this.aClass282_14.anInt8306 - (local60 - 1) * arg12) / (local60 - -1);
			if (local146 < 0) {
				local146 = 0;
			}
			arg12 += local146;
			local162 = local146 + this.aClass282_14.anInt8303 + arg9;
		}
		for (local146 = 0; local146 < local60; local146++) {
			if (arg1 == 0) {
				this.method8368(arg13, arg11, Static512.aStringArray33[local146], arg8, arg0, local162, arg3, arg7);
			} else if (arg1 == 1) {
				this.method8368(arg13, arg11, Static512.aStringArray33[local146], arg8, arg0 + (arg14 - this.aClass282_14.method7135(Static512.aStringArray33[local146])) / 2, local162, arg3, arg7);
			} else if (arg1 == 2) {
				this.method8368(arg13, arg11, Static512.aStringArray33[local146], arg8, arg14 + arg0 - this.aClass282_14.method7135(Static512.aStringArray33[local146]), local162, arg3, arg7);
			} else if (local146 == local60 - 1) {
				this.method8368(arg13, arg11, Static512.aStringArray33[local146], arg8, arg0, local162, arg3, arg7);
			} else {
				this.method8367(Static512.aStringArray33[local146], arg14);
				this.method8368(arg13, arg11, Static512.aStringArray33[local146], arg8, arg0, local162, arg3, arg7);
				Static60.anInt1599 = 0;
			}
			local162 += arg12;
		}
		return local60;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method8370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method8372(-16777216, arg3);
		@Pc(16) int local16 = arg4.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg1 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method8365(arg4, null, null, arg0, local19, null, arg2 - this.aClass282_14.method7135(arg4) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8371(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	private void method8372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static594.anInt9735 = 0;
		Static97.anInt2233 = -1;
		Static141.anInt2837 = arg1;
		Static383.anInt7182 = arg1;
		Static293.anInt5183 = -1;
		Static60.anInt1599 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static513.anInt8880 = arg0;
		Static640.anInt10180 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public final void method8373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method8372(arg0, arg1);
			this.method8368(null, 0, arg3, null, arg2, arg4, 0, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public final void method8374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method8372(-16777216, arg5);
		@Pc(18) double local18 = 7.0D - (double) arg1 / 8.0D;
		if (local18 < 0.0D) {
			local18 = 0.0D;
		}
		@Pc(27) int local27 = arg2.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(32) int local32 = 0; local32 < local27; local32++) {
			local30[local32] = (int) (local18 * Math.sin((double) local32 / 1.5D + (double) arg0));
		}
		this.method8365(arg2, null, null, arg3, local30, null, arg4 - this.aClass282_14.method7135(arg2) / 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!td;IB[IIIIIIIILclient!aa;I)I")
	public final int method8375(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class1 arg13, @OriginalArg(15) int arg14) {
		return this.method8369(arg12, arg14, arg0, arg10, arg1, arg9, 0, arg5, arg13, arg6, arg4, arg8, arg7, arg3, arg11, arg2);
	}
}
