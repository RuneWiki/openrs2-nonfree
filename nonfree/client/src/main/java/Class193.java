import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class Class193 {

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	protected Class193() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public abstract boolean method6323(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!vr;")
	public abstract Interface23 method6324();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public abstract void method6325();

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public abstract void method6329();
}
