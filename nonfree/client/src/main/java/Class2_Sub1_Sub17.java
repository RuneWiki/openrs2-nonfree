import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Lclient!aj;")
	public final Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) Class7_Sub1 arg0) {
		this.aClass7_Sub1_1 = arg0;
	}
}
