import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "[Lclient!uaa;")
	public final Class332[] aClass332Array1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "([Lclient!uaa;)V")
	public Class7_Sub1(@OriginalArg(0) Class332[] arg0) {
		this.aClass332Array1 = arg0;
	}
}
