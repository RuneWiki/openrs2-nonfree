import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!at", name = "S", descriptor = "I")
	private int anInt601 = 204;

	@OriginalMember(owner = "client!at", name = "K", descriptor = "I")
	private int anInt596 = 1;

	@OriginalMember(owner = "client!at", name = "T", descriptor = "I")
	private int anInt602 = 1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt602 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt596 = arg1.method6053();
		} else if (arg0 == 2) {
			this.anInt601 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			for (@Pc(25) int local25 = 0; local25 < Static106.anInt2356; local25++) {
				@Pc(31) int local31 = Static382.anIntArray476[local25];
				@Pc(35) int local35 = Static285.anIntArray401[arg0];
				@Pc(42) int local42 = this.anInt602 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt596 >> 12;
				@Pc(59) int local59 = this.anInt602 * (local31 % (4096 / this.anInt602));
				@Pc(69) int local69 = local35 % (4096 / this.anInt596) * this.anInt596;
				if (local69 < this.anInt601) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (this.anInt601 > local59) {
						local11[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt601) {
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
