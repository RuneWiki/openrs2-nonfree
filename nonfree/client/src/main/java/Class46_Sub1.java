import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lclient!en;")
	public final Class93[] aClass93Array1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([Lclient!en;)V")
	public Class46_Sub1(@OriginalArg(0) Class93[] arg0) {
		this.aClass93Array1 = arg0;
	}
}
