import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class192_Sub1 extends Class192 {

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	private Class192_Sub1() {
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!ri;B)Lclient!ri;")
	@Override
	public Class2_Sub6_Sub11 method5483(@OriginalArg(0) Class2_Sub6_Sub11 arg0) {
		return new Class2_Sub6_Sub11_Sub2(arg0.method6201(), arg0.anInt6902);
	}
}
