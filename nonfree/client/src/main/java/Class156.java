import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class Class156 {

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	protected Class156() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Lclient!fga;")
	public abstract Class99 method4683();

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)I")
	public abstract int method4686(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)V")
	public abstract void method4687(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)[B")
	public abstract byte[] method4688(@OriginalArg(0) int arg0);
}
