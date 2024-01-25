import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_13;

	@OriginalMember(owner = "client!rfa", name = "F", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
	public int anInt7423 = 0;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "Lclient!tr;")
	private final Class139_Sub3 aClass139_Sub3_3;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "F")
	public final float aFloat154;

	@OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
	public final int anInt7425;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
	public final int anInt7416;

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_19;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
	public final int anInt7418;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
	public final int anInt7417;

	@OriginalMember(owner = "client!rfa", name = "H", descriptor = "[I")
	private final int[] anIntArray579;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!tr;IIIII)V")
	public Class3_Sub43(@OriginalArg(0) Class139_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass139_Sub3_3 = arg0;
		this.aFloat154 = arg2;
		this.anInt7425 = arg4;
		this.anInt7416 = arg5;
		this.aClass43_Sub1_19 = this.aClass139_Sub3_3.aClass43_Sub1_22;
		this.anInt7418 = arg3;
		this.anInt7417 = arg1;
		this.anIntArray579 = new int[this.aClass139_Sub3_3.anInt8180 * this.aClass139_Sub3_3.anInt8179];
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIFII)V")
	public void method6291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (this.anInt7417 != -1) {
			@Pc(15) Class224 local15 = this.aClass43_Sub1_19.anInterface8_12.method6560(this.anInt7417);
			local20 = local15.aByte73 & 0xFF;
			@Pc(62) int local62;
			if (local20 != 0 && local15.aByte69 != 4) {
				if (arg1 < 0) {
					local38 = 0;
				} else if (arg1 <= 127) {
					local38 = arg1 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local20 == 256) {
					arg0 = local38;
				} else {
					local62 = 256 - local20;
					arg0 = ((arg0 & 0xFF00) * local62 + local20 * (local38 & 0xFF00) & 0xFF0000) + (local62 * (arg0 & 0xFF00FF) + local20 * (local38 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local38 = local15.aByte71 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(108) int local108 = (arg0 >> 16 & 0xFF) * local38;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local62 = local38 * (arg0 >> 8 & 0xFF);
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(134) int local134 = local38 * (arg0 & 0xFF);
				if (local134 > 65535) {
					local134 = 65535;
				}
				arg0 = (local134 >> 8) + ((local108 << 8 & 0xFF00F7) + (local62 & 0xFF00));
			}
		}
		this.aStream7.b(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(176) int local176 = arg0 >> 16 & 0xFF;
			local20 = arg0 >> 8 & 0xFF;
			local176 = (int) ((float) local176 * arg2);
			local38 = arg0 & 0xFF;
			local20 = (int) ((float) local20 * arg2);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local38 = (int) ((float) local38 * arg2);
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg0 = local38 | local20 << 8 | local176 << 16;
		}
		if (this.aClass43_Sub1_19.anInt4823 == 0) {
			this.aStream7.a((byte) arg0);
			this.aStream7.a((byte) (arg0 >> 8));
			this.aStream7.a((byte) (arg0 >> 16));
		} else {
			this.aStream7.a((byte) (arg0 >> 16));
			this.aStream7.a((byte) (arg0 >> 8));
			this.aStream7.a((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[II)V")
	public void method6293(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(14) Interface17 local14 = this.aClass43_Sub1_19.method4281(this.anInt7423 * 3);
		@Pc(19) Buffer local19 = local14.method6938();
		if (local19 == null) {
			return;
		}
		@Pc(37) Stream local37 = this.aClass43_Sub1_19.method4233(local19);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 32767;
		@Pc(43) int local43 = -32768;
		@Pc(96) int local96;
		@Pc(59) short[] local59;
		@Pc(53) int local53;
		@Pc(64) int local64;
		@Pc(47) int local47;
		@Pc(73) int local73;
		@Pc(75) int local75;
		@Pc(87) int local87;
		if (Stream.c()) {
			label121: for (local47 = 0; local47 < arg0; local47++) {
				local53 = arg1[local47];
				local59 = this.aClass139_Sub3_3.aShortArrayArray79[local53];
				local64 = this.anIntArray579[local53];
				if (local64 != 0 && local59 != null) {
					local73 = 0;
					local75 = 0;
					while (true) {
						while (true) {
							if (local75 >= local59.length) {
								continue label121;
							}
							if ((0x1 << local73++ & local64) == 0) {
								local75 += 3;
							} else {
								local39++;
								for (local87 = 0; local87 < 3; local87++) {
									local96 = local59[local75++] & 0xFFFF;
									if (local43 < local96) {
										local43 = local96;
									}
									local37.d(local96);
									if (local96 < local41) {
										local41 = local96;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label96: for (local47 = 0; local47 < arg0; local47++) {
				local53 = arg1[local47];
				local59 = this.aClass139_Sub3_3.aShortArrayArray79[local53];
				local64 = this.anIntArray579[local53];
				if (local64 != 0 && local59 != null) {
					local73 = 0;
					local75 = 0;
					while (true) {
						while (true) {
							if (local75 >= local59.length) {
								continue label96;
							}
							if ((local64 & 0x1 << local73++) == 0) {
								local75 += 3;
							} else {
								for (local87 = 0; local87 < 3; local87++) {
									local96 = local59[local75++] & 0xFFFF;
									local37.f(local96);
									if (local96 < local41) {
										local41 = local96;
									}
									if (local96 > local43) {
										local43 = local96;
									}
								}
								local39++;
							}
						}
					}
				}
			}
		}
		local37.a();
		if (!local14.method6941() || local39 <= 0) {
			return;
		}
		this.aClass43_Sub1_19.method4237(this.anInt7417, (this.aClass139_Sub3_3.anInt8195 & 0x8) != 0, (this.aClass139_Sub3_3.anInt8195 & 0x7) != 0);
		if (this.aClass43_Sub1_19.aBoolean370) {
			this.aClass43_Sub1_19.YA(Integer.MAX_VALUE, this.anInt7418, this.anInt7425, this.anInt7416);
		}
		@Pc(278) Class109_Sub3 local278 = this.aClass43_Sub1_19.method4264();
		local278.method7121(1.0F, 1.0F / this.aFloat154, 1.0F / this.aFloat154);
		this.aClass43_Sub1_19.method4296(Static325.aClass174_26);
		this.aClass43_Sub1_19.method4181(1, this.anInterface24_13);
		this.aClass43_Sub1_19.method4196(this.aClass139_Sub3_3.aClass48_20);
		this.aClass43_Sub1_19.method4232(Static534.aClass319_7, local41, local43 + 1 - local41, 0, local39, local14);
		this.aClass43_Sub1_19.method4235();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IB)V")
	public void method6297(@OriginalArg(0) int arg0) {
		this.aStream7.a();
		this.anInterface24_13 = this.aClass43_Sub1_19.method4188(false);
		this.anInterface24_13.method4800(4, arg0 * 4, this.aNativeHeapBuffer8);
		this.aStream7 = null;
		this.aNativeHeapBuffer8 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IB)V")
	public void method6300(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass43_Sub1_19.method4271(true, arg0 * 4);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIII)V")
	public void method6301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray579[arg2 + arg1 * this.aClass139_Sub3_3.anInt8179] |= 0x1 << arg0;
		this.anInt7423++;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)V")
	public void method6302(@OriginalArg(1) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.a(-1);
	}
}
