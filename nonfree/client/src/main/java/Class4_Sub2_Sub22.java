import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class4_Sub2_Sub22 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "Lclient!mk;")
	public Class13_Sub4 aClass13_Sub4_1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!mk;)V")
	public Class4_Sub2_Sub22(@OriginalArg(0) Class13_Sub4 arg0) {
		this.aClass13_Sub4_1 = arg0;
	}
}
