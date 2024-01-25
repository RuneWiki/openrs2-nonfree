import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class8 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!en;")
	protected final Class90_Sub1 aClass90_Sub1_38;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class8(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aClass90_Sub1_38 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	public abstract void method6918(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z")
	public abstract boolean method6919();

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public abstract void method6922();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!it;)V")
	public abstract void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)V")
	public abstract void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZ)V")
	public abstract void method6927(@OriginalArg(1) boolean arg0);
}
