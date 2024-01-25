import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class Class4 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "Lclient!ee;")
	protected final Class95_Sub1 aClass95_Sub1_23;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class4(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public void method8480() {
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
	public abstract void method8481(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZZ)V")
	public abstract void method8482(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
	public abstract void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLclient!b;I)V")
	public abstract void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
	public void method8485() {
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
	public void method8486() {
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
	public void method8489() {
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)V")
	public void method8490() {
	}

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)V")
	public void method8492() {
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)Z")
	public abstract boolean method8493();

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)V")
	public abstract void method8494();
}
