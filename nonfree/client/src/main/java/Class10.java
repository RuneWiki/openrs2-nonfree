import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class10 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public abstract void method1861();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	public abstract int method1863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
