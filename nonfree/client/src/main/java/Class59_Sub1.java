import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!th;B)Lclient!th;")
	@Override
	public Class4_Sub4_Sub20 method1865(@OriginalArg(0) Class4_Sub4_Sub20 arg0) {
		return new Class4_Sub4_Sub20_Sub2(arg0.method5681());
	}
}
