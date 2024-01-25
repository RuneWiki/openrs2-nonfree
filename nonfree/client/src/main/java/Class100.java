import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public abstract class Class100 {

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Lclient!ih;")
	protected final Class106_Sub2 aClass106_Sub2_43;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class100(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aClass106_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
	public abstract void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
	public abstract void method6154(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)V")
	public abstract void method6155(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
	public abstract boolean method6157();

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!kk;)V")
	public abstract void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1);

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
	public abstract void method6160();
}
