import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class69_Sub9 extends Class69 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Lclient!gk;")
	private Class94 aClass94_6;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!pq;")
	private final Class202 aClass202_6;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "Lclient!nm;")
	private final Class23_Sub4 aClass23_Sub4_1;

	static {
		new Class142("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ih;Lclient!pq;)V")
	public Class69_Sub9(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_6 = arg1;
		this.method5865();
		this.aClass23_Sub4_1 = new Class23_Sub4(super.aClass117_Sub1_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass23_Sub4_1.method3772();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return true;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		if (super.aClass117_Sub1_43.anInt3135 > 0) {
			@Pc(21) float local21 = -0.5F / (float) super.aClass117_Sub1_43.anInt3135;
			super.aClass117_Sub1_43.method2476(1);
			Static359.aFloatArray32[2] = local21;
			Static359.aFloatArray32[0] = 0.0F;
			Static359.aFloatArray32[3] = local21 * super.aClass117_Sub1_43.aFloat43 + 0.25F;
			Static359.aFloatArray32[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static359.aFloatArray32, 0);
			OpenGL.glPopMatrix();
			super.aClass117_Sub1_43.method2524((float) super.aClass117_Sub1_43.anInt3135, 0.5F);
			super.aClass117_Sub1_43.method2504(this.aClass23_Sub4_1);
			super.aClass117_Sub1_43.method2476(0);
		}
		this.aClass94_6.method1738('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass202_6.aBoolean484) {
				super.aClass117_Sub1_43.method2504(this.aClass202_6.aClass23_Sub2_3);
				Static359.aFloatArray32[2] = 0.0F;
				Static359.aFloatArray32[1] = 0.0F;
				Static359.aFloatArray32[3] = (float) (super.aClass117_Sub1_43.anInt3092 % 4000) / 4000.0F;
				Static359.aFloatArray32[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static359.aFloatArray32, 0);
			} else {
				@Pc(72) int local72 = super.aClass117_Sub1_43.anInt3092 % 4000 * 16 / 4000;
				super.aClass117_Sub1_43.method2504(this.aClass202_6.aClass23_Sub3Array3[local72]);
			}
		} else if (this.aClass202_6.aBoolean484) {
			super.aClass117_Sub1_43.method2504(this.aClass202_6.aClass23_Sub2_3);
			Static359.aFloatArray32[0] = 0.0F;
			Static359.aFloatArray32[2] = 0.0F;
			Static359.aFloatArray32[3] = 0.0F;
			Static359.aFloatArray32[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static359.aFloatArray32, 0);
		} else {
			super.aClass117_Sub1_43.method2504(this.aClass202_6.aClass23_Sub3Array3[0]);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		this.aClass94_6.method1738('\u0001');
		if (super.aClass117_Sub1_43.anInt3135 > 0) {
			super.aClass117_Sub1_43.method2476(1);
			super.aClass117_Sub1_43.method2504(null);
			super.aClass117_Sub1_43.method2524(0.0F, 1.0F);
			super.aClass117_Sub1_43.method2476(0);
		}
		super.aClass117_Sub1_43.method2471(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
		super.aClass117_Sub1_43.method2471(8448, 260);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V")
	private void method5865() {
		this.aClass94_6 = new Class94(super.aClass117_Sub1_43, 2);
		this.aClass94_6.method1744(0);
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2471(260, 7681);
		super.aClass117_Sub1_43.method2505(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass117_Sub1_43.method2476(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass202_6.aBoolean484) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass94_6.method1745();
		this.aClass94_6.method1744(1);
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2471(8448, 8448);
		super.aClass117_Sub1_43.method2505(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass117_Sub1_43.method2476(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass202_6.aBoolean484) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass94_6.method1745();
	}
}
