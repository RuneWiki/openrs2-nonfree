import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!qn;)Lclient!qn;")
	@Override
	public Class1_Sub1_Sub9 method2420(@OriginalArg(1) Class1_Sub1_Sub9 arg0) {
		return new Class1_Sub1_Sub9_Sub2(arg0.method2981());
	}
}
