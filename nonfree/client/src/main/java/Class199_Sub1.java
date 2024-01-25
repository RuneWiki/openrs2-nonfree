import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class199_Sub1 extends Class199 {

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "[Lclient!eda;")
	public final Class89[] aClass89Array1;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([Lclient!eda;)V")
	public Class199_Sub1(@OriginalArg(0) Class89[] arg0) {
		this.aClass89Array1 = arg0;
	}
}
