import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class16 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!tt;")
	protected final Class200_Sub2 aClass200_Sub2_36;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class16(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aClass200_Sub2_36 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public abstract void method5148();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	public abstract void method5149(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILclient!in;)V")
	public abstract void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	public abstract boolean method5154();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZ)V")
	public abstract void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
	public abstract void method5157(@OriginalArg(1) boolean arg0);
}
