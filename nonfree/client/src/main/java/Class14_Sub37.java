import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class14_Sub37 extends Class14 {

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!fea;")
	private Interface7 anInterface7_15;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
	public int anInt8220 = 0;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Lclient!hn;")
	private final Class159_Sub1 aClass159_Sub1_2;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "[I")
	private final int[] anIntArray421;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_21;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	public final int anInt8217;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
	public final int anInt8213;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
	public final int anInt8212;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public final int anInt8216;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "F")
	public final float aFloat164;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!hn;IIIII)V")
	public Class14_Sub37(@OriginalArg(0) Class159_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass159_Sub1_2 = arg0;
		this.anIntArray421 = new int[this.aClass159_Sub1_2.anInt9504 * this.aClass159_Sub1_2.anInt9506];
		this.aClass144_Sub1_21 = this.aClass159_Sub1_2.aClass144_Sub1_8;
		this.anInt8217 = arg3;
		this.anInt8213 = arg4;
		this.anInt8212 = arg5;
		this.anInt8216 = arg1;
		this.aFloat164 = (float) arg2;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)V")
	public void method7147(@OriginalArg(1) int arg0) {
		this.aStream4.b();
		this.anInterface7_15 = this.aClass144_Sub1_21.method5780(false);
		this.anInterface7_15.method5844(this.aNativeHeapBuffer7, arg0 * 4, 4);
		this.aNativeHeapBuffer7 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([IZI)V")
	public void method7148(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface8 local14 = this.aClass144_Sub1_21.method5681(this.anInt8220 * 3);
		@Pc(19) Buffer local19 = local14.method5085();
		if (local19 == null) {
			return;
		}
		@Pc(29) Stream local29 = this.aClass144_Sub1_21.method5747(local19);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 32767;
		@Pc(35) int local35 = -32768;
		@Pc(109) int local109;
		@Pc(65) short[] local65;
		@Pc(54) int local54;
		@Pc(59) int local59;
		@Pc(48) int local48;
		@Pc(76) int local76;
		@Pc(78) int local78;
		@Pc(100) int local100;
		if (Stream.c()) {
			label92: for (local48 = 0; local48 < arg1; local48++) {
				local54 = arg0[local48];
				local65 = this.aClass159_Sub1_2.aShortArrayArray1[local54];
				local59 = this.anIntArray421[local54];
				if (local59 != 0 && local65 != null) {
					local76 = 0;
					local78 = 0;
					while (true) {
						while (true) {
							if (local65.length <= local78) {
								continue label92;
							}
							if ((local59 & 0x1 << local76++) == 0) {
								local78 += 3;
							} else {
								local31++;
								for (local100 = 0; local100 < 3; local100++) {
									local109 = local65[local78++] & 0xFFFF;
									if (local33 > local109) {
										local33 = local109;
									}
									local29.a(local109);
									if (local35 < local109) {
										local35 = local109;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label116: for (local48 = 0; local48 < arg1; local48++) {
				local54 = arg0[local48];
				local59 = this.anIntArray421[local54];
				local65 = this.aClass159_Sub1_2.aShortArrayArray1[local54];
				if (local59 != 0 && local65 != null) {
					local76 = 0;
					local78 = 0;
					while (true) {
						while (true) {
							if (local65.length <= local78) {
								continue label116;
							}
							if ((local59 & 0x1 << local76++) == 0) {
								local78 += 3;
							} else {
								local31++;
								for (local100 = 0; local100 < 3; local100++) {
									local109 = local65[local78++] & 0xFFFF;
									if (local109 > local35) {
										local35 = local109;
									}
									if (local33 > local109) {
										local33 = local109;
									}
									local29.d(local109);
								}
							}
						}
					}
				}
			}
		}
		local29.b();
		if (!local14.method5081() || local31 <= 0) {
			return;
		}
		this.aClass144_Sub1_21.method5769((this.aClass159_Sub1_2.anInt4423 & 0x8) != 0, this.anInt8216, (this.aClass159_Sub1_2.anInt4423 & 0x7) != 0);
		if (this.aClass144_Sub1_21.aBoolean441) {
			this.aClass144_Sub1_21.EA(Integer.MAX_VALUE, this.anInt8217, this.anInt8213, this.anInt8212);
		}
		@Pc(311) Class263_Sub2 local311 = this.aClass144_Sub1_21.method5724();
		local311.method7276(1.0F, 1.0F / this.aFloat164, 1.0F / this.aFloat164);
		this.aClass144_Sub1_21.method5750(Static282.aClass199_6);
		this.aClass144_Sub1_21.method5696(1, this.anInterface7_15);
		this.aClass144_Sub1_21.method5707(this.aClass159_Sub1_2.aClass119_16);
		this.aClass144_Sub1_21.method5746(local31, local33, local14, local35 + 1 - local33, Static469.aClass213_46, 0);
		this.aClass144_Sub1_21.method5778();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)V")
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray421[this.aClass159_Sub1_2.anInt9504 * arg0 + arg1] |= 0x1 << arg2;
		this.anInt8220++;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(FIIII)V")
	public void method7153(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(43) int local43;
		if (this.anInt8216 != -1) {
			@Pc(18) Class69 local18 = this.aClass144_Sub1_21.anInterface4_12.method8975(this.anInt8216);
			local23 = local18.aByte22 & 0xFF;
			@Pc(71) int local71;
			if (local23 != 0 && local18.aByte19 != 4) {
				if (arg2 < 0) {
					local43 = 0;
				} else if (arg2 > 127) {
					local43 = 16777215;
				} else {
					local43 = arg2 * 131586;
				}
				if (local23 == 256) {
					arg3 = local43;
				} else {
					local71 = 256 - local23;
					arg3 = ((local43 & 0xFF00FF) * local23 + (arg3 & 0xFF00FF) * local71 & 0xFF00FF00) + (local23 * (local43 & 0xFF00) + ((arg3 & 0xFF00) * local71) & 0xFF0000) >> 8;
				}
			}
			local43 = local18.aByte20 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(120) int local120 = (arg3 >> 16 & 0xFF) * local43;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local71 = (arg3 >> 8 & 0xFF) * local43;
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(146) int local146 = (arg3 & 0xFF) * local43;
				if (local146 > 65535) {
					local146 = 65535;
				}
				arg3 = (local71 & 0xFF00) + (local120 << 8 & 0xFF00BE) + (local146 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(178) int local178 = arg3 >> 16 & 0xFF;
			local23 = arg3 >> 8 & 0xFF;
			local43 = arg3 & 0xFF;
			local178 = (int) ((float) local178 * arg0);
			local23 = (int) ((float) local23 * arg0);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local43 = (int) ((float) local43 * arg0);
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg3 = local43 | local23 << 8 | local178 << 16;
		}
		this.aStream4.e(arg1 * 4);
		if (this.aClass144_Sub1_21.anInt6500 == 0) {
			this.aStream4.f((byte) arg3);
			this.aStream4.f((byte) (arg3 >> 8));
			this.aStream4.f((byte) (arg3 >> 16));
		} else {
			this.aStream4.f((byte) (arg3 >> 16));
			this.aStream4.f((byte) (arg3 >> 8));
			this.aStream4.f((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public void method7154(@OriginalArg(0) int arg0) {
		this.aStream4.e(arg0 * 4 + 3);
		this.aStream4.f(-1);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V")
	public void method7155(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass144_Sub1_21.method5647(true, arg0 * 4);
		this.aStream4 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}
}
