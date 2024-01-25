import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class Class23 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Lclient!jj;")
	protected final Class75_Sub1 aClass75_Sub1_22;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class23(@OriginalArg(0) Class75_Sub1 arg0) {
		this.aClass75_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIB)V")
	public abstract void method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)V")
	public abstract void method8161(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBLclient!ah;)V")
	public abstract void method8162(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1);

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V")
	public void method8163() {
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Z")
	public abstract boolean method8164();

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
	public void method8165() {
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BZ)V")
	public abstract void method8166(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	public abstract void method8167();

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public void method8168() {
	}

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V")
	public void method8169() {
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(I)V")
	public void method8170() {
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public void method8171() {
	}
}
