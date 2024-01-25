import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLclient!tk;)Lclient!tk;")
	@Override
	public Class2_Sub1_Sub3 method4101(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		return new Class2_Sub1_Sub3_Sub2(arg0.anInterface14_3, arg0.method6236(), arg0.anInt6961);
	}
}
