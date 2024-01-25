import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class6 {

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!rc;")
	private final Class298 aClass298_12;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!ha;")
	private final Class126 aClass126_19;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!rc;)V")
	protected Class6(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class298 arg1) {
		this.aClass298_12 = arg1;
		this.aClass126_19 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method7199(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7210(arg3, arg4);
			this.method7212(arg2, 0, 0, arg1, arg0 - this.aClass298_12.method6965(arg1) / 2, (Class44[]) null, (int[]) null, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;ZIII)V")
	public final void method7200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method7210(arg4, -16777216);
		@Pc(20) int local20 = arg2.length();
		@Pc(23) int[] local23 = new int[local20];
		for (@Pc(25) int local25 = 0; local25 < local20; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 2.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method7203(arg1 - this.aClass298_12.method6965(arg2) / 2, local23, arg3, (int[]) null, arg2, (Class44[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([II[Lclient!hu;Ljava/lang/String;IIIBLjava/util/Random;I)I")
	public final int method7201(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44[] arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Random arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg6.setSeed((long) arg5);
		@Pc(25) int local25 = (arg6.nextInt() & 0x1F) + 192;
		this.method7210(local25 << 24 | 0xFFFFFF, (local25 | 0x0) << 24);
		@Pc(45) int local45 = arg3.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg6.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		this.method7203(arg1, (int[]) null, arg4, arg0, arg3, arg2, local48);
		return local50;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/util/Random;I[Lclient!hu;[IIIIILjava/lang/String;IIIII)I")
	public final int method7202(@OriginalArg(0) int[] arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return 0;
		}
		arg1.setSeed((long) arg7);
		@Pc(20) int local20 = (arg1.nextInt() & 0x1F) + 192;
		this.method7210(arg6 & 0xFFFFFF | local20 << 24, arg12 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg9.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg1.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(68) int local68 = arg2;
		@Pc(74) int local74 = arg10 + this.aClass298_12.anInt8042;
		if (arg8 == 1) {
			local74 += (arg5 - this.aClass298_12.anInt8040 - this.aClass298_12.anInt8042) / 2;
		} else if (arg8 == 2) {
			local74 = arg5 + arg10 - this.aClass298_12.anInt8040;
		}
		@Pc(111) int local111 = -1;
		if (arg13 == 1) {
			local111 = this.aClass298_12.method6965(arg9) + local45;
			local68 = arg2 + (arg11 - local111) / 2;
		} else if (arg13 == 2) {
			local111 = this.aClass298_12.method6965(arg9) + local45;
			local68 = arg2 + arg11 - local111;
		}
		this.method7203(local68, (int[]) null, local74, arg0, arg9, arg3, local43);
		if (arg4 != null) {
			if (local111 == -1) {
				local111 = this.aClass298_12.method6965(arg9) + local45;
			}
			arg4[0] = local68;
			arg4[2] = local111;
			arg4[1] = local74 - this.aClass298_12.anInt8042;
			arg4[3] = this.aClass298_12.anInt8040 + this.aClass298_12.anInt8042;
		}
		return local45;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[II[ILjava/lang/String;I[Lclient!hu;[I)V")
	private void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) String arg4, @OriginalArg(6) Class44[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg2 - this.aClass298_12.anInt8038;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg4.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static181.method2917(arg4.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local13 = local28;
			} else {
				@Pc(114) int local114;
				@Pc(124) int local124;
				if (local39 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg4.substring(local13 + 1, local28);
					local13 = -1;
					if (local60.equals("lt")) {
						local39 = '<';
					} else if (local60.equals("gt")) {
						local39 = '>';
					} else if (local60.equals("nbsp")) {
						local39 = ' ';
					} else if (local60.equals("shy")) {
						local39 = '\u00ad';
					} else if (local60.equals("times")) {
						local39 = '×';
					} else if (local60.equals("euro")) {
						local39 = '€';
					} else if (local60.equals("copy")) {
						local39 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local114 = 0;
									} else {
										local114 = arg6[local23];
									}
									if (arg1 == null) {
										local124 = 0;
									} else {
										local124 = arg1[local23];
									}
									local23++;
									@Pc(137) int local137 = Static443.method6588(local60.substring(4));
									@Pc(141) Class44 local141 = arg5[local137];
									@Pc(150) int local150 = arg3 == null ? local141.method5325() : arg3[local137];
									local141.method5322(arg0 + local114, -local150 + local11 + this.aClass298_12.anInt8038 + local124, 1, 0, 1);
									arg0 += arg5[local137].method5313();
									local15 = -1;
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method7218(local60);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass298_12.method6964(local15, local39);
					}
					@Pc(226) int local226;
					if (arg6 == null) {
						local226 = 0;
					} else {
						local226 = arg6[local23];
					}
					if (arg1 == null) {
						local114 = 0;
					} else {
						local114 = arg1[local23];
					}
					local23++;
					if (local39 != ' ') {
						if ((Static499.anInt8500 & 0xFF000000) != 0) {
							this.fa(local39, local226 + arg0 + 1, local114 + 1 + local11, Static499.anInt8500, true);
						}
						this.fa(local39, local226 + arg0, local114 + local11, Static305.anInt4829, false);
					} else if (Static206.anInt3613 > 0) {
						Static138.anInt2291 += Static206.anInt3613;
						arg0 += Static138.anInt2291 >> 8;
						Static138.anInt2291 &= 0xFF;
					}
					local124 = this.aClass298_12.method6972(local39);
					if (Static637.anInt10329 != -1) {
						this.aClass126_19.method7033((int) ((double) this.aClass298_12.anInt8038 * 0.7D) + local11, local124, arg0, Static637.anInt10329);
					}
					if (Static139.anInt2302 != -1) {
						this.aClass126_19.method7033(this.aClass298_12.anInt8038 + local11, local124, arg0, Static139.anInt2302);
					}
					arg0 += local124;
					local15 = local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method7204(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!hu;IIIIII[IIILclient!aa;IIIILjava/lang/String;)I")
	public final int method7205(@OriginalArg(0) int arg0, @OriginalArg(1) Class44[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class1 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) String arg15) {
		if (arg15 == null) {
			return 0;
		}
		this.method7210(arg13, arg5);
		if (arg14 == 0) {
			arg14 = this.aClass298_12.anInt8038;
		}
		@Pc(48) int[] local48;
		if (arg7 < this.aClass298_12.anInt8042 + this.aClass298_12.anInt8040 + arg14 && arg14 + arg14 > arg7) {
			local48 = null;
		} else {
			local48 = new int[] { arg9 };
		}
		if (arg0 == -1) {
			arg0 = arg7 / arg14;
			if (arg0 <= 0) {
				arg0 = 1;
			}
		}
		@Pc(75) int local75 = this.aClass298_12.method6970(arg15, local48, Static22.aStringArray2, arg1);
		if (arg0 > 0 && local75 >= arg0) {
			local75 = arg0;
			Static22.aStringArray2[arg0 - 1] = this.aClass298_12.method6969(arg1, Static22.aStringArray2[arg0 - 1], arg9);
		}
		if (arg2 == 3 && local75 == 1) {
			arg2 = 1;
		}
		@Pc(120) int local120;
		if (arg2 == 0) {
			local120 = arg4 + this.aClass298_12.anInt8042;
		} else if (arg2 == 1) {
			local120 = arg4 + this.aClass298_12.anInt8042 + (-this.aClass298_12.anInt8040 + -this.aClass298_12.anInt8042 + (arg7 - arg14 * (local75 + -1))) / 2;
		} else if (arg2 == 2) {
			local120 = arg4 + arg7 - arg14 * (local75 - 1) - this.aClass298_12.anInt8040;
		} else {
			@Pc(182) int local182 = (arg7 - (local75 - 1) * arg14 - this.aClass298_12.anInt8042 - this.aClass298_12.anInt8040) / (local75 + 1);
			if (local182 < 0) {
				local182 = 0;
			}
			local120 = arg4 + this.aClass298_12.anInt8042 + local182;
			arg14 += local182;
		}
		for (@Pc(227) int local227 = 0; local227 < local75; local227++) {
			if (arg3 == 0) {
				this.method7212(local120, arg12, arg10, Static22.aStringArray2[local227], arg6, arg1, arg8, arg11);
			} else if (arg3 == 1) {
				this.method7212(local120, arg12, arg10, Static22.aStringArray2[local227], arg6 + (arg9 - this.aClass298_12.method6965(Static22.aStringArray2[local227])) / 2, arg1, arg8, arg11);
			} else if (arg3 == 2) {
				this.method7212(local120, arg12, arg10, Static22.aStringArray2[local227], arg6 + arg9 - this.aClass298_12.method6965(Static22.aStringArray2[local227]), arg1, arg8, arg11);
			} else if (local227 == local75 - 1) {
				this.method7212(local120, arg12, arg10, Static22.aStringArray2[local227], arg6, arg1, arg8, arg11);
			} else {
				this.method7209(arg9, Static22.aStringArray2[local227]);
				this.method7212(local120, arg12, arg10, Static22.aStringArray2[local227], arg6, arg1, arg8, arg11);
				Static206.anInt3613 = 0;
			}
			local120 += arg14;
		}
		return local75;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method7207(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method7210(arg3, -16777216);
		@Pc(16) int local16 = arg1.length();
		@Pc(27) int[] local27 = new int[local16];
		@Pc(30) int[] local30 = new int[local16];
		for (@Pc(32) int local32 = 0; local32 < local16; local32++) {
			local27[local32] = (int) (Math.sin((double) local32 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local30[local32] = (int) (Math.sin((double) local32 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method7203(arg2 - this.aClass298_12.method6965(arg1) / 2, local30, arg0, (int[]) null, arg1, (Class44[]) null, local27);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;)V")
	private void method7209(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
			@Pc(25) char local25 = arg1.charAt(local19);
			if (local25 == '<') {
				local17 = true;
			} else if (local25 == '>') {
				local17 = false;
			} else if (!local17 && local25 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static206.anInt3613 = (arg0 - this.aClass298_12.method6965(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	private void method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static139.anInt2302 = -1;
		Static138.anInt2291 = 0;
		Static377.anInt6618 = arg0;
		Static305.anInt4829 = arg0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static637.anInt10329 = -1;
		Static206.anInt3613 = 0;
		Static339.anInt5861 = arg1;
		Static499.anInt8500 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIILjava/lang/String;I[Lclient!hu;[ILclient!aa;)V")
	private void method7212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class44[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(11) int local11 = arg0 - this.aClass298_12.anInt8038;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg3.length();
		for (@Pc(33) int local33 = 0; local33 < local18; local33++) {
			@Pc(44) char local44 = (char) (Static181.method2917(arg3.charAt(local33)) & 0xFF);
			if (local44 == '<') {
				local13 = local33;
			} else {
				if (local44 == '>' && local13 != -1) {
					@Pc(67) String local67 = arg3.substring(local13 + 1, local33);
					local13 = -1;
					if (local67.equals("lt")) {
						local44 = '<';
					} else if (local67.equals("gt")) {
						local44 = '>';
					} else if (local67.equals("nbsp")) {
						local44 = ' ';
					} else if (local67.equals("shy")) {
						local44 = '\u00ad';
					} else if (local67.equals("times")) {
						local44 = '×';
					} else if (local67.equals("euro")) {
						local44 = '€';
					} else if (local67.equals("copy")) {
						local44 = '©';
					} else {
						if (!local67.equals("reg")) {
							if (local67.startsWith("img=")) {
								try {
									@Pc(127) int local127 = Static443.method6588(local67.substring(4));
									@Pc(131) Class44 local131 = arg5[local127];
									@Pc(140) int local140 = arg6 == null ? local131.method5325() : arg6[local127];
									if ((Static305.anInt4829 & -16777216) == -16777216) {
										local131.method5322(arg4, local11 + this.aClass298_12.anInt8038 - local140, 1, 0, 1);
									} else {
										local131.method5322(arg4, this.aClass298_12.anInt8038 + local11 - local140, 0, Static305.anInt4829 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg4 += arg5[local127].method5313();
									local15 = -1;
								} catch (@Pc(189) Exception local189) {
								}
							} else {
								this.method7218(local67);
							}
							continue;
						}
						local44 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass298_12.method6964(local15, local44);
					}
					if (local44 == ' ') {
						if (Static206.anInt3613 > 0) {
							Static138.anInt2291 += Static206.anInt3613;
							arg4 += Static138.anInt2291 >> 8;
							Static138.anInt2291 &= 0xFF;
						}
					} else if (arg7 == null) {
						if ((Static499.anInt8500 & 0xFF000000) != 0) {
							this.fa(local44, arg4 + 1, local11 - -1, Static499.anInt8500, true);
						}
						this.fa(local44, arg4, local11, Static305.anInt4829, false);
					} else {
						if ((Static499.anInt8500 & 0xFF000000) != 0) {
							this.method7204(local44, arg4 + 1, local11 + 1, Static499.anInt8500, true, arg7, arg1, arg2);
						}
						this.method7204(local44, arg4, local11, Static305.anInt4829, false, arg7, arg1, arg2);
					}
					@Pc(316) int local316 = this.aClass298_12.method6972(local44);
					if (Static637.anInt10329 != -1) {
						this.aClass126_19.method7033(local11 + (int) ((double) this.aClass298_12.anInt8038 * 0.7D), local316, arg4, Static637.anInt10329);
					}
					if (Static139.anInt2302 != -1) {
						this.aClass126_19.method7033(this.aClass298_12.anInt8038 + local11 + 1, local316, arg4, Static139.anInt2302);
					}
					local15 = local44;
					arg4 += local316;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILjava/lang/String;III)V")
	public final void method7214(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method7210(arg4, arg3);
			this.method7212(arg2, 0, 0, arg1, arg0, (Class44[]) null, (int[]) null, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!aa;Ljava/lang/String;I[IIIIIII[Lclient!hu;III)I")
	public final int method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class44[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method7205(0, arg11, arg1, arg13, arg0, arg9, arg7, arg8, arg5, arg14, arg4, arg2, arg12, arg6, arg10, arg3);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method7218(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static305.anInt4829 = Static305.anInt4829 & 0xFF000000 | Static225.method3516(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static305.anInt4829 = Static377.anInt6618 & 0xFFFFFF | Static305.anInt4829 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static305.anInt4829 = Static225.method3516(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static305.anInt4829 = Static377.anInt6618;
			} else if (arg0.startsWith("str=")) {
				Static637.anInt10329 = Static305.anInt4829 & 0xFF000000 | Static225.method3516(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static637.anInt10329 = Static305.anInt4829 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static637.anInt10329 = -1;
			} else if (arg0.startsWith("u=")) {
				Static139.anInt2302 = Static305.anInt4829 & 0xFF000000 | Static225.method3516(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static139.anInt2302 = Static305.anInt4829 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static139.anInt2302 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static499.anInt8500 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static499.anInt8500 = Static305.anInt4829 & 0xFF000000 | Static225.method3516(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static499.anInt8500 = Static305.anInt4829 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static499.anInt8500 = Static339.anInt5861;
				return;
			} else if (arg0.equals("br")) {
				this.method7210(Static377.anInt6618, Static339.anInt5861);
				return;
			}
		} catch (@Pc(177) Exception local177) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIZLjava/lang/String;III[Lclient!hu;)V")
	public final void method7219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class44[] arg5) {
		if (arg2 != null) {
			this.method7210(arg1, 0);
			this.method7212(arg4, 0, 0, arg2, arg3, arg5, arg0, (Class1) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;B)V")
	public final void method7220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method7210(arg1, -16777216);
		@Pc(21) double local21 = 7.0D - (double) arg3 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg5.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(40) int local40 = 0; local40 < local30; local40++) {
			local33[local40] = (int) (local21 * Math.sin((double) arg2 + (double) local40 / 1.5D));
		}
		this.method7203(arg0 - this.aClass298_12.method6965(arg5) / 2, local33, arg4, (int[]) null, arg5, (Class44[]) null, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBILjava/lang/String;)V")
	public final void method7221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method7210(arg0, arg2);
			this.method7212(arg3, 0, 0, arg4, arg1 - this.aClass298_12.method6965(arg4), (Class44[]) null, (int[]) null, (Class1) null);
		}
	}
}
