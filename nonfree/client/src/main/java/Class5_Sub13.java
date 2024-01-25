import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!es", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "Lclient!up;")
	private Interface16 anInterface16_6;

	@OriginalMember(owner = "client!es", name = "C", descriptor = "I")
	public int anInt2597 = 0;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "Lclient!hm;")
	private final Class131_Sub1 aClass131_Sub1_1;

	@OriginalMember(owner = "client!es", name = "B", descriptor = "F")
	public final float aFloat136;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "I")
	public final int anInt2593;

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	public final int anInt2598;

	@OriginalMember(owner = "client!es", name = "A", descriptor = "[I")
	private final int[] anIntArray222;

	@OriginalMember(owner = "client!es", name = "z", descriptor = "I")
	public final int anInt2596;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "I")
	public final int anInt2587;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_4;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!hm;IIIII)V")
	public Class5_Sub13(@OriginalArg(0) Class131_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass131_Sub1_1 = arg0;
		this.aFloat136 = arg2;
		this.anInt2593 = arg5;
		this.anInt2598 = arg4;
		this.anIntArray222 = new int[this.aClass131_Sub1_1.anInt8871 * this.aClass131_Sub1_1.anInt8873];
		this.anInt2596 = arg1;
		this.anInt2587 = arg3;
		this.aClass62_Sub1_4 = this.aClass131_Sub1_1.aClass62_Sub1_9;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZI)V")
	public void method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray222[this.aClass131_Sub1_1.anInt8873 * arg0 + arg1] |= 0x1 << arg2;
		this.anInt2597++;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public void method2324(@OriginalArg(0) int arg0) {
		this.aStream3.b();
		this.anInterface16_6 = this.aClass62_Sub1_4.method4702(false);
		this.anInterface16_6.method3463(this.aNativeHeapBuffer3, arg0 * 4, 4);
		this.aNativeHeapBuffer3 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[II)V")
	public void method2325(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Interface13 local22 = this.aClass62_Sub1_4.method4770(this.anInt2597 * 3);
		@Pc(27) Buffer local27 = local22.method3487();
		if (local27 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass62_Sub1_4.method4693(local27);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(94) int local94;
		@Pc(58) short[] local58;
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(85) int local85;
		if (Stream.c()) {
			label119: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local58 = this.aClass131_Sub1_1.aShortArrayArray6[local52];
				local63 = this.anIntArray222[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local58.length) {
								continue label119;
							}
							if ((local63 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local58[local71++] & 0xFFFF;
									if (local94 < local40) {
										local40 = local94;
									}
									if (local94 > local42) {
										local42 = local94;
									}
									local36.e(local94);
								}
								local38++;
							}
						}
					}
				}
			}
		} else {
			label93: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local63 = this.anIntArray222[local52];
				local58 = this.aClass131_Sub1_1.aShortArrayArray6[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local71) {
								continue label93;
							}
							if ((0x1 << local69++ & local63) == 0) {
								local71 += 3;
							} else {
								local38++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local58[local71++] & 0xFFFF;
									if (local40 > local94) {
										local40 = local94;
									}
									local36.a(local94);
									if (local94 > local42) {
										local42 = local94;
									}
								}
							}
						}
					}
				}
			}
		}
		local36.b();
		if (!local22.method3492() || local38 <= 0) {
			return;
		}
		this.aClass62_Sub1_4.method4656(this.anInt2596, (this.aClass131_Sub1_1.anInt3638 & 0x7) != 0, (this.aClass131_Sub1_1.anInt3638 & 0x8) != 0);
		if (this.aClass62_Sub1_4.aBoolean388) {
			this.aClass62_Sub1_4.JA(Integer.MAX_VALUE, this.anInt2587, this.anInt2598, this.anInt2593);
		}
		@Pc(275) Class78_Sub1 local275 = this.aClass62_Sub1_4.method4705();
		local275.method2189(1.0F / this.aFloat136, 1.0F / this.aFloat136, 1.0F);
		this.aClass62_Sub1_4.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_4.method4673(1, this.anInterface16_6);
		this.aClass62_Sub1_4.method4713(this.aClass131_Sub1_1.aClass318_14);
		this.aClass62_Sub1_4.method4727(Static403.aClass228_7, 0, local42 + 1 - local40, local38, local22, local40);
		this.aClass62_Sub1_4.method4757();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIFI)V")
	public void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(36) int local36;
		if (this.anInt2596 != -1) {
			@Pc(18) Class271 local18 = this.aClass62_Sub1_4.anInterface8_145.method7237(this.anInt2596);
			local23 = local18.aByte80 & 0xFF;
			@Pc(63) int local63;
			if (local23 != 0 && local18.aByte78 != 4) {
				if (arg0 < 0) {
					local36 = 0;
				} else if (arg0 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg0 * 131586;
				}
				if (local23 == 256) {
					arg3 = local36;
				} else {
					local63 = 256 - local23;
					arg3 = ((local36 & 0xFF00FF) * local23 + local63 * (arg3 & 0xFF00FF) & 0xFF00FF00) + ((arg3 & 0xFF00) * local63 + (local36 & 0xFF00) * local23 & 0xFF0000) >> 8;
				}
			}
			local36 = local18.aByte83 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(117) int local117 = (arg3 >> 16 & 0xFF) * local36;
				if (local117 > 65535) {
					local117 = 65535;
				}
				local63 = (arg3 >> 8 & 0xFF) * local36;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(145) int local145 = local36 * (arg3 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg3 = (local145 >> 8) + ((local117 & 0xFF00) << 8) + (local63 & 0xFF00);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(174) int local174 = arg3 >> 16 & 0xFF;
			local23 = arg3 >> 8 & 0xFF;
			local36 = arg3 & 0xFF;
			local174 = (int) ((float) local174 * arg2);
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local23 = (int) ((float) local23 * arg2);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local36 = (int) ((float) local36 * arg2);
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg3 = local174 << 16 | local23 << 8 | local36;
		}
		this.aStream3.c(arg1 * 4);
		if (this.aClass62_Sub1_4.anInt5684 == 0) {
			this.aStream3.d((byte) arg3);
			this.aStream3.d((byte) (arg3 >> 8));
			this.aStream3.d((byte) (arg3 >> 16));
		} else {
			this.aStream3.d((byte) (arg3 >> 16));
			this.aStream3.d((byte) (arg3 >> 8));
			this.aStream3.d((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
	public void method2328(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass62_Sub1_4.method4688(true, arg0 * 4);
		this.aStream3 = new Stream(this.aNativeHeapBuffer3, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	public void method2329(@OriginalArg(0) int arg0) {
		this.aStream3.c(arg0 * 4 + 3);
		this.aStream3.d(-1);
	}
}
