import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "Lclient!tc;")
	private Interface22 anInterface22_12;

	@OriginalMember(owner = "client!eu", name = "M", descriptor = "I")
	public int anInt3394 = 0;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "Lclient!qm;")
	private final Class65_Sub3 aClass65_Sub3_2;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
	public final int anInt3382;

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "F")
	public final float aFloat101;

	@OriginalMember(owner = "client!eu", name = "N", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_5;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
	public final int anInt3385;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	public final int anInt3380;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "[I")
	private final int[] anIntArray166;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
	public final int anInt3384;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!qm;IIIII)V")
	public Class2_Sub15(@OriginalArg(0) Class65_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub3_2 = arg0;
		this.anInt3382 = arg5;
		this.aFloat101 = arg2;
		this.aClass20_Sub2_5 = this.aClass65_Sub3_2.aClass20_Sub2_20;
		this.anInt3385 = arg4;
		this.anInt3380 = arg1;
		this.anIntArray166 = new int[this.aClass65_Sub3_2.anInt9618 * this.aClass65_Sub3_2.anInt9615];
		this.anInt3384 = arg3;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)V")
	public void method3101(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass20_Sub2_5.method1503(true, arg0 * 4);
		this.aStream4 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[II)V")
	public void method3102(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface24 local14 = this.aClass20_Sub2_5.method1456(this.anInt3394 * 3);
		@Pc(19) Buffer local19 = local14.method6477();
		if (local19 == null) {
			return;
		}
		@Pc(35) Stream local35 = this.aClass20_Sub2_5.method1527(local19);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 32767;
		@Pc(41) int local41 = -32768;
		@Pc(100) int local100;
		@Pc(57) short[] local57;
		@Pc(51) int local51;
		@Pc(62) int local62;
		@Pc(45) int local45;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(91) int local91;
		if (Stream.c()) {
			label118: for (local45 = 0; local45 < arg1; local45++) {
				local51 = arg0[local45];
				local57 = this.aClass65_Sub3_2.aShortArrayArray23[local51];
				local62 = this.anIntArray166[local51];
				if (local62 != 0 && local57 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local57.length <= local73) {
								continue label118;
							}
							if ((local62 & 0x1 << local71++) == 0) {
								local73 += 3;
							} else {
								local37++;
								for (local91 = 0; local91 < 3; local91++) {
									local100 = local57[local73++] & 0xFFFF;
									if (local39 > local100) {
										local39 = local100;
									}
									local35.d(local100);
									if (local100 > local41) {
										local41 = local100;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label94: for (local45 = 0; local45 < arg1; local45++) {
				local51 = arg0[local45];
				local57 = this.aClass65_Sub3_2.aShortArrayArray23[local51];
				local62 = this.anIntArray166[local51];
				if (local62 != 0 && local57 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local73 >= local57.length) {
								continue label94;
							}
							if ((0x1 << local71++ & local62) == 0) {
								local73 += 3;
							} else {
								local37++;
								for (local91 = 0; local91 < 3; local91++) {
									local100 = local57[local73++] & 0xFFFF;
									if (local100 < local39) {
										local39 = local100;
									}
									local35.a(local100);
									if (local41 < local100) {
										local41 = local100;
									}
								}
							}
						}
					}
				}
			}
		}
		local35.a();
		if (!local14.method6474() || local37 <= 0) {
			return;
		}
		this.aClass20_Sub2_5.method1448((this.aClass65_Sub3_2.anInt8510 & 0x8) != 0, (this.aClass65_Sub3_2.anInt8510 & 0x7) != 0, this.anInt3380);
		if (this.aClass20_Sub2_5.aBoolean129) {
			this.aClass20_Sub2_5.EA(Integer.MAX_VALUE, this.anInt3384, this.anInt3385, this.anInt3382);
		}
		@Pc(296) Class30_Sub2 local296 = this.aClass20_Sub2_5.method1454();
		local296.method4052(1.0F, 1.0F / this.aFloat101, 1.0F / this.aFloat101);
		this.aClass20_Sub2_5.method1487(Static547.aClass332_6);
		this.aClass20_Sub2_5.method1559(this.anInterface22_12, 1);
		this.aClass20_Sub2_5.method1496(this.aClass65_Sub3_2.aClass22_22);
		this.aClass20_Sub2_5.method1572(Static539.aClass134_6, local37, local14, local39, 0, local41 + 1 - local39);
		this.aClass20_Sub2_5.method1513();
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(II)V")
	public void method3105(@OriginalArg(1) int arg0) {
		this.aStream4.a();
		this.anInterface22_12 = this.aClass20_Sub2_5.method1523(false);
		this.anInterface22_12.method761(this.aNativeHeapBuffer6, 4, arg0 * 4);
		this.aNativeHeapBuffer6 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IFIII)V")
	public void method3106(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(35) int local35;
		if (this.anInt3380 != -1) {
			@Pc(14) Class127 local14 = this.aClass20_Sub2_5.anInterface4_12.method8048(this.anInt3380);
			local19 = local14.aByte74 & 0xFF;
			@Pc(60) int local60;
			if (local19 != 0 && local14.aByte78 != 4) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 <= 127) {
					local35 = arg2 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local19 == 256) {
					arg3 = local35;
				} else {
					local60 = 256 - local19;
					arg3 = (local60 * (arg3 & 0xFF00) + local19 * (local35 & 0xFF00) & 0xFF0000) + (local19 * (local35 & 0xFF00FF) + ((arg3 & 0xFF00FF) * local60) & 0xFF00FF00) >> 8;
				}
			}
			local35 = local14.aByte79 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(114) int local114 = (arg3 >> 16 & 0xFF) * local35;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local60 = (arg3 >> 8 & 0xFF) * local35;
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(138) int local138 = local35 * (arg3 & 0xFF);
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg3 = (local138 >> 8) + (local60 & 0xFF00) + ((local114 & 0x5400FF00) << 8);
			}
		}
		this.aStream4.e(arg0 * 4);
		if (arg1 != 1.0F) {
			@Pc(177) int local177 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg1);
			local35 = arg3 & 0xFF;
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local19 = (int) ((float) local19 * arg1);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local35 = (int) ((float) local35 * arg1);
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg3 = local35 | local177 << 16 | local19 << 8;
		}
		if (this.aClass20_Sub2_5.anInt1576 == 0) {
			this.aStream4.f((byte) arg3);
			this.aStream4.f((byte) (arg3 >> 8));
			this.aStream4.f((byte) (arg3 >> 16));
		} else {
			this.aStream4.f((byte) (arg3 >> 16));
			this.aStream4.f((byte) (arg3 >> 8));
			this.aStream4.f((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIB)V")
	public void method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray166[arg1 * this.aClass65_Sub3_2.anInt9615 + arg2] |= 0x1 << arg0;
		this.anInt3394++;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(BI)V")
	public void method3109(@OriginalArg(1) int arg0) {
		this.aStream4.e(arg0 * 4 + 3);
		this.aStream4.f(-1);
	}
}
