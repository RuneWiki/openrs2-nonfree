import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class Class15 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public abstract void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB)V")
	public abstract void method483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)V")
	public abstract void method486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
