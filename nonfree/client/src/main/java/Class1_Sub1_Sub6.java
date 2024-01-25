import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "[I")
	private final int[] anIntArray82 = new int[3];

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
	private int anInt1530 = 4096;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	private int anInt1532 = 4096;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	private int anInt1525 = 409;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
	private int anInt1527 = 4096;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1525 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt1530 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt1527 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt1532 = arg1.method4426();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method4396();
			this.anIntArray82[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray82[1] = local61 >> 4 & 0xFF0;
			this.anIntArray82[2] = local61 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[][] local26 = this.method7880(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static87.anInt1964; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray82[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt1525 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(97) int local97 = local34[local52];
					local66 = local97 - this.anIntArray82[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt1525) {
						local42[local52] = local58;
						local46[local52] = local97;
						local50[local52] = local38[local52];
					} else {
						@Pc(141) int local141 = local38[local52];
						local66 = local141 - this.anIntArray82[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt1525 < local66) {
							local42[local52] = local58;
							local46[local52] = local97;
							local50[local52] = local141;
						} else {
							local42[local52] = local58 * this.anInt1532 >> 12;
							local46[local52] = local97 * this.anInt1527 >> 12;
							local50[local52] = local141 * this.anInt1530 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
