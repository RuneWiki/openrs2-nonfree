import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!io;I)Lclient!io;")
	@Override
	public Class6_Sub4_Sub7 method2012(@OriginalArg(0) Class6_Sub4_Sub7 arg0) {
		return new Class6_Sub4_Sub7_Sub1(arg0.method4575(), arg0.anInt5390);
	}
}
