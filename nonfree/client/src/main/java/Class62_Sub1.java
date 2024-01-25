import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	private Class62_Sub1() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!eea;)Lclient!eea;")
	@Override
	public Class14_Sub2_Sub1 method1240(@OriginalArg(1) Class14_Sub2_Sub1 arg0) {
		return new Class14_Sub2_Sub1_Sub2(arg0.method8225(), arg0.anInt9522);
	}
}
