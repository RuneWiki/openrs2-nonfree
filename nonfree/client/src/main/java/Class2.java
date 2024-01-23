import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class2 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public abstract void method2852();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	public abstract int method2858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
