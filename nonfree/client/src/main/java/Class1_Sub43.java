import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!bca;")
	private Interface4 anInterface4_10;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	public int anInt7597 = 0;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Lclient!ni;")
	private final Class47_Sub2 aClass47_Sub2_2;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	public final int anInt7589;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
	public final int anInt7591;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	public final int anInt7598;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "F")
	public final float aFloat166;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	public final int anInt7587;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_16;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "[I")
	private final int[] anIntArray586;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!ni;IIIII)V")
	public Class1_Sub43(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass47_Sub2_2 = arg0;
		this.anInt7589 = arg3;
		this.anInt7591 = arg4;
		this.anInt7598 = arg5;
		this.aFloat166 = arg2;
		this.anInt7587 = arg1;
		this.aClass134_Sub1_16 = this.aClass47_Sub2_2.aClass134_Sub1_14;
		this.anIntArray586 = new int[this.aClass47_Sub2_2.anInt9210 * this.aClass47_Sub2_2.anInt9209];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
	public void method6038(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface20 local14 = this.aClass134_Sub1_16.method6828(this.anInt7597 * 3);
		@Pc(19) Buffer local19 = local14.method7387();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass134_Sub1_16.method6846(local19);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 32767;
		@Pc(39) int local39 = -32768;
		@Pc(91) int local91;
		@Pc(55) short[] local55;
		@Pc(49) int local49;
		@Pc(60) int local60;
		@Pc(43) int local43;
		@Pc(66) int local66;
		@Pc(68) int local68;
		@Pc(82) int local82;
		if (Stream.c()) {
			label96: for (local43 = 0; local43 < arg1; local43++) {
				local49 = arg0[local43];
				local60 = this.anIntArray586[local49];
				local55 = this.aClass47_Sub2_2.aShortArrayArray3[local49];
				if (local60 != 0 && local55 != null) {
					local66 = 0;
					local68 = 0;
					while (true) {
						while (true) {
							if (local55.length <= local68) {
								continue label96;
							}
							if ((local60 & 0x1 << local66++) == 0) {
								local68 += 3;
							} else {
								for (local82 = 0; local82 < 3; local82++) {
									local91 = local55[local68++] & 0xFFFF;
									local28.c(local91);
									if (local91 > local39) {
										local39 = local91;
									}
									if (local37 > local91) {
										local37 = local91;
									}
								}
								local35++;
							}
						}
					}
				}
			}
		} else {
			label122: for (local43 = 0; local43 < arg1; local43++) {
				local49 = arg0[local43];
				local55 = this.aClass47_Sub2_2.aShortArrayArray3[local49];
				local60 = this.anIntArray586[local49];
				if (local60 != 0 && local55 != null) {
					local66 = 0;
					local68 = 0;
					while (true) {
						while (true) {
							if (local68 >= local55.length) {
								continue label122;
							}
							if ((local60 & 0x1 << local66++) == 0) {
								local68 += 3;
							} else {
								for (local82 = 0; local82 < 3; local82++) {
									local91 = local55[local68++] & 0xFFFF;
									local28.a(local91);
									if (local39 < local91) {
										local39 = local91;
									}
									if (local91 < local37) {
										local37 = local91;
									}
								}
								local35++;
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method7389() || local35 <= 0) {
			return;
		}
		this.aClass134_Sub1_16.method6857((this.aClass47_Sub2_2.anInt5888 & 0x7) != 0, (this.aClass47_Sub2_2.anInt5888 & 0x8) != 0, this.anInt7587);
		if (this.aClass134_Sub1_16.aBoolean635) {
			this.aClass134_Sub1_16.YA(Integer.MAX_VALUE, this.anInt7589, this.anInt7591, this.anInt7598);
		}
		@Pc(265) Class113_Sub3 local265 = this.aClass134_Sub1_16.method6748();
		local265.method6054(1.0F, 1.0F / this.aFloat166, 1.0F / this.aFloat166);
		this.aClass134_Sub1_16.method6808(Static117.aClass309_2);
		this.aClass134_Sub1_16.method6829(1, this.anInterface4_10);
		this.aClass134_Sub1_16.method6743(this.aClass47_Sub2_2.aClass284_13);
		this.aClass134_Sub1_16.method6765(Static470.aClass185_5, local35, local37, local14, local39 + 1 - local37, 0);
		this.aClass134_Sub1_16.method6813();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public void method6040(@OriginalArg(1) int arg0) {
		this.aStream6.b(arg0 * 4 + 3);
		this.aStream6.f(-1);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
	public void method6041(@OriginalArg(0) int arg0) {
		this.aStream6.a();
		this.anInterface4_10 = this.aClass134_Sub1_16.method6805(false);
		this.anInterface4_10.method2467(arg0 * 4, 4, this.aNativeHeapBuffer6);
		this.aNativeHeapBuffer6 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIFII)V")
	public void method6043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(34) int local34;
		if (this.anInt7587 != -1) {
			@Pc(14) Class3 local14 = this.aClass134_Sub1_16.anInterface7_10.method3874(this.anInt7587);
			local19 = local14.aByte2 & 0xFF;
			@Pc(58) int local58;
			if (local19 != 0 && local14.aByte7 != 4) {
				if (arg1 < 0) {
					local34 = 0;
				} else if (arg1 <= 127) {
					local34 = arg1 * 131586;
				} else {
					local34 = 16777215;
				}
				if (local19 == 256) {
					arg0 = local34;
				} else {
					local58 = 256 - local19;
					arg0 = ((local34 & 0xFF00FF) * local19 + local58 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((local34 & 0xFF00) * local19 + (local58 * (arg0 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local34 = local14.aByte5 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(106) int local106 = (arg0 >> 16 & 0xFF) * local34;
				if (local106 > 65535) {
					local106 = 65535;
				}
				local58 = (arg0 >> 8 & 0xFF) * local34;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(130) int local130 = (arg0 & 0xFF) * local34;
				if (local130 > 65535) {
					local130 = 65535;
				}
				arg0 = (local130 >> 8) + (local106 << 8 & 0xFF0026) + (local58 & 0xFF00);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(163) int local163 = arg0 >> 16 & 0xFF;
			local19 = arg0 >> 8 & 0xFF;
			local34 = arg0 & 0xFF;
			local163 = (int) ((float) local163 * arg2);
			if (local163 < 0) {
				local163 = 0;
			} else if (local163 > 255) {
				local163 = 255;
			}
			local19 = (int) ((float) local19 * arg2);
			local34 = (int) ((float) local34 * arg2);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg0 = local163 << 16 | local19 << 8 | local34;
		}
		this.aStream6.b(arg3 * 4);
		if (this.aClass134_Sub1_16.anInt8438 == 0) {
			this.aStream6.f((byte) arg0);
			this.aStream6.f((byte) (arg0 >> 8));
			this.aStream6.f((byte) (arg0 >> 16));
		} else {
			this.aStream6.f((byte) (arg0 >> 16));
			this.aStream6.f((byte) (arg0 >> 8));
			this.aStream6.f((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)V")
	public void method6044(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass134_Sub1_16.method6758(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZI)V")
	public void method6045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray586[this.aClass47_Sub2_2.anInt9209 * arg2 + arg0] |= 0x1 << arg1;
		this.anInt7597++;
	}
}
