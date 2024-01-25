import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	private int anInt135 = 1;

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	private int anInt137 = 1;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
	private int anInt138 = 204;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			for (@Pc(25) int local25 = 0; local25 < Static376.anInt7260; local25++) {
				@Pc(31) int local31 = Static292.anIntArray394[local25];
				@Pc(35) int local35 = Static442.anIntArray449[arg0];
				@Pc(42) int local42 = local31 * this.anInt137 >> 12;
				@Pc(49) int local49 = local35 * this.anInt135 >> 12;
				@Pc(59) int local59 = this.anInt137 * (local31 % (4096 / this.anInt137));
				@Pc(69) int local69 = this.anInt135 * (local35 % (4096 / this.anInt135));
				if (this.anInt138 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (local59 < this.anInt138) {
						local11[local25] = 0;
						continue;
					}
				}
				if (this.anInt138 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt137 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt135 = arg1.method4905();
		} else if (arg0 == 2) {
			this.anInt138 = arg1.method4936();
		}
	}
}
