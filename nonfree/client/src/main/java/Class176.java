import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class176 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!da;")
	public Class72 aClass72_7 = null;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!kf;")
	public Class198 aClass198_6 = null;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class176(@OriginalArg(0) Class72 arg0) {
		this.aClass72_7 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!da;Lclient!kf;)V")
	public Class176(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass72_7 = arg0;
		this.aClass198_6 = arg1;
	}
}
