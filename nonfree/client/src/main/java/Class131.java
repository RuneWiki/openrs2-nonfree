import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class Class131 {

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	protected Class131() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
	public abstract int method7004(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
	public abstract void method7006(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(BI)[B")
	public abstract byte[] method7008(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lclient!tb;")
	public abstract Class277 method7010();
}
