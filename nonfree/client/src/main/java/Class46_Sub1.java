import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!vn;)Lclient!vn;")
	@Override
	public Class2_Sub13_Sub3 method1469(@OriginalArg(1) Class2_Sub13_Sub3 arg0) {
		return new Class2_Sub13_Sub3_Sub2(arg0.anInterface20_3, arg0.method3363(), arg0.anInt3806);
	}
}
