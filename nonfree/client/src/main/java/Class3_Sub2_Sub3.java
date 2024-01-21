import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt348 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt345 = arg0.method1359();
		} else if (arg1 == 2) {
			this.anInt352 = arg0.method1359();
		} else if (arg1 == 3) {
			this.anInt344 = arg0.method1359();
		} else if (arg1 == 4) {
			@Pc(61) int local61 = arg0.method1376();
			this.anIntArray19[1] = local61 >> 4 & 0xFF0;
			this.anIntArray19[2] = local61 >> 12 & 0x0;
			this.anIntArray19[0] = (local61 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(29) int[][] local29 = this.method2785(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local19[0];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local19[2];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local29[2];
			for (@Pc(55) int local55 = 0; local55 < Static86.anInt1942; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray19[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt348 < local69) {
					local37[local55] = local61;
					local49[local55] = local41[local55];
					local45[local55] = local53[local55];
				} else {
					@Pc(103) int local103 = local41[local55];
					local69 = local103 - this.anIntArray19[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt348) {
						local37[local55] = local61;
						local49[local55] = local103;
						local45[local55] = local53[local55];
					} else {
						@Pc(139) int local139 = local53[local55];
						local69 = local139 - this.anIntArray19[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt348 < local69) {
							local37[local55] = local61;
							local49[local55] = local103;
							local45[local55] = local139;
						} else {
							local37[local55] = local61 * this.anInt344 >> 12;
							local49[local55] = this.anInt352 * local103 >> 12;
							local45[local55] = this.anInt345 * local139 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}
}
