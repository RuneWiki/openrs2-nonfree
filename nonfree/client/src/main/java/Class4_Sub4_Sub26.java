import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class4_Sub4_Sub26 extends Class4_Sub4 {

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	private int anInt5962 = 1365;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
	private int anInt5961 = 0;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	private int anInt5966 = 0;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	private int anInt5967 = 20;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			for (@Pc(22) int local22 = 0; local22 < Static419.anInt6404; local22++) {
				@Pc(36) int local36 = this.anInt5966 + (Static226.anIntArray284[local22] << 12) / this.anInt5962;
				@Pc(48) int local48 = (Static334.anIntArray437[arg0] << 12) / this.anInt5962 + this.anInt5961;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70;
				for (local70 = 0; local68 + local62 < 16384 && local70 < this.anInt5967; local70++) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local62 + local36 - local68;
					local62 = local54 * local54 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local16[local22] = this.anInt5967 - 1 > local70 ? (local70 << 12) / this.anInt5967 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt5962 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt5967 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt5966 = arg1.method5028();
		} else if (arg0 == 3) {
			this.anInt5961 = arg1.method5028();
		}
	}
}
