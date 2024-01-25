import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class146 {

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	protected Class146() {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Lclient!dw;")
	public abstract Class75 method3509();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)I")
	public abstract int method3511(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(BI)[B")
	public abstract byte[] method3512(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(BI)V")
	public abstract void method3517(@OriginalArg(1) int arg0);
}
