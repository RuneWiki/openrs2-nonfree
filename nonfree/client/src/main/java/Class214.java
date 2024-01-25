import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class214 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!da;")
	public Class55 aClass55_10 = null;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!pia;")
	public Class272 aClass272_10 = null;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class214(@OriginalArg(0) Class55 arg0) {
		this.aClass55_10 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!da;Lclient!pia;)V")
	public Class214(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class272 arg1) {
		this.aClass55_10 = arg0;
		this.aClass272_10 = arg1;
	}
}
