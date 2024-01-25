import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class91 {

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!da;")
	public Class59 aClass59_1 = null;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!rt;")
	public Class324 aClass324_5 = null;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class91(@OriginalArg(0) Class59 arg0) {
		this.aClass59_1 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!da;Lclient!rt;)V")
	public Class91(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class324 arg1) {
		this.aClass59_1 = arg0;
		this.aClass324_5 = arg1;
	}
}
