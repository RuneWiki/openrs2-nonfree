import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class69 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "[Lclient!w;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public Class69(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) Class1_Sub2 local23 = this.aClass1_Sub2Array1[local7] = new Class1_Sub2();
			local23.aClass1_Sub2_68 = local23;
			local23.aClass1_Sub2_69 = local23;
		}
	}
}
