import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class38_Sub9 extends Class38 {

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!hq;")
	private Class102 aClass102_6;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "Lclient!hl;")
	private final Class100 aClass100_6;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!mi;")
	private final Class137_Sub3 aClass137_Sub3_1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!nq;Lclient!hl;)V")
	public Class38_Sub9(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class100 arg1) {
		super(arg0);
		this.aClass100_6 = arg1;
		this.method5711();
		this.aClass137_Sub3_1 = new Class137_Sub3(super.aClass167_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass137_Sub3_1.method3602();
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	private void method5711() {
		this.aClass102_6 = new Class102(super.aClass167_Sub1_42, 2);
		this.aClass102_6.method2513(0);
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method3983(7681, 260);
		super.aClass167_Sub1_42.method4012(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass167_Sub1_42.method3993(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass100_6.aBoolean215) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass102_6.method2510();
		this.aClass102_6.method2513(1);
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method3983(8448, 8448);
		super.aClass167_Sub1_42.method4012(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass167_Sub1_42.method3993(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass100_6.aBoolean215) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass102_6.method2510();
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		if (super.aClass167_Sub1_42.anInt4922 > 0) {
			@Pc(15) float local15 = -0.5F / (float) super.aClass167_Sub1_42.anInt4922;
			super.aClass167_Sub1_42.method3993(1);
			Static235.aFloatArray23[3] = local15 * super.aClass167_Sub1_42.aFloat72 + 0.25F;
			Static235.aFloatArray23[0] = 0.0F;
			Static235.aFloatArray23[1] = 0.0F;
			Static235.aFloatArray23[2] = local15;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static235.aFloatArray23, 0);
			OpenGL.glPopMatrix();
			super.aClass167_Sub1_42.method4034(0.5F, (float) super.aClass167_Sub1_42.anInt4922);
			super.aClass167_Sub1_42.method4028(this.aClass137_Sub3_1);
			super.aClass167_Sub1_42.method3993(0);
		}
		this.aClass102_6.method2512('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		this.aClass102_6.method2512('\u0001');
		if (super.aClass167_Sub1_42.anInt4922 > 0) {
			super.aClass167_Sub1_42.method3993(1);
			super.aClass167_Sub1_42.method4028(null);
			super.aClass167_Sub1_42.method4034(1.0F, 0.0F);
			super.aClass167_Sub1_42.method3993(0);
		}
		super.aClass167_Sub1_42.method3983(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
		super.aClass167_Sub1_42.method3983(260, 8448);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass100_6.aBoolean215) {
				super.aClass167_Sub1_42.method4028(this.aClass100_6.aClass137_Sub2_2);
				Static235.aFloatArray23[3] = (float) (super.aClass167_Sub1_42.anInt4890 % 4000) / 4000.0F;
				Static235.aFloatArray23[2] = 0.0F;
				Static235.aFloatArray23[0] = 0.0F;
				Static235.aFloatArray23[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static235.aFloatArray23, 0);
			} else {
				@Pc(57) int local57 = super.aClass167_Sub1_42.anInt4890 % 4000 * 16 / 4000;
				super.aClass167_Sub1_42.method4028(this.aClass100_6.aClass137_Sub1Array1[local57]);
			}
		} else if (this.aClass100_6.aBoolean215) {
			super.aClass167_Sub1_42.method4028(this.aClass100_6.aClass137_Sub2_2);
			Static235.aFloatArray23[3] = 0.0F;
			Static235.aFloatArray23[1] = 0.0F;
			Static235.aFloatArray23[0] = 0.0F;
			Static235.aFloatArray23[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static235.aFloatArray23, 0);
		} else {
			super.aClass167_Sub1_42.method4028(this.aClass100_6.aClass137_Sub1Array1[0]);
		}
	}
}
