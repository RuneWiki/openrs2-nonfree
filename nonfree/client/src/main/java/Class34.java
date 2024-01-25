import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class Class34 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!um;")
	protected final Class162_Sub1 aClass162_Sub1_23;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class34(@OriginalArg(0) Class162_Sub1 arg0) {
		this.aClass162_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public void method7352() {
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method7354() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public abstract void method7355(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public abstract void method7357();

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public void method7359() {
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
	public void method7360() {
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IZ)V")
	public abstract void method7361(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Z")
	public abstract boolean method7362();

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!qda;I)V")
	public abstract void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
	public void method7364() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public void method7365() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
	public abstract void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
