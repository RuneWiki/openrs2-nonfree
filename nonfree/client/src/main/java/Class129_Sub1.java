import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!it;)Lclient!it;")
	@Override
	public Class3_Sub11_Sub9 method3750(@OriginalArg(1) Class3_Sub11_Sub9 arg0) {
		return new Class3_Sub11_Sub9_Sub2(arg0.anInterface23_3, arg0.method4006(), arg0.anInt4399);
	}
}
