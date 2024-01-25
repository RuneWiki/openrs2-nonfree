import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!cb;)Lclient!cb;")
	@Override
	public Class3_Sub3_Sub2 method1162(@OriginalArg(1) Class3_Sub3_Sub2 arg0) {
		return new Class3_Sub3_Sub2_Sub2(arg0.anInterface11_3, arg0.method4695(), arg0.anInt5648);
	}
}
