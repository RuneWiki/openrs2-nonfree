import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public class Class100 {

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "[I")
	private final int[] anIntArray169 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "[I")
	private final int[] anIntArray168 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!gia", name = "p", descriptor = "Lclient!lk;")
	private final Class217 aClass217_4;

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "Z")
	public final boolean aBoolean182;

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
	protected final int anInt2549;

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "Lclient!ib;")
	private final Class160 aClass160_5;

	@OriginalMember(owner = "client!gia", name = "B", descriptor = "I")
	protected final int anInt2556;

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "I")
	public final int anInt2544;

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!gia", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!gia", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!gia", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(IIIZLclient!lk;Lclient!ib;)V")
	protected Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class217 arg4, @OriginalArg(5) Class160 arg5) {
		this.aClass217_4 = arg4;
		this.aBoolean182 = arg3;
		this.anInt2549 = arg2;
		this.aClass160_5 = arg5;
		this.anInt2556 = arg1;
		this.anInt2544 = arg0;
		this.aByteArrayArrayArray11 = new byte[this.anInt2544][this.anInt2556][this.anInt2549];
		this.aByteArrayArrayArray14 = new byte[this.anInt2544][this.anInt2556][this.anInt2549];
		this.aByteArrayArrayArray12 = new byte[this.anInt2544][this.anInt2556][this.anInt2549];
		this.aByteArrayArrayArray13 = new byte[this.anInt2544][this.anInt2556 + 1][this.anInt2549 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt2544][this.anInt2556][this.anInt2549];
		this.anIntArrayArrayArray9 = new int[this.anInt2544][this.anInt2556 + 1][this.anInt2549 + 1];
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIZIIILclient!es;III)V")
	private void method2452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub11 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == 1) {
			arg5 = 1;
		} else if (arg6 == 2) {
			arg4 = 1;
			arg5 = 1;
		} else if (arg6 == 3) {
			arg4 = 1;
		}
		@Pc(78) int local78;
		if (arg2 < 0 || this.anInt2556 <= arg2 || arg1 < 0 || this.anInt2549 <= arg1) {
			while (true) {
				local78 = arg7.method8865();
				if (local78 == 0) {
					return;
				}
				if (local78 == 1) {
					arg7.method8865();
					return;
				}
				if (local78 <= 49) {
					arg7.method8865();
				}
			}
			return;
		}
		if (!this.aBoolean182 && !arg3) {
			Static47.aByteArrayArrayArray3[arg0][arg2][arg1] = 0;
		}
		while (true) {
			local78 = arg7.method8865();
			if (local78 == 0) {
				if (this.aBoolean182) {
					this.anIntArrayArrayArray9[0][arg4 + arg2][arg1 + arg5] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray9[0][arg4 + arg2][arg5 + arg1] = -Static57.method1303(arg8 + 556238, 932731 - -arg9) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray9[arg0][arg4 + arg2][arg5 + arg1] = this.anIntArrayArrayArray9[arg0 - 1][arg4 + arg2][arg5 + arg1] - 960;
					return;
				}
			}
			if (local78 == 1) {
				@Pc(165) int local165 = arg7.method8865();
				if (this.aBoolean182) {
					this.anIntArrayArrayArray9[0][arg4 + arg2][arg1 + arg5] = local165 * 8 << 2;
					return;
				}
				if (local165 == 1) {
					local165 = 0;
				}
				if (arg0 == 0) {
					this.anIntArrayArrayArray9[0][arg2 + arg4][arg5 + arg1] = -local165 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray9[arg0][arg4 + arg2][arg5 + arg1] = this.anIntArrayArrayArray9[arg0 - 1][arg4 + arg2][arg1 + arg5] - (local165 * 8 << 2);
				return;
			}
			if (local78 <= 49) {
				if (arg3) {
					arg7.method8865();
				} else {
					this.aByteArrayArrayArray11[arg0][arg2][arg1] = arg7.method8861();
					this.aByteArrayArrayArray14[arg0][arg2][arg1] = (byte) ((local78 - 2) / 4);
					this.aByteArrayArrayArray12[arg0][arg2][arg1] = (byte) (arg6 + local78 - 2 & 0x3);
				}
			} else if (local78 <= 81) {
				if (!this.aBoolean182 && !arg3) {
					Static47.aByteArrayArrayArray3[arg0][arg2][arg1] = (byte) (local78 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray10[arg0][arg2][arg1] = (byte) (local78 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IB[Lclient!wj;Lclient!es;III)V")
	public final void method2453(@OriginalArg(0) int arg0, @OriginalArg(2) Class389[] arg1, @OriginalArg(3) Class4_Sub11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean182) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class389 local16 = arg1[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg4 + local18;
						@Pc(33) int local33 = arg0 + local22;
						if (local28 >= 0 && this.anInt2556 > local28 && local33 >= 0 && this.anInt2549 > local33) {
							local16.method8800(local28, local33);
						}
					}
				}
			}
		}
		local10 = arg3 + arg4;
		@Pc(90) int local90 = arg0 + arg5;
		for (local18 = 0; local18 < this.anInt2544; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2452(local18, arg0 + local28, local22 + arg4, false, 0, 0, 0, arg2, local90 + local28, local10 - -local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!aj;I[[BI[[BIILclient!fw;II[Z[[BLclient!ha;I)V")
	private void method2454(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class127 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class33 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg7 != null && arg7.aBoolean229 ? Static196.aBooleanArrayArray16[arg1] : Static390.aBooleanArrayArray24[arg1];
		@Pc(46) int local46;
		@Pc(56) Class127 local56;
		@Pc(74) byte local74;
		@Pc(90) int local90;
		@Pc(95) int local95;
		if (arg8 > 0) {
			if (arg3 > 0) {
				local46 = arg2[arg3 - 1][arg8 - 1] & 0xFF;
				if (local46 > 0) {
					local56 = this.aClass217_4.method4674(local46 - 1);
					if (local56.anInt3066 != -1 && local56.aBoolean229) {
						local74 = arg4[arg3 - 1][arg8 - 1];
						local90 = arg10[arg3 - 1][arg8 - 1] * 2 + 4 & 0x7;
						local95 = Static199.method3055(local56, arg11);
						if (Static155.aBooleanArrayArray13[local74][local90]) {
							Static250.anIntArray299[0] = local56.anInt3066;
							Static311.anIntArray369[0] = local95;
							Static104.anIntArray141[0] = local56.anInt3065;
							Static388.anIntArray434[0] = local56.anInt3074;
							Static258.anIntArray306[0] = local56.anInt3071;
							Static621.anIntArray671[0] = 256;
						}
					}
				}
			}
			if (arg6 - 1 > arg3) {
				local46 = arg2[arg3 + 1][arg8 - 1] & 0xFF;
				if (local46 > 0) {
					local56 = this.aClass217_4.method4674(local46 - 1);
					if (local56.anInt3066 != -1 && local56.aBoolean229) {
						local74 = arg4[arg3 + 1][arg8 - 1];
						local90 = arg10[arg3 + 1][arg8 - 1] * 2 + 6 & 0x7;
						local95 = Static199.method3055(local56, arg11);
						if (Static155.aBooleanArrayArray13[local74][local90]) {
							Static250.anIntArray299[2] = local56.anInt3066;
							Static311.anIntArray369[2] = local95;
							Static104.anIntArray141[2] = local56.anInt3065;
							Static388.anIntArray434[2] = local56.anInt3074;
							Static258.anIntArray306[2] = local56.anInt3071;
							Static621.anIntArray671[2] = 512;
						}
					}
				}
			}
		}
		if (arg5 - 1 > arg8) {
			if (arg3 > 0) {
				local46 = arg2[arg3 - 1][arg8 + 1] & 0xFF;
				if (local46 > 0) {
					local56 = this.aClass217_4.method4674(local46 - 1);
					if (local56.anInt3066 != -1 && local56.aBoolean229) {
						local74 = arg4[arg3 - 1][arg8 + 1];
						local90 = arg10[arg3 - 1][arg8 + 1] * 2 + 2 & 0x7;
						local95 = Static199.method3055(local56, arg11);
						if (Static155.aBooleanArrayArray13[local74][local90]) {
							Static250.anIntArray299[6] = local56.anInt3066;
							Static311.anIntArray369[6] = local95;
							Static104.anIntArray141[6] = local56.anInt3065;
							Static388.anIntArray434[6] = local56.anInt3074;
							Static258.anIntArray306[6] = local56.anInt3071;
							Static621.anIntArray671[6] = 64;
						}
					}
				}
			}
			if (arg6 - 1 > arg3) {
				local46 = arg2[arg3 + 1][arg8 + 1] & 0xFF;
				if (local46 > 0) {
					local56 = this.aClass217_4.method4674(local46 - 1);
					if (local56.anInt3066 != -1 && local56.aBoolean229) {
						local74 = arg4[arg3 + 1][arg8 + 1];
						local90 = arg10[arg3 + 1][arg8 + 1] * 2 & 0x7;
						local95 = Static199.method3055(local56, arg11);
						if (Static155.aBooleanArrayArray13[local74][local90]) {
							Static250.anIntArray299[4] = local56.anInt3066;
							Static311.anIntArray369[4] = local95;
							Static104.anIntArray141[4] = local56.anInt3065;
							Static388.anIntArray434[4] = local56.anInt3074;
							Static258.anIntArray306[4] = local56.anInt3071;
							Static621.anIntArray671[4] = 128;
						}
					}
				}
			}
		}
		@Pc(507) int local507;
		@Pc(512) int local512;
		@Pc(514) int local514;
		@Pc(476) byte local476;
		if (arg8 > 0) {
			local46 = arg2[arg3][arg8 - 1] & 0xFF;
			if (local46 > 0) {
				local56 = this.aClass217_4.method4674(local46 - 1);
				if (local56.anInt3066 != -1) {
					local74 = arg4[arg3][arg8 - 1];
					local476 = arg10[arg3][arg8 - 1];
					if (local56.aBoolean229) {
						local95 = 2;
						local507 = local476 * 2 + 4;
						local512 = Static199.method3055(local56, arg11);
						for (local514 = 0; local514 < 3; local514++) {
							local507 &= 0x7;
							local95 &= 0x7;
							if (Static155.aBooleanArrayArray13[local74][local507] && local56.anInt3071 >= Static258.anIntArray306[local95]) {
								Static250.anIntArray299[local95] = local56.anInt3066;
								Static311.anIntArray369[local95] = local512;
								Static104.anIntArray141[local95] = local56.anInt3065;
								Static388.anIntArray434[local95] = local56.anInt3074;
								if (Static258.anIntArray306[local95] == local56.anInt3071) {
									Static621.anIntArray671[local95] |= 0x20;
								} else {
									Static621.anIntArray671[local95] = 32;
								}
								Static258.anIntArray306[local95] = local56.anInt3071;
							}
							local507++;
							local95--;
						}
						if (!local18[arg12 & 0x3]) {
							arg9[0] = Static196.aBooleanArrayArray16[local74][local476 + 2 & 0x3];
						}
					} else if (!local18[arg12 & 0x3]) {
						arg9[0] = Static390.aBooleanArrayArray24[local74][local476 + 2 & 0x3];
					}
				}
			}
		}
		if (arg5 - 1 > arg8) {
			local46 = arg2[arg3][arg8 + 1] & 0xFF;
			if (local46 > 0) {
				local56 = this.aClass217_4.method4674(local46 - 1);
				if (local56.anInt3066 != -1) {
					local74 = arg4[arg3][arg8 + 1];
					local476 = arg10[arg3][arg8 + 1];
					if (local56.aBoolean229) {
						local95 = 4;
						local507 = local476 * 2 + 2;
						local512 = Static199.method3055(local56, arg11);
						for (local514 = 0; local514 < 3; local514++) {
							local507 &= 0x7;
							local95 &= 0x7;
							if (Static155.aBooleanArrayArray13[local74][local507] && Static258.anIntArray306[local95] <= local56.anInt3071) {
								Static250.anIntArray299[local95] = local56.anInt3066;
								Static311.anIntArray369[local95] = local512;
								Static104.anIntArray141[local95] = local56.anInt3065;
								Static388.anIntArray434[local95] = local56.anInt3074;
								if (local56.anInt3071 == Static258.anIntArray306[local95]) {
									Static621.anIntArray671[local95] |= 0x10;
								} else {
									Static621.anIntArray671[local95] = 16;
								}
								Static258.anIntArray306[local95] = local56.anInt3071;
							}
							local507--;
							local95++;
						}
						if (!local18[arg12 + 2 & 0x3]) {
							arg9[2] = Static196.aBooleanArrayArray16[local74][local476 & 0x3];
						}
					} else if (!local18[arg12 + 2 & 0x3]) {
						arg9[2] = Static390.aBooleanArrayArray24[local74][local476 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local46 = arg2[arg3 - 1][arg8] & 0xFF;
			if (local46 > 0) {
				local56 = this.aClass217_4.method4674(local46 - 1);
				if (local56.anInt3066 != -1) {
					local74 = arg4[arg3 - 1][arg8];
					local476 = arg10[arg3 - 1][arg8];
					if (local56.aBoolean229) {
						local95 = 6;
						local507 = local476 * 2 + 4;
						local512 = Static199.method3055(local56, arg11);
						for (local514 = 0; local514 < 3; local514++) {
							local507 &= 0x7;
							local95 &= 0x7;
							if (Static155.aBooleanArrayArray13[local74][local507] && local56.anInt3071 >= Static258.anIntArray306[local95]) {
								Static250.anIntArray299[local95] = local56.anInt3066;
								Static311.anIntArray369[local95] = local512;
								Static104.anIntArray141[local95] = local56.anInt3065;
								Static388.anIntArray434[local95] = local56.anInt3074;
								if (Static258.anIntArray306[local95] == local56.anInt3071) {
									Static621.anIntArray671[local95] |= 0x8;
								} else {
									Static621.anIntArray671[local95] = 8;
								}
								Static258.anIntArray306[local95] = local56.anInt3071;
							}
							local95++;
							local507--;
						}
						if (!local18[arg12 + 3 & 0x3]) {
							arg9[3] = Static196.aBooleanArrayArray16[local74][local476 + 1 & 0x3];
						}
					} else if (!local18[arg12 + 3 & 0x3]) {
						arg9[3] = Static390.aBooleanArrayArray24[local74][local476 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg3) {
			local46 = arg2[arg3 + 1][arg8] & 0xFF;
			if (local46 > 0) {
				local56 = this.aClass217_4.method4674(local46 - 1);
				if (local56.anInt3066 != -1) {
					local74 = arg4[arg3 + 1][arg8];
					local476 = arg10[arg3 + 1][arg8];
					if (local56.aBoolean229) {
						local95 = 4;
						local507 = local476 * 2 + 6;
						local512 = Static199.method3055(local56, arg11);
						for (local514 = 0; local514 < 3; local514++) {
							local95 &= 0x7;
							local507 &= 0x7;
							if (Static155.aBooleanArrayArray13[local74][local507] && local56.anInt3071 >= Static258.anIntArray306[local95]) {
								Static250.anIntArray299[local95] = local56.anInt3066;
								Static311.anIntArray369[local95] = local512;
								Static104.anIntArray141[local95] = local56.anInt3065;
								Static388.anIntArray434[local95] = local56.anInt3074;
								if (Static258.anIntArray306[local95] == local56.anInt3071) {
									Static621.anIntArray671[local95] |= 0x4;
								} else {
									Static621.anIntArray671[local95] = 4;
								}
								Static258.anIntArray306[local95] = local56.anInt3071;
							}
							local507++;
							local95--;
						}
						if (!local18[arg12 + 1 & 0x3]) {
							arg9[1] = Static196.aBooleanArrayArray16[local74][local476 + 3 & 0x3];
						}
					} else if (!local18[arg12 + 1 & 0x3]) {
						arg9[1] = Static390.aBooleanArrayArray24[local74][local476 + 3 & 0x3];
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		local46 = Static199.method3055(arg7, arg11);
		if (!arg7.aBoolean229) {
			return;
		}
		for (@Pc(1173) int local1173 = 0; local1173 < 8; local1173++) {
			@Pc(1184) int local1184 = local1173 - arg12 * 2 & 0x7;
			if (Static155.aBooleanArrayArray13[arg1][local1173] && Static258.anIntArray306[local1184] <= arg7.anInt3071) {
				Static250.anIntArray299[local1184] = arg7.anInt3066;
				Static311.anIntArray369[local1184] = local46;
				Static104.anIntArray141[local1184] = arg7.anInt3065;
				Static388.anIntArray434[local1184] = arg7.anInt3074;
				if (arg7.anInt3071 == Static258.anIntArray306[local1184]) {
					Static621.anIntArray671[local1184] |= 0x2;
				} else {
					Static621.anIntArray671[local1184] = 2;
				}
				Static258.anIntArray306[local1184] = arg7.anInt3071;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIII[Lclient!wj;BLclient!es;)V")
	public final void method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class389[] arg7, @OriginalArg(9) Class4_Sub11 arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean182) {
			@Pc(18) Class389 local18 = arg7[arg6];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static395.method2776(local24 & 0x7, local20 & 0x7, arg5) + arg4;
					local50 = Static267.method3811(local20 & 0x7, local24 & 0x7, arg5) + arg3;
					if (local38 > 0 && this.anInt2556 - 1 > local38 && local50 > 0 && local50 < this.anInt2549 - 1) {
						local18.method8800(local38, local50);
					}
				}
			}
		}
		@Pc(91) int local91 = (arg2 & 0x7) * 8;
		@Pc(97) int local97 = (arg1 & 0x1FFFFFF8) << 3;
		local20 = (arg2 & 0xFFFFFFF8) << 3;
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		if (arg5 == 1) {
			local119 = 1;
		} else if (arg5 == 2) {
			local119 = 1;
			local117 = 1;
		} else if (arg5 == 3) {
			local117 = 1;
		}
		for (local50 = 0; local50 < this.anInt2544; local50++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (local50 == arg0 && local148 >= local11 && local148 <= local11 + 8 && local152 >= local91 && local152 <= local91 + 8) {
						@Pc(231) int local231;
						@Pc(223) int local223;
						if (local11 + 8 == local148 || local152 == local91 + 8) {
							if (arg5 == 0) {
								local231 = arg4 + local148 - local11;
								local223 = arg3 + local152 - local91;
							} else if (arg5 == 1) {
								local223 = local11 + arg3 + 8 - local148;
								local231 = arg4 + local152 - local91;
							} else if (arg5 == 2) {
								local223 = arg3 + local91 + 8 - local152;
								local231 = arg4 + local11 + 8 - local148;
							} else {
								local223 = local148 + arg3 - local11;
								local231 = arg4 + local91 + 8 - local152;
							}
							this.method2452(arg6, local223, local231, true, 0, 0, 0, arg8, local152 + local20, local148 + local97);
						} else {
							local231 = Static395.method2776(local152 & 0x7, local148 & 0x7, arg5) + arg4;
							local223 = arg3 + Static267.method3811(local148 & 0x7, local152 & 0x7, arg5);
							this.method2452(arg6, local223, local231, false, local117, local119, arg5, arg8, local20 + local152, local148 + local97);
						}
						if (local148 == 63 || local152 == 63) {
							@Pc(359) byte local359 = 1;
							if (local148 == 63 && local152 == 63) {
								local359 = 3;
							}
							for (@Pc(371) int local371 = 0; local371 < local359; local371++) {
								@Pc(375) int local375 = local148;
								@Pc(377) int local377 = local152;
								if (local371 == 0) {
									local375 = local148 == 63 ? 64 : local148;
									local377 = local152 == 63 ? 64 : local152;
								} else if (local371 == 1) {
									local375 = 64;
								} else if (local371 == 2) {
									local377 = 64;
								}
								@Pc(418) int local418;
								@Pc(425) int local425;
								if (arg5 == 0) {
									local418 = local375 + arg4 - local11;
									local425 = arg3 + local377 - local91;
								} else if (arg5 == 1) {
									local425 = arg3 + local11 + 8 - local375;
									local418 = local377 + arg4 - local91;
								} else if (arg5 == 2) {
									local425 = arg3 + local91 + 8 - local377;
									local418 = local11 + arg4 + 8 - local375;
								} else {
									local425 = local375 + arg3 - local11;
									local418 = arg4 + local91 + 8 - local377;
								}
								if (local418 >= 0 && this.anInt2556 > local418 && local425 >= 0 && local425 < this.anInt2549) {
									this.anIntArrayArrayArray9[arg6][local418][local425] = this.anIntArrayArrayArray9[arg6][local231 + local117][local119 + local223];
								}
							}
						}
					} else {
						this.method2452(0, -1, -1, false, 0, 0, 0, arg8, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIII)V")
	public final void method2457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2544; local11++) {
			this.method2462(arg1, local11, 64, 64, arg0);
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!s;Lclient!s;ILclient!ha;Lclient!s;[[II)V")
	private void method2458(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray14[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray10[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray11[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2556; local27++) {
			@Pc(41) int local41 = this.anInt2556 - 1 <= local27 ? local27 : local27 + 1;
			for (@Pc(43) int local43 = 0; local43 < this.anInt2549; local43++) {
				@Pc(57) int local57 = local43 < this.anInt2549 - 1 ? local43 + 1 : local43;
				if (Static479.anInt7567 == -1 || Static260.method7101(local43, arg5, Static479.anInt7567, local27)) {
					@Pc(73) boolean local73 = false;
					@Pc(75) boolean local75 = false;
					@Pc(78) boolean[] local78 = new boolean[4];
					@Pc(84) int local84 = local10[local27][local43];
					@Pc(90) int local90 = local15[local27][local43];
					@Pc(98) int local98 = local25[local27][local43] & 0xFF;
					@Pc(106) int local106 = local20[local27][local43] & 0xFF;
					@Pc(114) int local114 = local20[local27][local57] & 0xFF;
					@Pc(122) int local122 = local20[local41][local57] & 0xFF;
					@Pc(130) int local130 = local20[local41][local43] & 0xFF;
					if (local98 != 0 || local106 != 0) {
						@Pc(152) Class127 local152 = local98 == 0 ? null : this.aClass217_4.method4674(local98 - 1);
						if (local84 == 0 && local152 == null) {
							local84 = 12;
						}
						@Pc(170) Class14 local170 = local106 == 0 ? null : this.aClass160_5.method3545(local106 - 1);
						@Pc(172) Class127 local172 = local152;
						if (local152 != null) {
							if (local152.anInt3066 == -1 && local152.anInt3063 == -1) {
								local172 = local152;
								local152 = null;
							} else if (local170 != null && local84 != 0) {
								local75 = local152.aBoolean229;
							}
						}
						@Pc(250) int local250;
						@Pc(308) int local308;
						@Pc(361) int local361;
						@Pc(371) int local371;
						if ((local84 == 0 || local84 == 12) && local27 > 0 && local43 > 0 && this.anInt2556 > local27 && this.anInt2549 > local43) {
							local250 = local106 == local20[local27 - 1][local43 - 1] ? 1 : -1;
							@Pc(265) int local265 = local20[local41][local43 - 1] == local106 ? 1 : -1;
							@Pc(278) int local278 = local106 == local20[local41][local57] ? 1 : -1;
							if (local106 == local20[local27][local43 - 1]) {
								local265++;
								local250++;
							} else {
								local250--;
								local265--;
							}
							local308 = local20[local27 - 1][local57] == local106 ? 1 : -1;
							if (local20[local41][local43] == local106) {
								local278++;
								local265++;
							} else {
								local265--;
								local278--;
							}
							if (local106 == local20[local27][local57]) {
								local278++;
								local308++;
							} else {
								local308--;
								local278--;
							}
							if (local106 == local20[local27 - 1][local43]) {
								local250++;
								local308++;
							} else {
								local308--;
								local250--;
							}
							local361 = local250 - local278;
							if (local361 < 0) {
								local361 = -local361;
							}
							local371 = local265 - local308;
							if (local371 < 0) {
								local371 = -local371;
							}
							if (local361 == local371) {
								local361 = arg0.method7450(local43, local27) - arg0.method7450(local57, local41);
								if (local361 < 0) {
									local361 = -local361;
								}
								local371 = arg0.method7450(local43, local41) - arg0.method7450(local57, local27);
								if (local371 < 0) {
									local371 = -local371;
								}
							}
							local90 = local371 > local361 ? 1 : 0;
						}
						for (local250 = 0; local250 < 13; local250++) {
							Static258.anIntArray306[local250] = -1;
							Static621.anIntArray671[local250] = 1;
						}
						@Pc(463) boolean[] local463 = local152 != null && local152.aBoolean229 ? Static196.aBooleanArrayArray16[local84] : Static390.aBooleanArrayArray24[local84];
						this.method2454(local170, local84, local25, local27, local10, this.anInt2549, this.anInt2556, local152, local43, local78, local15, arg2, local90);
						@Pc(492) boolean local492 = local152 != null && local152.anInt3063 != local152.anInt3066;
						if (!local492) {
							for (local308 = 0; local308 < 8; local308++) {
								if (Static258.anIntArray306[local308] >= 0 && Static311.anIntArray369[local308] != Static250.anIntArray299[local308]) {
									local492 = true;
									break;
								}
							}
						}
						if (!local463[local90 + 1 & 0x3]) {
							local78[1] = Static120.method2172(local78[1], (Static621.anIntArray671[2] & Static621.anIntArray671[4]) == 0);
						}
						if (!local463[local90 + 3 & 0x3]) {
							local78[3] = Static120.method2172(local78[3], (Static621.anIntArray671[0] & Static621.anIntArray671[6]) == 0);
						}
						if (!local463[local90 & 0x3]) {
							local78[0] = Static120.method2172(local78[0], (Static621.anIntArray671[0] & Static621.anIntArray671[2]) == 0);
						}
						if (!local463[local90 + 2 & 0x3]) {
							local78[2] = Static120.method2172(local78[2], (Static621.anIntArray671[6] & Static621.anIntArray671[4]) == 0);
						}
						if (!local75 && (local84 == 0 || local84 == 12)) {
							if (local78[0] && !local78[1] && !local78[2] && local78[3]) {
								local84 = local84 == 0 ? 13 : 14;
								local78[0] = local78[3] = false;
								local90 = 0;
							} else if (local78[0] && local78[1] && !local78[2] && !local78[3]) {
								local84 = local84 == 0 ? 13 : 14;
								local78[0] = local78[1] = false;
								local90 = 3;
							} else if (!local78[0] && local78[1] && local78[2] && !local78[3]) {
								local78[1] = local78[2] = false;
								local90 = 2;
								local84 = local84 == 0 ? 13 : 14;
							} else if (!local78[0] && !local78[1] && local78[2] && local78[3]) {
								local78[2] = local78[3] = false;
								local84 = local84 == 0 ? 13 : 14;
								local90 = 1;
							}
						}
						@Pc(802) boolean local802 = !local75 && !local78[0] && !local78[2] && !local78[1] && !local78[3];
						@Pc(804) int[] local804 = null;
						@Pc(810) int[] local810;
						@Pc(834) int[] local834;
						@Pc(814) int[] local814;
						if (local802) {
							local810 = Static226.anIntArrayArray19[local84];
							local814 = Static521.anIntArrayArray48[local84];
							local371 = local152 == null ? 0 : Static607.anIntArray658[local84];
							local361 = local170 == null ? 0 : Static68.anIntArray97[local84];
							local834 = Static147.anIntArrayArray59[local84];
						} else if (local75) {
							local804 = Static323.anIntArrayArray34[local84];
							local371 = local152 == null ? 0 : Static131.anIntArray161[local84];
							local810 = Static304.anIntArrayArray63[local84];
							local814 = Static14.anIntArrayArray1[local84];
							local361 = local170 == null ? 0 : Static241.anIntArray293[local84];
							local834 = Static471.anIntArrayArray45[local84];
						} else {
							local361 = local170 == null ? 0 : Static385.anIntArray433[local84];
							local810 = Static362.anIntArrayArray37[local84];
							local834 = Static508.anIntArrayArray47[local84];
							local814 = Static321.anIntArrayArray30[local84];
							local804 = Static89.anIntArrayArray9[local84];
							local371 = local152 == null ? 0 : Static351.anIntArray414[local84];
						}
						@Pc(907) int local907 = local371 + local361;
						if (local907 <= 0) {
							Static450.method6185(arg5, local27, local43);
						} else {
							if (local78[0]) {
								local907++;
							}
							if (local78[2]) {
								local907++;
							}
							if (local78[1]) {
								local907++;
							}
							if (local78[3]) {
								local907++;
							}
							@Pc(940) int local940 = 0;
							@Pc(942) int local942 = 0;
							@Pc(946) int local946 = local907 * 3;
							@Pc(953) int[] local953 = local492 ? new int[local946] : null;
							@Pc(956) int[] local956 = new int[local946];
							@Pc(959) int[] local959 = new int[local946];
							@Pc(962) int[] local962 = new int[local946];
							@Pc(965) int[] local965 = new int[local946];
							@Pc(968) int[] local968 = new int[local946];
							@Pc(975) int[] local975 = arg3 == null ? null : new int[local946];
							@Pc(984) int[] local984 = arg3 == null && arg1 == null ? null : new int[local946];
							@Pc(986) int local986 = -1;
							@Pc(988) int local988 = -1;
							@Pc(990) int local990 = 256;
							@Pc(1080) byte local1080;
							@Pc(1006) int local1006;
							@Pc(1008) int local1008;
							@Pc(1243) int local1243;
							@Pc(1249) int local1249;
							@Pc(1258) int local1258;
							@Pc(1263) int local1263;
							@Pc(1273) int local1273;
							@Pc(1268) int local1268;
							@Pc(1278) int local1278;
							@Pc(1335) int local1335;
							@Pc(1342) int local1342;
							if (local152 != null) {
								local986 = local152.anInt3066;
								local988 = local152.anInt3065;
								local990 = local152.anInt3074;
								local1006 = Static199.method3055(local152, arg2);
								for (local1008 = 0; local1008 < local371; local1008++) {
									if (local78[-local90 & 0x3] && local804[0] == local940) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 1;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 1;
										Static564.anIntArray615[4] = local834[local940];
										Static564.anIntArray615[5] = local814[local940];
										local1080 = 6;
									} else if (local78[2 - local90 & 0x3] && local940 == local804[2]) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 5;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 5;
										Static564.anIntArray615[4] = local834[local940];
										Static564.anIntArray615[5] = local814[local940];
										local1080 = 6;
									} else if (local78[1 - local90 & 0x3] && local804[1] == local940) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 3;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 3;
										Static564.anIntArray615[4] = local834[local940];
										Static564.anIntArray615[5] = local814[local940];
										local1080 = 6;
									} else if (local78[3 - local90 & 0x3] && local804[3] == local940) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 7;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 7;
										Static564.anIntArray615[4] = local834[local940];
										Static564.anIntArray615[5] = local814[local940];
										local1080 = 6;
									} else {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = local834[local940];
										local1080 = 3;
										Static564.anIntArray615[2] = local814[local940];
									}
									for (local1243 = 0; local1243 < local1080; local1243++) {
										local1249 = Static564.anIntArray615[local1243];
										local1258 = local1249 - local90 * 2 & 0x7;
										local1263 = this.anIntArray168[local1249];
										local1268 = this.anIntArray169[local1249];
										if (local90 == 1) {
											local1273 = local1268;
											local1278 = 512 - local1263;
										} else if (local90 == 2) {
											local1278 = 512 - local1268;
											local1273 = 512 - local1263;
										} else if (local90 == 3) {
											local1278 = local1263;
											local1273 = 512 - local1268;
										} else {
											local1273 = local1263;
											local1278 = local1268;
										}
										local956[local942] = local1273;
										local959[local942] = local1278;
										if (local975 != null && Static155.aBooleanArrayArray13[local84][local1249]) {
											local1335 = local1273 + (local27 << 9);
											local1342 = (local43 << 9) + local1278;
											local975[local942] = arg3.method7453(local1335, local1342) - arg0.method7453(local1335, local1342);
										}
										if (local984 != null) {
											if (arg3 != null && !Static155.aBooleanArrayArray13[local84][local1249]) {
												local1335 = (local27 << 9) + local1273;
												local1342 = (local43 << 9) + local1278;
												local984[local942] = arg0.method7453(local1335, local1342) - arg3.method7453(local1335, local1342);
											} else if (arg1 != null && !Static606.aBooleanArrayArray33[local84][local1249]) {
												local1335 = (local27 << 9) + local1273;
												local1342 = local1278 + (local43 << 9);
												local984[local942] = arg1.method7453(local1335, local1342) - arg0.method7453(local1335, local1342);
											}
										}
										if (local1249 < 8 && local152.anInt3071 < Static258.anIntArray306[local1258]) {
											if (local953 != null) {
												local953[local942] = Static311.anIntArray369[local1258];
											}
											local968[local942] = Static388.anIntArray434[local1258];
											local965[local942] = Static104.anIntArray141[local1258];
											local962[local942] = Static250.anIntArray299[local1258];
										} else {
											if (local953 != null) {
												local953[local942] = local1006;
											}
											local965[local942] = local152.anInt3065;
											local968[local942] = local152.anInt3074;
											local962[local942] = local986;
										}
										local942++;
									}
									local940++;
								}
								if (!this.aBoolean182 && arg5 == 0) {
									Static137.method2439(local27, local43, local152.anInt3070, local152.anInt3069 * 8, local152.anInt3062);
								}
								if (local84 != 12 && local152.anInt3066 != -1 && local152.aBoolean231) {
									local73 = true;
								}
							} else if (local802) {
								local940 = Static607.anIntArray658[local84];
							} else if (local75) {
								local940 = Static131.anIntArray161[local84];
							} else {
								local940 = Static351.anIntArray414[local84];
							}
							if (local170 != null) {
								if (local114 == 0) {
									local114 = local106;
								}
								if (local130 == 0) {
									local130 = local106;
								}
								if (local122 == 0) {
									local122 = local106;
								}
								@Pc(1590) Class14 local1590 = this.aClass160_5.method3545(local106 - 1);
								@Pc(1598) Class14 local1598 = this.aClass160_5.method3545(local114 - 1);
								@Pc(1606) Class14 local1606 = this.aClass160_5.method3545(local122 - 1);
								@Pc(1614) Class14 local1614 = this.aClass160_5.method3545(local130 - 1);
								for (local1258 = 0; local1258 < local361; local1258++) {
									if (local78[-local90 & 0x3] && local804[0] == local940) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 1;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 1;
										Static564.anIntArray615[4] = local834[local940];
										local1080 = 6;
										Static564.anIntArray615[5] = local814[local940];
									} else if (local78[2 - local90 & 0x3] && local804[2] == local940) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 5;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 5;
										Static564.anIntArray615[4] = local834[local940];
										local1080 = 6;
										Static564.anIntArray615[5] = local814[local940];
									} else if (local78[1 - local90 & 0x3] && local940 == local804[1]) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 3;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 3;
										Static564.anIntArray615[4] = local834[local940];
										Static564.anIntArray615[5] = local814[local940];
										local1080 = 6;
									} else if (local78[3 - local90 & 0x3] && local940 == local804[3]) {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = 7;
										Static564.anIntArray615[2] = local814[local940];
										Static564.anIntArray615[3] = 7;
										Static564.anIntArray615[4] = local834[local940];
										local1080 = 6;
										Static564.anIntArray615[5] = local814[local940];
									} else {
										Static564.anIntArray615[0] = local810[local940];
										Static564.anIntArray615[1] = local834[local940];
										local1080 = 3;
										Static564.anIntArray615[2] = local814[local940];
									}
									for (local1263 = 0; local1263 < local1080; local1263++) {
										local1273 = Static564.anIntArray615[local1263];
										local1268 = local1273 - local90 * 2 & 0x7;
										local1278 = this.anIntArray168[local1273];
										local1342 = this.anIntArray169[local1273];
										@Pc(1888) int local1888;
										if (local90 == 1) {
											local1888 = 512 - local1278;
											local1335 = local1342;
										} else if (local90 == 2) {
											local1335 = 512 - local1278;
											local1888 = 512 - local1342;
										} else if (local90 == 3) {
											local1888 = local1278;
											local1335 = 512 - local1342;
										} else {
											local1888 = local1342;
											local1335 = local1278;
										}
										local956[local942] = local1335;
										local959[local942] = local1888;
										@Pc(1941) int local1941;
										@Pc(1947) int local1947;
										if (local975 != null && Static155.aBooleanArrayArray13[local84][local1273]) {
											local1941 = (local27 << 9) + local1335;
											local1947 = local1888 + (local43 << 9);
											local975[local942] = arg3.method7453(local1941, local1947) - arg0.method7453(local1941, local1947);
										}
										if (local984 != null) {
											if (arg3 != null && !Static155.aBooleanArrayArray13[local84][local1273]) {
												local1941 = (local27 << 9) + local1335;
												local1947 = local1888 + (local43 << 9);
												local984[local942] = arg0.method7453(local1941, local1947) - arg3.method7453(local1941, local1947);
											} else if (arg1 != null && !Static606.aBooleanArrayArray33[local84][local1273]) {
												local1941 = local1335 + (local27 << 9);
												local1947 = local1888 + (local43 << 9);
												local984[local942] = arg1.method7453(local1941, local1947) - arg0.method7453(local1941, local1947);
											}
										}
										if (local1273 < 8 && Static258.anIntArray306[local1268] >= 0) {
											if (local953 != null) {
												local953[local942] = Static311.anIntArray369[local1268];
											}
											local968[local942] = Static388.anIntArray434[local1268];
											local965[local942] = Static104.anIntArray141[local1268];
											local962[local942] = Static250.anIntArray299[local1268];
										} else {
											if (local75 && Static155.aBooleanArrayArray13[local84][local1273]) {
												local965[local942] = local988;
												local968[local942] = local990;
												local962[local942] = local986;
											} else if (local1335 == 0 && local1888 == 0) {
												local962[local942] = arg4[local27][local43];
												local965[local942] = local1590.anInt202;
												local968[local942] = local1590.anInt195;
											} else if (local1335 == 0 && local1888 == 512) {
												local962[local942] = arg4[local27][local57];
												local965[local942] = local1598.anInt202;
												local968[local942] = local1598.anInt195;
											} else if (local1335 == 512 && local1888 == 512) {
												local962[local942] = arg4[local41][local57];
												local965[local942] = local1606.anInt202;
												local968[local942] = local1606.anInt195;
											} else if (local1335 == 512 && local1888 == 0) {
												local962[local942] = arg4[local41][local43];
												local965[local942] = local1614.anInt202;
												local968[local942] = local1614.anInt195;
											} else {
												if (local1335 < 256) {
													if (local1888 < 256) {
														local965[local942] = local1590.anInt202;
														local968[local942] = local1590.anInt195;
													} else {
														local965[local942] = local1598.anInt202;
														local968[local942] = local1598.anInt195;
													}
												} else if (local1888 < 256) {
													local965[local942] = local1614.anInt202;
													local968[local942] = local1614.anInt195;
												} else {
													local965[local942] = local1606.anInt202;
													local968[local942] = local1606.anInt195;
												}
												local1941 = Static586.method7709(arg4[local27][local43], local1335 << 7 >> 9, arg4[local41][local43]);
												local1947 = Static586.method7709(arg4[local27][local57], local1335 << 7 >> 9, arg4[local41][local57]);
												local962[local942] = Static586.method7709(local1941, local1888 << 7 >> 9, local1947);
											}
											if (local953 != null) {
												local953[local942] = local962[local942];
											}
										}
										local942++;
									}
									local940++;
								}
								if (local84 != 0 && local170.aBoolean19) {
									local73 = true;
								}
							}
							local1006 = arg0.method7450(local43, local27);
							local1008 = arg0.method7450(local43, local41);
							local1243 = arg0.method7450(local57, local41);
							local1249 = arg0.method7450(local57, local27);
							@Pc(2372) boolean local2372 = Static547.method7286(local27, local43);
							if (local2372 && arg5 > 1 || !local2372 && arg5 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local170 != null && !local170.aBoolean18) {
									local2383 = false;
								} else if (local106 == 0 && local84 != 0) {
									local2383 = false;
								} else if (local98 > 0 && local172 != null && !local172.aBoolean232) {
									local2383 = false;
								}
								if (local2383 && local1008 == local1006 && local1243 == local1006 && local1249 == local1006) {
									this.aByteArrayArrayArray13[arg5][local27][local43] = (byte) (this.aByteArrayArrayArray13[arg5][local27][local43] | 0x4);
								}
							}
							local1263 = 0;
							local1273 = 0;
							local1268 = 0;
							if (this.aBoolean182) {
								local1263 = Static180.method8506(local27, local43);
								local1273 = Static185.method2931(local27, local43);
								local1268 = Static523.method7043(local27, local43);
							}
							arg0.U(local27, local43, local956, local975, local959, local984, local962, local953, local965, local968, local1263, local1273, local1268, local73);
							Static450.method6185(arg5, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!ha;BLclient!s;Lclient!s;)V")
	public final void method2459(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(17) int[][] local17 = new int[this.anInt2556][this.anInt2549];
		if (Static567.anIntArray623 == null || Static567.anIntArray623.length != this.anInt2549) {
			Static567.anIntArray623 = new int[this.anInt2549];
			Static280.anIntArray713 = new int[this.anInt2549];
			Static128.anIntArray158 = new int[this.anInt2549];
			Static47.anIntArray69 = new int[this.anInt2549];
			Static19.anIntArray41 = new int[this.anInt2549];
		}
		@Pc(50) int local50;
		for (@Pc(46) int local46 = 0; local46 < this.anInt2544; local46++) {
			for (local50 = 0; local50 < this.anInt2549; local50++) {
				Static567.anIntArray623[local50] = 0;
				Static19.anIntArray41[local50] = 0;
				Static280.anIntArray713[local50] = 0;
				Static128.anIntArray158[local50] = 0;
				Static47.anIntArray69[local50] = 0;
			}
			for (@Pc(79) int local79 = -5; local79 < this.anInt2556; local79++) {
				@Pc(89) int local89;
				@Pc(108) int local108;
				@Pc(177) int local177;
				for (@Pc(83) int local83 = 0; local83 < this.anInt2549; local83++) {
					local89 = local79 + 5;
					@Pc(154) int local154;
					if (local89 < this.anInt2556) {
						local108 = this.aByteArrayArrayArray10[local46][local89][local83] & 0xFF;
						if (local108 > 0) {
							@Pc(118) Class14 local118 = this.aClass160_5.method3545(local108 - 1);
							Static567.anIntArray623[local83] += local118.anInt197;
							Static19.anIntArray41[local83] += local118.anInt205;
							Static280.anIntArray713[local83] += local118.anInt196;
							Static128.anIntArray158[local83] += local118.anInt204;
							local154 = Static47.anIntArray69[local83]++;
						}
					}
					local108 = local79 - 5;
					if (local108 >= 0) {
						local177 = this.aByteArrayArrayArray10[local46][local108][local83] & 0xFF;
						if (local177 > 0) {
							@Pc(187) Class14 local187 = this.aClass160_5.method3545(local177 - 1);
							Static567.anIntArray623[local83] -= local187.anInt197;
							Static19.anIntArray41[local83] -= local187.anInt205;
							Static280.anIntArray713[local83] -= local187.anInt196;
							Static128.anIntArray158[local83] -= local187.anInt204;
							local154 = Static47.anIntArray69[local83]--;
						}
					}
				}
				if (local79 >= 0) {
					local89 = 0;
					local108 = 0;
					local177 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt2549; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (local254 < this.anInt2549) {
							local177 += Static280.anIntArray713[local254];
							local244 += Static128.anIntArray158[local254];
							local108 += Static19.anIntArray41[local254];
							local89 += Static567.anIntArray623[local254];
							local246 += Static47.anIntArray69[local254];
						}
						@Pc(292) int local292 = local248 - 5;
						if (local292 >= 0) {
							local89 -= Static567.anIntArray623[local292];
							local244 -= Static128.anIntArray158[local292];
							local246 -= Static47.anIntArray69[local292];
							local177 -= Static280.anIntArray713[local292];
							local108 -= Static19.anIntArray41[local292];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local17[local79][local248] = Static122.method2186(local89 * 256 / local244, local177 / local246, local108 / local246);
						}
					}
				}
			}
			if (Static82.aBoolean649) {
				this.method2458(Static140.aClass42Array4[local46], local46 == 0 ? arg2 : null, arg0, local46 == 0 ? arg1 : null, local17, local46);
			} else {
				this.method2463(local17, local46 == 0 ? arg1 : null, local46, Static140.aClass42Array4[local46], arg0, local46 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray10[local46] = null;
			this.aByteArrayArrayArray11[local46] = null;
			this.aByteArrayArrayArray14[local46] = null;
			this.aByteArrayArrayArray12[local46] = null;
		}
		if (!this.aBoolean182) {
			if (Static635.anInt9892 != 0) {
				Static100.method2023();
			}
			if (Static471.aBoolean586) {
				Static358.method4780();
			}
		}
		for (local50 = 0; local50 < this.anInt2544; local50++) {
			Static140.aClass42Array4[local50].YA();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "([[[ILclient!ha;I[Lclient!wj;)V")
	public final void method2460(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) Class389[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean182) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt2556; local14++) {
					for (local18 = 0; local18 < this.anInt2549; local18++) {
						if ((Static47.aByteArrayArrayArray3[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static47.aByteArrayArrayArray3[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg2[local32].method8805(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt2544; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean182) {
				if (Static471.aBoolean586) {
					local14 = 2;
				}
				if (Static138.aBoolean183) {
					local18 = 8;
				}
				if (Static635.anInt9892 != 0) {
					local14 |= 0x1;
					if (local10 == 0 | Static479.aBoolean597) {
						local18 |= 0x10;
					}
				}
			}
			if (Static471.aBoolean586) {
				local18 |= 0x7;
			}
			if (!Static638.aBoolean779) {
				local18 |= 0x20;
			}
			@Pc(151) int[][] local151 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray9[local10] : arg0[local10];
			Static667.method8905(local10, arg1.method8068(this.anInt2556, this.anInt2549, this.anIntArrayArrayArray9[local10], local151, local14, local18));
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI[[I)V")
	public final void method2461(@OriginalArg(2) int[][] arg0) {
		@Pc(16) int[][] local16 = this.anIntArrayArrayArray9[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2556 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2549 + 1; local22++) {
				local16[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIB)V")
	public final void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg4; local3 < arg4 + arg2; local3++) {
			for (local7 = arg0; local7 < arg0 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt2556 && local3 >= 0 && this.anInt2549 > local3) {
					this.anIntArrayArrayArray9[arg1][local7][local3] = arg1 > 0 ? this.anIntArrayArrayArray9[arg1 - 1][local7][local3] - 960 : 0;
				}
			}
		}
		if (arg0 > 0 && this.anInt2556 > arg0) {
			for (local7 = arg4 + 1; local7 < arg4 + arg2; local7++) {
				if (local7 >= 0 && this.anInt2549 > local7) {
					this.anIntArrayArrayArray9[arg1][arg0][local7] = this.anIntArrayArrayArray9[arg1][arg0 - 1][local7];
				}
			}
		}
		if (arg4 > 0 && this.anInt2549 > arg4) {
			for (local7 = arg0 + 1; local7 < arg0 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt2556) {
					this.anIntArrayArrayArray9[arg1][local7][arg4] = this.anIntArrayArrayArray9[arg1][local7][arg4 - 1];
				}
			}
		}
		if (arg0 < 0 || arg4 < 0 || arg0 >= this.anInt2556 || this.anInt2549 <= arg4) {
			return;
		}
		if (arg1 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray9[arg1 - 1][arg0 - 1][arg4] != this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4]) {
				this.anIntArrayArrayArray9[arg1][arg0][arg4] = this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray9[arg1][arg0][arg4 - 1] != this.anIntArrayArrayArray9[arg1 - 1][arg0][arg4 - 1]) {
				this.anIntArrayArrayArray9[arg1][arg0][arg4] = this.anIntArrayArrayArray9[arg1][arg0][arg4 - 1];
				return;
			}
			if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray9[arg1 - 1][arg0 - 1][arg4 - 1] != this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4 - 1]) {
				this.anIntArrayArrayArray9[arg1][arg0][arg4] = this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4] != 0) {
			this.anIntArrayArrayArray9[arg1][arg0][arg4] = this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray9[arg1][arg0][arg4 - 1] != 0) {
			this.anIntArrayArrayArray9[arg1][arg0][arg4] = this.anIntArrayArrayArray9[arg1][arg0][arg4 - 1];
			return;
		}
		if (arg0 > 0 && arg4 > 0 && this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray9[arg1][arg0][arg4] = this.anIntArrayArrayArray9[arg1][arg0 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I[[ILclient!s;ILclient!s;Lclient!ha;Lclient!s;)V")
	private void method2463(@OriginalArg(1) int[][] arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) Class42 arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2556; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2549; local15++) {
				if (Static479.anInt7567 == -1 || Static260.method7101(local15, arg2, Static479.anInt7567, local11)) {
					@Pc(38) byte local38 = this.aByteArrayArrayArray14[arg2][local11][local15];
					@Pc(47) byte local47 = this.aByteArrayArrayArray12[arg2][local11][local15];
					@Pc(58) int local58 = this.aByteArrayArrayArray11[arg2][local11][local15] & 0xFF;
					@Pc(69) int local69 = this.aByteArrayArrayArray10[arg2][local11][local15] & 0xFF;
					@Pc(84) Class127 local84 = local58 == 0 ? null : this.aClass217_4.method4674(local58 - 1);
					@Pc(99) Class14 local99 = local69 == 0 ? null : this.aClass160_5.method3545(local69 - 1);
					if (local38 == 0 && local84 == null) {
						local38 = 12;
					}
					@Pc(107) Class127 local107 = local84;
					if (local84 != null && local84.anInt3066 == -1 && local84.anInt3063 == -1) {
						local107 = local84;
						local84 = null;
					}
					if (local84 != null || local99 != null) {
						@Pc(131) int local131 = Static68.anIntArray97[local38];
						@Pc(135) int local135 = Static607.anIntArray658[local38];
						@Pc(148) int local148 = (local84 == null ? 0 : local135) + (local99 == null ? 0 : local131);
						@Pc(150) int local150 = 0;
						@Pc(152) int local152 = 0;
						@Pc(159) int local159 = local84 == null ? -1 : local84.anInt3065;
						@Pc(166) int local166 = local99 == null ? -1 : local99.anInt202;
						@Pc(169) int[] local169 = new int[local148];
						@Pc(172) int[] local172 = new int[local148];
						@Pc(175) int[] local175 = new int[local148];
						@Pc(178) int[] local178 = new int[local148];
						@Pc(181) int[] local181 = new int[local148];
						@Pc(184) int[] local184 = new int[local148];
						@Pc(195) int[] local195 = local84 == null || local84.anInt3063 == -1 ? null : new int[local148];
						@Pc(205) int local205;
						if (local84 == null) {
							local152 = local135;
						} else {
							for (local205 = 0; local205 < local135; local205++) {
								local169[local150] = Static226.anIntArrayArray19[local38][local152];
								local172[local150] = Static147.anIntArrayArray59[local38][local152];
								local175[local150] = Static521.anIntArrayArray48[local38][local152];
								local181[local150] = local159;
								local184[local150] = local84.anInt3074;
								local178[local150] = local84.anInt3066;
								if (local195 != null) {
									local195[local150] = local84.anInt3063;
								}
								local150++;
								local152++;
							}
							if (!this.aBoolean182 && arg2 == 0) {
								Static137.method2439(local11, local15, local84.anInt3070, local84.anInt3069 * 8, local84.anInt3062);
							}
						}
						if (local99 != null) {
							for (local205 = 0; local205 < local131; local205++) {
								local169[local150] = Static226.anIntArrayArray19[local38][local152];
								local172[local150] = Static147.anIntArrayArray59[local38][local152];
								local175[local150] = Static521.anIntArrayArray48[local38][local152];
								local181[local150] = local166;
								local184[local150] = local99.anInt195;
								local178[local150] = arg0[local11][local15];
								if (local195 != null) {
									local195[local150] = local178[local150];
								}
								local152++;
								local150++;
							}
						}
						local205 = this.anIntArray168.length;
						@Pc(349) int[] local349 = new int[local205];
						@Pc(352) int[] local352 = new int[local205];
						@Pc(359) int[] local359 = arg1 == null ? null : new int[local205];
						@Pc(368) int[] local368 = arg1 == null && arg5 == null ? null : new int[local205];
						@Pc(377) int local377;
						@Pc(382) int local382;
						@Pc(466) int local466;
						@Pc(474) int local474;
						for (@Pc(370) int local370 = 0; local370 < local205; local370++) {
							local377 = this.anIntArray168[local370];
							local382 = this.anIntArray169[local370];
							if (local47 == 0) {
								local349[local370] = local377;
								local352[local370] = local382;
							} else if (local47 == 1) {
								local349[local370] = local382;
								local352[local370] = 512 - local377;
							} else if (local47 == 2) {
								local349[local370] = 512 - local377;
								local352[local370] = 512 - local382;
							} else if (local47 == 3) {
								local349[local370] = 512 - local382;
								local352[local370] = local377;
							}
							if (local359 != null && Static155.aBooleanArrayArray13[local38][local370]) {
								local466 = (local11 << 9) + local349[local370];
								local474 = local352[local370] + (local15 << 9);
								local359[local370] = arg1.method7453(local466, local474) - arg3.method7453(local466, local474);
							}
							if (local368 != null) {
								if (arg1 != null && !Static155.aBooleanArrayArray13[local38][local370]) {
									local466 = (local11 << 9) + local349[local370];
									local474 = local352[local370] + (local15 << 9);
									local368[local370] = arg3.method7453(local466, local474) - arg1.method7453(local466, local474);
								} else if (arg5 != null && !Static606.aBooleanArrayArray33[local38][local370]) {
									local466 = local349[local370] + (local11 << 9);
									local474 = local352[local370] + (local15 << 9);
									local368[local370] = arg5.method7453(local466, local474) - arg3.method7453(local466, local474);
								}
							}
						}
						local377 = arg3.method7450(local15, local11);
						local382 = arg3.method7450(local15, local11 + 1);
						local466 = arg3.method7450(local15 + 1, local11 - -1);
						local474 = arg3.method7450(local15 + 1, local11);
						@Pc(619) boolean local619 = Static547.method7286(local11, local15);
						if (local619 && arg2 > 1 || !local619 && arg2 > 0) {
							@Pc(633) boolean local633 = true;
							if (local99 != null && !local99.aBoolean18) {
								local633 = false;
							} else if (local69 == 0 && local38 != 0) {
								local633 = false;
							} else if (local58 > 0 && local107 != null && !local107.aBoolean232) {
								local633 = false;
							}
							if (local633 && local382 == local377 && local377 == local466 && local377 == local474) {
								this.aByteArrayArrayArray13[arg2][local11][local15] = (byte) (this.aByteArrayArrayArray13[arg2][local11][local15] | 0x4);
							}
						}
						@Pc(706) int local706 = 0;
						@Pc(708) int local708 = 0;
						@Pc(710) int local710 = 0;
						if (this.aBoolean182) {
							local706 = Static180.method8506(local11, local15);
							local708 = Static185.method2931(local11, local15);
							local710 = Static523.method7043(local11, local15);
						}
						arg3.method7448(local11, local15, local349, local359, local352, local368, local169, local172, local175, local178, local195, local181, local184, local706, local708, local710);
						Static450.method6185(arg2, local11, local15);
					}
				}
			}
		}
	}
}
