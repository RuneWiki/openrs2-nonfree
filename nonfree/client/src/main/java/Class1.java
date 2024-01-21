import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class1 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public abstract void method1041();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BII)V")
	public abstract void method1046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public abstract void method1047();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZBI[B)V")
	public abstract void method1048(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public abstract void method1050();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public abstract void method1051();
}
