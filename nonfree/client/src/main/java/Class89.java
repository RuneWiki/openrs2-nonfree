import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class Class89 {

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	protected Class89() {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method2231(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Lclient!kd;")
	public abstract Class191 method2233();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)I")
	public abstract int method2234(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(ZI)V")
	public abstract void method2235(@OriginalArg(1) int arg0);
}
