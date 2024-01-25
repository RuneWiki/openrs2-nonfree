import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class6_Sub1_Sub20 extends Class6_Sub1 {

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
	private int anInt5194 = 4096;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
	private int anInt5200 = 0;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(29) int[] local29 = this.method8963(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static479.anInt8231; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt5200) {
					local19[local31] = this.anInt5200;
				} else if (this.anInt5194 >= local37) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt5194;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[][] local25 = this.method8959(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static479.anInt8231; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(61) int local61 = local33[local51];
				@Pc(65) int local65 = local37[local51];
				if (this.anInt5200 > local57) {
					local41[local51] = this.anInt5200;
				} else if (this.anInt5194 < local57) {
					local41[local51] = this.anInt5194;
				} else {
					local41[local51] = local57;
				}
				if (this.anInt5200 > local61) {
					local45[local51] = this.anInt5200;
				} else if (this.anInt5194 < local61) {
					local45[local51] = this.anInt5194;
				} else {
					local45[local51] = local61;
				}
				if (this.anInt5200 > local65) {
					local49[local51] = this.anInt5200;
				} else if (this.anInt5194 >= local65) {
					local49[local51] = local65;
				} else {
					local49[local51] = this.anInt5194;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5200 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt5194 = arg0.method8363();
		} else if (arg1 == 2) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}
}
