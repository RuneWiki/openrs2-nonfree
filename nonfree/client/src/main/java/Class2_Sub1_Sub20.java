import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!id", name = "X", descriptor = "I")
	private int anInt1726;

	@OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
	private int anInt1733;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
	private int anInt1730;

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
	private int anInt1732;

	@OriginalMember(owner = "client!id", name = "db", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(29) int[][] local29 = this.method2794(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static120.anInt2812; local55++) {
				@Pc(61) int local61 = local37[local55];
				@Pc(69) int local69 = local61 - this.anIntArray116[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt1730 < local69) {
					local41[local55] = local61;
					local49[local55] = local33[local55];
					local53[local55] = local45[local55];
				} else {
					@Pc(100) int local100 = local33[local55];
					local69 = local100 - this.anIntArray116[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt1730) {
						local41[local55] = local61;
						local49[local55] = local100;
						local53[local55] = local45[local55];
					} else {
						@Pc(136) int local136 = local45[local55];
						local69 = local136 - this.anIntArray116[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt1730 < local69) {
							local41[local55] = local61;
							local49[local55] = local100;
							local53[local55] = local136;
						} else {
							local41[local55] = local61 * this.anInt1732 >> 12;
							local49[local55] = this.anInt1726 * local100 >> 12;
							local53[local55] = local136 * this.anInt1733 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1730 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt1733 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt1726 = arg0.method1397();
		} else if (arg1 == 3) {
			this.anInt1732 = arg0.method1397();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method1406();
			this.anIntArray116[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray116[1] = local57 >> 4 & 0xFF0;
			this.anIntArray116[2] = local57 >> 12 & 0x0;
		}
	}
}
