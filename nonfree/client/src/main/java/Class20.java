import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class Class20 {

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public final int anInt4731;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	public final int anInt4733;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	protected final int anInt4732;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(III)V")
	protected Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4731 = arg0;
		this.anInt4733 = arg1;
		this.anInt4732 = arg2;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)V")
	public abstract void method3815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)V")
	public abstract void method3816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	public abstract void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
