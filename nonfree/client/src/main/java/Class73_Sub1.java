import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLclient!ni;)Lclient!ni;")
	@Override
	public Class2_Sub7_Sub7 method1946(@OriginalArg(1) Class2_Sub7_Sub7 arg0) {
		return new Class2_Sub7_Sub7_Sub1(arg0.anInterface9_3, arg0.method4728(), arg0.anInt5394);
	}
}
