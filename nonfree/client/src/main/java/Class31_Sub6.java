import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class31_Sub6 extends Class31 {

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "Lclient!ui;")
	private final Class353 aClass353_4;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Lclient!ko;")
	private final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "Lclient!hka;")
	private final Class146 aClass146_5;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!ko;Lclient!wia;Lclient!ui;)V")
	public Class31_Sub6(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class353 arg2) {
		super(arg0);
		this.aClass353_4 = arg2;
		this.aClass137_Sub1_Sub1_9 = arg0;
		if (arg1 != null && this.aClass353_4.method8486() && this.aClass137_Sub1_Sub1_9.aBoolean404) {
			this.aClass146_5 = Static42.method929(this.aClass137_Sub1_Sub1_9, arg1.method9219("transparent_water", "gl"));
		} else {
			this.aClass146_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.aClass146_5 != null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass353_4.aBoolean715) {
			@Pc(44) float local44 = (float) (super.aClass137_Sub1_22.anInt9719 % 4000) / 4000.0F;
			super.aClass137_Sub1_22.method8007(this.aClass353_4.anInterface9_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass137_Sub1_22.anInt9719 % 4000 * 16 / 4000;
			super.aClass137_Sub1_22.method8007(this.aClass353_4.anInterface21Array1[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
		super.aClass137_Sub1_22.method7969(Static461.aClass87_5, Static15.aClass87_1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass146_5.anInt4171);
		OpenGL.glEnable(34336);
		super.aClass137_Sub1_22.method8069(0, Static567.aClass169_7);
	}
}
