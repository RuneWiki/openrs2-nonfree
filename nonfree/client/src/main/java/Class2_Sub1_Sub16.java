import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "[I")
	public static final int[] anIntArray418 = new int[32];

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!aa;")
	public Class2_Sub1_Sub1 aClass2_Sub1_Sub1_8;

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray418[local9] = local7 - 1;
			local7 += local7;
		}
	}
}
