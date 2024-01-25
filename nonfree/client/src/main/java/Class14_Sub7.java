import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
	private boolean aBoolean556 = false;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class14_Sub7(@OriginalArg(0) Class143_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	@Override
	public void method8619() {
		if (this.aBoolean556) {
			super.aClass143_Sub1_22.method6374(1);
			super.aClass143_Sub1_22.method6299(Static305.aClass271_15);
			super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
			super.aClass143_Sub1_22.method6290(Static85.aClass90_1, 2);
			super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
			super.aClass143_Sub1_22.method6282();
			super.aClass143_Sub1_22.method6338((Interface4) null);
			super.aClass143_Sub1_22.method6374(0);
			this.aBoolean556 = false;
		} else {
			super.aClass143_Sub1_22.method6391(0, Static663.aClass90_4);
		}
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static600.aClass6_4);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8625(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface1 local14 = super.aClass143_Sub1_22.method6280();
		if (local14 == null || !arg0) {
			super.aClass143_Sub1_22.method6391(0, Static619.aClass90_3);
			return;
		}
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6338(local14);
		super.aClass143_Sub1_22.method6299(Static552.aClass271_34);
		super.aClass143_Sub1_22.method6374(1);
		super.aClass143_Sub1_22.method6370(Static460.aClass6_3, Static371.aClass6_2);
		super.aClass143_Sub1_22.method6291(2, false, Static85.aClass90_2, true);
		super.aClass143_Sub1_22.method6391(0, Static619.aClass90_3);
		@Pc(74) Class56_Sub2 local74 = super.aClass143_Sub1_22.method6277();
		local74.method6825(super.aClass143_Sub1_22.method6272());
		super.aClass143_Sub1_22.method6307(Static357.aClass270_5);
		super.aClass143_Sub1_22.method6374(0);
		this.aBoolean556 = true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!dr;I)V")
	@Override
	public void method8620(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		super.aClass143_Sub1_22.method6338(arg0);
		super.aClass143_Sub1_22.method6322(arg1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	@Override
	public void method8615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8624() {
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8617(@OriginalArg(0) boolean arg0) {
		super.aClass143_Sub1_22.method6370(Static600.aClass6_4, Static371.aClass6_2);
	}
}
