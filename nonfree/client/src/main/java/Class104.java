import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class Class104 {

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	protected Class104() {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)I")
	public abstract int method2257(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
	public abstract void method2259(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Lclient!sq;")
	public abstract Class226 method2260();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)[B")
	public abstract byte[] method2263(@OriginalArg(0) int arg0);
}
