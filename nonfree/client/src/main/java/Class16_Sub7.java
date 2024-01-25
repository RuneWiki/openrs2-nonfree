import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class16_Sub7 extends Class16 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!dja;")
	private final Class65 aClass65_6;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Lclient!fo;")
	private final Class107 aClass107_5;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!ac;Lclient!dja;)V")
	public Class16_Sub7(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class65 arg1) {
		super(arg0);
		this.aClass65_6 = arg1;
		this.aClass107_5 = new Class107(arg0, 2);
		this.aClass107_5.method3155(0);
		super.aClass5_Sub1_42.method334(1);
		if (this.aClass65_6.aBoolean234) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass5_Sub1_42.method334(0);
		this.aClass107_5.method3154();
		this.aClass107_5.method3155(1);
		super.aClass5_Sub1_42.method334(1);
		if (this.aClass65_6.aBoolean234) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass5_Sub1_42.method334(0);
		this.aClass107_5.method3154();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		this.aClass107_5.method3156('\u0001');
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352((Class2) null);
		super.aClass5_Sub1_42.method334(0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return true;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub1_42.method352(arg0);
		super.aClass5_Sub1_42.method385(arg1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass5_Sub1_42.method334(1);
		@Pc(58) boolean local58 = (arg0 & 0x80) != 0;
		if (local58) {
			Static626.aFloatArray77[0] = local36;
			Static626.aFloatArray77[2] = 0.0F;
			Static626.aFloatArray77[3] = 0.0F;
			Static626.aFloatArray77[1] = 0.0F;
		} else {
			Static626.aFloatArray77[3] = 0.0F;
			Static626.aFloatArray77[0] = 0.0F;
			Static626.aFloatArray77[2] = local36;
			Static626.aFloatArray77[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static626.aFloatArray77, 0);
		Static626.aFloatArray77[0] = 0.0F;
		Static626.aFloatArray77[1] = local36;
		Static626.aFloatArray77[3] = (float) super.aClass5_Sub1_42.anInt361 * local14 % 1.0F;
		Static626.aFloatArray77[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static626.aFloatArray77, 0);
		if (this.aClass65_6.aBoolean234) {
			Static626.aFloatArray77[0] = 0.0F;
			Static626.aFloatArray77[3] = local25 * (float) super.aClass5_Sub1_42.anInt361 % 1.0F;
			Static626.aFloatArray77[2] = 0.0F;
			Static626.aFloatArray77[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static626.aFloatArray77, 0);
		} else {
			@Pc(171) int local171 = (int) (local25 * 16.0F * (float) super.aClass5_Sub1_42.anInt361);
			super.aClass5_Sub1_42.method352(this.aClass65_6.aClass2_Sub1Array2[local171 % 16]);
		}
		super.aClass5_Sub1_42.method334(0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		this.aClass107_5.method3156('\u0000');
		if (this.aClass65_6.aBoolean234) {
			super.aClass5_Sub1_42.method334(1);
			super.aClass5_Sub1_42.method352(this.aClass65_6.aClass2_Sub4_3);
			super.aClass5_Sub1_42.method334(0);
		}
	}
}
