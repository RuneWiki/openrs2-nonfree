import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class164 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "Lclient!da;")
	public Class64 aClass64_7 = null;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "Lclient!fp;")
	public Class114 aClass114_20 = null;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class164(@OriginalArg(0) Class64 arg0) {
		this.aClass64_7 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!da;Lclient!fp;)V")
	public Class164(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class114 arg1) {
		this.aClass64_7 = arg0;
		this.aClass114_20 = arg1;
	}
}
