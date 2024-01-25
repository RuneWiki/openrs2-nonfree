import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class79 {

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
	public abstract int method2213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Lclient!tn;")
	public abstract Class284 method2216();

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[B")
	public abstract byte[] method2217(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V")
	public abstract void method2218(@OriginalArg(1) int arg0);
}
