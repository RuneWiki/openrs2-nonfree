import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class264 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
	public static final int[] anIntArray496 = new int[32];

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public int anInt7242;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public int anInt7243;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public int anInt7244;

	static {
		@Pc(302) int local302 = 2;
		for (@Pc(304) int local304 = 0; local304 < 32; local304++) {
			anIntArray496[local304] = local302 - 1;
			local302 += local302;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BILclient!es;)V")
	private void method6083(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7243 = arg1.method4294();
			this.anInt7244 = arg1.method4325();
			this.anInt7242 = arg1.method4325();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!es;)V")
	public void method6084(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4325();
			if (local13 == 0) {
				return;
			}
			this.method6083(local13, arg0);
		}
	}
}
