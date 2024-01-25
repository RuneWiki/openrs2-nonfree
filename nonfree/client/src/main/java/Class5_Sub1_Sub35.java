import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class5_Sub1_Sub35 extends Class5_Sub1 {

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
	private int anInt8284 = 4096;

	@OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
	private int anInt8287 = 409;

	@OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
	private int anInt8289 = 4096;

	@OriginalMember(owner = "client!tr", name = "K", descriptor = "[I")
	private final int[] anIntArray649 = new int[3];

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
	private int anInt8285 = 4096;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8287 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt8285 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt8284 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt8289 = arg1.method4227();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method4182();
			this.anIntArray649[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray649[1] = local59 >> 4 & 0xFF0;
			this.anIntArray649[2] = local59 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(21) int[][] local21 = this.method7154(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static147.anInt3075; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(60) int local60 = local53 - this.anIntArray649[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (this.anInt8287 < local60) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(98) int local98 = local29[local47];
					local60 = local98 - this.anIntArray649[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (local60 > this.anInt8287) {
						local37[local47] = local53;
						local41[local47] = local98;
						local45[local47] = local33[local47];
					} else {
						@Pc(139) int local139 = local33[local47];
						local60 = local139 - this.anIntArray649[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (local60 > this.anInt8287) {
							local37[local47] = local53;
							local41[local47] = local98;
							local45[local47] = local139;
						} else {
							local37[local47] = this.anInt8289 * local53 >> 12;
							local41[local47] = local98 * this.anInt8284 >> 12;
							local45[local47] = local139 * this.anInt8285 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
