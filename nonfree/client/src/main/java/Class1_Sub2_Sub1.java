import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
	private int anInt119 = 585;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(27) int local27 = Static7.anIntArray13[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static299.anInt5670; local29++) {
				@Pc(36) int local36 = Static310.anIntArray108[local29];
				@Pc(69) int local69;
				if (this.anInt119 < local36 && 4096 - this.anInt119 > local36 && local27 > 2048 - this.anInt119 && local27 < this.anInt119 + 2048) {
					local69 = 2048 - local36;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt119;
					local13[local29] = 4096 - local69;
				} else if (local36 > 2048 - this.anInt119 && this.anInt119 + 2048 > local36) {
					local69 = local27 - 2048;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 -= this.anInt119;
					local69 <<= 0xC;
					local13[local29] = local69 / (2048 - this.anInt119);
				} else if (local27 < this.anInt119 || local27 > 4096 - this.anInt119) {
					local69 = local36 - 2048;
					@Pc(177) int local177 = local69 >= 0 ? local69 : -local69;
					@Pc(182) int local182 = local177 - this.anInt119;
					@Pc(186) int local186 = local182 << 12;
					local13[local29] = local186 / (2048 - this.anInt119);
				} else if (local36 >= this.anInt119 && local36 <= 4096 - this.anInt119) {
					local13[local29] = 0;
				} else {
					local69 = 2048 - local27;
					local69 = local69 >= 0 ? local69 : -local69;
					local69 <<= 0xC;
					local69 /= 2048 - this.anInt119;
					local13[local29] = 4096 - local69;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt119 = arg0.method2593();
		}
	}
}
