import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "[I")
	public static final int[] anIntArray343 = new int[120];

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
	private int anInt4044 = 4096;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	private int anInt4040 = 4096;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
	private int anInt4045 = 4096;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 120; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) (Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D + (double) local13);
			local6 += local26;
			anIntArray343[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4044 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt4040 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt4045 = arg0.method3967();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(26) int[][] local26 = this.method7130(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static452.anInt7734; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local62) {
					local42[local52] = local58 * this.anInt4044 >> 12;
					local46[local52] = this.anInt4040 * local62 >> 12;
					local50[local52] = this.anInt4045 * local66 >> 12;
				} else {
					local42[local52] = this.anInt4044;
					local46[local52] = this.anInt4040;
					local50[local52] = this.anInt4045;
				}
			}
		}
		return local16;
	}
}
