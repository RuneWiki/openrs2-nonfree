import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public abstract class Class131_Sub2 extends Class131 {

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	protected int anInt8875;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	protected int anInt8876;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	protected int anInt8877;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	protected int anInt8878;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[[Lclient!tw;")
	protected Class286[][] aClass286ArrayArray3;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	protected int anInt8879;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "[[Lclient!kaa;")
	protected Class169[][] aClass169ArrayArray3;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	protected int anInt8882;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	protected int anInt8883;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	protected int anInt8884;

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "[[Lclient!uv;")
	protected Class297[][] aClass297ArrayArray3;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	protected int anInt8885;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	protected int anInt8886;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	protected int anInt8887;

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
	protected int anInt8888;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "[[Lclient!mk;")
	protected Class198[][] aClass198ArrayArray3;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	protected int anInt8881 = -1;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "Lclient!vda;")
	protected final Class62_Sub2 aClass62_Sub2_16;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	private final int anInt8880;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray52;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray51;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!vda;IIII[[I[[II)V")
	public Class131_Sub2(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass62_Sub2_16 = arg0;
		this.anInt8880 = arg2;
		this.anIntArrayArray78 = arg5;
		this.aByteArrayArray52 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass62_Sub2_16.anInt8668 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass62_Sub2_16.anInt8688 * local92 + this.aClass62_Sub2_16.anInt8680 * local98 + this.aClass62_Sub2_16.anInt8691 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray52[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray51 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass286ArrayArray3 == null) {
			this.aClass286ArrayArray3 = new Class286[super.anInt8873][super.anInt8871];
			this.aClass169ArrayArray3 = new Class169[super.anInt8873][super.anInt8871];
		} else if (this.aClass198ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt8874 || local70 != 0 && local70 != super.anInt8874) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class169 local95 = new Class169();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort61 = local99;
			local95.aShortArray58 = new short[local99];
			local95.aShortArray54 = new short[local99];
			local95.aShortArray55 = new short[local99];
			local95.aShortArray59 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt8874) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]);
				} else if (local129 == super.anInt8874 && local133 == super.anInt8874) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt8874 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]) * (super.anInt8874 - local129) + (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]) * (super.anInt8874 - local129) + (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray58[local124] = (short) (local288 * (super.anInt8874 - local133) + local335 * local133 >> super.anInt8869 * 2);
				}
				local288 = (arg0 << super.anInt8869) + local129;
				local335 = (arg1 << super.anInt8869) + local133;
				local95.aShortArray54[local124] = (short) local129;
				local95.aShortArray59[local124] = (short) local133;
				local95.aShortArray55[local124] = (short) (this.aa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray58[local124] < 2) {
					local95.aShortArray58[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass62_Sub2_16.anInterface8_145.method7237(arg11[local288]).aBoolean566) {
					local415 = true;
				}
			}
			local95.anIntArray313 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray314 = new int[local133];
			}
			local95.aShortArray56 = new short[local133];
			local95.aShortArray53 = new short[local133];
			local95.aShortArray57 = new short[local133];
			if (local415) {
				local95.aShortArray52 = new short[local133];
				local95.aShortArray51 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray313[local95.aShort62] = Static153.method2803(arg9[local335]);
					} else {
						local95.anIntArray313[local95.aShort62] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray314[local95.aShort62] = -1;
						} else {
							local95.anIntArray314[local95.aShort62] = Static153.method2803(arg10[local335]);
						}
					}
					local95.aShortArray56[local95.aShort62] = (short) arg6[local335];
					local95.aShortArray53[local95.aShort62] = (short) arg7[local335];
					local95.aShortArray57[local95.aShort62] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass62_Sub2_16.anInterface8_145.method7237(arg11[local335]).aBoolean566) {
							local95.aShortArray52[local95.aShort62] = -1;
						} else {
							local95.aShortArray52[local95.aShort62] = (short) arg11[local335];
							local95.aShortArray51[local95.aShort62] = (short) arg12[local335];
						}
					}
					local95.aShort62++;
				}
			}
			this.aClass169ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class286 local644 = new Class286();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt8345 = Static413.method7354(Static153.method2803(arg10[0]), this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte89 = (byte) (local644.aByte89 | 0x2);
				}
			}
			if (this.anIntArrayArray78[arg0][arg1] == this.anIntArrayArray78[arg0 + 1][arg1] && this.anIntArrayArray78[arg0][arg1] == this.anIntArrayArray78[arg0 + 1][arg1 + 1] && this.anIntArrayArray78[arg0][arg1] == this.anIntArrayArray78[arg0][arg1 + 1]) {
				local644.aByte89 = (byte) (local644.aByte89 | 0x1);
			}
			if (local70 == -1 || (local644.aByte89 & 0x2) != 0 || this.aClass62_Sub2_16.anInterface8_145.method7237(local70).aBoolean566) {
				@Pc(845) short local845 = Static153.method2803(local64);
				local644.aShort105 = (short) Static413.method7354(local845, this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]);
				local644.aShort106 = (short) Static413.method7354(local845, this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]);
				local644.aShort102 = (short) Static413.method7354(local845, this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]);
				local644.aShort104 = (short) Static413.method7354(local845, this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]);
				local644.aShort103 = -1;
			} else {
				local644.aShort105 = (short) (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]);
				local644.aShort106 = (short) (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]);
				local644.aShort102 = (short) (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]);
				local644.aShort104 = (short) (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]);
				local644.aShort103 = (short) local70;
			}
			this.aClass286ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!uca;[I)V")
	@Override
	public final void method7187(@OriginalArg(0) Class5_Sub10 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7182(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public final boolean method7185(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class78_Sub2 local3 = this.aClass62_Sub2_16.aClass78_Sub2_8;
		this.anInt8881 = -1;
		this.anInt8875 = local3.anInt5271;
		this.anInt8878 = local3.anInt5273;
		this.anInt8885 = local3.anInt5272;
		this.anInt8883 = local3.anInt5275;
		this.anInt8888 = local3.anInt5281;
		this.anInt8884 = local3.anInt5270;
		this.anInt8876 = local3.anInt5274;
		this.anInt8886 = local3.anInt5276;
		this.anInt8877 = local3.anInt5278;
		this.anInt8887 = local3.anInt5280;
		this.anInt8882 = local3.anInt5279;
		this.anInt8879 = local3.anInt5277;
	}

	@OriginalMember(owner = "client!pq", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public final Class5_Sub2_Sub13 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub13 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public abstract void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pq", name = "ba", descriptor = "(II)I")
	@Override
	public final int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray78[arg0][arg1];
	}

	@OriginalMember(owner = "client!pq", name = "aa", descriptor = "(II)I")
	@Override
	public final int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt8869;
		@Pc(9) int local9 = arg1 >> super.anInt8869;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt8873 - 1 || local9 > super.anInt8871 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt8874 - 1;
		@Pc(41) int local41 = arg1 & super.anInt8874 - 1;
		@Pc(67) int local67 = this.anIntArrayArray78[local4][local9] * (super.anInt8874 - local34) + this.anIntArrayArray78[local4 + 1][local9] * local34 >> super.anInt8869;
		@Pc(97) int local97 = this.anIntArrayArray78[local4][local9 + 1] * (super.anInt8874 - local34) + this.anIntArrayArray78[local4 + 1][local9 + 1] * local34 >> super.anInt8869;
		return local67 * (super.anInt8874 - local41) + local97 * local41 >> super.anInt8869;
	}

	@OriginalMember(owner = "client!pq", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void ya(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void F(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pq", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass198ArrayArray3 == null) {
			this.aClass198ArrayArray3 = new Class198[super.anInt8873][super.anInt8871];
			this.aClass297ArrayArray3 = new Class297[super.anInt8873][super.anInt8871];
		} else if (this.aClass286ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static403.anIntArray560[Static153.method2803(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static403.anIntArray560[Static153.method2803(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt8874 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt8874 && arg4[local116] == super.anInt8874) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt8874) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt8874 && arg2[local244] != arg2[0] - super.anInt8874) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt8874 && arg4[local244] != arg4[0] - super.anInt8874) {
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
			@Pc(334) Class198 local334 = new Class198();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt6071 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte57 = (byte) (local334.aByte57 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray78[arg0][arg1] == this.anIntArrayArray78[arg0 + 1][arg1] && this.anIntArrayArray78[arg0][arg1] == this.anIntArrayArray78[arg0 + 1][arg1 + 1] && this.anIntArrayArray78[arg0][arg1] == this.anIntArrayArray78[arg0][arg1 + 1]) {
				local334.aByte57 = (byte) (local334.aByte57 | 0x1);
			}
			if (local342 == -1 || (local334.aByte57 & 0x2) != 0 || this.aClass62_Sub2_16.anInterface8_145.method7237(local342).aBoolean566) {
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
				local334.anInt6069 = Static158.method2887(Static556.method7191(arg6[local104] >> 8, this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]), local527, arg10);
				if (local334.anInt6071 != 0) {
					local334.anInt6069 |= this.aByteArrayArray51[arg0][arg1] + 255 - this.aByteArrayArray52[arg0][arg1] << 25;
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
				local334.anInt6070 = Static158.method2887(Static556.method7191(arg6[local106] >> 8, this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt6071 != 0) {
					local334.anInt6070 |= this.aByteArrayArray51[arg0 + 1][arg1] + 255 - this.aByteArrayArray52[arg0 + 1][arg1] << 25;
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
				local334.anInt6072 = Static158.method2887(Static556.method7191(arg6[local108] >> 8, this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt6071 != 0) {
					local334.anInt6072 |= this.aByteArrayArray51[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray52[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt6068 = Static158.method2887(Static556.method7191(arg6[local110] >> 8, this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt6071 != 0) {
					local334.anInt6068 |= this.aByteArrayArray51[arg0][arg1 + 1] + 255 - this.aByteArrayArray52[arg0][arg1 + 1] << 25;
				}
				local334.aShort79 = -1;
			} else {
				local334.anInt6069 = this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1];
				local334.anInt6070 = this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1];
				local334.anInt6072 = this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1];
				local334.anInt6068 = this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1];
				local334.aShort79 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort83 = (short) arg5[local108];
				local334.aShort80 = (short) arg5[local110];
				local334.aShort81 = (short) arg5[local106];
				local334.aShort82 = (short) arg5[local104];
			}
			this.aClass198ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class297 local888 = new Class297();
		local888.aShort114 = (short) arg2.length;
		local888.aShort113 = (short) (arg2.length / 3);
		local888.aShortArray133 = new short[local888.aShort114];
		local888.aShortArray130 = new short[local888.aShort114];
		local888.aShortArray131 = new short[local888.aShort114];
		local888.anIntArray667 = new int[local888.aShort114];
		if (arg5 != null) {
			local888.aShortArray135 = new short[local888.aShort114];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort114; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt8874) {
				local958 = this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1];
			} else if (local342 == super.anInt8874 && local527 == super.anInt8874) {
				local958 = this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt8874 && local527 == 0) {
				local958 = this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray52[arg0][arg1] - this.aByteArrayArray51[arg0][arg1]) * (super.anInt8874 - local342) + (this.aByteArrayArray52[arg0 + 1][arg1] - this.aByteArrayArray51[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray52[arg0][arg1 + 1] - this.aByteArrayArray51[arg0][arg1 + 1]) * (super.anInt8874 - local342) + (this.aByteArrayArray52[arg0 + 1][arg1 + 1] - this.aByteArrayArray51[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt8874 - local527) + local1126 * local527 >> super.anInt8869 * 2;
			}
			local1079 = (arg0 << super.anInt8869) + local342;
			local1126 = (arg1 << super.anInt8869) + local527;
			local888.aShortArray133[local244] = (short) local342;
			local888.aShortArray131[local244] = (short) local527;
			local888.aShortArray130[local244] = (short) (this.aa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass62_Sub2_16.anInterface8_145.method7237(arg8[local244]).aBoolean566) {
				local888.anIntArray667[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray135[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray667[local244] = Static158.method2887(Static556.method7191(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray667[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray667[local244] = 0;
			} else {
				local888.anIntArray667[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort113; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass62_Sub2_16.anInterface8_145.method7237(arg8[local527 * 3]).aBoolean566) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray666 = new int[local888.aShort113];
		}
		if (local1296) {
			local888.aShortArray134 = new short[local888.aShort113];
			local888.aShortArray132 = new short[local888.aShort113];
		}
		for (local958 = 0; local958 < local888.aShort113; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray666[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aBoolean566) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aBoolean566) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aBoolean566) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray134[local958] = (short) local1384;
					local888.aShortArray132[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aBoolean566) {
							local888.anIntArray667[local1079] = Static403.anIntArray560[Static153.method2803(this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aShort100 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aBoolean566) {
							local888.anIntArray667[local1126] = Static403.anIntArray560[Static153.method2803(this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aShort100 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aBoolean566) {
							local888.anIntArray667[local1226] = Static403.anIntArray560[Static153.method2803(this.aClass62_Sub2_16.anInterface8_145.method7237(local1384).aShort100 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray134[local958] = -1;
				}
			}
		}
		this.aClass297ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "(III)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray51[arg0][arg1] < arg2) {
			this.aByteArrayArray51[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z")
	protected final boolean method7192(@OriginalArg(0) int arg0) {
		if ((this.anInt8880 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "()V")
	@Override
	public final void N() {
		this.aByteArrayArray52 = null;
		this.aByteArrayArray51 = null;
	}
}
