import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class40 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!sa;")
	public Class294 aClass294_3 = null;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Lclient!la;")
	public Class29 aClass29_4 = null;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class40(@OriginalArg(0) Class29 arg0) {
		this.aClass29_4 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!la;Lclient!sa;)V")
	public Class40(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class294 arg1) {
		this.aClass29_4 = arg0;
		this.aClass294_3 = arg1;
	}
}
