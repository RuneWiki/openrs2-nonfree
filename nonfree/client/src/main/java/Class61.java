import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class Class61 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	public int anInt3149;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public int anInt3150;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public abstract void method2237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
	public abstract void method2238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)V")
	public abstract void method2239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
