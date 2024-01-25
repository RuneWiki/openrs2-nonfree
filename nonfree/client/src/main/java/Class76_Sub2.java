import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!sda;")
	private final Class303 aClass303_1;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!hg;")
	private final Class136 aClass136_3;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!ok;Lclient!sda;)V")
	public Class76_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class303 arg1) {
		super(arg0);
		this.aClass303_1 = arg1;
		this.aClass136_3 = new Class136(arg0, 2);
		this.aClass136_3.method2920(0);
		super.aClass134_Sub2_43.method5197(1);
		if (this.aClass303_1.aBoolean616) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass134_Sub2_43.method5197(0);
		this.aClass136_3.method2918();
		this.aClass136_3.method2920(1);
		super.aClass134_Sub2_43.method5197(1);
		if (this.aClass303_1.aBoolean616) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass134_Sub2_43.method5197(0);
		this.aClass136_3.method2918();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		this.aClass136_3.method2915('\u0000');
		if (this.aClass303_1.aBoolean616) {
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5202(this.aClass303_1.aClass40_Sub2_3);
			super.aClass134_Sub2_43.method5197(0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		super.aClass134_Sub2_43.method5202(arg1);
		super.aClass134_Sub2_43.method5194(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) float local18 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(29) float local29 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(37) float local37 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass134_Sub2_43.method5197(1);
		@Pc(50) boolean local50 = (arg0 & 0x80) != 0;
		if (local50) {
			Static559.aFloatArray61[2] = 0.0F;
			Static559.aFloatArray61[1] = 0.0F;
			Static559.aFloatArray61[0] = local37;
			Static559.aFloatArray61[3] = 0.0F;
		} else {
			Static559.aFloatArray61[3] = 0.0F;
			Static559.aFloatArray61[0] = 0.0F;
			Static559.aFloatArray61[2] = local37;
			Static559.aFloatArray61[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static559.aFloatArray61, 0);
		Static559.aFloatArray61[1] = local37;
		Static559.aFloatArray61[2] = 0.0F;
		Static559.aFloatArray61[0] = 0.0F;
		Static559.aFloatArray61[3] = (float) super.aClass134_Sub2_43.anInt6551 * local18 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static559.aFloatArray61, 0);
		if (this.aClass303_1.aBoolean616) {
			Static559.aFloatArray61[0] = 0.0F;
			Static559.aFloatArray61[2] = 0.0F;
			Static559.aFloatArray61[3] = local29 * (float) super.aClass134_Sub2_43.anInt6551 % 1.0F;
			Static559.aFloatArray61[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static559.aFloatArray61, 0);
		} else {
			@Pc(163) int local163 = (int) (local29 * 16.0F * (float) super.aClass134_Sub2_43.anInt6551);
			super.aClass134_Sub2_43.method5202(this.aClass303_1.aClass40_Sub3Array4[local163 % 16]);
		}
		super.aClass134_Sub2_43.method5197(0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		this.aClass136_3.method2915('\u0001');
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(null);
		super.aClass134_Sub2_43.method5197(0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
	}
}
