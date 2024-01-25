import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class1_Sub4_Sub33 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
	private int anInt6109 = 0;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
	private int anInt6110 = 4096;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(21) int[][] local21 = this.method5956(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static66.anInt1511; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt6109 > local53) {
					local37[local47] = this.anInt6109;
				} else if (local53 > this.anInt6110) {
					local37[local47] = this.anInt6110;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt6109) {
					local41[local47] = this.anInt6109;
				} else if (this.anInt6110 < local57) {
					local41[local47] = this.anInt6110;
				} else {
					local41[local47] = local57;
				}
				if (this.anInt6109 > local61) {
					local45[local47] = this.anInt6109;
				} else if (local61 <= this.anInt6110) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt6110;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt6109 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt6110 = arg1.method5362();
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(23) int[] local23 = this.method5958(arg0, 0);
			for (@Pc(25) int local25 = 0; local25 < Static66.anInt1511; local25++) {
				@Pc(31) int local31 = local23[local25];
				if (local31 < this.anInt6109) {
					local13[local25] = this.anInt6109;
				} else if (local31 > this.anInt6110) {
					local13[local25] = this.anInt6110;
				} else {
					local13[local25] = local31;
				}
			}
		}
		return local13;
	}
}
