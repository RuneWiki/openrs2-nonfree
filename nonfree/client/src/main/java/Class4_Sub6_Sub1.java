import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!be", name = "P", descriptor = "I")
	private int anInt371 = 4096;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt371 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(31) int[] local31 = this.method4372(0, arg0 - 1 & Static137.anInt2812);
			@Pc(37) int[] local37 = this.method4372(0, arg0);
			@Pc(47) int[] local47 = this.method4372(0, arg0 + 1 & Static137.anInt2812);
			for (@Pc(49) int local49 = 0; local49 < Static2.anInt19; local49++) {
				@Pc(72) int local72 = this.anInt371 * (local37[local49 + 1 & Static168.anInt3337] - local37[local49 - 1 & Static168.anInt3337]);
				@Pc(76) int local76 = local72 >> 12;
				@Pc(88) int local88 = (local47[local49] - local31[local49]) * this.anInt371;
				@Pc(94) int local94 = local76 * local76 >> 12;
				@Pc(98) int local98 = local88 >> 12;
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local94 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local16[local49] = 4096 - local126;
			}
		}
		return local16;
	}
}
