import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class7 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public abstract void method682();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
	public abstract int method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public abstract void method684();
}
