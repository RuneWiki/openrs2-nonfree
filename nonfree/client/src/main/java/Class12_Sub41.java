import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class12_Sub41 extends Class12 {

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!hh;")
	public final Class30_Sub1_Sub1_Sub2 aClass30_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!hh;)V")
	public Class12_Sub41(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0) {
		this.aClass30_Sub1_Sub1_Sub2_2 = arg0;
	}
}
