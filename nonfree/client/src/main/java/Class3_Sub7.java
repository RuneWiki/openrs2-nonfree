import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "Lclient!km;")
	private Interface15 anInterface15_3;

	@OriginalMember(owner = "client!bha", name = "B", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!bha", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!bha", name = "G", descriptor = "I")
	public int anInt914 = 0;

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "Lclient!qq;")
	private final Class35_Sub3 aClass35_Sub3_1;

	@OriginalMember(owner = "client!bha", name = "A", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_5;

	@OriginalMember(owner = "client!bha", name = "y", descriptor = "F")
	public final float aFloat8;

	@OriginalMember(owner = "client!bha", name = "C", descriptor = "I")
	public final int anInt913;

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "I")
	public final int anInt910;

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "[I")
	private final int[] anIntArray54;

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
	public final int anInt903;

	@OriginalMember(owner = "client!bha", name = "z", descriptor = "I")
	public final int anInt912;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!qq;IIIII)V")
	public Class3_Sub7(@OriginalArg(0) Class35_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass35_Sub3_1 = arg0;
		this.aClass95_Sub1_5 = this.aClass35_Sub3_1.aClass95_Sub1_19;
		this.aFloat8 = (float) arg2;
		this.anInt913 = arg1;
		this.anInt910 = arg5;
		this.anIntArray54 = new int[this.aClass35_Sub3_1.anInt9149 * this.aClass35_Sub3_1.anInt9148];
		this.anInt903 = arg4;
		this.anInt912 = arg3;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIFI)V")
	public void method808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(33) int local33;
		if (this.anInt913 != -1) {
			@Pc(13) Class250 local13 = this.aClass95_Sub1_5.anInterface2_12.method8330(this.anInt913);
			local18 = local13.aByte96 & 0xFF;
			@Pc(62) int local62;
			if (local18 != 0 && local13.aByte93 != 4) {
				if (arg1 < 0) {
					local33 = 0;
				} else if (arg1 <= 127) {
					local33 = arg1 * 131586;
				} else {
					local33 = 16777215;
				}
				if (local18 == 256) {
					arg0 = local33;
				} else {
					local62 = 256 - local18;
					arg0 = ((local33 & 0xFF00) * local18 + local62 * (arg0 & 0xFF00) & 0xFF0000) + ((local33 & 0xFF00FF) * local18 + local62 * (arg0 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local33 = local13.aByte94 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(108) int local108 = local33 * (arg0 >> 16 & 0xFF);
				if (local108 > 65535) {
					local108 = 65535;
				}
				local62 = (arg0 >> 8 & 0xFF) * local33;
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(136) int local136 = (arg0 & 0xFF) * local33;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg0 = (local136 >> 8) + (local62 & 0xFF00) + (local108 << 8 & 0xFF0069);
			}
		}
		this.aStream1.d(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(187) int local187 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local33 = arg0 & 0xFF;
			local187 = (int) ((float) local187 * arg2);
			if (local187 < 0) {
				local187 = 0;
			} else if (local187 > 255) {
				local187 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local33 = (int) ((float) local33 * arg2);
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg0 = local18 << 8 | local187 << 16 | local33;
		}
		if (this.aClass95_Sub1_5.anInt10057 == 0) {
			this.aStream1.c((byte) arg0);
			this.aStream1.c((byte) (arg0 >> 8));
			this.aStream1.c((byte) (arg0 >> 16));
		} else {
			this.aStream1.c((byte) (arg0 >> 16));
			this.aStream1.c((byte) (arg0 >> 8));
			this.aStream1.c((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ[I)V")
	public void method809(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface22 local14 = this.aClass95_Sub1_5.method8161(this.anInt914 * 3);
		@Pc(19) Buffer local19 = local14.method7405();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass95_Sub1_5.method8157(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(89) int local89;
		@Pc(50) short[] local50;
		@Pc(44) int local44;
		@Pc(55) int local55;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(80) int local80;
		if (Stream.b()) {
			label122: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local50 = this.aClass35_Sub3_1.aShortArrayArray10[local44];
				local55 = this.anIntArray54[local44];
				if (local55 != 0 && local50 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local66 >= local50.length) {
								continue label122;
							}
							if ((local55 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local50[local66++] & 0xFFFF;
									if (local89 > local34) {
										local34 = local89;
									}
									local28.a(local89);
									if (local32 > local89) {
										local32 = local89;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label96: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local50 = this.aClass35_Sub3_1.aShortArrayArray10[local44];
				local55 = this.anIntArray54[local44];
				if (local55 != 0 && local50 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local66 >= local50.length) {
								continue label96;
							}
							if ((0x1 << local64++ & local55) == 0) {
								local66 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local50[local66++] & 0xFFFF;
									local28.e(local89);
									if (local34 < local89) {
										local34 = local89;
									}
									if (local32 > local89) {
										local32 = local89;
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
		if (!local14.method7407() || local30 <= 0) {
			return;
		}
		this.aClass95_Sub1_5.method8118((this.aClass35_Sub3_1.anInt7918 & 0x8) != 0, this.anInt913, (this.aClass35_Sub3_1.anInt7918 & 0x7) != 0);
		if (this.aClass95_Sub1_5.aBoolean698) {
			this.aClass95_Sub1_5.EA(Integer.MAX_VALUE, this.anInt912, this.anInt903, this.anInt910);
		}
		@Pc(268) Class17_Sub2 local268 = this.aClass95_Sub1_5.method8141();
		local268.method5843(1.0F / this.aFloat8, 1.0F / this.aFloat8, 1.0F);
		this.aClass95_Sub1_5.method8148(Static345.aClass366_6);
		this.aClass95_Sub1_5.method8133(this.anInterface15_3, 1);
		this.aClass95_Sub1_5.method8166(this.aClass35_Sub3_1.aClass94_8);
		this.aClass95_Sub1_5.method8109(local30, 0, local34 + 1 - local32, Static649.aClass115_6, local32, local14);
		this.aClass95_Sub1_5.method8142();
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIZ)V")
	public void method812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray54[arg2 + arg1 * this.aClass35_Sub3_1.anInt9149] |= 0x1 << arg0;
		this.anInt914++;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ)V")
	public void method813(@OriginalArg(0) int arg0) {
		this.aStream1.a();
		this.anInterface15_3 = this.aClass95_Sub1_5.method8090(false);
		this.anInterface15_3.method5527(4, this.aNativeHeapBuffer1, arg0 * 4);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IB)V")
	public void method814(@OriginalArg(0) int arg0) {
		this.aStream1.d(arg0 * 4 + 3);
		this.aStream1.c(-1);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)V")
	public void method815(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass95_Sub1_5.method8074(true, arg0 * 4);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}
}
