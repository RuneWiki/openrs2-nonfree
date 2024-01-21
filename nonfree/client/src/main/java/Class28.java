import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class28 {

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
	public static int[] anIntArray145 = new int[99];

	static {
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 99; local26++) {
			@Pc(31) int local31 = local26 + 1;
			@Pc(44) int local44 = (int) (Math.pow(2.0D, (double) local31 / 7.0D) * 300.0D + (double) local31);
			local24 += local44;
			anIntArray145[local26] = local24 / 4;
		}
	}
}
