import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class Class277 {

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	protected Class277() {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	public abstract int method6632(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
	public abstract void method6633(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lclient!qia;")
	public abstract Class287 method6635();

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[B")
	public abstract byte[] method6636(@OriginalArg(0) int arg0);
}
