import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZLclient!un;)Lclient!un;")
	@Override
	public Class2_Sub13_Sub12 method3405(@OriginalArg(1) Class2_Sub13_Sub12 arg0) {
		return new Class2_Sub13_Sub12_Sub2(arg0.method6647(), arg0.anInt7935);
	}
}
