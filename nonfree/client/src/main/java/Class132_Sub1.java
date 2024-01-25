import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!rb;)Lclient!rb;")
	@Override
	public Class3_Sub11_Sub7 method3786(@OriginalArg(1) Class3_Sub11_Sub7 arg0) {
		return new Class3_Sub11_Sub7_Sub2(arg0.method4483(), arg0.anInt4843);
	}
}
