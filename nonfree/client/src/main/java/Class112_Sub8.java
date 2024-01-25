import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class112_Sub8 extends Class112 {

	@OriginalMember(owner = "client!su", name = "q", descriptor = "Lclient!ud;")
	private Class294 aClass294_4;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!de;")
	private final Class67 aClass67_6;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "Lclient!eaa;")
	private final Class79_Sub1 aClass79_Sub1_1;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!gi;Lclient!de;)V")
	public Class112_Sub8(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_6 = arg1;
		this.method6905();
		this.aClass79_Sub1_1 = new Class79_Sub1(super.aClass42_Sub3_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass79_Sub1_1.method2199();
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		this.aClass294_4.method7284('\u0001');
		if (super.aClass42_Sub3_39.anInt3704 > 0) {
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3219(null);
			super.aClass42_Sub3_39.method3265(1.0F, 0.0F);
			super.aClass42_Sub3_39.method3259(0);
		}
		super.aClass42_Sub3_39.method3250(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return true;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	private void method6905() {
		this.aClass294_4 = new Class294(super.aClass42_Sub3_39, 2);
		this.aClass294_4.method7287(0);
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3250(7681, 260);
		super.aClass42_Sub3_39.method3268(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass42_Sub3_39.method3259(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass67_6.aBoolean145) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass294_4.method7288();
		this.aClass294_4.method7287(1);
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3250(8448, 8448);
		super.aClass42_Sub3_39.method3268(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass42_Sub3_39.method3259(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass67_6.aBoolean145) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass294_4.method7288();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub3_39.method3250(260, 8448);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass67_6.aBoolean145) {
				super.aClass42_Sub3_39.method3219(this.aClass67_6.aClass79_Sub3_2);
				Static156.aFloatArray29[3] = (float) (super.aClass42_Sub3_39.anInt3674 % 4000) / 4000.0F;
				Static156.aFloatArray29[2] = 0.0F;
				Static156.aFloatArray29[0] = 0.0F;
				Static156.aFloatArray29[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static156.aFloatArray29, 0);
			} else {
				@Pc(28) int local28 = super.aClass42_Sub3_39.anInt3674 % 4000 * 16 / 4000;
				super.aClass42_Sub3_39.method3219(this.aClass67_6.aClass79_Sub2Array3[local28]);
			}
		} else if (this.aClass67_6.aBoolean145) {
			super.aClass42_Sub3_39.method3219(this.aClass67_6.aClass79_Sub3_2);
			Static156.aFloatArray29[0] = 0.0F;
			Static156.aFloatArray29[1] = 0.0F;
			Static156.aFloatArray29[3] = 0.0F;
			Static156.aFloatArray29[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static156.aFloatArray29, 0);
		} else {
			super.aClass42_Sub3_39.method3219(this.aClass67_6.aClass79_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		if (super.aClass42_Sub3_39.anInt3704 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass42_Sub3_39.anInt3704;
			super.aClass42_Sub3_39.method3259(1);
			Static156.aFloatArray29[2] = local14;
			Static156.aFloatArray29[3] = super.aClass42_Sub3_39.aFloat94 * local14 + 0.25F;
			Static156.aFloatArray29[0] = 0.0F;
			Static156.aFloatArray29[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static156.aFloatArray29, 0);
			OpenGL.glPopMatrix();
			super.aClass42_Sub3_39.method3265(0.5F, (float) super.aClass42_Sub3_39.anInt3704);
			super.aClass42_Sub3_39.method3219(this.aClass79_Sub1_1);
			super.aClass42_Sub3_39.method3259(0);
		}
		this.aClass294_4.method7284('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
