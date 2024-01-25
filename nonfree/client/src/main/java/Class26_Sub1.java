import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!av;B)Lclient!av;")
	@Override
	public Class4_Sub1_Sub2 method1434(@OriginalArg(0) Class4_Sub1_Sub2 arg0) {
		return new Class4_Sub1_Sub2_Sub1(arg0.method5314(), arg0.anInt6848);
	}
}
