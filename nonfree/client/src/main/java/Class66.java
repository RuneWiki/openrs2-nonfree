import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class66 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lclient!ho;")
	public Class134 aClass134_8 = null;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "Lclient!la;")
	public Class54 aClass54_5 = null;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class66(@OriginalArg(0) Class54 arg0) {
		this.aClass54_5 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!la;Lclient!ho;)V")
	public Class66(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class134 arg1) {
		this.aClass134_8 = arg1;
		this.aClass54_5 = arg0;
	}
}
