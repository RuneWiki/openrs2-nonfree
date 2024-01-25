import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "Lclient!ega;")
	private Interface8 anInterface8_15;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	public int anInt7544 = 0;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "Lclient!om;")
	private final Class151_Sub1 aClass151_Sub1_3;

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
	public final int anInt7547;

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "[I")
	private final int[] anIntArray506;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
	public final int anInt7546;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_19;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "F")
	public final float aFloat193;

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
	public final int anInt7555;

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
	public final int anInt7551;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!om;IIIII)V")
	public Class2_Sub42(@OriginalArg(0) Class151_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass151_Sub1_3 = arg0;
		this.anInt7547 = arg3;
		this.anIntArray506 = new int[this.aClass151_Sub1_3.anInt9574 * this.aClass151_Sub1_3.anInt9572];
		this.anInt7546 = arg4;
		this.aClass162_Sub1_19 = this.aClass151_Sub1_3.aClass162_Sub1_17;
		this.aFloat193 = arg2;
		this.anInt7555 = arg1;
		this.anInt7551 = arg5;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
	public void method6066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray506[arg0 + arg2 * this.aClass151_Sub1_3.anInt9572] |= 0x1 << arg1;
		this.anInt7544++;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public void method6067(@OriginalArg(1) int arg0) {
		this.aStream4.a(arg0 * 4 + 3);
		this.aStream4.d(-1);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)V")
	public void method6069(@OriginalArg(0) int arg0) {
		this.aStream4.c();
		this.anInterface8_15 = this.aClass162_Sub1_19.method3826(false);
		this.anInterface8_15.method5366(4, this.aNativeHeapBuffer8, arg0 * 4);
		this.aNativeHeapBuffer8 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)V")
	public void method6070(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass162_Sub1_19.method3839(true, arg0 * 4);
		this.aStream4 = new Stream(this.aNativeHeapBuffer8, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[I)V")
	public void method6073(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface13 local14 = this.aClass162_Sub1_19.method3860(this.anInt7544 * 3);
		@Pc(19) Buffer local19 = local14.method7034();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass162_Sub1_19.method3907(local19);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 32767;
		@Pc(38) int local38 = -32768;
		@Pc(91) int local91;
		@Pc(59) short[] local59;
		@Pc(48) int local48;
		@Pc(53) int local53;
		@Pc(42) int local42;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(82) int local82;
		if (Stream.b()) {
			label93: for (local42 = 0; local42 < arg0; local42++) {
				local48 = arg1[local42];
				local53 = this.anIntArray506[local48];
				local59 = this.aClass151_Sub1_3.aShortArrayArray13[local48];
				if (local53 != 0 && local59 != null) {
					local65 = 0;
					local67 = 0;
					while (true) {
						while (true) {
							if (local67 >= local59.length) {
								continue label93;
							}
							if ((local53 & 0x1 << local65++) == 0) {
								local67 += 3;
							} else {
								local34++;
								for (local82 = 0; local82 < 3; local82++) {
									local91 = local59[local67++] & 0xFFFF;
									local28.e(local91);
									if (local36 > local91) {
										local36 = local91;
									}
									if (local38 < local91) {
										local38 = local91;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label118: for (local42 = 0; local42 < arg0; local42++) {
				local48 = arg1[local42];
				local53 = this.anIntArray506[local48];
				local59 = this.aClass151_Sub1_3.aShortArrayArray13[local48];
				if (local53 != 0 && local59 != null) {
					local65 = 0;
					local67 = 0;
					while (true) {
						while (true) {
							if (local67 >= local59.length) {
								continue label118;
							}
							if ((local53 & 0x1 << local65++) == 0) {
								local67 += 3;
							} else {
								local34++;
								for (local82 = 0; local82 < 3; local82++) {
									local91 = local59[local67++] & 0xFFFF;
									local28.b(local91);
									if (local91 > local38) {
										local38 = local91;
									}
									if (local91 < local36) {
										local36 = local91;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.c();
		if (!local14.method7033() || local34 <= 0) {
			return;
		}
		this.aClass162_Sub1_19.method3943((this.aClass151_Sub1_3.anInt6457 & 0x8) != 0, this.anInt7555, (this.aClass151_Sub1_3.anInt6457 & 0x7) != 0);
		if (this.aClass162_Sub1_19.aBoolean344) {
			this.aClass162_Sub1_19.YA(Integer.MAX_VALUE, this.anInt7547, this.anInt7546, this.anInt7551);
		}
		@Pc(262) Class25_Sub2 local262 = this.aClass162_Sub1_19.method3899();
		local262.method2696(1.0F / this.aFloat193, 1.0F, 1.0F / this.aFloat193);
		this.aClass162_Sub1_19.method3919(Static194.aClass348_4);
		this.aClass162_Sub1_19.method3954(this.anInterface8_15, 1);
		this.aClass162_Sub1_19.method3882(this.aClass151_Sub1_3.aClass59_19);
		this.aClass162_Sub1_19.method3892(0, local38 + 1 - local36, Static523.aClass155_6, local34, local14, local36);
		this.aClass162_Sub1_19.method3855();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(FBIII)V")
	public void method6074(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(35) int local35;
		if (this.anInt7555 != -1) {
			@Pc(17) Class291 local17 = this.aClass162_Sub1_19.anInterface9_10.method1074(this.anInt7555);
			local22 = local17.aByte98 & 0xFF;
			@Pc(60) int local60;
			if (local22 != 0 && local17.aByte96 != 4) {
				if (arg3 < 0) {
					local35 = 0;
				} else if (arg3 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg3 * 131586;
				}
				if (local22 == 256) {
					arg2 = local35;
				} else {
					local60 = 256 - local22;
					arg2 = ((arg2 & 0xFF00) * local60 + (local35 & 0xFF00) * local22 & 0xFF0000) + (local22 * (local35 & 0xFF00FF) + (local60 * (arg2 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local35 = local17.aByte101 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(114) int local114 = local35 * (arg2 >> 16 & 0xFF);
				if (local114 > 65535) {
					local114 = 65535;
				}
				local60 = (arg2 >> 8 & 0xFF) * local35;
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(140) int local140 = local35 * (arg2 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg2 = (local60 & 0xFF00) + ((local114 & 0xFF00) << 8) + (local140 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(171) int local171 = arg2 >> 16 & 0xFF;
			local22 = arg2 >> 8 & 0xFF;
			local35 = arg2 & 0xFF;
			local171 = (int) ((float) local171 * arg0);
			local22 = (int) ((float) local22 * arg0);
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			local35 = (int) ((float) local35 * arg0);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg2 = local171 << 16 | local22 << 8 | local35;
		}
		this.aStream4.a(arg1 * 4);
		if (this.aClass162_Sub1_19.anInt4620 == 0) {
			this.aStream4.d((byte) arg2);
			this.aStream4.d((byte) (arg2 >> 8));
			this.aStream4.d((byte) (arg2 >> 16));
		} else {
			this.aStream4.d((byte) (arg2 >> 16));
			this.aStream4.d((byte) (arg2 >> 8));
			this.aStream4.d((byte) arg2);
		}
	}
}
