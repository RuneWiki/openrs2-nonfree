import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!gaa;B)Lclient!gaa;")
	@Override
	public Class2_Sub2_Sub6 method127(@OriginalArg(0) Class2_Sub2_Sub6 arg0) {
		return new Class2_Sub2_Sub6_Sub2(arg0.method5442(), arg0.anInt6538);
	}
}
