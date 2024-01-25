import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public abstract class Class56 {

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "Lclient!ad;")
	protected final Class5_Sub1 aClass5_Sub1_39;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class56(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIB)V")
	public abstract void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public abstract void method7137();

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZZ)V")
	public abstract void method7138(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILclient!pm;)V")
	public abstract void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
	public abstract void method7141(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)Z")
	public abstract boolean method7142();
}
