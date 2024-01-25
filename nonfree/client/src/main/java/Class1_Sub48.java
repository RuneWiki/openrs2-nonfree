import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub48 extends Class1 {

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!rq;")
	private Interface16 anInterface16_13;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	public int anInt8612 = 0;

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "Lclient!ml;")
	private final Class7_Sub3 aClass7_Sub3_3;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
	public final int anInt8610;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
	public final int anInt8617;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "[I")
	private final int[] anIntArray758;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public final int anInt8607;

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "F")
	public final float aFloat184;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_18;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	public final int anInt8614;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!ml;IIIII)V")
	public Class1_Sub48(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass7_Sub3_3 = arg0;
		this.anInt8610 = arg4;
		this.anInt8617 = arg1;
		this.anIntArray758 = new int[this.aClass7_Sub3_3.anInt9575 * this.aClass7_Sub3_3.anInt9577];
		this.anInt8607 = arg3;
		this.aFloat184 = arg2;
		this.aClass4_Sub2_18 = this.aClass7_Sub3_3.aClass4_Sub2_10;
		this.anInt8614 = arg5;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIFII)V")
	public void method7524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(22) int local22;
		@Pc(42) int local42;
		if (this.anInt8617 != -1) {
			@Pc(17) Class296 local17 = this.aClass4_Sub2_18.anInterface13_13.method5789(this.anInt8617);
			local22 = local17.aByte103 & 0xFF;
			@Pc(63) int local63;
			if (local22 != 0 && local17.aByte104 != 4) {
				if (arg0 < 0) {
					local42 = 0;
				} else if (arg0 <= 127) {
					local42 = arg0 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local22 == 256) {
					arg3 = local42;
				} else {
					local63 = 256 - local22;
					arg3 = (local63 * (arg3 & 0xFF00) + local22 * (local42 & 0xFF00) & 0xFF0000) + (local63 * (arg3 & 0xFF00FF) + local22 * (local42 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local42 = local17.aByte99 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(112) int local112 = local42 * (arg3 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local63 = local42 * (arg3 >> 8 & 0xFF);
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(136) int local136 = local42 * (arg3 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg3 = (local136 >> 8) + (local63 & 0xFF00) + ((local112 & 0x7400FF00) << 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(167) int local167 = arg3 >> 16 & 0xFF;
			local22 = arg3 >> 8 & 0xFF;
			local167 = (int) ((float) local167 * arg2);
			local42 = arg3 & 0xFF;
			if (local167 < 0) {
				local167 = 0;
			} else if (local167 > 255) {
				local167 = 255;
			}
			local22 = (int) ((float) local22 * arg2);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local42 = (int) ((float) local42 * arg2);
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			arg3 = local42 | local167 << 16 | local22 << 8;
		}
		this.aStream7.b(arg1 * 4);
		if (this.aClass4_Sub2_18.anInt8318 == 0) {
			this.aStream7.a((byte) arg3);
			this.aStream7.a((byte) (arg3 >> 8));
			this.aStream7.a((byte) (arg3 >> 16));
		} else {
			this.aStream7.a((byte) (arg3 >> 16));
			this.aStream7.a((byte) (arg3 >> 8));
			this.aStream7.a((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
	public void method7526(@OriginalArg(1) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.a(-1);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIII)V")
	public void method7527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray758[this.aClass7_Sub3_3.anInt9577 * arg1 + arg0] |= 0x1 << arg2;
		this.anInt8612++;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)V")
	public void method7529(@OriginalArg(1) int arg0) {
		this.aStream7.b();
		this.anInterface16_13 = this.aClass4_Sub2_18.method7250(false);
		this.anInterface16_13.method7615(arg0 * 4, this.aNativeHeapBuffer7, 4);
		this.aNativeHeapBuffer7 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI[I)V")
	public void method7531(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface9 local14 = this.aClass4_Sub2_18.method7262(this.anInt8612 * 3);
		@Pc(19) Buffer local19 = local14.method7613();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass4_Sub2_18.method7263(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(92) int local92;
		@Pc(55) short[] local55;
		@Pc(44) int local44;
		@Pc(49) int local49;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(83) int local83;
		if (Stream.a()) {
			label119: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local49 = this.anIntArray758[local44];
				local55 = this.aClass7_Sub3_3.aShortArrayArray6[local44];
				if (local49 != 0 && local55 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local55.length <= local66) {
								continue label119;
							}
							if ((0x1 << local64++ & local49) == 0) {
								local66 += 3;
							} else {
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local55[local66++] & 0xFFFF;
									local28.c(local92);
									if (local92 > local34) {
										local34 = local92;
									}
									if (local92 < local32) {
										local32 = local92;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label93: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local49 = this.anIntArray758[local44];
				local55 = this.aClass7_Sub3_3.aShortArrayArray6[local44];
				if (local49 != 0 && local55 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local66 >= local55.length) {
								continue label93;
							}
							if ((local49 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								local30++;
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local55[local66++] & 0xFFFF;
									local28.d(local92);
									if (local92 > local34) {
										local34 = local92;
									}
									if (local92 < local32) {
										local32 = local92;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method7614() || local30 <= 0) {
			return;
		}
		this.aClass4_Sub2_18.method7281(this.anInt8617, (this.aClass7_Sub3_3.anInt5866 & 0x8) != 0, (this.aClass7_Sub3_3.anInt5866 & 0x7) != 0);
		if (this.aClass4_Sub2_18.aBoolean594) {
			this.aClass4_Sub2_18.JA(Integer.MAX_VALUE, this.anInt8607, this.anInt8610, this.anInt8614);
		}
		@Pc(279) Class128_Sub3 local279 = this.aClass4_Sub2_18.method7349();
		local279.method6895(1.0F / this.aFloat184, 1.0F, 1.0F / this.aFloat184);
		this.aClass4_Sub2_18.method7272(Static333.aClass107_5);
		this.aClass4_Sub2_18.method7268(this.aClass7_Sub3_3.aClass310_14);
		this.aClass4_Sub2_18.method7251(this.anInterface16_13, 1);
		this.aClass4_Sub2_18.method7291(local32, local34 + 1 - local32, Static416.aClass263_5, local14, local30, 0);
		this.aClass4_Sub2_18.method7290();
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)V")
	public void method7532(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass4_Sub2_18.method7297(true, arg0 * 4);
		this.aStream7 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}
}
