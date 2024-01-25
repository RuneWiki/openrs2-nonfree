import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class3_Sub54 extends Class3 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "Lclient!pe;")
	private Class287 aClass287_8;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "Lclient!wba;")
	private final Class259_Sub3 aClass259_Sub3_3;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "F")
	public final float aFloat142;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	public final int anInt9393;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "[I")
	private final int[] anIntArray692;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public final int anInt9399;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_38;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "I")
	public final int anInt9392;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	public final int anInt9400;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!kh;")
	private final Class188_Sub2 aClass188_Sub2_2;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!wba;IIIII)V")
	public Class3_Sub54(@OriginalArg(0) Class259_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass259_Sub3_3 = arg0;
		this.aFloat142 = (float) arg2;
		this.anInt9393 = arg5;
		this.anIntArray692 = new int[this.aClass259_Sub3_3.anInt10949 * this.aClass259_Sub3_3.anInt10946];
		this.anInt9399 = arg1;
		this.aClass22_Sub1_38 = this.aClass259_Sub3_3.aClass22_Sub1_42;
		this.anInt9392 = arg4;
		this.anInt9400 = arg3;
		this.aClass188_Sub2_2 = new Class188_Sub2(this.aClass22_Sub1_38, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public void method7961(@OriginalArg(0) int arg0) {
		this.aStream5.b();
		@Pc(27) Interface13 local27 = this.aClass22_Sub1_38.method967(4, arg0 * 4, this.aNativeHeapBuffer6);
		this.aClass287_8 = new Class287(local27, 5121, 4, 0);
		this.aStream5 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	public void method7963(@OriginalArg(1) int arg0) {
		this.aStream5.b(arg0 * 4 + 3);
		this.aStream5.f(-1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIFI)V")
	public void method7964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21;
		@Pc(43) int local43;
		if (this.anInt9399 != -1) {
			@Pc(16) Class406 local16 = this.aClass22_Sub1_38.anInterface4_14.method5761(this.anInt9399);
			local21 = local16.aByte144 & 0xFF;
			@Pc(65) int local65;
			if (local21 != 0 && local16.aByte149 != 4) {
				if (arg1 < 0) {
					local43 = 0;
				} else if (arg1 > 127) {
					local43 = 16777215;
				} else {
					local43 = arg1 * 131586;
				}
				if (local21 == 256) {
					arg0 = local43;
				} else {
					local65 = 256 - local21;
					arg0 = ((local43 & 0xFF00) * local21 + local65 * (arg0 & 0xFF00) & 0xFF0000) + ((local43 & 0xFF00FF) * local21 + (arg0 & 0xFF00FF) * local65 & 0xFF00FF00) >> 8;
				}
			}
			local43 = local16.aByte146 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(118) int local118 = local43 * (arg0 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local65 = (arg0 >> 8 & 0xFF) * local43;
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(146) int local146 = (arg0 & 0xFF) * local43;
				if (local146 > 65535) {
					local146 = 65535;
				}
				arg0 = (local146 >> 8) + (local65 & 0xFF00) + (local118 << 8 & 0xFF00B8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(181) int local181 = arg0 >> 16 & 0xFF;
			local21 = arg0 >> 8 & 0xFF;
			local181 = (int) ((float) local181 * arg2);
			local43 = arg0 & 0xFF;
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local21 = (int) ((float) local21 * arg2);
			local43 = (int) ((float) local43 * arg2);
			if (local21 < 0) {
				local21 = 0;
			} else if (local21 > 255) {
				local21 = 255;
			}
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg0 = local43 | local21 << 8 | local181 << 16;
		}
		this.aStream5.b(arg3 * 4);
		this.aStream5.f((byte) (arg0 >> 16));
		this.aStream5.f((byte) (arg0 >> 8));
		this.aStream5.f((byte) arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB[I)V")
	public void method7965(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = 0;
		@Pc(16) Class3_Sub2_Sub2 local16 = this.aClass22_Sub1_38.aClass3_Sub2_Sub2_1;
		local16.anInt2178 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(25) int local25;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass22_Sub1_38.aBoolean60) {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local37 = this.aClass259_Sub3_3.aShortArrayArray6[local31];
				local42 = this.anIntArray692[local31];
				if (local42 != 0 && local37 != null) {
					local53 = 0;
					local55 = 0;
					while (local37.length > local55) {
						if ((0x1 << local53++ & local42) == 0) {
							local55 += 3;
						} else {
							local16.method2032(local37[local55++] & 0xFFFF);
							local12++;
							local16.method2032(local37[local55++] & 0xFFFF);
							local12++;
							local16.method2032(local37[local55++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local37 = this.aClass259_Sub3_3.aShortArrayArray6[local31];
				local42 = this.anIntArray692[local31];
				if (local42 != 0 && local37 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local37.length) {
						if ((0x1 << local53++ & local42) == 0) {
							local55 += 3;
						} else {
							local16.method2070(local37[local55++] & 0xFFFF);
							local12++;
							local16.method2070(local37[local55++] & 0xFFFF);
							local12++;
							local16.method2070(local37[local55++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		}
		if (local12 <= 0) {
			return;
		}
		this.aClass188_Sub2_2.method9070(local16.anInt2178, local16.aByteArray20);
		this.aClass22_Sub1_38.method919(this.aClass259_Sub3_3.aClass287_16, this.aClass259_Sub3_3.aClass287_13, this.aClass259_Sub3_3.aClass287_14, this.aClass287_8);
		this.aClass22_Sub1_38.method889((this.aClass259_Sub3_3.anInt10956 & 0x7) != 0, this.anInt9399, (this.aClass259_Sub3_3.anInt10956 & 0x8) != 0);
		if (this.aClass22_Sub1_38.aBoolean81) {
			this.aClass22_Sub1_38.EA(Integer.MAX_VALUE, this.anInt9400, this.anInt9392, this.anInt9393);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat142, 1.0F / this.aFloat142, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass22_Sub1_38.method919(this.aClass259_Sub3_3.aClass287_16, this.aClass259_Sub3_3.aClass287_13, this.aClass259_Sub3_3.aClass287_14, this.aClass287_8);
		this.aClass22_Sub1_38.method957(0, this.aClass188_Sub2_2, local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)V")
	public void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray692[arg2 + arg1 * this.aClass259_Sub3_3.anInt10949] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(II)V")
	public void method7967(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass22_Sub1_38.aNativeHeap1.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer6);
	}
}
