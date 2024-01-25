import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class Class229 {

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	protected Class229() {
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)[B")
	public abstract byte[] method5063(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V")
	public abstract void method5064(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)Lclient!uj;")
	public abstract Class349 method5066();

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)I")
	public abstract int method5067(@OriginalArg(1) int arg0);
}
