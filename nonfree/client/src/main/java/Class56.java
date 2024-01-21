import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class Class56 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public abstract void method2001();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)I")
	public abstract int method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public abstract void method2004();
}
