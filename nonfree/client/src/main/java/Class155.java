import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class Class155 {

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	protected Class155() {
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public abstract void method4037();

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)Lclient!fs;")
	public abstract Interface8 method4039();

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "(I)V")
	public abstract void method4040();

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)Z")
	public abstract boolean method4042(@OriginalArg(1) int arg0);
}
