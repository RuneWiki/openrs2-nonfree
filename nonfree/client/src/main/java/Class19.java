import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class19 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!kv;")
	protected final Class143_Sub2 aClass143_Sub2_39;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class19(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aClass143_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public abstract void method7871();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZ)V")
	public abstract void method7872(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!fia;IZ)V")
	public abstract void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)Z")
	public abstract boolean method7874();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
	public abstract void method7875(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	public abstract void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
