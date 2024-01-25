import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!dk", name = "A", descriptor = "Lclient!cca;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!dk", name = "G", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public int anInt1905 = 0;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "Lclient!ha;")
	private final Class52_Sub2 aClass52_Sub2_1;

	@OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
	public final int anInt1914;

	@OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
	public final int anInt1913;

	@OriginalMember(owner = "client!dk", name = "B", descriptor = "[I")
	private final int[] anIntArray206;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_3;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	public final int anInt1909;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
	public final int anInt1903;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!ha;IIIII)V")
	public Class3_Sub14(@OriginalArg(0) Class52_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass52_Sub2_1 = arg0;
		this.anInt1914 = arg3;
		this.anInt1913 = arg1;
		this.anIntArray206 = new int[this.aClass52_Sub2_1.anInt9492 * this.aClass52_Sub2_1.anInt9491];
		this.aClass5_Sub3_3 = this.aClass52_Sub2_1.aClass5_Sub3_4;
		this.anInt1909 = arg5;
		this.anInt1903 = arg4;
		this.aFloat64 = arg2;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
	public void method1784(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass5_Sub3_3.method6421(true, arg0 * 4);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)V")
	public void method1785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray206[arg2 + arg0 * this.aClass52_Sub2_1.anInt9491] |= 0x1 << arg1;
		this.anInt1905++;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIFII)V")
	public void method1788(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(36) int local36;
		@Pc(112) int local112;
		if (this.anInt1913 != -1) {
			@Pc(13) Class238 local13 = this.aClass5_Sub3_3.anInterface4_14.method6712(this.anInt1913);
			local18 = local13.aByte67 & 0xFF;
			@Pc(58) int local58;
			if (local18 != 0 && local13.aByte70 != 4) {
				if (arg0 < 0) {
					local36 = 0;
				} else if (arg0 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg0 * 131586;
				}
				if (local18 == 256) {
					arg3 = local36;
				} else {
					local58 = 256 - local18;
					arg3 = (local58 * (arg3 & 0xFF00FF) + local18 * (local36 & 0xFF00FF) & 0xFF00FF00) + ((arg3 & 0xFF00) * local58 + local18 * (local36 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local36 = local13.aByte71 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				local112 = local36 * (arg3 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local58 = (arg3 >> 8 & 0xFF) * local36;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(140) int local140 = local36 * (arg3 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local58 & 0xFF00) + ((local112 & 0xB200FF00) << 8) + (local140 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			local18 = arg3 >> 16 & 0xFF;
			local36 = arg3 >> 8 & 0xFF;
			local112 = arg3 & 0xFF;
			local18 = (int) ((float) local18 * arg1);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local36 = (int) ((float) local36 * arg1);
			local112 = (int) ((float) local112 * arg1);
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 255) {
				local112 = 255;
			}
			arg3 = local112 | local18 << 16 | local36 << 8;
		}
		this.aStream1.e(arg2 * 4);
		if (this.aClass5_Sub3_3.anInt7747 == 0) {
			this.aStream1.a((byte) arg3);
			this.aStream1.a((byte) (arg3 >> 8));
			this.aStream1.a((byte) (arg3 >> 16));
		} else {
			this.aStream1.a((byte) (arg3 >> 16));
			this.aStream1.a((byte) (arg3 >> 8));
			this.aStream1.a((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)V")
	public void method1789(@OriginalArg(0) int arg0) {
		this.aStream1.a();
		this.anInterface3_2 = this.aClass5_Sub3_3.method6422(false);
		this.anInterface3_2.method2578(this.aNativeHeapBuffer1, 4, arg0 * 4);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
	public void method1790(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.a(-1);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[I)V")
	public void method1792(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface14 local14 = this.aClass5_Sub3_3.method6341(this.anInt1905 * 3);
		@Pc(19) Buffer local19 = local14.method3136();
		if (local19 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass5_Sub3_3.method6352(local19);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(94) int local94;
		@Pc(63) short[] local63;
		@Pc(52) int local52;
		@Pc(57) int local57;
		@Pc(46) int local46;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(85) int local85;
		if (Stream.c()) {
			label93: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local63 = this.aClass52_Sub2_1.aShortArrayArray3[local52];
				local57 = this.anIntArray206[local52];
				if (local57 != 0 && local63 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local63.length <= local74) {
								continue label93;
							}
							if ((0x1 << local72++ & local57) == 0) {
								local74 += 3;
							} else {
								local38++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local63[local74++] & 0xFFFF;
									if (local94 < local40) {
										local40 = local94;
									}
									if (local42 < local94) {
										local42 = local94;
									}
									local36.c(local94);
								}
							}
						}
					}
				}
			}
		} else {
			label119: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local57 = this.anIntArray206[local52];
				local63 = this.aClass52_Sub2_1.aShortArrayArray3[local52];
				if (local57 != 0 && local63 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local63.length <= local74) {
								continue label119;
							}
							if ((0x1 << local72++ & local57) == 0) {
								local74 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local63[local74++] & 0xFFFF;
									if (local94 < local40) {
										local40 = local94;
									}
									if (local42 < local94) {
										local42 = local94;
									}
									local36.b(local94);
								}
								local38++;
							}
						}
					}
				}
			}
		}
		local36.a();
		if (!local14.method3135() || local38 <= 0) {
			return;
		}
		this.aClass5_Sub3_3.method6299((this.aClass52_Sub2_1.anInt3923 & 0x7) != 0, this.anInt1913, (this.aClass52_Sub2_1.anInt3923 & 0x8) != 0);
		if (this.aClass5_Sub3_3.aBoolean531) {
			this.aClass5_Sub3_3.LA(Integer.MAX_VALUE, this.anInt1914, this.anInt1903, this.anInt1909);
		}
		@Pc(286) Class205_Sub1 local286 = this.aClass5_Sub3_3.method6348();
		local286.method5240(1.0F, 1.0F / this.aFloat64, 1.0F / this.aFloat64);
		this.aClass5_Sub3_3.method6355(Static124.aClass243_13);
		this.aClass5_Sub3_3.method6382(this.anInterface3_2, 1);
		this.aClass5_Sub3_3.method6333(this.aClass52_Sub2_1.aClass76_13);
		this.aClass5_Sub3_3.method6295(local40, local38, local42 + 1 - local40, 0, Static524.aClass87_7, local14);
		this.aClass5_Sub3_3.method6376();
	}
}
