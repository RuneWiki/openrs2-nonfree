import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class Class43 {

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	public final int anInt5747;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
	public final int anInt5750;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	protected final int anInt5743;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5747 = arg0;
		this.anInt5750 = arg1;
		this.anInt5743 = arg2;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public abstract void method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)V")
	public abstract void method4938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V")
	public abstract void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
