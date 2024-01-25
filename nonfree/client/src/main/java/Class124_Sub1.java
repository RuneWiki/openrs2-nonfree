import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ir;B)Lclient!ir;")
	@Override
	public Class2_Sub5_Sub7 method8418(@OriginalArg(0) Class2_Sub5_Sub7 arg0) {
		return new Class2_Sub5_Sub7_Sub2(arg0.anInterface21_3, arg0.method4488(), arg0.anInt5374);
	}
}
