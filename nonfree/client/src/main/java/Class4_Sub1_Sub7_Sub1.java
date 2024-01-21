import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public abstract class Class4_Sub1_Sub7_Sub1 extends Class4_Sub1_Sub7 {

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "[Lclient!sc;")
	private Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array5;

	@OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
	public int anInt1206 = 0;

	@OriginalMember(owner = "client!qb", name = "xb", descriptor = "[[B")
	protected byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
	private int anInt1203;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	private int anInt1199;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class4_Sub1_Sub7_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray107 = arg1;
		this.anIntArray106 = arg2;
		this.anIntArray109 = arg3;
		this.anIntArray111 = arg4;
		this.method899(arg0);
		this.aByteArrayArray4 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray106[local32] < local28 && this.anIntArray111[local32] != 0) {
				local28 = this.anIntArray106[local32];
			}
			if (this.anIntArray106[local32] + this.anIntArray111[local32] > local30) {
				local30 = this.anIntArray106[local32] + this.anIntArray111[local32];
			}
		}
		this.anInt1203 = this.anInt1206 - local28;
		this.anInt1199 = local30 - this.anInt1206;
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub7_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method899(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIIILjava/util/Random;I)I")
	public final int method883(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method889(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2141];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2141; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method892(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)I")
	private int method884(@OriginalArg(0) int arg0) {
		return this.anIntArray108[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIIIIIIII)I")
	public final int method885(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method897(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;)V")
	private void method887(@OriginalArg(0) Class46 arg0) {
		try {
			if (arg0.method1673(Static138.aClass46_453)) {
				Static138.anInt1197 = arg0.method1650(4).method1661(16);
				return;
			}
			if (arg0.method1668(Static138.aClass46_447)) {
				Static138.anInt1197 = Static138.anInt1195;
				return;
			}
			if (arg0.method1673(Static138.aClass46_460)) {
				Static138.anInt1200 = arg0.method1650(6).method1658();
				return;
			}
			if (arg0.method1668(Static138.aClass46_459)) {
				Static138.anInt1200 = Static138.anInt1205;
				return;
			}
			if (arg0.method1673(Static138.aClass46_450)) {
				Static138.anInt1207 = arg0.method1650(4).method1661(16);
				return;
			}
			if (arg0.method1668(Static138.aClass46_458)) {
				Static138.anInt1207 = 8388608;
				return;
			}
			if (arg0.method1668(Static138.aClass46_446)) {
				Static138.anInt1207 = -1;
				return;
			}
			if (arg0.method1673(Static138.aClass46_443)) {
				Static138.anInt1196 = arg0.method1650(2).method1661(16);
				return;
			}
			if (arg0.method1668(Static138.aClass46_445)) {
				Static138.anInt1196 = 0;
				return;
			}
			if (arg0.method1668(Static138.aClass46_457)) {
				Static138.anInt1196 = -1;
				return;
			}
			if (arg0.method1673(Static138.aClass46_448)) {
				Static138.anInt1201 = arg0.method1650(5).method1661(16);
				return;
			}
			if (arg0.method1668(Static138.aClass46_441)) {
				Static138.anInt1201 = 0;
				return;
			}
			if (arg0.method1668(Static138.aClass46_449)) {
				Static138.anInt1201 = Static138.anInt1202;
				return;
			}
			if (arg0.method1668(Static138.aClass46_452)) {
				this.method889(Static138.anInt1195, Static138.anInt1202, Static138.anInt1205);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	private void method889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static138.anInt1207 = -1;
		Static138.anInt1196 = -1;
		Static138.anInt1202 = arg1;
		Static138.anInt1201 = arg1;
		Static138.anInt1195 = arg0;
		Static138.anInt1197 = arg0;
		Static138.anInt1205 = arg2;
		Static138.anInt1200 = arg2;
		Static138.anInt1198 = 0;
		Static138.anInt1204 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIII)V")
	public final void method890(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method894(arg3, arg4);
			this.method909(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;II[I[I)V")
	private void method892(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1206;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2141; local12++) {
			@Pc(20) int local20 = arg0.aByteArray20[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class46 local40 = arg0.method1666(local12, local6 + 1);
					local6 = -1;
					if (local40.method1668(Static138.aClass46_461)) {
						local20 = 60;
					} else if (local40.method1668(Static138.aClass46_455)) {
						local20 = 62;
					} else if (local40.method1668(Static138.aClass46_444)) {
						local20 = 160;
					} else if (local40.method1668(Static138.aClass46_463)) {
						local20 = 173;
					} else if (local40.method1668(Static138.aClass46_451)) {
						local20 = 215;
					} else if (local40.method1668(Static138.aClass46_456)) {
						local20 = 128;
					} else if (local40.method1668(Static138.aClass46_442)) {
						local20 = 169;
					} else {
						if (!local40.method1668(Static138.aClass46_454)) {
							if (local40.method1673(Static138.aClass46_462)) {
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
									local137 = local40.method1650(4).method1658();
									@Pc(142) Class4_Sub1_Sub7_Sub3 local142 = this.aClass4_Sub1_Sub7_Sub3Array5[local137];
									@Pc(153) int local153 = this.anIntArray110 == null ? local142.anInt3486 : this.anIntArray110[local137];
									if (Static138.anInt1200 == 256) {
										local142.method2642(arg1 + local117, local4 + this.anInt1206 - local153 + local126);
									} else {
										local142.method2643(arg1 + local117, local4 + this.anInt1206 - local153 + local126, Static138.anInt1200);
									}
									arg1 += local142.anInt3483;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method887(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray5 != null && local8 != -1) {
						arg1 += this.aByteArray5[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray109[local20];
					local117 = this.anIntArray111[local20];
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
						if (Static138.anInt1198 > 0) {
							Static138.anInt1204 += Static138.anInt1198;
							arg1 += Static138.anInt1204 >> 8;
							Static138.anInt1204 &= 0xFF;
						}
					} else if (Static138.anInt1200 == 256) {
						if (Static138.anInt1201 != -1) {
							this.method911(local20, arg1 + this.anIntArray107[local20] + local126 + 1, local4 + this.anIntArray106[local20] + 1 + local137, local223, local117, Static138.anInt1201);
						}
						this.method908(local20, arg1 + this.anIntArray107[local20] + local126, local4 + this.anIntArray106[local20] + local137, local223, local117, Static138.anInt1197);
					} else {
						if (Static138.anInt1201 != -1) {
							this.method893(local20, arg1 + this.anIntArray107[local20] + local126 + 1, local4 + this.anIntArray106[local20] + 1 + local137, local223, local117, Static138.anInt1201, Static138.anInt1200);
						}
						this.method912(local20, arg1 + this.anIntArray107[local20] + local126, local4 + this.anIntArray106[local20] + local137, local223, local117, Static138.anInt1197, Static138.anInt1200);
					}
					@Pc(380) int local380 = this.anIntArray108[local20];
					if (Static138.anInt1207 != -1) {
						Static145.method2935(arg1, local4 + (int) ((double) this.anInt1206 * 0.7D), local380, Static138.anInt1207);
					}
					if (Static138.anInt1196 != -1) {
						Static145.method2935(arg1, local4 + this.anInt1206, local380, Static138.anInt1196);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIII)V")
	private void method893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static145.anInt3841;
		@Pc(9) int local9 = Static145.anInt3841 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static145.anInt3836) {
			local20 = Static145.anInt3836 - arg2;
			arg4 -= local20;
			arg2 = Static145.anInt3836;
			local13 = local20 * arg3;
			local5 += local20 * Static145.anInt3841;
		}
		if (arg2 + arg4 > Static145.anInt3840) {
			arg4 -= arg2 + arg4 - Static145.anInt3840;
		}
		if (arg1 < Static145.anInt3837) {
			local20 = Static145.anInt3837 - arg1;
			arg3 -= local20;
			arg1 = Static145.anInt3837;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static145.anInt3839) {
			local20 = arg1 + arg3 - Static145.anInt3839;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static138.method902(Static145.anIntArray411, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	private void method894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static138.anInt1207 = -1;
		Static138.anInt1196 = -1;
		Static138.anInt1202 = arg1;
		Static138.anInt1201 = arg1;
		Static138.anInt1195 = arg0;
		Static138.anInt1197 = arg0;
		Static138.anInt1205 = 256;
		Static138.anInt1200 = 256;
		Static138.anInt1198 = 0;
		Static138.anInt1204 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIIIII)V")
	public final void method895(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method894(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2141];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2141; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method892(arg0, arg1 - this.method903(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIIIIIIIII)I")
	private int method897(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method889(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1206;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1203 + this.anInt1199 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method901(arg0, local20, Static138.aClass46Array9);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1203;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1203 + (arg4 - this.anInt1203 - this.anInt1199 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1199 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1203 - this.anInt1199 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1203 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method909(Static138.aClass46Array9[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method909(Static138.aClass46Array9[local118], arg1 + (arg3 - this.method903(Static138.aClass46Array9[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method909(Static138.aClass46Array9[local118], arg1 + arg3 - this.method903(Static138.aClass46Array9[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method909(Static138.aClass46Array9[local118], arg1, local57);
			} else {
				this.method904(Static138.aClass46Array9[local118], arg3);
				this.method909(Static138.aClass46Array9[local118], arg1, local57);
				Static138.anInt1198 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!jd;IIII)V")
	public final void method898(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method894(arg3, arg4);
			this.method909(arg0, arg1 - this.method903(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([B)V")
	private void method899(@OriginalArg(0) byte[] arg0) {
		this.anIntArray108 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray108.length; local9++) {
				this.anIntArray108[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1206 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray108[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray5 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray5[(local182 << 8) + local150] = (byte) Static138.method888(local93, local136, local58, this.anIntArray108, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1206 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;I)I")
	public final int method900(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.method901(arg0, new int[] { arg1 }, Static138.aClass46Array9);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;[I[Lclient!jd;)I")
	private int method901(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class46[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class46 local11 = Static166.method2761(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1677();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1672(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class46 local55 = arg0.method1666(local29, local19 + 1);
					local19 = -1;
					local11.method1643(60);
					local11.method1642(local55);
					local11.method1643(62);
					if (local55.method1668(Static138.aClass46_452)) {
						arg2[local23++] = local11.method1666(local11.method1677(), local7);
						local7 = local11.method1677();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1668(Static138.aClass46_461)) {
						local5 += this.method884(60);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1668(Static138.aClass46_455)) {
						local5 += this.method884(62);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1668(Static138.aClass46_444)) {
						local5 += this.method884(160);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1668(Static138.aClass46_463)) {
						local5 += this.method884(173);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1668(Static138.aClass46_451)) {
						local5 += this.method884(215);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1668(Static138.aClass46_456)) {
						local5 += this.method884(128);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1668(Static138.aClass46_442)) {
						local5 += this.method884(169);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1668(Static138.aClass46_454)) {
						local5 += this.method884(174);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1673(Static138.aClass46_462)) {
						try {
							@Pc(359) int local359 = local55.method1650(4).method1658();
							local5 += this.aClass4_Sub1_Sub7_Sub3Array5[local359].anInt3483;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1643(local35);
						local5 += this.method884(local35);
						if (this.aByteArray5 != null && local21 != -1) {
							local5 += this.aByteArray5[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1677();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1666(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1677();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1677() > local7) {
			arg2[local23++] = local11.method1666(local11.method1677(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Lclient!jd;)I")
	public final int method903(@OriginalArg(0) Class46 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2141; local11++) {
			@Pc(19) int local19 = arg0.aByteArray20[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class46 local39 = arg0.method1666(local11, local5 + 1);
					local5 = -1;
					if (local39.method1668(Static138.aClass46_461)) {
						local19 = 60;
					} else if (local39.method1668(Static138.aClass46_455)) {
						local19 = 62;
					} else if (local39.method1668(Static138.aClass46_444)) {
						local19 = 160;
					} else if (local39.method1668(Static138.aClass46_463)) {
						local19 = 173;
					} else if (local39.method1668(Static138.aClass46_451)) {
						local19 = 215;
					} else if (local39.method1668(Static138.aClass46_456)) {
						local19 = 128;
					} else if (local39.method1668(Static138.aClass46_442)) {
						local19 = 169;
					} else {
						if (!local39.method1668(Static138.aClass46_454)) {
							if (local39.method1673(Static138.aClass46_462)) {
								try {
									@Pc(117) int local117 = local39.method1650(4).method1658();
									local9 += this.aClass4_Sub1_Sub7_Sub3Array5[local117].anInt3483;
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
					local9 += this.anIntArray108[local19];
					if (this.aByteArray5 != null && local7 != -1) {
						local9 += this.aByteArray5[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!jd;I)V")
	private void method904(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1677(); local5++) {
			@Pc(11) int local11 = arg0.method1672(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static138.anInt1198 = (arg1 - this.method903(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Lclient!jd;I)I")
	public final int method905(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method901(arg0, new int[] { arg1 }, Static138.aClass46Array9);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method903(Static138.aClass46Array9[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Lclient!jd;IIII)V")
	public final void method906(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method894(arg3, arg4);
			this.method909(arg0, arg1 - this.method903(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIIII)V")
	public final void method907(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method894(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2141];
		@Pc(14) int[] local14 = new int[arg0.anInt2141];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2141; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method892(arg0, arg1 - this.method903(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;II)V")
	private void method909(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1206;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2141; local10++) {
			@Pc(18) int local18 = arg0.aByteArray20[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class46 local38 = arg0.method1666(local10, local6 + 1);
					local6 = -1;
					if (local38.method1668(Static138.aClass46_461)) {
						local18 = 60;
					} else if (local38.method1668(Static138.aClass46_455)) {
						local18 = 62;
					} else if (local38.method1668(Static138.aClass46_444)) {
						local18 = 160;
					} else if (local38.method1668(Static138.aClass46_463)) {
						local18 = 173;
					} else if (local38.method1668(Static138.aClass46_451)) {
						local18 = 215;
					} else if (local38.method1668(Static138.aClass46_456)) {
						local18 = 128;
					} else if (local38.method1668(Static138.aClass46_442)) {
						local18 = 169;
					} else {
						if (!local38.method1668(Static138.aClass46_454)) {
							if (local38.method1673(Static138.aClass46_462)) {
								try {
									local116 = local38.method1650(4).method1658();
									@Pc(121) Class4_Sub1_Sub7_Sub3 local121 = this.aClass4_Sub1_Sub7_Sub3Array5[local116];
									@Pc(132) int local132 = this.anIntArray110 == null ? local121.anInt3486 : this.anIntArray110[local116];
									if (Static138.anInt1200 == 256) {
										local121.method2642(arg1, local4 + this.anInt1206 - local132);
									} else {
										local121.method2643(arg1, local4 + this.anInt1206 - local132, Static138.anInt1200);
									}
									arg1 += local121.anInt3483;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method887(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray5 != null && local8 != -1) {
						arg1 += this.aByteArray5[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray109[local18];
					local116 = this.anIntArray111[local18];
					if (local18 == 32) {
						if (Static138.anInt1198 > 0) {
							Static138.anInt1204 += Static138.anInt1198;
							arg1 += Static138.anInt1204 >> 8;
							Static138.anInt1204 &= 0xFF;
						}
					} else if (Static138.anInt1200 == 256) {
						if (Static138.anInt1201 != -1) {
							this.method911(local18, arg1 + this.anIntArray107[local18] + 1, local4 + this.anIntArray106[local18] + 1, local194, local116, Static138.anInt1201);
						}
						this.method908(local18, arg1 + this.anIntArray107[local18], local4 + this.anIntArray106[local18], local194, local116, Static138.anInt1197);
					} else {
						if (Static138.anInt1201 != -1) {
							this.method893(local18, arg1 + this.anIntArray107[local18] + 1, local4 + this.anIntArray106[local18] + 1, local194, local116, Static138.anInt1201, Static138.anInt1200);
						}
						this.method912(local18, arg1 + this.anIntArray107[local18], local4 + this.anIntArray106[local18], local194, local116, Static138.anInt1197, Static138.anInt1200);
					}
					@Pc(316) int local316 = this.anIntArray108[local18];
					if (Static138.anInt1207 != -1) {
						Static145.method2935(arg1, local4 + (int) ((double) this.anInt1206 * 0.7D), local316, Static138.anInt1207);
					}
					if (Static138.anInt1196 != -1) {
						Static145.method2935(arg1, local4 + this.anInt1206 + 1, local316, Static138.anInt1196);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!sc;[I)V")
	public final void method910(@OriginalArg(0) Class4_Sub1_Sub7_Sub3[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass4_Sub1_Sub7_Sub3Array5 = arg0;
		this.anIntArray110 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(IIIIII)V")
	private void method911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static145.anInt3841;
		@Pc(9) int local9 = Static145.anInt3841 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static145.anInt3836) {
			local20 = Static145.anInt3836 - arg2;
			arg4 -= local20;
			arg2 = Static145.anInt3836;
			local13 = local20 * arg3;
			local5 += local20 * Static145.anInt3841;
		}
		if (arg2 + arg4 > Static145.anInt3840) {
			arg4 -= arg2 + arg4 - Static145.anInt3840;
		}
		if (arg1 < Static145.anInt3837) {
			local20 = Static145.anInt3837 - arg1;
			arg3 -= local20;
			arg1 = Static145.anInt3837;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static145.anInt3839) {
			local20 = arg1 + arg3 - Static145.anInt3839;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static138.method886(Static145.anIntArray411, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!jd;IIIII)V")
	public final void method913(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method894(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2141];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2141; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method892(arg0, arg1 - this.method903(arg0) / 2, arg2, null, local10);
	}
}
