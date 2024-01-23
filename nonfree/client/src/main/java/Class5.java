import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class5 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public int anInt2895;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	protected int anInt2894;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(III)V")
	protected Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2885 = arg1;
		this.anInt2895 = arg0;
		this.anInt2894 = arg2;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public abstract void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
	public abstract void method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public abstract void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
