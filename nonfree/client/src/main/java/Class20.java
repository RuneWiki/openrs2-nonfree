import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class Class20 {

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Lclient!wg;")
	protected final Class33_Sub2 aClass33_Sub2_21;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class20(@OriginalArg(0) Class33_Sub2 arg0) {
		this.aClass33_Sub2_21 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public void method7956() {
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
	public void method7958() {
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	public void method7959() {
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
	public abstract void method7960();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI)V")
	public abstract void method7961(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
	public void method7962() {
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
	public void method7964() {
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZILclient!gaa;)V")
	public abstract void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1);

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	public void method7966() {
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZB)V")
	public abstract void method7967(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBI)V")
	public abstract void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(B)Z")
	public abstract boolean method7970();
}
