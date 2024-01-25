import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class5_Sub2_Sub23 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
	private int anInt4283 = 0;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "I")
	private int anInt4286 = 0;

	@OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
	private int anInt4281 = 20;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
	private int anInt4284 = 1365;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			for (@Pc(21) int local21 = 0; local21 < Static15.anInt493; local21++) {
				@Pc(35) int local35 = this.anInt4286 + (Static257.anIntArray386[local21] << 12) / this.anInt4284;
				@Pc(47) int local47 = this.anInt4283 + (Static287.anIntArray413[arg0] << 12) / this.anInt4284;
				@Pc(53) int local53 = local35;
				@Pc(55) int local55 = local47;
				@Pc(61) int local61 = local35 * local35 >> 12;
				@Pc(67) int local67 = local47 * local47 >> 12;
				@Pc(69) int local69 = 0;
				while (local67 + local61 < 16384 && this.anInt4281 > local69) {
					local55 = (local53 * local55 >> 12) * 2 + local47;
					local53 = local35 + local61 - local67;
					local69++;
					local61 = local53 * local53 >> 12;
					local67 = local55 * local55 >> 12;
				}
				local15[local21] = this.anInt4281 - 1 > local69 ? (local69 << 12) / this.anInt4281 : 0;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4284 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt4281 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt4286 = arg0.method1845();
		} else if (arg1 == 3) {
			this.anInt4283 = arg0.method1845();
		}
	}
}
