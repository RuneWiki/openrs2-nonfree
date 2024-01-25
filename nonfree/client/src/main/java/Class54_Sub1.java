import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!hfa;B)Lclient!hfa;")
	@Override
	public Class5_Sub3_Sub6 method5372(@OriginalArg(0) Class5_Sub3_Sub6 arg0) {
		return new Class5_Sub3_Sub6_Sub1(arg0.anInterface20_3, arg0.method8111(), arg0.anInt9703);
	}
}
