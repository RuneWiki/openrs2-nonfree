import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class54 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public final int anInt3666;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public final int anInt3663;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	protected final int anInt3669;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
	protected Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3666 = arg1;
		this.anInt3663 = arg0;
		this.anInt3669 = arg2;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public abstract void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
	public abstract void method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V")
	public abstract void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
