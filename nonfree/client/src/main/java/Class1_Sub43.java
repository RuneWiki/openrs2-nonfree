import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!or", name = "t", descriptor = "Lclient!ro;")
	private Class258 aClass258_12;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!or", name = "F", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "Lclient!ae;")
	private final Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_32;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	public final int anInt6476;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "F")
	public final float aFloat139;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "I")
	public final int anInt6478;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public final int anInt6469;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	public final int anInt6473;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "[I")
	private final int[] anIntArray632;

	@OriginalMember(owner = "client!or", name = "B", descriptor = "Lclient!wm;")
	private final Class138_Sub2 aClass138_Sub2_2;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!ae;IIIII)V")
	public Class1_Sub43(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass7_Sub1_3 = arg0;
		this.aClass4_Sub3_32 = this.aClass7_Sub1_3.aClass4_Sub3_1;
		this.anInt6476 = arg3;
		this.aFloat139 = arg2;
		this.anInt6478 = arg4;
		this.anInt6469 = arg5;
		this.anInt6473 = arg1;
		this.anIntArray632 = new int[this.aClass7_Sub1_3.anInt9575 * this.aClass7_Sub1_3.anInt9577];
		this.aClass138_Sub2_2 = new Class138_Sub2(this.aClass4_Sub3_32, 5123, null, 1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B[II)V")
	public void method5830(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub17_Sub1 local11 = this.aClass4_Sub3_32.aClass1_Sub17_Sub1_2;
		local11.anInt4872 = 0;
		@Pc(44) short[] local44;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(27) int local27;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass4_Sub3_32.aBoolean421) {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local44 = this.aClass7_Sub1_3.aShortArrayArray1[local33];
				local38 = this.anIntArray632[local33];
				if (local38 != 0 && local44 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local44.length) {
						if ((0x1 << local53++ & local38) == 0) {
							local55 += 3;
						} else {
							local11.method4473(local44[local55++] & 0xFFFF);
							local7++;
							local11.method4473(local44[local55++] & 0xFFFF);
							local7++;
							local7++;
							local11.method4473(local44[local55++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local38 = this.anIntArray632[local33];
				local44 = this.aClass7_Sub1_3.aShortArrayArray1[local33];
				if (local38 != 0 && local44 != null) {
					local53 = 0;
					local55 = 0;
					while (local44.length > local55) {
						if ((local38 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local7++;
							local11.method4455(local44[local55++] & 0xFFFF);
							local7++;
							local11.method4455(local44[local55++] & 0xFFFF);
							local7++;
							local11.method4455(local44[local55++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass138_Sub2_2.method8129(local11.anInt4872, local11.aByteArray58);
		this.aClass4_Sub3_32.method5298(this.aClass7_Sub1_3.aClass258_1, this.aClass258_12, this.aClass7_Sub1_3.aClass258_4, this.aClass7_Sub1_3.aClass258_2);
		this.aClass4_Sub3_32.method5234(this.anInt6473, (this.aClass7_Sub1_3.anInt183 & 0x7) != 0, (this.aClass7_Sub1_3.anInt183 & 0x8) != 0);
		if (this.aClass4_Sub3_32.aBoolean435) {
			this.aClass4_Sub3_32.JA(Integer.MAX_VALUE, this.anInt6476, this.anInt6478, this.anInt6469);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat139, 1.0F / this.aFloat139, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass4_Sub3_32.method5298(this.aClass7_Sub1_3.aClass258_1, this.aClass258_12, this.aClass7_Sub1_3.aClass258_4, this.aClass7_Sub1_3.aClass258_2);
		this.aClass4_Sub3_32.method5287(local7, this.aClass138_Sub2_2, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)V")
	public void method5834(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass4_Sub3_32.aNativeHeap4.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V")
	public void method5835(@OriginalArg(1) int arg0) {
		this.aStream5.b(arg0 * 4 + 3);
		this.aStream5.a(-1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZI)V")
	public void method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray632[arg0 + this.aClass7_Sub1_3.anInt9577 * arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(FIIII)V")
	public void method5837(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20;
		@Pc(41) int local41;
		if (this.anInt6473 != -1) {
			@Pc(15) Class296 local15 = this.aClass4_Sub3_32.anInterface13_13.method5789(this.anInt6473);
			local20 = local15.aByte103 & 0xFF;
			@Pc(60) int local60;
			if (local20 != 0 && local15.aByte104 != 4) {
				if (arg3 < 0) {
					local41 = 0;
				} else if (arg3 <= 127) {
					local41 = arg3 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local20 == 256) {
					arg2 = local41;
				} else {
					local60 = 256 - local20;
					arg2 = (local60 * (arg2 & 0xFF00FF) + local20 * (local41 & 0xFF00FF) & 0xFF00FF00) + (local60 * (arg2 & 0xFF00) + (local41 & 0xFF00) * local20 & 0xFF0000) >> 8;
				}
			}
			local41 = local15.aByte99 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(113) int local113 = (arg2 >> 16 & 0xFF) * local41;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local60 = local41 * (arg2 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(139) int local139 = (arg2 & 0xFF) * local41;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg2 = (local60 & 0xFF00) + ((local113 & 0xAE00FF00) << 8) + (local139 >> 8);
			}
		}
		this.aStream5.b(arg1 * 4);
		if (arg0 != 1.0F) {
			@Pc(185) int local185 = arg2 >> 16 & 0xFF;
			local20 = arg2 >> 8 & 0xFF;
			local41 = arg2 & 0xFF;
			local185 = (int) ((float) local185 * arg0);
			local20 = (int) ((float) local20 * arg0);
			if (local185 < 0) {
				local185 = 0;
			} else if (local185 > 255) {
				local185 = 255;
			}
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			local41 = (int) ((float) local41 * arg0);
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg2 = local185 << 16 | local20 << 8 | local41;
		}
		this.aStream5.a((byte) (arg2 >> 16));
		this.aStream5.a((byte) (arg2 >> 8));
		this.aStream5.a((byte) arg2);
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(II)V")
	public void method5838(@OriginalArg(0) int arg0) {
		this.aStream5.b();
		@Pc(25) Interface15 local25 = this.aClass4_Sub3_32.method5253(arg0 * 4, this.aNativeHeapBuffer5, 4);
		this.aClass258_12 = new Class258(local25, 5121, 4, 0);
		this.aStream5 = null;
		this.aNativeHeapBuffer5 = null;
	}
}
