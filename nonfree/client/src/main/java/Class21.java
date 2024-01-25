import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public abstract class Class21 {

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "Lclient!hk;")
	protected final Class16_Sub2 aClass16_Sub2_43;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class21(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Z")
	public abstract boolean method8692();

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Z)V")
	public abstract void method8695();

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZI)V")
	public abstract void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZ)V")
	public abstract void method8697(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZB)V")
	public abstract void method8698(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IBLclient!qk;)V")
	public abstract void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1);
}
