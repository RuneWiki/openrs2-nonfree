import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class83_Sub1 extends Class83 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!mga;I)Lclient!mga;")
	@Override
	public Class3_Sub7_Sub15 method2424(@OriginalArg(0) Class3_Sub7_Sub15 arg0) {
		return new Class3_Sub7_Sub15_Sub2(arg0.method6553(), arg0.anInt7879);
	}
}
