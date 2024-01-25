import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "[Lclient!dm;")
	public final Class76[] aClass76Array1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([Lclient!dm;)V")
	public Class59_Sub1(@OriginalArg(0) Class76[] arg0) {
		this.aClass76Array1 = arg0;
	}
}
