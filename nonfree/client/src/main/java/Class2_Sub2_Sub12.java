import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!ue;")
	public final Class24_Sub6 aClass24_Sub6_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ue;)V")
	public Class2_Sub2_Sub12(@OriginalArg(0) Class24_Sub6 arg0) {
		this.aClass24_Sub6_1 = arg0;
	}
}
