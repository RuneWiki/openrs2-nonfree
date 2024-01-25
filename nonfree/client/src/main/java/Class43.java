import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class43 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public final int anInt5551;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "I")
	public final int anInt5550;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	protected final int anInt5546;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5551 = arg1;
		this.anInt5550 = arg0;
		this.anInt5546 = arg2;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	public abstract void method4686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIB)V")
	public abstract void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(III)V")
	public abstract void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
