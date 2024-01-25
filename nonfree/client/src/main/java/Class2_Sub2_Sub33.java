import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class2_Sub2_Sub33 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
	private int anInt6569 = 409;

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private int anInt6570 = 4096;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
	private int anInt6573 = 4096;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "[I")
	private final int[] anIntArray535 = new int[3];

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
	private int anInt6575 = 4096;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6569 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt6575 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt6570 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt6573 = arg0.method6148();
		} else if (arg1 == 4) {
			@Pc(66) int local66 = arg0.method6145();
			this.anIntArray535[1] = local66 >> 4 & 0xFF0;
			this.anIntArray535[0] = (local66 & 0xFF0000) << 4;
			this.anIntArray535[2] = local66 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(30) int[][] local30 = this.method6276(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local18[1];
			@Pc(54) int[] local54 = local18[2];
			for (@Pc(56) int local56 = 0; local56 < Static398.anInt6955; local56++) {
				@Pc(62) int local62 = local34[local56];
				@Pc(70) int local70 = local62 - this.anIntArray535[0];
				if (local70 < 0) {
					local70 = -local70;
				}
				if (local70 > this.anInt6569) {
					local46[local56] = local62;
					local50[local56] = local38[local56];
					local54[local56] = local42[local56];
				} else {
					@Pc(101) int local101 = local38[local56];
					local70 = local101 - this.anIntArray535[1];
					if (local70 < 0) {
						local70 = -local70;
					}
					if (local70 > this.anInt6569) {
						local46[local56] = local62;
						local50[local56] = local101;
						local54[local56] = local42[local56];
					} else {
						@Pc(142) int local142 = local42[local56];
						local70 = local142 - this.anIntArray535[2];
						if (local70 < 0) {
							local70 = -local70;
						}
						if (local70 > this.anInt6569) {
							local46[local56] = local62;
							local50[local56] = local101;
							local54[local56] = local142;
						} else {
							local46[local56] = this.anInt6573 * local62 >> 12;
							local50[local56] = local101 * this.anInt6570 >> 12;
							local54[local56] = this.anInt6575 * local142 >> 12;
						}
					}
				}
			}
		}
		return local18;
	}
}
