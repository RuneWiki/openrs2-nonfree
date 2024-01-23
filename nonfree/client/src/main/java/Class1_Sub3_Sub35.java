import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
	private int anInt3750 = 0;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
	private int anInt3755 = 0;

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
	private int anInt3762 = 20;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
	private int anInt3759 = 1365;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			for (@Pc(15) int local15 = 0; local15 < Static76.anInt1531; local15++) {
				@Pc(29) int local29 = this.anInt3755 + (Static106.anIntArray202[local15] << 12) / this.anInt3759;
				@Pc(41) int local41 = this.anInt3750 + (Static23.anIntArray47[arg0] << 12) / this.anInt3759;
				@Pc(47) int local47 = local29 * local29 >> 12;
				@Pc(51) int local51 = local29;
				@Pc(55) int local55 = local41;
				@Pc(61) int local61 = local41 * local41 >> 12;
				@Pc(63) int local63 = 0;
				while (local47 + local61 < 16384 && local63 < this.anInt3762) {
					local55 = (local55 * local51 >> 12) * 2 + local41;
					local63++;
					local51 = local29 + local47 - local61;
					local61 = local55 * local55 >> 12;
					local47 = local51 * local51 >> 12;
				}
				local9[local15] = this.anInt3762 - 1 > local63 ? (local63 << 12) / this.anInt3762 : 0;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3759 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt3762 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt3755 = arg1.method2178();
		} else if (arg0 == 3) {
			this.anInt3750 = arg1.method2178();
		}
	}
}
