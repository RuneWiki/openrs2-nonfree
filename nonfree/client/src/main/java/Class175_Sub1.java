import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class175_Sub1 extends Class175 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!er;)Lclient!er;")
	@Override
	public Class3_Sub7_Sub4 method4049(@OriginalArg(1) Class3_Sub7_Sub4 arg0) {
		return new Class3_Sub7_Sub4_Sub1(arg0.method2648(), arg0.anInt2996);
	}
}
