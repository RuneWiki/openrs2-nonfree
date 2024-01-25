import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class11_Sub19 extends Class11 {

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub19(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
		Static431.method6280(super.anInt11012);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
		Static431.method6280(super.anInt11012);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.aClass2_Sub30_32.method2981().method7171() < 96) {
			super.anInt11012 = 0;
		}
		if (super.anInt11012 < 0 || super.anInt11012 > 2) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)I")
	public int method4819() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
		Static431.method6280(super.anInt11012);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)Z")
	public boolean method4821() {
		return super.aClass2_Sub30_32.method2981().method7171() >= 96;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub30_32.method2981().method7171() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return super.aClass2_Sub30_32.method2981().method7171() < 96 ? 0 : 2;
	}
}
