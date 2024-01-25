import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class33_Sub5 extends Class33 {

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "Lclient!go;")
	private final Class130 aClass130_4;

	@OriginalMember(owner = "client!oia", name = "p", descriptor = "Lclient!oi;")
	private final Class261 aClass261_4;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!qfa;Lclient!go;)V")
	public Class33_Sub5(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class130 arg1) {
		super(arg0);
		this.aClass130_4 = arg1;
		this.aClass261_4 = new Class261(arg0, 2);
		this.aClass261_4.method6286(0);
		super.aClass137_Sub3_42.method7095(1);
		if (this.aClass130_4.aBoolean273) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass137_Sub3_42.method7095(0);
		this.aClass261_4.method6287();
		this.aClass261_4.method6286(1);
		super.aClass137_Sub3_42.method7095(1);
		if (this.aClass130_4.aBoolean273) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass137_Sub3_42.method7095(0);
		this.aClass261_4.method6287();
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		this.aClass261_4.method6285('\u0000');
		if (this.aClass130_4.aBoolean273) {
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7090(this.aClass130_4.aClass66_Sub2_2);
			super.aClass137_Sub3_42.method7095(0);
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		this.aClass261_4.method6285('\u0001');
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090((Class66) null);
		super.aClass137_Sub3_42.method7095(0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		super.aClass137_Sub3_42.method7090(arg1);
		super.aClass137_Sub3_42.method7077(arg0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(41) boolean local41 = (arg0 & 0x80) != 0;
		super.aClass137_Sub3_42.method7095(1);
		if (local41) {
			Static487.aFloatArray70[2] = 0.0F;
			Static487.aFloatArray70[3] = 0.0F;
			Static487.aFloatArray70[1] = 0.0F;
			Static487.aFloatArray70[0] = local33;
		} else {
			Static487.aFloatArray70[2] = local33;
			Static487.aFloatArray70[0] = 0.0F;
			Static487.aFloatArray70[1] = 0.0F;
			Static487.aFloatArray70[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static487.aFloatArray70, 0);
		Static487.aFloatArray70[1] = local33;
		Static487.aFloatArray70[3] = local14 * (float) super.aClass137_Sub3_42.anInt8544 % 1.0F;
		Static487.aFloatArray70[0] = 0.0F;
		Static487.aFloatArray70[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static487.aFloatArray70, 0);
		if (this.aClass130_4.aBoolean273) {
			Static487.aFloatArray70[1] = 0.0F;
			Static487.aFloatArray70[0] = 0.0F;
			Static487.aFloatArray70[3] = local25 * (float) super.aClass137_Sub3_42.anInt8544 % 1.0F;
			Static487.aFloatArray70[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static487.aFloatArray70, 0);
		} else {
			@Pc(159) int local159 = (int) (local25 * (float) super.aClass137_Sub3_42.anInt8544 * 16.0F);
			super.aClass137_Sub3_42.method7090(this.aClass130_4.aClass66_Sub1Array2[local159 % 16]);
		}
		super.aClass137_Sub3_42.method7095(0);
	}
}
