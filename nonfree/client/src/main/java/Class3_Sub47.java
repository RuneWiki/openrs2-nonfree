import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!so", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "Lclient!lq;")
	private Interface16 anInterface16_14;

	@OriginalMember(owner = "client!so", name = "x", descriptor = "I")
	public int anInt9655 = 0;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Lclient!tla;")
	private final Class313_Sub2 aClass313_Sub2_3;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_19;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	public final int anInt9656;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "F")
	public final float aFloat182;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "I")
	public final int anInt9650;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "I")
	public final int anInt9657;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[I")
	private final int[] anIntArray534;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public final int anInt9658;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!tla;IIIII)V")
	public Class3_Sub47(@OriginalArg(0) Class313_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass313_Sub2_3 = arg0;
		this.aClass67_Sub1_19 = this.aClass313_Sub2_3.aClass67_Sub1_21;
		this.anInt9656 = arg1;
		this.aFloat182 = (float) arg2;
		this.anInt9650 = arg4;
		this.anInt9657 = arg5;
		this.anIntArray534 = new int[this.aClass313_Sub2_3.anInt10875 * this.aClass313_Sub2_3.anInt10872];
		this.anInt9658 = arg3;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BIII)V")
	public void method8144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray534[this.aClass313_Sub2_3.anInt10875 * arg2 + arg0] |= 0x1 << arg1;
		this.anInt9655++;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[II)V")
	public void method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(16) Interface5 local16 = this.aClass67_Sub1_19.method5571(this.anInt9655 * 3);
		@Pc(21) Buffer local21 = local16.method9252();
		if (local21 == null) {
			return;
		}
		@Pc(31) Stream local31 = this.aClass67_Sub1_19.method5616(local21);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 32767;
		@Pc(37) int local37 = -32768;
		@Pc(94) int local94;
		@Pc(58) short[] local58;
		@Pc(47) int local47;
		@Pc(52) int local52;
		@Pc(41) int local41;
		@Pc(66) int local66;
		@Pc(68) int local68;
		@Pc(85) int local85;
		if (Stream.b()) {
			label93: for (local41 = 0; local41 < arg0; local41++) {
				local47 = arg1[local41];
				local58 = this.aClass313_Sub2_3.aShortArrayArray5[local47];
				local52 = this.anIntArray534[local47];
				if (local52 != 0 && local58 != null) {
					local66 = 0;
					local68 = 0;
					while (true) {
						while (true) {
							if (local68 >= local58.length) {
								continue label93;
							}
							if ((0x1 << local66++ & local52) == 0) {
								local68 += 3;
							} else {
								local33++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local58[local68++] & 0xFFFF;
									local31.b(local94);
									if (local94 < local35) {
										local35 = local94;
									}
									if (local37 < local94) {
										local37 = local94;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label118: for (local41 = 0; local41 < arg0; local41++) {
				local47 = arg1[local41];
				local52 = this.anIntArray534[local47];
				local58 = this.aClass313_Sub2_3.aShortArrayArray5[local47];
				if (local52 != 0 && local58 != null) {
					local66 = 0;
					local68 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local68) {
								continue label118;
							}
							if ((0x1 << local66++ & local52) == 0) {
								local68 += 3;
							} else {
								local33++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local58[local68++] & 0xFFFF;
									if (local35 > local94) {
										local35 = local94;
									}
									local31.d(local94);
									if (local37 < local94) {
										local37 = local94;
									}
								}
							}
						}
					}
				}
			}
		}
		local31.a();
		if (!local16.method9250() || local33 <= 0) {
			return;
		}
		this.aClass67_Sub1_19.method5575((this.aClass313_Sub2_3.anInt10037 & 0x7) != 0, (this.aClass313_Sub2_3.anInt10037 & 0x8) != 0, this.anInt9656);
		if (this.aClass67_Sub1_19.aBoolean517) {
			this.aClass67_Sub1_19.EA(Integer.MAX_VALUE, this.anInt9658, this.anInt9650, this.anInt9657);
		}
		@Pc(304) Class181_Sub1 local304 = this.aClass67_Sub1_19.method5601();
		local304.method4918(1.0F / this.aFloat182, 1.0F, 1.0F / this.aFloat182);
		this.aClass67_Sub1_19.method5666(Static32.aClass96_1);
		this.aClass67_Sub1_19.method5620(this.anInterface16_14, 1);
		this.aClass67_Sub1_19.method5569(this.aClass313_Sub2_3.aClass212_23);
		this.aClass67_Sub1_19.method5659(local16, 0, local37 + 1 - local35, local33, local35, Static508.aClass281_7);
		this.aClass67_Sub1_19.method5614();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
	public void method8146(@OriginalArg(1) int arg0) {
		this.aStream7.a();
		this.anInterface16_14 = this.aClass67_Sub1_19.method5649(false);
		this.anInterface16_14.method7125(this.aNativeHeapBuffer8, 4, arg0 * 4);
		this.aNativeHeapBuffer8 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
	public void method8148(@OriginalArg(0) int arg0) {
		this.aStream7.e(arg0 * 4 + 3);
		this.aStream7.f(-1);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public void method8149(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass67_Sub1_19.method5594(true, arg0 * 4);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IFIII)V")
	public void method8150(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(38) int local38;
		if (this.anInt9656 != -1) {
			@Pc(14) Class32 local14 = this.aClass67_Sub1_19.anInterface2_11.method1027(this.anInt9656);
			local19 = local14.aByte20 & 0xFF;
			@Pc(64) int local64;
			if (local19 != 0 && local14.aByte25 != 4) {
				if (arg3 < 0) {
					local38 = 0;
				} else if (arg3 > 127) {
					local38 = 16777215;
				} else {
					local38 = arg3 * 131586;
				}
				if (local19 == 256) {
					arg0 = local38;
				} else {
					local64 = 256 - local19;
					arg0 = ((arg0 & 0xFF00) * local64 + (local38 & 0xFF00) * local19 & 0xFF0000) + (local64 * (arg0 & 0xFF00FF) + (local38 & 0xFF00FF) * local19 & 0xFF00FF00) >> 8;
				}
			}
			local38 = local14.aByte24 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(110) int local110 = local38 * (arg0 >> 16 & 0xFF);
				if (local110 > 65535) {
					local110 = 65535;
				}
				local64 = local38 * (arg0 >> 8 & 0xFF);
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(134) int local134 = local38 * (arg0 & 0xFF);
				if (local134 > 65535) {
					local134 = 65535;
				}
				arg0 = (local134 >> 8) + (local110 << 8 & 0xFF00BA) + (local64 & 0xFF00);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(177) int local177 = arg0 >> 16 & 0xFF;
			local19 = arg0 >> 8 & 0xFF;
			local38 = arg0 & 0xFF;
			local177 = (int) ((float) local177 * arg1);
			local19 = (int) ((float) local19 * arg1);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local38 = (int) ((float) local38 * arg1);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg0 = local19 << 8 | local177 << 16 | local38;
		}
		this.aStream7.e(arg2 * 4);
		if (this.aClass67_Sub1_19.anInt6670 == 0) {
			this.aStream7.f((byte) arg0);
			this.aStream7.f((byte) (arg0 >> 8));
			this.aStream7.f((byte) (arg0 >> 16));
		} else {
			this.aStream7.f((byte) (arg0 >> 16));
			this.aStream7.f((byte) (arg0 >> 8));
			this.aStream7.f((byte) arg0);
		}
	}
}
