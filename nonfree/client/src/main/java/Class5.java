import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class Class5 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public final int anInt2783;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public final int anInt2786;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	protected final int anInt2782;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(III)V")
	protected Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2783 = arg0;
		this.anInt2786 = arg1;
		this.anInt2782 = arg2;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public abstract void method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)V")
	public abstract void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(BII)V")
	public abstract void method2105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
