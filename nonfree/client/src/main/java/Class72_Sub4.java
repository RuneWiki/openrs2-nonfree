import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class72_Sub4 extends Class72 {

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "Lclient!tt;")
	private final Class331 aClass331_3;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Lclient!mr;")
	private final Class45_Sub2_Sub2 aClass45_Sub2_Sub2_7;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Lclient!iea;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!mr;Lclient!tf;Lclient!tt;)V")
	public Class72_Sub4(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass331_3 = arg2;
		this.aClass45_Sub2_Sub2_7 = arg0;
		if (arg1 != null && this.aClass331_3.method6941() && this.aClass45_Sub2_Sub2_7.aBoolean438) {
			this.aClass143_1 = Static258.method6210(arg1.method6810("transparent_water", "gl"), this.aClass45_Sub2_Sub2_7);
		} else {
			this.aClass143_1 = null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		super.aClass45_Sub2_22.method4953(0, Static164.aClass108_3);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return this.aClass143_1 != null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
		super.aClass45_Sub2_22.method4921(Static177.aClass307_2, Static534.aClass307_7);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass143_1.anInt3934);
		OpenGL.glEnable(34336);
		super.aClass45_Sub2_22.method4953(0, Static160.aClass108_2);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass331_3.aBoolean638) {
			@Pc(21) float local21 = (float) (super.aClass45_Sub2_22.anInt5856 % 4000) / 4000.0F;
			super.aClass45_Sub2_22.method4926(this.aClass331_3.anInterface14_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local21, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(46) int local46 = super.aClass45_Sub2_22.anInt5856 % 4000 * 16 / 4000;
			super.aClass45_Sub2_22.method4926(this.aClass331_3.anInterface17Array2[local46]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
