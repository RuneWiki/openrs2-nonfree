import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!dc;")
	private final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_5;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "Lclient!mca;")
	private final Class217 aClass217_3;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!mi;")
	private final Class225 aClass225_1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!dc;Lclient!bi;Lclient!mca;)V")
	public Class93_Sub1(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class217 arg2) {
		super(arg0);
		this.aClass66_Sub1_Sub1_5 = arg0;
		this.aClass217_3 = arg2;
		if (this.aClass217_3.method4879() && this.aClass66_Sub1_Sub1_5.aBoolean189) {
			this.aClass225_1 = Static59.method860(arg1.method662("gl", "transparent_water"), this.aClass66_Sub1_Sub1_5);
		} else {
			this.aClass225_1 = null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass217_3.aBoolean428) {
			@Pc(20) float local20 = (float) (super.aClass66_Sub1_19.anInt8419 % 4000) / 4000.0F;
			super.aClass66_Sub1_19.method6979(this.aClass217_3.anInterface12_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local20, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(45) int local45 = super.aClass66_Sub1_19.anInt8419 % 4000 * 16 / 4000;
			super.aClass66_Sub1_19.method6979(this.aClass217_3.anInterface2Array2[local45]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		super.aClass66_Sub1_19.method6923(Static22.aClass120_2, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass225_1.anInt5862);
		OpenGL.glEnable(34336);
		super.aClass66_Sub1_19.method6923(Static232.aClass120_4, 0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub1_19.method6997(Static174.aClass240_2, Static598.aClass240_5);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return this.aClass225_1 != null;
	}
}
