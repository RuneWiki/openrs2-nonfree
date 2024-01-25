import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class6_Sub4_Sub17 extends Class6_Sub4 {

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!ct;")
	public final Class11_Sub1_Sub2 aClass11_Sub1_Sub2_1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ct;)V")
	public Class6_Sub4_Sub17(@OriginalArg(0) Class11_Sub1_Sub2 arg0) {
		this.aClass11_Sub1_Sub2_1 = arg0;
	}
}
