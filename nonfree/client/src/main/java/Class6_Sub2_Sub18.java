import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class6_Sub2_Sub18 extends Class6_Sub2 {

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
	private int anInt3617 = 0;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
	private int anInt3615 = 0;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	private int anInt3613 = 1365;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	private int anInt3614 = 20;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3613 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt3614 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt3615 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt3617 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			for (@Pc(22) int local22 = 0; local22 < Static185.anInt4925; local22++) {
				@Pc(37) int local37 = (Static53.anIntArray95[local22] << 12) / this.anInt3613 + this.anInt3615;
				@Pc(49) int local49 = this.anInt3617 + (Static168.anIntArray278[arg0] << 12) / this.anInt3613;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && this.anInt3614 > local71) {
					local57 = (local55 * local57 >> 12) * 2 + local49;
					local55 = local37 + local63 - local69;
					local69 = local57 * local57 >> 12;
					local71++;
					local63 = local55 * local55 >> 12;
				}
				local11[local22] = this.anInt3614 - 1 > local71 ? (local71 << 12) / this.anInt3614 : 0;
			}
		}
		return local11;
	}
}
