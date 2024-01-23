import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
	private int anInt1002 = 20;

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
	private int anInt1006 = 0;

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
	private int anInt1003 = 1365;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
	private int anInt1001 = 0;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1003 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt1002 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt1001 = arg0.method946();
		} else if (arg1 == 3) {
			this.anInt1006 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			for (@Pc(22) int local22 = 0; local22 < Static105.anInt2391; local22++) {
				@Pc(37) int local37 = (Static128.anIntArray362[arg0] << 12) / this.anInt1003 + this.anInt1006;
				@Pc(50) int local50 = (Static63.anIntArray182[local22] << 12) / this.anInt1003 + this.anInt1001;
				@Pc(54) int local54 = local50;
				@Pc(56) int local56 = 0;
				@Pc(62) int local62 = local50 * local50 >> 12;
				@Pc(70) int local70 = local37 * local37 >> 12;
				@Pc(72) int local72 = local37;
				while (local70 + local62 < 16384 && local56 < this.anInt1002) {
					local56++;
					local72 = (local54 * local72 >> 12) * 2 + local37;
					local54 = local62 + local50 - local70;
					local62 = local54 * local54 >> 12;
					local70 = local72 * local72 >> 12;
				}
				local12[local22] = this.anInt1002 - 1 > local56 ? (local56 << 12) / this.anInt1002 : 0;
			}
		}
		return local12;
	}
}
