import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6_Sub15(@OriginalArg(0) Class2_Sub5 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
	@Override
	public void method8576() {
		if (super.aClass2_Sub5_50.method179()) {
			super.anInt10283 = 0;
		}
		if (super.anInt10283 < 0 && super.anInt10283 > 2) {
			super.anInt10283 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(Z)Z")
	public boolean method4217() {
		return !super.aClass2_Sub5_50.method179();
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)I")
	public int method4218() {
		return super.anInt10283;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(II)V")
	@Override
	protected void method8577(@OriginalArg(0) int arg0) {
		super.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub5_50.method179()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub5_50.aClass6_Sub10_1.method3108() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 1;
	}
}
