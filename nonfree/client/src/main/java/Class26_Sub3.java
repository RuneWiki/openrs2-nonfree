import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!mba;")
	private final Class145_Sub1_Sub1 aClass145_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!oc;")
	private final Class270 aClass270_3;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!kf;")
	private final Class208 aClass208_1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!mba;Lclient!nca;Lclient!oc;)V")
	public Class26_Sub3(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class270 arg2) {
		super(arg0);
		this.aClass145_Sub1_Sub1_3 = arg0;
		this.aClass270_3 = arg2;
		if (arg1 != null && this.aClass270_3.method6535() && this.aClass145_Sub1_Sub1_3.aBoolean532) {
			this.aClass208_1 = Static127.method1859(arg1.method6104("gl", "transparent_water"), this.aClass145_Sub1_Sub1_3);
		} else {
			this.aClass208_1 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
		super.aClass145_Sub1_21.method9725(Static162.aClass293_4, Static679.aClass293_5);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass208_1.anInt5014);
		OpenGL.glEnable(34336);
		super.aClass145_Sub1_21.method9813(Static240.aClass352_6, 0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass270_3.aBoolean614) {
			@Pc(12) float local12 = (float) (super.aClass145_Sub1_21.anInt11263 % 4000) / 4000.0F;
			super.aClass145_Sub1_21.method9754(this.aClass270_3.anInterface7_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(38) int local38 = super.aClass145_Sub1_21.anInt11263 % 4000 * 16 / 4000;
			super.aClass145_Sub1_21.method9754(this.aClass270_3.anInterface4Array2[local38]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.aClass208_1 != null;
	}
}
