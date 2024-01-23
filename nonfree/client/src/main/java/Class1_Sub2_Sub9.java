import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
	public static int[] anIntArray108 = new int[4096];

	@OriginalMember(owner = "client!he", name = "I", descriptor = "Lclient!wd;")
	public Class5_Sub7 aClass5_Sub7_1;

	static {
		for (@Pc(9) int local9 = 0; local9 < 4096; local9++) {
			anIntArray108[local9] = Static89.method1028(local9);
		}
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class1_Sub2_Sub9(@OriginalArg(0) Class5_Sub7 arg0) {
		this.aClass5_Sub7_1 = arg0;
	}
}
