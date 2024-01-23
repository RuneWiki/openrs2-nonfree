import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class Class103 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public int anInt5851;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
	public int anInt5857;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public int anInt5858;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	protected Class103() {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public abstract void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
	public abstract void method4597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
