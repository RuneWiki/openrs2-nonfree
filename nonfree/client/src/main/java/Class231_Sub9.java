import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class231_Sub9 extends Class231 {

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Lclient!nc;")
	private Class243 aClass243_6;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "Lclient!wo;")
	private final Class391 aClass391_6;

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "Lclient!dfa;")
	private final Class80_Sub1 aClass80_Sub1_1;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!ck;Lclient!wo;)V")
	public Class231_Sub9(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class391 arg1) {
		super(arg0);
		this.aClass391_6 = arg1;
		this.method8719();
		this.aClass80_Sub1_1 = new Class80_Sub1(super.aClass65_Sub1_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass80_Sub1_1.method2028();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		if (super.aClass65_Sub1_41.anInt1394 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass65_Sub1_41.anInt1394;
			super.aClass65_Sub1_41.method1256(1);
			Static375.aFloatArray64[2] = local13;
			Static375.aFloatArray64[0] = 0.0F;
			Static375.aFloatArray64[1] = 0.0F;
			Static375.aFloatArray64[3] = local13 * super.aClass65_Sub1_41.aFloat31 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static375.aFloatArray64, 0);
			OpenGL.glPopMatrix();
			super.aClass65_Sub1_41.method1253(0.5F, (float) super.aClass65_Sub1_41.anInt1394);
			super.aClass65_Sub1_41.method1286(this.aClass80_Sub1_1);
			super.aClass65_Sub1_41.method1256(0);
		}
		this.aClass243_6.method5740('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V")
	private void method8719() {
		this.aClass243_6 = new Class243(super.aClass65_Sub1_41, 2);
		this.aClass243_6.method5742(0);
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1228(7681, 260);
		super.aClass65_Sub1_41.method1265(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass65_Sub1_41.method1256(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass391_6.aBoolean911) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass243_6.method5741();
		this.aClass243_6.method5742(1);
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1228(8448, 8448);
		super.aClass65_Sub1_41.method1265(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass65_Sub1_41.method1256(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass391_6.aBoolean911) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass243_6.method5741();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass391_6.aBoolean911) {
				super.aClass65_Sub1_41.method1286(this.aClass391_6.aClass80_Sub3_1);
				Static375.aFloatArray64[1] = 0.0F;
				Static375.aFloatArray64[2] = 0.0F;
				Static375.aFloatArray64[0] = 0.0F;
				Static375.aFloatArray64[3] = (float) (super.aClass65_Sub1_41.anInt1383 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static375.aFloatArray64, 0);
			} else {
				@Pc(106) int local106 = super.aClass65_Sub1_41.anInt1383 % 4000 * 16 / 4000;
				super.aClass65_Sub1_41.method1286(this.aClass391_6.aClass80_Sub2Array3[local106]);
			}
		} else if (this.aClass391_6.aBoolean911) {
			super.aClass65_Sub1_41.method1286(this.aClass391_6.aClass80_Sub3_1);
			Static375.aFloatArray64[2] = 0.0F;
			Static375.aFloatArray64[3] = 0.0F;
			Static375.aFloatArray64[0] = 0.0F;
			Static375.aFloatArray64[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static375.aFloatArray64, 0);
		} else {
			super.aClass65_Sub1_41.method1286(this.aClass391_6.aClass80_Sub2Array3[0]);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return true;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
		super.aClass65_Sub1_41.method1228(260, 8448);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		this.aClass243_6.method5740('\u0001');
		if (super.aClass65_Sub1_41.anInt1394 > 0) {
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1286((Class80) null);
			super.aClass65_Sub1_41.method1253(1.0F, 0.0F);
			super.aClass65_Sub1_41.method1256(0);
		}
		super.aClass65_Sub1_41.method1228(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
