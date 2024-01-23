import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class Class39 {

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	protected Class39() {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)I")
	public abstract int method1131(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
	public abstract void method1132(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method1133(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lclient!on;")
	public abstract Class125 method1135();
}
