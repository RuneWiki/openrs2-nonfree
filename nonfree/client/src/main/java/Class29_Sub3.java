import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!cia", name = "u", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class29_Sub3(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return true;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		@Pc(15) Interface3 local15 = super.aClass5_Sub1_22.method5681();
		if (local15 == null || !arg0) {
			super.aClass5_Sub1_22.method5592(Static578.aClass9_5, 0);
			return;
		}
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5609(local15);
		super.aClass5_Sub1_22.method5620(Static281.aClass99_22);
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static275.aClass374_1);
		super.aClass5_Sub1_22.method5618(false, true, 2, Static482.aClass9_4);
		super.aClass5_Sub1_22.method5592(Static578.aClass9_5, 0);
		@Pc(71) Class39_Sub1 local71 = super.aClass5_Sub1_22.method5678();
		local71.method1565(super.aClass5_Sub1_22.method5569());
		super.aClass5_Sub1_22.method5589(Static96.aClass340_1);
		super.aClass5_Sub1_22.method5571(0);
		this.aBoolean105 = true;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static514.aClass374_5);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass5_Sub1_22.method5609(arg1);
		super.aClass5_Sub1_22.method5697(arg0);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		if (this.aBoolean105) {
			super.aClass5_Sub1_22.method5571(1);
			super.aClass5_Sub1_22.method5620(Static540.aClass99_23);
			super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
			super.aClass5_Sub1_22.method5583(Static161.aClass9_3, 2);
			super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
			super.aClass5_Sub1_22.method5683();
			super.aClass5_Sub1_22.method5609(null);
			super.aClass5_Sub1_22.method5571(0);
			this.aBoolean105 = false;
		} else {
			super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
		}
		super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
	}
}
