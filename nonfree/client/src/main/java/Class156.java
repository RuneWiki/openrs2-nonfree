import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class156 {

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "[Lclient!na;")
	private Class1_Sub2[] aClass1_Sub2Array1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class156(@OriginalArg(0) int arg0) {
		this.aClass1_Sub2Array1 = new Class1_Sub2[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) Class1_Sub2 local23 = this.aClass1_Sub2Array1[local7] = new Class1_Sub2();
			local23.aClass1_Sub2_69 = local23;
			local23.aClass1_Sub2_68 = local23;
		}
	}
}
