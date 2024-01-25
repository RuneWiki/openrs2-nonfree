import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class224_Sub1 extends Class224 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!vs;I)Lclient!vs;")
	@Override
	public Class1_Sub6_Sub12 method4479(@OriginalArg(0) Class1_Sub6_Sub12 arg0) {
		return new Class1_Sub6_Sub12_Sub1(arg0.method7761(), arg0.anInt9519);
	}
}
