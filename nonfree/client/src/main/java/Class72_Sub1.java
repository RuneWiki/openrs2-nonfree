import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!t;)Lclient!t;")
	@Override
	public Class3_Sub7_Sub7 method1733(@OriginalArg(1) Class3_Sub7_Sub7 arg0) {
		return new Class3_Sub7_Sub7_Sub2(arg0.anInterface1_3, arg0.method5389());
	}
}
