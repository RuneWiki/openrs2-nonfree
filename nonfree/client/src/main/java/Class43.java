import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class Class43 {

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	protected final int anInt5697;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public final int anInt5696;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5697 = arg2;
		this.anInt5692 = arg0;
		this.anInt5696 = arg1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
	public abstract void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public abstract void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
	public abstract void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
