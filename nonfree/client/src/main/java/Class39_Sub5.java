import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class39_Sub5 extends Class39 {

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!iw;")
	private Class169 aClass169_2;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!ah;")
	private final Class12 aClass12_3;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!kl;")
	private final Class167_Sub2 aClass167_Sub2_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!rs;Lclient!ah;)V")
	public Class39_Sub5(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class12 arg1) {
		super(arg0);
		this.aClass12_3 = arg1;
		this.method4090();
		this.aClass167_Sub2_1 = new Class167_Sub2(super.aClass133_Sub3_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass167_Sub2_1.method4571();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass12_3.aBoolean10) {
				super.aClass133_Sub3_42.method7375(this.aClass12_3.aClass167_Sub4_1);
				Static12.aFloatArray1[3] = (float) (super.aClass133_Sub3_42.anInt8530 % 4000) / 4000.0F;
				Static12.aFloatArray1[0] = 0.0F;
				Static12.aFloatArray1[1] = 0.0F;
				Static12.aFloatArray1[2] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static12.aFloatArray1, 0);
			} else {
				@Pc(87) int local87 = super.aClass133_Sub3_42.anInt8530 % 4000 * 16 / 4000;
				super.aClass133_Sub3_42.method7375(this.aClass12_3.aClass167_Sub3Array2[local87]);
			}
		} else if (this.aClass12_3.aBoolean10) {
			super.aClass133_Sub3_42.method7375(this.aClass12_3.aClass167_Sub4_1);
			Static12.aFloatArray1[3] = 0.0F;
			Static12.aFloatArray1[1] = 0.0F;
			Static12.aFloatArray1[0] = 0.0F;
			Static12.aFloatArray1[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static12.aFloatArray1, 0);
		} else {
			super.aClass133_Sub3_42.method7375(this.aClass12_3.aClass167_Sub3Array2[0]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub3_42.method7342(8448, 260);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (super.aClass133_Sub3_42.anInt8573 > 0) {
			@Pc(11) float local11 = -0.5F / (float) super.aClass133_Sub3_42.anInt8573;
			super.aClass133_Sub3_42.method7368(1);
			Static12.aFloatArray1[1] = 0.0F;
			Static12.aFloatArray1[0] = 0.0F;
			Static12.aFloatArray1[2] = local11;
			Static12.aFloatArray1[3] = super.aClass133_Sub3_42.aFloat168 * local11 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static12.aFloatArray1, 0);
			OpenGL.glPopMatrix();
			super.aClass133_Sub3_42.method7391(0.5F, (float) super.aClass133_Sub3_42.anInt8573);
			super.aClass133_Sub3_42.method7375(this.aClass167_Sub2_1);
			super.aClass133_Sub3_42.method7368(0);
		}
		this.aClass169_2.method4025('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		this.aClass169_2.method4025('\u0001');
		if (super.aClass133_Sub3_42.anInt8573 > 0) {
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7375(null);
			super.aClass133_Sub3_42.method7391(1.0F, 0.0F);
			super.aClass133_Sub3_42.method7368(0);
		}
		super.aClass133_Sub3_42.method7342(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	private void method4090() {
		this.aClass169_2 = new Class169(super.aClass133_Sub3_42, 2);
		this.aClass169_2.method4029(0);
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7342(260, 7681);
		super.aClass133_Sub3_42.method7326(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass133_Sub3_42.method7368(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass12_3.aBoolean10) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass169_2.method4027();
		this.aClass169_2.method4029(1);
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7342(8448, 8448);
		super.aClass133_Sub3_42.method7326(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass133_Sub3_42.method7368(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass12_3.aBoolean10) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass169_2.method4027();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
	}
}
