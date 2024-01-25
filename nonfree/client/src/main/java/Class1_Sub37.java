import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Lclient!lq;")
	private Class213 aClass213_4;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!vfa;")
	private final Class47_Sub3 aClass47_Sub3_2;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
	public final int anInt5927;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_25;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "F")
	public final float aFloat135;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "[I")
	private final int[] anIntArray489;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
	public final int anInt5931;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
	public final int anInt5934;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	public final int anInt5929;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "Lclient!jca;")
	private final Class167_Sub1 aClass167_Sub1_1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!vfa;IIIII)V")
	public Class1_Sub37(@OriginalArg(0) Class47_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass47_Sub3_2 = arg0;
		this.anInt5927 = arg3;
		this.aClass134_Sub2_25 = this.aClass47_Sub3_2.aClass134_Sub2_42;
		this.aFloat135 = arg2;
		this.anIntArray489 = new int[this.aClass47_Sub3_2.anInt9210 * this.aClass47_Sub3_2.anInt9209];
		this.anInt5931 = arg4;
		this.anInt5934 = arg1;
		this.anInt5929 = arg5;
		this.aClass167_Sub1_1 = new Class167_Sub1(this.aClass134_Sub2_25, 5123, null, 1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)V")
	public void method4854(@OriginalArg(1) int arg0) {
		this.aStream5.b(arg0 * 4 + 3);
		this.aStream5.f(-1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([III)V")
	public void method4856(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		@Pc(16) Class1_Sub35_Sub1 local16 = this.aClass134_Sub2_25.aClass1_Sub35_Sub1_2;
		local16.anInt7214 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(25) int local25;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass134_Sub2_25.aBoolean517) {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local37 = this.aClass47_Sub3_2.aShortArrayArray13[local31];
				local42 = this.anIntArray489[local31];
				if (local42 != 0 && local37 != null) {
					local48 = 0;
					local50 = 0;
					while (local37.length > local50) {
						if ((local42 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local12++;
							local16.method5776(local37[local50++] & 0xFFFF);
							local12++;
							local16.method5776(local37[local50++] & 0xFFFF);
							local12++;
							local16.method5776(local37[local50++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local37 = this.aClass47_Sub3_2.aShortArrayArray13[local31];
				local42 = this.anIntArray489[local31];
				if (local42 != 0 && local37 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local37.length) {
						if ((local42 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local12++;
							local16.method5767(local37[local50++] & 0xFFFF);
							local12++;
							local16.method5767(local37[local50++] & 0xFFFF);
							local12++;
							local16.method5767(local37[local50++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local12 <= 0) {
			return;
		}
		this.aClass167_Sub1_1.method5061(local16.anInt7214, local16.aByteArray85);
		this.aClass134_Sub2_25.method5259(this.aClass47_Sub3_2.aClass213_15, this.aClass47_Sub3_2.aClass213_16, this.aClass213_4, this.aClass47_Sub3_2.aClass213_14);
		this.aClass134_Sub2_25.method5267((this.aClass47_Sub3_2.anInt9214 & 0x8) != 0, this.anInt5934, (this.aClass47_Sub3_2.anInt9214 & 0x7) != 0);
		if (this.aClass134_Sub2_25.aBoolean509) {
			this.aClass134_Sub2_25.YA(Integer.MAX_VALUE, this.anInt5927, this.anInt5931, this.anInt5929);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat135, 1.0F / this.aFloat135, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass134_Sub2_25.method5259(this.aClass47_Sub3_2.aClass213_15, this.aClass47_Sub3_2.aClass213_16, this.aClass213_4, this.aClass47_Sub3_2.aClass213_14);
		this.aClass134_Sub2_25.method5219(0, this.aClass167_Sub1_1, local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(BI)V")
	public void method4857(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass134_Sub2_25.aNativeHeap5.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
	public void method4860(@OriginalArg(0) int arg0) {
		this.aStream5.a();
		@Pc(18) Interface5 local18 = this.aClass134_Sub2_25.method5230(this.aNativeHeapBuffer5, arg0 * 4, 4);
		this.aClass213_4 = new Class213(local18, 5121, 4, 0);
		this.aStream5 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZFII)V")
	public void method4861(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(43) int local43;
		if (this.anInt5934 != -1) {
			@Pc(18) Class3 local18 = this.aClass134_Sub2_25.anInterface7_10.method3874(this.anInt5934);
			local23 = local18.aByte2 & 0xFF;
			@Pc(69) int local69;
			if (local23 != 0 && local18.aByte7 != 4) {
				if (arg3 < 0) {
					local43 = 0;
				} else if (arg3 > 127) {
					local43 = 16777215;
				} else {
					local43 = arg3 * 131586;
				}
				if (local23 == 256) {
					arg2 = local43;
				} else {
					local69 = 256 - local23;
					arg2 = ((local43 & 0xFF00) * local23 + (arg2 & 0xFF00) * local69 & 0xFF0000) + (local23 * (local43 & 0xFF00FF) + (arg2 & 0xFF00FF) * local69 & 0xFF00FF00) >> 8;
				}
			}
			local43 = local18.aByte5 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(119) int local119 = (arg2 >> 16 & 0xFF) * local43;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local69 = local43 * (arg2 >> 8 & 0xFF);
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(145) int local145 = (arg2 & 0xFF) * local43;
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg2 = (local119 << 8 & 0xFF00A2) + (local69 & 0xFF00) + (local145 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(185) int local185 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local43 = arg2 & 0xFF;
			local185 = (int) ((float) local185 * arg1);
			local23 = (int) ((float) local23 * arg1);
			if (local185 < 0) {
				local185 = 0;
			} else if (local185 > 255) {
				local185 = 255;
			}
			local43 = (int) ((float) local43 * arg1);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg2 = local43 | local185 << 16 | local23 << 8;
		}
		this.aStream5.b(arg0 * 4);
		this.aStream5.f((byte) (arg2 >> 16));
		this.aStream5.f((byte) (arg2 >> 8));
		this.aStream5.f((byte) arg2);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V")
	public void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray489[arg0 * this.aClass47_Sub3_2.anInt9209 + arg2] |= 0x1 << arg1;
	}
}
