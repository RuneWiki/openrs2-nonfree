import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class3_Sub3_Sub8 extends Class3_Sub3 {

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Lclient!nb;")
	public final Class1_Sub3_Sub5 aClass1_Sub3_Sub5_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class3_Sub3_Sub8(@OriginalArg(0) Class1_Sub3_Sub5 arg0) {
		this.aClass1_Sub3_Sub5_1 = arg0;
	}
}
