import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public abstract class Class105 {

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "Lclient!kfa;")
	protected final Class7_Sub2 aClass7_Sub2_41;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class105(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aClass7_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public abstract void method7381();

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V")
	public abstract void method7382(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)Z")
	public abstract boolean method7385();

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(III)V")
	public abstract void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!jo;I)V")
	public abstract void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BZ)V")
	public abstract void method7390(@OriginalArg(1) boolean arg0);
}
