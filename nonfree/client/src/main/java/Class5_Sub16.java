import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class5_Sub16 extends Class5 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Lclient!cq;")
	private Interface3 anInterface3_9;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
	public int anInt2534 = 0;

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "Lclient!rd;")
	private final Class109_Sub3 aClass109_Sub3_1;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	public final int anInt2525;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	public final int anInt2541;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	public final int anInt2533;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
	private final int[] anIntArray88;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_5;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	public final int anInt2532;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!rd;IIIII)V")
	public Class5_Sub16(@OriginalArg(0) Class109_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass109_Sub3_1 = arg0;
		this.anInt2525 = arg5;
		this.anInt2541 = arg3;
		this.anInt2533 = arg4;
		this.anIntArray88 = new int[this.aClass109_Sub3_1.anInt9061 * this.aClass109_Sub3_1.anInt9065];
		this.aClass65_Sub2_5 = this.aClass109_Sub3_1.aClass65_Sub2_14;
		this.aFloat67 = (float) arg2;
		this.anInt2532 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IZI)V")
	public void method2264(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface12 local14 = this.aClass65_Sub2_5.method4399(this.anInt2534 * 3);
		@Pc(19) Buffer local19 = local14.method900();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass65_Sub2_5.method4457(local19);
		@Pc(30) int local30 = 0;
		@Pc(39) int local39 = 32767;
		@Pc(41) int local41 = -32768;
		@Pc(99) int local99;
		@Pc(57) short[] local57;
		@Pc(51) int local51;
		@Pc(62) int local62;
		@Pc(45) int local45;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(90) int local90;
		if (Stream.c()) {
			label122: for (local45 = 0; local45 < arg1; local45++) {
				local51 = arg0[local45];
				local57 = this.aClass109_Sub3_1.aShortArrayArray17[local51];
				local62 = this.anIntArray88[local51];
				if (local62 != 0 && local57 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local57.length <= local73) {
								continue label122;
							}
							if ((local62 & 0x1 << local71++) == 0) {
								local73 += 3;
							} else {
								for (local90 = 0; local90 < 3; local90++) {
									local99 = local57[local73++] & 0xFFFF;
									if (local99 < local39) {
										local39 = local99;
									}
									local28.e(local99);
									if (local41 < local99) {
										local41 = local99;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label96: for (local45 = 0; local45 < arg1; local45++) {
				local51 = arg0[local45];
				local57 = this.aClass109_Sub3_1.aShortArrayArray17[local51];
				local62 = this.anIntArray88[local51];
				if (local62 != 0 && local57 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local73 >= local57.length) {
								continue label96;
							}
							if ((local62 & 0x1 << local71++) == 0) {
								local73 += 3;
							} else {
								for (local90 = 0; local90 < 3; local90++) {
									local99 = local57[local73++] & 0xFFFF;
									local28.b(local99);
									if (local99 > local41) {
										local41 = local99;
									}
									if (local99 < local39) {
										local39 = local99;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method903() || local30 <= 0) {
			return;
		}
		this.aClass65_Sub2_5.method4446((this.aClass109_Sub3_1.anInt8407 & 0x8) != 0, this.anInt2532, (this.aClass109_Sub3_1.anInt8407 & 0x7) != 0);
		if (this.aClass65_Sub2_5.aBoolean443) {
			this.aClass65_Sub2_5.EA(Integer.MAX_VALUE, this.anInt2541, this.anInt2533, this.anInt2525);
		}
		@Pc(288) Class254_Sub2 local288 = this.aClass65_Sub2_5.method4439();
		local288.method6237(1.0F / this.aFloat67, 1.0F, 1.0F / this.aFloat67);
		this.aClass65_Sub2_5.method4411(Static102.aClass198_1);
		this.aClass65_Sub2_5.method4427(1, this.anInterface3_9);
		this.aClass65_Sub2_5.method4447(this.aClass109_Sub3_1.aClass69_22);
		this.aClass65_Sub2_5.method4398(0, local41 + 1 - local39, local39, Static72.aClass155_1, local14, local30);
		this.aClass65_Sub2_5.method4423();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray88[arg1 * this.aClass109_Sub3_1.anInt9061 + arg0] |= 0x1 << arg2;
		this.anInt2534++;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	public void method2272(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass65_Sub2_5.method4481(true, arg0 * 4);
		this.aStream3 = new Stream(this.aNativeHeapBuffer5, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIFI)V")
	public void method2273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(44) int local44;
		if (this.anInt2532 != -1) {
			@Pc(18) Class136 local18 = this.aClass65_Sub2_5.anInterface4_11.method358(this.anInt2532);
			local23 = local18.aByte55 & 0xFF;
			@Pc(67) int local67;
			if (local23 != 0 && local18.aByte56 != 4) {
				if (arg0 < 0) {
					local44 = 0;
				} else if (arg0 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg0 * 131586;
				}
				if (local23 == 256) {
					arg3 = local44;
				} else {
					local67 = 256 - local23;
					arg3 = ((local44 & 0xFF00) * local23 + (arg3 & 0xFF00) * local67 & 0xFF0000) + ((local44 & 0xFF00FF) * local23 + local67 * (arg3 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local44 = local18.aByte51 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(117) int local117 = local44 * (arg3 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local67 = local44 * (arg3 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(141) int local141 = (arg3 & 0xFF) * local44;
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg3 = (local141 >> 8) + (local67 & 0xFF00) + ((local117 & 0x8D00FF00) << 8);
			}
		}
		this.aStream3.d(arg1 * 4);
		if (arg2 != 1.0F) {
			@Pc(182) int local182 = arg3 >> 16 & 0xFF;
			local23 = arg3 >> 8 & 0xFF;
			local182 = (int) ((float) local182 * arg2);
			local44 = arg3 & 0xFF;
			if (local182 < 0) {
				local182 = 0;
			} else if (local182 > 255) {
				local182 = 255;
			}
			local23 = (int) ((float) local23 * arg2);
			local44 = (int) ((float) local44 * arg2);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg3 = local44 | local182 << 16 | local23 << 8;
		}
		if (this.aClass65_Sub2_5.anInt5253 == 0) {
			this.aStream3.f((byte) arg3);
			this.aStream3.f((byte) (arg3 >> 8));
			this.aStream3.f((byte) (arg3 >> 16));
		} else {
			this.aStream3.f((byte) (arg3 >> 16));
			this.aStream3.f((byte) (arg3 >> 8));
			this.aStream3.f((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	public void method2274(@OriginalArg(0) int arg0) {
		this.aStream3.a();
		this.anInterface3_9 = this.aClass65_Sub2_5.method4374(false);
		this.anInterface3_9.method8246(arg0 * 4, 4, this.aNativeHeapBuffer5);
		this.aStream3 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)V")
	public void method2275(@OriginalArg(0) int arg0) {
		this.aStream3.d(arg0 * 4 + 3);
		this.aStream3.f(-1);
	}
}
