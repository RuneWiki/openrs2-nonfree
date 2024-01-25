import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class174_Sub1 extends Class174 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!hba;B)Lclient!hba;")
	@Override
	public Class4_Sub7_Sub6 method7142(@OriginalArg(0) Class4_Sub7_Sub6 arg0) {
		return new Class4_Sub7_Sub6_Sub2(arg0.method7127(), arg0.anInt8670);
	}
}
