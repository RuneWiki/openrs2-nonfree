import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!b", name = "K", descriptor = "I")
	private int anInt218 = 4096;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(28) int[] local28 = this.method4570(Static167.anInt3492 & arg0 - 1, 0);
			@Pc(34) int[] local34 = this.method4570(arg0, 0);
			@Pc(44) int[] local44 = this.method4570(arg0 + 1 & Static167.anInt3492, 0);
			for (@Pc(46) int local46 = 0; local46 < Static299.anInt5670; local46++) {
				@Pc(60) int local60 = (local44[local46] - local28[local46]) * this.anInt218;
				@Pc(80) int local80 = this.anInt218 * (local34[Static142.anInt2791 & local46 + 1] - local34[Static142.anInt2791 & local46 - 1]);
				@Pc(84) int local84 = local80 >> 12;
				@Pc(88) int local88 = local60 >> 12;
				@Pc(94) int local94 = local84 * local84 >> 12;
				@Pc(100) int local100 = local88 * local88 >> 12;
				@Pc(114) int local114 = (int) (Math.sqrt((double) ((float) (local100 + local94 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local114 == 0 ? 0 : 16777216 / local114;
				local13[local46] = 4096 - local125;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt218 = arg0.method2593();
		}
	}
}
