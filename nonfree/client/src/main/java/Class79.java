import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class Class79 {

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	protected final int anInt5794;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public final int anInt5793;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public final int anInt5792;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(III)V")
	protected Class79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5794 = arg2;
		this.anInt5793 = arg1;
		this.anInt5792 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
	public abstract void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)V")
	public abstract void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)V")
	public abstract void method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
