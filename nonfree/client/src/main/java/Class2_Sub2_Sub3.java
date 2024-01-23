import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Lclient!h;")
	public Class12_Sub4 aClass12_Sub4_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) Class12_Sub4 arg0) {
		this.aClass12_Sub4_1 = arg0;
	}
}
