import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "Lclient!tfa;")
	private Interface20 anInterface20_6;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	public int anInt4671 = 0;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "Lclient!ow;")
	private final Class62_Sub3 aClass62_Sub3_2;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "F")
	public final float aFloat103;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
	private final int[] anIntArray300;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public final int anInt4663;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
	public final int anInt4675;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_10;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
	public final int anInt4666;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public final int anInt4664;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!ow;IIIII)V")
	public Class6_Sub27(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass62_Sub3_2 = arg0;
		this.aFloat103 = arg2;
		this.anIntArray300 = new int[this.aClass62_Sub3_2.anInt9881 * this.aClass62_Sub3_2.anInt9885];
		this.anInt4663 = arg5;
		this.anInt4675 = arg1;
		this.aClass9_Sub3_10 = this.aClass62_Sub3_2.aClass9_Sub3_15;
		this.anInt4666 = arg3;
		this.anInt4664 = arg4;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	public void method4010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray300[arg2 + this.aClass62_Sub3_2.anInt9881 * arg0] |= 0x1 << arg1;
		this.anInt4671++;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)V")
	public void method4012(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass9_Sub3_10.method5472(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer5, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V")
	public void method4013(@OriginalArg(0) int arg0) {
		this.aStream5.a(arg0 * 4 + 3);
		this.aStream5.f(-1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB[I)V")
	public void method4014(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface21 local14 = this.aClass9_Sub3_10.method5497(this.anInt4671 * 3);
		@Pc(19) Buffer local19 = local14.method6521();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass9_Sub3_10.method5524(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(34) int local34 = -32768;
		@Pc(92) int local92;
		@Pc(50) short[] local50;
		@Pc(44) int local44;
		@Pc(55) int local55;
		@Pc(38) int local38;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(83) int local83;
		if (Stream.c()) {
			label95: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local55 = this.anIntArray300[local44];
				local50 = this.aClass62_Sub3_2.aShortArrayArray9[local44];
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
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local50[local66++] & 0xFFFF;
									local28.c(local92);
									if (local92 < local32) {
										local32 = local92;
									}
									if (local34 < local92) {
										local34 = local92;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label121: for (local38 = 0; local38 < arg0; local38++) {
				local44 = arg1[local38];
				local50 = this.aClass62_Sub3_2.aShortArrayArray9[local44];
				local55 = this.anIntArray300[local44];
				if (local55 != 0 && local50 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local50.length <= local66) {
								continue label121;
							}
							if ((0x1 << local64++ & local55) == 0) {
								local66 += 3;
							} else {
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local50[local66++] & 0xFFFF;
									if (local92 < local32) {
										local32 = local92;
									}
									local28.d(local92);
									if (local92 > local34) {
										local34 = local92;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method6524() || local30 <= 0) {
			return;
		}
		this.aClass9_Sub3_10.method5559(this.anInt4675, (this.aClass62_Sub3_2.anInt7159 & 0x7) != 0, (this.aClass62_Sub3_2.anInt7159 & 0x8) != 0);
		if (this.aClass9_Sub3_10.aBoolean479) {
			this.aClass9_Sub3_10.LA(Integer.MAX_VALUE, this.anInt4666, this.anInt4664, this.anInt4663);
		}
		@Pc(276) Class8_Sub3 local276 = this.aClass9_Sub3_10.method5553();
		local276.method8198(1.0F / this.aFloat103, 1.0F / this.aFloat103, 1.0F);
		this.aClass9_Sub3_10.method5481(Static52.aClass340_4);
		this.aClass9_Sub3_10.method5513(1, this.anInterface20_6);
		this.aClass9_Sub3_10.method5535(this.aClass62_Sub3_2.aClass88_19);
		this.aClass9_Sub3_10.method5539(0, local32, Static492.aClass328_6, local14, local30, local34 + 1 - local32);
		this.aClass9_Sub3_10.method5498();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIFB)V")
	public void method4016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(19) int local19;
		@Pc(32) int local32;
		if (this.anInt4675 != -1) {
			@Pc(14) Class296 local14 = this.aClass9_Sub3_10.anInterface2_11.method3585(this.anInt4675);
			local19 = local14.aByte103 & 0xFF;
			@Pc(61) int local61;
			if (local19 != 0 && local14.aByte104 != 4) {
				if (arg1 < 0) {
					local32 = 0;
				} else if (arg1 <= 127) {
					local32 = arg1 * 131586;
				} else {
					local32 = 16777215;
				}
				if (local19 == 256) {
					arg2 = local32;
				} else {
					local61 = 256 - local19;
					arg2 = ((local32 & 0xFF00FF) * local19 + local61 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local19 * (local32 & 0xFF00) + local61 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local32 = local14.aByte101 & 0xFF;
			if (local32 != 0) {
				local32 += 256;
				@Pc(112) int local112 = (arg2 >> 16 & 0xFF) * local32;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local61 = local32 * (arg2 >> 8 & 0xFF);
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(138) int local138 = (arg2 & 0xFF) * local32;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg2 = (local61 & 0xFF00) + (local112 << 8 & 0xFF006B) + (local138 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(177) int local177 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg3);
			local32 = arg2 & 0xFF;
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local19 = (int) ((float) local19 * arg3);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local32 = (int) ((float) local32 * arg3);
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 255) {
				local32 = 255;
			}
			arg2 = local32 | local19 << 8 | local177 << 16;
		}
		this.aStream5.a(arg0 * 4);
		if (this.aClass9_Sub3_10.anInt6542 == 0) {
			this.aStream5.f((byte) arg2);
			this.aStream5.f((byte) (arg2 >> 8));
			this.aStream5.f((byte) (arg2 >> 16));
		} else {
			this.aStream5.f((byte) (arg2 >> 16));
			this.aStream5.f((byte) (arg2 >> 8));
			this.aStream5.f((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V")
	public void method4018(@OriginalArg(1) int arg0) {
		this.aStream5.a();
		this.anInterface20_6 = this.aClass9_Sub3_10.method5528(false);
		this.anInterface20_6.method6522(this.aNativeHeapBuffer5, 4, arg0 * 4);
		this.aNativeHeapBuffer5 = null;
		this.aStream5 = null;
	}
}
