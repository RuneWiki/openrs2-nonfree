import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class3 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public int anInt4874;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public int anInt4875;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	protected int anInt4879;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(III)V")
	protected Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4874 = arg0;
		this.anInt4875 = arg1;
		this.anInt4879 = arg2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public abstract void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)V")
	public abstract void method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
	public abstract void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
