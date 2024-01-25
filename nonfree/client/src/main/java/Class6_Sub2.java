import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6_Sub2(@OriginalArg(0) Class2_Sub5 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
	@Override
	protected void method8577(@OriginalArg(0) int arg0) {
		super.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	@Override
	public void method8576() {
		if (super.anInt10283 != 1 && super.anInt10283 != 0) {
			super.anInt10283 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
	public int method252() {
		return super.anInt10283;
	}
}
