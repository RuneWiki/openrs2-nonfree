import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class33_Sub4 extends Class33 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "[F")
	private static final float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "Lclient!fs;")
	private final Class76 aClass76_4;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!rj;")
	private final Class203 aClass203_4;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!bf;Lclient!fs;)V", line = 75)
	public Class33_Sub4(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class76 arg1) {
		super(arg0);
		this.aClass76_4 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass203_4 = new Class203(arg0, 2);
		this.aClass203_4.method5193(0);
		this.aClass19_Sub1_35.method832(1);
		if (this.aClass76_4.aBoolean160) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass19_Sub1_35.method832(0);
		this.aClass203_4.method5192();
		this.aClass203_4.method5193(1);
		this.aClass19_Sub1_35.method832(1);
		if (this.aClass76_4.aBoolean160) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass19_Sub1_35.method832(0);
		this.aClass203_4.method5192();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 4)
	@Override
	public void method5713(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass19_Sub1_35.anOpengl1;
		this.aClass19_Sub1_35.method832(1);
		if (local35) {
			aFloatArray16[0] = local27;
			aFloatArray16[1] = 0.0F;
			aFloatArray16[2] = 0.0F;
			aFloatArray16[3] = 0.0F;
		} else {
			aFloatArray16[0] = 0.0F;
			aFloatArray16[1] = 0.0F;
			aFloatArray16[2] = local27;
			aFloatArray16[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, aFloatArray16, 0);
		aFloatArray16[0] = 0.0F;
		aFloatArray16[1] = local27;
		aFloatArray16[2] = 0.0F;
		aFloatArray16[3] = (float) this.aClass19_Sub1_35.anInt584 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, aFloatArray16, 0);
		if (this.aClass76_4.aBoolean160) {
			aFloatArray16[0] = 0.0F;
			aFloatArray16[1] = 0.0F;
			aFloatArray16[2] = 0.0F;
			aFloatArray16[3] = (float) this.aClass19_Sub1_35.anInt584 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, aFloatArray16, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass19_Sub1_35.anInt584 * 16.0F);
			this.aClass19_Sub1_35.method848(this.aClass76_4.aClass8_Sub1Array2[local127 % 16]);
		}
		this.aClass19_Sub1_35.method832(0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()V", line = 53)
	@Override
	public void method5716() {
		this.aClass203_4.method5191('\u0001');
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method848(null);
		this.aClass19_Sub1_35.method832(0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V", line = 60)
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		this.aClass203_4.method5191('\u0000');
		if (this.aClass76_4.aBoolean160) {
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(this.aClass76_4.aClass8_Sub4_1);
			this.aClass19_Sub1_35.method832(0);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()Z", line = 72)
	@Override
	public boolean method5712() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!kq;)V", line = 106)
	@Override
	public void method5711(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V", line = 112)
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
	}
}
