import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class2_Sub15_Sub6 extends Class2_Sub15 {

	@OriginalMember(owner = "client!fs", name = "G", descriptor = "I")
	private int anInt3667 = 4096;

	@OriginalMember(owner = "client!fs", name = "L", descriptor = "Z")
	private boolean aBoolean280 = true;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3667 = arg1.method5211();
		} else if (arg0 == 1) {
			this.aBoolean280 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(33) int[] local33 = this.method9725(0, Static426.anInt11132 & arg0 - 1);
			@Pc(39) int[] local39 = this.method9725(0, arg0);
			@Pc(49) int[] local49 = this.method9725(0, arg0 + 1 & Static426.anInt11132);
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local11[1];
			@Pc(61) int[] local61 = local11[2];
			for (@Pc(63) int local63 = 0; local63 < Static329.anInt6017; local63++) {
				@Pc(76) int local76 = this.anInt3667 * (local49[local63] - local33[local63]);
				@Pc(96) int local96 = (local39[Static386.anInt7302 & local63 + 1] - local39[Static386.anInt7302 & local63 - 1]) * this.anInt3667;
				@Pc(100) int local100 = local96 >> 12;
				@Pc(104) int local104 = local76 >> 12;
				@Pc(110) int local110 = local100 * local100 >> 12;
				@Pc(116) int local116 = local104 * local104 >> 12;
				@Pc(131) int local131 = (int) (Math.sqrt((double) ((float) (local110 + local116 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(141) int local141;
				@Pc(145) int local145;
				if (local131 == 0) {
					local137 = 0;
					local145 = 0;
					local141 = 0;
				} else {
					local137 = local96 / local131;
					local141 = local76 / local131;
					local145 = 16777216 / local131;
				}
				if (this.aBoolean280) {
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
				}
				local53[local63] = local137;
				local57[local63] = local141;
				local61[local63] = local145;
			}
		}
		return local11;
	}
}
