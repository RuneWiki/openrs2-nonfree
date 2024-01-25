import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hl;B)Lclient!hl;")
	@Override
	public Class6_Sub1_Sub11 method5895(@OriginalArg(0) Class6_Sub1_Sub11 arg0) {
		return new Class6_Sub1_Sub11_Sub2(arg0.anInterface1_3, arg0.method5718(), arg0.anInt7039);
	}
}
