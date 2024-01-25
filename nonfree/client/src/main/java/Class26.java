import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class Class26 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)J")
	public abstract long method5212();

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I")
	public abstract int method5215(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public abstract void method5216();
}
