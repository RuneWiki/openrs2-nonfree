import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Lclient!wr;")
	private Interface24 anInterface24_12;

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
	public int anInt6238 = 0;

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "Lclient!jba;")
	private final Class17_Sub3 aClass17_Sub3_2;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	public final int anInt6234;

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_18;

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
	public final int anInt6241;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
	public final int anInt6232;

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
	public final int anInt6243;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "[I")
	private final int[] anIntArray417;

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "F")
	public final float aFloat158;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!jba;IIIII)V")
	public Class1_Sub35(@OriginalArg(0) Class17_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass17_Sub3_2 = arg0;
		this.anInt6234 = arg5;
		this.aClass12_Sub2_18 = this.aClass17_Sub3_2.aClass12_Sub2_11;
		this.anInt6241 = arg3;
		this.anInt6232 = arg1;
		this.anInt6243 = arg4;
		this.anIntArray417 = new int[this.aClass17_Sub3_2.anInt7984 * this.aClass17_Sub3_2.anInt7983];
		this.aFloat158 = arg2;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V")
	public void method5212(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass12_Sub2_18.method6177(true, arg0 * 4);
		this.aStream4 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
	public void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray417[arg1 + arg2 * this.aClass17_Sub3_2.anInt7983] |= 0x1 << arg0;
		this.anInt6238++;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V")
	public void method5216(@OriginalArg(0) int arg0) {
		this.aStream4.c(arg0 * 4 + 3);
		this.aStream4.d(-1);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IZ)V")
	public void method5217(@OriginalArg(0) int arg0) {
		this.aStream4.a();
		this.anInterface24_12 = this.aClass12_Sub2_18.method6176(false);
		this.anInterface24_12.method6517(this.aNativeHeapBuffer6, 4, arg0 * 4);
		this.aStream4 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIZF)V")
	public void method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(22) int local22;
		@Pc(40) int local40;
		if (this.anInt6232 != -1) {
			@Pc(17) Class45 local17 = this.aClass12_Sub2_18.anInterface5_10.method4043(this.anInt6232);
			local22 = local17.aByte22 & 0xFF;
			@Pc(58) int local58;
			if (local22 != 0 && local17.aByte25 != 4) {
				if (arg0 < 0) {
					local40 = 0;
				} else if (arg0 <= 127) {
					local40 = arg0 * 131586;
				} else {
					local40 = 16777215;
				}
				if (local22 == 256) {
					arg1 = local40;
				} else {
					local58 = 256 - local22;
					arg1 = ((local40 & 0xFF00FF) * local22 + local58 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (local58 * (arg1 & 0xFF00) + (local40 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local40 = local17.aByte28 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(111) int local111 = local40 * (arg1 >> 16 & 0xFF);
				if (local111 > 65535) {
					local111 = 65535;
				}
				local58 = (arg1 >> 8 & 0xFF) * local40;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(137) int local137 = (arg1 & 0xFF) * local40;
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg1 = (local58 & 0xFF00) + ((local111 & 0x2600FF00) << 8) + (local137 >> 8);
			}
		}
		this.aStream4.c(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(178) int local178 = arg1 >> 16 & 0xFF;
			local22 = arg1 >> 8 & 0xFF;
			local40 = arg1 & 0xFF;
			local178 = (int) ((float) local178 * arg3);
			local22 = (int) ((float) local22 * arg3);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			local40 = (int) ((float) local40 * arg3);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg1 = local40 | local178 << 16 | local22 << 8;
		}
		if (this.aClass12_Sub2_18.anInt7554 == 0) {
			this.aStream4.d((byte) arg1);
			this.aStream4.d((byte) (arg1 >> 8));
			this.aStream4.d((byte) (arg1 >> 16));
		} else {
			this.aStream4.d((byte) (arg1 >> 16));
			this.aStream4.d((byte) (arg1 >> 8));
			this.aStream4.d((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[I)V")
	public void method5219(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(22) Interface13 local22 = this.aClass12_Sub2_18.method6200(this.anInt6238 * 3);
		@Pc(27) Buffer local27 = local22.method7648();
		if (local27 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass12_Sub2_18.method6160(local27);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(92) int local92;
		@Pc(58) short[] local58;
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(83) int local83;
		if (Stream.c()) {
			label121: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local58 = this.aClass17_Sub3_2.aShortArrayArray3[local52];
				local63 = this.anIntArray417[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local58.length) {
								continue label121;
							}
							if ((local63 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								local38++;
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local58[local71++] & 0xFFFF;
									if (local92 > local42) {
										local42 = local92;
									}
									local36.b(local92);
									if (local92 < local40) {
										local40 = local92;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label96: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local63 = this.anIntArray417[local52];
				local58 = this.aClass17_Sub3_2.aShortArrayArray3[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local58.length) {
								continue label96;
							}
							if ((local63 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local58[local71++] & 0xFFFF;
									local36.e(local92);
									if (local92 < local40) {
										local40 = local92;
									}
									if (local92 > local42) {
										local42 = local92;
									}
								}
								local38++;
							}
						}
					}
				}
			}
		}
		local36.a();
		if (!local22.method7652() || local38 <= 0) {
			return;
		}
		this.aClass12_Sub2_18.method6236(this.anInt6232, (this.aClass17_Sub3_2.anInt4478 & 0x8) != 0, (this.aClass17_Sub3_2.anInt4478 & 0x7) != 0);
		if (this.aClass12_Sub2_18.aBoolean531) {
			this.aClass12_Sub2_18.YA(Integer.MAX_VALUE, this.anInt6241, this.anInt6243, this.anInt6234);
		}
		@Pc(278) Class209_Sub2 local278 = this.aClass12_Sub2_18.method6270();
		local278.method4925(1.0F / this.aFloat158, 1.0F / this.aFloat158, 1.0F);
		this.aClass12_Sub2_18.method6162(Static315.aClass296_3);
		this.aClass12_Sub2_18.method6276(1, this.anInterface24_12);
		this.aClass12_Sub2_18.method6194(this.aClass17_Sub3_2.aClass331_14);
		this.aClass12_Sub2_18.method6274(0, local40, local22, local38, local42 + 1 - local40, Static312.aClass165_3);
		this.aClass12_Sub2_18.method6237();
	}
}
