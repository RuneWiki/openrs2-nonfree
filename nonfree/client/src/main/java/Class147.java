import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lla")
public abstract class Class147 {

	@OriginalMember(owner = "client!lla", name = "<init>", descriptor = "()V")
	protected Class147() {
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Z)Lclient!lia;")
	public abstract Class224 method3237();

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(II)[B")
	public abstract byte[] method3240(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lla", name = "d", descriptor = "(II)I")
	public abstract int method3241(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(II)V")
	public abstract void method3243(@OriginalArg(1) int arg0);
}
