import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub4_Sub19 extends Class2_Sub4 {

	@OriginalMember(owner = "client!m", name = "W", descriptor = "I")
	private int anInt2571 = 4096;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	private int anInt2572 = 4096;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
	private int anInt2574 = 409;

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
	private int anInt2575 = 4096;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "[I")
	private final int[] anIntArray239 = new int[3];

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(22) int[][] local22 = this.method3130(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local12[0];
			@Pc(38) int[] local38 = local22[2];
			@Pc(42) int[] local42 = local12[2];
			@Pc(46) int[] local46 = local12[1];
			for (@Pc(48) int local48 = 0; local48 < Static118.anInt2608; local48++) {
				@Pc(54) int local54 = local26[local48];
				@Pc(61) int local61 = local54 - this.anIntArray239[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (local61 > this.anInt2574) {
					local34[local48] = local54;
					local46[local48] = local30[local48];
					local42[local48] = local38[local48];
				} else {
					@Pc(99) int local99 = local30[local48];
					local61 = local99 - this.anIntArray239[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt2574) {
						local34[local48] = local54;
						local46[local48] = local99;
						local42[local48] = local38[local48];
					} else {
						@Pc(140) int local140 = local38[local48];
						local61 = local140 - this.anIntArray239[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (local61 > this.anInt2574) {
							local34[local48] = local54;
							local46[local48] = local99;
							local42[local48] = local140;
						} else {
							local34[local48] = this.anInt2572 * local54 >> 12;
							local46[local48] = this.anInt2575 * local99 >> 12;
							local42[local48] = this.anInt2571 * local140 >> 12;
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2574 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt2571 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt2575 = arg1.method1557();
		} else if (arg0 == 3) {
			this.anInt2572 = arg1.method1557();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method1536();
			this.anIntArray239[2] = local59 >> 12 & 0x0;
			this.anIntArray239[1] = local59 >> 4 & 0xFF0;
			this.anIntArray239[0] = (local59 & 0xFF0000) << 4;
		}
	}
}
