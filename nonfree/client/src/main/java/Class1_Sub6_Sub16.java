import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class1_Sub6_Sub16 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!gq;")
	public final Class25_Sub1_Sub2 aClass25_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!gq;)V")
	public Class1_Sub6_Sub16(@OriginalArg(0) Class25_Sub1_Sub2 arg0) {
		this.aClass25_Sub1_Sub2_1 = arg0;
	}
}
