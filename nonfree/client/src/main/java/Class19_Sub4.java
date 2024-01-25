import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!haa", name = "A", descriptor = "Lclient!hj;")
	private final Class82_Sub3_Sub1 aClass82_Sub3_Sub1_3;

	@OriginalMember(owner = "client!haa", name = "z", descriptor = "Lclient!ep;")
	private final Class96 aClass96_1;

	@OriginalMember(owner = "client!haa", name = "x", descriptor = "Lclient!jfa;")
	private final Class173 aClass173_1;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!hj;Lclient!uu;Lclient!ep;)V")
	public Class19_Sub4(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class96 arg2) {
		super(arg0);
		this.aClass82_Sub3_Sub1_3 = arg0;
		this.aClass96_1 = arg2;
		if (arg1 != null && this.aClass96_1.method2362() && this.aClass82_Sub3_Sub1_3.aBoolean324) {
			this.aClass173_1 = Static248.method4177(this.aClass82_Sub3_Sub1_3, arg1.method8142("transparent_water", "gl"));
		} else {
			this.aClass173_1 = null;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub3_23.method4908(Static418.aClass88_2, Static443.aClass88_3);
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.aClass173_1 != null;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass173_1.anInt5118);
		OpenGL.glEnable(34336);
		super.aClass82_Sub3_23.method4928(0, Static430.aClass165_3);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass96_1.aBoolean215) {
			@Pc(44) float local44 = (float) (super.aClass82_Sub3_23.anInt5838 % 4000) / 4000.0F;
			super.aClass82_Sub3_23.method4972(this.aClass96_1.anInterface20_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass82_Sub3_23.anInt5838 % 4000 * 16 / 4000;
			super.aClass82_Sub3_23.method4972(this.aClass96_1.anInterface6Array2[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
