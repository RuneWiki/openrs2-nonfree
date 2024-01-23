import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class Class46 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int anInt4751;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public int anInt4752;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public int anInt4753;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	protected Class46() {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public abstract void method3523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public abstract void method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
