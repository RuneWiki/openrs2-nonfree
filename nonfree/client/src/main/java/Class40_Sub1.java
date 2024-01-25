import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!tt;I)Lclient!tt;")
	@Override
	public Class4_Sub6_Sub4 method7128(@OriginalArg(0) Class4_Sub6_Sub4 arg0) {
		return new Class4_Sub6_Sub4_Sub1(arg0.method3257(), arg0.anInt4125);
	}
}
