import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class62_Sub5 extends Class62 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Lclient!ih;")
	private Class117 aClass117_4;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Lclient!mc;")
	private final Class159 aClass159_3;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Lclient!dk;")
	private final Class55_Sub1 aClass55_Sub1_1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!ef;Lclient!mc;)V")
	public Class62_Sub5(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class159 arg1) {
		super(arg0);
		this.aClass159_3 = arg1;
		this.method4515();
		this.aClass55_Sub1_1 = new Class55_Sub1(super.aClass49_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass55_Sub1_1.method1276();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass159_3.aBoolean328) {
				super.aClass49_Sub2_43.method1646(this.aClass159_3.aClass55_Sub2_1);
				Static136.aFloatArray25[3] = (float) (super.aClass49_Sub2_43.anInt2002 % 4000) / 4000.0F;
				Static136.aFloatArray25[1] = 0.0F;
				Static136.aFloatArray25[0] = 0.0F;
				Static136.aFloatArray25[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static136.aFloatArray25, 0);
			} else {
				@Pc(27) int local27 = super.aClass49_Sub2_43.anInt2002 % 4000 * 16 / 4000;
				super.aClass49_Sub2_43.method1646(this.aClass159_3.aClass55_Sub3Array2[local27]);
			}
		} else if (this.aClass159_3.aBoolean328) {
			super.aClass49_Sub2_43.method1646(this.aClass159_3.aClass55_Sub2_1);
			Static136.aFloatArray25[3] = 0.0F;
			Static136.aFloatArray25[0] = 0.0F;
			Static136.aFloatArray25[2] = 0.0F;
			Static136.aFloatArray25[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static136.aFloatArray25, 0);
		} else {
			super.aClass49_Sub2_43.method1646(this.aClass159_3.aClass55_Sub3Array2[0]);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		this.aClass117_4.method2645('\u0001');
		if (super.aClass49_Sub2_43.anInt2034 > 0) {
			super.aClass49_Sub2_43.method1600(1);
			super.aClass49_Sub2_43.method1646(null);
			super.aClass49_Sub2_43.method1580(0.0F, 1.0F);
			super.aClass49_Sub2_43.method1600(0);
		}
		super.aClass49_Sub2_43.method1613(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		if (super.aClass49_Sub2_43.anInt2034 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass49_Sub2_43.anInt2034;
			super.aClass49_Sub2_43.method1600(1);
			Static136.aFloatArray25[0] = 0.0F;
			Static136.aFloatArray25[2] = local10;
			Static136.aFloatArray25[3] = super.aClass49_Sub2_43.aFloat33 * local10 + 0.25F;
			Static136.aFloatArray25[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static136.aFloatArray25, 0);
			OpenGL.glPopMatrix();
			super.aClass49_Sub2_43.method1580((float) super.aClass49_Sub2_43.anInt2034, 0.5F);
			super.aClass49_Sub2_43.method1646(this.aClass55_Sub1_1);
			super.aClass49_Sub2_43.method1600(0);
		}
		this.aClass117_4.method2645('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
		super.aClass49_Sub2_43.method1613(260, 8448);
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	private void method4515() {
		this.aClass117_4 = new Class117(super.aClass49_Sub2_43, 2);
		this.aClass117_4.method2648(0);
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1613(7681, 260);
		super.aClass49_Sub2_43.method1625(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass49_Sub2_43.method1600(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass159_3.aBoolean328) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass117_4.method2647();
		this.aClass117_4.method2648(1);
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1613(8448, 8448);
		super.aClass49_Sub2_43.method1625(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass49_Sub2_43.method1600(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass159_3.aBoolean328) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass117_4.method2647();
	}
}
