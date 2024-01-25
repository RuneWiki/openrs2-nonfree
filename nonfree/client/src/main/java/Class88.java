import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class88 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!ne;")
	public Class247 aClass247_2 = null;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!da;")
	public Class73 aClass73_2 = null;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class88(@OriginalArg(0) Class73 arg0) {
		this.aClass73_2 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!da;Lclient!ne;)V")
	public Class88(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class247 arg1) {
		this.aClass247_2 = arg1;
		this.aClass73_2 = arg0;
	}
}
