import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!da;")
	public Class27 aClass27_1 = null;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!ur;")
	public Class345 aClass345_1 = null;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class3(@OriginalArg(0) Class27 arg0) {
		this.aClass27_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!da;Lclient!ur;)V")
	public Class3(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class345 arg1) {
		this.aClass27_1 = arg0;
		this.aClass345_1 = arg1;
	}
}
