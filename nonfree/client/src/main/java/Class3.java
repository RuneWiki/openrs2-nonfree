import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class Class3 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!qq;")
	protected final Class12_Sub2 aClass12_Sub2_23;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class3(@OriginalArg(0) Class12_Sub2 arg0) {
		this.aClass12_Sub2_23 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	public void method7525() {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public void method7526() {
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	public void method7527() {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ot;BI)V")
	public abstract void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
	public abstract void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	public void method7530() {
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Z")
	public abstract boolean method7531();

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	public void method7532() {
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZZ)V")
	public abstract void method7533(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
	public abstract void method7534();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V")
	public abstract void method7535(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
	public void method7536() {
	}
}
