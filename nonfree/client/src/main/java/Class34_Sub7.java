import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class34_Sub7 extends Class34 {

	@OriginalMember(owner = "client!pw", name = "A", descriptor = "Lclient!hp;")
	private final Class134_Sub1_Sub1 aClass134_Sub1_Sub1_10;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "Lclient!uk;")
	private final Class331 aClass331_5;

	@OriginalMember(owner = "client!pw", name = "z", descriptor = "Lclient!wq;")
	private final Class362 aClass362_5;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!hp;Lclient!pu;Lclient!uk;)V")
	public Class34_Sub7(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class331 arg2) {
		super(arg0);
		this.aClass134_Sub1_Sub1_10 = arg0;
		this.aClass331_5 = arg2;
		if (arg1 != null && this.aClass331_5.method7305() && this.aClass134_Sub1_Sub1_10.aBoolean302) {
			this.aClass362_5 = Static27.method315(arg1.method5706("transparent_water", "gl"), this.aClass134_Sub1_Sub1_10);
		} else {
			this.aClass362_5 = null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
	@Override
	public void method7006() {
		super.aClass134_Sub1_21.method6742(0, Static430.aClass192_2);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!bb;II)V")
	@Override
	public void method7011(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7017() {
		return this.aClass362_5 != null;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7016(@OriginalArg(0) boolean arg0) {
		super.aClass134_Sub1_21.method6770(Static447.aClass82_5, Static59.aClass82_2);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7009(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass362_5.anInt9603);
		OpenGL.glEnable(34336);
		super.aClass134_Sub1_21.method6742(0, Static493.aClass192_4);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass331_5.aBoolean694) {
			@Pc(47) float local47 = (float) (super.aClass134_Sub1_21.anInt8444 % 4000) / 4000.0F;
			super.aClass134_Sub1_21.method6766(this.aClass331_5.anInterface11_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local47, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(20) int local20 = super.aClass134_Sub1_21.anInt8444 % 4000 * 16 / 4000;
			super.aClass134_Sub1_21.method6766(this.aClass331_5.anInterface14Array1[local20]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
