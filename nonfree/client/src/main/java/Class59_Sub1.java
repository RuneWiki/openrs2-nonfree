import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public abstract class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	protected int anInt9227;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "[[Lclient!iv;")
	protected Class150[][] aClass150ArrayArray3;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	protected int anInt9228;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	protected int anInt9229;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "[[Lclient!ei;")
	protected Class82[][] aClass82ArrayArray3;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "[[Lclient!vu;")
	protected Class347[][] aClass347ArrayArray3;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
	protected int anInt9230;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
	protected int anInt9231;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
	protected int anInt9232;

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
	protected int anInt9233;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
	protected int anInt9234;

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
	protected int anInt9235;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
	protected int anInt9236;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "[[Lclient!cp;")
	protected Class52[][] aClass52ArrayArray3;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
	protected int anInt9238;

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
	protected int anInt9239;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
	protected int anInt9237 = -1;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Lclient!lea;")
	protected final Class14_Sub1 aClass14_Sub1_16;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
	private final int anInt9226;

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "[[I")
	public final int[][] anIntArrayArray86;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[[B")
	private byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "[[B")
	private byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!lea;IIII[[I[[II)V")
	public Class59_Sub1(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass14_Sub1_16 = arg0;
		this.anInt9226 = arg2;
		this.anIntArrayArray86 = arg5;
		this.aByteArrayArray31 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass14_Sub1_16.anInt5840 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass14_Sub1_16.anInt5841 * local92 + this.aClass14_Sub1_16.anInt5832 * local98 + this.aClass14_Sub1_16.anInt5815 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray31[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray32 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public final boolean method7865(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass150ArrayArray3 == null) {
			this.aClass150ArrayArray3 = new Class150[super.anInt9640][super.anInt9639];
			this.aClass82ArrayArray3 = new Class82[super.anInt9640][super.anInt9639];
		} else if (this.aClass52ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt9641 || local70 != 0 && local70 != super.anInt9641) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class82 local95 = new Class82();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort28 = local99;
			local95.aShortArray22 = new short[local99];
			local95.aShortArray20 = new short[local99];
			local95.aShortArray23 = new short[local99];
			local95.aShortArray19 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray22[local124] = (short) (this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9641) {
					local95.aShortArray22[local124] = (short) (this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9641 && local133 == super.anInt9641) {
					local95.aShortArray22[local124] = (short) (this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9641 && local133 == 0) {
					local95.aShortArray22[local124] = (short) (this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]) * (super.anInt9641 - local129) + (this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]) * (super.anInt9641 - local129) + (this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray22[local124] = (short) (local288 * (super.anInt9641 - local133) + local335 * local133 >> super.anInt9638 * 2);
				}
				local288 = (arg0 << super.anInt9638) + local129;
				local335 = (arg1 << super.anInt9638) + local133;
				local95.aShortArray20[local124] = (short) local129;
				local95.aShortArray19[local124] = (short) local133;
				local95.aShortArray23[local124] = (short) (this.sa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray22[local124] < 2) {
					local95.aShortArray22[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass14_Sub1_16.anInterface4_15.method4234(arg11[local288]).aBoolean593) {
					local415 = true;
				}
			}
			local95.anIntArray165 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray166 = new int[local133];
			}
			local95.aShortArray21 = new short[local133];
			local95.aShortArray18 = new short[local133];
			local95.aShortArray15 = new short[local133];
			if (local415) {
				local95.aShortArray17 = new short[local133];
				local95.aShortArray16 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray165[local95.aShort27] = Static402.method5873(arg9[local335]);
					} else {
						local95.anIntArray165[local95.aShort27] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray166[local95.aShort27] = -1;
						} else {
							local95.anIntArray166[local95.aShort27] = Static402.method5873(arg10[local335]);
						}
					}
					local95.aShortArray21[local95.aShort27] = (short) arg6[local335];
					local95.aShortArray18[local95.aShort27] = (short) arg7[local335];
					local95.aShortArray15[local95.aShort27] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass14_Sub1_16.anInterface4_15.method4234(arg11[local335]).aBoolean593) {
							local95.aShortArray17[local95.aShort27] = -1;
						} else {
							local95.aShortArray17[local95.aShort27] = (short) arg11[local335];
							local95.aShortArray16[local95.aShort27] = (short) arg12[local335];
						}
					}
					local95.aShort27++;
				}
			}
			this.aClass82ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class150 local644 = new Class150();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt4322 = Static85.method1643(Static402.method5873(arg10[0]), this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte37 = (byte) (local644.aByte37 | 0x2);
				}
			}
			if (this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1 + 1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0][arg1 + 1]) {
				local644.aByte37 = (byte) (local644.aByte37 | 0x1);
			}
			if (local70 == -1 || (local644.aByte37 & 0x2) != 0 || this.aClass14_Sub1_16.anInterface4_15.method4234(local70).aBoolean593) {
				@Pc(845) short local845 = Static402.method5873(local64);
				local644.aShort40 = (short) Static85.method1643(local845, this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				local644.aShort41 = (short) Static85.method1643(local845, this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]);
				local644.aShort42 = (short) Static85.method1643(local845, this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]);
				local644.aShort38 = (short) Static85.method1643(local845, this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]);
				local644.aShort39 = -1;
			} else {
				local644.aShort40 = (short) (this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				local644.aShort41 = (short) (this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]);
				local644.aShort42 = (short) (this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]);
				local644.aShort38 = (short) (this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]);
				local644.aShort39 = (short) local70;
			}
			this.aClass150ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7864(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public abstract void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gu", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void FA(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!gu", name = "ba", descriptor = "()V")
	@Override
	public final void ba() {
		this.aByteArrayArray31 = null;
		this.aByteArrayArray32 = null;
	}

	@OriginalMember(owner = "client!gu", name = "sa", descriptor = "(II)I")
	@Override
	public final int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9638;
		@Pc(9) int local9 = arg1 >> super.anInt9638;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9640 - 1 || local9 > super.anInt9639 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9641 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9641 - 1;
		@Pc(67) int local67 = this.anIntArrayArray86[local4][local9] * (super.anInt9641 - local34) + this.anIntArrayArray86[local4 + 1][local9] * local34 >> super.anInt9638;
		@Pc(97) int local97 = this.anIntArrayArray86[local4][local9 + 1] * (super.anInt9641 - local34) + this.anIntArrayArray86[local4 + 1][local9 + 1] * local34 >> super.anInt9638;
		return local67 * (super.anInt9641 - local41) + local97 * local41 >> super.anInt9638;
	}

	@OriginalMember(owner = "client!gu", name = "JA", descriptor = "(II)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray86[arg0][arg1];
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class54_Sub1 local3 = this.aClass14_Sub1_16.aClass54_Sub1_7;
		this.anInt9237 = -1;
		this.anInt9227 = local3.anInt1500;
		this.anInt9228 = local3.anInt1505;
		this.anInt9229 = local3.anInt1506;
		this.anInt9231 = local3.anInt1510;
		this.anInt9239 = local3.anInt1503;
		this.anInt9230 = local3.anInt1511;
		this.anInt9238 = local3.anInt1502;
		this.anInt9233 = local3.anInt1501;
		this.anInt9234 = local3.anInt1508;
		this.anInt9232 = local3.anInt1504;
		this.anInt9235 = local3.anInt1507;
		this.anInt9236 = local3.anInt1509;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Z")
	protected final boolean method7559(@OriginalArg(0) int arg0) {
		if ((this.anInt9226 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!gu", name = "EA", descriptor = "(III)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray32[arg0][arg1] < arg2) {
			this.aByteArrayArray32[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public final Class6_Sub2_Sub14 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub14 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!bj;[I)V")
	@Override
	public final void method7866(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass52ArrayArray3 == null) {
			this.aClass52ArrayArray3 = new Class52[super.anInt9640][super.anInt9639];
			this.aClass347ArrayArray3 = new Class347[super.anInt9640][super.anInt9639];
		} else if (this.aClass150ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static50.anIntArray51[Static402.method5873(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static50.anIntArray51[Static402.method5873(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt9641 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9641 && arg4[local116] == super.anInt9641) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9641) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9641 && arg2[local244] != arg2[0] - super.anInt9641) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9641 && arg4[local244] != arg4[0] - super.anInt9641) {
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
			@Pc(334) Class52 local334 = new Class52();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt1485 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte24 = (byte) (local334.aByte24 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1 + 1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0][arg1 + 1]) {
				local334.aByte24 = (byte) (local334.aByte24 | 0x1);
			}
			if (local342 == -1 || (local334.aByte24 & 0x2) != 0 || this.aClass14_Sub1_16.anInterface4_15.method4234(local342).aBoolean593) {
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
				local334.anInt1484 = Static305.method1156(Static602.method7558(arg6[local104] >> 8, this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]), local527, arg10);
				if (local334.anInt1485 != 0) {
					local334.anInt1484 |= this.aByteArrayArray32[arg0][arg1] + 255 - this.aByteArrayArray31[arg0][arg1] << 25;
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
				local334.anInt1486 = Static305.method1156(Static602.method7558(arg6[local106] >> 8, this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt1485 != 0) {
					local334.anInt1486 |= this.aByteArrayArray32[arg0 + 1][arg1] + 255 - this.aByteArrayArray31[arg0 + 1][arg1] << 25;
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
				local334.anInt1482 = Static305.method1156(Static602.method7558(arg6[local108] >> 8, this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt1485 != 0) {
					local334.anInt1482 |= this.aByteArrayArray32[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray31[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt1483 = Static305.method1156(Static602.method7558(arg6[local110] >> 8, this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt1485 != 0) {
					local334.anInt1483 |= this.aByteArrayArray32[arg0][arg1 + 1] + 255 - this.aByteArrayArray31[arg0][arg1 + 1] << 25;
				}
				local334.aShort20 = -1;
			} else {
				local334.anInt1484 = this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1];
				local334.anInt1486 = this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1];
				local334.anInt1482 = this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1];
				local334.anInt1483 = this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1];
				local334.aShort20 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort21 = (short) arg5[local108];
				local334.aShort22 = (short) arg5[local110];
				local334.aShort19 = (short) arg5[local106];
				local334.aShort23 = (short) arg5[local104];
			}
			this.aClass52ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class347 local888 = new Class347();
		local888.aShort116 = (short) arg2.length;
		local888.aShort115 = (short) (arg2.length / 3);
		local888.aShortArray148 = new short[local888.aShort116];
		local888.aShortArray144 = new short[local888.aShort116];
		local888.aShortArray149 = new short[local888.aShort116];
		local888.anIntArray702 = new int[local888.aShort116];
		if (arg5 != null) {
			local888.aShortArray146 = new short[local888.aShort116];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort116; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9641) {
				local958 = this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1];
			} else if (local342 == super.anInt9641 && local527 == super.anInt9641) {
				local958 = this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9641 && local527 == 0) {
				local958 = this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray31[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]) * (super.anInt9641 - local342) + (this.aByteArrayArray31[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray31[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]) * (super.anInt9641 - local342) + (this.aByteArrayArray31[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9641 - local527) + local1126 * local527 >> super.anInt9638 * 2;
			}
			local1079 = (arg0 << super.anInt9638) + local342;
			local1126 = (arg1 << super.anInt9638) + local527;
			local888.aShortArray148[local244] = (short) local342;
			local888.aShortArray149[local244] = (short) local527;
			local888.aShortArray144[local244] = (short) (this.sa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass14_Sub1_16.anInterface4_15.method4234(arg8[local244]).aBoolean593) {
				local888.anIntArray702[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray146[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray702[local244] = Static305.method1156(Static602.method7558(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray702[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray702[local244] = 0;
			} else {
				local888.anIntArray702[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort115; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass14_Sub1_16.anInterface4_15.method4234(arg8[local527 * 3]).aBoolean593) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray701 = new int[local888.aShort115];
		}
		if (local1296) {
			local888.aShortArray147 = new short[local888.aShort115];
			local888.aShortArray145 = new short[local888.aShort115];
		}
		for (local958 = 0; local958 < local888.aShort115; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray701[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aBoolean593) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aBoolean593) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aBoolean593) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray147[local958] = (short) local1384;
					local888.aShortArray145[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aBoolean593) {
							local888.anIntArray702[local1079] = Static50.anIntArray51[Static402.method5873(this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aShort105 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aBoolean593) {
							local888.anIntArray702[local1126] = Static50.anIntArray51[Static402.method5873(this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aShort105 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aBoolean593) {
							local888.anIntArray702[local1226] = Static50.anIntArray51[Static402.method5873(this.aClass14_Sub1_16.anInterface4_15.method4234(local1384).aShort105 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray147[local958] = -1;
				}
			}
		}
		this.aClass347ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!gu", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public final void aa(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}
}
