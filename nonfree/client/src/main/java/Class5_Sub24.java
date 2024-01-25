import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "Lclient!am;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
	public int anInt4521 = 0;

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "Lclient!via;")
	private final Class40_Sub3 aClass40_Sub3_2;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "[I")
	private final int[] anIntArray372;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
	public final int anInt4528;

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public final int anInt4516;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
	public final int anInt4524;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_9;

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "I")
	public final int anInt4529;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!via;IIIII)V")
	public Class5_Sub24(@OriginalArg(0) Class40_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass40_Sub3_2 = arg0;
		this.anIntArray372 = new int[this.aClass40_Sub3_2.anInt9923 * this.aClass40_Sub3_2.anInt9920];
		this.anInt4528 = arg5;
		this.aFloat68 = (float) arg2;
		this.anInt4516 = arg4;
		this.anInt4524 = arg1;
		this.aClass126_Sub2_9 = this.aClass40_Sub3_2.aClass126_Sub2_21;
		this.anInt4529 = arg3;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIII)V")
	public void method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray372[this.aClass40_Sub3_2.anInt9920 * arg1 + arg0] |= 0x1 << arg2;
		this.anInt4521++;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB[I)V")
	public void method4149(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface21 local14 = this.aClass126_Sub2_9.method5481(this.anInt4521 * 3);
		@Pc(21) Buffer local21 = local14.method5730();
		if (local21 == null) {
			return;
		}
		@Pc(30) Stream local30 = this.aClass126_Sub2_9.method5446(local21);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 32767;
		@Pc(44) int local44 = -32768;
		@Pc(99) int local99;
		@Pc(60) short[] local60;
		@Pc(54) int local54;
		@Pc(65) int local65;
		@Pc(48) int local48;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(90) int local90;
		if (Stream.b()) {
			label95: for (local48 = 0; local48 < arg0; local48++) {
				local54 = arg1[local48];
				local65 = this.anIntArray372[local54];
				local60 = this.aClass40_Sub3_2.aShortArrayArray21[local54];
				if (local65 != 0 && local60 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local73 >= local60.length) {
								continue label95;
							}
							if ((local65 & 0x1 << local71++) == 0) {
								local73 += 3;
							} else {
								local32++;
								for (local90 = 0; local90 < 3; local90++) {
									local99 = local60[local73++] & 0xFFFF;
									if (local99 > local44) {
										local44 = local99;
									}
									local30.b(local99);
									if (local34 > local99) {
										local34 = local99;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label121: for (local48 = 0; local48 < arg0; local48++) {
				local54 = arg1[local48];
				local60 = this.aClass40_Sub3_2.aShortArrayArray21[local54];
				local65 = this.anIntArray372[local54];
				if (local65 != 0 && local60 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local60.length <= local73) {
								continue label121;
							}
							if ((local65 & 0x1 << local71++) == 0) {
								local73 += 3;
							} else {
								for (local90 = 0; local90 < 3; local90++) {
									local99 = local60[local73++] & 0xFFFF;
									local30.d(local99);
									if (local99 < local34) {
										local34 = local99;
									}
									if (local44 < local99) {
										local44 = local99;
									}
								}
								local32++;
							}
						}
					}
				}
			}
		}
		local30.a();
		if (!local14.method5734() || local32 <= 0) {
			return;
		}
		this.aClass126_Sub2_9.method5482(this.anInt4524, (this.aClass40_Sub3_2.anInt9946 & 0x8) != 0, (this.aClass40_Sub3_2.anInt9946 & 0x7) != 0);
		if (this.aClass126_Sub2_9.aBoolean509) {
			this.aClass126_Sub2_9.EA(Integer.MAX_VALUE, this.anInt4529, this.anInt4516, this.anInt4528);
		}
		@Pc(274) Class117_Sub2 local274 = this.aClass126_Sub2_9.method5542();
		local274.method3878(1.0F / this.aFloat68, 1.0F / this.aFloat68, 1.0F);
		this.aClass126_Sub2_9.method5504(Static242.aClass52_2);
		this.aClass126_Sub2_9.method5451(1, this.anInterface1_5);
		this.aClass126_Sub2_9.method5524(this.aClass40_Sub3_2.aClass203_23);
		this.aClass126_Sub2_9.method5526(local14, Static370.aClass23_7, local32, 0, local44 + 1 - local34, local34);
		this.aClass126_Sub2_9.method5445();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIFIB)V")
	public void method4150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (this.anInt4524 != -1) {
			@Pc(13) Class321 local13 = this.aClass126_Sub2_9.anInterface8_10.method7813(this.anInt4524);
			local18 = local13.aByte117 & 0xFF;
			@Pc(61) int local61;
			if (local18 != 0 && local13.aByte115 != 4) {
				if (arg1 < 0) {
					local36 = 0;
				} else if (arg1 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg1 * 131586;
				}
				if (local18 == 256) {
					arg3 = local36;
				} else {
					local61 = 256 - local18;
					arg3 = (local18 * (local36 & 0xFF00) + local61 * (arg3 & 0xFF00) & 0xFF0000) + (local18 * (local36 & 0xFF00FF) + ((arg3 & 0xFF00FF) * local61) & 0xFF00FF00) >> 8;
				}
			}
			local36 = local13.aByte116 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(112) int local112 = local36 * (arg3 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local61 = local36 * (arg3 >> 8 & 0xFF);
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(138) int local138 = (arg3 & 0xFF) * local36;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg3 = (local112 << 8 & 0xFF004A) + (local61 & 0xFF00) + (local138 >> 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(173) int local173 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local173 = (int) ((float) local173 * arg2);
			local36 = arg3 & 0xFF;
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 255) {
				local173 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local36 = (int) ((float) local36 * arg2);
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg3 = local18 << 8 | local173 << 16 | local36;
		}
		this.aStream4.e(arg0 * 4);
		if (this.aClass126_Sub2_9.anInt6290 == 0) {
			this.aStream4.f((byte) arg3);
			this.aStream4.f((byte) (arg3 >> 8));
			this.aStream4.f((byte) (arg3 >> 16));
		} else {
			this.aStream4.f((byte) (arg3 >> 16));
			this.aStream4.f((byte) (arg3 >> 8));
			this.aStream4.f((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)V")
	public void method4151(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass126_Sub2_9.method5455(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer4, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	public void method4152(@OriginalArg(0) int arg0) {
		this.aStream4.e(arg0 * 4 + 3);
		this.aStream4.f(-1);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)V")
	public void method4153(@OriginalArg(0) int arg0) {
		this.aStream4.a();
		this.anInterface1_5 = this.aClass126_Sub2_9.method5530(false);
		this.anInterface1_5.method7718(arg0 * 4, this.aNativeHeapBuffer4, 4);
		this.aNativeHeapBuffer4 = null;
		this.aStream4 = null;
	}
}
