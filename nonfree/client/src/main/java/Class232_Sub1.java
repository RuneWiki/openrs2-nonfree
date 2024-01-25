import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class232_Sub1 extends Class232 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!rk;I)Lclient!rk;")
	@Override
	public Class5_Sub4_Sub4 method6958(@OriginalArg(0) Class5_Sub4_Sub4 arg0) {
		return new Class5_Sub4_Sub4_Sub2(arg0.method4398(), arg0.anInt4810);
	}
}
