import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class112_Sub5 extends Class112 {

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!pha;")
	private Class290 aClass290_5;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!qf;")
	private final Class308 aClass308_3;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!iia;")
	private final Class64_Sub3 aClass64_Sub3_1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!uja;Lclient!qf;)V")
	public Class112_Sub5(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class308 arg1) {
		super(arg0);
		this.aClass308_3 = arg1;
		this.method7184();
		this.aClass64_Sub3_1 = new Class64_Sub3(super.aClass145_Sub3_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass64_Sub3_1.method3819();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
		super.aClass145_Sub3_43.method8897(8448, 260);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		this.aClass290_5.method6987('\u0001');
		if (super.aClass145_Sub3_43.anInt10187 > 0) {
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8872((Class64) null);
			super.aClass145_Sub3_43.method8876(1.0F, 0.0F);
			super.aClass145_Sub3_43.method8859(0);
		}
		super.aClass145_Sub3_43.method8897(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		if (super.aClass145_Sub3_43.anInt10187 > 0) {
			@Pc(19) float local19 = -0.5F / (float) super.aClass145_Sub3_43.anInt10187;
			super.aClass145_Sub3_43.method8859(1);
			Static138.aFloatArray18[2] = local19;
			Static138.aFloatArray18[0] = 0.0F;
			Static138.aFloatArray18[1] = 0.0F;
			Static138.aFloatArray18[3] = super.aClass145_Sub3_43.aFloat160 * local19 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static138.aFloatArray18, 0);
			OpenGL.glPopMatrix();
			super.aClass145_Sub3_43.method8876(0.5F, (float) super.aClass145_Sub3_43.anInt10187);
			super.aClass145_Sub3_43.method8872(this.aClass64_Sub3_1);
			super.aClass145_Sub3_43.method8859(0);
		}
		this.aClass290_5.method6987('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	private void method7184() {
		this.aClass290_5 = new Class290(super.aClass145_Sub3_43, 2);
		this.aClass290_5.method6989(0);
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8897(260, 7681);
		super.aClass145_Sub3_43.method8854(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass145_Sub3_43.method8859(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass308_3.aBoolean703) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass290_5.method6988();
		this.aClass290_5.method6989(1);
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8897(8448, 8448);
		super.aClass145_Sub3_43.method8854(0, 5890, 768);
		OpenGL.glDisable(3168);
		super.aClass145_Sub3_43.method8859(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass308_3.aBoolean703) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass290_5.method6988();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass308_3.aBoolean703) {
				super.aClass145_Sub3_43.method8872(this.aClass308_3.aClass64_Sub1_1);
				Static138.aFloatArray18[2] = 0.0F;
				Static138.aFloatArray18[3] = (float) (super.aClass145_Sub3_43.anInt10142 % 4000) / 4000.0F;
				Static138.aFloatArray18[0] = 0.0F;
				Static138.aFloatArray18[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static138.aFloatArray18, 0);
			} else {
				@Pc(118) int local118 = super.aClass145_Sub3_43.anInt10142 % 4000 * 16 / 4000;
				super.aClass145_Sub3_43.method8872(this.aClass308_3.aClass64_Sub4Array3[local118]);
			}
		} else if (this.aClass308_3.aBoolean703) {
			super.aClass145_Sub3_43.method8872(this.aClass308_3.aClass64_Sub1_1);
			Static138.aFloatArray18[1] = 0.0F;
			Static138.aFloatArray18[2] = 0.0F;
			Static138.aFloatArray18[3] = 0.0F;
			Static138.aFloatArray18[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static138.aFloatArray18, 0);
		} else {
			super.aClass145_Sub3_43.method8872(this.aClass308_3.aClass64_Sub4Array3[0]);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return true;
	}
}
