import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!gd;)Lclient!gd;")
	@Override
	public Class3_Sub7_Sub4 method1083(@OriginalArg(1) Class3_Sub7_Sub4 arg0) {
		return new Class3_Sub7_Sub4_Sub2(arg0.anInterface10_3, arg0.method5377(), arg0.anInt6674);
	}
}
