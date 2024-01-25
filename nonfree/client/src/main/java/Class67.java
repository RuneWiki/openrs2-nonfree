import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public abstract class Class67 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!qa;")
	private final Class122 aClass122_12;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!pe;")
	private final Class232 aClass232_11;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!qa;Lclient!pe;)V")
	protected Class67(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class232 arg1) {
		this.aClass122_12 = arg0;
		this.aClass232_11 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public final void method7479(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7490(-16777216, arg4);
		@Pc(23) double local23 = 7.0D - (double) arg1 / 8.0D;
		if (local23 < 0.0D) {
			local23 = 0.0D;
		}
		@Pc(32) int local32 = arg0.length();
		@Pc(35) int[] local35 = new int[local32];
		for (@Pc(37) int local37 = 0; local37 < local32; local37++) {
			local35[local37] = (int) (Math.sin((double) local37 / 1.5D + (double) arg5) * local23);
		}
		this.method7486(arg0, arg2 - this.aClass232_11.method5432(arg0) / 2, arg3, null, local35, null, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII[I[Lclient!ha;BLjava/util/Random;Ljava/lang/String;I)I")
	public final int method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class2[] arg4, @OriginalArg(7) Random arg5, @OriginalArg(8) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg5.setSeed((long) arg2);
		@Pc(20) int local20 = (arg5.nextInt() & 0x1F) + 192;
		this.method7490((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg6.length();
		@Pc(51) int[] local51 = new int[local40];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local40; local55++) {
			local51[local55] = local53;
			if ((arg5.nextInt() & 0x3) == 0) {
				local53++;
			}
		}
		this.method7486(arg6, arg1, arg0, arg4, null, arg3, local51);
		return local53;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIILjava/lang/String;ILclient!pa;II[Lclient!ha;)V")
	private void method7481(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2[] arg7) {
		@Pc(11) int local11 = arg5 - this.aClass232_11.anInt6468;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static424.method6215(arg3.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg3.substring(local13 + 1, local20);
					local13 = -1;
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
									@Pc(123) int local123 = Static197.method7005(local53.substring(4));
									@Pc(127) Class2 local127 = arg7[local123];
									@Pc(136) int local136 = arg0 == null ? local127.ma() : arg0[local123];
									if ((Static97.anInt1968 & 0xFF000000) == -16777216) {
										local127.DA(arg2, local11 + this.aClass232_11.anInt6468 - local136, 1, 0, 1);
									} else {
										local127.DA(arg2, local11 + this.aClass232_11.anInt6468 - local136, 0, Static97.anInt1968 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg2 += arg7[local123].EA();
								} catch (@Pc(190) Exception local190) {
								}
							} else {
								this.method7496(local53);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass232_11.method5428(local15, local31);
					}
					if (local31 == ' ') {
						if (Static255.anInt4965 > 0) {
							Static479.anInt8663 += Static255.anInt4965;
							arg2 += Static479.anInt8663 >> 8;
							Static479.anInt8663 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static90.anInt1831 & 0xFF000000) != 0) {
							this.HA(local31, arg2 + 1, local11 + 1, Static90.anInt1831, true);
						}
						this.HA(local31, arg2, local11, Static97.anInt1968, false);
					} else {
						if ((Static90.anInt1831 & 0xFF000000) != 0) {
							this.method7494(local31, arg2 + 1, local11 + 1, Static90.anInt1831, true, arg4, arg6, arg1);
						}
						this.method7494(local31, arg2, local11, Static97.anInt1968, false, arg4, arg6, arg1);
					}
					@Pc(302) int local302 = this.aClass232_11.method5436(local31);
					if (Static427.anInt7490 != -1) {
						this.aClass122_12.method7259((int) ((double) this.aClass232_11.anInt6468 * 0.7D) + local11, Static427.anInt7490, arg2, local302);
					}
					if (Static340.anInt6095 != -1) {
						this.aClass122_12.method7259(this.aClass232_11.anInt6468 + local11 + 1, Static340.anInt6095, arg2, local302);
					}
					local15 = local31;
					arg2 += local302;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7490(-16777216, arg3);
		@Pc(22) int local22 = arg2.length();
		@Pc(25) int[] local25 = new int[local22];
		@Pc(28) int[] local28 = new int[local22];
		for (@Pc(30) int local30 = 0; local30 < local22; local30++) {
			local25[local30] = (int) (Math.sin((double) arg4 / 5.0D + (double) local30 / 5.0D) * 5.0D);
			local28[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7486(arg2, arg1 - this.aClass232_11.method5432(arg2) / 2, arg0, null, local28, null, local25);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[I[Lclient!ha;IIIBIILclient!pa;ILjava/lang/String;IIII)I")
	public final int method7483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class2[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class40 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg11 == null) {
			return 0;
		}
		this.method7490(arg12, arg0);
		if (arg5 == 0) {
			arg5 = this.aClass232_11.anInt6468;
		}
		@Pc(48) int[] local48;
		if (arg10 < this.aClass232_11.anInt6455 + this.aClass232_11.anInt6464 + arg5 && arg5 + arg5 > arg10) {
			local48 = null;
		} else {
			local48 = new int[] { arg7 };
		}
		@Pc(61) int local61 = this.aClass232_11.method5435(arg11, arg3, local48, Static49.aStringArray5);
		if (arg8 == -1) {
			arg8 = arg10 / arg5;
			if (arg8 <= 0) {
				arg8 = 1;
			}
		}
		if (arg8 > 0 && local61 >= arg8) {
			Static49.aStringArray5[arg8 - 1] = this.aClass232_11.method5427(arg3, arg7, Static49.aStringArray5[arg8 - 1]);
			local61 = arg8;
		}
		if (arg15 == 3 && local61 == 1) {
			arg15 = 1;
		}
		@Pc(144) int local144;
		@Pc(168) int local168;
		if (arg15 == 0) {
			local144 = this.aClass232_11.anInt6455 + arg14;
		} else if (arg15 == 1) {
			local144 = (arg10 - this.aClass232_11.anInt6455 - this.aClass232_11.anInt6464 - arg5 * (local61 + -1)) / 2 + arg14 + this.aClass232_11.anInt6455;
		} else if (arg15 == 2) {
			local144 = arg10 + arg14 - (local61 - 1) * arg5 - this.aClass232_11.anInt6464;
		} else {
			local168 = (arg10 - this.aClass232_11.anInt6455 - this.aClass232_11.anInt6464 - arg5 * (local61 - 1)) / (local61 + 1);
			if (local168 < 0) {
				local168 = 0;
			}
			local144 = local168 + arg14 + this.aClass232_11.anInt6455;
			arg5 += local168;
		}
		for (local168 = 0; local168 < local61; local168++) {
			if (arg6 == 0) {
				this.method7481(arg2, arg4, arg13, Static49.aStringArray5[local168], arg9, local144, arg1, arg3);
			} else if (arg6 == 1) {
				this.method7481(arg2, arg4, arg13 + (arg7 - this.aClass232_11.method5432(Static49.aStringArray5[local168])) / 2, Static49.aStringArray5[local168], arg9, local144, arg1, arg3);
			} else if (arg6 == 2) {
				this.method7481(arg2, arg4, arg7 + arg13 - this.aClass232_11.method5432(Static49.aStringArray5[local168]), Static49.aStringArray5[local168], arg9, local144, arg1, arg3);
			} else if (local168 == local61 - 1) {
				this.method7481(arg2, arg4, arg13, Static49.aStringArray5[local168], arg9, local144, arg1, arg3);
			} else {
				this.method7497(arg7, Static49.aStringArray5[local168]);
				this.method7481(arg2, arg4, arg13, Static49.aStringArray5[local168], arg9, local144, arg1, arg3);
				Static255.anInt4965 = 0;
			}
			local144 += arg5;
		}
		return local61;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7485(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method7490(-16777216, arg2);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			local19[local26] = (int) (Math.sin((double) local26 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method7486(arg0, arg1 - this.aClass232_11.method5432(arg0) / 2, arg4, null, local19, null, null);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IBI[Lclient!ha;[I[I[I)V")
	private void method7486(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(19) int local19 = arg2 - this.aClass232_11.anInt6468;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static424.method6215(arg0.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local21 = local30;
			} else {
				@Pc(116) int local116;
				@Pc(126) int local126;
				if (local41 == '>' && local21 != -1) {
					@Pc(64) String local64 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					if (local64.equals("lt")) {
						local41 = '<';
					} else if (local64.equals("gt")) {
						local41 = '>';
					} else if (local64.equals("nbsp")) {
						local41 = ' ';
					} else if (local64.equals("shy")) {
						local41 = '\u00ad';
					} else if (local64.equals("times")) {
						local41 = '×';
					} else if (local64.equals("euro")) {
						local41 = '€';
					} else if (local64.equals("copy")) {
						local41 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local116 = 0;
									} else {
										local116 = arg6[local25];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local25];
									}
									local25++;
									@Pc(137) int local137 = Static197.method7005(local64.substring(4));
									@Pc(141) Class2 local141 = arg3[local137];
									@Pc(150) int local150 = arg5 == null ? local141.ma() : arg5[local137];
									local141.DA(arg1 + local116, -local150 + this.aClass232_11.anInt6468 + local19 + local126, 1, 0, 1);
									local23 = -1;
									arg1 += arg3[local137].EA();
								} catch (@Pc(179) Exception local179) {
								}
							} else {
								this.method7496(local64);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg1 += this.aClass232_11.method5428(local23, local41);
					}
					@Pc(230) int local230;
					if (arg6 == null) {
						local230 = 0;
					} else {
						local230 = arg6[local25];
					}
					if (arg4 == null) {
						local116 = 0;
					} else {
						local116 = arg4[local25];
					}
					if (local41 != ' ') {
						if ((Static90.anInt1831 & 0xFF000000) != 0) {
							this.HA(local41, arg1 + local230 + 1, local19 - -1 + local116, Static90.anInt1831, true);
						}
						this.HA(local41, arg1 + local230, local19 - -local116, Static97.anInt1968, false);
					} else if (Static255.anInt4965 > 0) {
						Static479.anInt8663 += Static255.anInt4965;
						arg1 += Static479.anInt8663 >> 8;
						Static479.anInt8663 &= 0xFF;
					}
					local25++;
					local126 = this.aClass232_11.method5436(local41);
					if (Static427.anInt7490 != -1) {
						this.aClass122_12.method7259((int) ((double) this.aClass232_11.anInt6468 * 0.7D) + local19, Static427.anInt7490, arg1, local126);
					}
					if (Static340.anInt6095 != -1) {
						this.aClass122_12.method7259(this.aClass232_11.anInt6468 + local19, Static340.anInt6095, arg1, local126);
					}
					arg1 += local126;
					local23 = local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/util/Random;[IIIII[Lclient!ha;IIILjava/lang/String;II[II)I")
	public final int method7487(@OriginalArg(0) Random arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg0.setSeed((long) arg7);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method7490(arg3 & 0xFFFFFF | local20 << 24, local20 << 24 | arg10 & 0xFFFFFF);
		@Pc(40) int local40 = arg9.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg0.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg4;
		@Pc(76) int local76 = arg5 + this.aClass232_11.anInt6455;
		@Pc(78) int local78 = -1;
		if (arg11 == 1) {
			local76 += (arg8 - this.aClass232_11.anInt6464 - this.aClass232_11.anInt6455) / 2;
		} else if (arg11 == 2) {
			local76 = arg8 + arg5 - this.aClass232_11.anInt6464;
		}
		if (arg2 == 1) {
			local78 = local45 + this.aClass232_11.method5432(arg9);
			local69 = arg4 + (arg13 - local78) / 2;
		} else if (arg2 == 2) {
			local78 = this.aClass232_11.method5432(arg9) + local45;
			local69 = arg4 + arg13 - local78;
		}
		this.method7486(arg9, local69, local76, arg6, null, arg12, local43);
		if (arg1 != null) {
			if (local78 == -1) {
				local78 = local45 + this.aClass232_11.method5432(arg9);
			}
			arg1[2] = local78;
			arg1[0] = local69;
			arg1[3] = this.aClass232_11.anInt6455 + this.aClass232_11.anInt6464;
			arg1[1] = local76 - this.aClass232_11.anInt6455;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIII[Lclient!ha;IILclient!pa;II[IIII)I")
	public final int method7488(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class40 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int[] arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11, @OriginalArg(15) int arg12) {
		return this.method7483(arg3, arg4, arg9, arg5, arg10, 0, 1, arg12, 0, arg7, arg6, arg1, arg11, arg8, arg0, arg2);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIBILjava/lang/String;)V")
	public final void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method7490(arg1, arg0);
			this.method7481(null, 0, arg3 - this.aClass232_11.method5432(arg4) / 2, arg4, null, arg2, 0, null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
	protected abstract void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	private void method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static479.anInt8663 = 0;
		Static255.anInt4965 = 0;
		Static427.anInt7490 = -1;
		Static476.anInt7960 = arg1;
		Static97.anInt1968 = arg1;
		Static340.anInt6095 = -1;
		Static452.anInt7741 = arg0;
		Static90.anInt1831 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII[ILjava/lang/String;I[Lclient!ha;)V")
	public final void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(7) Class2[] arg5) {
		if (arg4 != null) {
			this.method7490(0, arg2);
			this.method7481(arg3, 0, arg0, arg4, null, arg1, 0, arg5);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	protected abstract void method7494(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class40 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method7495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method7490(-1, arg0);
			this.method7481(null, 0, arg2 - this.aClass232_11.method5432(arg3), arg3, null, arg1, 0, null);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7496(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static97.anInt1968 = Static97.anInt1968 & 0xFF000000 | Static266.method7454(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static97.anInt1968 = Static97.anInt1968 & 0xFF000000 | Static476.anInt7960 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static97.anInt1968 = Static266.method7454(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static97.anInt1968 = Static476.anInt7960;
			} else if (arg0.startsWith("str=")) {
				Static427.anInt7490 = Static97.anInt1968 & 0xFF000000 | Static266.method7454(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static427.anInt7490 = Static97.anInt1968 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static427.anInt7490 = -1;
			} else if (arg0.startsWith("u=")) {
				Static340.anInt6095 = Static97.anInt1968 & 0xFF000000 | Static266.method7454(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static340.anInt6095 = Static97.anInt1968 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static340.anInt6095 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static90.anInt1831 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static90.anInt1831 = Static97.anInt1968 & 0xFF000000 | Static266.method7454(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static90.anInt1831 = Static97.anInt1968 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static90.anInt1831 = Static452.anInt7741;
				return;
			} else if (arg0.equals("br")) {
				this.method7490(Static452.anInt7741, Static476.anInt7960);
				return;
			}
		} catch (@Pc(178) Exception local178) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method7497(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
			@Pc(25) char local25 = arg1.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local15++;
			}
		}
		if (local15 > 0) {
			Static255.anInt4965 = (arg0 - this.aClass232_11.method5432(arg1) << 8) / local15;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
	public final void method7498(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7490(arg0, arg2);
			this.method7481(null, 0, arg4, arg1, null, arg3, 0, null);
		}
	}
}
