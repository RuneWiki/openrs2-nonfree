import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
	private int anInt1448 = 1365;

	@OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
	private int anInt1453 = 0;

	@OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
	private int anInt1452 = 0;

	@OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
	private int anInt1451 = 20;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			for (@Pc(25) int local25 = 0; local25 < Static110.anInt2934; local25++) {
				@Pc(40) int local40 = (Static175.anIntArray302[local25] << 12) / this.anInt1448 + this.anInt1453;
				@Pc(53) int local53 = (Static94.anIntArray321[arg0] << 12) / this.anInt1448 + this.anInt1452;
				@Pc(59) int local59 = local40;
				@Pc(65) int local65 = local40 * local40 >> 12;
				@Pc(67) int local67 = 0;
				@Pc(69) int local69 = local53;
				for (@Pc(75) int local75 = local53 * local53 >> 12; local75 + local65 < 16384 && local67 < this.anInt1451; local75 = local69 * local69 >> 12) {
					local69 = (local69 * local59 >> 12) * 2 + local53;
					local67++;
					local59 = local65 + local40 - local75;
					local65 = local59 * local59 >> 12;
				}
				local19[local25] = local67 >= this.anInt1451 - 1 ? 0 : (local67 << 12) / this.anInt1451;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1448 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt1451 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt1453 = arg0.method1764();
		} else if (arg1 == 3) {
			this.anInt1452 = arg0.method1764();
		}
	}
}
