import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class233_Sub1 extends Class233 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ac;Z)Lclient!ac;")
	@Override
	public Class4_Sub1_Sub1 method5346(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		return new Class4_Sub1_Sub1_Sub1(arg0.anInterface8_3, arg0.method1230(), arg0.anInt1339);
	}
}
