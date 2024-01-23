import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!mc;)Lclient!mc;")
	@Override
	public Class1_Sub2_Sub7 method2422(@OriginalArg(1) Class1_Sub2_Sub7 arg0) {
		return new Class1_Sub2_Sub7_Sub2(arg0.method2774());
	}
}
