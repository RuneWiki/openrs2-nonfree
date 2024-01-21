import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class3_Sub1_Sub23 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
	private int anInt2467;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
	private int anInt2473;

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
	private int anInt2471;

	@OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
	private int anInt2475;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			for (@Pc(17) int local17 = 0; local17 < Static141.anInt3261; local17++) {
				@Pc(31) int local31 = this.anInt2471 + (Static85.anIntArray47[local17] << 12) / this.anInt2473;
				@Pc(43) int local43 = this.anInt2467 + (Static125.anIntArray336[arg0] << 12) / this.anInt2473;
				@Pc(49) int local49 = local31;
				@Pc(55) int local55 = local31 * local31 >> 12;
				@Pc(57) int local57 = local43;
				@Pc(59) int local59 = 0;
				for (@Pc(65) int local65 = local43 * local43 >> 12; local65 + local55 < 16384 && local59 < this.anInt2475; local65 = local57 * local57 >> 12) {
					local59++;
					local57 = (local49 * local57 >> 12) * 2 + local43;
					local49 = local31 + local55 - local65;
					local55 = local49 * local49 >> 12;
				}
				local11[local17] = local59 < this.anInt2475 - 1 ? (local59 << 12) / this.anInt2475 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2473 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt2475 = arg1.method208();
		} else if (arg0 == 2) {
			this.anInt2471 = arg1.method208();
		} else if (arg0 == 3) {
			this.anInt2467 = arg1.method208();
		}
	}
}
