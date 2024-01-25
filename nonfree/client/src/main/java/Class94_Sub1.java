import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "[Lclient!rf;")
	public final Class306[] aClass306Array1;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([Lclient!rf;)V")
	public Class94_Sub1(@OriginalArg(0) Class306[] arg0) {
		this.aClass306Array1 = arg0;
	}
}
