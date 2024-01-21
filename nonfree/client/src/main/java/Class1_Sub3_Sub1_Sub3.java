import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public abstract class Class1_Sub3_Sub1_Sub3 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!nd", name = "ob", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!nd", name = "vb", descriptor = "[Lclient!va;")
	private Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array7;

	@OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
	public int anInt3279 = 0;

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "[[B")
	protected byte[][] aByteArrayArray8 = new byte[256][];

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "[I")
	private int[] anIntArray290;

	@OriginalMember(owner = "client!nd", name = "Ib", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!nd", name = "ub", descriptor = "I")
	private int anInt3281;

	@OriginalMember(owner = "client!nd", name = "Jb", descriptor = "I")
	private int anInt3287;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub3_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray292 = arg1;
		this.anIntArray290 = arg2;
		this.anIntArray294 = arg3;
		this.anIntArray289 = arg4;
		this.method2454(arg0);
		this.aByteArrayArray8 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray290[local32] < local28 && this.anIntArray289[local32] != 0) {
				local28 = this.anIntArray290[local32];
			}
			if (this.anIntArray290[local32] + this.anIntArray289[local32] > local30) {
				local30 = this.anIntArray290[local32] + this.anIntArray289[local32];
			}
		}
		this.anInt3281 = this.anInt3279 - local28;
		this.anInt3287 = local30 - this.anInt3279;
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.method2454(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;IIII)V")
	public final void method2443(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2448(arg3, arg4);
			this.method2457(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Lclient!vd;IIII)V")
	public final void method2444(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2448(arg3, arg4);
			this.method2457(arg0, arg1 - this.method2462(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;IIIII)V")
	public final void method2446(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2448(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt4244];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt4244; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2461(arg0, arg1 - this.method2462(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
	private void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static130.anInt3280 = -1;
		Static130.anInt3277 = -1;
		Static130.anInt3284 = arg1;
		Static130.anInt3282 = arg1;
		Static130.anInt3283 = arg0;
		Static130.anInt3285 = arg0;
		Static130.anInt3286 = 256;
		Static130.anInt3278 = 256;
		Static130.anInt3276 = 0;
		Static130.anInt3288 = 0;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)I")
	private int method2450(@OriginalArg(0) int arg0) {
		return this.anIntArray291[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Lclient!vd;IIII)V")
	public final void method2451(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method2448(arg3, arg4);
			this.method2457(arg0, arg1 - this.method2462(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;I)I")
	public final int method2452(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		return this.method2470(arg0, new int[] { arg1 }, Static130.aClass92Array22);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Lclient!vd;IIIII)V")
	public final void method2453(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method2448(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt4244];
		@Pc(14) int[] local14 = new int[arg0.anInt4244];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt4244; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method2461(arg0, arg1 - this.method2462(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([B)V")
	private void method2454(@OriginalArg(0) byte[] arg0) {
		this.anIntArray291 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray291.length; local9++) {
				this.anIntArray291[local9] = arg0[local9] & 0xFF;
			}
			this.anInt3279 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray291[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray46 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray46[(local182 << 8) + local150] = (byte) Static130.method2447(local93, local136, local58, this.anIntArray291, local55, local182, local150);
					}
				}
			}
		}
		this.anInt3279 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Lclient!vd;I)I")
	public final int method2455(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method2470(arg0, new int[] { arg1 }, Static130.aClass92Array22);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method2462(Static130.aClass92Array22[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lclient!va;[I)V")
	public final void method2456(@OriginalArg(0) Class1_Sub3_Sub1_Sub5[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass1_Sub3_Sub1_Sub5Array7 = arg0;
		this.anIntArray293 = arg1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;II)V")
	private void method2457(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt3279;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt4244; local10++) {
			@Pc(18) int local18 = arg0.aByteArray52[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class92 local38 = arg0.method3208(local10, local6 + 1);
					local6 = -1;
					if (local38.method3243(Static130.aClass92_1582)) {
						local18 = 60;
					} else if (local38.method3243(Static130.aClass92_1579)) {
						local18 = 62;
					} else if (local38.method3243(Static130.aClass92_1583)) {
						local18 = 160;
					} else if (local38.method3243(Static130.aClass92_1594)) {
						local18 = 173;
					} else if (local38.method3243(Static130.aClass92_1592)) {
						local18 = 215;
					} else if (local38.method3243(Static130.aClass92_1595)) {
						local18 = 128;
					} else if (local38.method3243(Static130.aClass92_1584)) {
						local18 = 169;
					} else {
						if (!local38.method3243(Static130.aClass92_1588)) {
							if (local38.method3205(Static130.aClass92_1596)) {
								try {
									local116 = local38.method3232(4).method3235();
									@Pc(121) Class1_Sub3_Sub1_Sub5 local121 = this.aClass1_Sub3_Sub1_Sub5Array7[local116];
									@Pc(132) int local132 = this.anIntArray293 == null ? local121.anInt4207 : this.anIntArray293[local116];
									if (Static130.anInt3278 == 256) {
										local121.method3183(arg1, local4 + this.anInt3279 - local132);
									} else {
										local121.method3185(arg1, local4 + this.anInt3279 - local132, Static130.anInt3278);
									}
									arg1 += local121.anInt4206;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method2464(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray46 != null && local8 != -1) {
						arg1 += this.aByteArray46[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray294[local18];
					local116 = this.anIntArray289[local18];
					if (local18 == 32) {
						if (Static130.anInt3276 > 0) {
							Static130.anInt3288 += Static130.anInt3276;
							arg1 += Static130.anInt3288 >> 8;
							Static130.anInt3288 &= 0xFF;
						}
					} else if (Static130.anInt3278 == 256) {
						if (Static130.anInt3282 != -1) {
							this.method2467(local18, arg1 + this.anIntArray292[local18] + 1, local4 + this.anIntArray290[local18] + 1, local194, local116, Static130.anInt3282);
						}
						this.method2466(local18, arg1 + this.anIntArray292[local18], local4 + this.anIntArray290[local18], local194, local116, Static130.anInt3285);
					} else {
						if (Static130.anInt3282 != -1) {
							this.method2471(local18, arg1 + this.anIntArray292[local18] + 1, local4 + this.anIntArray290[local18] + 1, local194, local116, Static130.anInt3282, Static130.anInt3278);
						}
						this.method2469(local18, arg1 + this.anIntArray292[local18], local4 + this.anIntArray290[local18], local194, local116, Static130.anInt3285, Static130.anInt3278);
					}
					@Pc(316) int local316 = this.anIntArray291[local18];
					if (Static130.anInt3280 != -1) {
						Static46.method3162(arg1, local4 + (int) ((double) this.anInt3279 * 0.7D), local316, Static130.anInt3280);
					}
					if (Static130.anInt3277 != -1) {
						Static46.method3162(arg1, local4 + this.anInt3279 + 1, local316, Static130.anInt3277);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Lclient!vd;I)V")
	private void method2459(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method3233(); local5++) {
			@Pc(11) int local11 = arg0.method3231(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static130.anInt3276 = (arg1 - this.method2462(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;IIIIII)V")
	public final void method2460(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method2448(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt4244];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt4244; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method2461(arg0, arg1 - this.method2462(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;II[I[I)V")
	private void method2461(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3279;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt4244; local12++) {
			@Pc(20) int local20 = arg0.aByteArray52[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class92 local40 = arg0.method3208(local12, local6 + 1);
					local6 = -1;
					if (local40.method3243(Static130.aClass92_1582)) {
						local20 = 60;
					} else if (local40.method3243(Static130.aClass92_1579)) {
						local20 = 62;
					} else if (local40.method3243(Static130.aClass92_1583)) {
						local20 = 160;
					} else if (local40.method3243(Static130.aClass92_1594)) {
						local20 = 173;
					} else if (local40.method3243(Static130.aClass92_1592)) {
						local20 = 215;
					} else if (local40.method3243(Static130.aClass92_1595)) {
						local20 = 128;
					} else if (local40.method3243(Static130.aClass92_1584)) {
						local20 = 169;
					} else {
						if (!local40.method3243(Static130.aClass92_1588)) {
							if (local40.method3205(Static130.aClass92_1596)) {
								try {
									if (arg3 == null) {
										local117 = 0;
									} else {
										local117 = arg3[local10];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local10];
									}
									local10++;
									local137 = local40.method3232(4).method3235();
									@Pc(142) Class1_Sub3_Sub1_Sub5 local142 = this.aClass1_Sub3_Sub1_Sub5Array7[local137];
									@Pc(153) int local153 = this.anIntArray293 == null ? local142.anInt4207 : this.anIntArray293[local137];
									if (Static130.anInt3278 == 256) {
										local142.method3183(arg1 + local117, local4 + this.anInt3279 - local153 + local126);
									} else {
										local142.method3185(arg1 + local117, local4 + this.anInt3279 - local153 + local126, Static130.anInt3278);
									}
									arg1 += local142.anInt4206;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method2464(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray46 != null && local8 != -1) {
						arg1 += this.aByteArray46[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray294[local20];
					local117 = this.anIntArray289[local20];
					if (arg3 == null) {
						local126 = 0;
					} else {
						local126 = arg3[local10];
					}
					if (arg4 == null) {
						local137 = 0;
					} else {
						local137 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static130.anInt3276 > 0) {
							Static130.anInt3288 += Static130.anInt3276;
							arg1 += Static130.anInt3288 >> 8;
							Static130.anInt3288 &= 0xFF;
						}
					} else if (Static130.anInt3278 == 256) {
						if (Static130.anInt3282 != -1) {
							this.method2467(local20, arg1 + this.anIntArray292[local20] + local126 + 1, local4 + this.anIntArray290[local20] + 1 + local137, local223, local117, Static130.anInt3282);
						}
						this.method2466(local20, arg1 + this.anIntArray292[local20] + local126, local4 + this.anIntArray290[local20] + local137, local223, local117, Static130.anInt3285);
					} else {
						if (Static130.anInt3282 != -1) {
							this.method2471(local20, arg1 + this.anIntArray292[local20] + local126 + 1, local4 + this.anIntArray290[local20] + 1 + local137, local223, local117, Static130.anInt3282, Static130.anInt3278);
						}
						this.method2469(local20, arg1 + this.anIntArray292[local20] + local126, local4 + this.anIntArray290[local20] + local137, local223, local117, Static130.anInt3285, Static130.anInt3278);
					}
					@Pc(380) int local380 = this.anIntArray291[local20];
					if (Static130.anInt3280 != -1) {
						Static46.method3162(arg1, local4 + (int) ((double) this.anInt3279 * 0.7D), local380, Static130.anInt3280);
					}
					if (Static130.anInt3277 != -1) {
						Static46.method3162(arg1, local4 + this.anInt3279, local380, Static130.anInt3277);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;)I")
	public final int method2462(@OriginalArg(0) Class92 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt4244; local11++) {
			@Pc(19) int local19 = arg0.aByteArray52[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class92 local39 = arg0.method3208(local11, local5 + 1);
					local5 = -1;
					if (local39.method3243(Static130.aClass92_1582)) {
						local19 = 60;
					} else if (local39.method3243(Static130.aClass92_1579)) {
						local19 = 62;
					} else if (local39.method3243(Static130.aClass92_1583)) {
						local19 = 160;
					} else if (local39.method3243(Static130.aClass92_1594)) {
						local19 = 173;
					} else if (local39.method3243(Static130.aClass92_1592)) {
						local19 = 215;
					} else if (local39.method3243(Static130.aClass92_1595)) {
						local19 = 128;
					} else if (local39.method3243(Static130.aClass92_1584)) {
						local19 = 169;
					} else {
						if (!local39.method3243(Static130.aClass92_1588)) {
							if (local39.method3205(Static130.aClass92_1596)) {
								try {
									@Pc(117) int local117 = local39.method3232(4).method3235();
									local9 += this.aClass1_Sub3_Sub1_Sub5Array7[local117].anInt4206;
									local7 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray291[local19];
					if (this.aByteArray46 != null && local7 != -1) {
						local9 += this.aByteArray46[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	private void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static130.anInt3280 = -1;
		Static130.anInt3277 = -1;
		Static130.anInt3284 = arg1;
		Static130.anInt3282 = arg1;
		Static130.anInt3283 = arg0;
		Static130.anInt3285 = arg0;
		Static130.anInt3286 = arg2;
		Static130.anInt3278 = arg2;
		Static130.anInt3276 = 0;
		Static130.anInt3288 = 0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Lclient!vd;)V")
	private void method2464(@OriginalArg(0) Class92 arg0) {
		try {
			if (arg0.method3205(Static130.aClass92_1591)) {
				Static130.anInt3285 = arg0.method3232(4).method3197(16);
				return;
			}
			if (arg0.method3243(Static130.aClass92_1589)) {
				Static130.anInt3285 = Static130.anInt3283;
				return;
			}
			if (arg0.method3205(Static130.aClass92_1587)) {
				Static130.anInt3278 = arg0.method3232(6).method3235();
				return;
			}
			if (arg0.method3243(Static130.aClass92_1578)) {
				Static130.anInt3278 = Static130.anInt3286;
				return;
			}
			if (arg0.method3205(Static130.aClass92_1586)) {
				Static130.anInt3280 = arg0.method3232(4).method3197(16);
				return;
			}
			if (arg0.method3243(Static130.aClass92_1574)) {
				Static130.anInt3280 = 8388608;
				return;
			}
			if (arg0.method3243(Static130.aClass92_1593)) {
				Static130.anInt3280 = -1;
				return;
			}
			if (arg0.method3205(Static130.aClass92_1576)) {
				Static130.anInt3277 = arg0.method3232(2).method3197(16);
				return;
			}
			if (arg0.method3243(Static130.aClass92_1585)) {
				Static130.anInt3277 = 0;
				return;
			}
			if (arg0.method3243(Static130.aClass92_1575)) {
				Static130.anInt3277 = -1;
				return;
			}
			if (arg0.method3205(Static130.aClass92_1581)) {
				Static130.anInt3282 = arg0.method3232(5).method3197(16);
				return;
			}
			if (arg0.method3243(Static130.aClass92_1590)) {
				Static130.anInt3282 = 0;
				return;
			}
			if (arg0.method3243(Static130.aClass92_1577)) {
				Static130.anInt3282 = Static130.anInt3284;
				return;
			}
			if (arg0.method3243(Static130.aClass92_1580)) {
				this.method2463(Static130.anInt3283, Static130.anInt3284, Static130.anInt3286);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;IIIILjava/util/Random;I)I")
	public final int method2465(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method2463(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt4244];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt4244; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method2461(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(IIIIII)V")
	private void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt4199;
		@Pc(9) int local9 = Static46.anInt4199 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt4197) {
			local20 = Static46.anInt4197 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt4197;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt4199;
		}
		if (arg2 + arg4 > Static46.anInt4200) {
			arg4 -= arg2 + arg4 - Static46.anInt4200;
		}
		if (arg1 < Static46.anInt4202) {
			local20 = Static46.anInt4202 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt4202;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt4201) {
			local20 = arg1 + arg3 - Static46.anInt4201;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static130.method2449(Static46.anIntArray334, this.aByteArrayArray8[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;[I[Lclient!vd;)I")
	private int method2470(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class92[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class92 local11 = Static193.method2265(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method3233();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method3231(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class92 local55 = arg0.method3208(local29, local19 + 1);
					local19 = -1;
					local11.method3204(60);
					local11.method3237(local55);
					local11.method3204(62);
					if (local55.method3243(Static130.aClass92_1580)) {
						arg2[local23++] = local11.method3208(local11.method3233(), local7);
						local7 = local11.method3233();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method3243(Static130.aClass92_1582)) {
						local5 += this.method2450(60);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method3243(Static130.aClass92_1579)) {
						local5 += this.method2450(62);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method3243(Static130.aClass92_1583)) {
						local5 += this.method2450(160);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method3243(Static130.aClass92_1594)) {
						local5 += this.method2450(173);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method3243(Static130.aClass92_1592)) {
						local5 += this.method2450(215);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method3243(Static130.aClass92_1595)) {
						local5 += this.method2450(128);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method3243(Static130.aClass92_1584)) {
						local5 += this.method2450(169);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method3243(Static130.aClass92_1588)) {
						local5 += this.method2450(174);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method3205(Static130.aClass92_1596)) {
						try {
							@Pc(359) int local359 = local55.method3232(4).method3235();
							local5 += this.aClass1_Sub3_Sub1_Sub5Array7[local359].anInt4206;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method3204(local35);
						local5 += this.method2450(local35);
						if (this.aByteArray46 != null && local21 != -1) {
							local5 += this.aByteArray46[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method3233();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method3208(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method3233();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method3233() > local7) {
			arg2[local23++] = local11.method3208(local11.method3233(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(IIIIIII)V")
	private void method2471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt4199;
		@Pc(9) int local9 = Static46.anInt4199 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt4197) {
			local20 = Static46.anInt4197 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt4197;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt4199;
		}
		if (arg2 + arg4 > Static46.anInt4200) {
			arg4 -= arg2 + arg4 - Static46.anInt4200;
		}
		if (arg1 < Static46.anInt4202) {
			local20 = Static46.anInt4202 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt4202;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt4201) {
			local20 = arg1 + arg3 - Static46.anInt4201;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static130.method2458(Static46.anIntArray334, this.aByteArrayArray8[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;IIIIIIIIII)I")
	private int method2472(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method2463(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt3279;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt3281 + this.anInt3287 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method2470(arg0, local20, Static130.aClass92Array22);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt3281;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt3281 + (arg4 - this.anInt3281 - this.anInt3287 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt3287 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt3281 - this.anInt3287 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt3281 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method2457(Static130.aClass92Array22[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method2457(Static130.aClass92Array22[local118], arg1 + (arg3 - this.method2462(Static130.aClass92Array22[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method2457(Static130.aClass92Array22[local118], arg1 + arg3 - this.method2462(Static130.aClass92Array22[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method2457(Static130.aClass92Array22[local118], arg1, local57);
			} else {
				this.method2459(Static130.aClass92Array22[local118], arg3);
				this.method2457(Static130.aClass92Array22[local118], arg1, local57);
				Static130.anInt3276 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vd;IIIIIIIII)I")
	public final int method2473(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method2472(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}
}
