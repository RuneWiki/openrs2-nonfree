import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class Class10 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!ug;")
	protected final Class135_Sub2 aClass135_Sub2_41;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class10(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aClass135_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public abstract void method5729();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!sq;II)V")
	public abstract void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5733();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIZ)V")
	public abstract void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)V")
	public abstract void method5735(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(ZZ)V")
	public abstract void method5736(@OriginalArg(0) boolean arg0);
}
