import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!li;")
	public final Class30_Sub1_Sub3 aClass30_Sub1_Sub3_1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!li;)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class30_Sub1_Sub3 arg0) {
		this.aClass30_Sub1_Sub3_1 = arg0;
	}
}
