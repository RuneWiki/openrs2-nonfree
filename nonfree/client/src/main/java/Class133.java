import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class133 {

	@OriginalMember(owner = "client!m", name = "v", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Z")
	public final boolean aBoolean282;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	protected final int anInt3952;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!kh;")
	private final Class126 aClass126_3;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!uo;")
	private final Class233 aClass233_4;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	public final int anInt3960;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "I")
	protected final int anInt3969;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIZLclient!kh;Lclient!uo;)V")
	protected Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class126 arg4, @OriginalArg(5) Class233 arg5) {
		this.aBoolean282 = arg3;
		this.anInt3952 = arg1;
		this.aClass126_3 = arg4;
		this.aClass233_4 = arg5;
		this.anInt3960 = arg0;
		this.anInt3969 = arg2;
		this.aByteArrayArrayArray11 = new byte[this.anInt3960][this.anInt3952][this.anInt3969];
		this.aByteArrayArrayArray9 = new byte[this.anInt3960][this.anInt3952][this.anInt3969];
		this.aByteArrayArrayArray12 = new byte[this.anInt3960][this.anInt3952][this.anInt3969];
		this.aByteArrayArrayArray14 = new byte[this.anInt3960][this.anInt3952 + 1][this.anInt3969 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt3960][this.anInt3952][this.anInt3969];
		this.anIntArrayArrayArray7 = new int[this.anInt3960][this.anInt3952 + 1][this.anInt3969 + 1];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIBI)V")
	public final void method3457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3960; local11++) {
			this.method3462(arg1, 64, 64, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!oj;[[[I[Lclient!pe;)V")
	public final void method3459(@OriginalArg(1) Class48 arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class178[] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean282) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt3952; local10++) {
					for (local14 = 0; local14 < this.anInt3969; local14++) {
						if ((Static329.aByteArrayArrayArray17[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static329.aByteArrayArrayArray17[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg2[local28].method4473(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt3960; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean282) {
				if (Static315.aBoolean422) {
					local14 = 8;
				}
				if (Static142.aBoolean214) {
					local10 = 2;
				}
				if (Static124.anInt4241 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static230.aBoolean333) {
						local14 |= 0x10;
					}
				}
			}
			if (Static142.aBoolean214) {
				local14 |= 0x7;
			}
			@Pc(144) int[][] local144 = arg1 == null || local6 >= arg1.length ? this.anIntArrayArrayArray7[local6] : arg1[local6];
			Static242.method4282(local6, arg0.method2461(this.anInt3952, this.anInt3969, this.anIntArrayArrayArray7[local6], local144, local10, local14));
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BIII[[B[ZLclient!oj;I[[B[[BIILclient!qi;Lclient!tb;)V")
	private void method3460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) Class48 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class192 arg11, @OriginalArg(13) Class214 arg12) {
		@Pc(61) int local61;
		if (arg12 != null && arg11 != null || arg11 != null && arg9 == 12 || arg12 != null && arg9 == 0) {
			@Pc(42) boolean[] local42 = arg12 != null && arg12.aBoolean450 ? Static67.aBooleanArrayArray2[arg9] : Static373.aBooleanArrayArray5[arg9];
			@Pc(74) Class214 local74;
			@Pc(91) byte local91;
			@Pc(107) int local107;
			@Pc(112) int local112;
			if (arg10 > 0) {
				if (arg2 > 0) {
					local61 = arg7[arg2 - 1][arg10 - 1] & 0xFF;
					if (local61 > 0) {
						local74 = this.aClass126_3.method3296(local61 - 1);
						if (local74.anInt6106 != -1 && local74.aBoolean450) {
							local91 = arg8[arg2 - 1][arg10 - 1];
							local107 = arg3[arg2 - 1][arg10 - 1] * 2 + 4 & 0x7;
							local112 = Static99.method1732(local74, arg5);
							if (Static205.aBooleanArrayArray4[local91][local107]) {
								Static203.anIntArray299[0] = local74.anInt6106;
								Static113.anIntArray505[0] = local112;
								Static5.anIntArray14[0] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
								Static56.anIntArray448[0] = local74.anInt6101;
								Static84.anIntArray147[0] = local74.anInt6096;
								Static17.anIntArray52[0] = 256;
							}
						}
					}
				}
				if (arg2 < arg6 - 1) {
					local61 = arg7[arg2 + 1][arg10 - 1] & 0xFF;
					if (local61 > 0) {
						local74 = this.aClass126_3.method3296(local61 - 1);
						if (local74.anInt6106 != -1 && local74.aBoolean450) {
							local91 = arg8[arg2 + 1][arg10 - 1];
							local107 = arg3[arg2 + 1][arg10 - 1] * 2 + 6 & 0x7;
							local112 = Static99.method1732(local74, arg5);
							if (Static205.aBooleanArrayArray4[local91][local107]) {
								Static203.anIntArray299[2] = local74.anInt6106;
								Static113.anIntArray505[2] = local112;
								Static5.anIntArray14[2] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
								Static56.anIntArray448[2] = local74.anInt6101;
								Static84.anIntArray147[2] = local74.anInt6096;
								Static17.anIntArray52[2] = 512;
							}
						}
					}
				}
			}
			if (arg10 < arg1 - 1) {
				if (arg2 > 0) {
					local61 = arg7[arg2 - 1][arg10 + 1] & 0xFF;
					if (local61 > 0) {
						local74 = this.aClass126_3.method3296(local61 - 1);
						if (local74.anInt6106 != -1 && local74.aBoolean450) {
							local91 = arg8[arg2 - 1][arg10 + 1];
							local107 = arg3[arg2 - 1][arg10 + 1] * 2 + 2 & 0x7;
							local112 = Static99.method1732(local74, arg5);
							if (Static205.aBooleanArrayArray4[local91][local107]) {
								Static203.anIntArray299[6] = local74.anInt6106;
								Static113.anIntArray505[6] = local112;
								Static5.anIntArray14[6] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
								Static56.anIntArray448[6] = local74.anInt6101;
								Static84.anIntArray147[6] = local74.anInt6096;
								Static17.anIntArray52[6] = 64;
							}
						}
					}
				}
				if (arg2 < arg6 - 1) {
					local61 = arg7[arg2 + 1][arg10 + 1] & 0xFF;
					if (local61 > 0) {
						local74 = this.aClass126_3.method3296(local61 - 1);
						if (local74.anInt6106 != -1 && local74.aBoolean450) {
							local91 = arg8[arg2 + 1][arg10 + 1];
							local107 = arg3[arg2 + 1][arg10 + 1] * 2 & 0x7;
							local112 = Static99.method1732(local74, arg5);
							if (Static205.aBooleanArrayArray4[local91][local107]) {
								Static203.anIntArray299[4] = local74.anInt6106;
								Static113.anIntArray505[4] = local112;
								Static5.anIntArray14[4] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
								Static56.anIntArray448[4] = local74.anInt6101;
								Static84.anIntArray147[4] = local74.anInt6096;
								Static17.anIntArray52[4] = 128;
							}
						}
					}
				}
			}
			@Pc(539) int local539;
			@Pc(544) int local544;
			@Pc(546) int local546;
			@Pc(528) byte local528;
			if (arg10 > 0) {
				local61 = arg7[arg2][arg10 - 1] & 0xFF;
				if (local61 > 0) {
					local74 = this.aClass126_3.method3296(local61 - 1);
					if (local74.anInt6106 != -1) {
						local91 = arg8[arg2][arg10 - 1];
						local528 = arg3[arg2][arg10 - 1];
						if (local74.aBoolean450) {
							local112 = 2;
							local539 = local528 * 2 + 4;
							local544 = Static99.method1732(local74, arg5);
							for (local546 = 0; local546 < 3; local546++) {
								local112 &= 0x7;
								local539 &= 0x7;
								if (Static205.aBooleanArrayArray4[local91][local539] && local74.anInt6096 >= Static84.anIntArray147[local112]) {
									Static203.anIntArray299[local112] = local74.anInt6106;
									Static113.anIntArray505[local112] = local544;
									Static5.anIntArray14[local112] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
									Static56.anIntArray448[local112] = local74.anInt6101;
									if (Static84.anIntArray147[local112] == local74.anInt6096) {
										Static17.anIntArray52[local112] |= 0x20;
									} else {
										Static17.anIntArray52[local112] = 32;
									}
									Static84.anIntArray147[local112] = local74.anInt6096;
								}
								local112--;
								local539++;
							}
							if (!local42[arg0 & 0x3]) {
								arg4[0] = Static67.aBooleanArrayArray2[local91][local528 + 2 & 0x3];
							}
						} else if (!local42[--arg0 & 0x3]) {
							arg4[0] = Static373.aBooleanArrayArray5[local91][local528 + 2 & 0x3];
						}
					}
				}
			}
			if (arg1 - 1 > arg10) {
				local61 = arg7[arg2][arg10 + 1] & 0xFF;
				if (local61 > 0) {
					local74 = this.aClass126_3.method3296(local61 - 1);
					if (local74.anInt6106 != -1) {
						local91 = arg8[arg2][arg10 + 1];
						local528 = arg3[arg2][arg10 + 1];
						if (local74.aBoolean450) {
							local112 = 4;
							local539 = local528 * 2 + 2;
							local544 = Static99.method1732(local74, arg5);
							for (local546 = 0; local546 < 3; local546++) {
								local112 &= 0x7;
								local539 &= 0x7;
								if (Static205.aBooleanArrayArray4[local91][local539] && local74.anInt6096 >= Static84.anIntArray147[local112]) {
									Static203.anIntArray299[local112] = local74.anInt6106;
									Static113.anIntArray505[local112] = local544;
									Static5.anIntArray14[local112] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
									Static56.anIntArray448[local112] = local74.anInt6101;
									if (Static84.anIntArray147[local112] == local74.anInt6096) {
										Static17.anIntArray52[local112] |= 0x10;
									} else {
										Static17.anIntArray52[local112] = 16;
									}
									Static84.anIntArray147[local112] = local74.anInt6096;
								}
								local112++;
								local539--;
							}
							if (!local42[arg0 + 2 & 0x3]) {
								arg4[2] = Static67.aBooleanArrayArray2[local91][local528 & 0x3];
							}
						} else if (!local42[arg0 + 2 & 0x3]) {
							arg4[2] = Static373.aBooleanArrayArray5[local91][local528 & 0x3];
						}
					}
				}
			}
			if (arg2 > 0) {
				local61 = arg7[arg2 - 1][arg10] & 0xFF;
				if (local61 > 0) {
					local74 = this.aClass126_3.method3296(local61 - 1);
					if (local74.anInt6106 != -1) {
						local91 = arg8[arg2 - 1][arg10];
						local528 = arg3[arg2 - 1][arg10];
						if (local74.aBoolean450) {
							local112 = 6;
							local539 = local528 * 2 + 4;
							local544 = Static99.method1732(local74, arg5);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local112 &= 0x7;
								if (Static205.aBooleanArrayArray4[local91][local539] && local74.anInt6096 >= Static84.anIntArray147[local112]) {
									Static203.anIntArray299[local112] = local74.anInt6106;
									Static113.anIntArray505[local112] = local544;
									Static5.anIntArray14[local112] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
									Static56.anIntArray448[local112] = local74.anInt6101;
									if (Static84.anIntArray147[local112] == local74.anInt6096) {
										Static17.anIntArray52[local112] |= 0x8;
									} else {
										Static17.anIntArray52[local112] = 8;
									}
									Static84.anIntArray147[local112] = local74.anInt6096;
								}
								local539--;
								local112++;
							}
							if (!local42[arg0 + 3 & 0x3]) {
								arg4[3] = Static67.aBooleanArrayArray2[local91][local528 + 1 & 0x3];
							}
						} else if (!local42[arg0 + 3 & 0x3]) {
							arg4[3] = Static373.aBooleanArrayArray5[local91][local528 + 1 & 0x3];
						}
					}
				}
			}
			if (arg2 < arg6 - 1) {
				local61 = arg7[arg2 + 1][arg10] & 0xFF;
				if (local61 > 0) {
					local74 = this.aClass126_3.method3296(local61 - 1);
					if (local74.anInt6106 != -1) {
						local91 = arg8[arg2 + 1][arg10];
						local528 = arg3[arg2 + 1][arg10];
						if (local74.aBoolean450) {
							local112 = 4;
							local539 = local528 * 2 + 6;
							local544 = Static99.method1732(local74, arg5);
							for (local546 = 0; local546 < 3; local546++) {
								local112 &= 0x7;
								local539 &= 0x7;
								if (Static205.aBooleanArrayArray4[local91][local539] && local74.anInt6096 >= Static84.anIntArray147[local112]) {
									Static203.anIntArray299[local112] = local74.anInt6106;
									Static113.anIntArray505[local112] = local544;
									Static5.anIntArray14[local112] = arg5.method2453() ? local74.anInt6099 : local74.anInt6108;
									Static56.anIntArray448[local112] = local74.anInt6101;
									if (Static84.anIntArray147[local112] == local74.anInt6096) {
										Static17.anIntArray52[local112] |= 0x4;
									} else {
										Static17.anIntArray52[local112] = 4;
									}
									Static84.anIntArray147[local112] = local74.anInt6096;
								}
								local112--;
								local539++;
							}
							if (!local42[arg0 + 1 & 0x3]) {
								arg4[1] = Static67.aBooleanArrayArray2[local91][local528 + 3 & 0x3];
							}
						} else if (!local42[arg0 + 1 & 0x3]) {
							arg4[1] = Static373.aBooleanArrayArray5[local91][local528 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg12 == null) {
			return;
		}
		@Pc(1251) int local1251 = Static99.method1732(arg12, arg5);
		if (!arg12.aBoolean450) {
			return;
		}
		for (local61 = 0; local61 < 8; local61++) {
			@Pc(1267) int local1267 = local61 - arg0 * 2 & 0x7;
			if (Static205.aBooleanArrayArray4[arg9][local61] && Static84.anIntArray147[local1267] <= arg12.anInt6096) {
				Static203.anIntArray299[local1267] = arg12.anInt6106;
				Static113.anIntArray505[local1267] = local1251;
				Static5.anIntArray14[local1267] = arg5.method2453() ? arg12.anInt6099 : arg12.anInt6108;
				Static56.anIntArray448[local1267] = arg12.anInt6101;
				if (Static84.anIntArray147[local1267] == arg12.anInt6096) {
					Static17.anIntArray52[local1267] |= 0x2;
				} else {
					Static17.anIntArray52[local1267] = 2;
				}
				Static84.anIntArray147[local1267] = arg12.anInt6096;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
	public final void method3462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg1 + arg0; local3++) {
			for (local7 = arg3; local7 < arg3 + arg2; local7++) {
				if (local7 >= 0 && local7 < this.anInt3952 && local3 >= 0 && this.anInt3969 > local3) {
					this.anIntArrayArrayArray7[arg4][local7][local3] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray7[arg4 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt3952) {
			for (local7 = arg0 + 1; local7 < arg1 + arg0; local7++) {
				if (local7 >= 0 && this.anInt3969 > local7) {
					this.anIntArrayArrayArray7[arg4][arg3][local7] = this.anIntArrayArrayArray7[arg4][arg3 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && this.anInt3969 > arg0) {
			for (local7 = arg3 + 1; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && this.anInt3952 > local7) {
					this.anIntArrayArrayArray7[arg4][local7][arg0] = this.anIntArrayArrayArray7[arg4][local7][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || arg3 >= this.anInt3952 || arg0 >= this.anInt3969) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0] != 0) {
				this.anIntArrayArrayArray7[arg4][arg3][arg0] = this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray7[arg4][arg3][arg0 - 1] != 0) {
				this.anIntArrayArrayArray7[arg4][arg3][arg0] = this.anIntArrayArrayArray7[arg4][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray7[arg4][arg3][arg0] = this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0] != this.anIntArrayArrayArray7[arg4 - 1][arg3 - 1][arg0]) {
			this.anIntArrayArrayArray7[arg4][arg3][arg0] = this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray7[arg4][arg3][arg0 - 1] != this.anIntArrayArrayArray7[arg4 - 1][arg3][arg0 - 1]) {
			this.anIntArrayArrayArray7[arg4][arg3][arg0] = this.anIntArrayArrayArray7[arg4][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray7[arg4 - 1][arg3 - 1][arg0 - 1] != this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray7[arg4][arg3][arg0] = this.anIntArrayArrayArray7[arg4][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII[Lclient!pe;ILclient!vt;I)V")
	public final void method3463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class178[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub24 arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg2 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(58) int local58;
		if (!this.aBoolean282) {
			@Pc(24) Class178 local24 = arg5[arg0];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg6 + Static130.method5369(arg8, local30 & 0x7, local26 & 0x7);
					local58 = arg1 + Static344.method5499(arg8, local30 & 0x7, local26 & 0x7);
					if (local45 > 0 && this.anInt3952 - 1 > local45 && local58 > 0 && this.anInt3969 - 1 > local58) {
						local24.method4483(local45, local58);
					}
				}
			}
		}
		@Pc(102) int local102 = (arg4 & 0xFFFFFFF8) << 3;
		local26 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (arg8 == 1) {
			local112 = 1;
		} else if (arg8 == 2) {
			local112 = 1;
			local110 = 1;
		} else if (arg8 == 3) {
			local110 = 1;
		}
		for (local58 = 0; local58 < this.anInt3960; local58++) {
			for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
				for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
					if (local58 == arg3 && local11 <= local146 && local11 + 8 >= local146 && local17 <= local150 && local150 <= local17 + 8) {
						@Pc(227) int local227;
						@Pc(221) int local221;
						if (local146 == local11 + 8 || local17 + 8 == local150) {
							if (arg8 == 0) {
								local227 = arg6 + local146 - local11;
								local221 = arg1 + local150 - local17;
							} else if (arg8 == 1) {
								local221 = arg1 + local11 + 8 - local146;
								local227 = local150 + arg6 - local17;
							} else if (arg8 == 2) {
								local227 = arg6 + local11 + 8 - local146;
								local221 = local17 + arg1 + 8 - local150;
							} else {
								local227 = local17 + arg6 + 8 - local150;
								local221 = arg1 + local146 - local11;
							}
							this.method3469(local221, local102 + local146, 0, true, local227, 0, arg0, arg7, 0, local150 + local26);
						} else {
							local227 = arg6 + Static130.method5369(arg8, local150 & 0x7, local146 & 0x7);
							local221 = arg1 + Static344.method5499(arg8, local150 & 0x7, local146 & 0x7);
							this.method3469(local221, local146 + local102, arg8, false, local227, local110, arg0, arg7, local112, local150 + local26);
							if (local146 == 63 || local150 == 63) {
								@Pc(363) int local363 = local146 == 63 ? 64 : local146;
								@Pc(370) int local370 = local150 == 63 ? 64 : local150;
								@Pc(389) int local389;
								@Pc(382) int local382;
								if (arg8 == 0) {
									local382 = arg1 + local370 - local17;
									local389 = arg6 + local363 - local11;
								} else if (arg8 == 1) {
									local382 = local11 + arg1 + 8 - local363;
									local389 = arg6 + local370 - local17;
								} else if (arg8 == 2) {
									local382 = arg1 + local17 + 8 - local370;
									local389 = arg6 + local11 + 8 - local363;
								} else {
									local389 = local17 + arg6 + 8 - local370;
									local382 = arg1 + local363 - local11;
								}
								if (local389 >= 0 && local389 < this.anInt3952 && local382 >= 0 && this.anInt3969 > local382) {
									this.anIntArrayArrayArray7[arg0][local389][local382] = this.anIntArrayArrayArray7[arg0][local227 + local110][local221 + local112];
								}
							}
						}
					} else {
						this.method3469(-1, 0, 0, false, -1, 0, 0, arg7, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!oj;ILclient!mi;Lclient!mi;)V")
	public final void method3464(@OriginalArg(0) Class48 arg0, @OriginalArg(2) Class149 arg1, @OriginalArg(3) Class149 arg2) {
		if (Static108.anIntArray199 == null || Static108.anIntArray199.length != this.anInt3969) {
			Static108.anIntArray199 = new int[this.anInt3969];
			Static385.anIntArray584 = new int[this.anInt3969];
			Static326.anIntArray521 = new int[this.anInt3969];
			Static43.anIntArray408 = new int[this.anInt3969];
			Static56.anIntArray447 = new int[this.anInt3969];
		}
		@Pc(42) int[][] local42 = new int[this.anInt3952][this.anInt3969];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt3960; local44++) {
			for (local48 = 0; local48 < this.anInt3969; local48++) {
				Static108.anIntArray199[local48] = 0;
				Static56.anIntArray447[local48] = 0;
				Static385.anIntArray584[local48] = 0;
				Static43.anIntArray408[local48] = 0;
				Static326.anIntArray521[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt3952; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(85) int local85 = 0; local85 < this.anInt3969; local85++) {
					local91 = local81 + 5;
					@Pc(152) int local152;
					if (this.anInt3952 > local91) {
						local106 = this.aByteArrayArrayArray9[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class192 local116 = this.aClass233_4.method5627(local106 - 1);
							Static108.anIntArray199[local85] += local116.anInt5274;
							Static56.anIntArray447[local85] += local116.anInt5272;
							Static385.anIntArray584[local85] += local116.anInt5269;
							Static43.anIntArray408[local85] += local116.anInt5273;
							local152 = Static326.anIntArray521[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray9[local44][local106][local85] & 0xFF;
						if (local175 > 0) {
							@Pc(187) Class192 local187 = this.aClass233_4.method5627(local175 - 1);
							Static108.anIntArray199[local85] -= local187.anInt5274;
							Static56.anIntArray447[local85] -= local187.anInt5272;
							Static385.anIntArray584[local85] -= local187.anInt5269;
							Static43.anIntArray408[local85] -= local187.anInt5273;
							local152 = Static326.anIntArray521[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt3969; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (this.anInt3969 > local254) {
							local91 += Static108.anIntArray199[local254];
							local244 += Static43.anIntArray408[local254];
							local106 += Static56.anIntArray447[local254];
							local175 += Static385.anIntArray584[local254];
							local246 += Static326.anIntArray521[local254];
						}
						@Pc(292) int local292 = local248 - 5;
						if (local292 >= 0) {
							local175 -= Static385.anIntArray584[local292];
							local246 -= Static326.anIntArray521[local292];
							local91 -= Static108.anIntArray199[local292];
							local244 -= Static43.anIntArray408[local292];
							local106 -= Static56.anIntArray447[local292];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local42[local81][local248] = Static64.method1179(local175 / local246, local91 * 256 / local244, local106 / local246);
						}
					}
				}
			}
			if (Static318.aBoolean427) {
				this.method3466(local44, arg0, local44 == 0 ? arg1 : null, Static128.aClass149Array1[local44], local44 == 0 ? arg2 : null, local42);
			} else {
				this.method3467(local44 == 0 ? arg1 : null, arg0, local44, Static128.aClass149Array1[local44], local42, local44 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray9[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
		}
		if (!this.aBoolean282) {
			if (Static124.anInt4241 != 0) {
				Static113.method5099();
			}
			if (Static142.aBoolean214) {
				Static344.method5496();
			}
		}
		for (local48 = 0; local48 < this.anInt3960; local48++) {
			Static128.aClass149Array1[local48].method5836();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB[[I)V")
	public final void method3465(@OriginalArg(2) int[][] arg0) {
		@Pc(16) int[][] local16 = this.anIntArrayArrayArray7[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3952 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt3969 + 1; local22++) {
				local16[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!oj;Lclient!mi;ILclient!mi;Lclient!mi;[[I)V")
	private void method3466(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(4) Class149 arg3, @OriginalArg(5) Class149 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray10[arg0];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray12[arg0];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray9[arg0];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray11[arg0];
		for (@Pc(35) int local35 = 0; local35 < this.anInt3952; local35++) {
			@Pc(53) int local53 = this.anInt3952 - 1 <= local35 ? local35 : local35 + 1;
			for (@Pc(55) int local55 = 0; local55 < this.anInt3969; local55++) {
				@Pc(73) int local73 = local55 >= this.anInt3969 - 1 ? local55 : local55 + 1;
				if (Static7.anInt158 == -1 || Static310.method5037(local55, local35, arg0, Static7.anInt158)) {
					@Pc(87) boolean local87 = false;
					@Pc(89) boolean local89 = false;
					@Pc(92) boolean[] local92 = new boolean[4];
					@Pc(98) int local98 = local10[local35][local55];
					@Pc(104) int local104 = local23[local35][local55];
					@Pc(112) int local112 = local33[local35][local55] & 0xFF;
					@Pc(120) int local120 = local28[local35][local55] & 0xFF;
					@Pc(128) int local128 = local28[local35][local73] & 0xFF;
					@Pc(136) int local136 = local28[local53][local73] & 0xFF;
					@Pc(144) int local144 = local28[local53][local55] & 0xFF;
					if (local112 != 0 || local120 != 0) {
						@Pc(166) Class214 local166 = local112 == 0 ? null : this.aClass126_3.method3296(local112 - 1);
						if (local98 == 0 && local166 == null) {
							local98 = 12;
						}
						@Pc(187) Class192 local187 = local120 == 0 ? null : this.aClass233_4.method5627(local120 - 1);
						@Pc(189) Class214 local189 = local166;
						if (local166 != null) {
							if (local166.anInt6106 == -1 && local166.anInt6104 == -1) {
								local189 = local166;
								local166 = null;
							} else if (local187 != null && local98 != 0) {
								local89 = local166.aBoolean450;
							}
						}
						@Pc(258) int local258;
						@Pc(311) int local311;
						@Pc(380) int local380;
						@Pc(393) int local393;
						if ((local98 == 0 || local98 == 12) && local35 > 0 && local55 > 0 && this.anInt3952 > local35 && this.anInt3969 > local55) {
							local258 = local120 == local28[local35 - 1][local55 - 1] ? 1 : -1;
							@Pc(279) int local279 = local28[local53][local55 - 1] == local120 ? 1 : -1;
							@Pc(292) int local292 = local28[local53][local73] == local120 ? 1 : -1;
							local311 = local28[local35 - 1][local73] == local120 ? 1 : -1;
							if (local28[local35][local55 - 1] == local120) {
								local258++;
								local279++;
							} else {
								local279--;
								local258--;
							}
							if (local120 == local28[local53][local55]) {
								local279++;
								local292++;
							} else {
								local279--;
								local292--;
							}
							if (local28[local35][local73] == local120) {
								local292++;
								local311++;
							} else {
								local292--;
								local311--;
							}
							if (local120 == local28[local35 - 1][local55]) {
								local258++;
								local311++;
							} else {
								local258--;
								local311--;
							}
							local380 = local258 - local292;
							if (local380 < 0) {
								local380 = -local380;
							}
							local393 = local279 - local311;
							if (local393 < 0) {
								local393 = -local393;
							}
							if (local380 == local393) {
								local380 = arg3.method5837(local35, local55) - arg3.method5837(local53, local73);
								local393 = arg3.method5837(local53, local55) - arg3.method5837(local35, local73);
								if (local380 < 0) {
									local380 = -local380;
								}
								if (local393 < 0) {
									local393 = -local393;
								}
							}
							local104 = local380 < local393 ? 1 : 0;
						}
						for (local258 = 0; local258 < 13; local258++) {
							Static84.anIntArray147[local258] = -1;
							Static17.anIntArray52[local258] = 1;
						}
						@Pc(476) boolean[] local476 = local166 != null && local166.aBoolean450 ? Static67.aBooleanArrayArray2[local98] : Static373.aBooleanArrayArray5[local98];
						this.method3460(local104, this.anInt3969, local35, local23, local92, arg1, this.anInt3952, local33, local10, local98, local55, local187, local166);
						@Pc(509) boolean local509 = local166 != null && local166.anInt6104 != local166.anInt6106;
						if (!local509) {
							for (local311 = 0; local311 < 8; local311++) {
								if (Static84.anIntArray147[local311] >= 0 && Static113.anIntArray505[local311] != Static203.anIntArray299[local311]) {
									local509 = true;
									break;
								}
							}
						}
						if (!local476[local104 + 1 & 0x3]) {
							local92[1] = Static358.method5630(local92[1], (Static17.anIntArray52[4] & Static17.anIntArray52[2]) == 0);
						}
						if (!local476[local104 + 3 & 0x3]) {
							local92[3] = Static358.method5630(local92[3], (Static17.anIntArray52[6] & Static17.anIntArray52[0]) == 0);
						}
						if (!local476[local104 & 0x3]) {
							local92[0] = Static358.method5630(local92[0], (Static17.anIntArray52[0] & Static17.anIntArray52[2]) == 0);
						}
						if (!local476[local104 + 2 & 0x3]) {
							local92[2] = Static358.method5630(local92[2], (Static17.anIntArray52[4] & Static17.anIntArray52[6]) == 0);
						}
						if (!local89 && (local98 == 0 || local98 == 12)) {
							if (local92[0] && !local92[1] && !local92[2] && local92[3]) {
								local92[0] = local92[3] = false;
								local98 = local98 == 0 ? 13 : 14;
								local104 = 0;
							} else if (local92[0] && local92[1] && !local92[2] && !local92[3]) {
								local92[0] = local92[1] = false;
								local98 = local98 == 0 ? 13 : 14;
								local104 = 3;
							} else if (!local92[0] && local92[1] && local92[2] && !local92[3]) {
								local92[1] = local92[2] = false;
								local98 = local98 == 0 ? 13 : 14;
								local104 = 2;
							} else if (!local92[0] && !local92[1] && local92[2] && local92[3]) {
								local92[2] = local92[3] = false;
								local104 = 1;
								local98 = local98 == 0 ? 13 : 14;
							}
						}
						@Pc(823) boolean local823 = !local89 && !local92[0] && !local92[2] && !local92[1] && !local92[3];
						@Pc(825) int[] local825 = null;
						@Pc(837) int[] local837;
						@Pc(853) int[] local853;
						@Pc(833) int[] local833;
						if (local823) {
							local380 = local187 == null ? 0 : Static129.anIntArray213[local98];
							local833 = Static127.anIntArrayArray13[local98];
							local837 = Static283.anIntArrayArray39[local98];
							local853 = Static10.anIntArrayArray58[local98];
							local393 = local166 == null ? 0 : Static271.anIntArray414[local98];
						} else if (local89) {
							local825 = Static313.anIntArrayArray49[local98];
							local833 = Static308.anIntArrayArray48[local98];
							local393 = local166 == null ? 0 : Static9.anIntArray21[local98];
							local380 = local187 == null ? 0 : Static27.anIntArray216[local98];
							local853 = Static329.anIntArrayArray54[local98];
							local837 = Static274.anIntArrayArray38[local98];
						} else {
							local833 = Static238.anIntArrayArray32[local98];
							local837 = Static307.anIntArrayArray47[local98];
							local393 = local166 == null ? 0 : Static318.anIntArray510[local98];
							local825 = Static121.anIntArrayArray63[local98];
							local853 = Static72.anIntArrayArray6[local98];
							local380 = local187 == null ? 0 : Static154.anIntArray251[local98];
						}
						@Pc(928) int local928 = local393 + local380;
						if (local928 <= 0) {
							Static323.method5216(arg0, local35, local55);
						} else {
							if (local92[0]) {
								local928++;
							}
							if (local92[2]) {
								local928++;
							}
							if (local92[1]) {
								local928++;
							}
							if (local92[3]) {
								local928++;
							}
							@Pc(961) int local961 = 0;
							@Pc(963) int local963 = 0;
							@Pc(967) int local967 = local928 * 3;
							@Pc(974) int[] local974 = local509 ? new int[local967] : null;
							@Pc(977) int[] local977 = new int[local967];
							@Pc(980) int[] local980 = new int[local967];
							@Pc(983) int[] local983 = new int[local967];
							@Pc(986) int[] local986 = new int[local967];
							@Pc(989) int[] local989 = new int[local967];
							@Pc(996) int[] local996 = arg2 == null ? null : new int[local967];
							@Pc(1005) int[] local1005 = arg2 == null && arg4 == null ? null : new int[local967];
							@Pc(1007) int local1007 = -1;
							@Pc(1009) int local1009 = -1;
							@Pc(1011) int local1011 = 256;
							@Pc(1131) byte local1131;
							@Pc(1061) int local1061;
							@Pc(1063) int local1063;
							@Pc(1294) int local1294;
							@Pc(1300) int local1300;
							@Pc(1309) int local1309;
							@Pc(1313) int local1313;
							@Pc(1326) int local1326;
							@Pc(1317) int local1317;
							@Pc(1324) int local1324;
							@Pc(1381) int local1381;
							@Pc(1387) int local1387;
							if (local166 != null) {
								local1007 = local166.anInt6106;
								local1009 = arg1.method2453() ? local166.anInt6099 : local166.anInt6108;
								local1011 = local166.anInt6101;
								local1061 = Static99.method1732(local166, arg1);
								for (local1063 = 0; local1063 < local393; local1063++) {
									if (local92[-local104 & 0x3] && local825[0] == local961) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 1;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 1;
										Static236.anIntArray389[4] = local853[local961];
										Static236.anIntArray389[5] = local833[local961];
										local1131 = 6;
									} else if (local92[2 - local104 & 0x3] && local961 == local825[2]) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 5;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 5;
										Static236.anIntArray389[4] = local853[local961];
										Static236.anIntArray389[5] = local833[local961];
										local1131 = 6;
									} else if (local92[1 - local104 & 0x3] && local825[1] == local961) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 3;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 3;
										Static236.anIntArray389[4] = local853[local961];
										local1131 = 6;
										Static236.anIntArray389[5] = local833[local961];
									} else if (local92[3 - local104 & 0x3] && local961 == local825[3]) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 7;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 7;
										Static236.anIntArray389[4] = local853[local961];
										local1131 = 6;
										Static236.anIntArray389[5] = local833[local961];
									} else {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = local853[local961];
										Static236.anIntArray389[2] = local833[local961];
										local1131 = 3;
									}
									for (local1294 = 0; local1294 < local1131; local1294++) {
										local1300 = Static236.anIntArray389[local1294];
										local1309 = local1300 - local104 * 2 & 0x7;
										local1313 = Static253.anIntArray399[local1300];
										local1317 = Static358.anIntArray558[local1300];
										if (local104 == 1) {
											local1324 = 128 - local1313;
											local1326 = local1317;
										} else if (local104 == 2) {
											local1324 = 128 - local1317;
											local1326 = 128 - local1313;
										} else if (local104 == 3) {
											local1326 = 128 - local1317;
											local1324 = local1313;
										} else {
											local1324 = local1317;
											local1326 = local1313;
										}
										local977[local963] = local1326;
										local980[local963] = local1324;
										if (local996 != null && Static205.aBooleanArrayArray4[local98][local1300]) {
											local1381 = (local35 << 7) + local1326;
											local1387 = (local55 << 7) + local1324;
											local996[local963] = arg2.method5839(local1381, local1387) - arg3.method5839(local1381, local1387);
										}
										if (local1005 != null) {
											if (arg2 != null && !Static205.aBooleanArrayArray4[local98][local1300]) {
												local1381 = local1326 + (local35 << 7);
												local1387 = local1324 + (local55 << 7);
												local1005[local963] = arg3.method5839(local1381, local1387) - arg2.method5839(local1381, local1387);
											} else if (arg4 != null && !Static387.aBooleanArrayArray6[local98][local1300]) {
												local1381 = (local35 << 7) + local1326;
												local1387 = local1324 + (local55 << 7);
												local1005[local963] = arg4.method5839(local1381, local1387) - arg3.method5839(local1381, local1387);
											}
										}
										if (local1300 < 8 && Static84.anIntArray147[local1309] > local166.anInt6096) {
											if (local974 != null) {
												local974[local963] = Static113.anIntArray505[local1309];
											}
											local989[local963] = Static56.anIntArray448[local1309];
											local986[local963] = Static5.anIntArray14[local1309];
											local983[local963] = Static203.anIntArray299[local1309];
										} else {
											if (local974 != null) {
												local974[local963] = local1061;
											}
											local986[local963] = arg1.method2453() ? local166.anInt6099 : local166.anInt6108;
											local989[local963] = local166.anInt6101;
											local983[local963] = local1007;
										}
										local963++;
									}
									local961++;
								}
								if (!this.aBoolean282 && arg0 == 0) {
									Static384.method6010(local35, local55, local166.anInt6097, local166.anInt6098 * 8, local166.anInt6111);
								}
								if (local98 != 12 && local166.anInt6106 != -1 && local166.aBoolean448) {
									local87 = true;
								}
							} else if (local823) {
								local961 = Static271.anIntArray414[local98];
							} else if (local89) {
								local961 = Static9.anIntArray21[local98];
							} else {
								local961 = Static318.anIntArray510[local98];
							}
							if (local187 != null) {
								if (local144 == 0) {
									local144 = local120;
								}
								if (local128 == 0) {
									local128 = local120;
								}
								if (local136 == 0) {
									local136 = local120;
								}
								@Pc(1602) Class192 local1602 = this.aClass233_4.method5627(local120 - 1);
								@Pc(1610) Class192 local1610 = this.aClass233_4.method5627(local128 - 1);
								@Pc(1618) Class192 local1618 = this.aClass233_4.method5627(local136 - 1);
								@Pc(1626) Class192 local1626 = this.aClass233_4.method5627(local144 - 1);
								for (local1309 = 0; local1309 < local380; local1309++) {
									if (local92[-local104 & 0x3] && local961 == local825[0]) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 1;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 1;
										Static236.anIntArray389[4] = local853[local961];
										Static236.anIntArray389[5] = local833[local961];
										local1131 = 6;
									} else if (local92[2 - local104 & 0x3] && local961 == local825[2]) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 5;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 5;
										Static236.anIntArray389[4] = local853[local961];
										local1131 = 6;
										Static236.anIntArray389[5] = local833[local961];
									} else if (local92[1 - local104 & 0x3] && local825[1] == local961) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 3;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 3;
										Static236.anIntArray389[4] = local853[local961];
										local1131 = 6;
										Static236.anIntArray389[5] = local833[local961];
									} else if (local92[3 - local104 & 0x3] && local961 == local825[3]) {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = 7;
										Static236.anIntArray389[2] = local833[local961];
										Static236.anIntArray389[3] = 7;
										Static236.anIntArray389[4] = local853[local961];
										Static236.anIntArray389[5] = local833[local961];
										local1131 = 6;
									} else {
										Static236.anIntArray389[0] = local837[local961];
										Static236.anIntArray389[1] = local853[local961];
										local1131 = 3;
										Static236.anIntArray389[2] = local833[local961];
									}
									for (local1313 = 0; local1313 < local1131; local1313++) {
										local1326 = Static236.anIntArray389[local1313];
										local1317 = local1326 - local104 * 2 & 0x7;
										local1324 = Static253.anIntArray399[local1326];
										local1387 = Static358.anIntArray558[local1326];
										@Pc(1891) int local1891;
										if (local104 == 1) {
											local1891 = 128 - local1324;
											local1381 = local1387;
										} else if (local104 == 2) {
											local1381 = 128 - local1324;
											local1891 = 128 - local1387;
										} else if (local104 == 3) {
											local1381 = 128 - local1387;
											local1891 = local1324;
										} else {
											local1381 = local1324;
											local1891 = local1387;
										}
										local977[local963] = local1381;
										local980[local963] = local1891;
										@Pc(1950) int local1950;
										@Pc(1957) int local1957;
										if (local996 != null && Static205.aBooleanArrayArray4[local98][local1326]) {
											local1950 = (local35 << 7) + local1381;
											local1957 = (local55 << 7) + local1891;
											local996[local963] = arg2.method5839(local1950, local1957) - arg3.method5839(local1950, local1957);
										}
										if (local1005 != null) {
											if (arg2 != null && !Static205.aBooleanArrayArray4[local98][local1326]) {
												local1950 = (local35 << 7) + local1381;
												local1957 = local1891 + (local55 << 7);
												local1005[local963] = arg3.method5839(local1950, local1957) - arg2.method5839(local1950, local1957);
											} else if (arg4 != null && !Static387.aBooleanArrayArray6[local98][local1326]) {
												local1950 = local1381 + (local35 << 7);
												local1957 = local1891 + (local55 << 7);
												local1005[local963] = arg4.method5839(local1950, local1957) - arg3.method5839(local1950, local1957);
											}
										}
										if (local1326 < 8 && Static84.anIntArray147[local1317] >= 0) {
											if (local974 != null) {
												local974[local963] = Static113.anIntArray505[local1317];
											}
											local989[local963] = Static56.anIntArray448[local1317];
											local986[local963] = Static5.anIntArray14[local1317];
											local983[local963] = Static203.anIntArray299[local1317];
										} else {
											if (local89 && Static205.aBooleanArrayArray4[local98][local1326]) {
												local986[local963] = local1009;
												local989[local963] = local1011;
												local983[local963] = local1007;
											} else if (local1381 == 0 && local1891 == 0) {
												local983[local963] = arg5[local35][local55];
												local986[local963] = local1602.anInt5270;
												local989[local963] = local1602.anInt5275;
											} else if (local1381 == 0 && local1891 == 128) {
												local983[local963] = arg5[local35][local73];
												local986[local963] = local1610.anInt5270;
												local989[local963] = local1610.anInt5275;
											} else if (local1381 == 128 && local1891 == 128) {
												local983[local963] = arg5[local53][local73];
												local986[local963] = local1618.anInt5270;
												local989[local963] = local1618.anInt5275;
											} else if (local1381 == 128 && local1891 == 0) {
												local983[local963] = arg5[local53][local55];
												local986[local963] = local1626.anInt5270;
												local989[local963] = local1626.anInt5275;
											} else {
												if (local1381 >= 64) {
													if (local1891 >= 64) {
														local986[local963] = local1618.anInt5270;
														local989[local963] = local1618.anInt5275;
													} else {
														local986[local963] = local1626.anInt5270;
														local989[local963] = local1626.anInt5275;
													}
												} else if (local1891 < 64) {
													local986[local963] = local1602.anInt5270;
													local989[local963] = local1602.anInt5275;
												} else {
													local986[local963] = local1610.anInt5270;
													local989[local963] = local1610.anInt5275;
												}
												local1950 = Static78.method1354(local1381 << 7 >> 7, arg5[local53][local55], arg5[local35][local55]);
												local1957 = Static78.method1354(local1381 << 7 >> 7, arg5[local53][local73], arg5[local35][local73]);
												local983[local963] = Static78.method1354(local1891 << 7 >> 7, local1957, local1950);
											}
											if (local974 != null) {
												local974[local963] = local983[local963];
											}
										}
										local963++;
									}
									local961++;
								}
								if (local98 != 0 && local187.aBoolean387) {
									local87 = true;
								}
							}
							local1061 = arg3.method5837(local35, local55);
							local1063 = arg3.method5837(local53, local55);
							local1294 = arg3.method5837(local53, local73);
							local1300 = arg3.method5837(local35, local73);
							if (arg0 > 0) {
								@Pc(2372) boolean local2372 = true;
								if (local120 == 0 && local98 != 0) {
									local2372 = false;
								}
								if (local112 > 0 && local189 != null && !local189.aBoolean449) {
									local2372 = false;
								}
								if (local2372 && local1061 == local1063 && local1061 == local1294 && local1300 == local1061) {
									this.aByteArrayArrayArray14[arg0][local35][local55] = (byte) (this.aByteArrayArrayArray14[arg0][local35][local55] | 0x4);
								}
							}
							local1309 = 0;
							local1313 = 0;
							local1326 = 0;
							if (this.aBoolean282) {
								local1309 = Static32.method364(local35, local55);
								local1313 = Static195.method3549(local35, local55);
								local1326 = Static256.method4418(local35, local55);
							}
							arg3.method5842(local35, local55, local977, local996, local980, local1005, local983, local974, local986, local989, local1309, local1313, local1326, local87);
							Static323.method5216(arg0, local35, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!mi;Lclient!oj;ILclient!mi;[[IILclient!mi;)V")
	private void method3467(@OriginalArg(0) Class149 arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) Class149 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3952; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt3969; local11++) {
				if (Static7.anInt158 == -1 || Static310.method5037(local11, local7, arg2, Static7.anInt158)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray10[arg2][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray12[arg2][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray11[arg2][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray9[arg2][local7][local11] & 0xFF;
					@Pc(78) Class214 local78 = local55 == 0 ? null : this.aClass126_3.method3296(local55 - 1);
					@Pc(90) Class192 local90 = local66 == 0 ? null : this.aClass233_4.method5627(local66 - 1);
					@Pc(92) int local92 = 0;
					@Pc(94) int local94 = 0;
					if (local35 != 0) {
						local94 = local78 == null ? 0 : Static271.anIntArray414[local35];
						local92 = local90 == null ? 0 : Static129.anIntArray213[local35];
					} else if (local78 != null) {
						local94 = Static271.anIntArray414[local35];
					} else if (local90 != null) {
						local92 = Static271.anIntArray414[local35];
					}
					@Pc(132) int local132 = local92 + local94;
					@Pc(134) int local134 = 0;
					if (local132 != 0) {
						@Pc(142) int[] local142 = new int[local132];
						@Pc(145) int[] local145 = new int[local132];
						@Pc(148) int[] local148 = new int[local132];
						@Pc(151) int[] local151 = new int[local132];
						@Pc(153) boolean local153 = false;
						@Pc(170) int local170;
						@Pc(198) int local198;
						if (local78 == null || local78.anInt6106 == -1 && local78.anInt6104 == -1 && local78.anInt6099 == -1) {
							for (local170 = 0; local170 < local94; local170++) {
								local142[local134] = -1;
								local134++;
							}
						} else {
							local170 = arg1.method2453() ? local78.anInt6099 : local78.anInt6108;
							if (Static385.aBoolean496) {
								local170 = -1;
							}
							for (local198 = 0; local198 < local94; local198++) {
								local148[local134] = local170;
								local151[local134] = local78.anInt6101;
								if (local78.anInt6106 == -1) {
									local142[local134] = -1;
								} else {
									local142[local134] = local78.anInt6106;
								}
								if (local78.anInt6104 == -1) {
									local145[local134] = -1;
								} else {
									local145[local134] = local78.anInt6104;
									local153 = true;
								}
								local134++;
							}
							if (!this.aBoolean282 && arg2 == 0) {
								Static384.method6010(local7, local11, local78.anInt6097, local78.anInt6098 * 8, local78.anInt6111);
							}
						}
						if (!local153) {
							local145 = null;
						}
						if (local90 == null) {
							for (local170 = 0; local170 < local92; local170++) {
								local142[local134] = -1;
								local134++;
							}
						} else {
							local170 = local90.anInt5270;
							if (Static385.aBoolean496) {
								local170 = -1;
							}
							for (local198 = 0; local198 < local92; local198++) {
								local148[local134] = local170;
								local151[local134] = local90.anInt5275;
								local142[local134] = arg4[local7][local11];
								if (local145 != null) {
									local145[local134] = -1;
								}
								local134++;
							}
						}
						local170 = Static253.anIntArray399.length;
						@Pc(338) int[] local338 = new int[local170];
						@Pc(341) int[] local341 = new int[local170];
						@Pc(348) int[] local348 = arg0 == null ? null : new int[local170];
						@Pc(357) int[] local357 = arg0 == null && arg5 == null ? null : new int[local170];
						@Pc(365) int local365;
						@Pc(369) int local369;
						@Pc(449) int local449;
						@Pc(455) int local455;
						for (@Pc(359) int local359 = 0; local359 < local170; local359++) {
							local365 = Static253.anIntArray399[local359];
							local369 = Static358.anIntArray558[local359];
							if (local44 == 0) {
								local338[local359] = local365;
								local341[local359] = local369;
							} else if (local44 == 1) {
								local338[local359] = local369;
								local341[local359] = 128 - local365;
							} else if (local44 == 2) {
								local338[local359] = 128 - local365;
								local341[local359] = 128 - local369;
							} else if (local44 == 3) {
								local338[local359] = 128 - local369;
								local341[local359] = local365;
							}
							if (local348 != null && Static205.aBooleanArrayArray4[local35][local359]) {
								local449 = (local7 << 7) + local365;
								local455 = local365 + (local11 << 7);
								local348[local359] = arg0.method5839(local449, local455) - arg3.method5839(local449, local455);
							}
							if (local357 != null) {
								if (arg0 != null && !Static205.aBooleanArrayArray4[local35][local359]) {
									local449 = local365 + (local7 << 7);
									local455 = local365 + (local11 << 7);
									local357[local359] = arg3.method5839(local449, local455) - arg0.method5839(local449, local455);
								} else if (arg5 != null && !Static387.aBooleanArrayArray6[local35][local359]) {
									local449 = local365 + (local7 << 7);
									local455 = (local11 << 7) + local365;
									local357[local359] = arg5.method5839(local449, local455) - arg3.method5839(local449, local455);
								}
							}
						}
						local365 = arg3.method5837(local7, local11);
						local369 = arg3.method5837(local7 + 1, local11);
						local449 = arg3.method5837(local7 + 1, local11 + 1);
						local455 = arg3.method5837(local7, local11 + 1);
						if (arg2 > 0) {
							@Pc(577) boolean local577 = true;
							if (local66 == 0 && local35 != 0) {
								local577 = false;
							}
							if (local55 > 0 && local78 != null && !local78.aBoolean449) {
								local577 = false;
							}
							if (local577 && local369 == local365 && local449 == local365 && local365 == local455) {
								this.aByteArrayArrayArray14[arg2][local7][local11] = (byte) (this.aByteArrayArrayArray14[arg2][local7][local11] | 0x4);
							}
						}
						@Pc(635) int local635 = 0;
						@Pc(637) int local637 = 0;
						@Pc(639) int local639 = 0;
						if (this.aBoolean282) {
							local635 = Static32.method364(local7, local11);
							local637 = Static195.method3549(local7, local11);
							local639 = Static256.method4418(local7, local11);
						}
						arg3.method5845(local7, local11, local338, local348, local341, local357, Static283.anIntArrayArray39[local35], Static10.anIntArrayArray58[local35], Static127.anIntArrayArray13[local35], local142, local145, local148, local151, local635, local637, local639);
						Static323.method5216(arg2, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[Lclient!pe;IIILclient!vt;)V")
	public final void method3468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub24 arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean282) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class178 local12 = arg2[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg0 + local14;
						@Pc(29) int local29 = local18 + arg4;
						if (local25 >= 0 && this.anInt3952 > local25 && local29 >= 0 && local29 < this.anInt3969) {
							local12.method4483(local25, local29);
						}
					}
				}
			}
		}
		local6 = arg3 + arg0;
		@Pc(88) int local88 = arg4 + arg1;
		for (local14 = 0; local14 < this.anInt3960; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method3469(local25 + arg4, local6 + local18, 0, false, arg0 + local18, 0, local14, arg5, 0, local25 + local88);
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZIZIILclient!vt;II)V")
	private void method3469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub24 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg8 = 1;
		} else if (arg2 == 2) {
			arg5 = 1;
			arg8 = 1;
		} else if (arg2 == 3) {
			arg5 = 1;
		}
		@Pc(65) int local65;
		if (arg4 < 0 || this.anInt3952 <= arg4 || arg0 < 0 || this.anInt3969 <= arg0) {
			while (true) {
				local65 = arg7.method5732();
				if (local65 == 0) {
					return;
				}
				if (local65 == 1) {
					arg7.method5732();
					return;
				}
				if (local65 <= 49) {
					arg7.method5732();
				}
			}
			return;
		}
		if (!this.aBoolean282 && !arg3) {
			Static329.aByteArrayArrayArray17[arg6][arg4][arg0] = 0;
		}
		while (true) {
			local65 = arg7.method5732();
			if (local65 == 0) {
				if (this.aBoolean282) {
					this.anIntArrayArrayArray7[0][arg5 + arg4][arg8 + arg0] = 0;
					return;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray7[0][arg5 + arg4][arg8 + arg0] = -Static262.method4492(arg1 + 932731, arg9 + 556238) * 8;
					return;
				} else {
					this.anIntArrayArrayArray7[arg6][arg5 + arg4][arg0 + arg8] = this.anIntArrayArrayArray7[arg6 - 1][arg4 + arg5][arg8 + arg0] - 240;
					return;
				}
			}
			if (local65 == 1) {
				@Pc(197) int local197 = arg7.method5732();
				if (this.aBoolean282) {
					this.anIntArrayArrayArray7[0][arg5 + arg4][arg8 + arg0] = local197 * 8;
					return;
				}
				if (local197 == 1) {
					local197 = 0;
				}
				if (arg6 == 0) {
					this.anIntArrayArrayArray7[0][arg4 + arg5][arg0 + arg8] = -local197 * 8;
					return;
				}
				this.anIntArrayArrayArray7[arg6][arg4 + arg5][arg8 + arg0] = this.anIntArrayArrayArray7[arg6 - 1][arg5 + arg4][arg8 + arg0] - local197 * 8;
				return;
			}
			if (local65 <= 49) {
				if (arg3) {
					arg7.method5732();
				} else {
					this.aByteArrayArrayArray11[arg6][arg4][arg0] = arg7.method5759();
					this.aByteArrayArrayArray10[arg6][arg4][arg0] = (byte) ((local65 - 2) / 4);
					this.aByteArrayArrayArray12[arg6][arg4][arg0] = (byte) (local65 + arg2 - 2 & 0x3);
				}
			} else if (local65 <= 81) {
				if (!this.aBoolean282 && !arg3) {
					Static329.aByteArrayArrayArray17[arg6][arg4][arg0] = (byte) (local65 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray9[arg6][arg4][arg0] = (byte) (local65 - 81);
			}
		}
	}
}
