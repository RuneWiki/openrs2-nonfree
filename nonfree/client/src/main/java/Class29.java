import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class Class29 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Lclient!da;")
	protected final Class50_Sub1 aClass50_Sub1_37;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class29(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aClass50_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Z")
	public abstract boolean method5375();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZB)V")
	public abstract void method5376(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)V")
	public abstract void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public abstract void method5381();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!ac;)V")
	public abstract void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V")
	public abstract void method5383(@OriginalArg(1) boolean arg0);
}
