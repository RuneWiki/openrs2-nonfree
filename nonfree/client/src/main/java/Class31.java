import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class Class31 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!lea;")
	protected final Class101_Sub2 aClass101_Sub2_43;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class31(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	public abstract void method9597();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!fga;I)V")
	public abstract void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
	public abstract void method9600(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZB)V")
	public abstract void method9602(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZI)V")
	public abstract void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)Z")
	public abstract boolean method9604();
}
