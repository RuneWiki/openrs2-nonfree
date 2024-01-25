import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class40_Sub5 extends Class40 {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!kp;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!wc;")
	private final Class266 aClass266_5;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!mb;")
	private final Class64_Sub3 aClass64_Sub3_1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!na;Lclient!wc;)V")
	public Class40_Sub5(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class266 arg1) {
		super(arg0);
		this.aClass266_5 = arg1;
		this.method2977();
		this.aClass64_Sub3_1 = new Class64_Sub3(super.aClass75_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass64_Sub3_1.method3457();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		if (super.aClass75_Sub2_41.anInt4885 > 0) {
			@Pc(20) float local20 = -0.5F / (float) super.aClass75_Sub2_41.anInt4885;
			super.aClass75_Sub2_41.method3811(1);
			Static30.aFloatArray2[3] = super.aClass75_Sub2_41.aFloat50 * local20 + 0.25F;
			Static30.aFloatArray2[0] = 0.0F;
			Static30.aFloatArray2[2] = local20;
			Static30.aFloatArray2[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static30.aFloatArray2, 0);
			OpenGL.glPopMatrix();
			super.aClass75_Sub2_41.method3816(0.5F, (float) super.aClass75_Sub2_41.anInt4885);
			super.aClass75_Sub2_41.method3844(this.aClass64_Sub3_1);
			super.aClass75_Sub2_41.method3811(0);
		}
		this.aClass150_2.method3067('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass266_5.aBoolean507) {
				super.aClass75_Sub2_41.method3844(this.aClass266_5.aClass64_Sub2_2);
				Static30.aFloatArray2[3] = (float) (super.aClass75_Sub2_41.anInt4860 % 4000) / 4000.0F;
				Static30.aFloatArray2[0] = 0.0F;
				Static30.aFloatArray2[2] = 0.0F;
				Static30.aFloatArray2[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static30.aFloatArray2, 0);
			} else {
				@Pc(109) int local109 = super.aClass75_Sub2_41.anInt4860 % 4000 * 16 / 4000;
				super.aClass75_Sub2_41.method3844(this.aClass266_5.aClass64_Sub4Array3[local109]);
			}
		} else if (this.aClass266_5.aBoolean507) {
			super.aClass75_Sub2_41.method3844(this.aClass266_5.aClass64_Sub2_2);
			Static30.aFloatArray2[2] = 0.0F;
			Static30.aFloatArray2[1] = 0.0F;
			Static30.aFloatArray2[0] = 0.0F;
			Static30.aFloatArray2[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static30.aFloatArray2, 0);
		} else {
			super.aClass75_Sub2_41.method3844(this.aClass266_5.aClass64_Sub4Array3[0]);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	private void method2977() {
		this.aClass150_2 = new Class150(super.aClass75_Sub2_41, 2);
		this.aClass150_2.method3069(0);
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3872(260, 7681);
		super.aClass75_Sub2_41.method3802(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass75_Sub2_41.method3811(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass266_5.aBoolean507) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass150_2.method3066();
		this.aClass150_2.method3069(1);
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3872(8448, 8448);
		super.aClass75_Sub2_41.method3802(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass75_Sub2_41.method3811(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass266_5.aBoolean507) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass150_2.method3066();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		this.aClass150_2.method3067('\u0001');
		if (super.aClass75_Sub2_41.anInt4885 > 0) {
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3844(null);
			super.aClass75_Sub2_41.method3816(1.0F, 0.0F);
			super.aClass75_Sub2_41.method3811(0);
		}
		super.aClass75_Sub2_41.method3872(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub2_41.method3872(8448, 260);
	}
}
