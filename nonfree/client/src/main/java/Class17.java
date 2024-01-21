import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class Class17 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public abstract void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public abstract void method2001();

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public abstract void method2004();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIB[B)V")
	public abstract void method2007(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public abstract void method2008();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public abstract void method2009(@OriginalArg(1) int arg0);
}
