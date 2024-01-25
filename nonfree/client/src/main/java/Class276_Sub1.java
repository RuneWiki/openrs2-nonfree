import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class276_Sub1 extends Class276 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!en;)Lclient!en;")
	@Override
	public Class3_Sub7_Sub4 method6108(@OriginalArg(1) Class3_Sub7_Sub4 arg0) {
		return new Class3_Sub7_Sub4_Sub2(arg0.anInterface18_3, arg0.method5851(), arg0.anInt6998);
	}
}
