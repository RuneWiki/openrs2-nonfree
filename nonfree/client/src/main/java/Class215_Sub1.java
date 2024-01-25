import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public abstract class Class215_Sub1 extends Class215 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "[[Lclient!laa;")
	protected Class180[][] aClass180ArrayArray3;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	protected int anInt9454;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	protected int anInt9455;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "[[Lclient!pw;")
	protected Class245[][] aClass245ArrayArray3;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "[[Lclient!rl;")
	protected Class263[][] aClass263ArrayArray3;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	protected int anInt9456;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	protected int anInt9457;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "[[Lclient!tu;")
	protected Class289[][] aClass289ArrayArray3;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
	protected int anInt9458;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
	protected int anInt9459;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	protected int anInt9460;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
	protected int anInt9461;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
	protected int anInt9462;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
	protected int anInt9464;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
	protected int anInt9465;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
	protected int anInt9467;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
	protected int anInt9463 = -1;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!et;")
	protected final Class42_Sub2 aClass42_Sub2_18;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
	private final int anInt9466;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray86;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!et;IIII[[I[[II)V")
	public Class215_Sub1(@OriginalArg(0) Class42_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass42_Sub2_18 = arg0;
		this.anInt9466 = arg2;
		this.anIntArrayArray86 = arg5;
		this.aByteArrayArray33 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass42_Sub2_18.anInt5346 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass42_Sub2_18.anInt5340 * local92 + this.aClass42_Sub2_18.anInt5354 * local98 + this.aClass42_Sub2_18.anInt5337 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray33[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray32 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass263ArrayArray3 == null) {
			this.aClass263ArrayArray3 = new Class263[super.anInt9452][super.anInt9450];
			this.aClass289ArrayArray3 = new Class289[super.anInt9452][super.anInt9450];
		} else if (this.aClass180ArrayArray3 != null) {
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
				if (local64 != 0 && local64 != super.anInt9451 || local70 != 0 && local70 != super.anInt9451) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class289 local95 = new Class289();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort107 = local99;
			local95.aShortArray122 = new short[local99];
			local95.aShortArray117 = new short[local99];
			local95.aShortArray121 = new short[local99];
			local95.aShortArray120 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray122[local124] = (short) (this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt9451) {
					local95.aShortArray122[local124] = (short) (this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]);
				} else if (local129 == super.anInt9451 && local133 == super.anInt9451) {
					local95.aShortArray122[local124] = (short) (this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt9451 && local133 == 0) {
					local95.aShortArray122[local124] = (short) (this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]) * (super.anInt9451 - local129) + (this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]) * (super.anInt9451 - local129) + (this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray122[local124] = (short) (local288 * (super.anInt9451 - local133) + local335 * local133 >> super.anInt9453 * 2);
				}
				local288 = (arg0 << super.anInt9453) + local129;
				local335 = (arg1 << super.anInt9453) + local133;
				local95.aShortArray117[local124] = (short) local129;
				local95.aShortArray120[local124] = (short) local133;
				local95.aShortArray121[local124] = (short) (this.aa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray122[local124] < 2) {
					local95.aShortArray122[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass42_Sub2_18.anInterface11_11.method6215(arg11[local288]).aBoolean568) {
					local415 = true;
				}
			}
			local95.anIntArray648 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray647 = new int[local133];
			}
			local95.aShortArray123 = new short[local133];
			local95.aShortArray124 = new short[local133];
			local95.aShortArray125 = new short[local133];
			if (local415) {
				local95.aShortArray119 = new short[local133];
				local95.aShortArray118 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray648[local95.aShort106] = Static514.method1477(arg9[local335]);
					} else {
						local95.anIntArray648[local95.aShort106] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray647[local95.aShort106] = -1;
						} else {
							local95.anIntArray647[local95.aShort106] = Static514.method1477(arg10[local335]);
						}
					}
					local95.aShortArray123[local95.aShort106] = (short) arg6[local335];
					local95.aShortArray124[local95.aShort106] = (short) arg7[local335];
					local95.aShortArray125[local95.aShort106] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass42_Sub2_18.anInterface11_11.method6215(arg11[local335]).aBoolean568) {
							local95.aShortArray119[local95.aShort106] = -1;
						} else {
							local95.aShortArray119[local95.aShort106] = (short) arg11[local335];
							local95.aShortArray118[local95.aShort106] = (short) arg12[local335];
						}
					}
					local95.aShort106++;
				}
			}
			this.aClass289ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class263 local644 = new Class263();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt7960 = Static282.method4653(Static514.method1477(arg10[0]), this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte81 = (byte) (local644.aByte81 | 0x2);
				}
			}
			if (this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1 + 1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0][arg1 + 1]) {
				local644.aByte81 = (byte) (local644.aByte81 | 0x1);
			}
			if (local70 == -1 || (local644.aByte81 & 0x2) != 0 || this.aClass42_Sub2_18.anInterface11_11.method6215(local70).aBoolean568) {
				@Pc(845) short local845 = Static514.method1477(local64);
				local644.aShort92 = (short) Static282.method4653(local845, this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				local644.aShort91 = (short) Static282.method4653(local845, this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]);
				local644.aShort95 = (short) Static282.method4653(local845, this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]);
				local644.aShort94 = (short) Static282.method4653(local845, this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]);
				local644.aShort93 = -1;
			} else {
				local644.aShort92 = (short) (this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]);
				local644.aShort91 = (short) (this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]);
				local644.aShort95 = (short) (this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]);
				local644.aShort94 = (short) (this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]);
				local644.aShort93 = (short) local70;
			}
			this.aClass263ArrayArray3[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!rh;[I)V")
	@Override
	public final void method7834(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public abstract void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "()V")
	@Override
	public final void N() {
		this.aByteArrayArray33 = null;
		this.aByteArrayArray32 = null;
	}

	@OriginalMember(owner = "client!ng", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void ya(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ng", name = "Q", descriptor = "(III)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray32[arg0][arg1] < arg2) {
			this.aByteArrayArray32[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method7835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class91_Sub3 local3 = this.aClass42_Sub2_18.aClass91_Sub3_7;
		this.anInt9463 = -1;
		this.anInt9464 = local3.anInt8572;
		this.anInt9465 = local3.anInt8571;
		this.anInt9455 = local3.anInt8574;
		this.anInt9461 = local3.anInt8570;
		this.anInt9458 = local3.anInt8567;
		this.anInt9456 = local3.anInt8564;
		this.anInt9457 = local3.anInt8565;
		this.anInt9459 = local3.anInt8569;
		this.anInt9462 = local3.anInt8573;
		this.anInt9467 = local3.anInt8575;
		this.anInt9460 = local3.anInt8568;
		this.anInt9454 = local3.anInt8566;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7836(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void F(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ng", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass180ArrayArray3 == null) {
			this.aClass180ArrayArray3 = new Class180[super.anInt9452][super.anInt9450];
			this.aClass245ArrayArray3 = new Class245[super.anInt9452][super.anInt9450];
		} else if (this.aClass263ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static69.anIntArray673[Static514.method1477(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static69.anIntArray673[Static514.method1477(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt9451 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt9451 && arg4[local116] == super.anInt9451) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt9451) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt9451 && arg2[local244] != arg2[0] - super.anInt9451) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt9451 && arg4[local244] != arg4[0] - super.anInt9451) {
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
			@Pc(334) Class180 local334 = new Class180();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt5398 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte65 = (byte) (local334.aByte65 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0 + 1][arg1 + 1] && this.anIntArrayArray86[arg0][arg1] == this.anIntArrayArray86[arg0][arg1 + 1]) {
				local334.aByte65 = (byte) (local334.aByte65 | 0x1);
			}
			if (local342 == -1 || (local334.aByte65 & 0x2) != 0 || this.aClass42_Sub2_18.anInterface11_11.method6215(local342).aBoolean568) {
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
				local334.anInt5395 = Static254.method4368(Static556.method7843(arg6[local104] >> 8, this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]), arg10, local527);
				if (local334.anInt5398 != 0) {
					local334.anInt5395 |= this.aByteArrayArray32[arg0][arg1] + 255 - this.aByteArrayArray33[arg0][arg1] << 25;
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
				local334.anInt5399 = Static254.method4368(Static556.method7843(arg6[local106] >> 8, this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]), arg10, local527);
				if (local334.anInt5398 != 0) {
					local334.anInt5399 |= this.aByteArrayArray32[arg0 + 1][arg1] + 255 - this.aByteArrayArray33[arg0 + 1][arg1] << 25;
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
				local334.anInt5397 = Static254.method4368(Static556.method7843(arg6[local108] >> 8, this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]), arg10, local527);
				if (local334.anInt5398 != 0) {
					local334.anInt5397 |= this.aByteArrayArray32[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray33[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt5396 = Static254.method4368(Static556.method7843(arg6[local110] >> 8, this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]), arg10, local527);
				if (local334.anInt5398 != 0) {
					local334.anInt5396 |= this.aByteArrayArray32[arg0][arg1 + 1] + 255 - this.aByteArrayArray33[arg0][arg1 + 1] << 25;
				}
				local334.aShort70 = -1;
			} else {
				local334.anInt5395 = this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1];
				local334.anInt5399 = this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1];
				local334.anInt5397 = this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1];
				local334.anInt5396 = this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1];
				local334.aShort70 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort74 = (short) arg5[local108];
				local334.aShort72 = (short) arg5[local110];
				local334.aShort73 = (short) arg5[local106];
				local334.aShort71 = (short) arg5[local104];
			}
			this.aClass180ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class245 local888 = new Class245();
		local888.aShort89 = (short) arg2.length;
		local888.aShort90 = (short) (arg2.length / 3);
		local888.aShortArray102 = new short[local888.aShort89];
		local888.aShortArray100 = new short[local888.aShort89];
		local888.aShortArray97 = new short[local888.aShort89];
		local888.anIntArray491 = new int[local888.aShort89];
		if (arg5 != null) {
			local888.aShortArray101 = new short[local888.aShort89];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort89; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt9451) {
				local958 = this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1];
			} else if (local342 == super.anInt9451 && local527 == super.anInt9451) {
				local958 = this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt9451 && local527 == 0) {
				local958 = this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray33[arg0][arg1] - this.aByteArrayArray32[arg0][arg1]) * (super.anInt9451 - local342) + (this.aByteArrayArray33[arg0 + 1][arg1] - this.aByteArrayArray32[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray33[arg0][arg1 + 1] - this.aByteArrayArray32[arg0][arg1 + 1]) * (super.anInt9451 - local342) + (this.aByteArrayArray33[arg0 + 1][arg1 + 1] - this.aByteArrayArray32[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt9451 - local527) + local1126 * local527 >> super.anInt9453 * 2;
			}
			local1079 = (arg0 << super.anInt9453) + local342;
			local1126 = (arg1 << super.anInt9453) + local527;
			local888.aShortArray102[local244] = (short) local342;
			local888.aShortArray97[local244] = (short) local527;
			local888.aShortArray100[local244] = (short) (this.aa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass42_Sub2_18.anInterface11_11.method6215(arg8[local244]).aBoolean568) {
				local888.anIntArray491[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray101[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray491[local244] = Static254.method4368(Static556.method7843(arg6[local244] >> 8, local958), arg10, local1226);
				if (arg7 != null) {
					local888.anIntArray491[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray491[local244] = 0;
			} else {
				local888.anIntArray491[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort90; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass42_Sub2_18.anInterface11_11.method6215(arg8[local527 * 3]).aBoolean568) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray492 = new int[local888.aShort90];
		}
		if (local1296) {
			local888.aShortArray98 = new short[local888.aShort90];
			local888.aShortArray99 = new short[local888.aShort90];
		}
		for (local958 = 0; local958 < local888.aShort90; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray492[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aBoolean568) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aBoolean568) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aBoolean568) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray98[local958] = (short) local1384;
					local888.aShortArray99[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aBoolean568) {
							local888.anIntArray491[local1079] = Static69.anIntArray673[Static514.method1477(this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aShort96 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aBoolean568) {
							local888.anIntArray491[local1126] = Static69.anIntArray673[Static514.method1477(this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aShort96 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aBoolean568) {
							local888.anIntArray491[local1226] = Static69.anIntArray673[Static514.method1477(this.aClass42_Sub2_18.anInterface11_11.method6215(local1384).aShort96 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray98[local958] = -1;
				}
			}
		}
		this.aClass245ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public final boolean method7839(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Z")
	protected final boolean method7844(@OriginalArg(0) int arg0) {
		if ((this.anInt9466 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!ng", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public final Class12_Sub4_Sub10 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub4_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "ba", descriptor = "(II)I")
	@Override
	public final int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray86[arg0][arg1];
	}

	@OriginalMember(owner = "client!ng", name = "aa", descriptor = "(II)I")
	@Override
	public final int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt9453;
		@Pc(9) int local9 = arg1 >> super.anInt9453;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt9452 - 1 || local9 > super.anInt9450 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt9451 - 1;
		@Pc(41) int local41 = arg1 & super.anInt9451 - 1;
		@Pc(67) int local67 = this.anIntArrayArray86[local4][local9] * (super.anInt9451 - local34) + this.anIntArrayArray86[local4 + 1][local9] * local34 >> super.anInt9453;
		@Pc(97) int local97 = this.anIntArrayArray86[local4][local9 + 1] * (super.anInt9451 - local34) + this.anIntArrayArray86[local4 + 1][local9 + 1] * local34 >> super.anInt9453;
		return local67 * (super.anInt9451 - local41) + local97 * local41 >> super.anInt9453;
	}
}
