import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class5_Sub3_Sub34 extends Class5_Sub3 {

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	private int anInt6262 = 4096;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6262 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(25) int[] local25 = this.method6020(0, Static221.anInt4359 & arg0 - 1);
			@Pc(31) int[] local31 = this.method6020(0, arg0);
			@Pc(41) int[] local41 = this.method6020(0, arg0 + 1 & Static221.anInt4359);
			for (@Pc(43) int local43 = 0; local43 < Static7.anInt129; local43++) {
				@Pc(56) int local56 = this.anInt6262 * (local41[local43] - local25[local43]);
				@Pc(76) int local76 = this.anInt6262 * (local31[Static177.anInt3515 & local43 + 1] - local31[Static177.anInt3515 & local43 - 1]);
				@Pc(80) int local80 = local76 >> 12;
				@Pc(84) int local84 = local56 >> 12;
				@Pc(90) int local90 = local80 * local80 >> 12;
				@Pc(96) int local96 = local84 * local84 >> 12;
				@Pc(110) int local110 = (int) (Math.sqrt((double) ((float) (local96 + local90 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(118) int local118 = local110 == 0 ? 0 : 16777216 / local110;
				local11[local43] = 4096 - local118;
			}
		}
		return local11;
	}
}
