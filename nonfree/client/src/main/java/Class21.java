import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class21 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	protected Class21() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	public abstract int method2403(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Lclient!fc;")
	public abstract Class47 method2406();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)[B")
	public abstract byte[] method2407(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	public abstract void method2408(@OriginalArg(1) int arg0);
}
