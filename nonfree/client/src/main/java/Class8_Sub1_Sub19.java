import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class8_Sub1_Sub19 extends Class8_Sub1 {

	@OriginalMember(owner = "client!th", name = "C", descriptor = "Lclient!om;")
	public Class36_Sub5 aClass36_Sub5_1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!om;)V")
	public Class8_Sub1_Sub19(@OriginalArg(0) Class36_Sub5 arg0) {
		this.aClass36_Sub5_1 = arg0;
	}
}
