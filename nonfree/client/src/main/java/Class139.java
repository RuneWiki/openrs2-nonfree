import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class139 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "Lclient!ub;")
	public Class327 aClass327_5 = null;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "Lclient!ta;")
	public Class92 aClass92_8 = null;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ta;)V")
	public Class139(@OriginalArg(0) Class92 arg0) {
		this.aClass92_8 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!ta;Lclient!ub;)V")
	public Class139(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class327 arg1) {
		this.aClass92_8 = arg0;
		this.aClass327_5 = arg1;
	}
}
