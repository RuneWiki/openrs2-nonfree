import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class91 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "[Lclient!lk;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
	public Class91(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(17) Class1_Sub2 local17 = this.aClass1_Sub2Array1[local7] = new Class1_Sub2();
			local17.aClass1_Sub2_58 = local17;
			local17.aClass1_Sub2_59 = local17;
		}
	}
}
