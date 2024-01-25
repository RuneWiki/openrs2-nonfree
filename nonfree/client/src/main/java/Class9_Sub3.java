import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "Lclient!ct;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Lclient!m;")
	private final Class144 aClass144_3;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "Lclient!ar;")
	private final Class6_Sub2 aClass6_Sub2_1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!fd;Lclient!m;)V")
	public Class9_Sub3(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class144 arg1) {
		super(arg0);
		this.aClass144_3 = arg1;
		this.method1351();
		this.aClass6_Sub2_1 = new Class6_Sub2(super.aClass19_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass6_Sub2_1.method199();
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	private void method1351() {
		this.aClass43_1 = new Class43(super.aClass19_Sub2_41, 2);
		this.aClass43_1.method990(0);
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1912(7681, 260);
		super.aClass19_Sub2_41.method1945(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass19_Sub2_41.method1936(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass144_3.aBoolean415) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass43_1.method991();
		this.aClass43_1.method990(1);
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1912(8448, 8448);
		super.aClass19_Sub2_41.method1945(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass19_Sub2_41.method1936(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass144_3.aBoolean415) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass43_1.method991();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub2_41.method1912(260, 8448);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		if (super.aClass19_Sub2_41.anInt2315 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass19_Sub2_41.anInt2315;
			super.aClass19_Sub2_41.method1936(1);
			Static423.aFloatArray32[1] = 0.0F;
			Static423.aFloatArray32[0] = 0.0F;
			Static423.aFloatArray32[2] = local13;
			Static423.aFloatArray32[3] = super.aClass19_Sub2_41.aFloat59 * local13 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static423.aFloatArray32, 0);
			OpenGL.glPopMatrix();
			super.aClass19_Sub2_41.method1943(0.5F, (float) super.aClass19_Sub2_41.anInt2315);
			super.aClass19_Sub2_41.method1905(this.aClass6_Sub2_1);
			super.aClass19_Sub2_41.method1936(0);
		}
		this.aClass43_1.method989('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass144_3.aBoolean415) {
				super.aClass19_Sub2_41.method1905(this.aClass144_3.aClass6_Sub3_3);
				Static423.aFloatArray32[3] = (float) (super.aClass19_Sub2_41.anInt2274 % 4000) / 4000.0F;
				Static423.aFloatArray32[1] = 0.0F;
				Static423.aFloatArray32[2] = 0.0F;
				Static423.aFloatArray32[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static423.aFloatArray32, 0);
			} else {
				@Pc(24) int local24 = super.aClass19_Sub2_41.anInt2274 % 4000 * 16 / 4000;
				super.aClass19_Sub2_41.method1905(this.aClass144_3.aClass6_Sub1Array3[local24]);
			}
		} else if (this.aClass144_3.aBoolean415) {
			super.aClass19_Sub2_41.method1905(this.aClass144_3.aClass6_Sub3_3);
			Static423.aFloatArray32[0] = 0.0F;
			Static423.aFloatArray32[3] = 0.0F;
			Static423.aFloatArray32[2] = 0.0F;
			Static423.aFloatArray32[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static423.aFloatArray32, 0);
		} else {
			super.aClass19_Sub2_41.method1905(this.aClass144_3.aClass6_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		this.aClass43_1.method989('\u0001');
		if (super.aClass19_Sub2_41.anInt2315 > 0) {
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1905(null);
			super.aClass19_Sub2_41.method1943(1.0F, 0.0F);
			super.aClass19_Sub2_41.method1936(0);
		}
		super.aClass19_Sub2_41.method1912(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
