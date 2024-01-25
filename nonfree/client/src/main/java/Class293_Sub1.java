import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public final class Class293_Sub1 extends Class293 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLclient!up;)Lclient!up;")
	@Override
	public Class1_Sub8_Sub2 method6996(@OriginalArg(1) Class1_Sub8_Sub2 arg0) {
		return new Class1_Sub8_Sub2_Sub2(arg0.anInterface18_3, arg0.method6115(), arg0.anInt7656);
	}
}
