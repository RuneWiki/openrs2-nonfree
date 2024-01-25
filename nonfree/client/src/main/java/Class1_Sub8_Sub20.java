import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub8_Sub20 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
	private int anInt5187 = 204;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	private int anInt5185 = 1;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
	private int anInt5189 = 1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5189 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt5185 = arg1.method1171();
		} else if (arg0 == 2) {
			this.anInt5187 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			for (@Pc(25) int local25 = 0; local25 < Static18.anInt439; local25++) {
				@Pc(31) int local31 = Static198.anIntArray749[local25];
				@Pc(35) int local35 = Static134.anIntArray308[arg0];
				@Pc(42) int local42 = this.anInt5189 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt5185 >> 12;
				@Pc(59) int local59 = this.anInt5189 * (local31 % (4096 / this.anInt5189));
				@Pc(69) int local69 = this.anInt5185 * (local35 % (4096 / this.anInt5185));
				if (local69 < this.anInt5187) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt5187 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt5187 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}
}
