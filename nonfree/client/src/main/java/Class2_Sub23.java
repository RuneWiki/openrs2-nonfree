import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!tq;")
	private Interface19 anInterface19_3;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public int anInt2775 = 0;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!eo;")
	private final Class75_Sub1 aClass75_Sub1_1;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public final int anInt2771;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public final int anInt2768;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	public final int anInt2773;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "F")
	public final float aFloat50;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_10;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	private final int[] anIntArray339;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	public final int anInt2766;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!eo;IIIII)V")
	public Class2_Sub23(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass75_Sub1_1 = arg0;
		this.anInt2771 = arg1;
		this.anInt2768 = arg5;
		this.anInt2773 = arg3;
		this.aFloat50 = arg2;
		this.aClass39_Sub2_10 = this.aClass75_Sub1_1.aClass39_Sub2_8;
		this.anIntArray339 = new int[this.aClass75_Sub1_1.anInt7995 * this.aClass75_Sub1_1.anInt7998];
		this.anInt2766 = arg4;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
	public void method2614(@OriginalArg(0) int arg0) {
		this.aStream1.a(arg0 * 4 + 3);
		this.aStream1.b(-1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIB)V")
	public void method2615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray339[arg0 * this.aClass75_Sub1_1.anInt7998 + arg1] |= 0x1 << arg2;
		this.anInt2775++;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)V")
	public void method2616(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass39_Sub2_10.method6115(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public void method2617(@OriginalArg(1) int arg0) {
		this.aStream1.c();
		this.anInterface19_3 = this.aClass39_Sub2_10.method6100(false);
		this.anInterface19_3.method6489(this.aNativeHeapBuffer1, arg0 * 4, 4);
		this.aStream1 = null;
		this.aNativeHeapBuffer1 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IFIII)V")
	public void method2618(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(41) int local41;
		if (this.anInt2771 != -1) {
			@Pc(14) Class204 local14 = this.aClass39_Sub2_10.anInterface12_15.method2573(this.anInt2771);
			local19 = local14.aByte83 & 0xFF;
			@Pc(63) int local63;
			if (local19 != 0 && local14.aByte85 != 4) {
				if (arg2 < 0) {
					local41 = 0;
				} else if (arg2 <= 127) {
					local41 = arg2 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local19 == 256) {
					arg3 = local41;
				} else {
					local63 = 256 - local19;
					arg3 = ((arg3 & 0xFF00FF) * local63 + (local41 & 0xFF00FF) * local19 & 0xFF00FF00) + ((local41 & 0xFF00) * local19 + ((arg3 & 0xFF00) * local63) & 0xFF0000) >> 8;
				}
			}
			local41 = local14.aByte82 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(114) int local114 = local41 * (arg3 >> 16 & 0xFF);
				if (local114 > 65535) {
					local114 = 65535;
				}
				local63 = (arg3 >> 8 & 0xFF) * local41;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(140) int local140 = (arg3 & 0xFF) * local41;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local140 >> 8) + (local63 & 0xFF00) + (local114 << 8 & 0xFF007D);
			}
		}
		this.aStream1.a(arg1 * 4);
		if (arg0 != 1.0F) {
			@Pc(185) int local185 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local41 = arg3 & 0xFF;
			local185 = (int) ((float) local185 * arg0);
			if (local185 < 0) {
				local185 = 0;
			} else if (local185 > 255) {
				local185 = 255;
			}
			local19 = (int) ((float) local19 * arg0);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local41 = (int) ((float) local41 * arg0);
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg3 = local19 << 8 | local185 << 16 | local41;
		}
		if (this.aClass39_Sub2_10.anInt7313 == 0) {
			this.aStream1.b((byte) arg3);
			this.aStream1.b((byte) (arg3 >> 8));
			this.aStream1.b((byte) (arg3 >> 16));
		} else {
			this.aStream1.b((byte) (arg3 >> 16));
			this.aStream1.b((byte) (arg3 >> 8));
			this.aStream1.b((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([III)V")
	public void method2620(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Interface7 local14 = this.aClass39_Sub2_10.method6129(this.anInt2775 * 3);
		@Pc(19) Buffer local19 = local14.method6952();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass39_Sub2_10.method6195(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(94) int local94;
		@Pc(59) short[] local59;
		@Pc(48) int local48;
		@Pc(53) int local53;
		@Pc(42) int local42;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(85) int local85;
		if (Stream.a()) {
			label96: for (local42 = 0; local42 < arg1; local42++) {
				local48 = arg0[local42];
				local59 = this.aClass75_Sub1_1.aShortArrayArray1[local48];
				local53 = this.anIntArray339[local48];
				if (local53 != 0 && local59 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local59.length <= local70) {
								continue label96;
							}
							if ((0x1 << local68++ & local53) == 0) {
								local70 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local59[local70++] & 0xFFFF;
									if (local34 < local94) {
										local34 = local94;
									}
									local28.f(local94);
									if (local32 > local94) {
										local32 = local94;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label121: for (local42 = 0; local42 < arg1; local42++) {
				local48 = arg0[local42];
				local53 = this.anIntArray339[local48];
				local59 = this.aClass75_Sub1_1.aShortArrayArray1[local48];
				if (local53 != 0 && local59 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local70 >= local59.length) {
								continue label121;
							}
							if ((local53 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								local30++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local59[local70++] & 0xFFFF;
									if (local94 > local34) {
										local34 = local94;
									}
									local28.e(local94);
									if (local32 > local94) {
										local32 = local94;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.c();
		if (!local14.method6954() || local30 <= 0) {
			return;
		}
		this.aClass39_Sub2_10.method6208((this.aClass75_Sub1_1.anInt2246 & 0x7) != 0, this.anInt2771, (this.aClass75_Sub1_1.anInt2246 & 0x8) != 0);
		if (this.aClass39_Sub2_10.aBoolean533) {
			this.aClass39_Sub2_10.JA(Integer.MAX_VALUE, this.anInt2773, this.anInt2766, this.anInt2768);
		}
		@Pc(279) Class181_Sub2 local279 = this.aClass39_Sub2_10.method6133();
		local279.method5401(1.0F / this.aFloat50, 1.0F, 1.0F / this.aFloat50);
		this.aClass39_Sub2_10.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_10.method6200(this.aClass75_Sub1_1.aClass304_1);
		this.aClass39_Sub2_10.method6095(1, this.anInterface19_3);
		this.aClass39_Sub2_10.method6215(local14, 0, Static514.aClass281_6, local30, local32, local34 + 1 - local32);
		this.aClass39_Sub2_10.method6111();
	}
}
