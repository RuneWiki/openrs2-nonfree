import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt414 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt411 = arg1.method1461();
		} else if (arg0 == 2) {
			this.anInt407 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			for (@Pc(23) int local23 = 0; local23 < Static149.anInt3233; local23++) {
				@Pc(29) int local29 = Static86.anIntArray218[arg0];
				@Pc(33) int local33 = Static154.anIntArray354[local23];
				@Pc(40) int local40 = local33 * this.anInt414 >> 12;
				@Pc(50) int local50 = local29 % (4096 / this.anInt411) * this.anInt411;
				@Pc(60) int local60 = local33 % (4096 / this.anInt414) * this.anInt414;
				@Pc(67) int local67 = this.anInt411 * local29 >> 12;
				if (this.anInt407 > local50) {
					for (local40 -= local67; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (this.anInt407 > local60) {
						local17[local23] = 0;
						continue;
					}
				}
				if (local60 < this.anInt407) {
					for (local40 -= local67; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local17[local23] = 0;
						continue;
					}
				}
				local17[local23] = 4096;
			}
		}
		return local17;
	}
}
