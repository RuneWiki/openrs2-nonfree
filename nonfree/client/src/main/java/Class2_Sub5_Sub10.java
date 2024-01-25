import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class2_Sub5_Sub10 extends Class2_Sub5 {

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!rj;")
	public final Class3_Sub4_Sub4 aClass3_Sub4_Sub4_1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!rj;)V")
	public Class2_Sub5_Sub10(@OriginalArg(0) Class3_Sub4_Sub4 arg0) {
		this.aClass3_Sub4_Sub4_1 = arg0;
	}
}
