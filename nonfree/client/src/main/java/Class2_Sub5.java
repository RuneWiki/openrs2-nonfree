import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Lclient!u;")
	public final Class12_Sub2_Sub1_Sub4_Sub2 aClass12_Sub2_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!u;)V")
	public Class2_Sub5(@OriginalArg(0) Class12_Sub2_Sub1_Sub4_Sub2 arg0) {
		this.aClass12_Sub2_Sub1_Sub4_Sub2_1 = arg0;
	}
}
