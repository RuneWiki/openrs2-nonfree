import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!u;")
	private Interface26 anInterface26_14;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
	public int anInt7669 = 0;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "Lclient!up;")
	private final Class274_Sub3 aClass274_Sub3_3;

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "[I")
	private final int[] anIntArray475;

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "F")
	public final float aFloat207;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public final int anInt7667;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
	public final int anInt7665;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_14;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public final int anInt7657;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public final int anInt7658;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!up;IIIII)V")
	public Class3_Sub31(@OriginalArg(0) Class274_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass274_Sub3_3 = arg0;
		this.anIntArray475 = new int[this.aClass274_Sub3_3.anInt9726 * this.aClass274_Sub3_3.anInt9723];
		this.aFloat207 = arg2;
		this.anInt7667 = arg4;
		this.anInt7665 = arg1;
		this.aClass33_Sub1_14 = this.aClass274_Sub3_3.aClass33_Sub1_21;
		this.anInt7657 = arg5;
		this.anInt7658 = arg3;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
	public void method6415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray475[arg0 + this.aClass274_Sub3_3.anInt9726 * arg1] |= 0x1 << arg2;
		this.anInt7669++;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[II)V")
	public void method6416(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface23 local14 = this.aClass33_Sub1_14.method1990(this.anInt7669 * 3);
		@Pc(19) Buffer local19 = local14.method4807();
		if (local19 == null) {
			return;
		}
		@Pc(30) Stream local30 = this.aClass33_Sub1_14.method2092(local19);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(101) int local101;
		@Pc(58) short[] local58;
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(92) int local92;
		if (Stream.b()) {
			label116: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local58 = this.aClass274_Sub3_3.aShortArrayArray20[local52];
				local63 = this.anIntArray475[local52];
				if (local63 != 0 && local58 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local74) {
								continue label116;
							}
							if ((0x1 << local72++ & local63) == 0) {
								local74 += 3;
							} else {
								local32++;
								for (local92 = 0; local92 < 3; local92++) {
									local101 = local58[local74++] & 0xFFFF;
									if (local42 < local101) {
										local42 = local101;
									}
									local30.e(local101);
									if (local101 < local34) {
										local34 = local101;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label92: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local63 = this.anIntArray475[local52];
				local58 = this.aClass274_Sub3_3.aShortArrayArray20[local52];
				if (local63 != 0 && local58 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local74) {
								continue label92;
							}
							if ((0x1 << local72++ & local63) == 0) {
								local74 += 3;
							} else {
								local32++;
								for (local92 = 0; local92 < 3; local92++) {
									local101 = local58[local74++] & 0xFFFF;
									if (local34 > local101) {
										local34 = local101;
									}
									local30.a(local101);
									if (local42 < local101) {
										local42 = local101;
									}
								}
							}
						}
					}
				}
			}
		}
		local30.a();
		if (!local14.method4806() || local32 <= 0) {
			return;
		}
		this.aClass33_Sub1_14.method2012((this.aClass274_Sub3_3.anInt9740 & 0x8) != 0, this.anInt7665, (this.aClass274_Sub3_3.anInt9740 & 0x7) != 0);
		if (this.aClass33_Sub1_14.aBoolean166) {
			this.aClass33_Sub1_14.EA(Integer.MAX_VALUE, this.anInt7658, this.anInt7667, this.anInt7657);
		}
		@Pc(289) Class47_Sub3 local289 = this.aClass33_Sub1_14.method2020();
		local289.method7901(1.0F / this.aFloat207, 1.0F, 1.0F / this.aFloat207);
		this.aClass33_Sub1_14.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_14.method2046(this.anInterface26_14, 1);
		this.aClass33_Sub1_14.method2003(this.aClass274_Sub3_3.aClass34_23);
		this.aClass33_Sub1_14.method2091(local34, Static338.aClass304_5, 0, local32, local14, local42 + 1 - local34);
		this.aClass33_Sub1_14.method2029();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIF)V")
	public void method6418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(35) int local35;
		if (this.anInt7665 != -1) {
			@Pc(13) Class156 local13 = this.aClass33_Sub1_14.anInterface5_11.method6869(this.anInt7665);
			local18 = local13.aByte71 & 0xFF;
			@Pc(59) int local59;
			if (local18 != 0 && local13.aByte69 != 4) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 <= 127) {
					local35 = arg2 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local18 == 256) {
					arg1 = local35;
				} else {
					local59 = 256 - local18;
					arg1 = ((arg1 & 0xFF00) * local59 + local18 * (local35 & 0xFF00) & 0xFF0000) + ((local35 & 0xFF00FF) * local18 + local59 * (arg1 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local35 = local13.aByte74 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(105) int local105 = local35 * (arg1 >> 16 & 0xFF);
				if (local105 > 65535) {
					local105 = 65535;
				}
				local59 = local35 * (arg1 >> 8 & 0xFF);
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(131) int local131 = (arg1 & 0xFF) * local35;
				if (local131 > 65535) {
					local131 = 65535;
				}
				arg1 = (local131 >> 8) + ((local105 << 8 & 0xFF00EE) + (local59 & 0xFF00));
			}
		}
		if (arg3 != 1.0F) {
			@Pc(165) int local165 = arg1 >> 16 & 0xFF;
			local18 = arg1 >> 8 & 0xFF;
			local35 = arg1 & 0xFF;
			local165 = (int) ((float) local165 * arg3);
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 255) {
				local165 = 255;
			}
			local18 = (int) ((float) local18 * arg3);
			local35 = (int) ((float) local35 * arg3);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg1 = local165 << 16 | local18 << 8 | local35;
		}
		this.aStream6.f(arg0 * 4);
		if (this.aClass33_Sub1_14.anInt2178 == 0) {
			this.aStream6.c((byte) arg1);
			this.aStream6.c((byte) (arg1 >> 8));
			this.aStream6.c((byte) (arg1 >> 16));
		} else {
			this.aStream6.c((byte) (arg1 >> 16));
			this.aStream6.c((byte) (arg1 >> 8));
			this.aStream6.c((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	public void method6419(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass33_Sub1_14.method2036(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public void method6420(@OriginalArg(1) int arg0) {
		this.aStream6.f(arg0 * 4 + 3);
		this.aStream6.c(-1);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
	public void method6421(@OriginalArg(0) int arg0) {
		this.aStream6.a();
		this.anInterface26_14 = this.aClass33_Sub1_14.method2008(false);
		this.anInterface26_14.method7634(arg0 * 4, 4, this.aNativeHeapBuffer6);
		this.aNativeHeapBuffer6 = null;
		this.aStream6 = null;
	}
}
