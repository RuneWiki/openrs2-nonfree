import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	private int anInt4737 = 4096;

	@OriginalMember(owner = "client!r", name = "R", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(34) int[] local34 = this.method4570(arg0 - 1 & Static167.anInt3492, 0);
			@Pc(40) int[] local40 = this.method4570(arg0, 0);
			@Pc(50) int[] local50 = this.method4570(Static167.anInt3492 & arg0 + 1, 0);
			@Pc(54) int[] local54 = local19[2];
			@Pc(58) int[] local58 = local19[1];
			@Pc(62) int[] local62 = local19[0];
			for (@Pc(64) int local64 = 0; local64 < Static299.anInt5670; local64++) {
				@Pc(83) int local83 = (local50[local64] - local34[local64]) * this.anInt4737;
				@Pc(103) int local103 = this.anInt4737 * (local40[Static142.anInt2791 & local64 + 1] - local40[local64 - 1 & Static142.anInt2791]);
				@Pc(107) int local107 = local103 >> 12;
				@Pc(111) int local111 = local83 >> 12;
				@Pc(117) int local117 = local107 * local107 >> 12;
				@Pc(123) int local123 = local111 * local111 >> 12;
				@Pc(137) int local137 = (int) (Math.sqrt((double) ((float) (local123 + local117 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(148) int local148;
				@Pc(144) int local144;
				@Pc(152) int local152;
				if (local137 == 0) {
					local144 = 0;
					local148 = 0;
					local152 = 0;
				} else {
					local144 = local83 / local137;
					local148 = local103 / local137;
					local152 = 16777216 / local137;
				}
				if (this.aBoolean337) {
					local152 = (local152 >> 1) + 2048;
					local148 = (local148 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
				}
				local62[local64] = local148;
				local58[local64] = local144;
				local54[local64] = local152;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4737 = arg0.method2593();
		} else if (arg1 == 1) {
			this.aBoolean337 = arg0.method2595() == 1;
		}
	}
}
