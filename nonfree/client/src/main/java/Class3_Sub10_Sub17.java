import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class3_Sub10_Sub17 extends Class3_Sub10 {

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "Lclient!dl;")
	public final Class6_Sub1_Sub1 aClass6_Sub1_Sub1_1;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!dl;)V")
	public Class3_Sub10_Sub17(@OriginalArg(0) Class6_Sub1_Sub1 arg0) {
		this.aClass6_Sub1_Sub1_1 = arg0;
	}
}
