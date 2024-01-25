import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "[Lclient!pfa;")
	public final Class280[] aClass280Array1;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([Lclient!pfa;)V")
	public Class167_Sub1(@OriginalArg(0) Class280[] arg0) {
		this.aClass280Array1 = arg0;
	}
}
