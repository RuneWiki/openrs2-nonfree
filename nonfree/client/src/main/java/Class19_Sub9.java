import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class19_Sub9 extends Class19 {

	@OriginalMember(owner = "client!sca", name = "w", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class19_Sub9(@OriginalArg(0) Class82_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static131.aClass88_1);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass82_Sub3_23.method4972(arg1);
		super.aClass82_Sub3_23.method5010(arg0);
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass82_Sub3_23.method4952();
		if (local8 == null || !arg0) {
			super.aClass82_Sub3_23.method5028(Static309.aClass165_2, 0);
			return;
		}
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4972(local8);
		super.aClass82_Sub3_23.method4963(Static258.aClass306_1);
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static603.aClass88_5);
		super.aClass82_Sub3_23.method5034(2, true, Static430.aClass165_3, false);
		super.aClass82_Sub3_23.method5028(Static309.aClass165_2, 0);
		@Pc(62) Class31_Sub2 local62 = super.aClass82_Sub3_23.method4931();
		local62.method7664(super.aClass82_Sub3_23.method4948());
		super.aClass82_Sub3_23.method4974(Static647.aClass193_9);
		super.aClass82_Sub3_23.method4946(0);
		this.aBoolean629 = true;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		if (this.aBoolean629) {
			super.aClass82_Sub3_23.method4946(1);
			super.aClass82_Sub3_23.method4963(Static279.aClass306_2);
			super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
			super.aClass82_Sub3_23.method4928(2, Static302.aClass165_1);
			super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
			super.aClass82_Sub3_23.method4973();
			super.aClass82_Sub3_23.method4972((Interface10) null);
			super.aClass82_Sub3_23.method4946(0);
			this.aBoolean629 = false;
		} else {
			super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
		}
		super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
