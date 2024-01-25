import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class19_Sub7 extends Class19 {

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!jv;")
	private Class170 aClass170_4;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!lc;")
	private final Class189 aClass189_6;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!wha;")
	private final Class85_Sub4 aClass85_Sub4_1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!qo;Lclient!lc;)V")
	public Class19_Sub7(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_6 = arg1;
		this.method8193();
		this.aClass85_Sub4_1 = new Class85_Sub4(super.aClass20_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass85_Sub4_1.method9103();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass189_6.aBoolean483) {
				super.aClass20_Sub3_42.method7358(this.aClass189_6.aClass85_Sub2_1);
				Static414.aFloatArray67[2] = 0.0F;
				Static414.aFloatArray67[3] = (float) (super.aClass20_Sub3_42.anInt8773 % 4000) / 4000.0F;
				Static414.aFloatArray67[0] = 0.0F;
				Static414.aFloatArray67[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static414.aFloatArray67, 0);
			} else {
				@Pc(26) int local26 = super.aClass20_Sub3_42.anInt8773 % 4000 * 16 / 4000;
				super.aClass20_Sub3_42.method7358(this.aClass189_6.aClass85_Sub1Array2[local26]);
			}
		} else if (this.aClass189_6.aBoolean483) {
			super.aClass20_Sub3_42.method7358(this.aClass189_6.aClass85_Sub2_1);
			Static414.aFloatArray67[0] = 0.0F;
			Static414.aFloatArray67[2] = 0.0F;
			Static414.aFloatArray67[1] = 0.0F;
			Static414.aFloatArray67[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static414.aFloatArray67, 0);
		} else {
			super.aClass20_Sub3_42.method7358(this.aClass189_6.aClass85_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		if (super.aClass20_Sub3_42.anInt8788 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass20_Sub3_42.anInt8788;
			super.aClass20_Sub3_42.method7325(1);
			Static414.aFloatArray67[3] = super.aClass20_Sub3_42.aFloat178 * local10 + 0.25F;
			Static414.aFloatArray67[0] = 0.0F;
			Static414.aFloatArray67[2] = local10;
			Static414.aFloatArray67[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static414.aFloatArray67, 0);
			OpenGL.glPopMatrix();
			super.aClass20_Sub3_42.method7331((float) super.aClass20_Sub3_42.anInt8788, 0.5F);
			super.aClass20_Sub3_42.method7358(this.aClass85_Sub4_1);
			super.aClass20_Sub3_42.method7325(0);
		}
		this.aClass170_4.method5086('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)V")
	private void method8193() {
		this.aClass170_4 = new Class170(super.aClass20_Sub3_42, 2);
		this.aClass170_4.method5087(0);
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7316(7681, 260);
		super.aClass20_Sub3_42.method7349(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass20_Sub3_42.method7325(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass189_6.aBoolean483) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass170_4.method5083();
		this.aClass170_4.method5087(1);
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7316(8448, 8448);
		super.aClass20_Sub3_42.method7349(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass20_Sub3_42.method7325(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass189_6.aBoolean483) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass170_4.method5083();
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		this.aClass170_4.method5086('\u0001');
		if (super.aClass20_Sub3_42.anInt8788 > 0) {
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7358(null);
			super.aClass20_Sub3_42.method7331(0.0F, 1.0F);
			super.aClass20_Sub3_42.method7325(0);
		}
		super.aClass20_Sub3_42.method7316(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub3_42.method7316(260, 8448);
	}
}
