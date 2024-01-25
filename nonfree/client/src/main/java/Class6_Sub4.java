import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(ILclient!hs;)V")
	public Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class6_Sub4(@OriginalArg(0) Class5_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8538(@OriginalArg(0) int arg0) {
		super.anInt9925 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I")
	@Override
	public int method8536(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	@Override
	public void method8537() {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I")
	@Override
	protected int method8535() {
		return 0;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)I")
	public int method915() {
		return super.anInt9925;
	}
}
