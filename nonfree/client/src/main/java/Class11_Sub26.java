import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public final class Class11_Sub26 extends Class11 {

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub26(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (super.aClass5_Sub46_30.method8187()) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 != 1 && super.anInt10053 != 0) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return 1;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)Z")
	public boolean method7771() {
		return !super.aClass5_Sub46_30.method8187();
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(Z)I")
	public int method7773() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		return super.aClass5_Sub46_30.method8187() ? 3 : 1;
	}
}
