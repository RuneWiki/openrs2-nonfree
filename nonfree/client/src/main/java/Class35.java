import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class35 {

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public int anInt5404;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	protected int anInt5402;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public int anInt5399;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(III)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5404 = arg0;
		this.anInt5402 = arg2;
		this.anInt5399 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	public abstract void method4139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZ)V")
	public abstract void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)V")
	public abstract void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
