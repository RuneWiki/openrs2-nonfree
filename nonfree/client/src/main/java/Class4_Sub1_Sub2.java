import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Lclient!of;")
	public final Class2_Sub2_Sub5 aClass2_Sub2_Sub5_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class2_Sub2_Sub5 arg0) {
		this.aClass2_Sub2_Sub5_1 = arg0;
	}
}
