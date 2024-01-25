import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[Lclient!qe;")
	public final Class284[] aClass284Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([Lclient!qe;)V")
	public Class48_Sub1(@OriginalArg(0) Class284[] arg0) {
		this.aClass284Array1 = arg0;
	}
}
