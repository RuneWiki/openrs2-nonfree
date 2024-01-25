import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class150_Sub1 extends Class150 {

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!rba;I)Lclient!rba;")
	@Override
	public Class5_Sub4_Sub16 method3570(@OriginalArg(0) Class5_Sub4_Sub16 arg0) {
		return new Class5_Sub4_Sub16_Sub2(arg0.anInterface11_3, arg0.method8271(), arg0.anInt9639);
	}
}
