import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer2;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Lclient!wt;")
	private Class267 aClass267_4;

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "Lclient!pp;")
	private final Class70_Sub2 aClass70_Sub2_2;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
	public final int anInt3848;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "F")
	public final float aFloat66;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
	public final int anInt3844;

	@OriginalMember(owner = "client!kr", name = "H", descriptor = "I")
	public final int anInt3851;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	private final int[] anIntArray300;

	@OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
	public final int anInt3850;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_16;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!vq;")
	private final Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!pp;IIIII)V")
	public Class1_Sub26(@OriginalArg(0) Class70_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass70_Sub2_2 = arg0;
		this.anInt3848 = arg1;
		this.aFloat66 = arg2;
		this.anInt3844 = arg5;
		this.anInt3851 = arg3;
		this.anIntArray300 = new int[this.aClass70_Sub2_2.anInt5251 * this.aClass70_Sub2_2.anInt5250];
		this.anInt3850 = arg4;
		this.aClass121_Sub2_16 = this.aClass70_Sub2_2.aClass121_Sub2_29;
		this.aClass28_Sub2_1 = new Class28_Sub2(this.aClass121_Sub2_16, 5123, null, 1);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)V")
	public void method3231(@OriginalArg(1) int arg0) {
		this.aNativeBuffer2 = this.aClass121_Sub2_16.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer2);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)V")
	public void method3233(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IFIII)V")
	public void method3234(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(37) int local37;
		if (this.anInt3848 != -1) {
			@Pc(14) Class132 local14 = this.aClass121_Sub2_16.anInterface5_16.method3920(this.anInt3848);
			local19 = local14.aByte42 & 0xFF;
			@Pc(61) int local61;
			if (local19 != 0 && local14.aByte40 != 4) {
				if (arg2 < 0) {
					local37 = 0;
				} else if (arg2 <= 127) {
					local37 = arg2 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local19 == 256) {
					arg3 = local37;
				} else {
					local61 = 256 - local19;
					arg3 = ((arg3 & 0xFF00FF) * local61 + (local37 & 0xFF00FF) * local19 & 0xFF00FF00) + ((local37 & 0xFF00) * local19 + (arg3 & 0xFF00) * local61 & 0xFF0000) >> 8;
				}
			}
			local37 = local14.aByte38 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(110) int local110 = local37 * (arg3 >> 16 & 0xFF);
				if (local110 > 65535) {
					local110 = 65535;
				}
				local61 = local37 * (arg3 >> 8 & 0xFF);
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(136) int local136 = local37 * (arg3 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg3 = (local110 << 8 & 0xFF00FA) + (local61 & 0xFF00) + (local136 >> 8);
			}
		}
		this.aNativeStream1.a(arg0 * 4);
		if (arg1 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local37 = arg3 & 0xFF;
			local176 = (int) ((float) local176 * arg1);
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local19 = (int) ((float) local19 * arg1);
			local37 = (int) ((float) local37 * arg1);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg3 = local37 | local176 << 16 | local19 << 8;
		}
		this.aNativeStream1.b((byte) (arg3 >> 16));
		this.aNativeStream1.b((byte) (arg3 >> 8));
		this.aNativeStream1.b((byte) arg3);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public void method3235(@OriginalArg(1) int arg0) {
		this.aNativeStream1.c();
		@Pc(18) Interface12 local18 = this.aClass121_Sub2_16.method4662(this.aNativeBuffer2, 4, arg0 * 4);
		this.aClass267_4 = new Class267(local18, 5121, 4, 0);
		this.aNativeBuffer2 = null;
		this.aNativeStream1 = null;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIZ)V")
	public void method3237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray300[arg0 + arg2 * this.aClass70_Sub2_2.anInt5251] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[I)V")
	public void method3238(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(11) int local11 = 0;
		@Pc(13) Class1_Sub14 local13 = Static53.aClass1_Sub14_1;
		local13.anInt5695 = 0;
		@Pc(39) short[] local39;
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(22) int local22;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass121_Sub2_16.aBoolean471) {
			for (local22 = 0; local22 < arg0; local22++) {
				local28 = arg1[local22];
				local33 = this.anIntArray300[local28];
				local39 = this.aClass70_Sub2_2.aShortArrayArray6[local28];
				if (local33 != 0 && local39 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local39.length) {
						if ((local33 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local13.method4504(local39[local50++] & 0xFFFF);
							local11++;
							local11++;
							local13.method4504(local39[local50++] & 0xFFFF);
							local13.method4504(local39[local50++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		} else {
			for (local22 = 0; local22 < arg0; local22++) {
				local28 = arg1[local22];
				local39 = this.aClass70_Sub2_2.aShortArrayArray6[local28];
				local33 = this.anIntArray300[local28];
				if (local33 != 0 && local39 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local39.length) {
						if ((0x1 << local48++ & local33) == 0) {
							local50 += 3;
						} else {
							local13.method4493(local39[local50++] & 0xFFFF);
							local11++;
							local11++;
							local13.method4493(local39[local50++] & 0xFFFF);
							local13.method4493(local39[local50++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass28_Sub2_1.method5945(local13.aByteArray65, local13.anInt5695);
		this.aClass121_Sub2_16.method4724(this.aClass70_Sub2_2.aClass267_12, this.aClass70_Sub2_2.aClass267_11, this.aClass70_Sub2_2.aClass267_10, this.aClass267_4);
		this.aClass121_Sub2_16.method4676(this.anInt3848, (this.aClass70_Sub2_2.anInt5268 & 0x8) != 0, (this.aClass70_Sub2_2.anInt5268 & 0x7) != 0);
		if (this.aClass121_Sub2_16.aBoolean458) {
			this.aClass121_Sub2_16.ba(Integer.MAX_VALUE, this.anInt3851, this.anInt3850, this.anInt3844);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat66, 1.0F / this.aFloat66, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass121_Sub2_16.method4724(this.aClass70_Sub2_2.aClass267_12, this.aClass70_Sub2_2.aClass267_11, this.aClass70_Sub2_2.aClass267_10, this.aClass267_4);
		this.aClass121_Sub2_16.method4725(local11, this.aClass28_Sub2_1, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
