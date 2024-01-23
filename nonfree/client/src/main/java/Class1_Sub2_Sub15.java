import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public abstract class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "[Lclient!pg;")
	private Class64[] aClass64Array8;

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
	public int anInt4481 = 0;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!pe", name = "ib", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
	private int anInt4482;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
	private int anInt4480;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class1_Sub2_Sub15(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray362 = arg1;
		this.anIntArray365 = arg2;
		this.anIntArray364 = arg3;
		this.anIntArray361 = arg4;
		this.method3332(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray365[local25] < local21 && this.anIntArray361[local25] != 0) {
				local21 = this.anIntArray365[local25];
			}
			if (this.anIntArray365[local25] + this.anIntArray361[local25] > local23) {
				local23 = this.anIntArray365[local25] + this.anIntArray361[local25];
			}
		}
		this.anInt4482 = this.anInt4481 - local21;
		this.anInt4480 = local23 - this.anInt4481;
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) byte[] arg0) {
		this.method3332(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
	private int method3325(@OriginalArg(0) int arg0) {
		return this.anIntArray363[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;IIII)V")
	public final void method3327(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3347(arg3, arg4);
			this.method3345(arg0, arg1 - this.method3350(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;I)V")
	private void method3328(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method3095(); local5++) {
			@Pc(11) int local11 = arg0.method3086(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static164.anInt4486 = (arg1 - this.method3350(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!sc;IIII)V")
	public final void method3330(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3347(arg3, arg4);
			this.method3345(arg0, arg1 - this.method3350(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Lclient!sc;IIII)V")
	public final void method3331(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3347(arg3, arg4);
			this.method3345(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([B)V")
	private void method3332(@OriginalArg(0) byte[] arg0) {
		this.anIntArray363 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray363.length; local9++) {
				this.anIntArray363[local9] = arg0[local9] & 0xFF;
			}
			this.anInt4481 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray363[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray62 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray62[(local182 << 8) + local150] = (byte) Static164.method3339(local93, local136, local58, this.anIntArray363, local55, local182, local150);
					}
				}
			}
		}
		this.anInt4481 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;IIIII)V")
	public final void method3333(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3347(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt4186];
		@Pc(14) int[] local14 = new int[arg0.anInt4186];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt4186; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3341(arg0, arg1 - this.method3350(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method3334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;IIIIIIIII)I")
	public final int method3335(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method3336(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;IIIIIIIIII)I")
	public final int method3336(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method3346(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt4481;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt4482 + this.anInt4480 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method3348(arg0, local20, Static164.aClass107Array27);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt4482;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt4482 + (arg4 - this.anInt4482 - this.anInt4480 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt4480 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt4482 - this.anInt4480 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt4482 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method3345(Static164.aClass107Array27[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method3345(Static164.aClass107Array27[local118], arg1 + (arg3 - this.method3350(Static164.aClass107Array27[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method3345(Static164.aClass107Array27[local118], arg1 + arg3 - this.method3350(Static164.aClass107Array27[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method3345(Static164.aClass107Array27[local118], arg1, local57);
			} else {
				this.method3328(Static164.aClass107Array27[local118], arg3);
				this.method3345(Static164.aClass107Array27[local118], arg1, local57);
				Static164.anInt4486 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!sc;I)I")
	public final int method3337(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		return this.method3348(arg0, new int[] { arg1 }, Static164.aClass107Array27);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!pg;[I)V")
	public final void method3338(@OriginalArg(0) Class64[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass64Array8 = arg0;
		this.anIntArray366 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;IIIILjava/util/Random;I)I")
	public final int method3340(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method3346(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt4186];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt4186; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method3341(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;II[I[I)V")
	private void method3341(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt4481;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt4186; local12++) {
			@Pc(20) int local20 = arg0.aByteArray55[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class107 local40 = arg0.method3104(local6 + 1, local12);
					local6 = -1;
					if (local40.method3071(Static164.aClass107_1210)) {
						local20 = 60;
					} else if (local40.method3071(Static164.aClass107_1204)) {
						local20 = 62;
					} else if (local40.method3071(Static164.aClass107_1208)) {
						local20 = 160;
					} else if (local40.method3071(Static164.aClass107_1215)) {
						local20 = 173;
					} else if (local40.method3071(Static164.aClass107_1193)) {
						local20 = 215;
					} else if (local40.method3071(Static164.aClass107_1213)) {
						local20 = 128;
					} else if (local40.method3071(Static164.aClass107_1200)) {
						local20 = 169;
					} else {
						if (!local40.method3071(Static164.aClass107_1214)) {
							if (local40.method3099(Static164.aClass107_1201)) {
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
									local137 = local40.method3084(4).method3103();
									@Pc(142) Class64 local142 = this.aClass64Array8[local137];
									@Pc(153) int local153 = this.anIntArray366 == null ? local142.anInt2360 : this.anIntArray366[local137];
									if (Static164.anInt4485 == 256) {
										local142.method1870(arg1 + local117, local4 + this.anInt4481 - local153 + local126);
									} else {
										local142.method1871(arg1 + local117, local4 + this.anInt4481 - local153 + local126, Static164.anInt4485);
									}
									arg1 += local142.anInt2365;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method3344(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray62 != null && local8 != -1) {
						arg1 += this.aByteArray62[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray364[local20];
					local117 = this.anIntArray361[local20];
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
						if (Static164.anInt4486 > 0) {
							Static164.anInt4487 += Static164.anInt4486;
							arg1 += Static164.anInt4487 >> 8;
							Static164.anInt4487 &= 0xFF;
						}
					} else if (Static164.anInt4485 == 256) {
						if (Static164.anInt4489 != -1) {
							this.method3334(local20, arg1 + this.anIntArray362[local20] + local126 + 1, local4 + this.anIntArray365[local20] + 1 + local137, local223, local117, Static164.anInt4489);
						}
						this.method3334(local20, arg1 + this.anIntArray362[local20] + local126, local4 + this.anIntArray365[local20] + local137, local223, local117, Static164.anInt4483);
					} else {
						if (Static164.anInt4489 != -1) {
							this.method3326(local20, arg1 + this.anIntArray362[local20] + local126 + 1, local4 + this.anIntArray365[local20] + 1 + local137, local223, local117, Static164.anInt4489, Static164.anInt4485);
						}
						this.method3326(local20, arg1 + this.anIntArray362[local20] + local126, local4 + this.anIntArray365[local20] + local137, local223, local117, Static164.anInt4483, Static164.anInt4485);
					}
					@Pc(384) int local384 = this.anIntArray363[local20];
					if (Static164.anInt4488 != -1) {
						Static205.method3261(arg1, local4 + (int) ((double) this.anInt4481 * 0.7D), local384, Static164.anInt4488);
					}
					if (Static164.anInt4490 != -1) {
						Static205.method3261(arg1, local4 + this.anInt4481, local384, Static164.anInt4490);
					}
					arg1 += local384;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!sc;IIIII)V")
	public final void method3342(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3347(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt4186];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt4186; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3341(arg0, arg1 - this.method3350(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;IIIIII)V")
	public final void method3343(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3347(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt4186];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt4186; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method3341(arg0, arg1 - this.method3350(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!sc;)V")
	private void method3344(@OriginalArg(0) Class107 arg0) {
		try {
			if (arg0.method3099(Static164.aClass107_1205)) {
				Static164.anInt4483 = arg0.method3084(4).method3112(16);
				return;
			}
			if (arg0.method3071(Static164.aClass107_1202)) {
				Static164.anInt4483 = Static164.anInt4491;
				return;
			}
			if (arg0.method3099(Static164.aClass107_1195)) {
				Static164.anInt4485 = arg0.method3084(6).method3103();
				return;
			}
			if (arg0.method3071(Static164.aClass107_1199)) {
				Static164.anInt4485 = Static164.anInt4492;
				return;
			}
			if (arg0.method3099(Static164.aClass107_1212)) {
				Static164.anInt4488 = arg0.method3084(4).method3112(16);
				return;
			}
			if (arg0.method3071(Static164.aClass107_1194)) {
				Static164.anInt4488 = 8388608;
				return;
			}
			if (arg0.method3071(Static164.aClass107_1211)) {
				Static164.anInt4488 = -1;
				return;
			}
			if (arg0.method3099(Static164.aClass107_1206)) {
				Static164.anInt4490 = arg0.method3084(2).method3112(16);
				return;
			}
			if (arg0.method3071(Static164.aClass107_1203)) {
				Static164.anInt4490 = 0;
				return;
			}
			if (arg0.method3071(Static164.aClass107_1209)) {
				Static164.anInt4490 = -1;
				return;
			}
			if (arg0.method3099(Static164.aClass107_1198)) {
				Static164.anInt4489 = arg0.method3084(5).method3112(16);
				return;
			}
			if (arg0.method3071(Static164.aClass107_1216)) {
				Static164.anInt4489 = 0;
				return;
			}
			if (arg0.method3071(Static164.aClass107_1207)) {
				Static164.anInt4489 = Static164.anInt4484;
				return;
			}
			if (arg0.method3071(Static164.aClass107_1197)) {
				this.method3346(Static164.anInt4491, Static164.anInt4484, Static164.anInt4492);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;II)V")
	private void method3345(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt4481;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt4186; local10++) {
			@Pc(18) int local18 = arg0.aByteArray55[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class107 local38 = arg0.method3104(local6 + 1, local10);
					local6 = -1;
					if (local38.method3071(Static164.aClass107_1210)) {
						local18 = 60;
					} else if (local38.method3071(Static164.aClass107_1204)) {
						local18 = 62;
					} else if (local38.method3071(Static164.aClass107_1208)) {
						local18 = 160;
					} else if (local38.method3071(Static164.aClass107_1215)) {
						local18 = 173;
					} else if (local38.method3071(Static164.aClass107_1193)) {
						local18 = 215;
					} else if (local38.method3071(Static164.aClass107_1213)) {
						local18 = 128;
					} else if (local38.method3071(Static164.aClass107_1200)) {
						local18 = 169;
					} else {
						if (!local38.method3071(Static164.aClass107_1214)) {
							if (local38.method3099(Static164.aClass107_1201)) {
								try {
									local116 = local38.method3084(4).method3103();
									@Pc(121) Class64 local121 = this.aClass64Array8[local116];
									@Pc(132) int local132 = this.anIntArray366 == null ? local121.anInt2360 : this.anIntArray366[local116];
									if (Static164.anInt4485 == 256) {
										local121.method1870(arg1, local4 + this.anInt4481 - local132);
									} else {
										local121.method1871(arg1, local4 + this.anInt4481 - local132, Static164.anInt4485);
									}
									arg1 += local121.anInt2365;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method3344(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray62 != null && local8 != -1) {
						arg1 += this.aByteArray62[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray364[local18];
					local116 = this.anIntArray361[local18];
					if (local18 == 32) {
						if (Static164.anInt4486 > 0) {
							Static164.anInt4487 += Static164.anInt4486;
							arg1 += Static164.anInt4487 >> 8;
							Static164.anInt4487 &= 0xFF;
						}
					} else if (Static164.anInt4485 == 256) {
						if (Static164.anInt4489 != -1) {
							this.method3334(local18, arg1 + this.anIntArray362[local18] + 1, local4 + this.anIntArray365[local18] + 1, local194, local116, Static164.anInt4489);
						}
						this.method3334(local18, arg1 + this.anIntArray362[local18], local4 + this.anIntArray365[local18], local194, local116, Static164.anInt4483);
					} else {
						if (Static164.anInt4489 != -1) {
							this.method3326(local18, arg1 + this.anIntArray362[local18] + 1, local4 + this.anIntArray365[local18] + 1, local194, local116, Static164.anInt4489, Static164.anInt4485);
						}
						this.method3326(local18, arg1 + this.anIntArray362[local18], local4 + this.anIntArray365[local18], local194, local116, Static164.anInt4483, Static164.anInt4485);
					}
					@Pc(320) int local320 = this.anIntArray363[local18];
					if (Static164.anInt4488 != -1) {
						Static205.method3261(arg1, local4 + (int) ((double) this.anInt4481 * 0.7D), local320, Static164.anInt4488);
					}
					if (Static164.anInt4490 != -1) {
						Static205.method3261(arg1, local4 + this.anInt4481 + 1, local320, Static164.anInt4490);
					}
					arg1 += local320;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	private void method3346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static164.anInt4488 = -1;
		Static164.anInt4490 = -1;
		Static164.anInt4484 = arg1;
		Static164.anInt4489 = arg1;
		Static164.anInt4491 = arg0;
		Static164.anInt4483 = arg0;
		Static164.anInt4492 = arg2;
		Static164.anInt4485 = arg2;
		Static164.anInt4486 = 0;
		Static164.anInt4487 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
	private void method3347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static164.anInt4488 = -1;
		Static164.anInt4490 = -1;
		Static164.anInt4484 = arg1;
		Static164.anInt4489 = arg1;
		Static164.anInt4491 = arg0;
		Static164.anInt4483 = arg0;
		Static164.anInt4492 = 256;
		Static164.anInt4485 = 256;
		Static164.anInt4486 = 0;
		Static164.anInt4487 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sc;[I[Lclient!sc;)I")
	public final int method3348(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class107[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static164.aClass107_1196.method3080();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method3095();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method3086(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class107 local55 = arg0.method3104(local19 + 1, local29);
					local19 = -1;
					Static164.aClass107_1196.method3094(60);
					Static164.aClass107_1196.method3108(local55);
					Static164.aClass107_1196.method3094(62);
					if (local55.method3071(Static164.aClass107_1197)) {
						if (arg2[local23] == null) {
							arg2[local23] = Static164.aClass107_1196.method3104(local11, Static164.aClass107_1196.method3095());
						} else {
							arg2[local23].method3080();
							arg2[local23] = arg2[local23].method3114(local11, Static164.aClass107_1196, Static164.aClass107_1196.method3095());
						}
						local23++;
						local11 = Static164.aClass107_1196.method3095();
						local9 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method3071(Static164.aClass107_1210)) {
						local9 += this.method3325(60);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method3071(Static164.aClass107_1204)) {
						local9 += this.method3325(62);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method3071(Static164.aClass107_1208)) {
						local9 += this.method3325(160);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method3071(Static164.aClass107_1215)) {
						local9 += this.method3325(173);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method3071(Static164.aClass107_1193)) {
						local9 += this.method3325(215);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method3071(Static164.aClass107_1213)) {
						local9 += this.method3325(128);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method3071(Static164.aClass107_1200)) {
						local9 += this.method3325(169);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method3071(Static164.aClass107_1214)) {
						local9 += this.method3325(174);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method3099(Static164.aClass107_1201)) {
						try {
							@Pc(383) int local383 = local55.method3084(4).method3103();
							local9 += this.aClass64Array8[local383].anInt2365;
							local21 = -1;
						} catch (@Pc(395) Exception local395) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						Static164.aClass107_1196.method3094(local35);
						local9 += this.method3325(local35);
						if (this.aByteArray62 != null && local21 != -1) {
							local9 += this.aByteArray62[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = Static164.aClass107_1196.method3095();
						local15 = local9;
						local17 = 1;
					}
					if (arg1 != null && local9 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						if (arg2[local23] == null) {
							arg2[local23] = Static164.aClass107_1196.method3104(local11, local13 - local17);
						} else {
							arg2[local23].method3080();
							arg2[local23] = arg2[local23].method3114(local11, Static164.aClass107_1196, local13 - local17);
						}
						local23++;
						local11 = local13;
						local13 = -1;
						local9 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = Static164.aClass107_1196.method3095();
						local15 = local9;
						local17 = 0;
					}
				}
			}
		}
		if (Static164.aClass107_1196.method3095() > local11) {
			if (arg2[local23] == null) {
				arg2[local23] = Static164.aClass107_1196.method3104(local11, Static164.aClass107_1196.method3095());
			} else {
				arg2[local23].method3080();
				arg2[local23] = arg2[local23].method3114(local11, Static164.aClass107_1196, Static164.aClass107_1196.method3095());
			}
			local23++;
		}
		return local23;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Lclient!sc;I)I")
	public final int method3349(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method3348(arg0, new int[] { arg1 }, Static164.aClass107Array27);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method3350(Static164.aClass107Array27[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Lclient!sc;)I")
	public final int method3350(@OriginalArg(0) Class107 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt4186; local11++) {
			@Pc(19) int local19 = arg0.aByteArray55[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class107 local39 = arg0.method3104(local5 + 1, local11);
					local5 = -1;
					if (local39.method3071(Static164.aClass107_1210)) {
						local19 = 60;
					} else if (local39.method3071(Static164.aClass107_1204)) {
						local19 = 62;
					} else if (local39.method3071(Static164.aClass107_1208)) {
						local19 = 160;
					} else if (local39.method3071(Static164.aClass107_1215)) {
						local19 = 173;
					} else if (local39.method3071(Static164.aClass107_1193)) {
						local19 = 215;
					} else if (local39.method3071(Static164.aClass107_1213)) {
						local19 = 128;
					} else if (local39.method3071(Static164.aClass107_1200)) {
						local19 = 169;
					} else {
						if (!local39.method3071(Static164.aClass107_1214)) {
							if (local39.method3099(Static164.aClass107_1201)) {
								try {
									@Pc(117) int local117 = local39.method3084(4).method3103();
									local9 += this.aClass64Array8[local117].anInt2365;
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
					local9 += this.anIntArray363[local19];
					if (this.aByteArray62 != null && local7 != -1) {
						local9 += this.aByteArray62[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}
}
