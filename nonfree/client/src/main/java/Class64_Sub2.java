import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "[[Lclient!to;")
	private Class236[][] aClass236ArrayArray1;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	private int anInt2491;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	private int anInt2492;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "[[Lclient!ov;")
	private Class186[][] aClass186ArrayArray1;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	private int anInt2495;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	private int anInt2496;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	private int anInt2497;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	private int anInt2500;

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	private int anInt2501;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "[[Lclient!on;")
	private Class183[][] aClass183ArrayArray1;

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
	private int anInt2502;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "[[Lclient!il;")
	private Class119[][] aClass119ArrayArray1;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	private int anInt2493 = -1;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Lclient!cv;")
	private final Class49_Sub1 aClass49_Sub1_5;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	private final int anInt2489;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!cv;IIII[[I[[II)V")
	public Class64_Sub2(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass49_Sub1_5 = arg0;
		this.anInt2489 = arg2;
		this.anIntArrayArray18 = arg5;
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass49_Sub1_5.anInt1267 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass49_Sub1_5.anInt1262 * local92 + this.aClass49_Sub1_5.anInt1275 * local98 + this.aClass49_Sub1_5.anInt1272 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray18[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass186ArrayArray1 == null) {
			this.aClass186ArrayArray1 = new Class186[super.anInt2934][super.anInt2928];
			this.aClass119ArrayArray1 = new Class119[super.anInt2934][super.anInt2928];
		} else if (this.aClass236ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static244.anIntArray595[Static70.method1330(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static244.anIntArray595[Static70.method1330(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt2927 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt2927 && arg4[local116] == super.anInt2927) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt2927) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt2927 && arg2[local244] != arg2[0] - super.anInt2927) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt2927 && arg4[local244] != arg4[0] - super.anInt2927) {
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
			@Pc(334) Class186 local334 = new Class186();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt5276 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte84 = (byte) (local334.aByte84 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray18[arg0][arg1] == this.anIntArrayArray18[arg0 + 1][arg1] && this.anIntArrayArray18[arg0][arg1] == this.anIntArrayArray18[arg0 + 1][arg1 + 1] && this.anIntArrayArray18[arg0][arg1] == this.anIntArrayArray18[arg0][arg1 + 1]) {
				local334.aByte84 = (byte) (local334.aByte84 | 0x1);
			}
			if (local342 == -1 || (local334.aByte84 & 0x2) != 0 || this.aClass49_Sub1_5.anInterface4_6.method3794(local342).aBoolean293) {
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
				local334.anInt5277 = Static317.method4491(local527, Static458.method1959(arg6[local104] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]), arg10);
				if (local334.anInt5276 != 0) {
					local334.anInt5277 |= this.aByteArrayArray19[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
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
				local334.anInt5275 = Static317.method4491(local527, Static458.method1959(arg6[local106] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]), arg10);
				if (local334.anInt5276 != 0) {
					local334.anInt5275 |= this.aByteArrayArray19[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
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
				local334.anInt5279 = Static317.method4491(local527, Static458.method1959(arg6[local108] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt5276 != 0) {
					local334.anInt5279 |= this.aByteArrayArray19[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt5278 = Static317.method4491(local527, Static458.method1959(arg6[local110] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]), arg10);
				if (local334.anInt5276 != 0) {
					local334.anInt5278 |= this.aByteArrayArray19[arg0][arg1 + 1] + 255 - this.aByteArrayArray18[arg0][arg1 + 1] << 25;
				}
				local334.aShort82 = -1;
			} else {
				local334.anInt5277 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
				local334.anInt5275 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
				local334.anInt5279 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
				local334.anInt5278 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
				local334.aShort82 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort83 = (short) arg5[local108];
				local334.aShort81 = (short) arg5[local110];
				local334.aShort80 = (short) arg5[local106];
				local334.aShort84 = (short) arg5[local104];
			}
			this.aClass186ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class119 local888 = new Class119();
		local888.aShort41 = (short) arg2.length;
		local888.aShort40 = (short) (arg2.length / 3);
		local888.aShortArray39 = new short[local888.aShort41];
		local888.aShortArray37 = new short[local888.aShort41];
		local888.aShortArray41 = new short[local888.aShort41];
		local888.anIntArray295 = new int[local888.aShort41];
		if (arg5 != null) {
			local888.aShortArray38 = new short[local888.aShort41];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort41; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt2927) {
				local958 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
			} else if (local342 == super.anInt2927 && local527 == super.anInt2927) {
				local958 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt2927 && local527 == 0) {
				local958 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt2927 - local342) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt2927 - local342) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt2927 - local527) + local1126 * local527 >> super.anInt2932 * 2;
			}
			local1079 = (arg0 << super.anInt2932) + local342;
			local1126 = (arg1 << super.anInt2932) + local527;
			local888.aShortArray39[local244] = (short) local342;
			local888.aShortArray41[local244] = (short) local527;
			local888.aShortArray37[local244] = (short) (this.a(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass49_Sub1_5.anInterface4_6.method3794(arg8[local244]).aBoolean293) {
				local888.anIntArray295[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray38[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray295[local244] = Static317.method4491(local1226, Static458.method1959(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray295[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray295[local244] = 0;
			} else {
				local888.anIntArray295[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort40; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass49_Sub1_5.anInterface4_6.method3794(arg8[local527 * 3]).aBoolean293) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray294 = new int[local888.aShort40];
		}
		if (local1296) {
			local888.aShortArray40 = new short[local888.aShort40];
			local888.aShortArray42 = new short[local888.aShort40];
		}
		for (local958 = 0; local958 < local888.aShort40; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray294[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aBoolean293) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aBoolean293) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aBoolean293) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray40[local958] = (short) local1384;
					local888.aShortArray42[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aBoolean293) {
							local888.anIntArray295[local1079] = Static244.anIntArray595[Static70.method1330(this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aShort44 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aBoolean293) {
							local888.anIntArray295[local1126] = Static244.anIntArray595[Static70.method1330(this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aShort44 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aBoolean293) {
							local888.anIntArray295[local1226] = Static244.anIntArray595[Static70.method1330(this.aClass49_Sub1_5.anInterface4_6.method3794(local1384).aShort44 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray40[local958] = -1;
				}
			}
		}
		this.aClass119ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method2352(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2356(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class52 local4 = this.aClass49_Sub1_5.method1088(Thread.currentThread());
		@Pc(7) Class21 local7 = local4.aClass21_1;
		local7.anInt556 = 0;
		local7.aBoolean23 = false;
		if (this.aClass186ArrayArray1 != null) {
			this.method1958(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray98, local4.anIntArray103);
		} else if (this.aClass236ArrayArray1 != null) {
			this.method1955(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray98, local4.anIntArray103);
		}
	}

	@OriginalMember(owner = "client!fh", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		this.aByteArrayArray18 = null;
		this.aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method2351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass236ArrayArray1 == null) {
			this.aClass236ArrayArray1 = new Class236[super.anInt2934][super.anInt2928];
			this.aClass183ArrayArray1 = new Class183[super.anInt2934][super.anInt2928];
		} else if (this.aClass186ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt2927 || local70 != 0 && local70 != super.anInt2927) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class183 local95 = new Class183();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort73 = local99;
			local95.aShortArray87 = new short[local99];
			local95.aShortArray84 = new short[local99];
			local95.aShortArray82 = new short[local99];
			local95.aShortArray86 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt2927) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				} else if (local129 == super.anInt2927 && local133 == super.anInt2927) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt2927 && local133 == 0) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt2927 - local129) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt2927 - local129) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray87[local124] = (short) (local288 * (super.anInt2927 - local133) + local335 * local133 >> super.anInt2932 * 2);
				}
				local288 = (arg0 << super.anInt2932) + local129;
				local335 = (arg1 << super.anInt2932) + local133;
				local95.aShortArray84[local124] = (short) local129;
				local95.aShortArray86[local124] = (short) local133;
				local95.aShortArray82[local124] = (short) (this.a(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray87[local124] < 2) {
					local95.aShortArray87[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass49_Sub1_5.anInterface4_6.method3794(arg11[local288]).aBoolean293) {
					local415 = true;
				}
			}
			local95.anIntArray420 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray421 = new int[local133];
			}
			local95.aShortArray79 = new short[local133];
			local95.aShortArray83 = new short[local133];
			local95.aShortArray81 = new short[local133];
			if (local415) {
				local95.aShortArray80 = new short[local133];
				local95.aShortArray85 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray420[local95.aShort74] = Static70.method1330(arg9[local335]);
					} else {
						local95.anIntArray420[local95.aShort74] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray421[local95.aShort74] = -1;
						} else {
							local95.anIntArray421[local95.aShort74] = Static70.method1330(arg10[local335]);
						}
					}
					local95.aShortArray79[local95.aShort74] = (short) arg6[local335];
					local95.aShortArray83[local95.aShort74] = (short) arg7[local335];
					local95.aShortArray81[local95.aShort74] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass49_Sub1_5.anInterface4_6.method3794(arg11[local335]).aBoolean293) {
							local95.aShortArray80[local95.aShort74] = -1;
						} else {
							local95.aShortArray80[local95.aShort74] = (short) arg11[local335];
							local95.aShortArray85[local95.aShort74] = (short) arg12[local335];
						}
					}
					local95.aShort74++;
				}
			}
			this.aClass183ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class236 local644 = new Class236();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt6456 = Static362.method4946(Static70.method1330(arg10[0]), this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte96 = (byte) (local644.aByte96 | 0x2);
				}
			}
			if (this.anIntArrayArray18[arg0][arg1] == this.anIntArrayArray18[arg0 + 1][arg1] && this.anIntArrayArray18[arg0][arg1] == this.anIntArrayArray18[arg0 + 1][arg1 + 1] && this.anIntArrayArray18[arg0][arg1] == this.anIntArrayArray18[arg0][arg1 + 1]) {
				local644.aByte96 = (byte) (local644.aByte96 | 0x1);
			}
			if (local70 == -1 || (local644.aByte96 & 0x2) != 0 || this.aClass49_Sub1_5.anInterface4_6.method3794(local70).aBoolean293) {
				@Pc(845) short local845 = Static70.method1330(local64);
				local644.aShort92 = (short) Static362.method4946(local845, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local644.aShort91 = (short) Static362.method4946(local845, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local644.aShort89 = (short) Static362.method4946(local845, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local644.aShort90 = (short) Static362.method4946(local845, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local644.aShort93 = -1;
			} else {
				local644.aShort92 = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local644.aShort91 = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local644.aShort89 = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local644.aShort90 = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local644.aShort93 = (short) local70;
			}
			this.aClass236ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray19[arg0][arg1] < arg2) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII[[ZLclient!be;[I[I)V")
	private void method1955(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class21 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean24 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass236ArrayArray1[local22][local25] != null) {
						@Pc(50) Class236 local50 = this.aClass236ArrayArray1[local22][local25];
						if (local50.aShort93 != -1 && (local50.aByte96 & 0x2) == 0 && local50.anInt6456 == -1) {
							local69 = this.aClass49_Sub1_5.method1092(local50.aShort93);
							arg5.method470(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static362.method4946(local69, local50.aShort89 & 0xFFFF), Static362.method4946(local69, local50.aShort90 & 0xFFFF), Static362.method4946(local69, local50.aShort91 & 0xFFFF));
							arg5.method470(local20, local20, local20 - 4, local16, local16 + 4, local16, Static362.method4946(local69, local50.aShort92 & 0xFFFF), Static362.method4946(local69, local50.aShort91 & 0xFFFF), Static362.method4946(local69, local50.aShort90 & 0xFFFF));
						} else if (local50.anInt6456 == -1) {
							arg5.method470(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort89 & 0xFFFF, local50.aShort90 & 0xFFFF, local50.aShort91 & 0xFFFF);
							arg5.method470(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort92 & 0xFFFF, local50.aShort91 & 0xFFFF, local50.aShort90 & 0xFFFF);
						} else {
							local69 = local50.anInt6456;
							arg5.method470(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method470(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass183ArrayArray1[local22][local25] != null) {
						@Pc(249) Class183 local249 = this.aClass183ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort73; local69++) {
							arg6[local69] = local16 + local249.aShortArray84[local69] * 4 / super.anInt2927;
							arg7[local69] = local20 - local249.aShortArray86[local69] * 4 / super.anInt2927;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort74; local287++) {
							@Pc(293) short local293 = local249.aShortArray79[local287];
							@Pc(298) short local298 = local249.aShortArray83[local287];
							@Pc(303) short local303 = local249.aShortArray81[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray421 != null && local249.anIntArray421[local287] != -1) {
								local341 = local249.anIntArray421[local287];
								arg5.method470(local319, local323, local327, local307, local311, local315, Static362.method4946(local341, local249.aShortArray87[local293]), Static362.method4946(local341, local249.aShortArray87[local298]), Static362.method4946(local341, local249.aShortArray87[local303]));
							} else if (local249.aShortArray80 == null || local249.aShortArray80[local287] == -1) {
								local341 = local249.anIntArray420[local287];
								arg5.method470(local319, local323, local327, local307, local311, local315, Static362.method4946(local341, local249.aShortArray87[local293]), Static362.method4946(local341, local249.aShortArray87[local298]), Static362.method4946(local341, local249.aShortArray87[local303]));
							} else {
								local341 = this.aClass49_Sub1_5.method1092(local249.aShortArray80[local287]);
								arg5.method470(local319, local323, local327, local307, local311, local315, Static362.method4946(local341, local249.aShortArray87[local293]), Static362.method4946(local341, local249.aShortArray87[local298]), Static362.method4946(local341, local249.aShortArray87[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)Z")
	private boolean method1956(@OriginalArg(0) int arg0) {
		if ((this.anInt2489 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray18[arg0][arg1];
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class35_Sub1 local3 = this.aClass49_Sub1_5.aClass35_Sub1_1;
		this.anInt2493 = -1;
		this.anInt2498 = local3.anInt5519;
		this.anInt2491 = local3.anInt5522;
		this.anInt2490 = local3.anInt5527;
		this.anInt2502 = local3.anInt5523;
		this.anInt2494 = local3.anInt5524;
		this.anInt2497 = local3.anInt5518;
		this.anInt2495 = local3.anInt5528;
		this.anInt2492 = local3.anInt5525;
		this.anInt2501 = local3.anInt5529;
		this.anInt2500 = local3.anInt5526;
		this.anInt2496 = local3.anInt5520;
		this.anInt2499 = local3.anInt5521;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZLclient!be;[I[I[I)V")
	private void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class186 local6 = this.aClass186ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(268) int local268;
		@Pc(324) int local324;
		@Pc(380) int local380;
		@Pc(436) int local436;
		@Pc(296) int local296;
		@Pc(352) int local352;
		@Pc(408) int local408;
		@Pc(464) int local464;
		@Pc(257) int local257;
		@Pc(313) int local313;
		@Pc(369) int local369;
		@Pc(425) int local425;
		@Pc(285) int local285;
		@Pc(341) int local341;
		@Pc(397) int local397;
		@Pc(453) int local453;
		@Pc(82) int local82;
		@Pc(105) int local105;
		@Pc(128) int local128;
		@Pc(151) int local151;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(176) int local176;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(240) int local240;
		@Pc(501) int local501;
		@Pc(642) int local642;
		if (local6 == null) {
			@Pc(1452) Class119 local1452 = this.aClass119ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt2493 == -1) {
					for (local436 = 0; local436 < local1452.aShort41; local436++) {
						local24 = local1452.aShortArray39[local436] + (arg0 << super.anInt2932);
						local29 = local1452.aShortArray37[local436];
						local34 = local1452.aShortArray41[local436] + (arg1 << super.anInt2932);
						local380 = this.anInt2499 + (this.anInt2501 * local24 + this.anInt2500 * local29 + this.anInt2496 * local34 >> 15);
						if (local380 <= this.aClass49_Sub1_5.anInt1282) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass49_Sub1_5.anInt1265;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray38[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass49_Sub1_5.aBoolean73) {
							local296 = local380 - this.aClass49_Sub1_5.anInt1265;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local29 + this.anInt2490 * local34 >> 15);
						local324 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local29 + this.anInt2495 * local34 >> 15);
						arg4[local436] = arg3.anInt553 + local268 * this.aClass49_Sub1_5.anInt1280 / local380;
						arg5[local436] = arg3.anInt552 + local324 * this.aClass49_Sub1_5.anInt1283 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort41; local436++) {
						local24 = local1452.aShortArray39[local436] + (arg0 << super.anInt2932);
						local29 = local1452.aShortArray37[local436];
						local34 = local1452.aShortArray41[local436] + (arg1 << super.anInt2932);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt2493 - this.aClass49_Sub1_5.anInt1265;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray38[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass49_Sub1_5.aBoolean73) {
							local296 = this.anInt2493 - this.aClass49_Sub1_5.anInt1265;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local29 + this.anInt2490 * local34 >> 15);
						local324 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local29 + this.anInt2495 * local34 >> 15);
						arg4[local436] = arg3.anInt553 + local268 * this.aClass49_Sub1_5.anInt1280 / this.anInt2493;
						arg5[local436] = arg3.anInt552 + local324 * this.aClass49_Sub1_5.anInt1283 / this.anInt2493;
					}
				}
				if (local1452.aShortArray40 != null) {
					local436 = this.anIntArrayArray18[arg0][arg1];
					local296 = this.anIntArrayArray18[arg0 + 1][arg1];
					local352 = this.anIntArrayArray18[arg0][arg1 + 1];
					local408 = arg0 * super.anInt2927;
					local464 = local408 + super.anInt2927;
					local257 = arg1 * super.anInt2927;
					local313 = local257 + super.anInt2927;
					local369 = this.anInt2502 + (this.anInt2498 * local408 + this.anInt2491 * local436 + this.anInt2490 * local257 >> 15);
					local425 = this.anInt2492 + (this.anInt2494 * local408 + this.anInt2497 * local436 + this.anInt2495 * local257 >> 15);
					local285 = this.anInt2499 + (this.anInt2501 * local408 + this.anInt2500 * local436 + this.anInt2496 * local257 >> 15);
					local341 = this.anInt2502 + (this.anInt2498 * local464 + this.anInt2491 * local296 + this.anInt2490 * local257 >> 15);
					local397 = this.anInt2492 + (this.anInt2494 * local464 + this.anInt2497 * local296 + this.anInt2495 * local257 >> 15);
					local453 = this.anInt2499 + (this.anInt2501 * local464 + this.anInt2500 * local296 + this.anInt2496 * local257 >> 15);
					local82 = this.anInt2502 + (this.anInt2498 * local408 + this.anInt2491 * local352 + this.anInt2490 * local313 >> 15);
					local105 = this.anInt2492 + (this.anInt2494 * local408 + this.anInt2497 * local352 + this.anInt2495 * local313 >> 15);
					local128 = this.anInt2499 + (this.anInt2501 * local408 + this.anInt2500 * local352 + this.anInt2496 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort40; local151++) {
						local36 = local151 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg4[local36];
						local176 = arg4[local38];
						local56 = arg4[local40];
						local65 = arg5[local36];
						local240 = arg5[local38];
						local501 = arg5[local40];
						local642 = arg6[local36] + arg6[local38] + arg6[local40];
						if ((local42 - local176) * (local501 - local240) - (local65 - local240) * (local56 - local176) > 0) {
							arg3.aBoolean23 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt551 || local176 > arg3.anInt551 || local56 > arg3.anInt551;
							@Pc(2138) short local2138 = local1452.aShortArray40[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method1956(this.aClass49_Sub1_5.anInterface4_6.method3794(local2138).aByte62)) {
									arg3.anInt556 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method477(local65, local240, local501, local42, local176, local56, this.aClass49_Sub1_5.anInt1285, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray295[local36], local1452.anIntArray295[local38], local1452.anIntArray295[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray295[local36] & 0xFFFFFF) != 0) {
										arg3.method479(local65, local240, local501, local42, local176, local56, Static368.method5012(arg6[local36] << 24 | this.aClass49_Sub1_5.anInt1285, local1452.anIntArray295[local36]), Static368.method5012(arg6[local38] << 24 | this.aClass49_Sub1_5.anInt1285, local1452.anIntArray295[local38]), Static368.method5012(arg6[local40] << 24 | this.aClass49_Sub1_5.anInt1285, local1452.anIntArray295[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method476(local65, local240, local501, local42, local176, local56, local1452.anIntArray295[local36], local1452.anIntArray295[local38], local1452.anIntArray295[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray295[local36] & 0xFFFFFF) != 0) {
									arg3.method479(local65, local240, local501, local42, local176, local56, local1452.anIntArray295[local36], local1452.anIntArray295[local38], local1452.anIntArray295[local40]);
								}
								arg3.anInt556 = 0;
							} else {
								arg3.method467(local65, local240, local501, local42, local176, local56, this.aClass49_Sub1_5.anInt1285);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort40; local436++) {
					local296 = local436 * 3;
					local352 = local296 + 1;
					local408 = local352 + 1;
					local464 = arg4[local296];
					local257 = arg4[local352];
					local313 = arg4[local408];
					local369 = arg5[local296];
					local425 = arg5[local352];
					local285 = arg5[local408];
					local341 = arg6[local296] + arg6[local352] + arg6[local408];
					if ((local464 - local257) * (local285 - local425) - (local369 - local425) * (local313 - local257) > 0) {
						arg3.aBoolean23 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt551 || local257 > arg3.anInt551 || local313 > arg3.anInt551;
						if (local341 >= 765) {
							arg3.method467(local369, local425, local285, local464, local257, local313, this.aClass49_Sub1_5.anInt1285);
						} else if (local341 > 0) {
							if ((local1452.anIntArray295[local296] & 0xFFFFFF) != 0) {
								arg3.method479(local369, local425, local285, local464, local257, local313, Static317.method4491(arg6[local296], local1452.anIntArray295[local296], this.aClass49_Sub1_5.anInt1285), Static317.method4491(arg6[local352], local1452.anIntArray295[local352], this.aClass49_Sub1_5.anInt1285), Static317.method4491(arg6[local408], local1452.anIntArray295[local408], this.aClass49_Sub1_5.anInt1285));
							}
						} else if ((local1452.anIntArray295[local296] & 0xFFFFFF) != 0) {
							arg3.method479(local369, local425, local285, local464, local257, local313, local1452.anIntArray295[local296], local1452.anIntArray295[local352], local1452.anIntArray295[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte84 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt2927;
			local24 = local19 + super.anInt2927;
			local29 = arg1 * super.anInt2927;
			local34 = local29 + super.anInt2927;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte84 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray18[arg0][arg1];
				local65 = this.anIntArrayArray18[arg0 + 1][arg1];
				local240 = this.anIntArrayArray18[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray18[arg0][arg1 + 1];
				if (this.anInt2493 == -1) {
					local82 = this.anInt2499 + (this.anInt2501 * local19 + this.anInt2500 * local56 + this.anInt2496 * local29 >> 15);
					if (local82 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local105 = this.anInt2499 + (this.anInt2501 * local24 + this.anInt2500 * local65 + this.anInt2496 * local29 >> 15);
					if (local105 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local128 = this.anInt2499 + (this.anInt2501 * local24 + this.anInt2500 * local240 + this.anInt2496 * local34 >> 15);
					if (local128 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local151 = this.anInt2499 + (this.anInt2501 * local19 + this.anInt2500 * local501 + this.anInt2496 * local34 >> 15);
					if (local151 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
				} else {
					local151 = this.anInt2493;
					local128 = this.anInt2493;
					local105 = this.anInt2493;
					local82 = this.anInt2493;
				}
				if (arg2) {
					local176 = local82 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort84 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort80 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort83 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort81 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass49_Sub1_5.aBoolean73) {
					local176 = local82 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt2502 + (this.anInt2498 * local19 + this.anInt2491 * local56 + this.anInt2490 * local29 >> 15);
				local268 = arg3.anInt553 + local257 * this.aClass49_Sub1_5.anInt1280 / local82;
				local285 = this.anInt2492 + (this.anInt2494 * local19 + this.anInt2497 * local56 + this.anInt2495 * local29 >> 15);
				local296 = arg3.anInt552 + local285 * this.aClass49_Sub1_5.anInt1283 / local82;
				local313 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local65 + this.anInt2490 * local29 >> 15);
				local324 = arg3.anInt553 + local313 * this.aClass49_Sub1_5.anInt1280 / local105;
				local341 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local65 + this.anInt2495 * local29 >> 15);
				local352 = arg3.anInt552 + local341 * this.aClass49_Sub1_5.anInt1283 / local105;
				local369 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local240 + this.anInt2490 * local34 >> 15);
				local380 = arg3.anInt553 + local369 * this.aClass49_Sub1_5.anInt1280 / local128;
				local397 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local240 + this.anInt2495 * local34 >> 15);
				local408 = arg3.anInt552 + local397 * this.aClass49_Sub1_5.anInt1283 / local128;
				local425 = this.anInt2502 + (this.anInt2498 * local19 + this.anInt2491 * local501 + this.anInt2490 * local34 >> 15);
				local436 = arg3.anInt553 + local425 * this.aClass49_Sub1_5.anInt1280 / local151;
				local453 = this.anInt2492 + (this.anInt2494 * local19 + this.anInt2497 * local501 + this.anInt2495 * local34 >> 15);
				local464 = arg3.anInt552 + local453 * this.aClass49_Sub1_5.anInt1283 / local151;
			} else {
				local56 = this.anIntArrayArray18[arg0][arg1];
				if (this.anInt2493 == -1) {
					local65 = this.anInt2500 * local56;
					local82 = this.anInt2499 + (this.anInt2501 * local19 + local65 + this.anInt2496 * local29 >> 15);
					if (local82 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local105 = this.anInt2499 + (this.anInt2501 * local24 + local65 + this.anInt2496 * local29 >> 15);
					if (local105 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local128 = this.anInt2499 + (this.anInt2501 * local24 + local65 + this.anInt2496 * local34 >> 15);
					if (local128 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local151 = this.anInt2499 + (this.anInt2501 * local19 + local65 + this.anInt2496 * local34 >> 15);
					if (local151 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
				} else {
					local151 = this.anInt2493;
					local128 = this.anInt2493;
					local105 = this.anInt2493;
					local82 = this.anInt2493;
				}
				if (this.aClass49_Sub1_5.aBoolean73) {
					local176 = local82 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass49_Sub1_5.anInt1265;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt2491 * local56;
				local240 = this.anInt2497 * local56;
				local257 = this.anInt2502 + (this.anInt2498 * local19 + local65 + this.anInt2490 * local29 >> 15);
				local268 = arg3.anInt553 + local257 * this.aClass49_Sub1_5.anInt1280 / local82;
				local285 = this.anInt2492 + (this.anInt2494 * local19 + local240 + this.anInt2495 * local29 >> 15);
				local296 = arg3.anInt552 + local285 * this.aClass49_Sub1_5.anInt1283 / local82;
				local313 = this.anInt2502 + (this.anInt2498 * local24 + local65 + this.anInt2490 * local29 >> 15);
				local324 = arg3.anInt553 + local313 * this.aClass49_Sub1_5.anInt1280 / local105;
				local341 = this.anInt2492 + (this.anInt2494 * local24 + local240 + this.anInt2495 * local29 >> 15);
				local352 = arg3.anInt552 + local341 * this.aClass49_Sub1_5.anInt1283 / local105;
				local369 = this.anInt2502 + (this.anInt2498 * local24 + local65 + this.anInt2490 * local34 >> 15);
				local380 = arg3.anInt553 + local369 * this.aClass49_Sub1_5.anInt1280 / local128;
				local397 = this.anInt2492 + (this.anInt2494 * local24 + local240 + this.anInt2495 * local34 >> 15);
				local408 = arg3.anInt552 + local397 * this.aClass49_Sub1_5.anInt1283 / local128;
				local425 = this.anInt2502 + (this.anInt2498 * local19 + local65 + this.anInt2490 * local34 >> 15);
				local436 = arg3.anInt553 + local425 * this.aClass49_Sub1_5.anInt1280 / local151;
				local453 = this.anInt2492 + (this.anInt2494 * local19 + local240 + this.anInt2495 * local34 >> 15);
				local464 = arg3.anInt552 + local453 * this.aClass49_Sub1_5.anInt1283 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort82 != -1 && this.method1956(this.aClass49_Sub1_5.anInterface4_6.method3794(local6.aShort82).aByte62);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean23 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt551 || local436 > arg3.anInt551 || local324 > arg3.anInt551;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt556 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort82 >= 0) {
							arg3.method477(local408, local464, local352, local380, local436, local324, this.aClass49_Sub1_5.anInt1285, local40, local42, local38, local6.anInt5279, local6.anInt5278, local6.anInt5275, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort82);
						} else {
							arg3.method479(local408, local464, local352, local380, local436, local324, Static368.method5012(local40 << 24 | this.aClass49_Sub1_5.anInt1285, local6.anInt5279), Static368.method5012(local42 << 24 | this.aClass49_Sub1_5.anInt1285, local6.anInt5278), Static368.method5012(local38 << 24 | this.aClass49_Sub1_5.anInt1285, local6.anInt5275));
						}
					} else if (local6.aShort82 >= 0) {
						arg3.method476(local408, local464, local352, local380, local436, local324, local6.anInt5279, local6.anInt5278, local6.anInt5275, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort82);
					} else {
						arg3.method479(local408, local464, local352, local380, local436, local324, local6.anInt5279, local6.anInt5278, local6.anInt5275);
					}
					arg3.anInt556 = 0;
				} else {
					arg3.method467(local408, local464, local352, local380, local436, local324, this.aClass49_Sub1_5.anInt1285);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean23 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt551 || local324 > arg3.anInt551 || local436 > arg3.anInt551;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt556 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort82 >= 0) {
							arg3.method477(local296, local352, local464, local268, local324, local436, this.aClass49_Sub1_5.anInt1285, local36, local38, local42, local6.anInt5277, local6.anInt5275, local6.anInt5278, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort82);
						} else {
							arg3.method479(local296, local352, local464, local268, local324, local436, Static368.method5012(local36 << 24 | this.aClass49_Sub1_5.anInt1285, local6.anInt5277), Static368.method5012(local38 << 24 | this.aClass49_Sub1_5.anInt1285, local6.anInt5275), Static368.method5012(local42 << 24 | this.aClass49_Sub1_5.anInt1285, local6.anInt5278));
						}
					} else if (local6.aShort82 >= 0) {
						arg3.method476(local296, local352, local464, local268, local324, local436, local6.anInt5277, local6.anInt5275, local6.anInt5278, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort82);
					} else {
						arg3.method479(local296, local352, local464, local268, local324, local436, local6.anInt5277, local6.anInt5275, local6.anInt5278);
					}
					arg3.anInt556 = 0;
					return;
				}
				arg3.method467(local296, local352, local464, local268, local324, local436, this.aClass49_Sub1_5.anInt1285);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIII[[ZLclient!be;[I[I)V")
	private void method1958(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class21 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean24 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass186ArrayArray1[local22][local25] != null) {
						@Pc(50) Class186 local50 = this.aClass186ArrayArray1[local22][local25];
						if (local50.aShort82 != -1 && (local50.aByte84 & 0x2) == 0 && local50.anInt5276 == 0) {
							local68 = this.aClass49_Sub1_5.method1092(local50.aShort82);
							arg5.method470(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static362.method4946(local68, local50.anInt5279), Static362.method4946(local68, local50.anInt5278), Static362.method4946(local68, local50.anInt5275));
							arg5.method470(local20, local20, local20 - 4, local16, local16 + 4, local16, Static362.method4946(local68, local50.anInt5277), Static362.method4946(local68, local50.anInt5275), Static362.method4946(local68, local50.anInt5278));
						} else if (local50.anInt5276 == 0) {
							arg5.method479(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5279, local50.anInt5278, local50.anInt5275);
							arg5.method479(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5277, local50.anInt5275, local50.anInt5278);
						} else {
							local68 = local50.anInt5276;
							arg5.method479(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static368.method5012(local50.anInt5279 & 0xFF000000, local68), Static368.method5012(local50.anInt5278 & 0xFF000000, local68), Static368.method5012(local50.anInt5275 & 0xFF000000, local68));
							arg5.method479(local20, local20, local20 - 4, local16, local16 + 4, local16, Static368.method5012(local50.anInt5277 & 0xFF000000, local68), Static368.method5012(local50.anInt5275 & 0xFF000000, local68), Static368.method5012(local50.anInt5278 & 0xFF000000, local68));
						}
					} else if (this.aClass119ArrayArray1[local22][local25] != null) {
						@Pc(259) Class119 local259 = this.aClass119ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort41; local68++) {
							arg6[local68] = local16 + local259.aShortArray39[local68] * 4 / super.anInt2927;
							arg7[local68] = local20 - local259.aShortArray41[local68] * 4 / super.anInt2927;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort40; local297++) {
							@Pc(302) int local302 = local297 * 3;
							@Pc(306) int local306 = local302 + 1;
							@Pc(310) int local310 = local306 + 1;
							@Pc(314) int local314 = arg6[local302];
							@Pc(318) int local318 = arg6[local306];
							@Pc(322) int local322 = arg6[local310];
							@Pc(326) int local326 = arg7[local302];
							@Pc(330) int local330 = arg7[local306];
							@Pc(334) int local334 = arg7[local310];
							@Pc(359) int local359;
							if (local259.anIntArray294 != null && local259.anIntArray294[local297] != 0 && (local259.aShortArray40 == null || local259.aShortArray40 != null && local259.aShortArray40[local297] == -1)) {
								local359 = local259.anIntArray294[local297];
								arg5.method479(local326, local330, local334, local314, local318, local322, Static368.method5012(-(local259.anIntArray295[local302] & -16777216) - 16777216, local359), Static368.method5012(-(local259.anIntArray295[local306] & -16777216) - 16777216, local359), Static368.method5012(-(local259.anIntArray295[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray40 == null || local259.aShortArray40[local297] == -1) {
								arg5.method479(local326, local330, local334, local314, local318, local322, local259.anIntArray295[local302], local259.anIntArray295[local306], local259.anIntArray295[local310]);
							} else {
								local359 = this.aClass49_Sub1_5.method1092(local259.aShortArray40[local297]);
								arg5.method470(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!jd;[I)V")
	@Override
	public void method2349(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class2_Sub5_Sub1 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub1 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt2932;
		@Pc(9) int local9 = arg1 >> super.anInt2932;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt2934 - 1 || local9 > super.anInt2928 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt2927 - 1;
		@Pc(41) int local41 = arg1 & super.anInt2927 - 1;
		@Pc(67) int local67 = this.anIntArrayArray18[local4][local9] * (super.anInt2927 - local34) + this.anIntArrayArray18[local4 + 1][local9] * local34 >> super.anInt2932;
		@Pc(97) int local97 = this.anIntArrayArray18[local4][local9 + 1] * (super.anInt2927 - local34) + this.anIntArrayArray18[local4 + 1][local9 + 1] * local34 >> super.anInt2932;
		return local67 * (super.anInt2927 - local41) + local97 * local41 >> super.anInt2932;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!be;[I[I[I)V")
	private void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class236 local6 = this.aClass236ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(194) int local194;
		@Pc(250) int local250;
		@Pc(306) int local306;
		@Pc(362) int local362;
		@Pc(390) int local390;
		@Pc(183) int local183;
		@Pc(239) int local239;
		@Pc(295) int local295;
		@Pc(351) int local351;
		@Pc(211) int local211;
		@Pc(267) int local267;
		@Pc(323) int local323;
		@Pc(379) int local379;
		@Pc(72) int local72;
		@Pc(95) int local95;
		@Pc(118) int local118;
		@Pc(141) int local141;
		@Pc(427) int local427;
		@Pc(222) int local222;
		@Pc(278) int local278;
		@Pc(334) int local334;
		if (local6 == null) {
			@Pc(1022) Class183 local1022 = this.aClass183ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt2493 == -1) {
					for (local362 = 0; local362 < local1022.aShort73; local362++) {
						local24 = local1022.aShortArray84[local362] + (arg0 << super.anInt2932);
						local1046 = local1022.aShortArray82[local362];
						local34 = local1022.aShortArray86[local362] + (arg1 << super.anInt2932);
						local306 = this.anInt2499 + (this.anInt2501 * local24 + this.anInt2500 * local1046 + this.anInt2496 * local34 >> 15);
						if (local306 <= this.aClass49_Sub1_5.anInt1282) {
							return;
						}
						local194 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local1046 + this.anInt2490 * local34 >> 15);
						local250 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local1046 + this.anInt2495 * local34 >> 15);
						arg3[local362] = arg2.anInt553 + local194 * this.aClass49_Sub1_5.anInt1280 / local306;
						arg4[local362] = arg2.anInt552 + local250 * this.aClass49_Sub1_5.anInt1283 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort73; local362++) {
						local24 = local1022.aShortArray84[local362] + (arg0 << super.anInt2932);
						local1046 = local1022.aShortArray82[local362];
						local34 = local1022.aShortArray86[local362] + (arg1 << super.anInt2932);
						local194 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local1046 + this.anInt2490 * local34 >> 15);
						local250 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local1046 + this.anInt2495 * local34 >> 15);
						arg3[local362] = arg2.anInt553 + local194 * this.aClass49_Sub1_5.anInt1280 / this.anInt2493;
						arg4[local362] = arg2.anInt552 + local250 * this.aClass49_Sub1_5.anInt1283 / this.anInt2493;
					}
				}
				if (local1022.aShortArray80 != null) {
					local362 = this.anIntArrayArray18[arg0][arg1];
					local222 = this.anIntArrayArray18[arg0 + 1][arg1];
					local278 = this.anIntArrayArray18[arg0][arg1 + 1];
					local334 = arg0 * super.anInt2927;
					local390 = local334 + super.anInt2927;
					local183 = arg1 * super.anInt2927;
					local239 = local183 + super.anInt2927;
					local295 = this.anInt2502 + (this.anInt2498 * local334 + this.anInt2491 * local362 + this.anInt2490 * local183 >> 15);
					local351 = this.anInt2492 + (this.anInt2494 * local334 + this.anInt2497 * local362 + this.anInt2495 * local183 >> 15);
					local211 = this.anInt2499 + (this.anInt2501 * local334 + this.anInt2500 * local362 + this.anInt2496 * local183 >> 15);
					local267 = this.anInt2502 + (this.anInt2498 * local390 + this.anInt2491 * local222 + this.anInt2490 * local183 >> 15);
					local323 = this.anInt2492 + (this.anInt2494 * local390 + this.anInt2497 * local222 + this.anInt2495 * local183 >> 15);
					local379 = this.anInt2499 + (this.anInt2501 * local390 + this.anInt2500 * local222 + this.anInt2496 * local183 >> 15);
					local72 = this.anInt2502 + (this.anInt2498 * local334 + this.anInt2491 * local278 + this.anInt2490 * local239 >> 15);
					local95 = this.anInt2492 + (this.anInt2494 * local334 + this.anInt2497 * local278 + this.anInt2495 * local239 >> 15);
					local118 = this.anInt2499 + (this.anInt2501 * local334 + this.anInt2500 * local278 + this.anInt2496 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort74; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray79[local141];
						@Pc(1496) short local1496 = local1022.aShortArray83[local141];
						@Pc(1501) short local1501 = local1022.aShortArray81[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean23 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt551 || local1509 > arg2.anInt551 || local1513 > arg2.anInt551;
							@Pc(1569) short local1569 = local1022.aShortArray80[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray420[local141];
								if (local1624 != -1) {
									arg2.method470(local1517, local1521, local1525, local427, local1509, local1513, Static362.method4946(local1624, local1022.aShortArray87[local1491]), Static362.method4946(local1624, local1022.aShortArray87[local1496]), Static362.method4946(local1624, local1022.aShortArray87[local1501]));
								}
							} else {
								if (this.method1956(this.aClass49_Sub1_5.anInterface4_6.method3794(local1569).aByte62)) {
									arg2.anInt556 = 100;
								}
								arg2.method476(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray87[local1491], local1022.aShortArray87[local1496], local1022.aShortArray87[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt556 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort74; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray79[local362];
					@Pc(1675) short local1675 = local1022.aShortArray83[local362];
					@Pc(1680) short local1680 = local1022.aShortArray81[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray420[local362];
						if (local267 != -1) {
							arg2.aBoolean23 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt551 || local183 > arg2.anInt551 || local239 > arg2.anInt551;
							arg2.method470(local295, local351, local211, local390, local183, local239, Static362.method4946(local267, local1022.aShortArray87[local1670]), Static362.method4946(local267, local1022.aShortArray87[local1675]), Static362.method4946(local267, local1022.aShortArray87[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte96 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt2927;
			local24 = local19 + super.anInt2927;
			@Pc(29) int local29 = arg1 * super.anInt2927;
			local34 = local29 + super.anInt2927;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte96 & 0x1) == 0) {
				local46 = this.anIntArrayArray18[arg0][arg1];
				local55 = this.anIntArrayArray18[arg0 + 1][arg1];
				local166 = this.anIntArrayArray18[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray18[arg0][arg1 + 1];
				if (this.anInt2493 == -1) {
					local72 = this.anInt2499 + (this.anInt2501 * local19 + this.anInt2500 * local46 + this.anInt2496 * local29 >> 15);
					if (local72 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local95 = this.anInt2499 + (this.anInt2501 * local24 + this.anInt2500 * local55 + this.anInt2496 * local29 >> 15);
					if (local95 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local118 = this.anInt2499 + (this.anInt2501 * local24 + this.anInt2500 * local166 + this.anInt2496 * local34 >> 15);
					if (local118 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local141 = this.anInt2499 + (this.anInt2501 * local19 + this.anInt2500 * local427 + this.anInt2496 * local34 >> 15);
					if (local141 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
				} else {
					local141 = this.anInt2493;
					local118 = this.anInt2493;
					local95 = this.anInt2493;
					local72 = this.anInt2493;
				}
				local183 = this.anInt2502 + (this.anInt2498 * local19 + this.anInt2491 * local46 + this.anInt2490 * local29 >> 15);
				local194 = arg2.anInt553 + local183 * this.aClass49_Sub1_5.anInt1280 / local72;
				local211 = this.anInt2492 + (this.anInt2494 * local19 + this.anInt2497 * local46 + this.anInt2495 * local29 >> 15);
				local222 = arg2.anInt552 + local211 * this.aClass49_Sub1_5.anInt1283 / local72;
				local239 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local55 + this.anInt2490 * local29 >> 15);
				local250 = arg2.anInt553 + local239 * this.aClass49_Sub1_5.anInt1280 / local95;
				local267 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local55 + this.anInt2495 * local29 >> 15);
				local278 = arg2.anInt552 + local267 * this.aClass49_Sub1_5.anInt1283 / local95;
				local295 = this.anInt2502 + (this.anInt2498 * local24 + this.anInt2491 * local166 + this.anInt2490 * local34 >> 15);
				local306 = arg2.anInt553 + local295 * this.aClass49_Sub1_5.anInt1280 / local118;
				local323 = this.anInt2492 + (this.anInt2494 * local24 + this.anInt2497 * local166 + this.anInt2495 * local34 >> 15);
				local334 = arg2.anInt552 + local323 * this.aClass49_Sub1_5.anInt1283 / local118;
				local351 = this.anInt2502 + (this.anInt2498 * local19 + this.anInt2491 * local427 + this.anInt2490 * local34 >> 15);
				local362 = arg2.anInt553 + local351 * this.aClass49_Sub1_5.anInt1280 / local141;
				local379 = this.anInt2492 + (this.anInt2494 * local19 + this.anInt2497 * local427 + this.anInt2495 * local34 >> 15);
				local390 = arg2.anInt552 + local379 * this.aClass49_Sub1_5.anInt1283 / local141;
			} else {
				local46 = this.anIntArrayArray18[arg0][arg1];
				if (this.anInt2493 == -1) {
					local55 = this.anInt2500 * local46;
					local72 = this.anInt2499 + (this.anInt2501 * local19 + local55 + this.anInt2496 * local29 >> 15);
					if (local72 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local95 = this.anInt2499 + (this.anInt2501 * local24 + local55 + this.anInt2496 * local29 >> 15);
					if (local95 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local118 = this.anInt2499 + (this.anInt2501 * local24 + local55 + this.anInt2496 * local34 >> 15);
					if (local118 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
					local141 = this.anInt2499 + (this.anInt2501 * local19 + local55 + this.anInt2496 * local34 >> 15);
					if (local141 <= this.aClass49_Sub1_5.anInt1282) {
						return;
					}
				} else {
					local141 = this.anInt2493;
					local118 = this.anInt2493;
					local95 = this.anInt2493;
					local72 = this.anInt2493;
				}
				local55 = this.anInt2491 * local46;
				local166 = this.anInt2497 * local46;
				local183 = this.anInt2502 + (this.anInt2498 * local19 + local55 + this.anInt2490 * local29 >> 15);
				local194 = arg2.anInt553 + local183 * this.aClass49_Sub1_5.anInt1280 / local72;
				local211 = this.anInt2492 + (this.anInt2494 * local19 + local166 + this.anInt2495 * local29 >> 15);
				local222 = arg2.anInt552 + local211 * this.aClass49_Sub1_5.anInt1283 / local72;
				local239 = this.anInt2502 + (this.anInt2498 * local24 + local55 + this.anInt2490 * local29 >> 15);
				local250 = arg2.anInt553 + local239 * this.aClass49_Sub1_5.anInt1280 / local95;
				local267 = this.anInt2492 + (this.anInt2494 * local24 + local166 + this.anInt2495 * local29 >> 15);
				local278 = arg2.anInt552 + local267 * this.aClass49_Sub1_5.anInt1283 / local95;
				local295 = this.anInt2502 + (this.anInt2498 * local24 + local55 + this.anInt2490 * local34 >> 15);
				local306 = arg2.anInt553 + local295 * this.aClass49_Sub1_5.anInt1280 / local118;
				local323 = this.anInt2492 + (this.anInt2494 * local24 + local166 + this.anInt2495 * local34 >> 15);
				local334 = arg2.anInt552 + local323 * this.aClass49_Sub1_5.anInt1283 / local118;
				local351 = this.anInt2502 + (this.anInt2498 * local19 + local55 + this.anInt2490 * local34 >> 15);
				local362 = arg2.anInt553 + local351 * this.aClass49_Sub1_5.anInt1280 / local141;
				local379 = this.anInt2492 + (this.anInt2494 * local19 + local166 + this.anInt2495 * local34 >> 15);
				local390 = arg2.anInt552 + local379 * this.aClass49_Sub1_5.anInt1283 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean23 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt551 || local362 > arg2.anInt551 || local250 > arg2.anInt551;
				if (local6.aShort93 >= 0) {
					if (this.method1956(this.aClass49_Sub1_5.anInterface4_6.method3794(local6.aShort93).aByte62)) {
						arg2.anInt556 = 100;
					}
					arg2.method476(local334, local390, local278, local306, local362, local250, local6.aShort89 & 0xFFFF, local6.aShort90 & 0xFFFF, local6.aShort91 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort93);
					arg2.anInt556 = 0;
				} else {
					arg2.method470(local334, local390, local278, local306, local362, local250, local6.aShort89 & 0xFFFF, local6.aShort90 & 0xFFFF, local6.aShort91 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean23 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt551 || local250 > arg2.anInt551 || local362 > arg2.anInt551;
				if (local6.aShort93 >= 0) {
					if (this.method1956(this.aClass49_Sub1_5.anInterface4_6.method3794(local6.aShort93).aByte62)) {
						arg2.anInt556 = 100;
					}
					arg2.method476(local222, local278, local390, local194, local250, local362, local6.aShort92 & 0xFFFF, local6.aShort91 & 0xFFFF, local6.aShort90 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort93);
					arg2.anInt556 = 0;
					return;
				}
				arg2.method470(local222, local278, local390, local194, local250, local362, local6.aShort92 & 0xFFFF, local6.aShort91 & 0xFFFF, local6.aShort90 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	@Override
	public void method2354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class52 local4 = this.aClass49_Sub1_5.method1088(Thread.currentThread());
		local4.aClass21_1.anInt556 = 0;
		if (this.aClass186ArrayArray1 != null) {
			this.method1957(arg0, arg1, this.aClass49_Sub1_5.aBoolean74, local4.aClass21_1, local4.anIntArray98, local4.anIntArray103, local4.anIntArray96);
		} else if (this.aClass236ArrayArray1 != null) {
			this.method1960(arg0, arg1, local4.aClass21_1, local4.anIntArray98, local4.anIntArray103, local4.anIntArray96);
		}
	}
}
