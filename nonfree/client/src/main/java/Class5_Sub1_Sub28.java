import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class5_Sub1_Sub28 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qu", name = "R", descriptor = "[I")
	private final int[] anIntArray489 = new int[3];

	@OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
	private int anInt8258 = 4096;

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
	private int anInt8262 = 4096;

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
	private int anInt8261 = 4096;

	@OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
	private int anInt8260 = 409;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(22) int[][] local22 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(32) int[][] local32 = this.method9203(0, arg0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Static648.anInt9588; local58++) {
				@Pc(64) int local64 = local36[local58];
				@Pc(72) int local72 = local64 - this.anIntArray489[0];
				if (local72 < 0) {
					local72 = -local72;
				}
				if (local72 > this.anInt8260) {
					local48[local58] = local64;
					local52[local58] = local40[local58];
					local56[local58] = local44[local58];
				} else {
					@Pc(112) int local112 = local40[local58];
					local72 = local112 - this.anIntArray489[1];
					if (local72 < 0) {
						local72 = -local72;
					}
					if (local72 > this.anInt8260) {
						local48[local58] = local64;
						local52[local58] = local112;
						local56[local58] = local44[local58];
					} else {
						@Pc(158) int local158 = local44[local58];
						local72 = local158 - this.anIntArray489[2];
						if (local72 < 0) {
							local72 = -local72;
						}
						if (local72 > this.anInt8260) {
							local48[local58] = local64;
							local52[local58] = local112;
							local56[local58] = local158;
						} else {
							local48[local58] = local64 * this.anInt8261 >> 12;
							local52[local58] = this.anInt8258 * local112 >> 12;
							local56[local58] = this.anInt8262 * local158 >> 12;
						}
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt8260 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt8262 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt8258 = arg1.method8519();
		} else if (arg0 == 3) {
			this.anInt8261 = arg1.method8519();
		} else if (arg0 == 4) {
			@Pc(72) int local72 = arg1.method8510();
			this.anIntArray489[1] = local72 >> 4 & 0xFF0;
			this.anIntArray489[2] = local72 >> 12 & 0x0;
			this.anIntArray489[0] = (local72 & 0xFF0000) << 4;
		}
	}
}
