import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
	private int anInt4560;

	@OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
	private int anInt4563;

	@OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
	private int anInt4559;

	@OriginalMember(owner = "client!wf", name = "ob", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4560 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt4563 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt4559 = arg0.method2353();
		} else if (arg1 == 3) {
			this.anInt4567 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			for (@Pc(17) int local17 = 0; local17 < Static129.anInt3118; local17++) {
				@Pc(31) int local31 = this.anInt4559 + (Static163.anIntArray577[local17] << 12) / this.anInt4560;
				@Pc(43) int local43 = (Static166.anIntArray619[arg0] << 12) / this.anInt4560 + this.anInt4567;
				@Pc(49) int local49 = local31;
				@Pc(55) int local55 = local31 * local31 >> 12;
				@Pc(57) int local57 = local43;
				@Pc(59) int local59 = 0;
				for (@Pc(65) int local65 = local43 * local43 >> 12; local65 + local55 < 16384 && this.anInt4563 > local59; local65 = local57 * local57 >> 12) {
					local57 = (local49 * local57 >> 12) * 2 + local43;
					local59++;
					local49 = local55 + local31 - local65;
					local55 = local49 * local49 >> 12;
				}
				local11[local17] = this.anInt4563 - 1 <= local59 ? 0 : (local59 << 12) / this.anInt4563;
			}
		}
		return local11;
	}
}
