import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Lclient!mha;")
	private Interface16 anInterface16_11;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
	public int anInt3067 = 0;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!ek;")
	private final Class104_Sub1 aClass104_Sub1_2;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "[I")
	private final int[] anIntArray200;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_8;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "F")
	public final float aFloat80;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	public final int anInt3060;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	public final int anInt3066;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public final int anInt3057;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	public final int anInt3061;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!ek;IIIII)V")
	public Class3_Sub19(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub1_2 = arg0;
		this.anIntArray200 = new int[this.aClass104_Sub1_2.anInt9715 * this.aClass104_Sub1_2.anInt9718];
		this.aClass16_Sub1_8 = this.aClass104_Sub1_2.aClass16_Sub1_7;
		this.aFloat80 = (float) arg2;
		this.anInt3060 = arg5;
		this.anInt3066 = arg4;
		this.anInt3057 = arg1;
		this.anInt3061 = arg3;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public void method2794(@OriginalArg(0) int arg0) {
		this.aStream3.b(arg0 * 4 + 3);
		this.aStream3.d(-1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V")
	public void method2796(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass16_Sub1_8.method6315(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer4, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
	public void method2797(@OriginalArg(0) int arg0) {
		this.aStream3.b();
		this.anInterface16_11 = this.aClass16_Sub1_8.method6244(false);
		this.anInterface16_11.method6038(this.aNativeHeapBuffer4, 4, arg0 * 4);
		this.aNativeHeapBuffer4 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIBI)V")
	public void method2799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray200[arg0 + arg2 * this.aClass104_Sub1_2.anInt9718] |= 0x1 << arg1;
		this.anInt3067++;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIFII)V")
	public void method2800(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(26) int local26;
		@Pc(46) int local46;
		if (this.anInt3057 != -1) {
			@Pc(21) Class342 local21 = this.aClass16_Sub1_8.anInterface5_12.method5193(this.anInt3057);
			local26 = local21.aByte126 & 0xFF;
			@Pc(72) int local72;
			if (local26 != 0 && local21.aByte129 != 4) {
				if (arg3 < 0) {
					local46 = 0;
				} else if (arg3 > 127) {
					local46 = 16777215;
				} else {
					local46 = arg3 * 131586;
				}
				if (local26 == 256) {
					arg0 = local46;
				} else {
					local72 = 256 - local26;
					arg0 = (local26 * (local46 & 0xFF00) + local72 * (arg0 & 0xFF00) & 0xFF0000) + ((arg0 & 0xFF00FF) * local72 + (local46 & 0xFF00FF) * local26 & 0xFF00FF00) >> 8;
				}
			}
			local46 = local21.aByte124 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(122) int local122 = local46 * (arg0 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local72 = local46 * (arg0 >> 8 & 0xFF);
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(150) int local150 = (arg0 & 0xFF) * local46;
				if (local150 > 65535) {
					local150 = 65535;
				}
				arg0 = (local72 & 0xFF00) + (local122 << 8 & 0xFF0084) + (local150 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(181) int local181 = arg0 >> 16 & 0xFF;
			local26 = arg0 >> 8 & 0xFF;
			local46 = arg0 & 0xFF;
			local181 = (int) ((float) local181 * arg1);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local26 = (int) ((float) local26 * arg1);
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 255) {
				local26 = 255;
			}
			local46 = (int) ((float) local46 * arg1);
			if (local46 < 0) {
				local46 = 0;
			} else if (local46 > 255) {
				local46 = 255;
			}
			arg0 = local46 | local26 << 8 | local181 << 16;
		}
		this.aStream3.b(arg2 * 4);
		if (this.aClass16_Sub1_8.anInt7441 == 0) {
			this.aStream3.d((byte) arg0);
			this.aStream3.d((byte) (arg0 >> 8));
			this.aStream3.d((byte) (arg0 >> 16));
		} else {
			this.aStream3.d((byte) (arg0 >> 16));
			this.aStream3.d((byte) (arg0 >> 8));
			this.aStream3.d((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([IZI)V")
	public void method2801(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface22 local14 = this.aClass16_Sub1_8.method6273(this.anInt3067 * 3);
		@Pc(19) Buffer local19 = local14.method7739();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass16_Sub1_8.method6328(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(83) int local83;
		@Pc(50) short[] local50;
		@Pc(44) int local44;
		@Pc(55) int local55;
		@Pc(38) int local38;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(74) int local74;
		if (Stream.c()) {
			label95: for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg0[local38];
				local50 = this.aClass104_Sub1_2.aShortArrayArray7[local44];
				local55 = this.anIntArray200[local44];
				if (local55 != 0 && local50 != null) {
					local61 = 0;
					local63 = 0;
					while (true) {
						while (true) {
							if (local63 >= local50.length) {
								continue label95;
							}
							if ((local55 & 0x1 << local61++) == 0) {
								local63 += 3;
							} else {
								local30++;
								for (local74 = 0; local74 < 3; local74++) {
									local83 = local50[local63++] & 0xFFFF;
									if (local83 > local34) {
										local34 = local83;
									}
									if (local32 > local83) {
										local32 = local83;
									}
									local28.e(local83);
								}
							}
						}
					}
				}
			}
		} else {
			label121: for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg0[local38];
				local50 = this.aClass104_Sub1_2.aShortArrayArray7[local44];
				local55 = this.anIntArray200[local44];
				if (local55 != 0 && local50 != null) {
					local61 = 0;
					local63 = 0;
					while (true) {
						while (true) {
							if (local63 >= local50.length) {
								continue label121;
							}
							if ((local55 & 0x1 << local61++) == 0) {
								local63 += 3;
							} else {
								for (local74 = 0; local74 < 3; local74++) {
									local83 = local50[local63++] & 0xFFFF;
									if (local83 > local34) {
										local34 = local83;
									}
									local28.a(local83);
									if (local83 < local32) {
										local32 = local83;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method7738() || local30 <= 0) {
			return;
		}
		this.aClass16_Sub1_8.method6264(this.anInt3057, (this.aClass104_Sub1_2.anInt2646 & 0x7) != 0, (this.aClass104_Sub1_2.anInt2646 & 0x8) != 0);
		if (this.aClass16_Sub1_8.aBoolean557) {
			this.aClass16_Sub1_8.EA(Integer.MAX_VALUE, this.anInt3061, this.anInt3066, this.anInt3060);
		}
		@Pc(270) Class25_Sub3 local270 = this.aClass16_Sub1_8.method6255();
		local270.method4323(1.0F / this.aFloat80, 1.0F / this.aFloat80, 1.0F);
		this.aClass16_Sub1_8.method6212(Static523.aClass20_6);
		this.aClass16_Sub1_8.method6257(1, this.anInterface16_11);
		this.aClass16_Sub1_8.method6287(this.aClass104_Sub1_2.aClass277_15);
		this.aClass16_Sub1_8.method6306(local34 + 1 - local32, local14, Static425.aClass44_5, local30, local32, 0);
		this.aClass16_Sub1_8.method6226();
	}
}
