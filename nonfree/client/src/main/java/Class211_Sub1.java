import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class211_Sub1 extends Class211 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!ce;I)Lclient!ce;")
	@Override
	public Class2_Sub5_Sub2 method5041(@OriginalArg(0) Class2_Sub5_Sub2 arg0) {
		return new Class2_Sub5_Sub2_Sub1(arg0.method1877(), arg0.anInt2395);
	}
}
