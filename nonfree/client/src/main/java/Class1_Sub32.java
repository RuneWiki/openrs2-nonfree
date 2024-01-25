import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Lclient!lca;")
	private Interface5 anInterface5_10;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
	public int anInt5583 = 0;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "Lclient!uo;")
	private final Class205_Sub3 aClass205_Sub3_2;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public final int anInt5582;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	public final int anInt5589;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
	private final int[] anIntArray558;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_10;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
	public final int anInt5592;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "F")
	public final float aFloat115;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
	public final int anInt5585;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!uo;IIIII)V")
	public Class1_Sub32(@OriginalArg(0) Class205_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass205_Sub3_2 = arg0;
		this.anInt5582 = arg4;
		this.anInt5589 = arg1;
		this.anIntArray558 = new int[this.aClass205_Sub3_2.anInt8174 * this.aClass205_Sub3_2.anInt8177];
		this.aClass122_Sub2_10 = this.aClass205_Sub3_2.aClass122_Sub2_19;
		this.anInt5592 = arg5;
		this.aFloat115 = arg2;
		this.anInt5585 = arg3;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([III)V")
	public void method4780(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Interface1 local14 = this.aClass122_Sub2_10.method5576(this.anInt5583 * 3);
		@Pc(19) Buffer local19 = local14.method5729();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass122_Sub2_10.method5555(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(93) int local93;
		@Pc(55) short[] local55;
		@Pc(44) int local44;
		@Pc(49) int local49;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(84) int local84;
		if (Stream.c()) {
			label116: for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg0[local38];
				local49 = this.anIntArray558[local44];
				local55 = this.aClass205_Sub3_2.aShortArrayArray9[local44];
				if (local49 != 0 && local55 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local55.length <= local66) {
								continue label116;
							}
							if ((local49 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								local30++;
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local55[local66++] & 0xFFFF;
									if (local32 > local93) {
										local32 = local93;
									}
									if (local93 > local34) {
										local34 = local93;
									}
									local28.a(local93);
								}
							}
						}
					}
				}
			}
		} else {
			label92: for (local38 = 0; local38 < arg1; local38++) {
				local44 = arg0[local38];
				local49 = this.anIntArray558[local44];
				local55 = this.aClass205_Sub3_2.aShortArrayArray9[local44];
				if (local49 != 0 && local55 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local55.length <= local66) {
								continue label92;
							}
							if ((local49 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								local30++;
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local55[local66++] & 0xFFFF;
									if (local32 > local93) {
										local32 = local93;
									}
									if (local93 > local34) {
										local34 = local93;
									}
									local28.d(local93);
								}
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method5730() || local30 <= 0) {
			return;
		}
		this.aClass122_Sub2_10.method5622((this.aClass205_Sub3_2.anInt8190 & 0x8) != 0, (this.aClass205_Sub3_2.anInt8190 & 0x7) != 0, this.anInt5589);
		if (this.aClass122_Sub2_10.aBoolean474) {
			this.aClass122_Sub2_10.JA(Integer.MAX_VALUE, this.anInt5585, this.anInt5582, this.anInt5592);
		}
		@Pc(280) Class118_Sub3 local280 = this.aClass122_Sub2_10.method5574();
		local280.method6977(1.0F / this.aFloat115, 1.0F / this.aFloat115, 1.0F);
		this.aClass122_Sub2_10.method5612(Static272.aClass110_4);
		this.aClass122_Sub2_10.method5665(this.anInterface5_10, 1);
		this.aClass122_Sub2_10.method5573(this.aClass205_Sub3_2.aClass170_20);
		this.aClass122_Sub2_10.method5669(Static354.aClass22_4, local14, local34 + 1 - local32, local32, local30, 0);
		this.aClass122_Sub2_10.method5614();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method4782(@OriginalArg(1) int arg0) {
		this.aStream3.e(arg0 * 4 + 3);
		this.aStream3.f(-1);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method4783(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass122_Sub2_10.method5594(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer5, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
	public void method4784(@OriginalArg(0) int arg0) {
		this.aStream3.b();
		this.anInterface5_10 = this.aClass122_Sub2_10.method5671(false);
		this.anInterface5_10.method5731(this.aNativeHeapBuffer5, arg0 * 4, 4);
		this.aStream3 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IFIII)V")
	public void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(38) int local38;
		if (this.anInt5589 != -1) {
			@Pc(13) Class220 local13 = this.aClass122_Sub2_10.anInterface8_14.method878(this.anInt5589);
			local18 = local13.aByte81 & 0xFF;
			@Pc(62) int local62;
			if (local18 != 0 && local13.aByte87 != 4) {
				if (arg0 < 0) {
					local38 = 0;
				} else if (arg0 <= 127) {
					local38 = arg0 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local18 == 256) {
					arg2 = local38;
				} else {
					local62 = 256 - local18;
					arg2 = ((local38 & 0xFF00) * local18 + local62 * (arg2 & 0xFF00) & 0xFF0000) + (local62 * (arg2 & 0xFF00FF) + local18 * (local38 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local38 = local13.aByte84 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(112) int local112 = (arg2 >> 16 & 0xFF) * local38;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local62 = local38 * (arg2 >> 8 & 0xFF);
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(138) int local138 = local38 * (arg2 & 0xFF);
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg2 = (local62 & 0xFF00) + ((local112 & 0x7D00FF00) << 8) + (local138 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(171) int local171 = arg2 >> 16 & 0xFF;
			local18 = arg2 >> 8 & 0xFF;
			local38 = arg2 & 0xFF;
			local171 = (int) ((float) local171 * arg1);
			local18 = (int) ((float) local18 * arg1);
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local38 = (int) ((float) local38 * arg1);
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg2 = local18 << 8 | local171 << 16 | local38;
		}
		this.aStream3.e(arg3 * 4);
		if (this.aClass122_Sub2_10.anInt6720 == 0) {
			this.aStream3.f((byte) arg2);
			this.aStream3.f((byte) (arg2 >> 8));
			this.aStream3.f((byte) (arg2 >> 16));
		} else {
			this.aStream3.f((byte) (arg2 >> 16));
			this.aStream3.f((byte) (arg2 >> 8));
			this.aStream3.f((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V")
	public void method4787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray558[this.aClass205_Sub3_2.anInt8174 * arg2 + arg0] |= 0x1 << arg1;
		this.anInt5583++;
	}
}
