import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class87_Sub6 extends Class87 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Lclient!bo;")
	private final Class29 aClass29_3;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!gi;")
	private final Class81 aClass81_4;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ql;Lclient!bo;)V")
	public Class87_Sub6(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class29 arg1) {
		super(arg0);
		this.aClass29_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass81_4 = new Class81(arg0, 2);
		this.aClass81_4.method1877(0);
		this.aClass92_Sub2_40.method4568(1);
		if (this.aClass29_3.aBoolean28) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass92_Sub2_40.method4568(0);
		this.aClass81_4.method1876();
		this.aClass81_4.method1877(1);
		this.aClass92_Sub2_40.method4568(1);
		if (this.aClass29_3.aBoolean28) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass92_Sub2_40.method4568(0);
		this.aClass81_4.method1876();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	@Override
	public void method5655(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass92_Sub2_40.anOpengl2;
		this.aClass92_Sub2_40.method4568(1);
		if (local35) {
			Static231.aFloatArray9[0] = local27;
			Static231.aFloatArray9[1] = 0.0F;
			Static231.aFloatArray9[2] = 0.0F;
			Static231.aFloatArray9[3] = 0.0F;
		} else {
			Static231.aFloatArray9[0] = 0.0F;
			Static231.aFloatArray9[1] = 0.0F;
			Static231.aFloatArray9[2] = local27;
			Static231.aFloatArray9[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static231.aFloatArray9, 0);
		Static231.aFloatArray9[0] = 0.0F;
		Static231.aFloatArray9[1] = local27;
		Static231.aFloatArray9[2] = 0.0F;
		Static231.aFloatArray9[3] = (float) this.aClass92_Sub2_40.anInt5384 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static231.aFloatArray9, 0);
		if (this.aClass29_3.aBoolean28) {
			Static231.aFloatArray9[0] = 0.0F;
			Static231.aFloatArray9[1] = 0.0F;
			Static231.aFloatArray9[2] = 0.0F;
			Static231.aFloatArray9[3] = (float) this.aClass92_Sub2_40.anInt5384 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static231.aFloatArray9, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass92_Sub2_40.anInt5384 * 16.0F);
			this.aClass92_Sub2_40.method4548(this.aClass29_3.aClass70_Sub4Array3[local127 % 16]);
		}
		this.aClass92_Sub2_40.method4568(0);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!na;)V")
	@Override
	public void method5654(@OriginalArg(0) Class70 arg0) {
		this.aClass92_Sub2_40.method4548(arg0);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
	@Override
	public void method5653(@OriginalArg(0) boolean arg0) {
		this.aClass81_4.method1875('\u0000');
		if (this.aClass29_3.aBoolean28) {
			this.aClass92_Sub2_40.method4568(1);
			this.aClass92_Sub2_40.method4548(this.aClass29_3.aClass70_Sub3_2);
			this.aClass92_Sub2_40.method4568(0);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	@Override
	public void method5652(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	@Override
	public void method5651() {
		this.aClass81_4.method1875('\u0001');
		this.aClass92_Sub2_40.method4568(1);
		this.aClass92_Sub2_40.method4548(null);
		this.aClass92_Sub2_40.method4568(0);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "()Z")
	@Override
	public boolean method5656() {
		return true;
	}
}
