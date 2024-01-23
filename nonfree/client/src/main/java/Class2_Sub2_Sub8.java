import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "[I")
	public static int[] anIntArray223 = new int[32];

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "Lclient!nc;")
	public Class12 aClass12_3;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray223[local10] = local8 - 1;
			local8 += local8;
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class2_Sub2_Sub8(@OriginalArg(0) Class12 arg0) {
		this.aClass12_3 = arg0;
	}
}
