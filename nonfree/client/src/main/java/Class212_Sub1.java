import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class212_Sub1 extends Class212 {

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "[Lclient!he;")
	public final Class147[] aClass147Array1;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([Lclient!he;)V")
	public Class212_Sub1(@OriginalArg(0) Class147[] arg0) {
		this.aClass147Array1 = arg0;
	}
}
