import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!vm;")
	public final Class11_Sub5_Sub6 aClass11_Sub5_Sub6_1;

	static {
		new Class21("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!vm;)V")
	public Class4_Sub1_Sub15(@OriginalArg(0) Class11_Sub5_Sub6 arg0) {
		this.aClass11_Sub5_Sub6_1 = arg0;
	}
}
