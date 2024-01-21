import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!sa;")
	public final Class7_Sub6 aClass7_Sub6_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!sa;)V")
	public Class2_Sub1_Sub6(@OriginalArg(0) Class7_Sub6 arg0) {
		this.aClass7_Sub6_1 = arg0;
	}
}
