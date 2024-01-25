import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!rba;)Lclient!rba;")
	@Override
	public Class3_Sub1_Sub7 method3964(@OriginalArg(1) Class3_Sub1_Sub7 arg0) {
		return new Class3_Sub1_Sub7_Sub2(arg0.anInterface20_3, arg0.method7560(), arg0.anInt9170);
	}
}
