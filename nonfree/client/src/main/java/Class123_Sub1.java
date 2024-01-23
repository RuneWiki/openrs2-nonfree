import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!ik;)Lclient!ik;")
	@Override
	public Class1_Sub3_Sub8 method3197(@OriginalArg(1) Class1_Sub3_Sub8 arg0) {
		return new Class1_Sub3_Sub8_Sub1(arg0.method3401());
	}
}
