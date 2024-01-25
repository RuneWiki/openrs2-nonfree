import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub14(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public int method4302() {
		return super.anInt9925;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 3;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
		if (super.anInt9925 < 0 || super.anInt9925 > 4) {
			super.anInt9925 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}
}
