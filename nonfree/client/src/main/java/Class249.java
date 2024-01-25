import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class249 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!da;")
	public Class63 aClass63_11 = null;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!ej;")
	public Class93 aClass93_10 = null;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class249(@OriginalArg(0) Class63 arg0) {
		this.aClass63_11 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!da;Lclient!ej;)V")
	public Class249(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class93 arg1) {
		this.aClass63_11 = arg0;
		this.aClass93_10 = arg1;
	}
}
