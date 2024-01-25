import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "Lclient!iq;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	public int anInt1299 = 0;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "Lclient!kb;")
	private final Class46_Sub2 aClass46_Sub2_1;

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
	public final int anInt1300;

	@OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
	public final int anInt1305;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_3;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	public final int anInt1298;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	public final int anInt1292;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "F")
	public final float aFloat23;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "[I")
	private final int[] anIntArray113;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!kb;IIIII)V")
	public Class6_Sub10(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass46_Sub2_1 = arg0;
		this.anInt1300 = arg4;
		this.anInt1305 = arg3;
		this.aClass90_Sub3_3 = this.aClass46_Sub2_1.aClass90_Sub3_7;
		this.anInt1298 = arg5;
		this.anInt1292 = arg1;
		this.aFloat23 = arg2;
		this.anIntArray113 = new int[this.aClass46_Sub2_1.anInt9995 * this.aClass46_Sub2_1.anInt9997];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method1081(@OriginalArg(0) int arg0) {
		this.aStream1.b(arg0 * 4 + 3);
		this.aStream1.c(-1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI[I)V")
	public void method1085(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(21) Interface9 local21 = this.aClass90_Sub3_3.method7581(this.anInt1299 * 3);
		@Pc(26) Buffer local26 = local21.method6462();
		if (local26 == null) {
			return;
		}
		@Pc(35) Stream local35 = this.aClass90_Sub3_3.method7595(local26);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 32767;
		@Pc(41) int local41 = -32768;
		@Pc(91) int local91;
		@Pc(62) short[] local62;
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(45) int local45;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(82) int local82;
		if (Stream.a()) {
			label95: for (local45 = 0; local45 < arg0; local45++) {
				local51 = arg1[local45];
				local62 = this.aClass46_Sub2_1.aShortArrayArray19[local51];
				local56 = this.anIntArray113[local51];
				if (local56 != 0 && local62 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local62.length <= local70) {
								continue label95;
							}
							if ((local56 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								local37++;
								for (local82 = 0; local82 < 3; local82++) {
									local91 = local62[local70++] & 0xFFFF;
									local35.e(local91);
									if (local39 > local91) {
										local39 = local91;
									}
									if (local41 < local91) {
										local41 = local91;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label120: for (local45 = 0; local45 < arg0; local45++) {
				local51 = arg1[local45];
				local56 = this.anIntArray113[local51];
				local62 = this.aClass46_Sub2_1.aShortArrayArray19[local51];
				if (local56 != 0 && local62 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local62.length <= local70) {
								continue label120;
							}
							if ((local56 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								local37++;
								for (local82 = 0; local82 < 3; local82++) {
									local91 = local62[local70++] & 0xFFFF;
									if (local39 > local91) {
										local39 = local91;
									}
									local35.a(local91);
									if (local91 > local41) {
										local41 = local91;
									}
								}
							}
						}
					}
				}
			}
		}
		local35.b();
		if (!local21.method6460() || local37 <= 0) {
			return;
		}
		this.aClass90_Sub3_3.method7548((this.aClass46_Sub2_1.anInt4686 & 0x7) != 0, this.anInt1292, (this.aClass46_Sub2_1.anInt4686 & 0x8) != 0);
		if (this.aClass90_Sub3_3.aBoolean631) {
			this.aClass90_Sub3_3.LA(Integer.MAX_VALUE, this.anInt1305, this.anInt1300, this.anInt1298);
		}
		@Pc(269) Class93_Sub3 local269 = this.aClass90_Sub3_3.method7585();
		local269.method3768(1.0F / this.aFloat23, 1.0F, 1.0F / this.aFloat23);
		this.aClass90_Sub3_3.method7580(Static573.aClass172_11);
		this.aClass90_Sub3_3.method7658(this.anInterface8_1, 1);
		this.aClass90_Sub3_3.method7553(this.aClass46_Sub2_1.aClass107_8);
		this.aClass90_Sub3_3.method7560(local41 + 1 - local39, local37, local39, local21, Static104.aClass321_1, 0);
		this.aClass90_Sub3_3.method7576();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(FIIBI)V")
	public void method1086(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(33) int local33;
		if (this.anInt1292 != -1) {
			@Pc(13) Class115 local13 = this.aClass90_Sub3_3.anInterface2_15.method3085(this.anInt1292);
			local18 = local13.aByte40 & 0xFF;
			@Pc(60) int local60;
			if (local18 != 0 && local13.aByte34 != 4) {
				if (arg2 < 0) {
					local33 = 0;
				} else if (arg2 <= 127) {
					local33 = arg2 * 131586;
				} else {
					local33 = 16777215;
				}
				if (local18 == 256) {
					arg1 = local33;
				} else {
					local60 = 256 - local18;
					arg1 = (local18 * (local33 & 0xFF00) + (arg1 & 0xFF00) * local60 & 0xFF0000) + (local18 * (local33 & 0xFF00FF) + (arg1 & 0xFF00FF) * local60 & 0xFF00FF00) >> 8;
				}
			}
			local33 = local13.aByte38 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(111) int local111 = local33 * (arg1 >> 16 & 0xFF);
				if (local111 > 65535) {
					local111 = 65535;
				}
				local60 = local33 * (arg1 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(137) int local137 = (arg1 & 0xFF) * local33;
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg1 = (local137 >> 8) + (local60 & 0xFF00) + (local111 << 8 & 0xFF00E7);
			}
		}
		this.aStream1.b(arg3 * 4);
		if (arg0 != 1.0F) {
			@Pc(176) int local176 = arg1 >> 16 & 0xFF;
			local18 = arg1 >> 8 & 0xFF;
			local176 = (int) ((float) local176 * arg0);
			local33 = arg1 & 0xFF;
			local18 = (int) ((float) local18 * arg0);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local33 = (int) ((float) local33 * arg0);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg1 = local33 | local18 << 8 | local176 << 16;
		}
		if (this.aClass90_Sub3_3.anInt9561 == 0) {
			this.aStream1.c((byte) arg1);
			this.aStream1.c((byte) (arg1 >> 8));
			this.aStream1.c((byte) (arg1 >> 16));
		} else {
			this.aStream1.c((byte) (arg1 >> 16));
			this.aStream1.c((byte) (arg1 >> 8));
			this.aStream1.c((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIB)V")
	public void method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray113[arg0 + this.aClass46_Sub2_1.anInt9997 * arg2] |= 0x1 << arg1;
		this.anInt1299++;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V")
	public void method1091(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass90_Sub3_3.method7651(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer3, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI)V")
	public void method1093(@OriginalArg(1) int arg0) {
		this.aStream1.b();
		this.anInterface8_1 = this.aClass90_Sub3_3.method7562(false);
		this.anInterface8_1.method6459(arg0 * 4, 4, this.aNativeHeapBuffer3);
		this.aStream1 = null;
		this.aNativeHeapBuffer3 = null;
	}
}
