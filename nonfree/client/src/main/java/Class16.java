import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class16 {

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	protected Class16() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)Z")
	public abstract boolean method580(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)Lclient!kc;")
	public abstract Class19 method584();

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	public abstract void method585();

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
	public abstract void method586();
}
