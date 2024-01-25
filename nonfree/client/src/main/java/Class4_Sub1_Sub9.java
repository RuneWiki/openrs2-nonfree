import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Lclient!ei;")
	public final Class6_Sub2_Sub4 aClass6_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ei;)V")
	public Class4_Sub1_Sub9(@OriginalArg(0) Class6_Sub2_Sub4 arg0) {
		this.aClass6_Sub2_Sub4_1 = arg0;
	}
}
