import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "Lclient!kca;")
	private Class166 aClass166_9;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "Lclient!ot;")
	private final Class46_Sub3 aClass46_Sub3_3;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "[I")
	private final int[] anIntArray491;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "F")
	public final float aFloat160;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
	public final int anInt6943;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_31;

	@OriginalMember(owner = "client!oq", name = "H", descriptor = "I")
	public final int anInt6951;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
	public final int anInt6942;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
	public final int anInt6949;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "Lclient!ho;")
	private final Class135_Sub1 aClass135_Sub1_2;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ot;IIIII)V")
	public Class6_Sub35(@OriginalArg(0) Class46_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass46_Sub3_3 = arg0;
		this.anIntArray491 = new int[this.aClass46_Sub3_3.anInt9995 * this.aClass46_Sub3_3.anInt9997];
		this.aFloat160 = arg2;
		this.anInt6943 = arg5;
		this.aClass90_Sub1_31 = this.aClass46_Sub3_3.aClass90_Sub1_32;
		this.anInt6951 = arg1;
		this.anInt6942 = arg4;
		this.anInt6949 = arg3;
		this.aClass135_Sub1_2 = new Class135_Sub1(this.aClass90_Sub1_31, 5123, null, 1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI[I)V")
	public void method5564(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(15) int local15 = 0;
		@Pc(19) Class6_Sub12_Sub1 local19 = this.aClass90_Sub1_31.aClass6_Sub12_Sub1_1;
		local19.anInt7556 = 0;
		@Pc(40) short[] local40;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(28) int local28;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass90_Sub1_31.aBoolean176) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass46_Sub3_3.aShortArrayArray22[local34];
				local45 = this.anIntArray491[local34];
				if (local45 != 0 && local40 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local40.length) {
						if ((0x1 << local51++ & local45) == 0) {
							local53 += 3;
						} else {
							local15++;
							local19.method6032(local40[local53++] & 0xFFFF);
							local15++;
							local19.method6032(local40[local53++] & 0xFFFF);
							local15++;
							local19.method6032(local40[local53++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass46_Sub3_3.aShortArrayArray22[local34];
				local45 = this.anIntArray491[local34];
				if (local45 != 0 && local40 != null) {
					local51 = 0;
					local53 = 0;
					while (local40.length > local53) {
						if ((local45 & 0x1 << local51++) == 0) {
							local53 += 3;
						} else {
							local15++;
							local19.method6021(local40[local53++] & 0xFFFF);
							local19.method6021(local40[local53++] & 0xFFFF);
							local15++;
							local15++;
							local19.method6021(local40[local53++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local15 <= 0) {
			return;
		}
		this.aClass135_Sub1_2.method3357(local19.anInt7556, local19.aByteArray97);
		this.aClass90_Sub1_31.method2066(this.aClass46_Sub3_3.aClass166_12, this.aClass46_Sub3_3.aClass166_13, this.aClass166_9, this.aClass46_Sub3_3.aClass166_11);
		this.aClass90_Sub1_31.method2070(this.anInt6951, (this.aClass46_Sub3_3.anInt6997 & 0x7) != 0, (this.aClass46_Sub3_3.anInt6997 & 0x8) != 0);
		if (this.aClass90_Sub1_31.aBoolean164) {
			this.aClass90_Sub1_31.LA(Integer.MAX_VALUE, this.anInt6949, this.anInt6942, this.anInt6943);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat160, 1.0F / this.aFloat160, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass90_Sub1_31.method2066(this.aClass46_Sub3_3.aClass166_12, this.aClass46_Sub3_3.aClass166_13, this.aClass166_9, this.aClass46_Sub3_3.aClass166_11);
		this.aClass90_Sub1_31.method2144(local15, this.aClass135_Sub1_2, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)V")
	public void method5567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray491[arg0 * this.aClass46_Sub3_3.anInt9997 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)V")
	public void method5568(@OriginalArg(0) int arg0) {
		this.aStream6.b(arg0 * 4 + 3);
		this.aStream6.c(-1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V")
	public void method5569(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass90_Sub1_31.aNativeHeap2.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)V")
	public void method5570(@OriginalArg(0) int arg0) {
		this.aStream6.b();
		@Pc(25) Interface14 local25 = this.aClass90_Sub1_31.method2116(arg0 * 4, 4, this.aNativeHeapBuffer6);
		this.aClass166_9 = new Class166(local25, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IFIII)V")
	public void method5571(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(41) int local41;
		if (this.anInt6951 != -1) {
			@Pc(18) Class115 local18 = this.aClass90_Sub1_31.anInterface2_15.method3085(this.anInt6951);
			local23 = local18.aByte40 & 0xFF;
			@Pc(67) int local67;
			if (local23 != 0 && local18.aByte34 != 4) {
				if (arg3 < 0) {
					local41 = 0;
				} else if (arg3 <= 127) {
					local41 = arg3 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local23 == 256) {
					arg2 = local41;
				} else {
					local67 = 256 - local23;
					arg2 = (local67 * (arg2 & 0xFF00FF) + (local41 & 0xFF00FF) * local23 & 0xFF00FF00) + ((arg2 & 0xFF00) * local67 + local23 * (local41 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local41 = local18.aByte38 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(113) int local113 = (arg2 >> 16 & 0xFF) * local41;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local67 = (arg2 >> 8 & 0xFF) * local41;
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(141) int local141 = (arg2 & 0xFF) * local41;
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg2 = (local141 >> 8) + (local67 & 0xFF00) + (local113 << 8 & 0xFF003F);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(172) int local172 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local41 = arg2 & 0xFF;
			local172 = (int) ((float) local172 * arg1);
			local23 = (int) ((float) local23 * arg1);
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local41 = (int) ((float) local41 * arg1);
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg2 = local172 << 16 | local23 << 8 | local41;
		}
		this.aStream6.b(arg0 * 4);
		this.aStream6.c((byte) (arg2 >> 16));
		this.aStream6.c((byte) (arg2 >> 8));
		this.aStream6.c((byte) arg2);
	}
}
