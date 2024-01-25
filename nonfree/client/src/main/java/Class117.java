import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class117 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!daa;")
	private final Class58 aClass58_14;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!r;")
	private final Class43 aClass43_14;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!r;Lclient!daa;)V")
	protected Class117(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class58 arg1) {
		this.aClass58_14 = arg1;
		this.aClass43_14 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7644(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static224.anInt4388 = Static224.anInt4388 & 0xFF000000 | Static563.method7494(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static224.anInt4388 = Static364.anInt7959 & 0xFFFFFF | Static224.anInt4388 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static224.anInt4388 = Static563.method7494(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static224.anInt4388 = Static364.anInt7959;
			} else if (arg0.startsWith("str=")) {
				Static543.anInt8520 = Static224.anInt4388 & 0xFF000000 | Static563.method7494(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static543.anInt8520 = Static224.anInt4388 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static543.anInt8520 = -1;
			} else if (arg0.startsWith("u=")) {
				Static531.anInt8357 = Static224.anInt4388 & 0xFF000000 | Static563.method7494(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static531.anInt8357 = Static224.anInt4388 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static531.anInt8357 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static455.anInt7445 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static455.anInt7445 = Static224.anInt4388 & 0xFF000000 | Static563.method7494(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static455.anInt7445 = Static224.anInt4388 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static455.anInt7445 = Static550.anInt7644;
				return;
			} else if (arg0.equals("br")) {
				this.method7646(Static550.anInt7644, Static364.anInt7959);
				return;
			}
		} catch (@Pc(177) Exception local177) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[I[Lclient!f;ILjava/lang/String;)V")
	public final void method7645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class46[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 != null) {
			this.method7646(0, arg1);
			this.method7660(arg5, 0, arg0, arg3, null, arg2, 0, arg4);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	private void method7646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static47.anInt1016 = 0;
		Static364.anInt7959 = arg1;
		Static224.anInt4388 = arg1;
		Static531.anInt8357 = -1;
		Static543.anInt8520 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static281.anInt5119 = 0;
		Static550.anInt7644 = arg0;
		Static455.anInt7445 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public final void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method7646(-16777216, arg5);
		@Pc(21) double local21 = 7.0D - (double) arg3 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(36) int local36 = arg2.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (Math.sin((double) local41 / 1.5D + (double) arg4) * local21);
		}
		this.method7648(null, arg0 - this.aClass58_14.method1767(arg2) / 2, arg2, arg1, local39, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!f;ILjava/lang/String;I[II[I[I)V")
	private void method7648(@OriginalArg(0) Class46[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg3 - this.aClass58_14.anInt2033;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(27) int local27 = arg2.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(40) char local40 = (char) (Static579.method7686(arg2.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local13 = local29;
			} else {
				@Pc(125) int local125;
				@Pc(135) int local135;
				if (local40 == '>' && local13 != -1) {
					@Pc(63) String local63 = arg2.substring(local13 + 1, local29);
					local13 = -1;
					if (local63.equals("lt")) {
						local40 = '<';
					} else if (local63.equals("gt")) {
						local40 = '>';
					} else if (local63.equals("nbsp")) {
						local40 = ' ';
					} else if (local63.equals("shy")) {
						local40 = '\u00ad';
					} else if (local63.equals("times")) {
						local40 = '×';
					} else if (local63.equals("euro")) {
						local40 = '€';
					} else if (local63.equals("copy")) {
						local40 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local125 = 0;
									} else {
										local125 = arg5[local17];
									}
									if (arg4 == null) {
										local135 = 0;
									} else {
										local135 = arg4[local17];
									}
									local17++;
									@Pc(146) int local146 = Static118.method2472(local63.substring(4));
									@Pc(150) Class46 local150 = arg0[local146];
									@Pc(159) int local159 = arg6 == null ? local150.ca() : arg6[local146];
									local150.V(arg1 + local125, -local159 + local11 - -this.aClass58_14.anInt2033 + local135, 1, 0, 1);
									local15 = -1;
									arg1 += arg0[local146].A();
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method7644(local63);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass58_14.method1772(local40, local15);
					}
					@Pc(229) int local229;
					if (arg5 == null) {
						local229 = 0;
					} else {
						local229 = arg5[local17];
					}
					if (arg4 == null) {
						local125 = 0;
					} else {
						local125 = arg4[local17];
					}
					if (local40 != ' ') {
						if ((Static455.anInt7445 & 0xFF000000) != 0) {
							this.OA(local40, arg1 + local229 + 1, local11 - (-1 - local125), Static455.anInt7445, true);
						}
						this.OA(local40, arg1 + local229, local125 + local11, Static224.anInt4388, false);
					} else if (Static281.anInt5119 > 0) {
						Static47.anInt1016 += Static281.anInt5119;
						arg1 += Static47.anInt1016 >> 8;
						Static47.anInt1016 &= 0xFF;
					}
					local17++;
					local135 = this.aClass58_14.method1769(local40);
					if (Static543.anInt8520 != -1) {
						this.aClass43_14.method7200(arg1, Static543.anInt8520, local135, local11 + (int) ((double) this.aClass58_14.anInt2033 * 0.7D));
					}
					if (Static531.anInt8357 != -1) {
						this.aClass43_14.method7200(arg1, Static531.anInt8357, local135, this.aClass58_14.anInt2033 + local11);
					}
					local15 = local40;
					arg1 += local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method7649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7646(-16777216, arg0);
		@Pc(27) int local27 = arg2.length();
		@Pc(30) int[] local30 = new int[local27];
		for (@Pc(32) int local32 = 0; local32 < local27; local32++) {
			local30[local32] = (int) (Math.sin((double) local32 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method7648(null, arg4 - this.aClass58_14.method1767(arg2) / 2, arg2, arg3, local30, null, null);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ua;IIIILjava/lang/String;[I[Lclient!f;IIIIII)I")
	public final int method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class46[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7651(arg9, arg3, arg2, arg12, arg6, arg14, arg11, arg8, arg0, arg4, arg1, 0, arg7, arg5, arg10, arg13);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIILclient!ua;ILjava/lang/String;II[Lclient!f;IIII[IIII)I")
	public final int method7651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class146 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class46[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg4 == null) {
			return 0;
		}
		this.method7646(arg8, arg9);
		if (arg0 == 0) {
			arg0 = this.aClass58_14.anInt2033;
		}
		@Pc(44) int[] local44;
		if (arg0 + this.aClass58_14.anInt2039 + this.aClass58_14.anInt2031 > arg13 && arg13 < arg0 + arg0) {
			local44 = null;
		} else {
			local44 = new int[] { arg14 };
		}
		@Pc(62) int local62 = this.aClass58_14.method1778(Static184.aStringArray23, local44, arg7, arg4);
		if (arg11 == -1) {
			arg11 = arg13 / arg0;
			if (arg11 <= 0) {
				arg11 = 1;
			}
		}
		if (arg11 > 0 && local62 >= arg11) {
			local62 = arg11;
			Static184.aStringArray23[arg11 - 1] = this.aClass58_14.method1768(arg7, Static184.aStringArray23[arg11 - 1], arg14);
		}
		if (arg1 == 3 && local62 == 1) {
			arg1 = 1;
		}
		@Pc(145) int local145;
		@Pc(191) int local191;
		if (arg1 == 0) {
			local145 = arg10 + this.aClass58_14.anInt2039;
		} else if (arg1 == 1) {
			local145 = arg10 + this.aClass58_14.anInt2039 + (arg13 + -this.aClass58_14.anInt2039 - this.aClass58_14.anInt2031 + -((local62 + -1) * arg0)) / 2;
		} else if (arg1 == 2) {
			local145 = arg10 + arg13 - this.aClass58_14.anInt2031 - (local62 + -1) * arg0;
		} else {
			local191 = (arg13 - (local62 - 1) * arg0 - this.aClass58_14.anInt2031 - this.aClass58_14.anInt2039) / (local62 + 1);
			if (local191 < 0) {
				local191 = 0;
			}
			arg0 += local191;
			local145 = this.aClass58_14.anInt2039 + arg10 + local191;
		}
		for (local191 = 0; local191 < local62; local191++) {
			if (arg15 == 0) {
				this.method7660(Static184.aStringArray23[local191], arg5, local145, arg7, arg2, arg12, arg6, arg3);
			} else if (arg15 == 1) {
				this.method7660(Static184.aStringArray23[local191], arg5, local145, arg7, arg2, arg12, arg6, arg3 + (arg14 - this.aClass58_14.method1767(Static184.aStringArray23[local191])) / 2);
			} else if (arg15 == 2) {
				this.method7660(Static184.aStringArray23[local191], arg5, local145, arg7, arg2, arg12, arg6, arg14 + arg3 - this.aClass58_14.method1767(Static184.aStringArray23[local191]));
			} else if (local191 == local62 - 1) {
				this.method7660(Static184.aStringArray23[local191], arg5, local145, arg7, arg2, arg12, arg6, arg3);
			} else {
				this.method7652(Static184.aStringArray23[local191], arg14);
				this.method7660(Static184.aStringArray23[local191], arg5, local145, arg7, arg2, arg12, arg6, arg3);
				Static281.anInt5119 = 0;
			}
			local145 += arg0;
		}
		return local62;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method7652(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static281.anInt5119 = (arg1 - this.aClass58_14.method1767(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
	public final void method7654(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method7646(arg4, arg2);
			this.method7660(arg0, 0, arg1, null, null, null, 0, arg3);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7646(arg1, arg4);
			this.method7660(arg3, 0, arg0, null, null, null, 0, arg2 - this.aClass58_14.method1767(arg3) / 2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	protected abstract void method7657(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class146 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
	protected abstract void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;I[Lclient!f;IILjava/util/Random;[II)I")
	public final int method7658(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) Class46[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Random arg5, @OriginalArg(8) int[] arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg5.setSeed((long) arg4);
		@Pc(21) int local21 = (arg5.nextInt() & 0x1F) + 192;
		this.method7646((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg1.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(53) int local53 = 0; local53 < local41; local53++) {
			local44[local53] = local46;
			if ((arg5.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method7648(arg2, arg3, arg1, arg0, null, local44, arg6);
		return local46;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IIILjava/lang/String;II)V")
	public final void method7659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method7646(arg2, arg0);
			this.method7660(arg3, 0, arg4, null, null, null, 0, arg1 - this.aClass58_14.method1767(arg3));
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;II[Lclient!f;ZLclient!ua;[III)V")
	private void method7660(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46[] arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg2 - this.aClass58_14.anInt2033;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static579.method7686(arg0.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(54) String local54 = arg0.substring(local13 + 1, local20);
					local13 = -1;
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
							if (local54.startsWith("img=")) {
								try {
									@Pc(112) int local112 = Static118.method2472(local54.substring(4));
									@Pc(116) Class46 local116 = arg3[local112];
									@Pc(125) int local125 = arg5 == null ? local116.ca() : arg5[local112];
									if ((Static224.anInt4388 & -16777216) == -16777216) {
										local116.V(arg7, this.aClass58_14.anInt2033 + local11 - local125, 1, 0, 1);
									} else {
										local116.V(arg7, local11 + this.aClass58_14.anInt2033 - local125, 0, Static224.anInt4388 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local15 = -1;
									arg7 += arg3[local112].A();
								} catch (@Pc(174) Exception local174) {
								}
							} else {
								this.method7644(local54);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg7 += this.aClass58_14.method1772(local31, local15);
					}
					if (local31 == ' ') {
						if (Static281.anInt5119 > 0) {
							Static47.anInt1016 += Static281.anInt5119;
							arg7 += Static47.anInt1016 >> 8;
							Static47.anInt1016 &= 0xFF;
						}
					} else if (arg4 == null) {
						if ((Static455.anInt7445 & 0xFF000000) != 0) {
							this.OA(local31, arg7 + 1, local11 + 1, Static455.anInt7445, true);
						}
						this.OA(local31, arg7, local11, Static224.anInt4388, false);
					} else {
						if ((Static455.anInt7445 & 0xFF000000) != 0) {
							this.method7657(local31, arg7 + 1, local11 + 1, Static455.anInt7445, true, arg4, arg6, arg1);
						}
						this.method7657(local31, arg7, local11, Static224.anInt4388, false, arg4, arg6, arg1);
					}
					@Pc(297) int local297 = this.aClass58_14.method1769(local31);
					if (Static543.anInt8520 != -1) {
						this.aClass43_14.method7200(arg7, Static543.anInt8520, local297, local11 + (int) ((double) this.aClass58_14.anInt2033 * 0.7D));
					}
					if (Static531.anInt8357 != -1) {
						this.aClass43_14.method7200(arg7, Static531.anInt8357, local297, local11 + this.aClass58_14.anInt2033 + 1);
					}
					arg7 += local297;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II[Lclient!f;II[IB[ILjava/util/Random;I)I")
	public final int method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class46[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) Random arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return 0;
		}
		arg12.setSeed((long) arg9);
		@Pc(20) int local20 = (arg12.nextInt() & 0x1F) + 192;
		this.method7646(local20 << 24 | arg6 & 0xFFFFFF, arg3 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg4.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg12.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(69) int local69 = arg0;
		@Pc(76) int local76 = arg5 + this.aClass58_14.anInt2039;
		if (arg2 == 1) {
			local76 += (arg8 - this.aClass58_14.anInt2031 - this.aClass58_14.anInt2039) / 2;
		} else if (arg2 == 2) {
			local76 = arg5 + arg8 - this.aClass58_14.anInt2031;
		}
		@Pc(116) int local116 = -1;
		if (arg1 == 1) {
			local116 = this.aClass58_14.method1767(arg4) + local45;
			local69 = arg0 + (arg13 - local116) / 2;
		} else if (arg1 == 2) {
			local116 = this.aClass58_14.method1767(arg4) + local45;
			local69 = arg0 + arg13 - local116;
		}
		this.method7648(arg7, local69, arg4, local76, null, local43, arg11);
		if (arg10 != null) {
			if (local116 == -1) {
				local116 = this.aClass58_14.method1767(arg4) + local45;
			}
			arg10[1] = local76 - this.aClass58_14.anInt2039;
			arg10[3] = this.aClass58_14.anInt2039 + this.aClass58_14.anInt2031;
			arg10[0] = local69;
			arg10[2] = local116;
		}
		return local45;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIIB)V")
	public final void method7662(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7646(-16777216, arg0);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) arg4 / 5.0D + (double) local24 / 3.0D) * 5.0D);
		}
		this.method7648(null, arg3 - this.aClass58_14.method1767(arg1) / 2, arg1, arg2, local22, local19, null);
	}
}
