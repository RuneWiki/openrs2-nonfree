import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	private int anInt7598 = 204;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	private int anInt7603 = 1;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	private int anInt7602 = 1;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7602 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt7603 = arg1.method8401();
		} else if (arg0 == 2) {
			this.anInt7598 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			for (@Pc(25) int local25 = 0; local25 < Static164.anInt8839; local25++) {
				@Pc(31) int local31 = Static352.anIntArray400[local25];
				@Pc(35) int local35 = Static328.anIntArray387[arg0];
				@Pc(42) int local42 = local31 * this.anInt7602 >> 12;
				@Pc(49) int local49 = this.anInt7603 * local35 >> 12;
				@Pc(59) int local59 = this.anInt7602 * (local31 % (4096 / this.anInt7602));
				@Pc(69) int local69 = this.anInt7603 * (local35 % (4096 / this.anInt7603));
				if (this.anInt7598 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (this.anInt7598 > local59) {
						local11[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt7598) {
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
}
