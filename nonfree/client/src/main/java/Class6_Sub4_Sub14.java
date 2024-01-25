import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class6_Sub4_Sub14 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "Lclient!lga;")
	public final Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!lga;)V")
	public Class6_Sub4_Sub14(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		this.aClass2_Sub1_Sub1_Sub4_1 = arg0;
	}
}
