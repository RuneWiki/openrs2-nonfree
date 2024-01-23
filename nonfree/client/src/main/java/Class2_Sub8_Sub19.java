import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class2_Sub8_Sub19 extends Class2_Sub8 {

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Lclient!bf;")
	public Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class2_Sub8_Sub19(@OriginalArg(0) Class15_Sub1 arg0) {
		this.aClass15_Sub1_1 = arg0;
	}
}
