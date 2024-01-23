import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!hh;")
	public Class50 aClass50_187;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class1_Sub6() {
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!hh;)V")
	public Class1_Sub6(@OriginalArg(0) Class50 arg0) {
		this.aClass50_187 = arg0;
	}
}
