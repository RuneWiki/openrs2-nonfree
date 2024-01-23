import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class Class85 {

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	protected Class85() {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Lclient!wf;")
	public abstract Class176 method2503();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)I")
	public abstract int method2504(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[B")
	public abstract byte[] method2505(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	public abstract void method2507(@OriginalArg(0) int arg0);
}
