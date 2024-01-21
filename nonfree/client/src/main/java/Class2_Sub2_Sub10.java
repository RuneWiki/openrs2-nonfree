import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "[I")
	private final int[] anIntArray139 = new int[3];

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
	private int anInt1468 = 409;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
	private int anInt1471 = 4096;

	@OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
	private int anInt1474 = 4096;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
	private int anInt1470 = 4096;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(29) int[][] local29 = this.method3557(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[2];
			@Pc(49) int[] local49 = local19[0];
			@Pc(53) int[] local53 = local19[1];
			for (@Pc(55) int local55 = 0; local55 < Static106.anInt3045; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray139[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt1468) {
					local49[local55] = local61;
					local53[local55] = local37[local55];
					local45[local55] = local41[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray139[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt1468 < local69) {
						local49[local55] = local61;
						local53[local55] = local104;
						local45[local55] = local41[local55];
					} else {
						@Pc(148) int local148 = local41[local55];
						local69 = local148 - this.anIntArray139[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt1468 < local69) {
							local49[local55] = local61;
							local53[local55] = local104;
							local45[local55] = local148;
						} else {
							local49[local55] = local61 * this.anInt1471 >> 12;
							local53[local55] = this.anInt1474 * local104 >> 12;
							local45[local55] = this.anInt1470 * local148 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1468 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt1470 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt1474 = arg1.method234();
		} else if (arg0 == 3) {
			this.anInt1471 = arg1.method234();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.method239();
			this.anIntArray139[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray139[2] = local62 >> 12 & 0x0;
			this.anIntArray139[1] = local62 >> 4 & 0xFF0;
		}
	}
}
