import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class Class14 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public int anInt4048;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	protected int anInt4056;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(III)V")
	protected Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4048 = arg1;
		this.anInt4056 = arg2;
		this.anInt4055 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public abstract void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)V")
	public abstract void method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IBI)V")
	public abstract void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
