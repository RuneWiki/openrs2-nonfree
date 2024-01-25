import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "Lclient!wba;")
	private Interface25 anInterface25_1;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
	public int anInt1044 = 0;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "Lclient!sl;")
	private final Class18_Sub3 aClass18_Sub3_1;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	public final int anInt1042;

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
	public final int anInt1047;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "F")
	public final float aFloat7;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
	private final int[] anIntArray58;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
	public final int anInt1043;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
	public final int anInt1046;

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_4;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!sl;IIIII)V")
	public Class2_Sub10(@OriginalArg(0) Class18_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass18_Sub3_1 = arg0;
		this.anInt1042 = arg1;
		this.anInt1047 = arg5;
		this.aFloat7 = (float) arg2;
		this.anIntArray58 = new int[this.aClass18_Sub3_1.anInt9742 * this.aClass18_Sub3_1.anInt9741];
		this.anInt1043 = arg3;
		this.anInt1046 = arg4;
		this.aClass101_Sub1_4 = this.aClass18_Sub3_1.aClass101_Sub1_21;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(BI)V")
	public void method1031(@OriginalArg(1) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.b(-1);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[I)V")
	public void method1032(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface24 local14 = this.aClass101_Sub1_4.method5830(this.anInt1044 * 3);
		@Pc(19) Buffer local19 = local14.method6460();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass101_Sub1_4.method5942(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(90) int local90;
		@Pc(50) short[] local50;
		@Pc(44) int local44;
		@Pc(55) int local55;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(81) int local81;
		if (Stream.c()) {
			label120: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local50 = this.aClass18_Sub3_1.aShortArrayArray18[local44];
				local55 = this.anIntArray58[local44];
				if (local55 != 0 && local50 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local50.length <= local66) {
								continue label120;
							}
							if ((0x1 << local64++ & local55) == 0) {
								local66 += 3;
							} else {
								local30++;
								for (local81 = 0; local81 < 3; local81++) {
									local90 = local50[local66++] & 0xFFFF;
									if (local90 < local32) {
										local32 = local90;
									}
									local28.c(local90);
									if (local90 > local34) {
										local34 = local90;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label95: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local55 = this.anIntArray58[local44];
				local50 = this.aClass18_Sub3_1.aShortArrayArray18[local44];
				if (local55 != 0 && local50 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local66 >= local50.length) {
								continue label95;
							}
							if ((local55 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								local30++;
								for (local81 = 0; local81 < 3; local81++) {
									local90 = local50[local66++] & 0xFFFF;
									if (local90 < local32) {
										local32 = local90;
									}
									local28.a(local90);
									if (local34 < local90) {
										local34 = local90;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method6459() || local30 <= 0) {
			return;
		}
		this.aClass101_Sub1_4.method5873(this.anInt1042, (this.aClass18_Sub3_1.anInt9630 & 0x7) != 0, (this.aClass18_Sub3_1.anInt9630 & 0x8) != 0);
		if (this.aClass101_Sub1_4.aBoolean498) {
			this.aClass101_Sub1_4.EA(Integer.MAX_VALUE, this.anInt1043, this.anInt1046, this.anInt1047);
		}
		@Pc(285) Class76_Sub2 local285 = this.aClass101_Sub1_4.method5832();
		local285.method7334(1.0F / this.aFloat7, 1.0F, 1.0F / this.aFloat7);
		this.aClass101_Sub1_4.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_4.method5953(1, this.anInterface25_1);
		this.aClass101_Sub1_4.method5938(this.aClass18_Sub3_1.aClass167_23);
		this.aClass101_Sub1_4.method5947(local32, local34 + 1 - local32, local14, Static627.aClass320_6, 0, local30);
		this.aClass101_Sub1_4.method5952();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public void method1034(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass101_Sub1_4.method5928(true, arg0 * 4);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIF)V")
	public void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(25) int local25;
		@Pc(38) int local38;
		if (this.anInt1042 != -1) {
			@Pc(20) Class136 local20 = this.aClass101_Sub1_4.anInterface3_12.method1941(this.anInt1042);
			local25 = local20.aByte67 & 0xFF;
			@Pc(63) int local63;
			if (local25 != 0 && local20.aByte62 != 4) {
				if (arg2 < 0) {
					local38 = 0;
				} else if (arg2 > 127) {
					local38 = 16777215;
				} else {
					local38 = arg2 * 131586;
				}
				if (local25 == 256) {
					arg1 = local38;
				} else {
					local63 = 256 - local25;
					arg1 = ((arg1 & 0xFF00FF) * local63 + (local38 & 0xFF00FF) * local25 & 0xFF00FF00) + ((arg1 & 0xFF00) * local63 + (local38 & 0xFF00) * local25 & 0xFF0000) >> 8;
				}
			}
			local38 = local20.aByte66 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(114) int local114 = (arg1 >> 16 & 0xFF) * local38;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local63 = local38 * (arg1 >> 8 & 0xFF);
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(138) int local138 = local38 * (arg1 & 0xFF);
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg1 = (local63 & 0xFF00) + ((local114 & 0xCC00FF00) << 8) + (local138 >> 8);
			}
		}
		this.aStream1.e(arg0 * 4);
		if (arg3 != 1.0F) {
			@Pc(177) int local177 = arg1 >> 16 & 0xFF;
			local25 = arg1 >> 8 & 0xFF;
			local38 = arg1 & 0xFF;
			local177 = (int) ((float) local177 * arg3);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local25 = (int) ((float) local25 * arg3);
			local38 = (int) ((float) local38 * arg3);
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 255) {
				local25 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg1 = local177 << 16 | local25 << 8 | local38;
		}
		if (this.aClass101_Sub1_4.anInt6641 == 0) {
			this.aStream1.b((byte) arg1);
			this.aStream1.b((byte) (arg1 >> 8));
			this.aStream1.b((byte) (arg1 >> 16));
		} else {
			this.aStream1.b((byte) (arg1 >> 16));
			this.aStream1.b((byte) (arg1 >> 8));
			this.aStream1.b((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
	public void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray58[arg2 + this.aClass18_Sub3_1.anInt9741 * arg0] |= 0x1 << arg1;
		this.anInt1044++;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	public void method1039(@OriginalArg(1) int arg0) {
		this.aStream1.a();
		this.anInterface25_1 = this.aClass101_Sub1_4.method5856(false);
		this.anInterface25_1.method9042(4, this.aNativeHeapBuffer1, arg0 * 4);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}
}
