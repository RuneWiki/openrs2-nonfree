import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZLclient!jb;)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub4 method5720(@OriginalArg(1) Class6_Sub2_Sub4 arg0) {
		return new Class6_Sub2_Sub4_Sub1(arg0.anInterface9_3, arg0.method3930(), arg0.anInt4663);
	}
}
