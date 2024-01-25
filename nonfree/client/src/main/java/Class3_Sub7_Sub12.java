import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class3_Sub7_Sub12 extends Class3_Sub7 {

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "Lclient!bba;")
	public final Class25_Sub2_Sub2_Sub1 aClass25_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!bba;)V")
	public Class3_Sub7_Sub12(@OriginalArg(0) Class25_Sub2_Sub2_Sub1 arg0) {
		this.aClass25_Sub2_Sub2_Sub1_1 = arg0;
	}
}
