import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class Class11 {

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!ln;")
	protected final Class16_Sub1 aClass16_Sub1_21;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class11(@OriginalArg(0) Class16_Sub1 arg0) {
		this.aClass16_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ke;BI)V")
	public abstract void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
	public abstract void method7355(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public abstract void method7356();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
	public abstract void method7357(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public void method7358() {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZ)V")
	public abstract void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Z")
	public abstract boolean method7360();

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public void method7362() {
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	public void method7363() {
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
	public void method7364() {
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V")
	public void method7365() {
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V")
	public void method7366() {
	}
}
