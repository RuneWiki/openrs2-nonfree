import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class Class61 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)J")
	public abstract long method4568();

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public abstract void method4571();

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)I")
	public abstract int method4572(@OriginalArg(1) int arg0);
}
