import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "[Lclient!pj;")
	public final Class268[] aClass268Array1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([Lclient!pj;)V")
	public Class43_Sub1(@OriginalArg(0) Class268[] arg0) {
		this.aClass268Array1 = arg0;
	}
}
