import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!cv;I)Lclient!cv;")
	@Override
	public Class4_Sub2_Sub8 method176(@OriginalArg(0) Class4_Sub2_Sub8 arg0) {
		return new Class4_Sub2_Sub8_Sub2(arg0.method4596(), arg0.anInt5741);
	}
}
