import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!hl;)Lclient!hl;")
	@Override
	public Class2_Sub11_Sub7 method3030(@OriginalArg(1) Class2_Sub11_Sub7 arg0) {
		return new Class2_Sub11_Sub7_Sub2(arg0.anInterface4_3, arg0.method3998());
	}
}
