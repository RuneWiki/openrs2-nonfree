import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class160_Sub5 extends Class160 {

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "Lclient!pia;")
	private final Class288 aClass288_4;

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "Lclient!fga;")
	private final Class113 aClass113_4;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!vf;Lclient!pia;)V")
	public Class160_Sub5(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class288 arg1) {
		super(arg0);
		this.aClass288_4 = arg1;
		this.aClass113_4 = new Class113(arg0, 2);
		this.aClass113_4.method2789(0);
		super.aClass100_Sub3_40.method8678(1);
		if (this.aClass288_4.aBoolean504) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass100_Sub3_40.method8678(0);
		this.aClass113_4.method2790();
		this.aClass113_4.method2789(1);
		super.aClass100_Sub3_40.method8678(1);
		if (this.aClass288_4.aBoolean504) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass100_Sub3_40.method8678(0);
		this.aClass113_4.method2790();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		this.aClass113_4.method2793('\u0001');
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743((Class29) null);
		super.aClass100_Sub3_40.method8678(0);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		super.aClass100_Sub3_40.method8743(arg0);
		super.aClass100_Sub3_40.method8671(arg1);
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) float local24 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(35) float local35 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(44) float local44 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(56) boolean local56 = (arg0 & 0x80) != 0;
		super.aClass100_Sub3_40.method8678(1);
		if (local56) {
			Static342.aFloatArray50[2] = 0.0F;
			Static342.aFloatArray50[3] = 0.0F;
			Static342.aFloatArray50[1] = 0.0F;
			Static342.aFloatArray50[0] = local44;
		} else {
			Static342.aFloatArray50[1] = 0.0F;
			Static342.aFloatArray50[3] = 0.0F;
			Static342.aFloatArray50[0] = 0.0F;
			Static342.aFloatArray50[2] = local44;
		}
		OpenGL.glTexGenfv(8192, 9474, Static342.aFloatArray50, 0);
		Static342.aFloatArray50[3] = local24 * (float) super.aClass100_Sub3_40.anInt10257 % 1.0F;
		Static342.aFloatArray50[0] = 0.0F;
		Static342.aFloatArray50[1] = local44;
		Static342.aFloatArray50[2] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static342.aFloatArray50, 0);
		if (this.aClass288_4.aBoolean504) {
			Static342.aFloatArray50[2] = 0.0F;
			Static342.aFloatArray50[0] = 0.0F;
			Static342.aFloatArray50[3] = (float) super.aClass100_Sub3_40.anInt10257 * local35 % 1.0F;
			Static342.aFloatArray50[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static342.aFloatArray50, 0);
		} else {
			@Pc(148) int local148 = (int) ((float) super.aClass100_Sub3_40.anInt10257 * 16.0F * local35);
			super.aClass100_Sub3_40.method8743(this.aClass288_4.aClass29_Sub3Array4[local148 % 16]);
		}
		super.aClass100_Sub3_40.method8678(0);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		this.aClass113_4.method2793('\u0000');
		if (this.aClass288_4.aBoolean504) {
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8743(this.aClass288_4.aClass29_Sub1_2);
			super.aClass100_Sub3_40.method8678(0);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
	}
}
