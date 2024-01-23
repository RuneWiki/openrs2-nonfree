import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class13 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class13() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
	public abstract int method2959(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
	public abstract void method2962(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lclient!ha;")
	public abstract Class67 method2963();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)[B")
	public abstract byte[] method2964(@OriginalArg(1) int arg0);
}
