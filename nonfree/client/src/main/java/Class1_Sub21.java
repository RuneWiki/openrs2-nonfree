import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
	public static int[] anIntArray359 = new int[32];

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	public final int anInt3820;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	public final int anInt3818;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray359[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3820 = arg0;
		this.anInt3818 = arg1;
	}
}
