import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Lclient!vb;")
	private final Class343 aClass343_2;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!qda;")
	private final Class271 aClass271_1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!us;Lclient!vb;)V")
	public Class60_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		this.aClass343_2 = arg1;
		this.aClass271_1 = new Class271(arg0, 2);
		this.aClass271_1.method6059(0);
		super.aClass43_Sub3_43.method7277(1);
		if (this.aClass343_2.aBoolean698) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass43_Sub3_43.method7277(0);
		this.aClass271_1.method6054();
		this.aClass271_1.method6059(1);
		super.aClass43_Sub3_43.method7277(1);
		if (this.aClass343_2.aBoolean698) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass43_Sub3_43.method7277(0);
		this.aClass271_1.method6054();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		super.aClass43_Sub3_43.method7220(arg1);
		super.aClass43_Sub3_43.method7281(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		this.aClass271_1.method6056('\u0000');
		if (this.aClass343_2.aBoolean698) {
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7220(this.aClass343_2.aClass34_Sub3_1);
			super.aClass43_Sub3_43.method7277(0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		this.aClass271_1.method6056('\u0001');
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(null);
		super.aClass43_Sub3_43.method7277(0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(44) float local44 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(52) boolean local52 = (arg1 & 0x80) != 0;
		super.aClass43_Sub3_43.method7277(1);
		if (local52) {
			Static449.aFloatArray61[3] = 0.0F;
			Static449.aFloatArray61[0] = local44;
			Static449.aFloatArray61[2] = 0.0F;
			Static449.aFloatArray61[1] = 0.0F;
		} else {
			Static449.aFloatArray61[0] = 0.0F;
			Static449.aFloatArray61[2] = local44;
			Static449.aFloatArray61[3] = 0.0F;
			Static449.aFloatArray61[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static449.aFloatArray61, 0);
		Static449.aFloatArray61[0] = 0.0F;
		Static449.aFloatArray61[2] = 0.0F;
		Static449.aFloatArray61[1] = local44;
		Static449.aFloatArray61[3] = (float) super.aClass43_Sub3_43.anInt8735 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static449.aFloatArray61, 0);
		if (this.aClass343_2.aBoolean698) {
			Static449.aFloatArray61[2] = 0.0F;
			Static449.aFloatArray61[1] = 0.0F;
			Static449.aFloatArray61[3] = (float) super.aClass43_Sub3_43.anInt8735 * local25 % 1.0F;
			Static449.aFloatArray61[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static449.aFloatArray61, 0);
		} else {
			@Pc(170) int local170 = (int) ((float) super.aClass43_Sub3_43.anInt8735 * local25 * 16.0F);
			super.aClass43_Sub3_43.method7220(this.aClass343_2.aClass34_Sub2Array4[local170 % 16]);
		}
		super.aClass43_Sub3_43.method7277(0);
	}
}
