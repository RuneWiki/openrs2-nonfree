import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 {

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "Z")
	private boolean aBoolean34 = true;

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
	private int anInt547 = 4096;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt547 = arg0.method5187();
		} else if (arg1 == 1) {
			this.aBoolean34 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(25) int[] local25 = this.method5710(0, Static75.anInt1419 & arg0 - 1);
			@Pc(31) int[] local31 = this.method5710(0, arg0);
			@Pc(41) int[] local41 = this.method5710(0, arg0 + 1 & Static75.anInt1419);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6549; local55++) {
				@Pc(69) int local69 = this.anInt547 * (local41[local55] - local25[local55]);
				@Pc(89) int local89 = this.anInt547 * (local31[local55 + 1 & Static323.anInt6272] - local31[Static323.anInt6272 & local55 - 1]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(140) int local140;
				@Pc(132) int local132;
				if (local123 == 0) {
					local140 = 0;
					local136 = 0;
					local132 = 0;
				} else {
					local132 = 16777216 / local123;
					local136 = local89 / local123;
					local140 = local69 / local123;
				}
				if (this.aBoolean34) {
					local132 = (local132 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local45[local55] = local136;
				local49[local55] = local140;
				local53[local55] = local132;
			}
		}
		return local11;
	}
}
