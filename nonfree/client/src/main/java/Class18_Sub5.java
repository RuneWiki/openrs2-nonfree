import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class18_Sub5 extends Class18 {

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Z")
	private boolean aBoolean313 = false;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class18_Sub5(@OriginalArg(0) Class13_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static408.aClass269_3);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		if (this.aBoolean313) {
			super.aClass13_Sub3_23.method8230(1);
			super.aClass13_Sub3_23.method8206(Static562.aClass222_5);
			super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
			super.aClass13_Sub3_23.method8231(Static470.aClass43_5, 2);
			super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
			super.aClass13_Sub3_23.method8270();
			super.aClass13_Sub3_23.method8234((Interface6) null);
			super.aClass13_Sub3_23.method8230(0);
			this.aBoolean313 = false;
		} else {
			super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
		}
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		super.aClass13_Sub3_23.method8234(arg1);
		super.aClass13_Sub3_23.method8204(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		@Pc(14) Interface19 local14 = super.aClass13_Sub3_23.method8190();
		if (local14 == null || !arg0) {
			super.aClass13_Sub3_23.method8279(Static23.aClass43_1, 0);
			return;
		}
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8234(local14);
		super.aClass13_Sub3_23.method8206(Static150.aClass222_1);
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8235(Static398.aClass269_5, Static408.aClass269_3);
		super.aClass13_Sub3_23.method8277(false, true, Static287.aClass43_8, 2);
		super.aClass13_Sub3_23.method8279(Static23.aClass43_1, 0);
		@Pc(72) Class51_Sub2 local72 = super.aClass13_Sub3_23.method8181();
		local72.method3245(super.aClass13_Sub3_23.method8173());
		super.aClass13_Sub3_23.method8217(Static377.aClass100_3);
		super.aClass13_Sub3_23.method8230(0);
		this.aBoolean313 = true;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return true;
	}
}
