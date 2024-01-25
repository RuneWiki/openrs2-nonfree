import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class290 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!hw;")
	public Class151 aClass151_13 = null;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!da;")
	public Class19 aClass19_11 = null;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class290(@OriginalArg(0) Class19 arg0) {
		this.aClass19_11 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!da;Lclient!hw;)V")
	public Class290(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class151 arg1) {
		this.aClass151_13 = arg1;
		this.aClass19_11 = arg0;
	}
}
