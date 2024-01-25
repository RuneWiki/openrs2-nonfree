import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public final class Class6_Sub4_Sub21 extends Class6_Sub4 {

	@OriginalMember(owner = "client!wja", name = "A", descriptor = "Lclient!cd;")
	public final Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!cd;)V")
	public Class6_Sub4_Sub21(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0) {
		this.aClass2_Sub1_Sub1_Sub1_1 = arg0;
	}
}
