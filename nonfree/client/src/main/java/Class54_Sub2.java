import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!mk;")
	private final Class135 aClass135_2;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!fr;")
	private final Class76 aClass76_2;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ge;Lclient!mk;)V")
	public Class54_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_2 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass76_2 = new Class76(arg0, 2);
		this.aClass76_2.method1585(0);
		this.aClass81_Sub1_37.method1953(1);
		if (this.aClass135_2.aBoolean278) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass81_Sub1_37.method1953(0);
		this.aClass76_2.method1584();
		this.aClass76_2.method1585(1);
		this.aClass81_Sub1_37.method1953(1);
		if (this.aClass135_2.aBoolean278) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass81_Sub1_37.method1953(0);
		this.aClass76_2.method1584();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!mo;)V")
	@Override
	public void method5296(@OriginalArg(0) Class28 arg0) {
		this.aClass81_Sub1_37.method2022(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
	@Override
	public void method5298() {
		this.aClass76_2.method1586('\u0001');
		this.aClass81_Sub1_37.method1953(1);
		this.aClass81_Sub1_37.method2022(null);
		this.aClass81_Sub1_37.method1953(0);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	@Override
	public void method5299(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass81_Sub1_37.method1953(1);
		if (local35) {
			Static70.aFloatArray3[0] = local27;
			Static70.aFloatArray3[1] = 0.0F;
			Static70.aFloatArray3[2] = 0.0F;
			Static70.aFloatArray3[3] = 0.0F;
		} else {
			Static70.aFloatArray3[0] = 0.0F;
			Static70.aFloatArray3[1] = 0.0F;
			Static70.aFloatArray3[2] = local27;
			Static70.aFloatArray3[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static70.aFloatArray3, 0);
		Static70.aFloatArray3[0] = 0.0F;
		Static70.aFloatArray3[1] = local27;
		Static70.aFloatArray3[2] = 0.0F;
		Static70.aFloatArray3[3] = (float) this.aClass81_Sub1_37.anInt1804 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static70.aFloatArray3, 0);
		if (this.aClass135_2.aBoolean278) {
			Static70.aFloatArray3[0] = 0.0F;
			Static70.aFloatArray3[1] = 0.0F;
			Static70.aFloatArray3[2] = 0.0F;
			Static70.aFloatArray3[3] = (float) this.aClass81_Sub1_37.anInt1804 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static70.aFloatArray3, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass81_Sub1_37.anInt1804 * 16.0F);
			this.aClass81_Sub1_37.method2022(this.aClass135_2.aClass28_Sub3Array4[local127 % 16]);
		}
		this.aClass81_Sub1_37.method1953(0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		this.aClass76_2.method1586('\u0000');
		if (this.aClass135_2.aBoolean278) {
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method2022(this.aClass135_2.aClass28_Sub4_1);
			this.aClass81_Sub1_37.method1953(0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}
}
