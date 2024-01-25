import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "Lclient!im;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "Lclient!mu;")
	private final Class40_Sub2 aClass40_Sub2_1;

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
	public final int anInt390;

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_2;

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "[I")
	private final int[] anIntArray31;

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "I")
	public final int anInt392;

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "I")
	public final int anInt391;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
	public final int anInt384;

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "F")
	public final float aFloat6;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "Lclient!vp;")
	private final Class215_Sub2 aClass215_Sub2_1;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!mu;IIIII)V")
	public Class5_Sub3(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass40_Sub2_1 = arg0;
		this.anInt390 = arg5;
		this.aClass126_Sub3_2 = this.aClass40_Sub2_1.aClass126_Sub3_21;
		this.anIntArray31 = new int[this.aClass40_Sub2_1.anInt9923 * this.aClass40_Sub2_1.anInt9920];
		this.anInt392 = arg1;
		this.anInt391 = arg3;
		this.anInt384 = arg4;
		this.aFloat6 = (float) arg2;
		this.aClass215_Sub2_1 = new Class215_Sub2(this.aClass126_Sub3_2, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIIZ)V")
	public void method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray31[arg0 * this.aClass40_Sub2_1.anInt9920 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II[I)V")
	public void method431(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5_Sub12_Sub1 local11 = this.aClass126_Sub3_2.aClass5_Sub12_Sub1_2;
		local11.anInt10154 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(47) int local47;
		@Pc(49) int local49;
		if (this.aClass126_Sub3_2.aBoolean674) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass40_Sub2_1.aShortArrayArray10[local30];
				local41 = this.anIntArray31[local30];
				if (local41 != 0 && local36 != null) {
					local47 = 0;
					local49 = 0;
					while (local36.length > local49) {
						if ((local41 & 0x1 << local47++) == 0) {
							local49 += 3;
						} else {
							local11.method8655(local36[local49++] & 0xFFFF);
							local7++;
							local11.method8655(local36[local49++] & 0xFFFF);
							local7++;
							local11.method8655(local36[local49++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local41 = this.anIntArray31[local30];
				local36 = this.aClass40_Sub2_1.aShortArrayArray10[local30];
				if (local41 != 0 && local36 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local36.length) {
						if ((local41 & 0x1 << local47++) == 0) {
							local49 += 3;
						} else {
							local11.method8643(local36[local49++] & 0xFFFF);
							local7++;
							local7++;
							local11.method8643(local36[local49++] & 0xFFFF);
							local11.method8643(local36[local49++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass215_Sub2_1.method8502(local11.anInt10154, local11.aByteArray104);
		this.aClass126_Sub3_2.method7067(this.aClass40_Sub2_1.aClass159_6, this.aClass40_Sub2_1.aClass159_8, this.aClass40_Sub2_1.aClass159_5, this.aClass159_1);
		this.aClass126_Sub3_2.method7117((this.aClass40_Sub2_1.anInt6423 & 0x8) != 0, this.anInt392, (this.aClass40_Sub2_1.anInt6423 & 0x7) != 0);
		if (this.aClass126_Sub3_2.aBoolean682) {
			this.aClass126_Sub3_2.EA(Integer.MAX_VALUE, this.anInt391, this.anInt384, this.anInt390);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat6, 1.0F / this.aFloat6, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass126_Sub3_2.method7067(this.aClass40_Sub2_1.aClass159_6, this.aClass40_Sub2_1.aClass159_8, this.aClass40_Sub2_1.aClass159_5, this.aClass159_1);
		this.aClass126_Sub3_2.method7121(this.aClass215_Sub2_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BI)V")
	public void method433(@OriginalArg(1) int arg0) {
		this.aStream1.a();
		@Pc(25) Interface7 local25 = this.aClass126_Sub3_2.method7129(4, this.aNativeHeapBuffer1, arg0 * 4);
		this.aClass159_1 = new Class159(local25, 5121, 4, 0);
		this.aStream1 = null;
		this.aNativeHeapBuffer1 = null;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)V")
	public void method434(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass126_Sub3_2.aNativeHeap5.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIIFI)V")
	public void method436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(44) int local44;
		if (this.anInt392 != -1) {
			@Pc(17) Class321 local17 = this.aClass126_Sub3_2.anInterface8_10.method7813(this.anInt392);
			local22 = local17.aByte117 & 0xFF;
			@Pc(62) int local62;
			if (local22 != 0 && local17.aByte115 != 4) {
				if (arg1 < 0) {
					local44 = 0;
				} else if (arg1 <= 127) {
					local44 = arg1 * 131586;
				} else {
					local44 = 16777215;
				}
				if (local22 == 256) {
					arg3 = local44;
				} else {
					local62 = 256 - local22;
					arg3 = (local22 * (local44 & 0xFF00) + (arg3 & 0xFF00) * local62 & 0xFF0000) + (local22 * (local44 & 0xFF00FF) + (local62 * (arg3 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local44 = local17.aByte116 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(114) int local114 = (arg3 >> 16 & 0xFF) * local44;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local62 = (arg3 >> 8 & 0xFF) * local44;
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(140) int local140 = local44 * (arg3 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local62 & 0xFF00) + (local114 << 8 & 0xFF00F4) + (local140 >> 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(177) int local177 = arg3 >> 16 & 0xFF;
			local22 = arg3 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg2);
			local44 = arg3 & 0xFF;
			local22 = (int) ((float) local22 * arg2);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local44 = (int) ((float) local44 * arg2);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg3 = local44 | local177 << 16 | local22 << 8;
		}
		this.aStream1.e(arg0 * 4);
		this.aStream1.f((byte) (arg3 >> 16));
		this.aStream1.f((byte) (arg3 >> 8));
		this.aStream1.f((byte) arg3);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)V")
	public void method438(@OriginalArg(0) int arg0) {
		this.aStream1.e(arg0 * 4 + 3);
		this.aStream1.f(-1);
	}
}
