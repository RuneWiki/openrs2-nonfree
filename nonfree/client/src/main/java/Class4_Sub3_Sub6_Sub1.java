import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class4_Sub3_Sub6_Sub1 extends Class4_Sub3_Sub6 {

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!qc", name = "mb", descriptor = "I")
	public int anInt1808 = 0;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "I")
	private int anInt1810;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class4_Sub3_Sub6_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray203 = arg1;
		this.anIntArray205 = arg2;
		this.anIntArray207 = arg3;
		this.anIntArray204 = arg4;
		this.method1224(arg0);
		this.aByteArrayArray9 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray205[local32] < local28 && this.anIntArray204[local32] != 0) {
				local28 = this.anIntArray205[local32];
			}
			if (this.anIntArray205[local32] + this.anIntArray204[local32] > local30) {
				local30 = this.anIntArray205[local32] + this.anIntArray204[local32];
			}
		}
		this.anInt1810 = this.anInt1808 - local28;
		this.anInt1806 = local30 - this.anInt1808;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
	public Class4_Sub3_Sub6_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method1224(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;I)V")
	private void method1197(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1345(); local5++) {
			@Pc(11) int local11 = arg0.method1338(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static93.anInt1802 = (arg1 - this.method1218(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIIIIII)V")
	protected abstract void method1198(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;IIII)V")
	public final void method1200(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1216(arg3, arg4);
			this.method1217(arg0, arg1 - this.method1218(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIIIII)V")
	protected abstract void method1201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lclient!od;IIII)V")
	public final void method1202(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1216(arg3, arg4);
			this.method1217(arg0, arg1 - this.method1218(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lclient!od;IIII)V")
	public final void method1204(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1216(arg3, arg4);
			this.method1217(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;IIIIII)V")
	public final void method1205(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1216(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1991];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1991; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1212(arg0, arg1 - this.method1218(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)I")
	private int method1206(@OriginalArg(0) int arg0) {
		return this.anIntArray206[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;IIIII)V")
	public final void method1207(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1216(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1991];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1991; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1212(arg0, arg1 - this.method1218(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lclient!od;IIIII)V")
	public final void method1208(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method1216(16777215, 0);
		Static93.aRandom2.setSeed((long) arg3);
		Static93.anInt1801 = (Static93.aRandom2.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt1991];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1991; local25++) {
			local21[local25] = local23;
			if ((Static93.aRandom2.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1212(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;[I[Lclient!od;)I")
	private int method1209(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class60[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class60 local11 = Static108.method1796(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1345();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1338(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class60 local55 = arg0.method1333(local19 + 1, local29);
					local19 = -1;
					local11.method1308(60);
					local11.method1332(local55);
					local11.method1308(62);
					if (local55.method1311(Static93.aClass60_736)) {
						arg2[local23++] = local11.method1333(local7, local11.method1345());
						local7 = local11.method1345();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1311(Static93.aClass60_733)) {
						local5 += this.method1206(60);
						if (this.aByteArray18 != null && local21 != -1) {
							local5 += this.aByteArray18[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1311(Static93.aClass60_740)) {
						local5 += this.method1206(62);
						if (this.aByteArray18 != null && local21 != -1) {
							local5 += this.aByteArray18[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1321(Static93.aClass60_742)) {
						try {
							@Pc(173) int local173 = local55.method1315(4).method1324();
							local5 += Static93.aClass4_Sub3_Sub6_Sub2Array6[local173].anInt2254;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1308(local35);
						local5 += this.method1206(local35);
						if (this.aByteArray18 != null && local21 != -1) {
							local5 += this.aByteArray18[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1345();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1333(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1345();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1345() > local7) {
			arg2[local23++] = local11.method1333(local7, local11.method1345());
		}
		return local23;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;IIIIIIIII)I")
	public final int method1210(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1216(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt1808;
		}
		@Pc(19) int[] local19 = new int[] { arg3 };
		if (arg4 < this.anInt1810 + this.anInt1806 + arg9 && arg4 < arg9 + arg9) {
			local19 = null;
		}
		@Pc(41) int local41 = this.method1209(arg0, local19, Static93.aClass60Array11);
		if (arg8 == 3 && local41 == 1) {
			arg8 = 1;
		}
		@Pc(56) int local56;
		@Pc(117) int local117;
		if (arg8 == 0) {
			local56 = arg2 + this.anInt1810;
		} else if (arg8 == 1) {
			local56 = arg2 + this.anInt1810 + (arg4 - this.anInt1810 - this.anInt1806 - (local41 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local56 = arg2 + arg4 - this.anInt1806 - (local41 - 1) * arg9;
		} else {
			local117 = (arg4 - this.anInt1810 - this.anInt1806 - (local41 - 1) * arg9) / (local41 + 1);
			if (local117 < 0) {
				local117 = 0;
			}
			local56 = arg2 + this.anInt1810 + local117;
			arg9 += local117;
		}
		for (local117 = 0; local117 < local41; local117++) {
			if (arg7 == 0) {
				this.method1217(Static93.aClass60Array11[local117], arg1, local56);
			} else if (arg7 == 1) {
				this.method1217(Static93.aClass60Array11[local117], arg1 + (arg3 - this.method1218(Static93.aClass60Array11[local117])) / 2, local56);
			} else if (arg7 == 2) {
				this.method1217(Static93.aClass60Array11[local117], arg1 + arg3 - this.method1218(Static93.aClass60Array11[local117]), local56);
			} else if (local117 == local41 - 1) {
				this.method1217(Static93.aClass60Array11[local117], arg1, local56);
			} else {
				this.method1197(Static93.aClass60Array11[local117], arg3);
				this.method1217(Static93.aClass60Array11[local117], arg1, local56);
				Static93.anInt1802 = 0;
			}
			local56 += arg9;
		}
		return local41;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;II[I[I)V")
	private void method1212(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1808;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1991; local12++) {
			@Pc(20) int local20 = arg0.aByteArray21[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class60 local40 = arg0.method1333(local6 + 1, local12);
					local6 = -1;
					if (local40.method1311(Static93.aClass60_733)) {
						local20 = 60;
					} else {
						if (!local40.method1311(Static93.aClass60_740)) {
							if (local40.method1321(Static93.aClass60_742)) {
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
									local89 = local40.method1315(4).method1324();
									@Pc(93) Class4_Sub3_Sub6_Sub2 local93 = Static93.aClass4_Sub3_Sub6_Sub2Array6[local89];
									local93.method1558(arg1 + local69, local4 + this.anInt1808 - local93.anInt2252 + local78);
									arg1 += local93.anInt2254;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method1223(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray18 != null && local8 != -1) {
						arg1 += this.aByteArray18[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray207[local20];
					local69 = this.anIntArray204[local20];
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
						if (Static93.anInt1802 > 0) {
							Static93.anInt1800 += Static93.anInt1802;
							arg1 += Static93.anInt1800 >> 8;
							Static93.anInt1800 &= 0xFF;
						}
					} else if (Static93.anInt1801 == 256) {
						if (Static93.anInt1807 != -1) {
							Static93.method1214(this.aByteArrayArray9[local20], arg1 + this.anIntArray203[local20] + local78 + 1, local4 + this.anIntArray205[local20] + 1 + local89, local146, local69, Static93.anInt1807);
						}
						this.method1201(this.aByteArrayArray9[local20], arg1 + this.anIntArray203[local20] + local78, local4 + this.anIntArray205[local20] + local89, local146, local69, Static93.anInt1811);
					} else {
						if (Static93.anInt1807 != -1) {
							Static93.method1203(this.aByteArrayArray9[local20], arg1 + this.anIntArray203[local20] + local78 + 1, local4 + this.anIntArray205[local20] + 1 + local89, local146, local69, Static93.anInt1807, Static93.anInt1801);
						}
						this.method1198(this.aByteArrayArray9[local20], arg1 + this.anIntArray203[local20] + local78, local4 + this.anIntArray205[local20] + local89, local146, local69, Static93.anInt1811, Static93.anInt1801);
					}
					@Pc(313) int local313 = this.anIntArray206[local20];
					if (Static93.anInt1803 != -1) {
						Static34.method1654(arg1, local4 + (int) ((double) this.anInt1808 * 0.7D), local313, Static93.anInt1803);
					}
					if (Static93.anInt1809 != -1) {
						Static34.method1654(arg1, local4 + this.anInt1808, local313, Static93.anInt1809);
					}
					arg1 += local313;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lclient!od;I)I")
	public final int method1215(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		return this.method1209(arg0, new int[] { arg1 }, Static93.aClass60Array11);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	private void method1216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static93.anInt1803 = -1;
		Static93.anInt1809 = -1;
		Static93.anInt1805 = arg1;
		Static93.anInt1807 = arg1;
		Static93.anInt1804 = arg0;
		Static93.anInt1811 = arg0;
		Static93.anInt1801 = 256;
		Static93.anInt1802 = 0;
		Static93.anInt1800 = 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!od;II)V")
	private void method1217(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1808;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1991; local10++) {
			@Pc(18) int local18 = arg0.aByteArray21[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class60 local38 = arg0.method1333(local6 + 1, local10);
					local6 = -1;
					if (local38.method1311(Static93.aClass60_733)) {
						local18 = 60;
					} else {
						if (!local38.method1311(Static93.aClass60_740)) {
							if (local38.method1321(Static93.aClass60_742)) {
								try {
									local68 = local38.method1315(4).method1324();
									@Pc(72) Class4_Sub3_Sub6_Sub2 local72 = Static93.aClass4_Sub3_Sub6_Sub2Array6[local68];
									local72.method1558(arg1, local4 + this.anInt1808 - local72.anInt2252);
									arg1 += local72.anInt2254;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method1223(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray18 != null && local8 != -1) {
						arg1 += this.aByteArray18[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray207[local18];
					local68 = this.anIntArray204[local18];
					if (local18 == 32) {
						if (Static93.anInt1802 > 0) {
							Static93.anInt1800 += Static93.anInt1802;
							arg1 += Static93.anInt1800 >> 8;
							Static93.anInt1800 &= 0xFF;
						}
					} else if (Static93.anInt1801 == 256) {
						if (Static93.anInt1807 != -1) {
							Static93.method1214(this.aByteArrayArray9[local18], arg1 + this.anIntArray203[local18] + 1, local4 + this.anIntArray205[local18] + 1, local121, local68, Static93.anInt1807);
						}
						this.method1201(this.aByteArrayArray9[local18], arg1 + this.anIntArray203[local18], local4 + this.anIntArray205[local18], local121, local68, Static93.anInt1811);
					} else {
						if (Static93.anInt1807 != -1) {
							Static93.method1203(this.aByteArrayArray9[local18], arg1 + this.anIntArray203[local18] + 1, local4 + this.anIntArray205[local18] + 1, local121, local68, Static93.anInt1807, Static93.anInt1801);
						}
						this.method1198(this.aByteArrayArray9[local18], arg1 + this.anIntArray203[local18], local4 + this.anIntArray205[local18], local121, local68, Static93.anInt1811, Static93.anInt1801);
					}
					@Pc(253) int local253 = this.anIntArray206[local18];
					if (Static93.anInt1803 != -1) {
						Static34.method1654(arg1, local4 + (int) ((double) this.anInt1808 * 0.7D), local253, Static93.anInt1803);
					}
					if (Static93.anInt1809 != -1) {
						Static34.method1654(arg1, local4 + this.anInt1808 + 1, local253, Static93.anInt1809);
					}
					arg1 += local253;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Lclient!od;)I")
	public final int method1218(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt1991; local11++) {
			@Pc(19) int local19 = arg0.aByteArray21[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class60 local39 = arg0.method1333(local5 + 1, local11);
					local5 = -1;
					if (local39.method1311(Static93.aClass60_733)) {
						local19 = 60;
					} else {
						if (!local39.method1311(Static93.aClass60_740)) {
							if (local39.method1321(Static93.aClass60_742)) {
								try {
									@Pc(69) int local69 = local39.method1315(4).method1324();
									local9 += Static93.aClass4_Sub3_Sub6_Sub2Array6[local69].anInt2254;
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
					local9 += this.anIntArray206[local19];
					if (this.aByteArray18 != null && local7 != -1) {
						local9 += this.aByteArray18[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lclient!od;IIIII)V")
	public final void method1219(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1216(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1991];
		@Pc(14) int[] local14 = new int[arg0.anInt1991];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1991; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1212(arg0, arg1 - this.method1218(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lclient!od;I)I")
	public final int method1220(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1209(arg0, new int[] { arg1 }, Static93.aClass60Array11);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1218(Static93.aClass60Array11[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Lclient!od;)V")
	private void method1223(@OriginalArg(0) Class60 arg0) {
		try {
			if (arg0.method1321(Static93.aClass60_746)) {
				Static93.anInt1811 = arg0.method1315(4).method1331(16);
				return;
			}
			if (arg0.method1311(Static93.aClass60_745)) {
				Static93.anInt1811 = Static93.anInt1804;
				return;
			}
			if (arg0.method1321(Static93.aClass60_741)) {
				Static93.anInt1803 = arg0.method1315(4).method1331(16);
				return;
			}
			if (arg0.method1311(Static93.aClass60_735)) {
				Static93.anInt1803 = 8388608;
				return;
			}
			if (arg0.method1311(Static93.aClass60_734)) {
				Static93.anInt1803 = -1;
				return;
			}
			if (arg0.method1321(Static93.aClass60_739)) {
				Static93.anInt1809 = arg0.method1315(2).method1331(16);
				return;
			}
			if (arg0.method1311(Static93.aClass60_744)) {
				Static93.anInt1809 = 0;
				return;
			}
			if (arg0.method1311(Static93.aClass60_743)) {
				Static93.anInt1809 = -1;
				return;
			}
			if (arg0.method1321(Static93.aClass60_738)) {
				Static93.anInt1807 = arg0.method1315(5).method1331(16);
				return;
			}
			if (arg0.method1311(Static93.aClass60_732)) {
				Static93.anInt1807 = 0;
				return;
			}
			if (arg0.method1311(Static93.aClass60_737)) {
				Static93.anInt1807 = Static93.anInt1805;
				return;
			}
			if (arg0.method1311(Static93.aClass60_736)) {
				this.method1216(Static93.anInt1804, Static93.anInt1805);
				return;
			}
		} catch (@Pc(122) Exception local122) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([B)V")
	private void method1224(@OriginalArg(0) byte[] arg0) {
		this.anIntArray206 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray206.length; local9++) {
				this.anIntArray206[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1808 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray206[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray18 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray18[(local182 << 8) + local150] = (byte) Static93.method1221(local93, local136, local58, this.anIntArray206, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1808 = local58[32] + local55[32];
	}
}
