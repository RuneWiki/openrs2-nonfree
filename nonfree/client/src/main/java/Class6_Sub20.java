import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "Lclient!cl;")
	private Class55 aClass55_5;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "Lclient!mh;")
	private final Class199_Sub2 aClass199_Sub2_1;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
	private final int[] anIntArray221;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
	public final int anInt3664;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_21;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public final int anInt3667;

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	public final int anInt3660;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	public final int anInt3663;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "Lclient!ck;")
	private final Class54_Sub1 aClass54_Sub1_1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!mh;IIIII)V")
	public Class6_Sub20(@OriginalArg(0) Class199_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass199_Sub2_1 = arg0;
		this.anIntArray221 = new int[this.aClass199_Sub2_1.anInt10110 * this.aClass199_Sub2_1.anInt10111];
		this.anInt3664 = arg4;
		this.aClass100_Sub3_21 = this.aClass199_Sub2_1.aClass100_Sub3_33;
		this.anInt3667 = arg5;
		this.aFloat67 = (float) arg2;
		this.anInt3660 = arg3;
		this.anInt3663 = arg1;
		this.aClass54_Sub1_1 = new Class54_Sub1(this.aClass100_Sub3_21, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[II)V")
	public void method3249(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(11) int local11 = 0;
		@Pc(15) Class6_Sub40_Sub1 local15 = this.aClass100_Sub3_21.aClass6_Sub40_Sub1_3;
		local15.anInt10169 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass100_Sub3_21.aBoolean700) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local35 = this.anIntArray221[local30];
				local41 = this.aClass199_Sub2_1.aShortArrayArray9[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local41.length > local52) {
						if ((local35 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local15.method8561(local41[local52++] & 0xFFFF);
							local11++;
							local15.method8561(local41[local52++] & 0xFFFF);
							local11++;
							local15.method8561(local41[local52++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local41 = this.aClass199_Sub2_1.aShortArrayArray9[local30];
				local35 = this.anIntArray221[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local41.length > local52) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local15.method8617(local41[local52++] & 0xFFFF);
							local11++;
							local15.method8617(local41[local52++] & 0xFFFF);
							local11++;
							local11++;
							local15.method8617(local41[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass54_Sub1_1.method1317(local15.anInt10169, local15.aByteArray113);
		this.aClass100_Sub3_21.method8885(this.aClass199_Sub2_1.aClass55_11, this.aClass55_5, this.aClass199_Sub2_1.aClass55_14, this.aClass199_Sub2_1.aClass55_13);
		this.aClass100_Sub3_21.method8869(this.anInt3663, (this.aClass199_Sub2_1.anInt6500 & 0x8) != 0, (this.aClass199_Sub2_1.anInt6500 & 0x7) != 0);
		if (this.aClass100_Sub3_21.aBoolean704) {
			this.aClass100_Sub3_21.EA(Integer.MAX_VALUE, this.anInt3660, this.anInt3664, this.anInt3667);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat67, 1.0F / this.aFloat67, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass100_Sub3_21.method8885(this.aClass199_Sub2_1.aClass55_11, this.aClass55_5, this.aClass199_Sub2_1.aClass55_14, this.aClass199_Sub2_1.aClass55_13);
		this.aClass100_Sub3_21.method8901(this.aClass54_Sub1_1, 0, local11);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
	public void method3250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray221[arg0 * this.aClass199_Sub2_1.anInt10111 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIFII)V")
	public void method3251(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (this.anInt3663 != -1) {
			@Pc(13) Class325 local13 = this.aClass100_Sub3_21.anInterface4_12.method895(this.anInt3663);
			local18 = local13.aByte113 & 0xFF;
			@Pc(65) int local65;
			if (local18 != 0 && local13.aByte115 != 4) {
				if (arg0 < 0) {
					local36 = 0;
				} else if (arg0 <= 127) {
					local36 = arg0 * 131586;
				} else {
					local36 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local36;
				} else {
					local65 = 256 - local18;
					arg3 = (local65 * (arg3 & 0xFF00FF) + (local36 & 0xFF00FF) * local18 & 0xFF00FF00) + (local18 * (local36 & 0xFF00) + (local65 * (arg3 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local36 = local13.aByte117 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(112) int local112 = (arg3 >> 16 & 0xFF) * local36;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local65 = local36 * (arg3 >> 8 & 0xFF);
				if (local65 > 65535) {
					local65 = 65535;
				}
				@Pc(140) int local140 = (arg3 & 0xFF) * local36;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local112 << 8 & 0xFF008C) + ((local65 & 0xFF00) + (local140 >> 8));
			}
		}
		if (arg1 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local176 = (int) ((float) local176 * arg1);
			local36 = arg3 & 0xFF;
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local18 = (int) ((float) local18 * arg1);
			local36 = (int) ((float) local36 * arg1);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg3 = local176 << 16 | local18 << 8 | local36;
		}
		this.aStream3.b(arg2 * 4);
		this.aStream3.f((byte) (arg3 >> 16));
		this.aStream3.f((byte) (arg3 >> 8));
		this.aStream3.f((byte) arg3);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
	public void method3252(@OriginalArg(1) int arg0) {
		this.aStream3.c();
		@Pc(18) Interface27 local18 = this.aClass100_Sub3_21.method8887(arg0 * 4, this.aNativeHeapBuffer5, 4);
		this.aClass55_5 = new Class55(local18, 5121, 4, 0);
		this.aNativeHeapBuffer5 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method3253(@OriginalArg(0) int arg0) {
		this.aStream3.b(arg0 * 4 + 3);
		this.aStream3.f(-1);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)V")
	public void method3257(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass100_Sub3_21.aNativeHeap6.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer5);
	}
}
