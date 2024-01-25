import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!in;)Lclient!in;")
	@Override
	public Class1_Sub6_Sub3 method4872(@OriginalArg(1) Class1_Sub6_Sub3 arg0) {
		return new Class1_Sub6_Sub3_Sub1(arg0.method2161(), arg0.anInt2655);
	}
}
