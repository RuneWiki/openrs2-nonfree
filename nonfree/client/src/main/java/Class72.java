import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class72 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!kf;")
	private final Class198 aClass198_13;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!ha;")
	private final Class143 aClass143_12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!kf;)V")
	protected Class72(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass198_13 = arg1;
		this.aClass143_12 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIIIB)V")
	public final void method6909(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method6916(-16777216, arg2);
		@Pc(23) double local23 = 7.0D - (double) arg4 / 8.0D;
		if (local23 < 0.0D) {
			local23 = 0.0D;
		}
		@Pc(32) int local32 = arg0.length();
		@Pc(35) int[] local35 = new int[local32];
		for (@Pc(37) int local37 = 0; local37 < local32; local37++) {
			local35[local37] = (int) (Math.sin((double) arg3 + (double) local37 / 1.5D) * local23);
		}
		this.method6915((int[]) null, (int[]) null, (Class59[]) null, arg5 - this.aClass198_13.method4076(arg0) / 2, arg1, local35, arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method6910(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method6911(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
			@Pc(14) char local14 = arg1.charAt(local9);
			if (local14 == '<') {
				local7 = true;
			} else if (local14 == '>') {
				local7 = false;
			} else if (!local7 && local14 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static115.anInt2030 = (arg0 - this.aClass198_13.method4076(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIIIIIBILclient!aa;[Lclient!qda;[II)I")
	public final int method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class1 arg11, @OriginalArg(13) Class59[] arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14) {
		return this.method6913(arg4, arg11, arg7, arg1, arg0, arg14, arg2, arg10, arg6, arg12, 0, arg13, arg3, arg8, arg9, arg5);
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!aa;IIIILjava/lang/String;III[Lclient!qda;I[IIIII)I")
	public final int method6913(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class59[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15) {
		if (arg6 == null) {
			return 0;
		}
		this.method6916(arg5, arg13);
		if (arg2 == 0) {
			arg2 = this.aClass198_13.anInt4637;
		}
		@Pc(49) int[] local49;
		if (arg3 < this.aClass198_13.anInt4648 + this.aClass198_13.anInt4647 + arg2 && arg3 < arg2 + arg2) {
			local49 = null;
		} else {
			local49 = new int[] { arg8 };
		}
		if (arg10 == -1) {
			arg10 = arg3 / arg2;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		@Pc(76) int local76 = this.aClass198_13.method4085(Static531.aStringArray34, arg9, arg6, local49);
		if (arg10 > 0 && arg10 <= local76) {
			local76 = arg10;
			Static531.aStringArray34[arg10 - 1] = this.aClass198_13.method4075(Static531.aStringArray34[arg10 - 1], arg8, arg9);
		}
		if (arg15 == 3 && local76 == 1) {
			arg15 = 1;
		}
		@Pc(145) int local145;
		@Pc(173) int local173;
		if (arg15 == 0) {
			local145 = this.aClass198_13.anInt4647 + arg4;
		} else if (arg15 == 1) {
			local145 = (arg3 - this.aClass198_13.anInt4648 - this.aClass198_13.anInt4647 - (local76 + -1) * arg2) / 2 + arg4 + this.aClass198_13.anInt4647;
		} else if (arg15 == 2) {
			local145 = arg4 + arg3 - this.aClass198_13.anInt4648 - (local76 - 1) * arg2;
		} else {
			local173 = (arg3 - this.aClass198_13.anInt4647 - this.aClass198_13.anInt4648 - (local76 - 1) * arg2) / (local76 + 1);
			if (local173 < 0) {
				local173 = 0;
			}
			arg2 += local173;
			local145 = arg4 + this.aClass198_13.anInt4647 + local173;
		}
		for (local173 = 0; local173 < local76; local173++) {
			if (arg7 == 0) {
				this.method6920(arg12, arg11, arg14, Static531.aStringArray34[local173], arg0, arg9, arg1, local145);
			} else if (arg7 == 1) {
				this.method6920(arg12, arg11, (arg8 - this.aClass198_13.method4076(Static531.aStringArray34[local173])) / 2 + arg14, Static531.aStringArray34[local173], arg0, arg9, arg1, local145);
			} else if (arg7 == 2) {
				this.method6920(arg12, arg11, arg8 + arg14 - this.aClass198_13.method4076(Static531.aStringArray34[local173]), Static531.aStringArray34[local173], arg0, arg9, arg1, local145);
			} else if (local173 == local76 - 1) {
				this.method6920(arg12, arg11, arg14, Static531.aStringArray34[local173], arg0, arg9, arg1, local145);
			} else {
				this.method6911(arg8, Static531.aStringArray34[local173]);
				this.method6920(arg12, arg11, arg14, Static531.aStringArray34[local173], arg0, arg9, arg1, local145);
				Static115.anInt2030 = 0;
			}
			local145 += arg2;
		}
		return local76;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method6914(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method6916(-16777216, arg0);
		@Pc(14) int local14 = arg2.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(26) int local26 = 0; local26 < local14; local26++) {
			local17[local26] = (int) (Math.sin((double) arg3 / 5.0D + (double) local26 / 5.0D) * 5.0D);
			local20[local26] = (int) (Math.sin((double) local26 / 3.0D + (double) arg3 / 5.0D) * 5.0D);
		}
		this.method6915((int[]) null, local17, (Class59[]) null, arg4 - this.aClass198_13.method4076(arg2) / 2, arg1, local20, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B[I[I[Lclient!qda;II[ILjava/lang/String;)V")
	private void method6915(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class59[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) String arg6) {
		@Pc(9) int local9 = arg4 - this.aClass198_13.anInt4637;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(38) char local38 = (char) (Static404.method5902(arg6.charAt(local28)) & 0xFF);
			if (local38 == '<') {
				local11 = local28;
			} else {
				@Pc(125) int local125;
				@Pc(134) int local134;
				if (local38 == '>' && local11 != -1) {
					@Pc(57) String local57 = arg6.substring(local11 + 1, local28);
					local11 = -1;
					if (local57.equals("lt")) {
						local38 = '<';
					} else if (local57.equals("gt")) {
						local38 = '>';
					} else if (local57.equals("nbsp")) {
						local38 = ' ';
					} else if (local57.equals("shy")) {
						local38 = '\u00ad';
					} else if (local57.equals("times")) {
						local38 = '×';
					} else if (local57.equals("euro")) {
						local38 = '€';
					} else if (local57.equals("copy")) {
						local38 = '©';
					} else {
						if (!local57.equals("reg")) {
							if (local57.startsWith("img=")) {
								try {
									if (arg1 == null) {
										local125 = 0;
									} else {
										local125 = arg1[local15];
									}
									if (arg5 == null) {
										local134 = 0;
									} else {
										local134 = arg5[local15];
									}
									local15++;
									@Pc(144) int local144 = Static171.method2534(local57.substring(4));
									@Pc(148) Class59 local148 = arg2[local144];
									@Pc(157) int local157 = arg0 == null ? local148.method8064() : arg0[local144];
									local148.method8067(arg3 + local125, -local157 + (local9 - (-this.aClass198_13.anInt4637 - local134)), 1, 0, 1);
									arg3 += arg2[local144].method8053();
									local13 = -1;
								} catch (@Pc(187) Exception local187) {
								}
							} else {
								this.method6924(local57);
							}
							continue;
						}
						local38 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg3 += this.aClass198_13.method4079(local38, local13);
					}
					@Pc(215) int local215;
					if (arg1 == null) {
						local215 = 0;
					} else {
						local215 = arg1[local15];
					}
					if (arg5 == null) {
						local125 = 0;
					} else {
						local125 = arg5[local15];
					}
					if (local38 != ' ') {
						if ((Static644.anInt10190 & 0xFF000000) != 0) {
							this.fa(local38, local215 + arg3 + 1, local9 - (-1 - local125), Static644.anInt10190, true);
						}
						this.fa(local38, local215 + arg3, local9 - -local125, Static515.anInt3721, false);
					} else if (Static115.anInt2030 > 0) {
						Static76.anInt1195 += Static115.anInt2030;
						arg3 += Static76.anInt1195 >> 8;
						Static76.anInt1195 &= 0xFF;
					}
					local15++;
					local134 = this.aClass198_13.method4077(local38);
					if (Static253.anInt4032 != -1) {
						this.aClass143_12.method6243(arg3, Static253.anInt4032, local134, (int) ((double) this.aClass198_13.anInt4637 * 0.7D) + local9);
					}
					if (Static154.anInt2534 != -1) {
						this.aClass143_12.method6243(arg3, Static154.anInt2534, local134, local9 + this.aClass198_13.anInt4637);
					}
					local13 = local38;
					arg3 += local134;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	private void method6916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static76.anInt1195 = 0;
		Static479.anInt8281 = arg1;
		Static515.anInt3721 = arg1;
		Static154.anInt2534 = -1;
		Static253.anInt4032 = -1;
		Static115.anInt2030 = 0;
		Static68.anInt1044 = arg0;
		Static644.anInt10190 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;I[ILjava/lang/String;[IIIIIIB[Lclient!qda;III)I")
	public final int method6917(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class59[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return 0;
		}
		arg0.setSeed((long) arg11);
		@Pc(26) int local26 = (arg0.nextInt() & 0x1F) + 192;
		this.method6916(local26 << 24 | arg5 & 0xFFFFFF, local26 << 24 | arg8 & 0xFFFFFF);
		@Pc(46) int local46 = arg3.length();
		@Pc(49) int[] local49 = new int[local46];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local46; local53++) {
			local49[local53] = local51;
			if ((arg0.nextInt() & 0x3) == 0) {
				local51++;
			}
		}
		@Pc(74) int local74 = arg13;
		@Pc(80) int local80 = arg7 + this.aClass198_13.anInt4647;
		if (arg12 == 1) {
			local80 += (arg9 - this.aClass198_13.anInt4647 - this.aClass198_13.anInt4648) / 2;
		} else if (arg12 == 2) {
			local80 = arg9 + arg7 - this.aClass198_13.anInt4648;
		}
		@Pc(115) int local115 = -1;
		if (arg1 == 1) {
			local115 = this.aClass198_13.method4076(arg3) + local51;
			local74 = arg13 + (arg6 - local115) / 2;
		} else if (arg1 == 2) {
			local115 = local51 + this.aClass198_13.method4076(arg3);
			local74 = arg13 + arg6 - local115;
		}
		this.method6915(arg2, local49, arg10, local74, local80, (int[]) null, arg3);
		if (arg4 != null) {
			if (local115 == -1) {
				local115 = local51 + this.aClass198_13.method4076(arg3);
			}
			arg4[0] = local74;
			arg4[3] = this.aClass198_13.anInt4648 + this.aClass198_13.anInt4647;
			arg4[2] = local115;
			arg4[1] = local80 - this.aClass198_13.anInt4647;
		}
		return local51;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lclient!qda;ILjava/lang/String;I[II)V")
	public final void method6918(@OriginalArg(1) int arg0, @OriginalArg(2) Class59[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2 != null) {
			this.method6916(0, arg0);
			this.method6920(0, arg4, arg3, arg2, 0, arg1, (Class1) null, arg5);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	public final void method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method6916(arg4, arg0);
			this.method6920(0, (int[]) null, arg1 - this.aClass198_13.method4076(arg2) / 2, arg2, 0, (Class59[]) null, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[IILjava/lang/String;I[Lclient!qda;Lclient!aa;I)V")
	private void method6920(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class59[] arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg7 - this.aClass198_13.anInt4637;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(20) int local20 = arg3.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(32) char local32 = (char) (Static404.method5902(arg3.charAt(local22)) & 0xFF);
			if (local32 == '<') {
				local11 = local22;
			} else {
				if (local32 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg3.substring(local11 + 1, local22);
					local11 = -1;
					if (local54.equals("lt")) {
						local32 = '<';
					} else if (local54.equals("gt")) {
						local32 = '>';
					} else if (local54.equals("nbsp")) {
						local32 = ' ';
					} else if (local54.equals("shy")) {
						local32 = '\u00ad';
					} else if (local54.equals("times")) {
						local32 = '×';
					} else if (local54.equals("euro")) {
						local32 = '€';
					} else if (local54.equals("copy")) {
						local32 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(109) int local109 = Static171.method2534(local54.substring(4));
									@Pc(113) Class59 local113 = arg5[local109];
									@Pc(122) int local122 = arg1 == null ? local113.method8064() : arg1[local109];
									if ((Static515.anInt3721 & -16777216) == -16777216) {
										local113.method8067(arg2, local9 + this.aClass198_13.anInt4637 - local122, 1, 0, 1);
									} else {
										local113.method8067(arg2, this.aClass198_13.anInt4637 + local9 - local122, 0, Static515.anInt3721 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg2 += arg5[local109].method8053();
									local13 = -1;
								} catch (@Pc(170) Exception local170) {
								}
							} else {
								this.method6924(local54);
							}
							continue;
						}
						local32 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg2 += this.aClass198_13.method4079(local32, local13);
					}
					if (local32 == ' ') {
						if (Static115.anInt2030 > 0) {
							Static76.anInt1195 += Static115.anInt2030;
							arg2 += Static76.anInt1195 >> 8;
							Static76.anInt1195 &= 0xFF;
						}
					} else if (arg6 == null) {
						if ((Static644.anInt10190 & 0xFF000000) != 0) {
							this.fa(local32, arg2 + 1, local9 + 1, Static644.anInt10190, true);
						}
						this.fa(local32, arg2, local9, Static515.anInt3721, false);
					} else {
						if ((Static644.anInt10190 & 0xFF000000) != 0) {
							this.method6910(local32, arg2 + 1, local9 - -1, Static644.anInt10190, true, arg6, arg4, arg0);
						}
						this.method6910(local32, arg2, local9, Static515.anInt3721, false, arg6, arg4, arg0);
					}
					@Pc(285) int local285 = this.aClass198_13.method4077(local32);
					if (Static253.anInt4032 != -1) {
						this.aClass143_12.method6243(arg2, Static253.anInt4032, local285, local9 + (int) ((double) this.aClass198_13.anInt4637 * 0.7D));
					}
					if (Static154.anInt2534 != -1) {
						this.aClass143_12.method6243(arg2, Static154.anInt2534, local285, this.aClass198_13.anInt4637 + local9 + 1);
					}
					local13 = local32;
					arg2 += local285;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIILjava/lang/String;II)V")
	public final void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6916(-16777216, arg2);
		@Pc(14) int local14 = arg4.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = (int) (Math.sin((double) arg0 / 5.0D + (double) local19 / 2.0D) * 5.0D);
		}
		this.method6915((int[]) null, (int[]) null, (Class59[]) null, arg3 - this.aClass198_13.method4076(arg4) / 2, arg1, local17, arg4);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method6923(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method6916(arg1, arg2);
			this.method6920(0, (int[]) null, arg4 - this.aClass198_13.method4076(arg0), arg0, 0, (Class59[]) null, (Class1) null, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method6924(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static515.anInt3721 = Static515.anInt3721 & 0xFF000000 | Static368.method5407(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static515.anInt3721 = Static479.anInt8281 & 0xFFFFFF | Static515.anInt3721 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static515.anInt3721 = Static368.method5407(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static515.anInt3721 = Static479.anInt8281;
			} else if (arg0.startsWith("str=")) {
				Static253.anInt4032 = Static515.anInt3721 & 0xFF000000 | Static368.method5407(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static253.anInt4032 = Static515.anInt3721 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static253.anInt4032 = -1;
			} else if (arg0.startsWith("u=")) {
				Static154.anInt2534 = Static515.anInt3721 & 0xFF000000 | Static368.method5407(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static154.anInt2534 = Static515.anInt3721 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static154.anInt2534 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static644.anInt10190 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static644.anInt10190 = Static515.anInt3721 & 0xFF000000 | Static368.method5407(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static644.anInt10190 = Static515.anInt3721 & 0xFF000000;
				return;
			} else if (arg0.equals("/shad")) {
				Static644.anInt10190 = Static68.anInt1044;
				return;
			} else if (arg0.equals("br")) {
				this.method6916(Static68.anInt1044, Static479.anInt8281);
				return;
			}
		} catch (@Pc(175) Exception local175) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;BIII)V")
	public final void method6925(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6916(arg3, arg4);
			this.method6920(0, (int[]) null, arg2, arg1, 0, (Class59[]) null, (Class1) null, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/util/Random;Ljava/lang/String;IIBIII[Lclient!qda;)I")
	public final int method6927(@OriginalArg(0) int[] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class59[] arg6) {
		if (arg2 == null) {
			return 0;
		}
		arg1.setSeed((long) arg4);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method6916((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg2.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local50;
			if ((arg1.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method6915(arg0, local43, arg6, arg3, arg5, (int[]) null, arg2);
		return local50;
	}
}
