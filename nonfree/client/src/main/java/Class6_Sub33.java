import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "Lclient!ag;")
	public final Class11_Sub1_Sub1_Sub1 aClass11_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class6_Sub33(@OriginalArg(0) Class11_Sub1_Sub1_Sub1 arg0) {
		this.aClass11_Sub1_Sub1_Sub1_2 = arg0;
	}
}
