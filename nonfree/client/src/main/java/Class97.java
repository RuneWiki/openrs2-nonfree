import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class Class97 {

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	protected Class97() {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public abstract void method5670();

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lclient!fp;")
	public abstract Class69 method5671();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method5672(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	public abstract void method5674();
}
