import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class37_Sub7 extends Class37 {

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class37_Sub7(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static477.aClass238_4);
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		if (this.aBoolean648) {
			super.aClass9_Sub3_19.method5482(1);
			super.aClass9_Sub3_19.method5483(Static506.aClass71_4);
			super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
			super.aClass9_Sub3_19.method5596(Static140.aClass50_2, 2);
			super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
			super.aClass9_Sub3_19.method5498();
			super.aClass9_Sub3_19.method5494(null);
			super.aClass9_Sub3_19.method5482(0);
			this.aBoolean648 = false;
		} else {
			super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
		}
		super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface22 local13 = super.aClass9_Sub3_19.method5527();
		if (local13 == null || !arg0) {
			super.aClass9_Sub3_19.method5543(Static237.aClass50_3, 0);
			return;
		}
		super.aClass9_Sub3_19.method5482(1);
		super.aClass9_Sub3_19.method5494(local13);
		super.aClass9_Sub3_19.method5483(Static338.aClass71_2);
		super.aClass9_Sub3_19.method5482(1);
		super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static71.aClass238_1);
		super.aClass9_Sub3_19.method5491(false, true, Static49.aClass50_1, 2);
		super.aClass9_Sub3_19.method5543(Static237.aClass50_3, 0);
		@Pc(64) Class8_Sub3 local64 = super.aClass9_Sub3_19.method5553();
		local64.method8194(super.aClass9_Sub3_19.method5548());
		super.aClass9_Sub3_19.method5481(Static204.aClass340_7);
		super.aClass9_Sub3_19.method5482(0);
		this.aBoolean648 = true;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super.aClass9_Sub3_19.method5494(arg1);
		super.aClass9_Sub3_19.method5545(arg0);
	}
}
