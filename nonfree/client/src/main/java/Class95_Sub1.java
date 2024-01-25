import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!sq;B)Lclient!sq;")
	@Override
	public Class1_Sub2_Sub17 method4397(@OriginalArg(0) Class1_Sub2_Sub17 arg0) {
		return new Class1_Sub2_Sub17_Sub2(arg0.method5738(), arg0.anInt7404);
	}
}
