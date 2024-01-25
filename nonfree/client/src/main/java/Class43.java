import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class Class43 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public final int anInt2475;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public final int anInt2476;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	protected final int anInt2474;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2475 = arg1;
		this.anInt2476 = arg0;
		this.anInt2474 = arg2;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
	public abstract void method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
	public abstract void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
	public abstract void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
