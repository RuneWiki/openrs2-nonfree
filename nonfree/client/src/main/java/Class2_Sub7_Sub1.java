import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
	private int anInt730 = 4096;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "[I")
	private final int[] anIntArray54 = new int[3];

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
	private int anInt732 = 4096;

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	private int anInt736 = 4096;

	@OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
	private int anInt738 = 409;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt738 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt732 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt730 = arg1.method5229();
		} else if (arg0 == 3) {
			this.anInt736 = arg1.method5229();
		} else if (arg0 == 4) {
			@Pc(65) int local65 = arg1.method5210();
			this.anIntArray54[0] = (local65 & 0xFF0000) << 4;
			this.anIntArray54[2] = local65 >> 12 & 0x0;
			this.anIntArray54[1] = local65 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7589(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static352.anInt6485; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray54[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt738) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local34[local52];
					local66 = local101 - this.anIntArray54[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt738) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(142) int local142 = local38[local52];
						local66 = local142 - this.anIntArray54[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt738) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local142;
						} else {
							local42[local52] = this.anInt736 * local58 >> 12;
							local46[local52] = this.anInt730 * local101 >> 12;
							local50[local52] = local142 * this.anInt732 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
