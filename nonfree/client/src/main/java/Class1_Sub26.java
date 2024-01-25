import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Lclient!mq;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Lclient!hca;")
	private final Class129_Sub1 aClass129_Sub1_1;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public final int anInt3201;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
	public final int anInt3210;

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "F")
	public final float aFloat90;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
	public final int anInt3206;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_14;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	public final int anInt3199;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	private final int[] anIntArray146;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Lclient!er;")
	private final Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!hca;IIIII)V")
	public Class1_Sub26(@OriginalArg(0) Class129_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass129_Sub1_1 = arg0;
		this.anInt3201 = arg1;
		this.anInt3210 = arg5;
		this.aFloat90 = arg2;
		this.anInt3206 = arg3;
		this.aClass78_Sub3_14 = this.aClass129_Sub1_1.aClass78_Sub3_16;
		this.anInt3199 = arg4;
		this.anIntArray146 = new int[this.aClass129_Sub1_1.anInt8065 * this.aClass129_Sub1_1.anInt8058];
		this.aClass86_Sub1_1 = new Class86_Sub1(this.aClass78_Sub3_14, 5123, null, 1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	public void method2737(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass78_Sub3_14.aNativeHeap4.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIFII)V")
	public void method2738(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		if (this.anInt3201 != -1) {
			@Pc(18) Class17 local18 = this.aClass78_Sub3_14.anInterface9_13.method947(this.anInt3201);
			local23 = local18.aByte21 & 0xFF;
			@Pc(58) int local58;
			if (local23 != 0 && local18.aByte22 != 4) {
				if (arg0 < 0) {
					local33 = 0;
				} else if (arg0 <= 127) {
					local33 = arg0 * 131586;
				} else {
					local33 = 16777215;
				}
				if (local23 == 256) {
					arg3 = local33;
				} else {
					local58 = 256 - local23;
					arg3 = ((local33 & 0xFF00) * local23 + (arg3 & 0xFF00) * local58 & 0xFF0000) + ((local33 & 0xFF00FF) * local23 + ((arg3 & 0xFF00FF) * local58) & 0xFF00FF00) >> 8;
				}
			}
			local33 = local18.aByte17 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(112) int local112 = local33 * (arg3 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local58 = local33 * (arg3 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(140) int local140 = (arg3 & 0xFF) * local33;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local58 & 0xFF00) + (local112 << 8 & 0xFF0032) + (local140 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(171) int local171 = arg3 >> 16 & 0xFF;
			local23 = arg3 >> 8 & 0xFF;
			local33 = arg3 & 0xFF;
			local171 = (int) ((float) local171 * arg1);
			local23 = (int) ((float) local23 * arg1);
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local33 = (int) ((float) local33 * arg1);
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg3 = local23 << 8 | local171 << 16 | local33;
		}
		this.aStream4.d(arg2 * 4);
		this.aStream4.e((byte) (arg3 >> 16));
		this.aStream4.e((byte) (arg3 >> 8));
		this.aStream4.e((byte) arg3);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
	public void method2739(@OriginalArg(1) int arg0) {
		this.aStream4.d(arg0 * 4 + 3);
		this.aStream4.e(-1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[II)V")
	public void method2742(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) Class1_Sub3_Sub2 local16 = this.aClass78_Sub3_14.aClass1_Sub3_Sub2_1;
		local16.anInt9802 = 0;
		@Pc(42) short[] local42;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(25) int local25;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass78_Sub3_14.aBoolean425) {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local36 = this.anIntArray146[local31];
				local42 = this.aClass129_Sub1_1.aShortArrayArray2[local31];
				if (local36 != 0 && local42 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local42.length) {
						if ((0x1 << local51++ & local36) == 0) {
							local53 += 3;
						} else {
							local7++;
							local16.method7937(local42[local53++] & 0xFFFF);
							local7++;
							local16.method7937(local42[local53++] & 0xFFFF);
							local16.method7937(local42[local53++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local36 = this.anIntArray146[local31];
				local42 = this.aClass129_Sub1_1.aShortArrayArray2[local31];
				if (local36 != 0 && local42 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local42.length) {
						if ((local36 & 0x1 << local51++) == 0) {
							local53 += 3;
						} else {
							local16.method7948(local42[local53++] & 0xFFFF);
							local7++;
							local16.method7948(local42[local53++] & 0xFFFF);
							local7++;
							local7++;
							local16.method7948(local42[local53++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass86_Sub1_1.method4195(local16.anInt9802, local16.aByteArray104);
		this.aClass78_Sub3_14.method4537(this.aClass129_Sub1_1.aClass226_3, this.aClass129_Sub1_1.aClass226_2, this.aClass129_Sub1_1.aClass226_5, this.aClass226_1);
		this.aClass78_Sub3_14.method4525((this.aClass129_Sub1_1.anInt3662 & 0x8) != 0, (this.aClass129_Sub1_1.anInt3662 & 0x7) != 0, this.anInt3201);
		if (this.aClass78_Sub3_14.aBoolean416) {
			this.aClass78_Sub3_14.YA(Integer.MAX_VALUE, this.anInt3206, this.anInt3199, this.anInt3210);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat90, 1.0F / this.aFloat90, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass78_Sub3_14.method4537(this.aClass129_Sub1_1.aClass226_3, this.aClass129_Sub1_1.aClass226_2, this.aClass129_Sub1_1.aClass226_5, this.aClass226_1);
		this.aClass78_Sub3_14.method4564(local7, 0, this.aClass86_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V")
	public void method2743(@OriginalArg(1) int arg0) {
		this.aStream4.a();
		@Pc(18) Interface8 local18 = this.aClass78_Sub3_14.method4568(4, arg0 * 4, this.aNativeHeapBuffer6);
		this.aClass226_1 = new Class226(local18, 5121, 4, 0);
		this.aStream4 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIII)V")
	public void method2745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray146[arg0 + arg2 * this.aClass129_Sub1_1.anInt8065] |= 0x1 << arg1;
	}
}
