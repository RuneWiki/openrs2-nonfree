import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class2_Sub8_Sub17 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "Lclient!mg;")
	public Class15_Sub6 aClass15_Sub6_1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!mg;)V")
	public Class2_Sub8_Sub17(@OriginalArg(0) Class15_Sub6 arg0) {
		this.aClass15_Sub6_1 = arg0;
	}
}
