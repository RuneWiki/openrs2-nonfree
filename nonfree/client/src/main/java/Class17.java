import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class Class17 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!kd;")
	protected final Class39_Sub2 aClass39_Sub2_41;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class17(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!av;IB)V")
	public abstract void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	public abstract void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public abstract void method5672();

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZ)V")
	public abstract void method5673(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	public abstract void method5674(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	public abstract boolean method5675();
}
