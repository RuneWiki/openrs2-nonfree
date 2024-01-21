import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class7 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	public abstract int method241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public abstract void method242();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public abstract void method244();
}
