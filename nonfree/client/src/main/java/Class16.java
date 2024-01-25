import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class16 {

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	protected Class16() {
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	public abstract int method394(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method395(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Lclient!jn;")
	public abstract Class132 method397();

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
	public abstract void method398(@OriginalArg(0) int arg0);
}
