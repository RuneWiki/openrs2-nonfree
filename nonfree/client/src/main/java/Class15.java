import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class Class15 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	protected int anInt2289;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V")
	protected Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2283 = arg1;
		this.anInt2289 = arg2;
		this.anInt2287 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public abstract void method1757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
	public abstract void method1760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
	public abstract void method1765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
