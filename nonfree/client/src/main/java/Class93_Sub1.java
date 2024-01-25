import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ba;I)Lclient!ba;")
	@Override
	public Class10_Sub1_Sub3 method5401(@OriginalArg(0) Class10_Sub1_Sub3 arg0) {
		return new Class10_Sub1_Sub3_Sub1(arg0.method5668(), arg0.anInt7190);
	}
}
