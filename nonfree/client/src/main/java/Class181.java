import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class Class181 {

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	protected Class181() {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Lclient!av;")
	public abstract Class7 method3862();

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	public abstract void method3864();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Z")
	public abstract boolean method3865(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V")
	public abstract void method3866();
}
