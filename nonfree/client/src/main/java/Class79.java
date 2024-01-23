import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class79 {

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
	public static int[] anIntArray458 = new int[99];

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
	public int[] anIntArray460;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!ud;")
	public Class1_Sub1_Sub26 aClass1_Sub1_Sub26_1;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "[Lclient!kh;")
	public Class60[] aClass60Array24;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public int anInt3559 = -1;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray458[local6] = local4 / 4;
		}
	}
}
