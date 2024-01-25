import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class Class102 {

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	protected Class102() {
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)Lclient!nq;")
	public abstract Class269 method2508();

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)V")
	public abstract void method2509(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)I")
	public abstract int method2510(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method2511(@OriginalArg(1) int arg0);
}
