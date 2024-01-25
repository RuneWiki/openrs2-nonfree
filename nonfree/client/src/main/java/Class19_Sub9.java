import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class19_Sub9 extends Class19 {

	@OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
	private boolean aBoolean813 = false;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class19_Sub9(@OriginalArg(0) Class15_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
		super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static65.aClass120_1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass15_Sub2_18.method5373();
		if (local8 == null || !arg0) {
			super.aClass15_Sub2_18.method5488(Static454.aClass85_2, 0);
			return;
		}
		super.aClass15_Sub2_18.method5410(1);
		super.aClass15_Sub2_18.method5414(local8);
		super.aClass15_Sub2_18.method5389(Static311.aClass245_2);
		super.aClass15_Sub2_18.method5410(1);
		super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static162.aClass120_2);
		super.aClass15_Sub2_18.method5404(false, Static457.aClass85_4, true, 2);
		super.aClass15_Sub2_18.method5488(Static454.aClass85_2, 0);
		@Pc(65) Class255_Sub3 local65 = super.aClass15_Sub2_18.method5465();
		local65.method8023(super.aClass15_Sub2_18.method5415());
		super.aClass15_Sub2_18.method5485(Static515.aClass359_14);
		super.aClass15_Sub2_18.method5410(0);
		this.aBoolean813 = true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		super.aClass15_Sub2_18.method5414(arg0);
		super.aClass15_Sub2_18.method5372(arg1);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		if (this.aBoolean813) {
			super.aClass15_Sub2_18.method5410(1);
			super.aClass15_Sub2_18.method5389(Static533.aClass245_4);
			super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
			super.aClass15_Sub2_18.method5444(2, Static531.aClass85_5);
			super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
			super.aClass15_Sub2_18.method5442();
			super.aClass15_Sub2_18.method5414(null);
			super.aClass15_Sub2_18.method5410(0);
			this.aBoolean813 = false;
		} else {
			super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
		}
		super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
