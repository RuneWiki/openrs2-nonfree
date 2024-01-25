import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Lclient!vc;")
	private Interface23 anInterface23_1;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public int anInt563 = 0;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!ida;")
	private final Class129_Sub2 aClass129_Sub2_1;

	@OriginalMember(owner = "client!as", name = "B", descriptor = "F")
	public final float aFloat3;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "I")
	public final int anInt570;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	public final int anInt566;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "[I")
	private final int[] anIntArray24;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	public final int anInt565;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_3;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public final int anInt561;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!ida;IIIII)V")
	public Class1_Sub7(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass129_Sub2_1 = arg0;
		this.aFloat3 = arg2;
		this.anInt570 = arg3;
		this.anInt566 = arg5;
		this.anIntArray24 = new int[this.aClass129_Sub2_1.anInt8058 * this.aClass129_Sub2_1.anInt8065];
		this.anInt565 = arg1;
		this.aClass78_Sub1_3 = this.aClass129_Sub2_1.aClass78_Sub1_8;
		this.anInt561 = arg4;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIB)V")
	public void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray24[arg0 * this.aClass129_Sub2_1.anInt8065 + arg1] |= 0x1 << arg2;
		this.anInt563++;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
	public void method483(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass78_Sub1_3.method6891(true, arg0 * 4);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([IZI)V")
	public void method484(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface13 local14 = this.aClass78_Sub1_3.method6974(this.anInt563 * 3);
		@Pc(19) Buffer local19 = local14.method5603();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass78_Sub1_3.method6925(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(40) int local40 = -32768;
		@Pc(96) int local96;
		@Pc(56) short[] local56;
		@Pc(50) int local50;
		@Pc(61) int local61;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(87) int local87;
		if (Stream.b()) {
			label118: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local56 = this.aClass129_Sub2_1.aShortArrayArray4[local50];
				local61 = this.anIntArray24[local50];
				if (local61 != 0 && local56 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local56.length <= local69) {
								continue label118;
							}
							if ((0x1 << local67++ & local61) == 0) {
								local69 += 3;
							} else {
								local30++;
								for (local87 = 0; local87 < 3; local87++) {
									local96 = local56[local69++] & 0xFFFF;
									local28.b(local96);
									if (local32 > local96) {
										local32 = local96;
									}
									if (local40 < local96) {
										local40 = local96;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label94: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local56 = this.aClass129_Sub2_1.aShortArrayArray4[local50];
				local61 = this.anIntArray24[local50];
				if (local61 != 0 && local56 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local56.length <= local69) {
								continue label94;
							}
							if ((local61 & 0x1 << local67++) == 0) {
								local69 += 3;
							} else {
								local30++;
								for (local87 = 0; local87 < 3; local87++) {
									local96 = local56[local69++] & 0xFFFF;
									local28.c(local96);
									if (local96 > local40) {
										local40 = local96;
									}
									if (local96 < local32) {
										local32 = local96;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.a();
		if (!local14.method5602() || local30 <= 0) {
			return;
		}
		this.aClass78_Sub1_3.method6948((this.aClass129_Sub2_1.anInt3945 & 0x7) != 0, (this.aClass129_Sub2_1.anInt3945 & 0x8) != 0, this.anInt565);
		if (this.aClass78_Sub1_3.aBoolean641) {
			this.aClass78_Sub1_3.YA(Integer.MAX_VALUE, this.anInt570, this.anInt561, this.anInt566);
		}
		@Pc(273) Class34_Sub1 local273 = this.aClass78_Sub1_3.method6922();
		local273.method894(1.0F / this.aFloat3, 1.0F / this.aFloat3, 1.0F);
		this.aClass78_Sub1_3.method6909(Static175.aClass316_4);
		this.aClass78_Sub1_3.method6965(this.anInterface23_1, 1);
		this.aClass78_Sub1_3.method6941(this.aClass129_Sub2_1.aClass185_13);
		this.aClass78_Sub1_3.method6947(Static302.aClass77_5, local40 + 1 - local32, local32, local30, 0, local14);
		this.aClass78_Sub1_3.method6920();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIFII)V")
	public void method485(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(43) int local43;
		if (this.anInt565 != -1) {
			@Pc(17) Class17 local17 = this.aClass78_Sub1_3.anInterface9_13.method947(this.anInt565);
			local22 = local17.aByte21 & 0xFF;
			@Pc(61) int local61;
			if (local22 != 0 && local17.aByte22 != 4) {
				if (arg0 < 0) {
					local43 = 0;
				} else if (arg0 <= 127) {
					local43 = arg0 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local22 == 256) {
					arg2 = local43;
				} else {
					local61 = 256 - local22;
					arg2 = ((local43 & 0xFF00) * local22 + (arg2 & 0xFF00) * local61 & 0xFF0000) + (local22 * (local43 & 0xFF00FF) + (local61 * (arg2 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local43 = local17.aByte17 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(116) int local116 = (arg2 >> 16 & 0xFF) * local43;
				if (local116 > 65535) {
					local116 = 65535;
				}
				local61 = local43 * (arg2 >> 8 & 0xFF);
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(142) int local142 = local43 * (arg2 & 0xFF);
				if (local142 > 65535) {
					local142 = 65535;
				}
				arg2 = (local61 & 0xFF00) + (local116 << 8 & 0xFF008D) + (local142 >> 8);
			}
		}
		this.aStream1.d(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(182) int local182 = arg2 >> 16 & 0xFF;
			local22 = arg2 >> 8 & 0xFF;
			local182 = (int) ((float) local182 * arg1);
			local43 = arg2 & 0xFF;
			local22 = (int) ((float) local22 * arg1);
			if (local182 < 0) {
				local182 = 0;
			} else if (local182 > 255) {
				local182 = 255;
			}
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local43 = (int) ((float) local43 * arg1);
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg2 = local182 << 16 | local22 << 8 | local43;
		}
		if (this.aClass78_Sub1_3.anInt8568 == 0) {
			this.aStream1.e((byte) arg2);
			this.aStream1.e((byte) (arg2 >> 8));
			this.aStream1.e((byte) (arg2 >> 16));
		} else {
			this.aStream1.e((byte) (arg2 >> 16));
			this.aStream1.e((byte) (arg2 >> 8));
			this.aStream1.e((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
	public void method487(@OriginalArg(0) int arg0) {
		this.aStream1.d(arg0 * 4 + 3);
		this.aStream1.e(-1);
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(II)V")
	public void method488(@OriginalArg(1) int arg0) {
		this.aStream1.a();
		this.anInterface23_1 = this.aClass78_Sub1_3.method6927(false);
		this.anInterface23_1.method5571(this.aNativeHeapBuffer1, 4, arg0 * 4);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}
}
