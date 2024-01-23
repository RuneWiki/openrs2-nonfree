import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "Lclient!bf;")
	public Class12_Sub1 aClass12_Sub1_1;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class2_Sub2_Sub27(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_1 = arg0;
	}
}
