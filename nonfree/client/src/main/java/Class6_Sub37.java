import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "Lclient!ls;")
	private Class214 aClass214_5;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!lw", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "Lclient!bda;")
	private final Class12_Sub2 aClass12_Sub2_2;

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
	public final int anInt6114;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
	public final int anInt6122;

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
	public final int anInt6120;

	@OriginalMember(owner = "client!lw", name = "A", descriptor = "F")
	public final float aFloat70;

	@OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
	public final int anInt6123;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_31;

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "[I")
	private final int[] anIntArray360;

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "Lclient!vba;")
	private final Class165_Sub2 aClass165_Sub2_2;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!bda;IIIII)V")
	public Class6_Sub37(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass12_Sub2_2 = arg0;
		this.anInt6114 = arg3;
		this.anInt6122 = arg5;
		this.anInt6120 = arg1;
		this.aFloat70 = (float) arg2;
		this.anInt6123 = arg4;
		this.aClass132_Sub3_31 = this.aClass12_Sub2_2.aClass132_Sub3_4;
		this.anIntArray360 = new int[this.aClass12_Sub2_2.anInt9313 * this.aClass12_Sub2_2.anInt9314];
		this.aClass165_Sub2_2 = new Class165_Sub2(this.aClass132_Sub3_31, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
	public void method5165(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass132_Sub3_31.aNativeHeap4.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
	public void method5167(@OriginalArg(1) int arg0) {
		this.aStream4.c();
		@Pc(18) Interface26 local18 = this.aClass132_Sub3_31.method6775(this.aNativeHeapBuffer4, 4, arg0 * 4);
		this.aClass214_5 = new Class214(local18, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
	public void method5168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray360[arg0 * this.aClass12_Sub2_2.anInt9314 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[IB)V")
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(17) int local17 = 0;
		@Pc(21) Class6_Sub23_Sub2 local21 = this.aClass132_Sub3_31.aClass6_Sub23_Sub2_2;
		local21.anInt9901 = 0;
		@Pc(42) short[] local42;
		@Pc(36) int local36;
		@Pc(47) int local47;
		@Pc(30) int local30;
		@Pc(56) int local56;
		@Pc(58) int local58;
		if (this.aClass132_Sub3_31.aBoolean544) {
			for (local30 = 0; local30 < arg0; local30++) {
				local36 = arg1[local30];
				local47 = this.anIntArray360[local36];
				local42 = this.aClass12_Sub2_2.aShortArrayArray2[local36];
				if (local47 != 0 && local42 != null) {
					local56 = 0;
					local58 = 0;
					while (local58 < local42.length) {
						if ((local47 & 0x1 << local56++) == 0) {
							local58 += 3;
						} else {
							local21.method8347(local42[local58++] & 0xFFFF);
							local17++;
							local21.method8347(local42[local58++] & 0xFFFF);
							local17++;
							local17++;
							local21.method8347(local42[local58++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local30 = 0; local30 < arg0; local30++) {
				local36 = arg1[local30];
				local42 = this.aClass12_Sub2_2.aShortArrayArray2[local36];
				local47 = this.anIntArray360[local36];
				if (local47 != 0 && local42 != null) {
					local56 = 0;
					local58 = 0;
					while (local58 < local42.length) {
						if ((local47 & 0x1 << local56++) == 0) {
							local58 += 3;
						} else {
							local17++;
							local21.method8335(local42[local58++] & 0xFFFF);
							local17++;
							local21.method8335(local42[local58++] & 0xFFFF);
							local21.method8335(local42[local58++] & 0xFFFF);
							local17++;
						}
					}
				}
			}
		}
		if (local17 <= 0) {
			return;
		}
		this.aClass165_Sub2_2.method8575(local21.anInt9901, local21.aByteArray101);
		this.aClass132_Sub3_31.method6788(this.aClass12_Sub2_2.aClass214_2, this.aClass12_Sub2_2.aClass214_3, this.aClass214_5, this.aClass12_Sub2_2.aClass214_1);
		this.aClass132_Sub3_31.method6792(this.anInt6120, (this.aClass12_Sub2_2.anInt868 & 0x8) != 0, (this.aClass12_Sub2_2.anInt868 & 0x7) != 0);
		if (this.aClass132_Sub3_31.aBoolean546) {
			this.aClass132_Sub3_31.EA(Integer.MAX_VALUE, this.anInt6114, this.anInt6123, this.anInt6122);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat70, 1.0F / this.aFloat70, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass132_Sub3_31.method6788(this.aClass12_Sub2_2.aClass214_2, this.aClass12_Sub2_2.aClass214_3, this.aClass214_5, this.aClass12_Sub2_2.aClass214_1);
		this.aClass132_Sub3_31.method6751(local17, this.aClass165_Sub2_2, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIF)V")
	public void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(33) int local33;
		if (this.anInt6120 != -1) {
			@Pc(13) Class294 local13 = this.aClass132_Sub3_31.anInterface6_11.method7088(this.anInt6120);
			local18 = local13.aByte118 & 0xFF;
			@Pc(58) int local58;
			if (local18 != 0 && local13.aByte120 != 4) {
				if (arg1 < 0) {
					local33 = 0;
				} else if (arg1 > 127) {
					local33 = 16777215;
				} else {
					local33 = arg1 * 131586;
				}
				if (local18 == 256) {
					arg2 = local33;
				} else {
					local58 = 256 - local18;
					arg2 = ((arg2 & 0xFF00FF) * local58 + local18 * (local33 & 0xFF00FF) & 0xFF00FF00) + ((local33 & 0xFF00) * local18 + (local58 * (arg2 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local33 = local13.aByte116 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(108) int local108 = local33 * (arg2 >> 16 & 0xFF);
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = (arg2 >> 8 & 0xFF) * local33;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(136) int local136 = (arg2 & 0xFF) * local33;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg2 = (local136 >> 8) + (local58 & 0xFF00) + (local108 << 8 & 0xFF00F9);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(171) int local171 = arg2 >> 16 & 0xFF;
			local18 = arg2 >> 8 & 0xFF;
			local33 = arg2 & 0xFF;
			local171 = (int) ((float) local171 * arg3);
			local18 = (int) ((float) local18 * arg3);
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local33 = (int) ((float) local33 * arg3);
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg2 = local33 | local171 << 16 | local18 << 8;
		}
		this.aStream4.a(arg0 * 4);
		this.aStream4.d((byte) (arg2 >> 16));
		this.aStream4.d((byte) (arg2 >> 8));
		this.aStream4.d((byte) arg2);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)V")
	public void method5172(@OriginalArg(0) int arg0) {
		this.aStream4.a(arg0 * 4 + 3);
		this.aStream4.d(-1);
	}
}
