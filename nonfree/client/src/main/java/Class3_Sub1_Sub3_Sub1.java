import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public abstract class Class3_Sub1_Sub3_Sub1 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
	public int anInt1397 = 0;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "[[B")
	protected byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!cd", name = "sb", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!cd", name = "tb", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
	private int anInt1402;

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
	private int anInt1400;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class3_Sub1_Sub3_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray151 = arg1;
		this.anIntArray153 = arg2;
		this.anIntArray150 = arg3;
		this.anIntArray154 = arg4;
		this.method1079(arg0);
		this.aByteArrayArray5 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray153[local32] < local28 && this.anIntArray154[local32] != 0) {
				local28 = this.anIntArray153[local32];
			}
			if (this.anIntArray153[local32] + this.anIntArray154[local32] > local30) {
				local30 = this.anIntArray153[local32] + this.anIntArray154[local32];
			}
		}
		this.anInt1402 = this.anInt1397 - local28;
		this.anInt1400 = local30 - this.anInt1397;
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub3_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method1079(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;I)I")
	public final int method1052(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		return this.method1075(arg0, new int[] { arg1 }, Static21.aClass73Array10);
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IIIILjava/util/Random;I)I")
	public final int method1056(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1067(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3356];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3356; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1066(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;II)V")
	private void method1057(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1397;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3356; local10++) {
			@Pc(18) int local18 = arg0.aByteArray36[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class73 local38 = arg0.method2413(local10, local6 + 1);
					local6 = -1;
					if (local38.method2430(Static21.aClass73_779)) {
						local18 = 60;
					} else {
						if (!local38.method2430(Static21.aClass73_773)) {
							if (local38.method2434(Static21.aClass73_771)) {
								try {
									local68 = local38.method2447(4).method2431();
									@Pc(72) Class3_Sub1_Sub3_Sub3 local72 = Static21.aClass3_Sub1_Sub3_Sub3Array14[local68];
									if (Static21.anInt1407 == 256) {
										local72.method1493(arg1, local4 + this.anInt1397 - local72.anInt1915);
									} else {
										local72.method1490(arg1, local4 + this.anInt1397 - local72.anInt1915, Static21.anInt1407);
									}
									arg1 += local72.anInt1916;
									local8 = -1;
								} catch (@Pc(106) Exception local106) {
								}
							} else {
								this.method1071(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray8 != null && local8 != -1) {
						arg1 += this.aByteArray8[(local8 << 8) + local18];
					}
					@Pc(136) int local136 = this.anIntArray150[local18];
					local68 = this.anIntArray154[local18];
					if (local18 == 32) {
						if (Static21.anInt1398 > 0) {
							Static21.anInt1405 += Static21.anInt1398;
							arg1 += Static21.anInt1405 >> 8;
							Static21.anInt1405 &= 0xFF;
						}
					} else if (Static21.anInt1407 == 256) {
						if (Static21.anInt1403 != -1) {
							this.method1063(local18, arg1 + this.anIntArray151[local18] + 1, local4 + this.anIntArray153[local18] + 1, local136, local68, Static21.anInt1403);
						}
						this.method1053(local18, arg1 + this.anIntArray151[local18], local4 + this.anIntArray153[local18], local136, local68, Static21.anInt1404);
					} else {
						if (Static21.anInt1403 != -1) {
							this.method1059(local18, arg1 + this.anIntArray151[local18] + 1, local4 + this.anIntArray153[local18] + 1, local136, local68, Static21.anInt1403, Static21.anInt1407);
						}
						this.method1054(local18, arg1 + this.anIntArray151[local18], local4 + this.anIntArray153[local18], local136, local68, Static21.anInt1404, Static21.anInt1407);
					}
					@Pc(258) int local258 = this.anIntArray152[local18];
					if (Static21.anInt1396 != -1) {
						Static15.method2312(arg1, local4 + (int) ((double) this.anInt1397 * 0.7D), local258, Static21.anInt1396);
					}
					if (Static21.anInt1406 != -1) {
						Static15.method2312(arg1, local4 + this.anInt1397 + 1, local258, Static21.anInt1406);
					}
					arg1 += local258;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IIIII)V")
	public final void method1058(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1068(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3356];
		@Pc(14) int[] local14 = new int[arg0.anInt3356];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3356; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1066(arg0, arg1 - this.method1062(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIIII)V")
	private void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static15.anInt3218;
		@Pc(9) int local9 = Static15.anInt3218 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static15.anInt3220) {
			local20 = Static15.anInt3220 - arg2;
			arg4 -= local20;
			arg2 = Static15.anInt3220;
			local13 = local20 * arg3;
			local5 += local20 * Static15.anInt3218;
		}
		if (arg2 + arg4 > Static15.anInt3217) {
			arg4 -= arg2 + arg4 - Static15.anInt3217;
		}
		if (arg1 < Static15.anInt3219) {
			local20 = Static15.anInt3219 - arg1;
			arg3 -= local20;
			arg1 = Static15.anInt3219;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static15.anInt3215) {
			local20 = arg1 + arg3 - Static15.anInt3215;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static21.method1080(Static15.anIntArray335, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IIIIIIIIII)I")
	private int method1060(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1067(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1397;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1402 + this.anInt1400 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1075(arg0, local20, Static21.aClass73Array10);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1402;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1402 + (arg4 - this.anInt1402 - this.anInt1400 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1400 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1402 - this.anInt1400 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1402 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1057(Static21.aClass73Array10[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1057(Static21.aClass73Array10[local118], arg1 + (arg3 - this.method1062(Static21.aClass73Array10[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1057(Static21.aClass73Array10[local118], arg1 + arg3 - this.method1062(Static21.aClass73Array10[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1057(Static21.aClass73Array10[local118], arg1, local57);
			} else {
				this.method1064(Static21.aClass73Array10[local118], arg3);
				this.method1057(Static21.aClass73Array10[local118], arg1, local57);
				Static21.anInt1398 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!sd;)I")
	public final int method1062(@OriginalArg(0) Class73 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3356; local11++) {
			@Pc(19) int local19 = arg0.aByteArray36[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class73 local39 = arg0.method2413(local11, local5 + 1);
					local5 = -1;
					if (local39.method2430(Static21.aClass73_779)) {
						local19 = 60;
					} else {
						if (!local39.method2430(Static21.aClass73_773)) {
							if (local39.method2434(Static21.aClass73_771)) {
								try {
									@Pc(69) int local69 = local39.method2447(4).method2431();
									local9 += Static21.aClass3_Sub1_Sub3_Sub3Array14[local69].anInt1916;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray152[local19];
					if (this.aByteArray8 != null && local7 != -1) {
						local9 += this.aByteArray8[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(IIIIII)V")
	private void method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static15.anInt3218;
		@Pc(9) int local9 = Static15.anInt3218 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static15.anInt3220) {
			local20 = Static15.anInt3220 - arg2;
			arg4 -= local20;
			arg2 = Static15.anInt3220;
			local13 = local20 * arg3;
			local5 += local20 * Static15.anInt3218;
		}
		if (arg2 + arg4 > Static15.anInt3217) {
			arg4 -= arg2 + arg4 - Static15.anInt3217;
		}
		if (arg1 < Static15.anInt3219) {
			local20 = Static15.anInt3219 - arg1;
			arg3 -= local20;
			arg1 = Static15.anInt3219;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static15.anInt3215) {
			local20 = arg1 + arg3 - Static15.anInt3215;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static21.method1074(Static15.anIntArray335, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!sd;I)V")
	private void method1064(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2435(); local5++) {
			@Pc(11) int local11 = arg0.method2444(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static21.anInt1398 = (arg1 - this.method1062(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)I")
	private int method1065(@OriginalArg(0) int arg0) {
		return this.anIntArray152[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;II[I[I)V")
	private void method1066(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1397;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3356; local12++) {
			@Pc(20) int local20 = arg0.aByteArray36[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class73 local40 = arg0.method2413(local12, local6 + 1);
					local6 = -1;
					if (local40.method2430(Static21.aClass73_779)) {
						local20 = 60;
					} else {
						if (!local40.method2430(Static21.aClass73_773)) {
							if (local40.method2434(Static21.aClass73_771)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method2447(4).method2431();
									@Pc(93) Class3_Sub1_Sub3_Sub3 local93 = Static21.aClass3_Sub1_Sub3_Sub3Array14[local89];
									if (Static21.anInt1407 == 256) {
										local93.method1493(arg1 + local69, local4 + this.anInt1397 - local93.anInt1915 + local78);
									} else {
										local93.method1490(arg1 + local69, local4 + this.anInt1397 - local93.anInt1915 + local78, Static21.anInt1407);
									}
									arg1 += local93.anInt1916;
									local8 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							} else {
								this.method1071(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray8 != null && local8 != -1) {
						arg1 += this.aByteArray8[(local8 << 8) + local20];
					}
					@Pc(165) int local165 = this.anIntArray150[local20];
					local69 = this.anIntArray154[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static21.anInt1398 > 0) {
							Static21.anInt1405 += Static21.anInt1398;
							arg1 += Static21.anInt1405 >> 8;
							Static21.anInt1405 &= 0xFF;
						}
					} else if (Static21.anInt1407 == 256) {
						if (Static21.anInt1403 != -1) {
							this.method1063(local20, arg1 + this.anIntArray151[local20] + local78 + 1, local4 + this.anIntArray153[local20] + 1 + local89, local165, local69, Static21.anInt1403);
						}
						this.method1053(local20, arg1 + this.anIntArray151[local20] + local78, local4 + this.anIntArray153[local20] + local89, local165, local69, Static21.anInt1404);
					} else {
						if (Static21.anInt1403 != -1) {
							this.method1059(local20, arg1 + this.anIntArray151[local20] + local78 + 1, local4 + this.anIntArray153[local20] + 1 + local89, local165, local69, Static21.anInt1403, Static21.anInt1407);
						}
						this.method1054(local20, arg1 + this.anIntArray151[local20] + local78, local4 + this.anIntArray153[local20] + local89, local165, local69, Static21.anInt1404, Static21.anInt1407);
					}
					@Pc(322) int local322 = this.anIntArray152[local20];
					if (Static21.anInt1396 != -1) {
						Static15.method2312(arg1, local4 + (int) ((double) this.anInt1397 * 0.7D), local322, Static21.anInt1396);
					}
					if (Static21.anInt1406 != -1) {
						Static15.method2312(arg1, local4 + this.anInt1397, local322, Static21.anInt1406);
					}
					arg1 += local322;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	private void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static21.anInt1396 = -1;
		Static21.anInt1406 = -1;
		Static21.anInt1401 = arg1;
		Static21.anInt1403 = arg1;
		Static21.anInt1395 = arg0;
		Static21.anInt1404 = arg0;
		Static21.anInt1399 = arg2;
		Static21.anInt1407 = arg2;
		Static21.anInt1398 = 0;
		Static21.anInt1405 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
	private void method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static21.anInt1396 = -1;
		Static21.anInt1406 = -1;
		Static21.anInt1401 = arg1;
		Static21.anInt1403 = arg1;
		Static21.anInt1395 = arg0;
		Static21.anInt1404 = arg0;
		Static21.anInt1399 = 256;
		Static21.anInt1407 = 256;
		Static21.anInt1398 = 0;
		Static21.anInt1405 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IIII)V")
	public final void method1069(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1068(arg3, arg4);
			this.method1057(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IIIIIIIII)I")
	public final int method1070(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1060(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!sd;)V")
	private void method1071(@OriginalArg(0) Class73 arg0) {
		try {
			if (arg0.method2434(Static21.aClass73_781)) {
				Static21.anInt1404 = arg0.method2447(4).method2433(16);
				return;
			}
			if (arg0.method2430(Static21.aClass73_772)) {
				Static21.anInt1404 = Static21.anInt1395;
				return;
			}
			if (arg0.method2434(Static21.aClass73_775)) {
				Static21.anInt1396 = arg0.method2447(4).method2433(16);
				return;
			}
			if (arg0.method2430(Static21.aClass73_778)) {
				Static21.anInt1396 = 8388608;
				return;
			}
			if (arg0.method2430(Static21.aClass73_777)) {
				Static21.anInt1396 = -1;
				return;
			}
			if (arg0.method2434(Static21.aClass73_770)) {
				Static21.anInt1406 = arg0.method2447(2).method2433(16);
				return;
			}
			if (arg0.method2430(Static21.aClass73_776)) {
				Static21.anInt1406 = 0;
				return;
			}
			if (arg0.method2430(Static21.aClass73_774)) {
				Static21.anInt1406 = -1;
				return;
			}
			if (arg0.method2434(Static21.aClass73_769)) {
				Static21.anInt1403 = arg0.method2447(5).method2433(16);
				return;
			}
			if (arg0.method2430(Static21.aClass73_780)) {
				Static21.anInt1403 = 0;
				return;
			}
			if (arg0.method2430(Static21.aClass73_783)) {
				Static21.anInt1403 = Static21.anInt1401;
				return;
			}
			if (arg0.method2430(Static21.aClass73_782)) {
				this.method1067(Static21.anInt1395, Static21.anInt1401, Static21.anInt1399);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!sd;IIII)V")
	public final void method1072(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1068(arg3, arg4);
			this.method1057(arg0, arg1 - this.method1062(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!sd;IIII)V")
	public final void method1073(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1068(arg3, arg4);
			this.method1057(arg0, arg1 - this.method1062(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;[I[Lclient!sd;)I")
	private int method1075(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class73[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class73 local11 = Static116.method2047(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2435();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2444(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class73 local55 = arg0.method2413(local29, local19 + 1);
					local19 = -1;
					local11.method2420(60);
					local11.method2443(local55);
					local11.method2420(62);
					if (local55.method2430(Static21.aClass73_782)) {
						arg2[local23++] = local11.method2413(local11.method2435(), local7);
						local7 = local11.method2435();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2430(Static21.aClass73_779)) {
						local5 += this.method1065(60);
						if (this.aByteArray8 != null && local21 != -1) {
							local5 += this.aByteArray8[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2430(Static21.aClass73_773)) {
						local5 += this.method1065(62);
						if (this.aByteArray8 != null && local21 != -1) {
							local5 += this.aByteArray8[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2434(Static21.aClass73_771)) {
						try {
							@Pc(173) int local173 = local55.method2447(4).method2431();
							local5 += Static21.aClass3_Sub1_Sub3_Sub3Array14[local173].anInt1916;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2420(local35);
						local5 += this.method1065(local35);
						if (this.aByteArray8 != null && local21 != -1) {
							local5 += this.aByteArray8[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2435();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2413(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2435();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2435() > local7) {
			arg2[local23++] = local11.method2413(local11.method2435(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!sd;IIIII)V")
	public final void method1076(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1068(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3356];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3356; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1066(arg0, arg1 - this.method1062(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!sd;I)I")
	public final int method1077(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1075(arg0, new int[] { arg1 }, Static21.aClass73Array10);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1062(Static21.aClass73Array10[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IIIIII)V")
	public final void method1078(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1068(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3356];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3356; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1066(arg0, arg1 - this.method1062(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([B)V")
	private void method1079(@OriginalArg(0) byte[] arg0) {
		this.anIntArray152 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray152.length; local9++) {
				this.anIntArray152[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1397 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray152[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray8 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray8[(local182 << 8) + local150] = (byte) Static21.method1081(local93, local136, local58, this.anIntArray152, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1397 = local58[32] + local55[32];
	}
}
