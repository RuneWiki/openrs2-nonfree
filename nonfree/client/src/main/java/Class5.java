import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class5 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V")
	public abstract void method1226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public abstract void method1228();

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public abstract void method1230();

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public abstract void method1231();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public abstract void method1233(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZBI[B)V")
	public abstract void method1234(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);
}
