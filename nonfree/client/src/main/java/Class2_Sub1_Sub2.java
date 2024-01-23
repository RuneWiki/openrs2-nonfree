import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
	private int anInt309 = 0;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
	private int anInt313 = 0;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
	private int anInt312 = 1365;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
	private int anInt318 = 20;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt312 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt318 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt313 = arg0.method2130();
		} else if (arg1 == 3) {
			this.anInt309 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			for (@Pc(25) int local25 = 0; local25 < Static281.anInt5558; local25++) {
				@Pc(44) int local44 = this.anInt313 + (Static234.anIntArray462[local25] << 12) / this.anInt312;
				@Pc(56) int local56 = this.anInt309 + (Static272.anIntArray521[arg0] << 12) / this.anInt312;
				@Pc(62) int local62 = local44;
				@Pc(68) int local68 = local56 * local56 >> 12;
				@Pc(74) int local74 = local44 * local44 >> 12;
				@Pc(76) int local76 = 0;
				@Pc(78) int local78 = local56;
				while (local74 + local68 < 16384 && local76 < this.anInt318) {
					local78 = (local62 * local78 >> 12) * 2 + local56;
					local62 = local44 + local74 - local68;
					local68 = local78 * local78 >> 12;
					local74 = local62 * local62 >> 12;
					local76++;
				}
				local11[local25] = this.anInt318 - 1 > local76 ? (local76 << 12) / this.anInt318 : 0;
			}
		}
		return local11;
	}
}
