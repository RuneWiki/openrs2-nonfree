import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!wb;)Lclient!wb;")
	@Override
	public Class4_Sub2_Sub8 method4119(@OriginalArg(1) Class4_Sub2_Sub8 arg0) {
		return new Class4_Sub2_Sub8_Sub1(arg0.method1916());
	}
}
