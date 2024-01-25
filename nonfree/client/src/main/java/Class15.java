import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class Class15 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public abstract void method6105();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public abstract int method6110(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)J")
	public abstract long method6111();
}
