import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class7 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
	public static int[] anIntArray8 = new int[99];

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!pi;")
	public Class8_Sub1_Sub12 aClass8_Sub1_Sub12_1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public int anInt61;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(13) int local13 = local6 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local4 += local26;
			anIntArray8[local6] = local4 / 4;
		}
	}
}
