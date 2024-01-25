import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Lclient!so;")
	private Class332 aClass332_5;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!qd;")
	private final Class96_Sub2 aClass96_Sub2_1;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
	public final int anInt5444;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_22;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public final int anInt5442;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "F")
	public final float aFloat103;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "[I")
	private final int[] anIntArray314;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public final int anInt5440;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	public final int anInt5439;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!cm;")
	private final Class59_Sub1 aClass59_Sub1_1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!qd;IIIII)V")
	public Class6_Sub28(@OriginalArg(0) Class96_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass96_Sub2_1 = arg0;
		this.anInt5444 = arg1;
		this.aClass75_Sub3_22 = this.aClass96_Sub2_1.aClass75_Sub3_33;
		this.anInt5442 = arg5;
		this.aFloat103 = (float) arg2;
		this.anIntArray314 = new int[this.aClass96_Sub2_1.anInt9255 * this.aClass96_Sub2_1.anInt9257];
		this.anInt5440 = arg4;
		this.anInt5439 = arg3;
		this.aClass59_Sub1_1 = new Class59_Sub1(this.aClass75_Sub3_22, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public void method4961(@OriginalArg(1) int arg0) {
		this.aStream3.d(arg0 * 4 + 3);
		this.aStream3.c(-1);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(IB)V")
	public void method4962(@OriginalArg(0) int arg0) {
		this.aStream3.a();
		@Pc(23) Interface2 local23 = this.aClass75_Sub3_22.method5773(arg0 * 4, 4, this.aNativeHeapBuffer6);
		this.aClass332_5 = new Class332(local23, 5121, 4, 0);
		this.aStream3 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
	public void method4964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray314[arg1 * this.aClass96_Sub2_1.anInt9255 + arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
	public void method4967(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass75_Sub3_22.aNativeHeap4.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IFIII)V")
	public void method4968(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(42) int local42;
		if (this.anInt5444 != -1) {
			@Pc(18) Class297 local18 = this.aClass75_Sub3_22.anInterface11_10.method6027(this.anInt5444);
			local23 = local18.aByte118 & 0xFF;
			@Pc(67) int local67;
			if (local23 != 0 && local18.aByte124 != 4) {
				if (arg3 < 0) {
					local42 = 0;
				} else if (arg3 <= 127) {
					local42 = arg3 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local23 == 256) {
					arg2 = local42;
				} else {
					local67 = 256 - local23;
					arg2 = (local67 * (arg2 & 0xFF00) + (local42 & 0xFF00) * local23 & 0xFF0000) + ((local42 & 0xFF00FF) * local23 + (arg2 & 0xFF00FF) * local67 & 0xFF00FF00) >> 8;
				}
			}
			local42 = local18.aByte123 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(117) int local117 = local42 * (arg2 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local67 = (arg2 >> 8 & 0xFF) * local42;
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(143) int local143 = local42 * (arg2 & 0xFF);
				if (local143 > 65535) {
					local143 = 65535;
				}
				arg2 = ((local117 & 0xC300FF00) << 8) + (local67 & 0xFF00) + (local143 >> 8);
			}
		}
		if (arg1 != (float) 1) {
			@Pc(174) int local174 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local42 = arg2 & 0xFF;
			local174 = (int) ((float) local174 * arg1);
			local23 = (int) ((float) local23 * arg1);
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local42 = (int) ((float) local42 * arg1);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			arg2 = local42 | local23 << 8 | local174 << 16;
		}
		this.aStream3.d(arg0 * 4);
		this.aStream3.c((byte) (arg2 >> 16));
		this.aStream3.c((byte) (arg2 >> 8));
		this.aStream3.c((byte) arg2);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II[I)V")
	public void method4969(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6_Sub15_Sub2 local11 = this.aClass75_Sub3_22.aClass6_Sub15_Sub2_2;
		local11.anInt3174 = 0;
		@Pc(45) short[] local45;
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(28) int local28;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass75_Sub3_22.aBoolean480) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local39 = this.anIntArray314[local34];
				local45 = this.aClass96_Sub2_1.aShortArrayArray12[local34];
				if (local39 != 0 && local45 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local45.length) {
						if ((0x1 << local53++ & local39) == 0) {
							local55 += 3;
						} else {
							local11.method3040(local45[local55++] & 0xFFFF);
							local7++;
							local11.method3040(local45[local55++] & 0xFFFF);
							local7++;
							local7++;
							local11.method3040(local45[local55++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local45 = this.aClass96_Sub2_1.aShortArrayArray12[local34];
				local39 = this.anIntArray314[local34];
				if (local39 != 0 && local45 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local45.length) {
						if ((local39 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local11.method3008(local45[local55++] & 0xFFFF);
							local7++;
							local11.method3008(local45[local55++] & 0xFFFF);
							local7++;
							local7++;
							local11.method3008(local45[local55++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass59_Sub1_1.method5017(local11.anInt3174, local11.aByteArray20);
		this.aClass75_Sub3_22.method5809(this.aClass332_5, this.aClass96_Sub2_1.aClass332_10, this.aClass96_Sub2_1.aClass332_12, this.aClass96_Sub2_1.aClass332_11);
		this.aClass75_Sub3_22.method5838((this.aClass96_Sub2_1.anInt8215 & 0x8) != 0, this.anInt5444, (this.aClass96_Sub2_1.anInt8215 & 0x7) != 0);
		if (this.aClass75_Sub3_22.aBoolean487) {
			this.aClass75_Sub3_22.EA(Integer.MAX_VALUE, this.anInt5439, this.anInt5440, this.anInt5442);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat103, 1.0F / this.aFloat103, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass75_Sub3_22.method5809(this.aClass332_5, this.aClass96_Sub2_1.aClass332_10, this.aClass96_Sub2_1.aClass332_12, this.aClass96_Sub2_1.aClass332_11);
		this.aClass75_Sub3_22.method5803(0, local7, this.aClass59_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
