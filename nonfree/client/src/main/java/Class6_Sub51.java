import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class6_Sub51 extends Class6 {

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Lclient!ll;")
	private Interface17 anInterface17_18;

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
	public int anInt9819 = 0;

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "Lclient!lw;")
	private final Class199_Sub1 aClass199_Sub1_3;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
	public final int anInt9818;

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "F")
	public final float aFloat195;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
	public final int anInt9815;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "[I")
	private final int[] anIntArray602;

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_23;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	public final int anInt9816;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	public final int anInt9812;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!lw;IIIII)V")
	public Class6_Sub51(@OriginalArg(0) Class199_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass199_Sub1_3 = arg0;
		this.anInt9818 = arg3;
		this.aFloat195 = (float) arg2;
		this.anInt9815 = arg4;
		this.anIntArray602 = new int[this.aClass199_Sub1_3.anInt10111 * this.aClass199_Sub1_3.anInt10110];
		this.aClass100_Sub1_23 = this.aClass199_Sub1_3.aClass100_Sub1_15;
		this.anInt9816 = arg1;
		this.anInt9812 = arg5;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V")
	public void method8279(@OriginalArg(1) int arg0) {
		this.aStream7.c();
		this.anInterface17_18 = this.aClass100_Sub1_23.method6123(false);
		this.anInterface17_18.method8441(4, this.aNativeHeapBuffer7, arg0 * 4);
		this.aStream7 = null;
		this.aNativeHeapBuffer7 = null;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	public void method8280(@OriginalArg(1) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.f(-1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZII)V")
	public void method8282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray602[arg1 + arg2 * this.aClass199_Sub1_3.anInt10111] |= 0x1 << arg0;
		this.anInt9819++;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIFB)V")
	public void method8285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(18) int local18;
		@Pc(41) int local41;
		if (this.anInt9816 != -1) {
			@Pc(13) Class325 local13 = this.aClass100_Sub1_23.anInterface4_12.method895(this.anInt9816);
			local18 = local13.aByte113 & 0xFF;
			@Pc(63) int local63;
			if (local18 != 0 && local13.aByte115 != 4) {
				if (arg2 < 0) {
					local41 = 0;
				} else if (arg2 <= 127) {
					local41 = arg2 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local18 == 256) {
					arg0 = local41;
				} else {
					local63 = 256 - local18;
					arg0 = (local63 * (arg0 & 0xFF00FF) + local18 * (local41 & 0xFF00FF) & 0xFF00FF00) + ((local41 & 0xFF00) * local18 + local63 * (arg0 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local41 = local13.aByte117 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(109) int local109 = (arg0 >> 16 & 0xFF) * local41;
				if (local109 > 65535) {
					local109 = 65535;
				}
				local63 = (arg0 >> 8 & 0xFF) * local41;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(135) int local135 = local41 * (arg0 & 0xFF);
				if (local135 > 65535) {
					local135 = 65535;
				}
				arg0 = (local63 & 0xFF00) + ((local109 & 0xE00FF00) << 8) + (local135 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(169) int local169 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local169 = (int) ((float) local169 * arg3);
			local41 = arg0 & 0xFF;
			if (local169 < 0) {
				local169 = 0;
			} else if (local169 > 255) {
				local169 = 255;
			}
			local18 = (int) ((float) local18 * arg3);
			local41 = (int) ((float) local41 * arg3);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg0 = local18 << 8 | local169 << 16 | local41;
		}
		this.aStream7.b(arg1 * 4);
		if (this.aClass100_Sub1_23.anInt7154 == 0) {
			this.aStream7.f((byte) arg0);
			this.aStream7.f((byte) (arg0 >> 8));
			this.aStream7.f((byte) (arg0 >> 16));
		} else {
			this.aStream7.f((byte) (arg0 >> 16));
			this.aStream7.f((byte) (arg0 >> 8));
			this.aStream7.f((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[II)V")
	public void method8286(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface11 local14 = this.aClass100_Sub1_23.method6143(this.anInt9819 * 3);
		@Pc(21) Buffer local21 = local14.method3077();
		if (local21 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass100_Sub1_23.method6131(local21);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(94) int local94;
		@Pc(58) short[] local58;
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(85) int local85;
		if (Stream.b()) {
			label122: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local58 = this.aClass199_Sub1_3.aShortArrayArray8[local52];
				local63 = this.anIntArray602[local52];
				if (local63 != 0 && local58 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local71) {
								continue label122;
							}
							if ((local63 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local58[local71++] & 0xFFFF;
									if (local94 < local40) {
										local40 = local94;
									}
									if (local42 < local94) {
										local42 = local94;
									}
									local36.d(local94);
								}
								local38++;
							}
						}
					}
				}
			}
		} else {
			label96: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local58 = this.aClass199_Sub1_3.aShortArrayArray8[local52];
				local63 = this.anIntArray602[local52];
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
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local58[local71++] & 0xFFFF;
									local36.a(local94);
									if (local42 < local94) {
										local42 = local94;
									}
									if (local40 > local94) {
										local40 = local94;
									}
								}
								local38++;
							}
						}
					}
				}
			}
		}
		local36.c();
		if (!local14.method3078() || local38 <= 0) {
			return;
		}
		this.aClass100_Sub1_23.method6137((this.aClass199_Sub1_3.anInt6297 & 0x8) != 0, (this.aClass199_Sub1_3.anInt6297 & 0x7) != 0, this.anInt9816);
		if (this.aClass100_Sub1_23.aBoolean465) {
			this.aClass100_Sub1_23.EA(Integer.MAX_VALUE, this.anInt9818, this.anInt9815, this.anInt9812);
		}
		@Pc(272) Class154_Sub2 local272 = this.aClass100_Sub1_23.method6038();
		local272.method4517(1.0F / this.aFloat195, 1.0F, 1.0F / this.aFloat195);
		this.aClass100_Sub1_23.method6030(Static104.aClass377_2);
		this.aClass100_Sub1_23.method6128(1, this.anInterface17_18);
		this.aClass100_Sub1_23.method6107(this.aClass199_Sub1_3.lb);
		this.aClass100_Sub1_23.method6064(local38, 0, local42 + 1 - local40, local40, local14, Static295.aClass77_2);
		this.aClass100_Sub1_23.method6149();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V")
	public void method8287(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass100_Sub1_23.method6081(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}
}
