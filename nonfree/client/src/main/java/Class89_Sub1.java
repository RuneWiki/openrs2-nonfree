import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILclient!rd;)Lclient!rd;")
	@Override
	public Class2_Sub6_Sub2 method7990(@OriginalArg(1) Class2_Sub6_Sub2 arg0) {
		return new Class2_Sub6_Sub2_Sub2(arg0.anInterface26_3, arg0.method5984(), arg0.anInt7009);
	}
}
