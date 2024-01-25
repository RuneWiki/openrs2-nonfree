import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_6;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt6321 = 0;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!os;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_9;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "[I")
	private final int[] anIntArray431;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	public final int anInt6327;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	public final int anInt6322;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "F")
	public final float aFloat125;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public final int anInt6328;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public final int anInt6329;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!os;IIIII)V")
	public Class3_Sub36(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass4_Sub2_1 = arg0;
		this.aClass15_Sub2_9 = this.aClass4_Sub2_1.aClass15_Sub2_14;
		this.anIntArray431 = new int[this.aClass4_Sub2_1.anInt10461 * this.aClass4_Sub2_1.anInt10459];
		this.anInt6327 = arg5;
		this.anInt6322 = arg4;
		this.aFloat125 = arg2;
		this.anInt6328 = arg3;
		this.anInt6329 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[II)V")
	public void method5266(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(18) Interface20 local18 = this.aClass15_Sub2_9.method5474(this.anInt6321 * 3);
		@Pc(23) Buffer local23 = local18.method6243();
		if (local23 == null) {
			return;
		}
		@Pc(32) Stream local32 = this.aClass15_Sub2_9.method5409(local23);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 32767;
		@Pc(38) int local38 = -32768;
		@Pc(90) int local90;
		@Pc(54) short[] local54;
		@Pc(48) int local48;
		@Pc(59) int local59;
		@Pc(42) int local42;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(81) int local81;
		if (Stream.b()) {
			label96: for (local42 = 0; local42 < arg0; local42++) {
				local48 = arg1[local42];
				local59 = this.anIntArray431[local48];
				local54 = this.aClass4_Sub2_1.aShortArrayArray10[local48];
				if (local59 != 0 && local54 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local70 >= local54.length) {
								continue label96;
							}
							if ((local59 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								for (local81 = 0; local81 < 3; local81++) {
									local90 = local54[local70++] & 0xFFFF;
									if (local38 < local90) {
										local38 = local90;
									}
									if (local36 > local90) {
										local36 = local90;
									}
									local32.f(local90);
								}
								local34++;
							}
						}
					}
				}
			}
		} else {
			label122: for (local42 = 0; local42 < arg0; local42++) {
				local48 = arg1[local42];
				local54 = this.aClass4_Sub2_1.aShortArrayArray10[local48];
				local59 = this.anIntArray431[local48];
				if (local59 != 0 && local54 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local54.length <= local70) {
								continue label122;
							}
							if ((local59 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								for (local81 = 0; local81 < 3; local81++) {
									local90 = local54[local70++] & 0xFFFF;
									if (local36 > local90) {
										local36 = local90;
									}
									local32.d(local90);
									if (local38 < local90) {
										local38 = local90;
									}
								}
								local34++;
							}
						}
					}
				}
			}
		}
		local32.a();
		if (!local18.method6241() || local34 <= 0) {
			return;
		}
		this.aClass15_Sub2_9.method5359((this.aClass4_Sub2_1.anInt7428 & 0x7) != 0, (this.aClass4_Sub2_1.anInt7428 & 0x8) != 0, this.anInt6329);
		if (this.aClass15_Sub2_9.aBoolean547) {
			this.aClass15_Sub2_9.LA(Integer.MAX_VALUE, this.anInt6328, this.anInt6322, this.anInt6327);
		}
		@Pc(283) Class255_Sub3 local283 = this.aClass15_Sub2_9.method5465();
		local283.method8042(1.0F, 1.0F / this.aFloat125, 1.0F / this.aFloat125);
		this.aClass15_Sub2_9.method5485(Static317.aClass359_13);
		this.aClass15_Sub2_9.method5376(1, this.anInterface2_6);
		this.aClass15_Sub2_9.method5391(this.aClass4_Sub2_1.aClass142_19);
		this.aClass15_Sub2_9.method5375(local36, Static18.aClass32_2, 0, local34, local38 + 1 - local36, local18);
		this.aClass15_Sub2_9.method5442();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method5268(@OriginalArg(1) int arg0) {
		this.aStream4.b(arg0 * 4 + 3);
		this.aStream4.c(-1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
	public void method5270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray431[arg0 * this.aClass4_Sub2_1.anInt10461 + arg1] |= 0x1 << arg2;
		this.anInt6321++;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	public void method5272(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass15_Sub2_9.method5423(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	public void method5273(@OriginalArg(1) int arg0) {
		this.aStream4.a();
		this.anInterface2_6 = this.aClass15_Sub2_9.method5383(false);
		this.anInterface2_6.method5803(arg0 * 4, this.aNativeHeapBuffer6, 4);
		this.aNativeHeapBuffer6 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(FIIII)V")
	public void method5274(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(28) int local28;
		@Pc(44) int local44;
		if (this.anInt6329 != -1) {
			@Pc(23) Class178 local23 = this.aClass15_Sub2_9.anInterface4_11.method3088(this.anInt6329);
			local28 = local23.aByte52 & 0xFF;
			@Pc(70) int local70;
			if (local28 != 0 && local23.aByte54 != 4) {
				if (arg3 < 0) {
					local44 = 0;
				} else if (arg3 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg3 * 131586;
				}
				if (local28 == 256) {
					arg2 = local44;
				} else {
					local70 = 256 - local28;
					arg2 = (local28 * (local44 & 0xFF00FF) + local70 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((local44 & 0xFF00) * local28 + (arg2 & 0xFF00) * local70 & 0xFF0000) >> 8;
				}
			}
			local44 = local23.aByte57 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(120) int local120 = (arg2 >> 16 & 0xFF) * local44;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local70 = local44 * (arg2 >> 8 & 0xFF);
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(146) int local146 = local44 * (arg2 & 0xFF);
				if (local146 > 65535) {
					local146 = 65535;
				}
				arg2 = (local70 & 0xFF00) + ((local120 << 8 & 0xFF0024) + (local146 >> 8));
			}
		}
		if (arg0 != 1.0F) {
			@Pc(176) int local176 = arg2 >> 16 & 0xFF;
			local28 = arg2 >> 8 & 0xFF;
			local44 = arg2 & 0xFF;
			local176 = (int) ((float) local176 * arg0);
			local28 = (int) ((float) local28 * arg0);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local44 = (int) ((float) local44 * arg0);
			if (local28 < 0) {
				local28 = 0;
			} else if (local28 > 255) {
				local28 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg2 = local44 | local176 << 16 | local28 << 8;
		}
		this.aStream4.b(arg1 * 4);
		if (this.aClass15_Sub2_9.anInt6540 == 0) {
			this.aStream4.c((byte) arg2);
			this.aStream4.c((byte) (arg2 >> 8));
			this.aStream4.c((byte) (arg2 >> 16));
		} else {
			this.aStream4.c((byte) (arg2 >> 16));
			this.aStream4.c((byte) (arg2 >> 8));
			this.aStream4.c((byte) arg2);
		}
	}
}
