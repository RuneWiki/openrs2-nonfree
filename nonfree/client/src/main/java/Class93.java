import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class Class93 {

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public int anInt4354;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public int anInt4355;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	public int anInt4356;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public int anInt4359;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public int anInt4360;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public int anInt4361;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	protected Class93() {
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public abstract void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public abstract void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
