import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class171_Sub1 extends Class171 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ef;B)Lclient!ef;")
	@Override
	public Class1_Sub3_Sub6 method4437(@OriginalArg(0) Class1_Sub3_Sub6 arg0) {
		return new Class1_Sub3_Sub6_Sub1(arg0.anInterface2_3, arg0.method3329(), arg0.anInt4209);
	}
}
