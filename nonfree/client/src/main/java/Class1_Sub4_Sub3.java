import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			for (@Pc(17) int local17 = 0; local17 < Static73.anInt1888; local17++) {
				@Pc(31) int local31 = this.anInt427 + (Static171.anIntArray421[local17] << 12) / this.anInt428;
				@Pc(45) int local45 = this.anInt426 + (Static150.anIntArray383[arg0] << 12) / this.anInt428;
				@Pc(53) int local53 = local31 * local31 >> 12;
				@Pc(55) int local55 = local31;
				@Pc(57) int local57 = local45;
				@Pc(63) int local63 = local45 * local45 >> 12;
				@Pc(65) int local65 = 0;
				while (local53 + local63 < 16384 && local65 < this.anInt425) {
					local65++;
					local57 = (local55 * local57 >> 12) * 2 + local45;
					local55 = local53 + local31 - local63;
					local53 = local55 * local55 >> 12;
					local63 = local57 * local57 >> 12;
				}
				local11[local17] = this.anInt425 - 1 <= local65 ? 0 : (local65 << 12) / this.anInt425;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt428 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt425 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt427 = arg0.method546();
		} else if (arg1 == 3) {
			this.anInt426 = arg0.method546();
		}
	}
}
