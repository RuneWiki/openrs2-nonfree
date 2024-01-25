import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class Class21 {

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	protected Class21() {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Lclient!lca;")
	public abstract Class220 method4614();

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	public abstract void method4616(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)[B")
	public abstract byte[] method4617(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I")
	public abstract int method4618(@OriginalArg(1) int arg0);
}
