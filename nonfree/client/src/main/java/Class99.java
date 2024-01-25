import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class Class99 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!ffa;")
	protected final Class57_Sub2 aClass57_Sub2_38;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class99(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)V")
	public abstract void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z")
	public abstract boolean method8718();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)V")
	public abstract void method8720(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLclient!mw;)V")
	public abstract void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
	public abstract void method8723(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public abstract void method8726();
}
