import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ls;I)Lclient!ls;")
	@Override
	public Class10_Sub1_Sub5 method1070(@OriginalArg(0) Class10_Sub1_Sub5 arg0) {
		return new Class10_Sub1_Sub5_Sub2(arg0.anInterface12_3, arg0.method3394(), arg0.anInt4234);
	}
}
