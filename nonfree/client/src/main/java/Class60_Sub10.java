import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class60_Sub10 extends Class60 {

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Lclient!oia;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_11;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Lclient!uw;")
	private final Class367 aClass367_7;

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "Lclient!ll;")
	private final Class228 aClass228_5;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!oia;Lclient!gj;Lclient!uw;)V")
	public Class60_Sub10(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class367 arg2) {
		super(arg0);
		this.aClass16_Sub1_Sub2_11 = arg0;
		this.aClass367_7 = arg2;
		if (arg1 != null && this.aClass367_7.method8229() && this.aClass16_Sub1_Sub2_11.aBoolean578) {
			this.aClass228_5 = Static161.method2737(this.aClass16_Sub1_Sub2_11, arg1.method3119("gl", "transparent_water"));
		} else {
			this.aClass228_5 = null;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub1_23.method6241(Static333.aClass11_3, Static19.aClass11_1);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return this.aClass228_5 != null;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass228_5.anInt6206);
		OpenGL.glEnable(34336);
		super.aClass16_Sub1_23.method6284(Static622.aClass188_4, 0);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass367_7.aBoolean714) {
			@Pc(40) float local40 = (float) (super.aClass16_Sub1_23.anInt7468 % 4000) / 4000.0F;
			super.aClass16_Sub1_23.method6197(this.aClass367_7.anInterface24_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(13) int local13 = super.aClass16_Sub1_23.anInt7468 % 4000 * 16 / 4000;
			super.aClass16_Sub1_23.method6197(this.aClass367_7.anInterface11Array1[local13]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		super.aClass16_Sub1_23.method6284(Static70.aClass188_1, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
