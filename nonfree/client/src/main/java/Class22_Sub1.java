import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!ce;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!bt;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!e;")
	private final Class59_Sub1 aClass59_Sub1_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!vd;Lclient!bt;)V")
	public Class22_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_1 = arg1;
		this.method293();
		this.aClass59_Sub1_1 = new Class59_Sub1(super.aClass51_Sub2_33, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass59_Sub1_1.method1438();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
		super.aClass51_Sub2_33.method5394(260, 8448);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	private void method293() {
		this.aClass37_1 = new Class37(super.aClass51_Sub2_33, 2);
		this.aClass37_1.method601(0);
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5394(7681, 260);
		super.aClass51_Sub2_33.method5408(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass51_Sub2_33.method5371(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass30_1.aBoolean30) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass37_1.method606();
		this.aClass37_1.method601(1);
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5394(8448, 8448);
		super.aClass51_Sub2_33.method5408(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass51_Sub2_33.method5371(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass30_1.aBoolean30) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass37_1.method606();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass30_1.aBoolean30) {
				super.aClass51_Sub2_33.method5364(this.aClass30_1.aClass59_Sub2_2);
				Static450.aFloatArray33[2] = 0.0F;
				Static450.aFloatArray33[3] = (float) (super.aClass51_Sub2_33.anInt6911 % 4000) / 4000.0F;
				Static450.aFloatArray33[1] = 0.0F;
				Static450.aFloatArray33[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static450.aFloatArray33, 0);
			} else {
				@Pc(73) int local73 = super.aClass51_Sub2_33.anInt6911 % 4000 * 16 / 4000;
				super.aClass51_Sub2_33.method5364(this.aClass30_1.aClass59_Sub3Array2[local73]);
			}
		} else if (this.aClass30_1.aBoolean30) {
			super.aClass51_Sub2_33.method5364(this.aClass30_1.aClass59_Sub2_2);
			Static450.aFloatArray33[3] = 0.0F;
			Static450.aFloatArray33[2] = 0.0F;
			Static450.aFloatArray33[1] = 0.0F;
			Static450.aFloatArray33[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static450.aFloatArray33, 0);
		} else {
			super.aClass51_Sub2_33.method5364(this.aClass30_1.aClass59_Sub3Array2[0]);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		this.aClass37_1.method600('\u0001');
		if (super.aClass51_Sub2_33.anInt6950 > 0) {
			super.aClass51_Sub2_33.method5371(1);
			super.aClass51_Sub2_33.method5364(null);
			super.aClass51_Sub2_33.method5391(0.0F, 1.0F);
			super.aClass51_Sub2_33.method5371(0);
		}
		super.aClass51_Sub2_33.method5394(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		if (super.aClass51_Sub2_33.anInt6950 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass51_Sub2_33.anInt6950;
			super.aClass51_Sub2_33.method5371(1);
			Static450.aFloatArray33[0] = 0.0F;
			Static450.aFloatArray33[2] = local13;
			Static450.aFloatArray33[1] = 0.0F;
			Static450.aFloatArray33[3] = super.aClass51_Sub2_33.aFloat198 * local13 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static450.aFloatArray33, 0);
			OpenGL.glPopMatrix();
			super.aClass51_Sub2_33.method5391((float) super.aClass51_Sub2_33.anInt6950, 0.5F);
			super.aClass51_Sub2_33.method5364(this.aClass59_Sub1_1);
			super.aClass51_Sub2_33.method5371(0);
		}
		this.aClass37_1.method600('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return true;
	}
}
