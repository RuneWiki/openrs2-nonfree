import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "[Lclient!mm;")
	public final Class220[] aClass220Array1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([Lclient!mm;)V")
	public Class3_Sub1(@OriginalArg(0) Class220[] arg0) {
		this.aClass220Array1 = arg0;
	}
}
