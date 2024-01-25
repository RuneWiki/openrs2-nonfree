import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class Class21 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public abstract void method5369();

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)J")
	public abstract long method5371();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)I")
	public abstract int method5373(@OriginalArg(0) int arg0);
}
