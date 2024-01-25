import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!s;)Lclient!s;")
	@Override
	public Class2_Sub2_Sub15 method3253(@OriginalArg(1) Class2_Sub2_Sub15 arg0) {
		return new Class2_Sub2_Sub15_Sub2(arg0.method5630(), arg0.anInt7234);
	}
}
