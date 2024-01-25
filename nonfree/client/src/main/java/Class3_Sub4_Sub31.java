import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class3_Sub4_Sub31 extends Class3_Sub4 {

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
	private int anInt6654 = 0;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
	private int anInt6655 = 20;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
	private int anInt6660 = 0;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
	private int anInt6662 = 1365;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6662 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt6655 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt6660 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt6654 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			for (@Pc(22) int local22 = 0; local22 < Static106.anInt2356; local22++) {
				@Pc(36) int local36 = (Static382.anIntArray476[local22] << 12) / this.anInt6662 + this.anInt6660;
				@Pc(48) int local48 = (Static285.anIntArray401[arg0] << 12) / this.anInt6662 + this.anInt6654;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && local70 < this.anInt6655) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local36 + local62 - local68;
					local68 = local56 * local56 >> 12;
					local70++;
					local62 = local54 * local54 >> 12;
				}
				local11[local22] = this.anInt6655 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt6655;
			}
		}
		return local11;
	}
}
