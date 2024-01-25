import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public abstract class Class16 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "Lclient!bm;")
	protected final Class33_Sub1 aClass33_Sub1_23;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class16(@OriginalArg(0) Class33_Sub1 arg0) {
		this.aClass33_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZ)V")
	public abstract void method8596(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
	public void method8599() {
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(I)V")
	public void method8600() {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZB)V")
	public abstract void method8601(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
	public abstract void method8604();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IBI)V")
	public abstract void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(I)V")
	public void method8606() {
	}

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(B)V")
	public void method8607() {
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(B)Z")
	public abstract boolean method8608();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)V")
	public void method8609() {
	}

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "(B)V")
	public void method8610() {
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!bia;BI)V")
	public abstract void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1);
}
