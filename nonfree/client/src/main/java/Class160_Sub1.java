import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!cs;B)Lclient!cs;")
	@Override
	public Class1_Sub1_Sub6 method4427(@OriginalArg(0) Class1_Sub1_Sub6 arg0) {
		return new Class1_Sub1_Sub6_Sub2(arg0.method3235());
	}
}
