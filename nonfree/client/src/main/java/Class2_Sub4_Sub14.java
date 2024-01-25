import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class2_Sub4_Sub14 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	private int anInt2684 = 4096;

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
	private int anInt2685 = 409;

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "[I")
	private final int[] anIntArray558 = new int[3];

	@OriginalMember(owner = "client!hp", name = "X", descriptor = "I")
	private int anInt2692 = 4096;

	@OriginalMember(owner = "client!hp", name = "gb", descriptor = "I")
	private int anInt2698 = 4096;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(28) int[][] local28 = this.method5591(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static76.anInt1458; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(68) int local68 = local60 - this.anIntArray558[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt2685 < local68) {
					local44[local54] = local60;
					local48[local54] = local36[local54];
					local52[local54] = local40[local54];
				} else {
					@Pc(102) int local102 = local36[local54];
					local68 = local102 - this.anIntArray558[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (local68 > this.anInt2685) {
						local44[local54] = local60;
						local48[local54] = local102;
						local52[local54] = local40[local54];
					} else {
						@Pc(143) int local143 = local40[local54];
						local68 = local143 - this.anIntArray558[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt2685) {
							local44[local54] = local60;
							local48[local54] = local102;
							local52[local54] = local143;
						} else {
							local44[local54] = local60 * this.anInt2698 >> 12;
							local48[local54] = local102 * this.anInt2684 >> 12;
							local52[local54] = this.anInt2692 * local143 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2685 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt2692 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt2684 = arg0.method5312();
		} else if (arg1 == 3) {
			this.anInt2698 = arg0.method5312();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method5356();
			this.anIntArray558[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray558[2] = local62 >> 12 & 0x0;
			this.anIntArray558[1] = local62 >> 4 & 0xFF0;
		}
	}
}
