import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!mha;)Lclient!mha;")
	@Override
	public Class3_Sub7_Sub3 method2423(@OriginalArg(1) Class3_Sub7_Sub3 arg0) {
		return new Class3_Sub7_Sub3_Sub2(arg0.anInterface4_3, arg0.method5775(), arg0.anInt6634);
	}
}
