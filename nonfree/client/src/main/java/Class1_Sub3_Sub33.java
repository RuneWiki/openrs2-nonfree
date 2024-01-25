import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
	private int anInt8443 = 0;

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
	private int anInt8448 = 4096;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(29) int[] local29 = this.method7911(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static236.anInt4609; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt8443 > local37) {
					local19[local31] = this.anInt8443;
				} else if (local37 <= this.anInt8448) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt8448;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8443 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt8448 = arg0.method3056();
		} else if (arg1 == 2) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(21) int[][] local21 = this.method7910(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static236.anInt4609; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt8443 > local53) {
					local37[local47] = this.anInt8443;
				} else if (this.anInt8448 < local53) {
					local37[local47] = this.anInt8448;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt8443) {
					local41[local47] = this.anInt8443;
				} else if (this.anInt8448 >= local57) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt8448;
				}
				if (this.anInt8443 > local61) {
					local45[local47] = this.anInt8443;
				} else if (local61 <= this.anInt8448) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt8448;
				}
			}
		}
		return local11;
	}
}
