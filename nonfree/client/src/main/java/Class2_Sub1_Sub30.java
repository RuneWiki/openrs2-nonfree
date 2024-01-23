import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
	private int anInt3817 = 0;

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
	private int anInt3818 = 0;

	@OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
	private int anInt3824 = 1365;

	@OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
	private int anInt3827 = 20;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			for (@Pc(19) int local19 = 0; local19 < Static62.anInt1675; local19++) {
				@Pc(33) int local33 = this.anInt3817 + (Static20.anIntArray45[local19] << 12) / this.anInt3824;
				@Pc(47) int local47 = this.anInt3818 + (Static97.anIntArray240[arg0] << 12) / this.anInt3824;
				@Pc(51) int local51 = local33;
				@Pc(57) int local57 = local33 * local33 >> 12;
				@Pc(59) int local59 = local47;
				@Pc(65) int local65 = local47 * local47 >> 12;
				@Pc(67) int local67 = 0;
				while (local65 + local57 < 16384 && local67 < this.anInt3827) {
					local59 = (local59 * local51 >> 12) * 2 + local47;
					local51 = local33 + local57 - local65;
					local67++;
					local65 = local59 * local59 >> 12;
					local57 = local51 * local51 >> 12;
				}
				local7[local19] = this.anInt3827 - 1 > local67 ? (local67 << 12) / this.anInt3827 : 0;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3824 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt3827 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt3817 = arg0.method163();
		} else if (arg1 == 3) {
			this.anInt3818 = arg0.method163();
		}
	}
}
