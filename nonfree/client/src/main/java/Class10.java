import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class10 {

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lclient!th;")
	public abstract Class22 method220();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Z")
	public abstract boolean method221(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public abstract void method223();

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public abstract void method224();
}
