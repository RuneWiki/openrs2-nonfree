import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class352 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!kga;")
	public Class196 aClass196_13 = null;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!ta;")
	public Class91 aClass91_11 = null;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ta;)V")
	public Class352(@OriginalArg(0) Class91 arg0) {
		this.aClass91_11 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ta;Lclient!kga;)V")
	public Class352(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass196_13 = arg1;
		this.aClass91_11 = arg0;
	}
}
