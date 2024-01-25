import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class231_Sub1 extends Class231 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wm;B)Lclient!wm;")
	@Override
	public Class3_Sub4_Sub6 method5191(@OriginalArg(0) Class3_Sub4_Sub6 arg0) {
		return new Class3_Sub4_Sub6_Sub2(arg0.anInterface11_3, arg0.method5833(), arg0.anInt7500);
	}
}
