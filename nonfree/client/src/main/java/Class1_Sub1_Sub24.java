import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
	private int anInt2923 = 4096;

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
	private int anInt2917 = 4096;

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "[I")
	private final int[] anIntArray254 = new int[3];

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
	private int anInt2928 = 409;

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
	private int anInt2929 = 4096;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(29) int[][] local29 = this.method3397(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static107.anInt2321; local55++) {
				@Pc(61) int local61 = local37[local55];
				@Pc(68) int local68 = local61 - this.anIntArray254[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt2928 < local68) {
					local41[local55] = local61;
					local49[local55] = local33[local55];
					local53[local55] = local45[local55];
				} else {
					@Pc(103) int local103 = local33[local55];
					local68 = local103 - this.anIntArray254[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt2928 < local68) {
						local41[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local45[local55];
					} else {
						@Pc(143) int local143 = local45[local55];
						local68 = local143 - this.anIntArray254[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt2928) {
							local41[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local143;
						} else {
							local41[local55] = this.anInt2923 * local61 >> 12;
							local49[local55] = this.anInt2917 * local103 >> 12;
							local53[local55] = local143 * this.anInt2929 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2928 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt2929 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt2917 = arg0.method3023();
		} else if (arg1 == 3) {
			this.anInt2923 = arg0.method3023();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method3049();
			this.anIntArray254[1] = local57 >> 4 & 0xFF0;
			this.anIntArray254[2] = local57 >> 12 & 0x0;
			this.anIntArray254[0] = (local57 & 0xFF0000) << 4;
		}
	}
}
