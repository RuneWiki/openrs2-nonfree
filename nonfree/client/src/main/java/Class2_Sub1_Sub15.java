import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
	private int anInt2437 = 204;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	private int anInt2441 = 1;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	private int anInt2438 = 1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			for (@Pc(17) int local17 = 0; local17 < Static281.anInt5558; local17++) {
				@Pc(24) int local24 = Static272.anIntArray521[arg0];
				@Pc(31) int local31 = this.anInt2441 * local24 >> 12;
				@Pc(41) int local41 = local24 % (4096 / this.anInt2441) * this.anInt2441;
				@Pc(45) int local45 = Static234.anIntArray462[local17];
				@Pc(55) int local55 = this.anInt2438 * (local45 % (4096 / this.anInt2438));
				@Pc(62) int local62 = this.anInt2438 * local45 >> 12;
				if (local41 < this.anInt2437) {
					for (local62 -= local31; local62 < 0; local62 += 4) {
					}
					while (local62 > 3) {
						local62 -= 4;
					}
					if (local62 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt2437 > local55) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local55 < this.anInt2437) {
					for (local62 -= local31; local62 < 0; local62 += 4) {
					}
					while (local62 > 3) {
						local62 -= 4;
					}
					if (local62 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2438 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt2441 = arg0.method2146();
		} else if (arg1 == 2) {
			this.anInt2437 = arg0.method2130();
		}
	}
}
