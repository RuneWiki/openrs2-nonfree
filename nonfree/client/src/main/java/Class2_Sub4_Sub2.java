import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
	private int anInt234 = 0;

	@OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
	private int anInt240 = 4096;

	static {
		new Class32("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt234 = arg0.method5312();
		} else if (arg1 == 1) {
			this.anInt240 = arg0.method5312();
		} else if (arg1 == 2) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(30) int[] local30 = this.method5600(arg0, 0);
			for (@Pc(32) int local32 = 0; local32 < Static76.anInt1458; local32++) {
				@Pc(38) int local38 = local30[local32];
				if (this.anInt234 > local38) {
					local11[local32] = this.anInt234;
				} else if (this.anInt240 >= local38) {
					local11[local32] = local38;
				} else {
					local11[local32] = this.anInt240;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(21) int[][] local21 = this.method5591(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static76.anInt1458; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt234) {
					local37[local47] = this.anInt234;
				} else if (this.anInt240 < local53) {
					local37[local47] = this.anInt240;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt234) {
					local41[local47] = this.anInt234;
				} else if (local57 > this.anInt240) {
					local41[local47] = this.anInt240;
				} else {
					local41[local47] = local57;
				}
				if (this.anInt234 > local61) {
					local45[local47] = this.anInt234;
				} else if (this.anInt240 < local61) {
					local45[local47] = this.anInt240;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}
}
