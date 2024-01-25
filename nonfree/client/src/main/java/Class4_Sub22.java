import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Lclient!it;")
	private Class124 aClass124_7;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "Lclient!lh;")
	private final Class146_Sub1 aClass146_Sub1_1;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "F")
	public final float aFloat99;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_22;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "I")
	public final int anInt3229;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "I")
	public final int anInt3232;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "[I")
	private final int[] anIntArray270;

	@OriginalMember(owner = "client!io", name = "C", descriptor = "I")
	public final int anInt3236;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "I")
	public final int anInt3230;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "Lclient!mv;")
	private final Class45_Sub2 aClass45_Sub2_2;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!lh;IIIII)V")
	public Class4_Sub22(@OriginalArg(0) Class146_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass146_Sub1_1 = arg0;
		this.aFloat99 = arg2;
		this.aClass30_Sub1_22 = this.aClass146_Sub1_1.aClass30_Sub1_25;
		this.anInt3229 = arg5;
		this.anInt3232 = arg1;
		this.anIntArray270 = new int[this.aClass146_Sub1_1.anInt4732 * this.aClass146_Sub1_1.anInt4730];
		this.anInt3236 = arg3;
		this.anInt3230 = arg4;
		this.aClass45_Sub2_2 = new Class45_Sub2(this.aClass30_Sub1_22, 5123, null, 1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V")
	public void method2541(@OriginalArg(0) int arg0) {
		this.aNativeBuffer3 = this.aClass30_Sub1_22.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method2542(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I[IB)V")
	public void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class4_Sub30 local9 = Static311.aClass4_Sub30_8;
		local9.anInt6244 = 0;
		@Pc(39) short[] local39;
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(22) int local22;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (this.aClass30_Sub1_22.aBoolean76) {
			for (local22 = 0; local22 < arg0; local22++) {
				local28 = arg1[local22];
				local33 = this.anIntArray270[local28];
				local39 = this.aClass146_Sub1_1.aShortArrayArray6[local28];
				if (local33 != 0 && local39 != null) {
					local45 = 0;
					local47 = 0;
					while (local39.length > local47) {
						if ((local33 & 0x1 << local45++) == 0) {
							local47 += 3;
						} else {
							local9.method4846(local39[local47++] & 0xFFFF);
							local7++;
							local7++;
							local9.method4846(local39[local47++] & 0xFFFF);
							local7++;
							local9.method4846(local39[local47++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local22 = 0; local22 < arg0; local22++) {
				local28 = arg1[local22];
				local33 = this.anIntArray270[local28];
				local39 = this.aClass146_Sub1_1.aShortArrayArray6[local28];
				if (local33 != 0 && local39 != null) {
					local45 = 0;
					local47 = 0;
					while (local39.length > local47) {
						if ((local33 & 0x1 << local45++) == 0) {
							local47 += 3;
						} else {
							local7++;
							local9.method4874(local39[local47++] & 0xFFFF);
							local7++;
							local9.method4874(local39[local47++] & 0xFFFF);
							local7++;
							local9.method4874(local39[local47++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass45_Sub2_2.method4734(local9.anInt6244, local9.aByteArray79);
		this.aClass30_Sub1_22.method919(this.aClass146_Sub1_1.aClass124_8, this.aClass146_Sub1_1.aClass124_11, this.aClass146_Sub1_1.aClass124_10, this.aClass124_7);
		this.aClass30_Sub1_22.method915((this.aClass146_Sub1_1.anInt4165 & 0x8) != 0, this.anInt3232, (this.aClass146_Sub1_1.anInt4165 & 0x7) != 0);
		if (this.aClass30_Sub1_22.aBoolean58) {
			this.aClass30_Sub1_22.ba(Integer.MAX_VALUE, this.anInt3236, this.anInt3230, this.anInt3229);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat99, 1.0F / this.aFloat99, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass30_Sub1_22.method919(this.aClass146_Sub1_1.aClass124_8, this.aClass146_Sub1_1.aClass124_11, this.aClass146_Sub1_1.aClass124_10, this.aClass124_7);
		this.aClass30_Sub1_22.method958(0, local7, this.aClass45_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	public void method2545(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b();
		@Pc(18) Interface6 local18 = this.aClass30_Sub1_22.method902(4, arg0 * 4, this.aNativeBuffer3);
		this.aClass124_7 = new Class124(local18, 5121, 4, 0);
		this.aNativeBuffer3 = null;
		this.aNativeStream1 = null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V")
	public void method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray270[arg0 + arg2 * this.aClass146_Sub1_1.anInt4730] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IFIIB)V")
	public void method2547(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(31) int local31;
		if (this.anInt3232 != -1) {
			@Pc(13) Class118 local13 = this.aClass30_Sub1_22.anInterface10_7.method4241(this.anInt3232);
			local18 = local13.aByte53 & 0xFF;
			@Pc(59) int local59;
			if (local18 != 0 && local13.aByte56 != 4) {
				if (arg0 < 0) {
					local31 = 0;
				} else if (arg0 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg0 * 131586;
				}
				if (local18 == 256) {
					arg2 = local31;
				} else {
					local59 = 256 - local18;
					arg2 = ((arg2 & 0xFF00) * local59 + local18 * (local31 & 0xFF00) & 0xFF0000) + ((arg2 & 0xFF00FF) * local59 + local18 * (local31 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local31 = local13.aByte54 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(108) int local108 = local31 * (arg2 >> 16 & 0xFF);
				if (local108 > 65535) {
					local108 = 65535;
				}
				local59 = (arg2 >> 8 & 0xFF) * local31;
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(136) int local136 = (arg2 & 0xFF) * local31;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg2 = (local136 >> 8) + (((local108 & 0xE000FF00) << 8) + (local59 & 0xFF00));
			}
		}
		this.aNativeStream1.a(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(178) int local178 = arg2 >> 16 & 0xFF;
			local18 = arg2 >> 8 & 0xFF;
			local178 = (int) ((float) local178 * arg1);
			local31 = arg2 & 0xFF;
			local18 = (int) ((float) local18 * arg1);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local31 = (int) ((float) local31 * arg1);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg2 = local18 << 8 | local178 << 16 | local31;
		}
		this.aNativeStream1.b((byte) (arg2 >> 16));
		this.aNativeStream1.b((byte) (arg2 >> 8));
		this.aNativeStream1.b((byte) arg2);
	}
}
