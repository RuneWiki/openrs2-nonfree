import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class8_Sub1_Sub15 extends Class8_Sub1 {

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "Lclient!de;")
	public Class36_Sub1 aClass36_Sub1_1;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!de;)V")
	public Class8_Sub1_Sub15(@OriginalArg(0) Class36_Sub1 arg0) {
		this.aClass36_Sub1_1 = arg0;
	}
}
