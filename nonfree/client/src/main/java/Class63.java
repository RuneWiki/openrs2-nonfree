import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gma")
public abstract class Class63 {

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "Lclient!aq;")
	protected final Class22_Sub1 aClass22_Sub1_43;

	@OriginalMember(owner = "client!gma", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class63(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_43 = arg0;
	}

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(BII)V")
	public abstract void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(Lclient!rha;II)V")
	public abstract void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(B)V")
	public abstract void method9536();

	@OriginalMember(owner = "client!gma", name = "b", descriptor = "(I)Z")
	public abstract boolean method9538();

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(ZZ)V")
	public abstract void method9539(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(ZI)V")
	public abstract void method9540(@OriginalArg(0) boolean arg0);
}
