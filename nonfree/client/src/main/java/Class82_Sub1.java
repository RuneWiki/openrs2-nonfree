import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!st", name = "h", descriptor = "[Lclient!ls;")
	public final Class204[] aClass204Array1;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "([Lclient!ls;)V")
	public Class82_Sub1(@OriginalArg(0) Class204[] arg0) {
		this.aClass204Array1 = arg0;
	}
}
