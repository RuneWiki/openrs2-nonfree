import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Lclient!ia;")
	private Interface10 anInterface10_9;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public int anInt4741 = 0;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Lclient!lp;")
	private final Class91_Sub2 aClass91_Sub2_1;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "F")
	public final float aFloat103;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "[I")
	private final int[] anIntArray289;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "I")
	public final int anInt4739;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_10;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "I")
	public final int anInt4740;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "I")
	public final int anInt4746;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "I")
	public final int anInt4748;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!lp;IIIII)V")
	public Class2_Sub25(@OriginalArg(0) Class91_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass91_Sub2_1 = arg0;
		this.aFloat103 = (float) arg2;
		this.anIntArray289 = new int[this.aClass91_Sub2_1.anInt8645 * this.aClass91_Sub2_1.anInt8650];
		this.anInt4739 = arg4;
		this.aClass13_Sub3_10 = this.aClass91_Sub2_1.aClass13_Sub3_12;
		this.anInt4740 = arg5;
		this.anInt4746 = arg1;
		this.anInt4748 = arg3;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIFII)V")
	public void method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(27) int local27;
		@Pc(45) int local45;
		if (this.anInt4746 != -1) {
			@Pc(22) Class271 local22 = this.aClass13_Sub3_10.anInterface2_12.method6027(this.anInt4746);
			local27 = local22.aByte92 & 0xFF;
			@Pc(69) int local69;
			if (local27 != 0 && local22.aByte94 != 4) {
				if (arg0 < 0) {
					local45 = 0;
				} else if (arg0 <= 127) {
					local45 = arg0 * 131586;
				} else {
					local45 = 16777215;
				}
				if (local27 == 256) {
					arg1 = local45;
				} else {
					local69 = 256 - local27;
					arg1 = (local27 * (local45 & 0xFF00FF) + local69 * (arg1 & 0xFF00FF) & 0xFF00FF00) + ((local45 & 0xFF00) * local27 + (arg1 & 0xFF00) * local69 & 0xFF0000) >> 8;
				}
			}
			local45 = local22.aByte91 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(123) int local123 = local45 * (arg1 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local69 = (arg1 >> 8 & 0xFF) * local45;
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(147) int local147 = local45 * (arg1 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				arg1 = (local147 >> 8) + (local69 & 0xFF00) + (local123 << 8 & 0xFF0017);
			}
		}
		this.aStream2.f(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(182) int local182 = arg1 >> 16 & 0xFF;
			local27 = arg1 >> 8 & 0xFF;
			local45 = arg1 & 0xFF;
			local182 = (int) ((float) local182 * arg2);
			if (local182 < 0) {
				local182 = 0;
			} else if (local182 > 255) {
				local182 = 255;
			}
			local27 = (int) ((float) local27 * arg2);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			local45 = (int) ((float) local45 * arg2);
			if (local45 < 0) {
				local45 = 0;
			} else if (local45 > 255) {
				local45 = 255;
			}
			arg1 = local182 << 16 | local27 << 8 | local45;
		}
		if (this.aClass13_Sub3_10.anInt9759 == 0) {
			this.aStream2.d((byte) arg1);
			this.aStream2.d((byte) (arg1 >> 8));
			this.aStream2.d((byte) (arg1 >> 16));
		} else {
			this.aStream2.d((byte) (arg1 >> 16));
			this.aStream2.d((byte) (arg1 >> 8));
			this.aStream2.d((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI[I)V")
	public void method4154(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface11 local14 = this.aClass13_Sub3_10.method8287(this.anInt4741 * 3);
		@Pc(21) Buffer local21 = local14.method7405();
		if (local21 == null) {
			return;
		}
		@Pc(30) Stream local30 = this.aClass13_Sub3_10.method8260(local21);
		@Pc(32) int local32 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(95) int local95;
		@Pc(58) short[] local58;
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(86) int local86;
		if (Stream.c()) {
			label95: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local63 = this.anIntArray289[local52];
				local58 = this.aClass91_Sub2_1.aShortArrayArray4[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local71) {
								continue label95;
							}
							if ((local63 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								for (local86 = 0; local86 < 3; local86++) {
									local95 = local58[local71++] & 0xFFFF;
									if (local95 < local40) {
										local40 = local95;
									}
									if (local95 > local42) {
										local42 = local95;
									}
									local30.b(local95);
								}
								local32++;
							}
						}
					}
				}
			}
		} else {
			label119: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local58 = this.aClass91_Sub2_1.aShortArrayArray4[local52];
				local63 = this.anIntArray289[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local71) {
								continue label119;
							}
							if ((local63 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								local32++;
								for (local86 = 0; local86 < 3; local86++) {
									local95 = local58[local71++] & 0xFFFF;
									if (local95 < local40) {
										local40 = local95;
									}
									if (local42 < local95) {
										local42 = local95;
									}
									local30.e(local95);
								}
							}
						}
					}
				}
			}
		}
		local30.b();
		if (!local14.method7409() || local32 <= 0) {
			return;
		}
		this.aClass13_Sub3_10.method8261((this.aClass91_Sub2_1.anInt5821 & 0x8) != 0, (this.aClass91_Sub2_1.anInt5821 & 0x7) != 0, this.anInt4746);
		if (this.aClass13_Sub3_10.aBoolean693) {
			this.aClass13_Sub3_10.EA(Integer.MAX_VALUE, this.anInt4748, this.anInt4739, this.anInt4740);
		}
		@Pc(259) Class51_Sub2 local259 = this.aClass13_Sub3_10.method8181();
		local259.method3247(1.0F / this.aFloat103, 1.0F / this.aFloat103, 1.0F);
		this.aClass13_Sub3_10.method8217(Static593.aClass100_6);
		this.aClass13_Sub3_10.method8192(1, this.anInterface10_9);
		this.aClass13_Sub3_10.method8243(this.aClass91_Sub2_1.aClass258_9);
		this.aClass13_Sub3_10.method8188(local40, local42 + 1 - local40, Static339.aClass191_4, local14, local32, 0);
		this.aClass13_Sub3_10.method8270();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method4157(@OriginalArg(1) int arg0) {
		this.aStream2.b();
		this.anInterface10_9 = this.aClass13_Sub3_10.method8200(false);
		this.anInterface10_9.method8447(4, arg0 * 4, this.aNativeHeapBuffer4);
		this.aStream2 = null;
		this.aNativeHeapBuffer4 = null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IBII)V")
	public void method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray289[arg0 + this.aClass91_Sub2_1.anInt8650 * arg1] |= 0x1 << arg2;
		this.anInt4741++;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)V")
	public void method4159(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass13_Sub3_10.method8175(arg0 * 4, true);
		this.aStream2 = new Stream(this.aNativeHeapBuffer4, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	public void method4161(@OriginalArg(0) int arg0) {
		this.aStream2.f(arg0 * 4 + 3);
		this.aStream2.d(-1);
	}
}
