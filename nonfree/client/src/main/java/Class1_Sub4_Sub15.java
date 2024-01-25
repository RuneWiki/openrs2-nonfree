import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub4_Sub15 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	private int anInt2028 = 585;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2028 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(25) int local25 = Static419.anIntArray472[arg0];
			for (@Pc(27) int local27 = 0; local27 < Static395.anInt6592; local27++) {
				@Pc(33) int local33 = Static119.anIntArray146[local27];
				@Pc(66) int local66;
				if (this.anInt2028 < local33 && 4096 - this.anInt2028 > local33 && local25 > 2048 - this.anInt2028 && this.anInt2028 + 2048 > local25) {
					local66 = 2048 - local33;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt2028;
					local11[local27] = 4096 - local66;
				} else if (local33 > 2048 - this.anInt2028 && this.anInt2028 + 2048 > local33) {
					local66 = local25 - 2048;
					local66 = local66 < 0 ? -local66 : local66;
					local66 -= this.anInt2028;
					local66 <<= 0xC;
					local11[local27] = local66 / (2048 - this.anInt2028);
				} else if (local25 < this.anInt2028 || 4096 - this.anInt2028 < local25) {
					local66 = local33 - 2048;
					@Pc(169) int local169 = local66 < 0 ? -local66 : local66;
					@Pc(174) int local174 = local169 - this.anInt2028;
					@Pc(178) int local178 = local174 << 12;
					local11[local27] = local178 / (2048 - this.anInt2028);
				} else if (this.anInt2028 <= local33 && 4096 - this.anInt2028 >= local33) {
					local11[local27] = 0;
				} else {
					local66 = 2048 - local25;
					local66 = local66 >= 0 ? local66 : -local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt2028;
					local11[local27] = 4096 - local66;
				}
			}
		}
		return local11;
	}
}
