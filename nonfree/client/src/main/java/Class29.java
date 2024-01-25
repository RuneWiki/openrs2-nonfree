import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class29 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)J")
	public abstract long method5287();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public abstract void method5290();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)I")
	public abstract int method5293(@OriginalArg(1) int arg0);
}
