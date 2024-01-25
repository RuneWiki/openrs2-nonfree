import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lclient!fka;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
	public int anInt2087 = 0;

	@OriginalMember(owner = "client!eaa", name = "B", descriptor = "Lclient!mg;")
	private final Class88_Sub2 aClass88_Sub2_1;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
	public final int anInt2083;

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
	public final int anInt2075;

	@OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
	public final int anInt2082;

	@OriginalMember(owner = "client!eaa", name = "s", descriptor = "[I")
	private final int[] anIntArray107;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "F")
	public final float aFloat45;

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
	public final int anInt2084;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_4;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!mg;IIIII)V")
	public Class5_Sub20(@OriginalArg(0) Class88_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass88_Sub2_1 = arg0;
		this.anInt2083 = arg5;
		this.anInt2075 = arg4;
		this.anInt2082 = arg1;
		this.anIntArray107 = new int[this.aClass88_Sub2_1.anInt10541 * this.aClass88_Sub2_1.anInt10545];
		this.aFloat45 = (float) arg2;
		this.anInt2084 = arg3;
		this.aClass143_Sub1_4 = this.aClass88_Sub2_1.aClass143_Sub1_11;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBIIF)V")
	public void method1897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(28) int local28;
		@Pc(49) int local49;
		if (this.anInt2082 != -1) {
			@Pc(23) Class331 local23 = this.aClass143_Sub1_4.anInterface3_11.method8501(this.anInt2082);
			local28 = local23.aByte118 & 0xFF;
			@Pc(71) int local71;
			if (local28 != 0 && local23.aByte117 != 4) {
				if (arg1 < 0) {
					local49 = 0;
				} else if (arg1 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg1 * 131586;
				}
				if (local28 == 256) {
					arg2 = local49;
				} else {
					local71 = 256 - local28;
					arg2 = (local71 * (arg2 & 0xFF00) + (local49 & 0xFF00) * local28 & 0xFF0000) + (local28 * (local49 & 0xFF00FF) + ((arg2 & 0xFF00FF) * local71) & 0xFF00FF00) >> 8;
				}
			}
			local49 = local23.aByte115 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(125) int local125 = (arg2 >> 16 & 0xFF) * local49;
				if (local125 > 65535) {
					local125 = 65535;
				}
				local71 = (arg2 >> 8 & 0xFF) * local49;
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(151) int local151 = (arg2 & 0xFF) * local49;
				if (local151 > 65535) {
					local151 = 65535;
				}
				arg2 = (local71 & 0xFF00) + ((local125 & 0x5100FF00) << 8) + (local151 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(181) int local181 = arg2 >> 16 & 0xFF;
			local28 = arg2 >> 8 & 0xFF;
			local49 = arg2 & 0xFF;
			local181 = (int) ((float) local181 * arg3);
			local28 = (int) ((float) local28 * arg3);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			if (local28 < 0) {
				local28 = 0;
			} else if (local28 > 255) {
				local28 = 255;
			}
			local49 = (int) ((float) local49 * arg3);
			if (local49 < 0) {
				local49 = 0;
			} else if (local49 > 255) {
				local49 = 255;
			}
			arg2 = local28 << 8 | local181 << 16 | local49;
		}
		this.aStream2.d(arg0 * 4);
		if (this.aClass143_Sub1_4.anInt7376 == 0) {
			this.aStream2.c((byte) arg2);
			this.aStream2.c((byte) (arg2 >> 8));
			this.aStream2.c((byte) (arg2 >> 16));
		} else {
			this.aStream2.c((byte) (arg2 >> 16));
			this.aStream2.c((byte) (arg2 >> 8));
			this.aStream2.c((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB[I)V")
	public void method1898(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(22) Interface16 local22 = this.aClass143_Sub1_4.method6387(this.anInt2087 * 3);
		@Pc(27) Buffer local27 = local22.method7864();
		if (local27 == null) {
			return;
		}
		@Pc(38) Stream local38 = this.aClass143_Sub1_4.method6361(local27);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 32767;
		@Pc(44) int local44 = -32768;
		@Pc(100) int local100;
		@Pc(65) short[] local65;
		@Pc(54) int local54;
		@Pc(59) int local59;
		@Pc(48) int local48;
		@Pc(74) int local74;
		@Pc(76) int local76;
		@Pc(91) int local91;
		if (Stream.a()) {
			label119: for (local48 = 0; local48 < arg0; local48++) {
				local54 = arg1[local48];
				local59 = this.anIntArray107[local54];
				local65 = this.aClass88_Sub2_1.aShortArrayArray14[local54];
				if (local59 != 0 && local65 != null) {
					local74 = 0;
					local76 = 0;
					while (true) {
						while (true) {
							if (local65.length <= local76) {
								continue label119;
							}
							if ((0x1 << local74++ & local59) == 0) {
								local76 += 3;
							} else {
								local40++;
								for (local91 = 0; local91 < 3; local91++) {
									local100 = local65[local76++] & 0xFFFF;
									if (local42 > local100) {
										local42 = local100;
									}
									if (local44 < local100) {
										local44 = local100;
									}
									local38.b(local100);
								}
							}
						}
					}
				}
			}
		} else {
			label95: for (local48 = 0; local48 < arg0; local48++) {
				local54 = arg1[local48];
				local59 = this.anIntArray107[local54];
				local65 = this.aClass88_Sub2_1.aShortArrayArray14[local54];
				if (local59 != 0 && local65 != null) {
					local74 = 0;
					local76 = 0;
					while (true) {
						while (true) {
							if (local76 >= local65.length) {
								continue label95;
							}
							if ((local59 & 0x1 << local74++) == 0) {
								local76 += 3;
							} else {
								for (local91 = 0; local91 < 3; local91++) {
									local100 = local65[local76++] & 0xFFFF;
									if (local42 > local100) {
										local42 = local100;
									}
									local38.f(local100);
									if (local44 < local100) {
										local44 = local100;
									}
								}
								local40++;
							}
						}
					}
				}
			}
		}
		local38.c();
		if (!local22.method7862() || local40 <= 0) {
			return;
		}
		this.aClass143_Sub1_4.method6312((this.aClass88_Sub2_1.anInt6371 & 0x8) != 0, (this.aClass88_Sub2_1.anInt6371 & 0x7) != 0, this.anInt2082);
		if (this.aClass143_Sub1_4.aBoolean523) {
			this.aClass143_Sub1_4.EA(Integer.MAX_VALUE, this.anInt2084, this.anInt2075, this.anInt2083);
		}
		@Pc(286) Class56_Sub2 local286 = this.aClass143_Sub1_4.method6277();
		local286.method6820(1.0F, 1.0F / this.aFloat45, 1.0F / this.aFloat45);
		this.aClass143_Sub1_4.method6307(Static73.aClass270_1);
		this.aClass143_Sub1_4.method6325(1, this.anInterface6_1);
		this.aClass143_Sub1_4.method6333(this.aClass88_Sub2_1.aClass48_16);
		this.aClass143_Sub1_4.method6367(Static536.aClass323_4, local42, local22, 0, local44 + 1 - local42, local40);
		this.aClass143_Sub1_4.method6282();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public void method1900(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass143_Sub1_4.method6343(true, arg0 * 4);
		this.aStream2 = new Stream(this.aNativeHeapBuffer3, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(II)V")
	public void method1901(@OriginalArg(0) int arg0) {
		this.aStream2.d(arg0 * 4 + 3);
		this.aStream2.c(-1);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZII)V")
	public void method1902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray107[arg1 * this.aClass88_Sub2_1.anInt10541 + arg2] |= 0x1 << arg0;
		this.anInt2087++;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)V")
	public void method1906(@OriginalArg(0) int arg0) {
		this.aStream2.c();
		this.anInterface6_1 = this.aClass143_Sub1_4.method6373(false);
		this.anInterface6_1.method3122(4, arg0 * 4, this.aNativeHeapBuffer3);
		this.aNativeHeapBuffer3 = null;
		this.aStream2 = null;
	}
}
