import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[Lclient!ls;")
	public final Class219[] aClass219Array1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([Lclient!ls;)V")
	public Class69_Sub1(@OriginalArg(0) Class219[] arg0) {
		this.aClass219Array1 = arg0;
	}
}
