import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public abstract class Class30 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!ja;")
	private final Class81 aClass81_8;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!bs;")
	private final Class26 aClass26_8;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ja;Lclient!bs;)V")
	protected Class30(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class26 arg1) {
		this.aClass81_8 = arg0;
		this.aClass26_8 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method5329(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method5346(arg4, -16777216);
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			local19[local21] = (int) (Math.sin((double) arg1 / 5.0D + (double) local21 / 2.0D) * 5.0D);
		}
		this.method5350(arg3 - this.aClass26_8.method508(arg0) / 2, arg0, null, null, null, arg2, local19);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/lang/String;ILjava/util/Random;II[IIII[Lclient!of;II[II)I")
	public final int method5330(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class40[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg2.setSeed((long) arg8);
		@Pc(25) int local25 = (arg2.nextInt() & 0x1F) + 192;
		this.method5346(local25 << 24 | arg11 & 0xFFFFFF, arg7 & 0xFFFFFF | local25 << 24);
		@Pc(45) int local45 = arg0.length();
		@Pc(48) int[] local48 = new int[local45];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < local45; local52++) {
			local48[local52] = local50;
			if ((arg2.nextInt() & 0x3) == 0) {
				local50++;
			}
		}
		@Pc(74) int local74 = arg10;
		@Pc(80) int local80 = arg4 + this.aClass26_8.anInt604;
		if (arg13 == 1) {
			local80 += (arg3 - this.aClass26_8.anInt608 - this.aClass26_8.anInt604) / 2;
		} else if (arg13 == 2) {
			local80 = arg3 + arg4 - this.aClass26_8.anInt608;
		}
		@Pc(118) int local118 = -1;
		if (arg1 == 1) {
			local118 = local50 + this.aClass26_8.method508(arg0);
			local74 = arg10 + (arg6 - local118) / 2;
		} else if (arg1 == 2) {
			local118 = this.aClass26_8.method508(arg0) + local50;
			local74 = arg10 + arg6 - local118;
		}
		this.method5350(local74, arg0, arg5, local48, arg9, local80, null);
		if (arg12 != null) {
			if (local118 == -1) {
				local118 = this.aClass26_8.method508(arg0) + local50;
			}
			arg12[0] = local74;
			arg12[2] = local118;
			arg12[1] = local80 - this.aClass26_8.anInt604;
			arg12[3] = this.aClass26_8.anInt608 + this.aClass26_8.anInt604;
		}
		return local50;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI[IILjava/lang/String;II[Lclient!of;)V")
	public final void method5331(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class40[] arg6) {
		if (arg3 != null) {
			this.method5346(arg2, arg4);
			this.method5347(arg5 - this.aClass26_8.method508(arg3) / 2, null, arg1, 0, arg3, arg0, arg6, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5346(arg0, -16777216);
		@Pc(20) double local20 = 7.0D - (double) arg4 / 8.0D;
		if (local20 < 0.0D) {
			local20 = 0.0D;
		}
		@Pc(40) int local40 = arg3.length();
		@Pc(43) int[] local43 = new int[local40];
		for (@Pc(45) int local45 = 0; local45 < local40; local45++) {
			local43[local45] = (int) (Math.sin((double) arg2 + (double) local45 / 1.5D) * local20);
		}
		this.method5350(arg1 - this.aClass26_8.method508(arg3) / 2, arg3, null, null, null, arg5, local43);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method5346(arg0, arg3);
			this.method5347(arg1 - this.aClass26_8.method508(arg2) / 2, null, null, 0, arg2, arg4, null, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5346(arg0, -16777216);
		@Pc(14) int local14 = arg1.length();
		@Pc(17) int[] local17 = new int[local14];
		@Pc(20) int[] local20 = new int[local14];
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local17[local22] = (int) (Math.sin((double) local22 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local20[local22] = (int) (Math.sin((double) arg4 / 5.0D + (double) local22 / 3.0D) * 5.0D);
		}
		this.method5350(arg3 - this.aClass26_8.method508(arg1) / 2, arg1, null, local17, null, arg2, local20);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5335(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; arg1.length() > local23; local23++) {
			@Pc(29) char local29 = arg1.charAt(local23);
			if (local29 == '<') {
				local21 = true;
			} else if (local29 == '>') {
				local21 = false;
			} else if (!local21 && local29 == ' ') {
				local19++;
			}
		}
		if (local19 > 0) {
			Static190.anInt3614 = (arg0 - this.aClass26_8.method508(arg1) << 8) / local19;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method5346(arg2, -1);
			this.method5347(arg0 - this.aClass26_8.method508(arg1), null, null, 0, arg1, arg3, null, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[Lclient!of;II[IIIIILclient!rn;Ljava/lang/String;BIII)I")
	public final int method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class74 arg10, @OriginalArg(11) String arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg11 == null) {
			return 0;
		}
		this.method5346(arg12, arg14);
		if (arg3 == 0) {
			arg3 = this.aClass26_8.anInt609;
		}
		@Pc(45) int[] local45;
		if (this.aClass26_8.anInt608 + this.aClass26_8.anInt604 + arg3 > arg13 && arg13 < arg3 + arg3) {
			local45 = null;
		} else {
			local45 = new int[] { arg4 };
		}
		@Pc(65) int local65 = this.aClass26_8.method500(Static253.aStringArray32, local45, arg2, arg11);
		if (arg6 == 3 && local65 == 1) {
			arg6 = 1;
		}
		@Pc(113) int local113;
		@Pc(159) int local159;
		if (arg6 == 0) {
			local113 = arg1 + this.aClass26_8.anInt604;
		} else if (arg6 == 1) {
			local113 = (arg13 - (local65 - 1) * arg3 - this.aClass26_8.anInt604 - this.aClass26_8.anInt608) / 2 + arg1 + this.aClass26_8.anInt604;
		} else if (arg6 == 2) {
			local113 = arg13 + arg1 - this.aClass26_8.anInt608 - (local65 + -1) * arg3;
		} else {
			local159 = (arg13 - this.aClass26_8.anInt604 - this.aClass26_8.anInt608 - arg3 * (local65 + -1)) / (local65 - -1);
			if (local159 < 0) {
				local159 = 0;
			}
			arg3 += local159;
			local113 = this.aClass26_8.anInt604 + arg1 + local159;
		}
		for (local159 = 0; local159 < local65; local159++) {
			if (arg7 == 0) {
				this.method5347(arg0, arg10, arg5, arg9, Static253.aStringArray32[local159], local113, arg2, arg8);
			} else if (arg7 == 1) {
				this.method5347((arg4 - this.aClass26_8.method508(Static253.aStringArray32[local159])) / 2 + arg0, arg10, arg5, arg9, Static253.aStringArray32[local159], local113, arg2, arg8);
			} else if (arg7 == 2) {
				this.method5347(arg4 + arg0 - this.aClass26_8.method508(Static253.aStringArray32[local159]), arg10, arg5, arg9, Static253.aStringArray32[local159], local113, arg2, arg8);
			} else if (local65 - 1 == local159) {
				this.method5347(arg0, arg10, arg5, arg9, Static253.aStringArray32[local159], local113, arg2, arg8);
			} else {
				this.method5335(arg4, Static253.aStringArray32[local159]);
				this.method5347(arg0, arg10, arg5, arg9, Static253.aStringArray32[local159], local113, arg2, arg8);
				Static190.anInt3614 = 0;
			}
			local113 += arg3;
		}
		return local65;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
	public final void method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			this.method5346(arg1, arg2);
			this.method5347(arg4, null, null, 0, arg3, arg0, null, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[Lclient!of;ILjava/lang/String;[IIIB)V")
	public final void method5341(@OriginalArg(0) int arg0, @OriginalArg(1) Class40[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 != null) {
			this.method5346(arg2, arg5);
			this.method5347(arg0 - this.aClass26_8.method508(arg3), null, arg4, 0, arg3, arg6, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII[I[Lclient!of;Ljava/util/Random;ILjava/lang/String;I)I")
	public final int method5344(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class40[] arg3, @OriginalArg(6) Random arg4, @OriginalArg(8) String arg5, @OriginalArg(9) int arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg4.setSeed((long) arg6);
		@Pc(20) int local20 = (arg4.nextInt() & 0x1F) + 192;
		this.method5346(local20 << 24 | 0xFFFFFF, (local20 | 0x0) << 24);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < local40; local52++) {
			local43[local52] = local45;
			if ((arg4.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5350(arg1, arg5, arg2, local43, arg3, arg0, null);
		return local45;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([III[Lclient!of;IILjava/lang/String;Z)V")
	public final void method5345(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		if (arg6 != null) {
			this.method5346(arg5, arg2);
			this.method5347(arg4, null, arg0, 0, arg6, arg1, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	private void method5346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static233.anInt4334 = -1;
		Static349.anInt6296 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static125.anInt2322 = 0;
		Static216.anInt3946 = arg0;
		Static273.anInt6148 = arg0;
		Static190.anInt3614 = 0;
		Static259.anInt4765 = arg1;
		Static18.anInt311 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBLclient!rn;[IILjava/lang/String;I[Lclient!of;I)V")
	private void method5347(@OriginalArg(0) int arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class40[] arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg5 - this.aClass26_8.anInt609;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(26) int local26 = arg4.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(39) char local39 = (char) (Static124.method2462(arg4.charAt(local28)) & 0xFF);
			if (local39 == '<') {
				local21 = local28;
			} else {
				if (local39 == '>' && local21 != -1) {
					@Pc(64) String local64 = arg4.substring(local21 + 1, local28);
					local21 = -1;
					if (local64.equals("lt")) {
						local39 = '<';
					} else if (local64.equals("gt")) {
						local39 = '>';
					} else if (local64.equals("nbsp")) {
						local39 = ' ';
					} else if (local64.equals("shy")) {
						local39 = '\u00ad';
					} else if (local64.equals("times")) {
						local39 = '×';
					} else if (local64.equals("euro")) {
						local39 = '€';
					} else if (local64.equals("copy")) {
						local39 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									@Pc(134) int local134 = Static344.method5646(local64.substring(4));
									@Pc(138) Class40 local138 = arg6[local134];
									@Pc(147) int local147 = arg2 == null ? local138.method5084() : arg2[local134];
									if ((-16777216 & Static273.anInt6148) == -16777216) {
										local138.method5085(arg0, this.aClass26_8.anInt609 + local15 - local147, 0, 0);
									} else {
										local138.method5085(arg0, this.aClass26_8.anInt609 + local15 - local147, 1, Static273.anInt6148 & 0xFF000000 | 0xFFFFFF);
									}
									arg0 += arg6[local134].method5083();
									local23 = -1;
								} catch (@Pc(196) Exception local196) {
								}
							} else {
								this.method5348(local64);
							}
							continue;
						}
						local39 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg0 += this.aClass26_8.method504(local39, local23);
					}
					if (local39 == ' ') {
						if (Static190.anInt3614 > 0) {
							Static125.anInt2322 += Static190.anInt3614;
							arg0 += Static125.anInt2322 >> 8;
							Static125.anInt2322 &= 0xFF;
						}
					} else if (arg1 == null) {
						if ((Static18.anInt311 & 0xFF000000) != 0) {
							this.method5352(local39, arg0 + 1, local15 - -1, Static18.anInt311, true);
						}
						this.method5352(local39, arg0, local15, Static273.anInt6148, false);
					} else {
						if ((Static18.anInt311 & 0xFF000000) != 0) {
							this.method5349(local39, arg0 + 1, local15 + 1, Static18.anInt311, true, arg1, arg3, arg7);
						}
						this.method5349(local39, arg0, local15, Static273.anInt6148, false, arg1, arg3, arg7);
					}
					@Pc(312) int local312 = this.aClass26_8.method501(local39);
					if (Static349.anInt6296 != -1) {
						this.aClass81_8.method2999(local312, local15 + (int) ((double) this.aClass26_8.anInt609 * 0.7D), arg0, Static349.anInt6296);
					}
					if (Static233.anInt4334 != -1) {
						this.aClass81_8.method2999(local312, this.aClass26_8.anInt609 + local15 + 1, arg0, Static233.anInt4334);
					}
					local23 = local39;
					arg0 += local312;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5348(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static273.anInt6148 = Static273.anInt6148 & 0xFF000000 | Static290.method4947(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static273.anInt6148 = Static216.anInt3946 & 0xFFFFFF | Static273.anInt6148 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static273.anInt6148 = Static290.method4947(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static273.anInt6148 = Static216.anInt3946;
			} else if (arg0.startsWith("str=")) {
				Static349.anInt6296 = Static290.method4947(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static349.anInt6296 = -8388608;
			} else if (arg0.equals("/str")) {
				Static349.anInt6296 = -1;
			} else if (arg0.startsWith("u=")) {
				Static233.anInt4334 = Static290.method4947(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static233.anInt4334 = -16777216;
			} else if (arg0.equals("/u")) {
				Static233.anInt4334 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static18.anInt311 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static18.anInt311 = Static290.method4947(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static18.anInt311 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static18.anInt311 = Static259.anInt4765;
			} else if (arg0.equals("br")) {
				this.method5346(Static216.anInt3946, Static259.anInt4765);
			}
		} catch (@Pc(165) Exception local165) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(CIIIZLclient!rn;II)V")
	protected abstract void method5349(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/lang/String;[I[I[Lclient!of;I[I)V")
	private void method5350(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class40[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg5 - this.aClass26_8.anInt609;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(37) char local37 = (char) (Static124.method2462(arg1.charAt(local26)) & 0xFF);
			if (local37 == '<') {
				local13 = local26;
			} else {
				@Pc(134) int local134;
				@Pc(142) int local142;
				if (local37 == '>' && local13 != -1) {
					@Pc(60) String local60 = arg1.substring(local13 + 1, local26);
					local13 = -1;
					if (local60.equals("lt")) {
						local37 = '<';
					} else if (local60.equals("gt")) {
						local37 = '>';
					} else if (local60.equals("nbsp")) {
						local37 = ' ';
					} else if (local60.equals("shy")) {
						local37 = '\u00ad';
					} else if (local60.equals("times")) {
						local37 = '×';
					} else if (local60.equals("euro")) {
						local37 = '€';
					} else if (local60.equals("copy")) {
						local37 = '©';
					} else {
						if (!local60.equals("reg")) {
							if (local60.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local134 = 0;
									} else {
										local134 = arg3[local17];
									}
									if (arg6 == null) {
										local142 = 0;
									} else {
										local142 = arg6[local17];
									}
									local17++;
									@Pc(155) int local155 = Static344.method5646(local60.substring(4));
									@Pc(159) Class40 local159 = arg4[local155];
									@Pc(168) int local168 = arg2 == null ? local159.method5084() : arg2[local155];
									local159.method5085(local134 + arg0, -local168 + local11 - -this.aClass26_8.anInt609 - -local142, 0, 0);
									arg0 += arg4[local155].method5083();
									local15 = -1;
								} catch (@Pc(199) Exception local199) {
								}
							} else {
								this.method5348(local60);
							}
							continue;
						}
						local37 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg0 += this.aClass26_8.method504(local37, local15);
					}
					@Pc(231) int local231;
					if (arg3 == null) {
						local231 = 0;
					} else {
						local231 = arg3[local17];
					}
					if (arg6 == null) {
						local134 = 0;
					} else {
						local134 = arg6[local17];
					}
					if (local37 != ' ') {
						if ((Static18.anInt311 & 0xFF000000) != 0) {
							this.method5352(local37, local231 + arg0 + 1, local134 + (local11 - -1), Static18.anInt311, true);
						}
						this.method5352(local37, local231 + arg0, local11 - -local134, Static273.anInt6148, false);
					} else if (Static190.anInt3614 > 0) {
						Static125.anInt2322 += Static190.anInt3614;
						arg0 += Static125.anInt2322 >> 8;
						Static125.anInt2322 &= 0xFF;
					}
					local17++;
					local142 = this.aClass26_8.method501(local37);
					if (Static349.anInt6296 != -1) {
						this.aClass81_8.method2999(local142, local11 + (int) ((double) this.aClass26_8.anInt609 * 0.7D), arg0, Static349.anInt6296);
					}
					if (Static233.anInt4334 != -1) {
						this.aClass81_8.method2999(local142, local11 + this.aClass26_8.anInt609, arg0, Static233.anInt4334);
					}
					local15 = local37;
					arg0 += local142;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5352(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
