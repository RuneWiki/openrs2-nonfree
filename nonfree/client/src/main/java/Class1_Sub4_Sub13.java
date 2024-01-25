import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class1_Sub4_Sub13 extends Class1_Sub4 {

	@OriginalMember(owner = "client!em", name = "M", descriptor = "I")
	private int anInt1701 = 0;

	@OriginalMember(owner = "client!em", name = "N", descriptor = "I")
	private int anInt1702 = 20;

	@OriginalMember(owner = "client!em", name = "L", descriptor = "I")
	private int anInt1700 = 0;

	@OriginalMember(owner = "client!em", name = "O", descriptor = "I")
	private int anInt1703 = 1365;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			for (@Pc(22) int local22 = 0; local22 < Static395.anInt6592; local22++) {
				@Pc(36) int local36 = this.anInt1701 + (Static119.anIntArray146[local22] << 12) / this.anInt1703;
				@Pc(48) int local48 = this.anInt1700 + (Static419.anIntArray472[arg0] << 12) / this.anInt1703;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70 = 0;
				while (local68 + local62 < 16384 && this.anInt1702 > local70) {
					local56 = (local56 * local54 >> 12) * 2 + local48;
					local54 = local36 + local62 - local68;
					local70++;
					local68 = local56 * local56 >> 12;
					local62 = local54 * local54 >> 12;
				}
				local11[local22] = this.anInt1702 - 1 > local70 ? (local70 << 12) / this.anInt1702 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1703 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt1702 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt1701 = arg0.method5335();
		} else if (arg1 == 3) {
			this.anInt1700 = arg0.method5335();
		}
	}
}
