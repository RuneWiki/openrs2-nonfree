import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "Lclient!uk;")
	public final Class3_Sub2_Sub6 aClass3_Sub2_Sub6_1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!uk;)V")
	public Class6_Sub2_Sub13(@OriginalArg(0) Class3_Sub2_Sub6 arg0) {
		this.aClass3_Sub2_Sub6_1 = arg0;
	}
}
