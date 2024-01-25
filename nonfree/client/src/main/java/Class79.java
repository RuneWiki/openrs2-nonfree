import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class79 {

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lclient!ss;")
	public abstract Class238 method2220();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
	public abstract void method2221(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[B")
	public abstract byte[] method2222(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)I")
	public abstract int method2224(@OriginalArg(0) int arg0);
}
