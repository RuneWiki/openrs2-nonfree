import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class10 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!jca;")
	protected final Class22_Sub2 aClass22_Sub2_23;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class10(@OriginalArg(0) Class22_Sub2 arg0) {
		this.aClass22_Sub2_23 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!sc;II)V")
	public abstract void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
	public void method9547() {
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
	public void method9548() {
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	public abstract void method9549();

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
	public void method9550() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V")
	public abstract void method9551(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBI)V")
	public abstract void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public void method9553() {
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
	public void method9554() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public void method9556() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)Z")
	public abstract boolean method9557();

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V")
	public abstract void method9558(@OriginalArg(0) boolean arg0);
}
