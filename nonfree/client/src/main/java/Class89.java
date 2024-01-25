import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class89 {

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	protected Class89() {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[B")
	public abstract byte[] method2151(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)I")
	public abstract int method2152(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	public abstract void method2153(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lclient!ega;")
	public abstract Class99 method2154();
}
