import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class4_Sub7_Sub12 extends Class4_Sub7 {

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "Lclient!nh;")
	public final Class10_Sub1_Sub3 aClass10_Sub1_Sub3_1;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class4_Sub7_Sub12(@OriginalArg(0) Class10_Sub1_Sub3 arg0) {
		this.aClass10_Sub1_Sub3_1 = arg0;
	}
}
