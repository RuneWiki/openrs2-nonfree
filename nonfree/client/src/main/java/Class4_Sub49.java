import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class4_Sub49 extends Class4 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "Lclient!el;")
	private Interface9 anInterface9_15;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
	public int anInt9899 = 0;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "Lclient!jda;")
	private final Class83_Sub2 aClass83_Sub2_3;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "F")
	public final float aFloat226;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
	public final int anInt9891;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
	public final int anInt9893;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "[I")
	private final int[] anIntArray530;

	@OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
	public final int anInt9897;

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_22;

	@OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
	public final int anInt9903;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!jda;IIIII)V")
	public Class4_Sub49(@OriginalArg(0) Class83_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass83_Sub2_3 = arg0;
		this.aFloat226 = arg2;
		this.anInt9891 = arg5;
		this.anInt9893 = arg4;
		this.anIntArray530 = new int[this.aClass83_Sub2_3.anInt8829 * this.aClass83_Sub2_3.anInt8830];
		this.anInt9897 = arg1;
		this.aClass44_Sub2_22 = this.aClass83_Sub2_3.aClass44_Sub2_8;
		this.anInt9903 = arg3;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public void method8071(@OriginalArg(1) int arg0) {
		this.aStream7.c(arg0 * 4 + 3);
		this.aStream7.d(-1);
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
	public void method8073(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass44_Sub2_22.method4360(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(FIIII)V")
	public void method8075(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (this.anInt9897 != -1) {
			@Pc(15) Class14 local15 = this.aClass44_Sub2_22.anInterface11_11.method7405(this.anInt9897);
			local20 = local15.aByte7 & 0xFF;
			@Pc(55) int local55;
			if (local20 != 0 && local15.aByte9 != 4) {
				if (arg3 < 0) {
					local32 = 0;
				} else if (arg3 <= 127) {
					local32 = arg3 * 131586;
				} else {
					local32 = 16777215;
				}
				if (local20 == 256) {
					arg2 = local32;
				} else {
					local55 = 256 - local20;
					arg2 = (local20 * (local32 & 0xFF00FF) + (arg2 & 0xFF00FF) * local55 & 0xFF00FF00) + (local20 * (local32 & 0xFF00) + local55 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local32 = local15.aByte8 & 0xFF;
			if (local32 != 0) {
				local32 += 256;
				@Pc(110) int local110 = local32 * (arg2 >> 16 & 0xFF);
				if (local110 > 65535) {
					local110 = 65535;
				}
				local55 = (arg2 >> 8 & 0xFF) * local32;
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(136) int local136 = local32 * (arg2 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg2 = (local55 & 0xFF00) + (local110 << 8 & 0xFF00A3) + (local136 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(170) int local170 = arg2 >> 16 & 0xFF;
			local20 = arg2 >> 8 & 0xFF;
			local170 = (int) ((float) local170 * arg0);
			local32 = arg2 & 0xFF;
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 255) {
				local170 = 255;
			}
			local20 = (int) ((float) local20 * arg0);
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			local32 = (int) ((float) local32 * arg0);
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 255) {
				local32 = 255;
			}
			arg2 = local32 | local170 << 16 | local20 << 8;
		}
		this.aStream7.c(arg1 * 4);
		if (this.aClass44_Sub2_22.anInt4940 == 0) {
			this.aStream7.d((byte) arg2);
			this.aStream7.d((byte) (arg2 >> 8));
			this.aStream7.d((byte) (arg2 >> 16));
		} else {
			this.aStream7.d((byte) (arg2 >> 16));
			this.aStream7.d((byte) (arg2 >> 8));
			this.aStream7.d((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(II)V")
	public void method8076(@OriginalArg(0) int arg0) {
		this.aStream7.a();
		this.anInterface9_15 = this.aClass44_Sub2_22.method4286(false);
		this.anInterface9_15.method5103(arg0 * 4, 4, this.aNativeHeapBuffer8);
		this.aNativeHeapBuffer8 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[II)V")
	public void method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(14) Interface3 local14 = this.aClass44_Sub2_22.method4326(this.anInt9899 * 3);
		@Pc(19) Buffer local19 = local14.method5235();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass44_Sub2_22.method4315(local19);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(94) int local94;
		@Pc(63) short[] local63;
		@Pc(52) int local52;
		@Pc(57) int local57;
		@Pc(46) int local46;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(85) int local85;
		if (Stream.b()) {
			label119: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local57 = this.anIntArray530[local52];
				local63 = this.aClass83_Sub2_3.aShortArrayArray2[local52];
				if (local57 != 0 && local63 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local63.length <= local71) {
								continue label119;
							}
							if ((0x1 << local69++ & local57) == 0) {
								local71 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local63[local71++] & 0xFFFF;
									if (local40 > local94) {
										local40 = local94;
									}
									if (local42 < local94) {
										local42 = local94;
									}
									local28.e(local94);
								}
								local38++;
							}
						}
					}
				}
			}
		} else {
			label93: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local63 = this.aClass83_Sub2_3.aShortArrayArray2[local52];
				local57 = this.anIntArray530[local52];
				if (local57 != 0 && local63 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local63.length <= local71) {
								continue label93;
							}
							if ((0x1 << local69++ & local57) == 0) {
								local71 += 3;
							} else {
								local38++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local63[local71++] & 0xFFFF;
									if (local94 > local42) {
										local42 = local94;
									}
									if (local94 < local40) {
										local40 = local94;
									}
									local28.f(local94);
								}
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method5237() || local38 <= 0) {
			return;
		}
		this.aClass44_Sub2_22.method4272(this.anInt9897, (this.aClass83_Sub2_3.anInt4297 & 0x8) != 0, (this.aClass83_Sub2_3.anInt4297 & 0x7) != 0);
		if (this.aClass44_Sub2_22.aBoolean348) {
			this.aClass44_Sub2_22.YA(Integer.MAX_VALUE, this.anInt9903, this.anInt9893, this.anInt9891);
		}
		@Pc(265) Class8_Sub3 local265 = this.aClass44_Sub2_22.method4353();
		local265.method1564(1.0F / this.aFloat226, 1.0F, 1.0F / this.aFloat226);
		this.aClass44_Sub2_22.method4268(Static88.aClass340_2);
		this.aClass44_Sub2_22.method4358(1, this.anInterface9_15);
		this.aClass44_Sub2_22.method4374(this.aClass83_Sub2_3.aClass3_14);
		this.aClass44_Sub2_22.method4361(0, Static262.aClass271_5, local38, local40, local42 + 1 - local40, local14);
		this.aClass44_Sub2_22.method4247();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIB)V")
	public void method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray530[this.aClass83_Sub2_3.anInt8829 * arg0 + arg1] |= 0x1 << arg2;
		this.anInt9899++;
	}
}
