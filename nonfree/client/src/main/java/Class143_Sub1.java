import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	private Class143_Sub1() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!fha;Z)Lclient!fha;")
	@Override
	public Class3_Sub4_Sub7 method3588(@OriginalArg(0) Class3_Sub4_Sub7 arg0) {
		return new Class3_Sub4_Sub7_Sub2(arg0.anInterface13_3, arg0.method5467(), arg0.anInt6457);
	}
}
