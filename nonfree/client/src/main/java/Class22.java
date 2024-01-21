import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class Class22 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	protected final int anInt4159;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public final int anInt4156;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public final int anInt4155;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(III)V")
	protected Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4159 = arg2;
		this.anInt4156 = arg0;
		this.anInt4155 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
	public abstract void method3215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
	public abstract void method3216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZ)V")
	public abstract void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
