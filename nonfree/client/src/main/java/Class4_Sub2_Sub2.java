import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
	private int anInt662 = 1365;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	private int anInt661 = 0;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	private int anInt664 = 0;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
	private int anInt666 = 20;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt662 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt666 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt661 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt664 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			for (@Pc(22) int local22 = 0; local22 < Static269.anInt4330; local22++) {
				@Pc(36) int local36 = this.anInt661 + (Static312.anIntArray370[local22] << 12) / this.anInt662;
				@Pc(49) int local49 = (Static429.anIntArray465[arg0] << 12) / this.anInt662 + this.anInt664;
				@Pc(55) int local55 = local36;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local36 * local36 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71;
				for (local71 = 0; local63 + local69 < 16384 && local71 < this.anInt666; local71++) {
					local57 = local49 + (local55 * local57 >> 12) * 2;
					local55 = local63 + local36 - local69;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = this.anInt666 - 1 > local71 ? (local71 << 12) / this.anInt666 : 0;
			}
		}
		return local16;
	}
}
