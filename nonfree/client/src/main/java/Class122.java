import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public final class Class122 {

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "Lclient!kc;")
	public Class202 aClass202_4 = null;

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "Lclient!da;")
	public Class69 aClass69_3 = null;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class122(@OriginalArg(0) Class69 arg0) {
		this.aClass69_3 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!da;Lclient!kc;)V")
	public Class122(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class202 arg1) {
		this.aClass202_4 = arg1;
		this.aClass69_3 = arg0;
	}
}
