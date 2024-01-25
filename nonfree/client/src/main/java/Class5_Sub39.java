import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt6544;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	private Class5_Sub39() {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
	public abstract void method5720();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ao;)I")
	public abstract int method5721(@OriginalArg(0) Class5_Sub4_Sub1 arg0);
}
