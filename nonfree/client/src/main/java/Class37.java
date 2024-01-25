import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class37 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!ha;")
	private final Class13 aClass13_69;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!jl;")
	private final Class183 aClass183_10;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!jl;)V")
	protected Class37(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class183 arg1) {
		this.aClass13_69 = arg0;
		this.aClass183_10 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([I[IIIIILjava/lang/String;[Lclient!iea;Ljava/util/Random;IIIIZI)I")
	public final int method6066(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) Class31[] arg7, @OriginalArg(8) Random arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return 0;
		}
		arg8.setSeed((long) arg4);
		@Pc(21) int local21 = (arg8.nextInt() & 0x1F) + 192;
		this.method6073(arg12 & 0xFFFFFF | local21 << 24, local21 << 24 | arg13 & 0xFFFFFF);
		@Pc(41) int local41 = arg6.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg8.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(66) int local66 = arg3;
		@Pc(73) int local73 = arg9 + this.aClass183_10.anInt5062;
		if (arg2 == 1) {
			local73 += (arg5 - this.aClass183_10.anInt5064 - this.aClass183_10.anInt5062) / 2;
		} else if (arg2 == 2) {
			local73 = arg9 + arg5 - this.aClass183_10.anInt5064;
		}
		@Pc(110) int local110 = -1;
		if (arg10 == 1) {
			local110 = local46 + this.aClass183_10.method4453(arg6);
			local66 = arg3 + (arg11 - local110) / 2;
		} else if (arg10 == 2) {
			local110 = this.aClass183_10.method4453(arg6) + local46;
			local66 = arg3 + arg11 - local110;
		}
		this.method6077(arg7, local73, (int[]) null, arg1, arg6, local66, local44);
		if (arg0 != null) {
			if (local110 == -1) {
				local110 = local46 + this.aClass183_10.method4453(arg6);
			}
			arg0[3] = this.aClass183_10.anInt5062 + this.aClass183_10.anInt5064;
			arg0[1] = local73 - this.aClass183_10.anInt5062;
			arg0[0] = local66;
			arg0[2] = local110;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method6067(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6073(arg0, arg2);
			this.method6072(arg1, 0, (int[]) null, 0, arg4, (Class31[]) null, arg3, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method6069(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
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
			Static517.anInt8343 = (arg0 - this.aClass183_10.method4453(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;III)V")
	public final void method6071(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method6073(arg0, arg3);
			this.method6072(arg1, 0, (int[]) null, 0, arg4, (Class31[]) null, arg2 - this.aClass183_10.method4453(arg1), (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[IIII[Lclient!iea;ILclient!aa;)V")
	private void method6072(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class31[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(5) int local5 = arg4 - this.aClass183_10.anInt5073;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg0.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(34) char local34 = (char) (Static81.method1771(arg0.charAt(local24)) & 0xFF);
			if (local34 == '<') {
				local17 = local24;
			} else {
				if (local34 == '>' && local17 != -1) {
					@Pc(58) String local58 = arg0.substring(local17 + 1, local24);
					local17 = -1;
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
									@Pc(111) int local111 = Static307.method4785(local58.substring(4));
									@Pc(115) Class31 local115 = arg5[local111];
									@Pc(124) int local124 = arg2 == null ? local115.method8807() : arg2[local111];
									if ((-16777216 & Static200.anInt3979) == -16777216) {
										local115.method8796(arg6, local5 + this.aClass183_10.anInt5073 - local124, 1, 0, 1);
									} else {
										local115.method8796(arg6, this.aClass183_10.anInt5073 + local5 - local124, 0, Static200.anInt3979 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg6 += arg5[local111].method8788();
									local19 = -1;
								} catch (@Pc(174) Exception local174) {
								}
							} else {
								this.method6083(local58);
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg6 += this.aClass183_10.method4449(local19, local34);
					}
					if (local34 == ' ') {
						if (Static517.anInt8343 > 0) {
							Static608.anInt10055 += Static517.anInt8343;
							arg6 += Static608.anInt10055 >> 8;
							Static608.anInt10055 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static36.anInt786 & 0xFF000000) != 0) {
							this.fa(local34, arg6 + 1, local5 + 1, Static36.anInt786, true);
						}
						this.fa(local34, arg6, local5, Static200.anInt3979, false);
					} else {
						if ((Static36.anInt786 & 0xFF000000) != 0) {
							this.method6087(local34, arg6 + 1, local5 + 1, Static36.anInt786, true, arg7, arg1, arg3);
						}
						this.method6087(local34, arg6, local5, Static200.anInt3979, false, arg7, arg1, arg3);
					}
					@Pc(293) int local293 = this.aClass183_10.method4457(local34);
					if (Static438.anInt7188 != -1) {
						this.aClass13_69.method8091(local5 + (int) ((double) this.aClass183_10.anInt5073 * 0.7D), arg6, local293, Static438.anInt7188);
					}
					if (Static57.anInt1431 != -1) {
						this.aClass13_69.method8091(local5 + this.aClass183_10.anInt5073 + 1, arg6, local293, Static57.anInt1431);
					}
					arg6 += local293;
					local19 = local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	private void method6073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static238.anInt8044 = arg0;
		Static200.anInt3979 = arg0;
		Static57.anInt1431 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static517.anInt8343 = 0;
		Static438.anInt7188 = -1;
		Static608.anInt10055 = 0;
		Static95.anInt2269 = arg1;
		Static36.anInt786 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIB[ILjava/lang/String;[Lclient!iea;I)V")
	public final void method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class31[] arg5) {
		if (arg4 != null) {
			this.method6073(arg2, 0);
			this.method6072(arg4, 0, arg3, 0, arg0, arg5, arg1, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public final void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method6073(arg2, arg1);
			this.method6072(arg4, 0, (int[]) null, 0, arg3, (Class31[]) null, arg0 - this.aClass183_10.method4453(arg4) / 2, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[Lclient!iea;IIIIILclient!aa;IIIIIILjava/lang/String;I)I")
	public final int method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class31[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) String arg14, @OriginalArg(16) int arg15) {
		if (arg14 == null) {
			return 0;
		}
		this.method6073(arg10, arg6);
		if (arg0 == 0) {
			arg0 = this.aClass183_10.anInt5073;
		}
		@Pc(49) int[] local49;
		if (arg0 + this.aClass183_10.anInt5064 + this.aClass183_10.anInt5062 > arg11 && arg0 + arg0 > arg11) {
			local49 = null;
		} else {
			local49 = new int[] { arg12 };
		}
		@Pc(61) int local61 = this.aClass183_10.method4458(arg14, Static312.aStringArray12, local49, arg2);
		if (arg5 == -1) {
			arg5 = arg11 / arg0;
			if (arg5 <= 0) {
				arg5 = 1;
			}
		}
		if (arg5 > 0 && arg5 <= local61) {
			Static312.aStringArray12[arg5 - 1] = this.aClass183_10.method4451(arg12, Static312.aStringArray12[arg5 - 1], arg2);
			local61 = arg5;
		}
		if (arg4 == 3 && local61 == 1) {
			arg4 = 1;
		}
		@Pc(143) int local143;
		@Pc(187) int local187;
		if (arg4 == 0) {
			local143 = this.aClass183_10.anInt5062 + arg15;
		} else if (arg4 == 1) {
			local143 = (arg11 - arg0 * (local61 - 1) - this.aClass183_10.anInt5064 - this.aClass183_10.anInt5062) / 2 + this.aClass183_10.anInt5062 + arg15;
		} else if (arg4 == 2) {
			local143 = arg15 + arg11 - (local61 - 1) * arg0 - this.aClass183_10.anInt5064;
		} else {
			local187 = (arg11 - (local61 - 1) * arg0 - this.aClass183_10.anInt5062 - this.aClass183_10.anInt5064) / (local61 - -1);
			if (local187 < 0) {
				local187 = 0;
			}
			arg0 += local187;
			local143 = local187 + this.aClass183_10.anInt5062 + arg15;
		}
		for (local187 = 0; local187 < local61; local187++) {
			if (arg13 == 0) {
				this.method6072(Static312.aStringArray12[local187], arg8, arg1, arg3, local143, arg2, arg9, arg7);
			} else if (arg13 == 1) {
				this.method6072(Static312.aStringArray12[local187], arg8, arg1, arg3, local143, arg2, arg9 + (arg12 - this.aClass183_10.method4453(Static312.aStringArray12[local187])) / 2, arg7);
			} else if (arg13 == 2) {
				this.method6072(Static312.aStringArray12[local187], arg8, arg1, arg3, local143, arg2, arg12 + arg9 - this.aClass183_10.method4453(Static312.aStringArray12[local187]), arg7);
			} else if (local187 == local61 - 1) {
				this.method6072(Static312.aStringArray12[local187], arg8, arg1, arg3, local143, arg2, arg9, arg7);
			} else {
				this.method6069(arg12, Static312.aStringArray12[local187]);
				this.method6072(Static312.aStringArray12[local187], arg8, arg1, arg3, local143, arg2, arg9, arg7);
				Static517.anInt8343 = 0;
			}
			local143 += arg0;
		}
		return local61;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!iea;I[II[ILjava/lang/String;I[I)V")
	private void method6077(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(5) int local5 = arg1 - this.aClass183_10.anInt5073;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg4.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(30) char local30 = (char) (Static81.method1771(arg4.charAt(local20)) & 0xFF);
			if (local30 == '<') {
				local11 = local20;
			} else {
				@Pc(103) int local103;
				@Pc(112) int local112;
				if (local30 == '>' && local11 != -1) {
					@Pc(49) String local49 = arg4.substring(local11 + 1, local20);
					local11 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '€';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							if (local49.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local103 = 0;
									} else {
										local103 = arg6[local15];
									}
									if (arg2 == null) {
										local112 = 0;
									} else {
										local112 = arg2[local15];
									}
									local15++;
									@Pc(124) int local124 = Static307.method4785(local49.substring(4));
									@Pc(128) Class31 local128 = arg0[local124];
									@Pc(137) int local137 = arg3 == null ? local128.method8807() : arg3[local124];
									local128.method8796(local103 + arg5, this.aClass183_10.anInt5073 + local5 + (-local137 - -local112), 1, 0, 1);
									arg5 += arg0[local124].method8788();
									local13 = -1;
								} catch (@Pc(167) Exception local167) {
								}
							} else {
								this.method6083(local49);
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local11 == -1) {
					if (local13 != -1) {
						arg5 += this.aClass183_10.method4449(local13, local30);
					}
					@Pc(207) int local207;
					if (arg6 == null) {
						local207 = 0;
					} else {
						local207 = arg6[local15];
					}
					if (arg2 == null) {
						local103 = 0;
					} else {
						local103 = arg2[local15];
					}
					local15++;
					if (local30 != ' ') {
						if ((Static36.anInt786 & 0xFF000000) != 0) {
							this.fa(local30, arg5 + local207 + 1, local5 + 1 + local103, Static36.anInt786, true);
						}
						this.fa(local30, arg5 + local207, local103 + local5, Static200.anInt3979, false);
					} else if (Static517.anInt8343 > 0) {
						Static608.anInt10055 += Static517.anInt8343;
						arg5 += Static608.anInt10055 >> 8;
						Static608.anInt10055 &= 0xFF;
					}
					local112 = this.aClass183_10.method4457(local30);
					if (Static438.anInt7188 != -1) {
						this.aClass13_69.method8091((int) ((double) this.aClass183_10.anInt5073 * 0.7D) + local5, arg5, local112, Static438.anInt7188);
					}
					if (Static57.anInt1431 != -1) {
						this.aClass13_69.method8091(this.aClass183_10.anInt5073 + local5, arg5, local112, Static57.anInt1431);
					}
					arg5 += local112;
					local13 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[IIIIIILclient!aa;Ljava/lang/String;[Lclient!iea;)I")
	public final int method6078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1 arg12, @OriginalArg(14) String arg13, @OriginalArg(15) Class31[] arg14) {
		return this.method6076(arg10, arg7, arg14, arg5, arg6, 0, arg9, arg12, arg11, arg3, arg2, arg8, arg4, arg0, arg13, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method6079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method6073(arg1, -16777216);
		@Pc(14) int local14 = arg4.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local17[local22] = (int) (Math.sin((double) arg2 / 5.0D + (double) local22 / 5.0D) * 5.0D);
			local20[local22] = (int) (Math.sin((double) local22 / 3.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method6077((Class31[]) null, arg0, local20, (int[]) null, arg4, arg3 - this.aClass183_10.method4453(arg4) / 2, local17);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/lang/String;III[Lclient!iea;Ljava/util/Random;III)I")
	public final int method6080(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class31[] arg3, @OriginalArg(6) Random arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 == null) {
			return 0;
		}
		arg4.setSeed((long) arg5);
		@Pc(25) int local25 = (arg4.nextInt() & 0x1F) + 192;
		this.method6073(local25 << 24 | 0xFFFFFF, (local25 | 0x0) << 24);
		@Pc(45) int local45 = arg1.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg4.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method6077(arg3, arg2, (int[]) null, arg0, arg1, arg6, local48);
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;III)V")
	public final void method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 == null) {
			return;
		}
		this.method6073(arg1, -16777216);
		@Pc(18) double local18 = 7.0D - (double) arg3 / 8.0D;
		if (local18 < 0.0D) {
			local18 = 0.0D;
		}
		@Pc(27) int local27 = arg2.length();
		@Pc(52) int[] local52 = new int[local27];
		for (@Pc(54) int local54 = 0; local54 < local27; local54++) {
			local52[local54] = (int) (Math.sin((double) local54 / 1.5D + (double) arg4) * local18);
		}
		this.method6077((Class31[]) null, arg0, local52, (int[]) null, arg2, arg5 - this.aClass183_10.method4453(arg2) / 2, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6083(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static200.anInt3979 = Static200.anInt3979 & 0xFF000000 | Static312.method1948(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static200.anInt3979 = Static200.anInt3979 & 0xFF000000 | Static238.anInt8044 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static200.anInt3979 = Static312.method1948(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static200.anInt3979 = Static238.anInt8044;
			} else if (arg0.startsWith("str=")) {
				Static438.anInt7188 = Static200.anInt3979 & 0xFF000000 | Static312.method1948(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static438.anInt7188 = Static200.anInt3979 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static438.anInt7188 = -1;
			} else if (arg0.startsWith("u=")) {
				Static57.anInt1431 = Static200.anInt3979 & 0xFF000000 | Static312.method1948(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static57.anInt1431 = Static200.anInt3979 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static57.anInt1431 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static36.anInt786 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static36.anInt786 = Static200.anInt3979 & 0xFF000000 | Static312.method1948(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static36.anInt786 = Static200.anInt3979 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static36.anInt786 = Static95.anInt2269;
			} else if (arg0.equals("br")) {
				this.method6073(Static238.anInt8044, Static95.anInt2269);
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIILjava/lang/String;I)V")
	public final void method6084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		if (arg3 == null) {
			return;
		}
		this.method6073(arg1, -16777216);
		@Pc(14) int local14 = arg3.length();
		@Pc(17) int[] local17 = new int[local14];
		for (@Pc(30) int local30 = 0; local30 < local14; local30++) {
			local17[local30] = (int) (Math.sin((double) local30 / 2.0D + (double) arg2 / 5.0D) * 5.0D);
		}
		this.method6077((Class31[]) null, arg4, local17, (int[]) null, arg3, arg0 - this.aClass183_10.method4453(arg3) / 2, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method6087(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);
}
