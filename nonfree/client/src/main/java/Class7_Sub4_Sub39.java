import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class7_Sub4_Sub39 extends Class7_Sub4 {

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	private int anInt6630 = 4096;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
	private int anInt6633 = 409;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
	private int anInt6637 = 4096;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "[I")
	private final int[] anIntArray842 = new int[3];

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
	private int anInt6634 = 4096;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6633 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt6630 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt6634 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt6637 = arg0.method2764();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method2791();
			this.anIntArray842[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray842[2] = local63 >> 12 & 0x0;
			this.anIntArray842[1] = local63 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(29) int[][] local29 = this.method5638(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static201.anInt4174; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray842[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (local68 > this.anInt6633) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(99) int local99 = local37[local55];
					local68 = local99 - this.anIntArray842[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt6633 < local68) {
						local45[local55] = local61;
						local49[local55] = local99;
						local53[local55] = local41[local55];
					} else {
						@Pc(139) int local139 = local41[local55];
						local68 = local139 - this.anIntArray842[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt6633 < local68) {
							local45[local55] = local61;
							local49[local55] = local99;
							local53[local55] = local139;
						} else {
							local45[local55] = this.anInt6637 * local61 >> 12;
							local49[local55] = this.anInt6634 * local99 >> 12;
							local53[local55] = this.anInt6630 * local139 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
