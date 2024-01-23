import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!r", name = "X", descriptor = "I")
	private int anInt3975 = 585;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(28) int local28 = Static157.anIntArray604[arg0];
			for (@Pc(30) int local30 = 0; local30 < Static54.anInt953; local30++) {
				@Pc(36) int local36 = Static179.anIntArray682[local30];
				@Pc(78) int local78;
				if (this.anInt3975 < local36 && 4096 - this.anInt3975 > local36 && 2048 - this.anInt3975 < local28 && local28 < this.anInt3975 + 2048) {
					local78 = 2048 - local36;
					local78 = local78 >= 0 ? local78 : -local78;
					local78 <<= 0xC;
					local78 /= 2048 - this.anInt3975;
					local20[local30] = 4096 - local78;
				} else if (2048 - this.anInt3975 < local36 && local36 < this.anInt3975 + 2048) {
					local78 = local28 - 2048;
					local78 = local78 >= 0 ? local78 : -local78;
					local78 -= this.anInt3975;
					local78 <<= 0xC;
					local20[local30] = local78 / (2048 - this.anInt3975);
				} else if (this.anInt3975 > local28 || local28 > 4096 - this.anInt3975) {
					local78 = local36 - 2048;
					@Pc(191) int local191 = local78 >= 0 ? local78 : -local78;
					@Pc(196) int local196 = local191 - this.anInt3975;
					@Pc(200) int local200 = local196 << 12;
					local20[local30] = local200 / (2048 - this.anInt3975);
				} else if (local36 >= this.anInt3975 && local36 <= 4096 - this.anInt3975) {
					local20[local30] = 0;
				} else {
					local78 = 2048 - local28;
					local78 = local78 < 0 ? -local78 : local78;
					local78 <<= 0xC;
					local78 /= 2048 - this.anInt3975;
					local20[local30] = 4096 - local78;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3975 = arg0.method2095();
		}
	}
}
