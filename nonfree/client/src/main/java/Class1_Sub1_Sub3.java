import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!be", name = "V", descriptor = "I")
	private int anInt445 = 1;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "I")
	private int anInt450 = 1;

	@OriginalMember(owner = "client!be", name = "T", descriptor = "I")
	private int anInt443 = 204;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt445 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt450 = arg0.method2655();
		} else if (arg1 == 2) {
			this.anInt443 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			for (@Pc(24) int local24 = 0; local24 < Static75.anInt1848; local24++) {
				@Pc(31) int local31 = Static157.anIntArray331[local24];
				@Pc(35) int local35 = Static98.anIntArray221[arg0];
				@Pc(42) int local42 = local31 * this.anInt445 >> 12;
				@Pc(49) int local49 = local35 * this.anInt450 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt445) * this.anInt445;
				@Pc(69) int local69 = this.anInt450 * (local35 % (4096 / this.anInt450));
				if (local69 < this.anInt443) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local17[local24] = 0;
						continue;
					}
					if (this.anInt443 > local59) {
						local17[local24] = 0;
						continue;
					}
				}
				if (local59 < this.anInt443) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local17[local24] = 0;
						continue;
					}
				}
				local17[local24] = 4096;
			}
		}
		return local17;
	}
}
