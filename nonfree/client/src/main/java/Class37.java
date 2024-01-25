import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class Class37 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
	public final int anInt9376;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	protected final int anInt9375;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public final int anInt9377;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(III)V")
	protected Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9376 = arg1;
		this.anInt9375 = arg2;
		this.anInt9377 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	public abstract void method7778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)V")
	public abstract void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
	public abstract void method7782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
