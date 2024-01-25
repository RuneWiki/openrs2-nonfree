import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!jj;)Lclient!jj;")
	@Override
	public Class1_Sub4_Sub14 method1819(@OriginalArg(1) Class1_Sub4_Sub14 arg0) {
		return new Class1_Sub4_Sub14_Sub2(arg0.method4959(), arg0.anInt5412);
	}
}
