import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
	private int anInt1086 = 1365;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	private int anInt1085 = 0;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	private int anInt1088 = 0;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
	private int anInt1083 = 20;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1086 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt1083 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt1088 = arg0.method7860();
		} else if (arg1 == 3) {
			this.anInt1085 = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			for (@Pc(22) int local22 = 0; local22 < Static195.anInt3759; local22++) {
				@Pc(37) int local37 = (Static554.anIntArray510[local22] << 12) / this.anInt1086 + this.anInt1088;
				@Pc(49) int local49 = (Static369.anIntArray377[arg0] << 12) / this.anInt1086 + this.anInt1085;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && this.anInt1083 > local71) {
					local57 = (local57 * local55 >> 12) * 2 + local49;
					local55 = local63 + local37 - local69;
					local71++;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = local71 >= this.anInt1083 - 1 ? 0 : (local71 << 12) / this.anInt1083;
			}
		}
		return local16;
	}
}
