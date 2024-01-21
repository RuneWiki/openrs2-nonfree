import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class14 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BZII)V")
	public abstract void method1076(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public abstract void method1077(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public abstract void method1078();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public abstract void method1079();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
	public abstract void method1080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
	public abstract void method1082();
}
