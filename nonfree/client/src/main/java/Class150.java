import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public abstract class Class150 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "[B")
	public static final byte[] aByteArray100 = new byte[32896];

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!qb;")
	private final Class190 aClass190_9;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!np;")
	private final Class155 aClass155_10;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray100[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
		new Class57("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!np;Lclient!qb;)V")
	protected Class150(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class190 arg1) {
		this.aClass190_9 = arg1;
		this.aClass155_10 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([III[I[IILjava/lang/String;[Lclient!tr;)V")
	private void method5720(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) Class110[] arg6) {
		@Pc(7) int local7 = arg1 - this.aClass190_9.anInt4835;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg5.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static281.method4462(arg5.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(121) int local121;
				@Pc(131) int local131;
				if (local33 == '>' && local13 != -1) {
					@Pc(57) String local57 = arg5.substring(local13 + 1, local22);
					local13 = -1;
					if (local57.equals("lt")) {
						local33 = '<';
					} else if (local57.equals("gt")) {
						local33 = '>';
					} else if (local57.equals("nbsp")) {
						local33 = ' ';
					} else if (local57.equals("shy")) {
						local33 = '\u00ad';
					} else if (local57.equals("times")) {
						local33 = '×';
					} else if (local57.equals("euro")) {
						local33 = '€';
					} else if (local57.equals("copy")) {
						local33 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local121 = 0;
									} else {
										local121 = arg0[local17];
									}
									if (arg3 == null) {
										local131 = 0;
									} else {
										local131 = arg3[local17];
									}
									local17++;
									@Pc(146) int local146 = Static321.method2984(local57.substring(4));
									@Pc(150) Class110 local150 = arg6[local146];
									@Pc(159) int local159 = arg2 == null ? local150.method5097() : arg2[local146];
									local150.method5085(arg4 + local121, local131 + -local159 + this.aClass190_9.anInt4835 + local7, 0, 0);
									arg4 += arg6[local146].method5101();
									local15 = -1;
								} catch (@Pc(188) Exception local188) {
								}
							} else {
								this.method5736(local57);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass190_9.method4354(local33, local15);
					}
					@Pc(223) int local223;
					if (arg0 == null) {
						local223 = 0;
					} else {
						local223 = arg0[local17];
					}
					if (arg3 == null) {
						local121 = 0;
					} else {
						local121 = arg3[local17];
					}
					if (local33 != ' ') {
						if ((Static388.anInt6440 & 0xFF000000) != 0) {
							this.method5733(local33, local223 + arg4 + 1, local7 - -local121 + 1, Static388.anInt6440, true);
						}
						this.method5733(local33, local223 + arg4, local7 + local121, Static373.anInt6219, false);
					} else if (Static251.anInt4499 > 0) {
						Static266.anInt4710 += Static251.anInt4499;
						arg4 += Static266.anInt4710 >> 8;
						Static266.anInt4710 &= 0xFF;
					}
					local17++;
					local131 = this.aClass190_9.method4359(local33);
					if (Static246.anInt4420 != -1) {
						this.aClass155_10.method4879(Static246.anInt4420, local131, local7 + (int) ((double) this.aClass190_9.anInt4835 * 0.7D), arg4);
					}
					if (Static51.anInt1085 != -1) {
						this.aClass155_10.method4879(Static51.anInt1085, local131, local7 + this.aClass190_9.anInt4835, arg4);
					}
					local15 = local33;
					arg4 += local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!sm;IILjava/lang/String;II[Lclient!tr;[I)V")
	private void method5721(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class110[] arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg0 - this.aClass190_9.anInt4835;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg4.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static281.method4462(arg4.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg4.substring(local13 + 1, local20);
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
									@Pc(109) int local109 = Static321.method2984(local53.substring(4));
									@Pc(113) Class110 local113 = arg6[local109];
									@Pc(122) int local122 = arg7 == null ? local113.method5097() : arg7[local109];
									if ((Static373.anInt6219 & 0xFF000000) == -16777216) {
										local113.method5085(arg5, local7 + this.aClass190_9.anInt4835 - local122, 0, 0);
									} else {
										local113.method5085(arg5, this.aClass190_9.anInt4835 + local7 - local122, 1, Static373.anInt6219 & 0xFF000000 | 0xFFFFFF);
									}
									arg5 += arg6[local109].method5101();
									local15 = -1;
								} catch (@Pc(175) Exception local175) {
								}
							} else {
								this.method5736(local53);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg5 += this.aClass190_9.method4354(local31, local15);
					}
					if (local31 == ' ') {
						if (Static251.anInt4499 > 0) {
							Static266.anInt4710 += Static251.anInt4499;
							arg5 += Static266.anInt4710 >> 8;
							Static266.anInt4710 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static388.anInt6440 & 0xFF000000) != 0) {
							this.method5733(local31, arg5 + 1, local7 + 1, Static388.anInt6440, true);
						}
						this.method5733(local31, arg5, local7, Static373.anInt6219, false);
					} else {
						if ((Static388.anInt6440 & 0xFF000000) != 0) {
							this.method5731(local31, arg5 + 1, local7 - -1, Static388.anInt6440, true, arg1, arg2, arg3);
						}
						this.method5731(local31, arg5, local7, Static373.anInt6219, false, arg1, arg2, arg3);
					}
					@Pc(303) int local303 = this.aClass190_9.method4359(local31);
					if (Static246.anInt4420 != -1) {
						this.aClass155_10.method4879(Static246.anInt4420, local303, local7 + (int) ((double) this.aClass190_9.anInt4835 * 0.7D), arg5);
					}
					if (Static51.anInt1085 != -1) {
						this.aClass155_10.method4879(Static51.anInt1085, local303, local7 + this.aClass190_9.anInt4835 + 1, arg5);
					}
					local15 = local31;
					arg5 += local303;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
	public final void method5722(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5729(arg2, arg1);
			this.method5721(arg4, null, 0, 0, arg0, arg3, null, null);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIIIILjava/lang/String;I)V")
	public final void method5723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5729(-16777216, arg1);
		@Pc(20) double local20 = 7.0D - (double) arg0 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(36) int local36 = arg5.length();
		@Pc(39) int[] local39 = new int[local36];
		for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
			local39[local41] = (int) (Math.sin((double) local41 / 1.5D + (double) arg4) * local20);
		}
		this.method5720(null, arg3, null, local39, arg2 - this.aClass190_9.method4358(arg5) / 2, arg5, null);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5724(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
			@Pc(17) char local17 = arg1.charAt(local11);
			if (local17 == '<') {
				local9 = true;
			} else if (local17 == '>') {
				local9 = false;
			} else if (!local9 && local17 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static251.anInt4499 = (arg0 - this.aClass190_9.method4358(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method5725(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		if (arg3 != null) {
			this.method5729(-1, arg2);
			this.method5721(arg1, null, 0, 0, arg3, arg0 - this.aClass190_9.method4358(arg3), null, null);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[Lclient!tr;Ljava/lang/String;I[III)V")
	public final void method5726(@OriginalArg(1) int arg0, @OriginalArg(2) Class110[] arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method5729(0, arg0);
			this.method5721(arg5, null, 0, 0, arg2, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method5727(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5729(-16777216, arg4);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg2 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method5720(null, arg3, null, local19, arg0 - this.aClass190_9.method4358(arg1) / 2, arg1, null);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5728(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5729(arg2, arg1);
			this.method5721(arg3, null, 0, 0, arg0, arg4 - this.aClass190_9.method4358(arg0) / 2, null, null);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)V")
	private void method5729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static251.anInt4499 = 0;
		Static246.anInt4420 = -1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static51.anInt1085 = -1;
		Static296.anInt5111 = arg1;
		Static373.anInt6219 = arg1;
		Static266.anInt4710 = 0;
		Static175.anInt3062 = arg0;
		Static388.anInt6440 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!sm;IIIZIII[IIIILjava/lang/String;I[Lclient!tr;)I")
	public final int method5730(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class110[] arg14) {
		if (arg12 == null) {
			return 0;
		}
		this.method5729(arg5, arg7);
		if (arg4 == 0) {
			arg4 = this.aClass190_9.anInt4835;
		}
		@Pc(48) int[] local48;
		if (arg4 + this.aClass190_9.anInt4829 + this.aClass190_9.anInt4834 > arg9 && arg4 + arg4 > arg9) {
			local48 = null;
		} else {
			local48 = new int[] { arg11 };
		}
		@Pc(61) int local61 = this.aClass190_9.method4357(local48, Static314.aStringArray37, arg12, arg14);
		if (arg3 == 3 && local61 == 1) {
			arg3 = 1;
		}
		@Pc(102) int local102;
		@Pc(126) int local126;
		if (arg3 == 0) {
			local102 = arg0 + this.aClass190_9.anInt4829;
		} else if (arg3 == 1) {
			local102 = (arg9 - arg4 * (local61 - 1) - this.aClass190_9.anInt4834 - this.aClass190_9.anInt4829) / 2 + this.aClass190_9.anInt4829 + arg0;
		} else if (arg3 == 2) {
			local102 = arg0 + arg9 - arg4 * (local61 - 1) - this.aClass190_9.anInt4834;
		} else {
			local126 = (arg9 - this.aClass190_9.anInt4834 - this.aClass190_9.anInt4829 - (local61 + -1) * arg4) / (local61 + 1);
			if (local126 < 0) {
				local126 = 0;
			}
			local102 = local126 + this.aClass190_9.anInt4829 + arg0;
			arg4 += local126;
		}
		for (local126 = 0; local126 < local61; local126++) {
			if (arg2 == 0) {
				this.method5721(local102, arg1, arg13, arg6, Static314.aStringArray37[local126], arg10, arg14, arg8);
			} else if (arg2 == 1) {
				this.method5721(local102, arg1, arg13, arg6, Static314.aStringArray37[local126], arg10 + (arg11 - this.aClass190_9.method4358(Static314.aStringArray37[local126])) / 2, arg14, arg8);
			} else if (arg2 == 2) {
				this.method5721(local102, arg1, arg13, arg6, Static314.aStringArray37[local126], arg10 + arg11 - this.aClass190_9.method4358(Static314.aStringArray37[local126]), arg14, arg8);
			} else if (local126 == local61 - 1) {
				this.method5721(local102, arg1, arg13, arg6, Static314.aStringArray37[local126], arg10, arg14, arg8);
			} else {
				this.method5724(arg11, Static314.aStringArray37[local126]);
				this.method5721(local102, arg1, arg13, arg6, Static314.aStringArray37[local126], arg10, arg14, arg8);
				Static251.anInt4499 = 0;
			}
			local102 += arg4;
		}
		return local61;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(CIIIZLclient!sm;II)V")
	protected abstract void method5731(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class38 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/util/Random;[IB[Lclient!tr;IIIIIIIILjava/lang/String;[I)I")
	public final int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class110[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) String arg12, @OriginalArg(14) int[] arg13) {
		if (arg12 == null) {
			return 0;
		}
		arg1.setSeed((long) arg6);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method5729(arg5 & 0xFFFFFF | local20 << 24, local20 << 24 | arg11 & 0xFFFFFF);
		@Pc(40) int local40 = arg12.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg1.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(72) int local72 = arg8;
		@Pc(79) int local79 = arg4 + this.aClass190_9.anInt4829;
		if (arg0 == 1) {
			local79 += (arg7 - this.aClass190_9.anInt4834 - this.aClass190_9.anInt4829) / 2;
		} else if (arg0 == 2) {
			local79 = arg4 + arg7 - this.aClass190_9.anInt4834;
		}
		@Pc(115) int local115 = -1;
		if (arg9 == 1) {
			local115 = this.aClass190_9.method4358(arg12) + local45;
			local72 = arg8 + (arg10 - local115) / 2;
		} else if (arg9 == 2) {
			local115 = local45 + this.aClass190_9.method4358(arg12);
			local72 = arg8 + arg10 - local115;
		}
		this.method5720(local43, local79, arg2, null, local72, arg12, arg3);
		if (arg13 != null) {
			if (local115 == -1) {
				local115 = local45 + this.aClass190_9.method4358(arg12);
			}
			arg13[3] = this.aClass190_9.anInt4829 + this.aClass190_9.anInt4834;
			arg13[2] = local115;
			arg13[0] = local72;
			arg13[1] = local79 - this.aClass190_9.anInt4829;
		}
		return local45;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5733(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5729(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg3 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5720(local19, arg4, null, local22, arg1 - this.aClass190_9.method4358(arg2) / 2, arg2, null);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5736(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static373.anInt6219 = Static373.anInt6219 & 0xFF000000 | Static297.method4590(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static373.anInt6219 = Static373.anInt6219 & 0xFF000000 | Static296.anInt5111 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static373.anInt6219 = Static297.method4590(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static373.anInt6219 = Static296.anInt5111;
			} else if (arg0.startsWith("str=")) {
				Static246.anInt4420 = Static297.method4590(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static246.anInt4420 = -8388608;
			} else if (arg0.equals("/str")) {
				Static246.anInt4420 = -1;
			} else if (arg0.startsWith("u=")) {
				Static51.anInt1085 = Static297.method4590(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static51.anInt1085 = -16777216;
			} else if (arg0.equals("/u")) {
				Static51.anInt1085 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static388.anInt6440 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static388.anInt6440 = Static297.method4590(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static388.anInt6440 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static388.anInt6440 = Static175.anInt3062;
			} else if (arg0.equals("br")) {
				this.method5729(Static175.anInt3062, Static296.anInt5111);
			}
		} catch (@Pc(173) Exception local173) {
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILjava/util/Random;B[Lclient!tr;Ljava/lang/String;[I)I")
	public final int method5737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(7) Class110[] arg4, @OriginalArg(8) String arg5, @OriginalArg(9) int[] arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg3.setSeed((long) arg0);
		@Pc(21) int local21 = (arg3.nextInt() & 0x1F) + 192;
		this.method5729((local21 | 0x0) << 24, local21 << 24 | 0xFFFFFF);
		@Pc(41) int local41 = arg5.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(56) int local56 = 0; local56 < local41; local56++) {
			local44[local56] = local46;
			if ((arg3.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		this.method5720(local44, arg2, arg6, null, arg1, arg5, arg4);
		return local46;
	}
}
