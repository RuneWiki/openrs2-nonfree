import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!ab", name = "S", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt89 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt85 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt84 = arg1.method208();
		} else if (arg0 == 3) {
			this.anInt86 = arg1.method208();
		} else if (arg0 == 4) {
			@Pc(64) int local64 = arg1.method197();
			this.anIntArray5[2] = local64 >> 12 & 0x0;
			this.anIntArray5[0] = (local64 & 0xFF0000) << 4;
			this.anIntArray5[1] = local64 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(29) int[][] local29 = this.method2913(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static141.anInt3261; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray5[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt89) {
					local41[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local45[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray5[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt89 < local69) {
						local41[local55] = local61;
						local49[local55] = local104;
						local53[local55] = local45[local55];
					} else {
						@Pc(141) int local141 = local45[local55];
						local69 = local141 - this.anIntArray5[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt89 < local69) {
							local41[local55] = local61;
							local49[local55] = local104;
							local53[local55] = local141;
						} else {
							local41[local55] = local61 * this.anInt86 >> 12;
							local49[local55] = local104 * this.anInt84 >> 12;
							local53[local55] = this.anInt85 * local141 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
