import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class6_Sub4_Sub10 extends Class6_Sub4 {

	@OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
	private int anInt3539 = 4096;

	@OriginalMember(owner = "client!fu", name = "G", descriptor = "[I")
	private final int[] anIntArray212 = new int[3];

	@OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
	private int anInt3535 = 409;

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
	private int anInt3536 = 4096;

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
	private int anInt3541 = 4096;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt3535 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt3541 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt3539 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt3536 = arg1.method8571();
		} else if (arg0 == 4) {
			@Pc(64) int local64 = arg1.method8606();
			this.anIntArray212[0] = (local64 & 0xFF0000) << 4;
			this.anIntArray212[2] = local64 >> 12 & 0x0;
			this.anIntArray212[1] = local64 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(21) int[][] local21 = this.method8319(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static6.anInt111; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray212[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (local61 > this.anInt3535) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(99) int local99 = local29[local47];
					local61 = local99 - this.anIntArray212[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt3535) {
						local37[local47] = local53;
						local41[local47] = local99;
						local45[local47] = local33[local47];
					} else {
						@Pc(142) int local142 = local33[local47];
						local61 = local142 - this.anIntArray212[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (local61 > this.anInt3535) {
							local37[local47] = local53;
							local41[local47] = local99;
							local45[local47] = local142;
						} else {
							local37[local47] = this.anInt3536 * local53 >> 12;
							local41[local47] = local99 * this.anInt3539 >> 12;
							local45[local47] = local142 * this.anInt3541 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
