import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!ow;B)Lclient!ow;")
	@Override
	public Class5_Sub2_Sub11 method2817(@OriginalArg(0) Class5_Sub2_Sub11 arg0) {
		return new Class5_Sub2_Sub11_Sub1(arg0.method5022(), arg0.anInt6040);
	}
}
