import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class Class40 {

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	protected Class40() {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method7334(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)Lclient!vh;")
	public abstract Class352 method7335();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V")
	public abstract void method7337(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BI)I")
	public abstract int method7339(@OriginalArg(1) int arg0);
}
