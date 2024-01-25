import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class21_Sub25 extends Class21 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub25(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
		Static423.method6622(super.anInt10079);
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
		Static423.method6622(super.anInt10079);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
		Static423.method6622(super.anInt10079);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return super.aClass3_Sub27_31.method3236().method7990() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		return super.aClass3_Sub27_31.method3236().method7990() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Z")
	public boolean method8041() {
		return super.aClass3_Sub27_31.method3236().method7990() >= 96;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)I")
	public int method8042() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
		if (super.aClass3_Sub27_31.method3236().method7990() < 96) {
			super.anInt10079 = 0;
		}
		if (super.anInt10079 < 0 || super.anInt10079 > 2) {
			super.anInt10079 = this.method8636();
		}
	}
}
