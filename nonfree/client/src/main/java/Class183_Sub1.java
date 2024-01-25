import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class183_Sub1 extends Class183 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!dc;Z)Lclient!dc;")
	@Override
	public Class2_Sub2_Sub6 method3903(@OriginalArg(0) Class2_Sub2_Sub6 arg0) {
		return new Class2_Sub2_Sub6_Sub2(arg0.anInterface27_3, arg0.method6488(), arg0.anInt7674);
	}
}
