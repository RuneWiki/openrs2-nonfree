import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Lclient!bf;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Lclient!wl;")
	private final Class264 aClass264_2;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "Lclient!jq;")
	private final Class42_Sub2 aClass42_Sub2_1;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!gk;Lclient!wl;)V")
	public Class51_Sub3(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_2 = arg1;
		this.method3194();
		this.aClass42_Sub2_1 = new Class42_Sub2(super.aClass75_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass42_Sub2_1.method3244();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_39.method2479(260, 8448);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		if (super.aClass75_Sub2_39.anInt3117 > 0) {
			@Pc(24) float local24 = -0.5F / (float) super.aClass75_Sub2_39.anInt3117;
			super.aClass75_Sub2_39.method2426(1);
			Static131.aFloatArray21[0] = 0.0F;
			Static131.aFloatArray21[2] = local24;
			Static131.aFloatArray21[3] = super.aClass75_Sub2_39.aFloat48 * local24 + 0.25F;
			Static131.aFloatArray21[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static131.aFloatArray21, 0);
			OpenGL.glPopMatrix();
			super.aClass75_Sub2_39.method2419((float) super.aClass75_Sub2_39.anInt3117, 0.5F);
			super.aClass75_Sub2_39.method2456(this.aClass42_Sub2_1);
			super.aClass75_Sub2_39.method2426(0);
		}
		this.aClass18_3.method720('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		this.aClass18_3.method720('\u0001');
		if (super.aClass75_Sub2_39.anInt3117 > 0) {
			super.aClass75_Sub2_39.method2426(1);
			super.aClass75_Sub2_39.method2456(null);
			super.aClass75_Sub2_39.method2419(0.0F, 1.0F);
			super.aClass75_Sub2_39.method2426(0);
		}
		super.aClass75_Sub2_39.method2479(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V")
	private void method3194() {
		this.aClass18_3 = new Class18(super.aClass75_Sub2_39, 2);
		this.aClass18_3.method718(0);
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2479(7681, 260);
		super.aClass75_Sub2_39.method2466(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass75_Sub2_39.method2426(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass264_2.aBoolean519) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass18_3.method723();
		this.aClass18_3.method718(1);
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2479(8448, 8448);
		super.aClass75_Sub2_39.method2466(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass75_Sub2_39.method2426(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass264_2.aBoolean519) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass18_3.method723();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass264_2.aBoolean519) {
				super.aClass75_Sub2_39.method2456(this.aClass264_2.aClass42_Sub4_3);
				Static131.aFloatArray21[1] = 0.0F;
				Static131.aFloatArray21[0] = 0.0F;
				Static131.aFloatArray21[2] = 0.0F;
				Static131.aFloatArray21[3] = (float) (super.aClass75_Sub2_39.anInt3079 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static131.aFloatArray21, 0);
			} else {
				@Pc(109) int local109 = super.aClass75_Sub2_39.anInt3079 % 4000 * 16 / 4000;
				super.aClass75_Sub2_39.method2456(this.aClass264_2.aClass42_Sub1Array3[local109]);
			}
		} else if (this.aClass264_2.aBoolean519) {
			super.aClass75_Sub2_39.method2456(this.aClass264_2.aClass42_Sub4_3);
			Static131.aFloatArray21[2] = 0.0F;
			Static131.aFloatArray21[3] = 0.0F;
			Static131.aFloatArray21[1] = 0.0F;
			Static131.aFloatArray21[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static131.aFloatArray21, 0);
		} else {
			super.aClass75_Sub2_39.method2456(this.aClass264_2.aClass42_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
	}
}
