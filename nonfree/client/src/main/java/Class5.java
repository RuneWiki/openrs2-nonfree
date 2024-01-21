import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class5 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	public abstract void method1598();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BZII)V")
	public abstract void method1600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
	public abstract void method1602(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZI)V")
	public abstract void method1604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public abstract void method1606();

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public abstract void method1607();
}
