import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class61 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[Lclient!vg;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class61(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(19) Class1_Sub2 local19 = this.aClass1_Sub2Array1[local7] = new Class1_Sub2();
			local19.aClass1_Sub2_69 = local19;
			local19.aClass1_Sub2_68 = local19;
		}
	}
}
