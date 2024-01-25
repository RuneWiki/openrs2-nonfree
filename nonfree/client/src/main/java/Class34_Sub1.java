import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "[Lclient!im;")
	public final Class168[] aClass168Array1;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([Lclient!im;)V")
	public Class34_Sub1(@OriginalArg(0) Class168[] arg0) {
		this.aClass168Array1 = arg0;
	}
}
