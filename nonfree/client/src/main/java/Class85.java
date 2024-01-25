import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class85 {

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!lj;")
	protected final Class78_Sub3 aClass78_Sub3_37;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class85(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aClass78_Sub3_37 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public abstract void method6287();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!vf;)V")
	public abstract void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZ)V")
	public abstract void method6289(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6291();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public abstract void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
	public abstract void method6294(@OriginalArg(0) boolean arg0);
}
