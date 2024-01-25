import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class Class147 {

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	protected Class147() {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)I")
	public abstract int method7339(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
	public abstract void method7341(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[B")
	public abstract byte[] method7343(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Lclient!m;")
	public abstract Class211 method7344();
}
