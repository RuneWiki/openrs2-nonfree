import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class24_Sub6 extends Class24 {

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub6(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
		Static71.method1140(super.anInt10335);
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
		Static71.method1140(super.anInt10335);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		return super.aClass5_Sub20_30.method3201().method7445() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)Z")
	public boolean method2106() {
		return super.aClass5_Sub20_30.method3201().method7445() >= 96;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(Z)I")
	public int method2107() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return super.aClass5_Sub20_30.method3201().method7445() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (super.aClass5_Sub20_30.method3201().method7445() < 96) {
			super.anInt10335 = 0;
		}
		if (super.anInt10335 < 0 || super.anInt10335 > 2) {
			super.anInt10335 = this.method8881();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
		Static71.method1140(super.anInt10335);
	}
}
