import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class Class43 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!se;")
	protected final Class122_Sub2 aClass122_Sub2_37;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class43(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass122_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public abstract void method4381(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public abstract void method4382();

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()Z")
	public abstract boolean method4383();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public abstract void method4384(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!gd;)V")
	public abstract void method4385(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
	public abstract void method4386(@OriginalArg(0) boolean arg0);
}
