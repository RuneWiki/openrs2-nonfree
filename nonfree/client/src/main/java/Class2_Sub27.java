import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "Lclient!eca;")
	private Class82 aClass82_9;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "Lclient!dn;")
	private final Class76_Sub1 aClass76_Sub1_3;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "F")
	public final float aFloat94;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
	public final int anInt5136;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
	public final int anInt5137;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
	public final int anInt5149;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
	public final int anInt5138;

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_27;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
	private final int[] anIntArray355;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "Lclient!iia;")
	private final Class153_Sub1 aClass153_Sub1_1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!dn;IIIII)V")
	public Class2_Sub27(@OriginalArg(0) Class76_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass76_Sub1_3 = arg0;
		this.aFloat94 = arg2;
		this.anInt5136 = arg1;
		this.anInt5137 = arg3;
		this.anInt5149 = arg5;
		this.anInt5138 = arg4;
		this.aClass95_Sub1_27 = this.aClass76_Sub1_3.aClass95_Sub1_7;
		this.anIntArray355 = new int[this.aClass76_Sub1_3.anInt8794 * this.aClass76_Sub1_3.anInt8791];
		this.aClass153_Sub1_1 = new Class153_Sub1(this.aClass95_Sub1_27, 5123, null, 1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public void method4328(@OriginalArg(1) int arg0) {
		this.aStream3.c();
		@Pc(22) Interface12 local22 = this.aClass95_Sub1_27.method2042(this.aNativeHeapBuffer3, arg0 * 4, 4);
		this.aClass82_9 = new Class82(local22, 5121, 4, 0);
		this.aStream3 = null;
		this.aNativeHeapBuffer3 = null;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
	public void method4329(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass95_Sub1_27.aNativeHeap1.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer3);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIFI)V")
	public void method4330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(43) int local43;
		if (this.anInt5136 != -1) {
			@Pc(18) Class175 local18 = this.aClass95_Sub1_27.anInterface6_27.method1492(this.anInt5136);
			local23 = local18.aByte51 & 0xFF;
			@Pc(67) int local67;
			if (local23 != 0 && local18.aByte52 != 4) {
				if (arg1 < 0) {
					local43 = 0;
				} else if (arg1 <= 127) {
					local43 = arg1 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local23 == 256) {
					arg0 = local43;
				} else {
					local67 = 256 - local23;
					arg0 = ((local43 & 0xFF00FF) * local23 + local67 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * local67 + local23 * (local43 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local43 = local18.aByte57 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(114) int local114 = (arg0 >> 16 & 0xFF) * local43;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local67 = (arg0 >> 8 & 0xFF) * local43;
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(140) int local140 = local43 * (arg0 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg0 = (local67 & 0xFF00) + ((local114 << 8 & 0xFF00FE) + (local140 >> 8));
			}
		}
		this.aStream3.f(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(182) int local182 = arg0 >> 16 & 0xFF;
			local23 = arg0 >> 8 & 0xFF;
			local182 = (int) ((float) local182 * arg2);
			local43 = arg0 & 0xFF;
			local23 = (int) ((float) local23 * arg2);
			if (local182 < 0) {
				local182 = 0;
			} else if (local182 > 255) {
				local182 = 255;
			}
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local43 = (int) ((float) local43 * arg2);
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg0 = local182 << 16 | local23 << 8 | local43;
		}
		this.aStream3.a((byte) (arg0 >> 16));
		this.aStream3.a((byte) (arg0 >> 8));
		this.aStream3.a((byte) arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([III)V")
	public void method4333(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = 0;
		@Pc(15) Class2_Sub22_Sub1 local15 = this.aClass95_Sub1_27.aClass2_Sub22_Sub1_1;
		local15.anInt10247 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(47) int local47;
		@Pc(49) int local49;
		if (this.aClass95_Sub1_27.aBoolean174) {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local36 = this.aClass76_Sub1_3.aShortArrayArray13[local30];
				local41 = this.anIntArray355[local30];
				if (local41 != 0 && local36 != null) {
					local47 = 0;
					local49 = 0;
					while (local36.length > local49) {
						if ((0x1 << local47++ & local41) == 0) {
							local49 += 3;
						} else {
							local11++;
							local15.method8500(local36[local49++] & 0xFFFF);
							local11++;
							local15.method8500(local36[local49++] & 0xFFFF);
							local15.method8500(local36[local49++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local41 = this.anIntArray355[local30];
				local36 = this.aClass76_Sub1_3.aShortArrayArray13[local30];
				if (local41 != 0 && local36 != null) {
					local47 = 0;
					local49 = 0;
					while (local36.length > local49) {
						if ((0x1 << local47++ & local41) == 0) {
							local49 += 3;
						} else {
							local11++;
							local15.method8492(local36[local49++] & 0xFFFF);
							local15.method8492(local36[local49++] & 0xFFFF);
							local11++;
							local15.method8492(local36[local49++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass153_Sub1_1.method5675(local15.aByteArray115, local15.anInt10247);
		this.aClass95_Sub1_27.method2086(this.aClass82_9, this.aClass76_Sub1_3.aClass82_2, this.aClass76_Sub1_3.aClass82_1, this.aClass76_Sub1_3.aClass82_3);
		this.aClass95_Sub1_27.method2100(this.anInt5136, (this.aClass76_Sub1_3.anInt1963 & 0x8) != 0, (this.aClass76_Sub1_3.anInt1963 & 0x7) != 0);
		if (this.aClass95_Sub1_27.aBoolean195) {
			this.aClass95_Sub1_27.EA(Integer.MAX_VALUE, this.anInt5137, this.anInt5138, this.anInt5149);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat94, 1.0F / this.aFloat94, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass95_Sub1_27.method2086(this.aClass82_9, this.aClass76_Sub1_3.aClass82_2, this.aClass76_Sub1_3.aClass82_1, this.aClass76_Sub1_3.aClass82_3);
		this.aClass95_Sub1_27.method2118(local11, 0, this.aClass153_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V")
	public void method4335(@OriginalArg(1) int arg0) {
		this.aStream3.f(arg0 * 4 + 3);
		this.aStream3.a(-1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIB)V")
	public void method4336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray355[arg2 + arg1 * this.aClass76_Sub1_3.anInt8791] |= 0x1 << arg0;
	}
}
