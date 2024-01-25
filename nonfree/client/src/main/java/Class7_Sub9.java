import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lclient!cl;")
	private Class53 aClass53_6;

	@OriginalMember(owner = "client!wfa", name = "s", descriptor = "Lclient!ica;")
	private final Class150 aClass150_6;

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "Lclient!og;")
	private final Class52_Sub3 aClass52_Sub3_1;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!ag;Lclient!ica;)V")
	public Class7_Sub9(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class150 arg1) {
		super(arg0);
		this.aClass150_6 = arg1;
		this.method7788();
		this.aClass52_Sub3_1 = new Class52_Sub3(super.aClass12_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass52_Sub3_1.method5506();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub1_42.method420(8448, 260);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		if (super.aClass12_Sub1_42.anInt494 > 0) {
			@Pc(21) float local21 = -0.5F / (float) super.aClass12_Sub1_42.anInt494;
			super.aClass12_Sub1_42.method376(1);
			Static244.aFloatArray38[1] = 0.0F;
			Static244.aFloatArray38[3] = super.aClass12_Sub1_42.aFloat15 * local21 + 0.25F;
			Static244.aFloatArray38[2] = local21;
			Static244.aFloatArray38[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static244.aFloatArray38, 0);
			OpenGL.glPopMatrix();
			super.aClass12_Sub1_42.method441((float) super.aClass12_Sub1_42.anInt494, 0.5F);
			super.aClass12_Sub1_42.method378(this.aClass52_Sub3_1);
			super.aClass12_Sub1_42.method376(0);
		}
		this.aClass53_6.method1511('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)V")
	private void method7788() {
		this.aClass53_6 = new Class53(super.aClass12_Sub1_42, 2);
		this.aClass53_6.method1513(0);
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method420(260, 7681);
		super.aClass12_Sub1_42.method387(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass12_Sub1_42.method376(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass150_6.aBoolean339) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass53_6.method1514();
		this.aClass53_6.method1513(1);
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method420(8448, 8448);
		super.aClass12_Sub1_42.method387(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass12_Sub1_42.method376(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass150_6.aBoolean339) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass53_6.method1514();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		this.aClass53_6.method1511('\u0001');
		if (super.aClass12_Sub1_42.anInt494 > 0) {
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method378(null);
			super.aClass12_Sub1_42.method441(0.0F, 1.0F);
			super.aClass12_Sub1_42.method376(0);
		}
		super.aClass12_Sub1_42.method420(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass150_6.aBoolean339) {
				super.aClass12_Sub1_42.method378(this.aClass150_6.aClass52_Sub4_3);
				Static244.aFloatArray38[1] = 0.0F;
				Static244.aFloatArray38[0] = 0.0F;
				Static244.aFloatArray38[3] = (float) (super.aClass12_Sub1_42.anInt461 % 4000) / 4000.0F;
				Static244.aFloatArray38[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static244.aFloatArray38, 0);
			} else {
				@Pc(20) int local20 = super.aClass12_Sub1_42.anInt461 % 4000 * 16 / 4000;
				super.aClass12_Sub1_42.method378(this.aClass150_6.aClass52_Sub1Array2[local20]);
			}
		} else if (this.aClass150_6.aBoolean339) {
			super.aClass12_Sub1_42.method378(this.aClass150_6.aClass52_Sub4_3);
			Static244.aFloatArray38[0] = 0.0F;
			Static244.aFloatArray38[3] = 0.0F;
			Static244.aFloatArray38[2] = 0.0F;
			Static244.aFloatArray38[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static244.aFloatArray38, 0);
		} else {
			super.aClass12_Sub1_42.method378(this.aClass150_6.aClass52_Sub1Array2[0]);
		}
	}
}
