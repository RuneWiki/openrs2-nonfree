import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!jp;B)Lclient!jp;")
	@Override
	public Class2_Sub5_Sub9 method5186(@OriginalArg(0) Class2_Sub5_Sub9 arg0) {
		return new Class2_Sub5_Sub9_Sub1(arg0.anInterface11_3, arg0.method5077(), arg0.anInt6412);
	}
}
