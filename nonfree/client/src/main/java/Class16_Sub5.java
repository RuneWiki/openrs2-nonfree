import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class16_Sub5 extends Class16 {

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!gw;")
	private Class94 aClass94_2;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Lclient!mm;")
	private final Class162 aClass162_3;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "Lclient!qn;")
	private final Class31_Sub3 aClass31_Sub3_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!tt;Lclient!mm;)V")
	public Class16_Sub5(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_3 = arg1;
		this.method2391();
		this.aClass31_Sub3_1 = new Class31_Sub3(super.aClass200_Sub2_36, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass31_Sub3_1.method4404();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
		super.aClass200_Sub2_36.method5304(260, 8448);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		this.aClass94_2.method2132('\u0001');
		if (super.aClass200_Sub2_36.anInt6746 > 0) {
			super.aClass200_Sub2_36.method5319(1);
			super.aClass200_Sub2_36.method5312(null);
			super.aClass200_Sub2_36.method5314(1.0F, 0.0F);
			super.aClass200_Sub2_36.method5319(0);
		}
		super.aClass200_Sub2_36.method5304(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass162_3.aBoolean276) {
				super.aClass200_Sub2_36.method5312(this.aClass162_3.aClass31_Sub2_2);
				Static143.aFloatArray4[1] = 0.0F;
				Static143.aFloatArray4[2] = 0.0F;
				Static143.aFloatArray4[3] = (float) (super.aClass200_Sub2_36.anInt6720 % 4000) / 4000.0F;
				Static143.aFloatArray4[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static143.aFloatArray4, 0);
			} else {
				@Pc(26) int local26 = super.aClass200_Sub2_36.anInt6720 % 4000 * 16 / 4000;
				super.aClass200_Sub2_36.method5312(this.aClass162_3.aClass31_Sub1Array1[local26]);
			}
		} else if (this.aClass162_3.aBoolean276) {
			super.aClass200_Sub2_36.method5312(this.aClass162_3.aClass31_Sub2_2);
			Static143.aFloatArray4[0] = 0.0F;
			Static143.aFloatArray4[3] = 0.0F;
			Static143.aFloatArray4[2] = 0.0F;
			Static143.aFloatArray4[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static143.aFloatArray4, 0);
		} else {
			super.aClass200_Sub2_36.method5312(this.aClass162_3.aClass31_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		if (super.aClass200_Sub2_36.anInt6746 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass200_Sub2_36.anInt6746;
			super.aClass200_Sub2_36.method5319(1);
			Static143.aFloatArray4[1] = 0.0F;
			Static143.aFloatArray4[0] = 0.0F;
			Static143.aFloatArray4[3] = local13 * super.aClass200_Sub2_36.aFloat158 + 0.25F;
			Static143.aFloatArray4[2] = local13;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static143.aFloatArray4, 0);
			OpenGL.glPopMatrix();
			super.aClass200_Sub2_36.method5314(0.5F, (float) super.aClass200_Sub2_36.anInt6746);
			super.aClass200_Sub2_36.method5312(this.aClass31_Sub3_1);
			super.aClass200_Sub2_36.method5319(0);
		}
		this.aClass94_2.method2132('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	private void method2391() {
		this.aClass94_2 = new Class94(super.aClass200_Sub2_36, 2);
		this.aClass94_2.method2130(0);
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5304(7681, 260);
		super.aClass200_Sub2_36.method5343(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass200_Sub2_36.method5319(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass162_3.aBoolean276) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass94_2.method2133();
		this.aClass94_2.method2130(1);
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5304(8448, 8448);
		super.aClass200_Sub2_36.method5343(768, 5890, 0);
		OpenGL.glDisable(3168);
		super.aClass200_Sub2_36.method5319(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass162_3.aBoolean276) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass94_2.method2133();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return true;
	}
}
