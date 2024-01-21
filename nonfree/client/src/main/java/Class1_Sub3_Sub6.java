import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!h", name = "R", descriptor = "Lclient!ah;")
	public final Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class1_Sub3_Sub6(@OriginalArg(0) Class8_Sub1 arg0) {
		this.aClass8_Sub1_1 = arg0;
	}
}
