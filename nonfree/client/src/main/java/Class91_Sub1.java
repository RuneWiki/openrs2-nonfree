import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ok;B)Lclient!ok;")
	@Override
	public Class1_Sub3_Sub6 method5476(@OriginalArg(0) Class1_Sub3_Sub6 arg0) {
		return new Class1_Sub3_Sub6_Sub1(arg0.method5933(), arg0.anInt7193);
	}
}
