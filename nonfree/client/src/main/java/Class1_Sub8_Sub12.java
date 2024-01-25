import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class1_Sub8_Sub12 extends Class1_Sub8 {

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
	private int anInt3124 = 4096;

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
	private int anInt3129 = 409;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "[I")
	private final int[] anIntArray323 = new int[3];

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
	private int anInt3130 = 4096;

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
	private int anInt3128 = 4096;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[][] local29 = this.method6035(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static18.anInt439; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray323[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt3129 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray323[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt3129 < local69) {
						local45[local55] = local61;
						local49[local55] = local104;
						local53[local55] = local41[local55];
					} else {
						@Pc(147) int local147 = local41[local55];
						local69 = local147 - this.anIntArray323[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt3129) {
							local45[local55] = local61;
							local49[local55] = local104;
							local53[local55] = local147;
						} else {
							local45[local55] = this.anInt3130 * local61 >> 12;
							local49[local55] = local104 * this.anInt3128 >> 12;
							local53[local55] = this.anInt3124 * local147 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3129 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt3124 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt3128 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt3130 = arg1.method1177();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method1226();
			this.anIntArray323[2] = local59 >> 12 & 0x0;
			this.anIntArray323[1] = local59 >> 4 & 0xFF0;
			this.anIntArray323[0] = (local59 & 0xFF0000) << 4;
		}
	}
}
