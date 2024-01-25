import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class24_Sub24 extends Class24 {

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(ILclient!hia;)V")
	public Class24_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class24_Sub24(@OriginalArg(0) Class5_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IB)I")
	@Override
	public int method8884(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)I")
	@Override
	protected int method8881() {
		return 1;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(Z)I")
	public int method7095() {
		return super.anInt10335;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	@Override
	protected void method8880(@OriginalArg(1) int arg0) {
		super.anInt10335 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
	@Override
	public void method8874() {
		if (super.anInt10335 != 1 && super.anInt10335 != 0) {
			super.anInt10335 = this.method8881();
		}
	}
}
