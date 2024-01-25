import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
	private int anInt4120 = 4096;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "Z")
	private boolean aBoolean338 = true;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(25) int[] local25 = this.method8821(Static271.anInt4487 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method8821(arg0, 0);
			@Pc(41) int[] local41 = this.method8821(Static271.anInt4487 & arg0 + 1, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static314.anInt6320; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt4120;
				@Pc(89) int local89 = (local31[local55 + 1 & Static550.anInt6610] - local31[local55 - 1 & Static550.anInt6610]) * this.anInt4120;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129;
				@Pc(137) int local137;
				@Pc(133) int local133;
				if (local123 == 0) {
					local129 = 0;
					local133 = 0;
					local137 = 0;
				} else {
					local129 = local89 / local123;
					local133 = 16777216 / local123;
					local137 = local69 / local123;
				}
				if (this.aBoolean338) {
					local129 = (local129 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
				}
				local45[local55] = local129;
				local49[local55] = local137;
				local53[local55] = local133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4120 = arg0.method8631();
		} else if (arg1 == 1) {
			this.aBoolean338 = arg0.method8645() == 1;
		}
	}
}
