import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!jm;")
	public final Class3_Sub4_Sub1_Sub1 aClass3_Sub4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!jm;)V")
	public Class2_Sub28(@OriginalArg(0) Class3_Sub4_Sub1_Sub1 arg0) {
		this.aClass3_Sub4_Sub1_Sub1_1 = arg0;
	}
}
