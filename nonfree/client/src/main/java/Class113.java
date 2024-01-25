import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class Class113 {

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	protected Class113() {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
	public abstract int method4964(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lclient!og;")
	public abstract Class150 method4966();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	public abstract void method4968(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4971(@OriginalArg(0) int arg0);
}
