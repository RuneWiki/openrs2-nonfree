import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
	private int anInt4014 = 0;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
	private int anInt4015 = 1365;

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
	private int anInt4018 = 0;

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
	private int anInt4019 = 20;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2581; local22++) {
				@Pc(36) int local36 = (Static252.anIntArray323[local22] << 12) / this.anInt4015 + this.anInt4014;
				@Pc(48) int local48 = (Static373.anIntArray55[arg0] << 12) / this.anInt4015 + this.anInt4018;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt4019 > local70) {
					local56 = local48 + (local56 * local54 >> 12) * 2;
					local54 = local62 + local36 - local68;
					local62 = local54 * local54 >> 12;
					local70++;
					local68 = local56 * local56 >> 12;
				}
				local11[local22] = local70 < this.anInt4019 - 1 ? (local70 << 12) / this.anInt4019 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4015 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt4019 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt4014 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt4018 = arg1.method3711();
		}
	}
}
