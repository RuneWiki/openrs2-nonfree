import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class158 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public abstract void method5751();

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)J")
	public abstract long method5755();

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
	public abstract int method5756(@OriginalArg(0) int arg0);
}
