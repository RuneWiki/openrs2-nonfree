import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Lclient!gs;")
	private Class98 aClass98_4;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Lclient!re;")
	private final Class202 aClass202_3;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Lclient!a;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!bv;Lclient!re;)V")
	public Class2_Sub6(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_3 = arg1;
		this.method4015();
		this.aClass1_Sub1_1 = new Class1_Sub1(super.aClass30_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass1_Sub1_1.method31();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		this.aClass98_4.method2005('\u0001');
		if (super.aClass30_Sub1_42.anInt1278 > 0) {
			super.aClass30_Sub1_42.method948(1);
			super.aClass30_Sub1_42.method916(null);
			super.aClass30_Sub1_42.method933(1.0F, 0.0F);
			super.aClass30_Sub1_42.method948(0);
		}
		super.aClass30_Sub1_42.method905(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass202_3.aBoolean411) {
				super.aClass30_Sub1_42.method916(this.aClass202_3.aClass1_Sub4_1);
				Static421.aFloatArray25[3] = (float) (super.aClass30_Sub1_42.anInt1244 % 4000) / 4000.0F;
				Static421.aFloatArray25[2] = 0.0F;
				Static421.aFloatArray25[0] = 0.0F;
				Static421.aFloatArray25[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static421.aFloatArray25, 0);
			} else {
				@Pc(27) int local27 = super.aClass30_Sub1_42.anInt1244 % 4000 * 16 / 4000;
				super.aClass30_Sub1_42.method916(this.aClass202_3.aClass1_Sub3Array3[local27]);
			}
		} else if (this.aClass202_3.aBoolean411) {
			super.aClass30_Sub1_42.method916(this.aClass202_3.aClass1_Sub4_1);
			Static421.aFloatArray25[1] = 0.0F;
			Static421.aFloatArray25[3] = 0.0F;
			Static421.aFloatArray25[0] = 0.0F;
			Static421.aFloatArray25[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static421.aFloatArray25, 0);
		} else {
			super.aClass30_Sub1_42.method916(this.aClass202_3.aClass1_Sub3Array3[0]);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method905(8448, 260);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		if (super.aClass30_Sub1_42.anInt1278 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass30_Sub1_42.anInt1278;
			super.aClass30_Sub1_42.method948(1);
			Static421.aFloatArray25[3] = local14 * super.aClass30_Sub1_42.aFloat24 + 0.25F;
			Static421.aFloatArray25[0] = 0.0F;
			Static421.aFloatArray25[2] = local14;
			Static421.aFloatArray25[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static421.aFloatArray25, 0);
			OpenGL.glPopMatrix();
			super.aClass30_Sub1_42.method933(0.5F, (float) super.aClass30_Sub1_42.anInt1278);
			super.aClass30_Sub1_42.method916(this.aClass1_Sub1_1);
			super.aClass30_Sub1_42.method948(0);
		}
		this.aClass98_4.method2005('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	private void method4015() {
		this.aClass98_4 = new Class98(super.aClass30_Sub1_42, 2);
		this.aClass98_4.method2003(0);
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method905(260, 7681);
		super.aClass30_Sub1_42.method957(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass30_Sub1_42.method948(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass202_3.aBoolean411) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass98_4.method2004();
		this.aClass98_4.method2003(1);
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method905(8448, 8448);
		super.aClass30_Sub1_42.method957(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass30_Sub1_42.method948(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass202_3.aBoolean411) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass98_4.method2004();
	}
}
