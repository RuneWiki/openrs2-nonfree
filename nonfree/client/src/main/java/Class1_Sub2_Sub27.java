import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!os", name = "M", descriptor = "Z")
	private boolean aBoolean395 = true;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "I")
	private int anInt4942 = 4096;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4942 = arg0.method4498();
		} else if (arg1 == 1) {
			this.aBoolean395 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(25) int[] local25 = this.method5872(0, arg0 - 1 & Static421.anInt7373);
			@Pc(31) int[] local31 = this.method5872(0, arg0);
			@Pc(41) int[] local41 = this.method5872(0, Static421.anInt7373 & arg0 + 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static410.anInt7198; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt4942;
				@Pc(89) int local89 = (local31[local55 + 1 & Static301.anInt5026] - local31[Static301.anInt5026 & local55 - 1]) * this.anInt4942;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(124) int local124 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(141) int local141;
				@Pc(137) int local137;
				if (local124 == 0) {
					local137 = 0;
					local141 = 0;
					local133 = 0;
				} else {
					local133 = local89 / local124;
					local137 = 16777216 / local124;
					local141 = local69 / local124;
				}
				if (this.aBoolean395) {
					local133 = (local133 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local45[local55] = local133;
				local49[local55] = local141;
				local53[local55] = local137;
			}
		}
		return local11;
	}
}
