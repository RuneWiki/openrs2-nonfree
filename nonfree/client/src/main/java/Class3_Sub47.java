import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "Lclient!ut;")
	private Class364 aClass364_14;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "Lclient!bja;")
	private final Class35_Sub1 aClass35_Sub1_1;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_38;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
	public final int anInt9133;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
	public final int anInt9125;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "[I")
	private final int[] anIntArray479;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "F")
	public final float aFloat179;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
	public final int anInt9138;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	public final int anInt9131;

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "Lclient!ts;")
	private final Class167_Sub2 aClass167_Sub2_2;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!bja;IIIII)V")
	public Class3_Sub47(@OriginalArg(0) Class35_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass35_Sub1_1 = arg0;
		this.aClass95_Sub3_38 = this.aClass35_Sub1_1.aClass95_Sub3_6;
		this.anInt9133 = arg5;
		this.anInt9125 = arg1;
		this.anIntArray479 = new int[this.aClass35_Sub1_1.anInt9149 * this.aClass35_Sub1_1.anInt9148];
		this.aFloat179 = (float) arg2;
		this.anInt9138 = arg4;
		this.anInt9131 = arg3;
		this.aClass167_Sub2_2 = new Class167_Sub2(this.aClass95_Sub3_38, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public void method7436(@OriginalArg(1) int arg0) {
		this.aStream4.a();
		@Pc(25) Interface21 local25 = this.aClass95_Sub3_38.method4888(arg0 * 4, this.aNativeHeapBuffer7, 4);
		this.aClass364_14 = new Class364(local25, 5121, 4, 0);
		this.aNativeHeapBuffer7 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
	public void method7437(@OriginalArg(0) int arg0) {
		this.aStream4.d(arg0 * 4 + 3);
		this.aStream4.c(-1);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V")
	public void method7438(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass95_Sub3_38.aNativeHeap2.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer7);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIB)V")
	public void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray479[this.aClass35_Sub1_1.anInt9149 * arg1 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
	public void method7443(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub4_Sub2 local11 = this.aClass95_Sub3_38.aClass3_Sub4_Sub2_1;
		local11.anInt9739 = 0;
		@Pc(39) short[] local39;
		@Pc(33) int local33;
		@Pc(44) int local44;
		@Pc(27) int local27;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass95_Sub3_38.aBoolean369) {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local44 = this.anIntArray479[local33];
				local39 = this.aClass35_Sub1_1.aShortArrayArray5[local33];
				if (local44 != 0 && local39 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local39.length) {
						if ((local44 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local7++;
							local11.method7956(local39[local55++] & 0xFFFF);
							local7++;
							local11.method7956(local39[local55++] & 0xFFFF);
							local7++;
							local11.method7956(local39[local55++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local39 = this.aClass35_Sub1_1.aShortArrayArray5[local33];
				local44 = this.anIntArray479[local33];
				if (local44 != 0 && local39 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local39.length) {
						if ((local44 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local11.method7942(local39[local55++] & 0xFFFF);
							local7++;
							local11.method7942(local39[local55++] & 0xFFFF);
							local7++;
							local7++;
							local11.method7942(local39[local55++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass167_Sub2_2.method7795(local11.anInt9739, local11.aByteArray90);
		this.aClass95_Sub3_38.method4903(this.aClass35_Sub1_1.aClass364_2, this.aClass35_Sub1_1.aClass364_4, this.aClass364_14, this.aClass35_Sub1_1.aClass364_1);
		this.aClass95_Sub3_38.method4877(this.anInt9125, (this.aClass35_Sub1_1.anInt1070 & 0x8) != 0, (this.aClass35_Sub1_1.anInt1070 & 0x7) != 0);
		if (this.aClass95_Sub3_38.aBoolean389) {
			this.aClass95_Sub3_38.EA(Integer.MAX_VALUE, this.anInt9131, this.anInt9138, this.anInt9133);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat179, 1.0F / this.aFloat179, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass95_Sub3_38.method4903(this.aClass35_Sub1_1.aClass364_2, this.aClass35_Sub1_1.aClass364_4, this.aClass364_14, this.aClass35_Sub1_1.aClass364_1);
		this.aClass95_Sub3_38.method4837(0, local7, this.aClass167_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZFIII)V")
	public void method7446(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(33) int local33;
		if (this.anInt9125 != -1) {
			@Pc(13) Class250 local13 = this.aClass95_Sub3_38.anInterface2_12.method8330(this.anInt9125);
			local18 = local13.aByte96 & 0xFF;
			@Pc(64) int local64;
			if (local18 != 0 && local13.aByte93 != 4) {
				if (arg3 < 0) {
					local33 = 0;
				} else if (arg3 > 127) {
					local33 = 16777215;
				} else {
					local33 = arg3 * 131586;
				}
				if (local18 == 256) {
					arg1 = local33;
				} else {
					local64 = 256 - local18;
					arg1 = ((local33 & 0xFF00FF) * local18 + local64 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (local64 * (arg1 & 0xFF00) + (local33 & 0xFF00) * local18 & 0xFF0000) >> 8;
				}
			}
			local33 = local13.aByte94 & 0xFF;
			if (local33 != 0) {
				local33 += 256;
				@Pc(113) int local113 = (arg1 >> 16 & 0xFF) * local33;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local64 = (arg1 >> 8 & 0xFF) * local33;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(139) int local139 = (arg1 & 0xFF) * local33;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg1 = ((local113 & 0xB800FF00) << 8) - (-(local64 & 0xFF00) - (local139 >> 8));
			}
		}
		if (arg0 != 1.0F) {
			@Pc(173) int local173 = arg1 >> 16 & 0xFF;
			local18 = arg1 >> 8 & 0xFF;
			local173 = (int) ((float) local173 * arg0);
			local33 = arg1 & 0xFF;
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 255) {
				local173 = 255;
			}
			local18 = (int) ((float) local18 * arg0);
			local33 = (int) ((float) local33 * arg0);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 255) {
				local33 = 255;
			}
			arg1 = local33 | local18 << 8 | local173 << 16;
		}
		this.aStream4.d(arg2 * 4);
		this.aStream4.c((byte) (arg1 >> 16));
		this.aStream4.c((byte) (arg1 >> 8));
		this.aStream4.c((byte) arg1);
	}
}
