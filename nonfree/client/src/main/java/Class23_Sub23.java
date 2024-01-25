import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class23_Sub23 extends Class23 {

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
		Static186.method3746(super.anInt10359);
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub23(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
		Static186.method3746(super.anInt10359);
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I")
	public int method6572() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return super.aClass3_Sub48_31.method7827().method8480() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
		Static186.method3746(super.anInt10359);
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)Z")
	public boolean method6575() {
		return super.aClass3_Sub48_31.method7827().method8480() >= 96;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub48_31.method7827().method8480() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.method7827().method8480() < 96) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 2) {
			super.anInt10359 = this.method8501();
		}
	}
}
