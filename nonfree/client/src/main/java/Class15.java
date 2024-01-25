import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public abstract class Class15 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "Lclient!er;")
	protected final Class31_Sub2 aClass31_Sub2_40;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class15(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aClass31_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZI)V")
	public abstract void method6942(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	public abstract void method6944();

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZZ)V")
	public abstract void method6945(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6946();

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ep;I)V")
	public abstract void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
	public abstract void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
