import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class69 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!kc;")
	private final Class202 aClass202_11;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "Lclient!ha;")
	private final Class16 aClass16_11;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!kc;)V")
	protected Class69(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class202 arg1) {
		this.aClass202_11 = arg1;
		this.aClass16_11 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;I)V")
	private void method7450(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
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
			Static91.anInt8789 = (arg1 - this.aClass202_11.method4632(arg0) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IB)V")
	public final void method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg3 != null) {
			this.method7456(arg2, arg1);
			this.method7464(arg4, (Class1) null, 0, 0, arg3, (int[]) null, (Class102[]) null, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;IIILclient!aa;IIIIII[I[Lclient!nf;II)I")
	public final int method7452(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) Class102[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7457(arg6, arg7, arg10, arg11, arg0, arg13, arg14, arg9, arg3, arg8, arg12, arg2, arg5, 0, arg4, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!nf;IZ[ILjava/util/Random;ILjava/lang/String;II)I")
	public final int method7453(@OriginalArg(1) Class102[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Random arg3, @OriginalArg(7) String arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 == null) {
			return 0;
		}
		arg3.setSeed((long) arg6);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method7456((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg4.length();
		@Pc(59) int[] local59 = new int[local40];
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < local40; local63++) {
			local59[local63] = local61;
			if ((arg3.nextInt() & 0x3) == 0) {
				local61++;
			}
		}
		this.method7455(arg1, arg0, arg2, local59, arg5, (int[]) null, arg4);
		return local61;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!nf;Ljava/lang/String;II[IIIIII[ILjava/util/Random;I)I")
	public final int method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) Random arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg12.setSeed((long) arg6);
		@Pc(25) int local25 = (arg12.nextInt() & 0x1F) + 192;
		this.method7456(arg7 & 0xFFFFFF | local25 << 24, arg10 & 0xFFFFFF | local25 << 24);
		@Pc(45) int local45 = arg3.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg12.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(70) int local70 = arg4;
		@Pc(76) int local76 = arg9 + this.aClass202_11.anInt5465;
		if (arg1 == 1) {
			local76 += (arg8 - this.aClass202_11.anInt5456 - this.aClass202_11.anInt5465) / 2;
		} else if (arg1 == 2) {
			local76 = arg9 + arg8 - this.aClass202_11.anInt5456;
		}
		@Pc(112) int local112 = -1;
		if (arg0 == 1) {
			local112 = this.aClass202_11.method4632(arg3) + local50;
			local70 = arg4 + (arg13 - local112) / 2;
		} else if (arg0 == 2) {
			local112 = local50 + this.aClass202_11.method4632(arg3);
			local70 = arg4 + arg13 - local112;
		}
		this.method7455(local76, arg2, arg11, local48, local70, (int[]) null, arg3);
		if (arg5 != null) {
			if (local112 == -1) {
				local112 = local50 + this.aClass202_11.method4632(arg3);
			}
			arg5[2] = local112;
			arg5[3] = this.aClass202_11.anInt5456 + this.aClass202_11.anInt5465;
			arg5[0] = local70;
			arg5[1] = local76 - this.aClass202_11.anInt5465;
		}
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!nf;[I[III[ILjava/lang/String;)V")
	private void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) Class102[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(33) int local33 = arg0 - this.aClass202_11.anInt5467;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg6.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(55) char local55 = (char) (Static560.method7658(arg6.charAt(local44)) & 0xFF);
			if (local55 == '<') {
				local35 = local44;
			} else {
				@Pc(136) int local136;
				@Pc(148) int local148;
				if (local55 == '>' && local35 != -1) {
					@Pc(78) String local78 = arg6.substring(local35 + 1, local44);
					local35 = -1;
					if (local78.equals("lt")) {
						local55 = '<';
					} else if (local78.equals("gt")) {
						local55 = '>';
					} else if (local78.equals("nbsp")) {
						local55 = ' ';
					} else if (local78.equals("shy")) {
						local55 = '\u00ad';
					} else if (local78.equals("times")) {
						local55 = '×';
					} else if (local78.equals("euro")) {
						local55 = '€';
					} else if (local78.equals("copy")) {
						local55 = '©';
					} else {
						if (!local78.equals("reg")) {
							if (local78.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local136 = 0;
									} else {
										local136 = arg3[local39];
									}
									if (arg5 == null) {
										local148 = 0;
									} else {
										local148 = arg5[local39];
									}
									local39++;
									@Pc(161) int local161 = Static305.method4695(local78.substring(4));
									@Pc(165) Class102 local165 = arg1[local161];
									@Pc(174) int local174 = arg2 == null ? local165.method6958() : arg2[local161];
									local165.method6955(arg4 + local136, local33 + (this.aClass202_11.anInt5467 - (local174 - local148)), 1, 0, 1);
									local37 = -1;
									arg4 += arg1[local161].method6951();
								} catch (@Pc(202) Exception local202) {
								}
							} else {
								this.method7463(local78);
							}
							continue;
						}
						local55 = '®';
					}
				}
				if (local35 == -1) {
					if (local37 != -1) {
						arg4 += this.aClass202_11.method4627(local37, local55);
					}
					@Pc(244) int local244;
					if (arg3 == null) {
						local244 = 0;
					} else {
						local244 = arg3[local39];
					}
					if (arg5 == null) {
						local136 = 0;
					} else {
						local136 = arg5[local39];
					}
					local39++;
					if (local55 != ' ') {
						if ((Static38.anInt1135 & 0xFF000000) != 0) {
							this.fa(local55, local244 + arg4 + 1, local136 + local33 + 1, Static38.anInt1135, true);
						}
						this.fa(local55, local244 + arg4, local33 - -local136, Static430.anInt7591, false);
					} else if (Static91.anInt8789 > 0) {
						Static680.anInt10364 += Static91.anInt8789;
						arg4 += Static680.anInt10364 >> 8;
						Static680.anInt10364 &= 0xFF;
					}
					local148 = this.aClass202_11.method4631(local55);
					if (Static355.anInt6379 != -1) {
						this.aClass16_11.method8153(local148, Static355.anInt6379, (int) ((double) this.aClass202_11.anInt5467 * 0.7D) + local33, arg4);
					}
					if (Static432.anInt7599 != -1) {
						this.aClass16_11.method8153(local148, Static432.anInt7599, local33 + this.aClass202_11.anInt5467, arg4);
					}
					arg4 += local148;
					local37 = local55;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static91.anInt8789 = 0;
		Static432.anInt7599 = -1;
		Static355.anInt6379 = -1;
		Static291.anInt5382 = arg1;
		Static430.anInt7591 = arg1;
		Static680.anInt10364 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static408.anInt6952 = arg0;
		Static38.anInt1135 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZI[ILjava/lang/String;IIIII[Lclient!nf;IIILclient!aa;I)I")
	public final int method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class102[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class1 arg14, @OriginalArg(16) int arg15) {
		if (arg4 == null) {
			return 0;
		}
		this.method7456(arg2, arg6);
		if (arg7 == 0) {
			arg7 = this.aClass202_11.anInt5467;
		}
		@Pc(58) int[] local58;
		if (this.aClass202_11.anInt5465 + this.aClass202_11.anInt5456 + arg7 > arg9 && arg9 < arg7 + arg7) {
			local58 = null;
		} else {
			local58 = new int[] { arg8 };
		}
		@Pc(71) int local71 = this.aClass202_11.method4623(arg4, local58, arg10, Static644.aStringArray74);
		if (arg13 == -1) {
			arg13 = arg9 / arg7;
			if (arg13 <= 0) {
				arg13 = 1;
			}
		}
		if (arg13 > 0 && local71 >= arg13) {
			Static644.aStringArray74[arg13 - 1] = this.aClass202_11.method4629(arg8, Static644.aStringArray74[arg13 - 1], arg10);
			local71 = arg13;
		}
		if (arg1 == 3 && local71 == 1) {
			arg1 = 1;
		}
		@Pc(155) int local155;
		@Pc(180) int local180;
		if (arg1 == 0) {
			local155 = this.aClass202_11.anInt5465 + arg15;
		} else if (arg1 == 1) {
			local155 = (arg9 - arg7 * (local71 - 1) - this.aClass202_11.anInt5465 - this.aClass202_11.anInt5456) / 2 + arg15 + this.aClass202_11.anInt5465;
		} else if (arg1 == 2) {
			local155 = arg15 + arg9 - (local71 - 1) * arg7 - this.aClass202_11.anInt5456;
		} else {
			local180 = (arg9 - arg7 * (local71 - 1) - this.aClass202_11.anInt5465 - this.aClass202_11.anInt5456) / (local71 - -1);
			if (local180 < 0) {
				local180 = 0;
			}
			arg7 += local180;
			local155 = local180 + arg15 + this.aClass202_11.anInt5465;
		}
		for (local180 = 0; local180 < local71; local180++) {
			if (arg11 == 0) {
				this.method7464(arg5, arg14, arg12, arg0, Static644.aStringArray74[local180], arg3, arg10, local155);
			} else if (arg11 == 1) {
				this.method7464((arg8 - this.aClass202_11.method4632(Static644.aStringArray74[local180])) / 2 + arg5, arg14, arg12, arg0, Static644.aStringArray74[local180], arg3, arg10, local155);
			} else if (arg11 == 2) {
				this.method7464(arg8 + arg5 - this.aClass202_11.method4632(Static644.aStringArray74[local180]), arg14, arg12, arg0, Static644.aStringArray74[local180], arg3, arg10, local155);
			} else if (local71 - 1 == local180) {
				this.method7464(arg5, arg14, arg12, arg0, Static644.aStringArray74[local180], arg3, arg10, local155);
			} else {
				this.method7450(Static644.aStringArray74[local180], arg8);
				this.method7464(arg5, arg14, arg12, arg0, Static644.aStringArray74[local180], arg3, arg10, local155);
				Static91.anInt8789 = 0;
			}
			local155 += arg7;
		}
		return local71;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
	public final void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			this.method7456(arg3, arg4);
			this.method7464(arg1 - this.aClass202_11.method4632(arg2), (Class1) null, 0, 0, arg2, (int[]) null, (Class102[]) null, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method7459(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBLjava/lang/String;I)V")
	public final void method7461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7456(-16777216, arg2);
		@Pc(18) int local18 = arg3.length();
		@Pc(21) int[] local21 = new int[local18];
		@Pc(24) int[] local24 = new int[local18];
		for (@Pc(32) int local32 = 0; local32 < local18; local32++) {
			local21[local32] = (int) (Math.sin((double) arg1 / 5.0D + (double) local32 / 5.0D) * 5.0D);
			local24[local32] = (int) (Math.sin((double) arg1 / 5.0D + (double) local32 / 3.0D) * 5.0D);
		}
		this.method7455(arg0, (Class102[]) null, (int[]) null, local21, arg4 - this.aClass202_11.method4632(arg3) / 2, local24, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;III[Lclient!nf;)V")
	public final void method7462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class102[] arg5) {
		if (arg3 != null) {
			this.method7456(0, arg4);
			this.method7464(arg0, (Class1) null, 0, 0, arg3, arg2, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7463(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static430.anInt7591 = Static430.anInt7591 & 0xFF000000 | Static456.method6559(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static430.anInt7591 = Static430.anInt7591 & 0xFF000000 | Static291.anInt5382 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static430.anInt7591 = Static456.method6559(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static430.anInt7591 = Static291.anInt5382;
			} else if (arg0.startsWith("str=")) {
				Static355.anInt6379 = Static430.anInt7591 & 0xFF000000 | Static456.method6559(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static355.anInt6379 = Static430.anInt7591 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static355.anInt6379 = -1;
			} else if (arg0.startsWith("u=")) {
				Static432.anInt7599 = Static430.anInt7591 & 0xFF000000 | Static456.method6559(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static432.anInt7599 = Static430.anInt7591 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static432.anInt7599 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static38.anInt1135 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static38.anInt1135 = Static430.anInt7591 & 0xFF000000 | Static456.method6559(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static38.anInt1135 = Static430.anInt7591 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static38.anInt1135 = Static408.anInt6952;
			} else if (arg0.equals("br")) {
				this.method7456(Static408.anInt6952, Static291.anInt5382);
			}
		} catch (@Pc(193) Exception local193) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!aa;IILjava/lang/String;[I[Lclient!nf;II)V")
	private void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class102[] arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg7 - this.aClass202_11.anInt5467;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg4.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static560.method7658(arg4.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(56) String local56 = arg4.substring(local13 + 1, local20);
					local13 = -1;
					if (local56.equals("lt")) {
						local31 = '<';
					} else if (local56.equals("gt")) {
						local31 = '>';
					} else if (local56.equals("nbsp")) {
						local31 = ' ';
					} else if (local56.equals("shy")) {
						local31 = '\u00ad';
					} else if (local56.equals("times")) {
						local31 = '×';
					} else if (local56.equals("euro")) {
						local31 = '€';
					} else if (local56.equals("copy")) {
						local31 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									@Pc(112) int local112 = Static305.method4695(local56.substring(4));
									@Pc(116) Class102 local116 = arg6[local112];
									@Pc(125) int local125 = arg5 == null ? local116.method6958() : arg5[local112];
									if ((Static430.anInt7591 & 0xFF000000) == -16777216) {
										local116.method6955(arg0, local7 + this.aClass202_11.anInt5467 - local125, 1, 0, 1);
									} else {
										local116.method6955(arg0, local7 + this.aClass202_11.anInt5467 - local125, 0, Static430.anInt7591 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg0 += arg6[local112].method6951();
									local15 = -1;
								} catch (@Pc(178) Exception local178) {
								}
							} else {
								this.method7463(local56);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass202_11.method4627(local15, local31);
					}
					if (local31 == ' ') {
						if (Static91.anInt8789 > 0) {
							Static680.anInt10364 += Static91.anInt8789;
							arg0 += Static680.anInt10364 >> 8;
							Static680.anInt10364 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static38.anInt1135 & 0xFF000000) != 0) {
							this.fa(local31, arg0 + 1, local7 + 1, Static38.anInt1135, true);
						}
						this.fa(local31, arg0, local7, Static430.anInt7591, false);
					} else {
						if ((Static38.anInt1135 & 0xFF000000) != 0) {
							this.method7459(local31, arg0 + 1, local7 - -1, Static38.anInt1135, true, arg1, arg2, arg3);
						}
						this.method7459(local31, arg0, local7, Static430.anInt7591, false, arg1, arg2, arg3);
					}
					@Pc(306) int local306 = this.aClass202_11.method4631(local31);
					if (Static355.anInt6379 != -1) {
						this.aClass16_11.method8153(local306, Static355.anInt6379, (int) ((double) this.aClass202_11.anInt5467 * 0.7D) + local7, arg0);
					}
					if (Static432.anInt7599 != -1) {
						this.aClass16_11.method8153(local306, Static432.anInt7599, this.aClass202_11.anInt5467 + local7 + 1, arg0);
					}
					arg0 += local306;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public final void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method7456(-16777216, arg1);
		@Pc(29) double local29 = 7.0D - (double) arg5 / 8.0D;
		if (local29 < 0.0D) {
			local29 = 0.0D;
		}
		@Pc(38) int local38 = arg3.length();
		@Pc(41) int[] local41 = new int[local38];
		for (@Pc(43) int local43 = 0; local43 < local38; local43++) {
			local41[local43] = (int) (local29 * Math.sin((double) arg0 + (double) local43 / 1.5D));
		}
		this.method7455(arg4, (Class102[]) null, (int[]) null, (int[]) null, arg2 - this.aClass202_11.method4632(arg3) / 2, local41, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method7466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method7456(-16777216, arg2);
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		for (@Pc(45) int local45 = 0; local45 < local40; local45++) {
			local43[local45] = (int) (Math.sin((double) arg1 / 5.0D + (double) local45 / 2.0D) * 5.0D);
		}
		this.method7455(arg0, (Class102[]) null, (int[]) null, (int[]) null, arg4 - this.aClass202_11.method4632(arg3) / 2, local43, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	public final void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method7456(arg1, arg3);
			this.method7464(arg0 - this.aClass202_11.method4632(arg2) / 2, (Class1) null, 0, 0, arg2, (int[]) null, (Class102[]) null, arg4);
		}
	}
}
