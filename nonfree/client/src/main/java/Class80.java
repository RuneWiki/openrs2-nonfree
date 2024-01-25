import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class80 {

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!lq;")
	private final Class224 aClass224_13;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!ha;")
	private final Class57 aClass57_15;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!lq;)V")
	protected Class80(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class224 arg1) {
		this.aClass224_13 = arg1;
		this.aClass57_15 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method8780(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8784(arg3, arg0);
			this.method8785((int[]) null, (Class1) null, arg4, 0, arg2, 0, arg1, (Class134[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method8781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method8784(arg0, -16777216);
		@Pc(26) int local26 = arg3.length();
		@Pc(29) int[] local29 = new int[local26];
		for (@Pc(31) int local31 = 0; local31 < local26; local31++) {
			local29[local31] = (int) (Math.sin((double) arg1 / 5.0D + (double) local31 / 2.0D) * 5.0D);
		}
		this.method8790((int[]) null, (int[]) null, arg4, arg2 - this.aClass224_13.method5256(arg3) / 2, arg3, local29, (Class134[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIB[Lclient!fs;ILjava/lang/String;I[IIILclient!aa;II)I")
	public final int method8782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class134[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8799(arg5, arg14, arg4, arg7, arg0, arg11, arg6, arg13, arg1, arg8, arg10, arg3, 0, arg2, arg12, arg9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method8783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method8784(arg4, -16777216);
		@Pc(17) int local17 = arg2.length();
		@Pc(28) int[] local28 = new int[local17];
		@Pc(31) int[] local31 = new int[local17];
		for (@Pc(33) int local33 = 0; local33 < local17; local33++) {
			local28[local33] = (int) (Math.sin((double) arg0 / 5.0D + (double) local33 / 5.0D) * 5.0D);
			local31[local33] = (int) (Math.sin((double) arg0 / 5.0D + (double) local33 / 3.0D) * 5.0D);
		}
		this.method8790(local28, (int[]) null, arg3, arg1 - this.aClass224_13.method5256(arg2) / 2, arg2, local31, (Class134[]) null);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	private void method8784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static18.anInt302 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static420.anInt7268 = -1;
		Static200.anInt3240 = -1;
		Static483.anInt9418 = 0;
		Static35.anInt9307 = arg0;
		Static311.anInt5510 = arg0;
		Static370.anInt10373 = arg1;
		Static558.anInt9397 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ILclient!aa;IIIIILjava/lang/String;[Lclient!fs;)V")
	private void method8785(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class134[] arg7) {
		@Pc(25) int local25 = arg4 - this.aClass224_13.anInt6145;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(36) int local36 = arg6.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(49) char local49 = (char) (Static133.method1920(arg6.charAt(local38)) & 0xFF);
			if (local49 == '<') {
				local31 = local38;
			} else {
				if (local49 == '>' && local31 != -1) {
					@Pc(75) String local75 = arg6.substring(local31 + 1, local38);
					local31 = -1;
					if (local75.equals("lt")) {
						local49 = '<';
					} else if (local75.equals("gt")) {
						local49 = '>';
					} else if (local75.equals("nbsp")) {
						local49 = ' ';
					} else if (local75.equals("shy")) {
						local49 = '\u00ad';
					} else if (local75.equals("times")) {
						local49 = '×';
					} else if (local75.equals("euro")) {
						local49 = '€';
					} else if (local75.equals("copy")) {
						local49 = '©';
					} else {
						if (!local75.equals("reg")) {
							if (local75.startsWith("img=")) {
								try {
									@Pc(183) int local183 = Static595.method8613(local75.substring(4));
									@Pc(187) Class134 local187 = arg7[local183];
									@Pc(197) int local197 = arg0 == null ? local187.method9232() : arg0[local183];
									if ((Static311.anInt5510 & -16777216) == -16777216) {
										local187.method9230(arg2, this.aClass224_13.anInt6145 + local25 - local197, 1, 0, 1);
									} else {
										local187.method9230(arg2, this.aClass224_13.anInt6145 + local25 - local197, 0, Static311.anInt5510 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg2 += arg7[local183].method9231();
									local33 = -1;
								} catch (@Pc(251) Exception local251) {
								}
							} else {
								this.method8798(local75);
							}
							continue;
						}
						local49 = '®';
					}
				}
				if (local31 == -1) {
					if (local33 != -1) {
						arg2 += this.aClass224_13.method5253(local49, local33);
					}
					if (local49 == ' ') {
						if (Static483.anInt9418 > 0) {
							Static18.anInt302 += Static483.anInt9418;
							arg2 += Static18.anInt302 >> 8;
							Static18.anInt302 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static558.anInt9397 & 0xFF000000) != 0) {
							this.fa(local49, arg2 + 1, local25 + 1, Static558.anInt9397, true);
						}
						this.fa(local49, arg2, local25, Static311.anInt5510, false);
					} else {
						if ((Static558.anInt9397 & 0xFF000000) != 0) {
							this.method8794(local49, arg2 + 1, local25 + 1, Static558.anInt9397, true, arg1, arg3, arg5);
						}
						this.method8794(local49, arg2, local25, Static311.anInt5510, false, arg1, arg3, arg5);
					}
					@Pc(380) int local380 = this.aClass224_13.method5254(local49);
					if (Static420.anInt7268 != -1) {
						this.aClass57_15.method7709(Static420.anInt7268, local380, arg2, local25 + (int) ((double) this.aClass224_13.anInt6145 * 0.7D));
					}
					if (Static200.anInt3240 != -1) {
						this.aClass57_15.method7709(Static200.anInt3240, local380, arg2, this.aClass224_13.anInt6145 + local25 + 1);
					}
					arg2 += local380;
					local33 = local49;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;Ljava/lang/String;Z[IIIII[Lclient!fs;I)I")
	public final int method8787(@OriginalArg(0) Random arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class134[] arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg0.setSeed((long) arg4);
		@Pc(22) int local22 = (arg0.nextInt() & 0x1F) + 192;
		this.method8784(local22 << 24 | 0xFFFFFF, (local22 | 0x0) << 24);
		@Pc(42) int local42 = arg1.length();
		@Pc(53) int[] local53 = new int[local42];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < local42; local57++) {
			local53[local57] = local55;
			if ((arg0.nextInt() & 0x3) == 0) {
				local55++;
			}
		}
		this.method8790(local53, arg2, arg3, arg5, arg1, (int[]) null, arg6);
		return local55;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method8788(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(16) int local16 = 0; arg0.length() > local16; local16++) {
			@Pc(24) char local24 = arg0.charAt(local16);
			if (local24 == '<') {
				local9 = true;
			} else if (local24 == '>') {
				local9 = false;
			} else if (!local9 && local24 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static483.anInt9418 = (arg1 - this.aClass224_13.method5256(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;[I[Lclient!fs;IIII)V")
	public final void method8789(@OriginalArg(1) String arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class134[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 != null) {
			this.method8784(arg5, 0);
			this.method8785(arg1, (Class1) null, arg3, 0, arg4, 0, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([I[IIIILjava/lang/String;[I[Lclient!fs;)V")
	private void method8790(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class134[] arg6) {
		@Pc(11) int local11 = arg2 - this.aClass224_13.anInt6145;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static133.method1920(arg4.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(152) int local152;
				@Pc(164) int local164;
				if (local33 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg4.substring(local13 + 1, local22);
					local13 = -1;
					if (local60.equals("lt")) {
						local33 = '<';
					} else if (local60.equals("gt")) {
						local33 = '>';
					} else if (local60.equals("nbsp")) {
						local33 = ' ';
					} else if (local60.equals("shy")) {
						local33 = '\u00ad';
					} else if (local60.equals("times")) {
						local33 = '×';
					} else if (local60.equals("euro")) {
						local33 = '€';
					} else if (local60.equals("copy")) {
						local33 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local152 = 0;
									} else {
										local152 = arg0[local17];
									}
									if (arg5 == null) {
										local164 = 0;
									} else {
										local164 = arg5[local17];
									}
									local17++;
									@Pc(175) int local175 = Static595.method8613(local60.substring(4));
									@Pc(179) Class134 local179 = arg6[local175];
									@Pc(189) int local189 = arg1 == null ? local179.method9232() : arg1[local175];
									local179.method9230(local152 + arg3, local164 + -local189 + (local11 - -this.aClass224_13.anInt6145), 1, 0, 1);
									local15 = -1;
									arg3 += arg6[local175].method9231();
								} catch (@Pc(219) Exception local219) {
								}
							} else {
								this.method8798(local60);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg3 += this.aClass224_13.method5253(local33, local15);
					}
					@Pc(270) int local270;
					if (arg0 == null) {
						local270 = 0;
					} else {
						local270 = arg0[local17];
					}
					if (arg5 == null) {
						local152 = 0;
					} else {
						local152 = arg5[local17];
					}
					if (local33 != ' ') {
						if ((Static558.anInt9397 & 0xFF000000) != 0) {
							this.fa(local33, arg3 + local270 + 1, local152 + local11 + 1, Static558.anInt9397, true);
						}
						this.fa(local33, local270 + arg3, local152 + local11, Static311.anInt5510, false);
					} else if (Static483.anInt9418 > 0) {
						Static18.anInt302 += Static483.anInt9418;
						arg3 += Static18.anInt302 >> 8;
						Static18.anInt302 &= 0xFF;
					}
					local17++;
					local164 = this.aClass224_13.method5254(local33);
					if (Static420.anInt7268 != -1) {
						this.aClass57_15.method7709(Static420.anInt7268, local164, arg3, local11 + (int) ((double) this.aClass224_13.anInt6145 * 0.7D));
					}
					if (Static200.anInt3240 != -1) {
						this.aClass57_15.method7709(Static200.anInt3240, local164, arg3, local11 + this.aClass224_13.anInt6145);
					}
					arg3 += local164;
					local15 = local33;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
	public final void method8792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method8784(arg2, arg3);
			this.method8785((int[]) null, (Class1) null, arg0 - this.aClass224_13.method5256(arg4) / 2, 0, arg1, 0, arg4, (Class134[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8794(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public final void method8795(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method8784(arg3, -16777216);
		@Pc(22) double local22 = 7.0D - (double) arg4 / 8.0D;
		if (local22 < 0.0D) {
			local22 = 0.0D;
		}
		@Pc(31) int local31 = arg0.length();
		@Pc(34) int[] local34 = new int[local31];
		for (@Pc(36) int local36 = 0; local36 < local31; local36++) {
			local34[local36] = (int) (Math.sin((double) arg5 + (double) local36 / 1.5D) * local22);
		}
		this.method8790((int[]) null, (int[]) null, arg2, arg1 - this.aClass224_13.method5256(arg0) / 2, arg0, local34, (Class134[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method8796(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			this.method8784(arg2, arg3);
			this.method8785((int[]) null, (Class1) null, arg0 - this.aClass224_13.method5256(arg1), 0, arg4, 0, arg1, (Class134[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIILjava/lang/String;IIIIII[Lclient!fs;Ljava/util/Random;I[I)I")
	public final int method8797(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class134[] arg10, @OriginalArg(12) Random arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg11.setSeed((long) arg2);
		@Pc(21) int local21 = (arg11.nextInt() & 0x1F) + 192;
		this.method8784(local21 << 24 | arg8 & 0xFFFFFF, arg6 & 0xFFFFFF | local21 << 24);
		@Pc(41) int local41 = arg3.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg11.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		if (4 != 4) {
			Static93.aClass361_19 = null;
		}
		@Pc(85) int local85 = arg7;
		@Pc(91) int local91 = arg5 + this.aClass224_13.anInt6135;
		@Pc(93) int local93 = -1;
		if (arg1 == 1) {
			local91 += (arg12 - this.aClass224_13.anInt6135 - this.aClass224_13.anInt6133) / 2;
		} else if (arg1 == 2) {
			local91 = arg12 + arg5 - this.aClass224_13.anInt6133;
		}
		if (arg4 == 1) {
			local93 = local46 + this.aClass224_13.method5256(arg3);
			local85 = arg7 + (arg9 - local93) / 2;
		} else if (arg4 == 2) {
			local93 = this.aClass224_13.method5256(arg3) + local46;
			local85 = arg7 + arg9 - local93;
		}
		this.method8790(local44, arg0, local91, local85, arg3, (int[]) null, arg10);
		if (arg13 != null) {
			if (local93 == -1) {
				local93 = this.aClass224_13.method5256(arg3) + local46;
			}
			arg13[1] = local91 - this.aClass224_13.anInt6135;
			arg13[0] = local85;
			arg13[2] = local93;
			arg13[3] = this.aClass224_13.anInt6133 + this.aClass224_13.anInt6135;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8798(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static311.anInt5510 = Static311.anInt5510 & 0xFF000000 | Static274.method4092(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static311.anInt5510 = Static35.anInt9307 & 0xFFFFFF | Static311.anInt5510 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static311.anInt5510 = Static274.method4092(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static311.anInt5510 = Static35.anInt9307;
			} else if (arg0.startsWith("str=")) {
				Static420.anInt7268 = Static311.anInt5510 & 0xFF000000 | Static274.method4092(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static420.anInt7268 = Static311.anInt5510 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static420.anInt7268 = -1;
			} else if (arg0.startsWith("u=")) {
				Static200.anInt3240 = Static311.anInt5510 & 0xFF000000 | Static274.method4092(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static200.anInt3240 = Static311.anInt5510 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static200.anInt3240 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static558.anInt9397 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static558.anInt9397 = Static311.anInt5510 & 0xFF000000 | Static274.method4092(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static558.anInt9397 = Static311.anInt5510 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static558.anInt9397 = Static370.anInt10373;
			} else if (arg0.equals("br")) {
				this.method8784(Static35.anInt9307, Static370.anInt10373);
			}
		} catch (@Pc(268) Exception local268) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!fs;IIILjava/lang/String;IIIIIIIIIILclient!aa;[I)I")
	public final int method8799(@OriginalArg(0) Class134[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class1 arg14, @OriginalArg(16) int[] arg15) {
		if (arg3 == null) {
			return 0;
		}
		this.method8784(arg11, arg2);
		if (arg8 == 0) {
			arg8 = this.aClass224_13.anInt6145;
		}
		@Pc(49) int[] local49;
		if (arg13 < arg8 + this.aClass224_13.anInt6135 + this.aClass224_13.anInt6133 && arg13 < arg8 + arg8) {
			local49 = null;
		} else {
			local49 = new int[] { arg6 };
		}
		if (arg12 == -1) {
			arg12 = arg13 / arg8;
			if (arg12 <= 0) {
				arg12 = 1;
			}
		}
		@Pc(78) int local78 = this.aClass224_13.method5255(arg3, arg0, Static95.aStringArray10, local49);
		if (arg12 > 0 && local78 >= arg12) {
			Static95.aStringArray10[arg12 - 1] = this.aClass224_13.method5258(arg0, Static95.aStringArray10[arg12 - 1], arg6);
			local78 = arg12;
		}
		if (arg4 == 3 && local78 == 1) {
			arg4 = 1;
		}
		@Pc(184) int local184;
		@Pc(164) int local164;
		if (arg4 == 0) {
			local184 = this.aClass224_13.anInt6135 + arg7;
		} else if (arg4 == 1) {
			local184 = (arg13 - (local78 - 1) * arg8 - this.aClass224_13.anInt6135 - this.aClass224_13.anInt6133) / 2 + this.aClass224_13.anInt6135 + arg7;
		} else if (arg4 == 2) {
			local184 = arg7 + arg13 - arg8 * (local78 - 1) - this.aClass224_13.anInt6133;
		} else {
			local164 = (arg13 - this.aClass224_13.anInt6133 - this.aClass224_13.anInt6135 - (local78 - 1) * arg8) / (local78 - -1);
			if (local164 < 0) {
				local164 = 0;
			}
			arg8 += local164;
			local184 = local164 + arg7 + this.aClass224_13.anInt6135;
		}
		for (local164 = 0; local164 < local78; local164++) {
			if (arg1 == 0) {
				this.method8785(arg15, arg14, arg10, arg5, local184, arg9, Static95.aStringArray10[local164], arg0);
			} else if (arg1 == 1) {
				this.method8785(arg15, arg14, (arg6 - this.aClass224_13.method5256(Static95.aStringArray10[local164])) / 2 + arg10, arg5, local184, arg9, Static95.aStringArray10[local164], arg0);
			} else if (arg1 == 2) {
				this.method8785(arg15, arg14, arg10 + arg6 - this.aClass224_13.method5256(Static95.aStringArray10[local164]), arg5, local184, arg9, Static95.aStringArray10[local164], arg0);
			} else if (local78 - 1 == local164) {
				this.method8785(arg15, arg14, arg10, arg5, local184, arg9, Static95.aStringArray10[local164], arg0);
			} else {
				this.method8788(Static95.aStringArray10[local164], arg6);
				this.method8785(arg15, arg14, arg10, arg5, local184, arg9, Static95.aStringArray10[local164], arg0);
				Static483.anInt9418 = 0;
			}
			local184 += arg8;
		}
		return local78;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
