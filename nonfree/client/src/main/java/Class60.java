import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class Class60 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "Lclient!jaa;")
	protected final Class14_Sub3 aClass14_Sub3_42;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class60(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aClass14_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIB)V")
	public abstract void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public abstract void method7474();

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!tj;)V")
	public abstract void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)V")
	public abstract void method7476(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BZ)V")
	public abstract void method7477(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z")
	public abstract boolean method7478();
}
