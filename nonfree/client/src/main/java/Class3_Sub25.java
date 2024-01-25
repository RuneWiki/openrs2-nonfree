import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!kd;")
	private Class127 aClass127_6;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "Lclient!si;")
	private final Class159_Sub2 aClass159_Sub2_2;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "F")
	public final float aFloat29;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public final int anInt3862;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
	public final int anInt3866;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "[I")
	private final int[] anIntArray243;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public final int anInt3859;

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
	public final int anInt3869;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_20;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Lclient!tp;")
	private final Class121_Sub2 aClass121_Sub2_2;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!si;IIIII)V")
	public Class3_Sub25(@OriginalArg(0) Class159_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass159_Sub2_2 = arg0;
		this.aFloat29 = arg2;
		this.anInt3862 = arg5;
		this.anInt3866 = arg3;
		this.anIntArray243 = new int[this.aClass159_Sub2_2.anInt6189 * this.aClass159_Sub2_2.anInt6192];
		this.anInt3859 = arg1;
		this.anInt3869 = arg4;
		this.aClass172_Sub2_20 = this.aClass159_Sub2_2.aClass172_Sub2_34;
		this.aClass121_Sub2_2 = new Class121_Sub2(this.aClass172_Sub2_20, 5123, null, 1);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FIBII)V")
	public void method3086(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(40) int local40;
		if (this.anInt3859 != -1) {
			@Pc(13) Class76 local13 = this.aClass172_Sub2_20.anInterface5_8.method3918(this.anInt3859);
			local18 = local13.aByte45 & 0xFF;
			@Pc(59) int local59;
			if (local18 != 0 && local13.aByte46 != 4) {
				if (arg1 < 0) {
					local40 = 0;
				} else if (arg1 <= 127) {
					local40 = arg1 * 131586;
				} else {
					local40 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local40;
				} else {
					local59 = 256 - local18;
					arg3 = ((arg3 & 0xFF00FF) * local59 + (local40 & 0xFF00FF) * local18 & 0xFF00FF00) + ((local40 & 0xFF00) * local18 + local59 * (arg3 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local40 = local13.aByte44 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(113) int local113 = (arg3 >> 16 & 0xFF) * local40;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local59 = (arg3 >> 8 & 0xFF) * local40;
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(141) int local141 = local40 * (arg3 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg3 = (local141 >> 8) + (local113 << 8 & 0xFF00CA) + (local59 & 0xFF00);
			}
		}
		this.aNativeStream1.b(arg2 * 4);
		if (arg0 != 1.0F) {
			@Pc(184) int local184 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local40 = arg3 & 0xFF;
			local184 = (int) ((float) local184 * arg0);
			local18 = (int) ((float) local18 * arg0);
			if (local184 < 0) {
				local184 = 0;
			} else if (local184 > 255) {
				local184 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local40 = (int) ((float) local40 * arg0);
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg3 = local40 | local18 << 8 | local184 << 16;
		}
		this.aNativeStream1.a((byte) (arg3 >> 16));
		this.aNativeStream1.a((byte) (arg3 >> 8));
		this.aNativeStream1.a((byte) arg3);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
	public void method3087(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b();
		@Pc(18) Interface6 local18 = this.aClass172_Sub2_20.method5597(arg0 * 4, this.aNativeBuffer3, 4);
		this.aClass127_6 = new Class127(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer3 = null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "([III)V")
	public void method3089(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = 0;
		@Pc(16) Class3_Sub7 local16 = Static273.aClass3_Sub7_2;
		local16.anInt3235 = 0;
		@Pc(42) short[] local42;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(25) int local25;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass172_Sub2_20.aBoolean621) {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local36 = this.anIntArray243[local31];
				local42 = this.aClass159_Sub2_2.aShortArrayArray5[local31];
				if (local36 != 0 && local42 != null) {
					local51 = 0;
					local53 = 0;
					while (local42.length > local53) {
						if ((0x1 << local51++ & local36) == 0) {
							local53 += 3;
						} else {
							local14++;
							local16.method2613(local42[local53++] & 0xFFFF);
							local14++;
							local16.method2613(local42[local53++] & 0xFFFF);
							local16.method2613(local42[local53++] & 0xFFFF);
							local14++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local42 = this.aClass159_Sub2_2.aShortArrayArray5[local31];
				local36 = this.anIntArray243[local31];
				if (local36 != 0 && local42 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local42.length) {
						if ((0x1 << local51++ & local36) == 0) {
							local53 += 3;
						} else {
							local14++;
							local16.method2585(local42[local53++] & 0xFFFF);
							local14++;
							local16.method2585(local42[local53++] & 0xFFFF);
							local16.method2585(local42[local53++] & 0xFFFF);
							local14++;
						}
					}
				}
			}
		}
		if (local14 <= 0) {
			return;
		}
		this.aClass121_Sub2_2.method5070(local16.aByteArray46, local16.anInt3235);
		this.aClass172_Sub2_20.method5622(this.aClass127_6, this.aClass159_Sub2_2.aClass127_7, this.aClass159_Sub2_2.aClass127_8, this.aClass159_Sub2_2.aClass127_9);
		this.aClass172_Sub2_20.method5578(this.anInt3859, (this.aClass159_Sub2_2.anInt6205 & 0x7) != 0, (this.aClass159_Sub2_2.anInt6205 & 0x8) != 0);
		if (this.aClass172_Sub2_20.aBoolean615) {
			this.aClass172_Sub2_20.ba(Integer.MAX_VALUE, this.anInt3866, this.anInt3869, this.anInt3862);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat29, 1.0F / this.aFloat29, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass172_Sub2_20.method5622(this.aClass127_6, this.aClass159_Sub2_2.aClass127_7, this.aClass159_Sub2_2.aClass127_8, this.aClass159_Sub2_2.aClass127_9);
		this.aClass172_Sub2_20.method5628(local14, this.aClass121_Sub2_2, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IB)V")
	public void method3091(@OriginalArg(0) int arg0) {
		this.aNativeBuffer3 = this.aClass172_Sub2_20.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public void method3092(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIB)V")
	public void method3093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray243[arg0 + arg1 * this.aClass159_Sub2_2.anInt6189] |= 0x1 << arg2;
	}
}
