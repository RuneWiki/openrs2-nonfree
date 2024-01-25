import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class176_Sub1 extends Class176 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!br;)Lclient!br;")
	@Override
	public Class1_Sub4_Sub4 method5496(@OriginalArg(1) Class1_Sub4_Sub4 arg0) {
		return new Class1_Sub4_Sub4_Sub2(arg0.method1930());
	}
}
