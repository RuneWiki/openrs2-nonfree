import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
	private int anInt9503 = 4096;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	private int anInt9506 = 0;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt9506 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt9503 = arg1.method5272();
		} else if (arg0 == 2) {
			super.aBoolean794 = arg1.method5322(-107) == 1;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(21) int[][] local21 = this.method9212(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static636.anInt10302; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt9506 > local53) {
					local37[local47] = this.anInt9506;
				} else if (local53 > this.anInt9503) {
					local37[local47] = this.anInt9503;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt9506) {
					local41[local47] = this.anInt9506;
				} else if (local57 > this.anInt9503) {
					local41[local47] = this.anInt9503;
				} else {
					local41[local47] = local57;
				}
				if (this.anInt9506 > local61) {
					local45[local47] = this.anInt9506;
				} else if (this.anInt9503 < local61) {
					local45[local47] = this.anInt9503;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(21) int[] local21 = this.method9204(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static636.anInt10302; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt9506) {
					local11[local23] = this.anInt9506;
				} else if (local29 > this.anInt9503) {
					local11[local23] = this.anInt9503;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}
}
