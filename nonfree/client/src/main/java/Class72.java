import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class Class72 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!vj;")
	protected final Class172_Sub2 aClass172_Sub2_43;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class72(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aClass172_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public abstract void method5960();

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
	public abstract boolean method5961();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!ih;)V")
	public abstract void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
	public abstract void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	public abstract void method5966(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZB)V")
	public abstract void method5970(@OriginalArg(0) boolean arg0);
}
