import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(31) int[] local31 = this.method2904(0, arg0 - 1 & Static169.anInt3754);
			@Pc(37) int[] local37 = this.method2904(0, arg0);
			@Pc(47) int[] local47 = this.method2904(0, arg0 + 1 & Static169.anInt3754);
			for (@Pc(49) int local49 = 0; local49 < Static141.anInt3261; local49++) {
				@Pc(62) int local62 = (local47[local49] - local31[local49]) * this.anInt2578;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(86) int local86 = (local37[local49 + 1 & Static67.anInt1764] - local37[local49 - 1 & Static67.anInt1764]) * this.anInt2578;
				@Pc(92) int local92 = local66 * local66 >> 12;
				@Pc(96) int local96 = local86 >> 12;
				@Pc(102) int local102 = local96 * local96 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((local92 + local102 + 4096) / 4096)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local17[local49] = 4096 - local126;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2578 = arg1.method208();
		}
	}
}
