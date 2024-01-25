import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class3_Sub6_Sub15 extends Class3_Sub6 {

	@OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
	private int anInt4815 = 0;

	@OriginalMember(owner = "client!jca", name = "V", descriptor = "I")
	private int anInt4818 = 20;

	@OriginalMember(owner = "client!jca", name = "T", descriptor = "I")
	private int anInt4817 = 0;

	@OriginalMember(owner = "client!jca", name = "X", descriptor = "I")
	private int anInt4819 = 1365;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			for (@Pc(22) int local22 = 0; local22 < Static481.anInt8358; local22++) {
				@Pc(36) int local36 = this.anInt4815 + (Static595.anIntArray600[local22] << 12) / this.anInt4819;
				@Pc(48) int local48 = this.anInt4817 + (Static231.anIntArray217[arg0] << 12) / this.anInt4819;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local62 + local68 < 16384 && local70 < this.anInt4818) {
					local56 = local48 + (local54 * local56 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local70++;
					local62 = local54 * local54 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt4818 - 1 <= local70 ? 0 : (local70 << 12) / this.anInt4818;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4819 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt4818 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt4815 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt4817 = arg0.method6811();
		}
	}
}
