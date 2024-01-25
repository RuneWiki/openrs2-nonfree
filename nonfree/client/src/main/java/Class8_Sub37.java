import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class8_Sub37 extends Class8 {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!el;")
	private Interface4 anInterface4_16;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	public int anInt7411 = 0;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Lclient!um;")
	private final Class86_Sub3 aClass86_Sub3_3;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "I")
	public final int anInt7412;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	public final int anInt7413;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_17;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	public final int anInt7407;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
	private final int[] anIntArray399;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "F")
	public final float aFloat170;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "I")
	public final int anInt7409;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!um;IIIII)V")
	public Class8_Sub37(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub3_3 = arg0;
		this.anInt7412 = arg1;
		this.anInt7413 = arg5;
		this.aClass16_Sub1_17 = this.aClass86_Sub3_3.aClass16_Sub1_22;
		this.anInt7407 = arg3;
		this.anIntArray399 = new int[this.aClass86_Sub3_3.anInt9953 * this.aClass86_Sub3_3.anInt9955];
		this.aFloat170 = arg2;
		this.anInt7409 = arg4;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBI)V")
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray399[arg0 + arg2 * this.aClass86_Sub3_3.anInt9955] |= 0x1 << arg1;
		this.anInt7411++;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	public void method6045(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass16_Sub1_17.method3996(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
	public void method6046(@OriginalArg(1) int arg0) {
		this.aStream7.b();
		this.anInterface4_16 = this.aClass16_Sub1_17.method3988(false);
		this.anInterface4_16.method6504(this.aNativeHeapBuffer7, 4, arg0 * 4);
		this.aNativeHeapBuffer7 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI[I)V")
	public void method6047(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface13 local14 = this.aClass16_Sub1_17.method3970(this.anInt7411 * 3);
		@Pc(19) Buffer local19 = local14.method4654();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass16_Sub1_17.method3981(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(39) int local39 = -32768;
		@Pc(89) int local89;
		@Pc(60) short[] local60;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(43) int local43;
		@Pc(66) int local66;
		@Pc(68) int local68;
		@Pc(80) int local80;
		if (Stream.c()) {
			label118: for (local43 = 0; local43 < arg0; local43++) {
				local49 = arg1[local43];
				local54 = this.anIntArray399[local49];
				local60 = this.aClass86_Sub3_3.aShortArrayArray12[local49];
				if (local54 != 0 && local60 != null) {
					local66 = 0;
					local68 = 0;
					while (true) {
						while (true) {
							if (local68 >= local60.length) {
								continue label118;
							}
							if ((local54 & 0x1 << local66++) == 0) {
								local68 += 3;
							} else {
								local30++;
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local60[local68++] & 0xFFFF;
									if (local32 > local89) {
										local32 = local89;
									}
									local28.f(local89);
									if (local89 > local39) {
										local39 = local89;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label93: for (local43 = 0; local43 < arg0; local43++) {
				local49 = arg1[local43];
				local60 = this.aClass86_Sub3_3.aShortArrayArray12[local49];
				local54 = this.anIntArray399[local49];
				if (local54 != 0 && local60 != null) {
					local66 = 0;
					local68 = 0;
					while (true) {
						while (true) {
							if (local60.length <= local68) {
								continue label93;
							}
							if ((local54 & 0x1 << local66++) == 0) {
								local68 += 3;
							} else {
								local30++;
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local60[local68++] & 0xFFFF;
									if (local32 > local89) {
										local32 = local89;
									}
									if (local39 < local89) {
										local39 = local89;
									}
									local28.c(local89);
								}
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method4655() || local30 <= 0) {
			return;
		}
		this.aClass16_Sub1_17.method3957((this.aClass86_Sub3_3.anInt9970 & 0x8) != 0, (this.aClass86_Sub3_3.anInt9970 & 0x7) != 0, this.anInt7412);
		if (this.aClass16_Sub1_17.aBoolean363) {
			this.aClass16_Sub1_17.EA(Integer.MAX_VALUE, this.anInt7407, this.anInt7409, this.anInt7413);
		}
		@Pc(272) Class54_Sub3 local272 = this.aClass16_Sub1_17.method3906();
		local272.method5156(1.0F / this.aFloat170, 1.0F, 1.0F / this.aFloat170);
		this.aClass16_Sub1_17.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_17.method3983(this.anInterface4_16, 1);
		this.aClass16_Sub1_17.method3967(this.aClass86_Sub3_3.aClass94_23);
		this.aClass16_Sub1_17.method3977(Static525.aClass342_3, local14, local32, local30, 0, local39 + 1 - local32);
		this.aClass16_Sub1_17.method3930();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public void method6049(@OriginalArg(0) int arg0) {
		this.aStream7.a(arg0 * 4 + 3);
		this.aStream7.b(-1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIFII)V")
	public void method6050(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(43) int local43;
		if (this.anInt7412 != -1) {
			@Pc(17) Class218 local17 = this.aClass16_Sub1_17.anInterface2_12.method4027(this.anInt7412);
			local22 = local17.aByte63 & 0xFF;
			@Pc(61) int local61;
			if (local22 != 0 && local17.aByte66 != 4) {
				if (arg0 < 0) {
					local43 = 0;
				} else if (arg0 <= 127) {
					local43 = arg0 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local22 == 256) {
					arg3 = local43;
				} else {
					local61 = 256 - local22;
					arg3 = (local22 * (local43 & 0xFF00FF) + (arg3 & 0xFF00FF) * local61 & 0xFF00FF00) + (local61 * (arg3 & 0xFF00) + local22 * (local43 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local43 = local17.aByte68 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(112) int local112 = local43 * (arg3 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local61 = (arg3 >> 8 & 0xFF) * local43;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(138) int local138 = local43 * (arg3 & 0xFF);
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg3 = (local61 & 0xFF00) + ((local112 & 0xF900FF00) << 8) + (local138 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local22 = arg3 >> 8 & 0xFF;
			local43 = arg3 & 0xFF;
			local176 = (int) ((float) local176 * arg1);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local22 = (int) ((float) local22 * arg1);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local43 = (int) ((float) local43 * arg1);
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg3 = local43 | local22 << 8 | local176 << 16;
		}
		this.aStream7.a(arg2 * 4);
		if (this.aClass16_Sub1_17.anInt4898 == 0) {
			this.aStream7.b((byte) arg3);
			this.aStream7.b((byte) (arg3 >> 8));
			this.aStream7.b((byte) (arg3 >> 16));
		} else {
			this.aStream7.b((byte) (arg3 >> 16));
			this.aStream7.b((byte) (arg3 >> 8));
			this.aStream7.b((byte) arg3);
		}
	}
}
