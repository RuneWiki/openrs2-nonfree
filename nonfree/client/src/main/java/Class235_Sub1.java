import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class235_Sub1 extends Class235 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!gf;B)Lclient!gf;")
	@Override
	public Class2_Sub7_Sub5 method5691(@OriginalArg(0) Class2_Sub7_Sub5 arg0) {
		return new Class2_Sub7_Sub5_Sub2(arg0.anInterface10_3, arg0.method5095(), arg0.anInt5759);
	}
}
