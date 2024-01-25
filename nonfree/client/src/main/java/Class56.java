import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class Class56 {

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
	protected final int anInt5404;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public final int anInt5406;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public final int anInt5408;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
	protected Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5404 = arg2;
		this.anInt5406 = arg0;
		this.anInt5408 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
	public abstract void method4856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZ)V")
	public abstract void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)V")
	public abstract void method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
