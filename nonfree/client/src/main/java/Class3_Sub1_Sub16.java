import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
	private int anInt2504;

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
	private int anInt2507;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(21) int[][] local21 = this.method3124(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static129.anInt3285; local47++) {
				@Pc(53) int local53 = local29[local47];
				@Pc(57) int local57 = local25[local47];
				@Pc(61) int local61 = local33[local47];
				if (local57 < this.anInt2504) {
					local37[local47] = this.anInt2504;
				} else if (this.anInt2507 < local57) {
					local37[local47] = this.anInt2507;
				} else {
					local37[local47] = local57;
				}
				if (local53 < this.anInt2504) {
					local41[local47] = this.anInt2504;
				} else if (this.anInt2507 < local53) {
					local41[local47] = this.anInt2507;
				} else {
					local41[local47] = local53;
				}
				if (local61 < this.anInt2504) {
					local45[local47] = this.anInt2504;
				} else if (local61 <= this.anInt2507) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt2507;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2504 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt2507 = arg1.method1510();
		} else if (arg0 == 2) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(22) int[] local22 = this.method3120(0, arg0);
			for (@Pc(24) int local24 = 0; local24 < Static129.anInt3285; local24++) {
				@Pc(30) int local30 = local22[local24];
				if (local30 < this.anInt2504) {
					local12[local24] = this.anInt2504;
				} else if (this.anInt2507 < local30) {
					local12[local24] = this.anInt2507;
				} else {
					local12[local24] = local30;
				}
			}
		}
		return local12;
	}
}
