import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!cv;)Lclient!cv;")
	@Override
	public Class5_Sub2_Sub4 method1858(@OriginalArg(1) Class5_Sub2_Sub4 arg0) {
		return new Class5_Sub2_Sub4_Sub2(arg0.method3965(), arg0.anInt5016);
	}
}
