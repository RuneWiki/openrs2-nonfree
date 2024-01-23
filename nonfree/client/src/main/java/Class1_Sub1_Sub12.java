import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "Lclient!dd;")
	public Class9 aClass9_6;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!dd;)V")
	public Class1_Sub1_Sub12(@OriginalArg(0) Class9 arg0) {
		this.aClass9_6 = arg0;
	}
}
