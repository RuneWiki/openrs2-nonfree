import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public abstract class Class9 {

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!vc;")
	private final Class63 aClass63_9;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!kg;")
	private final Class136 aClass136_8;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!vc;Lclient!kg;)V")
	protected Class9(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class136 arg1) {
		this.aClass63_9 = arg0;
		this.aClass136_8 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;IILjava/util/Random;[II[Lclient!rn;II)I")
	public final int method5042(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Random arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class18[] arg5, @OriginalArg(8) int arg6) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg6);
		@Pc(20) int local20 = (arg2.nextInt() & 0x1F) + 192;
		this.method5058(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg2.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5048(null, arg1, arg5, local43, arg0, arg3, arg4);
		return local45;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(20) int local20 = 0;
		@Pc(22) boolean local22 = false;
		for (@Pc(24) int local24 = 0; arg1.length() > local24; local24++) {
			@Pc(30) char local30 = arg1.charAt(local24);
			if (local30 == '<') {
				local22 = true;
			} else if (local30 == '>') {
				local22 = false;
			} else if (!local22 && local30 == ' ') {
				local20++;
			}
		}
		if (local20 > 0) {
			Static115.anInt2455 = (arg0 - this.aClass136_8.method3125(arg1) << 8) / local20;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BIIILjava/lang/String;[Lclient!rn;Lclient!oj;[II)V")
	private void method5044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class18[] arg4, @OriginalArg(6) Class165 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg0 - this.aClass136_8.anInt3409;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(31) int local31 = arg3.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(44) char local44 = (char) (Static222.method3652(arg3.charAt(local33)) & 0xFF);
			if (local44 == '<') {
				local13 = local33;
			} else {
				if (local44 == '>' && local13 != -1) {
					@Pc(66) String local66 = arg3.substring(local13 + 1, local33);
					local13 = -1;
					if (local66.equals("lt")) {
						local44 = '<';
					} else if (local66.equals("gt")) {
						local44 = '>';
					} else if (local66.equals("nbsp")) {
						local44 = ' ';
					} else if (local66.equals("shy")) {
						local44 = '\u00ad';
					} else if (local66.equals("times")) {
						local44 = '×';
					} else if (local66.equals("euro")) {
						local44 = '€';
					} else if (local66.equals("copy")) {
						local44 = '©';
					} else {
						if (!local66.equals("reg")) {
							if (local66.startsWith("img=")) {
								try {
									@Pc(134) int local134 = Static189.method5666(local66.substring(4));
									@Pc(138) Class18 local138 = arg4[local134];
									@Pc(147) int local147 = arg6 == null ? local138.method4560() : arg6[local134];
									if ((Static51.anInt1044 & 0xFF000000) == -16777216) {
										local138.method4557(arg2, this.aClass136_8.anInt3409 + local7 - local147, 0, 0);
									} else {
										local138.method4557(arg2, this.aClass136_8.anInt3409 + local7 - local147, 1, Static51.anInt1044 & 0xFF000000 | 0xFFFFFF);
									}
									arg2 += arg4[local134].method4564();
									local15 = -1;
								} catch (@Pc(198) Exception local198) {
								}
							} else {
								this.method5055(local66);
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg2 += this.aClass136_8.method3126(local44, local15);
					}
					if (local44 == ' ') {
						if (Static115.anInt2455 > 0) {
							Static203.anInt3744 += Static115.anInt2455;
							arg2 += Static203.anInt3744 >> 8;
							Static203.anInt3744 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static250.anInt4450 & 0xFF000000) != 0) {
							this.method5057(local44, arg2 + 1, local7 - -1, Static250.anInt4450, true);
						}
						this.method5057(local44, arg2, local7, Static51.anInt1044, false);
					} else {
						if ((Static250.anInt4450 & 0xFF000000) != 0) {
							this.method5045(local44, arg2 + 1, local7 + 1, Static250.anInt4450, true, arg5, arg1, arg7);
						}
						this.method5045(local44, arg2, local7, Static51.anInt1044, false, arg5, arg1, arg7);
					}
					@Pc(316) int local316 = this.aClass136_8.method3127(local44);
					if (Static128.anInt2630 != -1) {
						this.aClass63_9.method1954(local316, (int) ((double) this.aClass136_8.anInt3409 * 0.7D) + local7, arg2, Static128.anInt2630);
					}
					if (Static376.anInt6325 != -1) {
						this.aClass63_9.method1954(local316, local7 + this.aClass136_8.anInt3409 + 1, arg2, Static376.anInt6325);
					}
					arg2 += local316;
					local15 = local44;
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(CIIIZLclient!oj;II)V")
	protected abstract void method5045(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class165 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[Lclient!rn;[IILjava/util/Random;IIII[ILjava/lang/String;ZIII)I")
	public final int method5046(@OriginalArg(0) int arg0, @OriginalArg(1) Class18[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) String arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return 0;
		}
		arg4.setSeed((long) arg8);
		@Pc(21) int local21 = (arg4.nextInt() & 0x1F) + 192;
		this.method5058(arg5 & 0xFFFFFF | local21 << 24, local21 << 24 | arg3 & 0xFFFFFF);
		@Pc(54) int local54 = arg10.length();
		@Pc(57) int[] local57 = new int[local54];
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < local54; local61++) {
			local57[local61] = local59;
			if ((arg4.nextInt() & 0x3) == 0) {
				local59++;
			}
		}
		@Pc(86) int local86 = arg11;
		@Pc(92) int local92 = arg13 + this.aClass136_8.anInt3408;
		@Pc(94) int local94 = -1;
		if (arg6 == 1) {
			local92 += (arg0 - this.aClass136_8.anInt3408 - this.aClass136_8.anInt3405) / 2;
		} else if (arg6 == 2) {
			local92 = arg13 + arg0 - this.aClass136_8.anInt3405;
		}
		if (arg7 == 1) {
			local94 = local59 + this.aClass136_8.method3125(arg10);
			local86 = arg11 + (arg12 - local94) / 2;
		} else if (arg7 == 2) {
			local94 = local59 + this.aClass136_8.method3125(arg10);
			local86 = arg11 + arg12 - local94;
		}
		this.method5048(null, local86, arg1, local57, arg10, arg9, local92);
		if (arg2 != null) {
			if (local94 == -1) {
				local94 = local59 + this.aClass136_8.method3125(arg10);
			}
			arg2[0] = local86;
			arg2[2] = local94;
			arg2[1] = local92 - this.aClass136_8.anInt3408;
			arg2[3] = this.aClass136_8.anInt3405 + this.aClass136_8.anInt3408;
		}
		return local59;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[IIIIBILjava/lang/String;Lclient!oj;II[Lclient!rn;IIII)I")
	public final int method5047(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class165 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class18[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg6 == null) {
			return 0;
		}
		this.method5058(arg2, arg12);
		if (arg5 == 0) {
			arg5 = this.aClass136_8.anInt3409;
		}
		@Pc(53) int[] local53;
		if (this.aClass136_8.anInt3408 + this.aClass136_8.anInt3405 + arg5 > arg0 && arg0 < arg5 + arg5) {
			local53 = null;
		} else {
			local53 = new int[] { arg9 };
		}
		@Pc(71) int local71 = this.aClass136_8.method3124(local53, Static205.aStringArray96, arg10, arg6);
		if (arg8 == 3 && local71 == 1) {
			arg8 = 1;
		}
		@Pc(90) int local90;
		@Pc(152) int local152;
		if (arg8 == 0) {
			local90 = arg4 + this.aClass136_8.anInt3408;
		} else if (arg8 == 1) {
			local90 = (arg0 - this.aClass136_8.anInt3408 - this.aClass136_8.anInt3405 - (local71 - 1) * arg5) / 2 + arg4 + this.aClass136_8.anInt3408;
		} else if (arg8 == 2) {
			local90 = arg0 + arg4 - this.aClass136_8.anInt3405 - arg5 * (local71 + -1);
		} else {
			local152 = (arg0 - arg5 * (local71 - 1) - this.aClass136_8.anInt3405 - this.aClass136_8.anInt3408) / (local71 + 1);
			if (local152 < 0) {
				local152 = 0;
			}
			arg5 += local152;
			local90 = this.aClass136_8.anInt3408 + arg4 + local152;
		}
		for (local152 = 0; local152 < local71; local152++) {
			if (arg11 == 0) {
				this.method5044(local90, arg14, arg13, Static205.aStringArray96[local152], arg10, arg7, arg1, arg3);
			} else if (arg11 == 1) {
				this.method5044(local90, arg14, (arg9 - this.aClass136_8.method3125(Static205.aStringArray96[local152])) / 2 + arg13, Static205.aStringArray96[local152], arg10, arg7, arg1, arg3);
			} else if (arg11 == 2) {
				this.method5044(local90, arg14, arg13 + arg9 - this.aClass136_8.method3125(Static205.aStringArray96[local152]), Static205.aStringArray96[local152], arg10, arg7, arg1, arg3);
			} else if (local71 - 1 == local152) {
				this.method5044(local90, arg14, arg13, Static205.aStringArray96[local152], arg10, arg7, arg1, arg3);
			} else {
				this.method5043(arg9, Static205.aStringArray96[local152]);
				this.method5044(local90, arg14, arg13, Static205.aStringArray96[local152], arg10, arg7, arg1, arg3);
				Static115.anInt2455 = 0;
			}
			local90 += arg5;
		}
		return local71;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([II[Lclient!rn;I[ILjava/lang/String;[II)V")
	private void method5048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 - this.aClass136_8.anInt3409;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg4.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(33) char local33 = (char) (Static222.method3652(arg4.charAt(local22)) & 0xFF);
			if (local33 == '<') {
				local13 = local22;
			} else {
				@Pc(121) int local121;
				@Pc(131) int local131;
				if (local33 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg4.substring(local13 + 1, local22);
					local13 = -1;
					if (local53.equals("lt")) {
						local33 = '<';
					} else if (local53.equals("gt")) {
						local33 = '>';
					} else if (local53.equals("nbsp")) {
						local33 = ' ';
					} else if (local53.equals("shy")) {
						local33 = '\u00ad';
					} else if (local53.equals("times")) {
						local33 = '×';
					} else if (local53.equals("euro")) {
						local33 = '€';
					} else if (local53.equals("copy")) {
						local33 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local121 = 0;
									} else {
										local121 = arg3[local17];
									}
									if (arg0 == null) {
										local131 = 0;
									} else {
										local131 = arg0[local17];
									}
									local17++;
									@Pc(144) int local144 = Static189.method5666(local53.substring(4));
									@Pc(148) Class18 local148 = arg2[local144];
									@Pc(157) int local157 = arg5 == null ? local148.method4560() : arg5[local144];
									local148.method4557(local121 + arg1, local131 + (this.aClass136_8.anInt3409 + local11 - local157), 0, 0);
									local15 = -1;
									arg1 += arg2[local144].method4564();
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method5055(local53);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg1 += this.aClass136_8.method3126(local33, local15);
					}
					@Pc(218) int local218;
					if (arg3 == null) {
						local218 = 0;
					} else {
						local218 = arg3[local17];
					}
					if (arg0 == null) {
						local121 = 0;
					} else {
						local121 = arg0[local17];
					}
					local17++;
					if (local33 != ' ') {
						if ((Static250.anInt4450 & 0xFF000000) != 0) {
							this.method5057(local33, local218 + arg1 + 1, local121 + local11 + 1, Static250.anInt4450, true);
						}
						this.method5057(local33, local218 + arg1, local11 - -local121, Static51.anInt1044, false);
					} else if (Static115.anInt2455 > 0) {
						Static203.anInt3744 += Static115.anInt2455;
						arg1 += Static203.anInt3744 >> 8;
						Static203.anInt3744 &= 0xFF;
					}
					local131 = this.aClass136_8.method3127(local33);
					if (Static128.anInt2630 != -1) {
						this.aClass63_9.method1954(local131, local11 + (int) ((double) this.aClass136_8.anInt3409 * 0.7D), arg1, Static128.anInt2630);
					}
					if (Static376.anInt6325 != -1) {
						this.aClass63_9.method1954(local131, local11 + this.aClass136_8.anInt3409, arg1, Static376.anInt6325);
					}
					local15 = local33;
					arg1 += local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		if (arg2 != null) {
			this.method5058(arg3, -1);
			this.method5044(arg1, 0, arg0 - this.aClass136_8.method3125(arg2), arg2, null, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZIIIIILjava/lang/String;)V")
	public final void method5050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method5058(arg2, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg3 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(43) int[] local43 = new int[local30];
		for (@Pc(45) int local45 = 0; local45 < local30; local45++) {
			local43[local45] = (int) (local21 * Math.sin((double) local45 / 1.5D + (double) arg4));
		}
		this.method5048(local43, arg0 - this.aClass136_8.method3125(arg5) / 2, null, null, arg5, null, arg1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBLjava/lang/String;IIII)V")
	public final void method5051(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5058(arg2, -16777216);
		@Pc(16) int local16 = arg0.length();
		@Pc(27) int[] local27 = new int[local16];
		@Pc(30) int[] local30 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local27[local32] = (int) (Math.sin((double) arg3 / 5.0D + (double) local32 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5048(local30, arg4 - this.aClass136_8.method3125(arg0) / 2, null, local27, arg0, null, arg1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZILjava/lang/String;II)V")
	public final void method5052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5058(arg0, arg3);
			this.method5044(arg1, 0, arg4, arg2, null, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method5054(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method5058(arg1, arg2);
			this.method5044(arg3, 0, arg4 - this.aClass136_8.method3125(arg0) / 2, arg0, null, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5055(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static51.anInt1044 = Static51.anInt1044 & 0xFF000000 | Static142.method2678(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static51.anInt1044 = Static51.anInt1044 & 0xFF000000 | Static33.anInt697 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static51.anInt1044 = Static142.method2678(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static51.anInt1044 = Static33.anInt697;
			} else if (arg0.startsWith("str=")) {
				Static128.anInt2630 = Static142.method2678(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static128.anInt2630 = -8388608;
			} else if (arg0.equals("/str")) {
				Static128.anInt2630 = -1;
			} else if (arg0.startsWith("u=")) {
				Static376.anInt6325 = Static142.method2678(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static376.anInt6325 = -16777216;
			} else if (arg0.equals("/u")) {
				Static376.anInt6325 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static250.anInt4450 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static250.anInt4450 = Static142.method2678(arg0.substring(5)) | 0xFF000000;
				return;
			} else if (arg0.equals("shad")) {
				Static250.anInt4450 = -16777216;
				return;
			} else if (arg0.equals("/shad")) {
				Static250.anInt4450 = Static380.anInt6476;
				return;
			} else if (arg0.equals("br")) {
				this.method5058(Static33.anInt697, Static380.anInt6476);
				return;
			}
		} catch (@Pc(159) Exception local159) {
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZLjava/lang/String;III)V")
	public final void method5056(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5058(arg4, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) local21 / 2.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method5048(local19, arg0 - this.aClass136_8.method3125(arg1) / 2, null, null, arg1, null, arg2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5057(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	private void method5058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static203.anInt3744 = 0;
		Static128.anInt2630 = -1;
		Static115.anInt2455 = 0;
		Static33.anInt697 = arg0;
		Static51.anInt1044 = arg0;
		Static376.anInt6325 = -1;
		Static380.anInt6476 = arg1;
		Static250.anInt4450 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;I[II[Lclient!rn;II)V")
	public final void method5060(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) Class18[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 != null) {
			this.method5058(arg5, 0);
			this.method5044(arg1, 0, arg4, arg0, arg3, null, arg2, 0);
		}
	}
}
