import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!vp;")
	private Interface23 anInterface23_1;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public int anInt250 = 0;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Lclient!ua;")
	private final Class60_Sub3 aClass60_Sub3_1;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "I")
	public final int anInt258;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	public final int anInt251;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	public final int anInt253;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "I")
	public final int anInt252;

	@OriginalMember(owner = "client!al", name = "A", descriptor = "[I")
	private final int[] anIntArray24;

	@OriginalMember(owner = "client!al", name = "D", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_2;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "F")
	public final float aFloat5;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ua;IIIII)V")
	public Class6_Sub2(@OriginalArg(0) Class60_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass60_Sub3_1 = arg0;
		this.anInt258 = arg5;
		this.anInt251 = arg1;
		this.anInt253 = arg4;
		this.anInt252 = arg3;
		this.anIntArray24 = new int[this.aClass60_Sub3_1.anInt9656 * this.aClass60_Sub3_1.anInt9657];
		this.aClass121_Sub2_2 = this.aClass60_Sub3_1.aClass121_Sub2_18;
		this.aFloat5 = arg2;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI[I)V")
	public void method213(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface11 local14 = this.aClass121_Sub2_2.method7281(this.anInt250 * 3);
		@Pc(19) Buffer local19 = local14.method7569();
		if (local19 == null) {
			return;
		}
		@Pc(34) Stream local34 = this.aClass121_Sub2_2.method7200(local19);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 32767;
		@Pc(40) int local40 = -32768;
		@Pc(93) int local93;
		@Pc(61) short[] local61;
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(84) int local84;
		if (Stream.a()) {
			label96: for (local44 = 0; local44 < arg0; local44++) {
				local50 = arg1[local44];
				local55 = this.anIntArray24[local50];
				local61 = this.aClass60_Sub3_1.aShortArrayArray13[local50];
				if (local55 != 0 && local61 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local61.length <= local69) {
								continue label96;
							}
							if ((local55 & 0x1 << local67++) == 0) {
								local69 += 3;
							} else {
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local61[local69++] & 0xFFFF;
									if (local93 > local40) {
										local40 = local93;
									}
									if (local38 > local93) {
										local38 = local93;
									}
									local34.f(local93);
								}
								local36++;
							}
						}
					}
				}
			}
		} else {
			label121: for (local44 = 0; local44 < arg0; local44++) {
				local50 = arg1[local44];
				local55 = this.anIntArray24[local50];
				local61 = this.aClass60_Sub3_1.aShortArrayArray13[local50];
				if (local55 != 0 && local61 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local61.length <= local69) {
								continue label121;
							}
							if ((0x1 << local67++ & local55) == 0) {
								local69 += 3;
							} else {
								local36++;
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local61[local69++] & 0xFFFF;
									if (local38 > local93) {
										local38 = local93;
									}
									local34.b(local93);
									if (local40 < local93) {
										local40 = local93;
									}
								}
							}
						}
					}
				}
			}
		}
		local34.c();
		if (!local14.method7563() || local36 <= 0) {
			return;
		}
		this.aClass121_Sub2_2.method7290(this.anInt251, (this.aClass60_Sub3_1.anInt8368 & 0x7) != 0, (this.aClass60_Sub3_1.anInt8368 & 0x8) != 0);
		if (this.aClass121_Sub2_2.aBoolean618) {
			this.aClass121_Sub2_2.LA(Integer.MAX_VALUE, this.anInt252, this.anInt253, this.anInt258);
		}
		@Pc(278) Class34_Sub3 local278 = this.aClass121_Sub2_2.method7261();
		local278.method3760(1.0F / this.aFloat5, 1.0F, 1.0F / this.aFloat5);
		this.aClass121_Sub2_2.method7181(Static478.aClass168_6);
		this.aClass121_Sub2_2.method7297(1, this.anInterface23_1);
		this.aClass121_Sub2_2.method7263(this.aClass60_Sub3_1.aClass258_14);
		this.aClass121_Sub2_2.method7239(local38, local40 + 1 - local38, local14, local36, Static503.aClass107_2, 0);
		this.aClass121_Sub2_2.method7209();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public void method214(@OriginalArg(0) int arg0) {
		this.aStream1.c();
		this.anInterface23_1 = this.aClass121_Sub2_2.method7201(false);
		this.anInterface23_1.method7570(this.aNativeHeapBuffer1, 4, arg0 * 4);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V")
	public void method215(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.c(-1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIII)V")
	public void method217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray24[arg1 + this.aClass60_Sub3_1.anInt9656 * arg0] |= 0x1 << arg2;
		this.anInt250++;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IFIBI)V")
	public void method218(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(30) int local30;
		@Pc(48) int local48;
		if (this.anInt251 != -1) {
			@Pc(25) Class76 local25 = this.aClass121_Sub2_2.anInterface7_14.method5209(this.anInt251);
			local30 = local25.aByte23 & 0xFF;
			@Pc(66) int local66;
			if (local30 != 0 && local25.aByte24 != 4) {
				if (arg3 < 0) {
					local48 = 0;
				} else if (arg3 <= 127) {
					local48 = arg3 * 131586;
				} else {
					local48 = 16777215;
				}
				if (local30 == 256) {
					arg0 = local48;
				} else {
					local66 = 256 - local30;
					arg0 = (local66 * (arg0 & 0xFF00) + local30 * (local48 & 0xFF00) & 0xFF0000) + (local66 * (arg0 & 0xFF00FF) + (local48 & 0xFF00FF) * local30 & 0xFF00FF00) >> 8;
				}
			}
			local48 = local25.aByte21 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(119) int local119 = (arg0 >> 16 & 0xFF) * local48;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local66 = (arg0 >> 8 & 0xFF) * local48;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(147) int local147 = (arg0 & 0xFF) * local48;
				if (local147 > 65535) {
					local147 = 65535;
				}
				arg0 = (local119 << 8 & 0xFF00DA) + ((local66 & 0xFF00) + (local147 >> 8));
			}
		}
		if (arg1 != 1.0F) {
			@Pc(177) int local177 = arg0 >> 16 & 0xFF;
			local30 = arg0 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg1);
			local48 = arg0 & 0xFF;
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local30 = (int) ((float) local30 * arg1);
			if (local30 < 0) {
				local30 = 0;
			} else if (local30 > 255) {
				local30 = 255;
			}
			local48 = (int) ((float) local48 * arg1);
			if (local48 < 0) {
				local48 = 0;
			} else if (local48 > 255) {
				local48 = 255;
			}
			arg0 = local48 | local177 << 16 | local30 << 8;
		}
		this.aStream1.e(arg2 * 4);
		if (this.aClass121_Sub2_2.anInt8923 == 0) {
			this.aStream1.c((byte) arg0);
			this.aStream1.c((byte) (arg0 >> 8));
			this.aStream1.c((byte) (arg0 >> 16));
		} else {
			this.aStream1.c((byte) (arg0 >> 16));
			this.aStream1.c((byte) (arg0 >> 8));
			this.aStream1.c((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(II)V")
	public void method221(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass121_Sub2_2.method7205(true, arg0 * 4);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1, 0, arg0 * 4);
	}
}
