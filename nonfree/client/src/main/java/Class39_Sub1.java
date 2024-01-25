import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!jq;)Lclient!jq;")
	@Override
	public Class2_Sub9_Sub3 method2354(@OriginalArg(1) Class2_Sub9_Sub3 arg0) {
		return new Class2_Sub9_Sub3_Sub1(arg0.anInterface9_3, arg0.method2500(), arg0.anInt2739);
	}
}
