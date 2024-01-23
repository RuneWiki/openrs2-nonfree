import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class59 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public int anInt4752;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	public int anInt4753;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	public int anInt4755;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	protected Class59() {
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V")
	public abstract void method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	public abstract void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
