import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_9;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	public int anInt6713 = 0;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!vha;")
	private final Class61_Sub3 aClass61_Sub3_2;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "F")
	public final float aFloat114;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	public final int anInt6709;

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
	public final int anInt6715;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	public final int anInt6711;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
	private final int[] anIntArray369;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_12;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	public final int anInt6712;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!vha;IIIII)V")
	public Class5_Sub39(@OriginalArg(0) Class61_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass61_Sub3_2 = arg0;
		this.aFloat114 = arg2;
		this.anInt6709 = arg5;
		this.anInt6715 = arg3;
		this.anInt6711 = arg4;
		this.anIntArray369 = new int[this.aClass61_Sub3_2.anInt10029 * this.aClass61_Sub3_2.anInt10026];
		this.aClass133_Sub1_12 = this.aClass61_Sub3_2.aClass133_Sub1_19;
		this.anInt6712 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V")
	public void method5984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray369[arg1 + this.aClass61_Sub3_2.anInt10026 * arg0] |= 0x1 << arg2;
		this.anInt6713++;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BFIII)V")
	public void method5985(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) int local31;
		@Pc(47) int local47;
		if (this.anInt6712 != -1) {
			@Pc(26) Class145 local26 = this.aClass133_Sub1_12.anInterface3_12.method4656(this.anInt6712);
			local31 = local26.aByte66 & 0xFF;
			@Pc(70) int local70;
			if (local31 != 0 && local26.aByte68 != 4) {
				if (arg1 < 0) {
					local47 = 0;
				} else if (arg1 <= 127) {
					local47 = arg1 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local31 == 256) {
					arg3 = local47;
				} else {
					local70 = 256 - local31;
					arg3 = ((arg3 & 0xFF00FF) * local70 + (local47 & 0xFF00FF) * local31 & 0xFF00FF00) + (local70 * (arg3 & 0xFF00) + (local47 & 0xFF00) * local31 & 0xFF0000) >> 8;
				}
			}
			local47 = local26.aByte67 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(124) int local124 = local47 * (arg3 >> 16 & 0xFF);
				if (local124 > 65535) {
					local124 = 65535;
				}
				local70 = local47 * (arg3 >> 8 & 0xFF);
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(150) int local150 = (arg3 & 0xFF) * local47;
				if (local150 > 65535) {
					local150 = 65535;
				}
				arg3 = (local70 & 0xFF00) + ((local124 & 0x2400FF00) << 8) + (local150 >> 8);
			}
		}
		this.aStream6.c(arg2 * 4);
		if (arg0 != 1.0F) {
			@Pc(187) int local187 = arg3 >> 16 & 0xFF;
			local31 = arg3 >> 8 & 0xFF;
			local187 = (int) ((float) local187 * arg0);
			local47 = arg3 & 0xFF;
			local31 = (int) ((float) local31 * arg0);
			if (local187 < 0) {
				local187 = 0;
			} else if (local187 > 255) {
				local187 = 255;
			}
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			local47 = (int) ((float) local47 * arg0);
			if (local47 < 0) {
				local47 = 0;
			} else if (local47 > 255) {
				local47 = 255;
			}
			arg3 = local47 | local31 << 8 | local187 << 16;
		}
		if (this.aClass133_Sub1_12.anInt7000 == 0) {
			this.aStream6.a((byte) arg3);
			this.aStream6.a((byte) (arg3 >> 8));
			this.aStream6.a((byte) (arg3 >> 16));
		} else {
			this.aStream6.a((byte) (arg3 >> 16));
			this.aStream6.a((byte) (arg3 >> 8));
			this.aStream6.a((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)V")
	public void method5986(@OriginalArg(1) int arg0) {
		this.aStream6.c(arg0 * 4 + 3);
		this.aStream6.a(-1);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V")
	public void method5987(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass133_Sub1_12.method6280(true, arg0 * 4);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)V")
	public void method5988(@OriginalArg(1) int arg0) {
		this.aStream6.b();
		this.anInterface6_9 = this.aClass133_Sub1_12.method6196(false);
		this.anInterface6_9.method4125(this.aNativeHeapBuffer6, 4, arg0 * 4);
		this.aNativeHeapBuffer6 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[IB)V")
	public void method5990(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(14) Interface14 local14 = this.aClass133_Sub1_12.method6155(this.anInt6713 * 3);
		@Pc(19) Buffer local19 = local14.method6770();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass133_Sub1_12.method6242(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(41) int local41 = -32768;
		@Pc(93) int local93;
		@Pc(57) short[] local57;
		@Pc(51) int local51;
		@Pc(62) int local62;
		@Pc(45) int local45;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(84) int local84;
		if (Stream.a()) {
			label96: for (local45 = 0; local45 < arg0; local45++) {
				local51 = arg1[local45];
				local57 = this.aClass61_Sub3_2.aShortArrayArray39[local51];
				local62 = this.anIntArray369[local51];
				if (local62 != 0 && local57 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local73 >= local57.length) {
								continue label96;
							}
							if ((0x1 << local71++ & local62) == 0) {
								local73 += 3;
							} else {
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local57[local73++] & 0xFFFF;
									if (local41 < local93) {
										local41 = local93;
									}
									if (local93 < local32) {
										local32 = local93;
									}
									local28.f(local93);
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label122: for (local45 = 0; local45 < arg0; local45++) {
				local51 = arg1[local45];
				local57 = this.aClass61_Sub3_2.aShortArrayArray39[local51];
				local62 = this.anIntArray369[local51];
				if (local62 != 0 && local57 != null) {
					local71 = 0;
					local73 = 0;
					while (true) {
						while (true) {
							if (local73 >= local57.length) {
								continue label122;
							}
							if ((0x1 << local71++ & local62) == 0) {
								local73 += 3;
							} else {
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local57[local73++] & 0xFFFF;
									local28.e(local93);
									if (local32 > local93) {
										local32 = local93;
									}
									if (local93 > local41) {
										local41 = local93;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method6769() || local30 <= 0) {
			return;
		}
		this.aClass133_Sub1_12.method6277((this.aClass61_Sub3_2.anInt10050 & 0x8) != 0, this.anInt6712, (this.aClass61_Sub3_2.anInt10050 & 0x7) != 0);
		if (this.aClass133_Sub1_12.aBoolean481) {
			this.aClass133_Sub1_12.EA(Integer.MAX_VALUE, this.anInt6715, this.anInt6711, this.anInt6709);
		}
		@Pc(284) Class113_Sub1 local284 = this.aClass133_Sub1_12.method6183();
		local284.method2456(1.0F / this.aFloat114, 1.0F, 1.0F / this.aFloat114);
		this.aClass133_Sub1_12.method6225(Static337.aClass373_6);
		this.aClass133_Sub1_12.method6215(this.anInterface6_9, 1);
		this.aClass133_Sub1_12.method6217(this.aClass61_Sub3_2.aClass90_23);
		this.aClass133_Sub1_12.method6194(local30, local41 + 1 - local32, local32, local14, 0, Static68.aClass303_2);
		this.aClass133_Sub1_12.method6172();
	}
}
