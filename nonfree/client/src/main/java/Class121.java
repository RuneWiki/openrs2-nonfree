import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class121 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	protected Class121() {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public abstract void method3314(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
	public abstract int method3315(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method3317(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Lclient!ij;")
	public abstract Class92 method3319();
}
