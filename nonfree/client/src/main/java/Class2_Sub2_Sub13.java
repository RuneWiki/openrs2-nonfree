import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	private int anInt1556;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	private int anInt1557;

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
	private int anInt1568;

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
	private int anInt1570;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			for (@Pc(17) int local17 = 0; local17 < Static149.anInt3233; local17++) {
				@Pc(32) int local32 = (Static86.anIntArray218[arg0] << 12) / this.anInt1568 + this.anInt1570;
				@Pc(44) int local44 = (Static154.anIntArray354[local17] << 12) / this.anInt1568 + this.anInt1556;
				@Pc(50) int local50 = local44;
				@Pc(56) int local56 = local44 * local44 >> 12;
				@Pc(62) int local62 = local32 * local32 >> 12;
				@Pc(64) int local64 = 0;
				@Pc(66) int local66 = local32;
				while (local62 + local56 < 16384 && this.anInt1557 > local64) {
					local64++;
					local66 = local32 + (local50 * local66 >> 12) * 2;
					local50 = local56 + local44 - local62;
					local56 = local50 * local50 >> 12;
					local62 = local66 * local66 >> 12;
				}
				local7[local17] = this.anInt1557 - 1 <= local64 ? 0 : (local64 << 12) / this.anInt1557;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1568 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt1557 = arg1.method1456();
		} else if (arg0 == 2) {
			this.anInt1556 = arg1.method1456();
		} else if (arg0 == 3) {
			this.anInt1570 = arg1.method1456();
		}
	}
}
