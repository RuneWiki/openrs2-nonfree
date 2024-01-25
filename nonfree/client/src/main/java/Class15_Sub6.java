import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class15_Sub6 extends Class15 {

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "Lclient!sr;")
	private Class307 aClass307_4;

	@OriginalMember(owner = "client!qba", name = "w", descriptor = "Lclient!fj;")
	private final Class105 aClass105_3;

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "Lclient!ci;")
	private final Class50_Sub2 aClass50_Sub2_1;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!er;Lclient!fj;)V")
	public Class15_Sub6(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class105 arg1) {
		super(arg0);
		this.aClass105_3 = arg1;
		this.method5901();
		this.aClass50_Sub2_1 = new Class50_Sub2(super.aClass31_Sub2_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass50_Sub2_1.method1640();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		this.aClass307_4.method6699('\u0001');
		if (super.aClass31_Sub2_40.anInt3162 > 0) {
			super.aClass31_Sub2_40.method2513(1);
			super.aClass31_Sub2_40.method2535(null);
			super.aClass31_Sub2_40.method2527(1.0F, 0.0F);
			super.aClass31_Sub2_40.method2513(0);
		}
		super.aClass31_Sub2_40.method2536(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return true;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		if (super.aClass31_Sub2_40.anInt3162 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass31_Sub2_40.anInt3162;
			super.aClass31_Sub2_40.method2513(1);
			Static456.aFloatArray57[1] = 0.0F;
			Static456.aFloatArray57[2] = local13;
			Static456.aFloatArray57[3] = local13 * super.aClass31_Sub2_40.aFloat84 + 0.25F;
			Static456.aFloatArray57[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static456.aFloatArray57, 0);
			OpenGL.glPopMatrix();
			super.aClass31_Sub2_40.method2527(0.5F, (float) super.aClass31_Sub2_40.anInt3162);
			super.aClass31_Sub2_40.method2535(this.aClass50_Sub2_1);
			super.aClass31_Sub2_40.method2513(0);
		}
		this.aClass307_4.method6699('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass105_3.aBoolean246) {
				super.aClass31_Sub2_40.method2535(this.aClass105_3.aClass50_Sub3_2);
				Static456.aFloatArray57[2] = 0.0F;
				Static456.aFloatArray57[3] = (float) (super.aClass31_Sub2_40.anInt3134 % 4000) / 4000.0F;
				Static456.aFloatArray57[0] = 0.0F;
				Static456.aFloatArray57[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static456.aFloatArray57, 0);
			} else {
				@Pc(70) int local70 = super.aClass31_Sub2_40.anInt3134 % 4000 * 16 / 4000;
				super.aClass31_Sub2_40.method2535(this.aClass105_3.aClass50_Sub1Array1[local70]);
			}
		} else if (this.aClass105_3.aBoolean246) {
			super.aClass31_Sub2_40.method2535(this.aClass105_3.aClass50_Sub3_2);
			Static456.aFloatArray57[1] = 0.0F;
			Static456.aFloatArray57[2] = 0.0F;
			Static456.aFloatArray57[0] = 0.0F;
			Static456.aFloatArray57[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static456.aFloatArray57, 0);
		} else {
			super.aClass31_Sub2_40.method2535(this.aClass105_3.aClass50_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
	private void method5901() {
		this.aClass307_4 = new Class307(super.aClass31_Sub2_40, 2);
		this.aClass307_4.method6701(0);
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2536(260, 7681);
		super.aClass31_Sub2_40.method2523(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass31_Sub2_40.method2513(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass105_3.aBoolean246) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass307_4.method6702();
		this.aClass307_4.method6701(1);
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2536(8448, 8448);
		super.aClass31_Sub2_40.method2523(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass31_Sub2_40.method2513(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass105_3.aBoolean246) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass307_4.method6702();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
		super.aClass31_Sub2_40.method2536(8448, 260);
	}
}
