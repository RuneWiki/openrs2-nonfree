import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public abstract class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	protected int anInt9578;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "[[Lclient!co;")
	protected Class52[][] aClass52ArrayArray3;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "[[Lclient!vca;")
	protected Class300[][] aClass300ArrayArray3;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	protected int anInt9581;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	protected int anInt9582;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "[[Lclient!cl;")
	protected Class50[][] aClass50ArrayArray3;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
	protected int anInt9583;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
	protected int anInt9584;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	protected int anInt9585;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	protected int anInt9586;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	protected int anInt9587;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	protected int anInt9588;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
	protected int anInt9589;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	protected int anInt9590;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "[[Lclient!hc;")
	protected Class122[][] aClass122ArrayArray3;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	protected int anInt9591;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	protected int anInt9579 = -1;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Lclient!hr;")
	protected final Class4_Sub1 aClass4_Sub1_18;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
	private final int anInt9580;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray126;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "[[B")
	private byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!hr;IIII[[I[[II)V")
	public Class7_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass4_Sub1_18 = arg0;
		this.anInt9580 = arg2;
		this.anIntArrayArray126 = arg5;
		this.aByteArrayArray32 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass4_Sub1_18.anInt2878 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass4_Sub1_18.anInt2891 * local92 + this.aClass4_Sub1_18.anInt2867 * local98 + this.aClass4_Sub1_18.anInt2873 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray32[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray31 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!sq", name = "Q", descriptor = "(III)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray31[arg0][arg1] < arg2) {
			this.aByteArrayArray31[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "()V")
	@Override
	public final void N() {
		this.aByteArrayArray32 = null;
		this.aByteArrayArray31 = null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	public abstract void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void F(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method8248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass122ArrayArray3 == null) {
			this.aClass122ArrayArray3 = new Class122[super.anInt9577][super.anInt9575];
			this.aClass50ArrayArray3 = new Class50[super.anInt9577][super.anInt9575];
		} else if (this.aClass300ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt9576 || local70 != 0 && local70 != super.anInt9576) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class50 local95 = new Class50();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort19 = local99;
			local95.aShortArray7 = new short[local99];
			local95.aShortArray9 = new short[local99];
			local95.aShortArray12 = new short[local99];
			local95.aShortArray11 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9576) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9576 && local133 == super.anInt9576) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9576 && local133 == 0) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]) * (super.anInt9576 - local129) + (this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]) * (super.anInt9576 - local129) + (this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray7[local124] = (short) (local288 * (super.anInt9576 - local133) + local335 * local133 >> super.anInt9573 * 2);
				}
				local288 = (arg0 << super.anInt9573) + local129;
				local335 = (arg1 << super.anInt9573) + local133;
				local95.aShortArray9[local124] = (short) local129;
				local95.aShortArray11[local124] = (short) local133;
				local95.aShortArray12[local124] = (short) (this.aa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray7[local124] < 2) {
					local95.aShortArray7[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass4_Sub1_18.anInterface13_13.method5789(arg11[local288]).aBoolean640) {
					local415 = true;
				}
			}
			local95.anIntArray102 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray101 = new int[local133];
			}
			local95.aShortArray13 = new short[local133];
			local95.aShortArray8 = new short[local133];
			local95.aShortArray14 = new short[local133];
			if (local415) {
				local95.aShortArray10 = new short[local133];
				local95.aShortArray6 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray102[local95.aShort18] = Static518.method7915(arg9[local335]);
					} else {
						local95.anIntArray102[local95.aShort18] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray101[local95.aShort18] = -1;
						} else {
							local95.anIntArray101[local95.aShort18] = Static518.method7915(arg10[local335]);
						}
					}
					local95.aShortArray13[local95.aShort18] = (short) arg6[local335];
					local95.aShortArray8[local95.aShort18] = (short) arg7[local335];
					local95.aShortArray14[local95.aShort18] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass4_Sub1_18.anInterface13_13.method5789(arg11[local335]).aBoolean640) {
							local95.aShortArray10[local95.aShort18] = -1;
						} else {
							local95.aShortArray10[local95.aShort18] = (short) arg11[local335];
							local95.aShortArray6[local95.aShort18] = (short) arg12[local335];
						}
					}
					local95.aShort18++;
				}
			}
			this.aClass50ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class122 local644 = new Class122();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3424 = Static171.method3198(this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1], Static518.method7915(arg10[0]));
				if (local64 == -1) {
					local644.aByte51 = (byte) (local644.aByte51 | 0x2);
				}
			}
			if (this.anIntArrayArray126[arg0][arg1] == this.anIntArrayArray126[arg0 + 1][arg1] && this.anIntArrayArray126[arg0][arg1] == this.anIntArrayArray126[arg0 + 1][arg1 + 1] && this.anIntArrayArray126[arg0][arg1] == this.anIntArrayArray126[arg0][arg1 + 1]) {
				local644.aByte51 = (byte) (local644.aByte51 | 0x1);
			}
			if (local70 == -1 || (local644.aByte51 & 0x2) != 0 || this.aClass4_Sub1_18.anInterface13_13.method5789(local70).aBoolean640) {
				@Pc(845) short local845 = Static518.method7915(local64);
				local644.aShort37 = (short) Static171.method3198(this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1], local845);
				local644.aShort38 = (short) Static171.method3198(this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1], local845);
				local644.aShort34 = (short) Static171.method3198(this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1], local845);
				local644.aShort35 = (short) Static171.method3198(this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1], local845);
				local644.aShort36 = -1;
			} else {
				local644.aShort37 = (short) (this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]);
				local644.aShort38 = (short) (this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]);
				local644.aShort34 = (short) (this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]);
				local644.aShort35 = (short) (this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]);
				local644.aShort36 = (short) local70;
			}
			this.aClass122ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!sq", name = "aa", descriptor = "(II)I")
	@Override
	public final int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9573;
		@Pc(9) int local9 = arg1 >> super.anInt9573;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9577 - 1 || local9 > super.anInt9575 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9576 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9576 - 1;
		@Pc(67) int local67 = this.anIntArrayArray126[local4][local9] * (super.anInt9576 - local34) + this.anIntArrayArray126[local4 + 1][local9] * local34 >> super.anInt9573;
		@Pc(97) int local97 = this.anIntArrayArray126[local4][local9 + 1] * (super.anInt9576 - local34) + this.anIntArrayArray126[local4 + 1][local9 + 1] * local34 >> super.anInt9573;
		return local67 * (super.anInt9576 - local41) + local97 * local41 >> super.anInt9573;
	}

	@OriginalMember(owner = "client!sq", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void ya(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!sq", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass300ArrayArray3 == null) {
			this.aClass300ArrayArray3 = new Class300[super.anInt9577][super.anInt9575];
			this.aClass52ArrayArray3 = new Class52[super.anInt9577][super.anInt9575];
		} else if (this.aClass122ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static19.anIntArray30[Static518.method7915(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static19.anIntArray30[Static518.method7915(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt9576 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9576 && arg4[local116] == super.anInt9576) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9576) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9576 && arg2[local244] != arg2[0] - super.anInt9576) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9576 && arg4[local244] != arg4[0] - super.anInt9576) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class300 local334 = new Class300();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt8858 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte106 = (byte) (local334.aByte106 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray126[arg0][arg1] == this.anIntArrayArray126[arg0 + 1][arg1] && this.anIntArrayArray126[arg0][arg1] == this.anIntArrayArray126[arg0 + 1][arg1 + 1] && this.anIntArrayArray126[arg0][arg1] == this.anIntArrayArray126[arg0][arg1 + 1]) {
				local334.aByte106 = (byte) (local334.aByte106 | 0x1);
			}
			if (local342 == -1 || (local334.aByte106 & 0x2) != 0 || this.aClass4_Sub1_18.anInterface13_13.method5789(local342).aBoolean640) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8857 = Static292.method5120(Static555.method8251(arg6[local104] >> 8, this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]), local527, arg10);
				if (local334.anInt8858 != 0) {
					local334.anInt8857 |= this.aByteArrayArray31[arg0][arg1] + 255 - this.aByteArrayArray32[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8859 = Static292.method5120(Static555.method8251(arg6[local106] >> 8, this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt8858 != 0) {
					local334.anInt8859 |= this.aByteArrayArray31[arg0 + 1][arg1] + 255 - this.aByteArrayArray32[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8860 = Static292.method5120(Static555.method8251(arg6[local108] >> 8, this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt8858 != 0) {
					local334.anInt8860 |= this.aByteArrayArray31[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray32[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt8861 = Static292.method5120(Static555.method8251(arg6[local110] >> 8, this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt8858 != 0) {
					local334.anInt8861 |= this.aByteArrayArray31[arg0][arg1 + 1] + 255 - this.aByteArrayArray32[arg0][arg1 + 1] << 25;
				}
				local334.aShort120 = -1;
			} else {
				local334.anInt8857 = this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1];
				local334.anInt8859 = this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1];
				local334.anInt8860 = this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1];
				local334.anInt8861 = this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1];
				local334.aShort120 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort119 = (short) arg5[local108];
				local334.aShort122 = (short) arg5[local110];
				local334.aShort121 = (short) arg5[local106];
				local334.aShort118 = (short) arg5[local104];
			}
			this.aClass300ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class52 local888 = new Class52();
		local888.aShort21 = (short) arg2.length;
		local888.aShort20 = (short) (arg2.length / 3);
		local888.aShortArray24 = new short[local888.aShort21];
		local888.aShortArray20 = new short[local888.aShort21];
		local888.aShortArray23 = new short[local888.aShort21];
		local888.anIntArray109 = new int[local888.aShort21];
		if (arg5 != null) {
			local888.aShortArray21 = new short[local888.aShort21];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort21; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9576) {
				local958 = this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1];
			} else if (local342 == super.anInt9576 && local527 == super.anInt9576) {
				local958 = this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9576 && local527 == 0) {
				local958 = this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray32[arg0][arg1] - this.aByteArrayArray31[arg0][arg1]) * (super.anInt9576 - local342) + (this.aByteArrayArray32[arg0 + 1][arg1] - this.aByteArrayArray31[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray32[arg0][arg1 + 1] - this.aByteArrayArray31[arg0][arg1 + 1]) * (super.anInt9576 - local342) + (this.aByteArrayArray32[arg0 + 1][arg1 + 1] - this.aByteArrayArray31[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9576 - local527) + local1126 * local527 >> super.anInt9573 * 2;
			}
			local1079 = (arg0 << super.anInt9573) + local342;
			local1126 = (arg1 << super.anInt9573) + local527;
			local888.aShortArray24[local244] = (short) local342;
			local888.aShortArray23[local244] = (short) local527;
			local888.aShortArray20[local244] = (short) (this.aa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass4_Sub1_18.anInterface13_13.method5789(arg8[local244]).aBoolean640) {
				local888.anIntArray109[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray21[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray109[local244] = Static292.method5120(Static555.method8251(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray109[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray109[local244] = 0;
			} else {
				local888.anIntArray109[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort20; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass4_Sub1_18.anInterface13_13.method5789(arg8[local527 * 3]).aBoolean640) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray110 = new int[local888.aShort20];
		}
		if (local1296) {
			local888.aShortArray22 = new short[local888.aShort20];
			local888.aShortArray19 = new short[local888.aShort20];
		}
		for (local958 = 0; local958 < local888.aShort20; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray110[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aBoolean640) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aBoolean640) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aBoolean640) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray22[local958] = (short) local1384;
					local888.aShortArray19[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aBoolean640) {
							local888.anIntArray109[local1079] = Static19.anIntArray30[Static518.method7915(this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aShort116 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aBoolean640) {
							local888.anIntArray109[local1126] = Static19.anIntArray30[Static518.method7915(this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aShort116 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aBoolean640) {
							local888.anIntArray109[local1226] = Static19.anIntArray30[Static518.method7915(this.aClass4_Sub1_18.anInterface13_13.method5789(local1384).aShort116 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray22[local958] = -1;
				}
			}
		}
		this.aClass52ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!cba;[I)V")
	@Override
	public final void method8246(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public final boolean method8250(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8245(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public final Class1_Sub2_Sub2 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub2 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method8249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class128_Sub1 local3 = this.aClass4_Sub1_18.aClass128_Sub1_4;
		this.anInt9579 = -1;
		this.anInt9589 = local3.anInt3783;
		this.anInt9585 = local3.anInt3780;
		this.anInt9590 = local3.anInt3784;
		this.anInt9588 = local3.anInt3781;
		this.anInt9578 = local3.anInt3788;
		this.anInt9587 = local3.anInt3782;
		this.anInt9586 = local3.anInt3785;
		this.anInt9591 = local3.anInt3789;
		this.anInt9582 = local3.anInt3786;
		this.anInt9581 = local3.anInt3790;
		this.anInt9583 = local3.anInt3787;
		this.anInt9584 = local3.anInt3779;
	}

	@OriginalMember(owner = "client!sq", name = "ba", descriptor = "(II)I")
	@Override
	public final int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray126[arg0][arg1];
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Z")
	protected final boolean method8252(@OriginalArg(0) int arg0) {
		if ((this.anInt9580 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}
}
