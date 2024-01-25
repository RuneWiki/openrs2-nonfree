import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!caa;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public int anInt875 = 0;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "Lclient!ov;")
	private final Class112_Sub2 aClass112_Sub2_1;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public final int anInt876;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "I")
	public final int anInt884;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_1;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "F")
	public final float aFloat23;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
	private final int[] anIntArray101;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	public final int anInt882;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	public final int anInt880;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!ov;IIIII)V")
	public Class2_Sub7(@OriginalArg(0) Class112_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass112_Sub2_1 = arg0;
		this.anInt876 = arg5;
		this.anInt884 = arg4;
		this.aClass87_Sub1_1 = this.aClass112_Sub2_1.aClass87_Sub1_18;
		this.aFloat23 = arg2;
		this.anIntArray101 = new int[this.aClass112_Sub2_1.anInt9340 * this.aClass112_Sub2_1.anInt9348];
		this.anInt882 = arg1;
		this.anInt880 = arg3;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(FIIII)V")
	public void method765(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21;
		@Pc(38) int local38;
		if (this.anInt882 != -1) {
			@Pc(16) Class199 local16 = this.aClass87_Sub1_1.anInterface6_11.method6357(this.anInt882);
			local21 = local16.aByte84 & 0xFF;
			@Pc(56) int local56;
			if (local21 != 0 && local16.aByte86 != 4) {
				if (arg1 < 0) {
					local38 = 0;
				} else if (arg1 <= 127) {
					local38 = arg1 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local21 == 256) {
					arg2 = local38;
				} else {
					local56 = 256 - local21;
					arg2 = ((local38 & 0xFF00) * local21 + local56 * (arg2 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local56 + local21 * (local38 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local38 = local16.aByte83 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(109) int local109 = local38 * (arg2 >> 16 & 0xFF);
				if (local109 > 65535) {
					local109 = 65535;
				}
				local56 = (arg2 >> 8 & 0xFF) * local38;
				if (local56 > 65535) {
					local56 = 65535;
				}
				@Pc(133) int local133 = (arg2 & 0xFF) * local38;
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg2 = (local56 & 0xFF00) + (((local109 & 0x7600FF00) << 8) + (local133 >> 8));
			}
		}
		if (arg0 != 1.0F) {
			@Pc(169) int local169 = arg2 >> 16 & 0xFF;
			local21 = arg2 >> 8 & 0xFF;
			local38 = arg2 & 0xFF;
			local169 = (int) ((float) local169 * arg0);
			if (local169 < 0) {
				local169 = 0;
			} else if (local169 > 255) {
				local169 = 255;
			}
			local21 = (int) ((float) local21 * arg0);
			local38 = (int) ((float) local38 * arg0);
			if (local21 < 0) {
				local21 = 0;
			} else if (local21 > 255) {
				local21 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg2 = local21 << 8 | local169 << 16 | local38;
		}
		this.aStream1.f(arg3 * 4);
		if (this.aClass87_Sub1_1.anInt6133 == 0) {
			this.aStream1.e((byte) arg2);
			this.aStream1.e((byte) (arg2 >> 8));
			this.aStream1.e((byte) (arg2 >> 16));
		} else {
			this.aStream1.e((byte) (arg2 >> 16));
			this.aStream1.e((byte) (arg2 >> 8));
			this.aStream1.e((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBII)V")
	public void method766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray101[arg0 + this.aClass112_Sub2_1.anInt9348 * arg2] |= 0x1 << arg1;
		this.anInt875++;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public void method770(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass87_Sub1_1.method5130(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
	public void method773(@OriginalArg(1) int arg0) {
		this.aStream1.a();
		this.anInterface3_1 = this.aClass87_Sub1_1.method5043(false);
		this.anInterface3_1.method7188(this.aNativeHeapBuffer1, 4, arg0 * 4);
		this.aStream1 = null;
		this.aNativeHeapBuffer1 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	public void method774(@OriginalArg(0) int arg0) {
		this.aStream1.f(arg0 * 4 + 3);
		this.aStream1.e(-1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[I)V")
	public void method775(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface10 local14 = this.aClass87_Sub1_1.method5051(this.anInt875 * 3);
		@Pc(19) Buffer local19 = local14.method7682();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass87_Sub1_1.method5128(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(87) int local87;
		@Pc(55) short[] local55;
		@Pc(44) int local44;
		@Pc(49) int local49;
		@Pc(38) int local38;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(78) int local78;
		if (Stream.b()) {
			label95: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local49 = this.anIntArray101[local44];
				local55 = this.aClass112_Sub2_1.aShortArrayArray19[local44];
				if (local49 != 0 && local55 != null) {
					local61 = 0;
					local63 = 0;
					while (true) {
						while (true) {
							if (local63 >= local55.length) {
								continue label95;
							}
							if ((0x1 << local61++ & local49) == 0) {
								local63 += 3;
							} else {
								for (local78 = 0; local78 < 3; local78++) {
									local87 = local55[local63++] & 0xFFFF;
									if (local87 < local32) {
										local32 = local87;
									}
									local28.c(local87);
									if (local34 < local87) {
										local34 = local87;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label119: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local49 = this.anIntArray101[local44];
				local55 = this.aClass112_Sub2_1.aShortArrayArray19[local44];
				if (local49 != 0 && local55 != null) {
					local61 = 0;
					local63 = 0;
					while (true) {
						while (true) {
							if (local63 >= local55.length) {
								continue label119;
							}
							if ((local49 & 0x1 << local61++) == 0) {
								local63 += 3;
							} else {
								local30++;
								for (local78 = 0; local78 < 3; local78++) {
									local87 = local55[local63++] & 0xFFFF;
									if (local34 < local87) {
										local34 = local87;
									}
									if (local87 < local32) {
										local32 = local87;
									}
									local28.d(local87);
								}
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method7683() || local30 <= 0) {
			return;
		}
		this.aClass87_Sub1_1.method5071((this.aClass112_Sub2_1.anInt7605 & 0x7) != 0, (this.aClass112_Sub2_1.anInt7605 & 0x8) != 0, this.anInt882);
		if (this.aClass87_Sub1_1.aBoolean461) {
			this.aClass87_Sub1_1.EA(Integer.MAX_VALUE, this.anInt880, this.anInt884, this.anInt876);
		}
		@Pc(258) Class6_Sub2 local258 = this.aClass87_Sub1_1.method5141();
		local258.method2717(1.0F, 1.0F / this.aFloat23, 1.0F / this.aFloat23);
		this.aClass87_Sub1_1.method5023(Static542.aClass108_23);
		this.aClass87_Sub1_1.method5148(this.anInterface3_1, 1);
		this.aClass87_Sub1_1.method5110(this.aClass112_Sub2_1.aClass147_23);
		this.aClass87_Sub1_1.method5136(0, local34 + 1 - local32, local14, local30, Static562.aClass334_7, local32);
		this.aClass87_Sub1_1.method5127();
	}
}
