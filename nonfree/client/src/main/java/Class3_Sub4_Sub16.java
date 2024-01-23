import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class3_Sub4_Sub16 extends Class3_Sub4 {

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "Lclient!wg;")
	public Class10_Sub7 aClass10_Sub7_1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class3_Sub4_Sub16(@OriginalArg(0) Class10_Sub7 arg0) {
		this.aClass10_Sub7_1 = arg0;
	}
}
