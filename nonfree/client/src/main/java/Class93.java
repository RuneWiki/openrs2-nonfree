import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class Class93 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Lclient!ej;")
	protected final Class66_Sub1 aClass66_Sub1_19;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ej;)V")
	public Class93(@OriginalArg(0) Class66_Sub1 arg0) {
		this.aClass66_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	public void method7994() {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!nq;)V")
	public abstract void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BII)V")
	public abstract void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
	public abstract void method7997(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)Z")
	public abstract boolean method7998();

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
	public void method7999() {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZZ)V")
	public abstract void method8000(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
	public abstract void method8002();

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V")
	public void method8003() {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public void method8004() {
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V")
	public void method8005() {
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
	public void method8006() {
	}
}
