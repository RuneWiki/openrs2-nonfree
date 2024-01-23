import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class Class48 {

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public int anInt4746;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	public int anInt4752;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public int anInt4754;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	protected Class48() {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public abstract void method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public abstract void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
