import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class56 {

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	protected Class56() {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
	public abstract int method1636(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!md;")
	public abstract Class126 method1637();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)V")
	public abstract void method1639(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method1641(@OriginalArg(0) int arg0);
}
